package org.apache.commons.net.io;

import java.io.BufferedReader;
import java.io.Reader;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class CRLFLineReader extends BufferedReader {
    private static final char CR = '\r';
    private static final char LF = '\n';

    public CRLFLineReader(Reader reader) {
        super(reader);
    }

    @Override // java.io.BufferedReader
    public String readLine() {
        StringBuilder sb = new StringBuilder();
        synchronized (((BufferedReader) this).lock) {
            boolean z9 = false;
            while (true) {
                try {
                    int read = read();
                    if (read != -1) {
                        if (z9 && read == 10) {
                            return sb.substring(0, sb.length() - 1);
                        }
                        if (read == 13) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        sb.append((char) read);
                    } else {
                        String sb2 = sb.toString();
                        if (sb2.isEmpty()) {
                            return null;
                        }
                        return sb2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
