package org.apache.commons.io;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import org.apache.commons.io.function.IOBooleanSupplier;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements IOBooleanSupplier, k2.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4909b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;

    public /* synthetic */ l(long j10, d2.j jVar) {
        this.f4909b = 2;
        this.d = j10;
        this.c = jVar;
    }

    @Override // k2.f
    public Object apply(Object obj) {
        d2.j jVar = (d2.j) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.d));
        String str = jVar.f1745a;
        a2.b bVar = jVar.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(n2.a.a(bVar))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(n2.a.a(bVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // org.apache.commons.io.function.IOBooleanSupplier
    public boolean getAsBoolean() {
        boolean lambda$isFileNewer$4;
        boolean lambda$isFileOlder$7;
        switch (this.f4909b) {
            case 0:
                lambda$isFileNewer$4 = FileUtils.lambda$isFileNewer$4((File) this.c, this.d);
                return lambda$isFileNewer$4;
            default:
                lambda$isFileOlder$7 = FileUtils.lambda$isFileOlder$7((File) this.c, this.d);
                return lambda$isFileOlder$7;
        }
    }

    public /* synthetic */ l(File file, long j10, int i10) {
        this.f4909b = i10;
        this.c = file;
        this.d = j10;
    }
}
