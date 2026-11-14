package org.apache.commons.net.ftp;

import i7.c;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.io.Charsets;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class FTPListParseEngine {
    private static final FTPFile[] EMPTY_FTP_FILE_ARRAY = new FTPFile[0];
    private List<String> entries;
    private ListIterator<String> internalIterator;
    private final FTPFileEntryParser parser;
    private final boolean saveUnparseableEntries;

    public FTPListParseEngine(FTPFileEntryParser fTPFileEntryParser, FTPClientConfig fTPClientConfig) {
        boolean z9;
        LinkedList linkedList = new LinkedList();
        this.entries = linkedList;
        this.internalIterator = linkedList.listIterator();
        this.parser = fTPFileEntryParser;
        if (fTPClientConfig != null && fTPClientConfig.getUnparseableEntries()) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.saveUnparseableEntries = z9;
    }

    public /* synthetic */ FTPFile lambda$getFileList$0(String str) {
        FTPFile parseFTPEntry = this.parser.parseFTPEntry(str);
        if (parseFTPEntry == null && this.saveUnparseableEntries) {
            return new FTPFile(str);
        }
        return parseFTPEntry;
    }

    private void read(InputStream inputStream, String str) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.toCharset(str)));
        try {
            String readNextEntry = this.parser.readNextEntry(bufferedReader);
            while (readNextEntry != null) {
                this.entries.add(readNextEntry);
                readNextEntry = this.parser.readNextEntry(bufferedReader);
            }
            bufferedReader.close();
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public List<FTPFile> getFileList(FTPFileFilter fTPFileFilter) {
        Stream<R> map = this.entries.stream().map(new org.apache.commons.io.output.a(3, this));
        Objects.requireNonNull(fTPFileFilter);
        return (List) map.filter(new c(8, fTPFileFilter)).collect(Collectors.toList());
    }

    public FTPFile[] getFiles(FTPFileFilter fTPFileFilter) {
        return (FTPFile[]) getFileList(fTPFileFilter).toArray(EMPTY_FTP_FILE_ARRAY);
    }

    public FTPFile[] getNext(int i10) {
        LinkedList linkedList = new LinkedList();
        while (i10 > 0 && this.internalIterator.hasNext()) {
            String next = this.internalIterator.next();
            FTPFile parseFTPEntry = this.parser.parseFTPEntry(next);
            if (parseFTPEntry == null && this.saveUnparseableEntries) {
                parseFTPEntry = new FTPFile(next);
            }
            linkedList.add(parseFTPEntry);
            i10--;
        }
        return (FTPFile[]) linkedList.toArray(EMPTY_FTP_FILE_ARRAY);
    }

    public FTPFile[] getPrevious(int i10) {
        LinkedList linkedList = new LinkedList();
        while (i10 > 0 && this.internalIterator.hasPrevious()) {
            String previous = this.internalIterator.previous();
            FTPFile parseFTPEntry = this.parser.parseFTPEntry(previous);
            if (parseFTPEntry == null && this.saveUnparseableEntries) {
                parseFTPEntry = new FTPFile(previous);
            }
            linkedList.add(0, parseFTPEntry);
            i10--;
        }
        return (FTPFile[]) linkedList.toArray(EMPTY_FTP_FILE_ARRAY);
    }

    public boolean hasNext() {
        return this.internalIterator.hasNext();
    }

    public boolean hasPrevious() {
        return this.internalIterator.hasPrevious();
    }

    public void readServerList(InputStream inputStream, String str) {
        this.entries = new LinkedList();
        read(inputStream, str);
        this.parser.preParse(this.entries);
        resetIterator();
    }

    public void resetIterator() {
        this.internalIterator = this.entries.listIterator();
    }

    public FTPFile[] getFiles() {
        return getFiles(FTPFileFilters.NON_NULL);
    }

    @Deprecated
    public void readServerList(InputStream inputStream) {
        readServerList(inputStream, null);
    }

    public FTPListParseEngine(FTPFileEntryParser fTPFileEntryParser) {
        this(fTPFileEntryParser, null);
    }
}
