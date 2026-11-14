package v1;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class a extends AndroidViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final MutableLiveData f5919a;

    /* renamed from: b, reason: collision with root package name */
    public final MutableLiveData f5920b;

    public a(@NonNull Application application) {
        super(application);
        this.f5919a = new MutableLiveData();
        this.f5920b = new MutableLiveData(Boolean.FALSE);
    }

    public final void a(String str) {
        this.f5919a.postValue(str);
    }
}
