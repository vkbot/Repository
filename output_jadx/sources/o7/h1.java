package o7;

import java.net.SocketAddress;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public List f4538a;

    /* renamed from: b, reason: collision with root package name */
    public int f4539b;
    public int c;

    public SocketAddress a() {
        if (c()) {
            return (SocketAddress) ((n7.r) this.f4538a.get(this.f4539b)).f4239a.get(this.c);
        }
        j1.i.l("Index is past the end of the address group list");
        return null;
    }

    public boolean b() {
        if (c()) {
            n7.r rVar = (n7.r) this.f4538a.get(this.f4539b);
            int i10 = this.c + 1;
            this.c = i10;
            if (i10 >= rVar.f4239a.size()) {
                int i11 = this.f4539b + 1;
                this.f4539b = i11;
                this.c = 0;
                if (i11 < this.f4538a.size()) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean c() {
        if (this.f4539b < this.f4538a.size()) {
            return true;
        }
        return false;
    }

    public void d() {
        this.f4539b = 0;
        this.c = 0;
    }

    public boolean e(SocketAddress socketAddress) {
        for (int i10 = 0; i10 < this.f4538a.size(); i10++) {
            int indexOf = ((n7.r) this.f4538a.get(i10)).f4239a.indexOf(socketAddress);
            if (indexOf != -1) {
                this.f4539b = i10;
                this.c = indexOf;
                return true;
            }
        }
        return false;
    }
}
