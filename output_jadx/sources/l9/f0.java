package l9;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class f0 extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Socket f3570a;

    public f0(Socket socket) {
        socket.getClass();
        this.f3570a = socket;
    }

    @Override // l9.g
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // l9.g
    public final void timedOut() {
        Socket socket = this.f3570a;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (b.e(e)) {
                v.f3584a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e6) {
            v.f3584a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e6);
        }
    }
}
