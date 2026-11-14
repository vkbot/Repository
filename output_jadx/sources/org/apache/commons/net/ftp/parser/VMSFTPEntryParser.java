package org.apache.commons.net.ftp.parser;

import java.io.BufferedReader;
import java.io.InputStream;
import java.text.ParseException;
import java.util.StringTokenizer;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPListParseEngine;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class VMSFTPEntryParser extends ConfigurableFTPFileEntryParserImpl {
    private static final String DEFAULT_DATE_FORMAT = "d-MMM-yyyy HH:mm:ss";
    private static final String REGEX = "(.*?;[0-9]+)\\s*(\\d+)(?:/\\d+)?\\s*(\\S+)\\s+(\\S+)\\s+\\[(([0-9$A-Za-z_]+)|([0-9$A-Za-z_]+),([0-9$a-zA-Z_]+))\\]?\\s*\\([a-zA-Z]*,([a-zA-Z]*),([a-zA-Z]*),([a-zA-Z]*)\\)";

    public VMSFTPEntryParser(FTPClientConfig fTPClientConfig) {
        super(REGEX);
        configure(fTPClientConfig);
    }

    @Override // org.apache.commons.net.ftp.parser.ConfigurableFTPFileEntryParserImpl
    public FTPClientConfig getDefaultConfiguration() {
        return new FTPClientConfig(FTPClientConfig.SYST_VMS, DEFAULT_DATE_FORMAT, null);
    }

    public boolean isVersioning() {
        return false;
    }

    @Override // org.apache.commons.net.ftp.FTPFileEntryParser
    public FTPFile parseFTPEntry(String str) {
        String nextToken;
        boolean z9;
        boolean z10;
        boolean z11;
        String str2 = null;
        if (!matches(str)) {
            return null;
        }
        FTPFile fTPFile = new FTPFile();
        fTPFile.setRawListing(str);
        String group = group(1);
        String group2 = group(2);
        String str3 = group(3) + " " + group(4);
        String group3 = group(5);
        String[] strArr = {group(9), group(10), group(11)};
        try {
            fTPFile.setTimestamp(super.parseTimestamp(str3));
        } catch (ParseException unused) {
        }
        StringTokenizer stringTokenizer = new StringTokenizer(group3, ",");
        int countTokens = stringTokenizer.countTokens();
        if (countTokens != 1) {
            if (countTokens != 2) {
                nextToken = null;
            } else {
                str2 = stringTokenizer.nextToken();
                nextToken = stringTokenizer.nextToken();
            }
        } else {
            nextToken = stringTokenizer.nextToken();
        }
        if (group.lastIndexOf(".DIR") != -1) {
            fTPFile.setType(1);
        } else {
            fTPFile.setType(0);
        }
        if (!isVersioning()) {
            group = group.substring(0, group.lastIndexOf(59));
        }
        fTPFile.setName(group);
        fTPFile.setSize(Long.parseLong(group2) * 512);
        fTPFile.setGroup(str2);
        fTPFile.setUser(nextToken);
        for (int i10 = 0; i10 < 3; i10++) {
            String str4 = strArr[i10];
            if (str4.indexOf(82) >= 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            fTPFile.setPermission(i10, 0, z9);
            if (str4.indexOf(87) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            fTPFile.setPermission(i10, 1, z10);
            if (str4.indexOf(69) >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            fTPFile.setPermission(i10, 2, z11);
        }
        return fTPFile;
    }

    @Deprecated
    public FTPFile[] parseFileList(InputStream inputStream) {
        FTPListParseEngine fTPListParseEngine = new FTPListParseEngine(this);
        fTPListParseEngine.readServerList(inputStream, null);
        return fTPListParseEngine.getFiles();
    }

    @Override // org.apache.commons.net.ftp.FTPFileEntryParserImpl, org.apache.commons.net.ftp.FTPFileEntryParser
    public String readNextEntry(BufferedReader bufferedReader) {
        String readLine = bufferedReader.readLine();
        StringBuilder sb = new StringBuilder();
        while (readLine != null) {
            if (!readLine.startsWith("Directory") && !readLine.startsWith("Total")) {
                sb.append(readLine);
                if (readLine.trim().endsWith(")")) {
                    break;
                }
                readLine = bufferedReader.readLine();
            } else {
                readLine = bufferedReader.readLine();
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    public VMSFTPEntryParser() {
        this(null);
    }
}
