package androidx.navigation.serialization;

import ai.onnxruntime.a;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import e9.h;
import g9.e;
import h9.b;
import h9.f;
import j9.c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u00062\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u00020\r\"\u0004\b\u0001\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R(\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u001a\u0010&\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R&\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010$R\u0016\u0010,\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Landroidx/navigation/serialization/RouteEncoder;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lh9/b;", "Le9/b;", "serializer", "", "", "Landroidx/navigation/NavType;", "typeMap", "<init>", "(Le9/b;Ljava/util/Map;)V", "value", "", "internalEncodeValue", "(Ljava/lang/Object;)V", "", "encodeToArgMap", "(Ljava/lang/Object;)Ljava/util/Map;", "Le9/h;", "encodeSerializableValue", "(Le9/h;Ljava/lang/Object;)V", "Lg9/e;", "descriptor", "", "index", "", "encodeElement", "(Lg9/e;I)Z", "encodeValue", "encodeNull", "()V", "Lh9/f;", "encodeInline", "(Lg9/e;)Lh9/f;", "Le9/b;", "Ljava/util/Map;", "Lj9/b;", "serializersModule", "Lj9/b;", "getSerializersModule", "()Lj9/b;", "", "map", "elementIndex", "I", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class RouteEncoder<T> extends b {
    private int elementIndex;
    private final Map<String, List<String>> map;
    private final e9.b serializer;
    private final j9.b serializersModule;
    private final Map<String, NavType<Object>> typeMap;

    /* JADX WARN: Multi-variable type inference failed */
    public RouteEncoder(e9.b bVar, Map<String, ? extends NavType<Object>> map) {
        bVar.getClass();
        map.getClass();
        this.serializer = bVar;
        this.typeMap = map;
        this.serializersModule = c.f3352a;
        this.map = new LinkedHashMap();
        this.elementIndex = -1;
    }

    private final void internalEncodeValue(Object value) {
        List<String> listOf;
        String e = this.serializer.a().e(this.elementIndex);
        NavType<Object> navType = this.typeMap.get(e);
        if (navType != null) {
            if (navType instanceof CollectionNavType) {
                listOf = ((CollectionNavType) navType).serializeAsValues(value);
            } else {
                listOf = CollectionsKt.listOf(navType.serializeAsValue(value));
            }
            this.map.put(e, listOf);
            return;
        }
        throw new IllegalStateException(a.m("Cannot find NavType for argument ", e, ". Please provide NavType through typeMap.").toString());
    }

    @Override // h9.b
    public boolean encodeElement(e descriptor, int index) {
        descriptor.getClass();
        this.elementIndex = index;
        return true;
    }

    @Override // h9.b, h9.f
    public f encodeInline(e descriptor) {
        descriptor.getClass();
        if (RouteSerializerKt.isValueClass(descriptor)) {
            this.elementIndex = 0;
        }
        descriptor.getClass();
        return this;
    }

    @Override // h9.f
    public void encodeNull() {
        internalEncodeValue(null);
    }

    @Override // h9.b, h9.f
    public <T> void encodeSerializableValue(h serializer, T value) {
        serializer.getClass();
        internalEncodeValue(value);
    }

    public final Map<String, List<String>> encodeToArgMap(Object value) {
        value.getClass();
        super.encodeSerializableValue(this.serializer, value);
        return MapsKt.toMap(this.map);
    }

    @Override // h9.b
    public void encodeValue(Object value) {
        value.getClass();
        internalEncodeValue(value);
    }

    @Override // h9.f
    public j9.b getSerializersModule() {
        return this.serializersModule;
    }
}
