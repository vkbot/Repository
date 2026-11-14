package h9;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class a implements e, c {
    public static /* synthetic */ Object decodeSerializableValue$default(a aVar, e9.a aVar2, Object obj, int i10, Object obj2) {
        if (obj2 == null) {
            if ((i10 & 2) != 0) {
                obj = null;
            }
            return aVar.decodeSerializableValue(aVar2, obj);
        }
        androidx.navigation.b.g("Super calls with default arguments not supported in this target, function: decodeSerializableValue");
        return null;
    }

    @Override // h9.e
    public c beginStructure(g9.e eVar) {
        eVar.getClass();
        return this;
    }

    @Override // h9.e
    public boolean decodeBoolean() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Boolean) decodeValue).booleanValue();
    }

    @Override // h9.c
    public final boolean decodeBooleanElement(g9.e eVar, int i10) {
        eVar.getClass();
        return decodeBoolean();
    }

    @Override // h9.e
    public byte decodeByte() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Byte) decodeValue).byteValue();
    }

    @Override // h9.c
    public final byte decodeByteElement(g9.e eVar, int i10) {
        eVar.getClass();
        return decodeByte();
    }

    @Override // h9.e
    public char decodeChar() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Character) decodeValue).charValue();
    }

    @Override // h9.c
    public final char decodeCharElement(g9.e eVar, int i10) {
        eVar.getClass();
        return decodeChar();
    }

    @Override // h9.c
    public int decodeCollectionSize(g9.e eVar) {
        eVar.getClass();
        return -1;
    }

    @Override // h9.e
    public double decodeDouble() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Double) decodeValue).doubleValue();
    }

    @Override // h9.c
    public final double decodeDoubleElement(g9.e eVar, int i10) {
        eVar.getClass();
        return decodeDouble();
    }

    @Override // h9.e
    public int decodeEnum(g9.e eVar) {
        eVar.getClass();
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Integer) decodeValue).intValue();
    }

    @Override // h9.e
    public float decodeFloat() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Float) decodeValue).floatValue();
    }

    @Override // h9.c
    public final float decodeFloatElement(g9.e eVar, int i10) {
        eVar.getClass();
        return decodeFloat();
    }

    @Override // h9.e
    public abstract e decodeInline(g9.e eVar);

    @Override // h9.c
    public e decodeInlineElement(g9.e eVar, int i10) {
        eVar.getClass();
        return decodeInline(eVar.f(i10));
    }

    @Override // h9.e
    public int decodeInt() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Integer) decodeValue).intValue();
    }

    @Override // h9.c
    public final int decodeIntElement(g9.e eVar, int i10) {
        eVar.getClass();
        return decodeInt();
    }

    @Override // h9.e
    public long decodeLong() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Long) decodeValue).longValue();
    }

    @Override // h9.c
    public final long decodeLongElement(g9.e eVar, int i10) {
        eVar.getClass();
        return decodeLong();
    }

    public final <T> T decodeNullableSerializableElement(g9.e eVar, int i10, e9.a aVar, T t) {
        eVar.getClass();
        aVar.getClass();
        if (!aVar.a().c() && !decodeNotNullMark()) {
            return (T) decodeNull();
        }
        return (T) decodeSerializableValue(aVar, t);
    }

    public <T> T decodeNullableSerializableValue(e9.a aVar) {
        aVar.getClass();
        if (!aVar.a().c() && !decodeNotNullMark()) {
            return (T) decodeNull();
        }
        return (T) decodeSerializableValue(aVar);
    }

    @Override // h9.c
    public boolean decodeSequentially() {
        return false;
    }

    @Override // h9.c
    public <T> T decodeSerializableElement(g9.e eVar, int i10, e9.a aVar, T t) {
        eVar.getClass();
        aVar.getClass();
        return (T) decodeSerializableValue(aVar, t);
    }

    @Override // h9.e
    public abstract Object decodeSerializableValue(e9.a aVar);

    public <T> T decodeSerializableValue(e9.a aVar, T t) {
        aVar.getClass();
        return (T) decodeSerializableValue(aVar);
    }

    @Override // h9.e
    public short decodeShort() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Short) decodeValue).shortValue();
    }

    @Override // h9.c
    public final short decodeShortElement(g9.e eVar, int i10) {
        eVar.getClass();
        return decodeShort();
    }

    @Override // h9.e
    public String decodeString() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return (String) decodeValue;
    }

    @Override // h9.c
    public final String decodeStringElement(g9.e eVar, int i10) {
        eVar.getClass();
        return decodeString();
    }

    public abstract Object decodeValue();

    @Override // h9.c
    public void endStructure(g9.e eVar) {
        eVar.getClass();
    }
}
