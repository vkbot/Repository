package v1;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class b extends AndroidViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final MutableLiveData f5921a;

    /* renamed from: b, reason: collision with root package name */
    public final MutableLiveData f5922b;

    public b(@NonNull Application application) {
        super(application);
        this.f5921a = new MutableLiveData(Boolean.FALSE);
        this.f5922b = new MutableLiveData(null);
    }

    public final MutableLiveData a() {
        return this.f5922b;
    }

    public final MutableLiveData b() {
        return this.f5921a;
    }
}
