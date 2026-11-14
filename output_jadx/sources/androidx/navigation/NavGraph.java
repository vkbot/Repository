package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NavDestination;
import androidx.navigation.serialization.RouteSerializerKt;
import j1.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010)\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000 `2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001`B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\u000b2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010 ¢\u0006\u0004\b\"\u0010#J!\u0010\"\u001a\u00020\u000b2\u0012\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010$\"\u00020\u0001¢\u0006\u0004\b\"\u0010%J\u0019\u0010(\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J9\u0010+\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010'\u001a\u00020&2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b+\u0010,J\u0019\u0010(\u001a\u0004\u0018\u00010\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b(\u0010-J\u001a\u0010(\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010.\u0018\u0001H\u0086\b¢\u0006\u0004\b(\u0010/J\u001f\u0010(\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010.2\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b(\u00100J!\u0010(\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u0010H\u0007¢\u0006\u0004\b(\u00102J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00020\u000103H\u0086\u0002¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u0000¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0001¢\u0006\u0004\b9\u0010\u001fJ\r\u0010:\u001a\u00020\u000b¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020&H\u0007¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020&¢\u0006\u0004\b?\u0010@J\u0015\u0010?\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u000e¢\u0006\u0004\b?\u0010BJ\u001c\u0010?\u001a\u00020\u000b\"\n\b\u0000\u0010.\u0018\u0001*\u00020CH\u0086\b¢\u0006\u0004\b?\u0010;J\u001f\u0010?\u001a\u00020\u000b\"\b\b\u0000\u0010.*\u00020C2\u0006\u0010A\u001a\u00028\u0000¢\u0006\u0004\b?\u0010DJ7\u0010?\u001a\u00020\u000b\"\u0004\b\u0000\u0010.2\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000E2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0GH\u0007¢\u0006\u0004\b?\u0010IJ\u000f\u0010J\u001a\u00020\u000eH\u0016¢\u0006\u0004\bJ\u0010KJ\u001a\u0010L\u001a\u00020\u00102\b\u00106\u001a\u0004\u0018\u00010CH\u0096\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020&H\u0016¢\u0006\u0004\bN\u0010=R\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010O8G¢\u0006\f\n\u0004\b!\u0010P\u001a\u0004\bQ\u0010RR\u0016\u0010>\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010SR\u0018\u0010T\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR.\u0010V\u001a\u0004\u0018\u00010\u000e2\b\u0010A\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010U\u001a\u0004\bW\u0010K\"\u0004\bX\u0010BR\u0014\u0010Z\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010KR$\u0010]\u001a\u00020&2\u0006\u0010>\u001a\u00020&8G@BX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010=\"\u0004\b\\\u0010@R\u0011\u0010_\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b^\u0010K¨\u0006a"}, d2 = {"Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavDestination;", "", "Landroidx/navigation/Navigator;", "navGraphNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "route", "", "searchChildren", "searchParent", "lastVisited", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchRouteComprehensive", "(Ljava/lang/String;ZZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "Landroidx/navigation/NavDeepLinkRequest;", "navDeepLinkRequest", "matchDeepLinkComprehensive", "(Landroidx/navigation/NavDeepLinkRequest;ZZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchDeepLink", "(Landroidx/navigation/NavDeepLinkRequest;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "node", "addDestination", "(Landroidx/navigation/NavDestination;)V", "", "nodes", "addDestinations", "(Ljava/util/Collection;)V", "", "([Landroidx/navigation/NavDestination;)V", "", "resId", "findNode", "(I)Landroidx/navigation/NavDestination;", "matchingDest", "findNodeComprehensive", "(ILandroidx/navigation/NavDestination;ZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;", "(Ljava/lang/String;)Landroidx/navigation/NavDestination;", ExifInterface.GPS_DIRECTION_TRUE, "()Landroidx/navigation/NavDestination;", "(Ljava/lang/Object;)Landroidx/navigation/NavDestination;", "searchParents", "(Ljava/lang/String;Z)Landroidx/navigation/NavDestination;", "", "iterator", "()Ljava/util/Iterator;", "other", "addAll", "(Landroidx/navigation/NavGraph;)V", "remove", "clear", "()V", "getStartDestination", "()I", "startDestId", "setStartDestination", "(I)V", "startDestRoute", "(Ljava/lang/String;)V", "", "(Ljava/lang/Object;)V", "Le9/b;", "serializer", "Lkotlin/Function1;", "parseRoute", "(Le9/b;Lkotlin/jvm/functions/Function1;)V", "toString", "()Ljava/lang/String;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Landroidx/collection/SparseArrayCompat;", "Landroidx/collection/SparseArrayCompat;", "getNodes", "()Landroidx/collection/SparseArrayCompat;", "I", "startDestIdName", "Ljava/lang/String;", "startDestinationRoute", "getStartDestinationRoute", "setStartDestinationRoute", "getDisplayName", "displayName", "getStartDestinationId", "setStartDestinationId", "startDestinationId", "getStartDestDisplayName", "startDestDisplayName", "Companion", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 SparseArray.kt\nandroidx/collection/SparseArrayKt\n*L\n1#1,677:1\n232#2,3:678\n1603#3,9:681\n1855#3:690\n1856#3:692\n1612#3:693\n1603#3,9:694\n1855#3:703\n1856#3:705\n1612#3:706\n1#4:691\n1#4:704\n1#4:707\n179#5,2:708\n1224#5,2:711\n22#6:710\n62#6,4:713\n*S KotlinDebug\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph\n*L\n61#1:678,3\n84#1:681,9\n84#1:690\n84#1:692\n84#1:693\n129#1:694,9\n129#1:703\n129#1:705\n129#1:706\n84#1:691\n129#1:704\n322#1:708,2\n561#1:711,2\n559#1:710\n566#1:713,4\n*E\n"})
/* loaded from: classes.dex */
public class NavGraph extends NavDestination implements Iterable<NavDestination>, KMappedMarker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SparseArrayCompat<NavDestination> nodes;
    private int startDestId;
    private String startDestIdName;
    private String startDestinationRoute;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraph(Navigator<? extends NavGraph> navigator) {
        super(navigator);
        navigator.getClass();
        this.nodes = new SparseArrayCompat<>(0, 1, null);
    }

    public static /* synthetic */ NavDestination findNodeComprehensive$default(NavGraph navGraph, int i10, NavDestination navDestination, boolean z9, NavDestination navDestination2, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 8) != 0) {
                navDestination2 = null;
            }
            return navGraph.findNodeComprehensive(i10, navDestination, z9, navDestination2);
        }
        b.g("Super calls with default arguments not supported in this target, function: findNodeComprehensive");
        return null;
    }

    @JvmStatic
    public static final NavDestination findStartDestination(NavGraph navGraph) {
        return INSTANCE.findStartDestination(navGraph);
    }

    private final void setStartDestinationId(int i10) {
        if (i10 != getId()) {
            if (this.startDestinationRoute != null) {
                setStartDestinationRoute(null);
            }
            this.startDestId = i10;
            this.startDestIdName = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i10 + " cannot use the same id as the graph " + this).toString());
    }

    private final void setStartDestinationRoute(String str) {
        int hashCode;
        if (str == null) {
            hashCode = 0;
        } else if (!Intrinsics.areEqual(str, getRoute())) {
            if (!StringsKt.isBlank(str)) {
                hashCode = NavDestination.INSTANCE.createRoute(str).hashCode();
            } else {
                i.k("Cannot have an empty start destination route");
                return;
            }
        } else {
            b.h("Start destination ", str, " cannot use the same route as the graph ", this);
            return;
        }
        this.startDestId = hashCode;
        this.startDestinationRoute = str;
    }

    public final void addAll(NavGraph other) {
        other.getClass();
        Iterator<NavDestination> it = other.iterator();
        while (it.hasNext()) {
            NavDestination next = it.next();
            it.remove();
            addDestination(next);
        }
    }

    public final void addDestination(NavDestination node) {
        node.getClass();
        int id = node.getId();
        String route = node.getRoute();
        if (id == 0 && route == null) {
            i.k("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
            return;
        }
        if (getRoute() != null && Intrinsics.areEqual(route, getRoute())) {
            b.h("Destination ", node, " cannot have the same route as graph ", this);
            return;
        }
        if (id != getId()) {
            NavDestination navDestination = this.nodes.get(id);
            if (navDestination == node) {
                return;
            }
            if (node.getParent() == null) {
                if (navDestination != null) {
                    navDestination.setParent(null);
                }
                node.setParent(this);
                this.nodes.put(node.getId(), node);
                return;
            }
            i.l("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            return;
        }
        b.h("Destination ", node, " cannot have the same id as graph ", this);
    }

    public final void addDestinations(Collection<? extends NavDestination> nodes) {
        nodes.getClass();
        for (NavDestination navDestination : nodes) {
            if (navDestination != null) {
                addDestination(navDestination);
            }
        }
    }

    public final void clear() {
        Iterator<NavDestination> it = iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    @Override // androidx.navigation.NavDestination
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof NavGraph) && super.equals(other)) {
            NavGraph navGraph = (NavGraph) other;
            if (this.nodes.size() == navGraph.nodes.size() && getStartDestId() == navGraph.getStartDestId()) {
                for (NavDestination navDestination : SequencesKt.asSequence(SparseArrayKt.valueIterator(this.nodes))) {
                    if (!Intrinsics.areEqual(navDestination, navGraph.nodes.get(navDestination.getId()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findNode(String route, boolean searchParents) {
        Object obj;
        boolean equals$default;
        route.getClass();
        Iterator it = SequencesKt.asSequence(SparseArrayKt.valueIterator(this.nodes)).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                NavDestination navDestination = (NavDestination) obj;
                equals$default = StringsKt__StringsJVMKt.equals$default(navDestination.getRoute(), route, false, 2, null);
                if (equals$default || navDestination.matchRoute(route) != null) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NavDestination navDestination2 = (NavDestination) obj;
        if (navDestination2 == null) {
            if (!searchParents || getParent() == null) {
                return null;
            }
            NavGraph parent = getParent();
            parent.getClass();
            return parent.findNode(route);
        }
        return navDestination2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findNodeComprehensive(@IdRes int resId, NavDestination lastVisited, boolean searchChildren, NavDestination matchingDest) {
        NavDestination navDestination;
        NavDestination navDestination2 = this.nodes.get(resId);
        if (matchingDest != null) {
            if (Intrinsics.areEqual(navDestination2, matchingDest) && Intrinsics.areEqual(navDestination2.getParent(), matchingDest.getParent())) {
                return navDestination2;
            }
            navDestination2 = null;
        } else if (navDestination2 != null) {
            return navDestination2;
        }
        if (searchChildren) {
            Iterator it = SequencesKt.asSequence(SparseArrayKt.valueIterator(this.nodes)).iterator();
            while (true) {
                if (it.hasNext()) {
                    NavDestination navDestination3 = (NavDestination) it.next();
                    if ((navDestination3 instanceof NavGraph) && !Intrinsics.areEqual(navDestination3, lastVisited)) {
                        navDestination = ((NavGraph) navDestination3).findNodeComprehensive(resId, this, true, matchingDest);
                    } else {
                        navDestination = null;
                    }
                    if (navDestination != null) {
                        navDestination2 = navDestination;
                        break;
                    }
                } else {
                    navDestination2 = null;
                    break;
                }
            }
        }
        if (navDestination2 == null) {
            if (getParent() == null || Intrinsics.areEqual(getParent(), lastVisited)) {
                return null;
            }
            NavGraph parent = getParent();
            parent.getClass();
            return parent.findNodeComprehensive(resId, this, searchChildren, matchingDest);
        }
        return navDestination2;
    }

    @Override // androidx.navigation.NavDestination
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String getDisplayName() {
        if (getId() != 0) {
            return super.getDisplayName();
        }
        return "the root navigation";
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final SparseArrayCompat<NavDestination> getNodes() {
        return this.nodes;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final String getStartDestDisplayName() {
        if (this.startDestIdName == null) {
            String str = this.startDestinationRoute;
            if (str == null) {
                str = String.valueOf(this.startDestId);
            }
            this.startDestIdName = str;
        }
        String str2 = this.startDestIdName;
        str2.getClass();
        return str2;
    }

    @Deprecated(message = "Use getStartDestinationId instead.", replaceWith = @ReplaceWith(expression = "startDestinationId", imports = {}))
    @IdRes
    public final int getStartDestination() {
        return getStartDestId();
    }

    @IdRes
    /* renamed from: getStartDestinationId, reason: from getter */
    public final int getStartDestId() {
        return this.startDestId;
    }

    public final String getStartDestinationRoute() {
        return this.startDestinationRoute;
    }

    @Override // androidx.navigation.NavDestination
    public int hashCode() {
        int startDestId = getStartDestId();
        SparseArrayCompat<NavDestination> sparseArrayCompat = this.nodes;
        int size = sparseArrayCompat.size();
        for (int i10 = 0; i10 < size; i10++) {
            startDestId = (((startDestId * 31) + sparseArrayCompat.keyAt(i10)) * 31) + sparseArrayCompat.valueAt(i10).hashCode();
        }
        return startDestId;
    }

    @Override // java.lang.Iterable
    public final Iterator<NavDestination> iterator() {
        return new NavGraph$iterator$1(this);
    }

    @Override // androidx.navigation.NavDestination
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDestination.DeepLinkMatch matchDeepLink(NavDeepLinkRequest navDeepLinkRequest) {
        navDeepLinkRequest.getClass();
        return matchDeepLinkComprehensive(navDeepLinkRequest, true, false, this);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination.DeepLinkMatch matchDeepLinkComprehensive(NavDeepLinkRequest navDeepLinkRequest, boolean searchChildren, boolean searchParent, NavDestination lastVisited) {
        NavDestination.DeepLinkMatch deepLinkMatch;
        Comparable maxOrNull;
        Comparable maxOrNull2;
        NavDestination.DeepLinkMatch deepLinkMatch2;
        navDeepLinkRequest.getClass();
        lastVisited.getClass();
        NavDestination.DeepLinkMatch matchDeepLink = super.matchDeepLink(navDeepLinkRequest);
        NavDestination.DeepLinkMatch deepLinkMatch3 = null;
        if (searchChildren) {
            ArrayList arrayList = new ArrayList();
            for (NavDestination navDestination : this) {
                if (!Intrinsics.areEqual(navDestination, lastVisited)) {
                    deepLinkMatch2 = navDestination.matchDeepLink(navDeepLinkRequest);
                } else {
                    deepLinkMatch2 = null;
                }
                if (deepLinkMatch2 != null) {
                    arrayList.add(deepLinkMatch2);
                }
            }
            maxOrNull2 = CollectionsKt___CollectionsKt.maxOrNull((Iterable<? extends Comparable>) ((Iterable) arrayList));
            deepLinkMatch = (NavDestination.DeepLinkMatch) maxOrNull2;
        } else {
            deepLinkMatch = null;
        }
        NavGraph parent = getParent();
        if (parent != null && searchParent && !Intrinsics.areEqual(parent, lastVisited)) {
            deepLinkMatch3 = parent.matchDeepLinkComprehensive(navDeepLinkRequest, searchChildren, true, this);
        }
        maxOrNull = CollectionsKt___CollectionsKt.maxOrNull((Iterable<? extends Comparable>) ((Iterable) CollectionsKt.listOfNotNull((Object[]) new NavDestination.DeepLinkMatch[]{matchDeepLink, deepLinkMatch, deepLinkMatch3})));
        return (NavDestination.DeepLinkMatch) maxOrNull;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination.DeepLinkMatch matchRouteComprehensive(String route, boolean searchChildren, boolean searchParent, NavDestination lastVisited) {
        NavDestination.DeepLinkMatch deepLinkMatch;
        Comparable maxOrNull;
        Comparable maxOrNull2;
        NavDestination.DeepLinkMatch matchRoute;
        route.getClass();
        lastVisited.getClass();
        NavDestination.DeepLinkMatch matchRoute2 = matchRoute(route);
        NavDestination.DeepLinkMatch deepLinkMatch2 = null;
        if (searchChildren) {
            ArrayList arrayList = new ArrayList();
            for (NavDestination navDestination : this) {
                if (Intrinsics.areEqual(navDestination, lastVisited)) {
                    matchRoute = null;
                } else if (navDestination instanceof NavGraph) {
                    matchRoute = ((NavGraph) navDestination).matchRouteComprehensive(route, true, false, this);
                } else {
                    matchRoute = navDestination.matchRoute(route);
                }
                if (matchRoute != null) {
                    arrayList.add(matchRoute);
                }
            }
            maxOrNull2 = CollectionsKt___CollectionsKt.maxOrNull((Iterable<? extends Comparable>) ((Iterable) arrayList));
            deepLinkMatch = (NavDestination.DeepLinkMatch) maxOrNull2;
        } else {
            deepLinkMatch = null;
        }
        NavGraph parent = getParent();
        if (parent != null && searchParent && !Intrinsics.areEqual(parent, lastVisited)) {
            deepLinkMatch2 = parent.matchRouteComprehensive(route, searchChildren, true, this);
        }
        maxOrNull = CollectionsKt___CollectionsKt.maxOrNull((Iterable<? extends Comparable>) ((Iterable) CollectionsKt.listOfNotNull((Object[]) new NavDestination.DeepLinkMatch[]{matchRoute2, deepLinkMatch, deepLinkMatch2})));
        return (NavDestination.DeepLinkMatch) maxOrNull;
    }

    @Override // androidx.navigation.NavDestination
    public void onInflate(Context context, AttributeSet attrs) {
        context.getClass();
        attrs.getClass();
        super.onInflate(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, androidx.navigation.common.R.styleable.NavGraphNavigator);
        obtainAttributes.getClass();
        setStartDestinationId(obtainAttributes.getResourceId(androidx.navigation.common.R.styleable.NavGraphNavigator_startDestination, 0));
        this.startDestIdName = NavDestination.INSTANCE.getDisplayName(context, this.startDestId);
        Unit unit = Unit.INSTANCE;
        obtainAttributes.recycle();
    }

    public final void remove(NavDestination node) {
        node.getClass();
        int indexOfKey = this.nodes.indexOfKey(node.getId());
        if (indexOfKey >= 0) {
            this.nodes.valueAt(indexOfKey).setParent(null);
            this.nodes.removeAt(indexOfKey);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final <T> void setStartDestination(e9.b serializer, Function1<? super NavDestination, String> parseRoute) {
        serializer.getClass();
        parseRoute.getClass();
        int generateHashCode = RouteSerializerKt.generateHashCode(serializer);
        NavDestination findNode = findNode(generateHashCode);
        if (findNode != null) {
            setStartDestinationRoute(parseRoute.invoke(findNode));
            this.startDestId = generateHashCode;
        } else {
            b.f(serializer.a().a(), "Cannot find startDestination ", " from NavGraph. Ensure the starting NavDestination was added with route from KClass.");
        }
    }

    @Override // androidx.navigation.NavDestination
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        NavDestination findNode = findNode(this.startDestinationRoute);
        if (findNode == null) {
            findNode = findNode(getStartDestId());
        }
        sb.append(" startDestination=");
        if (findNode == null) {
            String str = this.startDestinationRoute;
            if (str != null) {
                sb.append(str);
            } else {
                String str2 = this.startDestIdName;
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    sb.append("0x" + Integer.toHexString(this.startDestId));
                }
            }
        } else {
            sb.append("{");
            sb.append(findNode.toString());
            sb.append("}");
        }
        return sb.toString();
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0006H\u0007J\f\u0010\u0007\u001a\u00020\u0005*\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Landroidx/navigation/NavGraph$Companion;", "", "()V", "childHierarchy", "Lkotlin/sequences/Sequence;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/NavGraph;", "findStartDestination", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final Sequence<NavDestination> childHierarchy(NavGraph navGraph) {
            navGraph.getClass();
            return SequencesKt.generateSequence(navGraph, new Function1<NavDestination, NavDestination>() { // from class: androidx.navigation.NavGraph$Companion$childHierarchy$1
                @Override // kotlin.jvm.functions.Function1
                public final NavDestination invoke(NavDestination navDestination) {
                    navDestination.getClass();
                    if (navDestination instanceof NavGraph) {
                        NavGraph navGraph2 = (NavGraph) navDestination;
                        return navGraph2.findNode(navGraph2.getStartDestId());
                    }
                    return null;
                }
            });
        }

        @JvmStatic
        public final NavDestination findStartDestination(NavGraph navGraph) {
            navGraph.getClass();
            return (NavDestination) SequencesKt.last(childHierarchy(navGraph));
        }

        private Companion() {
        }
    }

    public final void addDestinations(NavDestination... nodes) {
        nodes.getClass();
        for (NavDestination navDestination : nodes) {
            addDestination(navDestination);
        }
    }

    public final void setStartDestination(String startDestRoute) {
        startDestRoute.getClass();
        setStartDestinationRoute(startDestRoute);
    }

    public final <T> void setStartDestination() {
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        throw null;
    }

    public final <T> void setStartDestination(final T startDestRoute) {
        startDestRoute.getClass();
        setStartDestination(com.bumptech.glide.d.s(Reflection.getOrCreateKotlinClass(startDestRoute.getClass())), new Function1<NavDestination, String>() { // from class: androidx.navigation.NavGraph$setStartDestination$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final String invoke(NavDestination navDestination) {
                navDestination.getClass();
                Map<String, NavArgument> arguments = navDestination.getArguments();
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(arguments.size()));
                Iterator<T> it = arguments.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), ((NavArgument) entry.getValue()).getType());
                }
                return RouteSerializerKt.generateRouteWithArgs(startDestRoute, linkedHashMap);
            }
        });
    }

    public final void setStartDestination(int startDestId) {
        setStartDestinationId(startDestId);
    }

    public final NavDestination findNode(String route) {
        if (route == null || StringsKt.isBlank(route)) {
            return null;
        }
        return findNode(route, true);
    }

    public final <T> NavDestination findNode() {
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        throw null;
    }

    public final <T> NavDestination findNode(T route) {
        if (route != null) {
            return findNode(RouteSerializerKt.generateHashCode(com.bumptech.glide.d.s(Reflection.getOrCreateKotlinClass(route.getClass()))));
        }
        return null;
    }

    public final NavDestination findNode(@IdRes int resId) {
        return findNodeComprehensive$default(this, resId, this, false, null, 8, null);
    }
}
