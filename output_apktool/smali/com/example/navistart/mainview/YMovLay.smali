.class public Lcom/example/navistart/mainview/YMovLay;
.super Landroidx/cardview/widget/CardView;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# instance fields
.field public final b:I

.field public final c:I

.field public final d:Ljava/lang/String;

.field public final e:Landroid/widget/ImageButton;

.field public final f:Landroid/widget/ImageButton;

.field public final g:Landroid/widget/ImageButton;

.field public final h:Landroid/widget/ImageButton;

.field public final i:Lcom/google/android/material/textfield/TextInputEditText;

.field public final j:Lcom/google/android/material/textfield/TextInputEditText;

.field public final k:I

.field public final l:Z

.field public final m:Landroid/widget/SeekBar;

.field public final n:Landroid/widget/SeekBar;

.field public final o:Landroid/widget/TextView;

.field public final p:Landroid/widget/TextView;

.field public final q:Landroid/view/View;

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:Lt1/p;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const v0, 0x7f0c0125

    .line 5
    .line 6
    .line 7
    iput v0, p0, Lcom/example/navistart/mainview/YMovLay;->b:I

    .line 8
    .line 9
    const-string v0, ""

    .line 10
    .line 11
    iput-object v0, p0, Lcom/example/navistart/mainview/YMovLay;->d:Ljava/lang/String;

    .line 12
    .line 13
    const/16 v0, -0x1f4

    .line 14
    .line 15
    iput v0, p0, Lcom/example/navistart/mainview/YMovLay;->r:I

    .line 16
    .line 17
    const/16 v1, 0x9c4

    .line 18
    .line 19
    iput v1, p0, Lcom/example/navistart/mainview/YMovLay;->s:I

    .line 20
    .line 21
    iput v0, p0, Lcom/example/navistart/mainview/YMovLay;->t:I

    .line 22
    .line 23
    iput v1, p0, Lcom/example/navistart/mainview/YMovLay;->u:I

    .line 24
    .line 25
    instance-of v0, p1, Lcom/example/navistart/ModernMainActivity;

    .line 26
    .line 27
    iput-boolean v0, p0, Lcom/example/navistart/mainview/YMovLay;->l:Z

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const v0, 0x7f0c00c7

    .line 32
    .line 33
    .line 34
    iput v0, p0, Lcom/example/navistart/mainview/YMovLay;->b:I

    .line 35
    .line 36
    :cond_0
    const/4 v0, 0x1

    .line 37
    const/4 v1, 0x2

    .line 38
    const/4 v2, 0x0

    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    sget-object v4, Le0/l2;->g:[I

    .line 46
    .line 47
    invoke-virtual {v3, p2, v4, v2, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    :try_start_0
    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    iput v3, p0, Lcom/example/navistart/mainview/YMovLay;->c:I

    .line 56
    .line 57
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    iput-object v3, p0, Lcom/example/navistart/mainview/YMovLay;->d:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    iput v3, p0, Lcom/example/navistart/mainview/YMovLay;->k:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception p1

    .line 74
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :cond_1
    :goto_0
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iget p2, p0, Lcom/example/navistart/mainview/YMovLay;->b:I

    .line 83
    .line 84
    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 85
    .line 86
    .line 87
    const p1, 0x7f090048

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    check-cast p1, Landroid/widget/TextView;

    .line 95
    .line 96
    if-eqz p1, :cond_2

    .line 97
    .line 98
    iget-object p2, p0, Lcom/example/navistart/mainview/YMovLay;->d:Ljava/lang/String;

    .line 99
    .line 100
    if-eqz p2, :cond_2

    .line 101
    .line 102
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 103
    .line 104
    .line 105
    :cond_2
    const p1, 0x7f09025d

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    check-cast p1, Landroid/widget/ImageView;

    .line 113
    .line 114
    if-eqz p1, :cond_3

    .line 115
    .line 116
    iget p2, p0, Lcom/example/navistart/mainview/YMovLay;->c:I

    .line 117
    .line 118
    if-eqz p2, :cond_3

    .line 119
    .line 120
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 121
    .line 122
    .line 123
    :cond_3
    const p1, 0x7f09006b

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 131
    .line 132
    iput-object p1, p0, Lcom/example/navistart/mainview/YMovLay;->i:Lcom/google/android/material/textfield/TextInputEditText;

    .line 133
    .line 134
    const p1, 0x7f09006c

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 142
    .line 143
    iput-object p1, p0, Lcom/example/navistart/mainview/YMovLay;->j:Lcom/google/android/material/textfield/TextInputEditText;

    .line 144
    .line 145
    const p1, 0x7f09054e

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    check-cast p1, Landroid/widget/TextView;

    .line 153
    .line 154
    const p2, 0x7f090344

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    check-cast p2, Landroid/widget/ImageButton;

    .line 162
    .line 163
    iput-object p2, p0, Lcom/example/navistart/mainview/YMovLay;->e:Landroid/widget/ImageButton;

    .line 164
    .line 165
    const p2, 0x7f090345

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    check-cast p2, Landroid/widget/ImageButton;

    .line 173
    .line 174
    iput-object p2, p0, Lcom/example/navistart/mainview/YMovLay;->f:Landroid/widget/ImageButton;

    .line 175
    .line 176
    const p2, 0x7f090346

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    check-cast p2, Landroid/widget/ImageButton;

    .line 184
    .line 185
    iput-object p2, p0, Lcom/example/navistart/mainview/YMovLay;->g:Landroid/widget/ImageButton;

    .line 186
    .line 187
    const p2, 0x7f090343

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    check-cast p2, Landroid/widget/ImageButton;

    .line 195
    .line 196
    iput-object p2, p0, Lcom/example/navistart/mainview/YMovLay;->h:Landroid/widget/ImageButton;

    .line 197
    .line 198
    iget-boolean p2, p0, Lcom/example/navistart/mainview/YMovLay;->l:Z

    .line 199
    .line 200
    if-eqz p2, :cond_4

    .line 201
    .line 202
    const p2, 0x7f090329

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 206
    .line 207
    .line 208
    move-result-object p2

    .line 209
    check-cast p2, Landroid/widget/SeekBar;

    .line 210
    .line 211
    iput-object p2, p0, Lcom/example/navistart/mainview/YMovLay;->m:Landroid/widget/SeekBar;

    .line 212
    .line 213
    const p2, 0x7f09032d

    .line 214
    .line 215
    .line 216
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 217
    .line 218
    .line 219
    move-result-object p2

    .line 220
    check-cast p2, Landroid/widget/SeekBar;

    .line 221
    .line 222
    iput-object p2, p0, Lcom/example/navistart/mainview/YMovLay;->n:Landroid/widget/SeekBar;

    .line 223
    .line 224
    const p2, 0x7f09032c

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 228
    .line 229
    .line 230
    move-result-object p2

    .line 231
    check-cast p2, Landroid/widget/TextView;

    .line 232
    .line 233
    iput-object p2, p0, Lcom/example/navistart/mainview/YMovLay;->o:Landroid/widget/TextView;

    .line 234
    .line 235
    const p2, 0x7f09032f

    .line 236
    .line 237
    .line 238
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 239
    .line 240
    .line 241
    move-result-object p2

    .line 242
    check-cast p2, Landroid/widget/TextView;

    .line 243
    .line 244
    iput-object p2, p0, Lcom/example/navistart/mainview/YMovLay;->p:Landroid/widget/TextView;

    .line 245
    .line 246
    const p2, 0x7f09032e

    .line 247
    .line 248
    .line 249
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 250
    .line 251
    .line 252
    move-result-object p2

    .line 253
    iput-object p2, p0, Lcom/example/navistart/mainview/YMovLay;->q:Landroid/view/View;

    .line 254
    .line 255
    iget-object p2, p0, Lcom/example/navistart/mainview/YMovLay;->m:Landroid/widget/SeekBar;

    .line 256
    .line 257
    iget-object v3, p0, Lcom/example/navistart/mainview/YMovLay;->o:Landroid/widget/TextView;

    .line 258
    .line 259
    new-instance v4, Lt1/o;

    .line 260
    .line 261
    invoke-direct {v4, p0, v0, v3}, Lt1/o;-><init>(Lcom/example/navistart/mainview/YMovLay;ZLandroid/widget/TextView;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p2, v4}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 265
    .line 266
    .line 267
    iget-object p2, p0, Lcom/example/navistart/mainview/YMovLay;->n:Landroid/widget/SeekBar;

    .line 268
    .line 269
    iget-object v3, p0, Lcom/example/navistart/mainview/YMovLay;->p:Landroid/widget/TextView;

    .line 270
    .line 271
    new-instance v4, Lt1/o;

    .line 272
    .line 273
    invoke-direct {v4, p0, v2, v3}, Lt1/o;-><init>(Lcom/example/navistart/mainview/YMovLay;ZLandroid/widget/TextView;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {p2, v4}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 277
    .line 278
    .line 279
    :cond_4
    iget p2, p0, Lcom/example/navistart/mainview/YMovLay;->k:I

    .line 280
    .line 281
    if-ne p2, v0, :cond_5

    .line 282
    .line 283
    const/16 p2, 0x8

    .line 284
    .line 285
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 286
    .line 287
    .line 288
    iget-object p1, p0, Lcom/example/navistart/mainview/YMovLay;->j:Lcom/google/android/material/textfield/TextInputEditText;

    .line 289
    .line 290
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 291
    .line 292
    .line 293
    iget-object p1, p0, Lcom/example/navistart/mainview/YMovLay;->g:Landroid/widget/ImageButton;

    .line 294
    .line 295
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 296
    .line 297
    .line 298
    iget-object p1, p0, Lcom/example/navistart/mainview/YMovLay;->h:Landroid/widget/ImageButton;

    .line 299
    .line 300
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 301
    .line 302
    .line 303
    iget-object p1, p0, Lcom/example/navistart/mainview/YMovLay;->i:Lcom/google/android/material/textfield/TextInputEditText;

    .line 304
    .line 305
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    check-cast p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 310
    .line 311
    const/4 v0, -0x2

    .line 312
    iput v0, p1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 313
    .line 314
    iget-object v0, p0, Lcom/example/navistart/mainview/YMovLay;->i:Lcom/google/android/material/textfield/TextInputEditText;

    .line 315
    .line 316
    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 317
    .line 318
    .line 319
    iget-boolean p1, p0, Lcom/example/navistart/mainview/YMovLay;->l:Z

    .line 320
    .line 321
    if-eqz p1, :cond_6

    .line 322
    .line 323
    iget-object p1, p0, Lcom/example/navistart/mainview/YMovLay;->q:Landroid/view/View;

    .line 324
    .line 325
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 326
    .line 327
    .line 328
    const p1, 0x7f09032a

    .line 329
    .line 330
    .line 331
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    check-cast p1, Landroid/widget/TextView;

    .line 336
    .line 337
    const p2, 0x7f1302c1

    .line 338
    .line 339
    .line 340
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    .line 341
    .line 342
    .line 343
    return-void

    .line 344
    :cond_5
    if-ne p2, v1, :cond_6

    .line 345
    .line 346
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 347
    .line 348
    .line 349
    iget-object p1, p0, Lcom/example/navistart/mainview/YMovLay;->j:Lcom/google/android/material/textfield/TextInputEditText;

    .line 350
    .line 351
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 352
    .line 353
    .line 354
    :cond_6
    return-void
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

.method public static b(Landroid/widget/ImageButton;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Lcom/google/android/material/datepicker/m;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p1}, Lcom/google/android/material/datepicker/m;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

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
.method public final a(IIII)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/example/navistart/mainview/YMovLay;->l:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Lcom/example/navistart/mainview/YMovLay;->r:I

    .line 7
    .line 8
    iput p2, p0, Lcom/example/navistart/mainview/YMovLay;->s:I

    .line 9
    .line 10
    iput p3, p0, Lcom/example/navistart/mainview/YMovLay;->t:I

    .line 11
    .line 12
    iput p4, p0, Lcom/example/navistart/mainview/YMovLay;->u:I

    .line 13
    .line 14
    sub-int/2addr p2, p1

    .line 15
    const/4 p1, 0x1

    .line 16
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    iget-object v0, p0, Lcom/example/navistart/mainview/YMovLay;->m:Landroid/widget/SeekBar;

    .line 21
    .line 22
    invoke-virtual {v0, p2}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 23
    .line 24
    .line 25
    sub-int/2addr p4, p3

    .line 26
    invoke-static {p1, p4}, Ljava/lang/Math;->max(II)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    iget-object p2, p0, Lcom/example/navistart/mainview/YMovLay;->n:Landroid/widget/SeekBar;

    .line 31
    .line 32
    invoke-virtual {p2, p1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/example/navistart/mainview/YMovLay;->getYLayMovX()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p0, p1}, Lcom/example/navistart/mainview/YMovLay;->setYLayMovX(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/example/navistart/mainview/YMovLay;->getYLayMovY()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p0, p1}, Lcom/example/navistart/mainview/YMovLay;->setYLayMovY(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void
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
.end method

.method public getYLayMovX()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/example/navistart/mainview/YMovLay;->i:Lcom/google/android/material/textfield/TextInputEditText;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
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

.method public getYLayMovY()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/example/navistart/mainview/YMovLay;->j:Lcom/google/android/material/textfield/TextInputEditText;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
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

.method public setOnSliderValueChangeListener(Lt1/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/example/navistart/mainview/YMovLay;->v:Lt1/p;

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
.end method

.method public setYLayMovX(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/example/navistart/mainview/YMovLay;->i:Lcom/google/android/material/textfield/TextInputEditText;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/example/navistart/mainview/YMovLay;->l:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    goto :goto_0

    .line 15
    :catch_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    iget v0, p0, Lcom/example/navistart/mainview/YMovLay;->r:I

    .line 17
    .line 18
    iget v1, p0, Lcom/example/navistart/mainview/YMovLay;->s:I

    .line 19
    .line 20
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/4 v3, 0x1

    .line 29
    sub-int/2addr v1, v0

    .line 30
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    iget-object v3, p0, Lcom/example/navistart/mainview/YMovLay;->m:Landroid/widget/SeekBar;

    .line 35
    .line 36
    invoke-virtual {v3, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 37
    .line 38
    .line 39
    sub-int/2addr v2, v0

    .line 40
    invoke-virtual {v3, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget-object v0, p0, Lcom/example/navistart/mainview/YMovLay;->o:Landroid/widget/TextView;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void
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

.method public setYLayMovY(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/example/navistart/mainview/YMovLay;->j:Lcom/google/android/material/textfield/TextInputEditText;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/example/navistart/mainview/YMovLay;->l:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    goto :goto_0

    .line 15
    :catch_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    iget v0, p0, Lcom/example/navistart/mainview/YMovLay;->t:I

    .line 17
    .line 18
    iget v1, p0, Lcom/example/navistart/mainview/YMovLay;->u:I

    .line 19
    .line 20
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/4 v3, 0x1

    .line 29
    sub-int/2addr v1, v0

    .line 30
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    iget-object v3, p0, Lcom/example/navistart/mainview/YMovLay;->n:Landroid/widget/SeekBar;

    .line 35
    .line 36
    invoke-virtual {v3, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 37
    .line 38
    .line 39
    sub-int/2addr v2, v0

    .line 40
    invoke-virtual {v3, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget-object v0, p0, Lcom/example/navistart/mainview/YMovLay;->p:Landroid/widget/TextView;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void
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

.method public setmovD(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/example/navistart/mainview/YMovLay;->h:Landroid/widget/ImageButton;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/example/navistart/mainview/YMovLay;->b(Landroid/widget/ImageButton;Ljava/lang/Runnable;)V

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

.method public setmovL(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/example/navistart/mainview/YMovLay;->e:Landroid/widget/ImageButton;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/example/navistart/mainview/YMovLay;->b(Landroid/widget/ImageButton;Ljava/lang/Runnable;)V

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

.method public setmovR(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/example/navistart/mainview/YMovLay;->f:Landroid/widget/ImageButton;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/example/navistart/mainview/YMovLay;->b(Landroid/widget/ImageButton;Ljava/lang/Runnable;)V

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

.method public setmovU(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/example/navistart/mainview/YMovLay;->g:Landroid/widget/ImageButton;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/example/navistart/mainview/YMovLay;->b(Landroid/widget/ImageButton;Ljava/lang/Runnable;)V

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
