package j2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import d2.j;
import org.apache.commons.io.l;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements l2.b, k2.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f3252b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h(long j10, Object obj, Object obj2) {
        this.c = obj;
        this.d = obj2;
        this.f3252b = j10;
    }

    @Override // k2.f
    public Object apply(Object obj) {
        boolean z9;
        String str = (String) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i10 = ((g2.c) this.d).f2433b;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        try {
            if (rawQuery.getCount() > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            rawQuery.close();
            long j10 = this.f3252b;
            if (!z9) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i10));
                contentValues.put("events_dropped_count", Long.valueOf(j10));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                return null;
            }
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // l2.b
    public Object execute() {
        i iVar = (i) this.c;
        j jVar = (j) this.d;
        k2.d dVar = iVar.c;
        long d = iVar.f3256g.d() + this.f3252b;
        k2.h hVar = (k2.h) dVar;
        hVar.getClass();
        hVar.y(new l(d, jVar));
        return null;
    }
}
