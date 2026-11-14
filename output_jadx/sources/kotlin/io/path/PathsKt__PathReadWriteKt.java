package kotlin.io.path;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0087\b¢\u0006\u0002\u0010\b\u001a:\u0010\t\u001a\u00020\n*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0087\b¢\u0006\u0002\u0010\r\u001a0\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0087\b¢\u0006\u0002\u0010\u0010\u001a:\u0010\u0011\u001a\u00020\u0012*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0087\b¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0015*\u00020\u0002H\u0087\b\u001a.\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00152\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0087\b¢\u0006\u0002\u0010\u0019\u001a\u0015\u0010\u001a\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0015H\u0087\b\u001a\u0016\u0010\u001b\u001a\u00020\u001c*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007\u001a7\u0010\u001d\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0007¢\u0006\u0002\u0010 \u001a\u001e\u0010!\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007\u001a=\u0010\"\u001a\u00020\u0017*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042!\u0010#\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u00170$H\u0087\bø\u0001\u0000\u001a&\u0010(\u001a\u00020)*\u00020\u00022\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0087\b¢\u0006\u0002\u0010*\u001a&\u0010+\u001a\u00020,*\u00020\u00022\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0087\b¢\u0006\u0002\u0010-\u001a\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0/*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001aL\u00100\u001a\u0002H1\"\u0004\b\u0000\u00101*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0018\u00102\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c03\u0012\u0004\u0012\u0002H10$H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u00104\u001a>\u00105\u001a\u00020\u0002*\u00020\u00022\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001f072\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0087\b¢\u0006\u0002\u00108\u001a>\u00105\u001a\u00020\u0002*\u00020\u00022\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001f032\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0087\b¢\u0006\u0002\u00109\u001a%\u0010:\u001a\u00020\u0002*\u00020\u00022\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001f072\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a%\u0010:\u001a\u00020\u0002*\u00020\u00022\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001f032\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006;"}, d2 = {"reader", "Ljava/io/InputStreamReader;", "Ljava/nio/file/Path;", "charset", "Ljava/nio/charset/Charset;", "options", "", "Ljava/nio/file/OpenOption;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/InputStreamReader;", "bufferedReader", "Ljava/io/BufferedReader;", "bufferSize", "", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;I[Ljava/nio/file/OpenOption;)Ljava/io/BufferedReader;", "writer", "Ljava/io/OutputStreamWriter;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStreamWriter;", "bufferedWriter", "Ljava/io/BufferedWriter;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;I[Ljava/nio/file/OpenOption;)Ljava/io/BufferedWriter;", "readBytes", "", "writeBytes", "", "array", "(Ljava/nio/file/Path;[B[Ljava/nio/file/OpenOption;)V", "appendBytes", "readText", "", "writeText", "text", "", "(Ljava/nio/file/Path;Ljava/lang/CharSequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)V", "appendText", "forEachLine", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "line", "inputStream", "Ljava/io/InputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;", "outputStream", "Ljava/io/OutputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStream;", "readLines", "", "useLines", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/sequences/Sequence;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writeLines", "lines", "", "(Ljava/nio/file/Path;Ljava/lang/Iterable;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;", "(Ljava/nio/file/Path;Lkotlin/sequences/Sequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;", "appendLines", "kotlin-stdlib-jdk7"}, k = 5, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, xs = "kotlin/io/path/PathsKt")
@SourceDebugExtension({"SMAP\nPathReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,327:1\n1#2:328\n1#2:330\n57#3:329\n1321#4,2:331\n*S KotlinDebug\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n*L\n208#1:330\n208#1:329\n208#1:331,2\n*E\n"})
/* loaded from: classes.dex */
public class PathsKt__PathReadWriteKt {
    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final void appendBytes(Path path, byte[] bArr) {
        StandardOpenOption standardOpenOption;
        path.getClass();
        bArr.getClass();
        standardOpenOption = StandardOpenOption.APPEND;
        Files.write(path, bArr, standardOpenOption);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path appendLines(Path path, Sequence<? extends CharSequence> sequence, Charset charset) {
        StandardOpenOption standardOpenOption;
        Path write;
        path.getClass();
        sequence.getClass();
        charset.getClass();
        Iterable asIterable = SequencesKt.asIterable(sequence);
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, asIterable, charset, standardOpenOption);
        write.getClass();
        return write;
    }

    public static /* synthetic */ Path appendLines$default(Path path, Sequence sequence, Charset charset, int i10, Object obj) {
        StandardOpenOption standardOpenOption;
        Path write;
        if ((i10 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        path.getClass();
        sequence.getClass();
        charset.getClass();
        Iterable asIterable = SequencesKt.asIterable(sequence);
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, asIterable, charset, standardOpenOption);
        write.getClass();
        return write;
    }

    @SinceKotlin(version = "1.5")
    public static final void appendText(Path path, CharSequence charSequence, Charset charset) {
        StandardOpenOption standardOpenOption;
        path.getClass();
        charSequence.getClass();
        charset.getClass();
        standardOpenOption = StandardOpenOption.APPEND;
        writeText(path, charSequence, charset, standardOpenOption);
    }

    public static /* synthetic */ void appendText$default(Path path, CharSequence charSequence, Charset charset, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        appendText(path, charSequence, charset);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final BufferedReader bufferedReader(Path path, Charset charset, int i10, OpenOption... openOptionArr) {
        path.getClass();
        charset.getClass();
        openOptionArr.getClass();
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i10);
    }

    public static /* synthetic */ BufferedReader bufferedReader$default(Path path, Charset charset, int i10, OpenOption[] openOptionArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        path.getClass();
        charset.getClass();
        openOptionArr.getClass();
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i10);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final BufferedWriter bufferedWriter(Path path, Charset charset, int i10, OpenOption... openOptionArr) {
        path.getClass();
        charset.getClass();
        openOptionArr.getClass();
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i10);
    }

    public static /* synthetic */ BufferedWriter bufferedWriter$default(Path path, Charset charset, int i10, OpenOption[] openOptionArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        path.getClass();
        charset.getClass();
        openOptionArr.getClass();
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i10);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final void forEachLine(Path path, Charset charset, Function1<? super String, Unit> function1) {
        BufferedReader newBufferedReader;
        path.getClass();
        charset.getClass();
        function1.getClass();
        newBufferedReader = Files.newBufferedReader(path, charset);
        newBufferedReader.getClass();
        try {
            Iterator<String> it = TextStreamsKt.lineSequence(newBufferedReader).iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            Unit unit = Unit.INSTANCE;
            InlineMarker.finallyStart(1);
            CloseableKt.closeFinally(newBufferedReader, null);
            InlineMarker.finallyEnd(1);
        } finally {
        }
    }

    public static /* synthetic */ void forEachLine$default(Path path, Charset charset, Function1 function1, int i10, Object obj) {
        BufferedReader newBufferedReader;
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        path.getClass();
        charset.getClass();
        function1.getClass();
        newBufferedReader = Files.newBufferedReader(path, charset);
        newBufferedReader.getClass();
        try {
            Iterator<String> it = TextStreamsKt.lineSequence(newBufferedReader).iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            Unit unit = Unit.INSTANCE;
            InlineMarker.finallyStart(1);
            CloseableKt.closeFinally(newBufferedReader, null);
            InlineMarker.finallyEnd(1);
        } finally {
        }
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final InputStream inputStream(Path path, OpenOption... openOptionArr) {
        path.getClass();
        openOptionArr.getClass();
        InputStream newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        newInputStream.getClass();
        return newInputStream;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final OutputStream outputStream(Path path, OpenOption... openOptionArr) {
        path.getClass();
        openOptionArr.getClass();
        OutputStream newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        newOutputStream.getClass();
        return newOutputStream;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final byte[] readBytes(Path path) {
        byte[] readAllBytes;
        path.getClass();
        readAllBytes = Files.readAllBytes(path);
        readAllBytes.getClass();
        return readAllBytes;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final List<String> readLines(Path path, Charset charset) {
        List<String> readAllLines;
        path.getClass();
        charset.getClass();
        readAllLines = Files.readAllLines(path, charset);
        readAllLines.getClass();
        return readAllLines;
    }

    public static /* synthetic */ List readLines$default(Path path, Charset charset, int i10, Object obj) {
        List readAllLines;
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        path.getClass();
        charset.getClass();
        readAllLines = Files.readAllLines(path, charset);
        readAllLines.getClass();
        return readAllLines;
    }

    @SinceKotlin(version = "1.5")
    public static final String readText(Path path, Charset charset) {
        path.getClass();
        charset.getClass();
        InputStreamReader inputStreamReader = new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0)), charset);
        try {
            String readText = TextStreamsKt.readText(inputStreamReader);
            CloseableKt.closeFinally(inputStreamReader, null);
            return readText;
        } finally {
        }
    }

    public static /* synthetic */ String readText$default(Path path, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return readText(path, charset);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final InputStreamReader reader(Path path, Charset charset, OpenOption... openOptionArr) {
        path.getClass();
        charset.getClass();
        openOptionArr.getClass();
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    public static /* synthetic */ InputStreamReader reader$default(Path path, Charset charset, OpenOption[] openOptionArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        path.getClass();
        charset.getClass();
        openOptionArr.getClass();
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <T> T useLines(Path path, Charset charset, Function1<? super Sequence<String>, ? extends T> function1) {
        BufferedReader newBufferedReader;
        path.getClass();
        charset.getClass();
        function1.getClass();
        newBufferedReader = Files.newBufferedReader(path, charset);
        try {
            newBufferedReader.getClass();
            T invoke = function1.invoke(TextStreamsKt.lineSequence(newBufferedReader));
            InlineMarker.finallyStart(1);
            CloseableKt.closeFinally(newBufferedReader, null);
            InlineMarker.finallyEnd(1);
            return invoke;
        } finally {
        }
    }

    public static /* synthetic */ Object useLines$default(Path path, Charset charset, Function1 function1, int i10, Object obj) {
        BufferedReader newBufferedReader;
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        path.getClass();
        charset.getClass();
        function1.getClass();
        newBufferedReader = Files.newBufferedReader(path, charset);
        try {
            newBufferedReader.getClass();
            Object invoke = function1.invoke(TextStreamsKt.lineSequence(newBufferedReader));
            InlineMarker.finallyStart(1);
            CloseableKt.closeFinally(newBufferedReader, null);
            InlineMarker.finallyEnd(1);
            return invoke;
        } finally {
        }
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final void writeBytes(Path path, byte[] bArr, OpenOption... openOptionArr) {
        path.getClass();
        bArr.getClass();
        openOptionArr.getClass();
        Files.write(path, bArr, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path writeLines(Path path, Sequence<? extends CharSequence> sequence, Charset charset, OpenOption... openOptionArr) {
        path.getClass();
        sequence.getClass();
        charset.getClass();
        openOptionArr.getClass();
        Path write = Files.write(path, SequencesKt.asIterable(sequence), charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        write.getClass();
        return write;
    }

    public static /* synthetic */ Path writeLines$default(Path path, Sequence sequence, Charset charset, OpenOption[] openOptionArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        path.getClass();
        sequence.getClass();
        charset.getClass();
        openOptionArr.getClass();
        Path write = Files.write(path, SequencesKt.asIterable(sequence), charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        write.getClass();
        return write;
    }

    @SinceKotlin(version = "1.5")
    public static final void writeText(Path path, CharSequence charSequence, Charset charset, OpenOption... openOptionArr) {
        CharBuffer wrap;
        path.getClass();
        charSequence.getClass();
        charset.getClass();
        openOptionArr.getClass();
        OutputStream newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        try {
            if (charSequence instanceof String) {
                newOutputStream.getClass();
                FilesKt.writeTextImpl(newOutputStream, (String) charSequence, charset);
            } else {
                CharsetEncoder newReplaceEncoder = FilesKt.newReplaceEncoder(charset);
                if (charSequence instanceof CharBuffer) {
                    wrap = ((CharBuffer) charSequence).asReadOnlyBuffer();
                } else {
                    wrap = CharBuffer.wrap(charSequence);
                }
                int min = Math.min(charSequence.length(), 8192);
                newReplaceEncoder.getClass();
                ByteBuffer byteBufferForEncoding = FilesKt.byteBufferForEncoding(min, newReplaceEncoder);
                while (wrap.hasRemaining()) {
                    if (!newReplaceEncoder.encode(wrap, byteBufferForEncoding, true).isError()) {
                        newOutputStream.write(byteBufferForEncoding.array(), 0, byteBufferForEncoding.position());
                        byteBufferForEncoding.clear();
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(newOutputStream, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(newOutputStream, th);
                throw th2;
            }
        }
    }

    public static /* synthetic */ void writeText$default(Path path, CharSequence charSequence, Charset charset, OpenOption[] openOptionArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        writeText(path, charSequence, charset, openOptionArr);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final OutputStreamWriter writer(Path path, Charset charset, OpenOption... openOptionArr) {
        path.getClass();
        charset.getClass();
        openOptionArr.getClass();
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    public static /* synthetic */ OutputStreamWriter writer$default(Path path, Charset charset, OpenOption[] openOptionArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        path.getClass();
        charset.getClass();
        openOptionArr.getClass();
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path appendLines(Path path, Iterable<? extends CharSequence> iterable, Charset charset) {
        StandardOpenOption standardOpenOption;
        Path write;
        path.getClass();
        iterable.getClass();
        charset.getClass();
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, iterable, charset, standardOpenOption);
        write.getClass();
        return write;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path writeLines(Path path, Iterable<? extends CharSequence> iterable, Charset charset, OpenOption... openOptionArr) {
        path.getClass();
        iterable.getClass();
        charset.getClass();
        openOptionArr.getClass();
        Path write = Files.write(path, iterable, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        write.getClass();
        return write;
    }

    public static /* synthetic */ Path appendLines$default(Path path, Iterable iterable, Charset charset, int i10, Object obj) {
        StandardOpenOption standardOpenOption;
        Path write;
        if ((i10 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        path.getClass();
        iterable.getClass();
        charset.getClass();
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, iterable, charset, standardOpenOption);
        write.getClass();
        return write;
    }

    public static /* synthetic */ Path writeLines$default(Path path, Iterable iterable, Charset charset, OpenOption[] openOptionArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        path.getClass();
        iterable.getClass();
        charset.getClass();
        openOptionArr.getClass();
        Path write = Files.write(path, iterable, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        write.getClass();
        return write;
    }
}
