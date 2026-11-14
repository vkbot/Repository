package n0;

import androidx.core.util.Supplier;
import com.example.navistart.cores.ProxyFactory;
import j1.r;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.NoSuchElementException;
import kotlin.text.Typography;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.input.UnsynchronizedByteArrayInputStream;
import org.apache.commons.io.output.AbstractByteArrayOutputStream;
import org.apache.commons.io.output.ThresholdingOutputStream;
import org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPFileFilter;
import org.apache.commons.net.ftp.FTPFileFilters;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Supplier, ProxyFactory.ProxyFactoryCreat, AbstractByteArrayOutputStream.InputStreamConstructor, IOFunction, FTPFileFilter {

    /* renamed from: b */
    public final /* synthetic */ int f4050b;

    public /* synthetic */ b(int i10) {
        this.f4050b = i10;
    }

    public static /* synthetic */ void A(String str) {
        throw new IOException(str);
    }

    public static /* synthetic */ void B(String str, Object obj, Object obj2, Object obj3) {
        throw new AssertionError(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void a() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void b(int i10, long j10) {
        throw new IOException("Content-Length (" + j10 + ((Object) ") and stream length (") + i10 + ((Object) ") disagree"));
    }

    public static /* synthetic */ void e(int i10, String str) {
        throw new IllegalStateException((str + i10).toString());
    }

    public static /* synthetic */ void f(long j10) {
        throw new ArithmeticException("The byte count " + j10 + ((Object) " is too large to be converted to an int"));
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new IllegalArgumentException((str + obj + Typography.quote).toString());
    }

    public static /* synthetic */ void j(Object obj, String str, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void n(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void o(String str, int i10, int i11, Object obj) {
        throw new IllegalArgumentException(str + i10 + obj + i11);
    }

    public static /* synthetic */ void t(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void u(String str, Object obj, Object obj2, Object obj3, int i10) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + ((char) i10)).toString());
    }

    public static /* synthetic */ void v(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static /* synthetic */ void w(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void x() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void y(int i10, String str) {
        throw new IOException(str + i10);
    }

    public static /* synthetic */ void z(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    @Override // org.apache.commons.net.ftp.FTPFileFilter
    public boolean accept(FTPFile fTPFile) {
        boolean lambda$static$0;
        lambda$static$0 = FTPFileFilters.lambda$static$0(fTPFile);
        return lambda$static$0;
    }

    @Override // org.apache.commons.io.function.IOFunction
    public Object apply(Object obj) {
        OutputStream lambda$static$0;
        lambda$static$0 = ThresholdingOutputStream.lambda$static$0((ThresholdingOutputStream) obj);
        return lambda$static$0;
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream.InputStreamConstructor
    public InputStream construct(byte[] bArr, int i10, int i11) {
        UnsynchronizedByteArrayInputStream lambda$toInputStream$1;
        switch (this.f4050b) {
            case 26:
                return new ByteArrayInputStream(bArr, i10, i11);
            default:
                lambda$toInputStream$1 = UnsynchronizedByteArrayOutputStream.lambda$toInputStream$1(bArr, i10, i11);
                return lambda$toInputStream$1;
        }
    }

    @Override // com.example.navistart.cores.ProxyFactory.ProxyFactoryCreat
    public Object create() {
        switch (this.f4050b) {
            case 2:
                return new g1.a(2);
            default:
                return new h1.a(4);
        }
    }

    @Override // androidx.core.util.Supplier
    public Object get() {
        switch (this.f4050b) {
            case 0:
                return new Object();
            case 1:
                return new r(0);
            default:
                return new Object();
        }
    }
}
