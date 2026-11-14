package e4;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.ListPopupWindow;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class u implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f2192b;

    public u(w wVar) {
        this.f2192b = wVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        Object item;
        CharSequence convertSelectionToString;
        w wVar = this.f2192b;
        ListPopupWindow listPopupWindow = wVar.f2194b;
        if (i10 < 0) {
            item = listPopupWindow.getSelectedItem();
        } else {
            item = wVar.getAdapter().getItem(i10);
        }
        convertSelectionToString = wVar.convertSelectionToString(item);
        wVar.setText(convertSelectionToString, false);
        AdapterView.OnItemClickListener onItemClickListener = wVar.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i10 < 0) {
                view = listPopupWindow.getSelectedView();
                i10 = listPopupWindow.getSelectedItemPosition();
                j10 = listPopupWindow.getSelectedItemId();
            }
            onItemClickListener.onItemClick(listPopupWindow.getListView(), view, i10, j10);
        }
        listPopupWindow.dismiss();
    }
}
