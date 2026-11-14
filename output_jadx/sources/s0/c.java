package s0;

import android.media.AudioAttributes;
import android.media.SoundPool;
import com.example.navistart.LocServ;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public SoundPool f5458a;

    /* renamed from: b, reason: collision with root package name */
    public int f5459b;
    public final int[] c = new int[6];
    public boolean d = false;
    public float e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int f5460f = 1;

    public c(LocServ locServ) {
        SoundPool build = new SoundPool.Builder().setMaxStreams(6).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).build();
        this.f5458a = build;
        build.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: s0.b
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i10, int i11) {
                if (i11 == 0) {
                    c.this.d = true;
                }
            }
        });
    }
}
