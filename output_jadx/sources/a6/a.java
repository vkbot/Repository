package a6;

import java.io.Serializable;
import z5.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f51a;

    /* renamed from: b, reason: collision with root package name */
    public final int f52b;
    public final int c;
    public final Object d;
    public final Serializable e;

    public a(int i10, int i11, String str, String str2, boolean z9) {
        this.f51a = z9;
        this.f52b = Math.max(0, i10);
        this.c = Math.max(0, i11);
        this.d = str == null ? "" : str;
        this.e = str2 == null ? "" : str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(f6.b bVar, o[] oVarArr, boolean z9, int i10, int i11) {
        this.d = bVar;
        this.e = oVarArr;
        this.f51a = z9;
        this.f52b = i10;
        this.c = i11;
    }
}
