package ai.onnxruntime;

import f7.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.function.Function;
import org.apache.commons.io.ByteOrderMark;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.output.BrokenOutputStream;
import org.apache.commons.net.ftp.FTPClient;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Function {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f93b;

    public /* synthetic */ d(int i10) {
        this.f93b = i10;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String lambda$toString$0;
        Throwable lambda$new$0;
        switch (this.f93b) {
            case 0:
                lambda$toString$0 = TensorInfo.lambda$toString$0((String) obj);
                return lambda$toString$0;
            case 1:
                return ((Thread) obj).getName();
            case 2:
                return ((e) obj).a();
            case 3:
                IOFileFilter iOFileFilter = (IOFileFilter) obj;
                Objects.requireNonNull(iOFileFilter);
                return iOFileFilter;
            case 4:
                return Integer.valueOf(((ByteOrderMark) obj).length());
            case 5:
                lambda$new$0 = BrokenOutputStream.lambda$new$0((String) obj);
                return lambda$new$0;
            case 6:
                return FTPClient.a((String) obj);
            case 7:
                return new ArrayList();
            case 8:
                return new ArrayList();
            case 9:
                return new HashSet();
            case 10:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }
}
