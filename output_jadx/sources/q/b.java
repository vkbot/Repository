package q;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements h.k {
    public static final h.g c = h.g.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final h.g d = new h.g("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, h.g.e);

    /* renamed from: b, reason: collision with root package name */
    public final k.g f5120b;

    public b(k.g gVar) {
        this.f5120b = gVar;
    }

    @Override // h.k
    public final int e(h.h hVar) {
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    @Override // h.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(java.lang.Object r9, java.io.File r10, h.h r11) {
        /*
            r8 = this;
            j.d0 r9 = (j.d0) r9
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            h.g r1 = q.b.d
            java.lang.Object r2 = r11.c(r1)
            android.graphics.Bitmap$CompressFormat r2 = (android.graphics.Bitmap.CompressFormat) r2
            if (r2 == 0) goto L15
            goto L20
        L15:
            boolean r2 = r9.hasAlpha()
            if (r2 == 0) goto L1e
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            goto L20
        L1e:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
        L20:
            r9.getWidth()
            r9.getHeight()
            int r3 = c0.j.f437b
            long r3 = android.os.SystemClock.elapsedRealtimeNanos()
            h.g r5 = q.b.c
            java.lang.Object r5 = r11.c(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            k.g r10 = r8.f5120b
            if (r10 == 0) goto L4f
            com.bumptech.glide.load.data.c r6 = new com.bumptech.glide.load.data.c     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4c
            r6.<init>(r7, r10)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4c
            goto L50
        L48:
            r9 = move-exception
            r6 = r7
            goto Lbc
        L4c:
            r10 = move-exception
            r6 = r7
            goto L61
        L4f:
            r6 = r7
        L50:
            r9.compress(r2, r5, r6)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r6.close()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r6.close()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            goto L5c
        L5a:
            r9 = move-exception
            goto Lc2
        L5c:
            r10 = 1
            goto L73
        L5e:
            r9 = move-exception
            goto Lbc
        L60:
            r10 = move-exception
        L61:
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r0, r5)     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto L6d
            java.lang.String r5 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r5, r10)     // Catch: java.lang.Throwable -> L5e
        L6d:
            if (r6 == 0) goto L72
            r6.close()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L72
        L72:
            r10 = 0
        L73:
            r5 = 2
            boolean r5 = android.util.Log.isLoggable(r0, r5)
            if (r5 == 0) goto Lbb
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Compressed with type: "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = " of size "
            r5.append(r2)
            int r2 = c0.p.c(r9)
            r5.append(r2)
            java.lang.String r2 = " in "
            r5.append(r2)
            double r2 = c0.j.a(r3)
            r5.append(r2)
            java.lang.String r2 = ", options format: "
            r5.append(r2)
            java.lang.Object r11 = r11.c(r1)
            r5.append(r11)
            java.lang.String r11 = ", hasAlpha: "
            r5.append(r11)
            boolean r9 = r9.hasAlpha()
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            android.util.Log.v(r0, r9)
        Lbb:
            return r10
        Lbc:
            if (r6 == 0) goto Lc3
            r6.close()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> Lc3
            goto Lc3
        Lc2:
            throw r9
        Lc3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: q.b.h(java.lang.Object, java.io.File, h.h):boolean");
    }
}
