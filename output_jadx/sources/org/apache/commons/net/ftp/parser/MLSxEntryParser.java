package org.apache.commons.net.ftp.parser;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.TimeZone;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPFileEntryParserImpl;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class MLSxEntryParser extends FTPFileEntryParserImpl {
    private static final MLSxEntryParser INSTANCE = new MLSxEntryParser();
    private static final HashMap<String, Integer> TYPE_TO_INT;
    private static final int[] UNIX_GROUPS;
    private static final int[][] UNIX_PERMS;

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        TYPE_TO_INT = hashMap;
        hashMap.put("file", 0);
        hashMap.put("cdir", 1);
        hashMap.put("pdir", 1);
        hashMap.put("dir", 1);
        UNIX_GROUPS = new int[]{0, 1, 2};
        UNIX_PERMS = new int[][]{new int[0], new int[]{2}, new int[]{1}, new int[]{2, 1}, new int[]{0}, new int[]{0, 2}, new int[]{0, 1}, new int[]{0, 1, 2}};
    }

    @Deprecated
    public MLSxEntryParser() {
    }

    private void doUnixPerms(FTPFile fTPFile, String str) {
        for (char c : str.toCharArray()) {
            if (c != 'a') {
                if (c != 'p') {
                    if (c != 'r') {
                        if (c != 'w') {
                            if (c != 'l') {
                                if (c != 'm') {
                                    switch (c) {
                                        case 'c':
                                            fTPFile.setPermission(0, 1, true);
                                            break;
                                        case 'd':
                                            fTPFile.setPermission(0, 1, true);
                                            break;
                                        case TypedValues.TYPE_TARGET /* 101 */:
                                            fTPFile.setPermission(0, 0, true);
                                            break;
                                    }
                                } else {
                                    fTPFile.setPermission(0, 1, true);
                                }
                            } else {
                                fTPFile.setPermission(0, 2, true);
                            }
                        } else {
                            fTPFile.setPermission(0, 1, true);
                        }
                    } else {
                        fTPFile.setPermission(0, 0, true);
                    }
                } else {
                    fTPFile.setPermission(0, 1, true);
                }
            } else {
                fTPFile.setPermission(0, 1, true);
            }
        }
    }

    public static MLSxEntryParser getInstance() {
        return INSTANCE;
    }

    public static FTPFile parseEntry(String str) {
        return INSTANCE.parseFTPEntry(str);
    }

    public static Calendar parseGMTdateTime(String str) {
        SimpleDateFormat simpleDateFormat;
        boolean z9;
        if (str.contains(".")) {
            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
            z9 = true;
        } else {
            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            z9 = false;
        }
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        simpleDateFormat.setTimeZone(timeZone);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        ParsePosition parsePosition = new ParsePosition(0);
        simpleDateFormat.setLenient(false);
        Date parse = simpleDateFormat.parse(str, parsePosition);
        if (parsePosition.getIndex() != str.length()) {
            return null;
        }
        gregorianCalendar.setTime(parse);
        if (!z9) {
            gregorianCalendar.clear(14);
        }
        return gregorianCalendar;
    }

    public static Instant parseGmtInstant(String str) {
        Instant instant;
        instant = parseGMTdateTime(str).toInstant();
        return instant;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0106, code lost:
    
        switch(r11) {
            case 0: goto L66;
            case 1: goto L65;
            case 2: goto L64;
            default: goto L63;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0109, code lost:
    
        r17 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010c, code lost:
    
        r8.setUser(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0110, code lost:
    
        r8.setGroup(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0114, code lost:
    
        r10 = r9.length() - 3;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011a, code lost:
    
        if (r11 >= 3) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011c, code lost:
    
        r12 = r9.charAt(r10 + r11) - '0';
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0124, code lost:
    
        if (r12 < 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0127, code lost:
    
        if (r12 > 7) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0129, code lost:
    
        r12 = org.apache.commons.net.ftp.parser.MLSxEntryParser.UNIX_PERMS[r12];
        r13 = r12.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012f, code lost:
    
        if (r14 >= r13) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0131, code lost:
    
        r8.setPermission(org.apache.commons.net.ftp.parser.MLSxEntryParser.UNIX_GROUPS[r11], r12[r14], true);
        r14 = r14 + 1;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0142, code lost:
    
        r11 = r11 + 1;
        r3 = r3;
     */
    @Override // org.apache.commons.net.ftp.FTPFileEntryParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.apache.commons.net.ftp.FTPFile parseFTPEntry(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.ftp.parser.MLSxEntryParser.parseFTPEntry(java.lang.String):org.apache.commons.net.ftp.FTPFile");
    }
}
