.class public final synthetic Le0/f;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lx0/c;


# direct methods
.method public synthetic constructor <init>(Lx0/c;I)V
    .locals 0

    .line 1
    iput p2, p0, Le0/f;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Le0/f;->c:Lx0/c;

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
    .locals 4

    .line 1
    iget v0, p0, Le0/f;->b:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Le0/f;->c:Lx0/c;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget v0, v2, Lx0/c;->g:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    iput v0, v2, Lx0/c;->g:I

    .line 14
    .line 15
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iput-wide v0, v2, Lx0/c;->h:J

    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iput-boolean v1, v2, Lx0/c;->e:Z

    .line 23
    .line 24
    invoke-virtual {v2}, Lx0/c;->k()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    iget-boolean v0, v2, Lx0/c;->f:Z

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/16 v2, 0x42

    .line 37
    .line 38
    new-array v2, v2, [B

    .line 39
    .line 40
    fill-array-data v2, :array_0

    .line 41
    .line 42
    .line 43
    const/16 v3, 0x8

    .line 44
    .line 45
    new-array v3, v3, [B

    .line 46
    .line 47
    fill-array-data v3, :array_1

    .line 48
    .line 49
    .line 50
    invoke-static {v2, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-static {v0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 59
    .line 60
    .line 61
    :cond_0
    return-void

    .line 62
    :pswitch_2
    iget-object v0, v2, Lx0/c;->c:Lx0/o;

    .line 63
    .line 64
    iget-boolean v0, v0, Lx0/o;->d:Z

    .line 65
    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    iget-boolean v0, v2, Lx0/c;->e:Z

    .line 69
    .line 70
    xor-int/lit8 v0, v0, 0x1

    .line 71
    .line 72
    iput-boolean v0, v2, Lx0/c;->e:Z

    .line 73
    .line 74
    invoke-virtual {v2}, Lx0/c;->k()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Lx0/c;->l()V

    .line 78
    .line 79
    .line 80
    :cond_1
    return-void

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

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
    :array_0
    .array-data 1
        -0x5t
        0x1et
        -0x79t
        0x5dt
        -0x16t
        0x6bt
        -0x13t
        0x34t
        -0x61t
        0x53t
        -0x19t
        0x38t
        0x71t
        0x6at
        -0x30t
        0x35t
        -0x56t
        0x52t
        -0x25t
        -0x38t
        0x1at
        0x2t
        -0x42t
        0x53t
        -0x5t
        0x3ft
        -0x79t
        0x5dt
        0x1at
        0x7t
        -0x42t
        0x5ct
        -0x6t
        0x1t
        -0x7at
        0x64t
        -0x16t
        0x6bt
        -0x13t
        0x35t
        -0x55t
        0x53t
        -0x17t
        0x38t
        0x78t
        0x6at
        -0x25t
        0x34t
        -0x6at
        0x52t
        -0x25t
        -0x38t
        0x1bt
        0x3bt
        -0x42t
        0x5ct
        -0x5t
        0x37t
        -0x79t
        0x5dt
        0x1at
        0x7t
        -0x41t
        0x68t
        -0x6t
        0xct
    .end array-data

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
    nop

    .line 129
    :array_1
    .array-data 1
        0x2bt
        -0x7dt
        0x57t
        -0x18t
        -0x36t
        -0x46t
        0x6et
        -0x1ct
    .end array-data
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
