package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.MetadataRepo;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@AnyThread
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class EmojiProcessor {
    private static final int ACTION_ADVANCE_BOTH = 1;
    private static final int ACTION_ADVANCE_END = 2;
    private static final int ACTION_FLUSH = 3;
    private static final int MAX_LOOK_AROUND_CHARACTER = 16;

    @Nullable
    private final int[] mEmojiAsDefaultStyleExceptions;

    @NonNull
    private EmojiCompat.GlyphChecker mGlyphChecker;

    @NonNull
    private final MetadataRepo mMetadataRepo;

    @NonNull
    private final EmojiCompat.SpanFactory mSpanFactory;
    private final boolean mUseEmojiAsDefaultStyle;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(19)
    /* loaded from: classes.dex */
    public static final class CodepointIndexFinder {
        private static final int INVALID_INDEX = -1;

        private CodepointIndexFinder() {
        }

        public static int findIndexBackward(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z9 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        if (z9) {
                            return -1;
                        }
                        return 0;
                    }
                    char charAt = charSequence.charAt(i10);
                    if (z9) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i11--;
                    } else {
                        if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        z9 = true;
                    }
                }
                return i10;
            }
        }

        public static int findIndexForward(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z9 = false;
                while (i11 != 0) {
                    if (i10 >= length) {
                        if (z9) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i10);
                    if (z9) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i11--;
                        i10++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i11--;
                        i10++;
                    } else {
                        if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i10++;
                        z9 = true;
                    }
                }
                return i10;
            }
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public interface EmojiProcessCallback<T> {
        T getResult();

        boolean handleEmoji(@NonNull CharSequence charSequence, int i10, int i11, TypefaceEmojiRasterizer typefaceEmojiRasterizer);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static final class ProcessorSm {
        private static final int STATE_DEFAULT = 1;
        private static final int STATE_WALKING = 2;
        private int mCurrentDepth;
        private MetadataRepo.Node mCurrentNode;
        private final int[] mEmojiAsDefaultStyleExceptions;
        private MetadataRepo.Node mFlushNode;
        private int mLastCodepoint;
        private final MetadataRepo.Node mRootNode;
        private int mState = 1;
        private final boolean mUseEmojiAsDefaultStyle;

        public ProcessorSm(MetadataRepo.Node node, boolean z9, int[] iArr) {
            this.mRootNode = node;
            this.mCurrentNode = node;
            this.mUseEmojiAsDefaultStyle = z9;
            this.mEmojiAsDefaultStyleExceptions = iArr;
        }

        private static boolean isEmojiStyle(int i10) {
            if (i10 == 65039) {
                return true;
            }
            return false;
        }

        private static boolean isTextStyle(int i10) {
            if (i10 == 65038) {
                return true;
            }
            return false;
        }

        private int reset() {
            this.mState = 1;
            this.mCurrentNode = this.mRootNode;
            this.mCurrentDepth = 0;
            return 1;
        }

        private boolean shouldUseEmojiPresentationStyleForSingleCodepoint() {
            if (this.mCurrentNode.getData().isDefaultEmoji() || isEmojiStyle(this.mLastCodepoint)) {
                return true;
            }
            if (this.mUseEmojiAsDefaultStyle) {
                if (this.mEmojiAsDefaultStyleExceptions == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.mEmojiAsDefaultStyleExceptions, this.mCurrentNode.getData().getCodepointAt(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        public int check(int i10) {
            MetadataRepo.Node node = this.mCurrentNode.get(i10);
            int i11 = 2;
            if (this.mState != 2) {
                if (node == null) {
                    i11 = reset();
                } else {
                    this.mState = 2;
                    this.mCurrentNode = node;
                    this.mCurrentDepth = 1;
                }
            } else if (node != null) {
                this.mCurrentNode = node;
                this.mCurrentDepth++;
            } else if (isTextStyle(i10)) {
                i11 = reset();
            } else if (!isEmojiStyle(i10)) {
                if (this.mCurrentNode.getData() != null) {
                    i11 = 3;
                    if (this.mCurrentDepth == 1) {
                        if (shouldUseEmojiPresentationStyleForSingleCodepoint()) {
                            this.mFlushNode = this.mCurrentNode;
                            reset();
                        } else {
                            i11 = reset();
                        }
                    } else {
                        this.mFlushNode = this.mCurrentNode;
                        reset();
                    }
                } else {
                    i11 = reset();
                }
            }
            this.mLastCodepoint = i10;
            return i11;
        }

        public TypefaceEmojiRasterizer getCurrentMetadata() {
            return this.mCurrentNode.getData();
        }

        public TypefaceEmojiRasterizer getFlushMetadata() {
            return this.mFlushNode.getData();
        }

        public boolean isInFlushableState() {
            if (this.mState == 2 && this.mCurrentNode.getData() != null) {
                if (this.mCurrentDepth > 1 || shouldUseEmojiPresentationStyleForSingleCodepoint()) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    public EmojiProcessor(@NonNull MetadataRepo metadataRepo, @NonNull EmojiCompat.SpanFactory spanFactory, @NonNull EmojiCompat.GlyphChecker glyphChecker, boolean z9, @Nullable int[] iArr, @NonNull Set<int[]> set) {
        this.mSpanFactory = spanFactory;
        this.mMetadataRepo = metadataRepo;
        this.mGlyphChecker = glyphChecker;
        this.mUseEmojiAsDefaultStyle = z9;
        this.mEmojiAsDefaultStyleExceptions = iArr;
        initExclusions(set);
    }

    private static boolean delete(@NonNull Editable editable, @NonNull KeyEvent keyEvent, boolean z9) {
        EmojiSpan[] emojiSpanArr;
        if (hasModifiers(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!hasInvalidSelection(selectionStart, selectionEnd) && (emojiSpanArr = (EmojiSpan[]) editable.getSpans(selectionStart, selectionEnd, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
            for (EmojiSpan emojiSpan : emojiSpanArr) {
                int spanStart = editable.getSpanStart(emojiSpan);
                int spanEnd = editable.getSpanEnd(emojiSpan);
                if ((z9 && spanStart == selectionStart) || ((!z9 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean handleDeleteSurroundingText(@NonNull InputConnection inputConnection, @NonNull Editable editable, @IntRange(from = 0) int i10, @IntRange(from = 0) int i11, boolean z9) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (hasInvalidSelection(selectionStart, selectionEnd)) {
                return false;
            }
            if (z9) {
                max = CodepointIndexFinder.findIndexBackward(editable, selectionStart, Math.max(i10, 0));
                min = CodepointIndexFinder.findIndexForward(editable, selectionEnd, Math.max(i11, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i10, 0);
                min = Math.min(selectionEnd + i11, editable.length());
            }
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) editable.getSpans(max, min, EmojiSpan.class);
            if (emojiSpanArr != null && emojiSpanArr.length > 0) {
                for (EmojiSpan emojiSpan : emojiSpanArr) {
                    int spanStart = editable.getSpanStart(emojiSpan);
                    int spanEnd = editable.getSpanEnd(emojiSpan);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public static boolean handleOnKeyDown(@NonNull Editable editable, int i10, @NonNull KeyEvent keyEvent) {
        boolean delete;
        if (i10 != 67) {
            if (i10 != 112) {
                delete = false;
            } else {
                delete = delete(editable, keyEvent, true);
            }
        } else {
            delete = delete(editable, keyEvent, false);
        }
        if (!delete) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean hasGlyph(CharSequence charSequence, int i10, int i11, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        if (typefaceEmojiRasterizer.getHasGlyph() == 0) {
            typefaceEmojiRasterizer.setHasGlyph(this.mGlyphChecker.hasGlyph(charSequence, i10, i11, typefaceEmojiRasterizer.getSdkAdded()));
        }
        if (typefaceEmojiRasterizer.getHasGlyph() == 2) {
            return true;
        }
        return false;
    }

    private static boolean hasInvalidSelection(int i10, int i11) {
        if (i10 != -1 && i11 != -1 && i10 == i11) {
            return false;
        }
        return true;
    }

    private static boolean hasModifiers(@NonNull KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void initExclusions(@NonNull Set<int[]> set) {
        if (!set.isEmpty()) {
            for (int[] iArr : set) {
                String str = new String(iArr, 0, iArr.length);
                process(str, 0, str.length(), 1, true, new MarkExclusionCallback(str));
            }
        }
    }

    public int getEmojiEnd(@NonNull CharSequence charSequence, @IntRange(from = 0) int i10) {
        if (i10 >= 0 && i10 < charSequence.length()) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i10, i10 + 1, EmojiSpan.class);
                if (emojiSpanArr.length > 0) {
                    return spanned.getSpanEnd(emojiSpanArr[0]);
                }
            }
            return ((EmojiProcessLookupCallback) process(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(i10))).end;
        }
        return -1;
    }

    public int getEmojiMatch(@NonNull CharSequence charSequence, int i10) {
        ProcessorSm processorSm = new ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
        int length = charSequence.length();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < length) {
            int codePointAt = Character.codePointAt(charSequence, i11);
            int check = processorSm.check(codePointAt);
            TypefaceEmojiRasterizer currentMetadata = processorSm.getCurrentMetadata();
            if (check != 1) {
                if (check != 2) {
                    if (check == 3) {
                        currentMetadata = processorSm.getFlushMetadata();
                        if (currentMetadata.getCompatAdded() <= i10) {
                            i12++;
                        }
                    }
                } else {
                    i11 += Character.charCount(codePointAt);
                }
            } else {
                i11 += Character.charCount(codePointAt);
                i13 = 0;
            }
            if (currentMetadata != null && currentMetadata.getCompatAdded() <= i10) {
                i13++;
            }
        }
        if (i12 != 0) {
            return 2;
        }
        if (processorSm.isInFlushableState() && processorSm.getCurrentMetadata().getCompatAdded() <= i10) {
            return 1;
        }
        if (i13 == 0) {
            return 0;
        }
        return 2;
    }

    public int getEmojiStart(@NonNull CharSequence charSequence, @IntRange(from = 0) int i10) {
        if (i10 >= 0 && i10 < charSequence.length()) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i10, i10 + 1, EmojiSpan.class);
                if (emojiSpanArr.length > 0) {
                    return spanned.getSpanStart(emojiSpanArr[0]);
                }
            }
            return ((EmojiProcessLookupCallback) process(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(i10))).start;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:64:0x000e, B:67:0x0013, B:69:0x0017, B:71:0x0024, B:10:0x003c, B:12:0x0044, B:14:0x0047, B:16:0x004b, B:18:0x0057, B:19:0x005a, B:29:0x0078), top: B:63:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.CharSequence process(@androidx.annotation.NonNull java.lang.CharSequence r11, @androidx.annotation.IntRange(from = 0) int r12, @androidx.annotation.IntRange(from = 0) int r13, @androidx.annotation.IntRange(from = 0) int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.EmojiProcessor.process(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class EmojiProcessAddSpanCallback implements EmojiProcessCallback<UnprecomputeTextOnModificationSpannable> {
        private final EmojiCompat.SpanFactory mSpanFactory;

        @Nullable
        public UnprecomputeTextOnModificationSpannable spannable;

        public EmojiProcessAddSpanCallback(@Nullable UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable, EmojiCompat.SpanFactory spanFactory) {
            this.spannable = unprecomputeTextOnModificationSpannable;
            this.mSpanFactory = spanFactory;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(@NonNull CharSequence charSequence, int i10, int i11, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            Spannable spannableString;
            if (typefaceEmojiRasterizer.isPreferredSystemRender()) {
                return true;
            }
            if (this.spannable == null) {
                if (charSequence instanceof Spannable) {
                    spannableString = (Spannable) charSequence;
                } else {
                    spannableString = new SpannableString(charSequence);
                }
                this.spannable = new UnprecomputeTextOnModificationSpannable(spannableString);
            }
            this.spannable.setSpan(this.mSpanFactory.createSpan(typefaceEmojiRasterizer), i10, i11, 33);
            return true;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public UnprecomputeTextOnModificationSpannable getResult() {
            return this.spannable;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class EmojiProcessLookupCallback implements EmojiProcessCallback<EmojiProcessLookupCallback> {
        private final int mOffset;
        public int start = -1;
        public int end = -1;

        public EmojiProcessLookupCallback(int i10) {
            this.mOffset = i10;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(@NonNull CharSequence charSequence, int i10, int i11, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            int i12 = this.mOffset;
            if (i10 <= i12 && i12 < i11) {
                this.start = i10;
                this.end = i11;
                return false;
            }
            if (i11 > i12) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public EmojiProcessLookupCallback getResult() {
            return this;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class MarkExclusionCallback implements EmojiProcessCallback<MarkExclusionCallback> {
        private final String mExclusion;

        public MarkExclusionCallback(String str) {
            this.mExclusion = str;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(@NonNull CharSequence charSequence, int i10, int i11, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.mExclusion)) {
                return true;
            }
            typefaceEmojiRasterizer.setExclusion(true);
            return false;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public MarkExclusionCallback getResult() {
            return this;
        }
    }

    public int getEmojiMatch(@NonNull CharSequence charSequence) {
        return getEmojiMatch(charSequence, this.mMetadataRepo.getMetadataVersion());
    }

    private <T> T process(@NonNull CharSequence charSequence, @IntRange(from = 0) int i10, @IntRange(from = 0) int i11, @IntRange(from = 0) int i12, boolean z9, EmojiProcessCallback<T> emojiProcessCallback) {
        int i13;
        ProcessorSm processorSm = new ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
        int codePointAt = Character.codePointAt(charSequence, i10);
        int i14 = 0;
        boolean z10 = true;
        loop0: while (true) {
            int i15 = codePointAt;
            while (true) {
                i13 = i10;
                while (i10 < i11 && i14 < i12 && z10) {
                    int check = processorSm.check(i15);
                    if (check == 1) {
                        i10 = Character.charCount(Character.codePointAt(charSequence, i13)) + i13;
                        if (i10 < i11) {
                            break;
                        }
                    } else if (check == 2) {
                        int charCount = Character.charCount(i15) + i10;
                        if (charCount < i11) {
                            i15 = Character.codePointAt(charSequence, charCount);
                        }
                        i10 = charCount;
                    } else if (check == 3) {
                        if (z9 || !hasGlyph(charSequence, i13, i10, processorSm.getFlushMetadata())) {
                            z10 = emojiProcessCallback.handleEmoji(charSequence, i13, i10, processorSm.getFlushMetadata());
                            i14++;
                        }
                    }
                }
            }
            codePointAt = Character.codePointAt(charSequence, i10);
        }
        if (processorSm.isInFlushableState() && i14 < i12 && z10 && (z9 || !hasGlyph(charSequence, i13, i10, processorSm.getCurrentMetadata()))) {
            emojiProcessCallback.handleEmoji(charSequence, i13, i10, processorSm.getCurrentMetadata());
        }
        return emojiProcessCallback.getResult();
    }
}
