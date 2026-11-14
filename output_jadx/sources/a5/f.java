package a5;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f implements x4.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f41f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final x4.c f42g;

    /* renamed from: h, reason: collision with root package name */
    public static final x4.c f43h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f44i;

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f45a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f46b;
    public final HashMap c;
    public final x4.d d;
    public final i e = new i(this);

    static {
        a aVar = new a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(d.class, aVar);
        f42g = new x4.c("key", Collections.unmodifiableMap(new HashMap(hashMap)));
        a aVar2 = new a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(d.class, aVar2);
        f43h = new x4.c("value", Collections.unmodifiableMap(new HashMap(hashMap2)));
        f44i = new e(0);
    }

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, x4.d dVar) {
        this.f45a = byteArrayOutputStream;
        this.f46b = hashMap;
        this.c = hashMap2;
        this.d = dVar;
    }

    public static int g(x4.c cVar) {
        d dVar = (d) ((Annotation) cVar.f6496b.get(d.class));
        if (dVar != null) {
            return dVar.tag();
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override // x4.e
    public final x4.e a(x4.c cVar, long j10) {
        c(cVar, j10, true);
        return this;
    }

    public final void b(x4.c cVar, int i10, boolean z9) {
        if (!z9 || i10 != 0) {
            d dVar = (d) ((Annotation) cVar.f6496b.get(d.class));
            if (dVar != null) {
                int ordinal = dVar.intEncoding().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            return;
                        }
                        h((dVar.tag() << 3) | 5);
                        this.f45a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i10).array());
                        return;
                    }
                    h(dVar.tag() << 3);
                    h((i10 << 1) ^ (i10 >> 31));
                    return;
                }
                h(dVar.tag() << 3);
                h(i10);
                return;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
    }

    public final void c(x4.c cVar, long j10, boolean z9) {
        if (!z9 || j10 != 0) {
            d dVar = (d) ((Annotation) cVar.f6496b.get(d.class));
            if (dVar != null) {
                int ordinal = dVar.intEncoding().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            return;
                        }
                        h((dVar.tag() << 3) | 1);
                        this.f45a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j10).array());
                        return;
                    }
                    h(dVar.tag() << 3);
                    i((j10 >> 63) ^ (j10 << 1));
                    return;
                }
                h(dVar.tag() << 3);
                i(j10);
                return;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
    }

    @Override // x4.e
    public final x4.e d(x4.c cVar, Object obj) {
        e(cVar, obj, true);
        return this;
    }

    public final void e(x4.c cVar, Object obj, boolean z9) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z9 || charSequence.length() != 0) {
                    h((g(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f41f);
                    h(bytes.length);
                    this.f45a.write(bytes);
                    return;
                }
                return;
            }
            if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    e(cVar, it.next(), false);
                }
                return;
            }
            if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    f(f44i, cVar, (Map.Entry) it2.next(), false);
                }
                return;
            }
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (!z9 || doubleValue != 0.0d) {
                    h((g(cVar) << 3) | 1);
                    this.f45a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
                    return;
                }
                return;
            }
            if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z9 || floatValue != 0.0f) {
                    h((g(cVar) << 3) | 5);
                    this.f45a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                    return;
                }
                return;
            }
            if (obj instanceof Number) {
                c(cVar, ((Number) obj).longValue(), z9);
                return;
            }
            if (obj instanceof Boolean) {
                b(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z9);
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z9 && bArr.length == 0) {
                    return;
                }
                h((g(cVar) << 3) | 2);
                h(bArr.length);
                this.f45a.write(bArr);
                return;
            }
            x4.d dVar = (x4.d) this.f46b.get(obj.getClass());
            if (dVar != null) {
                f(dVar, cVar, obj, z9);
                return;
            }
            x4.f fVar = (x4.f) this.c.get(obj.getClass());
            if (fVar != null) {
                i iVar = this.e;
                iVar.f49a = false;
                iVar.c = cVar;
                iVar.f50b = z9;
                fVar.a(obj, iVar);
                return;
            }
            if (obj instanceof g2.c) {
                b(cVar, ((g2.c) obj).f2433b, true);
            } else if (obj instanceof Enum) {
                b(cVar, ((Enum) obj).ordinal(), true);
            } else {
                f(this.d, cVar, obj, z9);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, a5.b] */
    public final void f(x4.d dVar, x4.c cVar, Object obj, boolean z9) {
        ?? outputStream = new OutputStream();
        outputStream.f38b = 0L;
        try {
            OutputStream outputStream2 = this.f45a;
            this.f45a = outputStream;
            try {
                dVar.a(obj, this);
                this.f45a = outputStream2;
                long j10 = outputStream.f38b;
                outputStream.close();
                if (z9 && j10 == 0) {
                    return;
                }
                h((g(cVar) << 3) | 2);
                i(j10);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f45a = outputStream2;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                outputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void h(int i10) {
        while (true) {
            long j10 = i10 & (-128);
            OutputStream outputStream = this.f45a;
            if (j10 != 0) {
                outputStream.write((i10 & 127) | 128);
                i10 >>>= 7;
            } else {
                outputStream.write(i10 & 127);
                return;
            }
        }
    }

    public final void i(long j10) {
        while (true) {
            long j11 = (-128) & j10;
            OutputStream outputStream = this.f45a;
            if (j11 != 0) {
                outputStream.write((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } else {
                outputStream.write(((int) j10) & 127);
                return;
            }
        }
    }
}
