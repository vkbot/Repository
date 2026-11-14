package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010\u0010\u001a\u0012\u0012\u0002\b\u0003 \u0012*\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u0017\u001a\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0019H\u0002J \u0010\u001a\u001a\u0012\u0012\u0002\b\u0003 \u0012*\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010\u001b\u001a\u0012\u0012\u0002\b\u0003 \u0012*\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010\u001c\u001a\u0012\u0012\u0002\b\u0003 \u0012*\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u001d\u001a\u00020\n*\u00020\u000b2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002J\u0018\u0010\u001d\u001a\u00020\n*\u00020\u000b2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001fH\u0002R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u00020\n*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\f¨\u0006 "}, d2 = {"Landroidx/window/layout/SafeWindowLayoutComponentProvider;", "", "()V", "windowLayoutComponent", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "getWindowLayoutComponent", "()Landroidx/window/extensions/layout/WindowLayoutComponent;", "windowLayoutComponent$delegate", "Lkotlin/Lazy;", "isPublic", "", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)Z", "canUseWindowLayoutComponent", "classLoader", "Ljava/lang/ClassLoader;", "foldingFeatureClass", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "isFoldingFeatureValid", "isWindowExtensionsValid", "isWindowLayoutComponentValid", "isWindowLayoutProviderValid", "validate", "block", "Lkotlin/Function0;", "windowExtensionsClass", "windowExtensionsProviderClass", "windowLayoutComponentClass", "doesReturn", "clazz", "Lkotlin/reflect/KClass;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SafeWindowLayoutComponentProvider {
    public static final SafeWindowLayoutComponentProvider INSTANCE = new SafeWindowLayoutComponentProvider();

    /* renamed from: windowLayoutComponent$delegate, reason: from kotlin metadata */
    private static final Lazy windowLayoutComponent = LazyKt.lazy(new Function0<WindowLayoutComponent>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$windowLayoutComponent$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final WindowLayoutComponent invoke() {
            boolean canUseWindowLayoutComponent;
            ClassLoader classLoader = SafeWindowLayoutComponentProvider.class.getClassLoader();
            if (classLoader != null) {
                canUseWindowLayoutComponent = SafeWindowLayoutComponentProvider.INSTANCE.canUseWindowLayoutComponent(classLoader);
                if (canUseWindowLayoutComponent) {
                    try {
                        return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                    } catch (UnsupportedOperationException unused) {
                        return null;
                    }
                }
            }
            return null;
        }
    });

    private SafeWindowLayoutComponentProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canUseWindowLayoutComponent(ClassLoader classLoader) {
        if (isWindowLayoutProviderValid(classLoader) && isWindowExtensionsValid(classLoader) && isWindowLayoutComponentValid(classLoader) && isFoldingFeatureValid(classLoader)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean doesReturn(Method method, KClass<?> kClass) {
        return doesReturn(method, JvmClassMappingKt.getJavaClass((KClass) kClass));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> foldingFeatureClass(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    private final boolean isFoldingFeatureValid(final ClassLoader classLoader) {
        return validate(new Function0<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                Class foldingFeatureClass;
                boolean doesReturn;
                boolean z9;
                boolean isPublic;
                boolean doesReturn2;
                boolean isPublic2;
                boolean doesReturn3;
                boolean isPublic3;
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
                foldingFeatureClass = safeWindowLayoutComponentProvider.foldingFeatureClass(classLoader);
                Method method = foldingFeatureClass.getMethod("getBounds", null);
                Method method2 = foldingFeatureClass.getMethod("getType", null);
                Method method3 = foldingFeatureClass.getMethod("getState", null);
                method.getClass();
                doesReturn = safeWindowLayoutComponentProvider.doesReturn(method, (KClass<?>) Reflection.getOrCreateKotlinClass(Rect.class));
                if (doesReturn) {
                    isPublic = safeWindowLayoutComponentProvider.isPublic(method);
                    if (isPublic) {
                        method2.getClass();
                        Class cls = Integer.TYPE;
                        doesReturn2 = safeWindowLayoutComponentProvider.doesReturn(method2, (KClass<?>) Reflection.getOrCreateKotlinClass(cls));
                        if (doesReturn2) {
                            isPublic2 = safeWindowLayoutComponentProvider.isPublic(method2);
                            if (isPublic2) {
                                method3.getClass();
                                doesReturn3 = safeWindowLayoutComponentProvider.doesReturn(method3, (KClass<?>) Reflection.getOrCreateKotlinClass(cls));
                                if (doesReturn3) {
                                    isPublic3 = safeWindowLayoutComponentProvider.isPublic(method3);
                                    if (isPublic3) {
                                        z9 = true;
                                        return Boolean.valueOf(z9);
                                    }
                                }
                            }
                        }
                    }
                }
                z9 = false;
                return Boolean.valueOf(z9);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPublic(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    private final boolean isWindowExtensionsValid(final ClassLoader classLoader) {
        return validate(new Function0<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                Class windowExtensionsClass;
                Class windowLayoutComponentClass;
                boolean isPublic;
                boolean z9;
                boolean doesReturn;
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
                windowExtensionsClass = safeWindowLayoutComponentProvider.windowExtensionsClass(classLoader);
                Method method = windowExtensionsClass.getMethod("getWindowLayoutComponent", null);
                windowLayoutComponentClass = safeWindowLayoutComponentProvider.windowLayoutComponentClass(classLoader);
                method.getClass();
                isPublic = safeWindowLayoutComponentProvider.isPublic(method);
                if (isPublic) {
                    windowLayoutComponentClass.getClass();
                    doesReturn = safeWindowLayoutComponentProvider.doesReturn(method, (Class<?>) windowLayoutComponentClass);
                    if (doesReturn) {
                        z9 = true;
                        return Boolean.valueOf(z9);
                    }
                }
                z9 = false;
                return Boolean.valueOf(z9);
            }
        });
    }

    @RequiresApi(24)
    private final boolean isWindowLayoutComponentValid(final ClassLoader classLoader) {
        return validate(new Function0<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowLayoutComponentValid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                Class windowLayoutComponentClass;
                boolean isPublic;
                boolean z9;
                boolean isPublic2;
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
                windowLayoutComponentClass = safeWindowLayoutComponentProvider.windowLayoutComponentClass(classLoader);
                Method method = windowLayoutComponentClass.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
                Method method2 = windowLayoutComponentClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                method.getClass();
                isPublic = safeWindowLayoutComponentProvider.isPublic(method);
                if (isPublic) {
                    method2.getClass();
                    isPublic2 = safeWindowLayoutComponentProvider.isPublic(method2);
                    if (isPublic2) {
                        z9 = true;
                        return Boolean.valueOf(z9);
                    }
                }
                z9 = false;
                return Boolean.valueOf(z9);
            }
        });
    }

    private final boolean isWindowLayoutProviderValid(final ClassLoader classLoader) {
        return validate(new Function0<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                Class windowExtensionsProviderClass;
                Class windowExtensionsClass;
                boolean doesReturn;
                boolean z9;
                boolean isPublic;
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
                windowExtensionsProviderClass = safeWindowLayoutComponentProvider.windowExtensionsProviderClass(classLoader);
                Method declaredMethod = windowExtensionsProviderClass.getDeclaredMethod("getWindowExtensions", null);
                windowExtensionsClass = safeWindowLayoutComponentProvider.windowExtensionsClass(classLoader);
                declaredMethod.getClass();
                windowExtensionsClass.getClass();
                doesReturn = safeWindowLayoutComponentProvider.doesReturn(declaredMethod, (Class<?>) windowExtensionsClass);
                if (doesReturn) {
                    isPublic = safeWindowLayoutComponentProvider.isPublic(declaredMethod);
                    if (isPublic) {
                        z9 = true;
                        return Boolean.valueOf(z9);
                    }
                }
                z9 = false;
                return Boolean.valueOf(z9);
            }
        });
    }

    private final boolean validate(Function0<Boolean> block) {
        try {
            return block.invoke().booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> windowExtensionsClass(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> windowExtensionsProviderClass(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> windowLayoutComponentClass(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }

    public final WindowLayoutComponent getWindowLayoutComponent() {
        return (WindowLayoutComponent) windowLayoutComponent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean doesReturn(Method method, Class<?> cls) {
        return method.getReturnType().equals(cls);
    }
}
