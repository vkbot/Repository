.class public Landroidx/constraintlayout/widget/Constraints$LayoutParams;
.super Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/widget/Constraints;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LayoutParams"
.end annotation


# instance fields
.field public alpha:F

.field public applyElevation:Z

.field public elevation:F

.field public rotation:F

.field public rotationX:F

.field public rotationY:F

.field public scaleX:F

.field public scaleY:F

.field public transformPivotX:F

.field public transformPivotY:F

.field public translationX:F

.field public translationY:F

.field public translationZ:F


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 234
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(II)V

    const/high16 p1, 0x3f800000    # 1.0f

    .line 235
    iput p1, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->alpha:F

    const/4 p2, 0x0

    .line 236
    iput-boolean p2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->applyElevation:Z

    const/4 p2, 0x0

    .line 237
    iput p2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->elevation:F

    .line 238
    iput p2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->rotation:F

    .line 239
    iput p2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->rotationX:F

    .line 240
    iput p2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->rotationY:F

    .line 241
    iput p1, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->scaleX:F

    .line 242
    iput p1, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->scaleY:F

    .line 243
    iput p2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->transformPivotX:F

    .line 244
    iput p2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->transformPivotY:F

    .line 245
    iput p2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->translationX:F

    .line 246
    iput p2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->translationY:F

    .line 247
    iput p2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->translationZ:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->alpha:F

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-boolean v1, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->applyElevation:Z

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->elevation:F

    .line 13
    .line 14
    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->rotation:F

    .line 15
    .line 16
    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->rotationX:F

    .line 17
    .line 18
    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->rotationY:F

    .line 19
    .line 20
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->scaleX:F

    .line 21
    .line 22
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->scaleY:F

    .line 23
    .line 24
    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->transformPivotX:F

    .line 25
    .line 26
    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->transformPivotY:F

    .line 27
    .line 28
    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->translationX:F

    .line 29
    .line 30
    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->translationY:F

    .line 31
    .line 32
    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->translationZ:F

    .line 33
    .line 34
    sget-object v0, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet:[I

    .line 35
    .line 36
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    :goto_0
    if-ge v1, p2, :cond_c

    .line 45
    .line 46
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    sget v2, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet_android_alpha:I

    .line 51
    .line 52
    if-ne v0, v2, :cond_0

    .line 53
    .line 54
    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->alpha:F

    .line 55
    .line 56
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->alpha:F

    .line 61
    .line 62
    goto/16 :goto_1

    .line 63
    .line 64
    :cond_0
    sget v2, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet_android_elevation:I

    .line 65
    .line 66
    if-ne v0, v2, :cond_1

    .line 67
    .line 68
    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->elevation:F

    .line 69
    .line 70
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->elevation:F

    .line 75
    .line 76
    const/4 v0, 0x1

    .line 77
    iput-boolean v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->applyElevation:Z

    .line 78
    .line 79
    goto/16 :goto_1

    .line 80
    .line 81
    :cond_1
    sget v2, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet_android_rotationX:I

    .line 82
    .line 83
    if-ne v0, v2, :cond_2

    .line 84
    .line 85
    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->rotationX:F

    .line 86
    .line 87
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->rotationX:F

    .line 92
    .line 93
    goto/16 :goto_1

    .line 94
    .line 95
    :cond_2
    sget v2, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet_android_rotationY:I

    .line 96
    .line 97
    if-ne v0, v2, :cond_3

    .line 98
    .line 99
    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->rotationY:F

    .line 100
    .line 101
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->rotationY:F

    .line 106
    .line 107
    goto/16 :goto_1

    .line 108
    .line 109
    :cond_3
    sget v2, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet_android_rotation:I

    .line 110
    .line 111
    if-ne v0, v2, :cond_4

    .line 112
    .line 113
    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->rotation:F

    .line 114
    .line 115
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->rotation:F

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_4
    sget v2, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet_android_scaleX:I

    .line 123
    .line 124
    if-ne v0, v2, :cond_5

    .line 125
    .line 126
    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->scaleX:F

    .line 127
    .line 128
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->scaleX:F

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_5
    sget v2, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet_android_scaleY:I

    .line 136
    .line 137
    if-ne v0, v2, :cond_6

    .line 138
    .line 139
    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->scaleY:F

    .line 140
    .line 141
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->scaleY:F

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_6
    sget v2, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet_android_transformPivotX:I

    .line 149
    .line 150
    if-ne v0, v2, :cond_7

    .line 151
    .line 152
    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->transformPivotX:F

    .line 153
    .line 154
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->transformPivotX:F

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_7
    sget v2, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet_android_transformPivotY:I

    .line 162
    .line 163
    if-ne v0, v2, :cond_8

    .line 164
    .line 165
    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->transformPivotY:F

    .line 166
    .line 167
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->transformPivotY:F

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_8
    sget v2, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet_android_translationX:I

    .line 175
    .line 176
    if-ne v0, v2, :cond_9

    .line 177
    .line 178
    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->translationX:F

    .line 179
    .line 180
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->translationX:F

    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_9
    sget v2, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet_android_translationY:I

    .line 188
    .line 189
    if-ne v0, v2, :cond_a

    .line 190
    .line 191
    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->translationY:F

    .line 192
    .line 193
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->translationY:F

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_a
    sget v2, Landroidx/constraintlayout/widget/R$styleable;->ConstraintSet_android_translationZ:I

    .line 201
    .line 202
    if-ne v0, v2, :cond_b

    .line 203
    .line 204
    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->translationZ:F

    .line 205
    .line 206
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->translationZ:F

    .line 211
    .line 212
    :cond_b
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 213
    .line 214
    goto/16 :goto_0

    .line 215
    .line 216
    :cond_c
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 217
    .line 218
    .line 219
    return-void
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

.method public constructor <init>(Landroidx/constraintlayout/widget/Constraints$LayoutParams;)V
    .locals 1

    .line 220
    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    const/high16 p1, 0x3f800000    # 1.0f

    .line 221
    iput p1, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->alpha:F

    const/4 v0, 0x0

    .line 222
    iput-boolean v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->applyElevation:Z

    const/4 v0, 0x0

    .line 223
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->elevation:F

    .line 224
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->rotation:F

    .line 225
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->rotationX:F

    .line 226
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->rotationY:F

    .line 227
    iput p1, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->scaleX:F

    .line 228
    iput p1, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->scaleY:F

    .line 229
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->transformPivotX:F

    .line 230
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->transformPivotY:F

    .line 231
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->translationX:F

    .line 232
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->translationY:F

    .line 233
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->translationZ:F

    return-void
.end method
