package com.sun.jna;

import n0.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class NativeString implements CharSequence, Comparable {
    static final String WIDE_STRING = "--WIDE-STRING--";
    private String encoding;
    private Pointer pointer;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public class StringMemory extends Memory {
        public StringMemory(long j10) {
            super(j10);
        }

        @Override // com.sun.jna.Memory, com.sun.jna.Pointer
        public String toString() {
            return NativeString.this.toString();
        }
    }

    public NativeString(String str, String str2) {
        if (str != null) {
            this.encoding = str2;
            if (WIDE_STRING.equals(str2)) {
                StringMemory stringMemory = new StringMemory((str.length() + 1) * Native.WCHAR_SIZE);
                this.pointer = stringMemory;
                stringMemory.setWideString(0L, str);
                return;
            } else {
                byte[] bytes = Native.getBytes(str, str2);
                StringMemory stringMemory2 = new StringMemory(bytes.length + 1);
                this.pointer = stringMemory2;
                stringMemory2.write(0L, bytes, 0, bytes.length);
                this.pointer.setByte(bytes.length, (byte) 0);
                return;
            }
        }
        b.n("String must not be null");
        throw null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return toString().charAt(i10);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj == null) {
            return 1;
        }
        return toString().compareTo(obj.toString());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CharSequence) || compareTo(obj) != 0) {
            return false;
        }
        return true;
    }

    public Pointer getPointer() {
        return this.pointer;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    @Override // java.lang.CharSequence
    public int length() {
        return toString().length();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return toString().subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        boolean equals = WIDE_STRING.equals(this.encoding);
        Pointer pointer = this.pointer;
        if (equals) {
            return pointer.getWideString(0L);
        }
        return pointer.getString(0L, this.encoding);
    }

    public NativeString(String str, boolean z9) {
        this(str, z9 ? WIDE_STRING : Native.getDefaultStringEncoding());
    }

    public NativeString(WString wString) {
        this(wString.toString(), WIDE_STRING);
    }

    public NativeString(String str) {
        this(str, Native.getDefaultStringEncoding());
    }
}
