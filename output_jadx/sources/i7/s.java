package i7;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class s extends AndroidViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final MutableLiveData f2825a;

    /* renamed from: b, reason: collision with root package name */
    public final MutableLiveData f2826b;
    public final MutableLiveData c;
    public final MutableLiveData d;
    public final MutableLiveData e;

    public s(@NonNull Application application) {
        super(application);
        this.f2825a = new MutableLiveData();
        this.f2826b = new MutableLiveData();
        this.c = new MutableLiveData(Boolean.FALSE);
        this.d = new MutableLiveData();
        this.e = new MutableLiveData();
    }
}
