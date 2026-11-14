package androidx.profileinstaller;

import j1.i;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
enum FileSectionType {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    FileSectionType(long j10) {
        this.mValue = j10;
    }

    public static FileSectionType fromValue(long j10) {
        FileSectionType[] values = values();
        for (int i10 = 0; i10 < values.length; i10++) {
            if (values[i10].getValue() == j10) {
                return values[i10];
            }
        }
        i.k(ai.onnxruntime.a.h(j10, "Unsupported FileSection Type "));
        return null;
    }

    public long getValue() {
        return this.mValue;
    }
}
