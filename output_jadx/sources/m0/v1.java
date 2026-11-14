package m0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class v1 extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w1 f3882a;

    public v1(w1 w1Var) {
        this.f3882a = w1Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f3882a.f3886f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        final u1 u1Var = (u1) viewHolder;
        final s1 s1Var = (s1) this.f3882a.f3886f.get(i10);
        u1Var.itemView.setTranslationY(0.0f);
        u1Var.itemView.setAlpha(1.0f);
        u1Var.itemView.setScaleX(1.0f);
        u1Var.itemView.setScaleY(1.0f);
        u1Var.f3870a.setImageDrawable(s1Var.c);
        u1Var.f3871b.setText(s1Var.f3853a);
        u1Var.itemView.setOnClickListener(new androidx.navigation.ui.a(12, this, s1Var));
        u1Var.itemView.setOnTouchListener(new View.OnTouchListener() { // from class: m0.t1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                u1 u1Var2 = u1.this;
                w1 w1Var = u1Var2.e.f3882a;
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                u1.a(view);
                                return true;
                            }
                        } else {
                            float rawX = motionEvent.getRawX() - u1Var2.c;
                            float rawY = motionEvent.getRawY() - u1Var2.d;
                            if (rawY < 0.0f && Math.abs(rawY) > Math.abs(rawX)) {
                                RecyclerView recyclerView = w1Var.f3885b;
                                if (recyclerView != null) {
                                    recyclerView.requestDisallowInterceptTouchEvent(true);
                                }
                                float min = Math.min(1.0f, Math.abs(rawY) / 126.0f);
                                view.setTranslationY(rawY * 0.65f);
                                view.setAlpha(1.0f - (0.75f * min));
                                float f8 = 1.0f - (min * 0.06f);
                                view.setScaleX(f8);
                                view.setScaleY(f8);
                            }
                        }
                        return true;
                    }
                    float rawX2 = motionEvent.getRawX() - u1Var2.c;
                    float rawY2 = motionEvent.getRawY() - u1Var2.d;
                    if (rawY2 < -70.0f && Math.abs(rawY2) > Math.abs(rawX2)) {
                        Context requireContext = w1Var.requireContext();
                        s1 s1Var2 = s1Var;
                        if (!w1.t(requireContext, s1Var2.f3854b)) {
                            u1.a(view);
                            return true;
                        }
                        int adapterPosition = u1Var2.getAdapterPosition();
                        if (adapterPosition == -1) {
                            u1.a(view);
                            return true;
                        }
                        view.animate().translationY((-view.getHeight()) * 0.65f).alpha(0.0f).scaleX(0.92f).scaleY(0.92f).setDuration(240L).withEndAction(new androidx.activity.f(u1Var2, s1Var2, adapterPosition, 7)).start();
                        return true;
                    }
                    if (Math.abs(rawX2) < 12.0f && Math.abs(rawY2) < 12.0f) {
                        view.performClick();
                        return true;
                    }
                    u1.a(view);
                    return true;
                }
                u1Var2.c = motionEvent.getRawX();
                u1Var2.d = motionEvent.getRawY();
                view.animate().cancel();
                view.setTranslationY(0.0f);
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                return true;
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new u1(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recent_task, viewGroup, false));
    }
}
