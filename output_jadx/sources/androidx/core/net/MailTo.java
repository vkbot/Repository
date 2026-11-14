package androidx.core.net;

import ai.onnxruntime.a;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.text.Typography;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class MailTo {
    private static final String BCC = "bcc";
    private static final String BODY = "body";
    private static final String CC = "cc";
    private static final String MAILTO = "mailto";
    public static final String MAILTO_SCHEME = "mailto:";
    private static final String SUBJECT = "subject";
    private static final String TO = "to";
    private HashMap<String, String> mHeaders = new HashMap<>();

    private MailTo() {
    }

    public static boolean isMailTo(@Nullable Uri uri) {
        if (uri != null && MAILTO.equals(uri.getScheme())) {
            return true;
        }
        return false;
    }

    @NonNull
    public static MailTo parse(@NonNull String str) {
        String decode;
        String substring;
        String str2;
        Preconditions.checkNotNull(str);
        if (isMailTo(str)) {
            int indexOf = str.indexOf(35);
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            int indexOf2 = str.indexOf(63);
            if (indexOf2 == -1) {
                decode = Uri.decode(str.substring(7));
                substring = null;
            } else {
                decode = Uri.decode(str.substring(7, indexOf2));
                substring = str.substring(indexOf2 + 1);
            }
            MailTo mailTo = new MailTo();
            if (substring != null) {
                for (String str3 : substring.split("&")) {
                    String[] split = str3.split("=", 2);
                    if (split.length != 0) {
                        String lowerCase = Uri.decode(split[0]).toLowerCase(Locale.ROOT);
                        if (split.length > 1) {
                            str2 = Uri.decode(split[1]);
                        } else {
                            str2 = null;
                        }
                        mailTo.mHeaders.put(lowerCase, str2);
                    }
                }
            }
            String to = mailTo.getTo();
            if (to != null) {
                decode = a.D(decode, ", ", to);
            }
            mailTo.mHeaders.put("to", decode);
            return mailTo;
        }
        throw new ParseException("Not a mailto scheme");
    }

    @Nullable
    public String getBcc() {
        return this.mHeaders.get(BCC);
    }

    @Nullable
    public String getBody() {
        return this.mHeaders.get(BODY);
    }

    @Nullable
    public String getCc() {
        return this.mHeaders.get(CC);
    }

    @Nullable
    public Map<String, String> getHeaders() {
        return this.mHeaders;
    }

    @Nullable
    public String getSubject() {
        return this.mHeaders.get(SUBJECT);
    }

    @Nullable
    public String getTo() {
        return this.mHeaders.get("to");
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("mailto:?");
        for (Map.Entry<String, String> entry : this.mHeaders.entrySet()) {
            sb.append(Uri.encode(entry.getKey()));
            sb.append('=');
            sb.append(Uri.encode(entry.getValue()));
            sb.append(Typography.amp);
        }
        return sb.toString();
    }

    public static boolean isMailTo(@Nullable String str) {
        return str != null && str.startsWith(MAILTO_SCHEME);
    }

    @NonNull
    public static MailTo parse(@NonNull Uri uri) {
        return parse(uri.toString());
    }
}
