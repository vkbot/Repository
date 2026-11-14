package androidx.core.location;

import android.location.LocationRequest;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.core.util.TimeUtils;
import androidx.media.utils.MediaConstants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.ULong;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class LocationRequestCompat {
    private static final long IMPLICIT_MIN_UPDATE_INTERVAL = -1;
    public static final long PASSIVE_INTERVAL = Long.MAX_VALUE;
    public static final int QUALITY_BALANCED_POWER_ACCURACY = 102;
    public static final int QUALITY_HIGH_ACCURACY = 100;
    public static final int QUALITY_LOW_POWER = 104;
    final long mDurationMillis;
    final long mIntervalMillis;
    final long mMaxUpdateDelayMillis;
    final int mMaxUpdates;
    final float mMinUpdateDistanceMeters;
    final long mMinUpdateIntervalMillis;
    final int mQuality;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class Api19Impl {
        private static Method sCreateFromDeprecatedProviderMethod;
        private static Class<?> sLocationRequestClass;
        private static Method sSetExpireInMethod;
        private static Method sSetFastestIntervalMethod;
        private static Method sSetNumUpdatesMethod;
        private static Method sSetQualityMethod;

        private Api19Impl() {
        }

        public static Object toLocationRequest(LocationRequestCompat locationRequestCompat, String str) {
            try {
                if (sLocationRequestClass == null) {
                    sLocationRequestClass = Class.forName("android.location.LocationRequest");
                }
                Method method = sCreateFromDeprecatedProviderMethod;
                Class cls = Long.TYPE;
                if (method == null) {
                    Method declaredMethod = sLocationRequestClass.getDeclaredMethod("createFromDeprecatedProvider", String.class, cls, Float.TYPE, Boolean.TYPE);
                    sCreateFromDeprecatedProviderMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Object invoke = sCreateFromDeprecatedProviderMethod.invoke(null, str, Long.valueOf(locationRequestCompat.getIntervalMillis()), Float.valueOf(locationRequestCompat.getMinUpdateDistanceMeters()), Boolean.FALSE);
                if (invoke == null) {
                    return null;
                }
                Method method2 = sSetQualityMethod;
                Class cls2 = Integer.TYPE;
                if (method2 == null) {
                    Method declaredMethod2 = sLocationRequestClass.getDeclaredMethod("setQuality", cls2);
                    sSetQualityMethod = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                sSetQualityMethod.invoke(invoke, Integer.valueOf(locationRequestCompat.getQuality()));
                if (sSetFastestIntervalMethod == null) {
                    Method declaredMethod3 = sLocationRequestClass.getDeclaredMethod("setFastestInterval", cls);
                    sSetFastestIntervalMethod = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                sSetFastestIntervalMethod.invoke(invoke, Long.valueOf(locationRequestCompat.getMinUpdateIntervalMillis()));
                if (locationRequestCompat.getMaxUpdates() < Integer.MAX_VALUE) {
                    if (sSetNumUpdatesMethod == null) {
                        Method declaredMethod4 = sLocationRequestClass.getDeclaredMethod("setNumUpdates", cls2);
                        sSetNumUpdatesMethod = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    sSetNumUpdatesMethod.invoke(invoke, Integer.valueOf(locationRequestCompat.getMaxUpdates()));
                }
                if (locationRequestCompat.getDurationMillis() < Long.MAX_VALUE) {
                    if (sSetExpireInMethod == null) {
                        Method declaredMethod5 = sLocationRequestClass.getDeclaredMethod("setExpireIn", cls);
                        sSetExpireInMethod = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    sSetExpireInMethod.invoke(invoke, Long.valueOf(locationRequestCompat.getDurationMillis()));
                }
                return invoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(31)
    /* loaded from: classes.dex */
    public static class Api31Impl {
        private Api31Impl() {
        }

        @DoNotInline
        public static LocationRequest toLocationRequest(LocationRequestCompat locationRequestCompat) {
            return new LocationRequest.Builder(locationRequestCompat.getIntervalMillis()).setQuality(locationRequestCompat.getQuality()).setMinUpdateIntervalMillis(locationRequestCompat.getMinUpdateIntervalMillis()).setDurationMillis(locationRequestCompat.getDurationMillis()).setMaxUpdates(locationRequestCompat.getMaxUpdates()).setMinUpdateDistanceMeters(locationRequestCompat.getMinUpdateDistanceMeters()).setMaxUpdateDelayMillis(locationRequestCompat.getMaxUpdateDelayMillis()).build();
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface Quality {
    }

    public LocationRequestCompat(long j10, int i10, long j11, int i11, long j12, float f8, long j13) {
        this.mIntervalMillis = j10;
        this.mQuality = i10;
        this.mMinUpdateIntervalMillis = j12;
        this.mDurationMillis = j11;
        this.mMaxUpdates = i11;
        this.mMinUpdateDistanceMeters = f8;
        this.mMaxUpdateDelayMillis = j13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequestCompat)) {
            return false;
        }
        LocationRequestCompat locationRequestCompat = (LocationRequestCompat) obj;
        if (this.mQuality == locationRequestCompat.mQuality && this.mIntervalMillis == locationRequestCompat.mIntervalMillis && this.mMinUpdateIntervalMillis == locationRequestCompat.mMinUpdateIntervalMillis && this.mDurationMillis == locationRequestCompat.mDurationMillis && this.mMaxUpdates == locationRequestCompat.mMaxUpdates && Float.compare(locationRequestCompat.mMinUpdateDistanceMeters, this.mMinUpdateDistanceMeters) == 0 && this.mMaxUpdateDelayMillis == locationRequestCompat.mMaxUpdateDelayMillis) {
            return true;
        }
        return false;
    }

    @IntRange(from = MediaConstants.METADATA_VALUE_ATTRIBUTE_PRESENT)
    public long getDurationMillis() {
        return this.mDurationMillis;
    }

    @IntRange(from = ULong.MIN_VALUE)
    public long getIntervalMillis() {
        return this.mIntervalMillis;
    }

    @IntRange(from = ULong.MIN_VALUE)
    public long getMaxUpdateDelayMillis() {
        return this.mMaxUpdateDelayMillis;
    }

    @IntRange(from = MediaConstants.METADATA_VALUE_ATTRIBUTE_PRESENT, to = 2147483647L)
    public int getMaxUpdates() {
        return this.mMaxUpdates;
    }

    @FloatRange(from = 0.0d, to = 3.4028234663852886E38d)
    public float getMinUpdateDistanceMeters() {
        return this.mMinUpdateDistanceMeters;
    }

    @IntRange(from = ULong.MIN_VALUE)
    public long getMinUpdateIntervalMillis() {
        long j10 = this.mMinUpdateIntervalMillis;
        if (j10 == -1) {
            return this.mIntervalMillis;
        }
        return j10;
    }

    public int getQuality() {
        return this.mQuality;
    }

    public int hashCode() {
        int i10 = this.mQuality * 31;
        long j10 = this.mIntervalMillis;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.mMinUpdateIntervalMillis;
        return i11 + ((int) (j11 ^ (j11 >>> 32)));
    }

    @Nullable
    public LocationRequest toLocationRequest(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return toLocationRequest();
        }
        return androidx.core.app.c.f(Api19Impl.toLocationRequest(this, str));
    }

    @NonNull
    public String toString() {
        StringBuilder u8 = ai.onnxruntime.a.u("Request[");
        if (this.mIntervalMillis != Long.MAX_VALUE) {
            u8.append("@");
            TimeUtils.formatDuration(this.mIntervalMillis, u8);
            int i10 = this.mQuality;
            if (i10 != 100) {
                if (i10 != 102) {
                    if (i10 == 104) {
                        u8.append(" LOW_POWER");
                    }
                } else {
                    u8.append(" BALANCED");
                }
            } else {
                u8.append(" HIGH_ACCURACY");
            }
        } else {
            u8.append("PASSIVE");
        }
        if (this.mDurationMillis != Long.MAX_VALUE) {
            u8.append(", duration=");
            TimeUtils.formatDuration(this.mDurationMillis, u8);
        }
        if (this.mMaxUpdates != Integer.MAX_VALUE) {
            u8.append(", maxUpdates=");
            u8.append(this.mMaxUpdates);
        }
        long j10 = this.mMinUpdateIntervalMillis;
        if (j10 != -1 && j10 < this.mIntervalMillis) {
            u8.append(", minUpdateInterval=");
            TimeUtils.formatDuration(this.mMinUpdateIntervalMillis, u8);
        }
        if (this.mMinUpdateDistanceMeters > 0.0d) {
            u8.append(", minUpdateDistance=");
            u8.append(this.mMinUpdateDistanceMeters);
        }
        if (this.mMaxUpdateDelayMillis / 2 > this.mIntervalMillis) {
            u8.append(", maxUpdateDelay=");
            TimeUtils.formatDuration(this.mMaxUpdateDelayMillis, u8);
        }
        u8.append(']');
        return u8.toString();
    }

    @NonNull
    @RequiresApi(31)
    public LocationRequest toLocationRequest() {
        return Api31Impl.toLocationRequest(this);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private long mDurationMillis;
        private long mIntervalMillis;
        private long mMaxUpdateDelayMillis;
        private int mMaxUpdates;
        private float mMinUpdateDistanceMeters;
        private long mMinUpdateIntervalMillis;
        private int mQuality;

        public Builder(long j10) {
            setIntervalMillis(j10);
            this.mQuality = LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY;
            this.mDurationMillis = Long.MAX_VALUE;
            this.mMaxUpdates = Integer.MAX_VALUE;
            this.mMinUpdateIntervalMillis = -1L;
            this.mMinUpdateDistanceMeters = 0.0f;
            this.mMaxUpdateDelayMillis = 0L;
        }

        @NonNull
        public LocationRequestCompat build() {
            boolean z9;
            if (this.mIntervalMillis == Long.MAX_VALUE && this.mMinUpdateIntervalMillis == -1) {
                z9 = false;
            } else {
                z9 = true;
            }
            Preconditions.checkState(z9, "passive location requests must have an explicit minimum update interval");
            long j10 = this.mIntervalMillis;
            return new LocationRequestCompat(j10, this.mQuality, this.mDurationMillis, this.mMaxUpdates, Math.min(this.mMinUpdateIntervalMillis, j10), this.mMinUpdateDistanceMeters, this.mMaxUpdateDelayMillis);
        }

        @NonNull
        public Builder clearMinUpdateIntervalMillis() {
            this.mMinUpdateIntervalMillis = -1L;
            return this;
        }

        @NonNull
        public Builder setDurationMillis(@IntRange(from = 1) long j10) {
            this.mDurationMillis = Preconditions.checkArgumentInRange(j10, 1L, Long.MAX_VALUE, "durationMillis");
            return this;
        }

        @NonNull
        public Builder setIntervalMillis(@IntRange(from = 0) long j10) {
            this.mIntervalMillis = Preconditions.checkArgumentInRange(j10, 0L, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        @NonNull
        public Builder setMaxUpdateDelayMillis(@IntRange(from = 0) long j10) {
            this.mMaxUpdateDelayMillis = j10;
            this.mMaxUpdateDelayMillis = Preconditions.checkArgumentInRange(j10, 0L, Long.MAX_VALUE, "maxUpdateDelayMillis");
            return this;
        }

        @NonNull
        public Builder setMaxUpdates(@IntRange(from = 1, to = 2147483647L) int i10) {
            this.mMaxUpdates = Preconditions.checkArgumentInRange(i10, 1, Integer.MAX_VALUE, "maxUpdates");
            return this;
        }

        @NonNull
        public Builder setMinUpdateDistanceMeters(@FloatRange(from = 0.0d, to = 3.4028234663852886E38d) float f8) {
            this.mMinUpdateDistanceMeters = f8;
            this.mMinUpdateDistanceMeters = Preconditions.checkArgumentInRange(f8, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        @NonNull
        public Builder setMinUpdateIntervalMillis(@IntRange(from = 0) long j10) {
            this.mMinUpdateIntervalMillis = Preconditions.checkArgumentInRange(j10, 0L, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        @NonNull
        public Builder setQuality(int i10) {
            boolean z9;
            if (i10 != 104 && i10 != 102 && i10 != 100) {
                z9 = false;
            } else {
                z9 = true;
            }
            Preconditions.checkArgument(z9, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i10));
            this.mQuality = i10;
            return this;
        }

        public Builder(@NonNull LocationRequestCompat locationRequestCompat) {
            this.mIntervalMillis = locationRequestCompat.mIntervalMillis;
            this.mQuality = locationRequestCompat.mQuality;
            this.mDurationMillis = locationRequestCompat.mDurationMillis;
            this.mMaxUpdates = locationRequestCompat.mMaxUpdates;
            this.mMinUpdateIntervalMillis = locationRequestCompat.mMinUpdateIntervalMillis;
            this.mMinUpdateDistanceMeters = locationRequestCompat.mMinUpdateDistanceMeters;
            this.mMaxUpdateDelayMillis = locationRequestCompat.mMaxUpdateDelayMillis;
        }
    }
}
