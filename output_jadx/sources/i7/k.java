package i7;

import java.io.Writer;
import java.util.Objects;
import java.util.function.Predicate;
import org.apache.commons.io.comparator.CompositeFileComparator;
import org.apache.commons.io.file.DeleteOption;
import org.apache.commons.io.file.PathUtils;
import org.apache.commons.io.file.StandardDeleteOption;
import org.apache.commons.net.ftp.parser.UnixFTPEntryParser;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2808a;

    public /* synthetic */ k(int i10) {
        this.f2808a = i10;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$compare$2;
        boolean lambda$overrideReadOnly$3;
        boolean z9;
        switch (this.f2808a) {
            case 0:
                return ((Boolean) obj).booleanValue();
            case 1:
                return ((n0.e) ((Enum) obj)).a().booleanValue();
            case 2:
                lambda$compare$2 = CompositeFileComparator.lambda$compare$2((Integer) obj);
                return lambda$compare$2;
            case 3:
                lambda$overrideReadOnly$3 = PathUtils.lambda$overrideReadOnly$3((DeleteOption) obj);
                return lambda$overrideReadOnly$3;
            case 4:
                return StandardDeleteOption.a((DeleteOption) obj);
            case 5:
                return Objects.nonNull((Writer) obj);
            case 6:
                return UnixFTPEntryParser.a((String) obj);
            case 7:
                return x0.c.i((x0.m) obj);
            default:
                z9 = ((x0.m) obj).f6462f;
                return z9;
        }
    }
}
