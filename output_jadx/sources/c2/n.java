package c2;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f501a;

    public n(long j10) {
        this.f501a = j10;
    }

    public static n a(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        return new n(Long.parseLong(jsonReader.nextString()));
                    }
                    return new n(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof n) && this.f501a == ((n) obj).f501a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f501a;
        return ((int) ((j10 >>> 32) ^ j10)) ^ 1000003;
    }

    public final String toString() {
        return ai.onnxruntime.a.n(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f501a, "}");
    }
}
