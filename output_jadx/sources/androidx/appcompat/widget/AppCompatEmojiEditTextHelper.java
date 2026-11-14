package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R;
import androidx.emoji2.viewsintegration.EmojiEditTextHelper;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
class AppCompatEmojiEditTextHelper {

    @NonNull
    private final EmojiEditTextHelper mEmojiEditTextHelper;

    @NonNull
    private final EditText mView;

    public AppCompatEmojiEditTextHelper(@NonNull EditText editText) {
        this.mView = editText;
        this.mEmojiEditTextHelper = new EmojiEditTextHelper(editText, false);
    }

    @Nullable
    public KeyListener getKeyListener(@Nullable KeyListener keyListener) {
        if (isEmojiCapableKeyListener(keyListener)) {
            return this.mEmojiEditTextHelper.getKeyListener(keyListener);
        }
        return keyListener;
    }

    public boolean isEmojiCapableKeyListener(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public boolean isEnabled() {
        return this.mEmojiEditTextHelper.isEnabled();
    }

    public void loadFromAttributes(@Nullable AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(attributeSet, R.styleable.AppCompatTextView, i10, 0);
        try {
            boolean z9 = true;
            if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTextView_emojiCompatEnabled)) {
                z9 = obtainStyledAttributes.getBoolean(R.styleable.AppCompatTextView_emojiCompatEnabled, true);
            }
            obtainStyledAttributes.recycle();
            setEnabled(z9);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Nullable
    public InputConnection onCreateInputConnection(@Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        return this.mEmojiEditTextHelper.onCreateInputConnection(inputConnection, editorInfo);
    }

    public void setEnabled(boolean z9) {
        this.mEmojiEditTextHelper.setEnabled(z9);
    }
}
