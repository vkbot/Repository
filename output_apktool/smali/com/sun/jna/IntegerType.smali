.class public abstract Lcom/sun/jna/IntegerType;
.super Ljava/lang/Number;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"

# interfaces
.implements Lcom/sun/jna/NativeMapped;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private number:Ljava/lang/Number;

.field private size:I

.field private unsigned:Z

.field private value:J


# direct methods
.method public constructor <init>(I)V
    .locals 3

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    .line 14
    invoke-direct {p0, p1, v0, v1, v2}, Lcom/sun/jna/IntegerType;-><init>(IJZ)V

    return-void
.end method

.method public constructor <init>(IJ)V
    .locals 1

    const/4 v0, 0x0

    .line 13
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/sun/jna/IntegerType;-><init>(IJZ)V

    return-void
.end method

.method public constructor <init>(IJZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Number;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/sun/jna/IntegerType;->size:I

    .line 5
    .line 6
    iput-boolean p4, p0, Lcom/sun/jna/IntegerType;->unsigned:Z

    .line 7
    .line 8
    invoke-virtual {p0, p2, p3}, Lcom/sun/jna/IntegerType;->setValue(J)V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method public constructor <init>(IZ)V
    .locals 2

    const-wide/16 v0, 0x0

    .line 12
    invoke-direct {p0, p1, v0, v1, p2}, Lcom/sun/jna/IntegerType;-><init>(IJZ)V

    return-void
.end method

.method public static final compare(JJ)I
    .locals 0

    .line 26
    cmp-long p0, p0, p2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    if-gez p0, :cond_1

    const/4 p0, -0x1

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static compare(Lcom/sun/jna/IntegerType;J)I
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    .line 27
    :cond_0
    invoke-virtual {p0}, Lcom/sun/jna/IntegerType;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Lcom/sun/jna/IntegerType;->compare(JJ)I

    move-result p0

    return p0
.end method

.method public static compare(Lcom/sun/jna/IntegerType;Lcom/sun/jna/IntegerType;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/sun/jna/IntegerType;",
            ">(TT;TT;)I"
        }
    .end annotation

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    if-nez p0, :cond_1

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_1
    if-nez p1, :cond_2

    .line 10
    .line 11
    const/4 p0, -0x1

    .line 12
    return p0

    .line 13
    :cond_2
    invoke-virtual {p0}, Lcom/sun/jna/IntegerType;->longValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-virtual {p1}, Lcom/sun/jna/IntegerType;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide p0

    .line 21
    invoke-static {v0, v1, p0, p1}, Lcom/sun/jna/IntegerType;->compare(JJ)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0
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
.method public doubleValue()D
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/sun/jna/IntegerType;->number:Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/sun/jna/IntegerType;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/sun/jna/IntegerType;->number:Ljava/lang/Number;

    .line 6
    .line 7
    check-cast p1, Lcom/sun/jna/IntegerType;

    .line 8
    .line 9
    iget-object p1, p1, Lcom/sun/jna/IntegerType;->number:Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
    .line 21
    .line 22
    .line 23
.end method

.method public floatValue()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/sun/jna/IntegerType;->number:Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public fromNative(Ljava/lang/Object;Lcom/sun/jna/FromNativeContext;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-wide/16 p1, 0x0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 9
    .line 10
    .line 11
    move-result-wide p1

    .line 12
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Lcom/sun/jna/Klass;->newInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lcom/sun/jna/IntegerType;

    .line 21
    .line 22
    invoke-virtual {v0, p1, p2}, Lcom/sun/jna/IntegerType;->setValue(J)V

    .line 23
    .line 24
    .line 25
    return-object v0
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

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/sun/jna/IntegerType;->number:Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public intValue()I
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/sun/jna/IntegerType;->value:J

    .line 2
    .line 3
    long-to-int v0, v0

    .line 4
    return v0
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
.end method

.method public longValue()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/sun/jna/IntegerType;->value:J

    .line 2
    .line 3
    return-wide v0
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
.end method

.method public nativeType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/sun/jna/IntegerType;->number:Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public setValue(J)V
    .locals 7

    .line 1
    iput-wide p1, p0, Lcom/sun/jna/IntegerType;->value:J

    .line 2
    .line 3
    iget v0, p0, Lcom/sun/jna/IntegerType;->size:I

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/16 v2, 0x8

    .line 7
    .line 8
    if-eq v0, v1, :cond_5

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-eq v0, v1, :cond_3

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    if-eq v0, v1, :cond_1

    .line 15
    .line 16
    if-ne v0, v2, :cond_0

    .line 17
    .line 18
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lcom/sun/jna/IntegerType;->number:Ljava/lang/Number;

    .line 23
    .line 24
    move-wide v3, p1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string p1, "Unsupported size: "

    .line 27
    .line 28
    iget p2, p0, Lcom/sun/jna/IntegerType;->size:I

    .line 29
    .line 30
    invoke-static {p2, p1}, Landroidx/navigation/b;->b(ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    iget-boolean v0, p0, Lcom/sun/jna/IntegerType;->unsigned:Z

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    const-wide v0, 0xffffffffL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    and-long/2addr v0, p1

    .line 44
    iput-wide v0, p0, Lcom/sun/jna/IntegerType;->value:J

    .line 45
    .line 46
    :cond_2
    long-to-int v0, p1

    .line 47
    int-to-long v3, v0

    .line 48
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lcom/sun/jna/IntegerType;->number:Ljava/lang/Number;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    iget-boolean v0, p0, Lcom/sun/jna/IntegerType;->unsigned:Z

    .line 56
    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    const-wide/32 v0, 0xffff

    .line 60
    .line 61
    .line 62
    and-long/2addr v0, p1

    .line 63
    iput-wide v0, p0, Lcom/sun/jna/IntegerType;->value:J

    .line 64
    .line 65
    :cond_4
    long-to-int v0, p1

    .line 66
    int-to-short v0, v0

    .line 67
    int-to-long v3, v0

    .line 68
    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, Lcom/sun/jna/IntegerType;->number:Ljava/lang/Number;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_5
    iget-boolean v0, p0, Lcom/sun/jna/IntegerType;->unsigned:Z

    .line 76
    .line 77
    if-eqz v0, :cond_6

    .line 78
    .line 79
    const-wide/16 v0, 0xff

    .line 80
    .line 81
    and-long/2addr v0, p1

    .line 82
    iput-wide v0, p0, Lcom/sun/jna/IntegerType;->value:J

    .line 83
    .line 84
    :cond_6
    long-to-int v0, p1

    .line 85
    int-to-byte v0, v0

    .line 86
    int-to-long v3, v0

    .line 87
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iput-object v0, p0, Lcom/sun/jna/IntegerType;->number:Ljava/lang/Number;

    .line 92
    .line 93
    :goto_0
    iget v0, p0, Lcom/sun/jna/IntegerType;->size:I

    .line 94
    .line 95
    if-ge v0, v2, :cond_9

    .line 96
    .line 97
    mul-int/2addr v0, v2

    .line 98
    const-wide/16 v1, 0x1

    .line 99
    .line 100
    shl-long v5, v1, v0

    .line 101
    .line 102
    sub-long/2addr v5, v1

    .line 103
    not-long v0, v5

    .line 104
    const-wide/16 v5, 0x0

    .line 105
    .line 106
    cmp-long v2, p1, v5

    .line 107
    .line 108
    if-gez v2, :cond_7

    .line 109
    .line 110
    cmp-long v3, v3, p1

    .line 111
    .line 112
    if-nez v3, :cond_8

    .line 113
    .line 114
    :cond_7
    if-ltz v2, :cond_9

    .line 115
    .line 116
    and-long v2, v0, p1

    .line 117
    .line 118
    cmp-long v2, v2, v5

    .line 119
    .line 120
    if-nez v2, :cond_8

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_8
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 124
    .line 125
    invoke-static {p1, p2}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    iget p2, p0, Lcom/sun/jna/IntegerType;->size:I

    .line 130
    .line 131
    invoke-static {v0, v1}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    new-instance v1, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    const-string v3, "Argument value 0x"

    .line 138
    .line 139
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string p1, " exceeds native capacity ("

    .line 146
    .line 147
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string p1, " bytes) mask=0x"

    .line 154
    .line 155
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-direct {v2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw v2

    .line 169
    :cond_9
    :goto_1
    return-void
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
.end method

.method public toNative()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/sun/jna/IntegerType;->number:Ljava/lang/Number;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/sun/jna/IntegerType;->number:Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method
