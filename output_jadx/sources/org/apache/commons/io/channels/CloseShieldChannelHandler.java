package org.apache.commons.io.channels;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.channels.ByteChannel;
import java.nio.channels.Channel;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.InterruptibleChannel;
import java.nio.channels.NetworkChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.apache.commons.io.d;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
final class CloseShieldChannelHandler implements InvocationHandler {
    private static final Set<Class<? extends Channel>> SUPPORTED_INTERFACES;
    private volatile boolean closed;
    private final Channel delegate;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(d.g());
        hashSet.add(ByteChannel.class);
        hashSet.add(Channel.class);
        hashSet.add(GatheringByteChannel.class);
        hashSet.add(InterruptibleChannel.class);
        hashSet.add(NetworkChannel.class);
        hashSet.add(ReadableByteChannel.class);
        hashSet.add(ScatteringByteChannel.class);
        hashSet.add(SeekableByteChannel.class);
        hashSet.add(WritableByteChannel.class);
        SUPPORTED_INTERFACES = Collections.unmodifiableSet(hashSet);
    }

    public CloseShieldChannelHandler(Channel channel) {
        Objects.requireNonNull(channel, "delegate");
        this.delegate = channel;
    }

    private Object invokeObjectMethod(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        name.getClass();
        char c = 65535;
        switch (name.hashCode()) {
            case -1776922004:
                if (name.equals("toString")) {
                    c = 0;
                    break;
                }
                break;
            case -1295482945:
                if (name.equals("equals")) {
                    c = 1;
                    break;
                }
                break;
            case 147696667:
                if (name.equals("hashCode")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "CloseShieldChannel(" + this.delegate + ")";
            case 1:
                Object obj2 = objArr[0];
                if (obj2 == null) {
                    return Boolean.FALSE;
                }
                if (obj == obj2) {
                    return Boolean.TRUE;
                }
                if (Proxy.isProxyClass(obj2.getClass())) {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(obj2);
                    if (invocationHandler instanceof CloseShieldChannelHandler) {
                        return Boolean.valueOf(Objects.equals(((CloseShieldChannelHandler) invocationHandler).delegate, this.delegate));
                    }
                }
                return Boolean.FALSE;
            case 2:
                return Integer.valueOf(Objects.hashCode(this.delegate));
            default:
                return null;
        }
    }

    private static boolean isAllowedAfterClose(Class<?> cls, String str, int i10) {
        if (i10 == 0 && str.equals("supportedOptions") && NetworkChannel.class.equals(cls)) {
            return true;
        }
        return false;
    }

    public static boolean isSupported(Class<?> cls) {
        return SUPPORTED_INTERFACES.contains(cls);
    }

    private static boolean returnsThis(Class<?> cls, String str, int i10) {
        if (SeekableByteChannel.class.equals(cls)) {
            if (i10 != 1 || (!str.equals("position") && !str.equals("truncate"))) {
                return false;
            }
            return true;
        }
        if (!NetworkChannel.class.equals(cls) || ((i10 != 1 || !str.equals("bind")) && (i10 != 2 || !str.equals("setOption")))) {
            return false;
        }
        return true;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        Class<?> declaringClass = method.getDeclaringClass();
        String name = method.getName();
        int length = method.getParameterTypes().length;
        if (declaringClass == Object.class) {
            return invokeObjectMethod(obj, method, objArr);
        }
        boolean z9 = true;
        if (length == 0 && name.equals("close")) {
            this.closed = true;
            return null;
        }
        if (length == 0 && name.equals("isOpen")) {
            if (this.closed || !this.delegate.isOpen()) {
                z9 = false;
            }
            return Boolean.valueOf(z9);
        }
        if (this.closed && !isAllowedAfterClose(declaringClass, name, length)) {
            throw new ClosedChannelException();
        }
        try {
            Object invoke = method.invoke(this.delegate, objArr);
            if (returnsThis(declaringClass, name, length)) {
                return obj;
            }
            return invoke;
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }
}
