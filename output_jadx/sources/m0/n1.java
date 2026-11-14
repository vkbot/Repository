package m0;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.navistart.Notik;
import com.example.navistart.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import ru.transfer.MessageData;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class n1 extends l0.b implements t1.g, w0.b0 {
    public static Notik e;

    /* renamed from: b, reason: collision with root package name */
    public List f3802b = new ArrayList();
    public LinearLayout c;
    public t1.h d;

    @Override // w0.b0
    public final void i(String str) {
        if (this.d != null) {
            new Handler(Looper.getMainLooper()).post(new e0.j2(20, this, str));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable(e0.m.h(new byte[]{-40, -34, 76, 96, 33, 113, -56, -43, -44, -49, 94}, new byte[]{-75, -69, 63, 19, 64, 22, -83, -111}));
            if (serializable instanceof MessageData) {
                this.f3802b.add((MessageData) serializable);
            } else if (serializable instanceof List) {
                List list = (List) serializable;
                if (!list.isEmpty() && (list.get(0) instanceof MessageData)) {
                    this.f3802b = list;
                }
            }
        }
        View inflate = layoutInflater.inflate(R.layout.messagedataview, viewGroup, false);
        this.c = (LinearLayout) inflate.findViewById(R.id.LinearLayoutMessageDataView);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [t1.h, android.widget.FrameLayout, android.view.View, java.lang.Object, android.view.ViewGroup] */
    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.c.setOnHierarchyChangeListener(new m1(this));
        List list = this.f3802b;
        if (list != null && !list.isEmpty()) {
            this.c.removeAllViews();
            for (MessageData messageData : this.f3802b) {
                Context requireContext = requireContext();
                ?? frameLayout = new FrameLayout(requireContext);
                frameLayout.f5760f = false;
                View.inflate(requireContext, R.layout.message_view, frameLayout);
                frameLayout.f5759b = (TextView) frameLayout.findViewById(R.id.messageText);
                frameLayout.c = (TextView) frameLayout.findViewById(R.id.titleText);
                frameLayout.f5764j = (ImageView) frameLayout.findViewById(R.id.appIco);
                frameLayout.d = (ImageButton) frameLayout.findViewById(R.id.button_send_messadge);
                ImageButton imageButton = (ImageButton) frameLayout.findViewById(R.id.button_golos_messadge);
                frameLayout.e = imageButton;
                imageButton.setOnClickListener(new androidx.navigation.c(20, frameLayout));
                frameLayout.f5761g = (EditText) frameLayout.findViewById(R.id.editText_send_messadge);
                frameLayout.f5762h = (LinearLayout) frameLayout.findViewById(R.id.LinearLayout_send_messadge);
                frameLayout.f5763i = (LinearLayout) frameLayout.findViewById(R.id.LinearLayout_send_messadge_edit);
                frameLayout.setMessageDataViewListener(this);
                frameLayout.setMessage(messageData);
                this.c.addView((View) frameLayout, 0);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.d = null;
    }

    @Override // w0.b0
    public final void m(w0.b bVar) {
    }
}
