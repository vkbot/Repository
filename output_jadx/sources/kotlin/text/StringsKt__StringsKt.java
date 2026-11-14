package kotlin.text;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CharIterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000\u001a$\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000\u001a$\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000\u001a$\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000\u001a$\u0010\b\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\n\u0010\t\u001a\u00020\n\"\u00020\u0004\u001a\u0016\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\n\u0010\t\u001a\u00020\n\"\u00020\u0004\u001a\u0016\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\n\u0010\t\u001a\u00020\n\"\u00020\u0004\u001a\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u00062\n\u0010\t\u001a\u00020\n\"\u00020\u0004\u001a\u0016\u0010\b\u001a\u00020\u0001*\u00020\u00012\n\u0010\t\u001a\u00020\n\"\u00020\u0004\u001a\u0016\u0010\b\u001a\u00020\u0006*\u00020\u00062\n\u0010\t\u001a\u00020\n\"\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\r\u0010\u0000\u001a\u00020\u0006*\u00020\u0006H\u0087\b\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0001\u001a\r\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0087\b\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0001\u001a\r\u0010\b\u001a\u00020\u0006*\u00020\u0006H\u0087\b\u001a\u001c\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u001a\u001c\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u001a\u001c\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u001a\u001c\u0010\u000f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u001a \u0010\u0010\u001a\u00020\u0005*\u0004\u0018\u00010\u0001H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\r\u0010\u0011\u001a\u00020\u0005*\u00020\u0001H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u0005*\u00020\u0001H\u0087\b\u001a\n\u0010\u0013\u001a\u00020\u0005*\u00020\u0001\u001a\r\u0010\u0014\u001a\u00020\u0005*\u00020\u0001H\u0087\b\u001a \u0010\u0015\u001a\u00020\u0005*\u0004\u0018\u00010\u0001H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\r\u0010\u0016\u001a\u00020\u0017*\u00020\u0001H\u0086\u0002\u001a\u000f\u0010\u0018\u001a\u00020\u0006*\u0004\u0018\u00010\u0006H\u0087\b\u001aD\u0010\u0019\u001a\u0002H\u001a\"\f\b\u0000\u0010\u001b*\u00020\u0001*\u0002H\u001a\"\u0004\b\u0001\u0010\u001a*\u0002H\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001dH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010\u001e\u001aD\u0010\u001f\u001a\u0002H\u001a\"\f\b\u0000\u0010\u001b*\u00020\u0001*\u0002H\u001a\"\u0004\b\u0001\u0010\u001a*\u0002H\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001dH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010\u001e\u001a\u0012\u0010'\u001a\u00020\u0005*\u00020\u00012\u0006\u0010(\u001a\u00020\r\u001a\u0012\u0010)\u001a\u00020\u0006*\u00020\u00062\u0006\u0010*\u001a\u00020!\u001a\u0012\u0010+\u001a\u00020\u0001*\u00020\u00012\u0006\u0010*\u001a\u00020!\u001a\u001d\u0010+\u001a\u00020\u0001*\u00020\u00062\u0006\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\rH\u0087\b\u001a\u001f\u0010)\u001a\u00020\u0006*\u00020\u00012\u0006\u0010.\u001a\u00020\r2\b\b\u0002\u0010/\u001a\u00020\rH\u0087\b\u001a\u0012\u0010)\u001a\u00020\u0006*\u00020\u00012\u0006\u0010*\u001a\u00020!\u001a\u001c\u00100\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u0006\u001a\u001c\u00100\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a\u001c\u00103\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u0006\u001a\u001c\u00103\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a\u001c\u00104\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u0006\u001a\u001c\u00104\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a\u001c\u00105\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u0006\u001a\u001c\u00105\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a\"\u00106\u001a\u00020\u0001*\u00020\u00012\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00107\u001a\u00020\u0001\u001a%\u00106\u001a\u00020\u0006*\u00020\u00062\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00107\u001a\u00020\u0001H\u0087\b\u001a\u001a\u00106\u001a\u00020\u0001*\u00020\u00012\u0006\u0010*\u001a\u00020!2\u0006\u00107\u001a\u00020\u0001\u001a\u001d\u00106\u001a\u00020\u0006*\u00020\u00062\u0006\u0010*\u001a\u00020!2\u0006\u00107\u001a\u00020\u0001H\u0087\b\u001a\u001a\u00108\u001a\u00020\u0001*\u00020\u00012\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r\u001a\u001d\u00108\u001a\u00020\u0006*\u00020\u00062\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\rH\u0087\b\u001a\u0012\u00108\u001a\u00020\u0001*\u00020\u00012\u0006\u0010*\u001a\u00020!\u001a\u0015\u00108\u001a\u00020\u0006*\u00020\u00062\u0006\u0010*\u001a\u00020!H\u0087\b\u001a\u0012\u00109\u001a\u00020\u0001*\u00020\u00012\u0006\u0010:\u001a\u00020\u0001\u001a\u0012\u00109\u001a\u00020\u0006*\u00020\u00062\u0006\u0010:\u001a\u00020\u0001\u001a\u0012\u0010;\u001a\u00020\u0001*\u00020\u00012\u0006\u0010<\u001a\u00020\u0001\u001a\u0012\u0010;\u001a\u00020\u0006*\u00020\u00062\u0006\u0010<\u001a\u00020\u0001\u001a\u001a\u0010=\u001a\u00020\u0001*\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\u0006\u0010<\u001a\u00020\u0001\u001a\u001a\u0010=\u001a\u00020\u0006*\u00020\u00062\u0006\u0010:\u001a\u00020\u00012\u0006\u0010<\u001a\u00020\u0001\u001a\u0012\u0010=\u001a\u00020\u0001*\u00020\u00012\u0006\u00101\u001a\u00020\u0001\u001a\u0012\u0010=\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u0001\u001a$\u0010>\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a$\u0010>\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a$\u0010?\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a$\u0010?\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a$\u0010@\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a$\u0010@\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a$\u0010A\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a$\u0010A\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a\u001d\u0010B\u001a\u00020\u0006*\u00020\u00012\u0006\u0010C\u001a\u00020D2\u0006\u00107\u001a\u00020\u0006H\u0087\b\u001a.\u0010B\u001a\u00020\u0006*\u00020\u00012\u0006\u0010C\u001a\u00020D2\u0014\b\b\u0010E\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u00010\u0003H\u0087\bø\u0001\u0000\u001a\u001d\u0010G\u001a\u00020\u0006*\u00020\u00012\u0006\u0010C\u001a\u00020D2\u0006\u00107\u001a\u00020\u0006H\u0087\b\u001a)\u0010H\u001a\u00020\u0006*\u00020\u00062\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0087\bø\u0001\u0000¢\u0006\u0002\bI\u001a)\u0010H\u001a\u00020\u0006*\u00020\u00062\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0087\bø\u0001\u0000¢\u0006\u0002\bJ\u001a\u0015\u0010K\u001a\u00020\u0005*\u00020\u00012\u0006\u0010C\u001a\u00020DH\u0087\f\u001a4\u0010L\u001a\u00020\u0005*\u00020\u00012\u0006\u0010M\u001a\u00020\r2\u0006\u0010N\u001a\u00020\u00012\u0006\u0010O\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010P\u001a\u00020\u0005H\u0000\u001a\u001c\u0010Q\u001a\u00020\u0005*\u00020\u00012\u0006\u0010R\u001a\u00020\u00042\b\b\u0002\u0010P\u001a\u00020\u0005\u001a\u001c\u0010S\u001a\u00020\u0005*\u00020\u00012\u0006\u0010R\u001a\u00020\u00042\b\b\u0002\u0010P\u001a\u00020\u0005\u001a\u001c\u0010Q\u001a\u00020\u0005*\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\b\b\u0002\u0010P\u001a\u00020\u0005\u001a$\u0010Q\u001a\u00020\u0005*\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a\u001c\u0010S\u001a\u00020\u0005*\u00020\u00012\u0006\u0010<\u001a\u00020\u00012\b\b\u0002\u0010P\u001a\u00020\u0005\u001a\u001c\u0010T\u001a\u00020\u0006*\u00020\u00012\u0006\u0010N\u001a\u00020\u00012\b\b\u0002\u0010P\u001a\u00020\u0005\u001a\u001c\u0010U\u001a\u00020\u0006*\u00020\u00012\u0006\u0010N\u001a\u00020\u00012\b\b\u0002\u0010P\u001a\u00020\u0005\u001a&\u0010V\u001a\u00020\r*\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a&\u0010W\u001a\u00020\r*\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a;\u0010X\u001a\u00020\r*\u00020\u00012\u0006\u0010N\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u0010P\u001a\u00020\u00052\b\b\u0002\u0010Y\u001a\u00020\u0005H\u0002¢\u0006\u0002\bZ\u001aE\u0010[\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\\*\u00020\u00012\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00060^2\u0006\u0010.\u001a\u00020\r2\u0006\u0010P\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020\u0005H\u0002¢\u0006\u0002\b_\u001a:\u0010[\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\\*\u00020\u00012\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00060^2\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a:\u0010`\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\\*\u00020\u00012\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00060^2\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a,\u0010V\u001a\u00020\r*\u00020\u00012\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00060^2\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a,\u0010W\u001a\u00020\r*\u00020\u00012\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00060^2\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a&\u0010X\u001a\u00020\r*\u00020\u00012\u0006\u0010R\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a&\u0010X\u001a\u00020\r*\u00020\u00012\u0006\u0010a\u001a\u00020\u00062\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a&\u0010b\u001a\u00020\r*\u00020\u00012\u0006\u0010R\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a&\u0010b\u001a\u00020\r*\u00020\u00012\u0006\u0010a\u001a\u00020\u00062\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a\u001f\u0010c\u001a\u00020\u0005*\u00020\u00012\u0006\u0010N\u001a\u00020\u00012\b\b\u0002\u0010P\u001a\u00020\u0005H\u0086\u0002\u001a\u001f\u0010c\u001a\u00020\u0005*\u00020\u00012\u0006\u0010R\u001a\u00020\u00042\b\b\u0002\u0010P\u001a\u00020\u0005H\u0086\u0002\u001a\u0015\u0010c\u001a\u00020\u0005*\u00020\u00012\u0006\u0010C\u001a\u00020DH\u0087\n\u001a=\u0010d\u001a\b\u0012\u0004\u0012\u00020!0e*\u00020\u00012\u0006\u0010f\u001a\u00020\n2\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u00052\b\b\u0002\u0010g\u001a\u00020\rH\u0002¢\u0006\u0002\bh\u001aG\u0010d\u001a\b\u0012\u0004\u0012\u00020!0e*\u00020\u00012\u000e\u0010f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060i2\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u00052\b\b\u0002\u0010g\u001a\u00020\rH\u0002¢\u0006\u0004\bh\u0010j\u001a\u0010\u0010k\u001a\u00020l2\u0006\u0010g\u001a\u00020\rH\u0000\u001a=\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00060e*\u00020\u00012\u0012\u0010f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060i\"\u00020\u00062\b\b\u0002\u0010P\u001a\u00020\u00052\b\b\u0002\u0010g\u001a\u00020\r¢\u0006\u0002\u0010n\u001a=\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00060p*\u00020\u00012\u0012\u0010f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060i\"\u00020\u00062\b\b\u0002\u0010P\u001a\u00020\u00052\b\b\u0002\u0010g\u001a\u00020\r¢\u0006\u0002\u0010q\u001a0\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00060e*\u00020\u00012\n\u0010f\u001a\u00020\n\"\u00020\u00042\b\b\u0002\u0010P\u001a\u00020\u00052\b\b\u0002\u0010g\u001a\u00020\r\u001a0\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00060p*\u00020\u00012\n\u0010f\u001a\u00020\n\"\u00020\u00042\b\b\u0002\u0010P\u001a\u00020\u00052\b\b\u0002\u0010g\u001a\u00020\r\u001a/\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00060p*\u00020\u00012\u0006\u00101\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u00052\u0006\u0010g\u001a\u00020\rH\u0002¢\u0006\u0002\br\u001a%\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00060p*\u00020\u00012\u0006\u0010C\u001a\u00020D2\b\b\u0002\u0010g\u001a\u00020\rH\u0087\b\u001a%\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00060e*\u00020\u00012\u0006\u0010C\u001a\u00020D2\b\b\u0002\u0010g\u001a\u00020\rH\u0087\b\u001a\u0010\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00060e*\u00020\u0001\u001a\u0010\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00060p*\u00020\u0001\u001a\u0018\u0010u\u001a\u00020\u0005*\u0004\u0018\u00010\u00012\b\u0010N\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0018\u0010v\u001a\u00020\u0005*\u0004\u0018\u00010\u00012\b\u0010N\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\f\u0010w\u001a\u00020\u0005*\u00020\u0006H\u0007\u001a\u0013\u0010x\u001a\u0004\u0018\u00010\u0005*\u00020\u0006H\u0007¢\u0006\u0002\u0010y\"\u0015\u0010 \u001a\u00020!*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u0015\u0010$\u001a\u00020\r*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006z"}, d2 = {"trim", "", "predicate", "Lkotlin/Function1;", "", "", "", "trimStart", "trimEnd", "chars", "", "padStart", "length", "", "padChar", "padEnd", "isNullOrEmpty", "isEmpty", "isNotEmpty", "isBlank", "isNotBlank", "isNullOrBlank", "iterator", "Lkotlin/collections/CharIterator;", "orEmpty", "ifEmpty", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ifBlank", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "lastIndex", "getLastIndex", "(Ljava/lang/CharSequence;)I", "hasSurrogatePairAt", "index", "substring", "range", "subSequence", "start", "end", "startIndex", "endIndex", "substringBefore", "delimiter", "missingDelimiterValue", "substringAfter", "substringBeforeLast", "substringAfterLast", "replaceRange", "replacement", "removeRange", "removePrefix", "prefix", "removeSuffix", "suffix", "removeSurrounding", "replaceBefore", "replaceAfter", "replaceAfterLast", "replaceBeforeLast", "replace", "regex", "Lkotlin/text/Regex;", "transform", "Lkotlin/text/MatchResult;", "replaceFirst", "replaceFirstChar", "replaceFirstCharWithChar", "replaceFirstCharWithCharSequence", "matches", "regionMatchesImpl", "thisOffset", "other", "otherOffset", "ignoreCase", "startsWith", "char", "endsWith", "commonPrefixWith", "commonSuffixWith", "indexOfAny", "lastIndexOfAny", "indexOf", "last", "indexOf$StringsKt__StringsKt", "findAnyOf", "Lkotlin/Pair;", "strings", "", "findAnyOf$StringsKt__StringsKt", "findLastAnyOf", TypedValues.Custom.S_STRING, "lastIndexOf", "contains", "rangesDelimitedBy", "Lkotlin/sequences/Sequence;", "delimiters", "limit", "rangesDelimitedBy$StringsKt__StringsKt", "", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "requireNonNegativeLimit", "", "splitToSequence", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "split", "", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "split$StringsKt__StringsKt", "lineSequence", "lines", "contentEqualsIgnoreCaseImpl", "contentEqualsImpl", "toBooleanStrict", "toBooleanStrictOrNull", "(Ljava/lang/String;)Ljava/lang/Boolean;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, xs = "kotlin/text/StringsKt")
@SourceDebugExtension({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1580:1\n78#1,22:1581\n112#1,5:1603\n129#1,5:1608\n78#1,22:1613\n106#1:1635\n78#1,22:1636\n112#1,5:1658\n123#1:1663\n112#1,5:1664\n129#1,5:1669\n140#1:1674\n129#1,5:1675\n78#1,22:1680\n112#1,5:1702\n129#1,5:1707\n1069#2,2:1712\n12717#3,2:1714\n12717#3,2:1716\n295#4,2:1718\n295#4,2:1720\n1563#4:1723\n1634#4,3:1724\n1563#4:1727\n1634#4,3:1728\n1#5:1722\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n106#1:1581,22\n123#1:1603,5\n140#1:1608,5\n145#1:1613,22\n150#1:1635\n150#1:1636,22\n155#1:1658,5\n160#1:1663\n160#1:1664,5\n165#1:1669,5\n170#1:1674\n170#1:1675,5\n175#1:1680,22\n186#1:1702,5\n197#1:1707,5\n310#1:1712,2\n967#1:1714,2\n991#1:1716,2\n1030#1:1718,2\n1036#1:1720,2\n1401#1:1723\n1401#1:1724,3\n1427#1:1727\n1427#1:1728,3\n*E\n"})
/* loaded from: classes2.dex */
public class StringsKt__StringsKt extends StringsKt__StringsJVMKt {
    public static final String commonPrefixWith(CharSequence charSequence, CharSequence charSequence2, boolean z9) {
        charSequence.getClass();
        charSequence2.getClass();
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i10 = 0;
        while (i10 < min && CharsKt__CharKt.equals(charSequence.charAt(i10), charSequence2.charAt(i10), z9)) {
            i10++;
        }
        int i11 = i10 - 1;
        if (hasSurrogatePairAt(charSequence, i11) || hasSurrogatePairAt(charSequence2, i11)) {
            i10--;
        }
        return charSequence.subSequence(0, i10).toString();
    }

    public static /* synthetic */ String commonPrefixWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return commonPrefixWith(charSequence, charSequence2, z9);
    }

    public static final String commonSuffixWith(CharSequence charSequence, CharSequence charSequence2, boolean z9) {
        charSequence.getClass();
        charSequence2.getClass();
        int length = charSequence.length();
        int min = Math.min(length, charSequence2.length());
        int i10 = 0;
        while (i10 < min && CharsKt__CharKt.equals(charSequence.charAt((length - i10) - 1), charSequence2.charAt((r1 - i10) - 1), z9)) {
            i10++;
        }
        if (hasSurrogatePairAt(charSequence, (length - i10) - 1) || hasSurrogatePairAt(charSequence2, (r1 - i10) - 1)) {
            i10--;
        }
        return charSequence.subSequence(length - i10, length).toString();
    }

    public static /* synthetic */ String commonSuffixWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return commonSuffixWith(charSequence, charSequence2, z9);
    }

    public static final boolean contains(CharSequence charSequence, CharSequence charSequence2, boolean z9) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (indexOf$default(charSequence, (String) charSequence2, 0, z9, 2, (Object) null) < 0) {
                return false;
            }
            return true;
        }
        if (indexOf$StringsKt__StringsKt$default(charSequence, charSequence2, 0, charSequence.length(), z9, false, 16, null) < 0) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean contains$default(CharSequence charSequence, CharSequence charSequence2, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return contains(charSequence, charSequence2, z9);
    }

    public static final boolean contentEqualsIgnoreCaseImpl(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return StringsKt__StringsJVMKt.equals((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!CharsKt__CharKt.equals(charSequence.charAt(i10), charSequence2.charAt(i10), true)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean contentEqualsImpl(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return Intrinsics.areEqual(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean endsWith(CharSequence charSequence, CharSequence charSequence2, boolean z9) {
        charSequence.getClass();
        charSequence2.getClass();
        if (!z9 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return StringsKt__StringsJVMKt.endsWith$default((String) charSequence, (String) charSequence2, false, 2, null);
        }
        return regionMatchesImpl(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z9);
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence charSequence, char c, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return endsWith(charSequence, c, z9);
    }

    public static final Pair<Integer, String> findAnyOf(CharSequence charSequence, Collection<String> collection, int i10, boolean z9) {
        charSequence.getClass();
        collection.getClass();
        return findAnyOf$StringsKt__StringsKt(charSequence, collection, i10, z9, false);
    }

    private static final Pair<Integer, String> findAnyOf$StringsKt__StringsKt(CharSequence charSequence, Collection<String> collection, int i10, boolean z9, boolean z10) {
        IntProgression downTo;
        CharSequence charSequence2;
        Object obj;
        boolean z11;
        Object obj2;
        Object single;
        int lastIndexOf$default;
        if (!z9 && collection.size() == 1) {
            single = CollectionsKt___CollectionsKt.single(collection);
            String str = (String) single;
            if (!z10) {
                lastIndexOf$default = indexOf$default(charSequence, str, i10, false, 4, (Object) null);
            } else {
                lastIndexOf$default = lastIndexOf$default(charSequence, str, i10, false, 4, (Object) null);
            }
            if (lastIndexOf$default >= 0) {
                return TuplesKt.to(Integer.valueOf(lastIndexOf$default), str);
            }
        } else {
            CharSequence charSequence3 = charSequence;
            if (!z10) {
                downTo = new IntRange(RangesKt.coerceAtLeast(i10, 0), charSequence3.length());
            } else {
                downTo = RangesKt.downTo(RangesKt.coerceAtMost(i10, getLastIndex(charSequence3)), 0);
            }
            if (charSequence3 instanceof String) {
                int first = downTo.getFirst();
                int last = downTo.getLast();
                int step = downTo.getStep();
                if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                    int i11 = first;
                    while (true) {
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                String str2 = (String) obj2;
                                z11 = z9;
                                if (StringsKt__StringsJVMKt.regionMatches(str2, 0, (String) charSequence3, i11, str2.length(), z11)) {
                                    break;
                                }
                                z9 = z11;
                            } else {
                                z11 = z9;
                                obj2 = null;
                                break;
                            }
                        }
                        String str3 = (String) obj2;
                        if (str3 != null) {
                            return TuplesKt.to(Integer.valueOf(i11), str3);
                        }
                        if (i11 == last) {
                            break;
                        }
                        i11 += step;
                        z9 = z11;
                    }
                }
            } else {
                boolean z12 = z9;
                int first2 = downTo.getFirst();
                int last2 = downTo.getLast();
                int step2 = downTo.getStep();
                if ((step2 > 0 && first2 <= last2) || (step2 < 0 && last2 <= first2)) {
                    int i12 = first2;
                    while (true) {
                        Iterator<T> it2 = collection.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                String str4 = (String) obj;
                                boolean z13 = z12;
                                charSequence2 = charSequence3;
                                z12 = z13;
                                if (regionMatchesImpl(str4, 0, charSequence2, i12, str4.length(), z13)) {
                                    break;
                                }
                                charSequence3 = charSequence2;
                            } else {
                                charSequence2 = charSequence3;
                                obj = null;
                                break;
                            }
                        }
                        String str5 = (String) obj;
                        if (str5 != null) {
                            return TuplesKt.to(Integer.valueOf(i12), str5);
                        }
                        if (i12 == last2) {
                            break;
                        }
                        i12 += step2;
                        charSequence3 = charSequence2;
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ Pair findAnyOf$default(CharSequence charSequence, Collection collection, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return findAnyOf(charSequence, collection, i10, z9);
    }

    public static final Pair<Integer, String> findLastAnyOf(CharSequence charSequence, Collection<String> collection, int i10, boolean z9) {
        charSequence.getClass();
        collection.getClass();
        return findAnyOf$StringsKt__StringsKt(charSequence, collection, i10, z9, true);
    }

    public static /* synthetic */ Pair findLastAnyOf$default(CharSequence charSequence, Collection collection, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = getLastIndex(charSequence);
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return findLastAnyOf(charSequence, collection, i10, z9);
    }

    public static final IntRange getIndices(CharSequence charSequence) {
        charSequence.getClass();
        return new IntRange(0, charSequence.length() - 1);
    }

    public static final int getLastIndex(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static final boolean hasSurrogatePairAt(CharSequence charSequence, int i10) {
        charSequence.getClass();
        if (i10 >= 0 && i10 <= charSequence.length() - 2 && Character.isHighSurrogate(charSequence.charAt(i10)) && Character.isLowSurrogate(charSequence.charAt(i10 + 1))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <C extends CharSequence & R, R> R ifBlank(C c, Function0<? extends R> function0) {
        function0.getClass();
        if (isBlank(c)) {
            return function0.invoke();
        }
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <C extends CharSequence & R, R> R ifEmpty(C c, Function0<? extends R> function0) {
        function0.getClass();
        if (c.length() == 0) {
            return function0.invoke();
        }
        return c;
    }

    public static final int indexOf(CharSequence charSequence, String str, int i10, boolean z9) {
        charSequence.getClass();
        str.getClass();
        if (!z9 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i10);
        }
        return indexOf$StringsKt__StringsKt$default(charSequence, str, i10, charSequence.length(), z9, false, 16, null);
    }

    private static final int indexOf$StringsKt__StringsKt(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z9, boolean z10) {
        IntProgression downTo;
        if (!z10) {
            downTo = new IntRange(RangesKt.coerceAtLeast(i10, 0), RangesKt.coerceAtMost(i11, charSequence.length()));
        } else {
            downTo = RangesKt.downTo(RangesKt.coerceAtMost(i10, getLastIndex(charSequence)), RangesKt.coerceAtLeast(i11, 0));
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int first = downTo.getFirst();
            int last = downTo.getLast();
            int step = downTo.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                int i12 = first;
                while (true) {
                    String str = (String) charSequence2;
                    boolean z11 = z9;
                    if (StringsKt__StringsJVMKt.regionMatches(str, 0, (String) charSequence, i12, str.length(), z11)) {
                        return i12;
                    }
                    if (i12 != last) {
                        i12 += step;
                        z9 = z11;
                    } else {
                        return -1;
                    }
                }
            } else {
                return -1;
            }
        } else {
            boolean z12 = z9;
            int first2 = downTo.getFirst();
            int last2 = downTo.getLast();
            int step2 = downTo.getStep();
            if ((step2 > 0 && first2 <= last2) || (step2 < 0 && last2 <= first2)) {
                int i13 = first2;
                while (true) {
                    boolean z13 = z12;
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    z12 = z13;
                    if (regionMatchesImpl(charSequence4, 0, charSequence3, i13, charSequence2.length(), z13)) {
                        return i13;
                    }
                    if (i13 != last2) {
                        i13 += step2;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    } else {
                        return -1;
                    }
                }
            } else {
                return -1;
            }
        }
    }

    public static /* synthetic */ int indexOf$StringsKt__StringsKt$default(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z9, boolean z10, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z10 = false;
        }
        return indexOf$StringsKt__StringsKt(charSequence, charSequence2, i10, i11, z9, z10);
    }

    public static /* synthetic */ int indexOf$default(CharSequence charSequence, char c, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return indexOf(charSequence, c, i10, z9);
    }

    public static final int indexOfAny(CharSequence charSequence, char[] cArr, int i10, boolean z9) {
        charSequence.getClass();
        cArr.getClass();
        if (!z9 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ArraysKt.single(cArr), i10);
        }
        int coerceAtLeast = RangesKt.coerceAtLeast(i10, 0);
        int lastIndex = getLastIndex(charSequence);
        if (coerceAtLeast > lastIndex) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(coerceAtLeast);
            for (char c : cArr) {
                if (CharsKt__CharKt.equals(c, charAt, z9)) {
                    return coerceAtLeast;
                }
            }
            if (coerceAtLeast != lastIndex) {
                coerceAtLeast++;
            } else {
                return -1;
            }
        }
    }

    public static /* synthetic */ int indexOfAny$default(CharSequence charSequence, char[] cArr, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return indexOfAny(charSequence, cArr, i10, z9);
    }

    public static boolean isBlank(CharSequence charSequence) {
        charSequence.getClass();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!CharsKt__CharJVMKt.isWhitespace(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    @InlineOnly
    private static final boolean isEmpty(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    @InlineOnly
    private static final boolean isNotBlank(CharSequence charSequence) {
        charSequence.getClass();
        return !isBlank(charSequence);
    }

    @InlineOnly
    private static final boolean isNotEmpty(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() > 0) {
            return true;
        }
        return false;
    }

    @InlineOnly
    private static final boolean isNullOrBlank(CharSequence charSequence) {
        if (charSequence != null && !isBlank(charSequence)) {
            return false;
        }
        return true;
    }

    @InlineOnly
    private static final boolean isNullOrEmpty(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            return false;
        }
        return true;
    }

    public static final CharIterator iterator(final CharSequence charSequence) {
        charSequence.getClass();
        return new CharIterator() { // from class: kotlin.text.StringsKt__StringsKt$iterator$1
            private int index;

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.index < charSequence.length()) {
                    return true;
                }
                return false;
            }

            @Override // kotlin.collections.CharIterator
            public char nextChar() {
                CharSequence charSequence2 = charSequence;
                int i10 = this.index;
                this.index = i10 + 1;
                return charSequence2.charAt(i10);
            }
        };
    }

    public static final int lastIndexOf(CharSequence charSequence, String str, int i10, boolean z9) {
        charSequence.getClass();
        str.getClass();
        if (!z9 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(str, i10);
        }
        return indexOf$StringsKt__StringsKt(charSequence, str, i10, 0, z9, true);
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence charSequence, char c, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = getLastIndex(charSequence);
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return lastIndexOf(charSequence, c, i10, z9);
    }

    public static final int lastIndexOfAny(CharSequence charSequence, char[] cArr, int i10, boolean z9) {
        charSequence.getClass();
        cArr.getClass();
        if (!z9 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(ArraysKt.single(cArr), i10);
        }
        for (int coerceAtMost = RangesKt.coerceAtMost(i10, getLastIndex(charSequence)); -1 < coerceAtMost; coerceAtMost--) {
            char charAt = charSequence.charAt(coerceAtMost);
            for (char c : cArr) {
                if (CharsKt__CharKt.equals(c, charAt, z9)) {
                    return coerceAtMost;
                }
            }
        }
        return -1;
    }

    public static /* synthetic */ int lastIndexOfAny$default(CharSequence charSequence, char[] cArr, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = getLastIndex(charSequence);
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return lastIndexOfAny(charSequence, cArr, i10, z9);
    }

    public static final Sequence<String> lineSequence(final CharSequence charSequence) {
        charSequence.getClass();
        return new Sequence<String>() { // from class: kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<String> iterator() {
                return new LinesIterator(charSequence);
            }
        };
    }

    public static final List<String> lines(CharSequence charSequence) {
        charSequence.getClass();
        return SequencesKt.toList(lineSequence(charSequence));
    }

    @InlineOnly
    private static final boolean matches(CharSequence charSequence, Regex regex) {
        charSequence.getClass();
        regex.getClass();
        return regex.matches(charSequence);
    }

    @InlineOnly
    private static final String orEmpty(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    public static final CharSequence padEnd(CharSequence charSequence, int i10, char c) {
        charSequence.getClass();
        if (i10 >= 0) {
            if (i10 <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb = new StringBuilder(i10);
            sb.append(charSequence);
            int length = i10 - charSequence.length();
            int i11 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(c);
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            return sb;
        }
        j1.i.k(ai.onnxruntime.a.f(i10, "Desired length ", " is less than zero."));
        return null;
    }

    public static /* synthetic */ CharSequence padEnd$default(CharSequence charSequence, int i10, char c, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c = ' ';
        }
        return padEnd(charSequence, i10, c);
    }

    public static final CharSequence padStart(CharSequence charSequence, int i10, char c) {
        charSequence.getClass();
        if (i10 >= 0) {
            if (i10 <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb = new StringBuilder(i10);
            int length = i10 - charSequence.length();
            int i11 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(c);
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            sb.append(charSequence);
            return sb;
        }
        j1.i.k(ai.onnxruntime.a.f(i10, "Desired length ", " is less than zero."));
        return null;
    }

    public static /* synthetic */ CharSequence padStart$default(CharSequence charSequence, int i10, char c, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c = ' ';
        }
        return padStart(charSequence, i10, c);
    }

    private static final Sequence<IntRange> rangesDelimitedBy$StringsKt__StringsKt(CharSequence charSequence, String[] strArr, int i10, boolean z9, int i11) {
        requireNonNegativeLimit(i11);
        return new DelimitedRangesSequence(charSequence, i10, i11, new g(ArraysKt.asList(strArr), z9, 1));
    }

    public static /* synthetic */ Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence charSequence, char[] cArr, int i10, boolean z9, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z9 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return rangesDelimitedBy$StringsKt__StringsKt(charSequence, cArr, i10, z9, i11);
    }

    public static final Pair rangesDelimitedBy$lambda$14$StringsKt__StringsKt(char[] cArr, boolean z9, CharSequence charSequence, int i10) {
        charSequence.getClass();
        int indexOfAny = indexOfAny(charSequence, cArr, i10, z9);
        if (indexOfAny < 0) {
            return null;
        }
        return TuplesKt.to(Integer.valueOf(indexOfAny), 1);
    }

    public static final Pair rangesDelimitedBy$lambda$16$StringsKt__StringsKt(List list, boolean z9, CharSequence charSequence, int i10) {
        charSequence.getClass();
        Pair<Integer, String> findAnyOf$StringsKt__StringsKt = findAnyOf$StringsKt__StringsKt(charSequence, list, i10, z9, false);
        if (findAnyOf$StringsKt__StringsKt != null) {
            return TuplesKt.to(findAnyOf$StringsKt__StringsKt.getFirst(), Integer.valueOf(findAnyOf$StringsKt__StringsKt.getSecond().length()));
        }
        return null;
    }

    public static final boolean regionMatchesImpl(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z9) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!CharsKt__CharKt.equals(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z9)) {
                return false;
            }
        }
        return true;
    }

    public static final CharSequence removePrefix(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (startsWith$default(charSequence, charSequence2, false, 2, (Object) null)) {
            return charSequence.subSequence(charSequence2.length(), charSequence.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final CharSequence removeRange(CharSequence charSequence, int i10, int i11) {
        charSequence.getClass();
        if (i11 >= i10) {
            if (i11 == i10) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb = new StringBuilder(charSequence.length() - (i11 - i10));
            sb.append(charSequence, 0, i10);
            sb.append(charSequence, i11, charSequence.length());
            return sb;
        }
        ai.onnxruntime.b.j("End index (", i11, ") is less than start index (", i10, ").");
        return null;
    }

    public static final CharSequence removeSuffix(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (endsWith$default(charSequence, charSequence2, false, 2, (Object) null)) {
            return charSequence.subSequence(0, charSequence.length() - charSequence2.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final CharSequence removeSurrounding(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        if (charSequence.length() >= charSequence3.length() + charSequence2.length() && startsWith$default(charSequence, charSequence2, false, 2, (Object) null) && endsWith$default(charSequence, charSequence3, false, 2, (Object) null)) {
            return charSequence.subSequence(charSequence2.length(), charSequence.length() - charSequence3.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @InlineOnly
    private static final String replace(CharSequence charSequence, Regex regex, String str) {
        charSequence.getClass();
        regex.getClass();
        str.getClass();
        return regex.replace(charSequence, str);
    }

    public static final String replaceAfter(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        int indexOf$default = indexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return str4;
        }
        return replaceRange((CharSequence) str, str2.length() + indexOf$default, str.length(), (CharSequence) str3).toString();
    }

    public static /* synthetic */ String replaceAfter$default(String str, char c, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        return replaceAfter(str, c, str2, str3);
    }

    public static final String replaceAfterLast(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return str4;
        }
        return replaceRange((CharSequence) str, str2.length() + lastIndexOf$default, str.length(), (CharSequence) str3).toString();
    }

    public static /* synthetic */ String replaceAfterLast$default(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return replaceAfterLast(str, str2, str3, str4);
    }

    public static final String replaceBefore(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        int indexOf$default = indexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return str4;
        }
        return replaceRange((CharSequence) str, 0, indexOf$default, (CharSequence) str3).toString();
    }

    public static /* synthetic */ String replaceBefore$default(String str, char c, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        return replaceBefore(str, c, str2, str3);
    }

    public static final String replaceBeforeLast(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return str4;
        }
        return replaceRange((CharSequence) str, 0, lastIndexOf$default, (CharSequence) str3).toString();
    }

    public static /* synthetic */ String replaceBeforeLast$default(String str, char c, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        return replaceBeforeLast(str, c, str2, str3);
    }

    @InlineOnly
    private static final String replaceFirst(CharSequence charSequence, Regex regex, String str) {
        charSequence.getClass();
        regex.getClass();
        str.getClass();
        return regex.replaceFirst(charSequence, str);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "replaceFirstCharWithChar")
    @OverloadResolutionByLambdaReturnType
    private static final String replaceFirstCharWithChar(String str, Function1<? super Character, Character> function1) {
        str.getClass();
        function1.getClass();
        if (str.length() > 0) {
            return function1.invoke(Character.valueOf(str.charAt(0))).charValue() + str.substring(1);
        }
        return str;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "replaceFirstCharWithCharSequence")
    @OverloadResolutionByLambdaReturnType
    private static final String replaceFirstCharWithCharSequence(String str, Function1<? super Character, ? extends CharSequence> function1) {
        str.getClass();
        function1.getClass();
        if (str.length() > 0) {
            return ((Object) function1.invoke(Character.valueOf(str.charAt(0)))) + str.substring(1);
        }
        return str;
    }

    public static final CharSequence replaceRange(CharSequence charSequence, int i10, int i11, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i11 >= i10) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i10);
            sb.append(charSequence2);
            sb.append(charSequence, i11, charSequence.length());
            return sb;
        }
        ai.onnxruntime.b.j("End index (", i11, ") is less than start index (", i10, ").");
        return null;
    }

    public static final void requireNonNegativeLimit(int i10) {
        if (i10 >= 0) {
            return;
        }
        l9.i.d(ai.onnxruntime.a.e(i10, "Limit must be non-negative, but was "));
    }

    public static final List<String> split(CharSequence charSequence, String[] strArr, boolean z9, int i10) {
        charSequence.getClass();
        strArr.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return split$StringsKt__StringsKt(charSequence, str, z9, i10);
            }
        }
        Iterable asIterable = SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, strArr, 0, z9, i10, 2, (Object) null));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asIterable, 10));
        Iterator it = asIterable.iterator();
        while (it.hasNext()) {
            arrayList.add(substring(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    private static final List<String> split$StringsKt__StringsKt(CharSequence charSequence, String str, boolean z9, int i10) {
        boolean z10;
        requireNonNegativeLimit(i10);
        int i11 = 0;
        int indexOf = indexOf(charSequence, str, 0, z9);
        if (indexOf != -1 && i10 != 1) {
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i12 = 10;
            if (z10) {
                i12 = RangesKt.coerceAtMost(i10, 10);
            }
            ArrayList arrayList = new ArrayList(i12);
            do {
                arrayList.add(charSequence.subSequence(i11, indexOf).toString());
                i11 = str.length() + indexOf;
                if (z10 && arrayList.size() == i10 - 1) {
                    break;
                }
                indexOf = indexOf(charSequence, str, i11, z9);
            } while (indexOf != -1);
            arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
            return arrayList;
        }
        return CollectionsKt.listOf(charSequence.toString());
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, String[] strArr, boolean z9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z9 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return split(charSequence, strArr, z9, i10);
    }

    public static final Sequence<String> splitToSequence(CharSequence charSequence, String[] strArr, boolean z9, int i10) {
        charSequence.getClass();
        strArr.getClass();
        return SequencesKt.map(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, strArr, 0, z9, i10, 2, (Object) null), new f(charSequence, 1));
    }

    public static /* synthetic */ Sequence splitToSequence$default(CharSequence charSequence, String[] strArr, boolean z9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z9 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return splitToSequence(charSequence, strArr, z9, i10);
    }

    public static final String splitToSequence$lambda$18$StringsKt__StringsKt(CharSequence charSequence, IntRange intRange) {
        intRange.getClass();
        return substring(charSequence, intRange);
    }

    public static final String splitToSequence$lambda$20$StringsKt__StringsKt(CharSequence charSequence, IntRange intRange) {
        intRange.getClass();
        return substring(charSequence, intRange);
    }

    public static final boolean startsWith(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z9) {
        charSequence.getClass();
        charSequence2.getClass();
        if (!z9 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return StringsKt__StringsJVMKt.startsWith$default((String) charSequence, (String) charSequence2, i10, false, 4, null);
        }
        return regionMatchesImpl(charSequence, i10, charSequence2, 0, charSequence2.length(), z9);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, char c, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return startsWith(charSequence, c, z9);
    }

    public static final CharSequence subSequence(CharSequence charSequence, IntRange intRange) {
        charSequence.getClass();
        intRange.getClass();
        return charSequence.subSequence(intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1);
    }

    public static final String substring(CharSequence charSequence, IntRange intRange) {
        charSequence.getClass();
        intRange.getClass();
        return charSequence.subSequence(intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1).toString();
    }

    public static /* synthetic */ String substring$default(CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = charSequence.length();
        }
        charSequence.getClass();
        return charSequence.subSequence(i10, i11).toString();
    }

    public static final String substringAfter(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int indexOf$default = indexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return str3;
        }
        return str.substring(str2.length() + indexOf$default, str.length());
    }

    public static /* synthetic */ String substringAfter$default(String str, char c, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return substringAfter(str, c, str2);
    }

    public static final String substringAfterLast(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return str3;
        }
        return str.substring(str2.length() + lastIndexOf$default, str.length());
    }

    public static /* synthetic */ String substringAfterLast$default(String str, char c, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return substringAfterLast(str, c, str2);
    }

    public static final String substringBefore(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int indexOf$default = indexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return str3;
        }
        return str.substring(0, indexOf$default);
    }

    public static /* synthetic */ String substringBefore$default(String str, char c, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return substringBefore(str, c, str2);
    }

    public static final String substringBeforeLast(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return str3;
        }
        return str.substring(0, lastIndexOf$default);
    }

    public static /* synthetic */ String substringBeforeLast$default(String str, char c, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return substringBeforeLast(str, c, str2);
    }

    @SinceKotlin(version = "1.5")
    public static final boolean toBooleanStrict(String str) {
        str.getClass();
        if (Intrinsics.areEqual(str, "true")) {
            return true;
        }
        if (Intrinsics.areEqual(str, "false")) {
            return false;
        }
        j1.i.k(ai.onnxruntime.a.l("The string doesn't represent a boolean value: ", str));
        return false;
    }

    @SinceKotlin(version = "1.5")
    public static final Boolean toBooleanStrictOrNull(String str) {
        str.getClass();
        if (Intrinsics.areEqual(str, "true")) {
            return Boolean.TRUE;
        }
        if (Intrinsics.areEqual(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final String trim(String str, Function1<? super Character, Boolean> function1) {
        int i10;
        str.getClass();
        function1.getClass();
        int length = str.length() - 1;
        int i11 = 0;
        boolean z9 = false;
        while (i11 <= length) {
            if (!z9) {
                i10 = i11;
            } else {
                i10 = length;
            }
            boolean booleanValue = function1.invoke(Character.valueOf(str.charAt(i10))).booleanValue();
            if (!z9) {
                if (!booleanValue) {
                    z9 = true;
                } else {
                    i11++;
                }
            } else {
                if (!booleanValue) {
                    break;
                }
                length--;
            }
        }
        return str.subSequence(i11, length + 1).toString();
    }

    public static final String trimEnd(String str, Function1<? super Character, Boolean> function1) {
        CharSequence charSequence;
        str.getClass();
        function1.getClass();
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (!function1.invoke(Character.valueOf(str.charAt(length))).booleanValue()) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        charSequence = "";
        return charSequence.toString();
    }

    public static final String trimStart(String str, Function1<? super Character, Boolean> function1) {
        CharSequence charSequence;
        str.getClass();
        function1.getClass();
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (!function1.invoke(Character.valueOf(str.charAt(i10))).booleanValue()) {
                    charSequence = str.subSequence(i10, str.length());
                    break;
                }
                i10++;
            } else {
                charSequence = "";
                break;
            }
        }
        return charSequence.toString();
    }

    public static /* synthetic */ boolean contains$default(CharSequence charSequence, char c, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return contains(charSequence, c, z9);
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return endsWith(charSequence, charSequence2, z9);
    }

    public static /* synthetic */ String replaceAfter$default(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return replaceAfter(str, str2, str3, str4);
    }

    public static /* synthetic */ String replaceAfterLast$default(String str, char c, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        return replaceAfterLast(str, c, str2, str3);
    }

    public static /* synthetic */ String replaceBefore$default(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return replaceBefore(str, str2, str3, str4);
    }

    public static /* synthetic */ String replaceBeforeLast$default(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return replaceBeforeLast(str, str2, str3, str4);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return startsWith(charSequence, charSequence2, z9);
    }

    public static /* synthetic */ String substringAfter$default(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return substringAfter(str, str2, str3);
    }

    public static /* synthetic */ String substringAfterLast$default(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return substringAfterLast(str, str2, str3);
    }

    public static /* synthetic */ String substringBefore$default(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return substringBefore(str, str2, str3);
    }

    public static /* synthetic */ String substringBeforeLast$default(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return substringBeforeLast(str, str2, str3);
    }

    public static /* synthetic */ String padEnd$default(String str, int i10, char c, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c = ' ';
        }
        return padEnd(str, i10, c);
    }

    public static /* synthetic */ String padStart$default(String str, int i10, char c, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c = ' ';
        }
        return padStart(str, i10, c);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return startsWith(charSequence, charSequence2, i10, z9);
    }

    @InlineOnly
    private static final String replace(CharSequence charSequence, Regex regex, Function1<? super MatchResult, ? extends CharSequence> function1) {
        charSequence.getClass();
        regex.getClass();
        function1.getClass();
        return regex.replace(charSequence, function1);
    }

    public static /* synthetic */ int indexOf$default(CharSequence charSequence, String str, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return indexOf(charSequence, str, i10, z9);
    }

    public static /* synthetic */ int indexOfAny$default(CharSequence charSequence, Collection collection, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return indexOfAny(charSequence, (Collection<String>) collection, i10, z9);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, char[] cArr, boolean z9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z9 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return split(charSequence, cArr, z9, i10);
    }

    public static /* synthetic */ Sequence splitToSequence$default(CharSequence charSequence, char[] cArr, boolean z9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z9 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return splitToSequence(charSequence, cArr, z9, i10);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, Regex regex, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        charSequence.getClass();
        regex.getClass();
        return regex.split(charSequence, i10);
    }

    public static /* synthetic */ Sequence splitToSequence$default(CharSequence charSequence, Regex regex, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        charSequence.getClass();
        regex.getClass();
        return regex.splitToSequence(charSequence, i10);
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence charSequence, String str, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = getLastIndex(charSequence);
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return lastIndexOf(charSequence, str, i10, z9);
    }

    public static /* synthetic */ int lastIndexOfAny$default(CharSequence charSequence, Collection collection, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = getLastIndex(charSequence);
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return lastIndexOfAny(charSequence, (Collection<String>) collection, i10, z9);
    }

    private static final Sequence<IntRange> rangesDelimitedBy$StringsKt__StringsKt(CharSequence charSequence, char[] cArr, int i10, boolean z9, int i11) {
        requireNonNegativeLimit(i11);
        return new DelimitedRangesSequence(charSequence, i10, i11, new g(cArr, z9, 0));
    }

    public static /* synthetic */ Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence charSequence, String[] strArr, int i10, boolean z9, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z9 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return rangesDelimitedBy$StringsKt__StringsKt(charSequence, strArr, i10, z9, i11);
    }

    public static final Sequence<String> splitToSequence(CharSequence charSequence, char[] cArr, boolean z9, int i10) {
        charSequence.getClass();
        cArr.getClass();
        return SequencesKt.map(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, cArr, 0, z9, i10, 2, (Object) null), new f(charSequence, 0));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    private static final Sequence<String> splitToSequence(CharSequence charSequence, Regex regex, int i10) {
        charSequence.getClass();
        regex.getClass();
        return regex.splitToSequence(charSequence, i10);
    }

    @Deprecated(message = "Use parameters named startIndex and endIndex.", replaceWith = @ReplaceWith(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    @InlineOnly
    private static final CharSequence subSequence(String str, int i10, int i11) {
        str.getClass();
        return str.subSequence(i10, i11);
    }

    public static final String substringBefore(String str, char c, String str2) {
        str.getClass();
        str2.getClass();
        int indexOf$default = indexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        return indexOf$default == -1 ? str2 : str.substring(0, indexOf$default);
    }

    public static final String substringBeforeLast(String str, char c, String str2) {
        str.getClass();
        str2.getClass();
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        return lastIndexOf$default == -1 ? str2 : str.substring(0, lastIndexOf$default);
    }

    public static final int lastIndexOf(CharSequence charSequence, char c, int i10, boolean z9) {
        charSequence.getClass();
        return (z9 || !(charSequence instanceof String)) ? lastIndexOfAny(charSequence, new char[]{c}, i10, z9) : ((String) charSequence).lastIndexOf(c, i10);
    }

    @InlineOnly
    private static final String substring(CharSequence charSequence, int i10, int i11) {
        charSequence.getClass();
        return charSequence.subSequence(i10, i11).toString();
    }

    public static final String substring(String str, IntRange intRange) {
        str.getClass();
        intRange.getClass();
        return str.substring(intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1);
    }

    public static final String replaceBefore(String str, char c, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int indexOf$default = indexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        return indexOf$default == -1 ? str3 : replaceRange((CharSequence) str, 0, indexOf$default, (CharSequence) str2).toString();
    }

    public static final String replaceBeforeLast(String str, char c, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        return lastIndexOf$default == -1 ? str3 : replaceRange((CharSequence) str, 0, lastIndexOf$default, (CharSequence) str2).toString();
    }

    public static final int indexOf(CharSequence charSequence, char c, int i10, boolean z9) {
        charSequence.getClass();
        return (z9 || !(charSequence instanceof String)) ? indexOfAny(charSequence, new char[]{c}, i10, z9) : ((String) charSequence).indexOf(c, i10);
    }

    public static String removePrefix(String str, CharSequence charSequence) {
        str.getClass();
        charSequence.getClass();
        return startsWith$default((CharSequence) str, charSequence, false, 2, (Object) null) ? str.substring(charSequence.length()) : str;
    }

    public static final String substringAfter(String str, char c, String str2) {
        str.getClass();
        str2.getClass();
        int indexOf$default = indexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        return indexOf$default == -1 ? str2 : str.substring(indexOf$default + 1, str.length());
    }

    public static String substringAfterLast(String str, char c, String str2) {
        str.getClass();
        str2.getClass();
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        return lastIndexOf$default == -1 ? str2 : str.substring(lastIndexOf$default + 1, str.length());
    }

    public static String removeSuffix(String str, CharSequence charSequence) {
        str.getClass();
        charSequence.getClass();
        return endsWith$default((CharSequence) str, charSequence, false, 2, (Object) null) ? str.substring(0, str.length() - charSequence.length()) : str;
    }

    @InlineOnly
    private static final String replaceRange(String str, int i10, int i11, CharSequence charSequence) {
        str.getClass();
        charSequence.getClass();
        return replaceRange((CharSequence) str, i10, i11, charSequence).toString();
    }

    public static final CharSequence replaceRange(CharSequence charSequence, IntRange intRange, CharSequence charSequence2) {
        charSequence.getClass();
        intRange.getClass();
        charSequence2.getClass();
        return replaceRange(charSequence, intRange.getStart().intValue(), q.c(intRange, 1), charSequence2);
    }

    @InlineOnly
    private static final String replaceRange(String str, IntRange intRange, CharSequence charSequence) {
        str.getClass();
        intRange.getClass();
        charSequence.getClass();
        return replaceRange((CharSequence) str, intRange, charSequence).toString();
    }

    public static final String replaceAfter(String str, char c, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int indexOf$default = indexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        return indexOf$default == -1 ? str3 : replaceRange((CharSequence) str, indexOf$default + 1, str.length(), (CharSequence) str2).toString();
    }

    public static final String replaceAfterLast(String str, char c, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        return lastIndexOf$default == -1 ? str3 : replaceRange((CharSequence) str, lastIndexOf$default + 1, str.length(), (CharSequence) str2).toString();
    }

    public static final boolean startsWith(CharSequence charSequence, CharSequence charSequence2, boolean z9) {
        charSequence.getClass();
        charSequence2.getClass();
        if (!z9 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return StringsKt__StringsJVMKt.startsWith$default((String) charSequence, (String) charSequence2, false, 2, null);
        }
        return regionMatchesImpl(charSequence, 0, charSequence2, 0, charSequence2.length(), z9);
    }

    public static final boolean startsWith(CharSequence charSequence, char c, boolean z9) {
        charSequence.getClass();
        return charSequence.length() > 0 && CharsKt__CharKt.equals(charSequence.charAt(0), c, z9);
    }

    public static final boolean contains(CharSequence charSequence, char c, boolean z9) {
        charSequence.getClass();
        return indexOf$default(charSequence, c, 0, z9, 2, (Object) null) >= 0;
    }

    @InlineOnly
    private static final boolean contains(CharSequence charSequence, Regex regex) {
        charSequence.getClass();
        regex.getClass();
        return regex.containsMatchIn(charSequence);
    }

    public static final boolean endsWith(CharSequence charSequence, char c, boolean z9) {
        charSequence.getClass();
        return charSequence.length() > 0 && CharsKt__CharKt.equals(charSequence.charAt(getLastIndex(charSequence)), c, z9);
    }

    @InlineOnly
    private static final String removeRange(String str, int i10, int i11) {
        str.getClass();
        return removeRange((CharSequence) str, i10, i11).toString();
    }

    public static final CharSequence removeRange(CharSequence charSequence, IntRange intRange) {
        charSequence.getClass();
        intRange.getClass();
        return removeRange(charSequence, intRange.getStart().intValue(), q.c(intRange, 1));
    }

    @InlineOnly
    private static final String trimStart(String str) {
        str.getClass();
        return trimStart((CharSequence) str).toString();
    }

    public static final CharSequence trimStart(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        int b10 = kotlin.collections.unsigned.a.b(charSequence, function1);
        for (int i10 = 0; i10 < b10; i10++) {
            if (!((Boolean) kotlin.collections.unsigned.a.c(charSequence, i10, function1)).booleanValue()) {
                return charSequence.subSequence(i10, charSequence.length());
            }
        }
        return "";
    }

    @InlineOnly
    private static final String removeRange(String str, IntRange intRange) {
        str.getClass();
        intRange.getClass();
        return removeRange((CharSequence) str, intRange).toString();
    }

    @InlineOnly
    private static final String trimEnd(String str) {
        str.getClass();
        return trimEnd((CharSequence) str).toString();
    }

    public static final CharSequence trimEnd(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        charSequence.getClass();
        function1.getClass();
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i10 = length - 1;
            if (!((Boolean) kotlin.collections.unsigned.a.c(charSequence, length, function1)).booleanValue()) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i10 < 0) {
                return "";
            }
            length = i10;
        }
    }

    public static final CharSequence trimStart(CharSequence charSequence, char... cArr) {
        charSequence.getClass();
        cArr.getClass();
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!ArraysKt.contains(cArr, charSequence.charAt(i10))) {
                return charSequence.subSequence(i10, charSequence.length());
            }
        }
        return "";
    }

    public static final String padEnd(String str, int i10, char c) {
        str.getClass();
        return padEnd((CharSequence) str, i10, c).toString();
    }

    public static String padStart(String str, int i10, char c) {
        str.getClass();
        return padStart((CharSequence) str, i10, c).toString();
    }

    public static final int lastIndexOfAny(CharSequence charSequence, Collection<String> collection, int i10, boolean z9) {
        charSequence.getClass();
        collection.getClass();
        Pair<Integer, String> findAnyOf$StringsKt__StringsKt = findAnyOf$StringsKt__StringsKt(charSequence, collection, i10, z9, true);
        if (findAnyOf$StringsKt__StringsKt != null) {
            return findAnyOf$StringsKt__StringsKt.getFirst().intValue();
        }
        return -1;
    }

    public static final CharSequence trimEnd(CharSequence charSequence, char... cArr) {
        charSequence.getClass();
        cArr.getClass();
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i10 = length - 1;
            if (!ArraysKt.contains(cArr, charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i10 < 0) {
                return "";
            }
            length = i10;
        }
    }

    public static final String trimStart(String str, char... cArr) {
        CharSequence charSequence;
        str.getClass();
        cArr.getClass();
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (!ArraysKt.contains(cArr, str.charAt(i10))) {
                    charSequence = str.subSequence(i10, str.length());
                    break;
                }
                i10++;
            } else {
                charSequence = "";
                break;
            }
        }
        return charSequence.toString();
    }

    @InlineOnly
    private static final String trim(String str) {
        str.getClass();
        return trim((CharSequence) str).toString();
    }

    public static final int indexOfAny(CharSequence charSequence, Collection<String> collection, int i10, boolean z9) {
        charSequence.getClass();
        collection.getClass();
        Pair<Integer, String> findAnyOf$StringsKt__StringsKt = findAnyOf$StringsKt__StringsKt(charSequence, collection, i10, z9, false);
        if (findAnyOf$StringsKt__StringsKt != null) {
            return findAnyOf$StringsKt__StringsKt.getFirst().intValue();
        }
        return -1;
    }

    public static final CharSequence trim(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        charSequence.getClass();
        function1.getClass();
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z9 = false;
        while (i10 <= length) {
            boolean booleanValue = ((Boolean) kotlin.collections.unsigned.a.c(charSequence, !z9 ? i10 : length, function1)).booleanValue();
            if (z9) {
                if (!booleanValue) {
                    break;
                }
                length--;
            } else if (booleanValue) {
                i10++;
            } else {
                z9 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final String removeSurrounding(String str, CharSequence charSequence, CharSequence charSequence2) {
        str.getClass();
        charSequence.getClass();
        charSequence2.getClass();
        return (str.length() >= charSequence2.length() + charSequence.length() && startsWith$default((CharSequence) str, charSequence, false, 2, (Object) null) && endsWith$default((CharSequence) str, charSequence2, false, 2, (Object) null)) ? str.substring(charSequence.length(), str.length() - charSequence2.length()) : str;
    }

    public static final String trimEnd(String str, char... cArr) {
        CharSequence charSequence;
        str.getClass();
        cArr.getClass();
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (!ArraysKt.contains(cArr, str.charAt(length))) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    public static final CharSequence removeSurrounding(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        return removeSurrounding(charSequence, charSequence2, charSequence2);
    }

    public static String removeSurrounding(String str, CharSequence charSequence) {
        str.getClass();
        charSequence.getClass();
        return removeSurrounding(str, charSequence, charSequence);
    }

    public static final CharSequence trim(CharSequence charSequence, char... cArr) {
        charSequence.getClass();
        cArr.getClass();
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z9 = false;
        while (i10 <= length) {
            boolean contains = ArraysKt.contains(cArr, charSequence.charAt(!z9 ? i10 : length));
            if (z9) {
                if (!contains) {
                    break;
                }
                length--;
            } else if (contains) {
                i10++;
            } else {
                z9 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final CharSequence trimStart(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!CharsKt__CharJVMKt.isWhitespace(charSequence.charAt(i10))) {
                return charSequence.subSequence(i10, charSequence.length());
            }
        }
        return "";
    }

    public static final String trim(String str, char... cArr) {
        str.getClass();
        cArr.getClass();
        int length = str.length() - 1;
        int i10 = 0;
        boolean z9 = false;
        while (i10 <= length) {
            boolean contains = ArraysKt.contains(cArr, str.charAt(!z9 ? i10 : length));
            if (z9) {
                if (!contains) {
                    break;
                }
                length--;
            } else if (contains) {
                i10++;
            } else {
                z9 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    public static final CharSequence trimEnd(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i10 = length - 1;
            if (!CharsKt__CharJVMKt.isWhitespace(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i10 < 0) {
                return "";
            }
            length = i10;
        }
    }

    public static final List<String> split(CharSequence charSequence, char[] cArr, boolean z9, int i10) {
        charSequence.getClass();
        cArr.getClass();
        if (cArr.length == 1) {
            return split$StringsKt__StringsKt(charSequence, String.valueOf(cArr[0]), z9, i10);
        }
        Iterable asIterable = SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, cArr, 0, z9, i10, 2, (Object) null));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asIterable, 10));
        Iterator it = asIterable.iterator();
        while (it.hasNext()) {
            arrayList.add(substring(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static CharSequence trim(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z9 = false;
        while (i10 <= length) {
            boolean isWhitespace = CharsKt__CharJVMKt.isWhitespace(charSequence.charAt(!z9 ? i10 : length));
            if (z9) {
                if (!isWhitespace) {
                    break;
                }
                length--;
            } else if (isWhitespace) {
                i10++;
            } else {
                z9 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    @InlineOnly
    private static final List<String> split(CharSequence charSequence, Regex regex, int i10) {
        charSequence.getClass();
        regex.getClass();
        return regex.split(charSequence, i10);
    }
}
