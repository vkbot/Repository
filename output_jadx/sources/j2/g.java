package j2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import d2.j;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import n.p;
import org.apache.commons.io.l;
import s1.x0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements l2.b, u4.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3250b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3251f;

    public /* synthetic */ g(i iVar, Iterable iterable, j jVar, long j10) {
        this.f3250b = 0;
        this.d = iVar;
        this.e = iterable;
        this.f3251f = jVar;
        this.c = j10;
    }

    @Override // u4.g
    public ScheduledFuture a(final p pVar) {
        switch (this.f3250b) {
            case 1:
                u4.f fVar = (u4.f) this.d;
                Runnable runnable = (Runnable) this.e;
                return fVar.c.schedule(new u4.d(fVar, runnable, pVar, 1), this.c, (TimeUnit) this.f3251f);
            default:
                final u4.f fVar2 = (u4.f) this.d;
                final Callable callable = (Callable) this.e;
                return fVar2.c.schedule(new Callable() { // from class: u4.e
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return f.this.f5878b.submit(new x0(8, callable, pVar));
                    }
                }, this.c, (TimeUnit) this.f3251f);
        }
    }

    @Override // l2.b
    public Object execute() {
        i iVar = (i) this.d;
        Iterable iterable = (Iterable) this.e;
        j jVar = (j) this.f3251f;
        k2.h hVar = (k2.h) iVar.c;
        hVar.getClass();
        if (iterable.iterator().hasNext()) {
            String concat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(k2.h.d0(iterable));
            SQLiteDatabase b10 = hVar.b();
            b10.beginTransaction();
            try {
                b10.compileStatement(concat).execute();
                Cursor rawQuery = b10.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        hVar.V(rawQuery.getInt(0), g2.c.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                b10.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                b10.setTransactionSuccessful();
            } finally {
                b10.endTransaction();
            }
        }
        hVar.y(new l(iVar.f3256g.d() + this.c, jVar));
        return null;
    }

    public /* synthetic */ g(u4.f fVar, Object obj, long j10, TimeUnit timeUnit, int i10) {
        this.f3250b = i10;
        this.d = fVar;
        this.e = obj;
        this.c = j10;
        this.f3251f = timeUnit;
    }
}
