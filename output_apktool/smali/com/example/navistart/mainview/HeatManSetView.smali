.class public Lcom/example/navistart/mainview/HeatManSetView;
.super Landroidx/cardview/widget/CardView;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# static fields
.field public static final synthetic t:I


# instance fields
.field public b:Z

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:I

.field public f:I

.field public final g:Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;

.field public final h:I

.field public final i:I

.field public j:I

.field public final k:Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;

.field public l:I

.field public final m:Landroid/widget/ProgressBar;

.field public final n:Ljava/lang/String;

.field public final o:Ljava/lang/String;

.field public final p:Ljava/lang/String;

.field public q:Ljava/lang/Runnable;

.field public r:Ljava/lang/Runnable;

.field public s:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 9
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
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/example/navistart/mainview/HeatManSetView;->b:Z

    .line 6
    .line 7
    const-string v1, ""

    .line 8
    .line 9
    iput-object v1, p0, Lcom/example/navistart/mainview/HeatManSetView;->c:Ljava/lang/String;

    .line 10
    .line 11
    iput-object v1, p0, Lcom/example/navistart/mainview/HeatManSetView;->n:Ljava/lang/String;

    .line 12
    .line 13
    iput-object v1, p0, Lcom/example/navistart/mainview/HeatManSetView;->o:Ljava/lang/String;

    .line 14
    .line 15
    iput-object v1, p0, Lcom/example/navistart/mainview/HeatManSetView;->p:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sget-object v2, Le0/l2;->c:[I

    .line 22
    .line 23
    invoke-virtual {v1, p2, v2, v0, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    :try_start_0
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iput-object v1, p0, Lcom/example/navistart/mainview/HeatManSetView;->n:Ljava/lang/String;

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iput-object v2, p0, Lcom/example/navistart/mainview/HeatManSetView;->c:Ljava/lang/String;

    .line 39
    .line 40
    const/16 v2, 0xd

    .line 41
    .line 42
    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    iput v2, p0, Lcom/example/navistart/mainview/HeatManSetView;->f:I

    .line 47
    .line 48
    const/16 v2, 0xa

    .line 49
    .line 50
    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    iput v2, p0, Lcom/example/navistart/mainview/HeatManSetView;->d:I

    .line 55
    .line 56
    const/16 v2, 0x14

    .line 57
    .line 58
    const/16 v3, 0xc

    .line 59
    .line 60
    invoke-virtual {p2, v3, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    iput v2, p0, Lcom/example/navistart/mainview/HeatManSetView;->e:I

    .line 65
    .line 66
    const/16 v2, 0xb

    .line 67
    .line 68
    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 69
    .line 70
    .line 71
    const/4 v2, 0x6

    .line 72
    const/16 v3, -0x28

    .line 73
    .line 74
    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    iput v2, p0, Lcom/example/navistart/mainview/HeatManSetView;->h:I

    .line 79
    .line 80
    const/16 v2, 0x28

    .line 81
    .line 82
    const/16 v3, 0x8

    .line 83
    .line 84
    invoke-virtual {p2, v3, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    iput v2, p0, Lcom/example/navistart/mainview/HeatManSetView;->i:I

    .line 89
    .line 90
    const/16 v2, 0x9

    .line 91
    .line 92
    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    iput v4, p0, Lcom/example/navistart/mainview/HeatManSetView;->j:I

    .line 97
    .line 98
    const/4 v4, 0x7

    .line 99
    invoke-virtual {p2, v4, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 100
    .line 101
    .line 102
    const/4 v4, 0x3

    .line 103
    invoke-virtual {p2, v4, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    iput v4, p0, Lcom/example/navistart/mainview/HeatManSetView;->l:I

    .line 108
    .line 109
    const/16 v4, 0xe

    .line 110
    .line 111
    invoke-virtual {p2, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    iput-object v5, p0, Lcom/example/navistart/mainview/HeatManSetView;->o:Ljava/lang/String;

    .line 116
    .line 117
    const/16 v5, 0xf

    .line 118
    .line 119
    invoke-virtual {p2, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    iput-object v5, p0, Lcom/example/navistart/mainview/HeatManSetView;->p:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    .line 125
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 126
    .line 127
    .line 128
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    const v5, 0x7f0c0034

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, v5, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    const p2, 0x7f09016c

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    check-cast p2, Landroid/widget/TextView;

    .line 146
    .line 147
    iget-object v5, p0, Lcom/example/navistart/mainview/HeatManSetView;->c:Ljava/lang/String;

    .line 148
    .line 149
    invoke-virtual {p2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 150
    .line 151
    .line 152
    const p2, 0x7f090442

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    check-cast p2, Landroid/widget/ImageView;

    .line 160
    .line 161
    const v5, 0x7f090443

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    check-cast v5, Landroid/widget/ProgressBar;

    .line 169
    .line 170
    iput-object v5, p0, Lcom/example/navistart/mainview/HeatManSetView;->m:Landroid/widget/ProgressBar;

    .line 171
    .line 172
    iget v5, p0, Lcom/example/navistart/mainview/HeatManSetView;->l:I

    .line 173
    .line 174
    invoke-virtual {p0, v5}, Lcom/example/navistart/mainview/HeatManSetView;->setLevel(I)V

    .line 175
    .line 176
    .line 177
    const v5, 0x7f09050d

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    check-cast v5, Landroid/widget/ImageView;

    .line 185
    .line 186
    iget-object v6, p0, Lcom/example/navistart/mainview/HeatManSetView;->n:Ljava/lang/String;

    .line 187
    .line 188
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    const v8, 0x7f070085

    .line 193
    .line 194
    .line 195
    sparse-switch v7, :sswitch_data_0

    .line 196
    .line 197
    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :sswitch_0
    new-array v4, v4, [B

    .line 201
    .line 202
    fill-array-data v4, :array_0

    .line 203
    .line 204
    .line 205
    new-array v7, v3, [B

    .line 206
    .line 207
    fill-array-data v7, :array_1

    .line 208
    .line 209
    .line 210
    invoke-static {v4, v7}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    if-eqz v4, :cond_0

    .line 219
    .line 220
    const v4, 0x7f0700b1

    .line 221
    .line 222
    .line 223
    invoke-virtual {p2, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v5, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 227
    .line 228
    .line 229
    iget-object v4, p0, Lcom/example/navistart/mainview/HeatManSetView;->m:Landroid/widget/ProgressBar;

    .line 230
    .line 231
    invoke-virtual {v4, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 232
    .line 233
    .line 234
    iget-object v4, p0, Lcom/example/navistart/mainview/HeatManSetView;->m:Landroid/widget/ProgressBar;

    .line 235
    .line 236
    invoke-static {v4}, Lorg/apache/commons/net/util/a;->v(Landroid/widget/ProgressBar;)V

    .line 237
    .line 238
    .line 239
    iget v4, p0, Lcom/example/navistart/mainview/HeatManSetView;->l:I

    .line 240
    .line 241
    invoke-virtual {p0, v4}, Lcom/example/navistart/mainview/HeatManSetView;->setLevel(I)V

    .line 242
    .line 243
    .line 244
    goto/16 :goto_0

    .line 245
    .line 246
    :sswitch_1
    new-array v4, v2, [B

    .line 247
    .line 248
    fill-array-data v4, :array_2

    .line 249
    .line 250
    .line 251
    new-array v5, v3, [B

    .line 252
    .line 253
    fill-array-data v5, :array_3

    .line 254
    .line 255
    .line 256
    invoke-static {v4, v5}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v4

    .line 264
    if-eqz v4, :cond_0

    .line 265
    .line 266
    const v4, 0x7f07014b

    .line 267
    .line 268
    .line 269
    invoke-virtual {p2, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 270
    .line 271
    .line 272
    iget-object v4, p0, Lcom/example/navistart/mainview/HeatManSetView;->m:Landroid/widget/ProgressBar;

    .line 273
    .line 274
    invoke-virtual {v4, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 275
    .line 276
    .line 277
    iget-object v4, p0, Lcom/example/navistart/mainview/HeatManSetView;->m:Landroid/widget/ProgressBar;

    .line 278
    .line 279
    invoke-static {v4}, Lorg/apache/commons/net/util/a;->v(Landroid/widget/ProgressBar;)V

    .line 280
    .line 281
    .line 282
    iget v4, p0, Lcom/example/navistart/mainview/HeatManSetView;->l:I

    .line 283
    .line 284
    invoke-virtual {p0, v4}, Lcom/example/navistart/mainview/HeatManSetView;->setLevel(I)V

    .line 285
    .line 286
    .line 287
    goto/16 :goto_0

    .line 288
    .line 289
    :sswitch_2
    new-array v4, v4, [B

    .line 290
    .line 291
    fill-array-data v4, :array_4

    .line 292
    .line 293
    .line 294
    new-array v7, v3, [B

    .line 295
    .line 296
    fill-array-data v7, :array_5

    .line 297
    .line 298
    .line 299
    invoke-static {v4, v7}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    if-eqz v4, :cond_0

    .line 308
    .line 309
    const v4, 0x7f0700c3

    .line 310
    .line 311
    .line 312
    invoke-virtual {p2, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v5, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 316
    .line 317
    .line 318
    iget-object v4, p0, Lcom/example/navistart/mainview/HeatManSetView;->m:Landroid/widget/ProgressBar;

    .line 319
    .line 320
    invoke-virtual {v4, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 321
    .line 322
    .line 323
    iget-object v4, p0, Lcom/example/navistart/mainview/HeatManSetView;->m:Landroid/widget/ProgressBar;

    .line 324
    .line 325
    invoke-static {v4}, Lorg/apache/commons/net/util/a;->v(Landroid/widget/ProgressBar;)V

    .line 326
    .line 327
    .line 328
    iget v4, p0, Lcom/example/navistart/mainview/HeatManSetView;->l:I

    .line 329
    .line 330
    invoke-virtual {p0, v4}, Lcom/example/navistart/mainview/HeatManSetView;->setLevel(I)V

    .line 331
    .line 332
    .line 333
    goto/16 :goto_0

    .line 334
    .line 335
    :sswitch_3
    new-array v4, v3, [B

    .line 336
    .line 337
    fill-array-data v4, :array_6

    .line 338
    .line 339
    .line 340
    new-array v7, v3, [B

    .line 341
    .line 342
    fill-array-data v7, :array_7

    .line 343
    .line 344
    .line 345
    invoke-static {v4, v7}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v4

    .line 349
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result v4

    .line 353
    if-eqz v4, :cond_0

    .line 354
    .line 355
    const v4, 0x7f0700b2

    .line 356
    .line 357
    .line 358
    invoke-virtual {p2, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v5, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 362
    .line 363
    .line 364
    iget-object v4, p0, Lcom/example/navistart/mainview/HeatManSetView;->m:Landroid/widget/ProgressBar;

    .line 365
    .line 366
    const v5, 0x7f05006f

    .line 367
    .line 368
    .line 369
    invoke-static {p1, v5}, Landroidx/core/content/ContextCompat;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 370
    .line 371
    .line 372
    move-result-object v5

    .line 373
    invoke-virtual {v4, v5}, Landroid/widget/ProgressBar;->setProgressTintList(Landroid/content/res/ColorStateList;)V

    .line 374
    .line 375
    .line 376
    goto :goto_0

    .line 377
    :sswitch_4
    new-array v4, v3, [B

    .line 378
    .line 379
    fill-array-data v4, :array_8

    .line 380
    .line 381
    .line 382
    new-array v7, v3, [B

    .line 383
    .line 384
    fill-array-data v7, :array_9

    .line 385
    .line 386
    .line 387
    invoke-static {v4, v7}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    move-result v4

    .line 395
    if-eqz v4, :cond_0

    .line 396
    .line 397
    const v4, 0x7f0700bc

    .line 398
    .line 399
    .line 400
    invoke-virtual {p2, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 401
    .line 402
    .line 403
    const v4, 0x7f070086

    .line 404
    .line 405
    .line 406
    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 407
    .line 408
    .line 409
    iget-object v4, p0, Lcom/example/navistart/mainview/HeatManSetView;->m:Landroid/widget/ProgressBar;

    .line 410
    .line 411
    const v5, 0x7f0503e8

    .line 412
    .line 413
    .line 414
    invoke-static {p1, v5}, Landroidx/core/content/ContextCompat;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 415
    .line 416
    .line 417
    move-result-object v5

    .line 418
    invoke-virtual {v4, v5}, Landroid/widget/ProgressBar;->setProgressTintList(Landroid/content/res/ColorStateList;)V

    .line 419
    .line 420
    .line 421
    goto :goto_0

    .line 422
    :sswitch_5
    new-array v4, v2, [B

    .line 423
    .line 424
    fill-array-data v4, :array_a

    .line 425
    .line 426
    .line 427
    new-array v7, v3, [B

    .line 428
    .line 429
    fill-array-data v7, :array_b

    .line 430
    .line 431
    .line 432
    invoke-static {v4, v7}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v4

    .line 436
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result v4

    .line 440
    if-eqz v4, :cond_0

    .line 441
    .line 442
    const v4, 0x7f0700ad

    .line 443
    .line 444
    .line 445
    invoke-virtual {p2, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v5, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 449
    .line 450
    .line 451
    iget-object v4, p0, Lcom/example/navistart/mainview/HeatManSetView;->m:Landroid/widget/ProgressBar;

    .line 452
    .line 453
    invoke-virtual {v4, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 454
    .line 455
    .line 456
    iget-object v4, p0, Lcom/example/navistart/mainview/HeatManSetView;->m:Landroid/widget/ProgressBar;

    .line 457
    .line 458
    invoke-static {v4}, Lorg/apache/commons/net/util/a;->v(Landroid/widget/ProgressBar;)V

    .line 459
    .line 460
    .line 461
    iget v4, p0, Lcom/example/navistart/mainview/HeatManSetView;->l:I

    .line 462
    .line 463
    invoke-virtual {p0, v4}, Lcom/example/navistart/mainview/HeatManSetView;->setLevel(I)V

    .line 464
    .line 465
    .line 466
    :cond_0
    :goto_0
    new-instance v4, Landroidx/navigation/c;

    .line 467
    .line 468
    const/16 v5, 0x13

    .line 469
    .line 470
    invoke-direct {v4, v5, p0}, Landroidx/navigation/c;-><init>(ILjava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {p2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 474
    .line 475
    .line 476
    const p2, 0x7f090575

    .line 477
    .line 478
    .line 479
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 480
    .line 481
    .line 482
    move-result-object p2

    .line 483
    check-cast p2, Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;

    .line 484
    .line 485
    iput-object p2, p0, Lcom/example/navistart/mainview/HeatManSetView;->g:Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;

    .line 486
    .line 487
    iget v4, p0, Lcom/example/navistart/mainview/HeatManSetView;->d:I

    .line 488
    .line 489
    invoke-static {p2, v4}, Lorg/apache/commons/net/util/a;->w(Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;I)V

    .line 490
    .line 491
    .line 492
    iget-object p2, p0, Lcom/example/navistart/mainview/HeatManSetView;->g:Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;

    .line 493
    .line 494
    iget v4, p0, Lcom/example/navistart/mainview/HeatManSetView;->e:I

    .line 495
    .line 496
    invoke-virtual {p2, v4}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 497
    .line 498
    .line 499
    iget p2, p0, Lcom/example/navistart/mainview/HeatManSetView;->f:I

    .line 500
    .line 501
    invoke-virtual {p0, p2}, Lcom/example/navistart/mainview/HeatManSetView;->setTimeValue(I)V

    .line 502
    .line 503
    .line 504
    const p2, 0x7f090576

    .line 505
    .line 506
    .line 507
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 508
    .line 509
    .line 510
    move-result-object p2

    .line 511
    check-cast p2, Landroid/widget/TextView;

    .line 512
    .line 513
    new-array v4, v2, [B

    .line 514
    .line 515
    fill-array-data v4, :array_c

    .line 516
    .line 517
    .line 518
    new-array v5, v3, [B

    .line 519
    .line 520
    fill-array-data v5, :array_d

    .line 521
    .line 522
    .line 523
    invoke-static {v4, v5}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v4

    .line 527
    iget-object v5, p0, Lcom/example/navistart/mainview/HeatManSetView;->n:Ljava/lang/String;

    .line 528
    .line 529
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    move-result v4

    .line 533
    iget v5, p0, Lcom/example/navistart/mainview/HeatManSetView;->f:I

    .line 534
    .line 535
    if-eqz v4, :cond_1

    .line 536
    .line 537
    invoke-static {v5}, Lcom/example/navistart/mainview/HeatManSetView;->b(I)Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v4

    .line 541
    invoke-virtual {p2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 542
    .line 543
    .line 544
    goto :goto_1

    .line 545
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    .line 546
    .line 547
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 551
    .line 552
    .line 553
    const/4 v5, 0x2

    .line 554
    new-array v5, v5, [B

    .line 555
    .line 556
    fill-array-data v5, :array_e

    .line 557
    .line 558
    .line 559
    new-array v6, v3, [B

    .line 560
    .line 561
    fill-array-data v6, :array_f

    .line 562
    .line 563
    .line 564
    invoke-static {v5, v6}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v5

    .line 568
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v4

    .line 575
    invoke-virtual {p2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 576
    .line 577
    .line 578
    :goto_1
    iget-object v4, p0, Lcom/example/navistart/mainview/HeatManSetView;->g:Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;

    .line 579
    .line 580
    new-instance v5, Lt1/f;

    .line 581
    .line 582
    invoke-direct {v5, p0, p2, v0}, Lt1/f;-><init>(Lcom/example/navistart/mainview/HeatManSetView;Landroid/widget/TextView;I)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v4, v5}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 586
    .line 587
    .line 588
    const p2, 0x7f09050c

    .line 589
    .line 590
    .line 591
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 592
    .line 593
    .line 594
    move-result-object p2

    .line 595
    check-cast p2, Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;

    .line 596
    .line 597
    iput-object p2, p0, Lcom/example/navistart/mainview/HeatManSetView;->k:Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;

    .line 598
    .line 599
    iget v4, p0, Lcom/example/navistart/mainview/HeatManSetView;->h:I

    .line 600
    .line 601
    invoke-static {p2, v4}, Lorg/apache/commons/net/util/a;->w(Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;I)V

    .line 602
    .line 603
    .line 604
    iget-object p2, p0, Lcom/example/navistart/mainview/HeatManSetView;->k:Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;

    .line 605
    .line 606
    iget v4, p0, Lcom/example/navistart/mainview/HeatManSetView;->i:I

    .line 607
    .line 608
    invoke-virtual {p2, v4}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 609
    .line 610
    .line 611
    iget p2, p0, Lcom/example/navistart/mainview/HeatManSetView;->j:I

    .line 612
    .line 613
    invoke-virtual {p0, p2}, Lcom/example/navistart/mainview/HeatManSetView;->setTemperatureValue(I)V

    .line 614
    .line 615
    .line 616
    const p2, 0x7f09050e

    .line 617
    .line 618
    .line 619
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 620
    .line 621
    .line 622
    move-result-object p2

    .line 623
    check-cast p2, Landroid/widget/TextView;

    .line 624
    .line 625
    new-array v2, v2, [B

    .line 626
    .line 627
    fill-array-data v2, :array_10

    .line 628
    .line 629
    .line 630
    new-array v3, v3, [B

    .line 631
    .line 632
    fill-array-data v3, :array_11

    .line 633
    .line 634
    .line 635
    invoke-static {v2, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v2

    .line 639
    iget-object v3, p0, Lcom/example/navistart/mainview/HeatManSetView;->n:Ljava/lang/String;

    .line 640
    .line 641
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 642
    .line 643
    .line 644
    move-result v2

    .line 645
    iget v3, p0, Lcom/example/navistart/mainview/HeatManSetView;->j:I

    .line 646
    .line 647
    if-eqz v2, :cond_2

    .line 648
    .line 649
    invoke-static {v3}, Lcom/example/navistart/mainview/HeatManSetView;->b(I)Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 654
    .line 655
    .line 656
    goto :goto_2

    .line 657
    :cond_2
    invoke-static {v3}, Lcom/example/navistart/mainview/HeatManSetView;->a(I)Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v2

    .line 661
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 662
    .line 663
    .line 664
    :goto_2
    iget-object v2, p0, Lcom/example/navistart/mainview/HeatManSetView;->k:Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;

    .line 665
    .line 666
    new-instance v3, Lt1/f;

    .line 667
    .line 668
    invoke-direct {v3, p0, p2, v1}, Lt1/f;-><init>(Lcom/example/navistart/mainview/HeatManSetView;Landroid/widget/TextView;I)V

    .line 669
    .line 670
    .line 671
    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 672
    .line 673
    .line 674
    const p2, 0x7f090228

    .line 675
    .line 676
    .line 677
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 678
    .line 679
    .line 680
    move-result-object p2

    .line 681
    check-cast p2, Landroid/widget/ImageView;

    .line 682
    .line 683
    new-instance p2, Landroidx/navigation/ui/a;

    .line 684
    .line 685
    const/16 v1, 0x15

    .line 686
    .line 687
    invoke-direct {p2, v1, p0, p1}, Landroidx/navigation/ui/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 688
    .line 689
    .line 690
    invoke-virtual {p0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 691
    .line 692
    .line 693
    invoke-virtual {p0, v0}, Landroid/view/View;->setSaveEnabled(Z)V

    .line 694
    .line 695
    .line 696
    invoke-virtual {p0, v0}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 697
    .line 698
    .line 699
    return-void

    .line 700
    :catchall_0
    move-exception p1

    .line 701
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 702
    .line 703
    .line 704
    throw p1

    .line 705
    :sswitch_data_0
    .sparse-switch
        -0x7ac0acd5 -> :sswitch_5
        -0x79468f86 -> :sswitch_4
        -0x3dc603cb -> :sswitch_3
        -0x121d8c5f -> :sswitch_2
        0x7a993eb5 -> :sswitch_1
        0x7c6d34c4 -> :sswitch_0
    .end sparse-switch

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
    :array_0
    .array-data 1
        -0x4at
        -0x44t
        0x49t
        0x54t
        0x56t
        0xct
        -0x36t
        0x6bt
        -0x77t
        -0x50t
        0x46t
        0x44t
        0x6bt
        0x1et
    .end array-data

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
    nop

    .line 743
    :array_1
    .array-data 1
        -0x2t
        -0x27t
        0x28t
        0x20t
        0x4t
        0x69t
        -0x55t
        0x19t
    .end array-data

    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    :array_2
    .array-data 1
        0x46t
        -0x4dt
        0x67t
        -0x73t
        -0x67t
        -0x48t
        0xbt
        0x61t
        0x66t
    .end array-data

    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    nop

    .line 761
    :array_3
    .array-data 1
        0x12t
        -0x26t
        0xat
        -0x18t
        -0x15t
        -0x10t
        0x6et
        0x0t
    .end array-data

    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    :array_4
    .array-data 1
        -0x26t
        0x21t
        0x7at
        0x44t
        0x6ft
        -0x5dt
        -0x53t
        0x3et
        -0x1ft
        0x2ct
        0x72t
        0x55t
        0x54t
        -0x52t
    .end array-data

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
    nop

    .line 781
    :array_5
    .array-data 1
        -0x6et
        0x44t
        0x1bt
        0x30t
        0x38t
        -0x36t
        -0x3dt
        0x5at
    .end array-data

    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    :array_6
    .array-data 1
        -0x4bt
        -0x40t
        -0x7et
        0x6at
        -0x11t
        0x57t
        0x5et
        -0x7et
    .end array-data

    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    :array_7
    .array-data 1
        -0x3t
        -0x5bt
        -0x1dt
        0x1et
        -0x44t
        0x32t
        0x3ft
        -0xat
    .end array-data

    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    :array_8
    .array-data 1
        0x48t
        -0x5t
        -0x5ft
        -0x52t
        0x4at
        0x48t
        -0x6ct
        0x38t
    .end array-data

    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    :array_9
    .array-data 1
        0x1et
        -0x62t
        -0x31t
        -0x26t
        0x19t
        0x2dt
        -0xbt
        0x4ct
    .end array-data

    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    :array_a
    .array-data 1
        0x46t
        -0x7et
        -0x23t
        -0xet
        0x74t
        -0x7bt
        0x4at
        -0x10t
        0x62t
    .end array-data

    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    nop

    .line 831
    :array_b
    .array-data 1
        0xet
        -0x19t
        -0x44t
        -0x7at
        0x23t
        -0x13t
        0x2ft
        -0x6bt
    .end array-data

    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    :array_c
    .array-data 1
        0x3et
        -0x3ct
        -0x3ct
        0x62t
        -0x41t
        0x44t
        0x69t
        -0x3ct
        0x1et
    .end array-data

    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    nop

    .line 849
    :array_d
    .array-data 1
        0x6at
        -0x53t
        -0x57t
        0x7t
        -0x33t
        0xct
        0xct
        -0x5bt
    .end array-data

    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    :array_e
    .array-data 1
        0x60t
        -0xft
    .end array-data

    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    nop

    .line 863
    :array_f
    .array-data 1
        0x40t
        -0x64t
        0x65t
        0x32t
        0x55t
        0x4dt
        -0x68t
        0xct
    .end array-data

    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    :array_10
    .array-data 1
        0x5et
        -0x14t
        0x28t
        -0x7ct
        -0x26t
        0x43t
        -0x27t
        -0x66t
        0x7et
    .end array-data

    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    nop

    .line 881
    :array_11
    .array-data 1
        0xat
        -0x7bt
        0x45t
        -0x1ft
        -0x58t
        0xbt
        -0x44t
        -0x5t
    .end array-data
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
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
.end method

.method public static a(I)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x2

    .line 10
    new-array p0, p0, [B

    .line 11
    .line 12
    fill-array-data p0, :array_0

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x8

    .line 16
    .line 17
    new-array v1, v1, [B

    .line 18
    .line 19
    fill-array-data v1, :array_1

    .line 20
    .line 21
    .line 22
    invoke-static {p0, v1, v0}, Lcom/google/protobuf/q;->i([B[BLjava/lang/StringBuilder;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :array_0
    .array-data 1
        0x7et
        0x55t
    .end array-data

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    nop

    .line 33
    :array_1
    .array-data 1
        -0x44t
        -0x1bt
        0x1dt
        -0x4ft
        -0x80t
        0x1ct
        0x7at
        0x17t
    .end array-data
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

.method public static b(I)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    new-array p0, p0, [B

    .line 11
    .line 12
    const/16 v1, 0x6d

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    aput-byte v1, p0, v2

    .line 16
    .line 17
    const/16 v1, 0x8

    .line 18
    .line 19
    new-array v1, v1, [B

    .line 20
    .line 21
    fill-array-data v1, :array_0

    .line 22
    .line 23
    .line 24
    invoke-static {p0, v1, v0}, Lcom/google/protobuf/q;->i([B[BLjava/lang/StringBuilder;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :array_0
    .array-data 1
        0x0t
        -0x7ct
        -0x5dt
        0x17t
        -0x15t
        0x7at
        -0x53t
        0x33t
    .end array-data
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


# virtual methods
.method public getLevel()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/example/navistart/mainview/HeatManSetView;->l:I

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

.method public getTemperatureValue()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/example/navistart/mainview/HeatManSetView;->j:I

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

.method public getTimeValue()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/example/navistart/mainview/HeatManSetView;->f:I

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

.method public getisEnable()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/example/navistart/mainview/HeatManSetView;->b:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public setLevel(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/example/navistart/mainview/HeatManSetView;->m:Landroid/widget/ProgressBar;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getMax()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-gt p1, v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/example/navistart/mainview/HeatManSetView;->m:Landroid/widget/ProgressBar;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 12
    .line 13
    .line 14
    iput p1, p0, Lcom/example/navistart/mainview/HeatManSetView;->l:I

    .line 15
    .line 16
    if-lez p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, p0, Lcom/example/navistart/mainview/HeatManSetView;->b:Z

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    iput-boolean p1, p0, Lcom/example/navistart/mainview/HeatManSetView;->b:Z

    .line 24
    .line 25
    :cond_1
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

.method public setLevelRun(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/example/navistart/mainview/HeatManSetView;->q:Ljava/lang/Runnable;

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

.method public setTempRun(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/example/navistart/mainview/HeatManSetView;->s:Ljava/lang/Runnable;

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

.method public setTempSliderEnable(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/example/navistart/mainview/HeatManSetView;->k:Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/16 p1, 0x9

    .line 14
    .line 15
    new-array p1, p1, [B

    .line 16
    .line 17
    fill-array-data p1, :array_0

    .line 18
    .line 19
    .line 20
    const/16 v1, 0x8

    .line 21
    .line 22
    new-array v1, v1, [B

    .line 23
    .line 24
    fill-array-data v1, :array_1

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v1}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :array_0
    .array-data 1
        0x35t
        -0x3et
        0x3bt
        -0x53t
        -0x65t
        0x33t
        0x21t
        0x7bt
        0x57t
    .end array-data

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    nop

    .line 49
    :array_1
    .array-data 1
        0x16t
        -0x6t
        0x3t
        -0x14t
        -0x26t
        0x72t
        0x60t
        0x3at
    .end array-data
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

.method public setTemperatureValue(I)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/example/navistart/mainview/HeatManSetView;->k:Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getMax()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-gt p1, v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/example/navistart/mainview/HeatManSetView;->k:Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;

    .line 16
    .line 17
    invoke-static {v0}, Lorg/apache/commons/net/util/a;->a(Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-lt p1, v0, :cond_0

    .line 22
    .line 23
    iput p1, p0, Lcom/example/navistart/mainview/HeatManSetView;->j:I

    .line 24
    .line 25
    iget-object v0, p0, Lcom/example/navistart/mainview/HeatManSetView;->k:Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;->setProgress(I)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget-object p1, p0, Lcom/example/navistart/mainview/HeatManSetView;->k:Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;

    .line 32
    .line 33
    invoke-static {p1}, Lorg/apache/commons/net/util/a;->a(Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iput p1, p0, Lcom/example/navistart/mainview/HeatManSetView;->j:I

    .line 38
    .line 39
    iget-object v0, p0, Lcom/example/navistart/mainview/HeatManSetView;->k:Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;->setProgress(I)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
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

.method public setTimeRun(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/example/navistart/mainview/HeatManSetView;->r:Ljava/lang/Runnable;

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

.method public setTimeValue(I)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/example/navistart/mainview/HeatManSetView;->g:Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getMax()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-gt p1, v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/example/navistart/mainview/HeatManSetView;->g:Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;

    .line 16
    .line 17
    invoke-static {v0}, Lorg/apache/commons/net/util/a;->a(Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-lt p1, v0, :cond_0

    .line 22
    .line 23
    iput p1, p0, Lcom/example/navistart/mainview/HeatManSetView;->f:I

    .line 24
    .line 25
    iget-object v0, p0, Lcom/example/navistart/mainview/HeatManSetView;->g:Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;->setProgress(I)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget-object p1, p0, Lcom/example/navistart/mainview/HeatManSetView;->g:Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;

    .line 32
    .line 33
    invoke-static {p1}, Lorg/apache/commons/net/util/a;->a(Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iput p1, p0, Lcom/example/navistart/mainview/HeatManSetView;->f:I

    .line 38
    .line 39
    iget-object v0, p0, Lcom/example/navistart/mainview/HeatManSetView;->g:Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Lcom/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar;->setProgress(I)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
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

.method public setisEnable(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-virtual {p0, p1}, Lcom/example/navistart/mainview/HeatManSetView;->setLevel(I)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    invoke-virtual {p0, p1}, Lcom/example/navistart/mainview/HeatManSetView;->setLevel(I)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
