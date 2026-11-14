package androidx.window.layout;

import android.app.Activity;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import x8.f;
import y8.g;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly8/g;", "Landroidx/window/layout/WindowLayoutInfo;", "", "<anonymous>", "(Ly8/g;)V"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", i = {0, 0, 1, 1}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE, ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE}, m = "invokeSuspend", n = {"$this$flow", "listener", "$this$flow", "listener"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes.dex */
public final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends SuspendLambda implements Function2<g, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ WindowInfoTrackerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerImpl$windowLayoutInfo$1(WindowInfoTrackerImpl windowInfoTrackerImpl, Activity activity, Continuation<? super WindowInfoTrackerImpl$windowLayoutInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = windowInfoTrackerImpl;
        this.$activity = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeSuspend$lambda-0, reason: not valid java name */
    public static final void m90invokeSuspend$lambda0(f fVar, WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        fVar.e(windowLayoutInfo);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this.this$0, this.$activity, continuation);
        windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(g gVar, Continuation<? super Unit> continuation) {
        return ((WindowInfoTrackerImpl$windowLayoutInfo$1) create(gVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008f, code lost:
    
        if (r5.emit(r11, r10) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x001a, B:9:0x0062, B:15:0x0075, B:17:0x007d, B:25:0x0036, B:27:0x005d), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0092  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008f -> B:8:0x001d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L2a
            if (r1 != r2) goto L23
            java.lang.Object r1 = r10.L$2
            x8.a r1 = (x8.a) r1
            java.lang.Object r4 = r10.L$1
            androidx.core.util.Consumer r4 = (androidx.core.util.Consumer) r4
            java.lang.Object r5 = r10.L$0
            y8.g r5 = (y8.g) r5
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L20
        L1d:
            r11 = r5
            r5 = r1
            goto L62
        L20:
            r11 = move-exception
            goto L9e
        L23:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            j1.i.l(r11)
            r11 = 0
            return r11
        L2a:
            java.lang.Object r1 = r10.L$2
            x8.a r1 = (x8.a) r1
            java.lang.Object r4 = r10.L$1
            androidx.core.util.Consumer r4 = (androidx.core.util.Consumer) r4
            java.lang.Object r5 = r10.L$0
            y8.g r5 = (y8.g) r5
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L20
            goto L75
        L3a:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.L$0
            y8.g r11 = (y8.g) r11
            r1 = 10
            x8.b r1 = x8.j.a(r1, r2)
            androidx.window.layout.a r4 = new androidx.window.layout.a
            r4.<init>()
            androidx.window.layout.WindowInfoTrackerImpl r5 = r10.this$0
            androidx.window.layout.WindowBackend r5 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r5)
            android.app.Activity r6 = r10.$activity
            androidx.arch.core.executor.a r7 = new androidx.arch.core.executor.a
            r8 = 2
            r7.<init>(r8)
            r5.registerLayoutChangeCallback(r6, r7, r4)
            x8.a r5 = new x8.a     // Catch: java.lang.Throwable -> L20
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L20
        L62:
            r10.L$0 = r11     // Catch: java.lang.Throwable -> L20
            r10.L$1 = r4     // Catch: java.lang.Throwable -> L20
            r10.L$2 = r5     // Catch: java.lang.Throwable -> L20
            r10.label = r3     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r5.c(r10)     // Catch: java.lang.Throwable -> L20
            if (r1 != r0) goto L71
            goto L91
        L71:
            r9 = r5
            r5 = r11
            r11 = r1
            r1 = r9
        L75:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L20
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r11 == 0) goto L92
            java.lang.Object r11 = r1.d()     // Catch: java.lang.Throwable -> L20
            androidx.window.layout.WindowLayoutInfo r11 = (androidx.window.layout.WindowLayoutInfo) r11     // Catch: java.lang.Throwable -> L20
            r10.L$0 = r5     // Catch: java.lang.Throwable -> L20
            r10.L$1 = r4     // Catch: java.lang.Throwable -> L20
            r10.L$2 = r1     // Catch: java.lang.Throwable -> L20
            r10.label = r2     // Catch: java.lang.Throwable -> L20
            java.lang.Object r11 = r5.emit(r11, r10)     // Catch: java.lang.Throwable -> L20
            if (r11 != r0) goto L1d
        L91:
            return r0
        L92:
            androidx.window.layout.WindowInfoTrackerImpl r11 = r10.this$0
            androidx.window.layout.WindowBackend r11 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r11)
            r11.unregisterLayoutChangeCallback(r4)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L9e:
            androidx.window.layout.WindowInfoTrackerImpl r0 = r10.this$0
            androidx.window.layout.WindowBackend r0 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r0)
            r0.unregisterLayoutChangeCallback(r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
