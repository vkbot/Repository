package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class r implements Comparable, Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new android.support.v4.media.g(7);

    /* renamed from: b, reason: collision with root package name */
    public final Calendar f1345b;
    public final int c;
    public final int d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1346f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1347g;

    /* renamed from: h, reason: collision with root package name */
    public String f1348h;

    public r(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a10 = a0.a(calendar);
        this.f1345b = a10;
        this.c = a10.get(2);
        this.d = a10.get(1);
        this.e = a10.getMaximum(7);
        this.f1346f = a10.getActualMaximum(5);
        this.f1347g = a10.getTimeInMillis();
    }

    public static r q(int i10, int i11) {
        Calendar c = a0.c(null);
        c.set(1, i10);
        c.set(2, i11);
        return new r(c);
    }

    public static r r(long j10) {
        Calendar c = a0.c(null);
        c.setTimeInMillis(j10);
        return new r(c);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1345b.compareTo(((r) obj).f1345b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.c == rVar.c && this.d == rVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String s() {
        if (this.f1348h == null) {
            long timeInMillis = this.f1345b.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = a0.f1296a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f1348h = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f1348h;
    }

    public final int t(r rVar) {
        if (this.f1345b instanceof GregorianCalendar) {
            return (rVar.c - this.c) + ((rVar.d - this.d) * 12);
        }
        j1.i.k("Only Gregorian calendars are supported.");
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.d);
        parcel.writeInt(this.c);
    }
}
