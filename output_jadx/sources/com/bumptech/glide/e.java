package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.collection.ArrayMap;
import com.bumptech.glide.manager.t;
import j.r;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    public static final a f618k;

    /* renamed from: a, reason: collision with root package name */
    public final k.g f619a;

    /* renamed from: b, reason: collision with root package name */
    public final c0.h f620b;
    public final w7.c c;
    public final p2.e d;
    public final List e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayMap f621f;

    /* renamed from: g, reason: collision with root package name */
    public final r f622g;

    /* renamed from: h, reason: collision with root package name */
    public final r5.c f623h;

    /* renamed from: i, reason: collision with root package name */
    public final int f624i;

    /* renamed from: j, reason: collision with root package name */
    public y.e f625j;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bumptech.glide.a, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.f608b = a0.b.f3a;
        f618k = obj;
    }

    public e(Context context, k.g gVar, t tVar, w7.c cVar, p2.e eVar, ArrayMap arrayMap, List list, r rVar, r5.c cVar2) {
        super(context.getApplicationContext());
        this.f619a = gVar;
        this.c = cVar;
        this.d = eVar;
        this.e = list;
        this.f621f = arrayMap;
        this.f622g = rVar;
        this.f623h = cVar2;
        this.f624i = 4;
        this.f620b = new c0.h(tVar);
    }

    public final j a() {
        return (j) this.f620b.get();
    }
}
