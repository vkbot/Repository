package androidx.emoji2.text;

import androidx.emoji2.text.FontRequestEmojiCompatConfig;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f211b;
    public final /* synthetic */ FontRequestEmojiCompatConfig.FontRequestMetadataLoader c;

    public /* synthetic */ d(FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader, int i10) {
        this.f211b = i10;
        this.c = fontRequestMetadataLoader;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f211b) {
            case 0:
                this.c.createMetadata();
                return;
            default:
                this.c.loadInternal();
                return;
        }
    }
}
