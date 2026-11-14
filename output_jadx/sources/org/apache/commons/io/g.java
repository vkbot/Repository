package org.apache.commons.io;

import java.io.File;
import org.apache.commons.io.file.AccumulatorPathVisitor;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.function.IOFunction;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements IOFunction {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4878b;
    public final /* synthetic */ IOFileFilter c;
    public final /* synthetic */ IOFileFilter d;

    public /* synthetic */ g(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2, int i10) {
        this.f4878b = i10;
        this.c = iOFileFilter;
        this.d = iOFileFilter2;
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final Object apply(Object obj) {
        AccumulatorPathVisitor lambda$listFiles$10;
        AccumulatorPathVisitor lambda$listFilesAndDirs$13;
        switch (this.f4878b) {
            case 0:
                lambda$listFiles$10 = FileUtils.lambda$listFiles$10(this.c, this.d, (File) obj);
                return lambda$listFiles$10;
            default:
                lambda$listFilesAndDirs$13 = FileUtils.lambda$listFilesAndDirs$13(this.c, this.d, (File) obj);
                return lambda$listFilesAndDirs$13;
        }
    }
}
