package org.apache.commons.net.ftp;

import n0.b;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class FTPFileFilters {
    public static final FTPFileFilter ALL = new b(29);
    public static final FTPFileFilter NON_NULL = new a(0);
    public static final FTPFileFilter DIRECTORIES = new a(1);

    @Deprecated
    public FTPFileFilters() {
    }

    public static /* synthetic */ boolean a(FTPFile fTPFile) {
        return lambda$static$0(fTPFile);
    }

    public static /* synthetic */ boolean lambda$static$0(FTPFile fTPFile) {
        return true;
    }

    public static /* synthetic */ boolean lambda$static$1(FTPFile fTPFile) {
        if (fTPFile != null && fTPFile.isDirectory()) {
            return true;
        }
        return false;
    }
}
