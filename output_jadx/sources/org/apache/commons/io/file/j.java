package org.apache.commons.io.file;

import java.nio.file.Path;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements UnaryOperator {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Path stripTrailingSeparator;
        stripTrailingSeparator = PathUtils.stripTrailingSeparator((Path) obj);
        return stripTrailingSeparator;
    }
}
