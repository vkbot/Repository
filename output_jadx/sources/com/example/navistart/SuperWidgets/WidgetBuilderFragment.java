package com.example.navistart.SuperWidgets;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import b7.h;
import com.example.navistart.AllWidgetServices;
import com.example.navistart.R;
import com.example.navistart.SuperWidgets.WidgetBuilderFragment;
import com.example.navistart.cores.ProLanProxy;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.protobuf.q;
import e0.a1;
import e0.c3;
import e0.e0;
import e0.e1;
import e0.m;
import j0.b;
import j0.e;
import j0.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.IntConsumer;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import m0.s2;
import org.apache.commons.net.nntp.NNTPReply;
import org.json.JSONArray;
import org.json.JSONException;
import s1.x0;
import x0.c;
import x0.k;
import x0.l;
import x0.n;
import x0.o;
import x0.p;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Keep
/* loaded from: classes.dex */
public final class WidgetBuilderFragment extends Fragment {
    private static final String[] TYPES = {m.h(new byte[]{88, -25, ByteCompanionObject.MIN_VALUE, 108, -93, 57, 70, -76, 88, -57, ByteCompanionObject.MIN_VALUE, 97, 83, 87, 34, -37, Base64.padSymbol, -83, -23, 0, -14, 86, 20, -37, 58, -83, -24, 0, -4}, new byte[]{-120, 125, 80, -47, 115, -121, -106, 11}), m.h(new byte[]{56, 100, 85, 88, -75, 113, ByteCompanionObject.MIN_VALUE, -16, 56, 65, 85, 86, -75, ByteCompanionObject.MAX_VALUE, -127, -62, 56, 75, 84, 111, -76, 68, ByteCompanionObject.MIN_VALUE, -2, 57, 119}, new byte[]{-24, -5, -123, -19, 100, -15, 80, 69}), m.h(new byte[]{-2, 118, -6, 83, -30, 25, 31, -13, -1, 104, -6, 87, -30, 21, -17, -126, -103, -56, -6, 80, -30, 25, 31, -12, -2, 80, -5, 96, -30, 18, 31, -5, -1, 100}, new byte[]{46, -24, 42, -30, 50, -89, -49, 64}), m.h(new byte[]{50, -96, -116, 112, 94, -40, -27, -47, 50, -118, -116, 126, 95, -22, -27, -43, 50, -118, -115, 74, -82, -89, -125, 115, 50, ByteCompanionObject.MIN_VALUE, -116, 123, 94, -47, -28, -21, 51, -80, -116, 112, 94, -34, -27, -33}, new byte[]{-30, 50, 92, -59, -114, 101, 52, 83}), m.h(new byte[]{11, 19, -120, 70, 109, 59, 119, 98, 10, 13, -120, 66, 109, 55, -121, 19, 108, -83, -120, 72, 109, 53, 118, 80, 10, 12, -120, 71, 109, 51, 119, 105, 10, 13}, new byte[]{-37, -115, 88, -9, -67, -123, -89, -47}), m.h(new byte[]{69, -49, 69, 89, -72, -49, -31, -51, 69, -27, 69, 87, -71, -3, -31, -55, 69, -27, 68, 99, 72, -80, -121, 111, 69, -30, 69, 92, -71, -13, -31, -50, 69, -19, 69, 90, -72, -54, -31, -49}, new byte[]{-107, 93, -107, -20, 104, 114, 48, 79})};
    private final List<e> actions = new ArrayList();
    private Button alignmentButton;
    private LinearLayout body;
    private Button closedTab;
    private boolean collapsedPreview;
    private o current;
    private List<o> designs;
    private Button openTab;
    private c previewBoard;
    private LinearLayout previewHost;

    private Spinner actionSpinner(String str) {
        Spinner themedSpinner = themedSpinner();
        themedSpinner.setAdapter((SpinnerAdapter) new b(themedSpinner.getContext(), this.actions));
        themedSpinner.setBackgroundResource(R.drawable.modern_field);
        for (int i10 = 0; i10 < this.actions.size(); i10++) {
            if (f.g(this.actions.get(i10)).equals(str)) {
                themedSpinner.setSelection(i10);
            }
        }
        return themedSpinner;
    }

    private void addDisplayChoice(List<String> list, List<Integer> list2, Display[] displayArr, int i10, String str) {
        if (i10 >= 0 && i10 < displayArr.length) {
            list.add(str);
            list2.add(Integer.valueOf(displayArr[i10].getDisplayId()));
        }
    }

