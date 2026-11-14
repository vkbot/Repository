package n7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class p0 {
    public static final Logger c = Logger.getLogger(p0.class.getName());
    public static p0 d;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f4235a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public List f4236b = Collections.EMPTY_LIST;

    public static List a() {
        Logger logger = c;
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(p7.i.class);
        } catch (ClassNotFoundException e) {
            logger.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e6) {
            logger.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e6);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e10) {
            logger.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e10);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
