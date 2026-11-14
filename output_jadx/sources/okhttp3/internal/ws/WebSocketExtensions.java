package okhttp3.internal.ws;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Headers;
import okhttp3.internal.Util;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cBE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003JN\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u000e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/ws/WebSocketExtensions;", "", "perMessageDeflate", "", "clientMaxWindowBits", "", "clientNoContextTakeover", "serverMaxWindowBits", "serverNoContextTakeover", "unknownValues", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V", "Ljava/lang/Integer;", "component1", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "copy", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)Lokhttp3/internal/ws/WebSocketExtensions;", "equals", "other", "hashCode", "noContextTakeover", "clientOriginated", "toString", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class WebSocketExtensions {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";

    @JvmField
    public final Integer clientMaxWindowBits;

    @JvmField
    public final boolean clientNoContextTakeover;

    @JvmField
    public final boolean perMessageDeflate;

    @JvmField
    public final Integer serverMaxWindowBits;

    @JvmField
    public final boolean serverNoContextTakeover;

    @JvmField
    public final boolean unknownValues;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ WebSocketExtensions(boolean r3, java.lang.Integer r4, boolean r5, java.lang.Integer r6, boolean r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r2 = this;
            r10 = r9 & 1
            r0 = 0
            if (r10 == 0) goto L6
            r3 = r0
        L6:
            r10 = r9 & 2
            r1 = 0
            if (r10 == 0) goto Lc
            r4 = r1
        Lc:
            r10 = r9 & 4
            if (r10 == 0) goto L11
            r5 = r0
        L11:
            r10 = r9 & 8
            if (r10 == 0) goto L16
            r6 = r1
        L16:
            r10 = r9 & 16
            if (r10 == 0) goto L1b
            r7 = r0
        L1b:
            r9 = r9 & 32
            if (r9 == 0) goto L27
            r9 = r0
        L20:
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            goto L29
        L27:
            r9 = r8
            goto L20
        L29:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.WebSocketExtensions.<init>(boolean, java.lang.Integer, boolean, java.lang.Integer, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z9, Integer num, boolean z10, Integer num2, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = webSocketExtensions.perMessageDeflate;
        }
        if ((i10 & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        if ((i10 & 4) != 0) {
            z10 = webSocketExtensions.clientNoContextTakeover;
        }
        if ((i10 & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        if ((i10 & 16) != 0) {
            z11 = webSocketExtensions.serverNoContextTakeover;
        }
        if ((i10 & 32) != 0) {
            z12 = webSocketExtensions.unknownValues;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        return webSocketExtensions.copy(z9, num, z10, num2, z13, z14);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getPerMessageDeflate() {
        return this.perMessageDeflate;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getClientMaxWindowBits() {
        return this.clientMaxWindowBits;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getClientNoContextTakeover() {
        return this.clientNoContextTakeover;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getServerMaxWindowBits() {
        return this.serverMaxWindowBits;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getServerNoContextTakeover() {
        return this.serverNoContextTakeover;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getUnknownValues() {
        return this.unknownValues;
    }

    public final WebSocketExtensions copy(boolean perMessageDeflate, Integer clientMaxWindowBits, boolean clientNoContextTakeover, Integer serverMaxWindowBits, boolean serverNoContextTakeover, boolean unknownValues) {
        return new WebSocketExtensions(perMessageDeflate, clientMaxWindowBits, clientNoContextTakeover, serverMaxWindowBits, serverNoContextTakeover, unknownValues);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) other;
        if (this.perMessageDeflate == webSocketExtensions.perMessageDeflate && Intrinsics.areEqual(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && Intrinsics.areEqual(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        int hashCode;
        boolean z9 = this.perMessageDeflate;
        int i10 = 1;
        ?? r02 = z9;
        if (z9) {
            r02 = 1;
        }
        int i11 = r02 * 31;
        Integer num = this.clientMaxWindowBits;
        int i12 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i13 = (i11 + hashCode) * 31;
        ?? r22 = this.clientNoContextTakeover;
        int i14 = r22;
        if (r22 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        Integer num2 = this.serverMaxWindowBits;
        if (num2 != null) {
            i12 = num2.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        ?? r23 = this.serverNoContextTakeover;
        int i17 = r23;
        if (r23 != 0) {
            i17 = 1;
        }
        int i18 = (i16 + i17) * 31;
        boolean z10 = this.unknownValues;
        if (!z10) {
            i10 = z10 ? 1 : 0;
        }
        return i18 + i10;
    }

    public final boolean noContextTakeover(boolean clientOriginated) {
        if (clientOriginated) {
            return this.clientNoContextTakeover;
        }
        return this.serverNoContextTakeover;
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.perMessageDeflate + ", clientMaxWindowBits=" + this.clientMaxWindowBits + ", clientNoContextTakeover=" + this.clientNoContextTakeover + ", serverMaxWindowBits=" + this.serverMaxWindowBits + ", serverNoContextTakeover=" + this.serverNoContextTakeover + ", unknownValues=" + this.unknownValues + ')';
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lokhttp3/internal/ws/WebSocketExtensions$Companion;", "", "()V", "HEADER_WEB_SOCKET_EXTENSION", "", "parse", "Lokhttp3/internal/ws/WebSocketExtensions;", "responseHeaders", "Lokhttp3/Headers;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WebSocketExtensions parse(Headers responseHeaders) {
            boolean equals;
            boolean equals2;
            String str;
            boolean equals3;
            boolean equals4;
            boolean equals5;
            boolean equals6;
            responseHeaders.getClass();
            int size = responseHeaders.size();
            Integer num = null;
            Integer num2 = null;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            for (int i10 = 0; i10 < size; i10++) {
                equals = StringsKt__StringsJVMKt.equals(responseHeaders.name(i10), WebSocketExtensions.HEADER_WEB_SOCKET_EXTENSION, true);
                if (equals) {
                    String value = responseHeaders.value(i10);
                    int i11 = 0;
                    while (i11 < value.length()) {
                        int delimiterOffset$default = Util.delimiterOffset$default(value, ',', i11, 0, 4, (Object) null);
                        int delimiterOffset = Util.delimiterOffset(value, ';', i11, delimiterOffset$default);
                        String trimSubstring = Util.trimSubstring(value, i11, delimiterOffset);
                        int i12 = delimiterOffset + 1;
                        equals2 = StringsKt__StringsJVMKt.equals(trimSubstring, "permessage-deflate", true);
                        if (equals2) {
                            if (z9) {
                                z12 = true;
                            }
                            i11 = i12;
                            while (i11 < delimiterOffset$default) {
                                int delimiterOffset2 = Util.delimiterOffset(value, ';', i11, delimiterOffset$default);
                                int delimiterOffset3 = Util.delimiterOffset(value, '=', i11, delimiterOffset2);
                                String trimSubstring2 = Util.trimSubstring(value, i11, delimiterOffset3);
                                if (delimiterOffset3 < delimiterOffset2) {
                                    str = StringsKt__StringsKt.removeSurrounding(Util.trimSubstring(value, delimiterOffset3 + 1, delimiterOffset2), (CharSequence) "\"");
                                } else {
                                    str = null;
                                }
                                int i13 = delimiterOffset2 + 1;
                                equals3 = StringsKt__StringsJVMKt.equals(trimSubstring2, "client_max_window_bits", true);
                                if (!equals3) {
                                    equals4 = StringsKt__StringsJVMKt.equals(trimSubstring2, "client_no_context_takeover", true);
                                    if (!equals4) {
                                        equals5 = StringsKt__StringsJVMKt.equals(trimSubstring2, "server_max_window_bits", true);
                                        if (!equals5) {
                                            equals6 = StringsKt__StringsJVMKt.equals(trimSubstring2, "server_no_context_takeover", true);
                                            if (equals6) {
                                                if (z11) {
                                                    z12 = true;
                                                }
                                                if (str != null) {
                                                    z12 = true;
                                                }
                                                i11 = i13;
                                                z11 = true;
                                            }
                                        } else {
                                            if (num2 != null) {
                                                z12 = true;
                                            }
                                            if (str != null) {
                                                num2 = StringsKt.toIntOrNull(str);
                                            } else {
                                                num2 = null;
                                            }
                                            if (num2 != null) {
                                                i11 = i13;
                                            }
                                        }
                                        i11 = i13;
                                        z12 = true;
                                    } else {
                                        if (z10) {
                                            z12 = true;
                                        }
                                        if (str != null) {
                                            z12 = true;
                                        }
                                        i11 = i13;
                                        z10 = true;
                                    }
                                } else {
                                    if (num != null) {
                                        z12 = true;
                                    }
                                    if (str != null) {
                                        num = StringsKt.toIntOrNull(str);
                                    } else {
                                        num = null;
                                    }
                                    if (num == null) {
                                        i11 = i13;
                                        z12 = true;
                                    } else {
                                        i11 = i13;
                                    }
                                }
                            }
                            z9 = true;
                        } else {
                            i11 = i12;
                            z12 = true;
                        }
                    }
                }
            }
            return new WebSocketExtensions(z9, num, z10, num2, z11, z12);
        }

        private Companion() {
        }
    }

    public WebSocketExtensions(boolean z9, Integer num, boolean z10, Integer num2, boolean z11, boolean z12) {
        this.perMessageDeflate = z9;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z10;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z11;
        this.unknownValues = z12;
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }
}
