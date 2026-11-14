.class public final synthetic Lm0/z;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lm0/a0;


# direct methods
.method public synthetic constructor <init>(Lm0/a0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lm0/z;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Lm0/z;->c:Lm0/a0;

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
    iget p1, p0, Lm0/z;->b:I

    .line 2
    .line 3
    iget-object v0, p0, Lm0/z;->c:Lm0/a0;

    .line 4
    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object p1, Lm0/a0;->h:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v0, 0x5

    .line 17
    new-array v0, v0, [B

    .line 18
    .line 19
    fill-array-data v0, :array_0

    .line 20
    .line 21
    .line 22
    new-array v1, v1, [B

    .line 23
    .line 24
    fill-array-data v1, :array_1

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    filled-new-array {v0}, [Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Lm0/i1;->x([Ljava/lang/String;)Landroid/os/Bundle;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-class v1, Lm0/i1;

    .line 40
    .line 41
    invoke-static {p1, v1, v0}, Lcom/example/navistart/W;->u(Landroid/content/Context;Ljava/lang/Class;Landroid/os/Bundle;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_0
    iget-object p1, v0, Lm0/a0;->c:Ljava/util/ArrayList;

    .line 46
    .line 47
    iget-object v1, v0, Lm0/a0;->d:Landroid/widget/Spinner;

    .line 48
    .line 49
    if-nez v1, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {v1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-ltz v1, :cond_3

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-lt v1, v2, :cond_1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Ljava/lang/String;

    .line 70
    .line 71
    sget-object v1, Lm0/a0;->j:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_2

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    new-instance v1, Landroidx/appcompat/app/AlertDialog$Builder;

    .line 81
    .line 82
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-direct {v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 87
    .line 88
    .line 89
    const v2, 0x7f130133

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setTitle(I)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    const v2, 0x7f130132

    .line 97
    .line 98
    .line 99
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-virtual {v0, v2, v3}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    const/high16 v2, 0x1040000

    .line 112
    .line 113
    const/4 v3, 0x0

    .line 114
    invoke-virtual {v1, v2, v3}, Landroidx/appcompat/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    new-instance v2, Le0/e0;

    .line 119
    .line 120
    const/4 v3, 0x3

    .line 121
    invoke-direct {v2, v3, v0, p1}, Le0/e0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    const p1, 0x7f13012f

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, p1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {p1}, Landroidx/appcompat/app/AlertDialog$Builder;->show()Landroidx/appcompat/app/AlertDialog;

    .line 132
    .line 133
    .line 134
    :cond_3
    :goto_0
    return-void

    .line 135
    :pswitch_1
    sget-object p1, Lm0/a0;->h:Ljava/lang/String;

    .line 136
    .line 137
    new-instance p1, Landroid/content/Intent;

    .line 138
    .line 139
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    const-class v3, Lcom/woha/appmanag/FilePickerActivity;

    .line 144
    .line 145
    invoke-direct {p1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 146
    .line 147
    .line 148
    const/16 v2, 0xe

    .line 149
    .line 150
    new-array v2, v2, [B

    .line 151
    .line 152
    fill-array-data v2, :array_2

    .line 153
    .line 154
    .line 155
    new-array v3, v1, [B

    .line 156
    .line 157
    fill-array-data v3, :array_3

    .line 158
    .line 159
    .line 160
    invoke-static {v2, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    const/4 v3, 0x4

    .line 165
    new-array v3, v3, [B

    .line 166
    .line 167
    fill-array-data v3, :array_4

    .line 168
    .line 169
    .line 170
    new-array v4, v1, [B

    .line 171
    .line 172
    fill-array-data v4, :array_5

    .line 173
    .line 174
    .line 175
    invoke-static {v3, v4}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-virtual {p1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 180
    .line 181
    .line 182
    const/16 v2, 0x18

    .line 183
    .line 184
    new-array v2, v2, [B

    .line 185
    .line 186
    fill-array-data v2, :array_6

    .line 187
    .line 188
    .line 189
    new-array v1, v1, [B

    .line 190
    .line 191
    fill-array-data v1, :array_7

    .line 192
    .line 193
    .line 194
    invoke-static {v2, v1}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    const/4 v2, 0x1

    .line 199
    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 200
    .line 201
    .line 202
    const v1, 0x18ca8

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    :array_0
    .array-data 1
        0x4t
        0x19t
        -0x68t
        0x4at
        0x15t
    .end array-data

    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    nop

    .line 225
    :array_1
    .array-data 1
        0x66t
        0x75t
        -0x7t
        0x29t
        0x7et
        -0x4ft
        0x10t
        -0x77t
    .end array-data

    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    :array_2
    .array-data 1
        -0x7t
        0x63t
        -0x1dt
        0x74t
        -0xdt
        0x53t
        0x31t
        0x53t
        -0x6t
        0x64t
        -0x4t
        0x78t
        -0x3dt
        0x58t
    .end array-data

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
    nop

    .line 245
    :array_3
    .array-data 1
        -0x61t
        0xat
        -0x71t
        0x11t
        -0x54t
        0x36t
        0x49t
        0x27t
    .end array-data

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    :array_4
    .array-data 1
        0x27t
        0x5at
        -0x5at
        0x3t
    .end array-data

    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    :array_5
    .array-data 1
        0x9t
        0x20t
        -0x31t
        0x73t
        -0x80t
        0x38t
        0x6ct
        -0x36t
    .end array-data

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    :array_6
    .array-data 1
        0x74t
        0x4at
        -0x24t
        -0x14t
        -0x63t
        0x5at
        0x1ct
        -0x27t
        0x77t
        0x4dt
        -0x3dt
        -0x20t
        -0x53t
        0x51t
        0x3bt
        -0x40t
        0x7dt
        0x47t
        -0x2bt
        -0x2at
        -0x4ft
        0x5at
        0xat
        -0x37t
    .end array-data

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
    :array_7
    .array-data 1
        0x12t
        0x23t
        -0x50t
        -0x77t
        -0x3et
        0x3ft
        0x64t
        -0x53t
    .end array-data
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
