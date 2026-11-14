package org.apache.commons.io.file;

import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.function.IOConsumer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements IOConsumer {
    @Override // org.apache.commons.io.function.IOConsumer
    public final void accept(Object obj) {
        Files.delete((Path) obj);
    }
}
