package m0;

import android.content.Context;
import android.text.format.Formatter;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class x2 extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c3 f3897a;

    public x2(c3 c3Var) {
        this.f3897a = c3Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f3897a.f3624b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        String str;
        String str2;
        File absoluteFile;
        String string;
        w2 w2Var = (w2) viewHolder;
        c3 c3Var = this.f3897a;
        File file = (File) c3Var.f3624b.get(i10);
        String name = file.getName();
        if (name == null || name.length() == 0) {
            name = c3.G(file);
        }
        TextView textView = w2Var.f3891a;
        if (file.isDirectory()) {
            StringBuilder sb = new StringBuilder();
            sb.append(e0.m.h(new byte[]{52}, new byte[]{111, -4, 1, -124, -37, -55, -27, 76}));
            sb.append(c3Var.getString(R.string.folder));
            name = com.google.protobuf.q.l(new byte[]{-65, 108}, new byte[]{-30, 76, 27, 89, 122, -114, 125, -28}, sb, name);
        }
        textView.setText(name);
        TextView textView2 = w2Var.f3892b;
        long lastModified = file.lastModified();
        if (lastModified > 0) {
            str = DateFormat.getDateTimeInstance(3, 3).format(new Date(lastModified));
        } else {
            str = "";
        }
        String str3 = str;
        if (file.isDirectory()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c3Var.getString(R.string.folder));
            sb2.append(e0.m.h(new byte[]{-4, 72, -98, -112, 104}, new byte[]{-36, 104, -30, -80, 72, 82, -14, -46}));
            String G = c3.G(file);
            y2 y2Var = (y2) c3Var.c.get(G);
            if (y2Var != null) {
                if (y2Var.e) {
                    string = c3Var.getString(R.string.user_file_manager_folder_size_error);
                } else {
                    String formatShortFileSize = Formatter.formatShortFileSize(c3Var.requireContext(), y2Var.f3903b);
                    if (y2Var.d) {
                        string = c3Var.getString(R.string.user_file_manager_folder_size_partial, formatShortFileSize);
                    } else {
                        string = formatShortFileSize;
                    }
                }
            } else {
                if (c3Var.d.add(G)) {
                    try {
                        absoluteFile = file.getCanonicalFile();
                    } catch (IOException unused) {
                        absoluteFile = file.getAbsoluteFile();
                    }
                    e0.w.c(-1, e0.m.h(new byte[]{108, 52, 84, 99, -21, 46, -108, -90, 116, 38, 95, 112, -54, 34, -118, -123, 86, 43, 85, 116, -33, 20, -111, -71, 92}, new byte[]{57, 71, 49, 17, -83, 71, -8, -61})).execute(new j2.d(c3Var, absoluteFile, c3Var.w, G, 3));
                }
                string = c3Var.getString(R.string.user_file_manager_folder_size_loading);
            }
            sb2.append(string);
            sb2.append(e0.m.h(new byte[]{-109, -126, 17, -115, -55}, new byte[]{-77, -94, 109, -83, -23, 126, 55, 2}));
            sb2.append(str3);
            sb2.append("\n");
            sb2.append(c3.G(file));
            str2 = sb2.toString();
        } else {
            str2 = Formatter.formatShortFileSize(c3Var.requireContext(), file.length()) + e0.m.h(new byte[]{11, 108, 66, -42, -101}, new byte[]{43, 76, 62, -10, -69, 52, 74, 70}) + str3 + "\n" + c3.G(file);
        }
        textView2.setText(str2);
        w2Var.itemView.setOnClickListener(new androidx.navigation.ui.a(15, this, file));
        w2Var.itemView.setOnLongClickListener(new v2(this, file, 0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(R.drawable.modern_action_row);
        c3 c3Var = this.f3897a;
        linearLayout.setMinimumHeight(c3Var.z(84));
        linearLayout.setPadding(c3Var.z(18), c3Var.z(14), c3Var.z(18), c3Var.z(14));
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, c3Var.z(10));
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        textView.setTextColor(ContextCompat.getColor(c3Var.requireContext(), R.color.modern_text));
        textView.setTextSize(18.0f);
        textView.setTypeface(textView.getTypeface(), 1);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setTextColor(ContextCompat.getColor(c3Var.requireContext(), R.color.modern_text_secondary));
        textView2.setTextSize(14.0f);
        textView2.setTextIsSelectable(true);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, c3Var.z(4), 0, 0);
        textView2.setLayoutParams(layoutParams2);
        linearLayout.addView(textView2);
        return new w2(linearLayout, textView, textView2);
    }
}
