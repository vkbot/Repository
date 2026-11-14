package org.apache.commons.io.file;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.function.IOTriFunction;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements IOTriFunction, IOFunction {
    @Override // org.apache.commons.io.function.IOTriFunction
    public Object apply(Object obj, Object obj2, Object obj3) {
        return Files.readAttributes((Path) obj, (String) obj2, (LinkOption[]) obj3);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public Object apply(Object obj) {
        return Files.getFileStore((Path) obj);
    }
}
