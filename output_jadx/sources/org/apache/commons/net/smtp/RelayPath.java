package org.apache.commons.net.smtp;

import java.util.Enumeration;
import java.util.Vector;
import kotlin.text.Typography;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class RelayPath {
    private final String emailAddress;
    private final Vector<String> path = new Vector<>();

    public RelayPath(String str) {
        this.emailAddress = str;
    }

    public void addRelay(String str) {
        this.path.addElement(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        Enumeration<String> elements = this.path.elements();
        if (elements.hasMoreElements()) {
            sb.append('@');
            sb.append(elements.nextElement());
            while (elements.hasMoreElements()) {
                sb.append(",@");
                sb.append(elements.nextElement());
            }
            sb.append(':');
        }
        sb.append(this.emailAddress);
        sb.append(Typography.greater);
        return sb.toString();
    }
}
