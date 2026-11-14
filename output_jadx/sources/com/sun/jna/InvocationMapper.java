package com.sun.jna;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public interface InvocationMapper {
    InvocationHandler getInvocationHandler(NativeLibrary nativeLibrary, Method method);
}
