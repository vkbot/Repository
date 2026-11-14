package androidx.collection;

import ai.onnxruntime.a;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.b;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J&\u0010\u0018\u001a\u00020\u00192\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00190\u001bH\u0086\bø\u0001\u0000J\u0006\u0010\u001c\u001a\u00020\u0019J&\u0010\u001c\u001a\u00020\u00192\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00190\u001bH\u0086\bø\u0001\u0000J\u0016\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00028\u0000¢\u0006\u0002\u0010\u001fJ\u000e\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0005J\u0006\u0010#\u001a\u00020\u0005J&\u0010#\u001a\u00020\u00052\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00190\u001bH\u0086\bø\u0001\u0000J\u0013\u0010$\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0015\u0010&\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00028\u0000H\u0001¢\u0006\u0002\u0010'JD\u0010(\u001a\u00020)26\u0010*\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020)0\u001bH\u0086\bø\u0001\u0000J/\u0010-\u001a\u00020)2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020)0.H\u0081\bø\u0001\u0000J/\u00100\u001a\u00020)2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020)0.H\u0086\bø\u0001\u0000J/\u00101\u001a\u00020)2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020)0.H\u0086\bø\u0001\u0000J\u0016\u00102\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010'J\u001b\u00103\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00028\u00002\u0006\u00104\u001a\u00020\u0005¢\u0006\u0002\u00105J'\u00106\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00028\u00002\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000507H\u0086\bø\u0001\u0000¢\u0006\u0002\u00108J\b\u00109\u001a\u00020\u0005H\u0016J\u0006\u0010:\u001a\u00020\u0019J\u0006\u0010;\u001a\u00020\u0019J:\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020?2\b\b\u0002\u0010A\u001a\u00020?2\b\b\u0002\u0010B\u001a\u00020\u00052\b\b\u0002\u0010C\u001a\u00020?H\u0007Jx\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020?2\b\b\u0002\u0010A\u001a\u00020?2\b\b\u0002\u0010B\u001a\u00020\u00052\b\b\u0002\u0010C\u001a\u00020?28\b\u0004\u0010D\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020?0\u001bH\u0087\bø\u0001\u0000J\u0006\u0010E\u001a\u00020\u0019J\b\u0010F\u001a\u00020=H\u0016R\u0018\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0018\u0010\u0007\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u0011\u0010\t\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010\u000f\u0012\u0004\b\u000e\u0010\u0003R\u0018\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0003R\u0011\u0010\u0013\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000bR\u0018\u0010\u0015\u001a\u00020\u00168\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0003\u0082\u0001\u0001G\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006H"}, d2 = {"Landroidx/collection/ObjectIntMap;", "K", "", "()V", "_capacity", "", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "capacity", "getCapacity", "()I", "keys", "", "getKeys$annotations", "[Ljava/lang/Object;", "metadata", "", "getMetadata$annotations", "size", "getSize", "values", "", "getValues$annotations", "all", "", "predicate", "Lkotlin/Function2;", "any", "contains", "key", "(Ljava/lang/Object;)Z", "containsKey", "containsValue", "value", "count", "equals", "other", "findKeyIndex", "(Ljava/lang/Object;)I", "forEach", "", "block", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function1;", "index", "forEachKey", "forEachValue", "get", "getOrDefault", "defaultValue", "(Ljava/lang/Object;I)I", "getOrElse", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)I", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "none", "toString", "Landroidx/collection/MutableObjectIntMap;", "collection"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nObjectIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1074:1\n373#1,6:1077\n383#1,3:1084\n386#1,9:1088\n373#1,6:1097\n383#1,3:1104\n386#1,9:1108\n373#1,6:1117\n383#1,3:1124\n386#1,9:1128\n401#1,4:1137\n373#1,6:1141\n383#1,3:1148\n386#1,2:1152\n406#1,2:1154\n389#1,6:1156\n408#1:1162\n401#1,4:1163\n373#1,6:1167\n383#1,3:1174\n386#1,2:1178\n406#1,2:1180\n389#1,6:1182\n408#1:1188\n401#1,4:1189\n373#1,6:1193\n383#1,3:1200\n386#1,2:1204\n406#1,2:1206\n389#1,6:1208\n408#1:1214\n428#1,3:1215\n373#1,6:1218\n383#1,3:1225\n386#1,2:1229\n431#1,2:1231\n389#1,6:1233\n433#1:1239\n401#1,4:1240\n373#1,6:1244\n383#1,3:1251\n386#1,2:1255\n406#1,2:1257\n389#1,6:1259\n408#1:1265\n401#1,4:1266\n373#1,6:1270\n383#1,3:1277\n386#1,2:1281\n406#1,2:1283\n389#1,6:1285\n408#1:1291\n401#1,4:1292\n373#1,6:1296\n383#1,3:1303\n386#1,2:1307\n406#1,2:1309\n389#1,6:1311\n408#1:1317\n401#1,4:1318\n373#1,6:1322\n383#1,3:1329\n386#1,2:1333\n406#1,2:1335\n389#1,6:1337\n408#1:1343\n401#1,4:1344\n373#1,6:1348\n383#1,3:1355\n386#1,2:1359\n406#1,2:1361\n389#1,6:1363\n408#1:1369\n401#1,4:1370\n373#1,6:1374\n383#1,3:1381\n386#1,2:1385\n406#1,2:1387\n389#1,6:1389\n408#1:1395\n537#1,11:1412\n401#1,4:1423\n373#1,6:1427\n383#1,3:1434\n386#1,2:1438\n406#1:1440\n548#1,10:1441\n407#1:1451\n389#1,6:1452\n408#1:1458\n558#1,2:1459\n537#1,11:1461\n401#1,4:1472\n373#1,6:1476\n383#1,3:1483\n386#1,2:1487\n406#1:1489\n548#1,10:1490\n407#1:1500\n389#1,6:1501\n408#1:1507\n558#1,2:1508\n537#1,11:1510\n401#1,4:1521\n373#1,6:1525\n383#1,3:1532\n386#1,2:1536\n406#1:1538\n548#1,10:1539\n407#1:1549\n389#1,6:1550\n408#1:1556\n558#1,2:1557\n537#1,11:1559\n401#1,4:1570\n373#1,6:1574\n383#1,3:1581\n386#1,2:1585\n406#1:1587\n548#1,10:1588\n407#1:1598\n389#1,6:1599\n408#1:1605\n558#1,2:1606\n537#1,11:1608\n401#1,4:1619\n373#1,6:1623\n383#1,3:1630\n386#1,2:1634\n406#1:1636\n548#1,10:1637\n407#1:1647\n389#1,6:1648\n408#1:1654\n558#1,2:1655\n1826#2:1075\n1688#2:1076\n1826#2:1083\n1688#2:1087\n1826#2:1103\n1688#2:1107\n1826#2:1123\n1688#2:1127\n1826#2:1147\n1688#2:1151\n1826#2:1173\n1688#2:1177\n1826#2:1199\n1688#2:1203\n1826#2:1224\n1688#2:1228\n1826#2:1250\n1688#2:1254\n1826#2:1276\n1688#2:1280\n1826#2:1302\n1688#2:1306\n1826#2:1328\n1688#2:1332\n1826#2:1354\n1688#2:1358\n1826#2:1380\n1688#2:1384\n1605#2,3:1396\n1619#2:1399\n1615#2:1400\n1795#2,3:1401\n1809#2,3:1404\n1733#2:1407\n1721#2:1408\n1715#2:1409\n1728#2:1410\n1818#2:1411\n1826#2:1433\n1688#2:1437\n1826#2:1482\n1688#2:1486\n1826#2:1531\n1688#2:1535\n1826#2:1580\n1688#2:1584\n1826#2:1629\n1688#2:1633\n*S KotlinDebug\n*F\n+ 1 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n*L\n404#1:1077,6\n404#1:1084,3\n404#1:1088,9\n417#1:1097,6\n417#1:1104,3\n417#1:1108,9\n430#1:1117,6\n430#1:1124,3\n430#1:1128,9\n439#1:1137,4\n439#1:1141,6\n439#1:1148,3\n439#1:1152,2\n439#1:1154,2\n439#1:1156,6\n439#1:1162\n449#1:1163,4\n449#1:1167,6\n449#1:1174,3\n449#1:1178,2\n449#1:1180,2\n449#1:1182,6\n449#1:1188\n465#1:1189,4\n465#1:1193,6\n465#1:1200,3\n465#1:1204,2\n465#1:1206,2\n465#1:1208,6\n465#1:1214\n488#1:1215,3\n488#1:1218,6\n488#1:1225,3\n488#1:1229,2\n488#1:1231,2\n488#1:1233,6\n488#1:1239\n512#1:1240,4\n512#1:1244,6\n512#1:1251,3\n512#1:1255,2\n512#1:1257,2\n512#1:1259,6\n512#1:1265\n547#1:1266,4\n547#1:1270,6\n547#1:1277,3\n547#1:1281,2\n547#1:1283,2\n547#1:1285,6\n547#1:1291\n547#1:1292,4\n547#1:1296,6\n547#1:1303,3\n547#1:1307,2\n547#1:1309,2\n547#1:1311,6\n547#1:1317\n568#1:1318,4\n568#1:1322,6\n568#1:1329,3\n568#1:1333,2\n568#1:1335,2\n568#1:1337,6\n568#1:1343\n597#1:1344,4\n597#1:1348,6\n597#1:1355,3\n597#1:1359,2\n597#1:1361,2\n597#1:1363,6\n597#1:1369\n619#1:1370,4\n619#1:1374,6\n619#1:1381,3\n619#1:1385,2\n619#1:1387,2\n619#1:1389,6\n619#1:1395\n-1#1:1412,11\n-1#1:1423,4\n-1#1:1427,6\n-1#1:1434,3\n-1#1:1438,2\n-1#1:1440\n-1#1:1441,10\n-1#1:1451\n-1#1:1452,6\n-1#1:1458\n-1#1:1459,2\n-1#1:1461,11\n-1#1:1472,4\n-1#1:1476,6\n-1#1:1483,3\n-1#1:1487,2\n-1#1:1489\n-1#1:1490,10\n-1#1:1500\n-1#1:1501,6\n-1#1:1507\n-1#1:1508,2\n-1#1:1510,11\n-1#1:1521,4\n-1#1:1525,6\n-1#1:1532,3\n-1#1:1536,2\n-1#1:1538\n-1#1:1539,10\n-1#1:1549\n-1#1:1550,6\n-1#1:1556\n-1#1:1557,2\n-1#1:1559,11\n-1#1:1570,4\n-1#1:1574,6\n-1#1:1581,3\n-1#1:1585,2\n-1#1:1587\n-1#1:1588,10\n-1#1:1598\n-1#1:1599,6\n-1#1:1605\n-1#1:1606,2\n-1#1:1608,11\n-1#1:1619,4\n-1#1:1623,6\n-1#1:1630,3\n-1#1:1634,2\n-1#1:1636\n-1#1:1637,10\n-1#1:1647\n-1#1:1648,6\n-1#1:1654\n-1#1:1655,2\n378#1:1075\n385#1:1076\n404#1:1083\n404#1:1087\n417#1:1103\n417#1:1107\n430#1:1123\n430#1:1127\n439#1:1147\n439#1:1151\n449#1:1173\n449#1:1177\n465#1:1199\n465#1:1203\n488#1:1224\n488#1:1228\n512#1:1250\n512#1:1254\n547#1:1276\n547#1:1280\n547#1:1302\n547#1:1306\n568#1:1328\n568#1:1332\n597#1:1354\n597#1:1358\n619#1:1380\n619#1:1384\n638#1:1396,3\n639#1:1399\n642#1:1400\n646#1:1401,3\n647#1:1404,3\n648#1:1407\n649#1:1408\n649#1:1409\n653#1:1410\n656#1:1411\n-1#1:1433\n-1#1:1437\n-1#1:1482\n-1#1:1486\n-1#1:1531\n-1#1:1535\n-1#1:1580\n-1#1:1584\n-1#1:1629\n-1#1:1633\n*E\n"})
/* loaded from: classes.dex */
public abstract class ObjectIntMap<K> {

