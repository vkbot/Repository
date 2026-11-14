package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import b1.u;
import com.google.firebase.components.ComponentRegistrar;
import f5.b0;
import f6.d;
import java.util.Arrays;
import java.util.List;
import q4.a;
import t4.b;
import t4.h;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Keep
/* loaded from: classes.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ a lambda$getComponents$0(b bVar) {
        return new a((Context) bVar.b(Context.class), bVar.c(b0.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<t4.a> getComponents() {
        d a10 = t4.a.a(a.class);
        a10.f2346a = LIBRARY_NAME;
        a10.a(h.a(Context.class));
        a10.a(new h(0, 1, b0.class));
        a10.f2348f = new org.apache.commons.net.ftp.a(4);
        return Arrays.asList(a10.b(), u.d(LIBRARY_NAME, "21.1.1"));
    }
}
