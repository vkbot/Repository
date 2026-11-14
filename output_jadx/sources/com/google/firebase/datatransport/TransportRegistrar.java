package com.google.firebase.datatransport;

import a2.c;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import b1.u;
import b2.a;
import com.google.firebase.components.ComponentRegistrar;
import d2.s;
import f6.d;
import java.util.Arrays;
import java.util.List;
import t4.b;
import t4.h;
import t4.p;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ c lambda$getComponents$0(b bVar) {
        s.b((Context) bVar.b(Context.class));
        return s.a().c(a.f331f);
    }

    public static /* synthetic */ c lambda$getComponents$1(b bVar) {
        s.b((Context) bVar.b(Context.class));
        return s.a().c(a.f331f);
    }

    public static /* synthetic */ c lambda$getComponents$2(b bVar) {
        s.b((Context) bVar.b(Context.class));
        return s.a().c(a.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<t4.a> getComponents() {
        d a10 = t4.a.a(c.class);
        a10.f2346a = LIBRARY_NAME;
        a10.a(h.a(Context.class));
        a10.f2348f = new org.apache.commons.net.ftp.a(12);
        t4.a b10 = a10.b();
        d b11 = t4.a.b(new p(v4.a.class, c.class));
        b11.a(h.a(Context.class));
        b11.f2348f = new org.apache.commons.net.ftp.a(13);
        t4.a b12 = b11.b();
        d b13 = t4.a.b(new p(v4.b.class, c.class));
        b13.a(h.a(Context.class));
        b13.f2348f = new org.apache.commons.net.ftp.a(14);
        return Arrays.asList(b10, b12, b13.b(), u.d(LIBRARY_NAME, "18.2.0"));
    }
}
