package z;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import y.f;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6682b = 0;
    public final WeakReference c;

    public b(c cVar) {
        this.c = new WeakReference(cVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f6682b) {
            case 0:
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                c cVar = (c) this.c.get();
                if (cVar != null) {
                    ArrayList arrayList = cVar.f6684b;
                    View view = cVar.f6683a;
                    if (!arrayList.isEmpty()) {
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int i14 = 0;
                        if (layoutParams != null) {
                            i10 = layoutParams.width;
                        } else {
                            i10 = 0;
                        }
                        int a10 = cVar.a(view.getWidth(), i10, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        if (layoutParams2 != null) {
                            i11 = layoutParams2.height;
                        } else {
                            i11 = 0;
                        }
                        int a11 = cVar.a(view.getHeight(), i11, paddingBottom);
                        if (a10 > 0 || a10 == Integer.MIN_VALUE) {
                            if (a11 > 0 || a11 == Integer.MIN_VALUE) {
                                ArrayList arrayList2 = new ArrayList(arrayList);
                                int size = arrayList2.size();
                                while (i14 < size) {
                                    Object obj = arrayList2.get(i14);
                                    i14++;
                                    ((f) obj).m(a10, a11);
                                }
                                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.removeOnPreDrawListener(cVar.c);
                                }
                                cVar.c = null;
                                arrayList.clear();
                                return true;
                            }
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            default:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                e eVar = (e) this.c.get();
                if (eVar != null) {
                    ArrayList arrayList3 = eVar.f6686b;
                    View view2 = eVar.f6685a;
                    if (!arrayList3.isEmpty()) {
                        int paddingRight2 = view2.getPaddingRight() + view2.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                        int i15 = 0;
                        if (layoutParams3 != null) {
                            i12 = layoutParams3.width;
                        } else {
                            i12 = 0;
                        }
                        int a12 = eVar.a(view2.getWidth(), i12, paddingRight2);
                        int paddingBottom2 = view2.getPaddingBottom() + view2.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                        if (layoutParams4 != null) {
                            i13 = layoutParams4.height;
                        } else {
                            i13 = 0;
                        }
                        int a13 = eVar.a(view2.getHeight(), i13, paddingBottom2);
                        if (a12 > 0 || a12 == Integer.MIN_VALUE) {
                            if (a13 > 0 || a13 == Integer.MIN_VALUE) {
                                ArrayList arrayList4 = new ArrayList(arrayList3);
                                int size2 = arrayList4.size();
                                while (i15 < size2) {
                                    Object obj2 = arrayList4.get(i15);
                                    i15++;
                                    ((f) obj2).m(a12, a13);
                                }
                                ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
                                if (viewTreeObserver2.isAlive()) {
                                    viewTreeObserver2.removeOnPreDrawListener(eVar.c);
                                }
                                eVar.c = null;
                                arrayList3.clear();
                                return true;
                            }
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
        }
    }

    public b(e eVar) {
        this.c = new WeakReference(eVar);
    }
}
