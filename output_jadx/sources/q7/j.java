package q7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5326a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5327b;
    public String c;

    public j(ArrayList arrayList) {
        this.f5326a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = n.f5337a;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.f5327b = true;
            return null;
        }
        boolean equals = name.equals("protocols");
        ArrayList arrayList = this.f5326a;
        if (equals && objArr.length == 0) {
            return arrayList;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (arrayList.contains(list.get(i10))) {
                        String str = (String) list.get(i10);
                        this.c = str;
                        return str;
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.c = str2;
                return str2;
            }
        }
        if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
            this.c = (String) objArr[0];
            return null;
        }
        return method.invoke(this, objArr);
    }
}
