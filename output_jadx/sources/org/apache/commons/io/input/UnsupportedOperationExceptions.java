package org.apache.commons.io.input;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
final class UnsupportedOperationExceptions {
    private static final String MARK_RESET = "mark/reset";

    public static UnsupportedOperationException mark() {
        return method(MARK_RESET);
    }

    public static UnsupportedOperationException method(String str) {
        return new UnsupportedOperationException(ai.onnxruntime.a.C(str, " not supported"));
    }

    public static UnsupportedOperationException reset() {
        return method(MARK_RESET);
    }
}