    private Button button(String str) {
        AppCompatButton appCompatButton = new AppCompatButton(requireContext());
        appCompatButton.setText(str);
        appCompatButton.setTextSize(13.0f);
        appCompatButton.setAllCaps(false);
        appCompatButton.setTextColor(color(R.color.modern_text));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color(R.color.modern_primary_dark));
        gradientDrawable.setCornerRadius(dp(14));
        gradientDrawable.setStroke(dp(1), color(R.color.modern_primary));
        appCompatButton.setBackground(gradientDrawable);
        appCompatButton.setSupportBackgroundTintList(null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, dp(46));
        layoutParams.setMargins(0, dp(8), dp(8), dp(8));
        appCompatButton.setLayoutParams(layoutParams);
        appCompatButton.setPadding(dp(14), 0, dp(14), 0);
        return appCompatButton;
    }

    private LinearLayout card() {
        LinearLayout column = column();
        column.setPadding(dp(16), dp(14), dp(16), dp(14));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color(R.color.modern_surface));
        gradientDrawable.setCornerRadius(dp(20));
        gradientDrawable.setStroke(dp(1), color(R.color.modern_divider));
        column.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, dp(14), 0, dp(6));
        column.setLayoutParams(layoutParams);
        return column;
    }

    private MaterialSwitch check(String str, boolean z9) {
        MaterialSwitch materialSwitch = new MaterialSwitch(requireContext(), null);
        materialSwitch.setText(str);
        materialSwitch.setTextColor(color(R.color.modern_text));
        materialSwitch.setTextSize(14.0f);
        materialSwitch.setChecked(z9);
        return materialSwitch;
    }

    public int color(int i10) {
        return ContextCompat.getColor(requireContext(), i10);
    }

    private LinearLayout column() {
        LinearLayout linearLayout = new LinearLayout(requireContext());
        linearLayout.setOrientation(1);
        return linearLayout;
    }

    private AlertDialog.Builder dialogBuilder() {
        return new AlertDialog.Builder(popupContext(), R.style.ThemeOverlay_JCarTools_WidgetBuilderAlert);
    }

    private TextView dialogLabel(String str) {
        return label(str, 13);
    }

    public int dp(int i10) {
        return Math.round(i10 * getResources().getDisplayMetrics().density);
    }

    private void editElement(final x0.m mVar, final boolean z9) {
        String h2;
        String h10;
        Spinner actionSpinner;
        String h11;
        Spinner spinner;
        n nVar = mVar.c;
        n nVar2 = n.f6467b;
        if ((nVar == nVar2 || nVar == n.c) && this.actions.isEmpty()) {
            Toast.makeText(requireContext(), m.h(new byte[]{-84, -98, -87, 65, 15, -74, -91, 19, -84, -127, -87, 68, -1, -34, -64, 66, -55, -17, -64, 47, 94, -33, -10, 66, -50, -17, -63, 46, 102, 46, -92, 37, -84, -113, -87, 77, 14, -114, -91, 17, -84, -119, -87, 78, 15, -69, -91, 16, -83, -66, -88, 113, -13, 46, -92, 45, -84, -127, -87, 76, 14, -116, -92, 44, -83, -65, -87, 70, 14, -116, -92, 39, 92, -18, -2, 46, 106, -33, -12, 66, -55, -17, -50, -34, 14, -113, -92, 39, -84, -123, -88, 125, 15, -77, -92, 38, -83, -68}, new byte[]{124, 63, 121, -2, -33, 14, 116, -110}), 0).show();
            return;
        }
        LinearLayout column = column();
        column.setPadding(dp(20), dp(12), dp(20), dp(12));
        column.setBackgroundColor(color(R.color.modern_surface));
        if (mVar.c == nVar2) {
            h2 = m.h(new byte[]{98, -65, -4, -42, 12, 10, ByteCompanionObject.MAX_VALUE, -62, 98, -110, -4, -37, 12, 5, ByteCompanionObject.MAX_VALUE, -59, -110, -14, -98, 70, 13, 60, ByteCompanionObject.MAX_VALUE, -49, 98, -102, -3, -25, 12, 7, ByteCompanionObject.MAX_VALUE, -59, -110, -14, -111, -74, 108, 108, 46, -95, 48, -13, -84, -74, 98, 109, 26, -96, 8}, new byte[]{-78, 34, 44, 102, -36, -67, -81, 112});
        } else {
            h2 = m.h(new byte[]{-35, -38, 99, 0, 29, 20, -32, 74, -35, -3, 98, 63, 28, 44, 16, 37, -80, -107, 3, -98, 28, 45, -32, 78, -35, -16, 99, 2, 29, 21, -32, 72, -36, -57, 99, 11}, new byte[]{13, 69, -77, -66, -51, -96, 48, -11});
        }
        column.addView(label(h2, 13));
        final EditText input = input(m.h(new byte[]{104, 20, 108, -109, 81, 16, -20, 63, 104, 49, 108, -97, 81, 26, -20, 63, -126, -87, 108, -66, 81, 31, -19, 13, 104, 49, 108, -112, 81, 31, -20, 57, 104, 49, 109, -84}, new byte[]{-72, -119, -68, 35, -127, -81, Base64.padSymbol, -65}), mVar.f6461b, false);
        column.addView(input);
        if (mVar.c == nVar2) {
            column.addView(label(m.h(new byte[]{-24, -1, 81, 91, 12, 85, 78, -36, -123, -78, 63, 59, -109, 85, 78, -36, -115, 66, 81, 85, -3, 7, 36, -78, -24, -45, 80, 107, -4, 53, 36, -70, -24, -46, 81, 94, -3, 7, 37, -115, -23, -19, -95, 58, -82, 85, 74, -36, -125, -77, 13, 59, -106, 85, 74, 44, -24, -40, 80, 107, -3, 6, 36, -77, -24, -33, 80, 96, -4, 60, -44, -36, -113, -78, 60, 59, -100, 84, 115, -36, -122, -78, 59, -53, -4, 55, 37, -121, -24, -45, 80, 107, -4, 53, 36, -79, -24, -33, 81, 85, -4, 54, 36, -78, 24, -78, 53, 59, -103, 85, 77, -35, -71, -77, 3, 59, -98, 85, 76, -35, -73, 78, -95, 59, -99, 85, 65, -36, -113, 66, 80, 105, -4, 48, 36, -74, -23, -29, 80, 105, -4, 53, -38}, new byte[]{56, 98, -127, -21, 44, -123, -12, 12}), 12));
        }
        final MaterialSwitch check = check(m.h(new byte[]{-10, 89, -25, 113, -67, 82, 44, 78, -10, 117, -26, 72, -67, 82, 45, 114, 6, 23, -124, 32, -44, 0, 72, 46, -98, 23, -118, 33, -25, 0, 64, -34, -10, 120, -25, 112, -68, 104, -36, 47, -89, 23, -124, 32, -46, 1, 124, 46, -106, 22, -79, 32, -44, 0, 78, 46, -106, 23, -117, 32, -44, 0, 68}, new byte[]{38, -57, 54, -16, 108, -48, -4, -2}), mVar.f6462f);
        column.addView(check);
        column.addView(label(m.h(new byte[]{85, 37, 98, -85, 96, 110, -124, -10, 85, 59, 98, -96, 97, 81, -124, -1, 85, 48, 98, -90, 97, 87, -124, -4, -91, 85, 14, -53, 4, 63, -23, -104, 10, 85, 7, -54, 51, 62, -43, -104, 10, -91, 98, -92, 97, 90, -123, -55, 85, 48, 99, -103, 97, 95, -123, -56, 85, 63, 98, -93, 97, 93, -124, -7, 85, 56, 98, -93, 97, 90, -124, -11, -91, 85, 0, 59, 97, 83, -124, -7, 85, 63, 98, -82, 96, 109, -124, -4, -85, -91, 98, -113, 97, 84, -123, -58, -91, 84, 51, -53, 3, 62, -59, -104, 5, 85, 15, -54, 50, 62, -42, -103, 59, 85, 1, -53, 15, -49, -124, -5, 85, Base64.padSymbol, 98, -81, 97, 95, 116, -103, 59, 85, 15, -53, 15, -49, -124, -12, 85, 53, 99, -102, 96, 109, -123, -55, 85, 53, 98, -93, 97, 93, -124, -7, 85, 48, 99, -103, 96, 110, -123, -58, -91, 85, 12, -54, 51, 63, -32, -103, 48, 85, 9, -54, Base64.padSymbol, 63, -23, -103, 59, -85}, new byte[]{-123, -123, -78, 27, -79, -17, 84, 73}), 12));
        n nVar3 = mVar.c;
        if (nVar3 != nVar2 && nVar3 != n.c) {
            column.addView(label(m.h(new byte[]{-115, -115, -59, -17, -75, 102, -20, -70, -115, -84, -59, -17, -75, 105, -19, ByteCompanionObject.MIN_VALUE, -115, -91, 53, -113, -40, 0, -116, 34, -115, -94, -60, -34, -76, 94, 28, -46, -25, -64, -91, -114, -27, 1, -66, -46, -29, -63, -110, -113, -33, 1, -65, 56, 125, -64, -89, -114, -18, 0, -122, -46, -26, -63, -101, -114, -30, 0, -119, -46, -32, -64, -85, ByteCompanionObject.MAX_VALUE, -121, 86, -82, 34, 108, 48, -9, -39, -9, -16, 14, 34, -65, -106, -121, ByteCompanionObject.MAX_VALUE, 86, -16, -34, -124, -49, 48, -59, -19, -76, 91, -20, -72, -115, -85, -60, -47, -76, 87, -20, -73, -115, -83, -59, -31, 75, -16, -20, -102, -115, -83, -59, -21, -75, 104, -20, -72, -115, -96, -60, -35, -75, 110, -19, -126, -116, -101, 53, -113, -38, 0, -126, -46, -25, -64, -91, -113, -46, 1, -73, -46, -17, -64, -91, -114, -21, 1, -66, 34, -116, -110, -59, -22, -75, 106, -19, -127, -116, -103, -59, -25, -75, 105, 28, -45, -34, -63, -107, -113, -37, 0, -114, -46, -24, -64, -88, -114, -23, -2, 28, -46, -62, -63, -107, -113, -35, -16, -20, -80, -115, -86, -59, -28, -76, 94, -19, -123, -115, -91, -59, -30, -75, 104, -20, -70, 125, -64, -85, -113, -44, 0, -126, -46, -18, -63, -107, -113, -48, 0, -114, -46, -19, 48, -59, -19, -75, 101, -20, -65, -116, -110, -59, -25, -75, 107, -19, -115, -116, -106, -59, -25, -76, 95, 28, -45, -48, -63, -105, -113, -37, 0, -113, -46, -29, 48, -60, -34, -75, 104, -20, -74, -115, -91, -59, -30, -76, 92, -19, -115, 125, -64, -89, -114, -18, 0, -122, -46, -26, -63, -101, -114, -30, 0, -116, -46, -24, -63, -105, -114, -28, 1, -77, 46, 125, -64, -83, ByteCompanionObject.MAX_VALUE, -75, 109, -20, -78, -115, -82, -59, -18, -75, 110, -19, -126, -115, -82, -60, -35, 75}, new byte[]{93, 16, 21, 95, 101, -48, 60, 2}), 13));
            spinner = null;
            actionSpinner = null;
        } else {
            n nVar4 = n.c;
            if (nVar3 == nVar4) {
                h10 = m.h(new byte[]{-7, 40, -95, 104, 6, -31, 50, -95, -8, 62, -95, 111, 6, -32, 51, -107, 9, 108, -50, 12, 86, -120, 91, 0, -7, 14, -95, 103, 6, -29, 50, -82, -8, 59, -95, 104, 6, -27, 51, -104, -7, 4}, new byte[]{41, -68, 113, -35, -42, 88, -29, 32});
            } else {
                h10 = m.h(new byte[]{-75, 123, -11, 16, 51, -26, 34, 90, -76, 109, -11, 23, 51, -25, 35, 110}, new byte[]{101, -17, 37, -91, -29, 95, -13, -37});
            }
            column.addView(dialogLabel(h10));
            actionSpinner = actionSpinner(mVar.d);
            column.addView(actionSpinner);
            if (mVar.c == nVar4) {
                h11 = m.h(new byte[]{-102, -49, -122, -33, -101, 73, -5, 115, -101, -39, -122, -40, -101, 72, -6, 71, 106, -117, -23, -69, -53, 32, -110, -46, -102, -23, -122, -48, -101, 75, -5, 124, -101, -36, -122, -33, -101, 77, -6, 74, -102, -29}, new byte[]{74, 91, 86, 106, 75, -16, 42, -14});
            } else {
                h11 = m.h(new byte[]{102, -82, -47, 114, 10, 0, -102, 114, 103, -72, -47, 117, 10, 1, -101, 70}, new byte[]{-74, 58, 1, -57, -38, -71, 75, -13});
            }
            actionSpinner.setContentDescription(h11);
            if (mVar.c == nVar4) {
                column.addView(dialogLabel(m.h(new byte[]{64, 9, -89, -127, 103, -56, 124, -90, 65, 31, -89, -122, 103, -55, 125, -110, -80, 77, -56, -27, 55, -95, 21, 7, 64, 47, -90, -65, 103, -53, 125, -100, 65, 19, -90, -77, 103, -60, 125, -102, 64, 37, -89, -116}, new byte[]{-112, -99, 119, 52, -73, 113, -83, 39})));
                spinner = actionSpinner(mVar.e);
                column.addView(spinner);
            } else {
                spinner = null;
            }
            if (spinner != null) {
                spinner.setContentDescription(m.h(new byte[]{63, 67, -115, -56, 96, 54, 56, -79, 62, 85, -115, -49, 96, 55, 57, -123, -49, 7, -30, -84, 48, 95, 81, 16, 63, 101, -116, -10, 96, 53, 57, -117, 62, 89, -116, -6, 96, 58, 57, -115, 63, 111, -115, -59}, new byte[]{-17, -41, 93, 125, -80, -113, -23, 48}));
            }
        }
        ScrollView scrollView = new ScrollView(requireContext());
        scrollView.addView(column);
        final Spinner spinner2 = spinner;
        final Spinner spinner3 = actionSpinner;
        dialogBuilder().setTitle(TYPES[mVar.c.ordinal()]).setView(scrollView).setNegativeButton(m.h(new byte[]{-47, 33, 34, -108, -43, -96, 114, 109, -47, 2, 35, -90}, new byte[]{1, -65, -13, 22, 5, 28, -94, -40}), (DialogInterface.OnClickListener) null).setPositiveButton(m.h(new byte[]{-125, 51, 108, 41, -5, -60, 87, -119, -125, 25, 109, 20, -5, -60, 86, -73, -126, 32, -99, 121, -111, 92, 87, -119, -125, 28, 109, 19, -5, -55, 86, -73, -126, 47}, new byte[]{83, -84, -67, -87, 43, 124, -121, 53}), new DialogInterface.OnClickListener() { // from class: x0.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                WidgetBuilderFragment.this.lambda$editElement$33(mVar, input, check, spinner3, spinner2, z9, dialogInterface, i10);
            }
        }).show();
    }

    private void editor() {
        LinearLayout linearLayout;
        this.body.removeAllViews();
        heading(m.h(new byte[]{26, 82, 52, -8, 89, -16, 78, -8, 26, ByteCompanionObject.MAX_VALUE, 52, -3, -87, -105, 44, -104, 114, 22, 80, -112, 63, -105, 43, -103, 72, 22, 84}, new byte[]{-54, -58, -28, 64, -119, 71, -98, 72}), m.h(new byte[]{97, 14, -36, -77, -109, -44, -105, 18, -47, -15, 126, -78, -114, -44, -103, 19, -23, -15, 126, -77, -69, 36, -9, 113, ByteCompanionObject.MIN_VALUE, -104, 44, -41, -34, -78, -9, 118, -127, -94, -36, 67, 46, -58, -112, -29, 112, 0, -50, 77, 46, -44, -77, 19, -18, -16, 77, -77, -66, -44, -107, 18, -36, -15, 126, -77, -69, 36, -9, 119, ByteCompanionObject.MIN_VALUE, -107, 44, -38, -33, -123, -10, 65, ByteCompanionObject.MIN_VALUE, -110, 44, -37, -33, -117, 7, -29, 112, -30, 75, 67, 46, 36, 20, -19, 112, -16, 92, -77, -66, -43, -90, 19, -17, -16, 66, -77, -75, -44, -103, 19, -26, -16, 68, -78, -116, -44, -110, -29, -127, -83, 44, -40, -34, -79, -9, ByteCompanionObject.MAX_VALUE, ByteCompanionObject.MIN_VALUE, -107, 44, -34, -33, -122, -10, 72}, new byte[]{80, 32, -4, 99, 14, 4, 39, -61}));
        LinearLayout row = row();
        View button = button(m.h(new byte[]{-51, -104, -40, -20, -66, -88, -13, -6, -1, -83, 65, 28, -36, -22, -102, -85, -101, -56, -41, 28, -37, -21, -96, -86, -92}, new byte[]{47, 24, 97, -52, 110, 58, 34, 123}));
        View button2 = button(m.h(new byte[]{-118, 93, -7, 1, 49, 31, 62, -108, -118, 76, -7, 2, 48, 34, 62, -106, -117, 112}, new byte[]{90, -4, 41, -65, -32, -102, -17, 20}));
        row.addView(button);
        row.addView(button2);
        this.body.addView(row);
        button.setOnClickListener(new x0.e(this, 6));
        button2.setOnClickListener(new x0.e(this, 3));
        LinearLayout linearLayout2 = this.body;
        if (getResources().getConfiguration().screenWidthDp >= 720) {
            LinearLayout row2 = row();
            row2.setGravity(48);
            this.body.addView(row2);
            linearLayout = column();
            LinearLayout column = column();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 0.42f);
            layoutParams.setMargins(0, 0, dp(20), 0);
            row2.addView(linearLayout, layoutParams);
            row2.addView(column, new LinearLayout.LayoutParams(0, -2, 0.58f));
            this.body = column;
        } else {
            linearLayout = linearLayout2;
        }
        LinearLayout card = card();
        linearLayout.addView(card);
        card.addView(label(m.h(new byte[]{85, 115, -93, 96, -100, -99, -45, 52, 84, 110, -93, 110, -99, -91, -46, 12, 85, 86, 83, 0, -1, -52, -70, 102, 49, 62, -59, 0, -8, -51, ByteCompanionObject.MIN_VALUE, 102, 53}, new byte[]{-123, -18, 115, -48, 77, 28, 2, -74}), 21));
        card.addView(label(m.h(new byte[]{115, 103, 80, -58, 2, 88, 25, -96, 115, 76, -96, -89, 108, 1, 121, -55, 35, 41, 48, -89, 111, 1, 124, -55, 33, 40, 0, -90, 88, -21, -23, -55, 46, 41, 58, -90, 83, 1, 121, -56, 30, -43, -96, -90, 87, 1, 119, -55, 35, 41, 60, -89, 99, -15, 25, -96, -125, 40, 1, -89, 97, 1, 119, -55, 35, 41, 48, -90, 84, 1, 113, -56, 17, 41, 48, -89, 110, 1, 113, -56, 22}, new byte[]{-93, -7, ByteCompanionObject.MIN_VALUE, 119, -45, -47, -55, 24}), 12));
        card.addView(label(m.h(new byte[]{-109, 43, -117, -111, 26, -65, -79, 49, -109, 6, -117, -100, 26, -80, -79, 54, 99, 102, -23, -15, 114, -40, -43, 83, -11, 102, -18, -16, 72, -40, -47}, new byte[]{67, -74, 91, 33, -54, 8, 97, -125}), 13));
        EditText input = input(m.h(new byte[]{-41, 90, -25, 11, 68, -105, -19, 72, -41, 119, -25, 6, 68, -104, -19, 79}, new byte[]{7, -57, 55, -69, -108, 32, Base64.padSymbol, -6}), this.current.f6471b, false);
        card.addView(input);
        watch(input, new x0(12, this, input));
        MaterialSwitch check = check(m.h(new byte[]{-79, -62, 99, 67, -121, 27, -106, -13, -79, -27, 98, 121, 119, ByteCompanionObject.MAX_VALUE, -12, -107, -37, ByteCompanionObject.MIN_VALUE, 8, 42, -39, 126, -63, -108, -16, ByteCompanionObject.MIN_VALUE, 14}, new byte[]{97, 80, -77, -5, 87, -81, 70, 69}), this.current.c);
        card.addView(check);
        final int i10 = 0;
        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: x0.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetBuilderFragment f6451b;

            {
                this.f6451b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                switch (i10) {
                    case 0:
                        this.f6451b.lambda$editor$12(compoundButton, z9);
                        return;
                    case 1:
                        this.f6451b.lambda$editor$13(compoundButton, z9);
                        return;
                    default:
                        this.f6451b.lambda$editor$14(compoundButton, z9);
                        return;
                }
            }
        });
        final int i11 = 1;
        MaterialSwitch check2 = check(m.h(new byte[]{18, -2, -86, -53, 121, -120, -10, -63, 18, -30, -85, -6, 121, -101, -10, -54, 18, -26, 90, -87, 26, -55, -97, -111, 118, ByteCompanionObject.MAX_VALUE, -86, -56, 120, -84, -9, -10, -30, -113, -64, -87, 21, -55, -103, -111, 125, -113, -64, -87, 16, 57, -27, -22, -23, -99, -63}, new byte[]{-62, 95, 122, 121, -88, 25, 39, 65}), !this.current.d);
        card.addView(check2);
        card.addView(label(m.h(new byte[]{-74, 90, 7, 53, 28, 11, 90, -42, -73, 74, 7, 54, 28, 8, 91, -23, 70, 21, 84, 100, 115, 89, 49, -73, -22, 20, 108, 100, 115, -87, 91, -21, -74, ByteCompanionObject.MAX_VALUE, 6, 1, 29, 53, 90, -45, -74, 121, 7, 54, 28, 2, -86, -73, -25, -28, 6, 9, 29, 57, 91, -25, -73, 70, 7, 52, 29, 55, 90, -33, -74, 126, 6, 10, 29, 48, -86, -92, -51, 20, 72, 101, 76, 88, 8, -74, -42, 20, 100, 100, 117, 88, 8, -73, -22, -28, 6, 6, 29, 49, 90, -46, -74, 124, 6, 8, 28, 2, 90, -38, 70, 20, 105, 101, 77, 89, 50, 70, -73, 69, 6, 6, 29, 55, 91, -26, -74, 116, 7, 51, 29, 49, 90, -44, -74, 116, 6, 9, 29, 49, 90, -34, -92, ByteCompanionObject.MAX_VALUE, -6, -108, 29, 52, 90, -42, 70, 21, 87, 100, ByteCompanionObject.MAX_VALUE, 89, 52, -74, -34, 21, 83, -108, 29, 53, 90, -45, -73, 69, 7, 54, 29, 57, 91, -29, 70, 21, 87, 100, ByteCompanionObject.MAX_VALUE, 88, 27, -73, -26, 20, 107, 101, 78, 88, 8, -74, -40, 20, 101, 100, 115, -87, 90, -44, -74, 124, 6, 0, 29, 57, -92, 70, -74, 100, 6, 4, 28, 8, 90, -36, -73, 68, 7, 63, 28, 11, 90, -34, -73, 75, -10, 100, 117, -87, 91, -28, -74, 116, 6, 13, 29, 53, 90, -45, -73, 68, 6, 4, -19, 89, 55, -74, -45, 21, 84, -102}, new byte[]{102, -60, -42, -76, -51, -119, -118, 102}), 12));
        MaterialSwitch check3 = check(m.h(new byte[]{74, 19, -66, -18, 42, -78, -53, 106, 75, 9, -66, -20, 43, ByteCompanionObject.MIN_VALUE, 59, 14, 37, 88, -18, -116, 66, 34, -54, 94, 74, 57, -65, -35, 42, -72, -54, 94, 75, 2, -65, -34, 42, -70, -53, 102}, new byte[]{-102, -119, 110, 92, -6, 2, 27, -34}), this.current.e);
        card.addView(check3);
        card.addView(label(m.h(new byte[]{-87, 64, 65, -64, 68, 73, 43, 1, -88, 92, 65, -52, 68, 70, 43, 7, -87, 108, -80, -87, 20, 103, -37, 106, -51, 2, 43, -101, 44, 35, 70, 106, -60, 2, 32, -102, 27, -45, 43, 9, -87, 108, 65, -53, 68, 75, 43, 13, -87, 108, 64, -10, 69, 113, 43, 10, -87, 105, 65, -57, 68, 78, 43, 10, -88, 93, -80, -101, 43, 35, 75, 106, -60, 2, 37, -101, 47, 34, 119}, new byte[]{121, -46, -112, 75, -108, -13, -5, -70}), 12));
        check3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: x0.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetBuilderFragment f6451b;

            {
                this.f6451b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                switch (i11) {
                    case 0:
                        this.f6451b.lambda$editor$12(compoundButton, z9);
                        return;
                    case 1:
                        this.f6451b.lambda$editor$13(compoundButton, z9);
                        return;
                    default:
                        this.f6451b.lambda$editor$14(compoundButton, z9);
                        return;
                }
            }
        });
        MaterialSwitch check4 = check(m.h(new byte[]{-22, 56, 38, -82, 54, -46, -3, 112, -21, 34, 38, -84, 55, -32, 13, 20, -120, -126, 39, -99, 54, -48, -4, 85, -21, 34, 38, -95, 55, -31, -4, 70, -22, 28, 38, -96, -58, -78, -97, 20, -126, 114, 66, -52, 83}, new byte[]{58, -94, -10, 28, -26, 98, 45, -60}), this.current.f6473g);
        card.addView(check4);
        card.addView(label(m.h(new byte[]{84, 117, -52, 47, -61, -63, 81, -13, 85, 105, -52, 35, -61, -50, 81, -11, 84, 89, Base64.padSymbol, 70, -109, -17, -95, -104, 59, 54, -99, 117, -100, -85, Base64.padSymbol, -104, 58, 54, -98, 116, -96, -85, 63, -104, 63, 54, -111, 116, -82, -85, 49, -103, 11, -57, -51, 26, -61, -54, 81, -13, 84, 87, -52, 37, -62, -7, 80, -60, -86, -57, -51, 0, -61, -59, 80, -56, 84, 91, -51, 20, 51, -85, 57, 104, 85, 103, -51, 20, -62, -6, 81, -9, 84, 89, -51, 31, -61, -59, 81, -2, 84, 82, -51, 25, -61, -61, 81, -3, -92, 54, -100, 116, -95, -86, 16, -103, 4, 55, -96, 117, -112, -86, 3, -104, 58, 55, -82, 116, -83, 91, 81, -6, 84, 95, -51, 16, -61, -53, -95, -104, 57, 55, -83, 117, -110, -86, 3, -103, 4, 55, -83, 116, -85, -85, 51, -104, 52, 54, -109, 117, -111, -86, 0, -103, 11, -57, -51, 26, -62, -7, 81, -4, 84, 82, -51, 31, -62, -9, 81, -11, 84, 89, Base64.padSymbol, 116, -83, -86, 3, 104, 85, 103, -51, 20, -62, -6, 81, -14, 85, 103, -52, 47, -62, -7, 81, -10, 84, 84, -51, 26, 63, 91, 81, -6, -92, 54, -97, 116, -83, -85, Base64.padSymbol, 104, 85, 96, -51, 28, -62, -6, 81, -13, 84, 82, Base64.padSymbol, 116, -94, -85, 52, -104, 51, -57, -51, 30, -61, -58, 81, -10, 84, 88, -51, 30, -61, -61, -95, -118, 47, -52, -33, 31, Base64.padSymbol}, new byte[]{-124, -25, 29, -92, 19, 123, -127, 72}), 12));
        final int i12 = 2;
        check4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: x0.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetBuilderFragment f6451b;

            {
                this.f6451b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                switch (i12) {
                    case 0:
                        this.f6451b.lambda$editor$12(compoundButton, z9);
                        return;
                    case 1:
                        this.f6451b.lambda$editor$13(compoundButton, z9);
                        return;
                    default:
                        this.f6451b.lambda$editor$14(compoundButton, z9);
                        return;
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append(m.h(new byte[]{86, 53, -116, -127, -37, -108, -13, 14, 86, 32, -115, -79, 43, -14, -93, 98, 54, 68, -35, -31, -79, -14, -93, 99, 13, 68, -34, -31, -75, -13, -112, 98, 56, -75, -116, -125, -37, -101, -13, 6, 86, 35, -116, -124, -38, -95, -13, 2, -90, 87, -21, 17}, new byte[]{-122, -107, 92, 49, 11, 35, 35, -78}));
        sb.append(this.current.f6478l);
        final View label = label(q.i(new byte[]{-81}, new byte[]{-118, 68, -108, 17, -94, 86, 36, 67}, sb), 13);
        card.addView(label);
        final int i13 = 0;
        card.addView(slider(m.h(new byte[]{-8, 112, -68, -24, 17, 36, -59, 64, -8, 101, -67, -40, -31, 66, -107, 44, -104, 1, -19, -120, 123, 66, -107, 45, -93, 1, -18, -120, ByteCompanionObject.MAX_VALUE, 67, -90, 44, -106, -16, -68, -22, 17, 43, -59, 72, -8, 102, -68, -19, 16, 17, -59, 76}, new byte[]{40, -48, 108, 88, -63, -109, 21, -4}), 50, 200, this.current.f6478l, new IntConsumer(this) { // from class: x0.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetBuilderFragment f6453b;

            {
                this.f6453b = this;
            }

            @Override // java.util.function.IntConsumer
            public final void accept(int i14) {
                switch (i13) {
                    case 0:
                        this.f6453b.lambda$editor$15((TextView) label, i14);
                        return;
                    case 1:
                        this.f6453b.lambda$editor$16((TextView) label, i14);
                        return;
                    case 2:
                        this.f6453b.lambda$editor$17((TextView) label, i14);
                        return;
                    case 3:
                        this.f6453b.lambda$editor$18((TextView) label, i14);
                        return;
                    case 4:
                        this.f6453b.lambda$editor$20((TextView) label, i14);
                        return;
                    default:
                        this.f6453b.lambda$editor$19((ArrayList) label, i14);
                        return;
                }
            }
        }));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m.h(new byte[]{-110, -5, -97, 90, -46, 102, 112, 1, -110, -18, -98, 106, 34, 0, 33, 109, -16, -118, -34, 59, -126, 1, 29, 108, -63, -118, -51, 58, -68, 1, 19, 109, -4, 123, -97, 88, -46, 105, 112, 9, -110, -19, -97, 95, -45, 83, 112, 13, 98, -103, -8, -54}, new byte[]{66, 91, 79, -22, 2, -47, -96, -67}));
        sb2.append(this.current.f6479m);
        final View label2 = label(q.i(new byte[]{4}, new byte[]{33, -48, 73, -35, 80, -119, -50, 104}, sb2), 13);
        card.addView(label2);
        card.addView(slider(m.h(new byte[]{-25, 96, 13, 90, -32, -35, -97, 60, -25, 117, 12, 106, 16, -69, -50, 80, -123, 17, 76, 59, -80, -70, -14, 81, -76, 17, 95, 58, -114, -70, -4, 80, -119, -32, 13, 88, -32, -46, -97, 52, -25, 118, 13, 95, -31, -24, -97, 48}, new byte[]{55, -64, -35, -22, 48, 106, 79, ByteCompanionObject.MIN_VALUE}), 50, 200, this.current.f6479m, new IntConsumer(this) { // from class: x0.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetBuilderFragment f6453b;

            {
                this.f6453b = this;
            }

            @Override // java.util.function.IntConsumer
            public final void accept(int i14) {
                switch (i11) {
                    case 0:
                        this.f6453b.lambda$editor$15((TextView) label2, i14);
                        return;
                    case 1:
                        this.f6453b.lambda$editor$16((TextView) label2, i14);
                        return;
                    case 2:
                        this.f6453b.lambda$editor$17((TextView) label2, i14);
                        return;
                    case 3:
                        this.f6453b.lambda$editor$18((TextView) label2, i14);
                        return;
                    case 4:
                        this.f6453b.lambda$editor$20((TextView) label2, i14);
                        return;
                    default:
                        this.f6453b.lambda$editor$19((ArrayList) label2, i14);
                        return;
                }
            }
        }));
        card.addView(label(m.h(new byte[]{-8, -104, -44, -36, 37, 65, 74, -55, 29, 26, 33, 72, 23, 115, 14, 87, 29, 29, -47, 44, 123, 17, 107, 57, 112, 121, 125, 45, 79, 17, 107, -59, -19, -103, -63, -52, -30, -31, 60, 105, 89, -120, 33, 66, 23, 112, 15, 98, 28, 47, 33, 65, 22, 74, 14, 80, -19, 121, 113, 44, 119, 17, 105, 57, 113, 120, 68, 45, 71, -19, -2, -37, -3, -104, -44, -36, 37, 65, 74, -55, 29, 26, 33, 72, 23, 115, 14, 87, 29, 29, -47, 44, 118, 17, 96, 57, 118, 121, 125, 45, 79, 17, 107, -57, -19, 120, 109, 44, 119, 16, 95, 56, 69, 121, 115, 44, 119, 17, 111, 57, 117, 121, 113, 45, 68, 17, 107, 56, 79, 121, 112, 45, 72, -31, 14, 91, 29, 29, 32, 125, 22, 77, -2, 57, ByteCompanionObject.MAX_VALUE, 120, 73, 44, 115, 17, 104, 57, 120, 121, 115, -36, 23, 115, 14, 85, 29, 29, 32, 125, 22, 67, 14, 92, -19, 121, 112, -36, 22, 76, 14, 82, 29, 29, 33, 64, 23, 116, 14, 84, 28, 42, 33, 76, 23, 125, 14, 81, -29}, new byte[]{-51, -88, -15, -4, -57, -63, -34, -23}), 12));
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m.h(new byte[]{-95, -58, 42, 47, -120, 112, -104, -44, -96, -39, 43, 31, -119, 73, -104, -34, -95, -25, 42, 46, -119, 76, -103, -17, 81, -101, 76, -113}, new byte[]{113, 89, -5, -81, 88, -50, 72, 99}));
        sb3.append(this.current.f6476j);
        final View label3 = label(q.i(new byte[]{105}, new byte[]{76, -16, -18, -32, -109, 0, -13, 102}, sb3), 13);
        card.addView(label3);
        final int i14 = 2;
        card.addView(slider(m.h(new byte[]{-20, -6, 26, 107, -104, -65, -7, 106, -19, -27, 27, 91, -103, -122, -7, 96, -20, -37, 26, 106, -103, -125, -8, 81, 28, -75, 121, 59, -16, -47, -99, 13, -118, -75, 126, 58, -54, -47, -103}, new byte[]{60, 101, -53, -21, 72, 1, 41, -35}), 0, 100, this.current.f6476j, new IntConsumer(this) { // from class: x0.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetBuilderFragment f6453b;

            {
                this.f6453b = this;
            }

            @Override // java.util.function.IntConsumer
            public final void accept(int i142) {
                switch (i14) {
                    case 0:
                        this.f6453b.lambda$editor$15((TextView) label3, i142);
                        return;
                    case 1:
                        this.f6453b.lambda$editor$16((TextView) label3, i142);
                        return;
                    case 2:
                        this.f6453b.lambda$editor$17((TextView) label3, i142);
                        return;
                    case 3:
                        this.f6453b.lambda$editor$18((TextView) label3, i142);
                        return;
                    case 4:
                        this.f6453b.lambda$editor$20((TextView) label3, i142);
                        return;
                    default:
                        this.f6453b.lambda$editor$19((ArrayList) label3, i142);
                        return;
                }
            }
        }));
        card.addView(label(m.h(new byte[]{-98, -51, -85, 111, 111, -33, -83, 74, 17, 56, 53, 93, 84, -101, 48, 74, 16, 57, 10, 92, 109, -102, 1, 75, 32, -56, 91, 63, 63, -13, 93, 46, 126, 80, 91, 49, 62, -64, 93, 35, -126, -56, -70, -67, -33, 110, -83, 120, 46, 124, -85, 93, 80, -101, 51, 74, 21, 56, 54, 93, 81, -102, 12, 75, 44, 57, 7, 92, 97, 107, 93, 37, ByteCompanionObject.MAX_VALUE, 104, 91, 51, 63, -4, 92, 26, 126, 88, 90, 10, 63, -10, 92, 17, 126, 81}, new byte[]{-82, -24, -117, -115, -17, 75, -115, -102}), 12));
        StringBuilder sb4 = new StringBuilder();
        sb4.append(m.h(new byte[]{-126, 39, -100, 15, -110, -47, 33, -112, -125, 56, -99, 63, -109, -24, 33, -102, -126, 6, -100, 14, -109, -19, 32, -85, 114, 105, -55, 95, -4, -65, 76, -9, -30, -104, -99, 49, -110, -43, 33, -102, -126, 8, 109, 77, -11, 79}, new byte[]{82, -72, 77, -113, 66, 111, -15, 39}));
        sb4.append(this.current.f6477k);
        final View label4 = label(q.i(new byte[]{51}, new byte[]{22, 16, -105, -99, 72, 82, 50, 98}, sb4), 13);
        card.addView(label4);
        final int i15 = 3;
        card.addView(slider(m.h(new byte[]{-125, 59, 2, 54, 119, 69, -38, -47, -126, 36, 3, 6, 118, 124, -38, -37, -125, 26, 2, 55, 118, 121, -37, -22, 115, 117, 87, 102, 25, 43, -73, -74, -29, -124, 2, 54, 119, 75, -37, -25, -125, 30, 2, 54, 118, 112, -37, -28, -125, 26, 3, 5, 119, 69, 42, -74, -19, 116, 105, 102, 26, 43, -70}, new byte[]{83, -92, -45, -74, -89, -5, 10, 102}), 0, 100, this.current.f6477k, new IntConsumer(this) { // from class: x0.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetBuilderFragment f6453b;

            {
                this.f6453b = this;
            }

            @Override // java.util.function.IntConsumer
            public final void accept(int i142) {
                switch (i15) {
                    case 0:
                        this.f6453b.lambda$editor$15((TextView) label4, i142);
                        return;
                    case 1:
                        this.f6453b.lambda$editor$16((TextView) label4, i142);
                        return;
                    case 2:
                        this.f6453b.lambda$editor$17((TextView) label4, i142);
                        return;
                    case 3:
                        this.f6453b.lambda$editor$18((TextView) label4, i142);
                        return;
                    case 4:
                        this.f6453b.lambda$editor$20((TextView) label4, i142);
                        return;
                    default:
                        this.f6453b.lambda$editor$19((ArrayList) label4, i142);
                        return;
                }
            }
        }));
        card.addView(label(m.h(new byte[]{-76, 69, -105, -10, 44, 83, 19, -72, -76, 93, -105, -10, -36, 57, 70, -28, -38, 55, -6, 104, 45, 104, 18, -124, -75, 102, -105, -14, 45, 104, 19, -65, -75, 101, -105, -10, 44, 91, 18, -118, 68, 55, -7, -104, 70, 56, ByteCompanionObject.MAX_VALUE, -28, -44, -55, 103, -104, 83, 57, 66, -28, -34, 55, -7, -103, 125, 57, 64, -27, -24, -57, -105, -14, 44, 85, 18, -118, -76, 88, -105, -10, 44, 82, -30, -28, -36, -57, -105, -16, 44, 85, 18, ByteCompanionObject.MIN_VALUE, -76, 95, -105, -14, 44, 88, 19, -74, -76, 89, -106, -56, 44, 86, 18, -122, 68, 55, -6, -104, 73, -56, 18, -120, -76, 82, -105, -11, 45, 103, 18, -127, -75, 101, -106, -55, 45, 103, -20}, new byte[]{100, -25, 71, 72, -4, -24, -62, 52}), 12));
        card.addView(label(m.h(new byte[]{-14, -122, -4, 39, -94, -54, -38, 58, -14, -106, 12, 77, -57, -102, -79, 91, -83, 11, -4, 35, -94, -56, -38, 52, -14, -102, -3, 29, -93, -6, -38, 60, -14, -98, -4, 32, -93, -14, -37, 5}, new byte[]{34, 43, 44, -99, 115, 74, 10, -118}), 13));
        Display[] displays = ((DisplayManager) requireContext().getSystemService(m.h(new byte[]{-125, 40, -26, 107, 12, 116, 56}, new byte[]{-25, 65, -107, 27, 96, 21, 65, -100}))).getDisplays();
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        h0.b.a();
        ProLanProxy n10 = h0.b.n();
        addDisplayChoice(arrayList, arrayList2, displays, n10.getGuDisplayID(), m.h(new byte[]{30, 65, -125, -21, -12, -52, 73, 100, -18, 2, -19, -103, 85, -2, 116, 32, 112, 2, -31, -104, 105, -2, 119, 32, 119, -14, -125, -9, 4, -107, 25, 64, 30, 111, -126, -64, 4, -101, 24, 114}, new byte[]{-50, -46, 83, 72, -44, 46, -55, -16}));
        addDisplayChoice(arrayList, arrayList2, displays, n10.getGuPassDisplayID(), m.h(new byte[]{-23, -55, -110, -33, 1, 90, 83, 34, -24, -34, -110, -47, 0, 104, -93, 79, -122, -122, -14, -75, 80, 59, 2, 79, -119, -122, -12, -76, 105, 59, 3, 79, -119}, new byte[]{57, 86, 66, 100, -47, -22, -125, -97}));
        addDisplayChoice(arrayList, arrayList2, displays, n10.getZaPassDisplayID(), m.h(new byte[]{8, 116, 125, -103, 68, 115, -97, 62, 9, 99, 125, -105, 69, 65, 111, 82, 90, 58, 45, -14, 33, 18, -51, 82, 84, 59, 24, -14, 39, 19, -15, -93, 9, 107, 124, -83, 68, 119, -97, 51}, new byte[]{-40, -21, -83, 34, -108, -61, 79, -125}));
        if (!arrayList2.contains(Integer.valueOf(this.current.f6474h))) {
            arrayList.add(m.h(new byte[]{-50, 67, -98, 23, 1, 77, 84, -50, -50, 86, 110, 119, 99, 33, 15, -85, -81, 50, -50, 119, 97, 32, 57, -85, -93, 50, -59, 119, 104, -48, 85, -10, -50, 89, -97, 39, 1, 64, 84, -58, 62, 33, -7, -121}, new byte[]{30, -29, 78, -89, -47, -16, -124, 123}) + this.current.f6474h);
            arrayList2.add(Integer.valueOf(this.current.f6474h));
        }
        Spinner spinner = spinner(arrayList);
        spinner.setSelection(arrayList2.indexOf(Integer.valueOf(this.current.f6474h)));
        card.addView(spinner);
        spinner.setContentDescription(m.h(new byte[]{65, -99, -1, 89, 69, 125, 44, 98, 65, -115, 15, 51, 32, 45, 71, 3, 30, 16, -1, 93, 69, ByteCompanionObject.MAX_VALUE, 44, 108, 65, -127, -2, 99, 68, 77, 44, 100, 65, -123, -1, 94, 68, 69, 45, 93}, new byte[]{-111, 48, 47, -29, -108, -3, -4, -46}));
        final int i16 = 5;
        select(spinner, new IntConsumer(this) { // from class: x0.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetBuilderFragment f6453b;

            {
                this.f6453b = this;
            }

            @Override // java.util.function.IntConsumer
            public final void accept(int i142) {
                switch (i16) {
                    case 0:
                        this.f6453b.lambda$editor$15((TextView) arrayList2, i142);
                        return;
                    case 1:
                        this.f6453b.lambda$editor$16((TextView) arrayList2, i142);
                        return;
                    case 2:
                        this.f6453b.lambda$editor$17((TextView) arrayList2, i142);
                        return;
                    case 3:
                        this.f6453b.lambda$editor$18((TextView) arrayList2, i142);
                        return;
                    case 4:
                        this.f6453b.lambda$editor$20((TextView) arrayList2, i142);
                        return;
                    default:
                        this.f6453b.lambda$editor$19((ArrayList) arrayList2, i142);
                        return;
                }
            }
        });
        MaterialSwitch check5 = check(m.h(new byte[]{17, -38, -54, 124, 33, 43, 86, -118, 17, -10, -54, 126, 33, 43, 86, -116, 16, -51, -54, 123, 33, 40, 86, -114, 17, -14, 58, 31, 113, 121, 52, -28, ByteCompanionObject.MAX_VALUE, -101, -102, 30, 64, 120, 1, -28, 121, -102, -88, 30, 64, 120, 4, -27, 77}, new byte[]{-63, 74, 26, -50, -16, -87, -122, 52}), this.current.f6472f);
        card.addView(check5);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(m.h(new byte[]{-3, 63, -35, 29, -79, 28, 13, -7, -3, 35, -36, 44, -80, 43, 13, -11, 13, 79, -118, ByteCompanionObject.MAX_VALUE, -44, 120, 92, -87, -104, 78, -70, -113, -93, 30, -4}, new byte[]{45, -98, 13, -81, 97, -87, -36, 121}));
        sb5.append(this.current.f6475i);
        final View label5 = label(q.i(new byte[]{-110, 120, 9, 33, -87, 2, -50, -125}, new byte[]{-78, -87, -120, -15, 28, -46, 116, -83}, sb5), 13);
        card.addView(label5);
        final int i17 = 4;
        View slider = slider(m.h(new byte[]{44, -98, -2, -119, 66, 76, -66, 36, 44, -119, -1, -71, -78, 37, -34, 72, 78, -19, -84, -23, 44, 36, -17, 72, 78, -20, -112, -24, 18, 37, -34, 73, 123, -20, -106, -23, 32, 37, -34, 72, 65, -20, -106, -24, 29, -39, 78, 73, 125, -20, -101, -23, 40, 36, -19, 72, 65, -20, -102}, new byte[]{-4, 60, 46, 57, -110, -11, 110, -104}), 1, 3600, this.current.f6475i, new IntConsumer(this) { // from class: x0.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetBuilderFragment f6453b;

            {
                this.f6453b = this;
            }

            @Override // java.util.function.IntConsumer
            public final void accept(int i142) {
                switch (i17) {
                    case 0:
                        this.f6453b.lambda$editor$15((TextView) label5, i142);
                        return;
                    case 1:
                        this.f6453b.lambda$editor$16((TextView) label5, i142);
                        return;
                    case 2:
                        this.f6453b.lambda$editor$17((TextView) label5, i142);
                        return;
                    case 3:
                        this.f6453b.lambda$editor$18((TextView) label5, i142);
                        return;
                    case 4:
                        this.f6453b.lambda$editor$20((TextView) label5, i142);
                        return;
                    default:
                        this.f6453b.lambda$editor$19((ArrayList) label5, i142);
                        return;
                }
            }
        });
        card.addView(slider);
        final s2 s2Var = new s2(2, this, check5, slider, label5);
        final int i18 = 0;
        check5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: x0.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetBuilderFragment f6456b;

            {
                this.f6456b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                switch (i18) {
                    case 0:
                        this.f6456b.lambda$editor$22(s2Var, compoundButton, z9);
                        return;
                    default:
                        this.f6456b.lambda$editor$23(s2Var, compoundButton, z9);
                        return;
                }
            }
        });
        check2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: x0.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetBuilderFragment f6456b;

            {
                this.f6456b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                switch (i11) {
                    case 0:
                        this.f6456b.lambda$editor$22(s2Var, compoundButton, z9);
                        return;
                    default:
                        this.f6456b.lambda$editor$23(s2Var, compoundButton, z9);
                        return;
                }
            }
        });
        s2Var.run();
        this.body.addView(label(m.h(new byte[]{-2, -33, -52, -27, 9, -78, 16, 53, -97, -84, -97, -123, 109, -40, -123, 52, -84, 93, -52, -25, 8, -125, -32, 86, -2, -58, -51, -38, 9, -68, -32, 80, -1, -1, -51, -39, -7, -40, -126, 53, -106, -83, -88, -123, 111, -40, -123, 52, -84}, new byte[]{46, 125, 28, 85, -39, 8, 48, -27}), 21));
        LinearLayout row3 = row();
        Button button3 = button(m.h(new byte[]{-95, -67, 103, 4, 120, 103, -8, 113, -96, -99, 102, 63, 120, 100, -7, 64, -95, -92}, new byte[]{113, 29, -73, -76, -87, -26, 40, -53}));
        Button button4 = button(m.h(new byte[]{-64, 87, -59, 59, -53, 95, 69, 78, -64, 75, -60, 10, -53, 76, 69, 69, -64, 79}, new byte[]{16, -10, 21, -119, 26, -50, -108, -50}));
        row3.addView(button3);
        row3.addView(button4);
        this.body.addView(row3);
        this.openTab = button3;
        this.closedTab = button4;
        button3.setOnClickListener(new x0.e(this, 7));
        button4.setOnClickListener(new x0.e(this, 0));
        Button button5 = button(m.h(new byte[]{-4, 70, 21, 11, 81, 107, 7, -41, -4, 100, 20, 50, 81, 105, 7, -39, -4, 100, 21, 4, 80, 81, 7, -37, -4, 102, 21, 4, 80, 81, 7, -36}, new byte[]{44, -42, -59, -71, ByteCompanionObject.MIN_VALUE, -23, -41, 105}));
        this.body.addView(button5);
        this.alignmentButton = button5;
        button5.setOnClickListener(new x0.e(this, 1));
        this.body.addView(label(m.h(new byte[]{-36, 97, 60, 71, -31, -7, -100, -98, -36, 67, Base64.padSymbol, 126, -31, -5, -100, -112, -36, 67, 60, 72, -32, -61, -100, -110, -36, 65, 60, 72, -32, -61, -100, -107, 44, 32, 104, 37, -114, -86, -52, -16, -80, 33, 84, 36, -80, -86, -49, -16, -71, 32, 110, -43, -31, -5, -100, -98, -36, 67, 60, 72, -31, -16, -100, -107, 44, 32, 108, 36, -65, -85, -8, -15, -121, -47, 60, 71, 16, -85, -2, -15, -121, 33, 93, 36, -80, -85, -4, -16, -79, 33, 81, 37, -114, -85, -16, 0, -36, 67, 60, 77, -32, -49, -100, -107, 34, -47, 60, 103, 16, -86, -51, -16, -66, 32, 125, 36, -80, -85, -15, -15, -113, 32, 110, 37, -114, -85, -16, 0, -36, 67, 60, 77, -32, -49, -100, -107, 44, 33, 82, 36, -79, -86, -50, -16, -68, 33, 94, 37, -117, -86, -61, -16, -71, 32, 110, -43, -32, -63, -100, -99, -36, 79, 60, 74, -32, -63, -99, -93, 44, 51, 71, -34, -14, -64, 108, -16, -77, 33, 82, -43, -31, -3, -100, -107, -36, 76, Base64.padSymbol, 119, -31, -5, -99, -93, 32, -47, 60, 64, -31, -6, -100, -101, -36, 73, -52, 37, -114, -85, -15, -16, -68, -47, 60, 71, -32, -63, -100, -101, -35, ByteCompanionObject.MAX_VALUE, Base64.padSymbol, 114, -32, -50, -100, -99, -36, 65, -62, -43, -32, -37, -100, -107, -36, 70, Base64.padSymbol, 118, -32, -64, -99, -84, -35, 115, 60, 69, -31, -7, 108, -16, -80, 33, 82, 37, -122, -85, -15, -16, -78, -47, 60, 74, -32, -59, -100, -97, -35, 113, 60, 69, -32, -55, -100, -104, -35, 115, Base64.padSymbol, 121, 16, -85, -2, -15, -116, 32, 111, 36, -73, -85, -15, -15, -113, 32, 98, -37}, new byte[]{12, -15, -20, -11, 48, 123, 76, 32}), 12));
        this.body.addView(label(m.h(new byte[]{-91, -26, 54, -37, 114, -109, 67, -107, -91, -61, 55, -23, 114, -112, -77, -7, -56, -85, 86, 75, 115, -88, 67, -110, -91, -50, 54, -41, 114, -112, 67, -108, -92, -7, -54, 75, 115, -94, 66, -85, -91, -59, 54, -38, 115, -82, -77, -7, -56, -85, 86, -70, 35, -12, 17, -8, -11, -85, 88, -69, 26, -12, 17, -8, -7, 91, 54, -34, 114, -106, 67, -105, 85, -85, 82, -69, 23, -11, 42, -8, -12, -86, 100, -69, 16, -11, 43, -7, -64, 85, -58, -69, Base64.padSymbol, -11, 38, -8, -11, -85, 83, -70, 32, -11, 35, -8, -4, -85, 94, -70, 32, -11, 38, 5, 85, -86, 97, -70, 32, -11, 45, -7, -60, -86, 109, 75, 114, -99, 67, -98, -91, -57, 54, -34, 114, -104, 67, -111, -92, -7, 55, -25, -126, -12, 19, -7, -59, -86, 103, -69, 29, -11, 45, -7, -50, -85, 88, -69, 20, -11, 38, -7, -56, -85, 94, -69, 23, 11, -77, -7, -25, 91, 55, -22, 114, -105, 66, -72, -92, -5, 54, -42, 115, -90, 66, -85, -91, -59, 54, -41, -126, -11, 33, -7, -51, -85, 82, -69, 23, 5, 67, -107, -91, -59, 54, -35, 114, -104, 67, -105, 85, -85, 82, -69, 16, -11, 43, -7, -58, -85, 86, -70, 32, -12, 31, 9, -91, -63, 54, -42, 114, -101, 67, -106, -91, -63, 55, -24, -126, -12, 19, -7, -59, -86, 103, -69, 24, -12, 19, -8, -2, -86, 100, -69, 26, -12, 28, 7}, new byte[]{117, 123, -26, 107, -94, 37, -109, 41}), 12));
        LinearLayout column2 = column();
        this.previewHost = column2;
        this.body.addView(column2);
        preview();
        this.body.addView(label(m.h(new byte[]{6, -29, ByteCompanionObject.MAX_VALUE, -27, 19, 109, -78, -33, 6, -5, ByteCompanionObject.MAX_VALUE, -29, 18, 90, -77, -24, -10, -98, 23, 126, 19, 96, -77, -26, -10, -98, 27, -114, 118, 8, -37, -78, 87, -97, 45, -114, 113, 8, -38, -78, 89}, new byte[]{-42, 78, -81, 94, -61, -40, 98, 99}), 21));
        this.body.addView(label(m.h(new byte[]{-38, 4, Base64.padSymbol, -43, -110, 105, 51, 31, -37, 31, -51, -79, -1, 12, 82, 79, -117, 66, 111, -80, -62, 12, 82, 78, -78, 67, 95, -79, -14, 13, 108, 79, -120, 66, 108, -80, -51, -4, 50, 33, -38, 45, Base64.padSymbol, -43, -110, 99, 50, 38, -37, 18, Base64.padSymbol, -39, 110, -4, 50, 42, -38, 38, Base64.padSymbol, -40, -109, 93, 51, 28, -38, 33, Base64.padSymbol, -39, -109, 83, -62, 78, -78, -77, Base64.padSymbol, -45, -110, 100, 50, 42, -38, 43, Base64.padSymbol, -35, -110, 98, 51, 31, -37, 17, 60, -19, 98, 12, 88, 78, -70, 67, 91, -79, -10, 12, 92, 78, -77, -77, Base64.padSymbol, -37, -110, 97, 50, 32, -38, 44, Base64.padSymbol, -37, -110, 100, -52, -66, -38, 62, 60, -29, -110, 100, -62, 78, -68, 67, 88, 65, -110, 97, 50, 46, -37, 18, 60, -29, -109, 92, 50, 32, -38, 42, Base64.padSymbol, -37, -110, 100, -62, 78, -76, 66, 111, -79, -8, 13, 98, 79, -127, 67, 95, -79, -14, 13, 108, 79, -120, 66, 108, -80, -51, -4, 50, 35, -38, 35, Base64.padSymbol, -41, -110, 108, 51, 28, -38, 43, Base64.padSymbol, -44, -110, 96, -62, 78, -72, -77, Base64.padSymbol, -35, -110, 108, 50, 36, -38, 38, 60, -29, -110, 105, -52}, new byte[]{10, -109, -19, 97, 66, -36, -30, -98}), 12));
        if (this.current.f6485u.isEmpty()) {
            this.body.addView(label(m.h(new byte[]{-111, 106, -118, -26, 120, 92, -35, 93, 97, 37, -25, -120, 29, 55, -113, -51, -112, 120, -118, -29, 120, 83, -35, 81, -111, 64, -118, -27, 121, 100, -35, 83, -111, 71, 116, 120, 120, 114, -35, 83, -111, 68, -118, -24, 120, 84, -36, 97, -112, 119, -118, -19, -120, 54, -73, Base64.padSymbol, -4, 37, -28, -120, 23, 54, -73, 60, -62, -39, 122, -120, 23, 54, -72, 60, -63, 37, -17, -120, 18, 54, -74, 60, -49, 36, -35, -120, 24, 55, -113, Base64.padSymbol, -12, 37, -31, -119, 36, -58, -35, 85, -111, 78, -118, -32, -120, 55, -114, Base64.padSymbol, -2, 36, -38, -120, 24, 54, -65, Base64.padSymbol, -6, 37, -17, -120, 21, 54, -75, Base64.padSymbol, -12, -43, -117, -39, 120, 94, -35, 89, -111, 64, -118, -27, 121, 106, -35, 88, -111, 73, 116}, new byte[]{65, -11, 90, 88, -88, -26, 13, -19}), 14));
        }
        Button button6 = button(m.h(new byte[]{106, 17, 27, 69, -13, 56, 81, 104, 85, 28, 64, -43, -13, 30, 81, 110, 84, 47, 65, -23, 3, 125, 12, 6, 62, 125, 37, -75, -97, 124, 52, 6, 56, 124, 18}, new byte[]{-123, -83, -112, 101, 35, -84, -127, -42}));
        this.body.addView(button6);
        button6.setOnClickListener(new x0.e(this, 2));
        ArrayList arrayList3 = this.current.f6485u;
        int size = arrayList3.size();
        int i19 = 0;
        while (i19 < size) {
            Object obj = arrayList3.get(i19);
            i19++;
            final x0.m mVar = (x0.m) obj;
            LinearLayout card2 = card();
            card2.addView(label(mVar.f6461b, 17));
            card2.addView(label(TYPES[mVar.c.ordinal()], 12));
            card2.addView(label(elementSummary(mVar), 14));
            card2.addView(label(mVar.f6462f ? m.h(new byte[]{11, ByteCompanionObject.MAX_VALUE, -27, -98, 76, 0, -81, -81, 11, 80, 21, -10, 46, -108, -82, -102, 11, 93, -28, -89, 76, 14, -82, -102, 10, 102, -28, -92, 76, 10, -81, -90, -5, Base64.padSymbol, -115, 6, 77, 53, -81, -88, 10, 124, -28, -90, 76, 9, -82, -103, 10, 111, -27, -104, 76, 8, 95, -54, 105, Base64.padSymbol, -115, -10, 40, 100, -54}, new byte[]{-37, -19, 53, 38, -100, -76, ByteCompanionObject.MAX_VALUE, 26}) : m.h(new byte[]{-77, 72, 118, 69, -16, -35, 59, -63, -77, 103, -122, 44, -94, -71, 85, -92, -40, 11, 42, 45, -102, -71, 85, 84, -77, 104, -122, 44, -96, -71, 91, -91, -30, 10, 28, 44, -96, -72, 96, -91, -31, 10, 24, 45, -100, 73, 59, -58, -77, 98, 118, 73, -16, -36}, new byte[]{99, -38, -90, -3, 32, 105, -21, 116}), 12));
            LinearLayout row4 = row();
            View button7 = button(m.h(new byte[]{62, 84, -35, 65, -101, -90, -23, -18, 63, 73, -35, 79, -102, -97, -23, -18, 63, 69, 45, 32, -57, -9, -125, -68, 91, 25, -79, 33, -1, -9, -123, -67, 108}, new byte[]{-18, -55, 13, -15, 74, 39, 56, 108}));
            View button8 = button(m.h(new byte[]{-118, 91, 63, 33, 50, 98, -53, 121, -118, 64, 62, 23, 51, 94}, new byte[]{90, -8, -17, -107, -30, -46, 27, -62}));
            row4.addView(button7);
            row4.addView(button8);
            card2.addView(row4);
            this.body.addView(card2);
            final int i20 = 0;
            button7.setOnClickListener(new View.OnClickListener(this) { // from class: x0.f
                public final /* synthetic */ WidgetBuilderFragment c;

                {
                    this.c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i20) {
                        case 0:
                            this.c.lambda$editor$29(mVar, view);
                            return;
                        default:
                            this.c.lambda$editor$30(mVar, view);
                            return;
                    }
                }
            });
            button8.setOnClickListener(new View.OnClickListener(this) { // from class: x0.f
                public final /* synthetic */ WidgetBuilderFragment c;

                {
                    this.c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.c.lambda$editor$29(mVar, view);
                            return;
                        default:
                            this.c.lambda$editor$30(mVar, view);
                            return;
                    }
                }
            });
        }
        this.body.addView(label(m.h(new byte[]{-49, 69, -71, 34, -42, -57, 76, 26, -49, 96, -71, 32, -42, -58, 76, 23, -50, 82, 73, 69, -71, -86, 28, ByteCompanionObject.MAX_VALUE, -89, 13, -43, 69, -77, -85, 33, 126, -112, 12, -25, 68, -124, -86, 29, 126, -112, -3, -71, 47, -42, -58, 76, 17, -49, 98, -71, 47, -42, -59, 76, 22, 63, 31, -62, 69, -89, -85, 34, 126, -102, 12, -23, 69, -74, -85, 33, ByteCompanionObject.MAX_VALUE, -89, 12, -21, 68, -118, -71, 39, -127, 63, 13, -50, 68, -124, -85, 34, ByteCompanionObject.MAX_VALUE, -82, 12, -30, -75, -42, -60, 76, 26, -50, 93, -71, 32, -42, -57, 76, 26, -50, 92, -72, 23, -42, -61, 77, 45, -50, 81, 73, 69, -76, -85, 41, 126, -98, 12, -27, -75, -42, -55, 76, 23, -49, 105, -71, 35, -42, -50, 77, 45, 51, -3, -72, 22, -42, -49, 76, 26, -50, 93, -71, 35, -42, -61, 76, 29, -49, 109, -71, 44, -41, -7, 76, 26, 63, 13, -46, 68, -120, -85, 45, ByteCompanionObject.MAX_VALUE, -95, 13, -48, -75, -41, -10, 76, 20, -49, 104, -71, 41, -42, -50, 76, 18, -50, 95, 69, -75, -42, -52, 76, 31, -49, 110, -71, 43, -42, -64, 76, 17, -49, 111, -71, 43, -42, -63, -68, ByteCompanionObject.MAX_VALUE, -89, 13, -46, 69, -66, 91, 76, 21, -49, 96, -71, 43, -42, -60, 76, 21, -50, 94, 73, 68, -122, -85, 44, 126, -98, 13, -45, 68, -122, -86, 23, 126, -99, 13, -47, 68, -119, 87, -68, ByteCompanionObject.MAX_VALUE, -88, 13, -39, 68, -124, -85, 41, ByteCompanionObject.MAX_VALUE, -93, -3, -71, 42, -42, -50, 77, 47, -49, 104, -72, 23, -42, -53, 77, 38, -49, 101, -72, 23, -42, -50, -78}, new byte[]{31, -35, 105, -107, 6, 123, -100, -81}), 12));
        this.body = linearLayout2;
    }

    private String elementSummary(x0.m mVar) {
        n nVar = mVar.c;
        if (nVar == n.f6467b) {
            return m.h(new byte[]{-41, -21, -66, 18, 30, 11, 34, 95, -42, -12, -66, 26, 30, 8, -46, 13, -127, -28, 78}, new byte[]{7, 118, 110, -94, -50, -67, -14, -17}) + f.b(requireContext(), mVar.d).f3099i;
        }
        if (nVar == n.c) {
            return m.h(new byte[]{-30, -24, 93, 35, 108, 77, -73, -82, -29, -3, 93, 33, 109, 116, -73, -84, 18, -104, 11, 11, -100}, new byte[]{50, 122, -115, -103, -68, -10, 102, 32}) + f.b(requireContext(), mVar.d).f3099i + m.h(new byte[]{3, 79, 4, 96, -7, 11, 94, -97, -78, 78, 24, 96, -11, 11, 92, -98, -117, 78, 26, -111, -112, 93, 118, 111}, new byte[]{9, -97, -106, -79, 114, -37, -28, 79}) + f.b(requireContext(), mVar.e).f3099i;
        }
        return m.h(new byte[]{-21, -117, -113, 24, -38, -93, 28, 73, -22, -108, -113, 16, -38, -96, -20, 41, -122, -58, -17, -120, -38, -81, 28, 73, -22, -106, -114, 42, -38, -85, 29, 126, -21, -84, -114, 43, 42, -9, 74, 107, 27, -58, -19, 121, -127, -59, 118, 41, ByteCompanionObject.MIN_VALUE, -57, -47, 121, -115, -59, 121, 41, -122, -58, -31, -120, -24, -109, 94, -39, 10, 54, -67, 46, -104, 53, -2, -39, -39, -112, -51, -120, 57, 53, 46, ByteCompanionObject.MAX_VALUE, -87, 54, -113, 26, -37, -98, 28, 67, -21, -83, -114, 38, -37, -110, 28, 76, -21, -85, -113, 22}, new byte[]{59, 22, 95, -88, 10, 21, -52, -7});
    }

    private void heading(String str, String str2) {
        this.body.addView(label(str, 28));
        this.body.addView(label(str2, 14));
    }

    private EditText input(String str, String str2, boolean z9) {
        AppCompatEditText appCompatEditText = new AppCompatEditText(requireContext());
        appCompatEditText.setHint(str);
        appCompatEditText.setText(str2);
        appCompatEditText.setSingleLine();
        appCompatEditText.setTextColor(color(R.color.modern_text));
        appCompatEditText.setHintTextColor(color(R.color.modern_text_secondary));
        appCompatEditText.setTextSize(16.0f);
        if (z9) {
            appCompatEditText.setInputType(2);
        }
        return appCompatEditText;
    }

    private TextView label(String str, int i10) {
        int i11;
        TextView textView = new TextView(requireContext());
        textView.setText(str);
        textView.setTextSize(i10);
        if (i10 >= 17) {
            i11 = R.color.modern_text;
        } else {
            i11 = R.color.modern_text_secondary;
        }
        textView.setTextColor(color(i11));
        textView.setPadding(0, dp(6), 0, dp(6));
        if (i10 >= 17) {
            textView.setTypeface(Typeface.DEFAULT, 1);
        }
        return textView;
    }

    public /* synthetic */ void lambda$editElement$33(x0.m mVar, EditText editText, MaterialSwitch materialSwitch, Spinner spinner, Spinner spinner2, boolean z9, DialogInterface dialogInterface, int i10) {
        String trim = editText.getText().toString().trim();
        mVar.f6461b = trim;
        if (trim.isEmpty()) {
            mVar.f6461b = TYPES[mVar.c.ordinal()];
        }
        mVar.f6462f = materialSwitch.isChecked();
        if (spinner != null) {
            mVar.d = f.g((e) spinner.getSelectedItem());
        }
        if (spinner2 != null) {
            mVar.e = f.g((e) spinner2.getSelectedItem());
        }
        if (z9) {
            this.current.f6485u.add(mVar);
        }
        this.current.b();
        editor();
    }

    public /* synthetic */ void lambda$editor$10(View view) {
        persist();
        Toast.makeText(requireContext(), m.h(new byte[]{4, -2, 11, -21, -124, -124, -95, 46, 4, -39, 10, -47, 116, -31, -16, 72, 106, -67, 94, -126, -44, -32, -63, 72, 105, -67, 74, -125, -23}, new byte[]{-44, 108, -37, 83, 84, 48, 113, -104}), 0).show();
    }

    public /* synthetic */ void lambda$editor$11(EditText editText) {
        this.current.f6471b = editText.getText().toString().trim();
        preview();
    }

    public /* synthetic */ void lambda$editor$12(CompoundButton compoundButton, boolean z9) {
        this.current.c = z9;
    }

    public /* synthetic */ void lambda$editor$13(CompoundButton compoundButton, boolean z9) {
        o oVar = this.current;
        oVar.e = z9;
        oVar.b();
        preview();
    }

    public /* synthetic */ void lambda$editor$14(CompoundButton compoundButton, boolean z9) {
        o oVar = this.current;
        oVar.f6473g = z9;
        oVar.r = 0;
        oVar.f6484s = 0;
        oVar.b();
        this.collapsedPreview = true;
        preview();
    }

    public /* synthetic */ void lambda$editor$15(TextView textView, int i10) {
        this.current.f6478l = i10;
        StringBuilder sb = new StringBuilder();
        q.t(new byte[]{-30, Base64.padSymbol, -49, -13, 59, 9, -22, 110, -30, 40, -50, -61, -53, 111, -70, 2, -126, 76, -98, -109, 81, 111, -70, 3, -71, 76, -99, -109, 85, 110, -119, 2, -116, -67, -49, -15, 59, 6, -22, 102, -30, 43, -49, -10, 58, 60, -22, 98, 18, 95, -88, 99}, new byte[]{50, -99, 31, 67, -21, -66, 58, -46}, sb, i10);
        sb.append(m.h(new byte[]{-57}, new byte[]{-30, 55, 121, -118, -122, -23, 104, -127}));
        textView.setText(sb.toString());
        if (this.current.d) {
            this.collapsedPreview = false;
        }
        preview();
    }

    public /* synthetic */ void lambda$editor$16(TextView textView, int i10) {
        this.current.f6479m = i10;
        StringBuilder sb = new StringBuilder();
        q.t(new byte[]{-106, -42, -105, -29, 87, 35, -85, -21, -106, -61, -106, -45, -89, 69, -6, -121, -12, -89, -42, -126, 7, 68, -58, -122, -59, -89, -59, -125, 57, 68, -56, -121, -8, 86, -105, -31, 87, 44, -85, -29, -106, -64, -105, -26, 86, 22, -85, -25, 102, -76, -16, 115}, new byte[]{70, 118, 71, 83, -121, -108, 123, 87}, sb, i10);
        sb.append(m.h(new byte[]{23}, new byte[]{50, -6, 47, -105, 5, 87, -97, -21}));
        textView.setText(sb.toString());
        this.collapsedPreview = true;
        preview();
    }

    public /* synthetic */ void lambda$editor$17(TextView textView, int i10) {
        this.current.f6476j = i10;
        StringBuilder sb = new StringBuilder();
        q.t(new byte[]{117, 105, 119, -88, -125, 8, 19, -43, 116, 118, 118, -104, -126, 49, 19, -33, 117, 72, 119, -87, -126, 52, 18, -18, -123, 52, 17, 8}, new byte[]{-91, -10, -90, 40, 83, -74, -61, 98}, sb, i10);
        sb.append(m.h(new byte[]{-42}, new byte[]{-13, 106, -1, 107, 20, 9, 94, 69}));
        textView.setText(sb.toString());
        c cVar = this.previewBoard;
        if (cVar != null) {
            cVar.setAlpha(1.0f - (i10 / 100.0f));
        }
    }

    public /* synthetic */ void lambda$editor$18(TextView textView, int i10) {
        this.current.f6477k = i10;
        StringBuilder sb = new StringBuilder();
        q.t(new byte[]{125, 78, 98, 15, 92, -118, 38, 71, 124, 81, 99, 63, 93, -77, 38, 77, 125, 111, 98, 14, 93, -74, 39, 124, -115, 0, 55, 95, 50, -28, 75, 32, 29, -15, 99, 49, 92, -114, 38, 77, 125, 97, -109, 77, 59, 20}, new byte[]{-83, -47, -77, -113, -116, 52, -10, -16}, sb, i10);
        sb.append(m.h(new byte[]{-106}, new byte[]{-77, 55, -45, -58, 45, 94, -36, 83}));
        textView.setText(sb.toString());
        c cVar = this.previewBoard;
        if (cVar != null) {
            cVar.s();
        }
    }

    public /* synthetic */ void lambda$editor$19(List list, int i10) {
        this.current.f6474h = ((Integer) list.get(i10)).intValue();
    }

    public /* synthetic */ void lambda$editor$20(TextView textView, int i10) {
        this.current.f6475i = i10;
        StringBuilder sb = new StringBuilder();
        q.t(new byte[]{-49, -124, -106, 4, 57, -15, -29, 45, -49, -104, -105, 53, 56, -58, -29, 33, 63, -12, -63, 102, 92, -107, -78, 125, -86, -11, -15, -106, 43, -13, 18}, new byte[]{31, 37, 70, -74, -23, 68, 50, -83}, sb, i10);
        sb.append(m.h(new byte[]{107, 113, 81, -33, 14, -85, -18, 51}, new byte[]{75, -96, -48, 15, -69, 123, 84, 29}));
        textView.setText(sb.toString());
    }

    public /* synthetic */ void lambda$editor$21(MaterialSwitch materialSwitch, SeekBar seekBar, TextView textView) {
        float f8;
        boolean z9;
        float f10;
        materialSwitch.setEnabled(this.current.d);
        float f11 = 0.5f;
        if (this.current.d) {
            f8 = 1.0f;
        } else {
            f8 = 0.5f;
        }
        materialSwitch.setAlpha(f8);
        o oVar = this.current;
        if (oVar.d && oVar.f6472f) {
            z9 = true;
        } else {
            z9 = false;
        }
        seekBar.setEnabled(z9);
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        seekBar.setAlpha(f10);
        if (z9) {
            f11 = 1.0f;
        }
        textView.setAlpha(f11);
    }

    public /* synthetic */ void lambda$editor$22(Runnable runnable, CompoundButton compoundButton, boolean z9) {
        this.current.f6472f = z9;
        runnable.run();
    }

    public /* synthetic */ void lambda$editor$23(Runnable runnable, CompoundButton compoundButton, boolean z9) {
        this.current.d = !z9;
        if (z9) {
            this.collapsedPreview = true;
        }
        runnable.run();
        preview();
    }

    public /* synthetic */ void lambda$editor$24(View view) {
        this.collapsedPreview = false;
        preview();
    }

    public /* synthetic */ void lambda$editor$25(View view) {
        this.collapsedPreview = true;
        preview();
    }

    public void lambda$editor$26(View view) {
        int i10;
        int max;
        int i11;
        boolean z9;
        String h2;
        int i12;
        int max2;
        int size;
        int i13;
        int i14;
        boolean z10;
        int max3;
        int i15;
        o oVar = this.current;
        boolean z11 = this.collapsedPreview;
        ArrayList arrayList = oVar.f6485u;
        int i16 = NNTPReply.AUTHENTICATION_REQUIRED;
        int i17 = 88;
        if (z11) {
            ArrayList arrayList2 = new ArrayList();
            int size2 = arrayList.size();
            int i18 = 0;
            int i19 = 76;
            while (i18 < size2) {
                Object obj = arrayList.get(i18);
                i18++;
                x0.m mVar = (x0.m) obj;
                if (mVar.f6462f) {
                    arrayList2.add(mVar);
                    i17 = Math.max(i17, mVar.b());
                    i19 = Math.max(i19, mVar.a());
                }
            }
            if (oVar.f6473g) {
                i16 = 320;
            }
            while (true) {
                i12 = i17 + 12;
                max2 = Math.max(1, (i16 - 20) / i12);
                size = ((arrayList2.size() + max2) - 1) / max2;
                i13 = (size + 1) / 2;
                if (oVar.d) {
                    if (i13 == 0) {
                        i14 = 96;
                    } else {
                        i14 = (((i13 - 1) * 12) + (i13 * i19) + 60) * 2;
                    }
                } else {
                    i14 = 32;
                    if (size != 0) {
                        i14 = 32 + ((size - 1) * 12) + (size * i19);
                    }
                }
                z10 = oVar.f6473g;
                if (!z10 || i14 <= i16) {
                    break;
                } else {
                    i16 += 8;
                }
            }
            if (z10) {
                oVar.r = i16;
            } else {
                oVar.f6484s = Math.max(240, i14);
            }
            int c = oVar.c(false);
            oVar.f6480n = (i16 - 64) / 2;
            int i20 = (c - 64) / 2;
            oVar.f6481o = i20;
            boolean z12 = oVar.d;
            oVar.t = z12;
            if (z12) {
                max3 = ((i20 - 12) - (i13 * i19)) - (Math.max(0, i13 - 1) * 12);
            } else {
                max3 = ((c - (size * i19)) - (Math.max(0, size - 1) * 12)) / 2;
            }
            for (int i21 = 0; i21 < arrayList2.size(); i21++) {
                int i22 = i21 / max2;
                int min = Math.min(max2, arrayList2.size() - (i22 * max2));
                x0.m mVar2 = (x0.m) arrayList2.get(i21);
                mVar2.f6465i = ((i17 - mVar2.b()) / 2) + ((i21 % max2) * i12) + (((i16 - (min * i17)) - ((min - 1) * 12)) / 2);
                if (oVar.d && i22 >= i13) {
                    i15 = ((i19 + 12) * (i22 - i13)) + oVar.f6481o + 76;
                } else {
                    i15 = ((i19 + 12) * i22) + max3;
                }
                mVar2.f6466j = ((i19 - mVar2.a()) / 2) + i15;
            }
        } else {
            int size3 = arrayList.size();
            int i23 = 76;
            int i24 = 0;
            while (i24 < size3) {
                Object obj2 = arrayList.get(i24);
                i24++;
                x0.m mVar3 = (x0.m) obj2;
                i17 = Math.max(i17, mVar3.b());
                i23 = Math.max(i23, mVar3.a());
            }
            if (oVar.e) {
                i16 = 320;
            }
            while (true) {
                i10 = i17 + 12;
                max = Math.max(1, (i16 - 20) / i10);
                int size4 = ((arrayList.size() + max) - 1) / max;
                if (size4 == 0) {
                    i11 = 68;
                } else {
                    i11 = ((size4 - 1) * 12) + (size4 * i23) + 52 + 16;
                }
                z9 = oVar.e;
                if (!z9 || i11 <= i16) {
                    break;
                } else {
                    i16 += 8;
                }
            }
            if (z9) {
                oVar.f6482p = i16;
            } else {
                oVar.f6483q = Math.max(176, i11);
            }
            for (int i25 = 0; i25 < arrayList.size(); i25++) {
                int i26 = i25 / max;
                int min2 = Math.min(max, arrayList.size() - (i26 * max));
                int i27 = ((i16 - (min2 * i17)) - ((min2 - 1) * 12)) / 2;
                x0.m mVar4 = (x0.m) arrayList.get(i25);
                mVar4.f6463g = ((i17 - mVar4.b()) / 2) + ((i25 % max) * i10) + i27;
                mVar4.f6464h = ((i23 + 12) * i26) + 52;
            }
        }
        preview();
        Context requireContext = requireContext();
        if (this.collapsedPreview && this.current.d) {
            h2 = m.h(new byte[]{-84, -13, 69, -22, 76, 86, 6, -12, -83, -40, 69, -31, -68, 53, 86, -104, -13, -125, 33, -123, 23, -56, -10, -103, -58, -125, 40, -124, 34, 52, 105, -103, -58, -125, 37, 116, 76, 90, 7, -53, -84, -23, 68, -44, 77, 111, 7, -53, -84, -21, 68, -37, -68, 52, 105, -103, -62, 115, 68, -46, 76, 81, 6, -12, -83, -47, 68, -44, 77, 103}, new byte[]{124, 83, -107, 84, -100, -28, -42, 73});
        } else {
            h2 = m.h(new byte[]{-44, -61, 76, 116, 70, -55, -79, -44, -44, -37, 76, 114, 71, -2, -80, -29, 36, -66, 46, 30, 29, -83, -31, -72, -70, -66, 46, 31, 43, -84, -44, -72, -71, -65, 23, -17, 70, -50, 65, -71, -124, -65, 19, 31, 34, -83, -22}, new byte[]{4, 110, -100, -49, -106, 124, 97, 104});
        }
        Toast.makeText(requireContext, h2, 0).show();
    }

    public /* synthetic */ void lambda$editor$27(DialogInterface dialogInterface, int i10) {
        x0.m mVar = new x0.m();
        mVar.c = n.values()[i10];
        mVar.f6461b = TYPES[i10];
        mVar.f6463g = ((this.current.f6485u.size() % 3) * 144) + 16;
        mVar.f6464h = 52;
        mVar.f6465i = ((this.current.f6485u.size() % 2) * 160) + 8;
        mVar.f6466j = (((this.current.f6485u.size() / 2) % 2) * 144) + 8;
        editElement(mVar, true);
    }

    public /* synthetic */ void lambda$editor$28(View view) {
        dialogBuilder().setTitle(m.h(new byte[]{111, -68, 40, 110, 126, 77, -89, 115, 50, -50, 67, 6, 27, 34, 59, 114, 10, -50, 69, 7, 44, 34, 55}, new byte[]{-65, 30, -8, -42, -82, -14, -121, -94})).setAdapter(popupItems(TYPES), new h(4, this)).show();
    }

    public /* synthetic */ void lambda$editor$29(x0.m mVar, View view) {
        editElement(mVar, false);
    }

    public /* synthetic */ void lambda$editor$30(x0.m mVar, View view) {
        this.current.f6485u.remove(mVar);
        editor();
    }

    public /* synthetic */ void lambda$editor$9(View view) {
        this.current = null;
        library();
    }

    public /* synthetic */ void lambda$library$2(View view) {
        requireActivity().finish();
    }

    public /* synthetic */ void lambda$library$3(View view) {
        o oVar = new o();
        this.current = oVar;
        oVar.f6471b = m.h(new byte[]{84, 18, -78, 104, 25, -57, -103, 123, 84, 53, -77, 82, -23}, new byte[]{-124, ByteCompanionObject.MIN_VALUE, 98, -48, -55, 115, 73, -51}) + (this.designs.size() + 1);
        this.designs.add(this.current);
        this.collapsedPreview = false;
        editor();
    }

    public /* synthetic */ void lambda$library$4(o oVar, CompoundButton compoundButton, boolean z9) {
        oVar.c = z9;
        persist();
    }

    public /* synthetic */ void lambda$library$5(o oVar, View view) {
        this.current = oVar;
        this.collapsedPreview = false;
        editor();
    }

    public /* synthetic */ void lambda$library$6(o oVar, View view) {
        try {
            o e = o.e(oVar.d());
            e.f6470a = UUID.randomUUID().toString();
            e.f6471b += m.h(new byte[]{105, 26, -35, 93, -77, 78, 56, -73, -103, 103, -70, -59, -78, 123}, new byte[]{73, -40, 106, 125, 99, -12, -24, 9});
            this.designs.add(e);
            persist();
            library();
        } catch (Exception e6) {
            throw new IllegalStateException(e6);
        }
    }

    public /* synthetic */ void lambda$library$7(o oVar, DialogInterface dialogInterface, int i10) {
        this.designs.remove(oVar);
        persist();
        library();
    }

    public /* synthetic */ void lambda$library$8(o oVar, View view) {
        dialogBuilder().setTitle(m.h(new byte[]{-86, 7, -6, -40, 120, -115, -47, 0, -86, 28, -5, -18, 121, -79, 33, 121, -47}, new byte[]{122, -92, 42, 108, -88, Base64.padSymbol, 1, -69}) + oVar.f6471b + m.h(new byte[]{-109, 70, 22}, new byte[]{81, -3, 41, -7, 64, 82, 111, 123})).setNegativeButton(m.h(new byte[]{96, 43, 105, 85, 120, 12, 125, -44, 96, 8, 104, 103}, new byte[]{-80, -75, -72, -41, -88, -80, -83, 97}), (DialogInterface.OnClickListener) null).setPositiveButton(m.h(new byte[]{108, -6, 66, -99, 39, -25, 49, -1, 108, -31, 67, -85, 38, -37}, new byte[]{-68, 89, -110, 41, -9, 87, -31, 68}), new e0(10, this, oVar)).show();
    }

    public /* synthetic */ void lambda$onCreateView$0(List list) {
        this.actions.clear();
        this.actions.addAll(list);
    }

    public /* synthetic */ void lambda$onCreateView$1(Context context) {
        new Handler(Looper.getMainLooper()).post(new x0(13, this, new j0.c(context).e()));
    }

    public /* synthetic */ void lambda$preview$31(x0.m mVar) {
        editElement(mVar, false);
    }

    private void library() {
        String h2;
        this.previewHost = null;
        this.previewBoard = null;
        this.body.removeAllViews();
        heading(m.h(new byte[]{38, 102, 2, -69, -45, 96, 97, 23, 39, 126, 3, -123, -46, 94, 96, 44, 39, 126, 2, -69, -46, 93, -112, 70, 68, 44, 106, -43, -73, 13, 6, 70, 67, 45, 80, -43, -67, 13, 2}, new byte[]{-10, -4, -46, 5, 3, -35, -80, -106}), m.h(new byte[]{-83, 120, -44, -112, 43, 14, 101, 104, 93, 58, -80, -16, 79, 86, 12, 1, -4, 59, -122, -16, 72, 86, 13, 1, -14, -54, -26, -96, 110, -90, 101, 109, -83, 90, 36, -16, 71, 87, 54, 0, -53, 58, -71, -16, 68, 86, 9, -16, -84, 103, -44, -102, 43, 6, 101, 96, -83, 87, -44, -107}, new byte[]{125, -22, 4, 32, -6, -122, -75, -48}));
        LinearLayout row = row();
        Button button = button(m.h(new byte[]{-56, -26, 27, 11, -10, 48, 126, 58, -6, -47, 114, -101, -10, 25}, new byte[]{42, 102, -94, 43, 38, -83, -82, -118}));
        Button button2 = button(m.h(new byte[]{-54, 64, -80, -124, -7, -112, -97, -13, -11, 75, -21, 16, -7, -127, -98, -49, -12, 112, 27, 116, -101, -31, -9, -99, -111, 44, -115, 116, -100, -32, -51}, new byte[]{37, -4, 59, -92, 41, 49, 79, 77}));
        row.addView(button);
        row.addView(button2);
        this.body.addView(row);
        button.setOnClickListener(new x0.e(this, 4));
        button2.setOnClickListener(new x0.e(this, 5));
        if (this.designs.isEmpty()) {
            LinearLayout card = card();
            card.addView(label(m.h(new byte[]{-4, -68, 75}, new byte[]{30, 43, -61, 95, 63, 46, -101, -73}), 40));
            card.addView(label(m.h(new byte[]{-3, 0, 120, 24, -41, 120, 56, 91, -4, 33, 120, 30, -42, 75, 56, 91, 13, 112, 41, 118, -75, 25, 86, 63, -68, -127, 121, 37, -41, 118, 57, 110, -3, 17, 120, 20, -41, 114, 56, 91, -3, 28, 120, 30, -41, 124}, new byte[]{45, -95, -88, -90, 7, -55, -24, -18}), 20));
            card.addView(label(m.h(new byte[]{-60, -29, 11, 42, -11, 37, -85, -53, -60, -61, 11, 47, 9, -69, -85, -53, -60, -52, 10, 23, -11, 46, -85, -50, -60, -62, 10, 25, -12, 28, -85, -60, -59, -5, 11, 34, -11, 32, -85, -52, 52, -87, 99, -73, -12, 25, -86, -12, -60, -63, -5, 70, -90, 74, -5, -92, -86, -87, 105, 71, -104, 74, -12, 84, -59, -8, 11, 47, -11, 47, -85, -63, -60, -60, 11, 47, -11, 34, 85, 84, -60, -25, 10, 21, -11, 47, -85, -63, -60, -62, 10, 27, -11, 38, -85, -54, -60, -52, -5, 70, -91, 75, -53, -91, -107, -87, 100, 71, -101, 75, -64, -92, -86, -87, 109, 71, -112, 75, -58, -92, -84, -87, 110, -73, -11, 47, -85, -49, -59, -10, -5, 70, -91, 75, -53, -91, -107, -87, 97, 70, -91, 74, -16, -91, -106, -87, 101, 71, -106, 75, -59, 84, -60, -63, -5, 70, -92, 75, -55, -91, -123, -88, 91, 71, -104, 74, -8, -91, -106, -87, 101, 71, -106, 75, -59, 84, -60, -53, 11, 47, -11, 47, -85, -60, 58}, new byte[]{20, 121, -37, -105, 37, -101, 123, 116}), 14));
            this.body.addView(card);
        }
        for (final o oVar : this.designs) {
            LinearLayout card2 = card();
            card2.addView(label(oVar.f6471b, 20));
            StringBuilder sb = new StringBuilder();
            sb.append(oVar.f6485u.size());
            sb.append(m.h(new byte[]{-37, 9, -79, -89, -100, -50, 60, 77, 71, 8, -119, -89, -102, -49, 11, 77, 69, 8, -114, 87, 7, -36, 62, -67, -37}, new byte[]{-5, -40, 60, 119, 39, 30, -119, -99}));
            if (oVar.e) {
                h2 = m.h(new byte[]{69, 9, -14, 36, -105, 121, -2, 86, 68, 19, -14, 38, -106, 75}, new byte[]{-107, -109, 34, -106, 71, -55, 46, -30});
            } else {
                h2 = m.h(new byte[]{-84, -7, -69, 75, 64, -87, -110, 82, -84, -35, -70, 119}, new byte[]{124, 102, 107, -5, -112, 20, 66, -25});
            }
            sb.append(h2);
            sb.append(m.h(new byte[]{-66, -111, -34, -39, 81, -127, -97, 80, 78, 11, -51, -18, -95, 17, -97, 64, -66}, new byte[]{-98, -79, 28, 110, 113, -95, 79, -3}));
            sb.append(oVar.f6474h);
            card2.addView(label(sb.toString(), 12));
            MaterialSwitch check = check(m.h(new byte[]{17, -62, 120, -11, 94, -14, 83, 69, 17, -27, 121, -49, -82, -106, 49, 35, 123, ByteCompanionObject.MIN_VALUE, 19, -100, 0, -105, 4, 34, 80, ByteCompanionObject.MIN_VALUE, 21}, new byte[]{-63, 80, -88, 77, -114, 70, -125, -13}), oVar.c);
            check.setOnCheckedChangeListener(new c3(5, this, oVar));
            card2.addView(check);
            LinearLayout row2 = row();
            Button button3 = button(m.h(new byte[]{5, -88, Base64.padSymbol, -94, 22, 58, 29, 49, 4, -75, Base64.padSymbol, -84, 23, 3, 29, 49, 4, -71}, new byte[]{-43, 53, -19, 18, -57, -69, -52, -77}));
            Button button4 = button(m.h(new byte[]{-106, -31, -4, 12, -35, 88, -78, 41, -105, -12}, new byte[]{70, 123, 44, -78, 13, -25, 98, -111}));
            Button button5 = button(m.h(new byte[]{ByteCompanionObject.MAX_VALUE, 112, 103, 7, -66, 110, -87, 109, ByteCompanionObject.MAX_VALUE, 107, 102, 49, -65, 82}, new byte[]{-81, -45, -73, -77, 110, -34, 121, -42}));
            row2.addView(button3);
            row2.addView(button4);
            row2.addView(button5);
            card2.addView(row2);
            this.body.addView(card2);
            final int i10 = 0;
            button3.setOnClickListener(new View.OnClickListener(this) { // from class: x0.i
                public final /* synthetic */ WidgetBuilderFragment c;

                {
                    this.c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.c.lambda$library$5(oVar, view);
                            return;
                        case 1:
                            this.c.lambda$library$6(oVar, view);
                            return;
                        default:
                            this.c.lambda$library$8(oVar, view);
                            return;
                    }
                }
            });
            final int i11 = 1;
            button4.setOnClickListener(new View.OnClickListener(this) { // from class: x0.i
                public final /* synthetic */ WidgetBuilderFragment c;

                {
                    this.c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.c.lambda$library$5(oVar, view);
                            return;
                        case 1:
                            this.c.lambda$library$6(oVar, view);
                            return;
                        default:
                            this.c.lambda$library$8(oVar, view);
                            return;
                    }
                }
            });
            final int i12 = 2;
            button5.setOnClickListener(new View.OnClickListener(this) { // from class: x0.i
                public final /* synthetic */ WidgetBuilderFragment c;

                {
                    this.c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            this.c.lambda$library$5(oVar, view);
                            return;
                        case 1:
                            this.c.lambda$library$6(oVar, view);
                            return;
                        default:
                            this.c.lambda$library$8(oVar, view);
                            return;
                    }
                }
            });
        }
    }

    private void persist() {
        List<o> list = this.designs;
        String str = p.f6486a;
        JSONArray jSONArray = new JSONArray();
        try {
            for (o oVar : list) {
                oVar.b();
                jSONArray.put(oVar.d());
            }
            h0.b.o().saveString(p.f6486a, jSONArray.toString());
            Context requireContext = requireContext();
            AllWidgetServices allWidgetServices = AllWidgetServices.f693g;
            if (allWidgetServices == null) {
                AllWidgetServices.c(requireContext);
            } else {
                allWidgetServices.f696b.post(new e0.c(allWidgetServices, 0));
            }
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    private Context popupContext() {
        return new ContextThemeWrapper(requireContext(), R.style.Theme_JCarTools_WidgetBuilderPopup);
    }

    private ArrayAdapter<String> popupItems(String[] strArr) {
        return new k(this, popupContext(), strArr);
    }

    private void preview() {
        o oVar;
        String h2;
        String h10;
        String h11;
        LinearLayout linearLayout = this.previewHost;
        if (linearLayout != null && (oVar = this.current) != null) {
            if (!oVar.d) {
                this.collapsedPreview = true;
            }
            linearLayout.removeAllViews();
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(requireContext());
            c cVar = new c(requireContext(), this.current, true, !this.collapsedPreview);
            this.previewBoard = cVar;
            cVar.setElementEditor(new org.apache.commons.io.filefilter.b(4, this));
            Button button = this.openTab;
            if (button != null) {
                button.setEnabled(this.current.d);
                Button button2 = this.closedTab;
                if (this.current.d) {
                    h11 = m.h(new byte[]{-100, -22, 27, 80, -57, -41, 56, -121, -100, -10, 26, 97, -57, -60, 56, -116, -100, -14}, new byte[]{76, 75, -53, -30, 22, 70, -23, 7});
                } else {
                    h11 = m.h(new byte[]{-12, -71, 103, -119, -52, 13, -5, -60, -98, -8, 10, -20, -94, 106, 100, -60, -98, -8, 15, 28, -34, 17, -16, -42, -97}, new byte[]{36, 40, -73, 60, 28, -70, -37, 20});
                }
                button2.setText(h11);
                tab(this.openTab, !this.collapsedPreview);
                tab(this.closedTab, this.collapsedPreview);
                this.closedTab.setEnabled(true);
            }
            Button button3 = this.alignmentButton;
            if (button3 != null) {
                button3.setEnabled(true);
                this.alignmentButton.setAlpha(1.0f);
            }
            horizontalScrollView.addView(cVar, new ViewGroup.LayoutParams(cVar.p(cVar.c()), cVar.p(cVar.b())));
            this.previewHost.addView(horizontalScrollView);
            LinearLayout linearLayout2 = this.previewHost;
            if (this.collapsedPreview) {
                h2 = m.h(new byte[]{-9, 60, -76, 5, -3, -118, -118, 12, -9, 32, -75, 52, -3, -103, -118, 7, -9, 36, 68, 103, -98, -53, -29, 92, -109}, new byte[]{39, -99, 100, -73, 44, 27, 91, -116});
            } else {
                h2 = m.h(new byte[]{-59, 108, 20, 106, 65, 85, 40, 111, -60, 76, 21, 81, 65, 86, 41, 94, -59, 117, -28, 10, 34, 4, 64, 5, -95}, new byte[]{21, -52, -60, -38, -112, -44, -8, -43});
            }
            linearLayout2.addView(label(h2, 12));
            if (this.collapsedPreview && this.current.f6485u.stream().noneMatch(new i7.k(8))) {
                LinearLayout linearLayout3 = this.previewHost;
                if (this.current.d) {
                    h10 = m.h(new byte[]{41, -123, -43, 78, -99, -93, 84, 21, 41, -108, -44, 122, 109, -54, 59, 67, 120, -11, -121, 43, -3, -53, 20, 67, 123, -11, -124, 42, -62, 58, 84, 16, 41, -102, -43, 64, -100, -106, 85, 40, 41, -102, 37, 43, -9, -54, 56, 66, 71, -12, -70, 43, -9, -54, 53, -78, 40, -92, -43, 75, -100, -101, 85, 40, 40, -92, -44, 112, -100, -104, 85, 42, 40, -85, 43}, new byte[]{-7, 36, 5, -5, 77, 26, -123, -110});
                } else {
                    h10 = m.h(new byte[]{-39, -125, 44, -24, -27, -63, -67, -109, -39, -110, 45, -36, 21, -88, -34, -60, -79, -14, 72, -115, -115, -88, -48, -59, -126, -13, 121, 125, -28, -11, -68, -81, -39, -105, 44, -31, -27, -51, -68, -87, -40, -96, 44, -29, -27, -54, 76, -60, -76, -14, 73, -116, -73, 86}, new byte[]{9, 34, -4, 93, 53, 120, 108, 20});
                }
                linearLayout3.addView(label(h10.concat(m.h(new byte[]{-30, -38, 30, -127, 23, -21, -16, 49, 19, -117, 93, 35, 22, -42, -16, 63, 18, -77, 92, 27, 23, -26, -15, 4, -30, -38, 49, 112, 68, -122, -106, 81, ByteCompanionObject.MAX_VALUE, -38, 50, 113, 116, -122, -98, -95, 19, -121, 92, 26, 23, -29, -16, Base64.padSymbol, 18, -65, 92, 28, 22, -44, -16, 49, -30, -38, 62, 113, 125, -122, -101, 80, 76, -37, 11, 113, ByteCompanionObject.MAX_VALUE, -121, -94, 81, 119, 42, 78, 10, 23, -56, -15, 0, 19, -120, 92, 17, 23, -28, -16, 57, 19, -120, 93, 45, -25, -122, -110, 81, 122, -38, 56, 113, ByteCompanionObject.MAX_VALUE, -122, -100, 80, 73, -38, 48, -127, 23, -23, -15, 1, 18, -78, -84, 112, 70, -122, -110, 81, 124, -37, 12, 113, 119, -121, -89, 81, 122, -38, 62, 113, 119, -122, -99, 81, 122, -38, 52, 99, 124, 120}, new byte[]{-62, 10, -116, -95, -57, 86, 32, -127})), 13));
            }
        }
    }

    private LinearLayout row() {
        LinearLayout linearLayout = new LinearLayout(requireContext());
        linearLayout.setGravity(16);
        return linearLayout;
    }

    private void select(Spinner spinner, IntConsumer intConsumer) {
        spinner.setOnItemSelectedListener(new e1(5, intConsumer));
    }

    private void show() {
        if (this.current == null) {
            library();
        } else {
            editor();
        }
    }

    private SeekBar slider(String str, int i10, int i11, int i12, IntConsumer intConsumer) {
        AppCompatSeekBar appCompatSeekBar = new AppCompatSeekBar(requireContext());
        appCompatSeekBar.setContentDescription(str);
        appCompatSeekBar.setMax(i11 - i10);
        appCompatSeekBar.setProgress(i12 - i10);
        appCompatSeekBar.setProgressTintList(ColorStateList.valueOf(color(R.color.modern_primary)));
        appCompatSeekBar.setProgressBackgroundTintList(ColorStateList.valueOf(color(R.color.modern_divider)));
        appCompatSeekBar.setThumbTintList(ColorStateList.valueOf(color(R.color.modern_primary)));
        appCompatSeekBar.setSplitTrack(false);
        appCompatSeekBar.setPadding(dp(10), 0, dp(10), 0);
        appCompatSeekBar.setLayoutParams(new LinearLayout.LayoutParams(-1, dp(44)));
        appCompatSeekBar.setOnSeekBarChangeListener(new l(intConsumer, i10));
        return appCompatSeekBar;
    }

    private Spinner spinner(List<String> list) {
        Spinner themedSpinner = themedSpinner();
        themedSpinner.setAdapter((SpinnerAdapter) new k(this, themedSpinner.getContext(), list));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color(R.color.modern_surface_high));
        gradientDrawable.setCornerRadius(dp(12));
        themedSpinner.setBackground(gradientDrawable);
        themedSpinner.setPadding(dp(8), 0, dp(8), 0);
        return themedSpinner;
    }

    private void tab(Button button, boolean z9) {
        float f8;
        if (z9) {
            f8 = 1.0f;
        } else {
            f8 = 0.55f;
        }
        button.setAlpha(f8);
        button.setSelected(z9);
    }

    private Spinner themedSpinner() {
        Context popupContext = popupContext();
        return new AppCompatSpinner(popupContext, null, androidx.appcompat.R.attr.spinnerStyle, 0, popupContext.getTheme());
    }

    private void watch(EditText editText, Runnable runnable) {
        editText.addTextChangedListener(new a1(4, runnable));
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.designs = p.a();
        if (bundle != null) {
            try {
                JSONArray jSONArray = new JSONArray(bundle.getString(m.h(new byte[]{17, 83, 22, 54, 50, -5, 83}, new byte[]{117, 54, 101, 95, 85, -107, 32, 12}), m.h(new byte[]{28, -118}, new byte[]{71, -41, -32, -124, -24, 21, -123, 38})));
                this.designs.clear();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    this.designs.add(o.e(jSONArray.getJSONObject(i10)));
                }
            } catch (Exception unused) {
                this.designs = p.a();
            }
            for (o oVar : this.designs) {
                if (oVar.f6470a.equals(bundle.getString(m.h(new byte[]{24, -19, -56, 24, -94, -62, -91}, new byte[]{123, -104, -70, 106, -57, -84, -47, -43})))) {
                    this.current = oVar;
                }
            }
            this.collapsedPreview = bundle.getBoolean(m.h(new byte[]{18, 40, -33, 6, -94, 85, -111, 35, 21}, new byte[]{113, 71, -77, 106, -61, 37, -30, 70}));
        }
        ScrollView scrollView = new ScrollView(requireContext());
        scrollView.setFillViewport(true);
        LinearLayout column = column();
        this.body = column;
        column.setPadding(dp(24), dp(20), dp(24), dp(24));
        this.body.setBackgroundColor(color(R.color.modern_background));
        scrollView.addView(this.body);
        show();
        Context applicationContext = requireContext().getApplicationContext();
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        newSingleThreadExecutor.execute(new x0(14, this, applicationContext));
        newSingleThreadExecutor.shutdown();
        return scrollView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.body = null;
        this.previewHost = null;
        this.previewBoard = null;
        this.openTab = null;
        this.closedTab = null;
        this.alignmentButton = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<o> it = this.designs.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().d());
            }
        } catch (Exception unused) {
        }
        bundle.putString(m.h(new byte[]{-48, 56, 5, -67, 35, 69, -46}, new byte[]{-76, 93, 118, -44, 68, 43, -95, -66}), jSONArray.toString());
        if (this.current != null) {
            bundle.putString(m.h(new byte[]{36, 116, -74, -115, 58, -12, 13}, new byte[]{71, 1, -60, -1, 95, -102, 121, 88}), this.current.f6470a);
        }
        bundle.putBoolean(m.h(new byte[]{-75, 59, 6, -11, 17, 89, 86, 64, -78}, new byte[]{-42, 84, 106, -103, 112, 41, 37, 37}), this.collapsedPreview);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        AllWidgetServices.f695i = true;
        AllWidgetServices allWidgetServices = AllWidgetServices.f693g;
        if (allWidgetServices == null) {
            return;
        }
        allWidgetServices.f696b.post(new e0.c(allWidgetServices, 1));
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        AllWidgetServices.f695i = false;
        AllWidgetServices allWidgetServices = AllWidgetServices.f693g;
        if (allWidgetServices != null) {
            allWidgetServices.f696b.post(new e0.c(allWidgetServices, 1));
        }
        super.onStop();
    }
}
