package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavControllerViewModel;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.navigation.serialization.RouteSerializerKt;
import j1.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.SequencesKt;
import n.p;
import y8.f;
import y8.l;
import y8.m;
import y8.n;
import y8.q;
import y8.r;
import y8.t;
import y8.v;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000ü\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0016\u0018\u0000 ¥\u00022\u00020\u0001:\u0006¥\u0002¦\u0002§\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0017J)\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0019J)\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u001cJ.\u0010\u0012\u001a\u00020\u0011\"\n\b\u0000\u0010\u001d\u0018\u0001*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b\u0012\u0010\u001eJ3\u0010\u0012\u001a\u00020\u0011\"\b\b\u0000\u0010\u001d*\u00020\u00012\u0006\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u001fJ%\u0010%\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00062\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0!H\u0000¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b&\u0010'J\u0019\u0010&\u001a\u00020\u00112\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b&\u0010(J\u001c\u0010&\u001a\u00020\u0011\"\n\b\u0000\u0010\u001d\u0018\u0001*\u00020\u0001H\u0087\b¢\u0006\u0004\b&\u0010\u0013J!\u0010&\u001a\u00020\u0011\"\b\b\u0000\u0010\u001d*\u00020\u00012\u0006\u0010\u001b\u001a\u00028\u0000H\u0007¢\u0006\u0004\b&\u0010)J\u000f\u0010*\u001a\u00020\u0011H\u0017¢\u0006\u0004\b*\u0010\u0013J\u000f\u0010-\u001a\u00020\rH\u0000¢\u0006\u0004\b+\u0010,J\u0015\u00101\u001a\b\u0012\u0004\u0012\u00020\u00060.H\u0000¢\u0006\u0004\b/\u00100J\u0019\u00103\u001a\u00020\r2\b\b\u0001\u00102\u001a\u00020\u0014H\u0017¢\u0006\u0004\b3\u00104J#\u00103\u001a\u00020\r2\b\b\u0001\u00102\u001a\u00020\u00142\b\u00106\u001a\u0004\u0018\u000105H\u0017¢\u0006\u0004\b3\u00107J!\u00103\u001a\u00020\r2\u0006\u00109\u001a\u0002082\b\u00106\u001a\u0004\u0018\u000105H\u0017¢\u0006\u0004\b3\u0010:J\u0019\u0010=\u001a\u00020\u00112\b\u0010<\u001a\u0004\u0018\u00010;H\u0017¢\u0006\u0004\b=\u0010>J'\u0010A\u001a\u0004\u0018\u00010?2\b\b\u0001\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010@\u001a\u0004\u0018\u00010?H\u0007¢\u0006\u0004\bA\u0010BJ3\u0010D\u001a\u0004\u0018\u00010?*\u00020?2\b\b\u0001\u0010\u0015\u001a\u00020\u00142\u0006\u0010C\u001a\u00020\u00112\n\b\u0002\u0010@\u001a\u0004\u0018\u00010?H\u0007¢\u0006\u0004\bD\u0010EJ\u0019\u0010A\u001a\u0004\u0018\u00010?2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\bA\u0010FJ\u0019\u0010H\u001a\u00020\r2\b\b\u0001\u0010G\u001a\u00020\u0014H\u0017¢\u0006\u0004\bH\u00104J#\u0010H\u001a\u00020\r2\b\b\u0001\u0010G\u001a\u00020\u00142\b\u0010I\u001a\u0004\u0018\u000105H\u0017¢\u0006\u0004\bH\u00107J-\u0010H\u001a\u00020\r2\b\b\u0001\u0010G\u001a\u00020\u00142\b\u0010I\u001a\u0004\u0018\u0001052\b\u0010K\u001a\u0004\u0018\u00010JH\u0017¢\u0006\u0004\bH\u0010LJ7\u0010H\u001a\u00020\r2\b\b\u0001\u0010G\u001a\u00020\u00142\b\u0010I\u001a\u0004\u0018\u0001052\b\u0010K\u001a\u0004\u0018\u00010J2\b\u0010N\u001a\u0004\u0018\u00010MH\u0017¢\u0006\u0004\bH\u0010OJ\u0017\u0010H\u001a\u00020\r2\u0006\u0010Q\u001a\u00020PH\u0017¢\u0006\u0004\bH\u0010RJ!\u0010H\u001a\u00020\r2\u0006\u0010Q\u001a\u00020P2\b\u0010K\u001a\u0004\u0018\u00010JH\u0017¢\u0006\u0004\bH\u0010SJ+\u0010H\u001a\u00020\r2\u0006\u0010Q\u001a\u00020P2\b\u0010K\u001a\u0004\u0018\u00010J2\b\u0010N\u001a\u0004\u0018\u00010MH\u0017¢\u0006\u0004\bH\u0010TJ\u0017\u0010H\u001a\u00020\r2\u0006\u0010V\u001a\u00020UH\u0017¢\u0006\u0004\bH\u0010WJ!\u0010H\u001a\u00020\r2\u0006\u0010V\u001a\u00020U2\b\u0010K\u001a\u0004\u0018\u00010JH\u0017¢\u0006\u0004\bH\u0010XJ+\u0010H\u001a\u00020\r2\u0006\u0010V\u001a\u00020U2\b\u0010K\u001a\u0004\u0018\u00010J2\b\u0010N\u001a\u0004\u0018\u00010MH\u0017¢\u0006\u0004\bH\u0010YJ\u0017\u0010H\u001a\u00020\r2\u0006\u0010[\u001a\u00020ZH\u0017¢\u0006\u0004\bH\u0010\\J!\u0010H\u001a\u00020\r2\u0006\u0010[\u001a\u00020Z2\b\u0010K\u001a\u0004\u0018\u00010JH\u0017¢\u0006\u0004\bH\u0010]J\u001f\u0010H\u001a\u00020\r2\u0006\u0010[\u001a\u00020Z2\u0006\u0010N\u001a\u00020MH\u0017¢\u0006\u0004\bH\u0010^J0\u0010H\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a2\u0017\u0010b\u001a\u0013\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\r0_¢\u0006\u0002\baH\u0007¢\u0006\u0004\bH\u0010cJ/\u0010H\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010J2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010MH\u0007¢\u0006\u0004\bH\u0010dJ:\u0010H\u001a\u00020\r\"\b\b\u0000\u0010\u001d*\u00020\u00012\u0006\u0010\u001b\u001a\u00028\u00002\u0017\u0010b\u001a\u0013\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\r0_¢\u0006\u0002\baH\u0007¢\u0006\u0004\bH\u0010eJ9\u0010H\u001a\u00020\r\"\b\b\u0000\u0010\u001d*\u00020\u00012\u0006\u0010\u001b\u001a\u00028\u00002\n\b\u0002\u0010K\u001a\u0004\u0018\u00010J2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010MH\u0007¢\u0006\u0004\bH\u0010fJ\u000f\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bh\u0010iJ\u0011\u0010\u0018\u001a\u0004\u0018\u000105H\u0017¢\u0006\u0004\b\u0018\u0010jJ\u0019\u0010l\u001a\u00020\r2\b\u0010k\u001a\u0004\u0018\u000105H\u0017¢\u0006\u0004\bl\u0010mJ\u0017\u0010p\u001a\u00020\r2\u0006\u0010o\u001a\u00020nH\u0017¢\u0006\u0004\bp\u0010qJ\u0017\u0010t\u001a\u00020\r2\u0006\u0010s\u001a\u00020rH\u0017¢\u0006\u0004\bt\u0010uJ\u0017\u0010w\u001a\u00020\r2\u0006\u0010v\u001a\u00020\u0011H\u0017¢\u0006\u0004\bw\u0010xJ\u0017\u0010{\u001a\u00020\r2\u0006\u0010z\u001a\u00020yH\u0017¢\u0006\u0004\b{\u0010|J\u001a\u0010\u007f\u001a\u00020~2\b\b\u0001\u0010}\u001a\u00020\u0014H\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001c\u0010\u0081\u0001\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0018\u0010\u0081\u0001\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0006\b\u0081\u0001\u0010\u0083\u0001J\u001f\u0010\u0081\u0001\u001a\u00020\u0006\"\n\b\u0000\u0010\u001d\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0006\b\u0081\u0001\u0010\u0084\u0001J\"\u0010\u0081\u0001\u001a\u00020\u0006\"\b\b\u0000\u0010\u001d*\u00020\u00012\u0006\u0010\u001b\u001a\u00028\u0000¢\u0006\u0006\b\u0081\u0001\u0010\u0085\u0001J#\u0010\u0087\u0001\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0007\u0010\u0086\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001Jk\u0010\u008f\u0001\u001a\u00020\r*\u000b\u0012\u0006\b\u0001\u0012\u00020?0\u0089\u00012\r\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060.2\b\u0010K\u001a\u0004\u0018\u00010J2\b\u0010N\u001a\u0004\u0018\u00010M2'\b\u0002\u0010\u008e\u0001\u001a \u0012\u0016\u0012\u00140\u0006¢\u0006\u000f\b\u008b\u0001\u0012\n\b\u008c\u0001\u0012\u0005\b\b(\u008d\u0001\u0012\u0004\u0012\u00020\r0_H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001JW\u0010\u0091\u0001\u001a\u00020\r*\u000b\u0012\u0006\b\u0001\u0012\u00020?0\u0089\u00012\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00112&\b\u0002\u0010\u008e\u0001\u001a\u001f\u0012\u0015\u0012\u00130\u0006¢\u0006\u000e\b\u008b\u0001\u0012\t\b\u008c\u0001\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\r0_H\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J-\u0010\u0091\u0001\u001a\u00020\u00112\b\b\u0001\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u0011H\u0003¢\u0006\u0005\b\u0091\u0001\u0010\u0019J5\u0010\u0091\u0001\u001a\u00020\u0011\"\b\b\u0000\u0010\u001d*\u00020\u00012\u0006\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0091\u0001\u0010\u001fJ)\u0010\u0091\u0001\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0091\u0001\u0010\u001cJ?\u0010\u0095\u0001\u001a\u00020\u00112\u0012\u0010\u0093\u0001\u001a\r\u0012\t\u0012\u0007\u0012\u0002\b\u00030\u0089\u00010.2\u0007\u0010\u0094\u0001\u001a\u00020?2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J7\u0010\u009a\u0001\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00112\u0011\b\u0002\u0010\u0099\u0001\u001a\n\u0012\u0005\u0012\u00030\u0098\u00010\u0097\u0001H\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u001b\u0010\u009c\u0001\u001a\u00020\u00112\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0005\b\u009c\u0001\u0010(J\u0019\u0010\u009c\u0001\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0005\b\u009c\u0001\u0010'J\u0011\u0010\u009d\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u009d\u0001\u0010\u0013J\u0011\u0010\u009e\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u009e\u0001\u0010\u0013J\u0011\u0010\u009f\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u009f\u0001\u0010\u0013J\u001b\u0010 \u0001\u001a\u00020\r2\b\u00106\u001a\u0004\u0018\u000105H\u0003¢\u0006\u0005\b \u0001\u0010mJ\u001d\u0010¢\u0001\u001a\u0004\u0018\u00010\u001a2\u0007\u0010Q\u001a\u00030¡\u0001H\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u001d\u0010¤\u0001\u001a\u000208*\t\u0012\u0004\u0012\u00020\u00060\u0097\u0001H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J$\u0010¦\u0001\u001a\u00020\u001a\"\b\b\u0000\u0010\u001d*\u00020\u00012\u0006\u0010\u001b\u001a\u00028\u0000H\u0002¢\u0006\u0006\b¦\u0001\u0010§\u0001J7\u0010H\u001a\u00020\r2\u0007\u0010¨\u0001\u001a\u00020?2\b\u0010I\u001a\u0004\u0018\u0001052\b\u0010K\u001a\u0004\u0018\u00010J2\b\u0010N\u001a\u0004\u0018\u00010MH\u0003¢\u0006\u0005\bH\u0010©\u0001J%\u0010ª\u0001\u001a\u00020\u00112\u0007\u0010¨\u0001\u001a\u00020?2\b\u0010I\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0006\bª\u0001\u0010«\u0001J9\u0010\u00ad\u0001\u001a\u00020\u00112\u0007\u0010¬\u0001\u001a\u00020\u00142\b\u0010I\u001a\u0004\u0018\u0001052\b\u0010K\u001a\u0004\u0018\u00010J2\b\u0010N\u001a\u0004\u0018\u00010MH\u0002¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u0019\u0010\u00ad\u0001\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0005\b\u00ad\u0001\u0010'J?\u0010¯\u0001\u001a\u00020\u00112\r\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060.2\b\u0010I\u001a\u0004\u0018\u0001052\b\u0010K\u001a\u0004\u0018\u00010J2\b\u0010N\u001a\u0004\u0018\u00010MH\u0002¢\u0006\u0006\b¯\u0001\u0010°\u0001J+\u0010²\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060.2\u0011\u0010±\u0001\u001a\f\u0012\u0005\u0012\u00030\u0098\u0001\u0018\u00010\u0097\u0001H\u0002¢\u0006\u0006\b²\u0001\u0010³\u0001J@\u0010¶\u0001\u001a\u00020\r2\u0007\u0010¨\u0001\u001a\u00020?2\t\u0010´\u0001\u001a\u0004\u0018\u0001052\u0007\u0010\u008d\u0001\u001a\u00020\u00062\u000f\b\u0002\u0010µ\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060.H\u0002¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u0011\u0010¸\u0001\u001a\u00020\rH\u0002¢\u0006\u0005\b¸\u0001\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u000f\n\u0005\b\u0003\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001R\u001c\u0010½\u0001\u001a\u0005\u0018\u00010¼\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u001c\u0010À\u0001\u001a\u0005\u0018\u00010¿\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u001b\u0010Â\u0001\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u001b\u0010Ä\u0001\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R#\u0010È\u0001\u001a\f\u0012\u0005\u0012\u00030Ç\u0001\u0018\u00010Æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u0019\u0010Ê\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u001e\u0010Ì\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R$\u0010Ï\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060.0Î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R,\u0010Ò\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060.0Ñ\u00018GX\u0087\u0004¢\u0006\u0010\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001R$\u0010Ö\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060.0Î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010Ð\u0001R)\u0010×\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060.0Ñ\u00018\u0006¢\u0006\u0010\n\u0006\b×\u0001\u0010Ó\u0001\u001a\u0006\bØ\u0001\u0010Õ\u0001R$\u0010Ú\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R%\u0010Ý\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030Ü\u00010Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÝ\u0001\u0010Û\u0001R&\u0010Þ\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001a0Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010Û\u0001R,\u0010ß\u0001\u001a\u0017\u0012\u0004\u0012\u00020\u001a\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0098\u00010\u0097\u00010Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bß\u0001\u0010Û\u0001R\u001b\u0010à\u0001\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u001b\u0010â\u0001\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u001c\u0010å\u0001\u001a\u0005\u0018\u00010ä\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0001\u0010æ\u0001R\u001e\u0010è\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0ç\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bè\u0001\u0010é\u0001R*\u0010ë\u0001\u001a\u00030ê\u00018@@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bë\u0001\u0010ì\u0001\u001a\u0006\bí\u0001\u0010î\u0001\"\u0006\bï\u0001\u0010ð\u0001R\u0018\u0010ò\u0001\u001a\u00030ñ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bò\u0001\u0010ó\u0001R\u0018\u0010õ\u0001\u001a\u00030ô\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bõ\u0001\u0010ö\u0001R\u0019\u0010÷\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b÷\u0001\u0010Ë\u0001R\u001a\u0010ù\u0001\u001a\u00030ø\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bù\u0001\u0010ú\u0001R2\u0010ü\u0001\u001a\u001d\u0012\r\u0012\u000b\u0012\u0006\b\u0001\u0012\u00020?0\u0089\u0001\u0012\t\u0012\u00070û\u0001R\u00020\u00000Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bü\u0001\u0010Û\u0001R9\u0010ý\u0001\u001a\"\u0012\u0016\u0012\u00140\u0006¢\u0006\u000f\b\u008b\u0001\u0012\n\b\u008c\u0001\u0012\u0005\b\b(\u008d\u0001\u0012\u0004\u0012\u00020\r\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bý\u0001\u0010þ\u0001R8\u0010ÿ\u0001\u001a!\u0012\u0015\u0012\u00130\u0006¢\u0006\u000e\b\u008b\u0001\u0012\t\b\u008c\u0001\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\r\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÿ\u0001\u0010þ\u0001R$\u0010\u0080\u0002\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0002\u0010Û\u0001R\u0019\u0010\u0081\u0002\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0002\u0010\u0082\u0002R\u001e\u0010\u0084\u0002\u001a\t\u0012\u0004\u0012\u00020\u00060\u0083\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0085\u0002R!\u0010\u008a\u0002\u001a\u00030¿\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u0086\u0002\u0010\u0087\u0002\u001a\u0006\b\u0088\u0002\u0010\u0089\u0002R\u001e\u0010\u008c\u0002\u001a\t\u0012\u0004\u0012\u00020\u00060\u008b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0002\u0010\u008d\u0002R#\u0010\u008f\u0002\u001a\t\u0012\u0004\u0012\u00020\u00060\u008e\u00028\u0006¢\u0006\u0010\n\u0006\b\u008f\u0002\u0010\u0090\u0002\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002R'\u00109\u001a\u0002082\u0006\u00109\u001a\u0002088W@WX\u0096\u000e¢\u0006\u000f\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002\"\u0005\b3\u0010\u0095\u0002R,\u0010\u0096\u0002\u001a\u00030ø\u00012\b\u0010\u0096\u0002\u001a\u00030ø\u00018V@WX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0097\u0002\u0010\u0098\u0002\"\u0006\b\u0099\u0002\u0010\u009a\u0002R\u0019\u0010\u009d\u0002\u001a\u0004\u0018\u00010?8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002R\u0019\u0010\u009f\u0002\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009e\u0002\u0010\u0084\u0001R\u0019\u0010¡\u0002\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\b\u001a\u0006\b \u0002\u0010\u0084\u0001R\u0017\u0010¤\u0002\u001a\u00020\u00148BX\u0082\u0004¢\u0006\b\u001a\u0006\b¢\u0002\u0010£\u0002¨\u0006¨\u0002"}, d2 = {"Landroidx/navigation/NavController;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/navigation/NavBackStackEntry;", "child", "unlinkChildFromParent$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;)Landroidx/navigation/NavBackStackEntry;", "unlinkChildFromParent", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "listener", "", "addOnDestinationChangedListener", "(Landroidx/navigation/NavController$OnDestinationChangedListener;)V", "removeOnDestinationChangedListener", "", "popBackStack", "()Z", "", "destinationId", "inclusive", "(IZ)Z", "saveState", "(IZZ)Z", "", "route", "(Ljava/lang/String;ZZ)Z", ExifInterface.GPS_DIRECTION_TRUE, "(ZZ)Z", "(Ljava/lang/Object;ZZ)Z", "popUpTo", "Lkotlin/Function0;", "onComplete", "popBackStackFromNavigator$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;Lkotlin/jvm/functions/Function0;)V", "popBackStackFromNavigator", "clearBackStack", "(Ljava/lang/String;)Z", "(I)Z", "(Ljava/lang/Object;)Z", "navigateUp", "updateBackStackLifecycle$navigation_runtime_release", "()V", "updateBackStackLifecycle", "", "populateVisibleEntries$navigation_runtime_release", "()Ljava/util/List;", "populateVisibleEntries", "graphResId", "setGraph", "(I)V", "Landroid/os/Bundle;", "startDestinationArgs", "(ILandroid/os/Bundle;)V", "Landroidx/navigation/NavGraph;", "graph", "(Landroidx/navigation/NavGraph;Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "handleDeepLink", "(Landroid/content/Intent;)Z", "Landroidx/navigation/NavDestination;", "matchingDest", "findDestination", "(ILandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;", "searchChildren", "findDestinationComprehensive", "(Landroidx/navigation/NavDestination;IZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;", "(Ljava/lang/String;)Landroidx/navigation/NavDestination;", "resId", "navigate", "args", "Landroidx/navigation/NavOptions;", "navOptions", "(ILandroid/os/Bundle;Landroidx/navigation/NavOptions;)V", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "(ILandroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Landroid/net/Uri;", "deepLink", "(Landroid/net/Uri;)V", "(Landroid/net/Uri;Landroidx/navigation/NavOptions;)V", "(Landroid/net/Uri;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Landroidx/navigation/NavDeepLinkRequest;", "request", "(Landroidx/navigation/NavDeepLinkRequest;)V", "(Landroidx/navigation/NavDeepLinkRequest;Landroidx/navigation/NavOptions;)V", "(Landroidx/navigation/NavDeepLinkRequest;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Landroidx/navigation/NavDirections;", "directions", "(Landroidx/navigation/NavDirections;)V", "(Landroidx/navigation/NavDirections;Landroidx/navigation/NavOptions;)V", "(Landroidx/navigation/NavDirections;Landroidx/navigation/Navigator$Extras;)V", "Lkotlin/Function1;", "Landroidx/navigation/NavOptionsBuilder;", "Lkotlin/ExtensionFunctionType;", "builder", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/Object;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Landroidx/navigation/NavDeepLinkBuilder;", "createDeepLink", "()Landroidx/navigation/NavDeepLinkBuilder;", "()Landroid/os/Bundle;", "navState", "restoreState", "(Landroid/os/Bundle;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/activity/OnBackPressedDispatcher;", "dispatcher", "setOnBackPressedDispatcher", "(Landroidx/activity/OnBackPressedDispatcher;)V", "enabled", "enableOnBackPressed", "(Z)V", "Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "setViewModelStore", "(Landroidx/lifecycle/ViewModelStore;)V", "navGraphId", "Landroidx/lifecycle/ViewModelStoreOwner;", "getViewModelStoreOwner", "(I)Landroidx/lifecycle/ViewModelStoreOwner;", "getBackStackEntry", "(I)Landroidx/navigation/NavBackStackEntry;", "(Ljava/lang/String;)Landroidx/navigation/NavBackStackEntry;", "()Landroidx/navigation/NavBackStackEntry;", "(Ljava/lang/Object;)Landroidx/navigation/NavBackStackEntry;", "parent", "linkChildToParent", "(Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/NavBackStackEntry;)V", "Landroidx/navigation/Navigator;", "entries", "Lkotlin/ParameterName;", "name", "backStackEntry", "handler", "navigateInternal", "(Landroidx/navigation/Navigator;Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;Lkotlin/jvm/functions/Function1;)V", "popBackStackInternal", "(Landroidx/navigation/Navigator;Landroidx/navigation/NavBackStackEntry;ZLkotlin/jvm/functions/Function1;)V", "popOperations", "foundDestination", "executePopOperations", "(Ljava/util/List;Landroidx/navigation/NavDestination;ZZ)Z", "Lkotlin/collections/ArrayDeque;", "Landroidx/navigation/NavBackStackEntryState;", "savedState", "popEntryFromBackStack", "(Landroidx/navigation/NavBackStackEntry;ZLkotlin/collections/ArrayDeque;)V", "clearBackStackInternal", "tryRelaunchUpToExplicitStack", "tryRelaunchUpToGeneratedStack", "dispatchOnDestinationChanged", "onGraphCreated", "", "findInvalidDestinationDisplayNameInDeepLink", "([I)Ljava/lang/String;", "getTopGraph", "(Lkotlin/collections/ArrayDeque;)Landroidx/navigation/NavGraph;", "generateRouteFilled", "(Ljava/lang/Object;)Ljava/lang/String;", "node", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "launchSingleTopInternal", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;)Z", "id", "restoreStateInternal", "(ILandroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)Z", "executeRestoreState", "(Ljava/util/List;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)Z", "backStackState", "instantiateBackStack", "(Lkotlin/collections/ArrayDeque;)Ljava/util/List;", "finalArgs", "restoredEntries", "addEntryToBackStack", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/navigation/NavBackStackEntry;Ljava/util/List;)V", "updateOnBackPressedCallbackEnabled", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "Landroidx/navigation/NavInflater;", "inflater", "Landroidx/navigation/NavInflater;", "_graph", "Landroidx/navigation/NavGraph;", "navigatorStateToRestore", "Landroid/os/Bundle;", "", "Landroid/os/Parcelable;", "backStackToRestore", "[Landroid/os/Parcelable;", "deepLinkHandled", "Z", "backQueue", "Lkotlin/collections/ArrayDeque;", "Ly8/m;", "_currentBackStack", "Ly8/m;", "Ly8/t;", "currentBackStack", "Ly8/t;", "getCurrentBackStack", "()Ly8/t;", "_visibleEntries", "visibleEntries", "getVisibleEntries", "", "childToParentEntries", "Ljava/util/Map;", "Ljava/util/concurrent/atomic/AtomicInteger;", "parentToChildCount", "backStackMap", "backStackStates", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onBackPressedDispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "Landroidx/navigation/NavControllerViewModel;", "viewModel", "Landroidx/navigation/NavControllerViewModel;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onDestinationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "getHostLifecycleState$navigation_runtime_release", "()Landroidx/lifecycle/Lifecycle$State;", "setHostLifecycleState$navigation_runtime_release", "(Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/lifecycle/LifecycleObserver;", "lifecycleObserver", "Landroidx/lifecycle/LifecycleObserver;", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "enableOnBackPressedCallback", "Landroidx/navigation/NavigatorProvider;", "_navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "Landroidx/navigation/NavController$NavControllerNavigatorState;", "navigatorState", "addToBackStackHandler", "Lkotlin/jvm/functions/Function1;", "popFromBackStackHandler", "entrySavedState", "dispatchReentrantCount", "I", "", "backStackEntriesToDispatch", "Ljava/util/List;", "navInflater$delegate", "Lkotlin/Lazy;", "getNavInflater", "()Landroidx/navigation/NavInflater;", "navInflater", "Ly8/l;", "_currentBackStackEntryFlow", "Ly8/l;", "Ly8/f;", "currentBackStackEntryFlow", "Ly8/f;", "getCurrentBackStackEntryFlow", "()Ly8/f;", "getGraph", "()Landroidx/navigation/NavGraph;", "(Landroidx/navigation/NavGraph;)V", "navigatorProvider", "getNavigatorProvider", "()Landroidx/navigation/NavigatorProvider;", "setNavigatorProvider", "(Landroidx/navigation/NavigatorProvider;)V", "getCurrentDestination", "()Landroidx/navigation/NavDestination;", "currentDestination", "getCurrentBackStackEntry", "currentBackStackEntry", "getPreviousBackStackEntry", "previousBackStackEntry", "getDestinationCountOnBackStack", "()I", "destinationCountOnBackStack", "Companion", "NavControllerNavigatorState", "OnDestinationChangedListener", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 7 Uri.kt\nandroidx/core/net/UriKt\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,2927:1\n537#1,10:3077\n179#2,2:2928\n1313#2,2:2938\n1313#2,2:2940\n179#2,2:3075\n1#3:2930\n146#4:2931\n533#5,6:2932\n1855#5,2:2942\n1855#5,2:2944\n1855#5,2:2946\n1855#5,2:2948\n1864#5,3:2950\n1774#5,4:2953\n1855#5:2957\n766#5:2958\n857#5,2:2959\n1856#5:2961\n766#5:2962\n857#5,2:2963\n766#5:2965\n857#5,2:2966\n1855#5,2:2968\n1855#5:2970\n1789#5,3:2971\n1856#5:2974\n819#5:2982\n847#5,2:2983\n1855#5:2985\n1856#5:2993\n1238#5,4:2996\n1855#5,2:3000\n1855#5,2:3002\n378#5,7:3004\n1549#5:3011\n1620#5,3:3012\n1855#5,2:3015\n1855#5,2:3017\n819#5:3019\n847#5,2:3020\n1855#5,2:3022\n1855#5,2:3024\n533#5,6:3026\n533#5,6:3032\n533#5,6:3038\n1855#5,2:3044\n1855#5,2:3046\n1864#5,3:3049\n1855#5,2:3055\n533#5,6:3057\n533#5,6:3063\n533#5,6:3069\n372#6,7:2975\n372#6,7:2986\n453#6:2994\n403#6:2995\n29#7:3048\n13404#8,3:3052\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController\n*L\n-1#1:3077,10\n86#1:2928,2\n724#1:2938,2\n745#1:2940,2\n2810#1:3075,2\n169#1:2931\n662#1:2932,6\n902#1:2942,2\n905#1:2944,2\n911#1:2946,2\n913#1:2948,2\n992#1:2950,3\n1054#1:2953,4\n1198#1:2957\n1200#1:2958\n1200#1:2959,2\n1198#1:2961\n1208#1:2962\n1208#1:2963,2\n1211#1:2965\n1211#1:2966,2\n1282#1:2968,2\n1296#1:2970\n1300#1:2971,3\n1296#1:2974\n1359#1:2982\n1359#1:2983,2\n1360#1:2985\n1360#1:2993\n1711#1:2996,4\n1991#1:3000,2\n2054#1:3002,2\n2064#1:3004,7\n2073#1:3011\n2073#1:3012,3\n2090#1:3015,2\n2100#1:3017,2\n2167#1:3019\n2167#1:3020,2\n2171#1:3022,2\n2215#1:3024,2\n2257#1:3026,6\n2289#1:3032,6\n2318#1:3038,6\n2332#1:3044,2\n2348#1:3046,2\n2563#1:3049,3\n2604#1:3055,2\n2704#1:3057,6\n2725#1:3063,6\n2751#1:3069,6\n1346#1:2975,7\n1362#1:2986,7\n1711#1:2994\n1711#1:2995\n2441#1:3048\n2601#1:3052,3\n*E\n"})
/* loaded from: classes.dex */
public class NavController {
    private static final String KEY_BACK_STACK = "android-support-nav:controller:backStack";
    private static final String KEY_BACK_STACK_DEST_IDS = "android-support-nav:controller:backStackDestIds";
    private static final String KEY_BACK_STACK_IDS = "android-support-nav:controller:backStackIds";
    private static final String KEY_BACK_STACK_STATES_IDS = "android-support-nav:controller:backStackStates";
    private static final String KEY_BACK_STACK_STATES_PREFIX = "android-support-nav:controller:backStackStates:";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_ARGS = "android-support-nav:controller:deepLinkArgs";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_EXTRAS = "android-support-nav:controller:deepLinkExtras";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_HANDLED = "android-support-nav:controller:deepLinkHandled";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_IDS = "android-support-nav:controller:deepLinkIds";
    public static final String KEY_DEEP_LINK_INTENT = "android-support-nav:controller:deepLinkIntent";
    private static final String KEY_NAVIGATOR_STATE = "android-support-nav:controller:navigatorState";
    private static final String KEY_NAVIGATOR_STATE_NAMES = "android-support-nav:controller:navigatorState:names";
    private static final String TAG = "NavController";
    private final m _currentBackStack;
    private final l _currentBackStackEntryFlow;
    private NavGraph _graph;
    private NavigatorProvider _navigatorProvider;
    private final m _visibleEntries;
    private Activity activity;
    private Function1<? super NavBackStackEntry, Unit> addToBackStackHandler;
    private final ArrayDeque<NavBackStackEntry> backQueue;
    private final List<NavBackStackEntry> backStackEntriesToDispatch;
    private final Map<Integer, String> backStackMap;
    private final Map<String, ArrayDeque<NavBackStackEntryState>> backStackStates;
    private Parcelable[] backStackToRestore;
    private final Map<NavBackStackEntry, NavBackStackEntry> childToParentEntries;
    private final Context context;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private final t currentBackStack;
    private final f currentBackStackEntryFlow;
    private boolean deepLinkHandled;
    private int dispatchReentrantCount;
    private boolean enableOnBackPressedCallback;
    private final Map<NavBackStackEntry, Boolean> entrySavedState;
    private Lifecycle.State hostLifecycleState;
    private NavInflater inflater;
    private final LifecycleObserver lifecycleObserver;
    private LifecycleOwner lifecycleOwner;

    /* renamed from: navInflater$delegate, reason: from kotlin metadata */
    private final Lazy navInflater;
    private final Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> navigatorState;
    private Bundle navigatorStateToRestore;
    private final OnBackPressedCallback onBackPressedCallback;
    private OnBackPressedDispatcher onBackPressedDispatcher;
    private final CopyOnWriteArrayList<OnDestinationChangedListener> onDestinationChangedListeners;
    private final Map<NavBackStackEntry, AtomicInteger> parentToChildCount;
    private Function1<? super NavBackStackEntry, Unit> popFromBackStackHandler;
    private NavControllerViewModel viewModel;
    private final t visibleEntries;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean deepLinkSaveState = true;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0019\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Landroidx/navigation/NavController$NavControllerNavigatorState;", "Landroidx/navigation/NavigatorState;", "navigator", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "(Landroidx/navigation/NavController;Landroidx/navigation/Navigator;)V", "getNavigator", "()Landroidx/navigation/Navigator;", "addInternal", "", "backStackEntry", "Landroidx/navigation/NavBackStackEntry;", "createBackStackEntry", "destination", "arguments", "Landroid/os/Bundle;", "markTransitionComplete", "entry", "pop", "popUpTo", "saveState", "", "popWithTransition", "prepareForTransition", "push", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController$NavControllerNavigatorState\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2927:1\n146#2:2928\n146#2:2929\n2624#3,3:2930\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController$NavControllerNavigatorState\n*L\n297#1:2928\n330#1:2929\n360#1:2930,3\n*E\n"})
    /* loaded from: classes.dex */
    public final class NavControllerNavigatorState extends NavigatorState {
        private final Navigator<? extends NavDestination> navigator;
        final /* synthetic */ NavController this$0;

        public NavControllerNavigatorState(NavController navController, Navigator<? extends NavDestination> navigator) {
            navigator.getClass();
            this.this$0 = navController;
            this.navigator = navigator;
        }

        public final void addInternal(NavBackStackEntry backStackEntry) {
            backStackEntry.getClass();
            super.push(backStackEntry);
        }

        @Override // androidx.navigation.NavigatorState
        public NavBackStackEntry createBackStackEntry(NavDestination destination, Bundle arguments) {
            destination.getClass();
            return NavBackStackEntry.Companion.create$default(NavBackStackEntry.INSTANCE, this.this$0.getContext(), destination, arguments, this.this$0.getHostLifecycleState$navigation_runtime_release(), this.this$0.viewModel, null, null, 96, null);
        }

        public final Navigator<? extends NavDestination> getNavigator() {
            return this.navigator;
        }

        @Override // androidx.navigation.NavigatorState
        public void markTransitionComplete(NavBackStackEntry entry) {
            NavControllerViewModel navControllerViewModel;
            entry.getClass();
            boolean areEqual = Intrinsics.areEqual(this.this$0.entrySavedState.get(entry), Boolean.TRUE);
            super.markTransitionComplete(entry);
            this.this$0.entrySavedState.remove(entry);
            if (!this.this$0.backQueue.contains(entry)) {
                this.this$0.unlinkChildFromParent$navigation_runtime_release(entry);
                if (entry.getLifecycle().getState().isAtLeast(Lifecycle.State.CREATED)) {
                    entry.setMaxLifecycle(Lifecycle.State.DESTROYED);
                }
                ArrayDeque arrayDeque = this.this$0.backQueue;
                if (arrayDeque == null || !arrayDeque.isEmpty()) {
                    Iterator<E> it = arrayDeque.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(((NavBackStackEntry) it.next()).getId(), entry.getId())) {
                            break;
                        }
                    }
                }
                if (!areEqual && (navControllerViewModel = this.this$0.viewModel) != null) {
                    navControllerViewModel.clear(entry.getId());
                }
                this.this$0.updateBackStackLifecycle$navigation_runtime_release();
                ((v) this.this$0._visibleEntries).f(this.this$0.populateVisibleEntries$navigation_runtime_release());
                return;
            }
            if (!getIsNavigating()) {
                this.this$0.updateBackStackLifecycle$navigation_runtime_release();
                ((v) this.this$0._currentBackStack).f(CollectionsKt.toMutableList((Collection) this.this$0.backQueue));
                ((v) this.this$0._visibleEntries).f(this.this$0.populateVisibleEntries$navigation_runtime_release());
            }
        }

        @Override // androidx.navigation.NavigatorState
        public void pop(final NavBackStackEntry popUpTo, final boolean saveState) {
            popUpTo.getClass();
            Navigator navigator = this.this$0._navigatorProvider.getNavigator(popUpTo.getDestination().getNavigatorName());
            this.this$0.entrySavedState.put(popUpTo, Boolean.valueOf(saveState));
            boolean areEqual = Intrinsics.areEqual(navigator, this.navigator);
            NavController navController = this.this$0;
            if (areEqual) {
                Function1 function1 = navController.popFromBackStackHandler;
                if (function1 != null) {
                    function1.invoke(popUpTo);
                    super.pop(popUpTo, saveState);
                    return;
                } else {
                    this.this$0.popBackStackFromNavigator$navigation_runtime_release(popUpTo, new Function0<Unit>() { // from class: androidx.navigation.NavController$NavControllerNavigatorState$pop$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            super/*androidx.navigation.NavigatorState*/.pop(popUpTo, saveState);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }
                    });
                    return;
                }
            }
            Object obj = navController.navigatorState.get(navigator);
            obj.getClass();
            ((NavControllerNavigatorState) obj).pop(popUpTo, saveState);
        }

        @Override // androidx.navigation.NavigatorState
        public void popWithTransition(NavBackStackEntry popUpTo, boolean saveState) {
            popUpTo.getClass();
            super.popWithTransition(popUpTo, saveState);
        }

        @Override // androidx.navigation.NavigatorState
        public void prepareForTransition(NavBackStackEntry entry) {
            entry.getClass();
            super.prepareForTransition(entry);
            if (this.this$0.backQueue.contains(entry)) {
                entry.setMaxLifecycle(Lifecycle.State.STARTED);
            } else {
                i.l("Cannot transition entry that is not in the back stack");
            }
        }

        @Override // androidx.navigation.NavigatorState
        public void push(NavBackStackEntry backStackEntry) {
            backStackEntry.getClass();
            Navigator navigator = this.this$0._navigatorProvider.getNavigator(backStackEntry.getDestination().getNavigatorName());
            boolean areEqual = Intrinsics.areEqual(navigator, this.navigator);
            NavController navController = this.this$0;
            if (areEqual) {
                Function1 function1 = navController.addToBackStackHandler;
                if (function1 != null) {
                    function1.invoke(backStackEntry);
                    addInternal(backStackEntry);
                    return;
                } else {
                    Log.i(NavController.TAG, "Ignoring add of destination " + backStackEntry.getDestination() + " outside of the call to navigate(). ");
                    return;
                }
            }
            Object obj = navController.navigatorState.get(navigator);
            if (obj != null) {
                ((NavControllerNavigatorState) obj).push(backStackEntry);
            } else {
                b.f(backStackEntry.getDestination().getNavigatorName(), "NavigatorBackStack for ", " should already be created");
            }
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/navigation/NavController$OnDestinationChangedListener;", "", "onDestinationChanged", "", "controller", "Landroidx/navigation/NavController;", "destination", "Landroidx/navigation/NavDestination;", "arguments", "Landroid/os/Bundle;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public interface OnDestinationChangedListener {
        void onDestinationChanged(NavController controller, NavDestination destination, Bundle arguments);
    }

    public NavController(Context context) {
        Object obj;
        context.getClass();
        this.context = context;
        Iterator it = SequencesKt.generateSequence(context, new Function1<Context, Context>() { // from class: androidx.navigation.NavController$activity$1
            @Override // kotlin.jvm.functions.Function1
            public final Context invoke(Context context2) {
                context2.getClass();
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            }
        }).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.activity = (Activity) obj;
        this.backQueue = new ArrayDeque<>();
        v a10 = r.a(CollectionsKt.emptyList());
        this._currentBackStack = a10;
        this.currentBackStack = new n(a10);
        v a11 = r.a(CollectionsKt.emptyList());
        this._visibleEntries = a11;
        this.visibleEntries = new n(a11);
        this.childToParentEntries = new LinkedHashMap();
        this.parentToChildCount = new LinkedHashMap();
        this.backStackMap = new LinkedHashMap();
        this.backStackStates = new LinkedHashMap();
        this.onDestinationChangedListeners = new CopyOnWriteArrayList<>();
        this.hostLifecycleState = Lifecycle.State.INITIALIZED;
        this.lifecycleObserver = new a(0, this);
        this.onBackPressedCallback = new OnBackPressedCallback() { // from class: androidx.navigation.NavController$onBackPressedCallback$1
            {
                super(false);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                NavController.this.popBackStack();
            }
        };
        this.enableOnBackPressedCallback = true;
        this._navigatorProvider = new NavigatorProvider();
        this.navigatorState = new LinkedHashMap();
        this.entrySavedState = new LinkedHashMap();
        NavigatorProvider navigatorProvider = this._navigatorProvider;
        navigatorProvider.addNavigator(new NavGraphNavigator(navigatorProvider));
        this._navigatorProvider.addNavigator(new ActivityNavigator(this.context));
        this.backStackEntriesToDispatch = new ArrayList();
        this.navInflater = LazyKt.lazy(new Function0<NavInflater>() { // from class: androidx.navigation.NavController$navInflater$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final NavInflater invoke() {
                NavInflater navInflater;
                navInflater = NavController.this.inflater;
                if (navInflater == null) {
                    return new NavInflater(NavController.this.getContext(), NavController.this._navigatorProvider);
                }
                return navInflater;
            }
        });
        q qVar = new q(1, 2);
        this._currentBackStackEntryFlow = qVar;
        this.currentBackStackEntryFlow = new p(15, qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0244, code lost:
    
        r1 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x024c, code lost:
    
        if (r1.hasNext() == false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x024e, code lost:
    
        r2 = (androidx.navigation.NavBackStackEntry) r1.next();
        r3 = r29.navigatorState.get(r29._navigatorProvider.getNavigator(r2.getDestination().getNavigatorName()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0268, code lost:
    
        if (r3 == null) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x026a, code lost:
    
        r3.addInternal(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0270, code lost:
    
        androidx.navigation.b.f(r30.getNavigatorName(), "NavigatorBackStack for ", " should already be created");
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x027b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x027c, code lost:
    
        r29.backQueue.addAll(r11);
        r29.backQueue.add(r7);
        r1 = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends androidx.navigation.NavBackStackEntry>) r11, r7).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0292, code lost:
    
        if (r1.hasNext() == false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0294, code lost:
    
        r2 = (androidx.navigation.NavBackStackEntry) r1.next();
        r3 = r2.getDestination().getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02a2, code lost:
    
        if (r3 == null) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02a4, code lost:
    
        linkChildToParent(r2, getBackStackEntry(r3.getId()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02b0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01e1, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00f5, code lost:
    
        r1 = ((androidx.navigation.NavBackStackEntry) r11.first()).getDestination();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00ca, code lost:
    
        r7 = r32;
        r8 = r33;
        r11 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0095, code lost:
    
        r10 = r31;
        r18 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0075, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00d0, code lost:
    
        r10 = r31;
        r11 = r1;
        r18 = r8;
        r8 = r7;
        r7 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00e4, code lost:
    
        r10 = r31;
        r11 = r1;
        r18 = r8;
        r8 = r7;
        r7 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r1 = new kotlin.collections.ArrayDeque();
        r17 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if ((r30 instanceof androidx.navigation.NavGraph) == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        r2.getClass();
        r9 = r2.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r9 == null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        r2 = r7.listIterator(r7.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r2.hasPrevious() == false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        r3 = r2.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3.getDestination(), r9) == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r3 != null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r10 = r31;
        r18 = r8;
        r3 = androidx.navigation.NavBackStackEntry.Companion.create$default(androidx.navigation.NavBackStackEntry.INSTANCE, r29.context, r9, r10, getHostLifecycleState$navigation_runtime_release(), r29.viewModel, null, null, 96, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        r1.addFirst(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        if (r29.backQueue.isEmpty() != false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000c, code lost:
    
        if ((r8 instanceof androidx.navigation.FloatingWindow) == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
    
        if (r29.backQueue.last().getDestination() != r9) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        r8 = r33;
        r11 = r1;
        r7 = r32;
        popEntryFromBackStack$default(r29, r29.backQueue.last(), false, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
    
        if (r9 == null) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00da, code lost:
    
        if (r9 != r30) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dd, code lost:
    
        r7 = r8;
        r2 = r9;
        r1 = r11;
        r8 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f0, code lost:
    
        if (r11.isEmpty() == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f2, code lost:
    
        r1 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ff, code lost:
    
        if (r1 == null) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0109, code lost:
    
        if (findDestination(r1.getId(), r1) == r1) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010b, code lost:
    
        r1 = r1.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010f, code lost:
    
        if (r1 == null) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0111, code lost:
    
        if (r10 == null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0118, code lost:
    
        if (r10.isEmpty() != true) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011a, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011e, code lost:
    
        r3 = r8.listIterator(r8.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r29.backQueue.isEmpty() != false) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012a, code lost:
    
        if (r3.hasPrevious() == false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012c, code lost:
    
        r4 = r3.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4.getDestination(), r1) == false) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0140, code lost:
    
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0142, code lost:
    
        if (r4 != null) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0144, code lost:
    
        r21 = r1;
        r4 = androidx.navigation.NavBackStackEntry.Companion.create$default(androidx.navigation.NavBackStackEntry.INSTANCE, r29.context, r21, r1.addInDefaultArgs(r2), getHostLifecycleState$navigation_runtime_release(), r29.viewModel, null, null, 96, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0167, code lost:
    
        r11.addFirst(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016d, code lost:
    
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0165, code lost:
    
        r21 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013e, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011d, code lost:
    
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016b, code lost:
    
        r21 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if ((r29.backQueue.last().getDestination() instanceof androidx.navigation.FloatingWindow) == false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0174, code lost:
    
        if (r11.isEmpty() == false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0177, code lost:
    
        r18 = ((androidx.navigation.NavBackStackEntry) r11.first()).getDestination();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0189, code lost:
    
        if (r29.backQueue.isEmpty() != false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0199, code lost:
    
        if ((r29.backQueue.last().getDestination() instanceof androidx.navigation.NavGraph) == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019b, code lost:
    
        r1 = r29.backQueue.last().getDestination();
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b8, code lost:
    
        if (((androidx.navigation.NavGraph) r1).getNodes().get(r18.getId()) != null) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ba, code lost:
    
        popEntryFromBackStack$default(r29, r29.backQueue.last(), false, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ca, code lost:
    
        r1 = r29.backQueue.firstOrNull();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d2, code lost:
    
        if (r1 != null) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01d4, code lost:
    
        r1 = (androidx.navigation.NavBackStackEntry) r11.firstOrNull();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01da, code lost:
    
        if (r1 == null) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01dc, code lost:
    
        r1 = r1.getDestination();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01e9, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, r29._graph) != false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01eb, code lost:
    
        r1 = r8.listIterator(r8.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (popBackStackInternal$default(r29, r29.backQueue.last().getDestination().getId(), true, false, 4, (java.lang.Object) null) != false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01f7, code lost:
    
        if (r1.hasPrevious() == false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01f9, code lost:
    
        r2 = r1.previous();
        r3 = r2.getDestination();
        r4 = r29._graph;
        r4.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x020d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, r4) == false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x020f, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0211, code lost:
    
        r17 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0213, code lost:
    
        if (r17 != null) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0215, code lost:
    
        r18 = androidx.navigation.NavBackStackEntry.INSTANCE;
        r1 = r29.context;
        r2 = r29._graph;
        r2.getClass();
        r3 = r29._graph;
        r3.getClass();
        r17 = androidx.navigation.NavBackStackEntry.Companion.create$default(r18, r1, r2, r3.addInDefaultArgs(r10), getHostLifecycleState$navigation_runtime_release(), r29.viewModel, null, null, 96, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x023f, code lost:
    
        r11.addFirst(r17);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void addEntryToBackStack(androidx.navigation.NavDestination r30, android.os.Bundle r31, androidx.navigation.NavBackStackEntry r32, java.util.List<androidx.navigation.NavBackStackEntry> r33) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.addEntryToBackStack(androidx.navigation.NavDestination, android.os.Bundle, androidx.navigation.NavBackStackEntry, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addEntryToBackStack$default(NavController navController, NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List list, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 8) != 0) {
                list = CollectionsKt.emptyList();
            }
            navController.addEntryToBackStack(navDestination, bundle, navBackStackEntry, list);
            return;
        }
        b.g("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
    }

    @MainThread
    private final boolean clearBackStackInternal(@IdRes int destinationId) {
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((NavControllerNavigatorState) it.next()).setNavigating(true);
        }
        boolean restoreStateInternal = restoreStateInternal(destinationId, null, NavOptionsBuilderKt.navOptions(new Function1<NavOptionsBuilder, Unit>() { // from class: androidx.navigation.NavController$clearBackStackInternal$restored$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(NavOptionsBuilder navOptionsBuilder) {
                invoke2(navOptionsBuilder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(NavOptionsBuilder navOptionsBuilder) {
                navOptionsBuilder.getClass();
                navOptionsBuilder.setRestoreState(true);
            }
        }), null);
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((NavControllerNavigatorState) it2.next()).setNavigating(false);
        }
        if (restoreStateInternal && popBackStackInternal(destinationId, true, false)) {
            return true;
        }
        return false;
    }

    private final boolean dispatchOnDestinationChanged() {
        while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof NavGraph)) {
            popEntryFromBackStack$default(this, this.backQueue.last(), false, null, 6, null);
        }
        NavBackStackEntry lastOrNull = this.backQueue.lastOrNull();
        if (lastOrNull != null) {
            this.backStackEntriesToDispatch.add(lastOrNull);
        }
        this.dispatchReentrantCount++;
        updateBackStackLifecycle$navigation_runtime_release();
        int i10 = this.dispatchReentrantCount - 1;
        this.dispatchReentrantCount = i10;
        if (i10 == 0) {
            List<NavBackStackEntry> mutableList = CollectionsKt.toMutableList((Collection) this.backStackEntriesToDispatch);
            this.backStackEntriesToDispatch.clear();
            for (NavBackStackEntry navBackStackEntry : mutableList) {
                Iterator<OnDestinationChangedListener> it = this.onDestinationChangedListeners.iterator();
                while (it.hasNext()) {
                    it.next().onDestinationChanged(this, navBackStackEntry.getDestination(), navBackStackEntry.getArguments());
                }
                this._currentBackStackEntryFlow.b(navBackStackEntry);
            }
            ((v) this._currentBackStack).f(CollectionsKt.toMutableList((Collection) this.backQueue));
            ((v) this._visibleEntries).f(populateVisibleEntries$navigation_runtime_release());
        }
        if (lastOrNull != null) {
            return true;
        }
        return false;
    }

    @JvmStatic
    @NavDeepLinkSaveStateControl
    public static final void enableDeepLinkSaveState(boolean z9) {
        INSTANCE.enableDeepLinkSaveState(z9);
    }

    private final boolean executePopOperations(List<? extends Navigator<?>> popOperations, NavDestination foundDestination, boolean inclusive, boolean saveState) {
        final NavController navController;
        final boolean z9;
        String str;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final ArrayDeque<NavBackStackEntryState> arrayDeque = new ArrayDeque<>();
        Iterator<? extends Navigator<?>> it = popOperations.iterator();
        while (true) {
            if (it.hasNext()) {
                Navigator<? extends NavDestination> navigator = (Navigator) it.next();
                final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                navController = this;
                z9 = saveState;
                popBackStackInternal(navigator, this.backQueue.last(), z9, new Function1<NavBackStackEntry, Unit>() { // from class: androidx.navigation.NavController$executePopOperations$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(NavBackStackEntry navBackStackEntry) {
                        navBackStackEntry.getClass();
                        Ref.BooleanRef.this.element = true;
                        booleanRef.element = true;
                        navController.popEntryFromBackStack(navBackStackEntry, z9, arrayDeque);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry) {
                        invoke2(navBackStackEntry);
                        return Unit.INSTANCE;
                    }
                });
                if (!booleanRef2.element) {
                    break;
                }
                saveState = z9;
            } else {
                navController = this;
                z9 = saveState;
                break;
            }
        }
        if (z9) {
            if (!inclusive) {
                for (NavDestination navDestination : SequencesKt.takeWhile(SequencesKt.generateSequence(foundDestination, new Function1<NavDestination, NavDestination>() { // from class: androidx.navigation.NavController$executePopOperations$2
                    @Override // kotlin.jvm.functions.Function1
                    public final NavDestination invoke(NavDestination navDestination2) {
                        navDestination2.getClass();
                        NavGraph parent = navDestination2.getParent();
                        if (parent != null && parent.getStartDestId() == navDestination2.getId()) {
                            return navDestination2.getParent();
                        }
                        return null;
                    }
                }), new Function1<NavDestination, Boolean>() { // from class: androidx.navigation.NavController$executePopOperations$3
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(NavDestination navDestination2) {
                        Map map;
                        navDestination2.getClass();
                        map = NavController.this.backStackMap;
                        return Boolean.valueOf(!map.containsKey(Integer.valueOf(navDestination2.getId())));
                    }
                })) {
                    Map<Integer, String> map = navController.backStackMap;
                    Integer valueOf = Integer.valueOf(navDestination.getId());
                    NavBackStackEntryState firstOrNull = arrayDeque.firstOrNull();
                    if (firstOrNull != null) {
                        str = firstOrNull.getId();
                    } else {
                        str = null;
                    }
                    map.put(valueOf, str);
                }
            }
            if (!arrayDeque.isEmpty()) {
                NavBackStackEntryState first = arrayDeque.first();
                Iterator it2 = SequencesKt.takeWhile(SequencesKt.generateSequence(findDestination$default(this, first.getDestinationId(), null, 2, null), new Function1<NavDestination, NavDestination>() { // from class: androidx.navigation.NavController$executePopOperations$5
                    @Override // kotlin.jvm.functions.Function1
                    public final NavDestination invoke(NavDestination navDestination2) {
                        navDestination2.getClass();
                        NavGraph parent = navDestination2.getParent();
                        if (parent != null && parent.getStartDestId() == navDestination2.getId()) {
                            return navDestination2.getParent();
                        }
                        return null;
                    }
                }), new Function1<NavDestination, Boolean>() { // from class: androidx.navigation.NavController$executePopOperations$6
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(NavDestination navDestination2) {
                        Map map2;
                        navDestination2.getClass();
                        map2 = NavController.this.backStackMap;
                        return Boolean.valueOf(!map2.containsKey(Integer.valueOf(navDestination2.getId())));
                    }
                }).iterator();
                while (it2.hasNext()) {
                    navController.backStackMap.put(Integer.valueOf(((NavDestination) it2.next()).getId()), first.getId());
                }
                if (navController.backStackMap.values().contains(first.getId())) {
                    navController.backStackStates.put(first.getId(), arrayDeque);
                }
            }
        }
        updateOnBackPressedCallbackEnabled();
        return booleanRef.element;
    }

    private final boolean executeRestoreState(final List<NavBackStackEntry> entries, final Bundle args, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        String str;
        NavBackStackEntry navBackStackEntry;
        NavDestination destination;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : entries) {
            if (!(((NavBackStackEntry) obj).getDestination() instanceof NavGraph)) {
                arrayList2.add(obj);
            }
        }
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj2;
            List list = (List) CollectionsKt.lastOrNull((List) arrayList);
            if (list != null && (navBackStackEntry = (NavBackStackEntry) CollectionsKt.last(list)) != null && (destination = navBackStackEntry.getDestination()) != null) {
                str = destination.getNavigatorName();
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str, navBackStackEntry2.getDestination().getNavigatorName())) {
                list.add(navBackStackEntry2);
            } else {
                arrayList.add(CollectionsKt.mutableListOf(navBackStackEntry2));
            }
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj3 = arrayList.get(i10);
            i10++;
            List<NavBackStackEntry> list2 = (List) obj3;
            Navigator<? extends NavDestination> navigator = this._navigatorProvider.getNavigator(((NavBackStackEntry) CollectionsKt.first((List) list2)).getDestination().getNavigatorName());
            final Ref.IntRef intRef = new Ref.IntRef();
            navigateInternal(navigator, list2, navOptions, navigatorExtras, new Function1<NavBackStackEntry, Unit>() { // from class: androidx.navigation.NavController$executeRestoreState$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(NavBackStackEntry navBackStackEntry3) {
                    List<NavBackStackEntry> emptyList;
                    navBackStackEntry3.getClass();
                    Ref.BooleanRef.this.element = true;
                    int indexOf = entries.indexOf(navBackStackEntry3);
                    if (indexOf != -1) {
                        int i12 = indexOf + 1;
                        emptyList = entries.subList(intRef.element, i12);
                        intRef.element = i12;
                    } else {
                        emptyList = CollectionsKt.emptyList();
                    }
                    this.addEntryToBackStack(navBackStackEntry3.getDestination(), args, navBackStackEntry3, emptyList);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry3) {
                    invoke2(navBackStackEntry3);
                    return Unit.INSTANCE;
                }
            });
        }
        return booleanRef.element;
    }

    public static /* synthetic */ NavDestination findDestination$default(NavController navController, int i10, NavDestination navDestination, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                navDestination = null;
            }
            return navController.findDestination(i10, navDestination);
        }
        b.g("Super calls with default arguments not supported in this target, function: findDestination");
        return null;
    }

    public static /* synthetic */ NavDestination findDestinationComprehensive$default(NavController navController, NavDestination navDestination, int i10, boolean z9, NavDestination navDestination2, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                navDestination2 = null;
            }
            return navController.findDestinationComprehensive(navDestination, i10, z9, navDestination2);
        }
        b.g("Super calls with default arguments not supported in this target, function: findDestinationComprehensive");
        return null;
    }

    private final String findInvalidDestinationDisplayNameInDeepLink(int[] deepLink) {
        NavGraph navGraph;
        NavGraph navGraph2 = this._graph;
        int length = deepLink.length;
        int i10 = 0;
        while (true) {
            NavDestination navDestination = null;
            if (i10 >= length) {
                return null;
            }
            int i11 = deepLink[i10];
            if (i10 == 0) {
                NavGraph navGraph3 = this._graph;
                navGraph3.getClass();
                if (navGraph3.getId() == i11) {
                    navDestination = this._graph;
                }
            } else {
                navGraph2.getClass();
                navDestination = navGraph2.findNode(i11);
            }
            if (navDestination == null) {
                return NavDestination.INSTANCE.getDisplayName(this.context, i11);
            }
            if (i10 != deepLink.length - 1 && (navDestination instanceof NavGraph)) {
                while (true) {
                    navGraph = (NavGraph) navDestination;
                    navGraph.getClass();
                    if (!(navGraph.findNode(navGraph.getStartDestId()) instanceof NavGraph)) {
                        break;
                    }
                    navDestination = navGraph.findNode(navGraph.getStartDestId());
                }
                navGraph2 = navGraph;
            }
            i10++;
        }
    }

    private final <T> String generateRouteFilled(T route) {
        NavDestination findDestinationComprehensive$default = findDestinationComprehensive$default(this, getGraph(), RouteSerializerKt.generateHashCode(com.bumptech.glide.d.s(Reflection.getOrCreateKotlinClass(route.getClass()))), true, null, 4, null);
        if (findDestinationComprehensive$default != null) {
            Map<String, NavArgument> arguments = findDestinationComprehensive$default.getArguments();
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(arguments.size()));
            Iterator<T> it = arguments.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), ((NavArgument) entry.getValue()).getType());
            }
            return RouteSerializerKt.generateRouteWithArgs(route, linkedHashMap);
        }
        b.h("Destination with route ", Reflection.getOrCreateKotlinClass(route.getClass()).getSimpleName(), " cannot be found in navigation graph ", this._graph);
        return null;
    }

    private final int getDestinationCountOnBackStack() {
        ArrayDeque<NavBackStackEntry> arrayDeque = this.backQueue;
        int i10 = 0;
        if (arrayDeque != null && arrayDeque.isEmpty()) {
            return 0;
        }
        Iterator<NavBackStackEntry> it = arrayDeque.iterator();
        while (it.hasNext()) {
            if (!(it.next().getDestination() instanceof NavGraph) && (i10 = i10 + 1) < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i10;
    }

    private final NavGraph getTopGraph(ArrayDeque<NavBackStackEntry> arrayDeque) {
        NavDestination navDestination;
        NavBackStackEntry lastOrNull = arrayDeque.lastOrNull();
        if (lastOrNull == null || (navDestination = lastOrNull.getDestination()) == null) {
            navDestination = this._graph;
            navDestination.getClass();
        }
        if (navDestination instanceof NavGraph) {
            return (NavGraph) navDestination;
        }
        NavGraph parent = navDestination.getParent();
        parent.getClass();
        return parent;
    }

    private final List<NavBackStackEntry> instantiateBackStack(ArrayDeque<NavBackStackEntryState> backStackState) {
        NavDestination graph;
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry lastOrNull = this.backQueue.lastOrNull();
        if (lastOrNull == null || (graph = lastOrNull.getDestination()) == null) {
            graph = getGraph();
        }
        if (backStackState != null) {
            NavDestination navDestination = graph;
            for (NavBackStackEntryState navBackStackEntryState : backStackState) {
                NavDestination findDestinationComprehensive$default = findDestinationComprehensive$default(this, navDestination, navBackStackEntryState.getDestinationId(), true, null, 4, null);
                if (findDestinationComprehensive$default != null) {
                    arrayList.add(navBackStackEntryState.instantiate(this.context, findDestinationComprehensive$default, getHostLifecycleState$navigation_runtime_release(), this.viewModel));
                    navDestination = findDestinationComprehensive$default;
                } else {
                    b.q("Restore State failed: destination ", NavDestination.INSTANCE.getDisplayName(this.context, navBackStackEntryState.getDestinationId()), " cannot be found from the current destination ", navDestination);
                    return null;
                }
            }
        }
        return arrayList;
    }

    private final boolean launchSingleTopInternal(NavDestination node, Bundle args) {
        int i10;
        NavDestination destination;
        NavBackStackEntry currentBackStackEntry = getCurrentBackStackEntry();
        ArrayDeque<NavBackStackEntry> arrayDeque = this.backQueue;
        ListIterator<NavBackStackEntry> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (listIterator.previous().getDestination() == node) {
                    i10 = listIterator.nextIndex();
                    break;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 != -1) {
            if (node instanceof NavGraph) {
                List list = SequencesKt.toList(SequencesKt.map(NavGraph.INSTANCE.childHierarchy((NavGraph) node), new Function1<NavDestination, Integer>() { // from class: androidx.navigation.NavController$launchSingleTopInternal$childHierarchyId$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Integer invoke(NavDestination navDestination) {
                        navDestination.getClass();
                        return Integer.valueOf(navDestination.getId());
                    }
                }));
                if (this.backQueue.size() - i10 == list.size()) {
                    ArrayDeque<NavBackStackEntry> arrayDeque2 = this.backQueue;
                    List<NavBackStackEntry> subList = arrayDeque2.subList(i10, arrayDeque2.size());
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(subList, 10));
                    Iterator<T> it = subList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((NavBackStackEntry) it.next()).getDestination().getId()));
                    }
                    if (!Intrinsics.areEqual(arrayList, list)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else if (currentBackStackEntry == null || (destination = currentBackStackEntry.getDestination()) == null || node.getId() != destination.getId()) {
                return false;
            }
            ArrayDeque arrayDeque3 = new ArrayDeque();
            while (CollectionsKt.getLastIndex(this.backQueue) >= i10) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.removeLast(this.backQueue);
                unlinkChildFromParent$navigation_runtime_release(navBackStackEntry);
                arrayDeque3.addFirst(new NavBackStackEntry(navBackStackEntry, navBackStackEntry.getDestination().addInDefaultArgs(args)));
            }
            Iterator<E> it2 = arrayDeque3.iterator();
            while (it2.hasNext()) {
                NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) it2.next();
                NavGraph parent = navBackStackEntry2.getDestination().getParent();
                if (parent != null) {
                    linkChildToParent(navBackStackEntry2, getBackStackEntry(parent.getId()));
                }
                this.backQueue.add(navBackStackEntry2);
            }
            Iterator<E> it3 = arrayDeque3.iterator();
            while (it3.hasNext()) {
                NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) it3.next();
                this._navigatorProvider.getNavigator(navBackStackEntry3.getDestination().getNavigatorName()).onLaunchSingleTop(navBackStackEntry3);
            }
            return true;
        }
        return false;
    }

    public static final void lifecycleObserver$lambda$2(NavController navController, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        navController.getClass();
        lifecycleOwner.getClass();
        event.getClass();
        navController.hostLifecycleState = event.getTargetState();
        if (navController._graph != null) {
            Iterator it = CollectionsKt.toMutableList((Collection) navController.backQueue).iterator();
            while (it.hasNext()) {
                ((NavBackStackEntry) it.next()).handleLifecycleEvent(event);
            }
        }
    }

    private final void linkChildToParent(NavBackStackEntry child, NavBackStackEntry parent) {
        this.childToParentEntries.put(child, parent);
        if (this.parentToChildCount.get(parent) == null) {
            this.parentToChildCount.put(parent, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(parent);
        atomicInteger.getClass();
        atomicInteger.incrementAndGet();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x011f A[LOOP:1: B:20:0x0119->B:22:0x011f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    @androidx.annotation.MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void navigate(final androidx.navigation.NavDestination r22, android.os.Bundle r23, androidx.navigation.NavOptions r24, androidx.navigation.Navigator.Extras r25) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.navigate(androidx.navigation.NavDestination, android.os.Bundle, androidx.navigation.NavOptions, androidx.navigation.Navigator$Extras):void");
    }

    public static /* synthetic */ void navigate$default(NavController navController, String str, NavOptions navOptions, Navigator.Extras extras, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                navOptions = null;
            }
            if ((i10 & 4) != 0) {
                extras = null;
            }
            navController.navigate(str, navOptions, extras);
            return;
        }
        b.g("Super calls with default arguments not supported in this target, function: navigate");
    }

    private final void navigateInternal(Navigator<? extends NavDestination> navigator, List<NavBackStackEntry> list, NavOptions navOptions, Navigator.Extras extras, Function1<? super NavBackStackEntry, Unit> function1) {
        this.addToBackStackHandler = function1;
        navigator.navigate(list, navOptions, extras);
        this.addToBackStackHandler = null;
    }

    public static /* synthetic */ void navigateInternal$default(NavController navController, Navigator navigator, List list, NavOptions navOptions, Navigator.Extras extras, Function1 function1, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 8) != 0) {
                function1 = new Function1<NavBackStackEntry, Unit>() { // from class: androidx.navigation.NavController$navigateInternal$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry) {
                        invoke2(navBackStackEntry);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(NavBackStackEntry navBackStackEntry) {
                        navBackStackEntry.getClass();
                    }
                };
            }
            navController.navigateInternal(navigator, list, navOptions, extras, function1);
            return;
        }
        b.g("Super calls with default arguments not supported in this target, function: navigateInternal");
    }

    @MainThread
    private final void onGraphCreated(Bundle startDestinationArgs) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle = this.navigatorStateToRestore;
        int i10 = 0;
        if (bundle != null && (stringArrayList = bundle.getStringArrayList(KEY_NAVIGATOR_STATE_NAMES)) != null) {
            int size = stringArrayList.size();
            int i11 = 0;
            while (i11 < size) {
                String str = stringArrayList.get(i11);
                i11++;
                String str2 = str;
                NavigatorProvider navigatorProvider = this._navigatorProvider;
                str2.getClass();
                Navigator navigator = navigatorProvider.getNavigator(str2);
                Bundle bundle2 = bundle.getBundle(str2);
                if (bundle2 != null) {
                    navigator.onRestoreState(bundle2);
                }
            }
        }
        Parcelable[] parcelableArr = this.backStackToRestore;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                parcelable.getClass();
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                NavDestination findDestination$default = findDestination$default(this, navBackStackEntryState.getDestinationId(), null, 2, null);
                if (findDestination$default != null) {
                    NavBackStackEntry instantiate = navBackStackEntryState.instantiate(this.context, findDestination$default, getHostLifecycleState$navigation_runtime_release(), this.viewModel);
                    Navigator<? extends NavDestination> navigator2 = this._navigatorProvider.getNavigator(findDestination$default.getNavigatorName());
                    Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> map = this.navigatorState;
                    NavControllerNavigatorState navControllerNavigatorState = map.get(navigator2);
                    if (navControllerNavigatorState == null) {
                        navControllerNavigatorState = new NavControllerNavigatorState(this, navigator2);
                        map.put(navigator2, navControllerNavigatorState);
                    }
                    this.backQueue.add(instantiate);
                    navControllerNavigatorState.addInternal(instantiate);
                    NavGraph parent = instantiate.getDestination().getParent();
                    if (parent != null) {
                        linkChildToParent(instantiate, getBackStackEntry(parent.getId()));
                    }
                } else {
                    StringBuilder x9 = ai.onnxruntime.a.x("Restoring the Navigation back stack failed: destination ", NavDestination.INSTANCE.getDisplayName(this.context, navBackStackEntryState.getDestinationId()), " cannot be found from the current destination ");
                    x9.append(getCurrentDestination());
                    throw new IllegalStateException(x9.toString());
                }
            }
            updateOnBackPressedCallbackEnabled();
            this.backStackToRestore = null;
        }
        Collection<Navigator<? extends NavDestination>> values = this._navigatorProvider.getNavigators().values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (!((Navigator) obj).getIsAttached()) {
                arrayList.add(obj);
            }
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            Navigator<? extends NavDestination> navigator3 = (Navigator) obj2;
            Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> map2 = this.navigatorState;
            NavControllerNavigatorState navControllerNavigatorState2 = map2.get(navigator3);
            if (navControllerNavigatorState2 == null) {
                navControllerNavigatorState2 = new NavControllerNavigatorState(this, navigator3);
                map2.put(navigator3, navControllerNavigatorState2);
            }
            navigator3.onAttach(navControllerNavigatorState2);
        }
        if (this._graph != null && this.backQueue.isEmpty()) {
            if (!this.deepLinkHandled && (activity = this.activity) != null) {
                activity.getClass();
                if (handleDeepLink(activity.getIntent())) {
                    return;
                }
            }
            NavGraph navGraph = this._graph;
            navGraph.getClass();
            navigate(navGraph, startDestinationArgs, (NavOptions) null, (Navigator.Extras) null);
            return;
        }
        dispatchOnDestinationChanged();
    }

    public static boolean popBackStack$default(NavController navController, boolean z9, boolean z10, int i10, Object obj) {
        if (obj == null) {
            Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
            MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
            throw null;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
    }

    private final boolean popBackStackInternal(String route, boolean inclusive, boolean saveState) {
        NavDestination navDestination;
        NavBackStackEntry navBackStackEntry;
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayDeque<NavBackStackEntry> arrayDeque = this.backQueue;
        ListIterator<NavBackStackEntry> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            navDestination = null;
            if (listIterator.hasPrevious()) {
                navBackStackEntry = listIterator.previous();
                NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
                boolean hasRoute = navBackStackEntry2.getDestination().hasRoute(route, navBackStackEntry2.getArguments());
                if (inclusive || !hasRoute) {
                    arrayList.add(this._navigatorProvider.getNavigator(navBackStackEntry2.getDestination().getNavigatorName()));
                }
                if (hasRoute) {
                    break;
                }
            } else {
                navBackStackEntry = null;
                break;
            }
        }
        NavBackStackEntry navBackStackEntry3 = navBackStackEntry;
        if (navBackStackEntry3 != null) {
            navDestination = navBackStackEntry3.getDestination();
        }
        if (navDestination == null) {
            Log.i(TAG, "Ignoring popBackStack to route " + route + " as it was not found on the current back stack");
            return false;
        }
        return executePopOperations(arrayList, navDestination, inclusive, saveState);
    }

    public static /* synthetic */ boolean popBackStackInternal$default(NavController navController, int i10, boolean z9, boolean z10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                z10 = false;
            }
            return navController.popBackStackInternal(i10, z9, z10);
        }
        b.g("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        return false;
    }

    public final void popEntryFromBackStack(NavBackStackEntry popUpTo, boolean saveState, ArrayDeque<NavBackStackEntryState> savedState) {
        NavControllerViewModel navControllerViewModel;
        t transitionsInProgress;
        Set set;
        NavBackStackEntry last = this.backQueue.last();
        if (Intrinsics.areEqual(last, popUpTo)) {
            CollectionsKt.removeLast(this.backQueue);
            NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(get_navigatorProvider().getNavigator(last.getDestination().getNavigatorName()));
            boolean z9 = true;
            if ((navControllerNavigatorState == null || (transitionsInProgress = navControllerNavigatorState.getTransitionsInProgress()) == null || (set = (Set) transitionsInProgress.getValue()) == null || !set.contains(last)) && !this.parentToChildCount.containsKey(last)) {
                z9 = false;
            }
            Lifecycle.State state = last.getLifecycle().getState();
            Lifecycle.State state2 = Lifecycle.State.CREATED;
            if (state.isAtLeast(state2)) {
                if (saveState) {
                    last.setMaxLifecycle(state2);
                    savedState.addFirst(new NavBackStackEntryState(last));
                }
                if (!z9) {
                    last.setMaxLifecycle(Lifecycle.State.DESTROYED);
                    unlinkChildFromParent$navigation_runtime_release(last);
                } else {
                    last.setMaxLifecycle(state2);
                }
            }
            if (!saveState && !z9 && (navControllerViewModel = this.viewModel) != null) {
                navControllerViewModel.clear(last.getId());
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Attempted to pop ");
        sb.append(popUpTo.getDestination());
        NavDestination destination = last.getDestination();
        sb.append(", which is not the top of the back stack (");
        sb.append(destination);
        sb.append(')');
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popEntryFromBackStack$default(NavController navController, NavBackStackEntry navBackStackEntry, boolean z9, ArrayDeque arrayDeque, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z9 = false;
            }
            if ((i10 & 4) != 0) {
                arrayDeque = new ArrayDeque();
            }
            navController.popEntryFromBackStack(navBackStackEntry, z9, arrayDeque);
            return;
        }
        b.g("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
    }

    private final boolean restoreStateInternal(String route) {
        Bundle bundle;
        NavBackStackEntryState firstOrNull;
        int hashCode = NavDestination.INSTANCE.createRoute(route).hashCode();
        if (this.backStackMap.containsKey(Integer.valueOf(hashCode))) {
            return restoreStateInternal(hashCode, null, null, null);
        }
        NavDestination findDestination = findDestination(route);
        if (findDestination != null) {
            final String str = this.backStackMap.get(Integer.valueOf(findDestination.getId()));
            CollectionsKt__MutableCollectionsKt.removeAll(this.backStackMap.values(), new Function1<String, Boolean>() { // from class: androidx.navigation.NavController$restoreStateInternal$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(String str2) {
                    return Boolean.valueOf(Intrinsics.areEqual(str2, str));
                }
            });
            ArrayDeque<NavBackStackEntryState> arrayDeque = (ArrayDeque) TypeIntrinsics.asMutableMap(this.backStackStates).remove(str);
            NavDestination.DeepLinkMatch matchRoute = findDestination.matchRoute(route);
            matchRoute.getClass();
            if (arrayDeque != null && (firstOrNull = arrayDeque.firstOrNull()) != null) {
                bundle = firstOrNull.getArgs();
            } else {
                bundle = null;
            }
            if (!matchRoute.hasMatchingArgs(bundle)) {
                return false;
            }
            return executeRestoreState(instantiateBackStack(arrayDeque), null, null, null);
        }
        StringBuilder x9 = ai.onnxruntime.a.x("Restore State failed: route ", route, " cannot be found from the current destination ");
        x9.append(getCurrentDestination());
        throw new IllegalStateException(x9.toString().toString());
    }

    private final boolean tryRelaunchUpToExplicitStack() {
        Bundle bundle;
        int i10 = 0;
        if (!this.deepLinkHandled) {
            return false;
        }
        Activity activity = this.activity;
        activity.getClass();
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        extras.getClass();
        int[] intArray = extras.getIntArray(KEY_DEEP_LINK_IDS);
        intArray.getClass();
        List<Integer> mutableList = ArraysKt.toMutableList(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList(KEY_DEEP_LINK_ARGS);
        if (mutableList.size() < 2) {
            return false;
        }
        int intValue = ((Number) CollectionsKt.removeLast(mutableList)).intValue();
        if (parcelableArrayList != null) {
        }
        NavDestination findDestinationComprehensive$default = findDestinationComprehensive$default(this, getGraph(), intValue, false, null, 4, null);
        if (findDestinationComprehensive$default instanceof NavGraph) {
            intValue = NavGraph.INSTANCE.findStartDestination((NavGraph) findDestinationComprehensive$default).getId();
        }
        NavDestination currentDestination = getCurrentDestination();
        if (currentDestination == null || intValue != currentDestination.getId()) {
            return false;
        }
        NavDeepLinkBuilder createDeepLink = createDeepLink();
        Bundle bundleOf = BundleKt.bundleOf(TuplesKt.to(KEY_DEEP_LINK_INTENT, intent));
        Bundle bundle2 = extras.getBundle(KEY_DEEP_LINK_EXTRAS);
        if (bundle2 != null) {
            bundleOf.putAll(bundle2);
        }
        createDeepLink.setArguments(bundleOf);
        for (Object obj : mutableList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int intValue2 = ((Number) obj).intValue();
            if (parcelableArrayList != null) {
                bundle = (Bundle) parcelableArrayList.get(i10);
            } else {
                bundle = null;
            }
            createDeepLink.addDestination(intValue2, bundle);
            i10 = i11;
        }
        createDeepLink.createTaskStackBuilder().startActivities();
        Activity activity2 = this.activity;
        if (activity2 != null) {
            activity2.finish();
            return true;
        }
        return true;
    }

    private final boolean tryRelaunchUpToGeneratedStack() {
        Bundle bundle;
        NavDestination currentDestination = getCurrentDestination();
        currentDestination.getClass();
        int id = currentDestination.getId();
        for (NavGraph parent = currentDestination.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getStartDestId() != id) {
                Bundle bundle2 = new Bundle();
                Activity activity = this.activity;
                if (activity != null) {
                    activity.getClass();
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.activity;
                        activity2.getClass();
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.activity;
                            activity3.getClass();
                            bundle2.putParcelable(KEY_DEEP_LINK_INTENT, activity3.getIntent());
                            NavGraph topGraph = getTopGraph(this.backQueue);
                            Activity activity4 = this.activity;
                            activity4.getClass();
                            Intent intent = activity4.getIntent();
                            intent.getClass();
                            NavDestination.DeepLinkMatch matchDeepLinkComprehensive = topGraph.matchDeepLinkComprehensive(new NavDeepLinkRequest(intent), true, true, topGraph);
                            if (matchDeepLinkComprehensive != null) {
                                bundle = matchDeepLinkComprehensive.getMatchingArgs();
                            } else {
                                bundle = null;
                            }
                            if (bundle != null) {
                                bundle2.putAll(matchDeepLinkComprehensive.getDestination().addInDefaultArgs(matchDeepLinkComprehensive.getMatchingArgs()));
                            }
                        }
                    }
                }
                NavDeepLinkBuilder.setDestination$default(new NavDeepLinkBuilder(this), parent.getId(), (Bundle) null, 2, (Object) null).setArguments(bundle2).createTaskStackBuilder().startActivities();
                Activity activity5 = this.activity;
                if (activity5 != null) {
                    activity5.finish();
                }
                return true;
            }
            id = parent.getId();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (getDestinationCountOnBackStack() > 1) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateOnBackPressedCallbackEnabled() {
        /*
            r3 = this;
            androidx.activity.OnBackPressedCallback r0 = r3.onBackPressedCallback
            boolean r1 = r3.enableOnBackPressedCallback
            if (r1 == 0) goto Le
            int r1 = r3.getDestinationCountOnBackStack()
            r2 = 1
            if (r1 <= r2) goto Le
            goto Lf
        Le:
            r2 = 0
        Lf:
            r0.setEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.updateOnBackPressedCallbackEnabled():void");
    }

    public void addOnDestinationChangedListener(OnDestinationChangedListener listener) {
        listener.getClass();
        this.onDestinationChangedListeners.add(listener);
        if (!this.backQueue.isEmpty()) {
            NavBackStackEntry last = this.backQueue.last();
            listener.onDestinationChanged(this, last.getDestination(), last.getArguments());
        }
    }

    @MainThread
    public final <T> boolean clearBackStack(T route) {
        route.getClass();
        if (clearBackStackInternal(generateRouteFilled(route)) && dispatchOnDestinationChanged()) {
            return true;
        }
        return false;
    }

    public NavDeepLinkBuilder createDeepLink() {
        return new NavDeepLinkBuilder(this);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void enableOnBackPressed(boolean enabled) {
        this.enableOnBackPressedCallback = enabled;
        updateOnBackPressedCallbackEnabled();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findDestination(@IdRes int destinationId, NavDestination matchingDest) {
        NavDestination navDestination;
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            return null;
        }
        navGraph.getClass();
        if (navGraph.getId() == destinationId) {
            NavGraph navGraph2 = this._graph;
            if (matchingDest != null) {
                if (Intrinsics.areEqual(navGraph2, matchingDest) && matchingDest.getParent() == null) {
                    return this._graph;
                }
            } else {
                return navGraph2;
            }
        }
        NavBackStackEntry lastOrNull = this.backQueue.lastOrNull();
        if (lastOrNull == null || (navDestination = lastOrNull.getDestination()) == null) {
            navDestination = this._graph;
            navDestination.getClass();
        }
        return findDestinationComprehensive(navDestination, destinationId, false, matchingDest);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findDestinationComprehensive(NavDestination navDestination, @IdRes int i10, boolean z9, NavDestination navDestination2) {
        NavGraph navGraph;
        navDestination.getClass();
        if (navDestination.getId() == i10 && (navDestination2 == null || (Intrinsics.areEqual(navDestination, navDestination2) && Intrinsics.areEqual(navDestination.getParent(), navDestination2.getParent())))) {
            return navDestination;
        }
        if (navDestination instanceof NavGraph) {
            navGraph = (NavGraph) navDestination;
        } else {
            NavGraph parent = navDestination.getParent();
            parent.getClass();
            navGraph = parent;
        }
        return navGraph.findNodeComprehensive(i10, navGraph, z9, navDestination2);
    }

    public final NavBackStackEntry getBackStackEntry(String route) {
        NavBackStackEntry navBackStackEntry;
        route.getClass();
        ArrayDeque<NavBackStackEntry> arrayDeque = this.backQueue;
        ListIterator<NavBackStackEntry> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                navBackStackEntry = listIterator.previous();
                NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
                if (navBackStackEntry2.getDestination().hasRoute(route, navBackStackEntry2.getArguments())) {
                    break;
                }
            } else {
                navBackStackEntry = null;
                break;
            }
        }
        NavBackStackEntry navBackStackEntry3 = navBackStackEntry;
        if (navBackStackEntry3 != null) {
            return navBackStackEntry3;
        }
        StringBuilder x9 = ai.onnxruntime.a.x("No destination with route ", route, " is on the NavController's back stack. The current destination is ");
        x9.append(getCurrentDestination());
        throw new IllegalArgumentException(x9.toString().toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Context getContext() {
        return this.context;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final t getCurrentBackStack() {
        return this.currentBackStack;
    }

    public NavBackStackEntry getCurrentBackStackEntry() {
        return this.backQueue.lastOrNull();
    }

    public final f getCurrentBackStackEntryFlow() {
        return this.currentBackStackEntryFlow;
    }

    public NavDestination getCurrentDestination() {
        NavBackStackEntry currentBackStackEntry = getCurrentBackStackEntry();
        if (currentBackStackEntry != null) {
            return currentBackStackEntry.getDestination();
        }
        return null;
    }

    @MainThread
    public NavGraph getGraph() {
        NavGraph navGraph = this._graph;
        if (navGraph != null) {
            navGraph.getClass();
            return navGraph;
        }
        i.l("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final Lifecycle.State getHostLifecycleState$navigation_runtime_release() {
        if (this.lifecycleOwner == null) {
            return Lifecycle.State.CREATED;
        }
        return this.hostLifecycleState;
    }

    public NavInflater getNavInflater() {
        return (NavInflater) this.navInflater.getValue();
    }

    /* renamed from: getNavigatorProvider, reason: from getter */
    public NavigatorProvider get_navigatorProvider() {
        return this._navigatorProvider;
    }

    public NavBackStackEntry getPreviousBackStackEntry() {
        Object obj;
        Iterator it = CollectionsKt.reversed(this.backQueue).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = SequencesKt.asSequence(it).iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (!(((NavBackStackEntry) obj).getDestination() instanceof NavGraph)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (NavBackStackEntry) obj;
    }

    public ViewModelStoreOwner getViewModelStoreOwner(@IdRes int navGraphId) {
        if (this.viewModel != null) {
            NavBackStackEntry backStackEntry = getBackStackEntry(navGraphId);
            if (backStackEntry.getDestination() instanceof NavGraph) {
                return backStackEntry;
            }
            l9.i.d(ai.onnxruntime.a.f(navGraphId, "No NavGraph with ID ", " is on the NavController's back stack"));
            return null;
        }
        i.l("You must call setViewModelStore() before calling getViewModelStoreOwner().");
        return null;
    }

    public final t getVisibleEntries() {
        return this.visibleEntries;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @androidx.annotation.MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleDeepLink(android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.handleDeepLink(android.content.Intent):boolean");
    }

    @MainThread
    public boolean navigateUp() {
        Bundle bundle;
        Intent intent;
        if (getDestinationCountOnBackStack() == 1) {
            Activity activity = this.activity;
            int[] iArr = null;
            if (activity != null && (intent = activity.getIntent()) != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            if (bundle != null) {
                iArr = bundle.getIntArray(KEY_DEEP_LINK_IDS);
            }
            if (iArr != null) {
                return tryRelaunchUpToExplicitStack();
            }
            return tryRelaunchUpToGeneratedStack();
        }
        return popBackStack();
    }

    @MainThread
    public boolean popBackStack() {
        if (this.backQueue.isEmpty()) {
            return false;
        }
        NavDestination currentDestination = getCurrentDestination();
        currentDestination.getClass();
        return popBackStack(currentDestination.getId(), true);
    }

    public final void popBackStackFromNavigator$navigation_runtime_release(NavBackStackEntry popUpTo, Function0<Unit> onComplete) {
        popUpTo.getClass();
        onComplete.getClass();
        int indexOf = this.backQueue.indexOf(popUpTo);
        if (indexOf < 0) {
            Log.i(TAG, "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i10 = indexOf + 1;
        if (i10 != this.backQueue.size()) {
            popBackStackInternal(this.backQueue.get(i10).getDestination().getId(), true, false);
        }
        popEntryFromBackStack$default(this, popUpTo, false, null, 6, null);
        onComplete.invoke();
        updateOnBackPressedCallbackEnabled();
        dispatchOnDestinationChanged();
    }

    public final List<NavBackStackEntry> populateVisibleEntries$navigation_runtime_release() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((NavControllerNavigatorState) it.next()).getTransitionsInProgress().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if (!arrayList.contains(navBackStackEntry) && !navBackStackEntry.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList2);
        }
        ArrayDeque<NavBackStackEntry> arrayDeque = this.backQueue;
        ArrayList arrayList3 = new ArrayList();
        Iterator<NavBackStackEntry> it2 = arrayDeque.iterator();
        while (it2.hasNext()) {
            NavBackStackEntry next = it2.next();
            NavBackStackEntry navBackStackEntry2 = next;
            if (!arrayList.contains(navBackStackEntry2) && navBackStackEntry2.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                arrayList3.add(next);
            }
        }
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            if (!(((NavBackStackEntry) obj2).getDestination() instanceof NavGraph)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public void removeOnDestinationChangedListener(OnDestinationChangedListener listener) {
        listener.getClass();
        this.onDestinationChangedListeners.remove(listener);
    }

    @CallSuper
    public void restoreState(Bundle navState) {
        if (navState == null) {
            return;
        }
        navState.setClassLoader(this.context.getClassLoader());
        this.navigatorStateToRestore = navState.getBundle(KEY_NAVIGATOR_STATE);
        this.backStackToRestore = navState.getParcelableArray(KEY_BACK_STACK);
        this.backStackStates.clear();
        int[] intArray = navState.getIntArray(KEY_BACK_STACK_DEST_IDS);
        ArrayList<String> stringArrayList = navState.getStringArrayList(KEY_BACK_STACK_IDS);
        int i10 = 0;
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                this.backStackMap.put(Integer.valueOf(intArray[i11]), stringArrayList.get(i12));
                i11++;
                i12++;
            }
        }
        ArrayList<String> stringArrayList2 = navState.getStringArrayList(KEY_BACK_STACK_STATES_IDS);
        if (stringArrayList2 != null) {
            int size = stringArrayList2.size();
            while (i10 < size) {
                String str = stringArrayList2.get(i10);
                i10++;
                String str2 = str;
                Parcelable[] parcelableArray = navState.getParcelableArray(KEY_BACK_STACK_STATES_PREFIX + str2);
                if (parcelableArray != null) {
                    Map<String, ArrayDeque<NavBackStackEntryState>> map = this.backStackStates;
                    str2.getClass();
                    ArrayDeque<NavBackStackEntryState> arrayDeque = new ArrayDeque<>(parcelableArray.length);
                    Iterator it = ArrayIteratorKt.iterator(parcelableArray);
                    while (it.hasNext()) {
                        Parcelable parcelable = (Parcelable) it.next();
                        parcelable.getClass();
                        arrayDeque.add((NavBackStackEntryState) parcelable);
                    }
                    map.put(str2, arrayDeque);
                }
            }
        }
        this.deepLinkHandled = navState.getBoolean(KEY_DEEP_LINK_HANDLED);
    }

    @CallSuper
    public Bundle saveState() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, Navigator<? extends NavDestination>> entry : this._navigatorProvider.getNavigators().entrySet()) {
            String key = entry.getKey();
            Bundle onSaveState = entry.getValue().onSaveState();
            if (onSaveState != null) {
                arrayList.add(key);
                bundle2.putBundle(key, onSaveState);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList(KEY_NAVIGATOR_STATE_NAMES, arrayList);
            bundle.putBundle(KEY_NAVIGATOR_STATE, bundle2);
        } else {
            bundle = null;
        }
        if (!this.backQueue.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.backQueue.size()];
            Iterator<NavBackStackEntry> it = this.backQueue.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                parcelableArr[i10] = new NavBackStackEntryState(it.next());
                i10++;
            }
            bundle.putParcelableArray(KEY_BACK_STACK, parcelableArr);
        }
        if (!this.backStackMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.backStackMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i11 = 0;
            for (Map.Entry<Integer, String> entry2 : this.backStackMap.entrySet()) {
                int intValue = entry2.getKey().intValue();
                String value = entry2.getValue();
                iArr[i11] = intValue;
                arrayList2.add(value);
                i11++;
            }
            bundle.putIntArray(KEY_BACK_STACK_DEST_IDS, iArr);
            bundle.putStringArrayList(KEY_BACK_STACK_IDS, arrayList2);
        }
        if (!this.backStackStates.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry<String, ArrayDeque<NavBackStackEntryState>> entry3 : this.backStackStates.entrySet()) {
                String key2 = entry3.getKey();
                ArrayDeque<NavBackStackEntryState> value2 = entry3.getValue();
                arrayList3.add(key2);
                Parcelable[] parcelableArr2 = new Parcelable[value2.size()];
                int i12 = 0;
                for (NavBackStackEntryState navBackStackEntryState : value2) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    parcelableArr2[i12] = navBackStackEntryState;
                    i12 = i13;
                }
                bundle.putParcelableArray(ai.onnxruntime.a.l(KEY_BACK_STACK_STATES_PREFIX, key2), parcelableArr2);
            }
            bundle.putStringArrayList(KEY_BACK_STACK_STATES_IDS, arrayList3);
        }
        if (this.deepLinkHandled) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(KEY_DEEP_LINK_HANDLED, this.deepLinkHandled);
        }
        return bundle;
    }

    @CallSuper
    @MainThread
    public void setGraph(NavGraph graph, Bundle startDestinationArgs) {
        NavController navController;
        graph.getClass();
        if (!this.backQueue.isEmpty() && getHostLifecycleState$navigation_runtime_release() == Lifecycle.State.DESTROYED) {
            i.l("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
            return;
        }
        int i10 = 0;
        if (!Intrinsics.areEqual(this._graph, graph)) {
            NavGraph navGraph = this._graph;
            if (navGraph != null) {
                ArrayList arrayList = new ArrayList(this.backStackMap.keySet());
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    Integer num = (Integer) obj;
                    num.getClass();
                    clearBackStackInternal(num.intValue());
                }
                navController = this;
                popBackStackInternal$default(navController, navGraph.getId(), true, false, 4, (Object) null);
            } else {
                navController = this;
            }
            navController._graph = graph;
            onGraphCreated(startDestinationArgs);
            return;
        }
        int size2 = graph.getNodes().size();
        while (i10 < size2) {
            NavDestination valueAt = graph.getNodes().valueAt(i10);
            NavGraph navGraph2 = this._graph;
            navGraph2.getClass();
            int keyAt = navGraph2.getNodes().keyAt(i10);
            NavGraph navGraph3 = this._graph;
            navGraph3.getClass();
            navGraph3.getNodes().replace(keyAt, valueAt);
            i10++;
        }
        for (NavBackStackEntry navBackStackEntry : this.backQueue) {
            List<NavDestination> asReversed = CollectionsKt.asReversed(SequencesKt.toList(NavDestination.INSTANCE.getHierarchy(navBackStackEntry.getDestination())));
            NavDestination navDestination = this._graph;
            navDestination.getClass();
            for (NavDestination navDestination2 : asReversed) {
                if (!Intrinsics.areEqual(navDestination2, this._graph) || !Intrinsics.areEqual(navDestination, graph)) {
                    if (navDestination instanceof NavGraph) {
                        navDestination = ((NavGraph) navDestination).findNode(navDestination2.getId());
                        navDestination.getClass();
                    }
                }
            }
            navBackStackEntry.setDestination(navDestination);
        }
    }

    public final void setHostLifecycleState$navigation_runtime_release(Lifecycle.State state) {
        state.getClass();
        this.hostLifecycleState = state;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLifecycleOwner(LifecycleOwner owner) {
        Lifecycle lifecycle;
        owner.getClass();
        if (Intrinsics.areEqual(owner, this.lifecycleOwner)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this.lifecycleObserver);
        }
        this.lifecycleOwner = owner;
        owner.getLifecycle().addObserver(this.lifecycleObserver);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setNavigatorProvider(NavigatorProvider navigatorProvider) {
        navigatorProvider.getClass();
        if (this.backQueue.isEmpty()) {
            this._navigatorProvider = navigatorProvider;
        } else {
            i.l("NavigatorProvider must be set before setGraph call");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setOnBackPressedDispatcher(OnBackPressedDispatcher dispatcher) {
        dispatcher.getClass();
        if (Intrinsics.areEqual(dispatcher, this.onBackPressedDispatcher)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.lifecycleOwner;
        if (lifecycleOwner != null) {
            this.onBackPressedCallback.remove();
            this.onBackPressedDispatcher = dispatcher;
            dispatcher.addCallback(lifecycleOwner, this.onBackPressedCallback);
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            lifecycle.removeObserver(this.lifecycleObserver);
            lifecycle.addObserver(this.lifecycleObserver);
            return;
        }
        i.l("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setViewModelStore(ViewModelStore viewModelStore) {
        viewModelStore.getClass();
        NavControllerViewModel navControllerViewModel = this.viewModel;
        NavControllerViewModel.Companion companion = NavControllerViewModel.INSTANCE;
        if (Intrinsics.areEqual(navControllerViewModel, companion.getInstance(viewModelStore))) {
            return;
        }
        if (this.backQueue.isEmpty()) {
            this.viewModel = companion.getInstance(viewModelStore);
        } else {
            i.l("ViewModelStore should be set before setGraph call");
        }
    }

    public final NavBackStackEntry unlinkChildFromParent$navigation_runtime_release(NavBackStackEntry child) {
        child.getClass();
        NavBackStackEntry remove = this.childToParentEntries.remove(child);
        Integer num = null;
        if (remove == null) {
            return null;
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(remove);
        if (atomicInteger != null) {
            num = Integer.valueOf(atomicInteger.decrementAndGet());
        }
        if (num != null && num.intValue() == 0) {
            NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(this._navigatorProvider.getNavigator(remove.getDestination().getNavigatorName()));
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.markTransitionComplete(remove);
            }
            this.parentToChildCount.remove(remove);
        }
        return remove;
    }

    public final void updateBackStackLifecycle$navigation_runtime_release() {
        Object removeFirst;
        Boolean bool;
        AtomicInteger atomicInteger;
        t transitionsInProgress;
        Set set;
        List<NavBackStackEntry> mutableList = CollectionsKt.toMutableList((Collection) this.backQueue);
        if (!mutableList.isEmpty()) {
            NavDestination destination = ((NavBackStackEntry) CollectionsKt.last(mutableList)).getDestination();
            ArrayList arrayList = new ArrayList();
            if (destination instanceof FloatingWindow) {
                Iterator it = CollectionsKt.reversed(mutableList).iterator();
                while (it.hasNext()) {
                    NavDestination destination2 = ((NavBackStackEntry) it.next()).getDestination();
                    arrayList.add(destination2);
                    if (!(destination2 instanceof FloatingWindow) && !(destination2 instanceof NavGraph)) {
                        break;
                    }
                }
            }
            HashMap hashMap = new HashMap();
            for (NavBackStackEntry navBackStackEntry : CollectionsKt.reversed(mutableList)) {
                Lifecycle.State maxLifecycle = navBackStackEntry.getMaxLifecycle();
                NavDestination destination3 = navBackStackEntry.getDestination();
                if (destination != null && destination3.getId() == destination.getId()) {
                    Lifecycle.State state = Lifecycle.State.RESUMED;
                    if (maxLifecycle != state) {
                        NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(get_navigatorProvider().getNavigator(navBackStackEntry.getDestination().getNavigatorName()));
                        if (navControllerNavigatorState != null && (transitionsInProgress = navControllerNavigatorState.getTransitionsInProgress()) != null && (set = (Set) transitionsInProgress.getValue()) != null) {
                            bool = Boolean.valueOf(set.contains(navBackStackEntry));
                        } else {
                            bool = null;
                        }
                        if (!Intrinsics.areEqual(bool, Boolean.TRUE) && ((atomicInteger = this.parentToChildCount.get(navBackStackEntry)) == null || atomicInteger.get() != 0)) {
                            hashMap.put(navBackStackEntry, state);
                        } else {
                            hashMap.put(navBackStackEntry, Lifecycle.State.STARTED);
                        }
                    }
                    NavDestination navDestination = (NavDestination) CollectionsKt.firstOrNull((List) arrayList);
                    if (navDestination != null && navDestination.getId() == destination3.getId()) {
                        CollectionsKt__MutableCollectionsKt.removeFirst(arrayList);
                    }
                    destination = destination.getParent();
                } else if (!arrayList.isEmpty() && destination3.getId() == ((NavDestination) CollectionsKt.first((List) arrayList)).getId()) {
                    removeFirst = CollectionsKt__MutableCollectionsKt.removeFirst(arrayList);
                    NavDestination navDestination2 = (NavDestination) removeFirst;
                    if (maxLifecycle == Lifecycle.State.RESUMED) {
                        navBackStackEntry.setMaxLifecycle(Lifecycle.State.STARTED);
                    } else {
                        Lifecycle.State state2 = Lifecycle.State.STARTED;
                        if (maxLifecycle != state2) {
                            hashMap.put(navBackStackEntry, state2);
                        }
                    }
                    NavGraph parent = navDestination2.getParent();
                    if (parent != null && !arrayList.contains(parent)) {
                        arrayList.add(parent);
                    }
                } else {
                    navBackStackEntry.setMaxLifecycle(Lifecycle.State.CREATED);
                }
            }
            for (NavBackStackEntry navBackStackEntry2 : mutableList) {
                Lifecycle.State state3 = (Lifecycle.State) hashMap.get(navBackStackEntry2);
                if (state3 != null) {
                    navBackStackEntry2.setMaxLifecycle(state3);
                } else {
                    navBackStackEntry2.updateState();
                }
            }
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u0010\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/navigation/NavController$Companion;", "", "()V", "KEY_BACK_STACK", "", "KEY_BACK_STACK_DEST_IDS", "KEY_BACK_STACK_IDS", "KEY_BACK_STACK_STATES_IDS", "KEY_BACK_STACK_STATES_PREFIX", "KEY_DEEP_LINK_ARGS", "KEY_DEEP_LINK_EXTRAS", "getKEY_DEEP_LINK_EXTRAS$annotations", "KEY_DEEP_LINK_HANDLED", "KEY_DEEP_LINK_IDS", "KEY_DEEP_LINK_INTENT", "KEY_NAVIGATOR_STATE", "KEY_NAVIGATOR_STATE_NAMES", "TAG", "deepLinkSaveState", "", "enableDeepLinkSaveState", "", "saveState", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NavDeepLinkSaveStateControl
        public final void enableDeepLinkSaveState(boolean saveState) {
            NavController.deepLinkSaveState = saveState;
        }

        private Companion() {
        }

        public static /* synthetic */ void getKEY_DEEP_LINK_EXTRAS$annotations() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popBackStackInternal$default(NavController navController, Navigator navigator, NavBackStackEntry navBackStackEntry, boolean z9, Function1 function1, int i10, Object obj) {
        if (obj != null) {
            b.g("Super calls with default arguments not supported in this target, function: popBackStackInternal");
            return;
        }
        if ((i10 & 4) != 0) {
            function1 = new Function1<NavBackStackEntry, Unit>() { // from class: androidx.navigation.NavController$popBackStackInternal$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry2) {
                    invoke2(navBackStackEntry2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(NavBackStackEntry navBackStackEntry2) {
                    navBackStackEntry2.getClass();
                }
            };
        }
        navController.popBackStackInternal(navigator, navBackStackEntry, z9, function1);
    }

    public static /* synthetic */ boolean popBackStackInternal$default(NavController navController, Object obj, boolean z9, boolean z10, int i10, Object obj2) {
        if (obj2 != null) {
            b.g("Super calls with default arguments not supported in this target, function: popBackStackInternal");
            return false;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return navController.popBackStackInternal((NavController) obj, z9, z10);
    }

    public static /* synthetic */ void navigate$default(NavController navController, Object obj, NavOptions navOptions, Navigator.Extras extras, int i10, Object obj2) {
        if (obj2 != null) {
            b.g("Super calls with default arguments not supported in this target, function: navigate");
            return;
        }
        if ((i10 & 2) != 0) {
            navOptions = null;
        }
        if ((i10 & 4) != 0) {
            extras = null;
        }
        navController.navigate((NavController) obj, navOptions, extras);
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, String str, boolean z9, boolean z10, int i10, Object obj) {
        if (obj != null) {
            b.g("Super calls with default arguments not supported in this target, function: popBackStack");
            return false;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return navController.popBackStack(str, z9, z10);
    }

    @MainThread
    public final boolean clearBackStack(@IdRes int destinationId) {
        return clearBackStackInternal(destinationId) && dispatchOnDestinationChanged();
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, Object obj, boolean z9, boolean z10, int i10, Object obj2) {
        if (obj2 != null) {
            b.g("Super calls with default arguments not supported in this target, function: popBackStack");
            return false;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return navController.popBackStack((NavController) obj, z9, z10);
    }

    @MainThread
    public final <T> boolean clearBackStack() {
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        throw null;
    }

    @MainThread
    public final boolean clearBackStack(String route) {
        route.getClass();
        return clearBackStackInternal(route) && dispatchOnDestinationChanged();
    }

    @JvmOverloads
    @MainThread
    public final boolean popBackStack(String str, boolean z9) {
        str.getClass();
        return popBackStack$default(this, str, z9, false, 4, (Object) null);
    }

    @JvmOverloads
    @MainThread
    public final <T> boolean popBackStack(T t, boolean z9) {
        t.getClass();
        return popBackStack$default(this, (Object) t, z9, false, 4, (Object) null);
    }

    @MainThread
    public boolean popBackStack(@IdRes int destinationId, boolean inclusive) {
        return popBackStack(destinationId, inclusive, false);
    }

    @MainThread
    public boolean popBackStack(@IdRes int destinationId, boolean inclusive, boolean saveState) {
        return popBackStackInternal(destinationId, inclusive, saveState) && dispatchOnDestinationChanged();
    }

    @JvmOverloads
    @MainThread
    public final boolean popBackStack(String route, boolean inclusive, boolean saveState) {
        route.getClass();
        return popBackStackInternal(route, inclusive, saveState) && dispatchOnDestinationChanged();
    }

    @JvmOverloads
    @MainThread
    public final <T> boolean popBackStack(boolean inclusive, boolean saveState) {
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        throw null;
    }

    @JvmOverloads
    @MainThread
    public final <T> boolean popBackStack(T route, boolean inclusive, boolean saveState) {
        route.getClass();
        return popBackStackInternal((NavController) route, inclusive, saveState) && dispatchOnDestinationChanged();
    }

    @JvmOverloads
    @MainThread
    public final <T> boolean popBackStack(boolean z9) {
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        throw null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findDestination(String route) {
        route.getClass();
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            return null;
        }
        navGraph.getClass();
        if (!Intrinsics.areEqual(navGraph.getRoute(), route)) {
            NavGraph navGraph2 = this._graph;
            navGraph2.getClass();
            if (navGraph2.matchRoute(route) == null) {
                return getTopGraph(this.backQueue).findNode(route);
            }
        }
        return this._graph;
    }

    @MainThread
    private final boolean clearBackStackInternal(String route) {
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((NavControllerNavigatorState) it.next()).setNavigating(true);
        }
        boolean restoreStateInternal = restoreStateInternal(route);
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((NavControllerNavigatorState) it2.next()).setNavigating(false);
        }
        return restoreStateInternal && popBackStackInternal(route, true, false);
    }

    public NavBackStackEntry getBackStackEntry(@IdRes int destinationId) {
        NavBackStackEntry navBackStackEntry;
        ArrayDeque<NavBackStackEntry> arrayDeque = this.backQueue;
        ListIterator<NavBackStackEntry> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntry = null;
                break;
            }
            navBackStackEntry = listIterator.previous();
            if (navBackStackEntry.getDestination().getId() == destinationId) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
        if (navBackStackEntry2 != null) {
            return navBackStackEntry2;
        }
        StringBuilder q8 = ai.onnxruntime.a.q(destinationId, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        q8.append(getCurrentDestination());
        throw new IllegalArgumentException(q8.toString().toString());
    }

    public final <T> NavBackStackEntry getBackStackEntry() {
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        throw null;
    }

    public final <T> NavBackStackEntry getBackStackEntry(T route) {
        route.getClass();
        return getBackStackEntry(generateRouteFilled(route));
    }

    @MainThread
    private final boolean popBackStackInternal(@IdRes int destinationId, boolean inclusive, boolean saveState) {
        NavDestination navDestination;
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt.reversed(this.backQueue).iterator();
        while (true) {
            if (!it.hasNext()) {
                navDestination = null;
                break;
            }
            navDestination = ((NavBackStackEntry) it.next()).getDestination();
            Navigator navigator = this._navigatorProvider.getNavigator(navDestination.getNavigatorName());
            if (inclusive || navDestination.getId() != destinationId) {
                arrayList.add(navigator);
            }
            if (navDestination.getId() == destinationId) {
                break;
            }
        }
        if (navDestination == null) {
            Log.i(TAG, "Ignoring popBackStack to destination " + NavDestination.INSTANCE.getDisplayName(this.context, destinationId) + " as it was not found on the current back stack");
            return false;
        }
        return executePopOperations(arrayList, navDestination, inclusive, saveState);
    }

    private final <T> boolean popBackStackInternal(T route, boolean inclusive, boolean saveState) {
        return popBackStackInternal(generateRouteFilled(route), inclusive, saveState);
    }

    private final void popBackStackInternal(Navigator<? extends NavDestination> navigator, NavBackStackEntry navBackStackEntry, boolean z9, Function1<? super NavBackStackEntry, Unit> function1) {
        this.popFromBackStackHandler = function1;
        navigator.popBackStack(navBackStackEntry, z9);
        this.popFromBackStackHandler = null;
    }

    private final boolean restoreStateInternal(int id, Bundle args, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        if (!this.backStackMap.containsKey(Integer.valueOf(id))) {
            return false;
        }
        final String str = this.backStackMap.get(Integer.valueOf(id));
        CollectionsKt__MutableCollectionsKt.removeAll(this.backStackMap.values(), new Function1<String, Boolean>() { // from class: androidx.navigation.NavController$restoreStateInternal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(String str2) {
                return Boolean.valueOf(Intrinsics.areEqual(str2, str));
            }
        });
        return executeRestoreState(instantiateBackStack((ArrayDeque) TypeIntrinsics.asMutableMap(this.backStackStates).remove(str)), args, navOptions, navigatorExtras);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NavigationRes int graphResId) {
        setGraph(getNavInflater().inflate(graphResId), (Bundle) null);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NavigationRes int graphResId, Bundle startDestinationArgs) {
        setGraph(getNavInflater().inflate(graphResId), startDestinationArgs);
    }

    @CallSuper
    @MainThread
    public void setGraph(NavGraph navGraph) {
        navGraph.getClass();
        setGraph(navGraph, (Bundle) null);
    }

    @JvmOverloads
    @MainThread
    public final <T> void navigate(T t, NavOptions navOptions) {
        t.getClass();
        navigate$default(this, t, navOptions, (Navigator.Extras) null, 4, (Object) null);
    }

    @JvmOverloads
    @MainThread
    public final void navigate(String str) {
        str.getClass();
        navigate$default(this, str, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
    }

    @JvmOverloads
    @MainThread
    public final void navigate(String str, NavOptions navOptions) {
        str.getClass();
        navigate$default(this, str, navOptions, (Navigator.Extras) null, 4, (Object) null);
    }

    @MainThread
    public void navigate(@IdRes int resId) {
        navigate(resId, (Bundle) null);
    }

    @MainThread
    public void navigate(@IdRes int resId, Bundle args) {
        navigate(resId, args, (NavOptions) null);
    }

    @MainThread
    public void navigate(@IdRes int resId, Bundle args, NavOptions navOptions) {
        navigate(resId, args, navOptions, (Navigator.Extras) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
    @androidx.annotation.MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void navigate(@androidx.annotation.IdRes int r12, android.os.Bundle r13, androidx.navigation.NavOptions r14, androidx.navigation.Navigator.Extras r15) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.navigate(int, android.os.Bundle, androidx.navigation.NavOptions, androidx.navigation.Navigator$Extras):void");
    }

    @MainThread
    public void navigate(Uri deepLink) {
        deepLink.getClass();
        navigate(new NavDeepLinkRequest(deepLink, null, null));
    }

    @MainThread
    public void navigate(Uri deepLink, NavOptions navOptions) {
        deepLink.getClass();
        navigate(new NavDeepLinkRequest(deepLink, null, null), navOptions, (Navigator.Extras) null);
    }

    @MainThread
    public void navigate(Uri deepLink, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        deepLink.getClass();
        navigate(new NavDeepLinkRequest(deepLink, null, null), navOptions, navigatorExtras);
    }

    @MainThread
    public void navigate(NavDeepLinkRequest request) {
        request.getClass();
        navigate(request, (NavOptions) null);
    }

    @MainThread
    public void navigate(NavDeepLinkRequest request, NavOptions navOptions) {
        request.getClass();
        navigate(request, navOptions, (Navigator.Extras) null);
    }

    @MainThread
    public void navigate(NavDeepLinkRequest request, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        request.getClass();
        if (this._graph != null) {
            NavGraph topGraph = getTopGraph(this.backQueue);
            NavDestination.DeepLinkMatch matchDeepLinkComprehensive = topGraph.matchDeepLinkComprehensive(request, true, true, topGraph);
            if (matchDeepLinkComprehensive != null) {
                Bundle addInDefaultArgs = matchDeepLinkComprehensive.getDestination().addInDefaultArgs(matchDeepLinkComprehensive.getMatchingArgs());
                if (addInDefaultArgs == null) {
                    addInDefaultArgs = new Bundle();
                }
                NavDestination destination = matchDeepLinkComprehensive.getDestination();
                Intent intent = new Intent();
                intent.setDataAndType(request.getUri(), request.getMimeType());
                intent.setAction(request.getAction());
                addInDefaultArgs.putParcelable(KEY_DEEP_LINK_INTENT, intent);
                navigate(destination, addInDefaultArgs, navOptions, navigatorExtras);
                return;
            }
            StringBuilder sb = new StringBuilder("Navigation destination that matches request ");
            sb.append(request);
            b.s(sb, " cannot be found in the navigation graph ", this._graph);
            return;
        }
        n0.b.u("Cannot navigate to ", request, ". Navigation graph has not been set for NavController ", this, 46);
    }

    @JvmOverloads
    @MainThread
    public final <T> void navigate(T t) {
        t.getClass();
        navigate$default(this, t, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
    }

    @MainThread
    public void navigate(NavDirections directions) {
        directions.getClass();
        navigate(directions.getActionId(), directions.getArguments(), (NavOptions) null);
    }

    @MainThread
    public void navigate(NavDirections directions, NavOptions navOptions) {
        directions.getClass();
        navigate(directions.getActionId(), directions.getArguments(), navOptions);
    }

    @MainThread
    public void navigate(NavDirections directions, Navigator.Extras navigatorExtras) {
        directions.getClass();
        navigatorExtras.getClass();
        navigate(directions.getActionId(), directions.getArguments(), (NavOptions) null, navigatorExtras);
    }

    @MainThread
    public final void navigate(String route, Function1<? super NavOptionsBuilder, Unit> builder) {
        route.getClass();
        builder.getClass();
        navigate$default(this, route, NavOptionsBuilderKt.navOptions(builder), (Navigator.Extras) null, 4, (Object) null);
    }

    @JvmOverloads
    @MainThread
    public final void navigate(String route, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        route.getClass();
        if (this._graph != null) {
            NavGraph topGraph = getTopGraph(this.backQueue);
            NavDestination.DeepLinkMatch matchRouteComprehensive = topGraph.matchRouteComprehensive(route, true, true, topGraph);
            if (matchRouteComprehensive != null) {
                NavDestination destination = matchRouteComprehensive.getDestination();
                Bundle addInDefaultArgs = destination.addInDefaultArgs(matchRouteComprehensive.getMatchingArgs());
                if (addInDefaultArgs == null) {
                    addInDefaultArgs = new Bundle();
                }
                NavDestination destination2 = matchRouteComprehensive.getDestination();
                Intent intent = new Intent();
                Uri parse = Uri.parse(NavDestination.INSTANCE.createRoute(destination.getRoute()));
                parse.getClass();
                intent.setDataAndType(parse, null);
                intent.setAction(null);
                addInDefaultArgs.putParcelable(KEY_DEEP_LINK_INTENT, intent);
                navigate(destination2, addInDefaultArgs, navOptions, navigatorExtras);
                return;
            }
            StringBuilder x9 = ai.onnxruntime.a.x("Navigation destination that matches route ", route, " cannot be found in the navigation graph ");
            x9.append(this._graph);
            throw new IllegalArgumentException(x9.toString());
        }
        n0.b.u("Cannot navigate to ", route, ". Navigation graph has not been set for NavController ", this, 46);
    }

    @MainThread
    public final <T> void navigate(T route, Function1<? super NavOptionsBuilder, Unit> builder) {
        route.getClass();
        builder.getClass();
        navigate$default(this, route, NavOptionsBuilderKt.navOptions(builder), (Navigator.Extras) null, 4, (Object) null);
    }

    @JvmOverloads
    @MainThread
    public final <T> void navigate(T route, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        route.getClass();
        navigate(generateRouteFilled(route), navOptions, navigatorExtras);
    }
}
