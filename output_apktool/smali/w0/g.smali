.class public final Lw0/g;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"

# interfaces
.implements Lw0/y;


# static fields
.field public static u:Lw0/b;

.field public static v:Lw0/b;

.field public static w:Lw0/f;


# instance fields
.field public final a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public b:Ljava/util/concurrent/ScheduledFuture;

.field public final c:Landroid/media/AudioManager;

.field public d:Landroid/media/AudioFocusRequest;

.field public e:Landroid/media/AudioRecord;

.field public final f:Lorg/vosk/Model;

.field public final g:Landroid/content/Context;

.field public h:Z

.field public final i:I

.field public final j:[B

.field public final k:[B

.field public final l:Ljava/lang/Object;

.field public m:Lorg/vosk/Recognizer;

.field public n:Lorg/vosk/Recognizer;

.field public o:I

.field public p:I

.field public q:Z

.field public r:Ljava/lang/String;

.field public s:J

.field public t:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lw0/b;->b:Lw0/b;

    .line 2
    .line 3
    sput-object v0, Lw0/g;->u:Lw0/b;

    .line 4
    .line 5
    sput-object v0, Lw0/g;->v:Lw0/b;

    .line 6
    .line 7
    return-void
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

.method public constructor <init>(Landroid/content/Context;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    const/16 v2, 0xc

    .line 9
    .line 10
    new-array v3, v2, [B

    .line 11
    .line 12
    fill-array-data v3, :array_0

    .line 13
    .line 14
    .line 15
    const/16 v4, 0x8

    .line 16
    .line 17
    new-array v5, v4, [B

    .line 18
    .line 19
    fill-array-data v5, :array_1

    .line 20
    .line 21
    .line 22
    invoke-static {v3, v5}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    new-array v3, v2, [B

    .line 26
    .line 27
    fill-array-data v3, :array_2

    .line 28
    .line 29
    .line 30
    new-array v5, v4, [B

    .line 31
    .line 32
    fill-array-data v5, :array_3

    .line 33
    .line 34
    .line 35
    invoke-static {v3, v5}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const/4 v5, -0x1

    .line 40
    invoke-static {v5, v3}, Le0/w;->c(ILjava/lang/String;)Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    iput-object v3, v0, Lw0/g;->a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    iput-boolean v3, v0, Lw0/g;->h:Z

    .line 48
    .line 49
    const/16 v5, 0x3e80

    .line 50
    .line 51
    const/16 v6, 0x10

    .line 52
    .line 53
    const/4 v7, 0x2

    .line 54
    invoke-static {v5, v6, v7}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    iput v5, v0, Lw0/g;->i:I

    .line 59
    .line 60
    const/16 v5, 0x2000

    .line 61
    .line 62
    new-array v5, v5, [B

    .line 63
    .line 64
    iput-object v5, v0, Lw0/g;->j:[B

    .line 65
    .line 66
    const v5, 0x27100

    .line 67
    .line 68
    .line 69
    new-array v5, v5, [B

    .line 70
    .line 71
    iput-object v5, v0, Lw0/g;->k:[B

    .line 72
    .line 73
    new-instance v5, Ljava/lang/Object;

    .line 74
    .line 75
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v5, v0, Lw0/g;->l:Ljava/lang/Object;

    .line 79
    .line 80
    iput v3, v0, Lw0/g;->o:I

    .line 81
    .line 82
    iput v3, v0, Lw0/g;->p:I

    .line 83
    .line 84
    iput-boolean v3, v0, Lw0/g;->q:Z

    .line 85
    .line 86
    const-string v5, ""

    .line 87
    .line 88
    iput-object v5, v0, Lw0/g;->r:Ljava/lang/String;

    .line 89
    .line 90
    const-wide/16 v8, 0x0

    .line 91
    .line 92
    iput-wide v8, v0, Lw0/g;->s:J

    .line 93
    .line 94
    iput-wide v8, v0, Lw0/g;->t:J

    .line 95
    .line 96
    iput-object v1, v0, Lw0/g;->g:Landroid/content/Context;

    .line 97
    .line 98
    const/16 v5, 0x9

    .line 99
    .line 100
    new-array v5, v5, [B

    .line 101
    .line 102
    fill-array-data v5, :array_4

    .line 103
    .line 104
    .line 105
    new-array v8, v4, [B

    .line 106
    .line 107
    fill-array-data v8, :array_5

    .line 108
    .line 109
    .line 110
    invoke-static {v5, v8}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    const/4 v8, 0x4

    .line 115
    new-array v9, v8, [B

    .line 116
    .line 117
    fill-array-data v9, :array_6

    .line 118
    .line 119
    .line 120
    new-array v10, v4, [B

    .line 121
    .line 122
    fill-array-data v10, :array_7

    .line 123
    .line 124
    .line 125
    invoke-static {v9, v10}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    invoke-static {v5, v9}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    const/4 v5, 0x1

    .line 133
    invoke-static {v5}, Lcom/sun/jna/Native;->setProtected(Z)V

    .line 134
    .line 135
    .line 136
    const/16 v9, 0x15

    .line 137
    .line 138
    new-array v10, v9, [B

    .line 139
    .line 140
    fill-array-data v10, :array_8

    .line 141
    .line 142
    .line 143
    new-array v11, v4, [B

    .line 144
    .line 145
    fill-array-data v11, :array_9

    .line 146
    .line 147
    .line 148
    invoke-static {v10, v11}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 153
    .line 154
    .line 155
    move-result-object v11

    .line 156
    iget-object v11, v11, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {v10, v11}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    const/16 v10, 0xb

    .line 162
    .line 163
    new-array v10, v10, [B

    .line 164
    .line 165
    fill-array-data v10, :array_a

    .line 166
    .line 167
    .line 168
    new-array v11, v4, [B

    .line 169
    .line 170
    fill-array-data v11, :array_b

    .line 171
    .line 172
    .line 173
    invoke-static {v10, v11}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    invoke-static {v10}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    new-array v10, v8, [B

    .line 181
    .line 182
    fill-array-data v10, :array_c

    .line 183
    .line 184
    .line 185
    new-array v11, v4, [B

    .line 186
    .line 187
    fill-array-data v11, :array_d

    .line 188
    .line 189
    .line 190
    invoke-static {v10, v11}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v10

    .line 194
    invoke-static {v10}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    :try_start_0
    sget-object v10, Lw0/l1;->a:Ljava/lang/String;

    .line 198
    .line 199
    new-instance v10, Ljava/io/File;

    .line 200
    .line 201
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 202
    .line 203
    .line 204
    move-result-object v11

    .line 205
    sget-object v12, Lw0/l1;->a:Ljava/lang/String;

    .line 206
    .line 207
    invoke-direct {v10, v11, v12}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-static {v10}, Lw0/l1;->e(Ljava/io/File;)Ljava/io/File;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    if-nez v10, :cond_0

    .line 215
    .line 216
    sget-object v10, Lw0/k1;->e:Lw0/k1;

    .line 217
    .line 218
    const/4 v11, 0x0

    .line 219
    invoke-static {v1, v10, v11}, Lw0/l1;->f(Landroid/content/Context;Lw0/k1;Lw0/u0;)V

    .line 220
    .line 221
    .line 222
    :cond_0
    new-instance v10, Ljava/io/File;

    .line 223
    .line 224
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 225
    .line 226
    .line 227
    move-result-object v11

    .line 228
    invoke-direct {v10, v11, v12}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-static {v10}, Lw0/l1;->e(Ljava/io/File;)Ljava/io/File;

    .line 232
    .line 233
    .line 234
    move-result-object v10

    .line 235
    const/4 v11, 0x5

    .line 236
    const/16 v12, 0xe

    .line 237
    .line 238
    const/4 v13, 0x6

    .line 239
    const/4 v14, 0x3

    .line 240
    const/4 v15, 0x7

    .line 241
    if-eqz v10, :cond_3

    .line 242
    .line 243
    invoke-virtual {v10}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    new-instance v6, Lorg/vosk/Model;

    .line 248
    .line 249
    invoke-direct {v6, v2}, Lorg/vosk/Model;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    iput-object v6, v0, Lw0/g;->f:Lorg/vosk/Model;

    .line 253
    .line 254
    iget-object v2, v0, Lw0/g;->c:Landroid/media/AudioManager;

    .line 255
    .line 256
    if-nez v2, :cond_1

    .line 257
    .line 258
    new-array v2, v11, [B

    .line 259
    .line 260
    const/16 v6, -0x7a

    .line 261
    .line 262
    aput-byte v6, v2, v3

    .line 263
    .line 264
    const/16 v6, 0x5e

    .line 265
    .line 266
    aput-byte v6, v2, v5

    .line 267
    .line 268
    aput-byte v12, v2, v7

    .line 269
    .line 270
    const/16 v6, -0x5f

    .line 271
    .line 272
    aput-byte v6, v2, v14

    .line 273
    .line 274
    const/16 v6, 0x3c

    .line 275
    .line 276
    aput-byte v6, v2, v8

    .line 277
    .line 278
    new-array v4, v4, [B

    .line 279
    .line 280
    const/16 v6, -0x19

    .line 281
    .line 282
    aput-byte v6, v4, v3

    .line 283
    .line 284
    const/16 v3, 0x2b

    .line 285
    .line 286
    aput-byte v3, v4, v5

    .line 287
    .line 288
    const/16 v3, 0x6a

    .line 289
    .line 290
    aput-byte v3, v4, v7

    .line 291
    .line 292
    const/16 v3, -0x38

    .line 293
    .line 294
    aput-byte v3, v4, v14

    .line 295
    .line 296
    const/16 v3, 0x53

    .line 297
    .line 298
    aput-byte v3, v4, v8

    .line 299
    .line 300
    const/16 v3, 0x1e

    .line 301
    .line 302
    aput-byte v3, v4, v11

    .line 303
    .line 304
    const/16 v3, -0x13

    .line 305
    .line 306
    aput-byte v3, v4, v13

    .line 307
    .line 308
    const/16 v3, -0x24

    .line 309
    .line 310
    aput-byte v3, v4, v15

    .line 311
    .line 312
    invoke-static {v2, v4}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    check-cast v1, Landroid/media/AudioManager;

    .line 321
    .line 322
    iput-object v1, v0, Lw0/g;->c:Landroid/media/AudioManager;

    .line 323
    .line 324
    :cond_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 325
    .line 326
    const/16 v2, 0x1f

    .line 327
    .line 328
    if-lt v1, v2, :cond_4

    .line 329
    .line 330
    sget-object v1, Lw0/g;->w:Lw0/f;

    .line 331
    .line 332
    if-eqz v1, :cond_2

    .line 333
    .line 334
    iget-object v2, v0, Lw0/g;->c:Landroid/media/AudioManager;

    .line 335
    .line 336
    invoke-static {v2, v1}, Landroidx/core/app/c;->s(Landroid/media/AudioManager;Landroid/media/AudioManager$OnModeChangedListener;)V

    .line 337
    .line 338
    .line 339
    :cond_2
    new-instance v1, Lw0/f;

    .line 340
    .line 341
    const/4 v2, 0x0

    .line 342
    invoke-direct {v1, v0, v2}, Lw0/f;-><init>(Lw0/y;I)V

    .line 343
    .line 344
    .line 345
    sput-object v1, Lw0/g;->w:Lw0/f;

    .line 346
    .line 347
    iget-object v1, v0, Lw0/g;->c:Landroid/media/AudioManager;

    .line 348
    .line 349
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    sget-object v3, Lw0/g;->w:Lw0/f;

    .line 354
    .line 355
    invoke-static {v1, v2, v3}, Landroidx/core/app/c;->t(Landroid/media/AudioManager;Ljava/util/concurrent/ExecutorService;Landroid/media/AudioManager$OnModeChangedListener;)V

    .line 356
    .line 357
    .line 358
    return-void

    .line 359
    :cond_3
    new-instance v1, Ljava/io/IOException;

    .line 360
    .line 361
    const/16 v10, 0x1b

    .line 362
    .line 363
    new-array v10, v10, [B

    .line 364
    .line 365
    const/16 v16, -0x36

    .line 366
    .line 367
    aput-byte v16, v10, v3

    .line 368
    .line 369
    const/16 v16, -0x4c

    .line 370
    .line 371
    aput-byte v16, v10, v5

    .line 372
    .line 373
    const/16 v16, -0x14

    .line 374
    .line 375
    aput-byte v16, v10, v7

    .line 376
    .line 377
    const/16 v16, 0x25

    .line 378
    .line 379
    aput-byte v16, v10, v14

    .line 380
    .line 381
    const/16 v16, 0x21

    .line 382
    .line 383
    aput-byte v16, v10, v8

    .line 384
    .line 385
    const/16 v16, -0x32

    .line 386
    .line 387
    aput-byte v16, v10, v11

    .line 388
    .line 389
    const/16 v16, -0x76

    .line 390
    .line 391
    aput-byte v16, v10, v13

    .line 392
    .line 393
    aput-byte v2, v10, v15

    .line 394
    .line 395
    const/16 v16, -0x7

    .line 396
    .line 397
    aput-byte v16, v10, v4

    .line 398
    .line 399
    const/16 v16, 0x9

    .line 400
    .line 401
    const/16 v17, -0x49

    .line 402
    .line 403
    aput-byte v17, v10, v16

    .line 404
    .line 405
    const/16 v16, -0x41

    .line 406
    .line 407
    const/16 v17, 0xa

    .line 408
    .line 409
    aput-byte v16, v10, v17

    .line 410
    .line 411
    const/16 v16, 0xb

    .line 412
    .line 413
    const/16 v17, 0x27

    .line 414
    .line 415
    aput-byte v17, v10, v16

    .line 416
    .line 417
    const/16 v16, 0x72

    .line 418
    .line 419
    aput-byte v16, v10, v2

    .line 420
    .line 421
    const/16 v2, 0xd

    .line 422
    .line 423
    const/16 v17, -0x7d

    .line 424
    .line 425
    aput-byte v17, v10, v2

    .line 426
    .line 427
    const/16 v2, -0x75

    .line 428
    .line 429
    aput-byte v2, v10, v12

    .line 430
    .line 431
    const/16 v2, 0xf

    .line 432
    .line 433
    aput-byte v15, v10, v2

    .line 434
    .line 435
    const/16 v2, -0x18

    .line 436
    .line 437
    aput-byte v2, v10, v6

    .line 438
    .line 439
    const/16 v2, 0x11

    .line 440
    .line 441
    const/4 v6, -0x5

    .line 442
    aput-byte v6, v10, v2

    .line 443
    .line 444
    const/16 v2, 0x12

    .line 445
    .line 446
    const/16 v12, -0xa

    .line 447
    .line 448
    aput-byte v12, v10, v2

    .line 449
    .line 450
    const/16 v2, 0x13

    .line 451
    .line 452
    const/16 v12, 0x20

    .line 453
    .line 454
    aput-byte v12, v10, v2

    .line 455
    .line 456
    const/16 v2, 0x14

    .line 457
    .line 458
    aput-byte v16, v10, v2

    .line 459
    .line 460
    const/16 v2, -0x29

    .line 461
    .line 462
    aput-byte v2, v10, v9

    .line 463
    .line 464
    const/16 v2, 0x16

    .line 465
    .line 466
    const/16 v9, -0x7c

    .line 467
    .line 468
    aput-byte v9, v10, v2

    .line 469
    .line 470
    const/16 v2, 0x17

    .line 471
    .line 472
    aput-byte v8, v10, v2

    .line 473
    .line 474
    const/16 v2, 0x18

    .line 475
    .line 476
    const/16 v9, -0x10

    .line 477
    .line 478
    aput-byte v9, v10, v2

    .line 479
    .line 480
    const/16 v2, 0x19

    .line 481
    .line 482
    const/16 v9, -0x42

    .line 483
    .line 484
    aput-byte v9, v10, v2

    .line 485
    .line 486
    const/16 v2, 0x1a

    .line 487
    .line 488
    aput-byte v6, v10, v2

    .line 489
    .line 490
    new-array v2, v4, [B

    .line 491
    .line 492
    const/16 v4, -0x64

    .line 493
    .line 494
    aput-byte v4, v2, v3

    .line 495
    .line 496
    const/16 v3, -0x25

    .line 497
    .line 498
    aput-byte v3, v2, v5

    .line 499
    .line 500
    const/16 v3, -0x61

    .line 501
    .line 502
    aput-byte v3, v2, v7

    .line 503
    .line 504
    const/16 v3, 0x4e

    .line 505
    .line 506
    aput-byte v3, v2, v14

    .line 507
    .line 508
    aput-byte v5, v2, v8

    .line 509
    .line 510
    const/16 v3, -0x5d

    .line 511
    .line 512
    aput-byte v3, v2, v11

    .line 513
    .line 514
    const/16 v3, -0x1b

    .line 515
    .line 516
    aput-byte v3, v2, v13

    .line 517
    .line 518
    const/16 v3, 0x68

    .line 519
    .line 520
    aput-byte v3, v2, v15

    .line 521
    .line 522
    invoke-static {v10, v2}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 530
    :catch_0
    :cond_4
    return-void

    .line 531
    :array_0
    .array-data 1
        0x3ft
        -0x2et
        0x7dt
        0x30t
        0x72t
        0x72t
        0x8t
        -0x2t
        0x5t
        -0x34t
        0x71t
        0x60t
    .end array-data

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
    :array_1
    .array-data 1
        0x6ct
        -0x5et
        0x14t
        0x53t
        0x1at
        0x37t
        0x66t
        -0x67t
    .end array-data

    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    :array_2
    .array-data 1
        -0x76t
        -0x23t
        0x32t
        0x7at
        0x20t
        0x69t
        0x5dt
        -0xct
        -0x50t
        -0x3dt
        0x3et
        0x2at
    .end array-data

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
    :array_3
    .array-data 1
        -0x27t
        -0x53t
        0x5bt
        0x19t
        0x48t
        0x2ct
        0x33t
        -0x6dt
    .end array-data

    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    :array_4
    .array-data 1
        -0x2bt
        -0x25t
        0x50t
        -0x78t
        0xat
        -0x47t
        0x79t
        0x2bt
        -0x34t
    .end array-data

    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    nop

    .line 577
    :array_5
    .array-data 1
        -0x41t
        -0x4bt
        0x31t
        -0x5at
        0x64t
        -0x2at
        0xat
        0x52t
    .end array-data

    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    :array_6
    .array-data 1
        0x7t
        -0x1ct
        0x58t
        -0x4bt
    .end array-data

    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    :array_7
    .array-data 1
        0x73t
        -0x6at
        0x2dt
        -0x30t
        0x24t
        0x26t
        -0xet
        0x7et
    .end array-data

    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    :array_8
    .array-data 1
        0x77t
        -0x2bt
        0x36t
        0x5et
        -0x40t
        0x68t
        -0x32t
        0x58t
        0x33t
        -0x29t
        0x3et
        0x12t
        -0x30t
        0x66t
        -0x2dt
        0x55t
        0x33t
        -0x35t
        0x36t
        0x4t
        -0x36t
    .end array-data

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
    nop

    .line 615
    :array_9
    .array-data 1
        0x1dt
        -0x45t
        0x57t
        0x70t
        -0x5et
        0x7t
        -0x5ft
        0x2ct
    .end array-data

    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    :array_a
    .array-data 1
        -0x6bt
        0x6ct
        -0x4ft
        0x56t
        0x7ct
        0x2et
        -0x72t
        0x6bt
        -0x75t
        0x61t
        -0x50t
    .end array-data

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
    :array_b
    .array-data 1
        -0x1t
        0x2t
        -0x28t
        0x32t
        0x15t
        0x5dt
        -0x2t
        0xat
    .end array-data

    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    :array_c
    .array-data 1
        -0x60t
        -0x17t
        -0x5bt
        0x64t
    .end array-data

    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    :array_d
    .array-data 1
        -0x2at
        -0x7at
        -0x2at
        0xft
        0x79t
        0x70t
        -0x5at
        -0x35t
    .end array-data
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
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
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
.end method

.method public static f()Ljava/lang/Boolean;
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lh0/b;->o()Lu0/a;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sget-object v2, Le0/m;->j:[B

    .line 11
    .line 12
    sget-object v3, Le0/p3;->a:[Ljava/lang/String;

    .line 13
    .line 14
    const-string v3, ""

    .line 15
    .line 16
    invoke-static {v2, v1, v3, v0}, Lcom/google/protobuf/q;->s([BLu0/a;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 17
    .line 18
    .line 19
    const/16 v1, 0x9

    .line 20
    .line 21
    new-array v1, v1, [B

    .line 22
    .line 23
    fill-array-data v1, :array_0

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v0}, Lcom/google/protobuf/q;->r([BLjava/lang/StringBuilder;)V

    .line 27
    .line 28
    .line 29
    sget-object v1, Le0/x1;->q:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v0, v1}, Lcom/google/protobuf/q;->g(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {}, Lh0/b;->o()Lu0/a;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    sget-object v2, Le0/m;->f:[B

    .line 40
    .line 41
    invoke-static {v2, v1, v3, v0}, Lcom/google/protobuf/q;->w([BLu0/a;Ljava/lang/String;Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Lh0/b;->j()Lcom/example/navistart/cores/InterC;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-wide v3, 0x7fffffffffffffffL

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    invoke-static {v3, v4, v0}, Lcom/google/protobuf/q;->d(JLcom/example/navistart/cores/InterC;)J

    .line 61
    .line 62
    .line 63
    move-result-wide v0

    .line 64
    new-instance v3, Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {}, Lh0/b;->o()Lu0/a;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-static {}, Lh0/b;->o()Lu0/a;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    new-instance v6, Ljava/lang/String;

    .line 75
    .line 76
    invoke-direct {v6, v2}, Ljava/lang/String;-><init>([B)V

    .line 77
    .line 78
    .line 79
    sget-object v2, Le0/m;->g:[B

    .line 80
    .line 81
    invoke-static {v2, v5, v6}, Lcom/google/protobuf/q;->h([BLu0/a;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    const/4 v5, 0x1

    .line 86
    new-array v6, v5, [B

    .line 87
    .line 88
    const/4 v7, 0x0

    .line 89
    const/4 v8, -0x3

    .line 90
    aput-byte v8, v6, v7

    .line 91
    .line 92
    const/16 v8, 0x8

    .line 93
    .line 94
    new-array v8, v8, [B

    .line 95
    .line 96
    fill-array-data v8, :array_1

    .line 97
    .line 98
    .line 99
    invoke-static {v6, v8, v4, v2, v7}, Lcom/google/protobuf/q;->x([B[BLu0/a;Ljava/lang/String;I)[B

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-direct {v3, v2}, Ljava/lang/String;-><init>([B)V

    .line 104
    .line 105
    .line 106
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 107
    .line 108
    .line 109
    move-result-wide v2

    .line 110
    cmp-long v0, v0, v2

    .line 111
    .line 112
    if-gez v0, :cond_0

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_0
    move v5, v7

    .line 116
    :goto_0
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    return-object v0

    .line 121
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 122
    .line 123
    return-object v0

    .line 124
    nop

    .line 125
    :array_0
    .array-data 1
        0x6ct
        0x69t
        0x63t
        0x74t
        0x5ft
        0x72t
        0x69t
        0x75t
        0x65t
    .end array-data

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    nop

    .line 135
    :array_1
    .array-data 1
        -0x33t
        -0x23t
        0x58t
        -0x5ct
        -0x45t
        -0x6ct
        0x7ct
        -0x3t
    .end array-data
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

.method public static g(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lh0/b;->f()Lj0/c;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lj0/c;->f()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_0

    .line 46
    .line 47
    const/4 p0, 0x1

    .line 48
    return p0

    .line 49
    :cond_0
    const/4 p0, 0x0

    .line 50
    return p0
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

.method public static h(Ljava/lang/String;)Z
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto/16 :goto_1

    .line 5
    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    goto/16 :goto_1

    .line 17
    .line 18
    :cond_1
    const/4 v1, 0x2

    .line 19
    new-array v2, v1, [B

    .line 20
    .line 21
    fill-array-data v2, :array_0

    .line 22
    .line 23
    .line 24
    const/16 v3, 0x8

    .line 25
    .line 26
    new-array v4, v3, [B

    .line 27
    .line 28
    fill-array-data v4, :array_1

    .line 29
    .line 30
    .line 31
    invoke-static {v2, v4}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    goto/16 :goto_1

    .line 42
    .line 43
    :cond_2
    new-array v1, v1, [B

    .line 44
    .line 45
    fill-array-data v1, :array_2

    .line 46
    .line 47
    .line 48
    new-array v2, v3, [B

    .line 49
    .line 50
    fill-array-data v2, :array_3

    .line 51
    .line 52
    .line 53
    invoke-static {v1, v2}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    const/4 v2, 0x5

    .line 69
    if-ge v1, v2, :cond_4

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_4
    const/4 v1, 0x1

    .line 73
    new-array v4, v1, [B

    .line 74
    .line 75
    const/16 v5, -0x6f

    .line 76
    .line 77
    aput-byte v5, v4, v0

    .line 78
    .line 79
    new-array v5, v3, [B

    .line 80
    .line 81
    fill-array-data v5, :array_4

    .line 82
    .line 83
    .line 84
    invoke-static {v4, v5}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {p0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_8

    .line 93
    .line 94
    new-array v4, v1, [B

    .line 95
    .line 96
    const/16 v5, 0x56

    .line 97
    .line 98
    aput-byte v5, v4, v0

    .line 99
    .line 100
    new-array v5, v3, [B

    .line 101
    .line 102
    fill-array-data v5, :array_5

    .line 103
    .line 104
    .line 105
    invoke-static {v4, v5}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-virtual {p0, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-nez v4, :cond_5

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_5
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    array-length v5, v4

    .line 121
    move v6, v0

    .line 122
    :goto_0
    if-ge v6, v5, :cond_7

    .line 123
    .line 124
    aget-char v7, v4, v6

    .line 125
    .line 126
    invoke-static {v7}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    .line 127
    .line 128
    .line 129
    move-result v8

    .line 130
    if-nez v8, :cond_6

    .line 131
    .line 132
    new-array v8, v2, [B

    .line 133
    .line 134
    fill-array-data v8, :array_6

    .line 135
    .line 136
    .line 137
    new-array v9, v3, [B

    .line 138
    .line 139
    fill-array-data v9, :array_7

    .line 140
    .line 141
    .line 142
    invoke-static {v8, v9}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    invoke-virtual {v8, v7}, Ljava/lang/String;->indexOf(I)I

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    const/4 v8, -0x1

    .line 151
    if-ne v7, v8, :cond_6

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_6
    add-int/lit8 v6, v6, 0x1

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_7
    :try_start_0
    new-instance v2, Lorg/json/JSONArray;

    .line 158
    .line 159
    invoke-direct {v2, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 160
    .line 161
    .line 162
    return v1

    .line 163
    :catch_0
    :cond_8
    :goto_1
    return v0

    .line 164
    nop

    .line 165
    :array_0
    .array-data 1
        0x75t
        -0x29t
    .end array-data

    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    nop

    .line 171
    :array_1
    .array-data 1
        0x2et
        -0x76t
        0x2t
        -0x65t
        0x5ct
        0x70t
        -0x52t
        0x51t
    .end array-data

    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    :array_2
    .array-data 1
        0x4ft
        0x4t
    .end array-data

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    nop

    .line 185
    :array_3
    .array-data 1
        0x34t
        0x79t
        0x3bt
        -0x61t
        0x37t
        0x3ft
        0xct
        -0x5at
    .end array-data

    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    :array_4
    .array-data 1
        -0x36t
        -0x63t
        0x35t
        -0x65t
        -0x77t
        -0x1dt
        -0x53t
        0x4ct
    .end array-data

    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    :array_5
    .array-data 1
        0xbt
        -0x6at
        0xdt
        -0x52t
        0x2bt
        -0x56t
        -0x9t
        -0x4dt
    .end array-data

    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    :array_6
    .array-data 1
        0x2et
        0x68t
        -0x3et
        -0x37t
        -0x4et
    .end array-data

    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    nop

    .line 217
    :array_7
    .array-data 1
        0xct
        0x33t
        -0x61t
        -0x1bt
        -0x6et
        -0x69t
        -0x36t
        0x3at
    .end array-data
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


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lw0/g;->c:Landroid/media/AudioManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lw0/g;->d:Landroid/media/AudioFocusRequest;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v3, 0x1a

    .line 12
    .line 13
    if-lt v2, v3, :cond_0

    .line 14
    .line 15
    invoke-static {v0, v1}, Lorg/apache/commons/net/util/a;->t(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lw0/g;->l:Ljava/lang/Object;

    .line 19
    .line 20
    monitor-enter v0

    .line 21
    const/4 v1, 0x0

    .line 22
    :try_start_0
    iput-boolean v1, p0, Lw0/g;->q:Z

    .line 23
    .line 24
    iget-object v2, p0, Lw0/g;->m:Lorg/vosk/Recognizer;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v2}, Lorg/vosk/Recognizer;->reset()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    :goto_0
    iget-object v2, p0, Lw0/g;->n:Lorg/vosk/Recognizer;

    .line 35
    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    invoke-virtual {v2}, Lorg/vosk/Recognizer;->reset()V

    .line 39
    .line 40
    .line 41
    :cond_2
    iput v1, p0, Lw0/g;->o:I

    .line 42
    .line 43
    iput v1, p0, Lw0/g;->p:I

    .line 44
    .line 45
    const-string v1, ""

    .line 46
    .line 47
    iput-object v1, p0, Lw0/g;->r:Ljava/lang/String;

    .line 48
    .line 49
    const-wide/16 v1, 0x0

    .line 50
    .line 51
    iput-wide v1, p0, Lw0/g;->s:J

    .line 52
    .line 53
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    sget-object v0, Lw0/g;->v:Lw0/b;

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Lw0/g;->j(Lw0/b;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    throw v1
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

.method public final b()V
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    new-array v0, v0, [B

    .line 9
    .line 10
    fill-array-data v0, :array_1

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v0}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Lcom/example/navistart/cores/ColorText;->RED:Lcom/example/navistart/cores/ColorText;

    .line 18
    .line 19
    invoke-static {v0, v1}, Lh0/b;->w(Ljava/lang/String;Lcom/example/navistart/cores/ColorText;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lw0/g;->b:Ljava/util/concurrent/ScheduledFuture;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    iget-object v0, p0, Lw0/g;->b:Ljava/util/concurrent/ScheduledFuture;

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    iput-object v0, p0, Lw0/g;->b:Ljava/util/concurrent/ScheduledFuture;

    .line 40
    .line 41
    :cond_0
    invoke-virtual {p0}, Lw0/g;->o()V

    .line 42
    .line 43
    .line 44
    sget-object v0, Lw0/b;->b:Lw0/b;

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Lw0/g;->j(Lw0/b;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :array_0
    .array-data 1
        0x2ft
        -0x18t
        0x70t
        -0x50t
        0x12t
        -0x59t
        -0x7et
        -0x31t
    .end array-data

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    :array_1
    .array-data 1
        0x5ct
        -0x64t
        0x1ft
        -0x40t
        0x44t
        -0x38t
        -0xft
        -0x5ct
    .end array-data
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

.method public final c()V
    .locals 9

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    const/16 v1, 0x8

    .line 9
    .line 10
    new-array v1, v1, [B

    .line 11
    .line 12
    fill-array-data v1, :array_1

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v1, Lcom/example/navistart/cores/ColorText;->RED:Lcom/example/navistart/cores/ColorText;

    .line 20
    .line 21
    invoke-static {v0, v1}, Lh0/b;->w(Ljava/lang/String;Lcom/example/navistart/cores/ColorText;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lw0/g;->b()V

    .line 25
    .line 26
    .line 27
    new-instance v3, Lf5/j;

    .line 28
    .line 29
    const/16 v0, 0x14

    .line 30
    .line 31
    invoke-direct {v3, v0, p0}, Lf5/j;-><init>(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const-wide/16 v6, 0x1e

    .line 35
    .line 36
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 37
    .line 38
    iget-object v2, p0, Lw0/g;->a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 39
    .line 40
    const-wide/16 v4, 0x0

    .line 41
    .line 42
    invoke-interface/range {v2 .. v8}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lw0/g;->b:Ljava/util/concurrent/ScheduledFuture;

    .line 47
    .line 48
    return-void

    .line 49
    :array_0
    .array-data 1
        -0x80t
        -0x7at
        0x16t
        -0x7dt
        0x35t
        -0x7ft
        -0x4ft
        0xft
        -0x68t
    .end array-data

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    nop

    .line 59
    :array_1
    .array-data 1
        -0xdt
        -0xet
        0x77t
        -0xft
        0x41t
        -0x29t
        -0x22t
        0x7ct
    .end array-data
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

.method public final d()V
    .locals 4

    .line 1
    sget-object v0, Lw0/g;->u:Lw0/b;

    .line 2
    .line 3
    sput-object v0, Lw0/g;->v:Lw0/b;

    .line 4
    .line 5
    iget-object v0, p0, Lw0/g;->d:Landroid/media/AudioFocusRequest;

    .line 6
    .line 7
    const/16 v1, 0x1a

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lw0/d;->d()Landroid/media/AudioFocusRequest$Builder;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v2, Lw0/e;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct {v2, p0, v3}, Lw0/e;-><init>(Lw0/y;I)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v2}, Lorg/apache/commons/net/util/a;->l(Landroid/media/AudioFocusRequest$Builder;Lw0/e;)Landroid/media/AudioFocusRequest$Builder;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v2, Landroid/media/AudioAttributes$Builder;

    .line 30
    .line 31
    invoke-direct {v2}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 32
    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    invoke-virtual {v2, v3}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const/4 v3, 0x2

    .line 40
    invoke-virtual {v2, v3}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {v0, v2}, Lorg/apache/commons/net/util/a;->k(Landroid/media/AudioFocusRequest$Builder;Landroid/media/AudioAttributes;)Landroid/media/AudioFocusRequest$Builder;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0}, Lw0/d;->f(Landroid/media/AudioFocusRequest$Builder;)Landroid/media/AudioFocusRequest;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, Lw0/g;->d:Landroid/media/AudioFocusRequest;

    .line 57
    .line 58
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 59
    .line 60
    if-lt v0, v1, :cond_1

    .line 61
    .line 62
    iget-object v0, p0, Lw0/g;->c:Landroid/media/AudioManager;

    .line 63
    .line 64
    iget-object v1, p0, Lw0/g;->d:Landroid/media/AudioFocusRequest;

    .line 65
    .line 66
    invoke-static {v0, v1}, Lw0/d;->j(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    invoke-virtual {p0}, Lw0/g;->p()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    sget-object v0, Lw0/b;->d:Lw0/b;

    .line 73
    .line 74
    invoke-virtual {p0, v0}, Lw0/g;->j(Lw0/b;)V

    .line 75
    .line 76
    .line 77
    return-void
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
.end method

.method public final e()Lw0/b;
    .locals 1

    .line 1
    sget-object v0, Lw0/g;->u:Lw0/b;

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

.method public final declared-synchronized i(Ljava/lang/String;)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {}, Lw0/g;->f()Ljava/lang/Boolean;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lw0/a0;->e:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    if-ge v2, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    check-cast v3, Lw0/b0;

    .line 28
    .line 29
    invoke-interface {v3, p1}, Lw0/b0;->i(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    monitor-exit p0

    .line 36
    return-void

    .line 37
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    throw p1
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
.end method

.method public final j(Lw0/b;)V
    .locals 4

    .line 1
    invoke-static {}, Lw0/g;->f()Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

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
    sput-object p1, Lw0/g;->u:Lw0/b;

    .line 12
    .line 13
    sput-object p1, Lw0/c;->a:Lw0/b;

    .line 14
    .line 15
    sget-object v0, Lw0/a0;->e:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    :goto_0
    if-ge v2, v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    check-cast v3, Lw0/b0;

    .line 31
    .line 32
    invoke-interface {v3, p1}, Lw0/b0;->m(Lw0/b;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-void
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
.end method

.method public final k(I)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lw0/g;->l:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lw0/g;->j:[B

    .line 5
    .line 6
    invoke-virtual {p0, p1, v1}, Lw0/g;->l(I[B)V

    .line 7
    .line 8
    .line 9
    iget-boolean v1, p0, Lw0/g;->q:Z

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lw0/g;->n:Lorg/vosk/Recognizer;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_2

    .line 18
    :cond_0
    iget-object v1, p0, Lw0/g;->m:Lorg/vosk/Recognizer;

    .line 19
    .line 20
    :goto_0
    if-nez v1, :cond_1

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    monitor-exit v0

    .line 24
    return-object p1

    .line 25
    :cond_1
    iget-object v2, p0, Lw0/g;->j:[B

    .line 26
    .line 27
    invoke-virtual {v1, v2, p1}, Lorg/vosk/Recognizer;->acceptWaveForm([BI)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-virtual {v1}, Lorg/vosk/Recognizer;->getResult()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    invoke-virtual {v1}, Lorg/vosk/Recognizer;->getPartialResult()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :goto_1
    monitor-exit v0

    .line 43
    return-object p1

    .line 44
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    throw p1
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
.end method

.method public final l(I[B)V
    .locals 5

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    if-gtz p1, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    array-length v0, p2

    .line 7
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, Lw0/g;->k:[B

    .line 12
    .line 13
    array-length v1, v0

    .line 14
    sub-int v1, p1, v1

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    sub-int/2addr p1, v1

    .line 22
    :goto_0
    if-lez p1, :cond_1

    .line 23
    .line 24
    array-length v2, v0

    .line 25
    iget v3, p0, Lw0/g;->p:I

    .line 26
    .line 27
    sub-int/2addr v2, v3

    .line 28
    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    iget v3, p0, Lw0/g;->p:I

    .line 33
    .line 34
    invoke-static {p2, v1, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    iget v3, p0, Lw0/g;->p:I

    .line 38
    .line 39
    add-int/2addr v3, v2

    .line 40
    array-length v4, v0

    .line 41
    rem-int/2addr v3, v4

    .line 42
    iput v3, p0, Lw0/g;->p:I

    .line 43
    .line 44
    iget v3, p0, Lw0/g;->o:I

    .line 45
    .line 46
    add-int/2addr v3, v2

    .line 47
    array-length v4, v0

    .line 48
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    iput v3, p0, Lw0/g;->o:I

    .line 53
    .line 54
    add-int/2addr v1, v2

    .line 55
    sub-int/2addr p1, v2

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    :goto_1
    return-void
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

.method public final m(Ljava/lang/String;)V
    .locals 6

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-eqz p1, :cond_b

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto/16 :goto_3

    .line 16
    .line 17
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 18
    .line 19
    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-boolean p1, p0, Lw0/g;->q:Z

    .line 23
    .line 24
    const/4 v2, 0x4

    .line 25
    new-array v2, v2, [B

    .line 26
    .line 27
    fill-array-data v2, :array_0

    .line 28
    .line 29
    .line 30
    const/16 v3, 0x8

    .line 31
    .line 32
    new-array v4, v3, [B

    .line 33
    .line 34
    fill-array-data v4, :array_1

    .line 35
    .line 36
    .line 37
    invoke-static {v2, v4}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-nez p1, :cond_1

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_1

    .line 56
    .line 57
    const/4 v2, 0x7

    .line 58
    new-array v2, v2, [B

    .line 59
    .line 60
    fill-array-data v2, :array_2

    .line 61
    .line 62
    .line 63
    new-array v3, v3, [B

    .line 64
    .line 65
    fill-array-data v3, :array_3

    .line 66
    .line 67
    .line 68
    invoke-static {v2, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-nez v1, :cond_b

    .line 85
    .line 86
    const-wide/16 v3, 0x0

    .line 87
    .line 88
    if-nez p1, :cond_5

    .line 89
    .line 90
    invoke-static {v2}, Lw0/g;->g(Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-nez p1, :cond_2

    .line 95
    .line 96
    goto/16 :goto_3

    .line 97
    .line 98
    :cond_2
    invoke-virtual {p0}, Lw0/g;->p()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    if-nez v2, :cond_3

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    :goto_0
    iput-object v0, p0, Lw0/g;->r:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_4

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 119
    .line 120
    .line 121
    move-result-wide v0

    .line 122
    const-wide/16 v2, 0x1c2

    .line 123
    .line 124
    add-long v3, v0, v2

    .line 125
    .line 126
    :goto_1
    iput-wide v3, p0, Lw0/g;->s:J

    .line 127
    .line 128
    invoke-virtual {p0, p1}, Lw0/g;->m(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_5
    iget-object p1, p0, Lw0/g;->r:Ljava/lang/String;

    .line 133
    .line 134
    const/4 v1, 0x0

    .line 135
    const/4 v5, 0x1

    .line 136
    if-eqz p1, :cond_6

    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-nez p1, :cond_6

    .line 147
    .line 148
    move p1, v5

    .line 149
    goto :goto_2

    .line 150
    :cond_6
    move p1, v1

    .line 151
    :goto_2
    if-eqz p1, :cond_a

    .line 152
    .line 153
    iget-object p1, p0, Lw0/g;->r:Ljava/lang/String;

    .line 154
    .line 155
    if-eqz p1, :cond_7

    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-nez p1, :cond_7

    .line 166
    .line 167
    move v1, v5

    .line 168
    :cond_7
    if-eqz v1, :cond_8

    .line 169
    .line 170
    if-eqz v2, :cond_8

    .line 171
    .line 172
    invoke-static {v2}, Lw0/g;->g(Ljava/lang/String;)Z

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    if-eqz p1, :cond_8

    .line 177
    .line 178
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    iget-object v1, p0, Lw0/g;->r:Ljava/lang/String;

    .line 187
    .line 188
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    add-int/lit8 v1, v1, 0x2

    .line 197
    .line 198
    if-gt p1, v1, :cond_8

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_8
    invoke-static {v2}, Lw0/g;->g(Ljava/lang/String;)Z

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    if-nez p1, :cond_9

    .line 206
    .line 207
    new-instance p1, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 210
    .line 211
    .line 212
    iget-object v1, p0, Lw0/g;->r:Ljava/lang/String;

    .line 213
    .line 214
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    const-string v1, " "

    .line 218
    .line 219
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    :cond_9
    iput-object v0, p0, Lw0/g;->r:Ljava/lang/String;

    .line 230
    .line 231
    iput-wide v3, p0, Lw0/g;->s:J

    .line 232
    .line 233
    :cond_a
    invoke-virtual {p0, v2}, Lw0/g;->i(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 234
    .line 235
    .line 236
    :catch_0
    :cond_b
    :goto_3
    return-void

    .line 237
    :array_0
    .array-data 1
        0x39t
        -0x41t
        0x20t
        -0x4dt
    .end array-data

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    :array_1
    .array-data 1
        0x4dt
        -0x26t
        0x58t
        -0x39t
        -0x4ct
        -0x77t
        0xat
        -0x3dt
    .end array-data

    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    :array_2
    .array-data 1
        -0x78t
        -0x2ft
        0x29t
        -0x4bt
        -0x80t
        0x12t
        -0x18t
    .end array-data

    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    :array_3
    .array-data 1
        -0x8t
        -0x50t
        0x5bt
        -0x3ft
        -0x17t
        0x73t
        -0x7ct
        -0x2bt
    .end array-data
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

.method public final n()V
    .locals 11

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lw0/g;->t:J

    .line 6
    .line 7
    sub-long v2, v0, v2

    .line 8
    .line 9
    const-wide/16 v4, 0x3e8

    .line 10
    .line 11
    cmp-long v2, v2, v4

    .line 12
    .line 13
    if-gez v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_1

    .line 16
    .line 17
    :cond_0
    iput-wide v0, p0, Lw0/g;->t:J

    .line 18
    .line 19
    iget-object v0, p0, Lw0/g;->g:Landroid/content/Context;

    .line 20
    .line 21
    const/4 v1, 0x5

    .line 22
    new-array v1, v1, [B

    .line 23
    .line 24
    fill-array-data v1, :array_0

    .line 25
    .line 26
    .line 27
    const/16 v2, 0x8

    .line 28
    .line 29
    new-array v3, v2, [B

    .line 30
    .line 31
    fill-array-data v3, :array_1

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Landroid/media/AudioManager;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/media/AudioManager;->getMode()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_5

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/media/AudioManager;->isMicrophoneMute()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_5

    .line 55
    .line 56
    invoke-virtual {p0}, Lw0/g;->o()V

    .line 57
    .line 58
    .line 59
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 60
    .line 61
    new-instance v1, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 67
    .line 68
    .line 69
    invoke-static {}, Lh0/b;->f()Lj0/c;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {}, Lj0/c;->f()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    if-eqz v3, :cond_1

    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-nez v4, :cond_1

    .line 91
    .line 92
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    :cond_1
    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-static {v0}, Lw0/g;->h(Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-nez v1, :cond_2

    .line 115
    .line 116
    goto/16 :goto_1

    .line 117
    .line 118
    :cond_2
    iget-object v1, p0, Lw0/g;->l:Ljava/lang/Object;

    .line 119
    .line 120
    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    :try_start_1
    new-instance v3, Lorg/vosk/Recognizer;

    .line 122
    .line 123
    iget-object v4, p0, Lw0/g;->f:Lorg/vosk/Model;

    .line 124
    .line 125
    const/16 v7, 0x3e80

    .line 126
    .line 127
    int-to-float v5, v7

    .line 128
    invoke-direct {v3, v4, v5, v0}, Lorg/vosk/Recognizer;-><init>(Lorg/vosk/Model;FLjava/lang/String;)V

    .line 129
    .line 130
    .line 131
    iput-object v3, p0, Lw0/g;->m:Lorg/vosk/Recognizer;

    .line 132
    .line 133
    new-instance v0, Lorg/vosk/Recognizer;

    .line 134
    .line 135
    iget-object v3, p0, Lw0/g;->f:Lorg/vosk/Model;

    .line 136
    .line 137
    invoke-direct {v0, v3, v5}, Lorg/vosk/Recognizer;-><init>(Lorg/vosk/Model;F)V

    .line 138
    .line 139
    .line 140
    iput-object v0, p0, Lw0/g;->n:Lorg/vosk/Recognizer;

    .line 141
    .line 142
    sget-object v0, Lw0/g;->u:Lw0/b;

    .line 143
    .line 144
    sget-object v3, Lw0/b;->d:Lw0/b;

    .line 145
    .line 146
    const/4 v4, 0x1

    .line 147
    const/4 v5, 0x0

    .line 148
    if-ne v0, v3, :cond_3

    .line 149
    .line 150
    move v0, v4

    .line 151
    goto :goto_0

    .line 152
    :cond_3
    move v0, v5

    .line 153
    :goto_0
    iput-boolean v0, p0, Lw0/g;->q:Z

    .line 154
    .line 155
    iput v5, p0, Lw0/g;->o:I

    .line 156
    .line 157
    iput v5, p0, Lw0/g;->p:I

    .line 158
    .line 159
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 160
    :try_start_2
    iget-object v0, p0, Lw0/g;->g:Landroid/content/Context;

    .line 161
    .line 162
    const/16 v1, 0x1f

    .line 163
    .line 164
    new-array v1, v1, [B

    .line 165
    .line 166
    fill-array-data v1, :array_2

    .line 167
    .line 168
    .line 169
    new-array v3, v2, [B

    .line 170
    .line 171
    fill-array-data v3, :array_3

    .line 172
    .line 173
    .line 174
    invoke-static {v1, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-nez v0, :cond_4

    .line 183
    .line 184
    new-instance v5, Landroid/media/AudioRecord;

    .line 185
    .line 186
    invoke-static {}, Lh0/b;->o()Lu0/a;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    const/16 v1, 0x19

    .line 191
    .line 192
    new-array v1, v1, [B

    .line 193
    .line 194
    fill-array-data v1, :array_4

    .line 195
    .line 196
    .line 197
    new-array v2, v2, [B

    .line 198
    .line 199
    fill-array-data v2, :array_5

    .line 200
    .line 201
    .line 202
    invoke-static {v1, v2}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-virtual {v0, v1, v4}, Lu0/a;->loadInt(Ljava/lang/String;I)I

    .line 207
    .line 208
    .line 209
    move-result v6

    .line 210
    iget v10, p0, Lw0/g;->i:I

    .line 211
    .line 212
    const/16 v8, 0x10

    .line 213
    .line 214
    const/4 v9, 0x2

    .line 215
    invoke-direct/range {v5 .. v10}, Landroid/media/AudioRecord;-><init>(IIIII)V

    .line 216
    .line 217
    .line 218
    iput-object v5, p0, Lw0/g;->e:Landroid/media/AudioRecord;

    .line 219
    .line 220
    invoke-virtual {v5}, Landroid/media/AudioRecord;->startRecording()V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :cond_4
    sget-object v0, Lw0/b;->b:Lw0/b;

    .line 225
    .line 226
    invoke-virtual {p0, v0}, Lw0/g;->j(Lw0/b;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 227
    .line 228
    .line 229
    return-void

    .line 230
    :catchall_0
    move-exception v0

    .line 231
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 232
    :try_start_4
    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 233
    :catch_0
    invoke-virtual {p0}, Lw0/g;->o()V

    .line 234
    .line 235
    .line 236
    :cond_5
    :goto_1
    return-void

    .line 237
    :array_0
    .array-data 1
        -0x62t
        -0x3dt
        -0x34t
        -0x67t
        0x4dt
    .end array-data

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    nop

    .line 245
    :array_1
    .array-data 1
        -0x1t
        -0x4at
        -0x58t
        -0x10t
        0x22t
        0x59t
        -0x4at
        0x24t
    .end array-data

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    :array_2
    .array-data 1
        0x7ft
        -0x62t
        -0x54t
        0x15t
        0x2ct
        -0x5et
        0x2at
        0x2ft
        0x6et
        -0x6bt
        -0x46t
        0xat
        0x2at
        -0x48t
        0x3dt
        0x68t
        0x71t
        -0x62t
        -0x1at
        0x35t
        0x6t
        -0x78t
        0x1t
        0x53t
        0x5at
        -0x51t
        -0x77t
        0x32t
        0x7t
        -0x7et
        0x1t
    .end array-data

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
    :array_3
    .array-data 1
        0x1et
        -0x10t
        -0x38t
        0x67t
        0x43t
        -0x35t
        0x4et
        0x1t
    .end array-data

    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    :array_4
    .array-data 1
        -0x1et
        -0x73t
        0x6at
        0xbt
        -0x12t
        0x67t
        -0x2ct
        -0x6t
        -0x40t
        -0x66t
        0x6at
        0x7t
        -0x3t
        0x1bt
        -0x10t
        -0x14t
        -0x35t
        -0x7ft
        0x61t
        0x31t
        -0x20t
        0x40t
        -0x3dt
        -0x6t
        -0x36t
    .end array-data

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
    nop

    .line 299
    :array_5
    .array-data 1
        -0x51t
        -0x18t
        0xet
        0x62t
        -0x71t
        0x35t
        -0x4ft
        -0x67t
    .end array-data
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

.method public final o()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw0/g;->e:Landroid/media/AudioRecord;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {v0}, Landroid/media/AudioRecord;->getState()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lw0/g;->e:Landroid/media/AudioRecord;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/media/AudioRecord;->stop()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    :catch_0
    :cond_0
    iget-object v0, p0, Lw0/g;->e:Landroid/media/AudioRecord;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/media/AudioRecord;->release()V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lw0/g;->e:Landroid/media/AudioRecord;

    .line 24
    .line 25
    :cond_1
    sget-object v0, Lw0/b;->b:Lw0/b;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lw0/g;->j(Lw0/b;)V

    .line 28
    .line 29
    .line 30
    return-void
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
.end method

.method public final p()Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Lw0/g;->l:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lw0/g;->n:Lorg/vosk/Recognizer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    :try_start_1
    new-instance v1, Lorg/vosk/Recognizer;

    .line 10
    .line 11
    iget-object v3, p0, Lw0/g;->f:Lorg/vosk/Model;

    .line 12
    .line 13
    const/high16 v4, 0x467a0000    # 16000.0f

    .line 14
    .line 15
    invoke-direct {v1, v3, v4}, Lorg/vosk/Recognizer;-><init>(Lorg/vosk/Model;F)V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lw0/g;->n:Lorg/vosk/Recognizer;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    goto :goto_3

    .line 23
    :catch_0
    :try_start_2
    monitor-exit v0

    .line 24
    return-object v2

    .line 25
    :cond_0
    :goto_0
    iget-object v1, p0, Lw0/g;->n:Lorg/vosk/Recognizer;

    .line 26
    .line 27
    invoke-virtual {v1}, Lorg/vosk/Recognizer;->reset()V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    iput-boolean v1, p0, Lw0/g;->q:Z

    .line 32
    .line 33
    iget-object v1, p0, Lw0/g;->k:[B

    .line 34
    .line 35
    iget v3, p0, Lw0/g;->o:I

    .line 36
    .line 37
    if-gtz v3, :cond_1

    .line 38
    .line 39
    move-object v4, v2

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    new-array v4, v3, [B

    .line 42
    .line 43
    iget v5, p0, Lw0/g;->p:I

    .line 44
    .line 45
    sub-int/2addr v5, v3

    .line 46
    array-length v6, v1

    .line 47
    add-int/2addr v5, v6

    .line 48
    array-length v6, v1

    .line 49
    rem-int/2addr v5, v6

    .line 50
    array-length v6, v1

    .line 51
    sub-int/2addr v6, v5

    .line 52
    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    const/4 v6, 0x0

    .line 57
    invoke-static {v1, v5, v4, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    .line 59
    .line 60
    iget v5, p0, Lw0/g;->o:I

    .line 61
    .line 62
    if-ge v3, v5, :cond_2

    .line 63
    .line 64
    sub-int/2addr v5, v3

    .line 65
    invoke-static {v1, v6, v4, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 66
    .line 67
    .line 68
    :cond_2
    :goto_1
    if-eqz v4, :cond_4

    .line 69
    .line 70
    array-length v1, v4

    .line 71
    if-lez v1, :cond_4

    .line 72
    .line 73
    iget-object v1, p0, Lw0/g;->n:Lorg/vosk/Recognizer;

    .line 74
    .line 75
    array-length v2, v4

    .line 76
    invoke-virtual {v1, v4, v2}, Lorg/vosk/Recognizer;->acceptWaveForm([BI)Z

    .line 77
    .line 78
    .line 79
    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 80
    iget-object v2, p0, Lw0/g;->n:Lorg/vosk/Recognizer;

    .line 81
    .line 82
    if-eqz v1, :cond_3

    .line 83
    .line 84
    :try_start_3
    invoke-virtual {v2}, Lorg/vosk/Recognizer;->getResult()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    goto :goto_2

    .line 89
    :cond_3
    invoke-virtual {v2}, Lorg/vosk/Recognizer;->getPartialResult()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    :goto_2
    monitor-exit v0

    .line 94
    return-object v1

    .line 95
    :cond_4
    monitor-exit v0

    .line 96
    return-object v2

    .line 97
    :goto_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 98
    throw v1
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
