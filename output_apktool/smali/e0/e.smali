.class public final synthetic Le0/e;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ls1/u0;


# direct methods
.method public synthetic constructor <init>(Ls1/u0;I)V
    .locals 0

    .line 1
    iput p2, p0, Le0/e;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Le0/e;->c:Ls1/u0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
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
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Le0/e;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Le0/e;->c:Ls1/u0;

    .line 7
    .line 8
    invoke-virtual {v0}, Ls1/u0;->h()V

    .line 9
    .line 10
    .line 11
    iget-boolean v1, v0, Ls1/u0;->f:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, v0, Ls1/u0;->i:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Ls1/u0;->j()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void

    .line 27
    :pswitch_0
    iget-object v0, p0, Le0/e;->c:Ls1/u0;

    .line 28
    .line 29
    invoke-virtual {v0}, Ls1/u0;->h()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_1
    iget-object v0, p0, Le0/e;->c:Ls1/u0;

    .line 34
    .line 35
    invoke-virtual {v0}, Ls1/u0;->h()V

    .line 36
    .line 37
    .line 38
    iget-boolean v1, v0, Ls1/u0;->n:Z

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    const/high16 v1, 0x3f800000    # 1.0f

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/high16 v1, 0x3f000000    # 0.5f

    .line 46
    .line 47
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_2
    iget-object v0, p0, Le0/e;->c:Ls1/u0;

    .line 52
    .line 53
    iget-boolean v1, v0, Ls1/u0;->n:Z

    .line 54
    .line 55
    xor-int/lit8 v2, v1, 0x1

    .line 56
    .line 57
    iput-boolean v2, v0, Ls1/u0;->n:Z

    .line 58
    .line 59
    if-nez v1, :cond_2

    .line 60
    .line 61
    invoke-virtual {v0}, Ls1/u0;->l()V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    invoke-virtual {v0}, Ls1/u0;->g()V

    .line 66
    .line 67
    .line 68
    :goto_1
    iget-object v1, v0, Ls1/u0;->c:Landroid/widget/ScrollView;

    .line 69
    .line 70
    iget-boolean v2, v0, Ls1/u0;->n:Z

    .line 71
    .line 72
    if-eqz v2, :cond_3

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    goto :goto_2

    .line 76
    :cond_3
    const/16 v2, 0x8

    .line 77
    .line 78
    :goto_2
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ls1/u0;->c()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Ls1/u0;->h()V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method
