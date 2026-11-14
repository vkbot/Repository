package e0;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.pm.PackageInfoCompat;
import com.example.navistart.MainActivity;
import com.example.navistart.R;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k1 extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f1952a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f1953b;

    public k1(MainActivity mainActivity) {
        this.f1953b = mainActivity;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(m.h(new byte[]{-32, 123, 98, 88, 6, -16, 117, 97}, new byte[]{-120, 15, 22, 40, 117, -54, 90, 78}) + this.f1953b.f767f + m.h(new byte[]{38, -68, 6, 1, 24, -103, 51, 45, 68, -75, 17, 104, 41, -65, 26, 3}, new byte[]{9, -6, 65, 70, 65, -53, 119, 111})).openConnection();
            httpURLConnection.setRequestMethod(m.h(new byte[]{25, 104, 88}, new byte[]{94, 45, 12, 76, -107, 89, -93, 55}));
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        this.f1952a.append(readLine);
                    } else {
                        bufferedReader.close();
                        httpURLConnection.disconnect();
                        return null;
                    }
                }
            } else {
                throw new Exception(httpURLConnection.getResponseMessage());
            }
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        PackageInfo packageInfo;
        long j10;
        super.onPostExecute((Void) obj);
        try {
            JSONObject jSONObject = new JSONObject(this.f1952a.toString());
            boolean isNull = jSONObject.isNull(m.h(new byte[]{-67, 115, 104}, new byte[]{-34, 30, 12, ByteCompanionObject.MAX_VALUE, 43, -86, -36, 112}));
            MainActivity mainActivity = this.f1953b;
            if (!isNull && m.h(new byte[]{122}, new byte[]{75, 42, -4, -59, -122, 66, 116, -19}).equals(jSONObject.getString(m.h(new byte[]{-19, 24, 97}, new byte[]{-114, 117, 5, -114, -74, 74, -30, 8})))) {
                ImageView imageView = (ImageView) mainActivity.findViewById(R.id.imageView);
                imageView.setVisibility(0);
                h1 h1Var = new h1();
                h1Var.f1934b = imageView;
                h1Var.execute(jSONObject.getString(m.h(new byte[]{-56, 20, -26}, new byte[]{-95, 121, -127, -95, -32, 115, 116, 2})));
            }
            if (!jSONObject.isNull(m.h(new byte[]{3, 50, -54, 66, 66, 32}, new byte[]{109, 87, -67, 52, 39, 82, -25, 111}))) {
                z2.f2092a = jSONObject.getString(m.h(new byte[]{-54, -11, 122, -114, -117, 106}, new byte[]{-92, -112, 13, -8, -18, 24, 95, -63}));
                String str = MainActivity.f750e1;
                mainActivity.getPackageManager().getInstalledPackages(128);
                try {
                    packageInfo = mainActivity.getApplicationContext().getPackageManager().getPackageInfo(mainActivity.getPackageName(), 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    j10 = PackageInfoCompat.getLongVersionCode(packageInfo);
                } else {
                    j10 = packageInfo.versionCode;
                }
                if (j10 < Long.parseLong(z2.f2092a)) {
                    String str2 = mainActivity.getResources().getString(R.string.toast_update) + mainActivity.getResources().getString(R.string.menu_update);
                    AlertDialog.Builder builder = new AlertDialog.Builder(mainActivity);
                    builder.setTitle(mainActivity.getResources().getString(R.string.app_name)).setMessage(str2);
                    AlertDialog create = builder.create();
                    create.show();
                    new Handler(Looper.getMainLooper()).postDelayed(new a1.a(17, this, create), 4000L);
                }
            }
        } catch (JSONException unused2) {
        }
    }
}
