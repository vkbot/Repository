package com.example.navistart.cores;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class Saa {

    /* renamed from: i, reason: collision with root package name */
    private final int f968i;
    private final int ratio;

    /* renamed from: s1, reason: collision with root package name */
    private final String f969s1;

    /* renamed from: s2, reason: collision with root package name */
    private final String f970s2;

    public Saa(String str, String str2, int i10, int i11) {
        this.f969s1 = str;
        this.f970s2 = str2;
        this.f968i = i10;
        this.ratio = i11;
    }

    public int getI() {
        return this.f968i;
    }

    public int getRatio() {
        return this.ratio;
    }

    public String getS1() {
        return this.f969s1;
    }

    public String getS2() {
        return this.f970s2;
    }

    public Saa(String str, String str2, int i10) {
        this(str, str2, i10, 50);
    }
}