    @JvmField
    public int _capacity;

    @JvmField
    public int _size;

    @JvmField
    public Object[] keys;

    @JvmField
    public long[] metadata;

    @JvmField
    public int[] values;

    private ObjectIntMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = ContainerHelpersKt.EMPTY_OBJECTS;
        this.values = IntSetKt.getEmptyIntArray();
    }

    public static /* synthetic */ String joinToString$default(ObjectIntMap objectIntMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function2 function2, int i11, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i12;
        CharSequence charSequence7;
        long[] jArr;
        long[] jArr2;
        int i13;
        if (obj == null) {
            if ((i11 & 1) != 0) {
                charSequence5 = ", ";
            } else {
                charSequence5 = charSequence;
            }
            CharSequence charSequence8 = "";
            if ((i11 & 2) != 0) {
                charSequence6 = "";
            } else {
                charSequence6 = charSequence2;
            }
            if ((i11 & 4) == 0) {
                charSequence8 = charSequence3;
            }
            if ((i11 & 8) != 0) {
                i12 = -1;
            } else {
                i12 = i10;
            }
            if ((i11 & 16) != 0) {
                charSequence7 = "...";
            } else {
                charSequence7 = charSequence4;
            }
            StringBuilder s5 = a.s(charSequence5, charSequence6, charSequence8, charSequence7, function2);
            s5.append(charSequence6);
            Object[] objArr = objectIntMap.keys;
            int[] iArr = objectIntMap.values;
            long[] jArr3 = objectIntMap.metadata;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i14 = 0;
                int i15 = 0;
                loop0: while (true) {
                    long j10 = jArr3[i14];
                    int i16 = i14;
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i17 = 8;
                        int i18 = 8 - ((~(i16 - length)) >>> 31);
                        int i19 = 0;
                        while (i19 < i18) {
                            if ((j10 & 255) < 128) {
                                int i20 = (i16 << 3) + i19;
                                i13 = i17;
                                Object obj2 = objArr[i20];
                                int i21 = iArr[i20];
                                if (i15 == i12) {
                                    s5.append(charSequence7);
                                    break loop0;
                                }
                                if (i15 != 0) {
                                    s5.append(charSequence5);
                                }
                                jArr2 = jArr3;
                                s5.append((CharSequence) function2.invoke(obj2, Integer.valueOf(i21)));
                                i15++;
                            } else {
                                jArr2 = jArr3;
                                i13 = i17;
                            }
                            j10 >>= i13;
                            i19++;
                            i17 = i13;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i18 != i17) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i16 == length) {
                        break;
                    }
                    i14 = i16 + 1;
                    jArr3 = jArr;
                }
                return s5.toString();
            }
            s5.append(charSequence8);
            return s5.toString();
        }
        b.g("Super calls with default arguments not supported in this target, function: joinToString");
        return null;
    }

    public final boolean all(Function2<? super K, ? super Integer, Boolean> predicate) {
        predicate.getClass();
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (!predicate.invoke(objArr[i13], Integer.valueOf(iArr[i13])).booleanValue()) {
                                return false;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return true;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    public final boolean any(Function2<? super K, ? super Integer, Boolean> predicate) {
        predicate.getClass();
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (predicate.invoke(objArr[i13], Integer.valueOf(iArr[i13])).booleanValue()) {
                                return true;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    public final boolean contains(K key) {
        if (findKeyIndex(key) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsKey(K key) {
        if (findKeyIndex(key) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(int value) {
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && value == iArr[(i10 << 3) + i12]) {
                            return true;
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    public final int count(Function2<? super K, ? super Integer, Boolean> predicate) {
        predicate.getClass();
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        int i14 = (i10 << 3) + i13;
                        if (predicate.invoke(objArr[i14], Integer.valueOf(iArr[i14])).booleanValue()) {
                            i11++;
                        }
                    }
                    j10 >>= 8;
                }
                if (i12 != 8) {
                    return i11;
                }
            }
            if (i10 != length) {
                i10++;
            } else {
                return i11;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ObjectIntMap)) {
            return false;
        }
        ObjectIntMap objectIntMap = (ObjectIntMap) other;
        if (objectIntMap.get_size() != get_size()) {
            return false;
        }
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (iArr[i13] != objectIntMap.get(objArr[i13])) {
                                return false;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return true;
    }

    @PublishedApi
    public final int findKeyIndex(K key) {
        int i10;
        int i11 = 0;
        if (key != null) {
            i10 = key.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * ScatterMapKt.MurmurHashC1;
        int i13 = i12 ^ (i12 << 16);
        int i14 = i13 & 127;
        int i15 = this._capacity;
        int i16 = i13 >>> 7;
        while (true) {
            int i17 = i16 & i15;
            long[] jArr = this.metadata;
            int i18 = i17 >> 3;
            int i19 = (i17 & 7) << 3;
            long j10 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j11 = (i14 * ScatterMapKt.BitmaskLsb) ^ j10;
            for (long j12 = (~j11) & (j11 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i17) & i15;
                if (Intrinsics.areEqual(this.keys[numberOfTrailingZeros], key)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i11 += 8;
            i16 = i17 + i11;
        }
    }

    public final void forEach(Function2<? super K, ? super Integer, Unit> block) {
        block.getClass();
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            block.invoke(objArr[i13], Integer.valueOf(iArr[i13]));
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    @PublishedApi
    public final void forEachIndexed(Function1<? super Integer, Unit> block) {
        block.getClass();
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            a.z(i10 << 3, i12, block);
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void forEachKey(Function1<? super K, Unit> block) {
        block.getClass();
        Object[] objArr = this.keys;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            block.invoke(objArr[(i10 << 3) + i12]);
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void forEachValue(Function1<? super Integer, Unit> block) {
        block.getClass();
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            block.invoke(Integer.valueOf(iArr[(i10 << 3) + i12]));
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final int get(K key) {
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        ai.onnxruntime.b.r(key, "There is no key ", " in the map");
        return 0;
    }

    /* renamed from: getCapacity, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    public final int getOrDefault(K key, int defaultValue) {
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        return defaultValue;
    }

    public final int getOrElse(K key, Function0<Integer> defaultValue) {
        defaultValue.getClass();
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        return defaultValue.invoke().intValue();
    }

    /* renamed from: getSize, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public int hashCode() {
        int i10;
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j10) < 128) {
                        int i15 = (i11 << 3) + i14;
                        Object obj = objArr[i15];
                        int i16 = iArr[i15];
                        if (obj != null) {
                            i10 = obj.hashCode();
                        } else {
                            i10 = 0;
                        }
                        i12 += Integer.hashCode(i16) ^ i10;
                    }
                    j10 >>= 8;
                }
                if (i13 != 8) {
                    return i12;
                }
            }
            if (i11 != length) {
                i11++;
            } else {
                return i12;
            }
        }
    }

    public final boolean isEmpty() {
        if (this._size == 0) {
            return true;
        }
        return false;
    }

    public final boolean isNotEmpty() {
        if (this._size != 0) {
            return true;
        }
        return false;
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function2<? super K, ? super Integer, ? extends CharSequence> transform) {
        Object[] objArr;
        Object[] objArr2;
        CharSequence charSequence = separator;
        StringBuilder s5 = a.s(charSequence, prefix, postfix, truncated, transform);
        s5.append(prefix);
        Object[] objArr3 = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            loop0: while (true) {
                long j10 = jArr[i10];
                int i12 = i10;
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j10 & 255) < 128) {
                            int i15 = (i12 << 3) + i14;
                            Object obj = objArr3[i15];
                            int i16 = iArr[i15];
                            objArr2 = objArr3;
                            if (i11 == limit) {
                                s5.append(truncated);
                                break loop0;
                            }
                            if (i11 != 0) {
                                s5.append(charSequence);
                            }
                            s5.append(transform.invoke(obj, Integer.valueOf(i16)));
                            i11++;
                        } else {
                            objArr2 = objArr3;
                        }
                        j10 >>= 8;
                        i14++;
                        charSequence = separator;
                        objArr3 = objArr2;
                    }
                    objArr = objArr3;
                    if (i13 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                }
                if (i12 == length) {
                    break;
                }
                i10 = i12 + 1;
                charSequence = separator;
                objArr3 = objArr;
            }
            return s5.toString();
        }
        s5.append(postfix);
        return s5.toString();
    }

    public final boolean none() {
        if (this._size == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i10 << 3) + i13;
                            Object obj = objArr[i14];
                            int i15 = iArr[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i15);
                            i11++;
                            if (i11 < this._size) {
                                sb.append(", ");
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ ObjectIntMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @PublishedApi
    public static /* synthetic */ void getKeys$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getValues$annotations() {
    }

    public static /* synthetic */ void get_capacity$collection$annotations() {
    }

    public static /* synthetic */ void get_size$collection$annotations() {
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final int count() {
        return get_size();
    }

    @JvmOverloads
    public final String joinToString(CharSequence charSequence) {
        charSequence.getClass();
        return joinToString$default(this, charSequence, null, null, 0, null, 30, null);
    }

    @JvmOverloads
    public final String joinToString(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        return joinToString$default(this, charSequence, charSequence2, null, 0, null, 28, null);
    }

    @JvmOverloads
    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        a.B(charSequence, charSequence2, charSequence3);
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, null, 24, null);
    }

    @JvmOverloads
    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10) {
        a.B(charSequence, charSequence2, charSequence3);
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i10, null, 16, null);
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        Object[] objArr;
        Object[] objArr2;
        int i10;
        StringBuilder r = a.r(separator, prefix, postfix, truncated, prefix);
        Object[] objArr3 = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            loop0: while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i11 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j10 & 255) < 128) {
                            int i16 = (i11 << 3) + i15;
                            i10 = i13;
                            Object obj = objArr3[i16];
                            int i17 = iArr[i16];
                            objArr2 = objArr3;
                            if (i12 == limit) {
                                r.append(truncated);
                                break loop0;
                            }
                            if (i12 != 0) {
                                r.append(separator);
                            }
                            r.append(obj);
                            r.append('=');
                            r.append(i17);
                            i12++;
                        } else {
                            objArr2 = objArr3;
                            i10 = i13;
                        }
                        j10 >>= i10;
                        i15++;
                        objArr3 = objArr2;
                        i13 = i10;
                    }
                    objArr = objArr3;
                    if (i14 != i13) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                objArr3 = objArr;
            }
            return r.toString();
        }
        r.append(postfix);
        return r.toString();
    }

    @JvmOverloads
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    @JvmOverloads
    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, Function2<? super K, ? super Integer, ? extends CharSequence> function2) {
        int i11;
        StringBuilder t = a.t(charSequence, charSequence2, charSequence3, function2, charSequence2);
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            loop0: while (true) {
                long j10 = jArr[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i12 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j10 & 255) < 128) {
                            int i17 = (i12 << 3) + i16;
                            i11 = i14;
                            Object obj = objArr[i17];
                            int i18 = iArr[i17];
                            if (i13 == i10) {
                                t.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i13 != 0) {
                                t.append(charSequence);
                            }
                            t.append(function2.invoke(obj, Integer.valueOf(i18)));
                            i13++;
                        } else {
                            i11 = i14;
                        }
                        j10 >>= i11;
                        i16++;
                        i14 = i11;
                    }
                    if (i15 != i14) {
                        break;
                    }
                }
                if (i12 == length) {
                    break;
                }
                i12++;
            }
        }
        t.append(charSequence3);
        return t.toString();
    }

    public static /* synthetic */ String joinToString$default(ObjectIntMap objectIntMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
        if (obj != null) {
            b.g("Super calls with default arguments not supported in this target, function: joinToString");
            return null;
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return objectIntMap.joinToString(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    @JvmOverloads
    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Function2<? super K, ? super Integer, ? extends CharSequence> function2) {
        int i10;
        StringBuilder t = a.t(charSequence, charSequence2, charSequence3, function2, charSequence2);
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            loop0: while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i11 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j10 & 255) < 128) {
                            int i16 = (i11 << 3) + i15;
                            i10 = i13;
                            Object obj = objArr[i16];
                            int i17 = iArr[i16];
                            if (i12 == -1) {
                                t.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i12 != 0) {
                                t.append(charSequence);
                            }
                            t.append(function2.invoke(obj, Integer.valueOf(i17)));
                            i12++;
                        } else {
                            i10 = i13;
                        }
                        j10 >>= i10;
                        i15++;
                        i13 = i10;
                    }
                    if (i14 != i13) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        t.append(charSequence3);
        return t.toString();
    }

    @JvmOverloads
    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, Function2<? super K, ? super Integer, ? extends CharSequence> function2) {
        int i10;
        charSequence.getClass();
        charSequence2.getClass();
        function2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            loop0: while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i11 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((255 & j10) < 128) {
                            int i16 = (i11 << 3) + i15;
                            Object obj = objArr[i16];
                            int i17 = iArr[i16];
                            if (i12 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i12 != 0) {
                                sb.append(charSequence);
                            }
                            i10 = i13;
                            sb.append(function2.invoke(obj, Integer.valueOf(i17)));
                            i12++;
                        } else {
                            i10 = i13;
                        }
                        j10 >>= i10;
                        i15++;
                        i13 = i10;
                    }
                    if (i14 != i13) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
            return sb.toString();
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    @JvmOverloads
    public final String joinToString(CharSequence charSequence, Function2<? super K, ? super Integer, ? extends CharSequence> function2) {
        int i10;
        charSequence.getClass();
        function2.getClass();
        StringBuilder sb = new StringBuilder("");
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            loop0: while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i11 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((255 & j10) < 128) {
                            int i16 = (i11 << 3) + i15;
                            Object obj = objArr[i16];
                            int i17 = iArr[i16];
                            i10 = i13;
                            if (i12 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i12 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(function2.invoke(obj, Integer.valueOf(i17)));
                            i12++;
                        } else {
                            i10 = i13;
                        }
                        j10 >>= i10;
                        i15++;
                        i13 = i10;
                    }
                    if (i14 != i13) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
            return sb.toString();
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    @JvmOverloads
    public final String joinToString(Function2<? super K, ? super Integer, ? extends CharSequence> function2) {
        int i10;
        function2.getClass();
        StringBuilder sb = new StringBuilder("");
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            loop0: while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i11 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((255 & j10) < 128) {
                            int i16 = (i11 << 3) + i15;
                            Object obj = objArr[i16];
                            int i17 = iArr[i16];
                            i10 = i13;
                            if (i12 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i12 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(function2.invoke(obj, Integer.valueOf(i17)));
                            i12++;
                        } else {
                            i10 = i13;
                        }
                        j10 >>= i10;
                        i15++;
                        i13 = i10;
                    }
                    if (i14 != i13) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }
}
