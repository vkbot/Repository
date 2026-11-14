package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: b, reason: collision with root package name */
    public final n.g f654b;
    public final int c;
    public HttpURLConnection d;
    public InputStream e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f655f;

    public l(n.g gVar, int i10) {
        this.f654b = gVar;
        this.c = i10;
    }

    public static int d(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to get a response code", e);
                return -1;
            }
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        InputStream inputStream = this.e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.d = null;
    }

    @Override // com.bumptech.glide.load.data.e
    public final int c() {
        return 2;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f655f = true;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.h hVar, d dVar) {
        n.g gVar = this.f654b;
        int i10 = c0.j.f437b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                dVar.f(f(gVar.d(), 0, null, gVar.f4015b.a()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + c0.j.a(elapsedRealtimeNanos));
                }
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                dVar.d(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + c0.j.a(elapsedRealtimeNanos));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + c0.j.a(elapsedRealtimeNanos));
            }
            throw th;
        }
    }

    public final InputStream f(URL url, int i10, URL url2, Map map) {
        if (i10 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new com.google.protobuf.l("In re-direct loop", -1, null);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            int i11 = this.c;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpURLConnection.setConnectTimeout(i11);
                httpURLConnection.setReadTimeout(i11);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.d = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.e = this.d.getInputStream();
                    if (this.f655f) {
                        return null;
                    }
                    int d = d(this.d);
                    int i12 = d / 100;
                    if (i12 == 2) {
                        HttpURLConnection httpURLConnection2 = this.d;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                this.e = new c0.d(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                                }
                                this.e = httpURLConnection2.getInputStream();
                            }
                            return this.e;
                        } catch (IOException e) {
                            throw new com.google.protobuf.l("Failed to obtain InputStream", d(httpURLConnection2), e);
                        }
                    }
                    if (i12 == 3) {
                        String headerField = this.d.getHeaderField("Location");
                        if (!TextUtils.isEmpty(headerField)) {
                            try {
                                URL url3 = new URL(url, headerField);
                                b();
                                return f(url3, i10 + 1, url, map);
                            } catch (MalformedURLException e6) {
                                throw new com.google.protobuf.l(ai.onnxruntime.a.l("Bad redirect url: ", headerField), d, e6);
                            }
                        }
                        throw new com.google.protobuf.l("Received empty or null redirect url", d, null);
                    }
                    if (d == -1) {
                        throw new com.google.protobuf.l("Http request failed", d, null);
                    }
                    try {
                        throw new com.google.protobuf.l(this.d.getResponseMessage(), d, null);
                    } catch (IOException e10) {
                        throw new com.google.protobuf.l("Failed to get a response message", d, e10);
                    }
                } catch (IOException e11) {
                    throw new com.google.protobuf.l("Failed to connect or obtain data", d(this.d), e11);
                }
            } catch (IOException e12) {
                throw new com.google.protobuf.l("URL.openConnection threw", 0, e12);
            }
        }
        throw new com.google.protobuf.l("Too many (> 5) redirects!", -1, null);
    }
}
