package f7;

import java.io.BufferedReader;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final h f2362a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2363b;

    public c(android.support.v4.media.h hVar) {
        h hVar2 = (h) hVar.d;
        Objects.requireNonNull(hVar2, "An [Interface] section is required");
        this.f2362a = hVar2;
        this.f2363b = Collections.unmodifiableList(new ArrayList((ArrayList) hVar.c));
    }

    public static c a(BufferedReader bufferedReader) {
        int i10;
        Optional of;
        Optional of2;
        android.support.v4.media.h hVar = new android.support.v4.media.h(9);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        boolean z9 = false;
        boolean z10 = false;
        while (true) {
            boolean z11 = z10;
            while (true) {
                String readLine = bufferedReader.readLine();
                int i12 = -1;
                if (readLine != null) {
                    int indexOf = readLine.indexOf(35);
                    if (indexOf != -1) {
                        readLine = readLine.substring(0, indexOf);
                    }
                    String trim = readLine.trim();
                    if (!trim.isEmpty()) {
                        if (trim.startsWith("[")) {
                            if (z9) {
                                hVar.o(arrayList2);
                                arrayList2.clear();
                            }
                            if ("[Interface]".equalsIgnoreCase(trim)) {
                                break;
                            }
                            if ("[Peer]".equalsIgnoreCase(trim)) {
                                z11 = false;
                                z9 = true;
                            } else {
                                throw new Exception((Throwable) null);
                            }
                        } else if (z11) {
                            arrayList.add(trim);
                        } else if (z9) {
                            arrayList2.add(trim);
                        } else {
                            throw new Exception((Throwable) null);
                        }
                    }
                } else {
                    if (z9) {
                        hVar.o(arrayList2);
                    }
                    if (z10) {
                        f5.i iVar = new f5.i();
                        LinkedHashSet linkedHashSet = (LinkedHashSet) iVar.e;
                        LinkedHashSet linkedHashSet2 = (LinkedHashSet) iVar.f2288f;
                        int size = arrayList.size();
                        int i13 = 0;
                        while (i13 < size) {
                            int i14 = i13 + 1;
                            a aVar = (a) a.a((CharSequence) arrayList.get(i13)).orElseThrow(new androidx.emoji2.text.flatbuffer.a(1));
                            String str = aVar.f2360a;
                            String str2 = aVar.f2361b;
                            String lowerCase = str.toLowerCase(Locale.ENGLISH);
                            lowerCase.getClass();
                            switch (lowerCase.hashCode()) {
                                case -2018040851:
                                    if (lowerCase.equals("excludedapplications")) {
                                        i10 = i11;
                                        break;
                                    }
                                    break;
                                case -1876040196:
                                    if (lowerCase.equals("privatekey")) {
                                        i10 = 1;
                                        break;
                                    }
                                    break;
                                case -1147692044:
                                    if (lowerCase.equals("address")) {
                                        i10 = 2;
                                        break;
                                    }
                                    break;
                                case 99625:
                                    if (lowerCase.equals("dns")) {
                                        i10 = 3;
                                        break;
                                    }
                                    break;
                                case 108462:
                                    if (lowerCase.equals("mtu")) {
                                        i10 = 4;
                                        break;
                                    }
                                    break;
                                case 496413663:
                                    if (lowerCase.equals("includedapplications")) {
                                        i10 = 5;
                                        break;
                                    }
                                    break;
                                case 874736328:
                                    if (lowerCase.equals("listenport")) {
                                        i10 = 6;
                                        break;
                                    }
                                    break;
                            }
                            i10 = i12;
                            switch (i10) {
                                case 0:
                                    String[] split = a.d.split(str2);
                                    ArrayList arrayList3 = new ArrayList(split.length);
                                    for (String str3 : split) {
                                        Objects.requireNonNull(str3);
                                        arrayList3.add(str3);
                                    }
                                    linkedHashSet.addAll(Collections.unmodifiableList(arrayList3));
                                    break;
                                case 1:
                                    try {
                                        iVar.f2289g = new android.support.v4.media.h(g7.b.c(str2));
                                        break;
                                    } catch (g7.c e) {
                                        throw new Exception(e);
                                    }
                                case 2:
                                    try {
                                        for (String str4 : a.d.split(str2)) {
                                            ((LinkedHashSet) iVar.f2287b).add(f.a(str4));
                                        }
                                        break;
                                    } catch (i e6) {
                                        throw new Exception(e6);
                                    }
                                case 3:
                                    try {
                                        String[] split2 = a.d.split(str2);
                                        int length = split2.length;
                                        for (int i15 = i11; i15 < length; i15++) {
                                            String str5 = split2[i15];
                                            try {
                                                ((LinkedHashSet) iVar.c).add(d.a(str5));
                                            } catch (i e10) {
                                                if (e10.f2379b == InetAddress.class && d.c.matcher(str5).matches()) {
                                                    ((LinkedHashSet) iVar.d).add(str5);
                                                } else {
                                                    throw e10;
                                                }
                                            }
                                        }
                                        break;
                                    } catch (i e11) {
                                        throw new Exception(e11);
                                    }
                                case 4:
                                    try {
                                        int parseInt = Integer.parseInt(str2);
                                        if (parseInt >= 0) {
                                            if (parseInt == 0) {
                                                of2 = Optional.empty();
                                            } else {
                                                of2 = Optional.of(Integer.valueOf(parseInt));
                                            }
                                            iVar.f2291i = of2;
                                            break;
                                        } else {
                                            String.valueOf(parseInt);
                                            throw new Exception((Throwable) null);
                                        }
                                    } catch (NumberFormatException e12) {
                                        throw new Exception(e12);
                                    }
                                case 5:
                                    String[] split3 = a.d.split(str2);
                                    ArrayList arrayList4 = new ArrayList(split3.length);
                                    int length2 = split3.length;
                                    for (int i16 = i11; i16 < length2; i16++) {
                                        String str6 = split3[i16];
                                        Objects.requireNonNull(str6);
                                        arrayList4.add(str6);
                                    }
                                    linkedHashSet2.addAll(Collections.unmodifiableList(arrayList4));
                                    break;
                                case 6:
                                    try {
                                        int parseInt2 = Integer.parseInt(str2);
                                        if (parseInt2 >= 0 && parseInt2 <= 65535) {
                                            if (parseInt2 == 0) {
                                                of = Optional.empty();
                                            } else {
                                                of = Optional.of(Integer.valueOf(parseInt2));
                                            }
                                            iVar.f2290h = of;
                                            break;
                                        } else {
                                            String.valueOf(parseInt2);
                                            throw new Exception((Throwable) null);
                                        }
                                    } catch (NumberFormatException e13) {
                                        throw new Exception(e13);
                                    }
                                default:
                                    throw new Exception((Throwable) null);
                            }
                            i13 = i14;
                            i11 = 0;
                            i12 = -1;
                        }
                        if (((android.support.v4.media.h) iVar.f2289g) != null) {
                            if (!linkedHashSet2.isEmpty() && !linkedHashSet.isEmpty()) {
                                throw new Exception((Throwable) null);
                            }
                            hVar.d = new h(iVar);
                            return new c(hVar);
                        }
                        throw new Exception((Throwable) null);
                    }
                    throw new Exception((Throwable) null);
                }
            }
            z9 = false;
            z10 = true;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f2362a.equals(cVar.f2362a) || !this.f2363b.equals(cVar.f2363b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f2363b.hashCode() + (this.f2362a.hashCode() * 31);
    }

    public final String toString() {
        return "(Config " + this.f2362a + " (" + this.f2363b.size() + " peers))";
    }
}
