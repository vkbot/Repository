package c2;

import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: a, reason: collision with root package name */
    public final long f494a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f495b;
    public final long c;
    public final byte[] d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final long f496f;

    /* renamed from: g, reason: collision with root package name */
    public final w f497g;

    public l(long j10, Integer num, long j11, byte[] bArr, String str, long j12, w wVar) {
        this.f494a = j10;
        this.f495b = num;
        this.c = j11;
        this.d = bArr;
        this.e = str;
        this.f496f = j12;
        this.f497g = wVar;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            l lVar = (l) sVar;
            if (this.f494a == lVar.f494a) {
                Integer num = lVar.f495b;
                Integer num2 = this.f495b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.c == lVar.c) {
                        if (sVar instanceof l) {
                            bArr = ((l) sVar).d;
                        } else {
                            bArr = lVar.d;
                        }
                        if (Arrays.equals(this.d, bArr)) {
                            String str = lVar.e;
                            String str2 = this.e;
                            if (str2 != null ? str2.equals(str) : str == null) {
                                if (this.f496f == lVar.f496f) {
                                    w wVar = lVar.f497g;
                                    w wVar2 = this.f497g;
                                    if (wVar2 != null ? wVar2.equals(wVar) : wVar == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j10 = this.f494a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        int i11 = 0;
        Integer num = this.f495b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = (i10 ^ hashCode) * 1000003;
        long j11 = this.c;
        int hashCode3 = (((i12 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i13 = (hashCode3 ^ hashCode2) * 1000003;
        long j12 = this.f496f;
        int i14 = (i13 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        w wVar = this.f497g;
        if (wVar != null) {
            i11 = wVar.hashCode();
        }
        return i14 ^ i11;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f494a + ", eventCode=" + this.f495b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f496f + ", networkConnectionInfo=" + this.f497g + "}";
    }
}
