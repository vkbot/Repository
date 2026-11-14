package org.apache.commons.io.output;

import java.io.IOException;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.commons.net.ftp.FTPListParseEngine;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Function {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4913b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i10, Object obj) {
        this.f4913b = i10;
        this.c = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f4913b) {
            case 0:
                return BrokenOutputStream.S((Supplier) this.c, (String) obj);
            case 1:
                return BrokenOutputStream.b((IOException) this.c, (String) obj);
            case 2:
                return BrokenOutputStream.y((String) obj, (Throwable) this.c);
            default:
                return FTPListParseEngine.a((FTPListParseEngine) this.c, (String) obj);
        }
    }
}
