package p8;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements Callable, b8.c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f5113b;
    public static final /* synthetic */ a[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, p8.a] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f5113b = r02;
        c = new a[]{r02};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) c.clone();
    }

    @Override // b8.c
    public final Object apply(Object obj) {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new ArrayList();
    }
}
