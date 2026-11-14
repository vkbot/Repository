package d6;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f1844a = Pattern.compile(",");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f1845b;

    static {
        EnumSet of = EnumSet.of(z5.a.f6843m);
        EnumSet of2 = EnumSet.of(z5.a.f6837g);
        EnumSet of3 = EnumSet.of(z5.a.f6835b);
        EnumSet of4 = EnumSet.of(z5.a.f6842l);
        EnumSet of5 = EnumSet.of(z5.a.f6846p, z5.a.f6847q, z5.a.f6839i, z5.a.f6838h, z5.a.f6844n, z5.a.f6845o);
        EnumSet of6 = EnumSet.of(z5.a.d, z5.a.e, z5.a.f6836f, z5.a.f6840j, z5.a.c);
        EnumSet copyOf = EnumSet.copyOf((Collection) of5);
        copyOf.addAll(of6);
        HashMap hashMap = new HashMap();
        f1845b = hashMap;
        hashMap.put("ONE_D_MODE", copyOf);
        hashMap.put("PRODUCT_MODE", of5);
        hashMap.put("QR_CODE_MODE", of);
        hashMap.put("DATA_MATRIX_MODE", of2);
        hashMap.put("AZTEC_MODE", of3);
        hashMap.put("PDF417_MODE", of4);
    }
}
