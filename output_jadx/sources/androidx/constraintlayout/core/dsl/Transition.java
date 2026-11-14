package androidx.constraintlayout.core.dsl;

import ai.onnxruntime.a;
import org.apache.commons.net.nntp.NNTPReply;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class Transition {
    private String mConstraintSetEnd;
    private String mConstraintSetStart;
    private String mId;
    private OnSwipe mOnSwipe = null;
    final int UNSET = -1;
    private final int DEFAULT_DURATION = NNTPReply.SERVICE_DISCONTINUED;
    private final float DEFAULT_STAGGER = 0.0f;
    private int mDefaultInterpolator = 0;
    private String mDefaultInterpolatorString = null;
    private int mDefaultInterpolatorID = -1;
    private int mDuration = NNTPReply.SERVICE_DISCONTINUED;
    private float mStagger = 0.0f;
    private KeyFrames mKeyFrames = new KeyFrames();

    public Transition(String str, String str2) {
        this.mId = null;
        this.mConstraintSetEnd = null;
        this.mConstraintSetStart = null;
        this.mId = "default";
        this.mConstraintSetStart = str;
        this.mConstraintSetEnd = str2;
    }

    public String getId() {
        return this.mId;
    }

    public void setDuration(int i10) {
        this.mDuration = i10;
    }

    public void setFrom(String str) {
        this.mConstraintSetStart = str;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setKeyFrames(Keys keys) {
        this.mKeyFrames.add(keys);
    }

    public void setOnSwipe(OnSwipe onSwipe) {
        this.mOnSwipe = onSwipe;
    }

    public void setStagger(float f8) {
        this.mStagger = f8;
    }

    public void setTo(String str) {
        this.mConstraintSetEnd = str;
    }

    public String toJson() {
        return toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mId);
        sb.append(":{\nfrom:'");
        sb.append(this.mConstraintSetStart);
        sb.append("',\nto:'");
        String p9 = a.p(sb, this.mConstraintSetEnd, "',\n");
        if (this.mDuration != 400) {
            p9 = a.o(a.w(p9, "duration:"), ",\n", this.mDuration);
        }
        if (this.mStagger != 0.0f) {
            StringBuilder w = a.w(p9, "stagger:");
            w.append(this.mStagger);
            w.append(",\n");
            p9 = w.toString();
        }
        if (this.mOnSwipe != null) {
            StringBuilder u8 = a.u(p9);
            u8.append(this.mOnSwipe.toString());
            p9 = u8.toString();
        }
        StringBuilder u9 = a.u(p9);
        u9.append(this.mKeyFrames.toString());
        return u9.toString().concat("},\n");
    }

    public Transition(String str, String str2, String str3) {
        this.mId = null;
        this.mConstraintSetEnd = null;
        this.mConstraintSetStart = null;
        this.mId = str;
        this.mConstraintSetStart = str2;
        this.mConstraintSetEnd = str3;
    }
}
