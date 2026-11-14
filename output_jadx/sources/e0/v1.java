package e0;

import android.media.session.MediaController;
import android.media.session.PlaybackState;
import com.example.navistart.cores.ColorText;
import com.example.navistart.cores.ProLanProxy;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class v1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2054b;
    public final /* synthetic */ x1 c;

    public /* synthetic */ v1(x1 x1Var, int i10) {
        this.f2054b = i10;
        this.c = x1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String h2;
        List<MediaController> list;
        MediaController mediaController;
        PlaybackState playbackState;
        PlaybackState playbackState2;
        MediaController mediaController2 = null;
        int i10 = 1;
        switch (this.f2054b) {
            case 0:
                MediaController a10 = this.c.a();
                if (a10 == null) {
                    h0.b.w(m.h(new byte[]{-12, -7, 77, 99, 100, 42, -3, 27, -51, -18, 70, 102, 105, 12, -32, 85, -108, -68, 103, 95, 73, 37}, new byte[]{-71, -100, 41, 10, 5, 105, -110, 117}), ColorText.RED);
                    return;
                }
                PlaybackState playbackState3 = a10.getPlaybackState();
                if (playbackState3 == null || playbackState3.getState() != 3) {
                    i10 = 0;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(m.h(new byte[]{6, 119, 15, 16, 108, 109, 103, 0, 63, 96, 4, 21, 97, 75, 122, 78, 102, 50}, new byte[]{75, 18, 107, 121, 13, 46, 8, 110}));
                sb.append(a10.getPackageName());
                sb.append(m.h(new byte[]{-85, 59, 81}, new byte[]{-117, 22, 113, 123, 92, 124, -14, 1}));
                if (i10 != 0) {
                    h2 = m.h(new byte[]{74, -70, 26, 68, -64}, new byte[]{26, -5, 79, 23, -123, -63, -4, -63});
                } else {
                    h2 = m.h(new byte[]{63, -50, -32, -91}, new byte[]{111, -126, -95, -4, 57, 74, -11, -6});
                }
                sb.append(h2);
                h0.b.w(sb.toString(), ColorText.RED);
                if (i10 != 0) {
                    a10.getTransportControls().pause();
                    return;
                } else {
                    a10.getTransportControls().play();
                    return;
                }
            case 1:
                x1 x1Var = this.c;
                if (x1Var.f2078o) {
                    try {
                        list = x1Var.f2072i.getActiveSessions(x1Var.f2073j);
                    } catch (Exception unused) {
                        list = null;
                    }
                    MediaController a11 = x1Var.a();
                    if (list != null && !list.isEmpty()) {
                        Iterator<MediaController> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                mediaController = it.next();
                                if (mediaController != null && (playbackState2 = mediaController.getPlaybackState()) != null && playbackState2.getState() == 3) {
                                }
                            } else {
                                mediaController = null;
                            }
                        }
                        if (mediaController == null) {
                            h0.b.a();
                            h0.b.a();
                            ProLanProxy n10 = h0.b.n();
                            if (n10 != null && n10.getMO()) {
                                Iterator<MediaController> it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        MediaController next = it2.next();
                                        if (next != null && (playbackState = next.getPlaybackState()) != null && playbackState.getState() != 0) {
                                            mediaController2 = next;
                                        }
                                    }
                                }
                                if (mediaController2 != null) {
                                    mediaController = mediaController2;
                                }
                            }
                            mediaController = list.get(0);
                        }
                        String packageName = mediaController.getPackageName();
                        if (!packageName.contains(m.h(new byte[]{-83, 84, -98, 88, -124, -116, 80, -23, -95, 82, -105, 88}, new byte[]{-50, 59, -13, 118, -27, -30, 52, -101})) && !packageName.contains(m.h(new byte[]{-62, -115, 122, -40, -104, -68, 21, -123, -40, -111, 97}, new byte[]{-95, -30, 23, -10, -4, -39, 102, -28}))) {
                            if (a11 != null && a11.getPlaybackState() == null) {
                                x1Var.e(a11);
                                return;
                            } else {
                                if (a11 == null || !a11.getSessionToken().equals(mediaController.getSessionToken())) {
                                    x1Var.f2077n.post(new b1.n(x1Var, a11, mediaController, i10));
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    if (a11 != null) {
                        x1Var.e(a11);
                        return;
                    }
                    return;
                }
                return;
            default:
                x1 x1Var2 = this.c;
                if (x1Var2.f2078o) {
                    x1Var2.f2078o = false;
                    MediaController a12 = x1Var2.a();
                    if (a12 != null) {
                        x1Var2.e(a12);
                    }
                    x1.d(null);
                    x1Var2.f2078o = true;
                    return;
                }
                return;
        }
    }
}
