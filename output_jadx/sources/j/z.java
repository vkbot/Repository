package j;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class z extends Exception {

    /* renamed from: g, reason: collision with root package name */
    public static final StackTraceElement[] f3085g = new StackTraceElement[0];

    /* renamed from: b, reason: collision with root package name */
    public final List f3086b;
    public h.e c;
    public int d;
    public Class e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3087f;

    public z(String str, List list) {
        this.f3087f = str;
        setStackTrace(f3085g);
        this.f3086b = list;
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (th instanceof z) {
            Iterator it = ((z) th).f3086b.iterator();
            while (it.hasNext()) {
                a((Throwable) it.next(), arrayList);
            }
            return;
        }
        arrayList.add(th);
    }

    public static void b(List list, y yVar) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            yVar.append("Cause (");
            int i11 = i10 + 1;
            yVar.append(String.valueOf(i11));
            yVar.append(" of ");
            yVar.append(String.valueOf(size));
            yVar.append("): ");
            Throwable th = (Throwable) list.get(i10);
            if (th instanceof z) {
                ((z) th).e(yVar);
            } else {
                c(th, yVar);
            }
            i10 = i11;
        }
    }

    public static void c(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            n0.b.w(th);
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i11 = i10 + 1;
            sb.append(i11);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i10));
            i10 = i11;
        }
    }

    public final void e(Appendable appendable) {
        c(this, appendable);
        try {
            b(this.f3086b, new y(appendable));
        } catch (IOException e) {
            n0.b.w(e);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f3087f);
        String str3 = "";
        if (this.e == null) {
            str = "";
        } else {
            str = ", " + this.e;
        }
        sb.append(str);
        int i10 = this.d;
        if (i10 == 0) {
            str2 = "";
        } else {
            str2 = ", ".concat(com.google.protobuf.q.y(i10));
        }
        sb.append(str2);
        if (this.c != null) {
            str3 = ", " + this.c;
        }
        sb.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Throwable th = (Throwable) obj;
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        e(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }

    public z(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
