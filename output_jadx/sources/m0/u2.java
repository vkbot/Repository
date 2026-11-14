package m0;

import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class u2 extends ItemTouchHelper.SimpleCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c3 f3872a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(c3 c3Var) {
        super(0, 12);
        this.f3872a = c3Var;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback
    public final int getSwipeDirs(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        c3 c3Var = this.f3872a;
        if (!c3Var.f3639v && viewHolder.getBindingAdapter() == c3Var.e) {
            return super.getSwipeDirs(recyclerView, viewHolder);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f8, float f10, int i10, boolean z9) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (i10 == 1 && f8 != 0.0f) {
            View view = viewHolder.itemView;
            Paint paint = new Paint();
            if (f8 > 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i11 = 160;
                i12 = 67;
                i13 = 46;
            } else {
                i11 = 54;
                i12 = 51;
                i13 = 218;
            }
            paint.setColor(Color.rgb(i13, i11, i12));
            if (z10) {
                canvas.drawRect(view.getLeft(), view.getTop(), view.getLeft() + f8, view.getBottom(), paint);
            } else {
                canvas.drawRect(view.getRight() + f8, view.getTop(), view.getRight(), view.getBottom(), paint);
            }
            Paint paint2 = new Paint(1);
            paint2.setColor(-1);
            c3 c3Var = this.f3872a;
            paint2.setTextSize(c3Var.z(14));
            paint2.setFakeBoldText(true);
            if (z10) {
                i14 = R.string.user_file_manager_copy;
            } else {
                i14 = R.string.delete_custom_widget;
            }
            String string = c3Var.getString(i14);
            float height = (((view.getHeight() - paint2.descent()) - paint2.ascent()) / 2.0f) + view.getTop();
            if (z10) {
                canvas.drawText(string, c3Var.z(16) + view.getLeft(), height, paint2);
            } else {
                canvas.drawText(string, (view.getRight() - c3Var.z(16)) - paint2.measureText(string), height, paint2);
            }
        }
        super.onChildDraw(canvas, recyclerView, viewHolder, f8, f10, i10, z9);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void onSwiped(RecyclerView.ViewHolder viewHolder, int i10) {
        File absoluteFile;
        c3 c3Var = this.f3872a;
        ArrayList arrayList = c3Var.f3624b;
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1 && bindingAdapterPosition < arrayList.size()) {
            File file = (File) arrayList.get(bindingAdapterPosition);
            c3Var.e.notifyItemChanged(bindingAdapterPosition);
            boolean z9 = c3Var.f3639v;
            if (!z9) {
                if (i10 == 8) {
                    if (file != null && file.exists()) {
                        try {
                            absoluteFile = file.getCanonicalFile();
                        } catch (IOException unused) {
                            absoluteFile = file.getAbsoluteFile();
                        }
                        c3Var.f3638u = absoluteFile;
                        c3Var.I(c3Var.getString(R.string.user_file_manager_copy_ready, absoluteFile.getName()));
                        c3Var.K();
                        return;
                    }
                    c3Var.I(c3Var.getString(R.string.user_file_manager_open_root_error));
                    return;
                }
                if (i10 == 4 && !z9 && file != null && file.exists()) {
                    new AlertDialog.Builder(c3Var.requireContext(), R.style.ThemeOverlay_JCarTools_ModernAlert).setTitle(R.string.user_file_manager_delete_title).setMessage(c3Var.getString(R.string.user_file_manager_delete_message, file.getName())).setPositiveButton(R.string.delete_custom_widget, new e0.e0(6, c3Var, file)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).show();
                    return;
                }
                return;
            }
            return;
        }
        c3Var.e.notifyDataSetChanged();
    }
}
