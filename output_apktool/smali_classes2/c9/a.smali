.class public final Lc9/a;
.super Ljava/lang/Thread;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# static fields
.field public static final j:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public final b:Lc9/m;

.field public final c:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public d:I

.field public e:J

.field public f:J

.field public g:I

.field public h:Z

.field public final synthetic i:Lc9/b;

.field private volatile indexInArray:I

.field private volatile nextParkedWorker:Ljava/lang/Object;

.field private volatile workerCtl:I
    .annotation runtime Lkotlin/jvm/Volatile;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lc9/a;

    .line 2
    .line 3
    const-string v1, "workerCtl"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lc9/a;->j:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

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
.end method

.method public constructor <init>(Lc9/b;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc9/a;->i:Lc9/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-virtual {p0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Lc9/m;

    .line 11
    .line 12
    invoke-direct {p1}, Lc9/m;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lc9/a;->b:Lc9/m;

    .line 16
    .line 17
    new-instance p1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 18
    .line 19
    invoke-direct {p1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lc9/a;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 23
    .line 24
    const/4 p1, 0x4

    .line 25
    iput p1, p0, Lc9/a;->d:I

    .line 26
    .line 27
    sget-object p1, Lc9/b;->l:La9/w;

    .line 28
    .line 29
    iput-object p1, p0, Lc9/a;->nextParkedWorker:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object p1, Lkotlin/random/Random;->Default:Lkotlin/random/Random$Default;

    .line 32
    .line 33
    invoke-virtual {p1}, Lkotlin/random/Random$Default;->nextInt()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iput p1, p0, Lc9/a;->g:I

    .line 38
    .line 39
    invoke-virtual {p0, p2}, Lc9/a;->f(I)V

    .line 40
    .line 41
    .line 42
    return-void
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
.method public final a(Z)Lc9/h;
    .locals 10

    .line 1
    iget v0, p0, Lc9/a;->d:I

    .line 2
    .line 3
    iget-object v2, p0, Lc9/a;->i:Lc9/b;

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    const/4 v8, 0x1

    .line 7
    iget-object v9, p0, Lc9/a;->b:Lc9/m;

    .line 8
    .line 9
    if-ne v0, v8, :cond_0

    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_0
    sget-object v0, Lc9/b;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 14
    .line 15
    :cond_1
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    const-wide v5, 0x7ffffc0000000000L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    and-long/2addr v5, v3

    .line 25
    const/16 v1, 0x2a

    .line 26
    .line 27
    shr-long/2addr v5, v1

    .line 28
    long-to-int v1, v5

    .line 29
    if-nez v1, :cond_b

    .line 30
    .line 31
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    :goto_0
    sget-object p1, Lc9/m;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 35
    .line 36
    invoke-virtual {p1, v9}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lc9/h;

    .line 41
    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    iget-object v1, v0, Lc9/h;->c:Lc9/i;

    .line 46
    .line 47
    iget v1, v1, Lc9/i;->b:I

    .line 48
    .line 49
    if-ne v1, v8, :cond_5

    .line 50
    .line 51
    :cond_3
    invoke-virtual {p1, v9, v0, v7}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    move-object v7, v0

    .line 58
    goto :goto_2

    .line 59
    :cond_4
    invoke-virtual {p1, v9}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    if-eq v1, v0, :cond_3

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_5
    :goto_1
    sget-object p1, Lc9/m;->d:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 67
    .line 68
    invoke-virtual {p1, v9}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    sget-object v0, Lc9/m;->c:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 73
    .line 74
    invoke-virtual {v0, v9}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    :cond_6
    if-eq p1, v0, :cond_8

    .line 79
    .line 80
    sget-object v1, Lc9/m;->e:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 81
    .line 82
    invoke-virtual {v1, v9}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-nez v1, :cond_7

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_7
    add-int/lit8 v0, v0, -0x1

    .line 90
    .line 91
    invoke-virtual {v9, v0, v8}, Lc9/m;->c(IZ)Lc9/h;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    if-eqz v1, :cond_6

    .line 96
    .line 97
    move-object v7, v1

    .line 98
    :cond_8
    :goto_2
    if-nez v7, :cond_a

    .line 99
    .line 100
    iget-object p1, v2, Lc9/b;->g:Lc9/e;

    .line 101
    .line 102
    invoke-virtual {p1}, La9/n;->d()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    check-cast p1, Lc9/h;

    .line 107
    .line 108
    if-nez p1, :cond_9

    .line 109
    .line 110
    invoke-virtual {p0, v8}, Lc9/a;->i(I)Lc9/h;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    :cond_9
    return-object p1

    .line 115
    :cond_a
    return-object v7

    .line 116
    :cond_b
    const-wide v5, 0x40000000000L

    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    sub-long v5, v3, v5

    .line 122
    .line 123
    sget-object v1, Lc9/b;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 124
    .line 125
    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_1

    .line 130
    .line 131
    iput v8, p0, Lc9/a;->d:I

    .line 132
    .line 133
    :goto_3
    if-eqz p1, :cond_10

    .line 134
    .line 135
    iget p1, v2, Lc9/b;->b:I

    .line 136
    .line 137
    mul-int/lit8 p1, p1, 0x2

    .line 138
    .line 139
    invoke-virtual {p0, p1}, Lc9/a;->d(I)I

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    if-nez p1, :cond_c

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_c
    const/4 v8, 0x0

    .line 147
    :goto_4
    if-eqz v8, :cond_d

    .line 148
    .line 149
    invoke-virtual {p0}, Lc9/a;->e()Lc9/h;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    if-eqz p1, :cond_d

    .line 154
    .line 155
    return-object p1

    .line 156
    :cond_d
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    sget-object p1, Lc9/m;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 160
    .line 161
    invoke-virtual {p1, v9, v7}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    check-cast p1, Lc9/h;

    .line 166
    .line 167
    if-nez p1, :cond_e

    .line 168
    .line 169
    invoke-virtual {v9}, Lc9/m;->b()Lc9/h;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    :cond_e
    if-eqz p1, :cond_f

    .line 174
    .line 175
    return-object p1

    .line 176
    :cond_f
    if-nez v8, :cond_11

    .line 177
    .line 178
    invoke-virtual {p0}, Lc9/a;->e()Lc9/h;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    if-eqz p1, :cond_11

    .line 183
    .line 184
    return-object p1

    .line 185
    :cond_10
    invoke-virtual {p0}, Lc9/a;->e()Lc9/h;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    if-eqz p1, :cond_11

    .line 190
    .line 191
    return-object p1

    .line 192
    :cond_11
    const/4 p1, 0x3

    .line 193
    invoke-virtual {p0, p1}, Lc9/a;->i(I)Lc9/h;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    return-object p1
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
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lc9/a;->indexInArray:I

    .line 2
    .line 3
    return v0
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

.method public final c()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lc9/a;->nextParkedWorker:Ljava/lang/Object;

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

.method public final d(I)I
    .locals 3

    .line 1
    iget v0, p0, Lc9/a;->g:I

    .line 2
    .line 3
    shl-int/lit8 v1, v0, 0xd

    .line 4
    .line 5
    xor-int/2addr v0, v1

    .line 6
    shr-int/lit8 v1, v0, 0x11

    .line 7
    .line 8
    xor-int/2addr v0, v1

    .line 9
    shl-int/lit8 v1, v0, 0x5

    .line 10
    .line 11
    xor-int/2addr v0, v1

    .line 12
    iput v0, p0, Lc9/a;->g:I

    .line 13
    .line 14
    add-int/lit8 v1, p1, -0x1

    .line 15
    .line 16
    and-int v2, v1, p1

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    and-int p1, v0, v1

    .line 21
    .line 22
    return p1

    .line 23
    :cond_0
    const v1, 0x7fffffff

    .line 24
    .line 25
    .line 26
    and-int/2addr v0, v1

    .line 27
    rem-int/2addr v0, p1

    .line 28
    return v0
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

.method public final e()Lc9/h;
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lc9/a;->d(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Lc9/a;->i:Lc9/b;

    .line 7
    .line 8
    iget-object v2, v1, Lc9/b;->g:Lc9/e;

    .line 9
    .line 10
    iget-object v1, v1, Lc9/b;->f:Lc9/e;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v1}, La9/n;->d()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lc9/h;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    invoke-virtual {v2}, La9/n;->d()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lc9/h;

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_1
    invoke-virtual {v2}, La9/n;->d()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lc9/h;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_2
    invoke-virtual {v1}, La9/n;->d()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Lc9/h;

    .line 44
    .line 45
    return-object v0
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

.method public final f(I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lc9/a;->i:Lc9/b;

    .line 7
    .line 8
    iget-object v1, v1, Lc9/b;->e:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "-worker-"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const-string v1, "TERMINATED"

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iput p1, p0, Lc9/a;->indexInArray:I

    .line 38
    .line 39
    return-void
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

.method public final g(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc9/a;->nextParkedWorker:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
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

.method public final h(I)Z
    .locals 6

    .line 1
    iget v0, p0, Lc9/a;->d:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-eqz v1, :cond_1

    .line 9
    .line 10
    sget-object v2, Lc9/b;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 11
    .line 12
    const-wide v3, 0x40000000000L

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    iget-object v5, p0, Lc9/a;->i:Lc9/b;

    .line 18
    .line 19
    invoke-virtual {v2, v5, v3, v4}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 20
    .line 21
    .line 22
    :cond_1
    if-eq v0, p1, :cond_2

    .line 23
    .line 24
    iput p1, p0, Lc9/a;->d:I

    .line 25
    .line 26
    :cond_2
    return v1
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

.method public final i(I)Lc9/h;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Lc9/b;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 6
    .line 7
    iget-object v3, v0, Lc9/a;->i:Lc9/b;

    .line 8
    .line 9
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    const-wide/32 v6, 0x1fffff

    .line 14
    .line 15
    .line 16
    and-long/2addr v4, v6

    .line 17
    long-to-int v2, v4

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x2

    .line 20
    if-ge v2, v5, :cond_0

    .line 21
    .line 22
    return-object v4

    .line 23
    :cond_0
    invoke-virtual {v0, v2}, Lc9/a;->d(I)I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    const/4 v10, 0x0

    .line 28
    const-wide v11, 0x7fffffffffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    :goto_0
    if-ge v10, v2, :cond_11

    .line 34
    .line 35
    const/4 v15, 0x1

    .line 36
    add-int/2addr v6, v15

    .line 37
    if-le v6, v2, :cond_1

    .line 38
    .line 39
    move v6, v15

    .line 40
    :cond_1
    iget-object v5, v3, Lc9/b;->h:La9/s;

    .line 41
    .line 42
    invoke-virtual {v5, v6}, La9/s;->b(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    check-cast v5, Lc9/a;

    .line 47
    .line 48
    if-eqz v5, :cond_f

    .line 49
    .line 50
    if-eq v5, v0, :cond_f

    .line 51
    .line 52
    iget-object v5, v5, Lc9/a;->b:Lc9/m;

    .line 53
    .line 54
    const/4 v7, 0x3

    .line 55
    if-ne v1, v7, :cond_2

    .line 56
    .line 57
    invoke-virtual {v5}, Lc9/m;->b()Lc9/h;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    const-wide v16, 0x7fffffffffffffffL

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    const-wide/16 v18, 0x0

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_2
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    sget-object v7, Lc9/m;->d:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 73
    .line 74
    invoke-virtual {v7, v5}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    const-wide v16, 0x7fffffffffffffffL

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    sget-object v8, Lc9/m;->c:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 84
    .line 85
    invoke-virtual {v8, v5}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    if-ne v1, v15, :cond_3

    .line 90
    .line 91
    move v9, v15

    .line 92
    goto :goto_1

    .line 93
    :cond_3
    const/4 v9, 0x0

    .line 94
    :goto_1
    if-eq v7, v8, :cond_5

    .line 95
    .line 96
    const-wide/16 v18, 0x0

    .line 97
    .line 98
    if-eqz v9, :cond_4

    .line 99
    .line 100
    sget-object v13, Lc9/m;->e:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 101
    .line 102
    invoke-virtual {v13, v5}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 103
    .line 104
    .line 105
    move-result v13

    .line 106
    if-nez v13, :cond_4

    .line 107
    .line 108
    :goto_2
    move-object v7, v4

    .line 109
    goto :goto_3

    .line 110
    :cond_4
    add-int/lit8 v13, v7, 0x1

    .line 111
    .line 112
    invoke-virtual {v5, v7, v9}, Lc9/m;->c(IZ)Lc9/h;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    if-nez v7, :cond_6

    .line 117
    .line 118
    move v7, v13

    .line 119
    goto :goto_1

    .line 120
    :cond_5
    const-wide/16 v18, 0x0

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_6
    :goto_3
    iget-object v13, v0, Lc9/a;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 124
    .line 125
    if-eqz v7, :cond_7

    .line 126
    .line 127
    iput-object v7, v13, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 128
    .line 129
    move-object v5, v4

    .line 130
    const-wide/16 v7, -0x1

    .line 131
    .line 132
    const-wide/16 v20, -0x1

    .line 133
    .line 134
    goto :goto_7

    .line 135
    :cond_7
    :goto_4
    sget-object v7, Lc9/m;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 136
    .line 137
    invoke-virtual {v7, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v14

    .line 141
    check-cast v14, Lc9/h;

    .line 142
    .line 143
    if-nez v14, :cond_8

    .line 144
    .line 145
    const-wide/16 v20, -0x1

    .line 146
    .line 147
    goto :goto_6

    .line 148
    :cond_8
    const-wide/16 v20, -0x1

    .line 149
    .line 150
    iget-object v8, v14, Lc9/h;->c:Lc9/i;

    .line 151
    .line 152
    iget v8, v8, Lc9/i;->b:I

    .line 153
    .line 154
    if-ne v8, v15, :cond_9

    .line 155
    .line 156
    move v8, v15

    .line 157
    goto :goto_5

    .line 158
    :cond_9
    const/4 v8, 0x2

    .line 159
    :goto_5
    and-int/2addr v8, v1

    .line 160
    if-nez v8, :cond_a

    .line 161
    .line 162
    :goto_6
    const-wide/16 v7, -0x2

    .line 163
    .line 164
    move-object v5, v4

    .line 165
    goto :goto_7

    .line 166
    :cond_a
    sget-object v8, Lc9/k;->f:Lc9/f;

    .line 167
    .line 168
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 172
    .line 173
    .line 174
    move-result-wide v8

    .line 175
    move-object/from16 v23, v5

    .line 176
    .line 177
    iget-wide v4, v14, Lc9/h;->b:J

    .line 178
    .line 179
    sub-long/2addr v8, v4

    .line 180
    sget-wide v4, Lc9/k;->b:J

    .line 181
    .line 182
    cmp-long v24, v8, v4

    .line 183
    .line 184
    if-gez v24, :cond_b

    .line 185
    .line 186
    sub-long v7, v4, v8

    .line 187
    .line 188
    const/4 v5, 0x0

    .line 189
    goto :goto_7

    .line 190
    :cond_b
    move-object/from16 v4, v23

    .line 191
    .line 192
    :cond_c
    const/4 v5, 0x0

    .line 193
    invoke-virtual {v7, v4, v14, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    if-eqz v8, :cond_e

    .line 198
    .line 199
    iput-object v14, v13, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 200
    .line 201
    move-wide/from16 v7, v20

    .line 202
    .line 203
    :goto_7
    cmp-long v4, v7, v20

    .line 204
    .line 205
    if-nez v4, :cond_d

    .line 206
    .line 207
    iget-object v1, v13, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v1, Lc9/h;

    .line 210
    .line 211
    iput-object v5, v13, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 212
    .line 213
    return-object v1

    .line 214
    :cond_d
    cmp-long v4, v7, v18

    .line 215
    .line 216
    if-lez v4, :cond_10

    .line 217
    .line 218
    invoke-static {v11, v12, v7, v8}, Ljava/lang/Math;->min(JJ)J

    .line 219
    .line 220
    .line 221
    move-result-wide v11

    .line 222
    goto :goto_8

    .line 223
    :cond_e
    invoke-virtual {v7, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    if-eq v5, v14, :cond_c

    .line 228
    .line 229
    move-object v5, v4

    .line 230
    const/4 v4, 0x0

    .line 231
    goto :goto_4

    .line 232
    :cond_f
    const-wide v16, 0x7fffffffffffffffL

    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    :cond_10
    :goto_8
    add-int/lit8 v10, v10, 0x1

    .line 238
    .line 239
    const/4 v4, 0x0

    .line 240
    const/4 v5, 0x2

    .line 241
    goto/16 :goto_0

    .line 242
    .line 243
    :cond_11
    const-wide v16, 0x7fffffffffffffffL

    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    const-wide/16 v18, 0x0

    .line 249
    .line 250
    cmp-long v1, v11, v16

    .line 251
    .line 252
    if-eqz v1, :cond_12

    .line 253
    .line 254
    goto :goto_9

    .line 255
    :cond_12
    move-wide/from16 v11, v18

    .line 256
    .line 257
    :goto_9
    iput-wide v11, v0, Lc9/a;->f:J

    .line 258
    .line 259
    const/16 v22, 0x0

    .line 260
    .line 261
    return-object v22
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
.end method

.method public final run()V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :cond_0
    :goto_0
    move v0, v2

    .line 5
    :cond_1
    :goto_1
    iget-object v3, v1, Lc9/a;->i:Lc9/b;

    .line 6
    .line 7
    sget-object v4, Lc9/b;->k:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 8
    .line 9
    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/4 v4, 0x5

    .line 14
    if-eqz v3, :cond_2

    .line 15
    .line 16
    goto/16 :goto_a

    .line 17
    .line 18
    :cond_2
    iget v3, v1, Lc9/a;->d:I

    .line 19
    .line 20
    if-eq v3, v4, :cond_18

    .line 21
    .line 22
    iget-boolean v3, v1, Lc9/a;->h:Z

    .line 23
    .line 24
    invoke-virtual {v1, v3}, Lc9/a;->a(Z)Lc9/h;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const/4 v5, 0x3

    .line 29
    const-wide/32 v6, -0x200000

    .line 30
    .line 31
    .line 32
    const-wide/16 v8, 0x0

    .line 33
    .line 34
    if-eqz v3, :cond_9

    .line 35
    .line 36
    iput-wide v8, v1, Lc9/a;->f:J

    .line 37
    .line 38
    iget-object v10, v1, Lc9/a;->i:Lc9/b;

    .line 39
    .line 40
    iget-object v0, v3, Lc9/h;->c:Lc9/i;

    .line 41
    .line 42
    iget v11, v0, Lc9/i;->b:I

    .line 43
    .line 44
    iput-wide v8, v1, Lc9/a;->e:J

    .line 45
    .line 46
    iget v0, v1, Lc9/a;->d:I

    .line 47
    .line 48
    const/4 v8, 0x2

    .line 49
    if-ne v0, v5, :cond_3

    .line 50
    .line 51
    iput v8, v1, Lc9/a;->d:I

    .line 52
    .line 53
    :cond_3
    if-nez v11, :cond_4

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_4
    invoke-virtual {v1, v8}, Lc9/a;->h(I)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_7

    .line 61
    .line 62
    invoke-virtual {v10}, Lc9/b;->c0()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_5

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_5
    sget-object v0, Lc9/b;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 70
    .line 71
    invoke-virtual {v0, v10}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 72
    .line 73
    .line 74
    move-result-wide v8

    .line 75
    invoke-virtual {v10, v8, v9}, Lc9/b;->V(J)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_6

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_6
    invoke-virtual {v10}, Lc9/b;->c0()Z

    .line 83
    .line 84
    .line 85
    :cond_7
    :goto_2
    :try_start_0
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    .line 88
    goto :goto_3

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-virtual {v3}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-interface {v5, v3, v0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    :goto_3
    if-nez v11, :cond_8

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_8
    sget-object v0, Lc9/b;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 105
    .line 106
    invoke-virtual {v0, v10, v6, v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 107
    .line 108
    .line 109
    iget v0, v1, Lc9/a;->d:I

    .line 110
    .line 111
    if-eq v0, v4, :cond_0

    .line 112
    .line 113
    const/4 v0, 0x4

    .line 114
    iput v0, v1, Lc9/a;->d:I

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_9
    iput-boolean v2, v1, Lc9/a;->h:Z

    .line 118
    .line 119
    iget-wide v10, v1, Lc9/a;->f:J

    .line 120
    .line 121
    cmp-long v3, v10, v8

    .line 122
    .line 123
    const/4 v10, 0x1

    .line 124
    if-eqz v3, :cond_b

    .line 125
    .line 126
    if-nez v0, :cond_a

    .line 127
    .line 128
    move v0, v10

    .line 129
    goto :goto_1

    .line 130
    :cond_a
    invoke-virtual {v1, v5}, Lc9/a;->h(I)Z

    .line 131
    .line 132
    .line 133
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 134
    .line 135
    .line 136
    iget-wide v3, v1, Lc9/a;->f:J

    .line 137
    .line 138
    invoke-static {v3, v4}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(J)V

    .line 139
    .line 140
    .line 141
    iput-wide v8, v1, Lc9/a;->f:J

    .line 142
    .line 143
    goto/16 :goto_0

    .line 144
    .line 145
    :cond_b
    iget-object v3, v1, Lc9/a;->nextParkedWorker:Ljava/lang/Object;

    .line 146
    .line 147
    sget-object v11, Lc9/b;->l:La9/w;

    .line 148
    .line 149
    if-eq v3, v11, :cond_15

    .line 150
    .line 151
    sget-object v3, Lc9/a;->j:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 152
    .line 153
    const/4 v6, -0x1

    .line 154
    invoke-virtual {v3, v1, v6}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    .line 155
    .line 156
    .line 157
    :cond_c
    :goto_4
    iget-object v3, v1, Lc9/a;->nextParkedWorker:Ljava/lang/Object;

    .line 158
    .line 159
    sget-object v7, Lc9/b;->l:La9/w;

    .line 160
    .line 161
    if-eq v3, v7, :cond_1

    .line 162
    .line 163
    sget-object v3, Lc9/a;->j:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 164
    .line 165
    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    if-ne v7, v6, :cond_1

    .line 170
    .line 171
    iget-object v7, v1, Lc9/a;->i:Lc9/b;

    .line 172
    .line 173
    sget-object v11, Lc9/b;->k:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 174
    .line 175
    invoke-virtual {v11, v7}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    if-eqz v7, :cond_d

    .line 180
    .line 181
    goto/16 :goto_1

    .line 182
    .line 183
    :cond_d
    iget v7, v1, Lc9/a;->d:I

    .line 184
    .line 185
    if-ne v7, v4, :cond_e

    .line 186
    .line 187
    goto/16 :goto_1

    .line 188
    .line 189
    :cond_e
    invoke-virtual {v1, v5}, Lc9/a;->h(I)Z

    .line 190
    .line 191
    .line 192
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 193
    .line 194
    .line 195
    iget-wide v14, v1, Lc9/a;->e:J

    .line 196
    .line 197
    cmp-long v7, v14, v8

    .line 198
    .line 199
    if-nez v7, :cond_f

    .line 200
    .line 201
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 202
    .line 203
    .line 204
    move-result-wide v14

    .line 205
    iget-object v7, v1, Lc9/a;->i:Lc9/b;

    .line 206
    .line 207
    const-wide/32 v16, 0x1fffff

    .line 208
    .line 209
    .line 210
    iget-wide v12, v7, Lc9/b;->d:J

    .line 211
    .line 212
    add-long/2addr v14, v12

    .line 213
    iput-wide v14, v1, Lc9/a;->e:J

    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_f
    const-wide/32 v16, 0x1fffff

    .line 217
    .line 218
    .line 219
    :goto_5
    iget-object v7, v1, Lc9/a;->i:Lc9/b;

    .line 220
    .line 221
    iget-wide v12, v7, Lc9/b;->d:J

    .line 222
    .line 223
    invoke-static {v12, v13}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(J)V

    .line 224
    .line 225
    .line 226
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 227
    .line 228
    .line 229
    move-result-wide v12

    .line 230
    iget-wide v14, v1, Lc9/a;->e:J

    .line 231
    .line 232
    sub-long/2addr v12, v14

    .line 233
    cmp-long v7, v12, v8

    .line 234
    .line 235
    if-ltz v7, :cond_c

    .line 236
    .line 237
    iput-wide v8, v1, Lc9/a;->e:J

    .line 238
    .line 239
    iget-object v7, v1, Lc9/a;->i:Lc9/b;

    .line 240
    .line 241
    iget-object v12, v7, Lc9/b;->h:La9/s;

    .line 242
    .line 243
    monitor-enter v12

    .line 244
    :try_start_1
    invoke-virtual {v11, v7}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 245
    .line 246
    .line 247
    move-result v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 248
    if-eqz v11, :cond_10

    .line 249
    .line 250
    move v11, v10

    .line 251
    goto :goto_6

    .line 252
    :cond_10
    move v11, v2

    .line 253
    :goto_6
    if-eqz v11, :cond_11

    .line 254
    .line 255
    monitor-exit v12

    .line 256
    goto :goto_4

    .line 257
    :cond_11
    :try_start_2
    sget-object v11, Lc9/b;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 258
    .line 259
    invoke-virtual {v11, v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 260
    .line 261
    .line 262
    move-result-wide v13

    .line 263
    and-long v13, v13, v16

    .line 264
    .line 265
    long-to-int v13, v13

    .line 266
    iget v14, v7, Lc9/b;->b:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 267
    .line 268
    if-gt v13, v14, :cond_12

    .line 269
    .line 270
    monitor-exit v12

    .line 271
    goto :goto_4

    .line 272
    :cond_12
    :try_start_3
    invoke-virtual {v3, v1, v6, v10}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 273
    .line 274
    .line 275
    move-result v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 276
    if-nez v3, :cond_13

    .line 277
    .line 278
    monitor-exit v12

    .line 279
    goto :goto_4

    .line 280
    :cond_13
    :try_start_4
    iget v3, v1, Lc9/a;->indexInArray:I

    .line 281
    .line 282
    invoke-virtual {v1, v2}, Lc9/a;->f(I)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v7, v1, v3, v2}, Lc9/b;->S(Lc9/a;II)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v11, v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndDecrement(Ljava/lang/Object;)J

    .line 289
    .line 290
    .line 291
    move-result-wide v13

    .line 292
    and-long v13, v13, v16

    .line 293
    .line 294
    long-to-int v11, v13

    .line 295
    if-eq v11, v3, :cond_14

    .line 296
    .line 297
    iget-object v13, v7, Lc9/b;->h:La9/s;

    .line 298
    .line 299
    invoke-virtual {v13, v11}, La9/s;->b(I)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v13

    .line 303
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    check-cast v13, Lc9/a;

    .line 307
    .line 308
    iget-object v14, v7, Lc9/b;->h:La9/s;

    .line 309
    .line 310
    invoke-virtual {v14, v3, v13}, La9/s;->c(ILc9/a;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v13, v3}, Lc9/a;->f(I)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v7, v13, v11, v3}, Lc9/b;->S(Lc9/a;II)V

    .line 317
    .line 318
    .line 319
    goto :goto_7

    .line 320
    :catchall_1
    move-exception v0

    .line 321
    goto :goto_8

    .line 322
    :cond_14
    :goto_7
    iget-object v3, v7, Lc9/b;->h:La9/s;

    .line 323
    .line 324
    const/4 v7, 0x0

    .line 325
    invoke-virtual {v3, v11, v7}, La9/s;->c(ILc9/a;)V

    .line 326
    .line 327
    .line 328
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 329
    .line 330
    monitor-exit v12

    .line 331
    iput v4, v1, Lc9/a;->d:I

    .line 332
    .line 333
    goto/16 :goto_4

    .line 334
    .line 335
    :goto_8
    monitor-exit v12

    .line 336
    throw v0

    .line 337
    :cond_15
    const-wide/32 v16, 0x1fffff

    .line 338
    .line 339
    .line 340
    iget-object v3, v1, Lc9/a;->i:Lc9/b;

    .line 341
    .line 342
    iget-object v4, v1, Lc9/a;->nextParkedWorker:Ljava/lang/Object;

    .line 343
    .line 344
    if-eq v4, v11, :cond_16

    .line 345
    .line 346
    goto/16 :goto_1

    .line 347
    .line 348
    :cond_16
    sget-object v5, Lc9/b;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 349
    .line 350
    :goto_9
    invoke-virtual {v5, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 351
    .line 352
    .line 353
    move-result-wide v20

    .line 354
    and-long v8, v20, v16

    .line 355
    .line 356
    long-to-int v4, v8

    .line 357
    const-wide/32 v8, 0x200000

    .line 358
    .line 359
    .line 360
    add-long v8, v20, v8

    .line 361
    .line 362
    and-long/2addr v8, v6

    .line 363
    iget v10, v1, Lc9/a;->indexInArray:I

    .line 364
    .line 365
    iget-object v11, v3, Lc9/b;->h:La9/s;

    .line 366
    .line 367
    invoke-virtual {v11, v4}, La9/s;->b(I)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    iput-object v4, v1, Lc9/a;->nextParkedWorker:Ljava/lang/Object;

    .line 372
    .line 373
    sget-object v18, Lc9/b;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 374
    .line 375
    int-to-long v10, v10

    .line 376
    or-long v22, v8, v10

    .line 377
    .line 378
    move-object/from16 v19, v3

    .line 379
    .line 380
    invoke-virtual/range {v18 .. v23}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 381
    .line 382
    .line 383
    move-result v3

    .line 384
    if-eqz v3, :cond_17

    .line 385
    .line 386
    goto/16 :goto_1

    .line 387
    .line 388
    :cond_17
    move-object/from16 v3, v19

    .line 389
    .line 390
    goto :goto_9

    .line 391
    :cond_18
    :goto_a
    invoke-virtual {v1, v4}, Lc9/a;->h(I)Z

    .line 392
    .line 393
    .line 394
    return-void
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
.end method
