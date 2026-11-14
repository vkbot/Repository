package com.sun.jna;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.IdentityHashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class WeakMemoryHolder {
    ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
    IdentityHashMap<Reference<Object>, Memory> backingMap = new IdentityHashMap<>();

    public synchronized void clean() {
        while (true) {
            Reference<? extends Object> poll = this.referenceQueue.poll();
            if (poll != null) {
                this.backingMap.remove(poll);
            }
        }
    }

    public synchronized void put(Object obj, Memory memory) {
        clean();
        this.backingMap.put(new WeakReference(obj, this.referenceQueue), memory);
    }
}
