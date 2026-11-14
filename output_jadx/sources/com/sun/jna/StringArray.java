package com.sun.jna;

import ai.onnxruntime.a;
import com.sun.jna.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class StringArray extends Memory implements Function.PostCallRead {
    private String encoding;
    private List<NativeString> natives;
    private Object[] original;

    private StringArray(Object[] objArr, String str) {
        super((objArr.length + 1) * Native.POINTER_SIZE);
        this.natives = new ArrayList();
        this.original = objArr;
        this.encoding = str;
        int i10 = 0;
        while (true) {
            Pointer pointer = null;
            if (i10 < objArr.length) {
                Object obj = objArr[i10];
                if (obj != null) {
                    NativeString nativeString = new NativeString(obj.toString(), str);
                    this.natives.add(nativeString);
                    pointer = nativeString.getPointer();
                }
                setPointer(Native.POINTER_SIZE * i10, pointer);
                i10++;
            } else {
                setPointer(Native.POINTER_SIZE * objArr.length, null);
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.sun.jna.WString] */
    @Override // com.sun.jna.Function.PostCallRead
    public void read() {
        String str;
        boolean z9 = this.original instanceof WString[];
        boolean equals = "--WIDE-STRING--".equals(this.encoding);
        for (int i10 = 0; i10 < this.original.length; i10++) {
            Pointer pointer = getPointer(Native.POINTER_SIZE * i10);
            if (pointer != null) {
                if (equals) {
                    str = pointer.getWideString(0L);
                } else {
                    str = pointer.getString(0L, this.encoding);
                }
                if (z9) {
                    str = new WString(str);
                }
            } else {
                str = null;
            }
            this.original[i10] = str;
        }
    }

    @Override // com.sun.jna.Memory, com.sun.jna.Pointer
    public String toString() {
        String str;
        if ("--WIDE-STRING--".equals(this.encoding)) {
            str = "const wchar_t*[]";
        } else {
            str = "const char*[]";
        }
        StringBuilder u8 = a.u(str);
        u8.append(Arrays.asList(this.original));
        return u8.toString();
    }

    public StringArray(String[] strArr, boolean z9) {
        this((Object[]) strArr, z9 ? "--WIDE-STRING--" : Native.getDefaultStringEncoding());
    }

    public StringArray(String[] strArr, String str) {
        this((Object[]) strArr, str);
    }

    public StringArray(WString[] wStringArr) {
        this(wStringArr, "--WIDE-STRING--");
    }

    public StringArray(String[] strArr) {
        this(strArr, false);
    }
}
