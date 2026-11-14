package org.apache.commons.io;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.URL;
import org.apache.commons.io.function.IOSupplier;
import org.apache.commons.io.function.IOTriFunction;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class r implements IOSupplier, IOTriFunction {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4925b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r(int i10, Object obj) {
        this.f4925b = i10;
        this.c = obj;
    }

    @Override // org.apache.commons.io.function.IOTriFunction
    public Object apply(Object obj, Object obj2, Object obj3) {
        int read;
        switch (this.f4925b) {
            case 1:
                read = ((InputStream) this.c).read((byte[]) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                break;
            default:
                read = ((RandomAccessFile) this.c).read((byte[]) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                break;
        }
        return Integer.valueOf(read);
    }

    @Override // org.apache.commons.io.function.IOSupplier
    public Object get() {
        return ((URL) this.c).openStream();
    }
}
