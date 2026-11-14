package com.sun.jna.ptr;

import com.sun.jna.Memory;
import com.sun.jna.Pointer;
import com.sun.jna.PointerType;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class ByReference extends PointerType {
    public ByReference(int i10) {
        setPointer(new Memory(i10));
    }

    @Override // com.sun.jna.PointerType
    public String toString() {
        try {
            Object invoke = getClass().getMethod("getValue", null).invoke(this, null);
            if (invoke == null) {
                return String.format("null@0x%x", Long.valueOf(Pointer.nativeValue(getPointer())));
            }
            return String.format("%s@0x%x=%s", invoke.getClass().getSimpleName(), Long.valueOf(Pointer.nativeValue(getPointer())), invoke);
        } catch (Exception e) {
            return "ByReference Contract violated - " + getClass().getName() + "#getValue raised exception: " + e.getMessage();
        }
    }
}
