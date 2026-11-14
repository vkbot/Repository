package k2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h implements d, l2.c, c {

    /* renamed from: g, reason: collision with root package name */
    public static final a2.a f3390g = new a2.a("proto");

    /* renamed from: b, reason: collision with root package name */
    public final j f3391b;
    public final m2.a c;
    public final m2.a d;
    public final a e;

    /* renamed from: f, reason: collision with root package name */
    public final t8.a f3392f;

    public h(m2.a aVar, m2.a aVar2, a aVar3, j jVar, t8.a aVar4) {
        this.f3391b = jVar;
        this.c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f3392f = aVar4;
    }

    public static Long c(SQLiteDatabase sQLiteDatabase, d2.j jVar) {
        Long valueOf;
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(jVar.f1745a, String.valueOf(n2.a.a(jVar.c))));
        byte[] bArr = jVar.f1746b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            if (!query.moveToNext()) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(query.getLong(0));
            }
            return valueOf;
        } finally {
            query.close();
        }
    }

    public static String d0(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).f3385a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object e0(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final ArrayList S(SQLiteDatabase sQLiteDatabase, d2.j jVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long c = c(sQLiteDatabase, jVar);
        if (c == null) {
            return arrayList;
        }
        e0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{c.toString()}, null, null, null, String.valueOf(i10)), new androidx.transition.a(this, arrayList, jVar, 2));
        return arrayList;
    }

    public final void V(long j10, g2.c cVar, String str) {
        y(new j2.h(j10, str, cVar));
    }

    public final SQLiteDatabase b() {
        j jVar = this.f3391b;
        Objects.requireNonNull(jVar);
        m2.a aVar = this.d;
        long d = aVar.d();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (aVar.d() < this.e.c + d) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e);
                }
            }
        }
    }

    public final Object c0(l2.b bVar) {
        SQLiteDatabase b10 = b();
        m2.a aVar = this.d;
        long d = aVar.d();
        while (true) {
            try {
                b10.beginTransaction();
                try {
                    Object execute = bVar.execute();
                    b10.setTransactionSuccessful();
                    return execute;
                } finally {
                    b10.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (aVar.d() < this.e.c + d) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3391b.close();
    }

    public final Object y(f fVar) {
        SQLiteDatabase b10 = b();
        b10.beginTransaction();
        try {
            Object apply = fVar.apply(b10);
            b10.setTransactionSuccessful();
            return apply;
        } finally {
            b10.endTransaction();
        }
    }
}
