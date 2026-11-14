package org.vosk.android;

import org.vosk.android.SpeechService;
import org.vosk.android.SpeechStreamService;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4943b;
    public final /* synthetic */ Thread c;

    public /* synthetic */ c(Thread thread, int i10) {
        this.f4943b = i10;
        this.c = thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4943b) {
            case 0:
                SpeechService.RecognizerThread.a((SpeechService.RecognizerThread) this.c);
                return;
            default:
                SpeechStreamService.RecognizerThread.b((SpeechStreamService.RecognizerThread) this.c);
                return;
        }
    }
}
