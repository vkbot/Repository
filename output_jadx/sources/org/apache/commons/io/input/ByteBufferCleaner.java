package org.apache.commons.io.input;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
final class ByteBufferCleaner {
    private static final Cleaner INSTANCE = getCleaner();

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public interface Cleaner {
        void clean(ByteBuffer byteBuffer);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static final class Java8Cleaner implements Cleaner {
        private final Method cleanMethod;
        private final Method cleanerMethod;

        private Java8Cleaner() {
            this.cleanMethod = Class.forName("sun.misc.Cleaner").getMethod("clean", null);
            this.cleanerMethod = Class.forName("sun.nio.ch.DirectBuffer").getMethod("cleaner", null);
        }

        @Override // org.apache.commons.io.input.ByteBufferCleaner.Cleaner
        public void clean(ByteBuffer byteBuffer) {
            Object invoke = this.cleanerMethod.invoke(byteBuffer, null);
            if (invoke != null) {
                this.cleanMethod.invoke(invoke, null);
            }
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static final class Java9Cleaner implements Cleaner {
        private final Method invokeCleaner;
        private final Object theUnsafe;

        private Java9Cleaner() {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            this.theUnsafe = declaredField.get(null);
            this.invokeCleaner = cls.getMethod("invokeCleaner", ByteBuffer.class);
        }

        @Override // org.apache.commons.io.input.ByteBufferCleaner.Cleaner
        public void clean(ByteBuffer byteBuffer) {
            this.invokeCleaner.invoke(this.theUnsafe, byteBuffer);
        }
    }

    public static void clean(ByteBuffer byteBuffer) {
        try {
            INSTANCE.clean(byteBuffer);
        } catch (Exception e) {
            throw new IllegalStateException("Failed to clean direct buffer.", e);
        }
    }

    private static Cleaner getCleaner() {
        try {
            return new Java8Cleaner();
        } catch (Exception e) {
            try {
                return new Java9Cleaner();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to initialize a Cleaner.", e);
            }
        }
    }

    public static boolean isSupported() {
        if (INSTANCE != null) {
            return true;
        }
        return false;
    }
}
