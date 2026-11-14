package androidx.core.net;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class ParseException extends RuntimeException {

    @NonNull
    public final String response;

    public ParseException(@NonNull String str) {
        super(str);
        this.response = str;
    }
}
