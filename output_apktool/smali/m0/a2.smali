.class public final synthetic Lm0/a2;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lm0/c2;


# direct methods
.method public synthetic constructor <init>(Lm0/c2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lm0/a2;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Lm0/a2;->c:Lm0/c2;

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
    .locals 5

    .line 1
    iget p1, p0, Lm0/a2;->b:I

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    const/16 v1, 0x8

    .line 5
    .line 6
    iget-object v2, p0, Lm0/a2;->c:Lm0/c2;

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object p1, Lm0/c2;->i:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v0, 0x5

    .line 18
    new-array v0, v0, [B

    .line 19
    .line 20
    fill-array-data v0, :array_0

    .line 21
    .line 22
    .line 23
    new-array v1, v1, [B

    .line 24
    .line 25
    fill-array-data v1, :array_1

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    filled-new-array {v0}, [Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, Lm0/i1;->x([Ljava/lang/String;)Landroid/os/Bundle;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-class v1, Lm0/i1;

    .line 41
    .line 42
    invoke-static {p1, v1, v0}, Lcom/example/navistart/W;->u(Landroid/content/Context;Ljava/lang/Class;Landroid/os/Bundle;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_0
    iget-object p1, v2, Lm0/c2;->g:Ljava/util/ArrayList;

    .line 47
    .line 48
    iget-object v0, v2, Lm0/c2;->b:Landroid/widget/Spinner;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-ltz v0, :cond_2

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-lt v0, v1, :cond_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v2, p1}, Lm0/c2;->u(Ljava/lang/String;)Ljava/io/File;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-nez v0, :cond_1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    sget-object v1, Lm0/c2;->j:Ljava/lang/String;

    .line 81
    .line 82
    sget-object v2, Lm0/o0;->c:Ljava/lang/String;

    .line 83
    .line 84
    new-instance v2, Landroid/os/Bundle;

    .line 85
    .line 86
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 87
    .line 88
    .line 89
    sget-object v3, Lm0/o0;->c:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v2, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    sget-object p1, Lm0/o0;->d:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v2, p1, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    const-class p1, Lm0/o0;

    .line 100
    .line 101
    invoke-static {v0, p1, v2}, Lcom/example/navistart/W;->t(Landroid/content/Context;Ljava/lang/Class;Landroid/os/Bundle;)V

    .line 102
    .line 103
    .line 104
    :cond_2
    :goto_0
    return-void

    .line 105
    :pswitch_1
    iget-object p1, v2, Lm0/c2;->g:Ljava/util/ArrayList;

    .line 106
    .line 107
    iget-object v1, v2, Lm0/c2;->b:Landroid/widget/Spinner;

    .line 108
    .line 109
    if-nez v1, :cond_3

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_3
    invoke-virtual {v1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-ltz v1, :cond_6

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-lt v1, v3, :cond_4

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    check-cast p1, Ljava/lang/String;

    .line 130
    .line 131
    sget-object v1, Lm0/c2;->k:Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-eqz v1, :cond_5

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_5
    new-instance v1, Landroidx/appcompat/app/AlertDialog$Builder;

    .line 141
    .line 142
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-direct {v1, v3}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 147
    .line 148
    .line 149
    const v3, 0x7f130133

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, v3}, Landroidx/appcompat/app/AlertDialog$Builder;->setTitle(I)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    const v3, 0x7f130132

    .line 157
    .line 158
    .line 159
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-virtual {v2, v3, v4}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-virtual {v1, v3}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    const/high16 v3, 0x1040000

    .line 172
    .line 173
    const/4 v4, 0x0

    .line 174
    invoke-virtual {v1, v3, v4}, Landroidx/appcompat/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    new-instance v3, Le0/e0;

    .line 179
    .line 180
    invoke-direct {v3, v0, v2, p1}, Le0/e0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    const p1, 0x7f13012f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1, p1, v3}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-virtual {p1}, Landroidx/appcompat/app/AlertDialog$Builder;->show()Landroidx/appcompat/app/AlertDialog;

    .line 191
    .line 192
    .line 193
    :cond_6
    :goto_1
    return-void

    .line 194
    :pswitch_2
    sget-object p1, Lm0/c2;->i:Ljava/lang/String;

    .line 195
    .line 196
    new-instance p1, Landroid/content/Intent;

    .line 197
    .line 198
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    const-class v4, Lcom/woha/appmanag/FilePickerActivity;

    .line 203
    .line 204
    invoke-direct {p1, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 205
    .line 206
    .line 207
    const/16 v3, 0xe

    .line 208
    .line 209
    new-array v3, v3, [B

    .line 210
    .line 211
    fill-array-data v3, :array_2

    .line 212
    .line 213
    .line 214
    new-array v4, v1, [B

    .line 215
    .line 216
    fill-array-data v4, :array_3

    .line 217
    .line 218
    .line 219
    invoke-static {v3, v4}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    new-array v0, v0, [B

    .line 224
    .line 225
    fill-array-data v0, :array_4

    .line 226
    .line 227
    .line 228
    new-array v4, v1, [B

    .line 229
    .line 230
    fill-array-data v4, :array_5

    .line 231
    .line 232
    .line 233
    invoke-static {v0, v4}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-virtual {p1, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 238
    .line 239
    .line 240
    const/16 v0, 0x18

    .line 241
    .line 242
    new-array v0, v0, [B

    .line 243
    .line 244
    fill-array-data v0, :array_6

    .line 245
    .line 246
    .line 247
    new-array v1, v1, [B

    .line 248
    .line 249
    fill-array-data v1, :array_7

    .line 250
    .line 251
    .line 252
    invoke-static {v0, v1}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    const/4 v1, 0x1

    .line 257
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 258
    .line 259
    .line 260
    const/16 v0, 0x65

    .line 261
    .line 262
    invoke-virtual {v2, p1, v0}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 263
    .line 264
    .line 265
    return-void

    .line 266
    nop

    .line 267
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

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
    :array_0
    .array-data 1
        0x63t
        -0x3ct
        0x60t
        0x48t
        0x3dt
    .end array-data

    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    nop

    .line 285
    :array_1
    .array-data 1
        0x1t
        -0x55t
        0x1t
        0x3at
        0x59t
        -0x27t
        0x5bt
        0x2bt
    .end array-data

    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    :array_2
    .array-data 1
        -0x7dt
        -0x2dt
        -0x45t
        -0x35t
        0x23t
        0x48t
        -0x6ct
        -0x5dt
        -0x80t
        -0x2ct
        -0x5ct
        -0x39t
        0x13t
        0x43t
    .end array-data

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
    nop

    .line 305
    :array_3
    .array-data 1
        -0x1bt
        -0x46t
        -0x29t
        -0x52t
        0x7ct
        0x2dt
        -0x14t
        -0x29t
    .end array-data

    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    :array_4
    .array-data 1
        -0xat
        0x56t
        0x73t
        -0x20t
    .end array-data

    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    :array_5
    .array-data 1
        -0x28t
        0x2ct
        0x1at
        -0x70t
        -0x19t
        0x71t
        -0x75t
        -0x3ft
    .end array-data

    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    :array_6
    .array-data 1
        -0x5ct
        -0x3ct
        0x7ct
        -0x5bt
        0x18t
        -0x55t
        0x5bt
        -0x25t
        -0x59t
        -0x3dt
        0x63t
        -0x57t
        0x28t
        -0x60t
        0x7ct
        -0x3et
        -0x53t
        -0x37t
        0x75t
        -0x61t
        0x34t
        -0x55t
        0x4dt
        -0x35t
    .end array-data

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
    :array_7
    .array-data 1
        -0x3et
        -0x53t
        0x10t
        -0x40t
        0x47t
        -0x32t
        0x23t
        -0x51t
    .end array-data
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
