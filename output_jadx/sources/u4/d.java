package u4;

import java.util.concurrent.ExecutorService;
import n.p;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5876b;
    public final /* synthetic */ f c;
    public final /* synthetic */ Runnable d;
    public final /* synthetic */ p e;

    public /* synthetic */ d(f fVar, Runnable runnable, p pVar, int i10) {
        this.f5876b = i10;
        this.c = fVar;
        this.d = runnable;
        this.e = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5876b) {
            case 0:
                ExecutorService executorService = this.c.f5878b;
                final int i10 = 0;
                final Runnable runnable = this.d;
                final p pVar = this.e;
                executorService.execute(new Runnable() { // from class: u4.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) pVar.c).setException(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e6) {
                                    ((h) pVar.c).setException(e6);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) pVar.c;
                                try {
                                    runnable2.run();
                                    hVar.set(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar.setException(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                ExecutorService executorService2 = this.c.f5878b;
                final int i11 = 2;
                final Runnable runnable2 = this.d;
                final p pVar2 = this.e;
                executorService2.execute(new Runnable() { // from class: u4.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) pVar2.c).setException(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e6) {
                                    ((h) pVar2.c).setException(e6);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) pVar2.c;
                                try {
                                    runnable22.run();
                                    hVar.set(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar.setException(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                ExecutorService executorService3 = this.c.f5878b;
                final int i12 = 1;
                final Runnable runnable3 = this.d;
                final p pVar3 = this.e;
                executorService3.execute(new Runnable() { // from class: u4.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) pVar3.c).setException(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e6) {
                                    ((h) pVar3.c).setException(e6);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) pVar3.c;
                                try {
                                    runnable22.run();
                                    hVar.set(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar.setException(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
