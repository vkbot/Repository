.class Lorg/apache/commons/net/telnet/Telnet;
.super Lorg/apache/commons/net/SocketClient;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# static fields
.field static final COMMAND_AYT:[B

.field static final COMMAND_DO:[B

.field static final COMMAND_DONT:[B

.field static final COMMAND_IS:[B

.field static final COMMAND_SB:[B

.field static final COMMAND_SE:[B

.field static final COMMAND_WILL:[B

.field static final COMMAND_WONT:[B

.field static final DEFAULT_PORT:I = 0x17

.field static final DO_MASK:I = 0x2

.field static final NUL:C = '\u0000'

.field static final REQUESTED_DO_MASK:I = 0x8

.field static final REQUESTED_WILL_MASK:I = 0x4

.field protected static final TERMINAL_TYPE:I = 0x18

.field protected static final TERMINAL_TYPE_IS:I = 0x0

.field protected static final TERMINAL_TYPE_SEND:I = 0x1

.field static final WILL_MASK:I = 0x1

.field static final debug:Z = false

.field static final debugoptions:Z = false


# instance fields
.field private volatile aytFlag:Z

.field private final aytMonitor:Ljava/lang/Object;

.field private final doResponse:[I

.field private notifhand:Lorg/apache/commons/net/telnet/TelnetNotificationHandler;

.field private final optionHandlers:[Lorg/apache/commons/net/telnet/TelnetOptionHandler;

.field private final options:[I

.field private volatile spyStream:Ljava/io/OutputStream;

.field private terminalType:Ljava/lang/String;

.field private final willResponse:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    fill-array-data v1, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v1, Lorg/apache/commons/net/telnet/Telnet;->COMMAND_DO:[B

    .line 8
    .line 9
    new-array v1, v0, [B

    .line 10
    .line 11
    fill-array-data v1, :array_1

    .line 12
    .line 13
    .line 14
    sput-object v1, Lorg/apache/commons/net/telnet/Telnet;->COMMAND_DONT:[B

    .line 15
    .line 16
    new-array v1, v0, [B

    .line 17
    .line 18
    fill-array-data v1, :array_2

    .line 19
    .line 20
    .line 21
    sput-object v1, Lorg/apache/commons/net/telnet/Telnet;->COMMAND_WILL:[B

    .line 22
    .line 23
    new-array v1, v0, [B

    .line 24
    .line 25
    fill-array-data v1, :array_3

    .line 26
    .line 27
    .line 28
    sput-object v1, Lorg/apache/commons/net/telnet/Telnet;->COMMAND_WONT:[B

    .line 29
    .line 30
    new-array v1, v0, [B

    .line 31
    .line 32
    fill-array-data v1, :array_4

    .line 33
    .line 34
    .line 35
    sput-object v1, Lorg/apache/commons/net/telnet/Telnet;->COMMAND_SB:[B

    .line 36
    .line 37
    new-array v1, v0, [B

    .line 38
    .line 39
    fill-array-data v1, :array_5

    .line 40
    .line 41
    .line 42
    sput-object v1, Lorg/apache/commons/net/telnet/Telnet;->COMMAND_SE:[B

    .line 43
    .line 44
    new-array v1, v0, [B

    .line 45
    .line 46
    fill-array-data v1, :array_6

    .line 47
    .line 48
    .line 49
    sput-object v1, Lorg/apache/commons/net/telnet/Telnet;->COMMAND_IS:[B

    .line 50
    .line 51
    new-array v0, v0, [B

    .line 52
    .line 53
    fill-array-data v0, :array_7

    .line 54
    .line 55
    .line 56
    sput-object v0, Lorg/apache/commons/net/telnet/Telnet;->COMMAND_AYT:[B

    .line 57
    .line 58
    return-void

    .line 59
    :array_0
    .array-data 1
        -0x1t
        -0x3t
    .end array-data

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    nop

    .line 65
    :array_1
    .array-data 1
        -0x1t
        -0x2t
    .end array-data

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    nop

    .line 71
    :array_2
    .array-data 1
        -0x1t
        -0x5t
    .end array-data

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    nop

    .line 77
    :array_3
    .array-data 1
        -0x1t
        -0x4t
    .end array-data

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    nop

    .line 83
    :array_4
    .array-data 1
        -0x1t
        -0x6t
    .end array-data

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    nop

    .line 89
    :array_5
    .array-data 1
        -0x1t
        -0x10t
    .end array-data

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    nop

    .line 95
    :array_6
    .array-data 1
        0x18t
        0x0t
    .end array-data

    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    nop

    .line 101
    :array_7
    .array-data 1
        -0x1t
        -0xat
    .end array-data
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

.method public constructor <init>()V
    .locals 2

    .line 40
    invoke-direct {p0}, Lorg/apache/commons/net/SocketClient;-><init>()V

    .line 41
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->aytMonitor:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 42
    iput-boolean v0, p0, Lorg/apache/commons/net/telnet/Telnet;->aytFlag:Z

    const/16 v0, 0x17

    .line 43
    invoke-virtual {p0, v0}, Lorg/apache/commons/net/SocketClient;->setDefaultPort(I)V

    const/16 v0, 0x100

    .line 44
    new-array v1, v0, [I

    iput-object v1, p0, Lorg/apache/commons/net/telnet/Telnet;->doResponse:[I

    .line 45
    new-array v1, v0, [I

    iput-object v1, p0, Lorg/apache/commons/net/telnet/Telnet;->willResponse:[I

    .line 46
    new-array v1, v0, [I

    iput-object v1, p0, Lorg/apache/commons/net/telnet/Telnet;->options:[I

    .line 47
    new-array v0, v0, [Lorg/apache/commons/net/telnet/TelnetOptionHandler;

    iput-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->optionHandlers:[Lorg/apache/commons/net/telnet/TelnetOptionHandler;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/apache/commons/net/SocketClient;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->aytMonitor:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lorg/apache/commons/net/telnet/Telnet;->aytFlag:Z

    .line 13
    .line 14
    const/16 v0, 0x17

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lorg/apache/commons/net/SocketClient;->setDefaultPort(I)V

    .line 17
    .line 18
    .line 19
    const/16 v0, 0x100

    .line 20
    .line 21
    new-array v1, v0, [I

    .line 22
    .line 23
    iput-object v1, p0, Lorg/apache/commons/net/telnet/Telnet;->doResponse:[I

    .line 24
    .line 25
    new-array v1, v0, [I

    .line 26
    .line 27
    iput-object v1, p0, Lorg/apache/commons/net/telnet/Telnet;->willResponse:[I

    .line 28
    .line 29
    new-array v1, v0, [I

    .line 30
    .line 31
    iput-object v1, p0, Lorg/apache/commons/net/telnet/Telnet;->options:[I

    .line 32
    .line 33
    iput-object p1, p0, Lorg/apache/commons/net/telnet/Telnet;->terminalType:Ljava/lang/String;

    .line 34
    .line 35
    new-array p1, v0, [Lorg/apache/commons/net/telnet/TelnetOptionHandler;

    .line 36
    .line 37
    iput-object p1, p0, Lorg/apache/commons/net/telnet/Telnet;->optionHandlers:[Lorg/apache/commons/net/telnet/TelnetOptionHandler;

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


# virtual methods
.method public _connectAction_()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    const/16 v2, 0x100

    .line 4
    .line 5
    if-ge v1, v2, :cond_1

    .line 6
    .line 7
    iget-object v2, p0, Lorg/apache/commons/net/telnet/Telnet;->doResponse:[I

    .line 8
    .line 9
    aput v0, v2, v1

    .line 10
    .line 11
    iget-object v2, p0, Lorg/apache/commons/net/telnet/Telnet;->willResponse:[I

    .line 12
    .line 13
    aput v0, v2, v1

    .line 14
    .line 15
    iget-object v2, p0, Lorg/apache/commons/net/telnet/Telnet;->options:[I

    .line 16
    .line 17
    aput v0, v2, v1

    .line 18
    .line 19
    iget-object v2, p0, Lorg/apache/commons/net/telnet/Telnet;->optionHandlers:[Lorg/apache/commons/net/telnet/TelnetOptionHandler;

    .line 20
    .line 21
    aget-object v2, v2, v1

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {v2, v0}, Lorg/apache/commons/net/telnet/TelnetOptionHandler;->setDo(Z)V

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, Lorg/apache/commons/net/telnet/Telnet;->optionHandlers:[Lorg/apache/commons/net/telnet/TelnetOptionHandler;

    .line 29
    .line 30
    aget-object v2, v2, v1

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Lorg/apache/commons/net/telnet/TelnetOptionHandler;->setWill(Z)V

    .line 33
    .line 34
    .line 35
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-super {p0}, Lorg/apache/commons/net/SocketClient;->_connectAction_()V

    .line 39
    .line 40
    .line 41
    new-instance v1, Ljava/io/BufferedInputStream;

    .line 42
    .line 43
    iget-object v3, p0, Lorg/apache/commons/net/SocketClient;->_input_:Ljava/io/InputStream;

    .line 44
    .line 45
    invoke-direct {v1, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 46
    .line 47
    .line 48
    iput-object v1, p0, Lorg/apache/commons/net/SocketClient;->_input_:Ljava/io/InputStream;

    .line 49
    .line 50
    new-instance v1, Ljava/io/BufferedOutputStream;

    .line 51
    .line 52
    iget-object v3, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 53
    .line 54
    invoke-direct {v1, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 55
    .line 56
    .line 57
    iput-object v1, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 58
    .line 59
    :goto_1
    if-ge v0, v2, :cond_4

    .line 60
    .line 61
    iget-object v1, p0, Lorg/apache/commons/net/telnet/Telnet;->optionHandlers:[Lorg/apache/commons/net/telnet/TelnetOptionHandler;

    .line 62
    .line 63
    aget-object v1, v1, v0

    .line 64
    .line 65
    if-eqz v1, :cond_3

    .line 66
    .line 67
    invoke-virtual {v1}, Lorg/apache/commons/net/telnet/TelnetOptionHandler;->getInitLocal()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    iget-object v1, p0, Lorg/apache/commons/net/telnet/Telnet;->optionHandlers:[Lorg/apache/commons/net/telnet/TelnetOptionHandler;

    .line 74
    .line 75
    aget-object v1, v1, v0

    .line 76
    .line 77
    invoke-virtual {v1}, Lorg/apache/commons/net/telnet/TelnetOptionHandler;->getOptionCode()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-virtual {p0, v1}, Lorg/apache/commons/net/telnet/Telnet;->requestWill(I)V

    .line 82
    .line 83
    .line 84
    :cond_2
    iget-object v1, p0, Lorg/apache/commons/net/telnet/Telnet;->optionHandlers:[Lorg/apache/commons/net/telnet/TelnetOptionHandler;

    .line 85
    .line 86
    aget-object v1, v1, v0

    .line 87
    .line 88
    invoke-virtual {v1}, Lorg/apache/commons/net/telnet/TelnetOptionHandler;->getInitRemote()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_3

    .line 93
    .line 94
    iget-object v1, p0, Lorg/apache/commons/net/telnet/Telnet;->optionHandlers:[Lorg/apache/commons/net/telnet/TelnetOptionHandler;

    .line 95
    .line 96
    aget-object v1, v1, v0

    .line 97
    .line 98
    invoke-virtual {v1}, Lorg/apache/commons/net/telnet/TelnetOptionHandler;->getOptionCode()I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    invoke-virtual {p0, v1}, Lorg/apache/commons/net/telnet/Telnet;->requestDo(I)V

    .line 103
    .line 104
    .line 105
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_4
    return-void
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

.method public _registerSpyStream(Ljava/io/OutputStream;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/commons/net/telnet/Telnet;->spyStream:Ljava/io/OutputStream;

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

.method public final _sendAYT(Ljava/time/Duration;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->aytMonitor:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_1
    iput-boolean v1, p0, Lorg/apache/commons/net/telnet/Telnet;->aytFlag:Z

    .line 7
    .line 8
    iget-object v2, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 9
    .line 10
    sget-object v3, Lorg/apache/commons/net/telnet/Telnet;->COMMAND_AYT:[B

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write([B)V

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V

    .line 18
    .line 19
    .line 20
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 21
    :try_start_2
    iget-object v2, p0, Lorg/apache/commons/net/telnet/Telnet;->aytMonitor:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/io/path/f;->c(Ljava/time/Duration;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v3

    .line 27
    invoke-virtual {v2, v3, v4}, Ljava/lang/Object;->wait(J)V

    .line 28
    .line 29
    .line 30
    iget-boolean p1, p0, Lorg/apache/commons/net/telnet/Telnet;->aytFlag:Z

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    iput-boolean v2, p0, Lorg/apache/commons/net/telnet/Telnet;->aytFlag:Z

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    move v1, v2

    .line 41
    :goto_0
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    return v1

    .line 43
    :catchall_1
    move-exception p1

    .line 44
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 45
    :try_start_4
    throw p1

    .line 46
    :goto_1
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 47
    throw p1
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

.method public final declared-synchronized _sendCommand(B)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 3
    .line 4
    const/16 v1, 0xff

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p1
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

.method public final declared-synchronized _sendSubnegotiation([I)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 5
    .line 6
    sget-object v1, Lorg/apache/commons/net/telnet/Telnet;->COMMAND_SB:[B

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 9
    .line 10
    .line 11
    array-length v0, p1

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_1

    .line 14
    .line 15
    aget v2, p1, v1

    .line 16
    .line 17
    int-to-byte v2, v2

    .line 18
    const/4 v3, -0x1

    .line 19
    if-ne v2, v3, :cond_0

    .line 20
    .line 21
    iget-object v3, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 22
    .line 23
    invoke-virtual {v3, v2}, Ljava/io/OutputStream;->write(I)V

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_2

    .line 29
    :cond_0
    :goto_1
    iget-object v3, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 30
    .line 31
    invoke-virtual {v3, v2}, Ljava/io/OutputStream;->write(I)V

    .line 32
    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    iget-object p1, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 38
    .line 39
    sget-object v0, Lorg/apache/commons/net/telnet/Telnet;->COMMAND_SE:[B

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 47
    .line 48
    .line 49
    goto :goto_3

    .line 50
    :goto_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    throw p1

    .line 52
    :cond_2
    :goto_3
    monitor-exit p0

    .line 53
    return-void
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

.method public _stopSpyStream()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->spyStream:Ljava/io/OutputStream;

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
.end method

.method public addOptionHandler(Lorg/apache/commons/net/telnet/TelnetOptionHandler;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lorg/apache/commons/net/telnet/TelnetOptionHandler;->getOptionCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lorg/apache/commons/net/telnet/TelnetOption;->isValidOption(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_3

    .line 10
    .line 11
    iget-object v1, p0, Lorg/apache/commons/net/telnet/Telnet;->optionHandlers:[Lorg/apache/commons/net/telnet/TelnetOptionHandler;

    .line 12
    .line 13
    aget-object v2, v1, v0

    .line 14
    .line 15
    if-nez v2, :cond_2

    .line 16
    .line 17
    aput-object p1, v1, v0

    .line 18
    .line 19
    invoke-virtual {p0}, Lorg/apache/commons/net/SocketClient;->isConnected()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Lorg/apache/commons/net/telnet/TelnetOptionHandler;->getInitLocal()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lorg/apache/commons/net/telnet/Telnet;->requestWill(I)V

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p1}, Lorg/apache/commons/net/telnet/TelnetOptionHandler;->getInitRemote()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Lorg/apache/commons/net/telnet/Telnet;->requestDo(I)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void

    .line 44
    :cond_2
    new-instance p1, Lorg/apache/commons/net/telnet/InvalidTelnetOptionException;

    .line 45
    .line 46
    const-string v1, "Already registered option"

    .line 47
    .line 48
    invoke-direct {p1, v1, v0}, Lorg/apache/commons/net/telnet/InvalidTelnetOptionException;-><init>(Ljava/lang/String;I)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_3
    new-instance p1, Lorg/apache/commons/net/telnet/InvalidTelnetOptionException;

    .line 53
    .line 54
    const-string v1, "Invalid Option Code"

    .line 55
    .line 56
    invoke-direct {p1, v1, v0}, Lorg/apache/commons/net/telnet/InvalidTelnetOptionException;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    throw p1
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

.method public deleteOptionHandler(I)V
    .locals 3

    .line 1
    invoke-static {p1}, Lorg/apache/commons/net/telnet/TelnetOption;->isValidOption(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->optionHandlers:[Lorg/apache/commons/net/telnet/TelnetOptionHandler;

    .line 8
    .line 9
    aget-object v1, v0, p1

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    aput-object v2, v0, p1

    .line 15
    .line 16
    invoke-virtual {v1}, Lorg/apache/commons/net/telnet/TelnetOptionHandler;->getWill()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->requestWont(I)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {v1}, Lorg/apache/commons/net/telnet/TelnetOptionHandler;->getDo()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->requestDont(I)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void

    .line 35
    :cond_2
    new-instance v0, Lorg/apache/commons/net/telnet/InvalidTelnetOptionException;

    .line 36
    .line 37
    const-string v1, "Unregistered option"

    .line 38
    .line 39
    invoke-direct {v0, v1, p1}, Lorg/apache/commons/net/telnet/InvalidTelnetOptionException;-><init>(Ljava/lang/String;I)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :cond_3
    new-instance v0, Lorg/apache/commons/net/telnet/InvalidTelnetOptionException;

    .line 44
    .line 45
    const-string v1, "Invalid Option Code"

    .line 46
    .line 47
    invoke-direct {v0, v1, p1}, Lorg/apache/commons/net/telnet/InvalidTelnetOptionException;-><init>(Ljava/lang/String;I)V

    .line 48
    .line 49
    .line 50
    throw v0
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

.method public final declared-synchronized processAYTResponse()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lorg/apache/commons/net/telnet/Telnet;->aytFlag:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->aytMonitor:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    const/4 v1, 0x1

    .line 10
    :try_start_1
    iput-boolean v1, p0, Lorg/apache/commons/net/telnet/Telnet;->aytFlag:Z

    .line 11
    .line 12
    iget-object v1, p0, Lorg/apache/commons/net/telnet/Telnet;->aytMonitor:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 22
    :catchall_1
    move-exception v0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    monitor-exit p0

    .line 25
    return-void

    .line 26
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 27
    throw v0
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

.method public processCommand(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->notifhand:Lorg/apache/commons/net/telnet/TelnetNotificationHandler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x5

    .line 6
    invoke-interface {v0, v1, p1}, Lorg/apache/commons/net/telnet/TelnetNotificationHandler;->receivedNegotiation(II)V

    .line 7
    .line 8
    .line 9
    :cond_0
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
.end method

.method public processDo(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->notifhand:Lorg/apache/commons/net/telnet/TelnetNotificationHandler;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0, v1, p1}, Lorg/apache/commons/net/telnet/TelnetNotificationHandler;->receivedNegotiation(II)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->optionHandlers:[Lorg/apache/commons/net/telnet/TelnetOptionHandler;

    .line 10
    .line 11
    aget-object v0, v0, p1

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Lorg/apache/commons/net/telnet/TelnetOptionHandler;->getAcceptLocal()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/16 v0, 0x18

    .line 21
    .line 22
    if-ne p1, v0, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->terminalType:Ljava/lang/String;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    move v0, v1

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const/4 v0, 0x0

    .line 37
    :goto_0
    iget-object v2, p0, Lorg/apache/commons/net/telnet/Telnet;->willResponse:[I

    .line 38
    .line 39
    aget v3, v2, p1

    .line 40
    .line 41
    if-lez v3, :cond_3

    .line 42
    .line 43
    sub-int/2addr v3, v1

    .line 44
    aput v3, v2, p1

    .line 45
    .line 46
    if-lez v3, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->stateIsWill(I)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_3

    .line 53
    .line 54
    iget-object v2, p0, Lorg/apache/commons/net/telnet/Telnet;->willResponse:[I

    .line 55
    .line 56
    aget v3, v2, p1

    .line 57
    .line 58
    sub-int/2addr v3, v1

    .line 59
    aput v3, v2, p1

    .line 60
    .line 61
    :cond_3
    iget-object v2, p0, Lorg/apache/commons/net/telnet/Telnet;->willResponse:[I

    .line 62
    .line 63
    aget v2, v2, p1

    .line 64
    .line 65
    if-nez v2, :cond_5

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->requestedWont(I)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_5

    .line 72
    .line 73
    if-eqz v0, :cond_4

    .line 74
    .line 75
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->setWantWill(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->sendWill(I)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_4
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->willResponse:[I

    .line 83
    .line 84
    aget v2, v0, p1

    .line 85
    .line 86
    add-int/2addr v2, v1

    .line 87
    aput v2, v0, p1

    .line 88
    .line 89
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->sendWont(I)V

    .line 90
    .line 91
    .line 92
    :cond_5
    :goto_1
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->setWill(I)V

    .line 93
    .line 94
    .line 95
    return-void
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

.method public processDont(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->notifhand:Lorg/apache/commons/net/telnet/TelnetNotificationHandler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-interface {v0, v1, p1}, Lorg/apache/commons/net/telnet/TelnetNotificationHandler;->receivedNegotiation(II)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->willResponse:[I

    .line 10
    .line 11
    aget v1, v0, p1

    .line 12
    .line 13
    if-lez v1, :cond_1

    .line 14
    .line 15
    add-int/lit8 v1, v1, -0x1

    .line 16
    .line 17
    aput v1, v0, p1

    .line 18
    .line 19
    if-lez v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->stateIsWont(I)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->willResponse:[I

    .line 28
    .line 29
    aget v1, v0, p1

    .line 30
    .line 31
    add-int/lit8 v1, v1, -0x1

    .line 32
    .line 33
    aput v1, v0, p1

    .line 34
    .line 35
    :cond_1
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->willResponse:[I

    .line 36
    .line 37
    aget v0, v0, p1

    .line 38
    .line 39
    if-nez v0, :cond_4

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->requestedWill(I)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_4

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->stateIsWill(I)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->requestedWill(I)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    :cond_2
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->sendWont(I)V

    .line 60
    .line 61
    .line 62
    :cond_3
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->setWantWont(I)V

    .line 63
    .line 64
    .line 65
    :cond_4
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->setWont(I)V

    .line 66
    .line 67
    .line 68
    return-void
    .line 69
.end method

.method public processSuboption([II)V
    .locals 2

    .line 1
    if-lez p2, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->optionHandlers:[Lorg/apache/commons/net/telnet/TelnetOptionHandler;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    aget v1, p1, v1

    .line 7
    .line 8
    aget-object v0, v0, v1

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2}, Lorg/apache/commons/net/telnet/TelnetOptionHandler;->answerSubnegotiation([II)[I

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->_sendSubnegotiation([I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const/4 v0, 0x1

    .line 21
    if-le p2, v0, :cond_1

    .line 22
    .line 23
    const/16 p2, 0x18

    .line 24
    .line 25
    if-ne v1, p2, :cond_1

    .line 26
    .line 27
    aget p1, p1, v0

    .line 28
    .line 29
    if-ne p1, v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Lorg/apache/commons/net/telnet/Telnet;->sendTerminalType()V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
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

.method public processWill(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->notifhand:Lorg/apache/commons/net/telnet/TelnetNotificationHandler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    invoke-interface {v0, v1, p1}, Lorg/apache/commons/net/telnet/TelnetNotificationHandler;->receivedNegotiation(II)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->optionHandlers:[Lorg/apache/commons/net/telnet/TelnetOptionHandler;

    .line 10
    .line 11
    aget-object v0, v0, p1

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Lorg/apache/commons/net/telnet/TelnetOptionHandler;->getAcceptRemote()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    :goto_0
    iget-object v1, p0, Lorg/apache/commons/net/telnet/Telnet;->doResponse:[I

    .line 22
    .line 23
    aget v2, v1, p1

    .line 24
    .line 25
    if-lez v2, :cond_2

    .line 26
    .line 27
    add-int/lit8 v2, v2, -0x1

    .line 28
    .line 29
    aput v2, v1, p1

    .line 30
    .line 31
    if-lez v2, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->stateIsDo(I)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    iget-object v1, p0, Lorg/apache/commons/net/telnet/Telnet;->doResponse:[I

    .line 40
    .line 41
    aget v2, v1, p1

    .line 42
    .line 43
    add-int/lit8 v2, v2, -0x1

    .line 44
    .line 45
    aput v2, v1, p1

    .line 46
    .line 47
    :cond_2
    iget-object v1, p0, Lorg/apache/commons/net/telnet/Telnet;->doResponse:[I

    .line 48
    .line 49
    aget v1, v1, p1

    .line 50
    .line 51
    if-nez v1, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->requestedDont(I)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->setWantDo(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->sendDo(I)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->doResponse:[I

    .line 69
    .line 70
    aget v1, v0, p1

    .line 71
    .line 72
    add-int/lit8 v1, v1, 0x1

    .line 73
    .line 74
    aput v1, v0, p1

    .line 75
    .line 76
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->sendDont(I)V

    .line 77
    .line 78
    .line 79
    :cond_4
    :goto_1
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->setDo(I)V

    .line 80
    .line 81
    .line 82
    return-void
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

.method public processWont(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->notifhand:Lorg/apache/commons/net/telnet/TelnetNotificationHandler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x4

    .line 6
    invoke-interface {v0, v1, p1}, Lorg/apache/commons/net/telnet/TelnetNotificationHandler;->receivedNegotiation(II)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->doResponse:[I

    .line 10
    .line 11
    aget v1, v0, p1

    .line 12
    .line 13
    if-lez v1, :cond_1

    .line 14
    .line 15
    add-int/lit8 v1, v1, -0x1

    .line 16
    .line 17
    aput v1, v0, p1

    .line 18
    .line 19
    if-lez v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->stateIsDont(I)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->doResponse:[I

    .line 28
    .line 29
    aget v1, v0, p1

    .line 30
    .line 31
    add-int/lit8 v1, v1, -0x1

    .line 32
    .line 33
    aput v1, v0, p1

    .line 34
    .line 35
    :cond_1
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->doResponse:[I

    .line 36
    .line 37
    aget v0, v0, p1

    .line 38
    .line 39
    if-nez v0, :cond_4

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->requestedDo(I)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_4

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->stateIsDo(I)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->requestedDo(I)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    :cond_2
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->sendDont(I)V

    .line 60
    .line 61
    .line 62
    :cond_3
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->setWantDont(I)V

    .line 63
    .line 64
    .line 65
    :cond_4
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->setDont(I)V

    .line 66
    .line 67
    .line 68
    return-void
    .line 69
.end method

.method public registerNotifHandler(Lorg/apache/commons/net/telnet/TelnetNotificationHandler;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/commons/net/telnet/Telnet;->notifhand:Lorg/apache/commons/net/telnet/TelnetNotificationHandler;

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

.method public final declared-synchronized requestDo(I)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->doResponse:[I

    .line 3
    .line 4
    aget v0, v0, p1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->stateIsDo(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    :goto_0
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->requestedDo(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    :cond_1
    monitor-exit p0

    .line 24
    return-void

    .line 25
    :cond_2
    :try_start_1
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->setWantDo(I)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->doResponse:[I

    .line 29
    .line 30
    aget v1, v0, p1

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    aput v1, v0, p1

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->sendDo(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    .line 38
    .line 39
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    throw p1
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

.method public final declared-synchronized requestDont(I)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->doResponse:[I

    .line 3
    .line 4
    aget v0, v0, p1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->stateIsDont(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    :goto_0
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->requestedDont(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    :cond_1
    monitor-exit p0

    .line 24
    return-void

    .line 25
    :cond_2
    :try_start_1
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->setWantDont(I)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->doResponse:[I

    .line 29
    .line 30
    aget v1, v0, p1

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    aput v1, v0, p1

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->sendDont(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    .line 38
    .line 39
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    throw p1
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

.method public final declared-synchronized requestWill(I)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->willResponse:[I

    .line 3
    .line 4
    aget v0, v0, p1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->stateIsWill(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    :goto_0
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->requestedWill(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    :cond_1
    monitor-exit p0

    .line 24
    return-void

    .line 25
    :cond_2
    :try_start_1
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->setWantWill(I)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->doResponse:[I

    .line 29
    .line 30
    aget v1, v0, p1

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    aput v1, v0, p1

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->sendWill(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    .line 38
    .line 39
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    throw p1
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

.method public final declared-synchronized requestWont(I)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->willResponse:[I

    .line 3
    .line 4
    aget v0, v0, p1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->stateIsWont(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    :goto_0
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->requestedWont(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    :cond_1
    monitor-exit p0

    .line 24
    return-void

    .line 25
    :cond_2
    :try_start_1
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->setWantWont(I)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->doResponse:[I

    .line 29
    .line 30
    aget v1, v0, p1

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    aput v1, v0, p1

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->sendWont(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    .line 38
    .line 39
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    throw p1
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

.method public requestedDo(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->options:[I

    .line 2
    .line 3
    aget p1, v0, p1

    .line 4
    .line 5
    and-int/lit8 p1, p1, 0x8

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
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

.method public requestedDont(I)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->requestedDo(I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    xor-int/lit8 p1, p1, 0x1

    .line 6
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
.end method

.method public requestedWill(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->options:[I

    .line 2
    .line 3
    aget p1, v0, p1

    .line 4
    .line 5
    and-int/lit8 p1, p1, 0x4

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
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

.method public requestedWont(I)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->requestedWill(I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    xor-int/lit8 p1, p1, 0x1

    .line 6
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
.end method

.method public final declared-synchronized sendByte(I)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->spyWrite(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw p1
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

.method public final declared-synchronized sendDo(I)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 3
    .line 4
    sget-object v1, Lorg/apache/commons/net/telnet/Telnet;->COMMAND_DO:[B

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p1
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

.method public final declared-synchronized sendDont(I)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 3
    .line 4
    sget-object v1, Lorg/apache/commons/net/telnet/Telnet;->COMMAND_DONT:[B

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p1
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

.method public final declared-synchronized sendTerminalType()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->terminalType:Ljava/lang/String;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 7
    .line 8
    sget-object v1, Lorg/apache/commons/net/telnet/Telnet;->COMMAND_SB:[B

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 14
    .line 15
    sget-object v1, Lorg/apache/commons/net/telnet/Telnet;->COMMAND_IS:[B

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 21
    .line 22
    iget-object v1, p0, Lorg/apache/commons/net/telnet/Telnet;->terminalType:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p0}, Lorg/apache/commons/net/SocketClient;->getCharset()Ljava/nio/charset/Charset;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 36
    .line 37
    sget-object v1, Lorg/apache/commons/net/telnet/Telnet;->COMMAND_SE:[B

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    :goto_0
    monitor-exit p0

    .line 51
    return-void

    .line 52
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    throw v0
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public final declared-synchronized sendWill(I)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 3
    .line 4
    sget-object v1, Lorg/apache/commons/net/telnet/Telnet;->COMMAND_WILL:[B

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p1
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

.method public final declared-synchronized sendWont(I)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 3
    .line 4
    sget-object v1, Lorg/apache/commons/net/telnet/Telnet;->COMMAND_WONT:[B

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lorg/apache/commons/net/SocketClient;->_output_:Ljava/io/OutputStream;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p1
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

.method public setDo(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->options:[I

    .line 2
    .line 3
    aget v1, v0, p1

    .line 4
    .line 5
    or-int/lit8 v1, v1, 0x2

    .line 6
    .line 7
    aput v1, v0, p1

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->requestedDo(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->optionHandlers:[Lorg/apache/commons/net/telnet/TelnetOptionHandler;

    .line 16
    .line 17
    aget-object v0, v0, p1

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, v1}, Lorg/apache/commons/net/telnet/TelnetOptionHandler;->setDo(Z)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->optionHandlers:[Lorg/apache/commons/net/telnet/TelnetOptionHandler;

    .line 26
    .line 27
    aget-object p1, v0, p1

    .line 28
    .line 29
    invoke-virtual {p1}, Lorg/apache/commons/net/telnet/TelnetOptionHandler;->startSubnegotiationRemote()[I

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->_sendSubnegotiation([I)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void
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

.method public setDont(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->options:[I

    .line 2
    .line 3
    aget v1, v0, p1

    .line 4
    .line 5
    and-int/lit8 v1, v1, -0x3

    .line 6
    .line 7
    aput v1, v0, p1

    .line 8
    .line 9
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->optionHandlers:[Lorg/apache/commons/net/telnet/TelnetOptionHandler;

    .line 10
    .line 11
    aget-object p1, v0, p1

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p1, v0}, Lorg/apache/commons/net/telnet/TelnetOptionHandler;->setDo(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
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

.method public setWantDo(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->options:[I

    .line 2
    .line 3
    aget v1, v0, p1

    .line 4
    .line 5
    or-int/lit8 v1, v1, 0x8

    .line 6
    .line 7
    aput v1, v0, p1

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
.end method

.method public setWantDont(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->options:[I

    .line 2
    .line 3
    aget v1, v0, p1

    .line 4
    .line 5
    and-int/lit8 v1, v1, -0x9

    .line 6
    .line 7
    aput v1, v0, p1

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
.end method

.method public setWantWill(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->options:[I

    .line 2
    .line 3
    aget v1, v0, p1

    .line 4
    .line 5
    or-int/lit8 v1, v1, 0x4

    .line 6
    .line 7
    aput v1, v0, p1

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
.end method

.method public setWantWont(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->options:[I

    .line 2
    .line 3
    aget v1, v0, p1

    .line 4
    .line 5
    and-int/lit8 v1, v1, -0x5

    .line 6
    .line 7
    aput v1, v0, p1

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
.end method

.method public setWill(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->options:[I

    .line 2
    .line 3
    aget v1, v0, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    or-int/2addr v1, v2

    .line 7
    aput v1, v0, p1

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->requestedWill(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->optionHandlers:[Lorg/apache/commons/net/telnet/TelnetOptionHandler;

    .line 16
    .line 17
    aget-object v0, v0, p1

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Lorg/apache/commons/net/telnet/TelnetOptionHandler;->setWill(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->optionHandlers:[Lorg/apache/commons/net/telnet/TelnetOptionHandler;

    .line 25
    .line 26
    aget-object p1, v0, p1

    .line 27
    .line 28
    invoke-virtual {p1}, Lorg/apache/commons/net/telnet/TelnetOptionHandler;->startSubnegotiationLocal()[I

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->_sendSubnegotiation([I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
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

.method public setWont(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->options:[I

    .line 2
    .line 3
    aget v1, v0, p1

    .line 4
    .line 5
    and-int/lit8 v1, v1, -0x2

    .line 6
    .line 7
    aput v1, v0, p1

    .line 8
    .line 9
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->optionHandlers:[Lorg/apache/commons/net/telnet/TelnetOptionHandler;

    .line 10
    .line 11
    aget-object p1, v0, p1

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p1, v0}, Lorg/apache/commons/net/telnet/TelnetOptionHandler;->setWill(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
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

.method public spyRead(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->spyStream:Ljava/io/OutputStream;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/16 v1, 0xd

    .line 6
    .line 7
    if-eq p1, v1, :cond_1

    .line 8
    .line 9
    const/16 v2, 0xa

    .line 10
    .line 11
    if-ne p1, v2, :cond_0

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catch_0
    const/4 p1, 0x0

    .line 24
    iput-object p1, p0, Lorg/apache/commons/net/telnet/Telnet;->spyStream:Ljava/io/OutputStream;

    .line 25
    .line 26
    :cond_1
    return-void
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

.method public spyWrite(I)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lorg/apache/commons/net/telnet/Telnet;->stateIsDo(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lorg/apache/commons/net/telnet/Telnet;->requestedDo(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->spyStream:Ljava/io/OutputStream;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catch_0
    const/4 p1, 0x0

    .line 26
    iput-object p1, p0, Lorg/apache/commons/net/telnet/Telnet;->spyStream:Ljava/io/OutputStream;

    .line 27
    .line 28
    :cond_1
    return-void
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

.method public stateIsDo(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->options:[I

    .line 2
    .line 3
    aget p1, v0, p1

    .line 4
    .line 5
    and-int/lit8 p1, p1, 0x2

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
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

.method public stateIsDont(I)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->stateIsDo(I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    xor-int/lit8 p1, p1, 0x1

    .line 6
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
.end method

.method public stateIsWill(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->options:[I

    .line 2
    .line 3
    aget p1, v0, p1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    and-int/2addr p1, v0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return p1
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

.method public stateIsWont(I)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/apache/commons/net/telnet/Telnet;->stateIsWill(I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    xor-int/lit8 p1, p1, 0x1

    .line 6
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
.end method

.method public unregisterNotifHandler()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lorg/apache/commons/net/telnet/Telnet;->notifhand:Lorg/apache/commons/net/telnet/TelnetNotificationHandler;

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
.end method
