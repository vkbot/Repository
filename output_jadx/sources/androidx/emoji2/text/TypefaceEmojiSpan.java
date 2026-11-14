package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class TypefaceEmojiSpan extends EmojiSpan {

    @Nullable
    private static Paint sDebugPaint;

    @Nullable
    private TextPaint mWorkingPaint;

    public TypefaceEmojiSpan(@NonNull TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        super(typefaceEmojiRasterizer);
    }

    @Nullable
    private TextPaint applyCharacterSpanStyles(@Nullable CharSequence charSequence, int i10, int i11, Paint paint) {
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i10, i11, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint = this.mWorkingPaint;
                    if (textPaint == null) {
                        textPaint = new TextPaint();
                        this.mWorkingPaint = textPaint;
                    }
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                    return textPaint;
                }
            }
            if (!(paint instanceof TextPaint)) {
                return null;
            }
            return (TextPaint) paint;
        }
        if (!(paint instanceof TextPaint)) {
            return null;
        }
        return (TextPaint) paint;
    }

    @NonNull
    private static Paint getDebugPaint() {
        if (sDebugPaint == null) {
            TextPaint textPaint = new TextPaint();
            sDebugPaint = textPaint;
            textPaint.setColor(EmojiCompat.get().getEmojiSpanIndicatorColor());
            sDebugPaint.setStyle(Paint.Style.FILL);
        }
        return sDebugPaint;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, CharSequence charSequence, @IntRange(from = 0) int i10, @IntRange(from = 0) int i11, float f8, int i12, int i13, int i14, @NonNull Paint paint) {
        TextPaint applyCharacterSpanStyles = applyCharacterSpanStyles(charSequence, i10, i11, paint);
        if (applyCharacterSpanStyles != null && applyCharacterSpanStyles.bgColor != 0) {
            drawBackground(canvas, applyCharacterSpanStyles, f8, f8 + getWidth(), i12, i14);
        }
        Paint paint2 = applyCharacterSpanStyles;
        if (EmojiCompat.get().isEmojiSpanIndicatorEnabled()) {
            canvas.drawRect(f8, i12, f8 + getWidth(), i14, getDebugPaint());
        }
        TypefaceEmojiRasterizer typefaceRasterizer = getTypefaceRasterizer();
        float f10 = i13;
        if (paint2 == null) {
            paint2 = paint;
        }
        typefaceRasterizer.draw(canvas, f8, f10, paint2);
    }

    public void drawBackground(Canvas canvas, TextPaint textPaint, float f8, float f10, float f11, float f12) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f8, f11, f10, f12, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }
}
