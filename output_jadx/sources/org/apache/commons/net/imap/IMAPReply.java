package org.apache.commons.net.imap;

import ai.onnxruntime.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.net.MalformedServerReplyException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class IMAPReply {
    public static final int BAD = 2;
    public static final int CONT = 3;
    private static final String IMAP_BAD = "BAD";
    private static final String IMAP_CONTINUATION_PREFIX = "+";
    private static final String IMAP_NO = "NO";
    private static final String IMAP_OK = "OK";
    private static final String IMAP_UNTAGGED_PREFIX = "* ";
    public static final int NO = 1;
    public static final int OK = 0;
    public static final int PARTIAL = 3;
    private static final String TAGGED_RESPONSE = "^\\w{1,80} (\\S{1,80}).{0,500}";
    private static final Pattern TAGGED_PATTERN = Pattern.compile(TAGGED_RESPONSE);
    private static final String UNTAGGED_RESPONSE = "^\\* (\\S{1,80}).{0,500}";
    private static final Pattern UNTAGGED_PATTERN = Pattern.compile(UNTAGGED_RESPONSE);
    private static final Pattern LITERAL_PATTERN = Pattern.compile("\\{(\\d+)\\}$");

    private IMAPReply() {
    }

    private static int getReplyCode(String str, Pattern pattern) {
        if (isContinuation(str)) {
            return 3;
        }
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            char c = 65535;
            switch (group.hashCode()) {
                case 2497:
                    if (group.equals(IMAP_NO)) {
                        c = 0;
                        break;
                    }
                    break;
                case 2524:
                    if (group.equals(IMAP_OK)) {
                        c = 1;
                        break;
                    }
                    break;
                case 65509:
                    if (group.equals(IMAP_BAD)) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return 1;
                case 1:
                    return 0;
                case 2:
                    return 2;
            }
        }
        throw new MalformedServerReplyException(a.m("Received unexpected IMAP protocol response from server: '", str, "'."));
    }

    public static int getUntaggedReplyCode(String str) {
        return getReplyCode(str, UNTAGGED_PATTERN);
    }

    public static boolean isContinuation(int i10) {
        if (i10 == 3) {
            return true;
        }
        return false;
    }

    public static boolean isSuccess(int i10) {
        if (i10 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isUntagged(String str) {
        return str.startsWith(IMAP_UNTAGGED_PREFIX);
    }

    public static int literalCount(String str) {
        Matcher matcher = LITERAL_PATTERN.matcher(str);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        return -1;
    }

    public static boolean isContinuation(String str) {
        return str.startsWith(IMAP_CONTINUATION_PREFIX);
    }

    public static int getReplyCode(String str) {
        return getReplyCode(str, TAGGED_PATTERN);
    }
}
