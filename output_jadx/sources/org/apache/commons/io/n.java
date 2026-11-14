package org.apache.commons.io;

import java.io.IOException;
import java.nio.file.Path;
import org.apache.commons.io.function.IOBiFunction;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements IOBiFunction {
    @Override // org.apache.commons.io.function.IOBiFunction
    public final Object apply(Object obj, Object obj2) {
        return FileUtils.c((Path) obj, (IOException) obj2);
    }
}
