package org.apache.commons.io.channels;

import java.lang.reflect.Proxy;
import java.nio.channels.Channel;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class CloseShieldChannel {
    private static final Class<?>[] EMPTY = new Class[0];

    private CloseShieldChannel() {
    }

    private static Set<Class<?>> collectChannelInterfaces(Class<?> cls, Set<Class<?>> set) {
        while (cls != null) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (CloseShieldChannelHandler.isSupported(cls2) && set.add(cls2)) {
                    collectChannelInterfaces(cls2, set);
                }
            }
            cls = cls.getSuperclass();
        }
        return set;
    }

    public static <T extends Channel> T wrap(T t) {
        Class[] clsArr;
        Objects.requireNonNull(t, "channel");
        if (Proxy.isProxyClass(t.getClass()) && (Proxy.getInvocationHandler(t) instanceof CloseShieldChannelHandler)) {
            return t;
        }
        Set<Class<?>> collectChannelInterfaces = collectChannelInterfaces(t.getClass(), new LinkedHashSet());
        ClassLoader classLoader = t.getClass().getClassLoader();
        if (collectChannelInterfaces.isEmpty()) {
            clsArr = new Class[]{Channel.class};
        } else {
            clsArr = (Class[]) collectChannelInterfaces.toArray(EMPTY);
        }
        return (T) Proxy.newProxyInstance(classLoader, clsArr, new CloseShieldChannelHandler(t));
    }
}
