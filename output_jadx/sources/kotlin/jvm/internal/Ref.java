package kotlin.jvm.internal;

import java.io.Serializable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class Ref {

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static final class BooleanRef implements Serializable {
        public boolean element;

        public String toString() {
            return String.valueOf(this.element);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static final class ByteRef implements Serializable {
        public byte element;

        public String toString() {
            return String.valueOf((int) this.element);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static final class CharRef implements Serializable {
        public char element;

        public String toString() {
            return String.valueOf(this.element);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static final class DoubleRef implements Serializable {
        public double element;

        public String toString() {
            return String.valueOf(this.element);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static final class FloatRef implements Serializable {
        public float element;

        public String toString() {
            return String.valueOf(this.element);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static final class IntRef implements Serializable {
        public int element;

        public String toString() {
            return String.valueOf(this.element);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static final class LongRef implements Serializable {
        public long element;

        public String toString() {
            return String.valueOf(this.element);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static final class ObjectRef<T> implements Serializable {
        public T element;

        public String toString() {
            return String.valueOf(this.element);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static final class ShortRef implements Serializable {
        public short element;

        public String toString() {
            return String.valueOf((int) this.element);
        }
    }

    private Ref() {
    }
}
