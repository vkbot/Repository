.class public final Lkotlin/internal/UProgressionUtilKt;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\u001a\'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\'\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u000c\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0006\u001a\'\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\t\u00a8\u0006\u0012"
    }
    d2 = {
        "differenceModulo",
        "Lkotlin/UInt;",
        "a",
        "b",
        "c",
        "differenceModulo-WZ9TVnA",
        "(III)I",
        "Lkotlin/ULong;",
        "differenceModulo-sambcqE",
        "(JJJ)J",
        "getProgressionLastElement",
        "start",
        "end",
        "step",
        "",
        "getProgressionLastElement-Nkh28Cs",
        "",
        "getProgressionLastElement-7ftBX0g",
        "kotlin-stdlib"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private static final differenceModulo-WZ9TVnA(III)I
    .locals 6

    .line 1
    int-to-long v0, p0

    .line 2
    const-wide v2, 0xffffffffL

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    and-long/2addr v0, v2

    .line 8
    int-to-long v4, p2

    .line 9
    and-long/2addr v4, v2

    .line 10
    rem-long/2addr v0, v4

    .line 11
    long-to-int p0, v0

    .line 12
    int-to-long v0, p1

    .line 13
    and-long/2addr v0, v2

    .line 14
    rem-long/2addr v0, v4

    .line 15
    long-to-int p1, v0

    .line 16
    const/high16 v0, -0x80000000

    .line 17
    .line 18
    xor-int v1, p0, v0

    .line 19
    .line 20
    xor-int/2addr v0, p1

    .line 21
    invoke-static {v1, v0}, Ljava/lang/Integer;->compare(II)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    sub-int/2addr p0, p1

    .line 26
    invoke-static {p0}, Lkotlin/UInt;->constructor-impl(I)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-ltz v0, :cond_0

    .line 31
    .line 32
    return p0

    .line 33
    :cond_0
    add-int/2addr p0, p2

    .line 34
    invoke-static {p0}, Lkotlin/UInt;->constructor-impl(I)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0
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

.method private static final differenceModulo-sambcqE(JJJ)J
    .locals 10

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p4, v0

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    const-wide/high16 v4, -0x8000000000000000L

    .line 7
    .line 8
    if-gez v2, :cond_1

    .line 9
    .line 10
    xor-long v6, p0, v4

    .line 11
    .line 12
    xor-long v8, p4, v4

    .line 13
    .line 14
    cmp-long v6, v6, v8

    .line 15
    .line 16
    if-gez v6, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    sub-long/2addr p0, p4

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    cmp-long v6, p0, v0

    .line 22
    .line 23
    if-ltz v6, :cond_2

    .line 24
    .line 25
    rem-long/2addr p0, p4

    .line 26
    goto :goto_1

    .line 27
    :cond_2
    ushr-long v6, p0, v3

    .line 28
    .line 29
    div-long/2addr v6, p4

    .line 30
    shl-long/2addr v6, v3

    .line 31
    mul-long/2addr v6, p4

    .line 32
    sub-long/2addr p0, v6

    .line 33
    xor-long v6, p0, v4

    .line 34
    .line 35
    xor-long v8, p4, v4

    .line 36
    .line 37
    cmp-long v6, v6, v8

    .line 38
    .line 39
    if-ltz v6, :cond_3

    .line 40
    .line 41
    move-wide v6, p4

    .line 42
    goto :goto_0

    .line 43
    :cond_3
    move-wide v6, v0

    .line 44
    :goto_0
    sub-long/2addr p0, v6

    .line 45
    :goto_1
    if-gez v2, :cond_5

    .line 46
    .line 47
    xor-long v0, p2, v4

    .line 48
    .line 49
    xor-long v2, p4, v4

    .line 50
    .line 51
    cmp-long v0, v0, v2

    .line 52
    .line 53
    if-gez v0, :cond_4

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_4
    sub-long/2addr p2, p4

    .line 57
    goto :goto_2

    .line 58
    :cond_5
    cmp-long v2, p2, v0

    .line 59
    .line 60
    if-ltz v2, :cond_6

    .line 61
    .line 62
    rem-long/2addr p2, p4

    .line 63
    goto :goto_2

    .line 64
    :cond_6
    ushr-long v6, p2, v3

    .line 65
    .line 66
    div-long/2addr v6, p4

    .line 67
    shl-long v2, v6, v3

    .line 68
    .line 69
    mul-long/2addr v2, p4

    .line 70
    sub-long/2addr p2, v2

    .line 71
    xor-long v2, p2, v4

    .line 72
    .line 73
    xor-long v6, p4, v4

    .line 74
    .line 75
    cmp-long v2, v2, v6

    .line 76
    .line 77
    if-ltz v2, :cond_7

    .line 78
    .line 79
    move-wide v0, p4

    .line 80
    :cond_7
    sub-long/2addr p2, v0

    .line 81
    :goto_2
    xor-long v0, p0, v4

    .line 82
    .line 83
    xor-long v2, p2, v4

    .line 84
    .line 85
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    sub-long/2addr p0, p2

    .line 90
    invoke-static {p0, p1}, Lkotlin/ULong;->constructor-impl(J)J

    .line 91
    .line 92
    .line 93
    move-result-wide p0

    .line 94
    if-ltz v0, :cond_8

    .line 95
    .line 96
    return-wide p0

    .line 97
    :cond_8
    add-long/2addr p0, p4

    .line 98
    invoke-static {p0, p1}, Lkotlin/ULong;->constructor-impl(J)J

    .line 99
    .line 100
    .line 101
    move-result-wide p0

    .line 102
    return-wide p0
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
.end method

.method public static final getProgressionLastElement-7ftBX0g(JJJ)J
    .locals 8
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    .annotation build Lkotlin/SinceKotlin;
        version = "1.3"
    .end annotation

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p4, v0

    .line 4
    .line 5
    const-wide/high16 v1, -0x8000000000000000L

    .line 6
    .line 7
    if-lez v0, :cond_1

    .line 8
    .line 9
    xor-long v3, p0, v1

    .line 10
    .line 11
    xor-long v0, p2, v1

    .line 12
    .line 13
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Long;->compare(JJ)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ltz v0, :cond_0

    .line 18
    .line 19
    move-wide p0, p2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {p4, p5}, Lkotlin/ULong;->constructor-impl(J)J

    .line 22
    .line 23
    .line 24
    move-result-wide p4

    .line 25
    move-wide v6, p2

    .line 26
    move-wide p2, p0

    .line 27
    move-wide p0, v6

    .line 28
    invoke-static/range {p0 .. p5}, Lkotlin/internal/UProgressionUtilKt;->differenceModulo-sambcqE(JJJ)J

    .line 29
    .line 30
    .line 31
    move-result-wide p2

    .line 32
    sub-long p2, p0, p2

    .line 33
    .line 34
    invoke-static {p2, p3}, Lkotlin/ULong;->constructor-impl(J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p0

    .line 38
    return-wide p0

    .line 39
    :cond_1
    move-wide v6, p2

    .line 40
    move-wide p2, p0

    .line 41
    move-wide p0, v6

    .line 42
    if-gez v0, :cond_3

    .line 43
    .line 44
    xor-long v3, p2, v1

    .line 45
    .line 46
    xor-long v0, p0, v1

    .line 47
    .line 48
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Long;->compare(JJ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-gtz v0, :cond_2

    .line 53
    .line 54
    :goto_0
    return-wide p0

    .line 55
    :cond_2
    neg-long p4, p4

    .line 56
    invoke-static {p4, p5}, Lkotlin/ULong;->constructor-impl(J)J

    .line 57
    .line 58
    .line 59
    move-result-wide v4

    .line 60
    move-wide v2, p0

    .line 61
    move-wide v0, p2

    .line 62
    invoke-static/range {v0 .. v5}, Lkotlin/internal/UProgressionUtilKt;->differenceModulo-sambcqE(JJJ)J

    .line 63
    .line 64
    .line 65
    move-result-wide p0

    .line 66
    add-long p2, v2, p0

    .line 67
    .line 68
    invoke-static {p2, p3}, Lkotlin/ULong;->constructor-impl(J)J

    .line 69
    .line 70
    .line 71
    move-result-wide p0

    .line 72
    return-wide p0

    .line 73
    :cond_3
    const-string p0, "Step is zero."

    .line 74
    .line 75
    invoke-static {p0}, Lj1/i;->k(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const-wide/16 p0, 0x0

    .line 79
    .line 80
    return-wide p0
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public static final getProgressionLastElement-Nkh28Cs(III)I
    .locals 2
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    .annotation build Lkotlin/SinceKotlin;
        version = "1.3"
    .end annotation

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    if-lez p2, :cond_1

    .line 4
    .line 5
    xor-int v1, p0, v0

    .line 6
    .line 7
    xor-int/2addr v0, p1

    .line 8
    invoke-static {v1, v0}, Ljava/lang/Integer;->compare(II)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-ltz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {p2}, Lkotlin/UInt;->constructor-impl(I)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-static {p1, p0, p2}, Lkotlin/internal/UProgressionUtilKt;->differenceModulo-WZ9TVnA(III)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    sub-int/2addr p1, p0

    .line 24
    invoke-static {p1}, Lkotlin/UInt;->constructor-impl(I)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0

    .line 29
    :cond_1
    if-gez p2, :cond_3

    .line 30
    .line 31
    xor-int v1, p0, v0

    .line 32
    .line 33
    xor-int/2addr v0, p1

    .line 34
    invoke-static {v1, v0}, Ljava/lang/Integer;->compare(II)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-gtz v0, :cond_2

    .line 39
    .line 40
    :goto_0
    return p1

    .line 41
    :cond_2
    neg-int p2, p2

    .line 42
    invoke-static {p2}, Lkotlin/UInt;->constructor-impl(I)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    invoke-static {p0, p1, p2}, Lkotlin/internal/UProgressionUtilKt;->differenceModulo-WZ9TVnA(III)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    add-int/2addr p1, p0

    .line 51
    invoke-static {p1}, Lkotlin/UInt;->constructor-impl(I)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    return p0

    .line 56
    :cond_3
    const-string p0, "Step is zero."

    .line 57
    .line 58
    invoke-static {p0}, Lj1/i;->k(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    return p0
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
