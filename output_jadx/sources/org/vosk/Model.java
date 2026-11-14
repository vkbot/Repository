package org.vosk;

import com.sun.jna.PointerType;
import n0.b;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class Model extends PointerType implements AutoCloseable {
    public Model(String str) {
        super(LibVosk.vosk_model_new(str));
        if (getPointer() != null) {
            return;
        }
        b.A("Failed to create a model");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        LibVosk.vosk_model_free(getPointer());
    }

    public Model() {
    }
}
