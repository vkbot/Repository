package androidx.core.location;

import android.location.Location;
import androidx.core.util.Consumer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f177b;
    public final /* synthetic */ Consumer c;
    public final /* synthetic */ Location d;

    public /* synthetic */ d(Consumer consumer, Location location, int i10) {
        this.f177b = i10;
        this.c = consumer;
        this.d = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f177b) {
            case 0:
                this.c.accept(this.d);
                return;
            default:
                this.c.accept(this.d);
                return;
        }
    }
}
