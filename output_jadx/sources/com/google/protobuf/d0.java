package com.google.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class d0 extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public boolean f1549b;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.d0, java.io.IOException] */
    public static d0 a() {
        return new IOException("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, com.google.protobuf.c0] */
    public static c0 b() {
        return new IOException("Protocol message tag had invalid wire type.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.d0, java.io.IOException] */
    public static d0 c() {
        return new IOException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.d0, java.io.IOException] */
    public static d0 d() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.d0, java.io.IOException] */
    public static d0 e() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
