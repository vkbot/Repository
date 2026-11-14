package androidx.constraintlayout.core.parser;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class CLToken extends CLElement {
    int mIndex;
    char[] mTokenFalse;
    char[] mTokenNull;
    char[] mTokenTrue;
    Type mType;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public enum Type {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public CLToken(char[] cArr) {
        super(cArr);
        this.mIndex = 0;
        this.mType = Type.UNKNOWN;
        this.mTokenTrue = "true".toCharArray();
        this.mTokenFalse = "false".toCharArray();
        this.mTokenNull = "null".toCharArray();
    }

    public static CLElement allocate(char[] cArr) {
        return new CLToken(cArr);
    }

    public boolean getBoolean() {
        Type type = this.mType;
        if (type == Type.TRUE) {
            return true;
        }
        if (type == Type.FALSE) {
            return false;
        }
        throw new CLParsingException("this token is not a boolean: <" + content() + ">", this);
    }

    public Type getType() {
        return this.mType;
    }

    public boolean isNull() {
        if (this.mType == Type.NULL) {
            return true;
        }
        throw new CLParsingException("this token is not a null: <" + content() + ">", this);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i10, int i11) {
        StringBuilder sb = new StringBuilder();
        addIndent(sb, i10);
        sb.append(content());
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        if (CLParser.sDebug) {
            return "<" + content() + ">";
        }
        return content();
    }

    public boolean validate(char c, long j10) {
        int ordinal = this.mType.ordinal();
        boolean z9 = false;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        char[] cArr = this.mTokenNull;
                        int i10 = this.mIndex;
                        if (cArr[i10] == c) {
                            z9 = true;
                        }
                        if (z9 && i10 + 1 == cArr.length) {
                            setEnd(j10);
                        }
                    }
                } else {
                    char[] cArr2 = this.mTokenFalse;
                    int i11 = this.mIndex;
                    if (cArr2[i11] == c) {
                        z9 = true;
                    }
                    if (z9 && i11 + 1 == cArr2.length) {
                        setEnd(j10);
                    }
                }
            } else {
                char[] cArr3 = this.mTokenTrue;
                int i12 = this.mIndex;
                if (cArr3[i12] == c) {
                    z9 = true;
                }
                if (z9 && i12 + 1 == cArr3.length) {
                    setEnd(j10);
                }
            }
        } else {
            char[] cArr4 = this.mTokenTrue;
            int i13 = this.mIndex;
            if (cArr4[i13] == c) {
                this.mType = Type.TRUE;
            } else if (this.mTokenFalse[i13] == c) {
                this.mType = Type.FALSE;
            } else if (this.mTokenNull[i13] == c) {
                this.mType = Type.NULL;
            }
            z9 = true;
        }
        this.mIndex++;
        return z9;
    }
}
