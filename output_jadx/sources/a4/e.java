package a4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.c0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f32a) {
            case 0:
                return new f(parcel, (ClassLoader) null);
            case 1:
                return new c4.a(parcel, null);
            case 2:
                return new c0(parcel, null);
            case 3:
                return new g3.e(parcel, (ClassLoader) null);
            case 4:
                return new h3.c(parcel, null);
            default:
                return new s3.b(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f32a) {
            case 0:
                return new f[i10];
            case 1:
                return new c4.a[i10];
            case 2:
                return new c0[i10];
            case 3:
                return new g3.e[i10];
            case 4:
                return new h3.c[i10];
            default:
                return new s3.b[i10];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f32a) {
            case 0:
                return new f(parcel, classLoader);
            case 1:
                return new c4.a(parcel, classLoader);
            case 2:
                return new c0(parcel, classLoader);
            case 3:
                return new g3.e(parcel, classLoader);
            case 4:
                return new h3.c(parcel, classLoader);
            default:
                return new s3.b(parcel, classLoader);
        }
    }
}
