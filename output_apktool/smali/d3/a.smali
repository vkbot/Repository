.class public final Ld3/a;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"

# interfaces
.implements Ls3/i;


# instance fields
.field public final b:Ljava/lang/ref/WeakReference;

.field public final c:Lz3/k;

.field public final d:Ls3/j;

.field public final e:Landroid/graphics/Rect;

.field public final f:Ld3/c;

.field public g:F

.field public h:F

.field public final i:I

.field public j:F

.field public k:F

.field public l:F

.field public m:Ljava/lang/ref/WeakReference;

.field public n:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ld3/a;->b:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    sget-object v1, Ls3/l;->b:[I

    .line 12
    .line 13
    const-string v2, "Theme.MaterialComponents"

    .line 14
    .line 15
    invoke-static {p1, v1, v2}, Ls3/l;->c(Landroid/content/Context;[ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Landroid/graphics/Rect;

    .line 19
    .line 20
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Ld3/a;->e:Landroid/graphics/Rect;

    .line 24
    .line 25
    new-instance v1, Ls3/j;

    .line 26
    .line 27
    invoke-direct {v1, p0}, Ls3/j;-><init>(Ls3/i;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Ld3/a;->d:Ls3/j;

    .line 31
    .line 32
    sget-object v2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 33
    .line 34
    iget-object v3, v1, Ls3/j;->a:Landroid/text/TextPaint;

    .line 35
    .line 36
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 37
    .line 38
    .line 39
    new-instance v2, Ld3/c;

    .line 40
    .line 41
    invoke-direct {v2, p1}, Ld3/c;-><init>(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    iput-object v2, p0, Ld3/a;->f:Ld3/c;

    .line 45
    .line 46
    new-instance v4, Lz3/k;

    .line 47
    .line 48
    invoke-virtual {p0}, Ld3/a;->f()Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    iget-object v2, v2, Ld3/c;->b:Ld3/b;

    .line 53
    .line 54
    if-eqz v5, :cond_0

    .line 55
    .line 56
    iget-object v5, v2, Ld3/b;->h:Ljava/lang/Integer;

    .line 57
    .line 58
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    iget-object v5, v2, Ld3/b;->f:Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    :goto_0
    invoke-virtual {p0}, Ld3/a;->f()Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-eqz v6, :cond_1

    .line 74
    .line 75
    iget-object v6, v2, Ld3/b;->i:Ljava/lang/Integer;

    .line 76
    .line 77
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    goto :goto_1

    .line 82
    :cond_1
    iget-object v6, v2, Ld3/b;->g:Ljava/lang/Integer;

    .line 83
    .line 84
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    :goto_1
    invoke-static {p1, v5, v6}, Lz3/o;->a(Landroid/content/Context;II)Lz3/n;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1}, Lz3/n;->a()Lz3/o;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-direct {v4, p1}, Lz3/k;-><init>(Lz3/o;)V

    .line 97
    .line 98
    .line 99
    iput-object v4, p0, Ld3/a;->c:Lz3/k;

    .line 100
    .line 101
    invoke-virtual {p0}, Ld3/a;->h()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    check-cast p1, Landroid/content/Context;

    .line 109
    .line 110
    if-nez p1, :cond_2

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_2
    new-instance v0, Lw3/f;

    .line 114
    .line 115
    iget-object v5, v2, Ld3/b;->e:Ljava/lang/Integer;

    .line 116
    .line 117
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    invoke-direct {v0, p1, v5}, Lw3/f;-><init>(Landroid/content/Context;I)V

    .line 122
    .line 123
    .line 124
    iget-object v5, v1, Ls3/j;->g:Lw3/f;

    .line 125
    .line 126
    if-ne v5, v0, :cond_3

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_3
    invoke-virtual {v1, v0, p1}, Ls3/j;->b(Lw3/f;Landroid/content/Context;)V

    .line 130
    .line 131
    .line 132
    iget-object p1, v2, Ld3/b;->d:Ljava/lang/Integer;

    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0}, Ld3/a;->j()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 148
    .line 149
    .line 150
    :goto_2
    iget p1, v2, Ld3/b;->m:I

    .line 151
    .line 152
    const/4 v0, -0x2

    .line 153
    const/4 v5, 0x1

    .line 154
    if-eq p1, v0, :cond_4

    .line 155
    .line 156
    int-to-double v6, p1

    .line 157
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 158
    .line 159
    sub-double/2addr v6, v8

    .line 160
    const-wide/high16 v8, 0x4024000000000000L    # 10.0

    .line 161
    .line 162
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 163
    .line 164
    .line 165
    move-result-wide v6

    .line 166
    double-to-int p1, v6

    .line 167
    sub-int/2addr p1, v5

    .line 168
    iput p1, p0, Ld3/a;->i:I

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_4
    iget p1, v2, Ld3/b;->n:I

    .line 172
    .line 173
    iput p1, p0, Ld3/a;->i:I

    .line 174
    .line 175
    :goto_3
    iput-boolean v5, v1, Ls3/j;->e:Z

    .line 176
    .line 177
    invoke-virtual {p0}, Ld3/a;->j()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 181
    .line 182
    .line 183
    iput-boolean v5, v1, Ls3/j;->e:Z

    .line 184
    .line 185
    invoke-virtual {p0}, Ld3/a;->h()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0}, Ld3/a;->j()V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0}, Ld3/a;->getAlpha()I

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 202
    .line 203
    .line 204
    iget-object p1, v2, Ld3/b;->c:Ljava/lang/Integer;

    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    iget-object v0, v4, Lz3/k;->c:Lz3/h;

    .line 215
    .line 216
    iget-object v0, v0, Lz3/h;->d:Landroid/content/res/ColorStateList;

    .line 217
    .line 218
    if-eq v0, p1, :cond_5

    .line 219
    .line 220
    invoke-virtual {v4, p1}, Lz3/k;->q(Landroid/content/res/ColorStateList;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 224
    .line 225
    .line 226
    :cond_5
    iget-object p1, v2, Ld3/b;->d:Ljava/lang/Integer;

    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 229
    .line 230
    .line 231
    move-result p1

    .line 232
    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 236
    .line 237
    .line 238
    iget-object p1, p0, Ld3/a;->m:Ljava/lang/ref/WeakReference;

    .line 239
    .line 240
    if-eqz p1, :cond_7

    .line 241
    .line 242
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    if-eqz p1, :cond_7

    .line 247
    .line 248
    iget-object p1, p0, Ld3/a;->m:Ljava/lang/ref/WeakReference;

    .line 249
    .line 250
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    check-cast p1, Landroid/view/View;

    .line 255
    .line 256
    iget-object v0, p0, Ld3/a;->n:Ljava/lang/ref/WeakReference;

    .line 257
    .line 258
    if-eqz v0, :cond_6

    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    check-cast v0, Landroid/widget/FrameLayout;

    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_6
    const/4 v0, 0x0

    .line 268
    :goto_4
    invoke-virtual {p0, p1, v0}, Ld3/a;->i(Landroid/view/View;Landroid/widget/FrameLayout;)V

    .line 269
    .line 270
    .line 271
    :cond_7
    invoke-virtual {p0}, Ld3/a;->j()V

    .line 272
    .line 273
    .line 274
    iget-object p1, v2, Ld3/b;->u:Ljava/lang/Boolean;

    .line 275
    .line 276
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 277
    .line 278
    .line 279
    move-result p1

    .line 280
    const/4 v0, 0x0

    .line 281
    invoke-virtual {p0, p1, v0}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 282
    .line 283
    .line 284
    return-void
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
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

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

.method public final b(Landroid/view/View;Landroid/view/View;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Ld3/a;->d()Landroid/widget/FrameLayout;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getY()F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getX()F

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    move v7, v0

    .line 21
    move-object v0, p1

    .line 22
    move p1, v7

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p1, v1

    .line 25
    move v2, p1

    .line 26
    :goto_0
    instance-of v3, v0, Landroid/view/View;

    .line 27
    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    if-eq v0, p2, :cond_2

    .line 31
    .line 32
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    instance-of v5, v4, Landroid/view/ViewGroup;

    .line 37
    .line 38
    if-eqz v5, :cond_2

    .line 39
    .line 40
    check-cast v4, Landroid/view/ViewGroup;

    .line 41
    .line 42
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getClipChildren()Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move-object v3, v0

    .line 50
    check-cast v3, Landroid/view/View;

    .line 51
    .line 52
    invoke-virtual {v3}, Landroid/view/View;->getY()F

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    add-float/2addr p1, v4

    .line 57
    invoke-virtual {v3}, Landroid/view/View;->getX()F

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    add-float/2addr v2, v3

    .line 62
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    :goto_1
    if-nez v3, :cond_3

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    iget p2, p0, Ld3/a;->h:F

    .line 71
    .line 72
    iget v3, p0, Ld3/a;->l:F

    .line 73
    .line 74
    sub-float/2addr p2, v3

    .line 75
    add-float/2addr p2, p1

    .line 76
    iget v3, p0, Ld3/a;->g:F

    .line 77
    .line 78
    iget v4, p0, Ld3/a;->k:F

    .line 79
    .line 80
    sub-float/2addr v3, v4

    .line 81
    add-float/2addr v3, v2

    .line 82
    check-cast v0, Landroid/view/View;

    .line 83
    .line 84
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    int-to-float v4, v4

    .line 89
    iget v5, p0, Ld3/a;->h:F

    .line 90
    .line 91
    iget v6, p0, Ld3/a;->l:F

    .line 92
    .line 93
    add-float/2addr v5, v6

    .line 94
    sub-float/2addr v5, v4

    .line 95
    add-float/2addr v5, p1

    .line 96
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    int-to-float p1, p1

    .line 101
    iget v0, p0, Ld3/a;->g:F

    .line 102
    .line 103
    iget v4, p0, Ld3/a;->k:F

    .line 104
    .line 105
    add-float/2addr v0, v4

    .line 106
    sub-float/2addr v0, p1

    .line 107
    add-float/2addr v0, v2

    .line 108
    cmpg-float p1, p2, v1

    .line 109
    .line 110
    if-gez p1, :cond_4

    .line 111
    .line 112
    iget p1, p0, Ld3/a;->h:F

    .line 113
    .line 114
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    add-float/2addr p2, p1

    .line 119
    iput p2, p0, Ld3/a;->h:F

    .line 120
    .line 121
    :cond_4
    cmpg-float p1, v3, v1

    .line 122
    .line 123
    if-gez p1, :cond_5

    .line 124
    .line 125
    iget p1, p0, Ld3/a;->g:F

    .line 126
    .line 127
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    add-float/2addr p2, p1

    .line 132
    iput p2, p0, Ld3/a;->g:F

    .line 133
    .line 134
    :cond_5
    cmpl-float p1, v5, v1

    .line 135
    .line 136
    if-lez p1, :cond_6

    .line 137
    .line 138
    iget p1, p0, Ld3/a;->h:F

    .line 139
    .line 140
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    sub-float/2addr p1, p2

    .line 145
    iput p1, p0, Ld3/a;->h:F

    .line 146
    .line 147
    :cond_6
    cmpl-float p1, v0, v1

    .line 148
    .line 149
    if-lez p1, :cond_7

    .line 150
    .line 151
    iget p1, p0, Ld3/a;->g:F

    .line 152
    .line 153
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    sub-float/2addr p1, p2

    .line 158
    iput p1, p0, Ld3/a;->g:F

    .line 159
    .line 160
    :cond_7
    :goto_2
    return-void
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
.end method

.method public final c()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Ld3/a;->f:Ld3/c;

    .line 2
    .line 3
    iget-object v1, v0, Ld3/c;->b:Ld3/b;

    .line 4
    .line 5
    iget-object v0, v0, Ld3/c;->b:Ld3/b;

    .line 6
    .line 7
    iget-object v2, v1, Ld3/b;->k:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v3, p0, Ld3/a;->b:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    const/4 v4, -0x2

    .line 12
    if-eqz v2, :cond_3

    .line 13
    .line 14
    iget v0, v1, Ld3/b;->m:I

    .line 15
    .line 16
    if-ne v0, v4, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    if-eqz v2, :cond_2

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-le v1, v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Landroid/content/Context;

    .line 32
    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-virtual {v2, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const v2, 0x7f130221

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const-string v2, "\u2026"

    .line 51
    .line 52
    filled-new-array {v0, v2}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    return-object v0

    .line 61
    :cond_2
    :goto_0
    return-object v2

    .line 62
    :cond_3
    invoke-virtual {p0}, Ld3/a;->g()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_7

    .line 67
    .line 68
    iget v1, p0, Ld3/a;->i:I

    .line 69
    .line 70
    if-eq v1, v4, :cond_6

    .line 71
    .line 72
    invoke-virtual {p0}, Ld3/a;->e()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    iget v2, p0, Ld3/a;->i:I

    .line 77
    .line 78
    if-gt v1, v2, :cond_4

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, Landroid/content/Context;

    .line 86
    .line 87
    if-nez v1, :cond_5

    .line 88
    .line 89
    :goto_1
    const-string v0, ""

    .line 90
    .line 91
    return-object v0

    .line 92
    :cond_5
    iget-object v0, v0, Ld3/b;->o:Ljava/util/Locale;

    .line 93
    .line 94
    const v2, 0x7f1302ef

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    iget v2, p0, Ld3/a;->i:I

    .line 102
    .line 103
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    const-string v3, "+"

    .line 108
    .line 109
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    return-object v0

    .line 118
    :cond_6
    :goto_2
    iget-object v0, v0, Ld3/b;->o:Ljava/util/Locale;

    .line 119
    .line 120
    invoke-static {v0}, Ljava/text/NumberFormat;->getInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {p0}, Ld3/a;->e()I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    int-to-long v1, v1

    .line 129
    invoke-virtual {v0, v1, v2}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    return-object v0

    .line 134
    :cond_7
    const/4 v0, 0x0

    .line 135
    return-object v0
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

.method public final d()Landroid/widget/FrameLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Ld3/a;->n:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/widget/FrameLayout;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    invoke-virtual {p0}, Ld3/a;->getAlpha()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_0
    iget-object v0, p0, Ld3/a;->c:Lz3/k;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lz3/k;->draw(Landroid/graphics/Canvas;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ld3/a;->f()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0}, Ld3/a;->c()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    new-instance v1, Landroid/graphics/Rect;

    .line 42
    .line 43
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 44
    .line 45
    .line 46
    iget-object v2, p0, Ld3/a;->d:Ls3/j;

    .line 47
    .line 48
    iget-object v3, v2, Ls3/j;->a:Landroid/text/TextPaint;

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    invoke-virtual {v3, v0, v4, v5, v1}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 56
    .line 57
    .line 58
    iget v3, p0, Ld3/a;->h:F

    .line 59
    .line 60
    invoke-virtual {v1}, Landroid/graphics/Rect;->exactCenterY()F

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    sub-float/2addr v3, v4

    .line 65
    iget v4, p0, Ld3/a;->g:F

    .line 66
    .line 67
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 68
    .line 69
    if-gtz v1, :cond_1

    .line 70
    .line 71
    float-to-int v1, v3

    .line 72
    :goto_0
    int-to-float v1, v1

    .line 73
    goto :goto_1

    .line 74
    :cond_1
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    goto :goto_0

    .line 79
    :goto_1
    iget-object v2, v2, Ls3/j;->a:Landroid/text/TextPaint;

    .line 80
    .line 81
    invoke-virtual {p1, v0, v4, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    :goto_2
    return-void
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
.end method

.method public final e()I
    .locals 2

    .line 1
    iget-object v0, p0, Ld3/a;->f:Ld3/c;

    .line 2
    .line 3
    iget-object v0, v0, Ld3/c;->b:Ld3/b;

    .line 4
    .line 5
    iget v0, v0, Ld3/b;->l:I

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
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

.method public final f()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ld3/a;->f:Ld3/c;

    .line 2
    .line 3
    iget-object v0, v0, Ld3/c;->b:Ld3/b;

    .line 4
    .line 5
    iget-object v0, v0, Ld3/b;->k:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Ld3/a;->g()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    :goto_0
    const/4 v0, 0x1

    .line 17
    return v0

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    return v0
    .line 20
    .line 21
.end method

.method public final g()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ld3/a;->f:Ld3/c;

    .line 2
    .line 3
    iget-object v0, v0, Ld3/c;->b:Ld3/b;

    .line 4
    .line 5
    iget-object v1, v0, Ld3/b;->k:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget v0, v0, Ld3/b;->l:I

    .line 11
    .line 12
    const/4 v1, -0x1

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
.end method

.method public final getAlpha()I
    .locals 1

    .line 1
    iget-object v0, p0, Ld3/a;->f:Ld3/c;

    .line 2
    .line 3
    iget-object v0, v0, Ld3/c;->b:Ld3/b;

    .line 4
    .line 5
    iget v0, v0, Ld3/b;->j:I

    .line 6
    .line 7
    return v0
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

.method public final getIntrinsicHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, Ld3/a;->e:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public final getIntrinsicWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Ld3/a;->e:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public final getOpacity()I
    .locals 1

    .line 1
    const/4 v0, -0x3

    .line 2
    return v0
    .line 3
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

.method public final h()V
    .locals 4

    .line 1
    iget-object v0, p0, Ld3/a;->b:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/content/Context;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0}, Ld3/a;->f()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v2, p0, Ld3/a;->f:Ld3/c;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    iget-object v1, v2, Ld3/c;->b:Ld3/b;

    .line 21
    .line 22
    iget-object v1, v1, Ld3/b;->h:Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object v1, v2, Ld3/c;->b:Ld3/b;

    .line 30
    .line 31
    iget-object v1, v1, Ld3/b;->f:Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    :goto_0
    invoke-virtual {p0}, Ld3/a;->f()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    iget-object v2, v2, Ld3/c;->b:Ld3/b;

    .line 44
    .line 45
    iget-object v2, v2, Ld3/b;->i:Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    iget-object v2, v2, Ld3/c;->b:Ld3/b;

    .line 53
    .line 54
    iget-object v2, v2, Ld3/b;->g:Ljava/lang/Integer;

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    :goto_1
    invoke-static {v0, v1, v2}, Lz3/o;->a(Landroid/content/Context;II)Lz3/n;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Lz3/n;->a()Lz3/o;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-object v1, p0, Ld3/a;->c:Lz3/k;

    .line 69
    .line 70
    invoke-virtual {v1, v0}, Lz3/k;->setShapeAppearanceModel(Lz3/o;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final i(Landroid/view/View;Landroid/widget/FrameLayout;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Ld3/a;->m:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Ld3/a;->n:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Landroid/view/ViewGroup;

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ld3/a;->j()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 32
    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method public final isStateful()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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

.method public final j()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ld3/a;->b:Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Landroid/content/Context;

    .line 10
    .line 11
    iget-object v3, v0, Ld3/a;->m:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, Landroid/view/View;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v3, v4

    .line 24
    :goto_0
    if-eqz v2, :cond_1c

    .line 25
    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    goto/16 :goto_14

    .line 29
    .line 30
    :cond_1
    new-instance v2, Landroid/graphics/Rect;

    .line 31
    .line 32
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 33
    .line 34
    .line 35
    iget-object v5, v0, Ld3/a;->e:Landroid/graphics/Rect;

    .line 36
    .line 37
    invoke-virtual {v2, v5}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 38
    .line 39
    .line 40
    new-instance v6, Landroid/graphics/Rect;

    .line 41
    .line 42
    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v6}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 46
    .line 47
    .line 48
    iget-object v7, v0, Ld3/a;->n:Ljava/lang/ref/WeakReference;

    .line 49
    .line 50
    if-eqz v7, :cond_2

    .line 51
    .line 52
    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    check-cast v7, Landroid/view/ViewGroup;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move-object v7, v4

    .line 60
    :goto_1
    if-eqz v7, :cond_3

    .line 61
    .line 62
    invoke-virtual {v7, v3, v6}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 63
    .line 64
    .line 65
    :cond_3
    invoke-virtual {v0}, Ld3/a;->f()Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    iget-object v8, v0, Ld3/a;->f:Ld3/c;

    .line 70
    .line 71
    if-eqz v7, :cond_4

    .line 72
    .line 73
    iget v7, v8, Ld3/c;->d:F

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    iget v7, v8, Ld3/c;->c:F

    .line 77
    .line 78
    :goto_2
    iput v7, v0, Ld3/a;->j:F

    .line 79
    .line 80
    const/high16 v9, -0x40800000    # -1.0f

    .line 81
    .line 82
    cmpl-float v10, v7, v9

    .line 83
    .line 84
    const/high16 v11, 0x40000000    # 2.0f

    .line 85
    .line 86
    if-eqz v10, :cond_5

    .line 87
    .line 88
    iput v7, v0, Ld3/a;->k:F

    .line 89
    .line 90
    iput v7, v0, Ld3/a;->l:F

    .line 91
    .line 92
    goto :goto_7

    .line 93
    :cond_5
    invoke-virtual {v0}, Ld3/a;->f()Z

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    if-eqz v7, :cond_6

    .line 98
    .line 99
    iget v7, v8, Ld3/c;->g:F

    .line 100
    .line 101
    :goto_3
    div-float/2addr v7, v11

    .line 102
    goto :goto_4

    .line 103
    :cond_6
    iget v7, v8, Ld3/c;->e:F

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :goto_4
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    int-to-float v7, v7

    .line 111
    iput v7, v0, Ld3/a;->k:F

    .line 112
    .line 113
    invoke-virtual {v0}, Ld3/a;->f()Z

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    if-eqz v7, :cond_7

    .line 118
    .line 119
    iget v7, v8, Ld3/c;->h:F

    .line 120
    .line 121
    :goto_5
    div-float/2addr v7, v11

    .line 122
    goto :goto_6

    .line 123
    :cond_7
    iget v7, v8, Ld3/c;->f:F

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :goto_6
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    int-to-float v7, v7

    .line 131
    iput v7, v0, Ld3/a;->l:F

    .line 132
    .line 133
    :goto_7
    invoke-virtual {v0}, Ld3/a;->f()Z

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    if-eqz v7, :cond_a

    .line 138
    .line 139
    invoke-virtual {v0}, Ld3/a;->c()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    iget v10, v0, Ld3/a;->k:F

    .line 144
    .line 145
    iget-object v12, v0, Ld3/a;->d:Ls3/j;

    .line 146
    .line 147
    iget-boolean v13, v12, Ls3/j;->e:Z

    .line 148
    .line 149
    if-nez v13, :cond_8

    .line 150
    .line 151
    iget v13, v12, Ls3/j;->c:F

    .line 152
    .line 153
    goto :goto_8

    .line 154
    :cond_8
    invoke-virtual {v12, v7}, Ls3/j;->a(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    iget v13, v12, Ls3/j;->c:F

    .line 158
    .line 159
    :goto_8
    div-float/2addr v13, v11

    .line 160
    iget-object v14, v8, Ld3/c;->b:Ld3/b;

    .line 161
    .line 162
    iget-object v14, v14, Ld3/b;->v:Ljava/lang/Integer;

    .line 163
    .line 164
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 165
    .line 166
    .line 167
    move-result v14

    .line 168
    int-to-float v14, v14

    .line 169
    add-float/2addr v13, v14

    .line 170
    invoke-static {v10, v13}, Ljava/lang/Math;->max(FF)F

    .line 171
    .line 172
    .line 173
    move-result v10

    .line 174
    iput v10, v0, Ld3/a;->k:F

    .line 175
    .line 176
    iget v10, v0, Ld3/a;->l:F

    .line 177
    .line 178
    iget-boolean v13, v12, Ls3/j;->e:Z

    .line 179
    .line 180
    if-nez v13, :cond_9

    .line 181
    .line 182
    goto :goto_9

    .line 183
    :cond_9
    invoke-virtual {v12, v7}, Ls3/j;->a(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    :goto_9
    iget v7, v12, Ls3/j;->d:F

    .line 187
    .line 188
    div-float/2addr v7, v11

    .line 189
    iget-object v12, v8, Ld3/c;->b:Ld3/b;

    .line 190
    .line 191
    iget-object v12, v12, Ld3/b;->w:Ljava/lang/Integer;

    .line 192
    .line 193
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 194
    .line 195
    .line 196
    move-result v12

    .line 197
    int-to-float v12, v12

    .line 198
    add-float/2addr v7, v12

    .line 199
    invoke-static {v10, v7}, Ljava/lang/Math;->max(FF)F

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    iput v7, v0, Ld3/a;->l:F

    .line 204
    .line 205
    iget v10, v0, Ld3/a;->k:F

    .line 206
    .line 207
    invoke-static {v10, v7}, Ljava/lang/Math;->max(FF)F

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    iput v7, v0, Ld3/a;->k:F

    .line 212
    .line 213
    :cond_a
    iget-object v7, v8, Ld3/c;->b:Ld3/b;

    .line 214
    .line 215
    iget-object v10, v8, Ld3/c;->b:Ld3/b;

    .line 216
    .line 217
    iget v12, v8, Ld3/c;->l:I

    .line 218
    .line 219
    iget v13, v8, Ld3/c;->k:I

    .line 220
    .line 221
    iget-object v14, v7, Ld3/b;->y:Ljava/lang/Integer;

    .line 222
    .line 223
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 224
    .line 225
    .line 226
    move-result v14

    .line 227
    invoke-virtual {v0}, Ld3/a;->f()Z

    .line 228
    .line 229
    .line 230
    move-result v15

    .line 231
    if-eqz v15, :cond_b

    .line 232
    .line 233
    iget-object v14, v7, Ld3/b;->A:Ljava/lang/Integer;

    .line 234
    .line 235
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 236
    .line 237
    .line 238
    move-result v14

    .line 239
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    check-cast v1, Landroid/content/Context;

    .line 244
    .line 245
    if-eqz v1, :cond_b

    .line 246
    .line 247
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    iget v1, v1, Landroid/content/res/Configuration;->fontScale:F

    .line 256
    .line 257
    const/high16 v15, 0x3f800000    # 1.0f

    .line 258
    .line 259
    sub-float/2addr v1, v15

    .line 260
    move/from16 v16, v9

    .line 261
    .line 262
    const/4 v9, 0x0

    .line 263
    move/from16 v17, v11

    .line 264
    .line 265
    const v11, 0x3e99999a    # 0.3f

    .line 266
    .line 267
    .line 268
    invoke-static {v9, v15, v11, v15, v1}, Lb3/a;->b(FFFFF)F

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    iget-object v9, v7, Ld3/b;->D:Ljava/lang/Integer;

    .line 273
    .line 274
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 275
    .line 276
    .line 277
    move-result v9

    .line 278
    sub-int v9, v14, v9

    .line 279
    .line 280
    invoke-static {v1, v14, v9}, Lb3/a;->c(FII)I

    .line 281
    .line 282
    .line 283
    move-result v14

    .line 284
    goto :goto_a

    .line 285
    :cond_b
    move/from16 v16, v9

    .line 286
    .line 287
    move/from16 v17, v11

    .line 288
    .line 289
    :goto_a
    if-nez v13, :cond_c

    .line 290
    .line 291
    iget v1, v0, Ld3/a;->l:F

    .line 292
    .line 293
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    sub-int/2addr v14, v1

    .line 298
    :cond_c
    iget-object v1, v7, Ld3/b;->C:Ljava/lang/Integer;

    .line 299
    .line 300
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 301
    .line 302
    .line 303
    move-result v1

    .line 304
    add-int/2addr v1, v14

    .line 305
    iget-object v9, v10, Ld3/b;->t:Ljava/lang/Integer;

    .line 306
    .line 307
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 308
    .line 309
    .line 310
    move-result v9

    .line 311
    const v11, 0x800053

    .line 312
    .line 313
    .line 314
    if-eq v9, v11, :cond_d

    .line 315
    .line 316
    const v14, 0x800055

    .line 317
    .line 318
    .line 319
    if-eq v9, v14, :cond_d

    .line 320
    .line 321
    iget v9, v6, Landroid/graphics/Rect;->top:I

    .line 322
    .line 323
    add-int/2addr v9, v1

    .line 324
    int-to-float v1, v9

    .line 325
    iput v1, v0, Ld3/a;->h:F

    .line 326
    .line 327
    goto :goto_b

    .line 328
    :cond_d
    iget v9, v6, Landroid/graphics/Rect;->bottom:I

    .line 329
    .line 330
    sub-int/2addr v9, v1

    .line 331
    int-to-float v1, v9

    .line 332
    iput v1, v0, Ld3/a;->h:F

    .line 333
    .line 334
    :goto_b
    invoke-virtual {v0}, Ld3/a;->f()Z

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    if-eqz v1, :cond_e

    .line 339
    .line 340
    iget-object v1, v7, Ld3/b;->z:Ljava/lang/Integer;

    .line 341
    .line 342
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 343
    .line 344
    .line 345
    move-result v1

    .line 346
    goto :goto_c

    .line 347
    :cond_e
    iget-object v1, v7, Ld3/b;->x:Ljava/lang/Integer;

    .line 348
    .line 349
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    :goto_c
    const/4 v9, 0x1

    .line 354
    if-ne v13, v9, :cond_10

    .line 355
    .line 356
    invoke-virtual {v0}, Ld3/a;->f()Z

    .line 357
    .line 358
    .line 359
    move-result v9

    .line 360
    if-eqz v9, :cond_f

    .line 361
    .line 362
    iget v8, v8, Ld3/c;->j:I

    .line 363
    .line 364
    goto :goto_d

    .line 365
    :cond_f
    iget v8, v8, Ld3/c;->i:I

    .line 366
    .line 367
    :goto_d
    add-int/2addr v1, v8

    .line 368
    :cond_10
    iget-object v8, v7, Ld3/b;->B:Ljava/lang/Integer;

    .line 369
    .line 370
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 371
    .line 372
    .line 373
    move-result v8

    .line 374
    add-int/2addr v8, v1

    .line 375
    iget-object v1, v10, Ld3/b;->t:Ljava/lang/Integer;

    .line 376
    .line 377
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 378
    .line 379
    .line 380
    move-result v1

    .line 381
    const v9, 0x800033

    .line 382
    .line 383
    .line 384
    if-eq v1, v9, :cond_14

    .line 385
    .line 386
    if-eq v1, v11, :cond_14

    .line 387
    .line 388
    if-nez v12, :cond_12

    .line 389
    .line 390
    invoke-virtual {v3}, Landroid/view/View;->getLayoutDirection()I

    .line 391
    .line 392
    .line 393
    move-result v1

    .line 394
    if-nez v1, :cond_11

    .line 395
    .line 396
    iget v1, v6, Landroid/graphics/Rect;->right:I

    .line 397
    .line 398
    int-to-float v1, v1

    .line 399
    iget v6, v0, Ld3/a;->k:F

    .line 400
    .line 401
    add-float/2addr v1, v6

    .line 402
    int-to-float v6, v8

    .line 403
    :goto_e
    sub-float/2addr v1, v6

    .line 404
    goto :goto_f

    .line 405
    :cond_11
    iget v1, v6, Landroid/graphics/Rect;->left:I

    .line 406
    .line 407
    int-to-float v1, v1

    .line 408
    iget v6, v0, Ld3/a;->k:F

    .line 409
    .line 410
    sub-float/2addr v1, v6

    .line 411
    int-to-float v6, v8

    .line 412
    add-float/2addr v1, v6

    .line 413
    goto :goto_f

    .line 414
    :cond_12
    invoke-virtual {v3}, Landroid/view/View;->getLayoutDirection()I

    .line 415
    .line 416
    .line 417
    move-result v1

    .line 418
    if-nez v1, :cond_13

    .line 419
    .line 420
    iget v1, v6, Landroid/graphics/Rect;->right:I

    .line 421
    .line 422
    int-to-float v1, v1

    .line 423
    iget v6, v0, Ld3/a;->k:F

    .line 424
    .line 425
    sub-float/2addr v1, v6

    .line 426
    iget v6, v0, Ld3/a;->l:F

    .line 427
    .line 428
    mul-float v6, v6, v17

    .line 429
    .line 430
    int-to-float v8, v8

    .line 431
    sub-float/2addr v6, v8

    .line 432
    add-float/2addr v1, v6

    .line 433
    goto :goto_f

    .line 434
    :cond_13
    iget v1, v6, Landroid/graphics/Rect;->left:I

    .line 435
    .line 436
    int-to-float v1, v1

    .line 437
    iget v6, v0, Ld3/a;->k:F

    .line 438
    .line 439
    add-float/2addr v1, v6

    .line 440
    iget v6, v0, Ld3/a;->l:F

    .line 441
    .line 442
    mul-float v6, v6, v17

    .line 443
    .line 444
    int-to-float v8, v8

    .line 445
    sub-float/2addr v6, v8

    .line 446
    goto :goto_e

    .line 447
    :goto_f
    iput v1, v0, Ld3/a;->g:F

    .line 448
    .line 449
    goto :goto_12

    .line 450
    :cond_14
    if-nez v12, :cond_16

    .line 451
    .line 452
    invoke-virtual {v3}, Landroid/view/View;->getLayoutDirection()I

    .line 453
    .line 454
    .line 455
    move-result v1

    .line 456
    if-nez v1, :cond_15

    .line 457
    .line 458
    iget v1, v6, Landroid/graphics/Rect;->left:I

    .line 459
    .line 460
    int-to-float v1, v1

    .line 461
    iget v6, v0, Ld3/a;->k:F

    .line 462
    .line 463
    add-float/2addr v1, v6

    .line 464
    iget v6, v0, Ld3/a;->l:F

    .line 465
    .line 466
    mul-float v6, v6, v17

    .line 467
    .line 468
    int-to-float v8, v8

    .line 469
    sub-float/2addr v6, v8

    .line 470
    :goto_10
    sub-float/2addr v1, v6

    .line 471
    goto :goto_11

    .line 472
    :cond_15
    iget v1, v6, Landroid/graphics/Rect;->right:I

    .line 473
    .line 474
    int-to-float v1, v1

    .line 475
    iget v6, v0, Ld3/a;->k:F

    .line 476
    .line 477
    sub-float/2addr v1, v6

    .line 478
    iget v6, v0, Ld3/a;->l:F

    .line 479
    .line 480
    mul-float v6, v6, v17

    .line 481
    .line 482
    int-to-float v8, v8

    .line 483
    sub-float/2addr v6, v8

    .line 484
    add-float/2addr v1, v6

    .line 485
    goto :goto_11

    .line 486
    :cond_16
    invoke-virtual {v3}, Landroid/view/View;->getLayoutDirection()I

    .line 487
    .line 488
    .line 489
    move-result v1

    .line 490
    if-nez v1, :cond_17

    .line 491
    .line 492
    iget v1, v6, Landroid/graphics/Rect;->left:I

    .line 493
    .line 494
    int-to-float v1, v1

    .line 495
    iget v6, v0, Ld3/a;->k:F

    .line 496
    .line 497
    sub-float/2addr v1, v6

    .line 498
    int-to-float v6, v8

    .line 499
    add-float/2addr v1, v6

    .line 500
    goto :goto_11

    .line 501
    :cond_17
    iget v1, v6, Landroid/graphics/Rect;->right:I

    .line 502
    .line 503
    int-to-float v1, v1

    .line 504
    iget v6, v0, Ld3/a;->k:F

    .line 505
    .line 506
    add-float/2addr v1, v6

    .line 507
    int-to-float v6, v8

    .line 508
    goto :goto_10

    .line 509
    :goto_11
    iput v1, v0, Ld3/a;->g:F

    .line 510
    .line 511
    :goto_12
    iget-object v1, v7, Ld3/b;->E:Ljava/lang/Boolean;

    .line 512
    .line 513
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    if-eqz v1, :cond_19

    .line 518
    .line 519
    invoke-virtual {v0}, Ld3/a;->d()Landroid/widget/FrameLayout;

    .line 520
    .line 521
    .line 522
    move-result-object v1

    .line 523
    if-nez v1, :cond_18

    .line 524
    .line 525
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 526
    .line 527
    .line 528
    move-result-object v1

    .line 529
    :cond_18
    instance-of v4, v1, Landroid/view/View;

    .line 530
    .line 531
    if-eqz v4, :cond_1a

    .line 532
    .line 533
    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 534
    .line 535
    .line 536
    move-result-object v4

    .line 537
    instance-of v4, v4, Landroid/view/View;

    .line 538
    .line 539
    if-eqz v4, :cond_1a

    .line 540
    .line 541
    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 542
    .line 543
    .line 544
    move-result-object v1

    .line 545
    check-cast v1, Landroid/view/View;

    .line 546
    .line 547
    invoke-virtual {v0, v3, v1}, Ld3/a;->b(Landroid/view/View;Landroid/view/View;)V

    .line 548
    .line 549
    .line 550
    goto :goto_13

    .line 551
    :cond_19
    invoke-virtual {v0, v3, v4}, Ld3/a;->b(Landroid/view/View;Landroid/view/View;)V

    .line 552
    .line 553
    .line 554
    :cond_1a
    :goto_13
    iget v1, v0, Ld3/a;->g:F

    .line 555
    .line 556
    iget v3, v0, Ld3/a;->h:F

    .line 557
    .line 558
    iget v4, v0, Ld3/a;->k:F

    .line 559
    .line 560
    iget v6, v0, Ld3/a;->l:F

    .line 561
    .line 562
    sub-float v7, v1, v4

    .line 563
    .line 564
    float-to-int v7, v7

    .line 565
    sub-float v8, v3, v6

    .line 566
    .line 567
    float-to-int v8, v8

    .line 568
    add-float/2addr v1, v4

    .line 569
    float-to-int v1, v1

    .line 570
    add-float/2addr v3, v6

    .line 571
    float-to-int v3, v3

    .line 572
    invoke-virtual {v5, v7, v8, v1, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 573
    .line 574
    .line 575
    iget v1, v0, Ld3/a;->j:F

    .line 576
    .line 577
    cmpl-float v3, v1, v16

    .line 578
    .line 579
    iget-object v4, v0, Ld3/a;->c:Lz3/k;

    .line 580
    .line 581
    if-eqz v3, :cond_1b

    .line 582
    .line 583
    iget-object v3, v4, Lz3/k;->c:Lz3/h;

    .line 584
    .line 585
    iget-object v3, v3, Lz3/h;->a:Lz3/o;

    .line 586
    .line 587
    invoke-virtual {v3}, Lz3/o;->g()Lz3/n;

    .line 588
    .line 589
    .line 590
    move-result-object v3

    .line 591
    new-instance v6, Lz3/a;

    .line 592
    .line 593
    invoke-direct {v6, v1}, Lz3/a;-><init>(F)V

    .line 594
    .line 595
    .line 596
    iput-object v6, v3, Lz3/n;->e:Lz3/d;

    .line 597
    .line 598
    new-instance v6, Lz3/a;

    .line 599
    .line 600
    invoke-direct {v6, v1}, Lz3/a;-><init>(F)V

    .line 601
    .line 602
    .line 603
    iput-object v6, v3, Lz3/n;->f:Lz3/d;

    .line 604
    .line 605
    new-instance v6, Lz3/a;

    .line 606
    .line 607
    invoke-direct {v6, v1}, Lz3/a;-><init>(F)V

    .line 608
    .line 609
    .line 610
    iput-object v6, v3, Lz3/n;->g:Lz3/d;

    .line 611
    .line 612
    new-instance v6, Lz3/a;

    .line 613
    .line 614
    invoke-direct {v6, v1}, Lz3/a;-><init>(F)V

    .line 615
    .line 616
    .line 617
    iput-object v6, v3, Lz3/n;->h:Lz3/d;

    .line 618
    .line 619
    invoke-virtual {v3}, Lz3/n;->a()Lz3/o;

    .line 620
    .line 621
    .line 622
    move-result-object v1

    .line 623
    invoke-virtual {v4, v1}, Lz3/k;->setShapeAppearanceModel(Lz3/o;)V

    .line 624
    .line 625
    .line 626
    :cond_1b
    invoke-virtual {v2, v5}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    move-result v1

    .line 630
    if-nez v1, :cond_1c

    .line 631
    .line 632
    invoke-virtual {v4, v5}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 633
    .line 634
    .line 635
    :cond_1c
    :goto_14
    return-void
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

.method public final onStateChange([I)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onStateChange([I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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
.end method

.method public final setAlpha(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Ld3/a;->f:Ld3/c;

    .line 2
    .line 3
    iget-object v1, v0, Ld3/c;->a:Ld3/b;

    .line 4
    .line 5
    iput p1, v1, Ld3/b;->j:I

    .line 6
    .line 7
    iget-object v0, v0, Ld3/c;->b:Ld3/b;

    .line 8
    .line 9
    iput p1, v0, Ld3/b;->j:I

    .line 10
    .line 11
    iget-object p1, p0, Ld3/a;->d:Ls3/j;

    .line 12
    .line 13
    iget-object p1, p1, Ls3/j;->a:Landroid/text/TextPaint;

    .line 14
    .line 15
    invoke-virtual {p0}, Ld3/a;->getAlpha()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 23
    .line 24
    .line 25
    return-void
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
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
.end method
