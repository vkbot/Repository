.class public final synthetic Lw0/t0;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lw0/v0;


# direct methods
.method public synthetic constructor <init>(Lw0/v0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw0/t0;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Lw0/t0;->c:Lw0/v0;

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
    iget p1, p0, Lw0/t0;->b:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object v1, p0, Lw0/t0;->c:Lw0/v0;

    .line 5
    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p1, v1, Lw0/v0;->g:Landroid/widget/Spinner;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {}, Lw0/k1;->values()[Lw0/k1;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-ltz p1, :cond_0

    .line 20
    .line 21
    array-length v3, v2

    .line 22
    if-ge p1, v3, :cond_0

    .line 23
    .line 24
    aget-object p1, v2, p1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    :goto_0
    if-nez p1, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget-object v3, v1, Lw0/v0;->h:Landroid/widget/Button;

    .line 40
    .line 41
    invoke-virtual {v3, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 42
    .line 43
    .line 44
    iget-object v3, v1, Lw0/v0;->g:Landroid/widget/Spinner;

    .line 45
    .line 46
    invoke-virtual {v3, v0}, Landroid/widget/Spinner;->setEnabled(Z)V

    .line 47
    .line 48
    .line 49
    iget-object v3, v1, Lw0/v0;->i:Landroid/widget/TextView;

    .line 50
    .line 51
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const v4, 0x7f1304d2

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v4, v0}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    iget-object v0, v1, Lw0/v0;->m:Ljava/util/concurrent/ExecutorService;

    .line 70
    .line 71
    new-instance v3, Lb1/n;

    .line 72
    .line 73
    const/16 v4, 0xf

    .line 74
    .line 75
    invoke-direct {v3, v1, v2, p1, v4}, Lb1/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 79
    .line 80
    .line 81
    :goto_1
    return-void

    .line 82
    :pswitch_0
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iget-object v2, v1, Lw0/v0;->j:Landroid/widget/RadioGroup;

    .line 91
    .line 92
    invoke-virtual {v2}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    const v3, 0x7f0903cf

    .line 97
    .line 98
    .line 99
    if-ne v2, v3, :cond_2

    .line 100
    .line 101
    sget-object v0, Lw0/z;->b:Lw0/z;

    .line 102
    .line 103
    invoke-static {p1, v0}, Lw0/a0;->h(Landroid/content/Context;Lw0/z;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Lw0/v0;->u()V

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_2
    iget-object v2, v1, Lw0/v0;->j:Landroid/widget/RadioGroup;

    .line 111
    .line 112
    invoke-virtual {v2}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    const v3, 0x7f0903ce

    .line 117
    .line 118
    .line 119
    if-ne v2, v3, :cond_3

    .line 120
    .line 121
    sget-object v2, Lw0/z;->d:Lw0/z;

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_3
    sget-object v2, Lw0/z;->c:Lw0/z;

    .line 125
    .line 126
    :goto_2
    invoke-static {p1}, Lw0/a;->f(Landroid/content/Context;)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_4

    .line 131
    .line 132
    invoke-static {p1, v2}, Lw0/a0;->h(Landroid/content/Context;Lw0/z;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, Lw0/v0;->u()V

    .line 136
    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_4
    invoke-virtual {v1, v0}, Lw0/v0;->t(Z)V

    .line 140
    .line 141
    .line 142
    iget-object v3, v1, Lw0/v0;->l:Landroid/widget/TextView;

    .line 143
    .line 144
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    const v4, 0x7f1304ad

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v4, v0}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 160
    .line 161
    .line 162
    iget-object v0, v1, Lw0/v0;->m:Ljava/util/concurrent/ExecutorService;

    .line 163
    .line 164
    new-instance v3, Lb1/n;

    .line 165
    .line 166
    const/16 v4, 0x10

    .line 167
    .line 168
    invoke-direct {v3, v1, p1, v2, v4}, Lb1/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 169
    .line 170
    .line 171
    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 172
    .line 173
    .line 174
    :goto_3
    return-void

    .line 175
    :pswitch_1
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 176
    .line 177
    .line 178
    invoke-static {}, Lh0/b;->f()Lj0/c;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    iget-object v0, v1, Lw0/v0;->e:Landroid/widget/EditText;

    .line 183
    .line 184
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-static {}, Lh0/b;->o()Lu0/a;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    sget-object v2, Lj0/c;->d:Ljava/lang/String;

    .line 200
    .line 201
    invoke-virtual {p1, v2, v0}, Lu0/a;->saveString(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 205
    .line 206
    .line 207
    invoke-static {}, Lh0/b;->f()Lj0/c;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    iget-object v0, v1, Lw0/v0;->d:Ljava/util/ArrayList;

    .line 212
    .line 213
    sget-object v2, Lj0/c;->e:Ljava/lang/String;

    .line 214
    .line 215
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-static {v2, v0}, Lj0/c;->l(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 219
    .line 220
    .line 221
    invoke-static {}, Lh0/b;->o()Lu0/a;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    const/16 v0, 0x12

    .line 226
    .line 227
    new-array v0, v0, [B

    .line 228
    .line 229
    fill-array-data v0, :array_0

    .line 230
    .line 231
    .line 232
    const/16 v2, 0x8

    .line 233
    .line 234
    new-array v2, v2, [B

    .line 235
    .line 236
    fill-array-data v2, :array_1

    .line 237
    .line 238
    .line 239
    invoke-static {v0, v2}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    iget-boolean v2, v1, Lw0/v0;->f:Z

    .line 244
    .line 245
    invoke-virtual {p1, v0, v2}, Lu0/a;->saveBoolean(Ljava/lang/String;Z)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    invoke-static {p1}, Lcom/example/navistart/Si;->a(Landroid/content/Context;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    check-cast p1, Ll0/a;

    .line 260
    .line 261
    if-eqz p1, :cond_5

    .line 262
    .line 263
    invoke-virtual {p1}, Landroidx/fragment/app/DialogFragment;->dismiss()V

    .line 264
    .line 265
    .line 266
    :cond_5
    return-void

    .line 267
    :pswitch_2
    iget-object p1, v1, Lw0/v0;->d:Ljava/util/ArrayList;

    .line 268
    .line 269
    new-instance v0, Lw0/o0;

    .line 270
    .line 271
    sget-object v2, Ln0/d;->e:Ln0/d;

    .line 272
    .line 273
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    invoke-static {v2, v3}, Lj0/e;->c(Ln0/d;Landroid/content/Context;)Lj0/e;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    const-string v3, ""

    .line 282
    .line 283
    const/4 v4, 0x1

    .line 284
    invoke-direct {v0, v3, v2, v4, v4}, Lw0/o0;-><init>(Ljava/lang/String;Lj0/e;ZZ)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    iget-object p1, v1, Lw0/v0;->c:Lw0/q0;

    .line 291
    .line 292
    iget-object v0, v1, Lw0/v0;->d:Ljava/util/ArrayList;

    .line 293
    .line 294
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    sub-int/2addr v0, v4

    .line 299
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemInserted(I)V

    .line 300
    .line 301
    .line 302
    return-void

    .line 303
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

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
    :array_0
    .array-data 1
        0x1dt
        -0x49t
        -0x46t
        0x75t
        -0x7bt
        0x62t
        -0x71t
        0x13t
        0x18t
        -0x5at
        -0x59t
        0x4ft
        -0x45t
        0x7at
        -0x74t
        0x25t
        0x3dt
        -0x70t
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
    nop

    .line 327
    :array_1
    .array-data 1
        0x6et
        -0x39t
        -0x2dt
        0x2at
        -0x1ct
        0x9t
        -0x5t
        0x7at
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
