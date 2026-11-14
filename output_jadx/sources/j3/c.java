package j3;

import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f3261b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager) {
        super(1);
        this.f3261b = carouselLayoutManager;
    }

    @Override // j3.e
    public final int a() {
        return this.f3261b.getHeight();
    }

    @Override // j3.e
    public final int b() {
        return this.f3261b.getPaddingLeft();
    }

    @Override // j3.e
    public final int c() {
        CarouselLayoutManager carouselLayoutManager = this.f3261b;
        return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
    }

    @Override // j3.e
    public final int d() {
        return 0;
    }

    @Override // j3.e
    public final int e() {
        return 0;
    }
}
