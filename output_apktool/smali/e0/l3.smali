.class public final Le0/l3;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# instance fields
.field public a:Landroid/content/Context;

.field public b:Ljava/lang/String;

.field public c:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0xf

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
    return-void

    .line 19
    :array_0
    .array-data 1
        -0x70t
        0x69t
        0x40t
        -0x7et
        -0x3t
        -0x6t
        -0x59t
        -0x70t
        -0x4at
        0x4ct
        0x4at
        -0x6et
        -0x23t
        -0x13t
        -0x46t
    .end array-data

    .line 20
    .line 21
    :array_1
    .array-data 1
        -0x3at
        0x0t
        0x25t
        -0xbt
        -0x46t
        -0x78t
        -0x38t
        -0x1bt
    .end array-data
.end method


# virtual methods
.method public final a(Landroid/app/Notification;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, Le0/l3;->b:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    new-array v2, v1, [B

    .line 5
    .line 6
    fill-array-data v2, :array_0

    .line 7
    .line 8
    .line 9
    const/16 v3, 0x8

    .line 10
    .line 11
    new-array v4, v3, [B

    .line 12
    .line 13
    fill-array-data v4, :array_1

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v4}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object v4, p1, Landroid/app/Notification;->bigContentView:Landroid/widget/RemoteViews;

    .line 21
    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    iget-object v4, p1, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 25
    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    if-nez v4, :cond_1

    .line 28
    .line 29
    move-object v4, p1

    .line 30
    :cond_1
    if-nez v4, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    :try_start_0
    iget-object v5, p0, Le0/l3;->a:Landroid/content/Context;

    .line 34
    .line 35
    invoke-virtual {v5, v0, v1}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    iput-object v5, p0, Le0/l3;->c:Landroid/content/Context;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    :catch_0
    iget-object v5, p0, Le0/l3;->c:Landroid/content/Context;

    .line 42
    .line 43
    const/16 v6, 0xf

    .line 44
    .line 45
    new-array v6, v6, [B

    .line 46
    .line 47
    fill-array-data v6, :array_2

    .line 48
    .line 49
    .line 50
    new-array v7, v3, [B

    .line 51
    .line 52
    fill-array-data v7, :array_3

    .line 53
    .line 54
    .line 55
    invoke-static {v6, v7}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    check-cast v5, Landroid/view/LayoutInflater;

    .line 64
    .line 65
    invoke-virtual {v4}, Landroid/widget/RemoteViews;->getLayoutId()I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    invoke-virtual {v5, v6, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Landroid/view/ViewGroup;

    .line 74
    .line 75
    iget-object v5, p0, Le0/l3;->c:Landroid/content/Context;

    .line 76
    .line 77
    invoke-virtual {v4, v5, p1}, Landroid/widget/RemoteViews;->reapply(Landroid/content/Context;Landroid/view/View;)V

    .line 78
    .line 79
    .line 80
    :goto_0
    if-nez p1, :cond_3

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    iget-object v4, p0, Le0/l3;->c:Landroid/content/Context;

    .line 84
    .line 85
    if-nez v4, :cond_4

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    new-array v1, v1, [B

    .line 93
    .line 94
    fill-array-data v1, :array_4

    .line 95
    .line 96
    .line 97
    new-array v3, v3, [B

    .line 98
    .line 99
    fill-array-data v3, :array_5

    .line 100
    .line 101
    .line 102
    invoke-static {v1, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v4, p2, v1, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    if-nez p2, :cond_5

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_5
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    instance-of p2, p1, Landroid/widget/TextView;

    .line 118
    .line 119
    if-eqz p2, :cond_6

    .line 120
    .line 121
    check-cast p1, Landroid/widget/TextView;

    .line 122
    .line 123
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    return-object p1

    .line 132
    :cond_6
    :goto_1
    return-object v2

    .line 133
    :array_0
    .array-data 1
        0x3et
        -0x5t
    .end array-data

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    nop

    .line 139
    :array_1
    .array-data 1
        0x13t
        -0x2at
        -0x4t
        0x52t
        0x6at
        0x39t
        -0x57t
        0x4bt
    .end array-data

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    :array_2
    .array-data 1
        0x50t
        0x36t
        0x4et
        0x5ft
        -0x65t
        0x6dt
        -0x80t
        -0x35t
        0x52t
        0x31t
        0x5bt
        0x51t
        -0x66t
        0x7ct
        -0x53t
    .end array-data

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
    :array_3
    .array-data 1
        0x3ct
        0x57t
        0x37t
        0x30t
        -0x12t
        0x19t
        -0x21t
        -0x5et
    .end array-data

    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    :array_4
    .array-data 1
        0x59t
        0x68t
    .end array-data

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    nop

    .line 173
    :array_5
    .array-data 1
        0x30t
        0xct
        0x1t
        0x72t
        -0x71t
        -0x4et
        0x2et
        0x43t
    .end array-data
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
.end method
