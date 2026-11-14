package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NavDeepLink;
import androidx.navigation.serialization.RouteSerializerKt;
import j1.i;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 `2\u00020\u0001:\u0003_`aB\u0017\b\u0016\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\nJ\u000e\u00106\u001a\u0002032\u0006\u00107\u001a\u00020\u0014J\u000e\u00106\u001a\u0002032\u0006\u00108\u001a\u00020\u0006J\u0014\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010:H\u0007J\u0014\u0010<\u001a\u00020=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0000H\u0007J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u001a\u0010B\u001a\u0004\u0018\u00010\u00062\u0006\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010:J\u0012\u0010F\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u0018\u001a\u00020\u0019J\u0010\u0010G\u001a\u00020@2\u0006\u0010H\u001a\u00020IH\u0016J\u0010\u0010G\u001a\u00020@2\u0006\u0010J\u001a\u00020KH\u0016J.\u0010L\u001a\u00020@2\u0006\u0010H\u001a\u00020\u00142\b\u0010M\u001a\u0004\u0018\u00010I2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u000fH\u0002J\u001a\u0010N\u001a\u00020@2\u0006\u0010-\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010:H\u0007J\b\u0010O\u001a\u00020\u0019H\u0016J\u0012\u0010P\u001a\u0004\u0018\u00010Q2\u0006\u0010R\u001a\u00020KH\u0017J\u0012\u0010S\u001a\u0004\u0018\u00010Q2\u0006\u0010-\u001a\u00020\u0006H\u0007J\u0018\u0010T\u001a\u0002032\u0006\u0010C\u001a\u00020D2\u0006\u0010U\u001a\u00020VH\u0017J\u0018\u0010W\u001a\u0002032\b\b\u0001\u0010X\u001a\u00020\u00192\u0006\u0010Y\u001a\u00020\rJ\u001a\u0010W\u001a\u0002032\b\b\u0001\u0010X\u001a\u00020\u00192\b\b\u0001\u0010Z\u001a\u00020\u0019J\u0010\u0010[\u001a\u0002032\b\b\u0001\u0010X\u001a\u00020\u0019J\u000e\u0010\\\u001a\u0002032\u0006\u00104\u001a\u00020\u0006J\b\u0010]\u001a\u00020@H\u0017J\b\u0010^\u001a\u00020\u0006H\u0016R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u0018\u001a\u00020\u00198G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R(\u0010(\u001a\u0004\u0018\u00010'2\b\u0010&\u001a\u0004\u0018\u00010'@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R(\u0010-\u001a\u0004\u0018\u00010\u00062\b\u0010-\u001a\u0004\u0018\u00010\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u0010\u0007R\u0016\u00100\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006b"}, d2 = {"Landroidx/navigation/NavDestination;", "", "navigator", "Landroidx/navigation/Navigator;", "(Landroidx/navigation/Navigator;)V", "navigatorName", "", "(Ljava/lang/String;)V", "_arguments", "", "Landroidx/navigation/NavArgument;", "actions", "Landroidx/collection/SparseArrayCompat;", "Landroidx/navigation/NavAction;", "arguments", "", "getArguments", "()Ljava/util/Map;", "deepLinks", "", "Landroidx/navigation/NavDeepLink;", "displayName", "getDisplayName", "()Ljava/lang/String;", "id", "", "getId", "()I", "setId", "(I)V", "idName", "label", "", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "getNavigatorName", "<set-?>", "Landroidx/navigation/NavGraph;", "parent", "getParent", "()Landroidx/navigation/NavGraph;", "setParent", "(Landroidx/navigation/NavGraph;)V", "route", "getRoute", "setRoute", "routeDeepLink", "Lkotlin/Lazy;", "addArgument", "", "argumentName", "argument", "addDeepLink", "navDeepLink", "uriPattern", "addInDefaultArgs", "Landroid/os/Bundle;", "args", "buildDeepLinkIds", "", "previousDestination", "equals", "", "other", "fillInLabel", "context", "Landroid/content/Context;", "bundle", "getAction", "hasDeepLink", "deepLink", "Landroid/net/Uri;", "deepLinkRequest", "Landroidx/navigation/NavDeepLinkRequest;", "hasRequiredArguments", "uri", "hasRoute", "hashCode", "matchDeepLink", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "navDeepLinkRequest", "matchRoute", "onInflate", "attrs", "Landroid/util/AttributeSet;", "putAction", "actionId", "action", "destId", "removeAction", "removeArgument", "supportsActions", "toString", "ClassType", "Companion", "DeepLinkMatch", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Uri.kt\nandroidx/core/net/UriKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,862:1\n232#2,3:863\n1#3:866\n29#4:867\n1549#5:868\n1620#5,3:869\n1855#5,2:876\n1855#5,2:879\n1855#5,2:882\n1224#6,2:872\n1224#6,2:874\n32#7:878\n33#7:881\n*S KotlinDebug\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination\n*L\n188#1:863,3\n380#1:867\n482#1:868\n482#1:869,3\n725#1:876,2\n733#1:879,2\n737#1:882,2\n706#1:872,2\n710#1:874,2\n730#1:878\n730#1:881\n*E\n"})
/* loaded from: classes.dex */
public class NavDestination {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, Class<?>> classes = new LinkedHashMap();
    private Map<String, NavArgument> _arguments;
    private final SparseArrayCompat<NavAction> actions;
    private final List<NavDeepLink> deepLinks;
    private int id;
    private String idName;
    private CharSequence label;
    private final String navigatorName;
    private NavGraph parent;
    private String route;
    private Lazy<NavDeepLink> routeDeepLink;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\f\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003R\u0013\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/NavDestination$ClassType;", "", "value", "Lkotlin/reflect/KClass;", "()Ljava/lang/Class;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(AnnotationRetention.BINARY)
    /* loaded from: classes.dex */
    public @interface ClassType {
        Class<?> value();
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0011\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0000H\u0096\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/navigation/NavDestination$DeepLinkMatch;", "", "destination", "Landroidx/navigation/NavDestination;", "matchingArgs", "Landroid/os/Bundle;", "isExactDeepLink", "", "matchingPathSegments", "", "hasMatchingAction", "mimeTypeMatchLevel", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;ZIZI)V", "getDestination", "()Landroidx/navigation/NavDestination;", "getMatchingArgs", "()Landroid/os/Bundle;", "compareTo", "other", "hasMatchingArgs", "arguments", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @SourceDebugExtension({"SMAP\nNavDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,862:1\n1855#2,2:863\n*S KotlinDebug\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n*L\n128#1:863,2\n*E\n"})
    /* loaded from: classes.dex */
    public static final class DeepLinkMatch implements Comparable<DeepLinkMatch> {
        private final NavDestination destination;
        private final boolean hasMatchingAction;
        private final boolean isExactDeepLink;
        private final Bundle matchingArgs;
        private final int matchingPathSegments;
        private final int mimeTypeMatchLevel;

        public DeepLinkMatch(NavDestination navDestination, Bundle bundle, boolean z9, int i10, boolean z10, int i11) {
            navDestination.getClass();
            this.destination = navDestination;
            this.matchingArgs = bundle;
            this.isExactDeepLink = z9;
            this.matchingPathSegments = i10;
            this.hasMatchingAction = z10;
            this.mimeTypeMatchLevel = i11;
        }

        @Override // java.lang.Comparable
        public int compareTo(DeepLinkMatch other) {
            other.getClass();
            boolean z9 = this.isExactDeepLink;
            if (z9 && !other.isExactDeepLink) {
                return 1;
            }
            if (!z9 && other.isExactDeepLink) {
                return -1;
            }
            int i10 = this.matchingPathSegments - other.matchingPathSegments;
            if (i10 > 0) {
                return 1;
            }
            if (i10 < 0) {
                return -1;
            }
            Bundle bundle = this.matchingArgs;
            if (bundle != null && other.matchingArgs == null) {
                return 1;
            }
            if (bundle == null && other.matchingArgs != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = other.matchingArgs;
                bundle2.getClass();
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z10 = this.hasMatchingAction;
            if (z10 && !other.hasMatchingAction) {
                return 1;
            }
            if (!z10 && other.hasMatchingAction) {
                return -1;
            }
            return this.mimeTypeMatchLevel - other.mimeTypeMatchLevel;
        }

        public final NavDestination getDestination() {
            return this.destination;
        }

        public final Bundle getMatchingArgs() {
            return this.matchingArgs;
        }

        public final boolean hasMatchingArgs(Bundle arguments) {
            Bundle bundle;
            NavType<Object> navType;
            Object obj;
            if (arguments == null || (bundle = this.matchingArgs) == null) {
                return false;
            }
            Set<String> keySet = bundle.keySet();
            keySet.getClass();
            for (String str : keySet) {
                if (!arguments.containsKey(str)) {
                    return false;
                }
                NavArgument navArgument = (NavArgument) this.destination._arguments.get(str);
                Object obj2 = null;
                if (navArgument != null) {
                    navType = navArgument.getType();
                } else {
                    navType = null;
                }
                if (navType != null) {
                    Bundle bundle2 = this.matchingArgs;
                    str.getClass();
                    obj = navType.get(bundle2, str);
                } else {
                    obj = null;
                }
                if (navType != null) {
                    str.getClass();
                    obj2 = navType.get(arguments, str);
                }
                if (navType != null && !navType.valueEquals(obj, obj2)) {
                    return false;
                }
            }
            return true;
        }
    }

    public NavDestination(String str) {
        str.getClass();
        this.navigatorName = str;
        this.deepLinks = new ArrayList();
        this.actions = new SparseArrayCompat<>(0, 1, null);
        this._arguments = new LinkedHashMap();
    }

    public static /* synthetic */ int[] buildDeepLinkIds$default(NavDestination navDestination, NavDestination navDestination2, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                navDestination2 = null;
            }
            return navDestination.buildDeepLinkIds(navDestination2);
        }
        b.g("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        return null;
    }

    public static final Sequence<NavDestination> getHierarchy(NavDestination navDestination) {
        return INSTANCE.getHierarchy(navDestination);
    }

    private final boolean hasRequiredArguments(NavDeepLink deepLink, Uri uri, Map<String, NavArgument> arguments) {
        final Bundle matchingPathAndQueryArgs$navigation_common_release = deepLink.getMatchingPathAndQueryArgs$navigation_common_release(uri, arguments);
        return NavArgumentKt.missingRequiredArguments(arguments, new Function1<String, Boolean>() { // from class: androidx.navigation.NavDestination$hasRequiredArguments$missingRequiredArguments$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(String str) {
                str.getClass();
                return Boolean.valueOf(!matchingPathAndQueryArgs$navigation_common_release.containsKey(str));
            }
        }).isEmpty();
    }

    @JvmStatic
    public static final <C> Class<? extends C> parseClassFromName(Context context, String str, Class<? extends C> cls) {
        return INSTANCE.parseClassFromName(context, str, cls);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <C> Class<? extends C> parseClassFromNameInternal(Context context, String str, Class<? extends C> cls) {
        return INSTANCE.parseClassFromNameInternal(context, str, cls);
    }

    public final void addArgument(String argumentName, NavArgument argument) {
        argumentName.getClass();
        argument.getClass();
        this._arguments.put(argumentName, argument);
    }

    public final void addDeepLink(final NavDeepLink navDeepLink) {
        navDeepLink.getClass();
        List<String> missingRequiredArguments = NavArgumentKt.missingRequiredArguments(this._arguments, new Function1<String, Boolean>() { // from class: androidx.navigation.NavDestination$addDeepLink$missingRequiredArguments$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(String str) {
                str.getClass();
                return Boolean.valueOf(!NavDeepLink.this.getArgumentsNames$navigation_common_release().contains(str));
            }
        });
        if (missingRequiredArguments.isEmpty()) {
            this.deepLinks.add(navDeepLink);
        } else {
            b.j("Deep link ", navDeepLink.getUriPattern(), " can't be used to open destination ", this, ".\nFollowing required arguments are missing: ", missingRequiredArguments);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Bundle addInDefaultArgs(Bundle args) {
        if (args == null && this._arguments.isEmpty()) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, NavArgument> entry : this._arguments.entrySet()) {
            entry.getValue().putDefaultValue(entry.getKey(), bundle);
        }
        if (args != null) {
            bundle.putAll(args);
            for (Map.Entry<String, NavArgument> entry2 : this._arguments.entrySet()) {
                String key = entry2.getKey();
                NavArgument value = entry2.getValue();
                if (!value.getIsDefaultValueUnknown() && !value.verify(key, bundle)) {
                    b.l(ai.onnxruntime.a.x("Wrong argument type for '", key, "' in argument bundle. "), value.getType().getName(), " expected.");
                    return null;
                }
            }
        }
        return bundle;
    }

    @JvmOverloads
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int[] buildDeepLinkIds(NavDestination previousDestination) {
        NavGraph navGraph;
        int[] intArray;
        ArrayDeque arrayDeque = new ArrayDeque();
        NavDestination navDestination = this;
        while (true) {
            NavGraph navGraph2 = navDestination.parent;
            if (previousDestination != null) {
                navGraph = previousDestination.parent;
            } else {
                navGraph = null;
            }
            if (navGraph != null) {
                NavGraph navGraph3 = previousDestination.parent;
                navGraph3.getClass();
                if (navGraph3.findNode(navDestination.id) == navDestination) {
                    arrayDeque.addFirst(navDestination);
                    break;
                }
            }
            if (navGraph2 == null || navGraph2.getStartDestId() != navDestination.id) {
                arrayDeque.addFirst(navDestination);
            }
            if (Intrinsics.areEqual(navGraph2, previousDestination) || navGraph2 == null) {
                break;
            }
            navDestination = navGraph2;
        }
        List list = CollectionsKt.toList(arrayDeque);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((NavDestination) it.next()).id));
        }
        intArray = CollectionsKt___CollectionsKt.toIntArray(arrayList);
        return intArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto Lb8
            boolean r2 = r9 instanceof androidx.navigation.NavDestination
            if (r2 != 0) goto Ld
            goto Lb8
        Ld:
            java.util.List<androidx.navigation.NavDeepLink> r2 = r8.deepLinks
            androidx.navigation.NavDestination r9 = (androidx.navigation.NavDestination) r9
            java.util.List<androidx.navigation.NavDeepLink> r3 = r9.deepLinks
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r3 = r8.actions
            int r3 = r3.size()
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r4 = r9.actions
            int r4 = r4.size()
            if (r3 != r4) goto L58
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r3 = r8.actions
            kotlin.collections.IntIterator r3 = androidx.collection.SparseArrayKt.keyIterator(r3)
            kotlin.sequences.Sequence r3 = kotlin.sequences.SequencesKt.asSequence(r3)
            java.util.Iterator r3 = r3.iterator()
        L33:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L56
            java.lang.Object r4 = r3.next()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r5 = r8.actions
            java.lang.Object r5 = r5.get(r4)
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r6 = r9.actions
            java.lang.Object r4 = r6.get(r4)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r4)
            if (r4 != 0) goto L33
            goto L58
        L56:
            r3 = r0
            goto L59
        L58:
            r3 = r1
        L59:
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r4 = r8._arguments
            int r4 = r4.size()
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r5 = r9._arguments
            int r5 = r5.size()
            if (r4 != r5) goto La0
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r4 = r8._arguments
            kotlin.sequences.Sequence r4 = kotlin.collections.MapsKt.asSequence(r4)
            java.util.Iterator r4 = r4.iterator()
        L71:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L9e
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r6 = r9._arguments
            java.lang.Object r7 = r5.getKey()
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto La0
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r6 = r9._arguments
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r6 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r5)
            if (r5 == 0) goto La0
            goto L71
        L9e:
            r4 = r0
            goto La1
        La0:
            r4 = r1
        La1:
            int r5 = r8.id
            int r6 = r9.id
            if (r5 != r6) goto Lb8
            java.lang.String r5 = r8.route
            java.lang.String r9 = r9.route
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r9)
            if (r9 == 0) goto Lb8
            if (r2 == 0) goto Lb8
            if (r3 == 0) goto Lb8
            if (r4 == 0) goto Lb8
            return r0
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDestination.equals(java.lang.Object):boolean");
    }

    public final String fillInLabel(Context context, Bundle bundle) {
        NavType<Object> navType;
        NavArgument navArgument;
        context.getClass();
        CharSequence charSequence = this.label;
        if (charSequence == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (bundle != null && bundle.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, "");
                if (group != null && (navArgument = this._arguments.get(group)) != null) {
                    navType = navArgument.getType();
                } else {
                    navType = null;
                }
                NavType<Integer> navType2 = NavType.ReferenceType;
                if (Intrinsics.areEqual(navType, navType2)) {
                    group.getClass();
                    Integer num = navType2.get(bundle, group);
                    num.getClass();
                    String string = context.getString(num.intValue());
                    string.getClass();
                    stringBuffer.append(string);
                } else {
                    navType.getClass();
                    group.getClass();
                    stringBuffer.append(String.valueOf(navType.get(bundle, group)));
                }
            } else {
                throw new IllegalArgumentException("Could not find \"" + group + "\" in " + bundle + " to fill label \"" + ((Object) charSequence) + Typography.quote);
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public final NavAction getAction(@IdRes int id) {
        NavAction navAction;
        if (this.actions.getIsEmpty()) {
            navAction = null;
        } else {
            navAction = this.actions.get(id);
        }
        if (navAction == null) {
            NavGraph navGraph = this.parent;
            if (navGraph == null) {
                return null;
            }
            return navGraph.getAction(id);
        }
        return navAction;
    }

    public final Map<String, NavArgument> getArguments() {
        return MapsKt.toMap(this._arguments);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String getDisplayName() {
        String str = this.idName;
        if (str == null) {
            return String.valueOf(this.id);
        }
        return str;
    }

    @IdRes
    public final int getId() {
        return this.id;
    }

    public final CharSequence getLabel() {
        return this.label;
    }

    public final String getNavigatorName() {
        return this.navigatorName;
    }

    public final NavGraph getParent() {
        return this.parent;
    }

    public final String getRoute() {
        return this.route;
    }

    public boolean hasDeepLink(Uri deepLink) {
        deepLink.getClass();
        return hasDeepLink(new NavDeepLinkRequest(deepLink, null, null));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean hasRoute(String route, Bundle arguments) {
        NavDestination navDestination;
        route.getClass();
        if (Intrinsics.areEqual(this.route, route)) {
            return true;
        }
        DeepLinkMatch matchRoute = matchRoute(route);
        if (matchRoute != null) {
            navDestination = matchRoute.getDestination();
        } else {
            navDestination = null;
        }
        if (!Intrinsics.areEqual(this, navDestination)) {
            return false;
        }
        return matchRoute.hasMatchingArgs(arguments);
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        Set<String> keySet;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.id * 31;
        String str = this.route;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i18 = i17 + i10;
        for (NavDeepLink navDeepLink : this.deepLinks) {
            int i19 = i18 * 31;
            String uriPattern = navDeepLink.getUriPattern();
            if (uriPattern != null) {
                i14 = uriPattern.hashCode();
            } else {
                i14 = 0;
            }
            int i20 = (i19 + i14) * 31;
            String action = navDeepLink.getAction();
            if (action != null) {
                i15 = action.hashCode();
            } else {
                i15 = 0;
            }
            int i21 = (i20 + i15) * 31;
            String mimeType = navDeepLink.getMimeType();
            if (mimeType != null) {
                i16 = mimeType.hashCode();
            } else {
                i16 = 0;
            }
            i18 = i21 + i16;
        }
        Iterator valueIterator = SparseArrayKt.valueIterator(this.actions);
        while (valueIterator.hasNext()) {
            NavAction navAction = (NavAction) valueIterator.next();
            int destinationId = (navAction.getDestinationId() + (i18 * 31)) * 31;
            NavOptions navOptions = navAction.getNavOptions();
            if (navOptions != null) {
                i12 = navOptions.hashCode();
            } else {
                i12 = 0;
            }
            int i22 = destinationId + i12;
            Bundle defaultArguments = navAction.getDefaultArguments();
            if (defaultArguments != null && (keySet = defaultArguments.keySet()) != null) {
                for (String str2 : keySet) {
                    int i23 = i22 * 31;
                    Bundle defaultArguments2 = navAction.getDefaultArguments();
                    defaultArguments2.getClass();
                    Object obj = defaultArguments2.get(str2);
                    if (obj != null) {
                        i13 = obj.hashCode();
                    } else {
                        i13 = 0;
                    }
                    i22 = i23 + i13;
                }
            }
            i18 = i22;
        }
        for (String str3 : this._arguments.keySet()) {
            int hashCode = (str3.hashCode() + (i18 * 31)) * 31;
            NavArgument navArgument = this._arguments.get(str3);
            if (navArgument != null) {
                i11 = navArgument.hashCode();
            } else {
                i11 = 0;
            }
            i18 = i11 + hashCode;
        }
        return i18;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public DeepLinkMatch matchDeepLink(NavDeepLinkRequest navDeepLinkRequest) {
        Bundle bundle;
        boolean z9;
        int i10;
        navDeepLinkRequest.getClass();
        if (this.deepLinks.isEmpty()) {
            return null;
        }
        DeepLinkMatch deepLinkMatch = null;
        for (NavDeepLink navDeepLink : this.deepLinks) {
            Uri uri = navDeepLinkRequest.getUri();
            if (uri != null) {
                bundle = navDeepLink.getMatchingArguments(uri, this._arguments);
            } else {
                bundle = null;
            }
            int calculateMatchingPathSegments$navigation_common_release = navDeepLink.calculateMatchingPathSegments$navigation_common_release(uri);
            String action = navDeepLinkRequest.getAction();
            if (action != null && Intrinsics.areEqual(action, navDeepLink.getAction())) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z10 = z9;
            String mimeType = navDeepLinkRequest.getMimeType();
            if (mimeType != null) {
                i10 = navDeepLink.getMimeTypeMatchRating(mimeType);
            } else {
                i10 = -1;
            }
            if (bundle == null) {
                if (z10 || i10 > -1) {
                    if (hasRequiredArguments(navDeepLink, uri, this._arguments)) {
                    }
                }
            }
            DeepLinkMatch deepLinkMatch2 = new DeepLinkMatch(this, bundle, navDeepLink.getIsExactDeepLink(), calculateMatchingPathSegments$navigation_common_release, z10, i10);
            if (deepLinkMatch == null || deepLinkMatch2.compareTo(deepLinkMatch) > 0) {
                deepLinkMatch = deepLinkMatch2;
            }
        }
        return deepLinkMatch;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final DeepLinkMatch matchRoute(String route) {
        NavDeepLink value;
        route.getClass();
        Lazy<NavDeepLink> lazy = this.routeDeepLink;
        if (lazy == null || (value = lazy.getValue()) == null) {
            return null;
        }
        Uri parse = Uri.parse(INSTANCE.createRoute(route));
        parse.getClass();
        Bundle matchingArguments = value.getMatchingArguments(parse, this._arguments);
        if (matchingArguments == null) {
            return null;
        }
        return new DeepLinkMatch(this, matchingArguments, value.getIsExactDeepLink(), value.calculateMatchingPathSegments$navigation_common_release(parse), false, -1);
    }

    @CallSuper
    public void onInflate(Context context, AttributeSet attrs) {
        context.getClass();
        attrs.getClass();
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, androidx.navigation.common.R.styleable.Navigator);
        obtainAttributes.getClass();
        setRoute(obtainAttributes.getString(androidx.navigation.common.R.styleable.Navigator_route));
        if (obtainAttributes.hasValue(androidx.navigation.common.R.styleable.Navigator_android_id)) {
            setId(obtainAttributes.getResourceId(androidx.navigation.common.R.styleable.Navigator_android_id, 0));
            this.idName = INSTANCE.getDisplayName(context, this.id);
        }
        this.label = obtainAttributes.getText(androidx.navigation.common.R.styleable.Navigator_android_label);
        Unit unit = Unit.INSTANCE;
        obtainAttributes.recycle();
    }

    public final void putAction(@IdRes int actionId, NavAction action) {
        action.getClass();
        if (supportsActions()) {
            if (actionId != 0) {
                this.actions.put(actionId, action);
                return;
            } else {
                i.k("Cannot have an action with actionId 0");
                return;
            }
        }
        throw new UnsupportedOperationException("Cannot add action " + actionId + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    public final void removeAction(@IdRes int actionId) {
        this.actions.remove(actionId);
    }

    public final void removeArgument(String argumentName) {
        argumentName.getClass();
        this._arguments.remove(argumentName);
    }

    public final void setId(@IdRes int i10) {
        this.id = i10;
        this.idName = null;
    }

    public final void setLabel(CharSequence charSequence) {
        this.label = charSequence;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setParent(NavGraph navGraph) {
        this.parent = navGraph;
    }

    public final void setRoute(String str) {
        if (str == null) {
            setId(0);
        } else if (!StringsKt.isBlank(str)) {
            final String createRoute = INSTANCE.createRoute(str);
            final NavDeepLink build = new NavDeepLink.Builder().setUriPattern(createRoute).build();
            List<String> missingRequiredArguments = NavArgumentKt.missingRequiredArguments(this._arguments, new Function1<String, Boolean>() { // from class: androidx.navigation.NavDestination$route$missingRequiredArguments$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(String str2) {
                    str2.getClass();
                    return Boolean.valueOf(!NavDeepLink.this.getArgumentsNames$navigation_common_release().contains(str2));
                }
            });
            if (missingRequiredArguments.isEmpty()) {
                this.routeDeepLink = LazyKt.lazy(new Function0<NavDeepLink>() { // from class: androidx.navigation.NavDestination$route$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final NavDeepLink invoke() {
                        return new NavDeepLink.Builder().setUriPattern(createRoute).build();
                    }
                });
                setId(createRoute.hashCode());
            } else {
                b.j("Cannot set route \"", str, "\" for destination ", this, ". Following required arguments are missing: ", missingRequiredArguments);
                return;
            }
        } else {
            i.k("Cannot have an empty route");
            return;
        }
        this.route = str;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean supportsActions() {
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.idName;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.id));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.route;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            sb.append(" route=");
            sb.append(this.route);
        }
        if (this.label != null) {
            sb.append(" label=");
            sb.append(this.label);
        }
        return sb.toString();
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0007J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J:\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u00160\u0006\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00052\u0010\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u00160\u0006H\u0005J:\u0010\u0019\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u00160\u0006\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00052\u0010\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u00160\u0006H\u0007J\u0019\u0010\u001a\u001a\u00020\u001b\"\n\b\u0000\u0010\u001c\u0018\u0001*\u00020\u0001*\u00020\tH\u0087\bJ$\u0010\u001a\u001a\u00020\u001b\"\b\b\u0000\u0010\u001c*\u00020\u0001*\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u001dH\u0007R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, d2 = {"Landroidx/navigation/NavDestination$Companion;", "", "()V", "classes", "", "", "Ljava/lang/Class;", "hierarchy", "Lkotlin/sequences/Sequence;", "Landroidx/navigation/NavDestination;", "getHierarchy$annotations", "(Landroidx/navigation/NavDestination;)V", "getHierarchy", "(Landroidx/navigation/NavDestination;)Lkotlin/sequences/Sequence;", "createRoute", "route", "getDisplayName", "context", "Landroid/content/Context;", "id", "", "parseClassFromName", "C", "name", "expectedClassType", "parseClassFromNameInternal", "hasRoute", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final String createRoute(String route) {
            if (route != null) {
                return "android-app://androidx.navigation/".concat(route);
            }
            return "";
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final String getDisplayName(Context context, int id) {
            String valueOf;
            context.getClass();
            if (id <= 16777215) {
                return String.valueOf(id);
            }
            try {
                valueOf = context.getResources().getResourceName(id);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(id);
            }
            valueOf.getClass();
            return valueOf;
        }

        public final Sequence<NavDestination> getHierarchy(NavDestination navDestination) {
            navDestination.getClass();
            return SequencesKt.generateSequence(navDestination, new Function1<NavDestination, NavDestination>() { // from class: androidx.navigation.NavDestination$Companion$hierarchy$1
                @Override // kotlin.jvm.functions.Function1
                public final NavDestination invoke(NavDestination navDestination2) {
                    navDestination2.getClass();
                    return navDestination2.getParent();
                }
            });
        }

        @JvmStatic
        public final <T> boolean hasRoute(NavDestination navDestination, KClass<T> kClass) {
            navDestination.getClass();
            kClass.getClass();
            if (RouteSerializerKt.generateHashCode(com.bumptech.glide.d.s(kClass)) == navDestination.getId()) {
                return true;
            }
            return false;
        }

        @JvmStatic
        public final <C> Class<? extends C> parseClassFromName(Context context, String name, Class<? extends C> expectedClassType) {
            String str;
            context.getClass();
            name.getClass();
            expectedClassType.getClass();
            if (name.charAt(0) == '.') {
                str = context.getPackageName() + name;
            } else {
                str = name;
            }
            Class<? extends C> cls = (Class) NavDestination.classes.get(str);
            if (cls == null) {
                try {
                    cls = (Class<? extends C>) Class.forName(str, true, context.getClassLoader());
                    NavDestination.classes.put(name, cls);
                } catch (ClassNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            }
            cls.getClass();
            if (expectedClassType.isAssignableFrom(cls)) {
                return cls;
            }
            throw new IllegalArgumentException((str + " must be a subclass of " + expectedClassType).toString());
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final <C> Class<? extends C> parseClassFromNameInternal(Context context, String name, Class<? extends C> expectedClassType) {
            context.getClass();
            name.getClass();
            expectedClassType.getClass();
            return NavDestination.parseClassFromName(context, name, expectedClassType);
        }

        private Companion() {
        }

        @JvmStatic
        public static /* synthetic */ void getHierarchy$annotations(NavDestination navDestination) {
        }

        @JvmStatic
        public final /* synthetic */ <T> boolean hasRoute(NavDestination navDestination) {
            navDestination.getClass();
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return hasRoute(navDestination, Reflection.getOrCreateKotlinClass(Object.class));
        }
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String getDisplayName(Context context, int i10) {
        return INSTANCE.getDisplayName(context, i10);
    }

    public boolean hasDeepLink(NavDeepLinkRequest deepLinkRequest) {
        deepLinkRequest.getClass();
        return matchDeepLink(deepLinkRequest) != null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavDestination(Navigator<? extends NavDestination> navigator) {
        this(NavigatorProvider.INSTANCE.getNameForNavigator$navigation_common_release(navigator.getClass()));
        navigator.getClass();
    }

    @JvmStatic
    public static final <T> boolean hasRoute(NavDestination navDestination, KClass<T> kClass) {
        return INSTANCE.hasRoute(navDestination, kClass);
    }

    public final void addDeepLink(String uriPattern) {
        uriPattern.getClass();
        addDeepLink(new NavDeepLink.Builder().setUriPattern(uriPattern).build());
    }

    public final void putAction(@IdRes int actionId, @IdRes int destId) {
        putAction(actionId, new NavAction(destId, null, null, 6, null));
    }

    @JvmOverloads
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int[] buildDeepLinkIds() {
        return buildDeepLinkIds$default(this, null, 1, null);
    }
}
