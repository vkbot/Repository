package com.example.navistart.cores;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class LogcatRule {
    private static final String STORAGE_PREFIX = "logcat-rule:v1:";
    private final String message;
    private final String tag;
    private static final Pattern LOGCAT_TIME_PREFIX = Pattern.compile("^(?:(?:\\d{2}-\\d{2}|\\d{4}-\\d{2}-\\d{2})\\s+)?\\d{2}:\\d{2}:\\d{2}(?:[.,]\\d+)?\\s+");
    private static final Pattern BRACKET_TIME_PREFIX = Pattern.compile("^\\[\\d{2}:\\d{2}:\\d{2}(?:[.,]\\d+)?]\\s*");
    private static final Pattern THREADTIME_LINE = Pattern.compile("^(?:\\d+\\s+){2}[VDIWEAF]\\s+([^:]+):\\s*(.+)$");
    private static final Pattern BRIEF_LINE = Pattern.compile("^[VDIWEAF]/([^\\r\\n(]+?)\\s*\\(\\s*\\d+\\s*\\)\\s*:\\s*(.+)$");
    private static final Pattern TAG_LINE = Pattern.compile("^(?:[VDIWEAF]\\s+)?([^:]+):\\s*(.+)$");

    public LogcatRule(String str, String str2) {
        String trim;
        if (str == null) {
            trim = "";
        } else {
            trim = str.trim();
        }
        this.tag = trim;
        this.message = str2 != null ? str2.trim() : "";
    }

    public static LogcatRule fromStorageValue(String str) {
        int indexOf;
        if (str == null || !str.startsWith(STORAGE_PREFIX) || (indexOf = str.indexOf(58, 15)) < 0) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str.substring(15, indexOf));
            int i10 = indexOf + 1;
            int i11 = i10 + parseInt;
            if (parseInt >= 0 && i11 <= str.length()) {
                LogcatRule logcatRule = new LogcatRule(str.substring(i10, i11), str.substring(i11));
                if (logcatRule.isValid()) {
                    return logcatRule;
                }
            }
        } catch (RuntimeException unused) {
        }
        return null;
    }

    public static LogcatRule parseCapturedLine(String str) {
        String replaceFirst;
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        while (true) {
            replaceFirst = BRACKET_TIME_PREFIX.matcher(LOGCAT_TIME_PREFIX.matcher(trim).replaceFirst("")).replaceFirst("");
            if (trim.equals(replaceFirst)) {
                break;
            }
            trim = replaceFirst;
        }
        Matcher matcher = THREADTIME_LINE.matcher(replaceFirst);
        if (matcher.matches()) {
            return validRule(matcher.group(1), matcher.group(2));
        }
        Matcher matcher2 = BRIEF_LINE.matcher(replaceFirst);
        if (matcher2.matches()) {
            return validRule(matcher2.group(1), matcher2.group(2));
        }
        Matcher matcher3 = TAG_LINE.matcher(replaceFirst);
        if (matcher3.matches()) {
            return validRule(matcher3.group(1), matcher3.group(2));
        }
        return validRule("", replaceFirst);
    }

    private static LogcatRule validRule(String str, String str2) {
        LogcatRule logcatRule = new LogcatRule(str, str2);
        if (logcatRule.isValid()) {
            return logcatRule;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogcatRule)) {
            return false;
        }
        LogcatRule logcatRule = (LogcatRule) obj;
        if (this.tag.equals(logcatRule.tag) && this.message.equals(logcatRule.message)) {
            return true;
        }
        return false;
    }

    public String getMessage() {
        return this.message;
    }

    public String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return Objects.hash(this.tag, this.message);
    }

    public boolean isValid() {
        return !this.message.isEmpty();
    }

    public String toDisplayValue() {
        if (this.tag.isEmpty()) {
            return this.message;
        }
        return this.tag + ": " + this.message;
    }

    public String toStorageValue() {
        return STORAGE_PREFIX + this.tag.length() + ":" + this.tag + this.message;
    }
}
