package org.apache.commons.io;

import java.io.IOException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class IOIndexedException extends IOException {
    private static final long serialVersionUID = 1;
    private final int index;

    public IOIndexedException(int i10, Throwable th) {
        super(toMessage(i10, th), th);
        this.index = i10;
    }

    public static String toMessage(int i10, Throwable th) {
        String simpleName;
        String str = "Null";
        if (th == null) {
            simpleName = "Null";
        } else {
            simpleName = th.getClass().getSimpleName();
        }
        if (th != null) {
            str = th.getMessage();
        }
        return String.format("%s #%,d: %s", simpleName, Integer.valueOf(i10), str);
    }

    public int getIndex() {
        return this.index;
    }
}
