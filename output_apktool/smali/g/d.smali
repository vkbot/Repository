.class public final Lg/d;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# instance fields
.field public a:[I

.field public final b:[I

.field public final c:Ll/d;

.field public d:Ljava/nio/ByteBuffer;

.field public e:[B

.field public f:[S

.field public g:[B

.field public h:[B

.field public i:[B

.field public final j:[I

.field public k:I

.field public l:Lg/b;

.field public m:Landroid/graphics/Bitmap;

.field public final n:Z

.field public o:I

.field public final p:I

.field public final q:I

.field public final r:I

.field public s:Ljava/lang/Boolean;

.field public t:Landroid/graphics/Bitmap$Config;


# direct methods
.method public constructor <init>(Ll/d;Lg/b;Ljava/nio/ByteBuffer;I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x100

    .line 5
    .line 6
    new-array v0, v0, [I

    .line 7
    .line 8
    iput-object v0, p0, Lg/d;->b:[I

    .line 9
    .line 10
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 11
    .line 12
    iput-object v0, p0, Lg/d;->t:Landroid/graphics/Bitmap$Config;

    .line 13
    .line 14
    iput-object p1, p0, Lg/d;->c:Ll/d;

    .line 15
    .line 16
    new-instance p1, Lg/b;

    .line 17
    .line 18
    invoke-direct {p1}, Lg/b;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lg/d;->l:Lg/b;

    .line 22
    .line 23
    const-string p1, "Sample size must be >=0, not: "

    .line 24
    .line 25
    monitor-enter p0

    .line 26
    if-lez p4, :cond_4

    .line 27
    .line 28
    :try_start_0
    invoke-static {p4}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    const/4 p4, 0x0

    .line 33
    iput p4, p0, Lg/d;->o:I

    .line 34
    .line 35
    iput-object p2, p0, Lg/d;->l:Lg/b;

    .line 36
    .line 37
    const/4 v0, -0x1

    .line 38
    iput v0, p0, Lg/d;->k:I

    .line 39
    .line 40
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    iput-object p3, p0, Lg/d;->d:Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    invoke-virtual {p3, p4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 47
    .line 48
    .line 49
    iget-object p3, p0, Lg/d;->d:Ljava/nio/ByteBuffer;

    .line 50
    .line 51
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 52
    .line 53
    invoke-virtual {p3, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    .line 56
    iput-boolean p4, p0, Lg/d;->n:Z

    .line 57
    .line 58
    iget-object p3, p2, Lg/b;->e:Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    :cond_0
    if-ge p4, v0, :cond_1

    .line 65
    .line 66
    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    add-int/lit8 p4, p4, 0x1

    .line 71
    .line 72
    check-cast v1, Lg/a;

    .line 73
    .line 74
    iget v1, v1, Lg/a;->g:I

    .line 75
    .line 76
    const/4 v2, 0x3

    .line 77
    if-ne v1, v2, :cond_0

    .line 78
    .line 79
    const/4 p3, 0x1

    .line 80
    iput-boolean p3, p0, Lg/d;->n:Z

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catchall_0
    move-exception p1

    .line 84
    goto :goto_3

    .line 85
    :cond_1
    :goto_0
    iput p1, p0, Lg/d;->p:I

    .line 86
    .line 87
    iget p3, p2, Lg/b;->f:I

    .line 88
    .line 89
    div-int p4, p3, p1

    .line 90
    .line 91
    iput p4, p0, Lg/d;->r:I

    .line 92
    .line 93
    iget p2, p2, Lg/b;->g:I

    .line 94
    .line 95
    div-int p1, p2, p1

    .line 96
    .line 97
    iput p1, p0, Lg/d;->q:I

    .line 98
    .line 99
    iget-object p1, p0, Lg/d;->c:Ll/d;

    .line 100
    .line 101
    mul-int/2addr p3, p2

    .line 102
    iget-object p1, p1, Ll/d;->d:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p1, Lk/g;

    .line 105
    .line 106
    if-nez p1, :cond_2

    .line 107
    .line 108
    new-array p1, p3, [B

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    const-class p2, [B

    .line 112
    .line 113
    invoke-virtual {p1, p3, p2}, Lk/g;->c(ILjava/lang/Class;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    check-cast p1, [B

    .line 118
    .line 119
    :goto_1
    iput-object p1, p0, Lg/d;->i:[B

    .line 120
    .line 121
    iget-object p1, p0, Lg/d;->c:Ll/d;

    .line 122
    .line 123
    iget p2, p0, Lg/d;->r:I

    .line 124
    .line 125
    iget p3, p0, Lg/d;->q:I

    .line 126
    .line 127
    mul-int/2addr p2, p3

    .line 128
    iget-object p1, p1, Ll/d;->d:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast p1, Lk/g;

    .line 131
    .line 132
    if-nez p1, :cond_3

    .line 133
    .line 134
    new-array p1, p2, [I

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_3
    const-class p3, [I

    .line 138
    .line 139
    invoke-virtual {p1, p2, p3}, Lk/g;->c(ILjava/lang/Class;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    check-cast p1, [I

    .line 144
    .line 145
    :goto_2
    iput-object p1, p0, Lg/d;->j:[I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    .line 147
    monitor-exit p0

    .line 148
    return-void

    .line 149
    :cond_4
    :try_start_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 150
    .line 151
    new-instance p3, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {p3, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw p2

    .line 167
    :goto_3
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 168
    throw p1
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
.method public final a()Landroid/graphics/Bitmap;
    .locals 4

    .line 1
    iget-object v0, p0, Lg/d;->s:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lg/d;->t:Landroid/graphics/Bitmap$Config;

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    :goto_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 16
    .line 17
    :goto_1
    iget-object v1, p0, Lg/d;->c:Ll/d;

    .line 18
    .line 19
    iget-object v1, v1, Ll/d;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lk/b;

    .line 22
    .line 23
    iget v2, p0, Lg/d;->r:I

    .line 24
    .line 25
    iget v3, p0, Lg/d;->q:I

    .line 26
    .line 27
    invoke-interface {v1, v2, v3, v0}, Lk/b;->b(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V

    .line 33
    .line 34
    .line 35
    return-object v0
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
.end method

.method public final declared-synchronized b()Landroid/graphics/Bitmap;
    .locals 9

    .line 1
    const-string v0, "Unable to decode frame, status="

    .line 2
    .line 3
    const-string v1, "No valid color table found for frame #"

    .line 4
    .line 5
    const-string v2, "Unable to decode frame, frameCount="

    .line 6
    .line 7
    monitor-enter p0

    .line 8
    :try_start_0
    iget-object v3, p0, Lg/d;->l:Lg/b;

    .line 9
    .line 10
    iget v3, v3, Lg/b;->c:I

    .line 11
    .line 12
    const/4 v4, 0x3

    .line 13
    const/4 v5, 0x1

    .line 14
    if-lez v3, :cond_0

    .line 15
    .line 16
    iget v3, p0, Lg/d;->k:I

    .line 17
    .line 18
    if-gez v3, :cond_2

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto/16 :goto_5

    .line 23
    .line 24
    :cond_0
    :goto_0
    const-string v3, "d"

    .line 25
    .line 26
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    const-string v3, "d"

    .line 33
    .line 34
    new-instance v6, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object v2, p0, Lg/d;->l:Lg/b;

    .line 40
    .line 41
    iget v2, v2, Lg/b;->c:I

    .line 42
    .line 43
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v2, ", framePointer="

    .line 47
    .line 48
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget v2, p0, Lg/d;->k:I

    .line 52
    .line 53
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    :cond_1
    iput v5, p0, Lg/d;->o:I

    .line 64
    .line 65
    :cond_2
    iget v2, p0, Lg/d;->o:I

    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    if-eq v2, v5, :cond_b

    .line 69
    .line 70
    const/4 v6, 0x2

    .line 71
    if-ne v2, v6, :cond_3

    .line 72
    .line 73
    goto/16 :goto_4

    .line 74
    .line 75
    :cond_3
    const/4 v0, 0x0

    .line 76
    iput v0, p0, Lg/d;->o:I

    .line 77
    .line 78
    iget-object v2, p0, Lg/d;->e:[B

    .line 79
    .line 80
    if-nez v2, :cond_5

    .line 81
    .line 82
    iget-object v2, p0, Lg/d;->c:Ll/d;

    .line 83
    .line 84
    iget-object v2, v2, Ll/d;->d:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v2, Lk/g;

    .line 87
    .line 88
    const/16 v7, 0xff

    .line 89
    .line 90
    if-nez v2, :cond_4

    .line 91
    .line 92
    new-array v2, v7, [B

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    const-class v8, [B

    .line 96
    .line 97
    invoke-virtual {v2, v7, v8}, Lk/g;->c(ILjava/lang/Class;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    check-cast v2, [B

    .line 102
    .line 103
    :goto_1
    iput-object v2, p0, Lg/d;->e:[B

    .line 104
    .line 105
    :cond_5
    iget-object v2, p0, Lg/d;->l:Lg/b;

    .line 106
    .line 107
    iget-object v2, v2, Lg/b;->e:Ljava/util/ArrayList;

    .line 108
    .line 109
    iget v7, p0, Lg/d;->k:I

    .line 110
    .line 111
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    check-cast v2, Lg/a;

    .line 116
    .line 117
    iget v7, p0, Lg/d;->k:I

    .line 118
    .line 119
    sub-int/2addr v7, v5

    .line 120
    if-ltz v7, :cond_6

    .line 121
    .line 122
    iget-object v8, p0, Lg/d;->l:Lg/b;

    .line 123
    .line 124
    iget-object v8, v8, Lg/b;->e:Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    check-cast v7, Lg/a;

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_6
    move-object v7, v3

    .line 134
    :goto_2
    iget-object v8, v2, Lg/a;->k:[I

    .line 135
    .line 136
    if-eqz v8, :cond_7

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_7
    iget-object v8, p0, Lg/d;->l:Lg/b;

    .line 140
    .line 141
    iget-object v8, v8, Lg/b;->a:[I

    .line 142
    .line 143
    :goto_3
    iput-object v8, p0, Lg/d;->a:[I

    .line 144
    .line 145
    if-nez v8, :cond_9

    .line 146
    .line 147
    const-string v0, "d"

    .line 148
    .line 149
    invoke-static {v0, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_8

    .line 154
    .line 155
    const-string v0, "d"

    .line 156
    .line 157
    new-instance v2, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    iget v1, p0, Lg/d;->k:I

    .line 163
    .line 164
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 172
    .line 173
    .line 174
    :cond_8
    iput v5, p0, Lg/d;->o:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    .line 176
    monitor-exit p0

    .line 177
    return-object v3

    .line 178
    :cond_9
    :try_start_1
    iget-boolean v1, v2, Lg/a;->f:Z

    .line 179
    .line 180
    if-eqz v1, :cond_a

    .line 181
    .line 182
    iget-object v1, p0, Lg/d;->b:[I

    .line 183
    .line 184
    array-length v3, v8

    .line 185
    invoke-static {v8, v0, v1, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 186
    .line 187
    .line 188
    iget-object v1, p0, Lg/d;->b:[I

    .line 189
    .line 190
    iput-object v1, p0, Lg/d;->a:[I

    .line 191
    .line 192
    iget v3, v2, Lg/a;->h:I

    .line 193
    .line 194
    aput v0, v1, v3

    .line 195
    .line 196
    iget v0, v2, Lg/a;->g:I

    .line 197
    .line 198
    if-ne v0, v6, :cond_a

    .line 199
    .line 200
    iget v0, p0, Lg/d;->k:I

    .line 201
    .line 202
    if-nez v0, :cond_a

    .line 203
    .line 204
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 205
    .line 206
    iput-object v0, p0, Lg/d;->s:Ljava/lang/Boolean;

    .line 207
    .line 208
    :cond_a
    invoke-virtual {p0, v2, v7}, Lg/d;->d(Lg/a;Lg/a;)Landroid/graphics/Bitmap;

    .line 209
    .line 210
    .line 211
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 212
    monitor-exit p0

    .line 213
    return-object v0

    .line 214
    :cond_b
    :goto_4
    :try_start_2
    const-string v1, "d"

    .line 215
    .line 216
    invoke-static {v1, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    if-eqz v1, :cond_c

    .line 221
    .line 222
    const-string v1, "d"

    .line 223
    .line 224
    new-instance v2, Ljava/lang/StringBuilder;

    .line 225
    .line 226
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    iget v0, p0, Lg/d;->o:I

    .line 230
    .line 231
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 239
    .line 240
    .line 241
    :cond_c
    monitor-exit p0

    .line 242
    return-object v3

    .line 243
    :goto_5
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 244
    throw v0
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
.end method

.method public final c(Landroid/graphics/Bitmap$Config;)V
    .locals 5

    .line 1
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    sget-object v1, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 6
    .line 7
    if-ne p1, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    new-instance v3, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v4, "Unsupported format: "

    .line 15
    .line 16
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string p1, ", must be one of "

    .line 23
    .line 24
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p1, " or "

    .line 31
    .line 32
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {v2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v2

    .line 46
    :cond_1
    :goto_0
    iput-object p1, p0, Lg/d;->t:Landroid/graphics/Bitmap$Config;

    .line 47
    .line 48
    return-void
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
.end method

.method public final d(Lg/a;Lg/a;)Landroid/graphics/Bitmap;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Lg/d;->c:Ll/d;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    iget-object v6, v0, Lg/d;->j:[I

    .line 11
    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    iget-object v5, v0, Lg/d;->m:Landroid/graphics/Bitmap;

    .line 15
    .line 16
    if-eqz v5, :cond_0

    .line 17
    .line 18
    iget-object v7, v3, Ll/d;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v7, Lk/b;

    .line 21
    .line 22
    invoke-interface {v7, v5}, Lk/b;->c(Landroid/graphics/Bitmap;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    const/4 v5, 0x0

    .line 26
    iput-object v5, v0, Lg/d;->m:Landroid/graphics/Bitmap;

    .line 27
    .line 28
    invoke-static {v6, v4}, Ljava/util/Arrays;->fill([II)V

    .line 29
    .line 30
    .line 31
    :cond_1
    const/4 v13, 0x3

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    iget v5, v2, Lg/a;->g:I

    .line 35
    .line 36
    if-ne v5, v13, :cond_2

    .line 37
    .line 38
    iget-object v5, v0, Lg/d;->m:Landroid/graphics/Bitmap;

    .line 39
    .line 40
    if-nez v5, :cond_2

    .line 41
    .line 42
    invoke-static {v6, v4}, Ljava/util/Arrays;->fill([II)V

    .line 43
    .line 44
    .line 45
    :cond_2
    const/4 v14, 0x2

    .line 46
    if-eqz v2, :cond_7

    .line 47
    .line 48
    iget v5, v2, Lg/a;->g:I

    .line 49
    .line 50
    if-lez v5, :cond_7

    .line 51
    .line 52
    if-ne v5, v14, :cond_6

    .line 53
    .line 54
    iget-boolean v5, v1, Lg/a;->f:Z

    .line 55
    .line 56
    if-nez v5, :cond_3

    .line 57
    .line 58
    iget-object v5, v0, Lg/d;->l:Lg/b;

    .line 59
    .line 60
    iget v7, v5, Lg/b;->k:I

    .line 61
    .line 62
    iget-object v8, v1, Lg/a;->k:[I

    .line 63
    .line 64
    if-eqz v8, :cond_4

    .line 65
    .line 66
    iget v5, v5, Lg/b;->j:I

    .line 67
    .line 68
    iget v8, v1, Lg/a;->h:I

    .line 69
    .line 70
    if-ne v5, v8, :cond_4

    .line 71
    .line 72
    :cond_3
    move v7, v4

    .line 73
    :cond_4
    iget v5, v2, Lg/a;->d:I

    .line 74
    .line 75
    iget v8, v0, Lg/d;->p:I

    .line 76
    .line 77
    div-int/2addr v5, v8

    .line 78
    iget v9, v2, Lg/a;->b:I

    .line 79
    .line 80
    div-int/2addr v9, v8

    .line 81
    iget v10, v2, Lg/a;->c:I

    .line 82
    .line 83
    div-int/2addr v10, v8

    .line 84
    iget v2, v2, Lg/a;->a:I

    .line 85
    .line 86
    div-int/2addr v2, v8

    .line 87
    iget v8, v0, Lg/d;->r:I

    .line 88
    .line 89
    mul-int/2addr v9, v8

    .line 90
    add-int/2addr v9, v2

    .line 91
    mul-int/2addr v5, v8

    .line 92
    add-int/2addr v5, v9

    .line 93
    :goto_0
    if-ge v9, v5, :cond_7

    .line 94
    .line 95
    add-int v2, v9, v10

    .line 96
    .line 97
    move v8, v9

    .line 98
    :goto_1
    if-ge v8, v2, :cond_5

    .line 99
    .line 100
    aput v7, v6, v8

    .line 101
    .line 102
    add-int/lit8 v8, v8, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_5
    iget v2, v0, Lg/d;->r:I

    .line 106
    .line 107
    add-int/2addr v9, v2

    .line 108
    goto :goto_0

    .line 109
    :cond_6
    if-ne v5, v13, :cond_7

    .line 110
    .line 111
    iget-object v5, v0, Lg/d;->m:Landroid/graphics/Bitmap;

    .line 112
    .line 113
    if-eqz v5, :cond_7

    .line 114
    .line 115
    const/4 v10, 0x0

    .line 116
    iget v12, v0, Lg/d;->q:I

    .line 117
    .line 118
    const/4 v7, 0x0

    .line 119
    iget v8, v0, Lg/d;->r:I

    .line 120
    .line 121
    const/4 v9, 0x0

    .line 122
    move v11, v8

    .line 123
    invoke-virtual/range {v5 .. v12}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 124
    .line 125
    .line 126
    :cond_7
    iget-object v2, v0, Lg/d;->d:Ljava/nio/ByteBuffer;

    .line 127
    .line 128
    iget v5, v1, Lg/a;->j:I

    .line 129
    .line 130
    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 131
    .line 132
    .line 133
    iget v2, v1, Lg/a;->c:I

    .line 134
    .line 135
    iget v5, v1, Lg/a;->d:I

    .line 136
    .line 137
    mul-int/2addr v2, v5

    .line 138
    iget-object v5, v0, Lg/d;->i:[B

    .line 139
    .line 140
    if-eqz v5, :cond_8

    .line 141
    .line 142
    array-length v5, v5

    .line 143
    if-ge v5, v2, :cond_a

    .line 144
    .line 145
    :cond_8
    iget-object v3, v3, Ll/d;->d:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v3, Lk/g;

    .line 148
    .line 149
    if-nez v3, :cond_9

    .line 150
    .line 151
    new-array v3, v2, [B

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_9
    const-class v5, [B

    .line 155
    .line 156
    invoke-virtual {v3, v2, v5}, Lk/g;->c(ILjava/lang/Class;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    check-cast v3, [B

    .line 161
    .line 162
    :goto_2
    iput-object v3, v0, Lg/d;->i:[B

    .line 163
    .line 164
    :cond_a
    iget-object v3, v0, Lg/d;->i:[B

    .line 165
    .line 166
    iget-object v5, v0, Lg/d;->f:[S

    .line 167
    .line 168
    const/16 v7, 0x1000

    .line 169
    .line 170
    if-nez v5, :cond_b

    .line 171
    .line 172
    new-array v5, v7, [S

    .line 173
    .line 174
    iput-object v5, v0, Lg/d;->f:[S

    .line 175
    .line 176
    :cond_b
    iget-object v5, v0, Lg/d;->f:[S

    .line 177
    .line 178
    iget-object v8, v0, Lg/d;->g:[B

    .line 179
    .line 180
    if-nez v8, :cond_c

    .line 181
    .line 182
    new-array v8, v7, [B

    .line 183
    .line 184
    iput-object v8, v0, Lg/d;->g:[B

    .line 185
    .line 186
    :cond_c
    iget-object v8, v0, Lg/d;->g:[B

    .line 187
    .line 188
    iget-object v9, v0, Lg/d;->h:[B

    .line 189
    .line 190
    if-nez v9, :cond_d

    .line 191
    .line 192
    const/16 v9, 0x1001

    .line 193
    .line 194
    new-array v9, v9, [B

    .line 195
    .line 196
    iput-object v9, v0, Lg/d;->h:[B

    .line 197
    .line 198
    :cond_d
    iget-object v9, v0, Lg/d;->h:[B

    .line 199
    .line 200
    iget-object v10, v0, Lg/d;->d:Ljava/nio/ByteBuffer;

    .line 201
    .line 202
    invoke-virtual {v10}, Ljava/nio/ByteBuffer;->get()B

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    and-int/lit16 v10, v10, 0xff

    .line 207
    .line 208
    const/4 v11, 0x1

    .line 209
    shl-int v12, v11, v10

    .line 210
    .line 211
    add-int/lit8 v15, v12, 0x1

    .line 212
    .line 213
    add-int/lit8 v16, v12, 0x2

    .line 214
    .line 215
    add-int/2addr v10, v11

    .line 216
    shl-int v17, v11, v10

    .line 217
    .line 218
    add-int/lit8 v17, v17, -0x1

    .line 219
    .line 220
    move v14, v4

    .line 221
    :goto_3
    if-ge v14, v12, :cond_e

    .line 222
    .line 223
    aput-short v4, v5, v14

    .line 224
    .line 225
    move/from16 p2, v11

    .line 226
    .line 227
    int-to-byte v11, v14

    .line 228
    aput-byte v11, v8, v14

    .line 229
    .line 230
    add-int/lit8 v14, v14, 0x1

    .line 231
    .line 232
    move/from16 v11, p2

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_e
    move/from16 p2, v11

    .line 236
    .line 237
    iget-object v11, v0, Lg/d;->e:[B

    .line 238
    .line 239
    move v7, v4

    .line 240
    move/from16 v19, v7

    .line 241
    .line 242
    move/from16 v20, v19

    .line 243
    .line 244
    move/from16 v21, v20

    .line 245
    .line 246
    move/from16 v22, v21

    .line 247
    .line 248
    move/from16 v23, v22

    .line 249
    .line 250
    move/from16 v28, v23

    .line 251
    .line 252
    move/from16 v29, v28

    .line 253
    .line 254
    move/from16 v26, v10

    .line 255
    .line 256
    move/from16 v24, v16

    .line 257
    .line 258
    move/from16 v25, v17

    .line 259
    .line 260
    const/16 v27, -0x1

    .line 261
    .line 262
    :goto_4
    const/16 v30, 0x8

    .line 263
    .line 264
    if-ge v7, v2, :cond_1a

    .line 265
    .line 266
    if-nez v19, :cond_11

    .line 267
    .line 268
    const/16 v31, -0x1

    .line 269
    .line 270
    iget-object v14, v0, Lg/d;->d:Ljava/nio/ByteBuffer;

    .line 271
    .line 272
    invoke-virtual {v14}, Ljava/nio/ByteBuffer;->get()B

    .line 273
    .line 274
    .line 275
    move-result v14

    .line 276
    and-int/lit16 v14, v14, 0xff

    .line 277
    .line 278
    if-gtz v14, :cond_f

    .line 279
    .line 280
    move-object/from16 v32, v5

    .line 281
    .line 282
    move-object/from16 v33, v6

    .line 283
    .line 284
    goto :goto_5

    .line 285
    :cond_f
    iget-object v13, v0, Lg/d;->d:Ljava/nio/ByteBuffer;

    .line 286
    .line 287
    iget-object v4, v0, Lg/d;->e:[B

    .line 288
    .line 289
    move-object/from16 v32, v5

    .line 290
    .line 291
    invoke-virtual {v13}, Ljava/nio/Buffer;->remaining()I

    .line 292
    .line 293
    .line 294
    move-result v5

    .line 295
    invoke-static {v14, v5}, Ljava/lang/Math;->min(II)I

    .line 296
    .line 297
    .line 298
    move-result v5

    .line 299
    move-object/from16 v33, v6

    .line 300
    .line 301
    const/4 v6, 0x0

    .line 302
    invoke-virtual {v13, v4, v6, v5}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 303
    .line 304
    .line 305
    :goto_5
    if-gtz v14, :cond_10

    .line 306
    .line 307
    const/4 v4, 0x3

    .line 308
    iput v4, v0, Lg/d;->o:I

    .line 309
    .line 310
    const/4 v6, 0x0

    .line 311
    :goto_6
    move/from16 v4, v23

    .line 312
    .line 313
    goto/16 :goto_d

    .line 314
    .line 315
    :cond_10
    move/from16 v19, v14

    .line 316
    .line 317
    const/16 v20, 0x0

    .line 318
    .line 319
    goto :goto_7

    .line 320
    :cond_11
    move-object/from16 v32, v5

    .line 321
    .line 322
    move-object/from16 v33, v6

    .line 323
    .line 324
    const/16 v31, -0x1

    .line 325
    .line 326
    :goto_7
    aget-byte v4, v11, v20

    .line 327
    .line 328
    and-int/lit16 v4, v4, 0xff

    .line 329
    .line 330
    shl-int v4, v4, v21

    .line 331
    .line 332
    add-int v22, v22, v4

    .line 333
    .line 334
    add-int/lit8 v21, v21, 0x8

    .line 335
    .line 336
    add-int/lit8 v20, v20, 0x1

    .line 337
    .line 338
    add-int/lit8 v19, v19, -0x1

    .line 339
    .line 340
    move/from16 v4, v21

    .line 341
    .line 342
    move/from16 v5, v24

    .line 343
    .line 344
    move/from16 v6, v26

    .line 345
    .line 346
    move/from16 v13, v27

    .line 347
    .line 348
    move/from16 v14, v28

    .line 349
    .line 350
    :goto_8
    move/from16 v21, v4

    .line 351
    .line 352
    if-lt v4, v6, :cond_19

    .line 353
    .line 354
    and-int v4, v22, v25

    .line 355
    .line 356
    shr-int v22, v22, v6

    .line 357
    .line 358
    sub-int v21, v21, v6

    .line 359
    .line 360
    if-ne v4, v12, :cond_12

    .line 361
    .line 362
    move v6, v10

    .line 363
    move/from16 v5, v16

    .line 364
    .line 365
    move/from16 v25, v17

    .line 366
    .line 367
    move/from16 v4, v21

    .line 368
    .line 369
    move/from16 v13, v31

    .line 370
    .line 371
    goto :goto_8

    .line 372
    :cond_12
    if-ne v4, v15, :cond_13

    .line 373
    .line 374
    move/from16 v24, v5

    .line 375
    .line 376
    move/from16 v26, v6

    .line 377
    .line 378
    move/from16 v27, v13

    .line 379
    .line 380
    move/from16 v28, v14

    .line 381
    .line 382
    move-object/from16 v5, v32

    .line 383
    .line 384
    move-object/from16 v6, v33

    .line 385
    .line 386
    const/4 v4, 0x0

    .line 387
    const/4 v13, 0x3

    .line 388
    goto :goto_4

    .line 389
    :cond_13
    move/from16 v24, v6

    .line 390
    .line 391
    move/from16 v6, v31

    .line 392
    .line 393
    if-ne v13, v6, :cond_14

    .line 394
    .line 395
    aget-byte v6, v8, v4

    .line 396
    .line 397
    aput-byte v6, v3, v23

    .line 398
    .line 399
    add-int/lit8 v23, v23, 0x1

    .line 400
    .line 401
    add-int/lit8 v7, v7, 0x1

    .line 402
    .line 403
    move v13, v4

    .line 404
    move v14, v13

    .line 405
    move/from16 v4, v21

    .line 406
    .line 407
    move/from16 v6, v24

    .line 408
    .line 409
    :goto_9
    const/16 v31, -0x1

    .line 410
    .line 411
    goto :goto_8

    .line 412
    :cond_14
    if-lt v4, v5, :cond_15

    .line 413
    .line 414
    int-to-byte v6, v14

    .line 415
    aput-byte v6, v9, v29

    .line 416
    .line 417
    add-int/lit8 v29, v29, 0x1

    .line 418
    .line 419
    move v6, v13

    .line 420
    goto :goto_a

    .line 421
    :cond_15
    move v6, v4

    .line 422
    :goto_a
    if-lt v6, v12, :cond_16

    .line 423
    .line 424
    aget-byte v14, v8, v6

    .line 425
    .line 426
    aput-byte v14, v9, v29

    .line 427
    .line 428
    add-int/lit8 v29, v29, 0x1

    .line 429
    .line 430
    aget-short v6, v32, v6

    .line 431
    .line 432
    goto :goto_a

    .line 433
    :cond_16
    aget-byte v6, v8, v6

    .line 434
    .line 435
    and-int/lit16 v14, v6, 0xff

    .line 436
    .line 437
    int-to-byte v6, v14

    .line 438
    aput-byte v6, v3, v23

    .line 439
    .line 440
    :goto_b
    add-int/lit8 v23, v23, 0x1

    .line 441
    .line 442
    add-int/lit8 v7, v7, 0x1

    .line 443
    .line 444
    if-lez v29, :cond_17

    .line 445
    .line 446
    add-int/lit8 v29, v29, -0x1

    .line 447
    .line 448
    aget-byte v26, v9, v29

    .line 449
    .line 450
    aput-byte v26, v3, v23

    .line 451
    .line 452
    goto :goto_b

    .line 453
    :cond_17
    move/from16 v26, v4

    .line 454
    .line 455
    const/16 v4, 0x1000

    .line 456
    .line 457
    if-ge v5, v4, :cond_18

    .line 458
    .line 459
    int-to-short v13, v13

    .line 460
    aput-short v13, v32, v5

    .line 461
    .line 462
    aput-byte v6, v8, v5

    .line 463
    .line 464
    add-int/lit8 v5, v5, 0x1

    .line 465
    .line 466
    and-int v6, v5, v25

    .line 467
    .line 468
    if-nez v6, :cond_18

    .line 469
    .line 470
    if-ge v5, v4, :cond_18

    .line 471
    .line 472
    add-int/lit8 v6, v24, 0x1

    .line 473
    .line 474
    add-int v25, v25, v5

    .line 475
    .line 476
    goto :goto_c

    .line 477
    :cond_18
    move/from16 v6, v24

    .line 478
    .line 479
    :goto_c
    move/from16 v4, v21

    .line 480
    .line 481
    move/from16 v13, v26

    .line 482
    .line 483
    goto :goto_9

    .line 484
    :cond_19
    move/from16 v24, v6

    .line 485
    .line 486
    move/from16 v27, v13

    .line 487
    .line 488
    move/from16 v28, v14

    .line 489
    .line 490
    move/from16 v26, v24

    .line 491
    .line 492
    move-object/from16 v6, v33

    .line 493
    .line 494
    const/4 v4, 0x0

    .line 495
    const/4 v13, 0x3

    .line 496
    move/from16 v24, v5

    .line 497
    .line 498
    move-object/from16 v5, v32

    .line 499
    .line 500
    goto/16 :goto_4

    .line 501
    .line 502
    :cond_1a
    move-object/from16 v33, v6

    .line 503
    .line 504
    move v6, v4

    .line 505
    goto/16 :goto_6

    .line 506
    .line 507
    :goto_d
    invoke-static {v3, v4, v2, v6}, Ljava/util/Arrays;->fill([BIIB)V

    .line 508
    .line 509
    .line 510
    iget-boolean v2, v1, Lg/a;->e:Z

    .line 511
    .line 512
    if-nez v2, :cond_25

    .line 513
    .line 514
    iget v2, v0, Lg/d;->p:I

    .line 515
    .line 516
    move/from16 v3, p2

    .line 517
    .line 518
    if-eq v2, v3, :cond_1b

    .line 519
    .line 520
    goto/16 :goto_13

    .line 521
    .line 522
    :cond_1b
    iget v2, v1, Lg/a;->d:I

    .line 523
    .line 524
    iget v3, v1, Lg/a;->b:I

    .line 525
    .line 526
    iget v4, v1, Lg/a;->c:I

    .line 527
    .line 528
    iget v5, v1, Lg/a;->a:I

    .line 529
    .line 530
    iget v7, v0, Lg/d;->k:I

    .line 531
    .line 532
    if-nez v7, :cond_1c

    .line 533
    .line 534
    const/4 v7, 0x1

    .line 535
    goto :goto_e

    .line 536
    :cond_1c
    move v7, v6

    .line 537
    :goto_e
    iget-object v8, v0, Lg/d;->i:[B

    .line 538
    .line 539
    iget-object v9, v0, Lg/d;->a:[I

    .line 540
    .line 541
    move v10, v6

    .line 542
    const/4 v11, -0x1

    .line 543
    :goto_f
    if-ge v10, v2, :cond_21

    .line 544
    .line 545
    add-int v12, v10, v3

    .line 546
    .line 547
    iget v13, v0, Lg/d;->r:I

    .line 548
    .line 549
    mul-int/2addr v12, v13

    .line 550
    add-int v14, v12, v5

    .line 551
    .line 552
    add-int v15, v14, v4

    .line 553
    .line 554
    add-int/2addr v12, v13

    .line 555
    if-ge v12, v15, :cond_1d

    .line 556
    .line 557
    move v15, v12

    .line 558
    :cond_1d
    iget v12, v1, Lg/a;->c:I

    .line 559
    .line 560
    mul-int/2addr v12, v10

    .line 561
    :goto_10
    if-ge v14, v15, :cond_20

    .line 562
    .line 563
    aget-byte v13, v8, v12

    .line 564
    .line 565
    and-int/lit16 v6, v13, 0xff

    .line 566
    .line 567
    if-eq v6, v11, :cond_1f

    .line 568
    .line 569
    aget v6, v9, v6

    .line 570
    .line 571
    if-eqz v6, :cond_1e

    .line 572
    .line 573
    iget-object v13, v0, Lg/d;->j:[I

    .line 574
    .line 575
    aput v6, v13, v14

    .line 576
    .line 577
    goto :goto_11

    .line 578
    :cond_1e
    move v11, v13

    .line 579
    :cond_1f
    :goto_11
    add-int/lit8 v12, v12, 0x1

    .line 580
    .line 581
    add-int/lit8 v14, v14, 0x1

    .line 582
    .line 583
    const/4 v6, 0x0

    .line 584
    goto :goto_10

    .line 585
    :cond_20
    add-int/lit8 v10, v10, 0x1

    .line 586
    .line 587
    const/4 v6, 0x0

    .line 588
    goto :goto_f

    .line 589
    :cond_21
    iget-object v2, v0, Lg/d;->s:Ljava/lang/Boolean;

    .line 590
    .line 591
    if-eqz v2, :cond_22

    .line 592
    .line 593
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 594
    .line 595
    .line 596
    move-result v2

    .line 597
    if-nez v2, :cond_23

    .line 598
    .line 599
    :cond_22
    iget-object v2, v0, Lg/d;->s:Ljava/lang/Boolean;

    .line 600
    .line 601
    if-nez v2, :cond_24

    .line 602
    .line 603
    if-eqz v7, :cond_24

    .line 604
    .line 605
    const/4 v6, -0x1

    .line 606
    if-eq v11, v6, :cond_24

    .line 607
    .line 608
    :cond_23
    const/4 v4, 0x1

    .line 609
    goto :goto_12

    .line 610
    :cond_24
    const/4 v4, 0x0

    .line 611
    :goto_12
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    iput-object v2, v0, Lg/d;->s:Ljava/lang/Boolean;

    .line 616
    .line 617
    goto/16 :goto_23

    .line 618
    .line 619
    :cond_25
    :goto_13
    iget v2, v1, Lg/a;->d:I

    .line 620
    .line 621
    iget v3, v0, Lg/d;->p:I

    .line 622
    .line 623
    div-int/2addr v2, v3

    .line 624
    iget v4, v1, Lg/a;->b:I

    .line 625
    .line 626
    div-int/2addr v4, v3

    .line 627
    iget v5, v1, Lg/a;->c:I

    .line 628
    .line 629
    div-int/2addr v5, v3

    .line 630
    iget v6, v1, Lg/a;->a:I

    .line 631
    .line 632
    div-int/2addr v6, v3

    .line 633
    iget v7, v0, Lg/d;->k:I

    .line 634
    .line 635
    if-nez v7, :cond_26

    .line 636
    .line 637
    const/4 v7, 0x1

    .line 638
    goto :goto_14

    .line 639
    :cond_26
    const/4 v7, 0x0

    .line 640
    :goto_14
    iget-object v8, v0, Lg/d;->i:[B

    .line 641
    .line 642
    iget-object v9, v0, Lg/d;->a:[I

    .line 643
    .line 644
    iget-object v10, v0, Lg/d;->s:Ljava/lang/Boolean;

    .line 645
    .line 646
    move-object v13, v10

    .line 647
    move/from16 v14, v30

    .line 648
    .line 649
    const/4 v10, 0x0

    .line 650
    const/4 v11, 0x1

    .line 651
    const/4 v12, 0x0

    .line 652
    :goto_15
    if-ge v12, v2, :cond_3c

    .line 653
    .line 654
    iget-boolean v15, v1, Lg/a;->e:Z

    .line 655
    .line 656
    if-eqz v15, :cond_2b

    .line 657
    .line 658
    if-lt v10, v2, :cond_2a

    .line 659
    .line 660
    add-int/lit8 v11, v11, 0x1

    .line 661
    .line 662
    const/4 v15, 0x2

    .line 663
    if-eq v11, v15, :cond_29

    .line 664
    .line 665
    const/4 v15, 0x3

    .line 666
    if-eq v11, v15, :cond_28

    .line 667
    .line 668
    const/4 v15, 0x4

    .line 669
    if-eq v11, v15, :cond_27

    .line 670
    .line 671
    goto :goto_16

    .line 672
    :cond_27
    const/4 v10, 0x1

    .line 673
    const/4 v14, 0x2

    .line 674
    goto :goto_16

    .line 675
    :cond_28
    const/4 v15, 0x4

    .line 676
    move v14, v15

    .line 677
    const/4 v10, 0x2

    .line 678
    goto :goto_16

    .line 679
    :cond_29
    const/4 v15, 0x4

    .line 680
    move v10, v15

    .line 681
    :cond_2a
    :goto_16
    add-int v15, v10, v14

    .line 682
    .line 683
    goto :goto_17

    .line 684
    :cond_2b
    move v15, v10

    .line 685
    move v10, v12

    .line 686
    :goto_17
    add-int/2addr v10, v4

    .line 687
    move/from16 v16, v2

    .line 688
    .line 689
    const/4 v2, 0x1

    .line 690
    if-ne v3, v2, :cond_2c

    .line 691
    .line 692
    const/16 v17, 0x1

    .line 693
    .line 694
    goto :goto_18

    .line 695
    :cond_2c
    const/16 v17, 0x0

    .line 696
    .line 697
    :goto_18
    iget v2, v0, Lg/d;->q:I

    .line 698
    .line 699
    if-ge v10, v2, :cond_3b

    .line 700
    .line 701
    iget v2, v0, Lg/d;->r:I

    .line 702
    .line 703
    mul-int/2addr v10, v2

    .line 704
    add-int v18, v10, v6

    .line 705
    .line 706
    move/from16 v19, v2

    .line 707
    .line 708
    add-int v2, v18, v5

    .line 709
    .line 710
    add-int v10, v10, v19

    .line 711
    .line 712
    if-ge v10, v2, :cond_2d

    .line 713
    .line 714
    move v2, v10

    .line 715
    :cond_2d
    mul-int v10, v12, v3

    .line 716
    .line 717
    move/from16 v19, v3

    .line 718
    .line 719
    iget v3, v1, Lg/a;->c:I

    .line 720
    .line 721
    mul-int/2addr v10, v3

    .line 722
    iget-object v3, v0, Lg/d;->j:[I

    .line 723
    .line 724
    if-eqz v17, :cond_32

    .line 725
    .line 726
    move-object/from16 v17, v3

    .line 727
    .line 728
    move/from16 v3, v18

    .line 729
    .line 730
    :goto_19
    if-ge v3, v2, :cond_30

    .line 731
    .line 732
    move/from16 v18, v3

    .line 733
    .line 734
    aget-byte v3, v8, v10

    .line 735
    .line 736
    and-int/lit16 v3, v3, 0xff

    .line 737
    .line 738
    aget v3, v9, v3

    .line 739
    .line 740
    if-eqz v3, :cond_2e

    .line 741
    .line 742
    aput v3, v17, v18

    .line 743
    .line 744
    goto :goto_1a

    .line 745
    :cond_2e
    if-eqz v7, :cond_2f

    .line 746
    .line 747
    if-nez v13, :cond_2f

    .line 748
    .line 749
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 750
    .line 751
    move-object v13, v3

    .line 752
    :cond_2f
    :goto_1a
    add-int v10, v10, v19

    .line 753
    .line 754
    add-int/lit8 v3, v18, 0x1

    .line 755
    .line 756
    goto :goto_19

    .line 757
    :cond_30
    :goto_1b
    move/from16 v18, v4

    .line 758
    .line 759
    :cond_31
    move/from16 v28, v5

    .line 760
    .line 761
    goto/16 :goto_21

    .line 762
    .line 763
    :cond_32
    move-object/from16 v17, v3

    .line 764
    .line 765
    sub-int v3, v2, v18

    .line 766
    .line 767
    mul-int v3, v3, v19

    .line 768
    .line 769
    add-int/2addr v3, v10

    .line 770
    move/from16 v34, v18

    .line 771
    .line 772
    move/from16 v18, v4

    .line 773
    .line 774
    move/from16 v4, v34

    .line 775
    .line 776
    :goto_1c
    if-ge v4, v2, :cond_31

    .line 777
    .line 778
    move/from16 v20, v2

    .line 779
    .line 780
    iget v2, v1, Lg/a;->c:I

    .line 781
    .line 782
    move/from16 v26, v2

    .line 783
    .line 784
    move/from16 v27, v4

    .line 785
    .line 786
    move v2, v10

    .line 787
    const/16 v21, 0x0

    .line 788
    .line 789
    const/16 v22, 0x0

    .line 790
    .line 791
    const/16 v23, 0x0

    .line 792
    .line 793
    const/16 v24, 0x0

    .line 794
    .line 795
    const/16 v25, 0x0

    .line 796
    .line 797
    :goto_1d
    iget v4, v0, Lg/d;->p:I

    .line 798
    .line 799
    add-int/2addr v4, v10

    .line 800
    if-ge v2, v4, :cond_34

    .line 801
    .line 802
    iget-object v4, v0, Lg/d;->i:[B

    .line 803
    .line 804
    move/from16 v28, v5

    .line 805
    .line 806
    array-length v5, v4

    .line 807
    if-ge v2, v5, :cond_35

    .line 808
    .line 809
    if-ge v2, v3, :cond_35

    .line 810
    .line 811
    aget-byte v4, v4, v2

    .line 812
    .line 813
    and-int/lit16 v4, v4, 0xff

    .line 814
    .line 815
    iget-object v5, v0, Lg/d;->a:[I

    .line 816
    .line 817
    aget v4, v5, v4

    .line 818
    .line 819
    if-eqz v4, :cond_33

    .line 820
    .line 821
    shr-int/lit8 v5, v4, 0x18

    .line 822
    .line 823
    and-int/lit16 v5, v5, 0xff

    .line 824
    .line 825
    add-int v21, v21, v5

    .line 826
    .line 827
    shr-int/lit8 v5, v4, 0x10

    .line 828
    .line 829
    and-int/lit16 v5, v5, 0xff

    .line 830
    .line 831
    add-int v22, v22, v5

    .line 832
    .line 833
    shr-int/lit8 v5, v4, 0x8

    .line 834
    .line 835
    and-int/lit16 v5, v5, 0xff

    .line 836
    .line 837
    add-int v23, v23, v5

    .line 838
    .line 839
    and-int/lit16 v4, v4, 0xff

    .line 840
    .line 841
    add-int v24, v24, v4

    .line 842
    .line 843
    add-int/lit8 v25, v25, 0x1

    .line 844
    .line 845
    :cond_33
    add-int/lit8 v2, v2, 0x1

    .line 846
    .line 847
    move/from16 v5, v28

    .line 848
    .line 849
    goto :goto_1d

    .line 850
    :cond_34
    move/from16 v28, v5

    .line 851
    .line 852
    :cond_35
    add-int v2, v10, v26

    .line 853
    .line 854
    move v4, v2

    .line 855
    :goto_1e
    iget v5, v0, Lg/d;->p:I

    .line 856
    .line 857
    add-int/2addr v5, v2

    .line 858
    if-ge v4, v5, :cond_37

    .line 859
    .line 860
    iget-object v5, v0, Lg/d;->i:[B

    .line 861
    .line 862
    move/from16 v26, v2

    .line 863
    .line 864
    array-length v2, v5

    .line 865
    if-ge v4, v2, :cond_37

    .line 866
    .line 867
    if-ge v4, v3, :cond_37

    .line 868
    .line 869
    aget-byte v2, v5, v4

    .line 870
    .line 871
    and-int/lit16 v2, v2, 0xff

    .line 872
    .line 873
    iget-object v5, v0, Lg/d;->a:[I

    .line 874
    .line 875
    aget v2, v5, v2

    .line 876
    .line 877
    if-eqz v2, :cond_36

    .line 878
    .line 879
    shr-int/lit8 v5, v2, 0x18

    .line 880
    .line 881
    and-int/lit16 v5, v5, 0xff

    .line 882
    .line 883
    add-int v21, v21, v5

    .line 884
    .line 885
    shr-int/lit8 v5, v2, 0x10

    .line 886
    .line 887
    and-int/lit16 v5, v5, 0xff

    .line 888
    .line 889
    add-int v22, v22, v5

    .line 890
    .line 891
    shr-int/lit8 v5, v2, 0x8

    .line 892
    .line 893
    and-int/lit16 v5, v5, 0xff

    .line 894
    .line 895
    add-int v23, v23, v5

    .line 896
    .line 897
    and-int/lit16 v2, v2, 0xff

    .line 898
    .line 899
    add-int v24, v24, v2

    .line 900
    .line 901
    add-int/lit8 v25, v25, 0x1

    .line 902
    .line 903
    :cond_36
    add-int/lit8 v4, v4, 0x1

    .line 904
    .line 905
    move/from16 v2, v26

    .line 906
    .line 907
    goto :goto_1e

    .line 908
    :cond_37
    if-nez v25, :cond_38

    .line 909
    .line 910
    const/4 v2, 0x0

    .line 911
    goto :goto_1f

    .line 912
    :cond_38
    div-int v21, v21, v25

    .line 913
    .line 914
    shl-int/lit8 v2, v21, 0x18

    .line 915
    .line 916
    div-int v22, v22, v25

    .line 917
    .line 918
    shl-int/lit8 v4, v22, 0x10

    .line 919
    .line 920
    or-int/2addr v2, v4

    .line 921
    div-int v23, v23, v25

    .line 922
    .line 923
    shl-int/lit8 v4, v23, 0x8

    .line 924
    .line 925
    or-int/2addr v2, v4

    .line 926
    div-int v24, v24, v25

    .line 927
    .line 928
    or-int v2, v2, v24

    .line 929
    .line 930
    :goto_1f
    if-eqz v2, :cond_39

    .line 931
    .line 932
    aput v2, v17, v27

    .line 933
    .line 934
    goto :goto_20

    .line 935
    :cond_39
    if-eqz v7, :cond_3a

    .line 936
    .line 937
    if-nez v13, :cond_3a

    .line 938
    .line 939
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 940
    .line 941
    move-object v13, v2

    .line 942
    :cond_3a
    :goto_20
    add-int v10, v10, v19

    .line 943
    .line 944
    add-int/lit8 v4, v27, 0x1

    .line 945
    .line 946
    move/from16 v2, v20

    .line 947
    .line 948
    move/from16 v5, v28

    .line 949
    .line 950
    goto/16 :goto_1c

    .line 951
    .line 952
    :cond_3b
    move/from16 v19, v3

    .line 953
    .line 954
    goto/16 :goto_1b

    .line 955
    .line 956
    :goto_21
    add-int/lit8 v12, v12, 0x1

    .line 957
    .line 958
    move v10, v15

    .line 959
    move/from16 v2, v16

    .line 960
    .line 961
    move/from16 v4, v18

    .line 962
    .line 963
    move/from16 v3, v19

    .line 964
    .line 965
    move/from16 v5, v28

    .line 966
    .line 967
    goto/16 :goto_15

    .line 968
    .line 969
    :cond_3c
    iget-object v2, v0, Lg/d;->s:Ljava/lang/Boolean;

    .line 970
    .line 971
    if-nez v2, :cond_3e

    .line 972
    .line 973
    if-nez v13, :cond_3d

    .line 974
    .line 975
    const/4 v4, 0x0

    .line 976
    goto :goto_22

    .line 977
    :cond_3d
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 978
    .line 979
    .line 980
    move-result v4

    .line 981
    :goto_22
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 982
    .line 983
    .line 984
    move-result-object v2

    .line 985
    iput-object v2, v0, Lg/d;->s:Ljava/lang/Boolean;

    .line 986
    .line 987
    :cond_3e
    :goto_23
    iget-boolean v2, v0, Lg/d;->n:Z

    .line 988
    .line 989
    if-eqz v2, :cond_3f

    .line 990
    .line 991
    iget v1, v1, Lg/a;->g:I

    .line 992
    .line 993
    if-eqz v1, :cond_40

    .line 994
    .line 995
    const/4 v2, 0x1

    .line 996
    if-ne v1, v2, :cond_3f

    .line 997
    .line 998
    goto :goto_24

    .line 999
    :cond_3f
    move-object/from16 v6, v33

    .line 1000
    .line 1001
    goto :goto_25

    .line 1002
    :cond_40
    :goto_24
    iget-object v1, v0, Lg/d;->m:Landroid/graphics/Bitmap;

    .line 1003
    .line 1004
    if-nez v1, :cond_41

    .line 1005
    .line 1006
    invoke-virtual {v0}, Lg/d;->a()Landroid/graphics/Bitmap;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v1

    .line 1010
    iput-object v1, v0, Lg/d;->m:Landroid/graphics/Bitmap;

    .line 1011
    .line 1012
    :cond_41
    iget-object v5, v0, Lg/d;->m:Landroid/graphics/Bitmap;

    .line 1013
    .line 1014
    const/4 v10, 0x0

    .line 1015
    iget v12, v0, Lg/d;->q:I

    .line 1016
    .line 1017
    const/4 v7, 0x0

    .line 1018
    iget v8, v0, Lg/d;->r:I

    .line 1019
    .line 1020
    const/4 v9, 0x0

    .line 1021
    move v11, v8

    .line 1022
    move-object/from16 v6, v33

    .line 1023
    .line 1024
    invoke-virtual/range {v5 .. v12}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 1025
    .line 1026
    .line 1027
    :goto_25
    invoke-virtual {v0}, Lg/d;->a()Landroid/graphics/Bitmap;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v5

    .line 1031
    const/4 v10, 0x0

    .line 1032
    iget v12, v0, Lg/d;->q:I

    .line 1033
    .line 1034
    const/4 v7, 0x0

    .line 1035
    iget v8, v0, Lg/d;->r:I

    .line 1036
    .line 1037
    const/4 v9, 0x0

    .line 1038
    move v11, v8

    .line 1039
    invoke-virtual/range {v5 .. v12}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 1040
    .line 1041
    .line 1042
    return-object v5
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
.end method
