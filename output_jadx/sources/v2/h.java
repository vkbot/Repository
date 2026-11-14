package v2;

import android.os.Parcel;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h extends w2.a {
    public final u2.a d(u2.b bVar, int i10, u2.b bVar2) {
        Parcel c = c();
        w2.c.a(c, bVar);
        c.writeString("com.google.android.gms.providerinstaller.dynamite");
        c.writeInt(i10);
        w2.c.a(c, bVar2);
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
        Parcel b10 = b(c, 3);
        u2.a c10 = u2.b.c(b10.readStrongBinder());
        b10.recycle();
        return c10;
    }
}
