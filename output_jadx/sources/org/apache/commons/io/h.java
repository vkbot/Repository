package org.apache.commons.io;

import java.nio.file.Path;
import java.util.function.Function;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((Path) obj).toFile();
    }
}
