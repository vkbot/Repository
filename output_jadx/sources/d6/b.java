package d6;

import android.media.MediaPlayer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1841a;

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        switch (this.f1841a) {
            case 0:
                mediaPlayer.stop();
                mediaPlayer.reset();
                mediaPlayer.release();
                return;
            default:
                mediaPlayer.release();
                return;
        }
    }
}
