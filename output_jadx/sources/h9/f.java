package h9;

import e9.h;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public interface f {
    d beginCollection(g9.e eVar, int i10);

    d beginStructure(g9.e eVar);

    void encodeBoolean(boolean z9);

    void encodeByte(byte b10);

    void encodeChar(char c);

    void encodeDouble(double d);

    void encodeEnum(g9.e eVar, int i10);

    void encodeFloat(float f8);

    f encodeInline(g9.e eVar);

    void encodeInt(int i10);

    void encodeLong(long j10);

    void encodeNotNullMark();

    void encodeNull();

    void encodeSerializableValue(h hVar, Object obj);

    void encodeShort(short s5);

    void encodeString(String str);

    j9.b getSerializersModule();
}
