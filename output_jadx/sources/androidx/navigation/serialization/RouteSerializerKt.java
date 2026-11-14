package androidx.navigation.serialization;

import ai.onnxruntime.a;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavType;
import b1.u;
import com.bumptech.glide.d;
import e9.b;
import e9.e;
import g9.j;
import j1.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aE\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u0010\u001a\u00020\u0006\"\b\b\u0000\u0010\u0000*\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00040\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0015\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a5\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0004*\u00020\u00172\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001b\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u008e\u0001\u0010&\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00022S\u0010#\u001aO\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00130\u001dH\u0003¢\u0006\u0004\b$\u0010%\u001a\u0090\u0001\u0010&\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00040\u00022S\u0010#\u001aO\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00130\u001dH\u0003¢\u0006\u0004\b'\u0010%\u001a/\u0010+\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010,\u001a\u0013\u0010.\u001a\u00020-*\u00020\u0017H\u0000¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Le9/b;", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "typeMap", "", "path", "generateRoutePattern", "(Le9/b;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "", "Landroidx/navigation/NamedNavArgument;", "generateNavArguments", "(Le9/b;Ljava/util/Map;)Ljava/util/List;", "", "route", "generateRouteWithArgs", "(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/String;", "Lkotlin/Function0;", "", "handler", "assertNotAbstractClass", "(Le9/b;Lkotlin/jvm/functions/Function0;)V", "Lg9/e;", "computeNavType", "(Lg9/e;Ljava/util/Map;)Landroidx/navigation/NavType;", "", "generateHashCode", "(Le9/b;)I", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "index", "argName", "navType", "operation", "forEachIndexedKType", "(Le9/b;Ljava/util/Map;Lkotlin/jvm/functions/Function3;)V", "forEachIndexed", "forEachIndexedName", "fieldName", "fieldType", "className", "unknownNavTypeErrorMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "isValueClass", "(Lg9/e;)Z", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRouteSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteSerializer.kt\nandroidx/navigation/serialization/RouteSerializerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n1#2:226\n*E\n"})
/* loaded from: classes.dex */
public final class RouteSerializerKt {
    private static final <T> void assertNotAbstractClass(b bVar, Function0<Unit> function0) {
        if (bVar instanceof e) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavType<Object> computeNavType(g9.e eVar, Map<KType, ? extends NavType<?>> map) {
        Object obj;
        NavType<?> navType;
        Iterator<T> it = map.keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (NavTypeConverterKt.matchKType(eVar, (KType) obj)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        KType kType = (KType) obj;
        if (kType != null) {
            navType = map.get(kType);
        } else {
            navType = null;
        }
        if (navType == null) {
            navType = null;
        }
        if (navType == null) {
            navType = NavTypeConverterKt.getNavType(eVar);
        }
        if (Intrinsics.areEqual(navType, UNKNOWN.INSTANCE)) {
            return null;
        }
        navType.getClass();
        return navType;
    }

    @JvmName(name = "forEachIndexedKType")
    private static final <T> void forEachIndexedKType(b bVar, Map<KType, ? extends NavType<?>> map, Function3<? super Integer, ? super String, ? super NavType<Object>, Unit> function3) {
        int d = bVar.a().d();
        for (int i10 = 0; i10 < d; i10++) {
            String e = bVar.a().e(i10);
            NavType<Object> computeNavType = computeNavType(bVar.a().f(i10), map);
            if (computeNavType != null) {
                function3.invoke(Integer.valueOf(i10), e, computeNavType);
            } else {
                i.k(unknownNavTypeErrorMessage(e, bVar.a().f(i10).a(), bVar.a().a(), map.toString()));
                return;
            }
        }
    }

    public static /* synthetic */ void forEachIndexedKType$default(b bVar, Map map, Function3 function3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = MapsKt.emptyMap();
        }
        forEachIndexedKType(bVar, map, function3);
    }

    @JvmName(name = "forEachIndexedName")
    private static final <T> void forEachIndexedName(b bVar, Map<String, ? extends NavType<Object>> map, Function3<? super Integer, ? super String, ? super NavType<Object>, Unit> function3) {
        int d = bVar.a().d();
        for (int i10 = 0; i10 < d; i10++) {
            String e = bVar.a().e(i10);
            NavType<Object> navType = map.get(e);
            if (navType != null) {
                function3.invoke(Integer.valueOf(i10), e, navType);
            } else {
                throw new IllegalStateException(("Cannot locate NavType for argument [" + e + ']').toString());
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> int generateHashCode(b bVar) {
        bVar.getClass();
        int hashCode = bVar.a().a().hashCode();
        int d = bVar.a().d();
        for (int i10 = 0; i10 < d; i10++) {
            hashCode = (hashCode * 31) + bVar.a().e(i10).hashCode();
        }
        return hashCode;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> List<NamedNavArgument> generateNavArguments(final b bVar, final Map<KType, ? extends NavType<?>> map) {
        bVar.getClass();
        map.getClass();
        assertNotAbstractClass(bVar, new Function0<Unit>() { // from class: androidx.navigation.serialization.RouteSerializerKt$generateNavArguments$1
            {
                super(0);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                throw new IllegalArgumentException("Cannot generate NavArguments for polymorphic serializer " + b.this + ". Arguments can only be generated from concrete classes or objects.");
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
        int d = bVar.a().d();
        ArrayList arrayList = new ArrayList(d);
        for (final int i10 = 0; i10 < d; i10++) {
            final String e = bVar.a().e(i10);
            arrayList.add(NamedNavArgumentKt.navArgument(e, new Function1<NavArgumentBuilder, Unit>() { // from class: androidx.navigation.serialization.RouteSerializerKt$generateNavArguments$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(NavArgumentBuilder navArgumentBuilder) {
                    NavType<?> computeNavType;
                    String unknownNavTypeErrorMessage;
                    navArgumentBuilder.getClass();
                    g9.e f8 = b.this.a().f(i10);
                    boolean c = f8.c();
                    computeNavType = RouteSerializerKt.computeNavType(f8, map);
                    if (computeNavType == null) {
                        unknownNavTypeErrorMessage = RouteSerializerKt.unknownNavTypeErrorMessage(e, f8.a(), b.this.a().a(), map.toString());
                        i.k(unknownNavTypeErrorMessage);
                        return;
                    }
                    navArgumentBuilder.setType(computeNavType);
                    navArgumentBuilder.setNullable(c);
                    if (b.this.a().g(i10)) {
                        navArgumentBuilder.setUnknownDefaultValuePresent$navigation_common_release(true);
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NavArgumentBuilder navArgumentBuilder) {
                    invoke2(navArgumentBuilder);
                    return Unit.INSTANCE;
                }
            }));
        }
        return arrayList;
    }

    public static /* synthetic */ List generateNavArguments$default(b bVar, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = MapsKt.emptyMap();
        }
        return generateNavArguments(bVar, map);
    }

    public static final <T> String generateRoutePattern(final b bVar, Map<KType, ? extends NavType<?>> map, String str) {
        final RouteBuilder routeBuilder;
        bVar.getClass();
        map.getClass();
        assertNotAbstractClass(bVar, new Function0<Unit>() { // from class: androidx.navigation.serialization.RouteSerializerKt$generateRoutePattern$1
            {
                super(0);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String str2;
                StringBuilder sb = new StringBuilder("Cannot generate route pattern from polymorphic class ");
                KClass i10 = u.i(b.this.a());
                if (i10 != null) {
                    str2 = i10.getSimpleName();
                } else {
                    str2 = null;
                }
                throw new IllegalArgumentException(a.p(sb, str2, ". Routes can only be generated from concrete classes or objects."));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
        if (str != null) {
            routeBuilder = new RouteBuilder(str, bVar);
        } else {
            routeBuilder = new RouteBuilder(bVar);
        }
        forEachIndexedKType(bVar, map, new Function3<Integer, String, NavType<Object>, Unit>() { // from class: androidx.navigation.serialization.RouteSerializerKt$generateRoutePattern$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str2, NavType<Object> navType) {
                invoke(num.intValue(), str2, navType);
                return Unit.INSTANCE;
            }

            public final void invoke(int i10, String str2, NavType<Object> navType) {
                str2.getClass();
                navType.getClass();
                routeBuilder.appendPattern(i10, str2, navType);
            }
        });
        return routeBuilder.build();
    }

    public static /* synthetic */ String generateRoutePattern$default(b bVar, Map map, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = MapsKt.emptyMap();
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return generateRoutePattern(bVar, map, str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> String generateRouteWithArgs(T t, Map<String, ? extends NavType<Object>> map) {
        t.getClass();
        map.getClass();
        b s5 = d.s(Reflection.getOrCreateKotlinClass(t.getClass()));
        final Map<String, List<String>> encodeToArgMap = new RouteEncoder(s5, map).encodeToArgMap(t);
        final RouteBuilder routeBuilder = new RouteBuilder(s5);
        forEachIndexedName(s5, map, new Function3<Integer, String, NavType<Object>, Unit>() { // from class: androidx.navigation.serialization.RouteSerializerKt$generateRouteWithArgs$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            public final void invoke(int i10, String str, NavType<Object> navType) {
                str.getClass();
                navType.getClass();
                List<String> list = encodeToArgMap.get(str);
                list.getClass();
                routeBuilder.appendArg(i10, str, navType, list);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str, NavType<Object> navType) {
                invoke(num.intValue(), str, navType);
                return Unit.INSTANCE;
            }
        });
        return routeBuilder.build();
    }

    public static final boolean isValueClass(g9.e eVar) {
        eVar.getClass();
        if (Intrinsics.areEqual(eVar.getKind(), j.d) && eVar.isInline() && eVar.d() == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unknownNavTypeErrorMessage(String str, String str2, String str3, String str4) {
        return "Route " + str3 + " could not find any NavType for argument " + str + " of type " + str2 + " - typeMap received was " + str4;
    }
}
