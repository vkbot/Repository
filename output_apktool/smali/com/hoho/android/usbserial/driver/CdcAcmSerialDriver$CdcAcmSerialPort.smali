.class public Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;
.super Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "CdcAcmSerialPort"
.end annotation


# static fields
.field private static final GET_LINE_CODING:I = 0x21

.field private static final SEND_BREAK:I = 0x23

.field private static final SET_CONTROL_LINE_STATE:I = 0x22

.field private static final SET_LINE_CODING:I = 0x20

.field private static final USB_RECIP_INTERFACE:I = 0x1

.field private static final USB_RT_ACM:I = 0x21


# instance fields
.field private mControlEndpoint:Landroid/hardware/usb/UsbEndpoint;

.field private mControlIndex:I

.field private mControlInterface:Landroid/hardware/usb/UsbInterface;

.field private mDataInterface:Landroid/hardware/usb/UsbInterface;

.field private mDtr:Z

.field private mRts:Z

.field final synthetic this$0:Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;


# direct methods
.method public constructor <init>(Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;Landroid/hardware/usb/UsbDevice;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->this$0:Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;-><init>(Landroid/hardware/usb/UsbDevice;I)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mRts:Z

    .line 8
    .line 9
    iput-boolean p1, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mDtr:Z

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

.method private getInterfaceIdFromDescriptors()I
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;->mConnection:Landroid/hardware/usb/UsbDeviceConnection;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/hardware/usb/UsbDeviceConnection;->getRawDescriptors()[B

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    move v3, v2

    .line 16
    :goto_0
    array-length v4, v0

    .line 17
    if-ge v3, v4, :cond_2

    .line 18
    .line 19
    aget-byte v4, v0, v3

    .line 20
    .line 21
    and-int/lit16 v4, v4, 0xff

    .line 22
    .line 23
    if-nez v4, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    add-int v5, v3, v4

    .line 27
    .line 28
    array-length v6, v0

    .line 29
    if-le v5, v6, :cond_1

    .line 30
    .line 31
    array-length v4, v0

    .line 32
    sub-int/2addr v4, v3

    .line 33
    :cond_1
    new-array v5, v4, [B

    .line 34
    .line 35
    invoke-static {v0, v3, v5, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    add-int/2addr v3, v4

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->this$0:Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;

    .line 44
    .line 45
    invoke-static {v0}, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;->access$000(Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v3, "USB descriptor:"

    .line 50
    .line 51
    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    move v3, v2

    .line 59
    :goto_2
    const/4 v4, 0x2

    .line 60
    const/4 v5, 0x1

    .line 61
    if-ge v3, v0, :cond_6

    .line 62
    .line 63
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    check-cast v6, [B

    .line 70
    .line 71
    iget-object v7, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->this$0:Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;

    .line 72
    .line 73
    invoke-static {v7}, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;->access$000(Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    array-length v8, v6

    .line 78
    if-lez v8, :cond_3

    .line 79
    .line 80
    mul-int/lit8 v9, v8, 0x3

    .line 81
    .line 82
    sub-int/2addr v9, v5

    .line 83
    goto :goto_3

    .line 84
    :cond_3
    move v9, v2

    .line 85
    :goto_3
    new-array v5, v9, [C

    .line 86
    .line 87
    move v9, v2

    .line 88
    move v10, v9

    .line 89
    :goto_4
    if-ge v9, v8, :cond_5

    .line 90
    .line 91
    if-lez v9, :cond_4

    .line 92
    .line 93
    add-int/lit8 v11, v10, 0x1

    .line 94
    .line 95
    const/16 v12, 0x20

    .line 96
    .line 97
    aput-char v12, v5, v10

    .line 98
    .line 99
    move v10, v11

    .line 100
    :cond_4
    aget-byte v11, v6, v9

    .line 101
    .line 102
    add-int/lit8 v12, v10, 0x1

    .line 103
    .line 104
    ushr-int/lit8 v13, v11, 0x4

    .line 105
    .line 106
    and-int/lit8 v13, v13, 0xf

    .line 107
    .line 108
    sget-object v14, La7/a;->a:[C

    .line 109
    .line 110
    aget-char v13, v14, v13

    .line 111
    .line 112
    aput-char v13, v5, v10

    .line 113
    .line 114
    add-int/2addr v10, v4

    .line 115
    and-int/lit8 v11, v11, 0xf

    .line 116
    .line 117
    aget-char v11, v14, v11

    .line 118
    .line 119
    aput-char v11, v5, v12

    .line 120
    .line 121
    add-int/lit8 v9, v9, 0x1

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_5
    new-instance v4, Ljava/lang/String;

    .line 125
    .line 126
    invoke-direct {v4, v5}, Ljava/lang/String;-><init>([C)V

    .line 127
    .line 128
    .line 129
    invoke-static {v7, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    const/4 v3, -0x1

    .line 138
    if-lez v0, :cond_8

    .line 139
    .line 140
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    check-cast v0, [B

    .line 145
    .line 146
    array-length v0, v0

    .line 147
    const/16 v6, 0x12

    .line 148
    .line 149
    if-ne v0, v6, :cond_8

    .line 150
    .line 151
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    check-cast v0, [B

    .line 156
    .line 157
    aget-byte v0, v0, v5

    .line 158
    .line 159
    if-ne v0, v5, :cond_8

    .line 160
    .line 161
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    check-cast v0, [B

    .line 166
    .line 167
    const/4 v6, 0x4

    .line 168
    aget-byte v0, v0, v6

    .line 169
    .line 170
    const/16 v7, -0x11

    .line 171
    .line 172
    if-ne v0, v7, :cond_8

    .line 173
    .line 174
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    check-cast v0, [B

    .line 179
    .line 180
    const/4 v7, 0x5

    .line 181
    aget-byte v0, v0, v7

    .line 182
    .line 183
    if-ne v0, v4, :cond_8

    .line 184
    .line 185
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    check-cast v0, [B

    .line 190
    .line 191
    const/4 v2, 0x6

    .line 192
    aget-byte v0, v0, v2

    .line 193
    .line 194
    if-ne v0, v5, :cond_8

    .line 195
    .line 196
    move v2, v3

    .line 197
    move v0, v5

    .line 198
    :goto_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 199
    .line 200
    .line 201
    move-result v8

    .line 202
    if-ge v0, v8, :cond_8

    .line 203
    .line 204
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    check-cast v8, [B

    .line 209
    .line 210
    array-length v8, v8

    .line 211
    const/16 v9, 0x8

    .line 212
    .line 213
    if-ne v8, v9, :cond_7

    .line 214
    .line 215
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v8

    .line 219
    check-cast v8, [B

    .line 220
    .line 221
    aget-byte v8, v8, v5

    .line 222
    .line 223
    const/16 v9, 0xb

    .line 224
    .line 225
    if-ne v8, v9, :cond_7

    .line 226
    .line 227
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v8

    .line 231
    check-cast v8, [B

    .line 232
    .line 233
    aget-byte v8, v8, v6

    .line 234
    .line 235
    if-ne v8, v4, :cond_7

    .line 236
    .line 237
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    check-cast v8, [B

    .line 242
    .line 243
    aget-byte v8, v8, v7

    .line 244
    .line 245
    if-ne v8, v4, :cond_7

    .line 246
    .line 247
    add-int/lit8 v2, v2, 0x1

    .line 248
    .line 249
    iget v8, p0, Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;->mPortNumber:I

    .line 250
    .line 251
    if-ne v2, v8, :cond_7

    .line 252
    .line 253
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v8

    .line 257
    check-cast v8, [B

    .line 258
    .line 259
    const/4 v9, 0x3

    .line 260
    aget-byte v8, v8, v9

    .line 261
    .line 262
    if-ne v8, v4, :cond_7

    .line 263
    .line 264
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    check-cast v0, [B

    .line 269
    .line 270
    aget-byte v0, v0, v4

    .line 271
    .line 272
    return v0

    .line 273
    :cond_7
    add-int/lit8 v0, v0, 0x1

    .line 274
    .line 275
    goto :goto_5

    .line 276
    :cond_8
    return v3
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

.method private openInterface()V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mControlInterface:Landroid/hardware/usb/UsbInterface;

    .line 3
    .line 4
    iput-object v0, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mDataInterface:Landroid/hardware/usb/UsbInterface;

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->getInterfaceIdFromDescriptors()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->this$0:Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;

    .line 11
    .line 12
    invoke-static {v1}, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;->access$000(Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v3, "interface count="

    .line 19
    .line 20
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v3, p0, Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;->mDevice:Landroid/hardware/usb/UsbDevice;

    .line 24
    .line 25
    invoke-virtual {v3}, Landroid/hardware/usb/UsbDevice;->getInterfaceCount()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v3, ", IAD="

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    const/16 v1, 0xa

    .line 48
    .line 49
    const/4 v2, 0x2

    .line 50
    const/4 v3, 0x0

    .line 51
    if-ltz v0, :cond_3

    .line 52
    .line 53
    move v4, v3

    .line 54
    :goto_0
    iget-object v5, p0, Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;->mDevice:Landroid/hardware/usb/UsbDevice;

    .line 55
    .line 56
    invoke-virtual {v5}, Landroid/hardware/usb/UsbDevice;->getInterfaceCount()I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-ge v4, v5, :cond_3

    .line 61
    .line 62
    iget-object v5, p0, Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;->mDevice:Landroid/hardware/usb/UsbDevice;

    .line 63
    .line 64
    invoke-virtual {v5, v4}, Landroid/hardware/usb/UsbDevice;->getInterface(I)Landroid/hardware/usb/UsbInterface;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-virtual {v5}, Landroid/hardware/usb/UsbInterface;->getId()I

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    if-eq v6, v0, :cond_0

    .line 73
    .line 74
    invoke-virtual {v5}, Landroid/hardware/usb/UsbInterface;->getId()I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    add-int/lit8 v7, v0, 0x1

    .line 79
    .line 80
    if-ne v6, v7, :cond_2

    .line 81
    .line 82
    :cond_0
    invoke-virtual {v5}, Landroid/hardware/usb/UsbInterface;->getInterfaceClass()I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    if-ne v6, v2, :cond_1

    .line 87
    .line 88
    invoke-virtual {v5}, Landroid/hardware/usb/UsbInterface;->getInterfaceSubclass()I

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-ne v6, v2, :cond_1

    .line 93
    .line 94
    invoke-virtual {v5}, Landroid/hardware/usb/UsbInterface;->getId()I

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    iput v6, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mControlIndex:I

    .line 99
    .line 100
    iput-object v5, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mControlInterface:Landroid/hardware/usb/UsbInterface;

    .line 101
    .line 102
    :cond_1
    invoke-virtual {v5}, Landroid/hardware/usb/UsbInterface;->getInterfaceClass()I

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    if-ne v6, v1, :cond_2

    .line 107
    .line 108
    iput-object v5, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mDataInterface:Landroid/hardware/usb/UsbInterface;

    .line 109
    .line 110
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_3
    iget-object v0, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mControlInterface:Landroid/hardware/usb/UsbInterface;

    .line 114
    .line 115
    if-eqz v0, :cond_4

    .line 116
    .line 117
    iget-object v0, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mDataInterface:Landroid/hardware/usb/UsbInterface;

    .line 118
    .line 119
    if-nez v0, :cond_9

    .line 120
    .line 121
    :cond_4
    iget-object v0, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->this$0:Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;

    .line 122
    .line 123
    invoke-static {v0}, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;->access$000(Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const-string v4, "no IAD fallback"

    .line 128
    .line 129
    invoke-static {v0, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    move v0, v3

    .line 133
    move v4, v0

    .line 134
    move v5, v4

    .line 135
    :goto_1
    iget-object v6, p0, Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;->mDevice:Landroid/hardware/usb/UsbDevice;

    .line 136
    .line 137
    invoke-virtual {v6}, Landroid/hardware/usb/UsbDevice;->getInterfaceCount()I

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    if-ge v0, v6, :cond_9

    .line 142
    .line 143
    iget-object v6, p0, Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;->mDevice:Landroid/hardware/usb/UsbDevice;

    .line 144
    .line 145
    invoke-virtual {v6, v0}, Landroid/hardware/usb/UsbDevice;->getInterface(I)Landroid/hardware/usb/UsbInterface;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    invoke-virtual {v6}, Landroid/hardware/usb/UsbInterface;->getInterfaceClass()I

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    if-ne v7, v2, :cond_6

    .line 154
    .line 155
    invoke-virtual {v6}, Landroid/hardware/usb/UsbInterface;->getInterfaceSubclass()I

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    if-ne v7, v2, :cond_6

    .line 160
    .line 161
    iget v7, p0, Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;->mPortNumber:I

    .line 162
    .line 163
    if-ne v4, v7, :cond_5

    .line 164
    .line 165
    invoke-virtual {v6}, Landroid/hardware/usb/UsbInterface;->getId()I

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    iput v7, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mControlIndex:I

    .line 170
    .line 171
    iput-object v6, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mControlInterface:Landroid/hardware/usb/UsbInterface;

    .line 172
    .line 173
    :cond_5
    add-int/lit8 v4, v4, 0x1

    .line 174
    .line 175
    :cond_6
    invoke-virtual {v6}, Landroid/hardware/usb/UsbInterface;->getInterfaceClass()I

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    if-ne v7, v1, :cond_8

    .line 180
    .line 181
    iget v7, p0, Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;->mPortNumber:I

    .line 182
    .line 183
    if-ne v5, v7, :cond_7

    .line 184
    .line 185
    iput-object v6, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mDataInterface:Landroid/hardware/usb/UsbInterface;

    .line 186
    .line 187
    :cond_7
    add-int/lit8 v5, v5, 0x1

    .line 188
    .line 189
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_9
    iget-object v0, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mControlInterface:Landroid/hardware/usb/UsbInterface;

    .line 193
    .line 194
    if-eqz v0, :cond_11

    .line 195
    .line 196
    iget-object v0, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->this$0:Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;

    .line 197
    .line 198
    invoke-static {v0}, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;->access$000(Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    new-instance v1, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    const-string v4, "Control interface id "

    .line 205
    .line 206
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    iget-object v4, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mControlInterface:Landroid/hardware/usb/UsbInterface;

    .line 210
    .line 211
    invoke-virtual {v4}, Landroid/hardware/usb/UsbInterface;->getId()I

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 223
    .line 224
    .line 225
    iget-object v0, p0, Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;->mConnection:Landroid/hardware/usb/UsbDeviceConnection;

    .line 226
    .line 227
    iget-object v1, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mControlInterface:Landroid/hardware/usb/UsbInterface;

    .line 228
    .line 229
    const/4 v4, 0x1

    .line 230
    invoke-virtual {v0, v1, v4}, Landroid/hardware/usb/UsbDeviceConnection;->claimInterface(Landroid/hardware/usb/UsbInterface;Z)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_10

    .line 235
    .line 236
    iget-object v0, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mControlInterface:Landroid/hardware/usb/UsbInterface;

    .line 237
    .line 238
    invoke-virtual {v0, v3}, Landroid/hardware/usb/UsbInterface;->getEndpoint(I)Landroid/hardware/usb/UsbEndpoint;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    iput-object v0, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mControlEndpoint:Landroid/hardware/usb/UsbEndpoint;

    .line 243
    .line 244
    invoke-virtual {v0}, Landroid/hardware/usb/UsbEndpoint;->getDirection()I

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    const/16 v1, 0x80

    .line 249
    .line 250
    if-ne v0, v1, :cond_f

    .line 251
    .line 252
    iget-object v0, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mControlEndpoint:Landroid/hardware/usb/UsbEndpoint;

    .line 253
    .line 254
    invoke-virtual {v0}, Landroid/hardware/usb/UsbEndpoint;->getType()I

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    const/4 v5, 0x3

    .line 259
    if-ne v0, v5, :cond_f

    .line 260
    .line 261
    iget-object v0, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mDataInterface:Landroid/hardware/usb/UsbInterface;

    .line 262
    .line 263
    if-eqz v0, :cond_e

    .line 264
    .line 265
    iget-object v0, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->this$0:Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;

    .line 266
    .line 267
    invoke-static {v0}, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;->access$000(Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    new-instance v5, Ljava/lang/StringBuilder;

    .line 272
    .line 273
    const-string v6, "data interface id "

    .line 274
    .line 275
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    iget-object v6, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mDataInterface:Landroid/hardware/usb/UsbInterface;

    .line 279
    .line 280
    invoke-virtual {v6}, Landroid/hardware/usb/UsbInterface;->getId()I

    .line 281
    .line 282
    .line 283
    move-result v6

    .line 284
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    invoke-static {v0, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 292
    .line 293
    .line 294
    iget-object v0, p0, Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;->mConnection:Landroid/hardware/usb/UsbDeviceConnection;

    .line 295
    .line 296
    iget-object v5, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mDataInterface:Landroid/hardware/usb/UsbInterface;

    .line 297
    .line 298
    invoke-virtual {v0, v5, v4}, Landroid/hardware/usb/UsbDeviceConnection;->claimInterface(Landroid/hardware/usb/UsbInterface;Z)Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-eqz v0, :cond_d

    .line 303
    .line 304
    :goto_2
    iget-object v0, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mDataInterface:Landroid/hardware/usb/UsbInterface;

    .line 305
    .line 306
    invoke-virtual {v0}, Landroid/hardware/usb/UsbInterface;->getEndpointCount()I

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-ge v3, v0, :cond_c

    .line 311
    .line 312
    iget-object v0, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mDataInterface:Landroid/hardware/usb/UsbInterface;

    .line 313
    .line 314
    invoke-virtual {v0, v3}, Landroid/hardware/usb/UsbInterface;->getEndpoint(I)Landroid/hardware/usb/UsbEndpoint;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-virtual {v0}, Landroid/hardware/usb/UsbEndpoint;->getDirection()I

    .line 319
    .line 320
    .line 321
    move-result v4

    .line 322
    if-ne v4, v1, :cond_a

    .line 323
    .line 324
    invoke-virtual {v0}, Landroid/hardware/usb/UsbEndpoint;->getType()I

    .line 325
    .line 326
    .line 327
    move-result v4

    .line 328
    if-ne v4, v2, :cond_a

    .line 329
    .line 330
    iput-object v0, p0, Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;->mReadEndpoint:Landroid/hardware/usb/UsbEndpoint;

    .line 331
    .line 332
    :cond_a
    invoke-virtual {v0}, Landroid/hardware/usb/UsbEndpoint;->getDirection()I

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    if-nez v4, :cond_b

    .line 337
    .line 338
    invoke-virtual {v0}, Landroid/hardware/usb/UsbEndpoint;->getType()I

    .line 339
    .line 340
    .line 341
    move-result v4

    .line 342
    if-ne v4, v2, :cond_b

    .line 343
    .line 344
    iput-object v0, p0, Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;->mWriteEndpoint:Landroid/hardware/usb/UsbEndpoint;

    .line 345
    .line 346
    :cond_b
    add-int/lit8 v3, v3, 0x1

    .line 347
    .line 348
    goto :goto_2

    .line 349
    :cond_c
    return-void

    .line 350
    :cond_d
    const-string v0, "Could not claim data interface"

    .line 351
    .line 352
    invoke-static {v0}, Ln0/b;->A(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    return-void

    .line 356
    :cond_e
    const-string v0, "No data interface"

    .line 357
    .line 358
    invoke-static {v0}, Ln0/b;->A(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    return-void

    .line 362
    :cond_f
    const-string v0, "Invalid control endpoint"

    .line 363
    .line 364
    invoke-static {v0}, Ln0/b;->A(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    return-void

    .line 368
    :cond_10
    const-string v0, "Could not claim control interface"

    .line 369
    .line 370
    invoke-static {v0}, Ln0/b;->A(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    return-void

    .line 374
    :cond_11
    const-string v0, "No control interface"

    .line 375
    .line 376
    invoke-static {v0}, Ln0/b;->A(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    return-void
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

.method private openSingleInterface()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mControlIndex:I

    .line 3
    .line 4
    iget-object v1, p0, Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;->mDevice:Landroid/hardware/usb/UsbDevice;

    .line 5
    .line 6
    invoke-virtual {v1, v0}, Landroid/hardware/usb/UsbDevice;->getInterface(I)Landroid/hardware/usb/UsbInterface;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iput-object v1, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mControlInterface:Landroid/hardware/usb/UsbInterface;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;->mDevice:Landroid/hardware/usb/UsbDevice;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Landroid/hardware/usb/UsbDevice;->getInterface(I)Landroid/hardware/usb/UsbInterface;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iput-object v1, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mDataInterface:Landroid/hardware/usb/UsbInterface;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;->mConnection:Landroid/hardware/usb/UsbDeviceConnection;

    .line 21
    .line 22
    iget-object v2, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mControlInterface:Landroid/hardware/usb/UsbInterface;

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    invoke-virtual {v1, v2, v3}, Landroid/hardware/usb/UsbDeviceConnection;->claimInterface(Landroid/hardware/usb/UsbInterface;Z)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_5

    .line 30
    .line 31
    :goto_0
    iget-object v1, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mControlInterface:Landroid/hardware/usb/UsbInterface;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/hardware/usb/UsbInterface;->getEndpointCount()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-ge v0, v1, :cond_3

    .line 38
    .line 39
    iget-object v1, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mControlInterface:Landroid/hardware/usb/UsbInterface;

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Landroid/hardware/usb/UsbInterface;->getEndpoint(I)Landroid/hardware/usb/UsbEndpoint;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Landroid/hardware/usb/UsbEndpoint;->getDirection()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    const/16 v3, 0x80

    .line 50
    .line 51
    if-ne v2, v3, :cond_0

    .line 52
    .line 53
    invoke-virtual {v1}, Landroid/hardware/usb/UsbEndpoint;->getType()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    const/4 v4, 0x3

    .line 58
    if-ne v2, v4, :cond_0

    .line 59
    .line 60
    iput-object v1, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mControlEndpoint:Landroid/hardware/usb/UsbEndpoint;

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_0
    invoke-virtual {v1}, Landroid/hardware/usb/UsbEndpoint;->getDirection()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    const/4 v4, 0x2

    .line 68
    if-ne v2, v3, :cond_1

    .line 69
    .line 70
    invoke-virtual {v1}, Landroid/hardware/usb/UsbEndpoint;->getType()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-ne v2, v4, :cond_1

    .line 75
    .line 76
    iput-object v1, p0, Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;->mReadEndpoint:Landroid/hardware/usb/UsbEndpoint;

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    invoke-virtual {v1}, Landroid/hardware/usb/UsbEndpoint;->getDirection()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-nez v2, :cond_2

    .line 84
    .line 85
    invoke-virtual {v1}, Landroid/hardware/usb/UsbEndpoint;->getType()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-ne v2, v4, :cond_2

    .line 90
    .line 91
    iput-object v1, p0, Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;->mWriteEndpoint:Landroid/hardware/usb/UsbEndpoint;

    .line 92
    .line 93
    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_3
    iget-object v0, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mControlEndpoint:Landroid/hardware/usb/UsbEndpoint;

    .line 97
    .line 98
    if-eqz v0, :cond_4

    .line 99
    .line 100
    return-void

    .line 101
    :cond_4
    const-string v0, "No control endpoint"

    .line 102
    .line 103
    invoke-static {v0}, Ln0/b;->A(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_5
    const-string v0, "Could not claim shared control/data interface"

    .line 108
    .line 109
    invoke-static {v0}, Ln0/b;->A(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-void
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

.method private sendAcmControlMessage(II[B)I
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;->mConnection:Landroid/hardware/usb/UsbDeviceConnection;

    .line 2
    .line 3
    iget v4, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mControlIndex:I

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    array-length v1, p3

    .line 8
    :goto_0
    move v6, v1

    .line 9
    goto :goto_1

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    goto :goto_0

    .line 12
    :goto_1
    const/16 v7, 0x1388

    .line 13
    .line 14
    const/16 v1, 0x21

    .line 15
    .line 16
    move v2, p1

    .line 17
    move v3, p2

    .line 18
    move-object v5, p3

    .line 19
    invoke-virtual/range {v0 .. v7}, Landroid/hardware/usb/UsbDeviceConnection;->controlTransfer(IIII[BII)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-ltz p1, :cond_1

    .line 24
    .line 25
    return p1

    .line 26
    :cond_1
    const-string p1, "controlTransfer failed"

    .line 27
    .line 28
    invoke-static {p1}, Ln0/b;->A(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    return p1
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

.method private setDtrRts()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mRts:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    iget-boolean v1, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mDtr:Z

    .line 9
    .line 10
    or-int/2addr v0, v1

    .line 11
    const/16 v1, 0x22

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {p0, v1, v0, v2}, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->sendAcmControlMessage(II[B)I

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public closeInt()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;->mConnection:Landroid/hardware/usb/UsbDeviceConnection;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mControlInterface:Landroid/hardware/usb/UsbInterface;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/hardware/usb/UsbDeviceConnection;->releaseInterface(Landroid/hardware/usb/UsbInterface;)Z

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;->mConnection:Landroid/hardware/usb/UsbDeviceConnection;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mDataInterface:Landroid/hardware/usb/UsbInterface;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/hardware/usb/UsbDeviceConnection;->releaseInterface(Landroid/hardware/usb/UsbInterface;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    :catch_0
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getControlLines()Ljava/util/EnumSet;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/EnumSet<",
            "Lcom/hoho/android/usbserial/driver/UsbSerialPort$ControlLine;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lcom/hoho/android/usbserial/driver/UsbSerialPort$ControlLine;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v1, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mRts:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object v1, Lcom/hoho/android/usbserial/driver/UsbSerialPort$ControlLine;->RTS:Lcom/hoho/android/usbserial/driver/UsbSerialPort$ControlLine;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-boolean v1, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mDtr:Z

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    sget-object v1, Lcom/hoho/android/usbserial/driver/UsbSerialPort$ControlLine;->DTR:Lcom/hoho/android/usbserial/driver/UsbSerialPort$ControlLine;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    :cond_1
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

.method public getDTR()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mDtr:Z

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
.end method

.method public getDriver()Lcom/hoho/android/usbserial/driver/UsbSerialDriver;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->this$0:Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;

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

.method public getRTS()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mRts:Z

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
.end method

.method public getSupportedControlLines()Ljava/util/EnumSet;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/EnumSet<",
            "Lcom/hoho/android/usbserial/driver/UsbSerialPort$ControlLine;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/hoho/android/usbserial/driver/UsbSerialPort$ControlLine;->RTS:Lcom/hoho/android/usbserial/driver/UsbSerialPort$ControlLine;

    .line 2
    .line 3
    sget-object v1, Lcom/hoho/android/usbserial/driver/UsbSerialPort$ControlLine;->DTR:Lcom/hoho/android/usbserial/driver/UsbSerialPort$ControlLine;

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
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

.method public openInt()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->this$0:Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;->access$000(Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "interfaces:"

    .line 8
    .line 9
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    :goto_0
    iget-object v1, p0, Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;->mDevice:Landroid/hardware/usb/UsbDevice;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/hardware/usb/UsbDevice;->getInterfaceCount()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-ge v0, v1, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->this$0:Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;

    .line 22
    .line 23
    invoke-static {v1}, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;->access$000(Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v2, p0, Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;->mDevice:Landroid/hardware/usb/UsbDevice;

    .line 28
    .line 29
    invoke-virtual {v2, v0}, Landroid/hardware/usb/UsbDevice;->getInterface(I)Landroid/hardware/usb/UsbInterface;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Landroid/hardware/usb/UsbInterface;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget v0, p0, Lcom/hoho/android/usbserial/driver/CommonUsbSerialPort;->mPortNumber:I

    .line 44
    .line 45
    iget-object v1, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->this$0:Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;

    .line 46
    .line 47
    const/4 v2, -0x1

    .line 48
    if-ne v0, v2, :cond_1

    .line 49
    .line 50
    invoke-static {v1}, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;->access$000(Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v1, "device might be castrated ACM device, trying single interface logic"

    .line 55
    .line 56
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    invoke-direct {p0}, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->openSingleInterface()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    invoke-static {v1}, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;->access$000(Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const-string v1, "trying default interface logic"

    .line 68
    .line 69
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    invoke-direct {p0}, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->openInterface()V

    .line 73
    .line 74
    .line 75
    return-void
    .line 76
.end method

.method public setBreak(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const p1, 0xffff

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    :goto_0
    const/4 v0, 0x0

    .line 9
    const/16 v1, 0x23

    .line 10
    .line 11
    invoke-direct {p0, v1, p1, v0}, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->sendAcmControlMessage(II[B)I

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setDTR(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mDtr:Z

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->setDtrRts()V

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
.end method

.method public setParameters(IIII)V
    .locals 10

    .line 1
    if-lez p1, :cond_9

    .line 2
    .line 3
    const/4 v0, 0x5

    .line 4
    if-lt p2, v0, :cond_8

    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    if-gt p2, v1, :cond_8

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x3

    .line 12
    const/4 v3, 0x2

    .line 13
    const/4 v4, 0x1

    .line 14
    if-eq p3, v4, :cond_2

    .line 15
    .line 16
    if-eq p3, v3, :cond_1

    .line 17
    .line 18
    if-ne p3, v2, :cond_0

    .line 19
    .line 20
    move p3, v4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string p1, "Invalid stop bits: "

    .line 23
    .line 24
    invoke-static {p3, p1}, Lai/onnxruntime/a;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p1}, Lj1/i;->k(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    move p3, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    move p3, v1

    .line 35
    :goto_0
    const/4 v5, 0x4

    .line 36
    if-eqz p4, :cond_7

    .line 37
    .line 38
    if-eq p4, v4, :cond_6

    .line 39
    .line 40
    if-eq p4, v3, :cond_5

    .line 41
    .line 42
    if-eq p4, v2, :cond_4

    .line 43
    .line 44
    if-ne p4, v5, :cond_3

    .line 45
    .line 46
    move p4, v5

    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const-string p1, "Invalid parity: "

    .line 49
    .line 50
    invoke-static {p4, p1}, Lai/onnxruntime/a;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1}, Lj1/i;->k(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_4
    move p4, v2

    .line 59
    goto :goto_1

    .line 60
    :cond_5
    move p4, v3

    .line 61
    goto :goto_1

    .line 62
    :cond_6
    move p4, v4

    .line 63
    goto :goto_1

    .line 64
    :cond_7
    move p4, v1

    .line 65
    :goto_1
    and-int/lit16 v6, p1, 0xff

    .line 66
    .line 67
    int-to-byte v6, v6

    .line 68
    shr-int/lit8 v7, p1, 0x8

    .line 69
    .line 70
    and-int/lit16 v7, v7, 0xff

    .line 71
    .line 72
    int-to-byte v7, v7

    .line 73
    shr-int/lit8 v8, p1, 0x10

    .line 74
    .line 75
    and-int/lit16 v8, v8, 0xff

    .line 76
    .line 77
    int-to-byte v8, v8

    .line 78
    shr-int/lit8 p1, p1, 0x18

    .line 79
    .line 80
    and-int/lit16 p1, p1, 0xff

    .line 81
    .line 82
    int-to-byte p1, p1

    .line 83
    int-to-byte p2, p2

    .line 84
    const/4 v9, 0x7

    .line 85
    new-array v9, v9, [B

    .line 86
    .line 87
    aput-byte v6, v9, v1

    .line 88
    .line 89
    aput-byte v7, v9, v4

    .line 90
    .line 91
    aput-byte v8, v9, v3

    .line 92
    .line 93
    aput-byte p1, v9, v2

    .line 94
    .line 95
    aput-byte p3, v9, v5

    .line 96
    .line 97
    aput-byte p4, v9, v0

    .line 98
    .line 99
    const/4 p1, 0x6

    .line 100
    aput-byte p2, v9, p1

    .line 101
    .line 102
    const/16 p1, 0x20

    .line 103
    .line 104
    invoke-direct {p0, p1, v1, v9}, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->sendAcmControlMessage(II[B)I

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_8
    const-string p1, "Invalid data bits: "

    .line 109
    .line 110
    invoke-static {p2, p1}, Lai/onnxruntime/a;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-static {p1}, Lj1/i;->k(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_9
    const-string p2, "Invalid baud rate: "

    .line 119
    .line 120
    invoke-static {p1, p2}, Lai/onnxruntime/a;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-static {p1}, Lj1/i;->k(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-void
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

.method public setRTS(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->mRts:Z

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/hoho/android/usbserial/driver/CdcAcmSerialDriver$CdcAcmSerialPort;->setDtrRts()V

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
.end method
