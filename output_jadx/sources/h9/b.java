package h9;

import e9.h;
import i9.x0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class b implements f, d {
    @Override // h9.f
    public d beginCollection(g9.e eVar, int i10) {
        eVar.getClass();
        return beginStructure(eVar);
    }

    @Override // h9.f
    public d beginStructure(g9.e eVar) {
        eVar.getClass();
        return this;
    }

    @Override // h9.f
    public void encodeBoolean(boolean z9) {
        encodeValue(Boolean.valueOf(z9));
    }

    @Override // h9.d
    public final void encodeBooleanElement(g9.e eVar, int i10, boolean z9) {
        eVar.getClass();
        if (encodeElement(eVar, i10)) {
            encodeBoolean(z9);
        }
    }

    @Override // h9.f
    public void encodeByte(byte b10) {
        encodeValue(Byte.valueOf(b10));
    }

    @Override // h9.d
    public final void encodeByteElement(g9.e eVar, int i10, byte b10) {
        eVar.getClass();
        if (encodeElement(eVar, i10)) {
            encodeByte(b10);
        }
    }

    @Override // h9.f
    public void encodeChar(char c) {
        encodeValue(Character.valueOf(c));
    }

    @Override // h9.d
    public final void encodeCharElement(g9.e eVar, int i10, char c) {
        eVar.getClass();
        if (encodeElement(eVar, i10)) {
            encodeChar(c);
        }
    }

    @Override // h9.f
    public void encodeDouble(double d) {
        encodeValue(Double.valueOf(d));
    }

    @Override // h9.d
    public final void encodeDoubleElement(g9.e eVar, int i10, double d) {
        eVar.getClass();
        if (encodeElement(eVar, i10)) {
            encodeDouble(d);
        }
    }

    public boolean encodeElement(g9.e eVar, int i10) {
        eVar.getClass();
        return true;
    }

    @Override // h9.f
    public void encodeEnum(g9.e eVar, int i10) {
        eVar.getClass();
        encodeValue(Integer.valueOf(i10));
    }

    @Override // h9.f
    public void encodeFloat(float f8) {
        encodeValue(Float.valueOf(f8));
    }

    @Override // h9.d
    public final void encodeFloatElement(g9.e eVar, int i10, float f8) {
        eVar.getClass();
        if (encodeElement(eVar, i10)) {
            encodeFloat(f8);
        }
    }

    @Override // h9.f
    public f encodeInline(g9.e eVar) {
        eVar.getClass();
        return this;
    }

    @Override // h9.d
    public final f encodeInlineElement(g9.e eVar, int i10) {
        eVar.getClass();
        if (encodeElement(eVar, i10)) {
            return encodeInline(eVar.f(i10));
        }
        return x0.f2959a;
    }

    @Override // h9.f
    public void encodeInt(int i10) {
        encodeValue(Integer.valueOf(i10));
    }

    @Override // h9.d
    public final void encodeIntElement(g9.e eVar, int i10, int i11) {
        eVar.getClass();
        if (encodeElement(eVar, i10)) {
            encodeInt(i11);
        }
    }

    @Override // h9.f
    public void encodeLong(long j10) {
        encodeValue(Long.valueOf(j10));
    }

    @Override // h9.d
    public final void encodeLongElement(g9.e eVar, int i10, long j10) {
        eVar.getClass();
        if (encodeElement(eVar, i10)) {
            encodeLong(j10);
        }
    }

    public <T> void encodeNullableSerializableElement(g9.e eVar, int i10, h hVar, T t) {
        eVar.getClass();
        hVar.getClass();
        if (encodeElement(eVar, i10)) {
            encodeNullableSerializableValue(hVar, t);
        }
    }

    public <T> void encodeNullableSerializableValue(h hVar, T t) {
        hVar.getClass();
        if (hVar.a().c()) {
            encodeSerializableValue(hVar, t);
        } else if (t == null) {
            encodeNull();
        } else {
            encodeNotNullMark();
            encodeSerializableValue(hVar, t);
        }
    }

    @Override // h9.d
    public <T> void encodeSerializableElement(g9.e eVar, int i10, h hVar, T t) {
        eVar.getClass();
        hVar.getClass();
        if (encodeElement(eVar, i10)) {
            encodeSerializableValue(hVar, t);
        }
    }

    @Override // h9.f
    public void encodeSerializableValue(h hVar, Object obj) {
        hVar.getClass();
        hVar.b(this, obj);
    }

    @Override // h9.f
    public void encodeShort(short s5) {
        encodeValue(Short.valueOf(s5));
    }

    @Override // h9.d
    public final void encodeShortElement(g9.e eVar, int i10, short s5) {
        eVar.getClass();
        if (encodeElement(eVar, i10)) {
            encodeShort(s5);
        }
    }

    @Override // h9.f
    public void encodeString(String str) {
        str.getClass();
        encodeValue(str);
    }

    @Override // h9.d
    public final void encodeStringElement(g9.e eVar, int i10, String str) {
        eVar.getClass();
        str.getClass();
        if (encodeElement(eVar, i10)) {
            encodeString(str);
        }
    }

    public abstract void encodeValue(Object obj);

    @Override // h9.d
    public void endStructure(g9.e eVar) {
        eVar.getClass();
    }

    public boolean shouldEncodeElementDefault(g9.e eVar, int i10) {
        eVar.getClass();
        return true;
    }

    @Override // h9.f
    public void encodeNotNullMark() {
    }
}
