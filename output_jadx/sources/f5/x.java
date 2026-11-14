package f5;

import android.net.Network;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.protobuf.i1;
import com.google.protobuf.x0;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2338b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x(int i10, Object obj, Object obj2) {
        this.f2338b = i10;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        com.google.protobuf.j iVar;
        Socket socket;
        switch (this.f2338b) {
            case 0:
                y yVar = (y) this.c;
                x0 x0Var = (x0) this.d;
                synchronized (yVar) {
                    try {
                        FileInputStream openFileInput = yVar.f2339a.openFileInput(yVar.f2340b);
                        try {
                            com.google.protobuf.x xVar = (com.google.protobuf.x) x0Var;
                            xVar.getClass();
                            com.google.protobuf.p pVar = com.google.protobuf.x.f1643b;
                            if (openFileInput == null) {
                                byte[] bArr = com.google.protobuf.b0.f1536b;
                                iVar = com.google.protobuf.j.d(bArr, 0, bArr.length, false);
                            } else {
                                iVar = new com.google.protobuf.i(openFileInput);
                            }
                            com.google.protobuf.y a10 = xVar.a(iVar, pVar);
                            iVar.a(0);
                            if (com.google.protobuf.y.h(a10, true)) {
                                if (openFileInput != null) {
                                    openFileInput.close();
                                }
                                return a10;
                            }
                            throw new IOException(new i1().getMessage());
                        } catch (Throwable th) {
                            if (openFileInput != null) {
                                try {
                                    openFileInput.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (com.google.protobuf.d0 | FileNotFoundException e) {
                        e3.d.n("Recoverable exception while reading cache: " + e.getMessage());
                        return null;
                    }
                }
            case 1:
                y yVar2 = (y) this.c;
                com.google.protobuf.a aVar = (com.google.protobuf.a) this.d;
                synchronized (yVar2) {
                    FileOutputStream openFileOutput = yVar2.f2339a.openFileOutput(yVar2.f2340b, 0);
                    try {
                        openFileOutput.write(aVar.b());
                        openFileOutput.close();
                    } finally {
                    }
                }
                return aVar;
            default:
                q0.d dVar = (q0.d) this.c;
                q0.c cVar = (q0.c) this.d;
                Socket socket2 = null;
                if (!dVar.e.get()) {
                    return null;
                }
                try {
                    Network network = cVar.f5176b;
                    if (network == null) {
                        socket = new Socket();
                    } else {
                        socket = network.getSocketFactory().createSocket();
                    }
                } catch (IOException | RuntimeException unused) {
                    socket = null;
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    try {
                        socket.setTcpNoDelay(true);
                        socket.connect(new InetSocketAddress(cVar.f5175a, dVar.f5183h), 220);
                        socket.setSoTimeout(TypedValues.TransitionType.TYPE_DURATION);
                        OutputStream outputStream = socket.getOutputStream();
                        outputStream.write(1);
                        outputStream.flush();
                        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                        int readInt = dataInputStream.readInt();
                        if (readInt > 0 && readInt <= 65536) {
                            byte[] bArr2 = new byte[readInt];
                            dataInputStream.readFully(bArr2);
                            if (!j4.b.c(bArr2).c) {
                                cVar = null;
                            }
                            try {
                                socket.close();
                            } catch (IOException unused2) {
                            }
                            return cVar;
                        }
                    } catch (IOException | RuntimeException unused3) {
                        if (socket == null) {
                            return null;
                        }
                        socket.close();
                    } catch (Throwable th4) {
                        th = th4;
                        socket2 = socket;
                        if (socket2 != null) {
                            try {
                                socket2.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                    socket.close();
                } catch (IOException unused5) {
                    return null;
                }
                break;
        }
    }
}
