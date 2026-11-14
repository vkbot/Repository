package androidx.navigation.serialization;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavType;
import androidx.navigation.b;
import androidx.navigation.serialization.InternalNavType;
import g9.e;
import j1.i;
import j9.a;
import j9.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lg9/e;", "Landroidx/navigation/NavType;", "getNavType", "(Lg9/e;)Landroidx/navigation/NavType;", "Landroidx/navigation/serialization/InternalType;", "toInternalType", "(Lg9/e;)Landroidx/navigation/serialization/InternalType;", "Ljava/lang/Class;", "getClass", "(Lg9/e;)Ljava/lang/Class;", "Lkotlin/reflect/KType;", "kType", "", "matchKType", "(Lg9/e;Lkotlin/reflect/KType;)Z", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class NavTypeConverterKt {

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InternalType.values().length];
            try {
                iArr[InternalType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InternalType.BOOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InternalType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InternalType.LONG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InternalType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InternalType.STRING_NULLABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InternalType.ENUM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[InternalType.INT_NULLABLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[InternalType.BOOL_NULLABLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[InternalType.DOUBLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[InternalType.DOUBLE_NULLABLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[InternalType.FLOAT_NULLABLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[InternalType.LONG_NULLABLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[InternalType.INT_ARRAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[InternalType.BOOL_ARRAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[InternalType.DOUBLE_ARRAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[InternalType.FLOAT_ARRAY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[InternalType.LONG_ARRAY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[InternalType.ARRAY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[InternalType.LIST.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[InternalType.ENUM_NULLABLE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final Class<?> getClass(e eVar) {
        String replace$default;
        boolean contains$default;
        replace$default = StringsKt__StringsJVMKt.replace$default(eVar.a(), "?", "", false, 4, (Object) null);
        try {
            return Class.forName(replace$default);
        } catch (ClassNotFoundException unused) {
            contains$default = StringsKt__StringsKt.contains$default(replace$default, (CharSequence) ".", false, 2, (Object) null);
            if (contains$default) {
                return Class.forName(new Regex("(\\.+)(?!.*\\.)").replace(replace$default, "\\$"));
            }
            b.x(eVar.a(), "Cannot find class with name \"", "\". Ensure that the serialName for this argument is the default fully qualified name");
            return null;
        }
    }

    public static final NavType<?> getNavType(e eVar) {
        eVar.getClass();
        InternalType internalType = toInternalType(eVar);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[internalType.ordinal()]) {
            case 1:
                return NavType.IntType;
            case 2:
                return NavType.BoolType;
            case 3:
                return NavType.FloatType;
            case 4:
                return NavType.LongType;
            case 5:
                return InternalNavType.INSTANCE.getStringNonNullableType();
            case 6:
                return NavType.StringType;
            case 7:
                NavType<?> parseSerializableOrParcelableType$navigation_common_release = NavType.INSTANCE.parseSerializableOrParcelableType$navigation_common_release(getClass(eVar), false);
                if (parseSerializableOrParcelableType$navigation_common_release == null) {
                    return UNKNOWN.INSTANCE;
                }
                return parseSerializableOrParcelableType$navigation_common_release;
            case 8:
                return InternalNavType.INSTANCE.getIntNullableType();
            case 9:
                return InternalNavType.INSTANCE.getBoolNullableType();
            case 10:
                return InternalNavType.INSTANCE.getDoubleType();
            case 11:
                return InternalNavType.INSTANCE.getDoubleNullableType();
            case 12:
                return InternalNavType.INSTANCE.getFloatNullableType();
            case 13:
                return InternalNavType.INSTANCE.getLongNullableType();
            case 14:
                return NavType.IntArrayType;
            case 15:
                return NavType.BoolArrayType;
            case 16:
                return InternalNavType.INSTANCE.getDoubleArrayType();
            case 17:
                return NavType.FloatArrayType;
            case 18:
                return NavType.LongArrayType;
            case 19:
                if (toInternalType(eVar.f(0)) == InternalType.STRING) {
                    return NavType.StringArrayType;
                }
                return UNKNOWN.INSTANCE;
            case 20:
                switch (iArr[toInternalType(eVar.f(0)).ordinal()]) {
                    case 1:
                        return NavType.IntListType;
                    case 2:
                        return NavType.BoolListType;
                    case 3:
                        return NavType.FloatListType;
                    case 4:
                        return NavType.LongListType;
                    case 5:
                        return NavType.StringListType;
                    case 6:
                        return InternalNavType.INSTANCE.getStringNullableListType();
                    case 7:
                        Class<?> cls = getClass(eVar.f(0));
                        cls.getClass();
                        return new InternalNavType.EnumListType(cls);
                    default:
                        return UNKNOWN.INSTANCE;
                }
            case 21:
                Class<?> cls2 = getClass(eVar);
                if (Enum.class.isAssignableFrom(cls2)) {
                    cls2.getClass();
                    return new InternalNavType.EnumNullableType(cls2);
                }
                return UNKNOWN.INSTANCE;
            default:
                return UNKNOWN.INSTANCE;
        }
    }

    public static final boolean matchKType(e eVar, KType kType) {
        eVar.getClass();
        kType.getClass();
        if (eVar.c() != kType.isMarkedNullable()) {
            return false;
        }
        a aVar = c.f3352a;
        aVar.getClass();
        e9.b A = o4.b.A(aVar, kType, false);
        if (A != null) {
            return Intrinsics.areEqual(eVar, A.a());
        }
        i.l("Custom serializers declared directly on a class field via @Serializable(with = ...) is currently not supported by safe args for both custom types and third-party types. Please use @Serializable or @Serializable(with = ...) on the class or object declaration.");
        return false;
    }

    private static final InternalType toInternalType(e eVar) {
        String replace$default;
        boolean startsWith$default;
        replace$default = StringsKt__StringsJVMKt.replace$default(eVar.a(), "?", "", false, 4, (Object) null);
        if (Intrinsics.areEqual(eVar.getKind(), g9.c.f2498f)) {
            if (eVar.c()) {
                return InternalType.ENUM_NULLABLE;
            }
            return InternalType.ENUM;
        }
        if (Intrinsics.areEqual(replace$default, "kotlin.Int")) {
            if (eVar.c()) {
                return InternalType.INT_NULLABLE;
            }
            return InternalType.INT;
        }
        if (Intrinsics.areEqual(replace$default, "kotlin.Boolean")) {
            if (eVar.c()) {
                return InternalType.BOOL_NULLABLE;
            }
            return InternalType.BOOL;
        }
        if (Intrinsics.areEqual(replace$default, "kotlin.Double")) {
            if (eVar.c()) {
                return InternalType.DOUBLE_NULLABLE;
            }
            return InternalType.DOUBLE;
        }
        if (Intrinsics.areEqual(replace$default, "kotlin.Double")) {
            return InternalType.DOUBLE;
        }
        if (Intrinsics.areEqual(replace$default, "kotlin.Float")) {
            if (eVar.c()) {
                return InternalType.FLOAT_NULLABLE;
            }
            return InternalType.FLOAT;
        }
        if (Intrinsics.areEqual(replace$default, "kotlin.Long")) {
            if (eVar.c()) {
                return InternalType.LONG_NULLABLE;
            }
            return InternalType.LONG;
        }
        if (Intrinsics.areEqual(replace$default, "kotlin.String")) {
            if (eVar.c()) {
                return InternalType.STRING_NULLABLE;
            }
            return InternalType.STRING;
        }
        if (Intrinsics.areEqual(replace$default, "kotlin.IntArray")) {
            return InternalType.INT_ARRAY;
        }
        if (Intrinsics.areEqual(replace$default, "kotlin.DoubleArray")) {
            return InternalType.DOUBLE_ARRAY;
        }
        if (Intrinsics.areEqual(replace$default, "kotlin.BooleanArray")) {
            return InternalType.BOOL_ARRAY;
        }
        if (Intrinsics.areEqual(replace$default, "kotlin.FloatArray")) {
            return InternalType.FLOAT_ARRAY;
        }
        if (Intrinsics.areEqual(replace$default, "kotlin.LongArray")) {
            return InternalType.LONG_ARRAY;
        }
        if (!Intrinsics.areEqual(replace$default, "kotlin.Array")) {
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(replace$default, "kotlin.collections.ArrayList", false, 2, null);
            if (startsWith$default) {
                return InternalType.LIST;
            }
            return InternalType.UNKNOWN;
        }
        return InternalType.ARRAY;
    }
}
