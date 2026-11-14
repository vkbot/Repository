package c8;

import c3.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import m8.m;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c implements z7.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f579b;
    public volatile boolean c;
    public Object d;

    public /* synthetic */ c(int i10) {
        this.f579b = i10;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [c3.i, java.lang.Object] */
    public final boolean a(z7.a aVar) {
        switch (this.f579b) {
            case 0:
                if (!this.c) {
                    synchronized (this) {
                        try {
                            if (!this.c) {
                                LinkedList linkedList = (LinkedList) this.d;
                                if (linkedList == null) {
                                    linkedList = new LinkedList();
                                    this.d = linkedList;
                                }
                                linkedList.add(aVar);
                                return true;
                            }
                        } finally {
                        }
                    }
                }
                aVar.dispose();
                return false;
            default:
                if (!this.c) {
                    synchronized (this) {
                        try {
                            if (!this.c) {
                                i iVar = (i) this.d;
                                i iVar2 = iVar;
                                if (iVar == null) {
                                    ?? obj = new Object();
                                    int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                                    obj.f522a = numberOfLeadingZeros - 1;
                                    obj.c = (int) (0.75f * numberOfLeadingZeros);
                                    obj.d = new Object[numberOfLeadingZeros];
                                    this.d = obj;
                                    iVar2 = obj;
                                }
                                iVar2.a(aVar);
                                return true;
                            }
                        } finally {
                        }
                    }
                }
                aVar.dispose();
                return false;
        }
    }

    public final boolean b(z7.a aVar) {
        Object obj;
        switch (this.f579b) {
            case 0:
                boolean z9 = false;
                if (!this.c) {
                    synchronized (this) {
                        try {
                            if (!this.c) {
                                LinkedList linkedList = (LinkedList) this.d;
                                if (linkedList != null && linkedList.remove(aVar)) {
                                    z9 = true;
                                }
                            }
                        } finally {
                        }
                    }
                }
                return z9;
            default:
                if (this.c) {
                    return false;
                }
                synchronized (this) {
                    try {
                        if (this.c) {
                            return false;
                        }
                        i iVar = (i) this.d;
                        if (iVar != null) {
                            Object[] objArr = (Object[]) iVar.d;
                            int i10 = iVar.f522a;
                            int hashCode = aVar.hashCode() * (-1640531527);
                            int i11 = (hashCode ^ (hashCode >>> 16)) & i10;
                            Object obj2 = objArr[i11];
                            if (obj2 != null) {
                                if (obj2.equals(aVar)) {
                                    iVar.x(i11, i10, objArr);
                                    return true;
                                }
                                do {
                                    i11 = (i11 + 1) & i10;
                                    obj = objArr[i11];
                                    if (obj == null) {
                                    }
                                } while (!obj.equals(aVar));
                                iVar.x(i11, i10, objArr);
                                return true;
                            }
                        }
                        return false;
                    } finally {
                    }
                }
        }
    }

    public final boolean c(z7.a aVar) {
        switch (this.f579b) {
            case 0:
                if (b(aVar)) {
                    ((m) aVar).dispose();
                    return true;
                }
                return false;
            default:
                if (b(aVar)) {
                    aVar.dispose();
                    return true;
                }
                return false;
        }
    }

    @Override // z7.a
    public final void dispose() {
        switch (this.f579b) {
            case 0:
                if (!this.c) {
                    synchronized (this) {
                        try {
                            if (!this.c) {
                                this.c = true;
                                LinkedList linkedList = (LinkedList) this.d;
                                ArrayList arrayList = null;
                                this.d = null;
                                if (linkedList != null) {
                                    Iterator it = linkedList.iterator();
                                    while (it.hasNext()) {
                                        try {
                                            ((z7.a) it.next()).dispose();
                                        } catch (Throwable th) {
                                            com.bumptech.glide.d.v(th);
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(th);
                                        }
                                    }
                                    if (arrayList != null) {
                                        if (arrayList.size() == 1) {
                                            throw p8.d.c((Throwable) arrayList.get(0));
                                        }
                                        throw new a8.c(arrayList);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                if (!this.c) {
                    synchronized (this) {
                        try {
                            if (!this.c) {
                                this.c = true;
                                i iVar = (i) this.d;
                                ArrayList arrayList2 = null;
                                this.d = null;
                                if (iVar != null) {
                                    for (Object obj : (Object[]) iVar.d) {
                                        if (obj instanceof z7.a) {
                                            try {
                                                ((z7.a) obj).dispose();
                                            } catch (Throwable th2) {
                                                com.bumptech.glide.d.v(th2);
                                                if (arrayList2 == null) {
                                                    arrayList2 = new ArrayList();
                                                }
                                                arrayList2.add(th2);
                                            }
                                        }
                                    }
                                    if (arrayList2 != null) {
                                        if (arrayList2.size() == 1) {
                                            throw p8.d.c((Throwable) arrayList2.get(0));
                                        }
                                        throw new a8.c(arrayList2);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
        }
    }
}
