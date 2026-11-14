.class public Lcom/example/navistart/TestSpaceActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# static fields
.field public static final synthetic h:I


# instance fields
.field public b:Landroid/widget/TextView;

.field public c:Landroid/widget/ScrollView;

.field public d:Landroidx/appcompat/widget/SwitchCompat;

.field public e:Z

.field public f:Landroid/widget/EditText;

.field public g:Landroidx/fragment/app/h;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/example/navistart/TestSpaceActivity;->e:Z

    .line 6
    .line 7
    return-void
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
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const p1, 0x7f0c0116

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    .line 8
    .line 9
    .line 10
    const p1, 0x7f090117

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Landroid/widget/Button;

    .line 18
    .line 19
    const v0, 0x7f090118

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/widget/Button;

    .line 27
    .line 28
    const v1, 0x7f0902ad

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Landroid/widget/TextView;

    .line 36
    .line 37
    iput-object v1, p0, Lcom/example/navistart/TestSpaceActivity;->b:Landroid/widget/TextView;

    .line 38
    .line 39
    const v1, 0x7f0902ac

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Landroid/widget/ScrollView;

    .line 47
    .line 48
    iput-object v1, p0, Lcom/example/navistart/TestSpaceActivity;->c:Landroid/widget/ScrollView;

    .line 49
    .line 50
    const v1, 0x7f090130

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Landroid/widget/Button;

    .line 58
    .line 59
    new-instance v2, Le0/u2;

    .line 60
    .line 61
    const/4 v3, 0x0

    .line 62
    invoke-direct {v2, p0, v3}, Le0/u2;-><init>(Lcom/example/navistart/TestSpaceActivity;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 66
    .line 67
    .line 68
    const v1, 0x7f090131

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    new-instance v2, Le0/u2;

    .line 76
    .line 77
    const/4 v3, 0x1

    .line 78
    invoke-direct {v2, p0, v3}, Le0/u2;-><init>(Lcom/example/navistart/TestSpaceActivity;I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 82
    .line 83
    .line 84
    const v1, 0x7f0904c6

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, Landroidx/appcompat/widget/SwitchCompat;

    .line 92
    .line 93
    iput-object v1, p0, Lcom/example/navistart/TestSpaceActivity;->d:Landroidx/appcompat/widget/SwitchCompat;

    .line 94
    .line 95
    invoke-static {}, Lh0/b;->o()Lu0/a;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    const/16 v4, 0x12

    .line 100
    .line 101
    new-array v4, v4, [B

    .line 102
    .line 103
    fill-array-data v4, :array_0

    .line 104
    .line 105
    .line 106
    const/16 v5, 0x8

    .line 107
    .line 108
    new-array v5, v5, [B

    .line 109
    .line 110
    fill-array-data v5, :array_1

    .line 111
    .line 112
    .line 113
    invoke-static {v4, v5}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-virtual {v2, v4, v3}, Lu0/a;->loadBoolean(Ljava/lang/String;Z)Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 122
    .line 123
    .line 124
    iget-object v1, p0, Lcom/example/navistart/TestSpaceActivity;->d:Landroidx/appcompat/widget/SwitchCompat;

    .line 125
    .line 126
    new-instance v2, Le0/k0;

    .line 127
    .line 128
    const/16 v3, 0x1c

    .line 129
    .line 130
    invoke-direct {v2, v3}, Le0/k0;-><init>(I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 134
    .line 135
    .line 136
    new-instance v1, Le0/u2;

    .line 137
    .line 138
    const/4 v2, 0x2

    .line 139
    invoke-direct {v1, p0, v2}, Le0/u2;-><init>(Lcom/example/navistart/TestSpaceActivity;I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 143
    .line 144
    .line 145
    new-instance p1, Le0/o1;

    .line 146
    .line 147
    invoke-direct {p1, p0}, Le0/o1;-><init>(Lcom/example/navistart/TestSpaceActivity;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 151
    .line 152
    .line 153
    const p1, 0x7f090201

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    check-cast p1, Landroid/widget/EditText;

    .line 161
    .line 162
    iput-object p1, p0, Lcom/example/navistart/TestSpaceActivity;->f:Landroid/widget/EditText;

    .line 163
    .line 164
    new-instance p1, Landroidx/fragment/app/h;

    .line 165
    .line 166
    const/4 v0, 0x7

    .line 167
    invoke-direct {p1, v0, p0}, Landroidx/fragment/app/h;-><init>(ILjava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    iput-object p1, p0, Lcom/example/navistart/TestSpaceActivity;->g:Landroidx/fragment/app/h;

    .line 171
    .line 172
    const p1, 0x7f090116

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    check-cast p1, Landroid/widget/Button;

    .line 180
    .line 181
    new-instance v0, Landroidx/navigation/ui/a;

    .line 182
    .line 183
    const/4 v1, 0x4

    .line 184
    invoke-direct {v0, v1, p0, p1}, Landroidx/navigation/ui/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 188
    .line 189
    .line 190
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-virtual {p1}, Lh0/b;->b()Ld2/h;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    iput-object p0, p1, Ld2/h;->a:Ljava/lang/Object;

    .line 199
    .line 200
    return-void

    .line 201
    :array_0
    .array-data 1
        -0x18t
        -0x5t
        0x13t
        -0x36t
        -0x5bt
        0x72t
        -0x54t
        0x38t
        -0x27t
        -0x9t
        0x15t
        -0x2ft
        -0x5at
        0x73t
        -0x54t
        0x32t
        -0x18t
        -0x14t
    .end array-data

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
    nop

    .line 215
    :array_1
    .array-data 1
        -0x65t
        -0x68t
        0x61t
        -0x5bt
        -0x37t
        0x1et
        -0x8t
        0x57t
    .end array-data
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
.end method

.method public final onDestroy()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/example/navistart/TestSpaceActivity;->e:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lh0/b;->j()Lcom/example/navistart/cores/InterC;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0, v1}, Lcom/example/navistart/cores/InterC;->sl(Lcom/example/navistart/cores/LCRI;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lcom/example/navistart/TestSpaceActivity;->e:Z

    .line 19
    .line 20
    :cond_0
    iput-object v1, p0, Lcom/example/navistart/TestSpaceActivity;->g:Landroidx/fragment/app/h;

    .line 21
    .line 22
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

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
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lh0/b;->b()Ld2/h;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    iput-object v1, v0, Ld2/h;->a:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lh0/b;->b()Ld2/h;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object p0, v0, Ld2/h;->a:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 15
    .line 16
    .line 17
    sget-object v0, Lh0/b;->j:Ld2/h;

    .line 18
    .line 19
    invoke-virtual {v0}, Ld2/h;->o()V

    .line 20
    .line 21
    .line 22
    return-void
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
.end method
