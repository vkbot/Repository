package i9;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import org.apache.commons.io.FilenameUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final g9.e[] f2879a = new g9.e[0];

    /* renamed from: b, reason: collision with root package name */
    public static final e9.b[] f2880b = new e9.b[0];
    public static final Object c = new Object();

    public static final h0 a(String str, e9.b bVar) {
        return new h0(str, new i0(bVar));
    }

    public static final Set b(g9.e eVar) {
        eVar.getClass();
        if (eVar instanceof l) {
            return ((l) eVar).b();
        }
        HashSet hashSet = new HashSet(eVar.d());
        int d = eVar.d();
        for (int i10 = 0; i10 < d; i10++) {
            hashSet.add(eVar.e(i10));
        }
        return hashSet;
    }

    public static final g9.e[] c(List list) {
        g9.e[] eVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        if (list != null && (eVarArr = (g9.e[]) list.toArray(new g9.e[0])) != null) {
            return eVarArr;
        }
        return f2879a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x012f, code lost:
    
        if (r13 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x00e9, code lost:
    
        if (r12 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e2, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0127, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c4 A[Catch: NoSuchFieldException -> 0x01c7, TRY_LEAVE, TryCatch #0 {NoSuchFieldException -> 0x01c7, blocks: (B:91:0x018b, B:93:0x0198, B:102:0x01b4, B:104:0x01ba, B:105:0x01c0, B:107:0x01c4, B:98:0x01ac), top: B:90:0x018b }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0141 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0198 A[Catch: NoSuchFieldException -> 0x01c7, TryCatch #0 {NoSuchFieldException -> 0x01c7, blocks: (B:91:0x018b, B:93:0x0198, B:102:0x01b4, B:104:0x01ba, B:105:0x01c0, B:107:0x01c4, B:98:0x01ac), top: B:90:0x018b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final e9.b d(kotlin.reflect.KClass r16, e9.b... r17) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.d1.d(kotlin.reflect.KClass, e9.b[]):e9.b");
    }

    public static final int e(g9.e eVar, g9.e[] eVarArr) {
        boolean z9;
        boolean z10;
        int i10;
        eVarArr.getClass();
        int hashCode = (eVar.a().hashCode() * 31) + Arrays.hashCode(eVarArr);
        int d = eVar.d();
        int i11 = 1;
        while (true) {
            int i12 = 0;
            if (d > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                break;
            }
            int i13 = d - 1;
            int i14 = i11 * 31;
            String a10 = eVar.f(eVar.d() - d).a();
            if (a10 != null) {
                i12 = a10.hashCode();
            }
            i11 = i14 + i12;
            d = i13;
        }
        int d10 = eVar.d();
        int i15 = 1;
        while (true) {
            if (d10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i16 = d10 - 1;
                int i17 = i15 * 31;
                com.bumptech.glide.d kind = eVar.f(eVar.d() - d10).getKind();
                if (kind != null) {
                    i10 = kind.hashCode();
                } else {
                    i10 = 0;
                }
                i15 = i17 + i10;
                d10 = i16;
            } else {
                return (((hashCode * 31) + i11) * 31) + i15;
            }
        }
    }

    public static final e9.b f(Object obj, e9.b... bVarArr) {
        Class[] clsArr;
        try {
            if (bVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = bVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i10 = 0; i10 < length; i10++) {
                    clsArr2[i10] = e9.b.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(bVarArr, bVarArr.length));
            if (invoke instanceof e9.b) {
                return (e9.b) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
            throw e;
        }
    }

    public static final KClass g(KType kType) {
        kType.getClass();
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KClass) {
            return (KClass) classifier;
        }
        if (!(classifier instanceof KTypeParameter)) {
            androidx.navigation.b.t(classifier, "Only KClass supported as classifier, got ");
            return null;
        }
        throw new IllegalArgumentException("Captured type parameter " + classifier + " from generic non-reified function. Such functionality cannot be supported because " + classifier + " is erased, either specify serializer explicitly or make calling function inline with reified " + classifier + FilenameUtils.EXTENSION_SEPARATOR);
    }

    public static final void h(KClass kClass) {
        kClass.getClass();
        String simpleName = kClass.getSimpleName();
        if (simpleName == null) {
            simpleName = "<local class name not available>";
        }
        throw new IllegalArgumentException(ai.onnxruntime.a.m("Serializer for class '", simpleName, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static final void i(String str, KClass kClass) {
        String str2;
        kClass.getClass();
        String str3 = "in the polymorphic scope of '" + kClass.getSimpleName() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + FilenameUtils.EXTENSION_SEPARATOR;
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + kClass.getSimpleName() + "' has to be sealed and '@Serializable'.";
        }
        throw new IllegalArgumentException(str2);
    }
}
