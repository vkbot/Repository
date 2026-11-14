package f7;

import java.util.function.Consumer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Consumer {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2373b;
    public final /* synthetic */ StringBuilder c;

    public /* synthetic */ g(StringBuilder sb, int i10) {
        this.f2373b = i10;
        this.c = sb;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f2373b) {
            case 0:
                StringBuilder sb = this.c;
                sb.append(" @");
                sb.append((Integer) obj);
                return;
            case 1:
                StringBuilder sb2 = this.c;
                sb2.append("listen_port=");
                sb2.append((Integer) obj);
                sb2.append('\n');
                return;
            case 2:
                StringBuilder sb3 = this.c;
                sb3.append(" @");
                sb3.append((e) obj);
                return;
            case 3:
                StringBuilder sb4 = this.c;
                sb4.append("endpoint=");
                sb4.append((e) obj);
                sb4.append('\n');
                return;
            case 4:
                StringBuilder sb5 = this.c;
                sb5.append("persistent_keepalive_interval=");
                sb5.append((Integer) obj);
                sb5.append('\n');
                return;
            default:
                StringBuilder sb6 = this.c;
                sb6.append("preshared_key=");
                sb6.append(((g7.b) obj).e());
                sb6.append('\n');
                return;
        }
    }
}
