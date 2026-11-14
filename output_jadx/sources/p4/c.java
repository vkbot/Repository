package p4;

import android.text.TextUtils;
import f5.b0;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final k5.b f5002a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f5003b = null;

    public c(k5.b bVar) {
        this.f5002a = bVar;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [r4.a, java.lang.Object] */
    public final void a(b bVar) {
        String str;
        k5.b bVar2 = this.f5002a;
        if (bVar2.get() != null) {
            String[] strArr = b.f4997g;
            b.b(bVar.a());
            ArrayList arrayList = new ArrayList();
            HashMap a10 = bVar.a();
            a10.remove("triggerEvent");
            b.b(a10);
            try {
                Date parse = b.f4998h.parse((String) a10.get("experimentStartTime"));
                long parseLong = Long.parseLong((String) a10.get("triggerTimeoutMillis"));
                long parseLong2 = Long.parseLong((String) a10.get("timeToLiveMillis"));
                String str2 = (String) a10.get("experimentId");
                String str3 = (String) a10.get("variantId");
                if (a10.containsKey("triggerEvent")) {
                    str = (String) a10.get("triggerEvent");
                } else {
                    str = "";
                }
                arrayList.add(new b(str2, str3, str, parse, parseLong, parseLong2));
                ((b0) bVar2.get()).getClass();
                ArrayDeque arrayDeque = new ArrayDeque(Collections.EMPTY_LIST);
                int i10 = 0;
                if (this.f5003b == null) {
                    ((b0) bVar2.get()).getClass();
                    this.f5003b = 0;
                }
                int intValue = this.f5003b.intValue();
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    b bVar3 = (b) obj;
                    while (arrayDeque.size() >= intValue) {
                        String str4 = ((r4.a) arrayDeque.pollFirst()).f5394a;
                        ((b0) bVar2.get()).getClass();
                    }
                    ?? obj2 = new Object();
                    bVar3.d.getTime();
                    obj2.f5394a = bVar3.f4999a;
                    TextUtils.isEmpty(bVar3.c);
                    ((b0) bVar2.get()).getClass();
                    arrayDeque.offer(obj2);
                }
                return;
            } catch (NumberFormatException e) {
                throw new Exception("Could not process experiment: one of the durations could not be converted into a long.", e);
            } catch (ParseException e6) {
                throw new Exception("Could not process experiment: parsing experiment start time failed.", e6);
            }
        }
        throw new Exception("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
    }
}
