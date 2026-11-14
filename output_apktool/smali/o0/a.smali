.class public Lo0/a;
.super Ll0/b;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# instance fields
.field public b:Lo0/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ll0/b;-><init>()V

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
.end method


# virtual methods
.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    instance-of v1, v1, Lcom/example/navistart/ModernMainActivity;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const v1, 0x7f0c00b4

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const v1, 0x7f0c0020

    .line 16
    .line 17
    .line 18
    :goto_0
    const/4 v2, 0x0

    .line 19
    move-object/from16 v3, p1

    .line 20
    .line 21
    move-object/from16 v4, p2

    .line 22
    .line 23
    invoke-virtual {v3, v1, v4, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    new-instance v3, Lo0/e;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-direct {v3, v4}, Lo0/e;-><init>(Landroid/content/Context;)V

    .line 34
    .line 35
    .line 36
    iput-object v3, v0, Lo0/a;->b:Lo0/e;

    .line 37
    .line 38
    const v3, 0x7f0905f8

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Landroid/widget/LinearLayout;

    .line 46
    .line 47
    invoke-static {}, Lo0/f;->values()[Lo0/f;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    array-length v5, v4

    .line 52
    move v6, v2

    .line 53
    :goto_1
    if-ge v6, v5, :cond_f

    .line 54
    .line 55
    aget-object v7, v4, v6

    .line 56
    .line 57
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    instance-of v8, v8, Lcom/example/navistart/ModernMainActivity;

    .line 62
    .line 63
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    invoke-static {v9}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    if-eqz v8, :cond_1

    .line 72
    .line 73
    const v8, 0x7f0c00b5

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_1
    const v8, 0x7f0c0085

    .line 78
    .line 79
    .line 80
    :goto_2
    invoke-virtual {v9, v8, v3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    const v9, 0x7f0905f9

    .line 85
    .line 86
    .line 87
    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    check-cast v9, Landroid/widget/Spinner;

    .line 92
    .line 93
    const v10, 0x7f0905f7

    .line 94
    .line 95
    .line 96
    invoke-virtual {v8, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    check-cast v10, Landroid/widget/CheckBox;

    .line 101
    .line 102
    const v11, 0x7f090257

    .line 103
    .line 104
    .line 105
    invoke-virtual {v8, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v11

    .line 109
    check-cast v11, Landroid/widget/ImageView;

    .line 110
    .line 111
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 112
    .line 113
    .line 114
    move-result v12

    .line 115
    const/4 v13, 0x3

    .line 116
    const/4 v15, 0x4

    .line 117
    const/4 v2, 0x2

    .line 118
    const/4 v14, 0x1

    .line 119
    if-eqz v12, :cond_7

    .line 120
    .line 121
    if-eq v12, v14, :cond_6

    .line 122
    .line 123
    if-eq v12, v2, :cond_5

    .line 124
    .line 125
    if-eq v12, v13, :cond_4

    .line 126
    .line 127
    if-eq v12, v15, :cond_3

    .line 128
    .line 129
    const/4 v15, 0x5

    .line 130
    if-ne v12, v15, :cond_2

    .line 131
    .line 132
    const v12, 0x7f070118

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_2
    new-instance v1, Ljava/lang/IncompatibleClassChangeError;

    .line 137
    .line 138
    invoke-direct {v1}, Ljava/lang/IncompatibleClassChangeError;-><init>()V

    .line 139
    .line 140
    .line 141
    throw v1

    .line 142
    :cond_3
    const v12, 0x7f070117

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_4
    const v12, 0x7f07011b

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_5
    const v12, 0x7f07011c

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_6
    const v12, 0x7f070119

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_7
    const v12, 0x7f07011a

    .line 159
    .line 160
    .line 161
    :goto_3
    invoke-virtual {v11, v12}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 162
    .line 163
    .line 164
    const v11, 0x7f090564

    .line 165
    .line 166
    .line 167
    invoke-virtual {v8, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 168
    .line 169
    .line 170
    move-result-object v11

    .line 171
    check-cast v11, Landroid/widget/TextView;

    .line 172
    .line 173
    if-eqz v11, :cond_e

    .line 174
    .line 175
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 176
    .line 177
    .line 178
    move-result v12

    .line 179
    if-eqz v12, :cond_d

    .line 180
    .line 181
    if-eq v12, v14, :cond_c

    .line 182
    .line 183
    if-eq v12, v2, :cond_b

    .line 184
    .line 185
    if-eq v12, v13, :cond_a

    .line 186
    .line 187
    const/4 v2, 0x4

    .line 188
    if-eq v12, v2, :cond_9

    .line 189
    .line 190
    const/4 v15, 0x5

    .line 191
    if-ne v12, v15, :cond_8

    .line 192
    .line 193
    const v2, 0x7f13018e

    .line 194
    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_8
    new-instance v1, Ljava/lang/IncompatibleClassChangeError;

    .line 198
    .line 199
    invoke-direct {v1}, Ljava/lang/IncompatibleClassChangeError;-><init>()V

    .line 200
    .line 201
    .line 202
    throw v1

    .line 203
    :cond_9
    const v2, 0x7f13018d

    .line 204
    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_a
    const v2, 0x7f130191

    .line 208
    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_b
    const v2, 0x7f130192

    .line 212
    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_c
    const v2, 0x7f13018f

    .line 216
    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_d
    const v2, 0x7f130190

    .line 220
    .line 221
    .line 222
    :goto_4
    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setText(I)V

    .line 223
    .line 224
    .line 225
    :cond_e
    iget-object v2, v0, Lo0/a;->b:Lo0/e;

    .line 226
    .line 227
    invoke-virtual {v2, v7}, Lo0/e;->a(Lo0/f;)Z

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    invoke-virtual {v10, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 232
    .line 233
    .line 234
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 235
    .line 236
    .line 237
    invoke-static {}, Lh0/b;->f()Lj0/c;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    new-instance v11, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 244
    .line 245
    .line 246
    const/16 v12, 0x12

    .line 247
    .line 248
    new-array v12, v12, [B

    .line 249
    .line 250
    fill-array-data v12, :array_0

    .line 251
    .line 252
    .line 253
    const/16 v14, 0x8

    .line 254
    .line 255
    new-array v14, v14, [B

    .line 256
    .line 257
    fill-array-data v14, :array_1

    .line 258
    .line 259
    .line 260
    invoke-static {v12, v14}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v12

    .line 264
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v12

    .line 271
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v11

    .line 278
    invoke-virtual {v2, v9, v11}, Lj0/c;->m(Landroid/widget/Spinner;Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    new-instance v2, Le0/c3;

    .line 282
    .line 283
    invoke-direct {v2, v13, v0, v7}, Le0/c3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v10, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v3, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 290
    .line 291
    .line 292
    add-int/lit8 v6, v6, 0x1

    .line 293
    .line 294
    const/4 v2, 0x0

    .line 295
    goto/16 :goto_1

    .line 296
    .line 297
    :cond_f
    return-object v1

    .line 298
    nop

    .line 299
    :array_0
    .array-data 1
        0x3et
        -0x7t
        0x6ct
        -0x75t
        -0x7t
        0x21t
        -0x1dt
        -0xft
        0x16t
        -0xet
        0x7at
        -0x4et
        -0x13t
        0x3dt
        -0x19t
        -0x34t
        0x1ct
        -0x12t
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
    nop

    .line 313
    :array_1
    .array-data 1
        0x79t
        -0x64t
        0x1ft
        -0x1t
        -0x74t
        0x53t
        -0x7at
        -0x55t
    .end array-data
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
