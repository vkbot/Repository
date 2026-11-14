.class public final Lz3/j;
.super Landroidx/dynamicanimation/animation/FloatPropertyCompat;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    const-string v0, "cornerSizeAtIndex"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lai/onnxruntime/a;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0, v0}, Landroidx/dynamicanimation/animation/FloatPropertyCompat;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iput p1, p0, Lz3/j;->a:I

    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public final getValue(Ljava/lang/Object;)F
    .locals 1

    .line 1
    check-cast p1, Lz3/k;

    .line 2
    .line 3
    iget-object p1, p1, Lz3/k;->D:[F

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lz3/j;->a:I

    .line 8
    .line 9
    aget p1, p1, v0

    .line 10
    .line 11
    return p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return p1
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final setValue(Ljava/lang/Object;F)V
    .locals 3

    .line 1
    check-cast p1, Lz3/k;

    .line 2
    .line 3
    iget-object v0, p1, Lz3/k;->D:[F

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget v1, p0, Lz3/j;->a:I

    .line 8
    .line 9
    aget v2, v0, v1

    .line 10
    .line 11
    cmpl-float v2, v2, p2

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    aput p2, v0, v1

    .line 16
    .line 17
    iget-object p2, p1, Lz3/k;->F:Lz3/i;

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Lz3/k;->i()F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    check-cast p2, Landroidx/fragment/app/h;

    .line 26
    .line 27
    iget-object p2, p2, Landroidx/fragment/app/h;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p2, Lcom/google/android/material/button/MaterialButton;

    .line 30
    .line 31
    const v1, 0x3de147ae    # 0.11f

    .line 32
    .line 33
    .line 34
    mul-float/2addr v0, v1

    .line 35
    float-to-int v0, v0

    .line 36
    iget v1, p2, Lcom/google/android/material/button/MaterialButton;->v:I

    .line 37
    .line 38
    if-eq v1, v0, :cond_0

    .line 39
    .line 40
    iput v0, p2, Lcom/google/android/material/button/MaterialButton;->v:I

    .line 41
    .line 42
    invoke-virtual {p2}, Lcom/google/android/material/button/MaterialButton;->j()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    .line 46
    .line 47
    .line 48
    :cond_0
    invoke-virtual {p1}, Lz3/k;->invalidateSelf()V

    .line 49
    .line 50
    .line 51
    :cond_1
    return-void
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
.end method
