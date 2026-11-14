package e0;

import java.util.concurrent.TimeUnit;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f1893a = new OkHttpClient.Builder().addInterceptor(new Object()).connectionPool(new ConnectionPool(10, 5, TimeUnit.MINUTES)).retryOnConnectionFailure(true).build();
}
