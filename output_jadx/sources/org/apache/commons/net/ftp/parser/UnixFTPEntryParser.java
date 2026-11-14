package org.apache.commons.net.ftp.parser;

import i7.k;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.commons.net.ftp.FTPClientConfig;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class UnixFTPEntryParser extends ConfigurableFTPFileEntryParserImpl {
    static final String DEFAULT_DATE_FORMAT = "MMM d yyyy";
    private static final String DEFAULT_DATE_FORMAT_CN = "M'月' d yyyy";
    private static final String DEFAULT_DATE_FORMAT_JA = "M'月' d'日' yyyy'年'";
    static final String DEFAULT_RECENT_DATE_FORMAT = "MMM d HH:mm";
    private static final String DEFAULT_RECENT_DATE_FORMAT_CN = "M'月' d HH:mm";
    private static final String DEFAULT_RECENT_DATE_FORMAT_JA = "M'月' d'日' HH:mm";
    private static final String JA_DAY = "日";
    private static final String JA_MONTH = "月";
    private static final String JA_YEAR = "年";
    private static final String REGEX = "([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s*(\\d+)\\s+(?:(\\S+(?:\\s\\S+)*?)\\s+)?(?:(\\S+(?:\\s\\S+)*)\\s+)?(\\d+(?:,\\s*\\d+)?)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3})|(?:\\d{1,2}月\\s+\\d{1,2}日)|(?:\\d{1,2}月\\s+\\d{1,2}))\\s+((?:\\d+(?::\\d+)?)|(?:\\d{4}年))\\s(.*)";
    final boolean trimLeadingSpaces;
    private static final Pattern TOTAL_PATTERN = Pattern.compile("^total \\d+$");
    static final String NUMERIC_DATE_FORMAT = "yyyy-MM-dd HH:mm";
    public static final FTPClientConfig NUMERIC_DATE_CONFIG = new FTPClientConfig(FTPClientConfig.SYST_UNIX, NUMERIC_DATE_FORMAT, null);

    public UnixFTPEntryParser(FTPClientConfig fTPClientConfig, boolean z9) {
        super(REGEX);
        configure(fTPClientConfig);
        this.trimLeadingSpaces = z9;
    }

    public static /* synthetic */ boolean lambda$preParse$0(String str) {
        return TOTAL_PATTERN.matcher(str).matches();
    }

    @Override // org.apache.commons.net.ftp.parser.ConfigurableFTPFileEntryParserImpl
    public FTPClientConfig getDefaultConfiguration() {
        return new FTPClientConfig(FTPClientConfig.SYST_UNIX, "MMM d yyyy", "MMM d HH:mm");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:3|(1:5)|(4:6|7|8|(2:54|(1:59)(1:58))(1:12))|13|(13:15|(11:17|19|(3:21|(2:28|29)(2:25|26)|27)|30|31|(2:46|47)|33|34|35|(2:37|(1:39)(1:42))(1:43)|40)|52|19|(0)|30|31|(0)|33|34|35|(0)(0)|40)|53|19|(0)|30|31|(0)|33|34|35|(0)(0)|40) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.apache.commons.net.ftp.FTPFileEntryParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.apache.commons.net.ftp.FTPFile parseFTPEntry(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.ftp.parser.UnixFTPEntryParser.parseFTPEntry(java.lang.String):org.apache.commons.net.ftp.FTPFile");
    }

    @Override // org.apache.commons.net.ftp.FTPFileEntryParserImpl, org.apache.commons.net.ftp.FTPFileEntryParser
    public List<String> preParse(List<String> list) {
        list.removeIf(new k(6));
        return list;
    }

    public UnixFTPEntryParser(FTPClientConfig fTPClientConfig) {
        this(fTPClientConfig, false);
    }

    public UnixFTPEntryParser() {
        this(null);
    }
}
