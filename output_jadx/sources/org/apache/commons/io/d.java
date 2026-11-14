package org.apache.commons.io;

import java.nio.channels.AsynchronousChannel;
import java.nio.file.FileStore;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class d {
    public static /* bridge */ /* synthetic */ Class g() {
        return AsynchronousChannel.class;
    }

    public static /* bridge */ /* synthetic */ FileStore i(Object obj) {
        return (FileStore) obj;
    }

    public static /* bridge */ /* synthetic */ StandardOpenOption k(Object obj) {
        return (StandardOpenOption) obj;
    }

    public static /* bridge */ /* synthetic */ FileTime l(Object obj) {
        return (FileTime) obj;
    }

    public static /* bridge */ /* synthetic */ UserPrincipal m(Object obj) {
        return (UserPrincipal) obj;
    }

    public static /* bridge */ /* synthetic */ boolean v(Object obj) {
        return obj instanceof StandardOpenOption;
    }
}
