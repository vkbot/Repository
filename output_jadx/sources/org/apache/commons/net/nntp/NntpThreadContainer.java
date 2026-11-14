package org.apache.commons.net.nntp;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
final class NntpThreadContainer {
    NntpThreadContainer child;
    NntpThreadContainer next;
    NntpThreadContainer parent;
    Threadable threadable;

    public boolean findChild(NntpThreadContainer nntpThreadContainer) {
        NntpThreadContainer nntpThreadContainer2 = this.child;
        if (nntpThreadContainer2 == null) {
            return false;
        }
        if (nntpThreadContainer2 == nntpThreadContainer) {
            return true;
        }
        return nntpThreadContainer2.findChild(nntpThreadContainer);
    }

    public void flush() {
        Threadable threadable;
        Threadable threadable2;
        if (this.parent != null && this.threadable == null) {
            throw new IllegalStateException("no threadable in " + toString());
        }
        this.parent = null;
        Threadable threadable3 = this.threadable;
        if (threadable3 != null) {
            NntpThreadContainer nntpThreadContainer = this.child;
            if (nntpThreadContainer == null) {
                threadable2 = null;
            } else {
                threadable2 = nntpThreadContainer.threadable;
            }
            threadable3.setChild(threadable2);
        }
        NntpThreadContainer nntpThreadContainer2 = this.child;
        if (nntpThreadContainer2 != null) {
            nntpThreadContainer2.flush();
            this.child = null;
        }
        Threadable threadable4 = this.threadable;
        if (threadable4 != null) {
            NntpThreadContainer nntpThreadContainer3 = this.next;
            if (nntpThreadContainer3 == null) {
                threadable = null;
            } else {
                threadable = nntpThreadContainer3.threadable;
            }
            threadable4.setNext(threadable);
        }
        NntpThreadContainer nntpThreadContainer4 = this.next;
        if (nntpThreadContainer4 != null) {
            nntpThreadContainer4.flush();
            this.next = null;
        }
        this.threadable = null;
    }

    public void reverseChildren() {
        NntpThreadContainer nntpThreadContainer;
        NntpThreadContainer nntpThreadContainer2 = this.child;
        if (nntpThreadContainer2 != null) {
            NntpThreadContainer nntpThreadContainer3 = nntpThreadContainer2.next;
            NntpThreadContainer nntpThreadContainer4 = null;
            while (nntpThreadContainer2 != null) {
                nntpThreadContainer2.next = nntpThreadContainer4;
                if (nntpThreadContainer3 == null) {
                    nntpThreadContainer = null;
                } else {
                    nntpThreadContainer = nntpThreadContainer3.next;
                }
                NntpThreadContainer nntpThreadContainer5 = nntpThreadContainer;
                nntpThreadContainer4 = nntpThreadContainer2;
                nntpThreadContainer2 = nntpThreadContainer3;
                nntpThreadContainer3 = nntpThreadContainer5;
            }
            this.child = nntpThreadContainer4;
            while (nntpThreadContainer4 != null) {
                nntpThreadContainer4.reverseChildren();
                nntpThreadContainer4 = nntpThreadContainer4.next;
            }
        }
    }
}
