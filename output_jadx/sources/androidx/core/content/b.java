package androidx.core.content;

import android.content.ComponentName;
import android.net.Uri;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f169b;

    public /* synthetic */ b(String str, int i10) {
        this.f168a = i10;
        this.f169b = str;
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        boolean lambda$allowExtraOutput$16;
        boolean lambda$allowComponentWithPackage$9;
        boolean lambda$allowDataWithAuthority$8;
        boolean lambda$allowClipDataUriWithAuthority$11;
        boolean lambda$allowExtraStreamUriWithAuthority$15;
        switch (this.f168a) {
            case 0:
                lambda$allowExtraOutput$16 = IntentSanitizer.Builder.lambda$allowExtraOutput$16(this.f169b, (Uri) obj);
                return lambda$allowExtraOutput$16;
            case 1:
                return this.f169b.equals((String) obj);
            case 2:
                lambda$allowComponentWithPackage$9 = IntentSanitizer.Builder.lambda$allowComponentWithPackage$9(this.f169b, (ComponentName) obj);
                return lambda$allowComponentWithPackage$9;
            case 3:
                lambda$allowDataWithAuthority$8 = IntentSanitizer.Builder.lambda$allowDataWithAuthority$8(this.f169b, (Uri) obj);
                return lambda$allowDataWithAuthority$8;
            case 4:
                lambda$allowClipDataUriWithAuthority$11 = IntentSanitizer.Builder.lambda$allowClipDataUriWithAuthority$11(this.f169b, (Uri) obj);
                return lambda$allowClipDataUriWithAuthority$11;
            default:
                lambda$allowExtraStreamUriWithAuthority$15 = IntentSanitizer.Builder.lambda$allowExtraStreamUriWithAuthority$15(this.f169b, (Uri) obj);
                return lambda$allowExtraStreamUriWithAuthority$15;
        }
    }
}
