package n6;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.smtp.SMTPReply;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d extends h {
    public static final char[] c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();
    public static final int[] d;
    public static final int e;

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f4135a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    public final int[] f4136b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, TypedValues.CycleType.TYPE_WAVE_OFFSET, 420, 418, 404, TypedValues.CycleType.TYPE_VISIBILITY, 394, 360, 356, SMTPReply.START_MAIL_INPUT, 308, 282, 344, FTPReply.NEED_ACCOUNT, 326, 300, 278, NNTPReply.TRANSFER_FAILED, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, NNTPReply.NO_SUCH_ARTICLE_FOUND, 294, 474, 470, 306, FTPReply.FILE_ACTION_PENDING};
        d = iArr;
        e = iArr[47];
    }

    public static void g(CharSequence charSequence, int i10, int i11) {
        int i12 = 0;
        int i13 = 1;
        for (int i14 = i10 - 1; i14 >= 0; i14--) {
            i12 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i14)) * i13;
            i13++;
            if (i13 > i11) {
                i13 = 1;
            }
        }
        if (charSequence.charAt(i10) != c[i12 % 47]) {
            throw z5.c.a();
        }
    }

    public static int h(int[] iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int round = Math.round((iArr[i13] * 9.0f) / i10);
            if (round > 0 && round <= 4) {
                if ((i13 & 1) == 0) {
                    for (int i14 = 0; i14 < round; i14++) {
                        i12 = (i12 << 1) | 1;
                    }
                } else {
                    i12 <<= round;
                }
            } else {
                return -1;
            }
        }
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0132, code lost:
    
        if (r6 < 'X') goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0134, code lost:
    
        if (r6 > 'Z') goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0136, code lost:
    
        r5 = 127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x013d, code lost:
    
        throw z5.e.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x013e, code lost:
    
        if (r6 < 'A') goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0140, code lost:
    
        if (r6 > 'Z') goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0142, code lost:
    
        r6 = r6 - '@';
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x014d, code lost:
    
        throw z5.e.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0152, code lost:
    
        throw z5.e.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0153, code lost:
    
        r2.append(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0159, code lost:
    
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0181, code lost:
    
        return new z5.m(r2.toString(), null, new z5.o[]{new z5.o((r15[1] + r15[0]) / 2.0f, r13), new z5.o((r9 / 2.0f) + r1, r13)}, z5.a.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0184, code lost:
    
        throw z5.i.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0187, code lost:
    
        throw z5.i.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        r5 = n6.d.c[r6];
        r4.append(r5);
        r6 = r2.length;
        r7 = 0;
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r7 >= r6) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        r9 = r9 + r2[r7];
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        r6 = r14.e(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        if (r5 != '*') goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        r4.deleteCharAt(r4.length() - 1);
        r5 = r2.length;
        r7 = 0;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        if (r7 >= r5) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
    
        r9 = r9 + r2[r7];
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        if (r6 == r3) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0087, code lost:
    
        if (r14.d(r6) == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008d, code lost:
    
        if (r4.length() < 2) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        r14 = r4.length();
        g(r4, r14 - 2, 20);
        g(r4, r14 - 1, 15);
        r4.setLength(r4.length() - 2);
        r14 = r4.length();
        r2 = new java.lang.StringBuilder(r14);
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b2, code lost:
    
        if (r3 >= r14) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b4, code lost:
    
        r5 = r4.charAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ba, code lost:
    
        if (r5 < 'a') goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00be, code lost:
    
        if (r5 > 'd') goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c2, code lost:
    
        if (r3 >= (r14 - 1)) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c4, code lost:
    
        r3 = r3 + 1;
        r6 = r4.charAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d0, code lost:
    
        switch(r5) {
            case 97: goto L89;
            case 98: goto L56;
            case 99: goto L49;
            case 100: goto L43;
            default: goto L42;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d3, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0145, code lost:
    
        r2.append(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0156, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d6, code lost:
    
        if (r6 < 'A') goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d8, code lost:
    
        if (r6 > 'Z') goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00da, code lost:
    
        r6 = r6 + ' ';
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00dc, code lost:
    
        r5 = (char) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e3, code lost:
    
        throw z5.e.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e4, code lost:
    
        if (r6 < 'A') goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e6, code lost:
    
        if (r6 > 'O') goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e8, code lost:
    
        r6 = r6 - ' ';
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00eb, code lost:
    
        if (r6 != 'Z') goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ed, code lost:
    
        r5 = ':';
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f4, code lost:
    
        throw z5.e.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f5, code lost:
    
        if (r6 < 'A') goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f9, code lost:
    
        if (r6 > 'E') goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00fb, code lost:
    
        r6 = r6 - '&';
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0100, code lost:
    
        if (r6 < 'F') goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0104, code lost:
    
        if (r6 > 'J') goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0106, code lost:
    
        r6 = r6 - 11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x010b, code lost:
    
        if (r6 < 'K') goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x010d, code lost:
    
        if (r6 > 'O') goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x010f, code lost:
    
        r6 = r6 + 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0114, code lost:
    
        if (r6 < 'P') goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0118, code lost:
    
        if (r6 > 'T') goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x011a, code lost:
    
        r6 = r6 + '+';
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x011f, code lost:
    
        if (r6 != 'U') goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0124, code lost:
    
        if (r6 != 'V') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0126, code lost:
    
        r5 = '@';
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x012b, code lost:
    
        if (r6 != 'W') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x012d, code lost:
    
        r5 = '`';
     */
    @Override // n6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final z5.m b(int r13, f6.a r14, java.util.Map r15) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.d.b(int, f6.a, java.util.Map):z5.m");
    }
}
