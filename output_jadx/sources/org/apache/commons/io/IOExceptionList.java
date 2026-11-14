package org.apache.commons.io;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class IOExceptionList extends IOException implements Iterable<Throwable> {
    private static final long serialVersionUID = 1;
    private final List<? extends Throwable> causeList;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IOExceptionList(java.lang.String r2, java.util.List<? extends java.lang.Throwable> r3) {
        /*
            r1 = this;
            if (r2 == 0) goto L3
            goto L7
        L3:
            java.lang.String r2 = toMessage(r3)
        L7:
            boolean r0 = isEmpty(r3)
            if (r0 == 0) goto Lf
            r0 = 0
            goto L16
        Lf:
            r0 = 0
            java.lang.Object r0 = r3.get(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        L16:
            r1.<init>(r2, r0)
            if (r3 != 0) goto L1d
            java.util.List r3 = java.util.Collections.EMPTY_LIST
        L1d:
            r1.causeList = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.IOExceptionList.<init>(java.lang.String, java.util.List):void");
    }

    public static void checkEmpty(List<? extends Throwable> list, Object obj) {
        if (isEmpty(list)) {
        } else {
            throw new IOExceptionList(Objects.toString(obj, null), list);
        }
    }

    private static boolean isEmpty(List<? extends Throwable> list) {
        if (size(list) == 0) {
            return true;
        }
        return false;
    }

    private static int size(List<? extends Throwable> list) {
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    private static String toMessage(List<? extends Throwable> list) {
        return String.format("%,d exception(s): %s", Integer.valueOf(size(list)), list);
    }

    public <T extends Throwable> T getCause(int i10, Class<T> cls) {
        return cls.cast(getCause(i10));
    }

    public <T extends Throwable> List<T> getCauseList() {
        return new ArrayList(this.causeList);
    }

    @Override // java.lang.Iterable
    public Iterator<Throwable> iterator() {
        return getCauseList().iterator();
    }

    public <T extends Throwable> List<T> getCauseList(Class<T> cls) {
        return new ArrayList(this.causeList);
    }

    public <T extends Throwable> T getCause(int i10) {
        return (T) this.causeList.get(i10);
    }

    public IOExceptionList(List<? extends Throwable> list) {
        this(toMessage(list), list);
    }
}
