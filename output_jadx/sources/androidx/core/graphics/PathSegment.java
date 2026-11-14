package androidx.core.graphics;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class PathSegment {
    private final PointF mEnd;
    private final float mEndFraction;
    private final PointF mStart;
    private final float mStartFraction;

    public PathSegment(@NonNull PointF pointF, float f8, @NonNull PointF pointF2, float f10) {
        this.mStart = (PointF) Preconditions.checkNotNull(pointF, "start == null");
        this.mStartFraction = f8;
        this.mEnd = (PointF) Preconditions.checkNotNull(pointF2, "end == null");
        this.mEndFraction = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathSegment)) {
            return false;
        }
        PathSegment pathSegment = (PathSegment) obj;
        if (Float.compare(this.mStartFraction, pathSegment.mStartFraction) == 0 && Float.compare(this.mEndFraction, pathSegment.mEndFraction) == 0 && this.mStart.equals(pathSegment.mStart) && this.mEnd.equals(pathSegment.mEnd)) {
            return true;
        }
        return false;
    }

    @NonNull
    public PointF getEnd() {
        return this.mEnd;
    }

    public float getEndFraction() {
        return this.mEndFraction;
    }

    @NonNull
    public PointF getStart() {
        return this.mStart;
    }

    public float getStartFraction() {
        return this.mStartFraction;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.mStart.hashCode() * 31;
        float f8 = this.mStartFraction;
        int i11 = 0;
        if (f8 != 0.0f) {
            i10 = Float.floatToIntBits(f8);
        } else {
            i10 = 0;
        }
        int hashCode2 = (this.mEnd.hashCode() + ((hashCode + i10) * 31)) * 31;
        float f10 = this.mEndFraction;
        if (f10 != 0.0f) {
            i11 = Float.floatToIntBits(f10);
        }
        return hashCode2 + i11;
    }

    public String toString() {
        return "PathSegment{start=" + this.mStart + ", startFraction=" + this.mStartFraction + ", end=" + this.mEnd + ", endFraction=" + this.mEndFraction + '}';
    }
}
