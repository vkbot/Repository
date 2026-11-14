package androidx.lifecycle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003BA\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0002\u0010\rJ\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0012\u0010\u000e\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/ViewModelLazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Lkotlin/Lazy;", "viewModelClass", "Lkotlin/reflect/KClass;", "storeProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStore;", "factoryProducer", "Landroidx/lifecycle/ViewModelProvider$Factory;", "extrasProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "cached", "Landroidx/lifecycle/ViewModel;", "value", "getValue", "()Landroidx/lifecycle/ViewModel;", "isInitialized", "", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ViewModelLazy<VM extends ViewModel> implements Lazy<VM> {
    private VM cached;
    private final Function0<CreationExtras> extrasProducer;
    private final Function0<ViewModelProvider.Factory> factoryProducer;
    private final Function0<ViewModelStore> storeProducer;
    private final KClass<VM> viewModelClass;

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ViewModelLazy(KClass<VM> kClass, Function0<? extends ViewModelStore> function0, Function0<? extends ViewModelProvider.Factory> function02, Function0<? extends CreationExtras> function03) {
        kClass.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        this.viewModelClass = kClass;
        this.storeProducer = function0;
        this.factoryProducer = function02;
        this.extrasProducer = function03;
    }

    @Override // kotlin.Lazy
    public VM getValue() {
        VM vm = this.cached;
        if (vm == null) {
            VM vm2 = (VM) new ViewModelProvider(this.storeProducer.invoke(), this.factoryProducer.invoke(), this.extrasProducer.invoke()).get(JvmClassMappingKt.getJavaClass((KClass) this.viewModelClass));
            this.cached = vm2;
            return vm2;
        }
        return vm;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        if (this.cached != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ViewModelLazy(KClass<VM> kClass, Function0<? extends ViewModelStore> function0, Function0<? extends ViewModelProvider.Factory> function02) {
        this(kClass, function0, function02, null, 8, null);
        kClass.getClass();
        function0.getClass();
        function02.getClass();
    }

    public /* synthetic */ ViewModelLazy(KClass kClass, Function0 function0, Function0 function02, Function0 function03, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kClass, function0, function02, (i10 & 8) != 0 ? new Function0<CreationExtras.Empty>() { // from class: androidx.lifecycle.ViewModelLazy.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras.Empty invoke() {
                return CreationExtras.Empty.INSTANCE;
            }
        } : function03);
    }
}
