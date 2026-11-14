package androidx.emoji2.text.flatbuffer;

import java.nio.charset.CharsetEncoder;
import java.util.function.Supplier;
import org.apache.commons.io.charset.CharsetEncoders;
import org.apache.commons.io.file.PathUtils;
import org.apache.commons.io.input.BrokenInputStream;
import org.apache.commons.io.input.BrokenReader;
import org.apache.commons.io.input.ReadAheadInputStream;
import org.apache.commons.io.output.BrokenWriter;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212a;

    public /* synthetic */ a(int i10) {
        this.f212a = i10;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        CharsetEncoder lambda$toCharsetEncoder$0;
        switch (this.f212a) {
            case 0:
                return Utf8Old.a();
            case 1:
                return new Exception((Throwable) null);
            case 2:
                return new Exception((Throwable) null);
            case 3:
                lambda$toCharsetEncoder$0 = CharsetEncoders.lambda$toCharsetEncoder$0();
                return lambda$toCharsetEncoder$0;
            case 4:
                return BrokenInputStream.y();
            case 5:
                return BrokenReader.c();
            case 6:
                return ReadAheadInputStream.y();
            case 7:
                return BrokenWriter.y();
            default:
                return PathUtils.getTempDirectory();
        }
    }
}
