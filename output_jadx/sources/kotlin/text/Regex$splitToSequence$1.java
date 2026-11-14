package kotlin.text;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {280, 288, 292}, m = "invokeSuspend", n = {"$this$sequence", "matcher", "$this$sequence", "matcher", "nextStart", "splitCount", "$this$sequence", "matcher", "nextStart", "splitCount"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"})
/* loaded from: classes2.dex */
public final class Regex$splitToSequence$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super String>, Continuation<? super Unit>, Object> {
    final /* synthetic */ CharSequence $input;
    final /* synthetic */ int $limit;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Regex this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Regex$splitToSequence$1(Regex regex, CharSequence charSequence, int i10, Continuation<? super Regex$splitToSequence$1> continuation) {
        super(2, continuation);
        this.this$0 = regex;
        this.$input = charSequence;
        this.$limit = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Regex$splitToSequence$1 regex$splitToSequence$1 = new Regex$splitToSequence$1(this.this$0, this.$input, this.$limit, continuation);
        regex$splitToSequence$1.L$0 = obj;
        return regex$splitToSequence$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super String> sequenceScope, Continuation<? super Unit> continuation) {
        return ((Regex$splitToSequence$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ae, code lost:
    
        if (r0.yield(r4, r10) != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
    
        if (r0.yield(r2, r10) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0074 -> B:13:0x0075). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.L$0
            kotlin.sequences.SequenceScope r0 = (kotlin.sequences.SequenceScope) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r10.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L2f
            if (r2 == r4) goto L25
            if (r2 != r3) goto L1e
            java.lang.Object r0 = r10.L$1
            java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
            kotlin.ResultKt.throwOnFailure(r11)
            goto Lb1
        L1e:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            j1.i.l(r11)
            r11 = 0
            return r11
        L25:
            int r2 = r10.I$1
            java.lang.Object r6 = r10.L$1
            java.util.regex.Matcher r6 = (java.util.regex.Matcher) r6
            kotlin.ResultKt.throwOnFailure(r11)
            goto L75
        L2f:
            java.lang.Object r0 = r10.L$1
            java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
            kotlin.ResultKt.throwOnFailure(r11)
            goto Lcf
        L38:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlin.text.Regex r11 = r10.this$0
            java.util.regex.Pattern r11 = kotlin.text.Regex.access$getNativePattern$p(r11)
            java.lang.CharSequence r2 = r10.$input
            java.util.regex.Matcher r11 = r11.matcher(r2)
            int r2 = r10.$limit
            if (r2 == r5) goto Lb4
            boolean r2 = r11.find()
            if (r2 != 0) goto L52
            goto Lb4
        L52:
            r2 = 0
            r6 = r11
            r11 = r2
        L55:
            java.lang.CharSequence r7 = r10.$input
            int r8 = r6.start()
            java.lang.CharSequence r7 = r7.subSequence(r2, r8)
            java.lang.String r7 = r7.toString()
            r10.L$0 = r0
            r10.L$1 = r6
            r10.I$0 = r2
            r10.I$1 = r11
            r10.label = r4
            java.lang.Object r2 = r0.yield(r7, r10)
            if (r2 != r1) goto L74
            goto Lce
        L74:
            r2 = r11
        L75:
            int r11 = r6.end()
            int r2 = r2 + r5
            int r7 = r10.$limit
            int r7 = r7 - r5
            if (r2 == r7) goto L8a
            boolean r7 = r6.find()
            if (r7 != 0) goto L86
            goto L8a
        L86:
            r9 = r2
            r2 = r11
            r11 = r9
            goto L55
        L8a:
            java.lang.CharSequence r4 = r10.$input
            int r5 = r4.length()
            java.lang.CharSequence r4 = r4.subSequence(r11, r5)
            java.lang.String r4 = r4.toString()
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r10.L$0 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r10.L$1 = r5
            r10.I$0 = r11
            r10.I$1 = r2
            r10.label = r3
            java.lang.Object r11 = r0.yield(r4, r10)
            if (r11 != r1) goto Lb1
            goto Lce
        Lb1:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        Lb4:
            java.lang.CharSequence r2 = r10.$input
            java.lang.String r2 = r2.toString()
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r10.L$0 = r3
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r10.L$1 = r11
            r10.label = r5
            java.lang.Object r11 = r0.yield(r2, r10)
            if (r11 != r1) goto Lcf
        Lce:
            return r1
        Lcf:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex$splitToSequence$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
