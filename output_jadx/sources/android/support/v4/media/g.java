package android.support.v4.media;

import android.os.Parcelable;
import com.google.android.material.datepicker.r;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113a;

    public /* synthetic */ g(int i10) {
        this.f113a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0377  */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, d3.b] */
    /* JADX WARN: Type inference failed for: r0v18, types: [android.view.View$BaseSavedState, java.lang.Object, k3.b] */
    /* JADX WARN: Type inference failed for: r0v19, types: [android.view.ViewGroup$MarginLayoutParams, o2.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.recyclerview.widget.RecyclerView$LayoutParams, android.view.ViewGroup$MarginLayoutParams, java.lang.Object, o2.g] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, o2.i] */
    /* JADX WARN: Type inference failed for: r0v22, types: [android.view.View$BaseSavedState, z1.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [b.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [b.a, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createFromParcel(android.os.Parcel r14) {
        /*
            Method dump skipped, instructions count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.g.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f113a) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i10];
            case 1:
                return new MediaDescriptionCompat[i10];
            case 2:
                return new MediaMetadataCompat[i10];
            case 3:
                return new RatingCompat[i10];
            case 4:
                return new b.d[i10];
            case 5:
                return new com.google.android.material.datepicker.b[i10];
            case 6:
                return new com.google.android.material.datepicker.d[i10];
            case 7:
                return new r[i10];
            case 8:
                return new d3.b[i10];
            case 9:
                return new k3.b[i10];
            case 10:
                return new o2.e[i10];
            case 11:
                return new o2.g[i10];
            case 12:
                return new o2.i[i10];
            default:
                return new z1.d[i10];
        }
    }
}
