package org.apache.commons.io;

import java.io.File;
import java.io.Serializable;
import java.util.stream.Stream;
import org.apache.commons.io.function.IOSupplier;
import org.apache.commons.net.finger.FingerClient;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements IOSupplier {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4879b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ i(Object obj, boolean z9, Serializable serializable, int i10) {
        this.f4879b = i10;
        this.d = obj;
        this.c = z9;
        this.e = serializable;
    }

    @Override // org.apache.commons.io.function.IOSupplier
    public final Object get() {
        Stream streamFiles;
        switch (this.f4879b) {
            case 0:
                streamFiles = FileUtils.streamFiles((File) this.d, this.c, (String[]) this.e);
                return streamFiles;
            default:
                return FingerClient.a((FingerClient) this.d, this.c, (String) this.e);
        }
    }
}
