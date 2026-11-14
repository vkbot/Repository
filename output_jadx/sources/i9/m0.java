package i9;

import java.util.List;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class m0 implements KType {

    /* renamed from: b, reason: collision with root package name */
    public final KType f2920b;

    public m0(KType kType) {
        kType.getClass();
        this.f2920b = kType;
    }

    public final boolean equals(Object obj) {
        m0 m0Var;
        KType kType;
        KType kType2;
        if (obj == null) {
            return false;
        }
        KClassifier kClassifier = null;
        if (obj instanceof m0) {
            m0Var = (m0) obj;
        } else {
            m0Var = null;
        }
        if (m0Var != null) {
            kType = m0Var.f2920b;
        } else {
            kType = null;
        }
        KType kType3 = this.f2920b;
        if (!Intrinsics.areEqual(kType3, kType)) {
            return false;
        }
        KClassifier classifier = kType3.getClassifier();
        if (classifier instanceof KClass) {
            if (obj instanceof KType) {
                kType2 = (KType) obj;
            } else {
                kType2 = null;
            }
            if (kType2 != null) {
                kClassifier = kType2.getClassifier();
            }
            if (kClassifier != null && (kClassifier instanceof KClass)) {
                return Intrinsics.areEqual(JvmClassMappingKt.getJavaClass((KClass) classifier), JvmClassMappingKt.getJavaClass((KClass) kClassifier));
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        return this.f2920b.getAnnotations();
    }

    @Override // kotlin.reflect.KType
    public final List getArguments() {
        return this.f2920b.getArguments();
    }

    @Override // kotlin.reflect.KType
    public final KClassifier getClassifier() {
        return this.f2920b.getClassifier();
    }

    public final int hashCode() {
        return this.f2920b.hashCode();
    }

    @Override // kotlin.reflect.KType
    public final boolean isMarkedNullable() {
        return this.f2920b.isMarkedNullable();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f2920b;
    }
}
