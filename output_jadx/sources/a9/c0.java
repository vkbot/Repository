package a9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.Volatile;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f64a = AtomicIntegerFieldUpdater.newUpdater(c0.class, "_size");

    @Volatile
    private volatile int _size;
}
