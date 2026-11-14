package org.apache.commons.net.ftp.parser;

import java.text.ParseException;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFile;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class OS2FTPEntryParser extends ConfigurableFTPFileEntryParserImpl {
    private static final String DEFAULT_DATE_FORMAT = "MM-dd-yy HH:mm";
    private static final String REGEX = "\\s*([0-9]+)\\s*(\\s+|[A-Z]+)\\s*(DIR|\\s+)\\s*(\\S+)\\s+(\\S+)\\s+(\\S.*)";

    public OS2FTPEntryParser(FTPClientConfig fTPClientConfig) {
        super(REGEX);
        configure(fTPClientConfig);
    }

    @Override // org.apache.commons.net.ftp.parser.ConfigurableFTPFileEntryParserImpl
    public FTPClientConfig getDefaultConfiguration() {
        return new FTPClientConfig(FTPClientConfig.SYST_OS2, DEFAULT_DATE_FORMAT, null);
    }

    @Override // org.apache.commons.net.ftp.FTPFileEntryParser
    public FTPFile parseFTPEntry(String str) {
        FTPFile fTPFile = new FTPFile();
        if (matches(str)) {
            String group = group(1);
            String group2 = group(2);
            String group3 = group(3);
            String str2 = group(4) + " " + group(5);
            String group4 = group(6);
            try {
                fTPFile.setTimestamp(super.parseTimestamp(str2));
            } catch (ParseException unused) {
            }
            if (!group3.trim().equals("DIR") && !group2.trim().equals("DIR")) {
                fTPFile.setType(0);
            } else {
                fTPFile.setType(1);
            }
            fTPFile.setName(group4.trim());
            fTPFile.setSize(Long.parseLong(group.trim()));
            return fTPFile;
        }
        return null;
    }

    public OS2FTPEntryParser() {
        this(null);
    }
}
