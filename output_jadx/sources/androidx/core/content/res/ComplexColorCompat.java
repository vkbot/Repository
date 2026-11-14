package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class ComplexColorCompat {
    private static final String LOG_TAG = "ComplexColorCompat";
    private int mColor;
    private final ColorStateList mColorStateList;
    private final Shader mShader;

    private ComplexColorCompat(Shader shader, ColorStateList colorStateList, @ColorInt int i10) {
        this.mShader = shader;
        this.mColorStateList = colorStateList;
        this.mColor = i10;
    }

    @NonNull
    private static ComplexColorCompat createFromXml(@NonNull Resources resources, @ColorRes int i10, @Nullable Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.getClass();
            if (!name.equals("gradient")) {
                if (name.equals("selector")) {
                    return from(ColorStateListInflaterCompat.createFromXmlInner(resources, xml, asAttributeSet, theme));
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
            return from(GradientColorInflaterCompat.createFromXmlInner(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ComplexColorCompat from(@NonNull ColorStateList colorStateList) {
        return new ComplexColorCompat(null, colorStateList, colorStateList.getDefaultColor());
    }

    @Nullable
    public static ComplexColorCompat inflate(@NonNull Resources resources, @ColorRes int i10, @Nullable Resources.Theme theme) {
        try {
            return createFromXml(resources, i10, theme);
        } catch (Exception e) {
            Log.e(LOG_TAG, "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    @ColorInt
    public int getColor() {
        return this.mColor;
    }

    @Nullable
    public Shader getShader() {
        return this.mShader;
    }

    public boolean isGradient() {
        if (this.mShader != null) {
            return true;
        }
        return false;
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        if (this.mShader == null && (colorStateList = this.mColorStateList) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public boolean onStateChanged(int[] iArr) {
        if (isStateful()) {
            ColorStateList colorStateList = this.mColorStateList;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.mColor) {
                this.mColor = colorForState;
                return true;
            }
            return false;
        }
        return false;
    }

    public void setColor(@ColorInt int i10) {
        this.mColor = i10;
    }

    public boolean willDraw() {
        if (!isGradient() && this.mColor == 0) {
            return false;
        }
        return true;
    }

    public static ComplexColorCompat from(@NonNull Shader shader) {
        return new ComplexColorCompat(shader, null, 0);
    }

    public static ComplexColorCompat from(@ColorInt int i10) {
        return new ComplexColorCompat(null, null, i10);
    }
}
