.class public Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;
.super Ljava/io/InputStream;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream$Builder;
    }
.end annotation


# static fields
.field public static final END_OF_STREAM:I = -0x1


# instance fields
.field private final data:[B

.field private final eod:I

.field private markedOffset:I

.field private offset:I


# direct methods
.method private constructor <init>(Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream$Builder;)V
    .locals 2

    .line 49
    invoke-static {p1}, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream$Builder;->access$100(Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream$Builder;)[B

    move-result-object v0

    invoke-static {p1}, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream$Builder;->access$200(Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream$Builder;)I

    move-result v1

    invoke-static {p1}, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream$Builder;->access$300(Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream$Builder;)I

    move-result p1

    invoke-direct {p0, v0, v1, p1}, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;-><init>([BII)V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream$Builder;Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream$1;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;-><init>(Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream$Builder;)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 50
    array-length v0, p1

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1, v1}, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;-><init>([BIII)V

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 51
    array-length v0, p1

    const-string v1, "offset"

    invoke-static {p2, v1}, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->requireNonNegative(ILjava/lang/String;)I

    move-result v1

    invoke-static {p1, p2}, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->minPosLen([BI)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {p1, p2}, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->minPosLen([BI)I

    move-result p2

    invoke-direct {p0, p1, v0, v1, p2}, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;-><init>([BIII)V

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "offset"

    .line 5
    .line 6
    invoke-static {p2, v0}, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->requireNonNegative(ILjava/lang/String;)I

    .line 7
    .line 8
    .line 9
    const-string v0, "length"

    .line 10
    .line 11
    invoke-static {p3, v0}, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->requireNonNegative(ILjava/lang/String;)I

    .line 12
    .line 13
    .line 14
    const-string v0, "data"

    .line 15
    .line 16
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-object v0, p1

    .line 20
    check-cast v0, [B

    .line 21
    .line 22
    iput-object v0, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->data:[B

    .line 23
    .line 24
    invoke-static {p1, p2}, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->minPosLen([BI)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    add-int/2addr v0, p3

    .line 29
    array-length p3, p1

    .line 30
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    iput p3, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->eod:I

    .line 35
    .line 36
    invoke-static {p1, p2}, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->minPosLen([BI)I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    iput p3, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->offset:I

    .line 41
    .line 42
    invoke-static {p1, p2}, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->minPosLen([BI)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    iput p1, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->markedOffset:I

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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
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
.end method

.method private constructor <init>([BIII)V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 54
    const-string v0, "data"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, [B

    iput-object p1, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->data:[B

    .line 55
    iput p2, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->eod:I

    .line 56
    iput p3, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->offset:I

    .line 57
    iput p4, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->markedOffset:I

    return-void
.end method

.method public static builder()Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream$Builder;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
    .line 7
    .line 8
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
.end method

.method private static minPosLen([BI)I
    .locals 1

    .line 1
    const-string v0, "defaultValue"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->requireNonNegative(ILjava/lang/String;)I

    .line 4
    .line 5
    .line 6
    array-length v0, p0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    array-length p0, p0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move p0, p1

    .line 12
    :goto_0
    invoke-static {p1, p0}, Ljava/lang/Math;->min(II)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
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
.end method

.method private static requireNonNegative(ILjava/lang/String;)I
    .locals 0

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    return p0

    .line 4
    :cond_0
    const-string p0, " cannot be negative"

    .line 5
    .line 6
    invoke-static {p1, p0}, Lai/onnxruntime/a;->C(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Lj1/i;->k(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return p0
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
.end method


# virtual methods
.method public available()I
    .locals 2

    .line 1
    iget v0, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->offset:I

    .line 2
    .line 3
    iget v1, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->eod:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    sub-int/2addr v1, v0

    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
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
.end method

.method public mark(I)V
    .locals 0

    .line 1
    iget p1, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->offset:I

    .line 2
    .line 3
    iput p1, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->markedOffset:I

    .line 4
    .line 5
    return-void
    .line 6
    .line 7
    .line 8
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
.end method

.method public markSupported()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
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
.end method

.method public read()I
    .locals 3

    .line 37
    iget v0, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->offset:I

    iget v1, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->eod:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->data:[B

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->offset:I

    aget-byte v0, v1, v0

    and-int/lit16 v0, v0, 0xff

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public read([B)I
    .locals 2

    .line 35
    const-string v0, "dest"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 36
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->read([BII)I

    move-result p1

    return p1
.end method

.method public read([BII)I
    .locals 3

    .line 1
    invoke-static {p1, p2, p3}, Lorg/apache/commons/io/IOUtils;->checkFromIndexSize([BII)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    iget v1, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->offset:I

    .line 9
    .line 10
    iget v2, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->eod:I

    .line 11
    .line 12
    if-lt v1, v2, :cond_1

    .line 13
    .line 14
    const/4 p1, -0x1

    .line 15
    return p1

    .line 16
    :cond_1
    sub-int/2addr v2, v1

    .line 17
    if-ge p3, v2, :cond_2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    move p3, v2

    .line 21
    :goto_0
    if-gtz p3, :cond_3

    .line 22
    .line 23
    return v0

    .line 24
    :cond_3
    iget-object v0, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->data:[B

    .line 25
    .line 26
    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 27
    .line 28
    .line 29
    iget p1, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->offset:I

    .line 30
    .line 31
    add-int/2addr p1, p3

    .line 32
    iput p1, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->offset:I

    .line 33
    .line 34
    return p3
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
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
.end method

.method public reset()V
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->markedOffset:I

    .line 2
    .line 3
    iput v0, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->offset:I

    .line 4
    .line 5
    return-void
    .line 6
    .line 7
    .line 8
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
.end method

.method public skip(J)J
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_1

    .line 6
    .line 7
    iget v0, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->eod:I

    .line 8
    .line 9
    iget v1, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->offset:I

    .line 10
    .line 11
    sub-int/2addr v0, v1

    .line 12
    int-to-long v2, v0

    .line 13
    cmp-long v0, p1, v2

    .line 14
    .line 15
    if-gez v0, :cond_0

    .line 16
    .line 17
    move-wide v2, p1

    .line 18
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Math;->toIntExact(J)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-static {v1, p1}, Ljava/lang/Math;->addExact(II)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iput p1, p0, Lorg/apache/commons/io/input/UnsynchronizedByteArrayInputStream;->offset:I

    .line 27
    .line 28
    return-wide v2

    .line 29
    :cond_1
    const-string p1, "Skipping backward is not supported"

    .line 30
    .line 31
    invoke-static {p1}, Lj1/i;->k(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-wide/16 p1, 0x0

    .line 35
    .line 36
    return-wide p1
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
.end method
