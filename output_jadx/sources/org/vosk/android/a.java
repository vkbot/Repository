package org.vosk.android;

import java.io.IOException;
import org.vosk.Model;
import org.vosk.android.SpeechService;
import org.vosk.android.SpeechStreamService;
import org.vosk.android.StorageService;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4941b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f4941b = i10;
        this.d = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4941b) {
            case 0:
                ((SpeechService.RecognizerThread) this.d).lambda$run$0((IOException) this.c);
                return;
            case 1:
                ((SpeechStreamService.RecognizerThread) this.d).lambda$run$2((IOException) this.c);
                return;
            case 2:
                StorageService.b((StorageService.Callback) this.d, (Model) this.c);
                return;
            default:
                StorageService.c((StorageService.Callback) this.d, (IOException) this.c);
                return;
        }
    }
}
