.class public final synthetic Le0/l;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/example/navistart/BlackActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/example/navistart/BlackActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Le0/l;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Le0/l;->b:Lcom/example/navistart/BlackActivity;

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
.method public final onChanged(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget v0, p0, Le0/l;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, Le0/l;->b:Lcom/example/navistart/BlackActivity;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Landroid/location/Location;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object v0, v3, Lcom/example/navistart/BlackActivity;->f:Lb1/h;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    move v1, v2

    .line 19
    :cond_0
    invoke-static {}, Lcom/example/navistart/BlackActivity;->s()Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    and-int/2addr v0, v1

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    iget-object v0, v3, Lcom/example/navistart/BlackActivity;->f:Lb1/h;

    .line 31
    .line 32
    iget-object v0, v0, Lb1/h;->e:Lb1/r;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lb1/r;->i(Landroid/location/Location;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    sget p1, Lcom/example/navistart/BlackActivity;->g:I

    .line 39
    .line 40
    :cond_2
    :goto_0
    return-void

    .line 41
    :pswitch_0
    check-cast p1, Ls0/a;

    .line 42
    .line 43
    if-eqz p1, :cond_4

    .line 44
    .line 45
    iget-object v0, v3, Lcom/example/navistart/BlackActivity;->f:Lb1/h;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    move v1, v2

    .line 50
    :cond_3
    invoke-static {}, Lcom/example/navistart/BlackActivity;->s()Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    and-int/2addr v0, v1

    .line 59
    if-eqz v0, :cond_5

    .line 60
    .line 61
    iget-object v0, v3, Lcom/example/navistart/BlackActivity;->f:Lb1/h;

    .line 62
    .line 63
    invoke-virtual {v0, p1}, Lb1/h;->k(Ls0/a;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_4
    sget p1, Lcom/example/navistart/BlackActivity;->g:I

    .line 68
    .line 69
    :cond_5
    :goto_1
    return-void

    .line 70
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 71
    .line 72
    if-eqz p1, :cond_7

    .line 73
    .line 74
    iget-object v0, v3, Lcom/example/navistart/BlackActivity;->f:Lb1/h;

    .line 75
    .line 76
    if-eqz v0, :cond_6

    .line 77
    .line 78
    move v1, v2

    .line 79
    :cond_6
    invoke-static {}, Lcom/example/navistart/BlackActivity;->s()Ljava/lang/Boolean;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    and-int/2addr v0, v1

    .line 88
    if-eqz v0, :cond_8

    .line 89
    .line 90
    iget-object v0, v3, Lcom/example/navistart/BlackActivity;->f:Lb1/h;

    .line 91
    .line 92
    invoke-virtual {v0, p1}, Lb1/h;->f(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_7
    sget p1, Lcom/example/navistart/BlackActivity;->g:I

    .line 97
    .line 98
    :cond_8
    :goto_2
    return-void

    .line 99
    :pswitch_2
    check-cast p1, Lcom/example/navistart/cores/HUDMassageObj;

    .line 100
    .line 101
    if-eqz p1, :cond_a

    .line 102
    .line 103
    iget-object v0, v3, Lcom/example/navistart/BlackActivity;->f:Lb1/h;

    .line 104
    .line 105
    if-eqz v0, :cond_9

    .line 106
    .line 107
    move v1, v2

    .line 108
    :cond_9
    invoke-static {}, Lcom/example/navistart/BlackActivity;->s()Ljava/lang/Boolean;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    and-int/2addr v0, v1

    .line 117
    if-eqz v0, :cond_b

    .line 118
    .line 119
    iget-object v0, v3, Lcom/example/navistart/BlackActivity;->f:Lb1/h;

    .line 120
    .line 121
    invoke-virtual {v0, p1}, Lb1/h;->o(Lcom/example/navistart/cores/HUDMassageObj;)V

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_a
    sget p1, Lcom/example/navistart/BlackActivity;->g:I

    .line 126
    .line 127
    :cond_b
    :goto_3
    return-void

    .line 128
    :pswitch_3
    check-cast p1, Lk7/b;

    .line 129
    .line 130
    sget v0, Lcom/example/navistart/BlackActivity;->g:I

    .line 131
    .line 132
    if-eqz p1, :cond_d

    .line 133
    .line 134
    new-instance v0, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 137
    .line 138
    .line 139
    iget-object v4, p1, Lk7/b;->b:Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const/4 v4, 0x2

    .line 145
    new-array v4, v4, [B

    .line 146
    .line 147
    fill-array-data v4, :array_0

    .line 148
    .line 149
    .line 150
    const/16 v5, 0x8

    .line 151
    .line 152
    new-array v5, v5, [B

    .line 153
    .line 154
    fill-array-data v5, :array_1

    .line 155
    .line 156
    .line 157
    invoke-static {v4, v5, v0}, Lcom/google/protobuf/q;->i([B[BLjava/lang/StringBuilder;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    iget p1, p1, Lk7/b;->d:I

    .line 162
    .line 163
    iget-object v4, v3, Lcom/example/navistart/BlackActivity;->f:Lb1/h;

    .line 164
    .line 165
    if-eqz v4, :cond_c

    .line 166
    .line 167
    move v1, v2

    .line 168
    :cond_c
    invoke-static {}, Lcom/example/navistart/BlackActivity;->s()Ljava/lang/Boolean;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    and-int/2addr v1, v2

    .line 177
    if-eqz v1, :cond_d

    .line 178
    .line 179
    iget-object v1, v3, Lcom/example/navistart/BlackActivity;->f:Lb1/h;

    .line 180
    .line 181
    invoke-virtual {v1, p1, v0}, Lb1/h;->g(ILjava/lang/String;)V

    .line 182
    .line 183
    .line 184
    :cond_d
    return-void

    .line 185
    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    .line 186
    .line 187
    sget v0, Lcom/example/navistart/BlackActivity;->g:I

    .line 188
    .line 189
    if-eqz p1, :cond_f

    .line 190
    .line 191
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    iget-object v0, v3, Lcom/example/navistart/BlackActivity;->f:Lb1/h;

    .line 196
    .line 197
    if-eqz v0, :cond_e

    .line 198
    .line 199
    move v1, v2

    .line 200
    :cond_e
    invoke-static {}, Lcom/example/navistart/BlackActivity;->s()Ljava/lang/Boolean;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    and-int/2addr v0, v1

    .line 209
    if-eqz v0, :cond_f

    .line 210
    .line 211
    iget-object v0, v3, Lcom/example/navistart/BlackActivity;->f:Lb1/h;

    .line 212
    .line 213
    invoke-virtual {v0, p1}, Lb1/h;->l(I)V

    .line 214
    .line 215
    .line 216
    :cond_f
    return-void

    .line 217
    :pswitch_5
    check-cast p1, Ljava/lang/Integer;

    .line 218
    .line 219
    sget v0, Lcom/example/navistart/BlackActivity;->g:I

    .line 220
    .line 221
    if-eqz p1, :cond_11

    .line 222
    .line 223
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    iget-object v0, v3, Lcom/example/navistart/BlackActivity;->f:Lb1/h;

    .line 228
    .line 229
    if-eqz v0, :cond_10

    .line 230
    .line 231
    move v1, v2

    .line 232
    :cond_10
    invoke-static {}, Lcom/example/navistart/BlackActivity;->s()Ljava/lang/Boolean;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    and-int/2addr v0, v1

    .line 241
    if-eqz v0, :cond_11

    .line 242
    .line 243
    iget-object v0, v3, Lcom/example/navistart/BlackActivity;->f:Lb1/h;

    .line 244
    .line 245
    invoke-virtual {v0, p1}, Lb1/h;->d(I)V

    .line 246
    .line 247
    .line 248
    :cond_11
    return-void

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

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
    :array_0
    .array-data 1
        0x71t
        -0x2at
    .end array-data

    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    nop

    .line 271
    :array_1
    .array-data 1
        -0x4dt
        0x66t
        0x3ft
        -0x2dt
        0x2bt
        0x48t
        0x7at
        0x6at
    .end array-data
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
