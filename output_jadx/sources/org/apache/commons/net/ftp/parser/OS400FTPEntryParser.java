package org.apache.commons.net.ftp.parser;

import java.io.File;
import java.text.ParseException;
import java.util.Locale;
import org.apache.commons.io.IOUtils;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFile;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class OS400FTPEntryParser extends ConfigurableFTPFileEntryParserImpl {
    private static final String DEFAULT_DATE_FORMAT = "yy/MM/dd HH:mm:ss";
    private static final String REGEX = "(\\S+)\\s+(?:(\\d+)\\s+)?(?:(\\S+)\\s+(\\S+)\\s+)?(\\*STMF|\\*DIR|\\*FILE|\\*MEM)\\s+((\\S+\\s*)+)?";

    public OS400FTPEntryParser(FTPClientConfig fTPClientConfig) {
        super(REGEX);
        configure(fTPClientConfig);
    }

    private boolean isNullOrEmpty(String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // org.apache.commons.net.ftp.parser.ConfigurableFTPFileEntryParserImpl
    public FTPClientConfig getDefaultConfiguration() {
        return new FTPClientConfig(FTPClientConfig.SYST_OS400, DEFAULT_DATE_FORMAT, null);
    }

    @Override // org.apache.commons.net.ftp.FTPFileEntryParser
    public FTPFile parseFTPEntry(String str) {
        String str2;
        int i10;
        int lastIndexOf;
        FTPFile fTPFile = new FTPFile();
        fTPFile.setRawListing(str);
        if (!matches(str)) {
            return null;
        }
        String group = group(1);
        String group2 = group(2);
        int i11 = 3;
        if (isNullOrEmpty(group(3)) && isNullOrEmpty(group(4))) {
            str2 = "";
        } else {
            str2 = group(3) + " " + group(4);
        }
        String group3 = group(5);
        String group4 = group(6);
        try {
            fTPFile.setTimestamp(super.parseTimestamp(str2));
        } catch (ParseException unused) {
        }
        if (group3.equalsIgnoreCase("*STMF")) {
            if (isNullOrEmpty(group2) || isNullOrEmpty(group4)) {
                return null;
            }
            i10 = 1;
            i11 = 0;
        } else {
            if (group3.equalsIgnoreCase("*DIR")) {
                if (isNullOrEmpty(group2) || isNullOrEmpty(group4)) {
                    return null;
                }
                i10 = 1;
            } else {
                if (group3.equalsIgnoreCase("*FILE")) {
                    if (group4 == null || !group4.toUpperCase(Locale.ROOT).endsWith(".SAVF")) {
                        return null;
                    }
                } else if (group3.equalsIgnoreCase("*MEM")) {
                    if (isNullOrEmpty(group4) || !isNullOrEmpty(group2) || !isNullOrEmpty(str2)) {
                        return null;
                    }
                    group4 = group4.replace(IOUtils.DIR_SEPARATOR_UNIX, File.separatorChar);
                } else {
                    i10 = 1;
                }
                i10 = 0;
            }
            i11 = i10;
        }
        fTPFile.setType(i11);
        fTPFile.setUser(group);
        try {
            fTPFile.setSize(Long.parseLong(group2));
        } catch (NumberFormatException unused2) {
        }
        if (group4.endsWith("/")) {
            group4 = group4.substring(0, group4.length() - 1);
        }
        if (i10 != 0 && (lastIndexOf = group4.lastIndexOf(47)) > -1) {
            group4 = group4.substring(lastIndexOf + 1);
        }
        fTPFile.setName(group4);
        return fTPFile;
    }

    public OS400FTPEntryParser() {
        this(null);
    }
}
