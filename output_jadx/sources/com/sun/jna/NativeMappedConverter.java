package com.sun.jna;

import ai.onnxruntime.a;
import j1.i;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class NativeMappedConverter implements TypeConverter {
    private static final Map<Class<?>, Reference<NativeMappedConverter>> converters = new WeakHashMap();
    private final NativeMapped instance;
    private final Class<?> nativeType;
    private final Class<?> type;

    public NativeMappedConverter(Class<?> cls) {
        if (NativeMapped.class.isAssignableFrom(cls)) {
            this.type = cls;
            NativeMapped defaultValue = defaultValue();
            this.instance = defaultValue;
            this.nativeType = defaultValue.nativeType();
            return;
        }
        i.k(a.j(NativeMapped.class, "Type must derive from "));
        throw null;
    }

    public static NativeMappedConverter getInstance(Class<?> cls) {
        NativeMappedConverter nativeMappedConverter;
        Map<Class<?>, Reference<NativeMappedConverter>> map = converters;
        synchronized (map) {
            try {
                Reference<NativeMappedConverter> reference = map.get(cls);
                if (reference != null) {
                    nativeMappedConverter = reference.get();
                } else {
                    nativeMappedConverter = null;
                }
                if (nativeMappedConverter == null) {
                    nativeMappedConverter = new NativeMappedConverter(cls);
                    map.put(cls, new SoftReference(nativeMappedConverter));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nativeMappedConverter;
    }

    public NativeMapped defaultValue() {
        boolean isEnum = this.type.isEnum();
        Class<?> cls = this.type;
        if (isEnum) {
            return (NativeMapped) cls.getEnumConstants()[0];
        }
        return (NativeMapped) Klass.newInstance(cls);
    }

    @Override // com.sun.jna.FromNativeConverter
    public Object fromNative(Object obj, FromNativeContext fromNativeContext) {
        return this.instance.fromNative(obj, fromNativeContext);
    }

    @Override // com.sun.jna.FromNativeConverter, com.sun.jna.ToNativeConverter
    public Class<?> nativeType() {
        return this.nativeType;
    }

    @Override // com.sun.jna.ToNativeConverter
    public Object toNative(Object obj, ToNativeContext toNativeContext) {
        if (obj == null) {
            if (Pointer.class.isAssignableFrom(this.nativeType)) {
                return null;
            }
            obj = defaultValue();
        }
        return ((NativeMapped) obj).toNative();
    }
}
