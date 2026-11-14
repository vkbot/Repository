.class public Lorg/apache/commons/io/input/XmlStreamReader;
.super Ljava/io/Reader;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/commons/io/input/XmlStreamReader$Builder;
    }
.end annotation


# static fields
.field private static final BOMS:[Lorg/apache/commons/io/ByteOrderMark;

.field private static final CHARSET_PATTERN:Ljava/util/regex/Pattern;

.field private static final EBCDIC:Ljava/lang/String; = "CP1047"

.field public static final ENCODING_PATTERN:Ljava/util/regex/Pattern;

.field private static final HTTP_EX_1:Ljava/lang/String; = "Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be null"

.field private static final HTTP_EX_2:Ljava/lang/String; = "Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch"

.field private static final HTTP_EX_3:Ljava/lang/String; = "Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Illegal MIME"

.field private static final RAW_EX_1:Ljava/lang/String; = "Illegal encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch"

.field private static final RAW_EX_2:Ljava/lang/String; = "Illegal encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM"

.field private static final US_ASCII:Ljava/lang/String;

.field private static final UTF_16:Ljava/lang/String;

.field private static final UTF_16BE:Ljava/lang/String;

.field private static final UTF_16LE:Ljava/lang/String;

.field private static final UTF_32:Ljava/lang/String; = "UTF-32"

.field private static final UTF_32BE:Ljava/lang/String; = "UTF-32BE"

.field private static final UTF_32LE:Ljava/lang/String; = "UTF-32LE"

.field private static final UTF_8:Ljava/lang/String;

.field private static final XML_GUESS_BYTES:[Lorg/apache/commons/io/ByteOrderMark;


# instance fields
.field private final defaultEncoding:Ljava/lang/String;

.field private final encoding:Ljava/lang/String;

.field private final reader:Ljava/io/Reader;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/commons/io/input/XmlStreamReader;->UTF_8:Ljava/lang/String;

    .line 8
    .line 9
    sget-object v1, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sput-object v1, Lorg/apache/commons/io/input/XmlStreamReader;->US_ASCII:Ljava/lang/String;

    .line 16
    .line 17
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sput-object v1, Lorg/apache/commons/io/input/XmlStreamReader;->UTF_16BE:Ljava/lang/String;

    .line 24
    .line 25
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sput-object v2, Lorg/apache/commons/io/input/XmlStreamReader;->UTF_16LE:Ljava/lang/String;

    .line 32
    .line 33
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    sput-object v3, Lorg/apache/commons/io/input/XmlStreamReader;->UTF_16:Ljava/lang/String;

    .line 40
    .line 41
    sget-object v3, Lorg/apache/commons/io/ByteOrderMark;->UTF_8:Lorg/apache/commons/io/ByteOrderMark;

    .line 42
    .line 43
    sget-object v4, Lorg/apache/commons/io/ByteOrderMark;->UTF_16BE:Lorg/apache/commons/io/ByteOrderMark;

    .line 44
    .line 45
    sget-object v5, Lorg/apache/commons/io/ByteOrderMark;->UTF_16LE:Lorg/apache/commons/io/ByteOrderMark;

    .line 46
    .line 47
    sget-object v6, Lorg/apache/commons/io/ByteOrderMark;->UTF_32BE:Lorg/apache/commons/io/ByteOrderMark;

    .line 48
    .line 49
    sget-object v7, Lorg/apache/commons/io/ByteOrderMark;->UTF_32LE:Lorg/apache/commons/io/ByteOrderMark;

    .line 50
    .line 51
    filled-new-array {v3, v4, v5, v6, v7}, [Lorg/apache/commons/io/ByteOrderMark;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    sput-object v3, Lorg/apache/commons/io/input/XmlStreamReader;->BOMS:[Lorg/apache/commons/io/ByteOrderMark;

    .line 56
    .line 57
    new-instance v4, Lorg/apache/commons/io/ByteOrderMark;

    .line 58
    .line 59
    const/16 v3, 0x78

    .line 60
    .line 61
    const/16 v5, 0x6d

    .line 62
    .line 63
    const/16 v6, 0x3c

    .line 64
    .line 65
    const/16 v7, 0x3f

    .line 66
    .line 67
    filled-new-array {v6, v7, v3, v5}, [I

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-direct {v4, v0, v3}, Lorg/apache/commons/io/ByteOrderMark;-><init>(Ljava/lang/String;[I)V

    .line 72
    .line 73
    .line 74
    new-instance v5, Lorg/apache/commons/io/ByteOrderMark;

    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    filled-new-array {v0, v6, v0, v7}, [I

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-direct {v5, v1, v3}, Lorg/apache/commons/io/ByteOrderMark;-><init>(Ljava/lang/String;[I)V

    .line 82
    .line 83
    .line 84
    move v1, v6

    .line 85
    new-instance v6, Lorg/apache/commons/io/ByteOrderMark;

    .line 86
    .line 87
    filled-new-array {v1, v0, v7, v0}, [I

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-direct {v6, v2, v0}, Lorg/apache/commons/io/ByteOrderMark;-><init>(Ljava/lang/String;[I)V

    .line 92
    .line 93
    .line 94
    new-instance v7, Lorg/apache/commons/io/ByteOrderMark;

    .line 95
    .line 96
    const/16 v0, 0x10

    .line 97
    .line 98
    new-array v1, v0, [I

    .line 99
    .line 100
    fill-array-data v1, :array_0

    .line 101
    .line 102
    .line 103
    const-string v2, "UTF-32BE"

    .line 104
    .line 105
    invoke-direct {v7, v2, v1}, Lorg/apache/commons/io/ByteOrderMark;-><init>(Ljava/lang/String;[I)V

    .line 106
    .line 107
    .line 108
    new-instance v8, Lorg/apache/commons/io/ByteOrderMark;

    .line 109
    .line 110
    new-array v0, v0, [I

    .line 111
    .line 112
    fill-array-data v0, :array_1

    .line 113
    .line 114
    .line 115
    const-string v1, "UTF-32LE"

    .line 116
    .line 117
    invoke-direct {v8, v1, v0}, Lorg/apache/commons/io/ByteOrderMark;-><init>(Ljava/lang/String;[I)V

    .line 118
    .line 119
    .line 120
    new-instance v9, Lorg/apache/commons/io/ByteOrderMark;

    .line 121
    .line 122
    const/16 v0, 0xa7

    .line 123
    .line 124
    const/16 v1, 0x94

    .line 125
    .line 126
    const/16 v2, 0x4c

    .line 127
    .line 128
    const/16 v3, 0x6f

    .line 129
    .line 130
    filled-new-array {v2, v3, v0, v1}, [I

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    const-string v1, "CP1047"

    .line 135
    .line 136
    invoke-direct {v9, v1, v0}, Lorg/apache/commons/io/ByteOrderMark;-><init>(Ljava/lang/String;[I)V

    .line 137
    .line 138
    .line 139
    filled-new-array/range {v4 .. v9}, [Lorg/apache/commons/io/ByteOrderMark;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    sput-object v0, Lorg/apache/commons/io/input/XmlStreamReader;->XML_GUESS_BYTES:[Lorg/apache/commons/io/ByteOrderMark;

    .line 144
    .line 145
    const-string v0, "charset=[\"\']?([.[^; \"\']]*)[\"\']?"

    .line 146
    .line 147
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    sput-object v0, Lorg/apache/commons/io/input/XmlStreamReader;->CHARSET_PATTERN:Ljava/util/regex/Pattern;

    .line 152
    .line 153
    const-string v0, "^<\\?xml\\s+(?:version\\s*=\\s*(?:(?:\"1\\.[0-9]+\")|(?:\'1.[0-9]+\'))\\s+)??encoding\\s*=\\s*((?:\"[A-Za-z0-9][A-Za-z0-9._+:-]*\")|(?:\'[A-Za-z0-9][A-Za-z0-9._+:-]*\'))"

    .line 154
    .line 155
    const/16 v1, 0x8

    .line 156
    .line 157
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    sput-object v0, Lorg/apache/commons/io/input/XmlStreamReader;->ENCODING_PATTERN:Ljava/util/regex/Pattern;

    .line 162
    .line 163
    return-void

    .line 164
    nop

    .line 165
    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x3c
        0x0
        0x0
        0x0
        0x3f
        0x0
        0x0
        0x0
        0x78
        0x0
        0x0
        0x0
        0x6d
    .end array-data

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
    :array_1
    .array-data 4
        0x3c
        0x0
        0x0
        0x0
        0x3f
        0x0
        0x0
        0x0
        0x78
        0x0
        0x0
        0x0
        0x6d
        0x0
        0x0
        0x0
    .end array-data
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

.method public constructor <init>(Ljava/io/File;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 129
    const-string v0, "file"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p1}, Lc5/h;->i(Ljava/io/File;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/apache/commons/io/input/XmlStreamReader;-><init>(Ljava/nio/file/Path;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x1

    .line 111
    invoke-direct {p0, p1, v0}, Lorg/apache/commons/io/input/XmlStreamReader;-><init>(Ljava/io/InputStream;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x1

    .line 119
    invoke-direct {p0, p1, p2, v0}, Lorg/apache/commons/io/input/XmlStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Ljava/lang/String;Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 120
    invoke-direct {p0, p1, p2, p3, v0}, Lorg/apache/commons/io/input/XmlStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 121
    invoke-direct {p0}, Ljava/io/Reader;-><init>()V

    .line 122
    iput-object p4, p0, Lorg/apache/commons/io/input/XmlStreamReader;->defaultEncoding:Ljava/lang/String;

    .line 123
    new-instance p4, Lorg/apache/commons/io/input/BOMInputStream;

    new-instance v0, Ljava/io/BufferedInputStream;

    const-string v1, "inputStream"

    invoke-static {p1, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/16 v1, 0x2000

    invoke-direct {v0, p1, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    const/4 p1, 0x0

    sget-object v1, Lorg/apache/commons/io/input/XmlStreamReader;->BOMS:[Lorg/apache/commons/io/ByteOrderMark;

    invoke-direct {p4, v0, p1, v1}, Lorg/apache/commons/io/input/BOMInputStream;-><init>(Ljava/io/InputStream;Z[Lorg/apache/commons/io/ByteOrderMark;)V

    .line 124
    new-instance p1, Lorg/apache/commons/io/input/BOMInputStream;

    const/4 v0, 0x1

    sget-object v1, Lorg/apache/commons/io/input/XmlStreamReader;->XML_GUESS_BYTES:[Lorg/apache/commons/io/ByteOrderMark;

    invoke-direct {p1, p4, v0, v1}, Lorg/apache/commons/io/input/BOMInputStream;-><init>(Ljava/io/InputStream;Z[Lorg/apache/commons/io/ByteOrderMark;)V

    .line 125
    invoke-direct {p0, p4, p1, p3, p2}, Lorg/apache/commons/io/input/XmlStreamReader;->processHttpStream(Lorg/apache/commons/io/input/BOMInputStream;Lorg/apache/commons/io/input/BOMInputStream;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lorg/apache/commons/io/input/XmlStreamReader;->encoding:Ljava/lang/String;

    .line 126
    new-instance p3, Ljava/io/InputStreamReader;

    invoke-direct {p3, p1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    iput-object p3, p0, Lorg/apache/commons/io/input/XmlStreamReader;->reader:Ljava/io/Reader;

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 112
    invoke-direct {p0, p1, p2, v0}, Lorg/apache/commons/io/input/XmlStreamReader;-><init>(Ljava/io/InputStream;ZLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;ZLjava/lang/String;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 113
    invoke-direct {p0}, Ljava/io/Reader;-><init>()V

    .line 114
    iput-object p3, p0, Lorg/apache/commons/io/input/XmlStreamReader;->defaultEncoding:Ljava/lang/String;

    .line 115
    new-instance p3, Lorg/apache/commons/io/input/BOMInputStream;

    new-instance v0, Ljava/io/BufferedInputStream;

    const-string v1, "inputStream"

    invoke-static {p1, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/16 v1, 0x2000

    invoke-direct {v0, p1, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    const/4 p1, 0x0

    sget-object v1, Lorg/apache/commons/io/input/XmlStreamReader;->BOMS:[Lorg/apache/commons/io/ByteOrderMark;

    invoke-direct {p3, v0, p1, v1}, Lorg/apache/commons/io/input/BOMInputStream;-><init>(Ljava/io/InputStream;Z[Lorg/apache/commons/io/ByteOrderMark;)V

    .line 116
    new-instance p1, Lorg/apache/commons/io/input/BOMInputStream;

    const/4 v0, 0x1

    sget-object v1, Lorg/apache/commons/io/input/XmlStreamReader;->XML_GUESS_BYTES:[Lorg/apache/commons/io/ByteOrderMark;

    invoke-direct {p1, p3, v0, v1}, Lorg/apache/commons/io/input/BOMInputStream;-><init>(Ljava/io/InputStream;Z[Lorg/apache/commons/io/ByteOrderMark;)V

    .line 117
    invoke-direct {p0, p3, p1, p2}, Lorg/apache/commons/io/input/XmlStreamReader;->processHttpStream(Lorg/apache/commons/io/input/BOMInputStream;Lorg/apache/commons/io/input/BOMInputStream;Z)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lorg/apache/commons/io/input/XmlStreamReader;->encoding:Ljava/lang/String;

    .line 118
    new-instance p3, Ljava/io/InputStreamReader;

    invoke-direct {p3, p1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    iput-object p3, p0, Lorg/apache/commons/io/input/XmlStreamReader;->reader:Ljava/io/Reader;

    return-void
.end method

.method public constructor <init>(Ljava/net/URL;)V
    .locals 1

    .line 128
    const-string v0, "url"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/apache/commons/io/input/XmlStreamReader;-><init>(Ljava/net/URLConnection;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/net/URLConnection;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/io/Reader;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "urlConnection"

    .line 5
    .line 6
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lorg/apache/commons/io/input/XmlStreamReader;->defaultEncoding:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {}, Lorg/apache/commons/io/input/BOMInputStream;->builder()Lorg/apache/commons/io/input/BOMInputStream$Builder;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    new-instance v2, Ljava/io/BufferedInputStream;

    .line 24
    .line 25
    const/16 v3, 0x2000

    .line 26
    .line 27
    invoke-direct {v2, v0, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, Lorg/apache/commons/io/build/AbstractOriginSupplier;->setInputStream(Ljava/io/InputStream;)Lorg/apache/commons/io/build/AbstractOriginSupplier;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lorg/apache/commons/io/input/BOMInputStream$Builder;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-virtual {v0, v1}, Lorg/apache/commons/io/input/BOMInputStream$Builder;->setInclude(Z)Lorg/apache/commons/io/input/BOMInputStream$Builder;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sget-object v1, Lorg/apache/commons/io/input/XmlStreamReader;->BOMS:[Lorg/apache/commons/io/ByteOrderMark;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lorg/apache/commons/io/input/BOMInputStream$Builder;->setByteOrderMarks([Lorg/apache/commons/io/ByteOrderMark;)Lorg/apache/commons/io/input/BOMInputStream$Builder;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Lorg/apache/commons/io/input/BOMInputStream$Builder;->get()Lorg/apache/commons/io/input/BOMInputStream;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {}, Lorg/apache/commons/io/input/BOMInputStream;->builder()Lorg/apache/commons/io/input/BOMInputStream$Builder;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    new-instance v2, Ljava/io/BufferedInputStream;

    .line 56
    .line 57
    invoke-direct {v2, v0, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, Lorg/apache/commons/io/build/AbstractOriginSupplier;->setInputStream(Ljava/io/InputStream;)Lorg/apache/commons/io/build/AbstractOriginSupplier;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Lorg/apache/commons/io/input/BOMInputStream$Builder;

    .line 65
    .line 66
    const/4 v2, 0x1

    .line 67
    invoke-virtual {v1, v2}, Lorg/apache/commons/io/input/BOMInputStream$Builder;->setInclude(Z)Lorg/apache/commons/io/input/BOMInputStream$Builder;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    sget-object v3, Lorg/apache/commons/io/input/XmlStreamReader;->XML_GUESS_BYTES:[Lorg/apache/commons/io/ByteOrderMark;

    .line 72
    .line 73
    invoke-virtual {v1, v3}, Lorg/apache/commons/io/input/BOMInputStream$Builder;->setByteOrderMarks([Lorg/apache/commons/io/ByteOrderMark;)Lorg/apache/commons/io/input/BOMInputStream$Builder;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v1}, Lorg/apache/commons/io/input/BOMInputStream$Builder;->get()Lorg/apache/commons/io/input/BOMInputStream;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    instance-of p1, p1, Ljava/net/HttpURLConnection;

    .line 82
    .line 83
    if-nez p1, :cond_1

    .line 84
    .line 85
    if-eqz p2, :cond_0

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    invoke-direct {p0, v0, v1, v2}, Lorg/apache/commons/io/input/XmlStreamReader;->processHttpStream(Lorg/apache/commons/io/input/BOMInputStream;Lorg/apache/commons/io/input/BOMInputStream;Z)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iput-object p1, p0, Lorg/apache/commons/io/input/XmlStreamReader;->encoding:Ljava/lang/String;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    :goto_0
    invoke-direct {p0, v0, v1, v2, p2}, Lorg/apache/commons/io/input/XmlStreamReader;->processHttpStream(Lorg/apache/commons/io/input/BOMInputStream;Lorg/apache/commons/io/input/BOMInputStream;ZLjava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iput-object p1, p0, Lorg/apache/commons/io/input/XmlStreamReader;->encoding:Ljava/lang/String;

    .line 100
    .line 101
    :goto_1
    new-instance p1, Ljava/io/InputStreamReader;

    .line 102
    .line 103
    iget-object p2, p0, Lorg/apache/commons/io/input/XmlStreamReader;->encoding:Ljava/lang/String;

    .line 104
    .line 105
    invoke-direct {p1, v1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    iput-object p1, p0, Lorg/apache/commons/io/input/XmlStreamReader;->reader:Ljava/io/Reader;

    .line 109
    .line 110
    return-void
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

.method public constructor <init>(Ljava/nio/file/Path;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 127
    const-string v0, "file"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/internal/jdk8/a;->m(Ljava/lang/Object;)Ljava/nio/file/Path;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/nio/file/OpenOption;

    invoke-static {p1, v0}, Lkotlin/io/path/f;->e(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/apache/commons/io/input/XmlStreamReader;-><init>(Ljava/io/InputStream;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lorg/apache/commons/io/input/XmlStreamReader;->lambda$getXmlProlog$0(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
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

.method public static builder()Lorg/apache/commons/io/input/XmlStreamReader$Builder;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/io/input/XmlStreamReader$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/apache/commons/io/input/XmlStreamReader$Builder;-><init>()V

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

.method private doLenientDetection(Ljava/lang/String;Lorg/apache/commons/io/input/XmlStreamReaderException;)Ljava/lang/String;
    .locals 7

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, "text/html"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/16 v0, 0x9

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string v0, "text/xml"

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    :try_start_0
    invoke-virtual {p2}, Lorg/apache/commons/io/input/XmlStreamReaderException;->getBomEncoding()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {p2}, Lorg/apache/commons/io/input/XmlStreamReaderException;->getXmlGuessEncoding()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {p2}, Lorg/apache/commons/io/input/XmlStreamReaderException;->getXmlEncoding()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4
    :try_end_0
    .catch Lorg/apache/commons/io/input/XmlStreamReaderException; {:try_start_0 .. :try_end_0} :catch_1

    .line 35
    const/4 v5, 0x1

    .line 36
    move-object v1, p0

    .line 37
    :try_start_1
    invoke-virtual/range {v1 .. v6}, Lorg/apache/commons/io/input/XmlStreamReader;->calculateHttpEncoding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1
    :try_end_1
    .catch Lorg/apache/commons/io/input/XmlStreamReaderException; {:try_start_1 .. :try_end_1} :catch_0

    .line 41
    return-object p1

    .line 42
    :catch_0
    move-exception v0

    .line 43
    :goto_0
    move-object p1, v0

    .line 44
    move-object p2, p1

    .line 45
    goto :goto_1

    .line 46
    :catch_1
    move-exception v0

    .line 47
    move-object v1, p0

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move-object v1, p0

    .line 50
    :goto_1
    invoke-virtual {p2}, Lorg/apache/commons/io/input/XmlStreamReaderException;->getXmlEncoding()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-nez p1, :cond_1

    .line 55
    .line 56
    invoke-virtual {p2}, Lorg/apache/commons/io/input/XmlStreamReaderException;->getContentTypeEncoding()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    :cond_1
    if-nez p1, :cond_2

    .line 61
    .line 62
    iget-object p1, v1, Lorg/apache/commons/io/input/XmlStreamReader;->defaultEncoding:Ljava/lang/String;

    .line 63
    .line 64
    if-nez p1, :cond_2

    .line 65
    .line 66
    sget-object p1, Lorg/apache/commons/io/input/XmlStreamReader;->UTF_8:Ljava/lang/String;

    .line 67
    .line 68
    :cond_2
    return-object p1
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

.method public static getContentTypeEncoding(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    const-string v1, ";"

    .line 5
    .line 6
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, -0x1

    .line 11
    if-le v1, v2, :cond_1

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    add-int/2addr v1, v2

    .line 15
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object v1, Lorg/apache/commons/io/input/XmlStreamReader;->CHARSET_PATTERN:Ljava/util/regex/Pattern;

    .line 20
    .line 21
    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move-object p0, v0

    .line 37
    :goto_0
    if-eqz p0, :cond_1

    .line 38
    .line 39
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_1
    return-object v0
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

.method public static getContentTypeMime(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    const-string v0, ";"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-ltz v0, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_1
    const/4 p0, 0x0

    .line 22
    return-object p0
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

.method private static getXmlProlog(Ljava/io/InputStream;Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    invoke-static {}, Lorg/apache/commons/io/IOUtils;->byteArray()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x2000

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->mark(I)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {p0, v0, v2, v1}, Ljava/io/InputStream;->read([BII)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, -0x1

    .line 18
    const-string v5, ""

    .line 19
    .line 20
    move v8, v1

    .line 21
    move v7, v2

    .line 22
    move v6, v4

    .line 23
    :goto_0
    if-eq v3, v4, :cond_0

    .line 24
    .line 25
    if-ne v6, v4, :cond_0

    .line 26
    .line 27
    if-ge v7, v1, :cond_0

    .line 28
    .line 29
    add-int/2addr v7, v3

    .line 30
    sub-int/2addr v8, v3

    .line 31
    invoke-virtual {p0, v0, v7, v8}, Ljava/io/InputStream;->read([BII)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    new-instance v5, Ljava/lang/String;

    .line 36
    .line 37
    invoke-direct {v5, v0, v2, v7, p1}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/16 v6, 0x3e

    .line 41
    .line 42
    invoke-virtual {v5, v6}, Ljava/lang/String;->indexOf(I)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    if-ne v6, v4, :cond_2

    .line 48
    .line 49
    if-ne v3, v4, :cond_1

    .line 50
    .line 51
    const-string p0, "Unexpected end of XML stream"

    .line 52
    .line 53
    invoke-static {p0}, Ln0/b;->A(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    return-object p0

    .line 58
    :cond_1
    const-string p0, "XML prolog or ROOT element not found on first "

    .line 59
    .line 60
    const-string p1, " bytes"

    .line 61
    .line 62
    invoke-static {v7, p0, p1}, Lai/onnxruntime/a;->f(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Ln0/b;->A(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x0

    .line 70
    return-object p0

    .line 71
    :cond_2
    if-lez v7, :cond_3

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/io/InputStream;->reset()V

    .line 74
    .line 75
    .line 76
    new-instance p0, Ljava/io/BufferedReader;

    .line 77
    .line 78
    new-instance p1, Ljava/io/StringReader;

    .line 79
    .line 80
    const/4 v0, 0x1

    .line 81
    add-int/2addr v6, v0

    .line 82
    invoke-virtual {v5, v2, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-direct {p1, v1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-direct {p0, p1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 90
    .line 91
    .line 92
    new-instance p1, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/io/BufferedReader;->lines()Ljava/util/stream/Stream;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    new-instance v1, Lorg/apache/commons/io/input/j;

    .line 102
    .line 103
    const/4 v2, 0x2

    .line 104
    invoke-direct {v1, v2, p1}, Lorg/apache/commons/io/input/j;-><init>(ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-static {p0, v1}, Lorg/apache/commons/io/function/IOConsumer;->forEach(Ljava/util/stream/Stream;Lorg/apache/commons/io/function/IOConsumer;)V

    .line 108
    .line 109
    .line 110
    sget-object p0, Lorg/apache/commons/io/input/XmlStreamReader;->ENCODING_PATTERN:Ljava/util/regex/Pattern;

    .line 111
    .line 112
    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-eqz p1, :cond_3

    .line 121
    .line 122
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 127
    .line 128
    invoke-virtual {p0, p1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    sub-int/2addr p1, v0

    .line 137
    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0

    .line 142
    :cond_3
    const/4 p0, 0x0

    .line 143
    return-object p0
    .line 144
    .line 145
    .line 146
    .line 147
.end method

.method public static isAppXml(Ljava/lang/String;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    const-string v0, "application/xml"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "application/xml-dtd"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const-string v0, "application/xml-external-parsed-entity"

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    const-string v0, "application/"

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    const-string v0, "+xml"

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    :cond_0
    const/4 p0, 0x1

    .line 44
    return p0

    .line 45
    :cond_1
    const/4 p0, 0x0

    .line 46
    return p0
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

.method public static isTextXml(Ljava/lang/String;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    const-string v0, "text/xml"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "text/xml-external-parsed-entity"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const-string v0, "text/"

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    const-string v0, "+xml"

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    :cond_0
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_1
    const/4 p0, 0x0

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
.end method

.method private static synthetic lambda$getXmlProlog$0(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    const/16 p1, 0x20

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    return-void
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

.method private processHttpStream(Lorg/apache/commons/io/input/BOMInputStream;Lorg/apache/commons/io/input/BOMInputStream;Z)Ljava/lang/String;
    .locals 1

    .line 31
    invoke-virtual {p1}, Lorg/apache/commons/io/input/BOMInputStream;->getBOMCharsetName()Ljava/lang/String;

    move-result-object p1

    .line 32
    invoke-virtual {p2}, Lorg/apache/commons/io/input/BOMInputStream;->getBOMCharsetName()Ljava/lang/String;

    move-result-object v0

    .line 33
    invoke-static {p2, v0}, Lorg/apache/commons/io/input/XmlStreamReader;->getXmlProlog(Ljava/io/InputStream;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 34
    :try_start_0
    invoke-virtual {p0, p1, v0, p2}, Lorg/apache/commons/io/input/XmlStreamReader;->calculateRawEncoding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lorg/apache/commons/io/input/XmlStreamReaderException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 35
    invoke-direct {p0, p2, p1}, Lorg/apache/commons/io/input/XmlStreamReader;->doLenientDetection(Ljava/lang/String;Lorg/apache/commons/io/input/XmlStreamReaderException;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 36
    :cond_0
    throw p1
.end method

.method private processHttpStream(Lorg/apache/commons/io/input/BOMInputStream;Lorg/apache/commons/io/input/BOMInputStream;ZLjava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-virtual {p1}, Lorg/apache/commons/io/input/BOMInputStream;->getBOMCharsetName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    invoke-virtual {p2}, Lorg/apache/commons/io/input/BOMInputStream;->getBOMCharsetName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    invoke-static {p2, v3}, Lorg/apache/commons/io/input/XmlStreamReader;->getXmlProlog(Ljava/io/InputStream;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    move-object v1, p0

    .line 14
    move v5, p3

    .line 15
    move-object v6, p4

    .line 16
    :try_start_0
    invoke-virtual/range {v1 .. v6}, Lorg/apache/commons/io/input/XmlStreamReader;->calculateHttpEncoding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1
    :try_end_0
    .catch Lorg/apache/commons/io/input/XmlStreamReaderException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    return-object p1

    .line 21
    :catch_0
    move-exception v0

    .line 22
    move-object p1, v0

    .line 23
    if-eqz v5, :cond_0

    .line 24
    .line 25
    invoke-direct {p0, v6, p1}, Lorg/apache/commons/io/input/XmlStreamReader;->doLenientDetection(Ljava/lang/String;Lorg/apache/commons/io/input/XmlStreamReaderException;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_0
    throw p1
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
.end method


# virtual methods
.method public calculateHttpEncoding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    if-eqz p4, :cond_0

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    return-object p3

    .line 6
    :cond_0
    invoke-static {p5}, Lorg/apache/commons/io/input/XmlStreamReader;->getContentTypeMime(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-static {p5}, Lorg/apache/commons/io/input/XmlStreamReader;->getContentTypeEncoding(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-static {v2}, Lorg/apache/commons/io/input/XmlStreamReader;->isAppXml(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result p4

    .line 18
    invoke-static {v2}, Lorg/apache/commons/io/input/XmlStreamReader;->isTextXml(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result p5

    .line 22
    if-nez p4, :cond_1

    .line 23
    .line 24
    if-eqz p5, :cond_2

    .line 25
    .line 26
    :cond_1
    move-object v4, p1

    .line 27
    move-object v5, p2

    .line 28
    move-object v6, p3

    .line 29
    goto :goto_0

    .line 30
    :cond_2
    const-string p4, "Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Illegal MIME"

    .line 31
    .line 32
    filled-new-array {v2, v3, p1, p2, p3}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p5

    .line 36
    invoke-static {p4, p5}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    new-instance v0, Lorg/apache/commons/io/input/XmlStreamReaderException;

    .line 41
    .line 42
    move-object v4, p1

    .line 43
    move-object v5, p2

    .line 44
    move-object v6, p3

    .line 45
    invoke-direct/range {v0 .. v6}, Lorg/apache/commons/io/input/XmlStreamReaderException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :goto_0
    if-nez v3, :cond_5

    .line 50
    .line 51
    if-eqz p4, :cond_3

    .line 52
    .line 53
    invoke-virtual {p0, v4, v5, v6}, Lorg/apache/commons/io/input/XmlStreamReader;->calculateRawEncoding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1

    .line 58
    :cond_3
    iget-object p1, p0, Lorg/apache/commons/io/input/XmlStreamReader;->defaultEncoding:Ljava/lang/String;

    .line 59
    .line 60
    if-nez p1, :cond_4

    .line 61
    .line 62
    sget-object p1, Lorg/apache/commons/io/input/XmlStreamReader;->US_ASCII:Ljava/lang/String;

    .line 63
    .line 64
    :cond_4
    return-object p1

    .line 65
    :cond_5
    sget-object p1, Lorg/apache/commons/io/input/XmlStreamReader;->UTF_16BE:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    const-string p2, "Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be null"

    .line 72
    .line 73
    if-nez p1, :cond_d

    .line 74
    .line 75
    sget-object p1, Lorg/apache/commons/io/input/XmlStreamReader;->UTF_16LE:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_6

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_6
    sget-object p1, Lorg/apache/commons/io/input/XmlStreamReader;->UTF_16:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p3

    .line 90
    const-string p4, "Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch"

    .line 91
    .line 92
    if-eqz p3, :cond_8

    .line 93
    .line 94
    if-eqz v4, :cond_7

    .line 95
    .line 96
    invoke-virtual {v4, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_7

    .line 101
    .line 102
    return-object v4

    .line 103
    :cond_7
    filled-new-array {v2, v3, v4, v5, v6}, [Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-static {p4, p1}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    new-instance v0, Lorg/apache/commons/io/input/XmlStreamReaderException;

    .line 112
    .line 113
    invoke-direct/range {v0 .. v6}, Lorg/apache/commons/io/input/XmlStreamReaderException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v0

    .line 117
    :cond_8
    const-string p1, "UTF-32BE"

    .line 118
    .line 119
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-nez p1, :cond_b

    .line 124
    .line 125
    const-string p1, "UTF-32LE"

    .line 126
    .line 127
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-eqz p1, :cond_9

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_9
    const-string p1, "UTF-32"

    .line 135
    .line 136
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    if-eqz p2, :cond_e

    .line 141
    .line 142
    if-eqz v4, :cond_a

    .line 143
    .line 144
    invoke-virtual {v4, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-eqz p1, :cond_a

    .line 149
    .line 150
    return-object v4

    .line 151
    :cond_a
    filled-new-array {v2, v3, v4, v5, v6}, [Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-static {p4, p1}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    new-instance v0, Lorg/apache/commons/io/input/XmlStreamReaderException;

    .line 160
    .line 161
    invoke-direct/range {v0 .. v6}, Lorg/apache/commons/io/input/XmlStreamReaderException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v0

    .line 165
    :cond_b
    :goto_1
    if-nez v4, :cond_c

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_c
    filled-new-array {v2, v3, v4, v5, v6}, [Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-static {p2, p1}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    new-instance v0, Lorg/apache/commons/io/input/XmlStreamReaderException;

    .line 177
    .line 178
    invoke-direct/range {v0 .. v6}, Lorg/apache/commons/io/input/XmlStreamReaderException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw v0

    .line 182
    :cond_d
    :goto_2
    if-nez v4, :cond_f

    .line 183
    .line 184
    :cond_e
    :goto_3
    return-object v3

    .line 185
    :cond_f
    filled-new-array {v2, v3, v4, v5, v6}, [Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-static {p2, p1}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    new-instance v0, Lorg/apache/commons/io/input/XmlStreamReaderException;

    .line 194
    .line 195
    invoke-direct/range {v0 .. v6}, Lorg/apache/commons/io/input/XmlStreamReaderException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw v0
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
.end method

.method public calculateRawEncoding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p1, :cond_5

    .line 2
    .line 3
    if-eqz p2, :cond_3

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object p1, Lorg/apache/commons/io/input/XmlStreamReader;->UTF_16:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    sget-object p1, Lorg/apache/commons/io/input/XmlStreamReader;->UTF_16BE:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    sget-object p1, Lorg/apache/commons/io/input/XmlStreamReader;->UTF_16LE:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    :cond_1
    return-object p2

    .line 33
    :cond_2
    return-object p3

    .line 34
    :cond_3
    :goto_0
    iget-object p1, p0, Lorg/apache/commons/io/input/XmlStreamReader;->defaultEncoding:Ljava/lang/String;

    .line 35
    .line 36
    if-nez p1, :cond_4

    .line 37
    .line 38
    sget-object p1, Lorg/apache/commons/io/input/XmlStreamReader;->UTF_8:Ljava/lang/String;

    .line 39
    .line 40
    :cond_4
    return-object p1

    .line 41
    :cond_5
    sget-object v0, Lorg/apache/commons/io/input/XmlStreamReader;->UTF_8:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    const-string v2, "Illegal encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch"

    .line 48
    .line 49
    if-eqz v1, :cond_9

    .line 50
    .line 51
    if-eqz p2, :cond_7

    .line 52
    .line 53
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_6

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_6
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v2, v0}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    new-instance v1, Lorg/apache/commons/io/input/XmlStreamReaderException;

    .line 69
    .line 70
    invoke-direct {v1, v0, p1, p2, p3}, Lorg/apache/commons/io/input/XmlStreamReaderException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v1

    .line 74
    :cond_7
    :goto_1
    if-eqz p3, :cond_14

    .line 75
    .line 76
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_8

    .line 81
    .line 82
    goto/16 :goto_6

    .line 83
    .line 84
    :cond_8
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-static {v2, v0}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    new-instance v1, Lorg/apache/commons/io/input/XmlStreamReaderException;

    .line 93
    .line 94
    invoke-direct {v1, v0, p1, p2, p3}, Lorg/apache/commons/io/input/XmlStreamReaderException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw v1

    .line 98
    :cond_9
    sget-object v0, Lorg/apache/commons/io/input/XmlStreamReader;->UTF_16BE:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_10

    .line 105
    .line 106
    sget-object v0, Lorg/apache/commons/io/input/XmlStreamReader;->UTF_16LE:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_a

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_a
    const-string v0, "UTF-32BE"

    .line 116
    .line 117
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-nez v0, :cond_c

    .line 122
    .line 123
    const-string v0, "UTF-32LE"

    .line 124
    .line 125
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eqz v0, :cond_b

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_b
    const-string v0, "Illegal encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM"

    .line 133
    .line 134
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-static {v0, v1}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    new-instance v1, Lorg/apache/commons/io/input/XmlStreamReaderException;

    .line 143
    .line 144
    invoke-direct {v1, v0, p1, p2, p3}, Lorg/apache/commons/io/input/XmlStreamReaderException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw v1

    .line 148
    :cond_c
    :goto_2
    if-eqz p2, :cond_e

    .line 149
    .line 150
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_d

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_d
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-static {v2, v0}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    new-instance v1, Lorg/apache/commons/io/input/XmlStreamReaderException;

    .line 166
    .line 167
    invoke-direct {v1, v0, p1, p2, p3}, Lorg/apache/commons/io/input/XmlStreamReaderException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw v1

    .line 171
    :cond_e
    :goto_3
    if-eqz p3, :cond_14

    .line 172
    .line 173
    const-string v0, "UTF-32"

    .line 174
    .line 175
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-nez v0, :cond_14

    .line 180
    .line 181
    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-eqz v0, :cond_f

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_f
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-static {v2, v0}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    new-instance v1, Lorg/apache/commons/io/input/XmlStreamReaderException;

    .line 197
    .line 198
    invoke-direct {v1, v0, p1, p2, p3}, Lorg/apache/commons/io/input/XmlStreamReaderException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw v1

    .line 202
    :cond_10
    :goto_4
    if-eqz p2, :cond_12

    .line 203
    .line 204
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-eqz v0, :cond_11

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_11
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-static {v2, v0}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    new-instance v1, Lorg/apache/commons/io/input/XmlStreamReaderException;

    .line 220
    .line 221
    invoke-direct {v1, v0, p1, p2, p3}, Lorg/apache/commons/io/input/XmlStreamReaderException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw v1

    .line 225
    :cond_12
    :goto_5
    if-eqz p3, :cond_14

    .line 226
    .line 227
    sget-object v0, Lorg/apache/commons/io/input/XmlStreamReader;->UTF_16:Ljava/lang/String;

    .line 228
    .line 229
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-nez v0, :cond_14

    .line 234
    .line 235
    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    if-eqz v0, :cond_13

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_13
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-static {v2, v0}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    new-instance v1, Lorg/apache/commons/io/input/XmlStreamReaderException;

    .line 251
    .line 252
    invoke-direct {v1, v0, p1, p2, p3}, Lorg/apache/commons/io/input/XmlStreamReaderException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    throw v1

    .line 256
    :cond_14
    :goto_6
    return-object p1
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

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/io/input/XmlStreamReader;->reader:Ljava/io/Reader;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public getDefaultEncoding()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/io/input/XmlStreamReader;->defaultEncoding:Ljava/lang/String;

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

.method public getEncoding()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/io/input/XmlStreamReader;->encoding:Ljava/lang/String;

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

.method public read([CII)I
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/io/input/XmlStreamReader;->reader:Ljava/io/Reader;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/Reader;->read([CII)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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
