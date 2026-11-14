package h9;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public interface c {
    boolean decodeBooleanElement(g9.e eVar, int i10);

    byte decodeByteElement(g9.e eVar, int i10);

    char decodeCharElement(g9.e eVar, int i10);

    int decodeCollectionSize(g9.e eVar);

    double decodeDoubleElement(g9.e eVar, int i10);

    int decodeElementIndex(g9.e eVar);

    float decodeFloatElement(g9.e eVar, int i10);

    e decodeInlineElement(g9.e eVar, int i10);

    int decodeIntElement(g9.e eVar, int i10);

    long decodeLongElement(g9.e eVar, int i10);

    boolean decodeSequentially();

    Object decodeSerializableElement(g9.e eVar, int i10, e9.a aVar, Object obj);

    short decodeShortElement(g9.e eVar, int i10);

    String decodeStringElement(g9.e eVar, int i10);

    void endStructure(g9.e eVar);

    j9.b getSerializersModule();
}
