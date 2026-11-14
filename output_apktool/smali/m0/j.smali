.class public final synthetic Lm0/j;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:F

.field public final synthetic d:Landroid/content/Context;

.field public final synthetic e:Ll0/b;


# direct methods
.method public synthetic constructor <init>(Ll0/b;FLandroid/content/Context;I)V
    .locals 0

    .line 1
    iput p4, p0, Lm0/j;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Lm0/j;->e:Ll0/b;

    .line 4
    .line 5
    iput p2, p0, Lm0/j;->c:F

    .line 6
    .line 7
    iput-object p3, p0, Lm0/j;->d:Landroid/content/Context;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
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
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
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
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lm0/j;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm0/j;->e:Ll0/b;

    .line 7
    .line 8
    check-cast v0, Lm0/k2;

    .line 9
    .line 10
    iget-object v1, v0, Lm0/k2;->d:Lcom/example/navistart/DialogUni/Fragmenti/MaxHeightRecyclerView;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/high16 v2, 0x42f00000    # 120.0f

    .line 17
    .line 18
    iget v3, p0, Lm0/j;->c:F

    .line 19
    .line 20
    mul-float/2addr v3, v2

    .line 21
    float-to-int v2, v3

    .line 22
    const/4 v3, 0x1

    .line 23
    div-int/2addr v1, v2

    .line 24
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    iget-object v0, v0, Lm0/k2;->d:Lcom/example/navistart/DialogUni/Fragmenti/MaxHeightRecyclerView;

    .line 29
    .line 30
    new-instance v2, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 31
    .line 32
    iget-object v3, p0, Lm0/j;->d:Landroid/content/Context;

    .line 33
    .line 34
    invoke-direct {v2, v3, v1}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_0
    iget-object v0, p0, Lm0/j;->e:Ll0/b;

    .line 42
    .line 43
    check-cast v0, Lm0/o;

    .line 44
    .line 45
    iget-object v1, v0, Lm0/o;->b:Lcom/example/navistart/DialogUni/Fragmenti/MaxHeightRecyclerView;

    .line 46
    .line 47
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    const/high16 v2, 0x42f00000    # 120.0f

    .line 52
    .line 53
    iget v3, p0, Lm0/j;->c:F

    .line 54
    .line 55
    mul-float/2addr v3, v2

    .line 56
    float-to-int v2, v3

    .line 57
    const/4 v3, 0x1

    .line 58
    div-int/2addr v1, v2

    .line 59
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    iget-object v0, v0, Lm0/o;->b:Lcom/example/navistart/DialogUni/Fragmenti/MaxHeightRecyclerView;

    .line 64
    .line 65
    new-instance v2, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 66
    .line 67
    iget-object v3, p0, Lm0/j;->d:Landroid/content/Context;

    .line 68
    .line 69
    invoke-direct {v2, v3, v1}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
