package a8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class a extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f54b;

    @Override // java.lang.Throwable
    public String getMessage() {
        switch (this.f54b) {
            case 0:
                return "Chain of Causes for CompositeException In Order Received =>";
            default:
                return super.getMessage();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, Throwable th) {
        super(th);
        this.f54b = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, int i10) {
        super(str);
        this.f54b = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, int i10, Throwable th) {
        super(str, th);
        this.f54b = i10;
    }
}
