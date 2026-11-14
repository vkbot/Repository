package o0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.example.navistart.ModernMainActivity;
import com.example.navistart.R;
import e0.c3;
import e0.m;
import kotlin.io.encoding.Base64;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class a extends l0.b {

    /* renamed from: b, reason: collision with root package name */
    public e f4284b;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (requireActivity() instanceof ModernMainActivity) {
            i10 = R.layout.modern_gesture_zones;
        } else {
            i10 = R.layout.activity_gesture_zones;
        }
        boolean z9 = false;
        View inflate = layoutInflater.inflate(i10, viewGroup, false);
        this.f4284b = new e(requireContext());
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.zoneContainer);
        f[] values = f.values();
        int length = values.length;
        int i14 = 0;
        while (i14 < length) {
            f fVar = values[i14];
            boolean z10 = requireActivity() instanceof ModernMainActivity;
            LayoutInflater from = LayoutInflater.from(requireActivity());
            if (z10) {
                i11 = R.layout.modern_item_zone_row;
            } else {
                i11 = R.layout.item_zone_row;
            }
            View inflate2 = from.inflate(i11, linearLayout, z9);
            Spinner spinner = (Spinner) inflate2.findViewById(R.id.zoneSpinner);
            CheckBox checkBox = (CheckBox) inflate2.findViewById(R.id.zoneCheckBox);
            ImageView imageView = (ImageView) inflate2.findViewById(R.id.imageZone);
            int ordinal = fVar.ordinal();
            int i15 = 3;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal == 5) {
                                    i12 = R.drawable.ic_gesture_zone_bottom_right;
                                } else {
                                    throw new IncompatibleClassChangeError();
                                }
                            } else {
                                i12 = R.drawable.ic_gesture_zone_bottom_left;
                            }
                        } else {
                            i12 = R.drawable.ic_gesture_zone_right_bottom;
                        }
                    } else {
                        i12 = R.drawable.ic_gesture_zone_right_top;
                    }
                } else {
                    i12 = R.drawable.ic_gesture_zone_left_bottom;
                }
            } else {
                i12 = R.drawable.ic_gesture_zone_left_top;
            }
            imageView.setImageResource(i12);
            TextView textView = (TextView) inflate2.findViewById(R.id.textZoneName);
            if (textView != null) {
                int ordinal2 = fVar.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                if (ordinal2 != 4) {
                                    if (ordinal2 == 5) {
                                        i13 = R.string.gesture_zone_bottom_right;
                                    } else {
                                        throw new IncompatibleClassChangeError();
                                    }
                                } else {
                                    i13 = R.string.gesture_zone_bottom_left;
                                }
                            } else {
                                i13 = R.string.gesture_zone_right_bottom;
                            }
                        } else {
                            i13 = R.string.gesture_zone_right_top;
                        }
                    } else {
                        i13 = R.string.gesture_zone_left_bottom;
                    }
                } else {
                    i13 = R.string.gesture_zone_left_top;
                }
                textView.setText(i13);
            }
            checkBox.setChecked(this.f4284b.a(fVar));
            h0.b.a();
            h0.b.f().m(spinner, m.h(new byte[]{62, -7, 108, -117, -7, 33, -29, -15, 22, -14, 122, -78, -19, Base64.padSymbol, -25, -52, 28, -18}, new byte[]{121, -100, 31, -1, -116, 83, -122, -85}) + fVar.name());
            checkBox.setOnCheckedChangeListener(new c3(i15, this, fVar));
            linearLayout.addView(inflate2);
            i14++;
            z9 = false;
        }
        return inflate;
    }
}
