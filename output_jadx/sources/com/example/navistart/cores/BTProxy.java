package com.example.navistart.cores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public interface BTProxy {

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static final class Contact {
        public final String bluetoothAddress;
        public final String id;
        public final String name;
        public final List<PhoneNumber> numbers;

        public Contact(String str, String str2, String str3, List<PhoneNumber> list) {
            this.id = str;
            this.name = str2;
            this.bluetoothAddress = str3;
            this.numbers = Collections.unmodifiableList(new ArrayList(list));
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public interface Listener {
        void onContactsChanged(List<Contact> list, int i10, int i11);

        void onError(String str, Throwable th);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static final class PhoneNumber {
        public final String id;
        public final String number;
        public final int type;

        public PhoneNumber(String str, int i10, String str2) {
            this.number = str;
            this.type = i10;
            this.id = str2;
        }
    }

    default boolean call(String str) {
        return false;
    }

    default List<Contact> getContacts() {
        return Collections.EMPTY_LIST;
    }

    default boolean requestContacts() {
        return false;
    }

    default void setListener(Listener listener) {
    }
}
