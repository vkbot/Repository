package androidx.constraintlayout.core.widgets;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class Rectangle {
    public int height;
    public int width;

    /* renamed from: x, reason: collision with root package name */
    public int f162x;

    /* renamed from: y, reason: collision with root package name */
    public int f163y;

    public boolean contains(int i10, int i11) {
        int i12;
        int i13 = this.f162x;
        if (i10 >= i13 && i10 < i13 + this.width && i11 >= (i12 = this.f163y) && i11 < i12 + this.height) {
            return true;
        }
        return false;
    }

    public int getCenterX() {
        return (this.f162x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f163y + this.height) / 2;
    }

    public void grow(int i10, int i11) {
        this.f162x -= i10;
        this.f163y -= i11;
        this.width = (i10 * 2) + this.width;
        this.height = (i11 * 2) + this.height;
    }

    public boolean intersects(Rectangle rectangle) {
        int i10;
        int i11;
        int i12 = this.f162x;
        int i13 = rectangle.f162x;
        if (i12 >= i13 && i12 < i13 + rectangle.width && (i10 = this.f163y) >= (i11 = rectangle.f163y) && i10 < i11 + rectangle.height) {
            return true;
        }
        return false;
    }

    public void setBounds(int i10, int i11, int i12, int i13) {
        this.f162x = i10;
        this.f163y = i11;
        this.width = i12;
        this.height = i13;
    }
}
