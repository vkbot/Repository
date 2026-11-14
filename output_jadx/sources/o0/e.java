package o0;

import android.content.Context;
import android.content.SharedPreferences;
import e0.m;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final String f4303b = m.h(new byte[]{120, -123, -99, 67, -118, -116, 45, 85, 101, -113, ByteCompanionObject.MIN_VALUE, 82, -116}, new byte[]{31, -32, -18, 55, -1, -2, 72, 10});

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f4304a;

    public e(Context context) {
        this.f4304a = context.getSharedPreferences(f4303b, 0);
    }

    public final boolean a(f fVar) {
        return this.f4304a.getBoolean(m.h(new byte[]{15, -83, 83, -34, -22, 0, -27, 113}, new byte[]{106, -61, 50, -68, -122, 101, -127, 46}) + fVar.name(), false);
    }
}
