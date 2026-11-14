package d6;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Handler;
import android.util.Log;
import com.example.navistart.R;
import j.d0;
import java.io.IOException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1842a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1843b;

    public d(q6.h hVar, boolean z9) {
        this.f1842a = z9;
        this.f1843b = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.media.MediaPlayer$OnErrorListener, java.lang.Object] */
    public void a() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer.setOnCompletionListener(new b(0));
        mediaPlayer.setOnErrorListener(new Object());
        try {
            AssetFileDescriptor openRawResourceFd = ((Context) this.f1843b).getResources().openRawResourceFd(R.raw.zxing_beep);
            try {
                mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                openRawResourceFd.close();
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (Throwable th) {
                openRawResourceFd.close();
                throw th;
            }
        } catch (IOException e) {
            Log.w("d", e);
            mediaPlayer.reset();
            mediaPlayer.release();
        }
    }

    public synchronized void b(d0 d0Var, boolean z9) {
        try {
            if (!this.f1842a && !z9) {
                this.f1842a = true;
                d0Var.recycle();
                this.f1842a = false;
            }
            ((Handler) this.f1843b).obtainMessage(1, d0Var).sendToTarget();
        } catch (Throwable th) {
            throw th;
        }
    }
}
