.class public final synthetic Le0/h3;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lcom/example/navistart/VibVodActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/example/navistart/VibVodActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Le0/h3;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Le0/h3;->c:Lcom/example/navistart/VibVodActivity;

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
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .line 1
    iget p1, p0, Le0/h3;->b:I

    .line 2
    .line 3
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 4
    .line 5
    const-wide/16 v1, 0x12c

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, p0, Le0/h3;->c:Lcom/example/navistart/VibVodActivity;

    .line 10
    .line 11
    packed-switch p1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object p1, v5, Lcom/example/navistart/VibVodActivity;->f:Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-static {v5}, Le0/d0;->d(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/example/navistart/MainActivity;->w()Z

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    if-eqz v6, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-nez v6, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    throw v3

    .line 33
    :cond_1
    :goto_0
    invoke-static {v5}, Lcom/example/navistart/MainActivity;->v(Landroid/content/Context;)Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-eqz v6, :cond_3

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-nez p1, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    throw v3

    .line 47
    :cond_3
    :goto_1
    const/4 p1, 0x3

    .line 48
    invoke-virtual {v5, p1}, Lcom/example/navistart/VibVodActivity;->s(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5}, Lcom/example/navistart/VibVodActivity;->t()Ljava/lang/Boolean;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_4

    .line 60
    .line 61
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lh0/b;->d()Lcom/example/navistart/cores/CarCmdProxy;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-interface {v3, p1}, Lcom/example/navistart/cores/CarCmdProxy;->carsetvod(I)V

    .line 69
    .line 70
    .line 71
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v3}, Lh0/b;->e()Le0/p;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    iput p1, v3, Le0/p;->e:I

    .line 80
    .line 81
    :cond_4
    iget-object p1, v5, Lcom/example/navistart/VibVodActivity;->b:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 82
    .line 83
    new-instance v3, Le0/g3;

    .line 84
    .line 85
    invoke-direct {v3, v5, v4}, Le0/g3;-><init>(Lcom/example/navistart/VibVodActivity;I)V

    .line 86
    .line 87
    .line 88
    invoke-interface {p1, v3, v1, v2, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_0
    iget-object p1, v5, Lcom/example/navistart/VibVodActivity;->f:Ljava/lang/Boolean;

    .line 93
    .line 94
    invoke-static {v5}, Le0/d0;->d(Landroid/content/Context;)V

    .line 95
    .line 96
    .line 97
    invoke-static {}, Lcom/example/navistart/MainActivity;->w()Z

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    if-eqz v6, :cond_6

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-nez v6, :cond_5

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_5
    throw v3

    .line 111
    :cond_6
    :goto_2
    invoke-static {v5}, Lcom/example/navistart/MainActivity;->v(Landroid/content/Context;)Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-eqz v6, :cond_8

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-nez p1, :cond_7

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_7
    throw v3

    .line 125
    :cond_8
    :goto_3
    const/4 p1, 0x2

    .line 126
    invoke-virtual {v5, p1}, Lcom/example/navistart/VibVodActivity;->s(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v5}, Lcom/example/navistart/VibVodActivity;->t()Ljava/lang/Boolean;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-eqz v3, :cond_9

    .line 138
    .line 139
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 140
    .line 141
    .line 142
    invoke-static {}, Lh0/b;->d()Lcom/example/navistart/cores/CarCmdProxy;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-interface {v3, p1}, Lcom/example/navistart/cores/CarCmdProxy;->carsetvod(I)V

    .line 147
    .line 148
    .line 149
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    invoke-virtual {v3}, Lh0/b;->e()Le0/p;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    iput p1, v3, Le0/p;->e:I

    .line 158
    .line 159
    :cond_9
    iget-object p1, v5, Lcom/example/navistart/VibVodActivity;->b:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 160
    .line 161
    new-instance v3, Le0/g3;

    .line 162
    .line 163
    invoke-direct {v3, v5, v4}, Le0/g3;-><init>(Lcom/example/navistart/VibVodActivity;I)V

    .line 164
    .line 165
    .line 166
    invoke-interface {p1, v3, v1, v2, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :pswitch_1
    iget-object p1, v5, Lcom/example/navistart/VibVodActivity;->f:Ljava/lang/Boolean;

    .line 171
    .line 172
    invoke-static {v5}, Le0/d0;->d(Landroid/content/Context;)V

    .line 173
    .line 174
    .line 175
    invoke-static {}, Lcom/example/navistart/MainActivity;->w()Z

    .line 176
    .line 177
    .line 178
    move-result v6

    .line 179
    if-eqz v6, :cond_b

    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    if-nez v6, :cond_a

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_a
    throw v3

    .line 189
    :cond_b
    :goto_4
    invoke-static {v5}, Lcom/example/navistart/MainActivity;->v(Landroid/content/Context;)Z

    .line 190
    .line 191
    .line 192
    move-result v6

    .line 193
    if-eqz v6, :cond_d

    .line 194
    .line 195
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    if-nez p1, :cond_c

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_c
    throw v3

    .line 203
    :cond_d
    :goto_5
    invoke-virtual {v5, v4}, Lcom/example/navistart/VibVodActivity;->s(I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v5}, Lcom/example/navistart/VibVodActivity;->t()Ljava/lang/Boolean;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    if-eqz p1, :cond_e

    .line 215
    .line 216
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 217
    .line 218
    .line 219
    invoke-static {}, Lh0/b;->d()Lcom/example/navistart/cores/CarCmdProxy;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-interface {p1, v4}, Lcom/example/navistart/cores/CarCmdProxy;->carsetvod(I)V

    .line 224
    .line 225
    .line 226
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-virtual {p1}, Lh0/b;->e()Le0/p;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    iput v4, p1, Le0/p;->e:I

    .line 235
    .line 236
    :cond_e
    iget-object p1, v5, Lcom/example/navistart/VibVodActivity;->b:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 237
    .line 238
    new-instance v3, Le0/g3;

    .line 239
    .line 240
    invoke-direct {v3, v5, v4}, Le0/g3;-><init>(Lcom/example/navistart/VibVodActivity;I)V

    .line 241
    .line 242
    .line 243
    invoke-interface {p1, v3, v1, v2, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :pswitch_2
    sget-object p1, Lcom/example/navistart/VibVodActivity;->g:Ljava/lang/Boolean;

    .line 248
    .line 249
    invoke-virtual {v5}, Landroid/app/Activity;->finish()V

    .line 250
    .line 251
    .line 252
    return-void

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
