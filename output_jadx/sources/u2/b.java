package u2;

import android.os.IBinder;
import android.os.IInterface;
import j1.i;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b extends w2.b implements a {
    public final Object c;

    public b(Object obj) {
        super("u2.a");
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [u2.a, w2.a] */
    public static a c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("u2.a");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new w2.a(iBinder, "u2.a");
    }

    public static Object d(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).c;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 == 1) {
            r2.a.b(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e6) {
                    throw new IllegalArgumentException("Binder object is null.", e6);
                }
            }
            i.k("IObjectWrapper declared field not private!");
            return null;
        }
        i.k(ai.onnxruntime.a.e(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
        return null;
    }
}
