.class public final synthetic Lm0/i3;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lm0/n3;


# direct methods
.method public synthetic constructor <init>(Lm0/n3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lm0/i3;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Lm0/i3;->c:Lm0/n3;

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
    iget p1, p0, Lm0/i3;->b:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lm0/i3;->c:Lm0/n3;

    .line 7
    .line 8
    iget-object p1, v1, Lm0/n3;->p:Landroidx/appcompat/app/AlertDialog;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Landroidx/appcompat/app/AppCompatDialog;->dismiss()V

    .line 13
    .line 14
    .line 15
    :cond_0
    new-instance p1, Landroidx/appcompat/app/AlertDialog$Builder;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const v2, 0x7f1402f0

    .line 22
    .line 23
    .line 24
    invoke-direct {p1, v0, v2}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroidx/appcompat/app/AlertDialog$Builder;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const v2, 0x7f0c011a

    .line 36
    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    const v0, 0x7f0905c8

    .line 44
    .line 45
    .line 46
    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Landroid/widget/TextView;

    .line 51
    .line 52
    const v2, 0x7f0905c7

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    move-object v4, v2

    .line 60
    check-cast v4, Landroid/widget/ListView;

    .line 61
    .line 62
    const v2, 0x7f130466

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setTitle(I)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1, v6}, Landroidx/appcompat/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    new-instance v2, Lb7/h;

    .line 74
    .line 75
    const/4 v5, 0x3

    .line 76
    invoke-direct {v2, v5, v1}, Lb7/h;-><init>(ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    const v5, 0x7f130473

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v5, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    const v2, 0x7f13010a

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v2, v3}, Landroidx/appcompat/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    const v2, 0x7f130411

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v2, v3}, Landroidx/appcompat/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p1}, Landroidx/appcompat/app/AlertDialog$Builder;->create()Landroidx/appcompat/app/AlertDialog;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    iput-object v2, v1, Lm0/n3;->p:Landroidx/appcompat/app/AlertDialog;

    .line 105
    .line 106
    new-instance p1, Lm0/d3;

    .line 107
    .line 108
    invoke-direct {p1, v1, v2}, Lm0/d3;-><init>(Lm0/n3;Landroidx/appcompat/app/AlertDialog;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, p1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    .line 115
    .line 116
    .line 117
    const/4 p1, -0x3

    .line 118
    invoke-virtual {v2, p1}, Landroidx/appcompat/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    move-object v3, v0

    .line 123
    new-instance v0, Lm0/e3;

    .line 124
    .line 125
    const/4 v5, 0x0

    .line 126
    invoke-direct/range {v0 .. v5}, Lm0/e3;-><init>(Lm0/n3;Landroidx/appcompat/app/AlertDialog;Landroid/widget/TextView;Landroid/widget/ListView;I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 130
    .line 131
    .line 132
    const p1, 0x7f0905c6

    .line 133
    .line 134
    .line 135
    invoke-virtual {v6, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    new-instance v0, Lm0/e3;

    .line 140
    .line 141
    const/4 v5, 0x1

    .line 142
    invoke-direct/range {v0 .. v5}, Lm0/e3;-><init>(Lm0/n3;Landroidx/appcompat/app/AlertDialog;Landroid/widget/TextView;Landroid/widget/ListView;I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 146
    .line 147
    .line 148
    const p1, 0x7f0905c9

    .line 149
    .line 150
    .line 151
    invoke-virtual {v6, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    new-instance v0, Lm0/e3;

    .line 156
    .line 157
    const/4 v5, 0x2

    .line 158
    invoke-direct/range {v0 .. v5}, Lm0/e3;-><init>(Lm0/n3;Landroidx/appcompat/app/AlertDialog;Landroid/widget/TextView;Landroid/widget/ListView;I)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 162
    .line 163
    .line 164
    iget-object p1, v1, Lm0/n3;->m:Ljava/io/File;

    .line 165
    .line 166
    if-nez p1, :cond_1

    .line 167
    .line 168
    iget-object p1, v1, Lm0/n3;->n:Lcom/bumptech/glide/manager/t;

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    :cond_1
    invoke-virtual {v1, p1, v2, v3, v4}, Lm0/n3;->v(Ljava/io/File;Landroidx/appcompat/app/AlertDialog;Landroid/widget/TextView;Landroid/widget/ListView;)V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :pswitch_0
    iget-object p1, p0, Lm0/i3;->c:Lm0/n3;

    .line 182
    .line 183
    iget-object v0, p1, Lm0/n3;->n:Lcom/bumptech/glide/manager/t;

    .line 184
    .line 185
    iget v1, p1, Lm0/n3;->g:I

    .line 186
    .line 187
    iget-object v2, p1, Lm0/n3;->o:Ljava/util/concurrent/ExecutorService;

    .line 188
    .line 189
    new-instance v3, Landroidx/activity/f;

    .line 190
    .line 191
    const/16 v4, 0x8

    .line 192
    .line 193
    invoke-direct {v3, p1, v0, v1, v4}, Landroidx/activity/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 194
    .line 195
    .line 196
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :pswitch_1
    iget-object p1, p0, Lm0/i3;->c:Lm0/n3;

    .line 201
    .line 202
    invoke-virtual {p1}, Lm0/n3;->w()V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :pswitch_2
    iget-object p1, p0, Lm0/i3;->c:Lm0/n3;

    .line 207
    .line 208
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    instance-of v0, v0, Ll0/a;

    .line 213
    .line 214
    if-eqz v0, :cond_2

    .line 215
    .line 216
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    check-cast p1, Ll0/a;

    .line 221
    .line 222
    invoke-virtual {p1}, Landroidx/fragment/app/DialogFragment;->dismiss()V

    .line 223
    .line 224
    .line 225
    goto :goto_0

    .line 226
    :cond_2
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 231
    .line 232
    .line 233
    :goto_0
    return-void

    .line 234
    nop

    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
