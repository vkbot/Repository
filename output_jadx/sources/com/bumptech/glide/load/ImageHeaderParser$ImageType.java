package com.bumptech.glide.load;

import h.c;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);


    /* renamed from: b, reason: collision with root package name */
    public final boolean f645b;

    ImageHeaderParser$ImageType(boolean z9) {
        this.f645b = z9;
    }

    public boolean hasAlpha() {
        return this.f645b;
    }

    public boolean isWebp() {
        int i10 = c.f2521a[ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        return false;
    }
}
