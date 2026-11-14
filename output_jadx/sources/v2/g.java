package v2;

import android.os.Parcel;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g extends w2.a {
    public final u2.a d(u2.b bVar, int i10) {
        Parcel c = c();
        w2.c.a(c, bVar);
        c.writeString("com.google.android.gms.providerinstaller.dynamite");
        c.writeInt(i10);
        Parcel b10 = b(c, 2);
        u2.a c10 = u2.b.c(b10.readStrongBinder());
        b10.recycle();
        return c10;
    }

    public final u2.a e(u2.b bVar, int i10, u2.b bVar2) {
        Parcel c = c();
        w2.c.a(c, bVar);
        c.writeString("com.google.android.gms.providerinstaller.dynamite");
        c.writeInt(i10);
        w2.c.a(c, bVar2);
        Parcel b10 = b(c, 8);
        u2.a c10 = u2.b.c(b10.readStrongBinder());
        b10.recycle();
        return c10;
    }

    public final u2.a f(u2.b bVar, int i10) {
        Parcel c = c();
        w2.c.a(c, bVar);
        c.writeString("com.google.android.gms.providerinstaller.dynamite");
        c.writeInt(i10);
        Parcel b10 = b(c, 4);
        u2.a c10 = u2.b.c(b10.readStrongBinder());
        b10.recycle();
        return c10;
    }

    public final u2.a g(u2.b bVar, boolean z9, long j10) {
        Parcel c = c();
        w2.c.a(c, bVar);
        c.writeString("com.google.android.gms.providerinstaller.dynamite");
        c.writeInt(z9 ? 1 : 0);
        c.writeLong(j10);
        Parcel b10 = b(c, 7);
        u2.a c10 = u2.b.c(b10.readStrongBinder());
        b10.recycle();
        return c10;
    }
}
