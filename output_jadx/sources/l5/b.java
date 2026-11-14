package l5;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements k5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3524a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3525b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f3524a = i10;
        this.f3525b = obj;
    }

    @Override // k5.b
    public final Object get() {
        switch (this.f3524a) {
            case 0:
                return new m5.c((o4.f) this.f3525b);
            case 1:
                String str = (String) this.f3525b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new RuntimeException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(ai.onnxruntime.a.m("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e6) {
                    throw new RuntimeException(ai.onnxruntime.a.m("Could not instantiate ", str, "."), e6);
                } catch (NoSuchMethodException e10) {
                    throw new RuntimeException(ai.onnxruntime.a.l("Could not instantiate ", str), e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException(ai.onnxruntime.a.l("Could not instantiate ", str), e11);
                }
            default:
                return (ComponentRegistrar) this.f3525b;
        }
    }
}
