package org.apache.commons.io.input;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.io.input.ObservableInputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class MessageDigestInputStream extends ObservableInputStream {
    private final MessageDigest messageDigest;

    private MessageDigestInputStream(Builder builder) {
        super(builder);
        MessageDigest messageDigest = builder.messageDigest;
        Objects.requireNonNull(messageDigest, "builder.messageDigest");
        this.messageDigest = messageDigest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public MessageDigest getMessageDigest() {
        return this.messageDigest;
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class Builder extends ObservableInputStream.AbstractBuilder<Builder> {
        private MessageDigest messageDigest;

        @Override // org.apache.commons.io.function.IOSupplier
        public MessageDigestInputStream get() {
            setObservers(Arrays.asList(new MessageDigestMaintainingObserver(this.messageDigest)));
            return new MessageDigestInputStream(this);
        }

        public Builder setMessageDigest(String str) {
            this.messageDigest = MessageDigest.getInstance(str);
            return this;
        }

        public Builder setMessageDigest(MessageDigest messageDigest) {
            this.messageDigest = messageDigest;
            return this;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class MessageDigestMaintainingObserver extends ObservableInputStream.Observer {
        private final MessageDigest messageDigest;

        public MessageDigestMaintainingObserver(MessageDigest messageDigest) {
            Objects.requireNonNull(messageDigest, "messageDigest");
            this.messageDigest = messageDigest;
        }

        @Override // org.apache.commons.io.input.ObservableInputStream.Observer
        public void data(int i10) {
            this.messageDigest.update((byte) i10);
        }

        @Override // org.apache.commons.io.input.ObservableInputStream.Observer
        public void data(byte[] bArr, int i10, int i11) {
            this.messageDigest.update(bArr, i10, i11);
        }
    }
}
