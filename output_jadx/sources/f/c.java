package f;

import android.os.Build;
import android.os.StrictMode;
import com.bumptech.glide.manager.s;
import j1.i;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final File f2223b;
    public final File c;
    public final File d;
    public final File e;

    /* renamed from: g, reason: collision with root package name */
    public final long f2225g;

    /* renamed from: j, reason: collision with root package name */
    public BufferedWriter f2228j;

    /* renamed from: l, reason: collision with root package name */
    public int f2230l;

    /* renamed from: i, reason: collision with root package name */
    public long f2227i = 0;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f2229k = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: m, reason: collision with root package name */
    public long f2231m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final ThreadPoolExecutor f2232n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), (ThreadFactory) new Object());

    /* renamed from: o, reason: collision with root package name */
    public final d8.a f2233o = new d8.a(1, this);

    /* renamed from: f, reason: collision with root package name */
    public final int f2224f = 1;

    /* renamed from: h, reason: collision with root package name */
    public final int f2226h = 1;

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public c(File file, long j10) {
        this.f2223b = file;
        this.c = new File(file, "journal");
        this.d = new File(file, "journal.tmp");
        this.e = new File(file, "journal.bkp");
        this.f2225g = j10;
    }

    public static void V(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void b(c cVar, s sVar, boolean z9) {
        synchronized (cVar) {
            b bVar = (b) sVar.c;
            if (bVar.f2221f == sVar) {
                if (z9 && !bVar.e) {
                    for (int i10 = 0; i10 < cVar.f2226h; i10++) {
                        if (((boolean[]) sVar.d)[i10]) {
                            if (!bVar.d[i10].exists()) {
                                sVar.a();
                                return;
                            }
                        } else {
                            sVar.a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                        }
                    }
                }
                for (int i11 = 0; i11 < cVar.f2226h; i11++) {
                    File file = bVar.d[i11];
                    if (z9) {
                        if (file.exists()) {
                            File file2 = bVar.c[i11];
                            file.renameTo(file2);
                            long j10 = bVar.f2220b[i11];
                            long length = file2.length();
                            bVar.f2220b[i11] = length;
                            cVar.f2227i = (cVar.f2227i - j10) + length;
                        }
                    } else {
                        y(file);
                    }
                }
                cVar.f2230l++;
                bVar.f2221f = null;
                if (bVar.e | z9) {
                    bVar.e = true;
                    cVar.f2228j.append((CharSequence) "CLEAN");
                    cVar.f2228j.append(' ');
                    cVar.f2228j.append((CharSequence) bVar.f2219a);
                    cVar.f2228j.append((CharSequence) bVar.a());
                    cVar.f2228j.append('\n');
                    if (z9) {
                        cVar.f2231m++;
                    }
                } else {
                    cVar.f2229k.remove(bVar.f2219a);
                    cVar.f2228j.append((CharSequence) "REMOVE");
                    cVar.f2228j.append(' ');
                    cVar.f2228j.append((CharSequence) bVar.f2219a);
                    cVar.f2228j.append('\n');
                }
                V(cVar.f2228j);
                if (cVar.f2227i > cVar.f2225g || cVar.d0()) {
                    cVar.f2232n.submit(cVar.f2233o);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void c(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static c e0(File file, long j10) {
        if (j10 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    j0(file2, file3, false);
                }
            }
            c cVar = new c(file, j10);
            if (cVar.c.exists()) {
                try {
                    cVar.g0();
                    cVar.f0();
                    return cVar;
                } catch (IOException e) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    cVar.close();
                    f.a(cVar.f2223b);
                }
            }
            file.mkdirs();
            c cVar2 = new c(file, j10);
            cVar2.i0();
            return cVar2;
        }
        i.k("maxSize <= 0");
        return null;
    }

    public static void j0(File file, File file2, boolean z9) {
        if (z9) {
            y(file2);
        }
        if (file.renameTo(file2)) {
        } else {
            throw new IOException();
        }
    }

    public static void y(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public final s S(String str) {
        synchronized (this) {
            try {
                if (this.f2228j != null) {
                    b bVar = (b) this.f2229k.get(str);
                    if (bVar == null) {
                        bVar = new b(this, str);
                        this.f2229k.put(str, bVar);
                    } else if (bVar.f2221f != null) {
                        return null;
                    }
                    s sVar = new s(this, bVar);
                    bVar.f2221f = sVar;
                    this.f2228j.append((CharSequence) "DIRTY");
                    this.f2228j.append(' ');
                    this.f2228j.append((CharSequence) str);
                    this.f2228j.append('\n');
                    V(this.f2228j);
                    return sVar;
                }
                throw new IllegalStateException("cache is closed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized r5.c c0(String str) {
        if (this.f2228j != null) {
            b bVar = (b) this.f2229k.get(str);
            if (bVar == null) {
                return null;
            }
            if (!bVar.e) {
                return null;
            }
            for (File file : bVar.c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.f2230l++;
            this.f2228j.append((CharSequence) "READ");
            this.f2228j.append(' ');
            this.f2228j.append((CharSequence) str);
            this.f2228j.append('\n');
            if (d0()) {
                this.f2232n.submit(this.f2233o);
            }
            return new r5.c(11, bVar.c);
        }
        throw new IllegalStateException("cache is closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f2228j == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f2229k.values());
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                s sVar = ((b) obj).f2221f;
                if (sVar != null) {
                    sVar.a();
                }
            }
            k0();
            c(this.f2228j);
            this.f2228j = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean d0() {
        int i10 = this.f2230l;
        if (i10 >= 2000 && i10 >= this.f2229k.size()) {
            return true;
        }
        return false;
    }

    public final void f0() {
        y(this.d);
        Iterator it = this.f2229k.values().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            s sVar = bVar.f2221f;
            int i10 = this.f2226h;
            int i11 = 0;
            if (sVar == null) {
                while (i11 < i10) {
                    this.f2227i += bVar.f2220b[i11];
                    i11++;
                }
            } else {
                bVar.f2221f = null;
                while (i11 < i10) {
                    y(bVar.c[i11]);
                    y(bVar.d[i11]);
                    i11++;
                }
                it.remove();
            }
        }
    }

    public final void g0() {
        File file = this.c;
        e eVar = new e(new FileInputStream(file), f.f2237a);
        try {
            String b10 = eVar.b();
            String b11 = eVar.b();
            String b12 = eVar.b();
            String b13 = eVar.b();
            String b14 = eVar.b();
            if ("libcore.io.DiskLruCache".equals(b10) && "1".equals(b11) && Integer.toString(this.f2224f).equals(b12) && Integer.toString(this.f2226h).equals(b13) && "".equals(b14)) {
                int i10 = 0;
                while (true) {
                    try {
                        h0(eVar.b());
                        i10++;
                    } catch (EOFException unused) {
                        this.f2230l = i10 - this.f2229k.size();
                        if (eVar.f2236f == -1) {
                            i0();
                        } else {
                            this.f2228j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), f.f2237a));
                        }
                        try {
                            eVar.close();
                            return;
                        } catch (RuntimeException e) {
                            throw e;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + b10 + ", " + b11 + ", " + b13 + ", " + b14 + "]");
            }
        } catch (Throwable th) {
            try {
                eVar.close();
            } catch (RuntimeException e6) {
                throw e6;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void h0(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            LinkedHashMap linkedHashMap = this.f2229k;
            if (indexOf2 == -1) {
                substring = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i10, indexOf2);
            }
            b bVar = (b) linkedHashMap.get(substring);
            if (bVar == null) {
                bVar = new b(this, substring);
                linkedHashMap.put(substring, bVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                bVar.e = true;
                bVar.f2221f = null;
                if (split.length == bVar.f2222g.f2226h) {
                    for (int i11 = 0; i11 < split.length; i11++) {
                        try {
                            bVar.f2220b[i11] = Long.parseLong(split[i11]);
                        } catch (NumberFormatException unused) {
                            ai.onnxruntime.b.w(Arrays.toString(split), "unexpected journal line: ");
                            return;
                        }
                    }
                    return;
                }
                ai.onnxruntime.b.w(Arrays.toString(split), "unexpected journal line: ");
                return;
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                bVar.f2221f = new s(this, bVar);
                return;
            } else {
                if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                n0.b.A("unexpected journal line: ".concat(str));
                return;
            }
        }
        n0.b.A("unexpected journal line: ".concat(str));
    }

    public final synchronized void i0() {
        try {
            BufferedWriter bufferedWriter = this.f2228j;
            if (bufferedWriter != null) {
                c(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.d), f.f2237a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f2224f));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f2226h));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (b bVar : this.f2229k.values()) {
                    if (bVar.f2221f != null) {
                        bufferedWriter2.write("DIRTY " + bVar.f2219a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + bVar.f2219a + bVar.a() + '\n');
                    }
                }
                c(bufferedWriter2);
                if (this.c.exists()) {
                    j0(this.c, this.e, true);
                }
                j0(this.d, this.c, false);
                this.e.delete();
                this.f2228j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c, true), f.f2237a));
            } catch (Throwable th) {
                c(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void k0() {
        while (this.f2227i > this.f2225g) {
            String str = (String) ((Map.Entry) this.f2229k.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f2228j != null) {
                        b bVar = (b) this.f2229k.get(str);
                        if (bVar != null && bVar.f2221f == null) {
                            for (int i10 = 0; i10 < this.f2226h; i10++) {
                                File file = bVar.c[i10];
                                if (file.exists() && !file.delete()) {
                                    throw new IOException("failed to delete " + file);
                                }
                                long j10 = this.f2227i;
                                long[] jArr = bVar.f2220b;
                                this.f2227i = j10 - jArr[i10];
                                jArr[i10] = 0;
                            }
                            this.f2230l++;
                            this.f2228j.append((CharSequence) "REMOVE");
                            this.f2228j.append(' ');
                            this.f2228j.append((CharSequence) str);
                            this.f2228j.append('\n');
                            this.f2229k.remove(str);
                            if (d0()) {
                                this.f2232n.submit(this.f2233o);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cache is closed");
                    }
                } finally {
                }
            }
        }
    }
}
