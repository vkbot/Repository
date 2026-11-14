package n;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.List;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4000a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4001b;
    public final Object c;

    public b(Context context, com.bumptech.glide.manager.o oVar) {
        this.c = context.getApplicationContext();
        this.f4001b = oVar;
    }

    @Override // n.r
    public final boolean a(Object obj) {
        switch (this.f4000a) {
            case 0:
                Uri uri = (Uri) obj;
                if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
                    return false;
                }
                return true;
            case 1:
                return true;
            case 2:
                return true;
            default:
                Uri uri2 = (Uri) obj;
                if ("android.resource".equals(uri2.getScheme()) && ((Context) this.c).getPackageName().equals(uri2.getAuthority())) {
                    return true;
                }
                return false;
        }
    }

    @Override // n.r
    public final q b(Object obj, int i10, int i11, h.h hVar) {
        com.bumptech.glide.load.data.k kVar;
        Resources resources;
        Uri uri;
        switch (this.f4000a) {
            case 0:
                Uri uri2 = (Uri) obj;
                String substring = uri2.toString().substring(22);
                b0.b bVar = new b0.b(uri2);
                AssetManager assetManager = (AssetManager) this.c;
                switch (((a) this.f4001b).f3998b) {
                    case 0:
                        kVar = new com.bumptech.glide.load.data.k(assetManager, substring, 0);
                        break;
                    default:
                        kVar = new com.bumptech.glide.load.data.k(assetManager, substring, 1);
                        break;
                }
                return new q(bVar, kVar);
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) hVar.c(s.c.f5451b);
                if (theme != null) {
                    resources = theme.getResources();
                } else {
                    resources = ((Context) this.c).getResources();
                }
                return new q(new b0.b(num), new e(theme, resources, (com.bumptech.glide.manager.o) this.f4001b, num.intValue()));
            case 2:
                Integer num2 = (Integer) obj;
                Resources resources2 = (Resources) this.f4001b;
                try {
                    uri = Uri.parse("android.resource://" + resources2.getResourcePackageName(num2.intValue()) + IOUtils.DIR_SEPARATOR_UNIX + resources2.getResourceTypeName(num2.intValue()) + IOUtils.DIR_SEPARATOR_UNIX + resources2.getResourceEntryName(num2.intValue()));
                } catch (Resources.NotFoundException e) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num2, e);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((r) this.c).b(uri, i10, i11, hVar);
            default:
                Uri uri3 = (Uri) obj;
                r rVar = (r) this.f4001b;
                List<String> pathSegments = uri3.getPathSegments();
                q qVar = null;
                if (pathSegments.size() == 1) {
                    try {
                        int parseInt = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (parseInt == 0) {
                            if (Log.isLoggable("ResourceUriLoader", 5)) {
                                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                            }
                        } else {
                            qVar = rVar.b(Integer.valueOf(parseInt), i10, i11, hVar);
                        }
                        return qVar;
                    } catch (NumberFormatException e6) {
                        if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e6);
                            return qVar;
                        }
                        return qVar;
                    }
                }
                if (pathSegments.size() == 2) {
                    List<String> pathSegments2 = uri3.getPathSegments();
                    String str = pathSegments2.get(0);
                    String str2 = pathSegments2.get(1);
                    Context context = (Context) this.c;
                    int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                    if (identifier == 0) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return null;
                        }
                        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                        return null;
                    }
                    return rVar.b(Integer.valueOf(identifier), i10, i11, hVar);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri3);
                return null;
        }
    }

    public b(Resources resources, r rVar) {
        this.f4001b = resources;
        this.c = rVar;
    }

    public b(AssetManager assetManager, a aVar) {
        this.c = assetManager;
        this.f4001b = aVar;
    }

    public b(Context context, r rVar) {
        this.c = context.getApplicationContext();
        this.f4001b = rVar;
    }
}
