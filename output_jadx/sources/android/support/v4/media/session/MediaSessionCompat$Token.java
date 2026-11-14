package android.support.v4.media.session;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcelable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new g(2);

    /* renamed from: b, reason: collision with root package name */
    public final Object f120b = new Object();
    public final Object c;
    public c d;
    public VersionedParcelable e;

    public MediaSessionCompat$Token(Object obj, c cVar) {
        this.c = obj;
        this.d = cVar;
    }

    public static MediaSessionCompat$Token q(Parcelable parcelable, c cVar) {
        if (parcelable != null) {
            if (parcelable instanceof MediaSession.Token) {
                return new MediaSessionCompat$Token(parcelable, cVar);
            }
            j1.i.k("token is not a valid MediaSession.Token object");
            return null;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        Object obj2 = ((MediaSessionCompat$Token) obj).c;
        Object obj3 = this.c;
        if (obj3 == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        if (obj2 == null) {
            return false;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.c;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final c r() {
        c cVar;
        synchronized (this.f120b) {
            cVar = this.d;
        }
        return cVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable((Parcelable) this.c, i10);
    }
}
