package a8;

import j1.i;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final List f56b;
    public final String c;
    public a d;

    public c(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof c) {
                    linkedHashSet.addAll(((c) th).f56b);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            this.f56b = unmodifiableList;
            this.c = unmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        i.k("errors is empty");
        throw null;
    }

    public static void a(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            a(sb, th.getCause(), "");
        }
    }

    public final void b(com.bumptech.glide.c cVar) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i10 = 1;
        for (Throwable th : this.f56b) {
            sb.append("  ComposedException ");
            sb.append(i10);
            sb.append(" :\n");
            a(sb, th, "\t");
            i10++;
        }
        cVar.p(sb.toString());
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        try {
            if (this.d == null) {
                a aVar = new a();
                HashSet hashSet = new HashSet();
                a aVar2 = aVar;
                for (Throwable th : this.f56b) {
                    if (!hashSet.contains(th)) {
                        hashSet.add(th);
                        ArrayList arrayList = new ArrayList();
                        Throwable cause = th.getCause();
                        if (cause != null && cause != th) {
                            while (true) {
                                arrayList.add(cause);
                                Throwable cause2 = cause.getCause();
                                if (cause2 == null || cause2 == cause) {
                                    break;
                                }
                                cause = cause2;
                            }
                        }
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            Throwable th2 = (Throwable) obj;
                            if (hashSet.contains(th2)) {
                                th = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th2);
                            }
                        }
                        try {
                            aVar2.initCause(th);
                        } catch (Throwable unused) {
                        }
                        Throwable cause3 = aVar2.getCause();
                        if (cause3 != null && this.d != cause3) {
                            while (true) {
                                Throwable cause4 = cause3.getCause();
                                if (cause4 == null || cause4 == cause3) {
                                    break;
                                }
                                cause3 = cause4;
                            }
                            aVar2 = cause3;
                        }
                    }
                }
                this.d = aVar;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.d;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.c;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        b(new b(0, printStream));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        b(new b(1, printWriter));
    }

    public c(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }
}
