package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavArgument;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0007\u001a\u00020\u00112\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007J0\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J(\u0010\u0019\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J(\u0010\u001c\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u001d\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/navigation/NavInflater;", "", "context", "Landroid/content/Context;", "navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "(Landroid/content/Context;Landroidx/navigation/NavigatorProvider;)V", "inflate", "Landroidx/navigation/NavDestination;", "res", "Landroid/content/res/Resources;", "parser", "Landroid/content/res/XmlResourceParser;", "attrs", "Landroid/util/AttributeSet;", "graphResId", "", "Landroidx/navigation/NavGraph;", "inflateAction", "", "dest", "inflateArgument", "Landroidx/navigation/NavArgument;", "a", "Landroid/content/res/TypedArray;", "inflateArgumentForBundle", "bundle", "Landroid/os/Bundle;", "inflateArgumentForDestination", "inflateDeepLink", "Companion", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavInflater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavInflater.kt\nandroidx/navigation/NavInflater\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 4 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,365:1\n1#2:366\n232#3,3:367\n232#3,3:370\n232#3,3:373\n232#3,3:376\n55#4,6:379\n*S KotlinDebug\n*F\n+ 1 NavInflater.kt\nandroidx/navigation/NavInflater\n*L\n110#1:367,3\n128#1:370,3\n144#1:373,3\n261#1:376,3\n295#1:379,6\n*E\n"})
/* loaded from: classes.dex */
public final class NavInflater {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String APPLICATION_ID_PLACEHOLDER = "${applicationId}";
    private static final String TAG_ACTION = "action";
    private static final String TAG_ARGUMENT = "argument";
    private static final String TAG_DEEP_LINK = "deepLink";
    private static final String TAG_INCLUDE = "include";
    private final Context context;
    private final NavigatorProvider navigatorProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ThreadLocal<TypedValue> sTmpValue = new ThreadLocal<>();

    public NavInflater(Context context, NavigatorProvider navigatorProvider) {
        context.getClass();
        navigatorProvider.getClass();
        this.context = context;
        this.navigatorProvider = navigatorProvider;
    }

    private final NavDestination inflate(Resources res, XmlResourceParser parser, AttributeSet attrs, int graphResId) {
        int depth;
        NavigatorProvider navigatorProvider = this.navigatorProvider;
        String name = parser.getName();
        name.getClass();
        NavDestination createDestination = navigatorProvider.getNavigator(name).createDestination();
        createDestination.onInflate(this.context, attrs);
        int depth2 = parser.getDepth() + 1;
        while (true) {
            int next = parser.next();
            if (next == 1 || ((depth = parser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = parser.getName();
                if (Intrinsics.areEqual(TAG_ARGUMENT, name2)) {
                    inflateArgumentForDestination(res, createDestination, attrs, graphResId);
                } else if (Intrinsics.areEqual(TAG_DEEP_LINK, name2)) {
                    inflateDeepLink(res, createDestination, attrs);
                } else if (Intrinsics.areEqual(TAG_ACTION, name2)) {
                    inflateAction(res, createDestination, attrs, parser, graphResId);
                } else {
                    Resources resources = res;
                    XmlResourceParser xmlResourceParser = parser;
                    AttributeSet attributeSet = attrs;
                    int i10 = graphResId;
                    if (Intrinsics.areEqual(TAG_INCLUDE, name2) && (createDestination instanceof NavGraph)) {
                        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, R.styleable.NavInclude);
                        obtainAttributes.getClass();
                        ((NavGraph) createDestination).addDestination(inflate(obtainAttributes.getResourceId(R.styleable.NavInclude_graph, 0)));
                        Unit unit = Unit.INSTANCE;
                        obtainAttributes.recycle();
                    } else if (createDestination instanceof NavGraph) {
                        ((NavGraph) createDestination).addDestination(inflate(resources, xmlResourceParser, attributeSet, i10));
                    }
                    res = resources;
                    attrs = attributeSet;
                    parser = xmlResourceParser;
                    graphResId = i10;
                }
            }
        }
        return createDestination;
    }

    private final void inflateAction(Resources res, NavDestination dest, AttributeSet attrs, XmlResourceParser parser, int graphResId) {
        int depth;
        Context context = this.context;
        int[] iArr = androidx.navigation.common.R.styleable.NavAction;
        iArr.getClass();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, iArr, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_android_id, 0);
        NavAction navAction = new NavAction(obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_destination, 0), null, null, 6, null);
        NavOptions.Builder builder = new NavOptions.Builder();
        builder.setLaunchSingleTop(obtainStyledAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_launchSingleTop, false));
        builder.setRestoreState(obtainStyledAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_restoreState, false));
        builder.setPopUpTo(obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_popUpTo, -1), obtainStyledAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_popUpToInclusive, false), obtainStyledAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_popUpToSaveState, false));
        builder.setEnterAnim(obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_enterAnim, -1));
        builder.setExitAnim(obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_exitAnim, -1));
        builder.setPopEnterAnim(obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_popEnterAnim, -1));
        builder.setPopExitAnim(obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_popExitAnim, -1));
        navAction.setNavOptions(builder.build());
        Bundle bundle = new Bundle();
        int depth2 = parser.getDepth() + 1;
        while (true) {
            int next = parser.next();
            if (next == 1 || ((depth = parser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && Intrinsics.areEqual(TAG_ARGUMENT, parser.getName())) {
                inflateArgumentForBundle(res, bundle, attrs, graphResId);
            }
        }
        if (!bundle.isEmpty()) {
            navAction.setDefaultArguments(bundle);
        }
        dest.putAction(resourceId, navAction);
        obtainStyledAttributes.recycle();
    }

    private final NavArgument inflateArgument(TypedArray a10, Resources res, int graphResId) {
        NavType<Object> navType;
        NavArgument.Builder builder = new NavArgument.Builder();
        boolean z9 = false;
        int i10 = 0;
        builder.setIsNullable(a10.getBoolean(androidx.navigation.common.R.styleable.NavArgument_nullable, false));
        ThreadLocal<TypedValue> threadLocal = sTmpValue;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        String string = a10.getString(androidx.navigation.common.R.styleable.NavArgument_argType);
        Object obj = null;
        if (string != null) {
            navType = NavType.INSTANCE.fromArgType(string, res.getResourcePackageName(graphResId));
        } else {
            navType = null;
        }
        if (a10.getValue(androidx.navigation.common.R.styleable.NavArgument_android_defaultValue, typedValue2)) {
            NavType<Object> navType2 = NavType.ReferenceType;
            int i11 = typedValue2.resourceId;
            if (navType == navType2) {
                if (i11 != 0) {
                    i10 = i11;
                } else if (typedValue2.type != 16 || typedValue2.data != 0) {
                    StringBuilder sb = new StringBuilder("unsupported value '");
                    sb.append((Object) typedValue2.string);
                    String name = navType.getName();
                    sb.append("' for ");
                    sb.append(name);
                    sb.append(". Must be a reference to a resource.");
                    throw new XmlPullParserException(sb.toString());
                }
                obj = Integer.valueOf(i10);
            } else if (i11 != 0) {
                if (navType == null) {
                    obj = Integer.valueOf(i11);
                    navType = navType2;
                } else {
                    StringBuilder sb2 = new StringBuilder("unsupported value '");
                    sb2.append((Object) typedValue2.string);
                    String name2 = navType.getName();
                    String name3 = navType2.getName();
                    sb2.append("' for ");
                    sb2.append(name2);
                    sb2.append(". You must use a \"");
                    sb2.append(name3);
                    sb2.append("\" type to reference other resources.");
                    throw new XmlPullParserException(sb2.toString());
                }
            } else if (navType == NavType.StringType) {
                obj = a10.getString(androidx.navigation.common.R.styleable.NavArgument_android_defaultValue);
            } else {
                int i12 = typedValue2.type;
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            if (i12 != 18) {
                                if (i12 >= 16 && i12 <= 31) {
                                    NavType<Object> navType3 = NavType.FloatType;
                                    if (navType == navType3) {
                                        navType = INSTANCE.checkNavType$navigation_runtime_release(typedValue2, navType, navType3, string, TypedValues.Custom.S_FLOAT);
                                        obj = Float.valueOf(typedValue2.data);
                                    } else {
                                        navType = INSTANCE.checkNavType$navigation_runtime_release(typedValue2, navType, NavType.IntType, string, TypedValues.Custom.S_INT);
                                        obj = Integer.valueOf(typedValue2.data);
                                    }
                                } else {
                                    throw new XmlPullParserException("unsupported argument type " + typedValue2.type);
                                }
                            } else {
                                navType = INSTANCE.checkNavType$navigation_runtime_release(typedValue2, navType, NavType.BoolType, string, TypedValues.Custom.S_BOOLEAN);
                                if (typedValue2.data != 0) {
                                    z9 = true;
                                }
                                obj = Boolean.valueOf(z9);
                            }
                        } else {
                            navType = INSTANCE.checkNavType$navigation_runtime_release(typedValue2, navType, NavType.IntType, string, TypedValues.Custom.S_DIMENSION);
                            obj = Integer.valueOf((int) typedValue2.getDimension(res.getDisplayMetrics()));
                        }
                    } else {
                        navType = INSTANCE.checkNavType$navigation_runtime_release(typedValue2, navType, NavType.FloatType, string, TypedValues.Custom.S_FLOAT);
                        obj = Float.valueOf(typedValue2.getFloat());
                    }
                } else {
                    String obj2 = typedValue2.string.toString();
                    if (navType == null) {
                        navType = NavType.INSTANCE.inferFromValue(obj2);
                    }
                    obj = navType.parseValue(obj2);
                }
            }
        }
        if (obj != null) {
            builder.setDefaultValue(obj);
        }
        if (navType != null) {
            builder.setType(navType);
        }
        return builder.build();
    }

    private final void inflateArgumentForBundle(Resources res, Bundle bundle, AttributeSet attrs, int graphResId) {
        TypedArray obtainAttributes = res.obtainAttributes(attrs, androidx.navigation.common.R.styleable.NavArgument);
        obtainAttributes.getClass();
        String string = obtainAttributes.getString(androidx.navigation.common.R.styleable.NavArgument_android_name);
        if (string != null) {
            NavArgument inflateArgument = inflateArgument(obtainAttributes, res, graphResId);
            if (inflateArgument.getIsDefaultValuePresent()) {
                inflateArgument.putDefaultValue(string, bundle);
            }
            Unit unit = Unit.INSTANCE;
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    private final void inflateArgumentForDestination(Resources res, NavDestination dest, AttributeSet attrs, int graphResId) {
        TypedArray obtainAttributes = res.obtainAttributes(attrs, androidx.navigation.common.R.styleable.NavArgument);
        obtainAttributes.getClass();
        String string = obtainAttributes.getString(androidx.navigation.common.R.styleable.NavArgument_android_name);
        if (string != null) {
            dest.addArgument(string, inflateArgument(obtainAttributes, res, graphResId));
            Unit unit = Unit.INSTANCE;
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    private final void inflateDeepLink(Resources res, NavDestination dest, AttributeSet attrs) {
        String replace$default;
        String replace$default2;
        String replace$default3;
        TypedArray obtainAttributes = res.obtainAttributes(attrs, androidx.navigation.common.R.styleable.NavDeepLink);
        obtainAttributes.getClass();
        String string = obtainAttributes.getString(androidx.navigation.common.R.styleable.NavDeepLink_uri);
        String string2 = obtainAttributes.getString(androidx.navigation.common.R.styleable.NavDeepLink_action);
        String string3 = obtainAttributes.getString(androidx.navigation.common.R.styleable.NavDeepLink_mimeType);
        if ((string != null && string.length() != 0) || ((string2 != null && string2.length() != 0) || (string3 != null && string3.length() != 0))) {
            NavDeepLink.Builder builder = new NavDeepLink.Builder();
            if (string != null) {
                String packageName = this.context.getPackageName();
                packageName.getClass();
                replace$default3 = StringsKt__StringsJVMKt.replace$default(string, APPLICATION_ID_PLACEHOLDER, packageName, false, 4, (Object) null);
                builder.setUriPattern(replace$default3);
            }
            if (string2 != null && string2.length() != 0) {
                String packageName2 = this.context.getPackageName();
                packageName2.getClass();
                replace$default2 = StringsKt__StringsJVMKt.replace$default(string2, APPLICATION_ID_PLACEHOLDER, packageName2, false, 4, (Object) null);
                builder.setAction(replace$default2);
            }
            if (string3 != null) {
                String packageName3 = this.context.getPackageName();
                packageName3.getClass();
                replace$default = StringsKt__StringsJVMKt.replace$default(string3, APPLICATION_ID_PLACEHOLDER, packageName3, false, 4, (Object) null);
                builder.setMimeType(replace$default);
            }
            dest.addDeepLink(builder.build());
            Unit unit = Unit.INSTANCE;
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JE\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0013R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/navigation/NavInflater$Companion;", "", "()V", "APPLICATION_ID_PLACEHOLDER", "", "TAG_ACTION", "TAG_ARGUMENT", "TAG_DEEP_LINK", "TAG_INCLUDE", "sTmpValue", "Ljava/lang/ThreadLocal;", "Landroid/util/TypedValue;", "checkNavType", "Landroidx/navigation/NavType;", "value", "navType", "expectedNavType", "argType", "foundType", "checkNavType$navigation_runtime_release", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NavType<?> checkNavType$navigation_runtime_release(TypedValue value, NavType<?> navType, NavType<?> expectedNavType, String argType, String foundType) {
            value.getClass();
            expectedNavType.getClass();
            foundType.getClass();
            if (navType != null && navType != expectedNavType) {
                throw new XmlPullParserException("Type is " + argType + " but found " + foundType + ": " + value.data);
            }
            if (navType == null) {
                return expectedNavType;
            }
            return navType;
        }

        private Companion() {
        }
    }

    public final NavGraph inflate(@NavigationRes int graphResId) {
        int next;
        Resources resources = this.context.getResources();
        XmlResourceParser xml = resources.getXml(graphResId);
        xml.getClass();
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(graphResId) + " line " + xml.getLineNumber(), e);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            asAttributeSet.getClass();
            NavDestination inflate = inflate(resources, xml, asAttributeSet, graphResId);
            if (inflate instanceof NavGraph) {
                return (NavGraph) inflate;
            }
            throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
        }
        throw new XmlPullParserException("No start tag found");
    }
}
