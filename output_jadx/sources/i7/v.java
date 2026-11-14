package i7;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.example.navistart.R;
import e0.e1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class v extends Fragment {
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_settings, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i10;
        int i11;
        super.onViewCreated(view, bundle);
        String h2 = e0.m.h(new byte[]{73, -103, -65, -100, -63, 11, -46, 79, 91, -110, -82, -98, -15, 11, -60, 113, 72, -93, -84, -104, -17, 31, -51, 79, 113, -71, -125}, new byte[]{58, -4, -38, -9, -125, 106, -96, 16});
        SeekBar seekBar = (SeekBar) view.findViewById(R.id.seekBar_antiradar_volum);
        TextView textView = (TextView) view.findViewById(R.id.textView_antiradar_volum);
        int loadInt = h0.b.o().loadInt(h2, 0);
        if (loadInt < 0) {
            i10 = 0;
        } else {
            i10 = loadInt;
        }
        if (i10 > 100) {
            i11 = 100;
        } else {
            i11 = i10;
        }
        seekBar.post(new t(seekBar, i11, textView, loadInt, 0));
        seekBar.setMax(100);
        seekBar.setOnSeekBarChangeListener(new u(textView, h2, 0));
        Spinner spinner = (Spinner) view.findViewById(R.id.spinner_antiradar_database);
        h[] values = h.values();
        String[] strArr = new String[values.length];
        for (int i12 = 0; i12 < values.length; i12++) {
            strArr[i12] = getString(values[i12].f2801b);
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, strArr);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner.setSelection(h.a().ordinal());
        spinner.setOnItemSelectedListener(new e1(1, values));
    }
}
