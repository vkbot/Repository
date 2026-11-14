package z4;

import android.util.Base64;
import android.util.JsonWriter;
import j1.i;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import x4.e;
import x4.f;
import x4.g;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d implements e, g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6832a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f6833b;
    public final Map c;
    public final Map d;
    public final x4.d e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6834f;

    public d(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, a5.e eVar, boolean z9) {
        this.f6833b = new JsonWriter(bufferedWriter);
        this.c = hashMap;
        this.d = hashMap2;
        this.e = eVar;
        this.f6834f = z9;
    }

    @Override // x4.e
    public final e a(x4.c cVar, long j10) {
        String str = cVar.f6495a;
        g();
        JsonWriter jsonWriter = this.f6833b;
        jsonWriter.name(str);
        g();
        jsonWriter.value(j10);
        return this;
    }

    @Override // x4.g
    public final g b(String str) {
        g();
        this.f6833b.value(str);
        return this;
    }

    @Override // x4.g
    public final g c(boolean z9) {
        g();
        this.f6833b.value(z9);
        return this;
    }

    @Override // x4.e
    public final e d(x4.c cVar, Object obj) {
        f(obj, cVar.f6495a);
        return this;
    }

    public final d e(Object obj) {
        JsonWriter jsonWriter = this.f6833b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                g();
                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            jsonWriter.beginArray();
            int i10 = 0;
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i10 < length) {
                    jsonWriter.value(r6[i10]);
                    i10++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i10 < length2) {
                    long j10 = jArr[i10];
                    g();
                    jsonWriter.value(j10);
                    i10++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i10 < length3) {
                    jsonWriter.value(dArr[i10]);
                    i10++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i10 < length4) {
                    jsonWriter.value(zArr[i10]);
                    i10++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i10 < length5) {
                    e(numberArr[i10]);
                    i10++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i10 < length6) {
                    e(objArr[i10]);
                    i10++;
                }
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Collection) {
            jsonWriter.beginArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                e(it.next());
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    f(entry.getValue(), (String) key);
                } catch (ClassCastException e) {
                    throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            jsonWriter.endObject();
            return this;
        }
        x4.d dVar = (x4.d) this.c.get(obj.getClass());
        if (dVar != null) {
            jsonWriter.beginObject();
            dVar.a(obj, this);
            jsonWriter.endObject();
            return this;
        }
        f fVar = (f) this.d.get(obj.getClass());
        if (fVar != null) {
            fVar.a(obj, this);
            return this;
        }
        if (obj instanceof Enum) {
            String name = ((Enum) obj).name();
            g();
            jsonWriter.value(name);
            return this;
        }
        jsonWriter.beginObject();
        this.e.a(obj, this);
        jsonWriter.endObject();
        return this;
    }

    public final d f(Object obj, String str) {
        boolean z9 = this.f6834f;
        JsonWriter jsonWriter = this.f6833b;
        if (z9) {
            if (obj == null) {
                return this;
            }
            g();
            jsonWriter.name(str);
            e(obj);
            return this;
        }
        g();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        e(obj);
        return this;
    }

    public final void g() {
        if (this.f6832a) {
            return;
        }
        i.l("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
