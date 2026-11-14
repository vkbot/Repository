package j3;

import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f3262b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CarouselLayoutManager carouselLayoutManager) {
        super(0);
        this.f3262b = carouselLayoutManager;
    }

    @Override // j3.e
    public final int a() {
        CarouselLayoutManager carouselLayoutManager = this.f3262b;
        return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
    }

    @Override // j3.e
    public final int b() {
        return 0;
    }

    @Override // j3.e
    public final int c() {
        return this.f3262b.getWidth();
    }

    @Override // j3.e
    public final int d() {
        CarouselLayoutManager carouselLayoutManager = this.f3262b;
        if (carouselLayoutManager.m()) {
            return carouselLayoutManager.getWidth();
        }
        return 0;
    }

    @Override // j3.e
    public final int e() {
        return this.f3262b.getPaddingTop();
    }
}
