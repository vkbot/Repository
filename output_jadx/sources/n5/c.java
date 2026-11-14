package n5;

import android.content.Context;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import c7.l;
import j1.i;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import l5.f;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {
    public static final Pattern d = Pattern.compile("[0-9]+s");
    public static final Charset e = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final Context f4127a;

    /* renamed from: b, reason: collision with root package name */
    public final k5.b f4128b;
    public final b2.b c = new b2.b();

    public c(Context context, k5.b bVar) {
        this.f4127a = context;
        this.f4128b = bVar;
    }

    public static URL a(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/".concat(str));
        } catch (MalformedURLException e6) {
            throw new f(e6.getMessage());
        }
    }

    public static void b(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String l10;
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, e));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (!TextUtils.isEmpty(str4)) {
            Log.w("Firebase-Installations", str4);
            if (TextUtils.isEmpty(str)) {
                l10 = "";
            } else {
                l10 = ai.onnxruntime.a.l(", ", str);
            }
            Log.w("Firebase-Installations", "Firebase options used while communicating with Firebase server APIs: " + str2 + ", " + str3 + l10);
        }
    }

    public static long d(String str) {
        if (d.matcher(str).matches()) {
            if (str != null && str.length() != 0) {
                return Long.parseLong(str.substring(0, str.length() - 1));
            }
            return 0L;
        }
        i.k("Invalid Expiration Timestamp.");
        return 0L;
    }

    public static a e(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        l a10 = b.a();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        b bVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a10.c = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        a10.d = Long.valueOf(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                b a11 = a10.a();
                jsonReader.endObject();
                bVar = a11;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new a(str, str2, str3, bVar, 1);
    }

    public static b f(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        l a10 = b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a10.c = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                a10.d = Long.valueOf(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        a10.f575b = 1;
        return a10.a();
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.2.0");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.2.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static void i(HttpURLConnection httpURLConnection, byte[] bArr) {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        n0.b.A("Cannot send request to FIS servers. No OutputStream available.");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9 A[Catch: NameNotFoundException -> 0x00c2, TryCatch #2 {NameNotFoundException -> 0x00c2, blocks: (B:8:0x006a, B:10:0x0082, B:17:0x008c, B:21:0x0099, B:23:0x00a9, B:27:0x00c4, B:29:0x00ce, B:31:0x00e7), top: B:7:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4 A[Catch: NameNotFoundException -> 0x00c2, TryCatch #2 {NameNotFoundException -> 0x00c2, blocks: (B:8:0x006a, B:10:0x0082, B:17:0x008c, B:21:0x0099, B:23:0x00a9, B:27:0x00c4, B:29:0x00ce, B:31:0x00e7), top: B:7:0x006a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.HttpURLConnection c(java.net.URL r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.c.c(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }
}
