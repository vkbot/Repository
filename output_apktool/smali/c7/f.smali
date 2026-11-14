.class public final Lc7/f;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lc7/g;


# direct methods
.method public synthetic constructor <init>(Lc7/g;I)V
    .locals 0

    .line 1
    iput p2, p0, Lc7/f;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Lc7/f;->c:Lc7/g;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, Lc7/f;->b:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    const v4, 0x7f0905fe

    .line 7
    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    :try_start_0
    const-string v0, "g"

    .line 14
    .line 15
    const-string v1, "Closing camera"

    .line 16
    .line 17
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lc7/f;->c:Lc7/g;

    .line 21
    .line 22
    iget-object v0, v0, Lc7/g;->c:Lc7/i;

    .line 23
    .line 24
    iget-object v1, v0, Lc7/i;->c:Lc7/b;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v1}, Lc7/b;->c()V

    .line 29
    .line 30
    .line 31
    iput-object v5, v0, Lc7/i;->c:Lc7/b;

    .line 32
    .line 33
    :cond_0
    iget-object v1, v0, Lc7/i;->d:Ld6/a;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iput-object v5, v0, Lc7/i;->d:Ld6/a;

    .line 38
    .line 39
    :cond_1
    iget-object v1, v0, Lc7/i;->a:Landroid/hardware/Camera;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    iget-boolean v4, v0, Lc7/i;->e:Z

    .line 44
    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    invoke-virtual {v1}, Landroid/hardware/Camera;->stopPreview()V

    .line 48
    .line 49
    .line 50
    iget-object v1, v0, Lc7/i;->l:Lc7/h;

    .line 51
    .line 52
    iput-object v5, v1, Lc7/h;->a:Lr5/c;

    .line 53
    .line 54
    iput-boolean v2, v0, Lc7/i;->e:Z

    .line 55
    .line 56
    :cond_2
    iget-object v0, p0, Lc7/f;->c:Lc7/g;

    .line 57
    .line 58
    iget-object v0, v0, Lc7/g;->c:Lc7/i;

    .line 59
    .line 60
    iget-object v1, v0, Lc7/i;->a:Landroid/hardware/Camera;

    .line 61
    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    invoke-virtual {v1}, Landroid/hardware/Camera;->release()V

    .line 65
    .line 66
    .line 67
    iput-object v5, v0, Lc7/i;->a:Landroid/hardware/Camera;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catch_0
    move-exception v0

    .line 71
    const-string v1, "g"

    .line 72
    .line 73
    const-string v2, "Failed to close camera"

    .line 74
    .line 75
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 76
    .line 77
    .line 78
    :cond_3
    :goto_0
    iget-object v0, p0, Lc7/f;->c:Lc7/g;

    .line 79
    .line 80
    iput-boolean v3, v0, Lc7/g;->g:Z

    .line 81
    .line 82
    iget-object v0, v0, Lc7/g;->d:Landroid/os/Handler;

    .line 83
    .line 84
    const v1, 0x7f0905fd

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lc7/f;->c:Lc7/g;

    .line 91
    .line 92
    iget-object v0, v0, Lc7/g;->a:Lb7/p;

    .line 93
    .line 94
    iget-object v1, v0, Lb7/p;->e:Ljava/lang/Object;

    .line 95
    .line 96
    monitor-enter v1

    .line 97
    :try_start_1
    iget v2, v0, Lb7/p;->b:I

    .line 98
    .line 99
    sub-int/2addr v2, v3

    .line 100
    iput v2, v0, Lb7/p;->b:I

    .line 101
    .line 102
    if-nez v2, :cond_4

    .line 103
    .line 104
    iget-object v2, v0, Lb7/p;->e:Ljava/lang/Object;

    .line 105
    .line 106
    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 107
    :try_start_2
    iget-object v3, v0, Lb7/p;->d:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v3, Landroid/os/HandlerThread;

    .line 110
    .line 111
    invoke-virtual {v3}, Landroid/os/HandlerThread;->quit()Z

    .line 112
    .line 113
    .line 114
    iput-object v5, v0, Lb7/p;->d:Ljava/lang/Object;

    .line 115
    .line 116
    iput-object v5, v0, Lb7/p;->c:Ljava/lang/Object;

    .line 117
    .line 118
    monitor-exit v2

    .line 119
    goto :goto_1

    .line 120
    :catchall_0
    move-exception v0

    .line 121
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 122
    :try_start_3
    throw v0

    .line 123
    :cond_4
    :goto_1
    monitor-exit v1

    .line 124
    return-void

    .line 125
    :catchall_1
    move-exception v0

    .line 126
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 127
    throw v0

    .line 128
    :pswitch_0
    const-string v0, "g"

    .line 129
    .line 130
    iget-object v1, p0, Lc7/f;->c:Lc7/g;

    .line 131
    .line 132
    iget-object v2, v1, Lc7/g;->c:Lc7/i;

    .line 133
    .line 134
    :try_start_4
    const-string v3, "Starting preview"

    .line 135
    .line 136
    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    iget-object v3, v1, Lc7/g;->b:Landroid/support/v4/media/h;

    .line 140
    .line 141
    iget-object v5, v2, Lc7/i;->a:Landroid/hardware/Camera;

    .line 142
    .line 143
    iget-object v6, v3, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v6, Landroid/view/SurfaceHolder;

    .line 146
    .line 147
    if-eqz v6, :cond_5

    .line 148
    .line 149
    invoke-virtual {v5, v6}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V

    .line 150
    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_5
    iget-object v3, v3, Landroid/support/v4/media/h;->d:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v3, Landroid/graphics/SurfaceTexture;

    .line 156
    .line 157
    invoke-virtual {v5, v3}, Landroid/hardware/Camera;->setPreviewTexture(Landroid/graphics/SurfaceTexture;)V

    .line 158
    .line 159
    .line 160
    :goto_2
    invoke-virtual {v2}, Lc7/i;->e()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :catch_1
    move-exception v2

    .line 165
    iget-object v1, v1, Lc7/g;->d:Landroid/os/Handler;

    .line 166
    .line 167
    if-eqz v1, :cond_6

    .line 168
    .line 169
    invoke-virtual {v1, v4, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 174
    .line 175
    .line 176
    :cond_6
    const-string v1, "Failed to start preview"

    .line 177
    .line 178
    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 179
    .line 180
    .line 181
    :goto_3
    return-void

    .line 182
    :pswitch_1
    const-string v0, "g"

    .line 183
    .line 184
    iget-object v6, p0, Lc7/f;->c:Lc7/g;

    .line 185
    .line 186
    iget-object v7, v6, Lc7/g;->c:Lc7/i;

    .line 187
    .line 188
    :try_start_5
    const-string v8, "Configuring camera"

    .line 189
    .line 190
    invoke-static {v0, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 191
    .line 192
    .line 193
    invoke-virtual {v7}, Lc7/i;->b()V

    .line 194
    .line 195
    .line 196
    iget-object v8, v6, Lc7/g;->d:Landroid/os/Handler;

    .line 197
    .line 198
    if-eqz v8, :cond_c

    .line 199
    .line 200
    iget-object v9, v7, Lc7/i;->j:Lb7/u;

    .line 201
    .line 202
    if-nez v9, :cond_7

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_7
    iget v5, v7, Lc7/i;->k:I

    .line 206
    .line 207
    if-eq v5, v1, :cond_a

    .line 208
    .line 209
    rem-int/lit16 v5, v5, 0xb4

    .line 210
    .line 211
    if-eqz v5, :cond_8

    .line 212
    .line 213
    move v2, v3

    .line 214
    :cond_8
    if-eqz v2, :cond_9

    .line 215
    .line 216
    new-instance v5, Lb7/u;

    .line 217
    .line 218
    iget v1, v9, Lb7/u;->c:I

    .line 219
    .line 220
    iget v2, v9, Lb7/u;->b:I

    .line 221
    .line 222
    invoke-direct {v5, v1, v2}, Lb7/u;-><init>(II)V

    .line 223
    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_9
    move-object v5, v9

    .line 227
    :goto_4
    const v1, 0x7f090604

    .line 228
    .line 229
    .line 230
    invoke-virtual {v8, v1, v5}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 235
    .line 236
    .line 237
    goto :goto_6

    .line 238
    :catch_2
    move-exception v1

    .line 239
    goto :goto_5

    .line 240
    :cond_a
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 241
    .line 242
    const-string v2, "Rotation not calculated yet. Call configure() first."

    .line 243
    .line 244
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    throw v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 248
    :goto_5
    iget-object v2, v6, Lc7/g;->d:Landroid/os/Handler;

    .line 249
    .line 250
    if-eqz v2, :cond_b

    .line 251
    .line 252
    invoke-virtual {v2, v4, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V

    .line 257
    .line 258
    .line 259
    :cond_b
    const-string v2, "Failed to configure camera"

    .line 260
    .line 261
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 262
    .line 263
    .line 264
    :cond_c
    :goto_6
    return-void

    .line 265
    :pswitch_2
    iget-object v0, p0, Lc7/f;->c:Lc7/g;

    .line 266
    .line 267
    const-string v2, "g"

    .line 268
    .line 269
    :try_start_6
    const-string v3, "Opening camera"

    .line 270
    .line 271
    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 272
    .line 273
    .line 274
    iget-object v3, v0, Lc7/g;->c:Lc7/i;

    .line 275
    .line 276
    iget-object v6, v3, Lc7/i;->g:Lc7/j;

    .line 277
    .line 278
    iget v6, v6, Lc7/j;->a:I

    .line 279
    .line 280
    invoke-static {v6}, Lb1/u;->h(I)I

    .line 281
    .line 282
    .line 283
    move-result v6

    .line 284
    if-ne v6, v1, :cond_d

    .line 285
    .line 286
    goto :goto_7

    .line 287
    :cond_d
    invoke-static {v6}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    :goto_7
    iput-object v5, v3, Lc7/i;->a:Landroid/hardware/Camera;

    .line 292
    .line 293
    if-eqz v5, :cond_e

    .line 294
    .line 295
    iget-object v1, v3, Lc7/i;->g:Lc7/j;

    .line 296
    .line 297
    iget v1, v1, Lc7/j;->a:I

    .line 298
    .line 299
    invoke-static {v1}, Lb1/u;->h(I)I

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    new-instance v5, Landroid/hardware/Camera$CameraInfo;

    .line 304
    .line 305
    invoke-direct {v5}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 306
    .line 307
    .line 308
    iput-object v5, v3, Lc7/i;->b:Landroid/hardware/Camera$CameraInfo;

    .line 309
    .line 310
    invoke-static {v1, v5}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 311
    .line 312
    .line 313
    goto :goto_8

    .line 314
    :cond_e
    const-string v1, "Failed to open camera"

    .line 315
    .line 316
    invoke-static {v1}, Lai/onnxruntime/b;->h(Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    .line 317
    .line 318
    .line 319
    goto :goto_8

    .line 320
    :catch_3
    move-exception v1

    .line 321
    iget-object v0, v0, Lc7/g;->d:Landroid/os/Handler;

    .line 322
    .line 323
    if-eqz v0, :cond_f

    .line 324
    .line 325
    invoke-virtual {v0, v4, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 330
    .line 331
    .line 332
    :cond_f
    const-string v0, "Failed to open camera"

    .line 333
    .line 334
    invoke-static {v2, v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 335
    .line 336
    .line 337
    :goto_8
    return-void

    .line 338
    nop

    .line 339
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
