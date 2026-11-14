package org.apache.commons.io;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Deprecated
/* loaded from: classes2.dex */
public class CopyUtils {
    @Deprecated
    public CopyUtils() {
    }

    public static int copy(Reader reader, Writer writer) {
        IOUtils.ScratchChars scratchChars = IOUtils.ScratchChars.get();
        try {
            char[] array = scratchChars.array();
            int i10 = 0;
            while (true) {
                int read = reader.read(array);
                if (-1 != read) {
                    writer.write(array, 0, read);
                    i10 += read;
                } else {
                    scratchChars.close();
                    return i10;
                }
            }
        } catch (Throwable th) {
            if (scratchChars != null) {
                try {
                    scratchChars.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Deprecated
    public static void copy(byte[] bArr, Writer writer) {
        copy(new ByteArrayInputStream(bArr), writer);
    }

    public static void copy(byte[] bArr, Writer writer, String str) {
        copy(new ByteArrayInputStream(bArr), writer, str);
    }

    public static int copy(InputStream inputStream, OutputStream outputStream) {
        byte[] byteArray = IOUtils.byteArray();
        int i10 = 0;
        while (true) {
            int read = inputStream.read(byteArray);
            if (-1 == read) {
                return i10;
            }
            outputStream.write(byteArray, 0, read);
            i10 += read;
        }
    }

    @Deprecated
    public static void copy(InputStream inputStream, Writer writer) {
        copy(new InputStreamReader(inputStream, Charset.defaultCharset()), writer);
    }

    public static void copy(InputStream inputStream, Writer writer, String str) {
        copy(new InputStreamReader(inputStream, str), writer);
    }

    @Deprecated
    public static void copy(Reader reader, OutputStream outputStream) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charset.defaultCharset());
        copy(reader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void copy(Reader reader, OutputStream outputStream, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, str);
        copy(reader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void copy(byte[] bArr, OutputStream outputStream) {
        outputStream.write(bArr);
    }

    @Deprecated
    public static void copy(String str, OutputStream outputStream) {
        StringReader stringReader = new StringReader(str);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charset.defaultCharset());
        copy(stringReader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void copy(String str, OutputStream outputStream, String str2) {
        StringReader stringReader = new StringReader(str);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, str2);
        copy(stringReader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void copy(String str, Writer writer) {
        writer.write(str);
    }
}
