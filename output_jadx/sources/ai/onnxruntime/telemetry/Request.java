package ai.onnxruntime.telemetry;

import ai.onnxruntime.telemetry.HttpClientRequest;
import androidx.annotation.NonNull;
import java.io.BufferedInputStream;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
class Request implements HttpClientRequest {
    private byte[] m_body;
    private HttpURLConnection m_connection;
    private final HttpClient m_parent;
    private String m_request_id;

    public Request(@NonNull HttpClient httpClient, String str, String str2, byte[] bArr, String str3, @NonNull HttpClientRequest.Headers headers) {
        this.m_parent = httpClient;
        HttpURLConnection httpURLConnection = (HttpURLConnection) httpClient.newUrl(str).openConnection();
        this.m_connection = httpURLConnection;
        httpURLConnection.setRequestMethod(str2);
        this.m_body = bArr;
        if (bArr.length > 0) {
            this.m_connection.setFixedLengthStreamingMode(bArr.length);
            this.m_connection.setDoOutput(true);
        }
        this.m_request_id = str3;
        while (headers.hasNext()) {
            HttpClientRequest.HeaderEntry next = headers.next();
            this.m_connection.setRequestProperty(next.key, next.value);
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public void run() {
        int i10;
        String[] strArr;
        BufferedInputStream bufferedInputStream;
        int i11 = 0;
        String[] strArr2 = new String[0];
        byte[] bArr = new byte[0];
        try {
            try {
                if (this.m_body.length > 0) {
                    this.m_connection.getOutputStream().write(this.m_body);
                }
                i10 = this.m_connection.getResponseCode();
                try {
                    Map<String, List<String>> headerFields = this.m_connection.getHeaderFields();
                    Vector vector = new Vector();
                    for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                        if (entry.getKey() != null) {
                            for (String str : entry.getValue()) {
                                vector.add(entry.getKey());
                                vector.add(str);
                            }
                        }
                    }
                    strArr = (String[]) vector.toArray(strArr2);
                    try {
                        if (i10 >= 300) {
                            bufferedInputStream = new BufferedInputStream(this.m_connection.getErrorStream());
                        } else {
                            bufferedInputStream = new BufferedInputStream(this.m_connection.getInputStream());
                        }
                        byte[] bArr2 = new byte[1024];
                        Vector vector2 = new Vector();
                        int i12 = 0;
                        while (true) {
                            int read = bufferedInputStream.read(bArr2, 0, 1024);
                            if (read < 0) {
                                break;
                            } else if (read > 0) {
                                vector2.add(Arrays.copyOfRange(bArr2, 0, read));
                                i12 += read;
                            }
                        }
                        bArr = new byte[i12];
                        Iterator it = vector2.iterator();
                        int i13 = 0;
                        while (it.hasNext()) {
                            for (byte b10 : (byte[]) it.next()) {
                                bArr[i13] = b10;
                                i13++;
                            }
                        }
                        this.m_connection.disconnect();
                    } catch (Exception unused) {
                        i11 = i10;
                        strArr2 = strArr;
                        this.m_connection.disconnect();
                        i10 = i11;
                        strArr = strArr2;
                        this.m_parent.dispatchCallback(this.m_request_id, i10, strArr, bArr);
                    }
                } catch (Exception unused2) {
                    i11 = i10;
                }
            } catch (Throwable th) {
                this.m_connection.disconnect();
                throw th;
            }
        } catch (Exception unused3) {
        }
        this.m_parent.dispatchCallback(this.m_request_id, i10, strArr, bArr);
    }
}
