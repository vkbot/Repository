package org.apache.commons.net.nntp;

import ai.onnxruntime.a;
import ai.onnxruntime.b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class Threader {
    private void buildContainer(Threadable threadable, HashMap<String, NntpThreadContainer> hashMap) {
        String messageThreadId = threadable.messageThreadId();
        NntpThreadContainer nntpThreadContainer = hashMap.get(messageThreadId);
        if (nntpThreadContainer != null) {
            if (nntpThreadContainer.threadable != null) {
                messageThreadId = a.f(1, "<Bogus-id:", ">");
                nntpThreadContainer = null;
            } else {
                nntpThreadContainer.threadable = threadable;
            }
        }
        if (nntpThreadContainer == null) {
            nntpThreadContainer = new NntpThreadContainer();
            nntpThreadContainer.threadable = threadable;
            hashMap.put(messageThreadId, nntpThreadContainer);
        }
        String[] messageThreadReferences = threadable.messageThreadReferences();
        int length = messageThreadReferences.length;
        int i10 = 0;
        NntpThreadContainer nntpThreadContainer2 = null;
        while (i10 < length) {
            String str = messageThreadReferences[i10];
            NntpThreadContainer nntpThreadContainer3 = hashMap.get(str);
            if (nntpThreadContainer3 == null) {
                nntpThreadContainer3 = new NntpThreadContainer();
                hashMap.put(str, nntpThreadContainer3);
            }
            if (nntpThreadContainer2 != null && nntpThreadContainer3.parent == null && nntpThreadContainer2 != nntpThreadContainer3 && !nntpThreadContainer3.findChild(nntpThreadContainer2)) {
                nntpThreadContainer3.parent = nntpThreadContainer2;
                nntpThreadContainer3.next = nntpThreadContainer2.child;
                nntpThreadContainer2.child = nntpThreadContainer3;
            }
            i10++;
            nntpThreadContainer2 = nntpThreadContainer3;
        }
        if (nntpThreadContainer2 != null && (nntpThreadContainer2 == nntpThreadContainer || nntpThreadContainer.findChild(nntpThreadContainer2))) {
            nntpThreadContainer2 = null;
        }
        NntpThreadContainer nntpThreadContainer4 = nntpThreadContainer.parent;
        if (nntpThreadContainer4 != null) {
            NntpThreadContainer nntpThreadContainer5 = nntpThreadContainer4.child;
            NntpThreadContainer nntpThreadContainer6 = null;
            while (nntpThreadContainer5 != null && nntpThreadContainer5 != nntpThreadContainer) {
                nntpThreadContainer6 = nntpThreadContainer5;
                nntpThreadContainer5 = nntpThreadContainer5.next;
            }
            if (nntpThreadContainer5 != null) {
                if (nntpThreadContainer6 == null) {
                    nntpThreadContainer.parent.child = nntpThreadContainer.next;
                } else {
                    nntpThreadContainer6.next = nntpThreadContainer.next;
                }
                nntpThreadContainer.next = null;
                nntpThreadContainer.parent = null;
            } else {
                StringBuilder sb = new StringBuilder("Didnt find ");
                sb.append(nntpThreadContainer);
                b.p(sb, " in parent ", nntpThreadContainer.parent);
                return;
            }
        }
        if (nntpThreadContainer2 != null) {
            nntpThreadContainer.parent = nntpThreadContainer2;
            nntpThreadContainer.next = nntpThreadContainer2.child;
            nntpThreadContainer2.child = nntpThreadContainer;
        }
    }

    private NntpThreadContainer findRootSet(HashMap<String, NntpThreadContainer> hashMap) {
        NntpThreadContainer nntpThreadContainer = new NntpThreadContainer();
        Iterator<Map.Entry<String, NntpThreadContainer>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            NntpThreadContainer value = it.next().getValue();
            if (value.parent == null) {
                if (value.next == null) {
                    value.next = nntpThreadContainer.child;
                    nntpThreadContainer.child = value;
                } else {
                    throw new IllegalStateException("c.next is " + value.next.toString());
                }
            }
        }
        return nntpThreadContainer;
    }

    private void gatherSubjects(NntpThreadContainer nntpThreadContainer) {
        NntpThreadContainer nntpThreadContainer2;
        NntpThreadContainer nntpThreadContainer3;
        Threadable threadable;
        NntpThreadContainer nntpThreadContainer4;
        Threadable threadable2;
        Threadable threadable3;
        int i10 = 0;
        int i11 = 0;
        for (NntpThreadContainer nntpThreadContainer5 = nntpThreadContainer.child; nntpThreadContainer5 != null; nntpThreadContainer5 = nntpThreadContainer5.next) {
            i11++;
        }
        HashMap hashMap = new HashMap((int) (i11 * 1.2d), 0.9f);
        for (NntpThreadContainer nntpThreadContainer6 = nntpThreadContainer.child; nntpThreadContainer6 != null; nntpThreadContainer6 = nntpThreadContainer6.next) {
            Threadable threadable4 = nntpThreadContainer6.threadable;
            if (threadable4 == null) {
                threadable4 = nntpThreadContainer6.child.threadable;
            }
            String simplifiedSubject = threadable4.simplifiedSubject();
            if (simplifiedSubject != null && !simplifiedSubject.isEmpty() && ((nntpThreadContainer4 = (NntpThreadContainer) hashMap.get(simplifiedSubject)) == null || ((nntpThreadContainer6.threadable == null && nntpThreadContainer4.threadable != null) || ((threadable2 = nntpThreadContainer4.threadable) != null && threadable2.subjectIsReply() && (threadable3 = nntpThreadContainer6.threadable) != null && !threadable3.subjectIsReply())))) {
                hashMap.put(simplifiedSubject, nntpThreadContainer6);
                i10++;
            }
        }
        if (i10 == 0) {
            return;
        }
        NntpThreadContainer nntpThreadContainer7 = nntpThreadContainer.child;
        NntpThreadContainer nntpThreadContainer8 = nntpThreadContainer7.next;
        NntpThreadContainer nntpThreadContainer9 = null;
        while (nntpThreadContainer7 != null) {
            Threadable threadable5 = nntpThreadContainer7.threadable;
            if (threadable5 == null) {
                threadable5 = nntpThreadContainer7.child.threadable;
            }
            String simplifiedSubject2 = threadable5.simplifiedSubject();
            if (simplifiedSubject2 != null && !simplifiedSubject2.isEmpty() && (nntpThreadContainer3 = (NntpThreadContainer) hashMap.get(simplifiedSubject2)) != nntpThreadContainer7) {
                NntpThreadContainer nntpThreadContainer10 = nntpThreadContainer7.next;
                if (nntpThreadContainer9 == null) {
                    nntpThreadContainer.child = nntpThreadContainer10;
                } else {
                    nntpThreadContainer9.next = nntpThreadContainer10;
                }
                nntpThreadContainer7.next = null;
                Threadable threadable6 = nntpThreadContainer3.threadable;
                if (threadable6 == null && nntpThreadContainer7.threadable == null) {
                    NntpThreadContainer nntpThreadContainer11 = nntpThreadContainer3.child;
                    while (nntpThreadContainer11 != null) {
                        NntpThreadContainer nntpThreadContainer12 = nntpThreadContainer11.next;
                        if (nntpThreadContainer12 == null) {
                            break;
                        } else {
                            nntpThreadContainer11 = nntpThreadContainer12;
                        }
                    }
                    if (nntpThreadContainer11 != null) {
                        nntpThreadContainer11.next = nntpThreadContainer7.child;
                    }
                    for (NntpThreadContainer nntpThreadContainer13 = nntpThreadContainer7.child; nntpThreadContainer13 != null; nntpThreadContainer13 = nntpThreadContainer13.next) {
                        nntpThreadContainer13.parent = nntpThreadContainer3;
                    }
                    nntpThreadContainer7.child = null;
                } else if (threadable6 != null && ((threadable = nntpThreadContainer7.threadable) == null || !threadable.subjectIsReply() || nntpThreadContainer3.threadable.subjectIsReply())) {
                    NntpThreadContainer nntpThreadContainer14 = new NntpThreadContainer();
                    nntpThreadContainer14.threadable = nntpThreadContainer3.threadable;
                    NntpThreadContainer nntpThreadContainer15 = nntpThreadContainer3.child;
                    nntpThreadContainer14.child = nntpThreadContainer15;
                    while (nntpThreadContainer15 != null) {
                        nntpThreadContainer15.parent = nntpThreadContainer14;
                        nntpThreadContainer15 = nntpThreadContainer15.next;
                    }
                    nntpThreadContainer3.threadable = null;
                    nntpThreadContainer7.parent = nntpThreadContainer3;
                    nntpThreadContainer14.parent = nntpThreadContainer3;
                    nntpThreadContainer3.child = nntpThreadContainer7;
                    nntpThreadContainer7.next = nntpThreadContainer14;
                } else {
                    nntpThreadContainer7.parent = nntpThreadContainer3;
                    nntpThreadContainer7.next = nntpThreadContainer3.child;
                    nntpThreadContainer3.child = nntpThreadContainer7;
                }
            } else {
                nntpThreadContainer9 = nntpThreadContainer7;
            }
            if (nntpThreadContainer8 == null) {
                nntpThreadContainer2 = null;
            } else {
                nntpThreadContainer2 = nntpThreadContainer8.next;
            }
            NntpThreadContainer nntpThreadContainer16 = nntpThreadContainer8;
            nntpThreadContainer8 = nntpThreadContainer2;
            nntpThreadContainer7 = nntpThreadContainer16;
        }
        hashMap.clear();
    }

    private void pruneEmptyContainers(NntpThreadContainer nntpThreadContainer) {
        NntpThreadContainer nntpThreadContainer2;
        NntpThreadContainer nntpThreadContainer3 = nntpThreadContainer.child;
        NntpThreadContainer nntpThreadContainer4 = nntpThreadContainer3.next;
        NntpThreadContainer nntpThreadContainer5 = null;
        while (nntpThreadContainer3 != null) {
            Threadable threadable = nntpThreadContainer3.threadable;
            if (threadable == null && nntpThreadContainer3.child == null) {
                NntpThreadContainer nntpThreadContainer6 = nntpThreadContainer3.next;
                if (nntpThreadContainer5 == null) {
                    nntpThreadContainer.child = nntpThreadContainer6;
                } else {
                    nntpThreadContainer5.next = nntpThreadContainer6;
                }
            } else if (threadable == null && (nntpThreadContainer3.parent != null || nntpThreadContainer3.child.next == null)) {
                nntpThreadContainer4 = nntpThreadContainer3.child;
                if (nntpThreadContainer5 == null) {
                    nntpThreadContainer.child = nntpThreadContainer4;
                } else {
                    nntpThreadContainer5.next = nntpThreadContainer4;
                }
                NntpThreadContainer nntpThreadContainer7 = nntpThreadContainer4;
                while (true) {
                    NntpThreadContainer nntpThreadContainer8 = nntpThreadContainer7.next;
                    nntpThreadContainer2 = nntpThreadContainer3.parent;
                    if (nntpThreadContainer8 == null) {
                        break;
                    }
                    nntpThreadContainer7.parent = nntpThreadContainer2;
                    nntpThreadContainer7 = nntpThreadContainer8;
                }
                nntpThreadContainer7.parent = nntpThreadContainer2;
                nntpThreadContainer7.next = nntpThreadContainer3.next;
            } else {
                if (nntpThreadContainer3.child != null) {
                    pruneEmptyContainers(nntpThreadContainer3);
                }
                nntpThreadContainer5 = nntpThreadContainer3;
            }
            nntpThreadContainer3 = nntpThreadContainer4;
            if (nntpThreadContainer3 == null) {
                nntpThreadContainer4 = null;
            } else {
                nntpThreadContainer4 = nntpThreadContainer3.next;
            }
        }
    }

    public Threadable thread(Iterable<? extends Threadable> iterable) {
        Threadable threadable = null;
        if (iterable == null) {
            return null;
        }
        HashMap<String, NntpThreadContainer> hashMap = new HashMap<>();
        for (Threadable threadable2 : iterable) {
            if (!threadable2.isDummy()) {
                buildContainer(threadable2, hashMap);
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        NntpThreadContainer findRootSet = findRootSet(hashMap);
        hashMap.clear();
        pruneEmptyContainers(findRootSet);
        findRootSet.reverseChildren();
        gatherSubjects(findRootSet);
        if (findRootSet.next == null) {
            for (NntpThreadContainer nntpThreadContainer = findRootSet.child; nntpThreadContainer != null; nntpThreadContainer = nntpThreadContainer.next) {
                if (nntpThreadContainer.threadable == null) {
                    nntpThreadContainer.threadable = nntpThreadContainer.child.threadable.makeDummy();
                }
            }
            NntpThreadContainer nntpThreadContainer2 = findRootSet.child;
            if (nntpThreadContainer2 != null) {
                threadable = nntpThreadContainer2.threadable;
            }
            findRootSet.flush();
            return threadable;
        }
        b.q(findRootSet, "root node has a next:");
        return null;
    }

    public Threadable thread(List<? extends Threadable> list) {
        return thread((Iterable<? extends Threadable>) list);
    }

    @Deprecated
    public Threadable thread(Threadable[] threadableArr) {
        if (threadableArr == null) {
            return null;
        }
        return thread(Arrays.asList(threadableArr));
    }
}
