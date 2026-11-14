.class public final Le0/h1;
.super Landroid/os/AsyncTask;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 10
    const/4 v0, 0x0

    iput v0, p0, Le0/h1;->a:I

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method public constructor <init>(Li7/m;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Le0/h1;->a:I

    .line 3
    .line 4
    iput-object p1, p0, Le0/h1;->b:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 7
    .line 8
    .line 9
    return-void
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


# virtual methods
.method public final doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Le0/h1;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, [Landroid/location/Location;

    .line 8
    .line 9
    sget-object p1, Li7/j;->f:Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-static {}, Li7/h;->a()Li7/h;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Lh0/b;->v(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Le0/h1;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Li7/m;

    .line 31
    .line 32
    iget-object v3, v0, Li7/m;->g:Li7/j;

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object p1, p1, Li7/h;->c:Ljava/lang/String;

    .line 38
    .line 39
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 40
    .line 41
    sput-object v0, Li7/j;->f:Ljava/lang/Boolean;

    .line 42
    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    iget-object v2, v3, Li7/j;->b:Lcom/example/navistart/LocServ;

    .line 49
    .line 50
    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const/16 v4, 0x9

    .line 58
    .line 59
    new-array v5, v4, [B

    .line 60
    .line 61
    fill-array-data v5, :array_0

    .line 62
    .line 63
    .line 64
    const/16 v8, 0x8

    .line 65
    .line 66
    new-array v6, v8, [B

    .line 67
    .line 68
    fill-array-data v6, :array_1

    .line 69
    .line 70
    .line 71
    invoke-static {v5, v6, v0}, Lcom/google/protobuf/q;->i([B[BLjava/lang/StringBuilder;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    new-instance v5, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    new-array v2, v4, [B

    .line 88
    .line 89
    fill-array-data v2, :array_2

    .line 90
    .line 91
    .line 92
    new-array v4, v8, [B

    .line 93
    .line 94
    fill-array-data v4, :array_3

    .line 95
    .line 96
    .line 97
    invoke-static {v2, v4, v5}, Lcom/google/protobuf/q;->i([B[BLjava/lang/StringBuilder;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    new-instance v2, Lokhttp3/Request$Builder;

    .line 102
    .line 103
    invoke-direct {v2}, Lokhttp3/Request$Builder;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, p1}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 115
    .line 116
    .line 117
    invoke-static {}, Lh0/b;->m()Lokhttp3/OkHttpClient;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-virtual {v2, p1}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    new-instance v2, La5/h;

    .line 126
    .line 127
    const/16 v6, 0xb

    .line 128
    .line 129
    const/4 v7, 0x0

    .line 130
    move-object v4, v0

    .line 131
    invoke-direct/range {v2 .. v7}, La5/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 132
    .line 133
    .line 134
    invoke-interface {p1, v2}, Lokhttp3/Call;->enqueue(Lokhttp3/Callback;)V

    .line 135
    .line 136
    .line 137
    invoke-static {}, Lv1/d;->a()Lv1/d;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {p1}, Lv1/d;->c()Li7/s;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    const/16 v0, 0x29

    .line 146
    .line 147
    new-array v0, v0, [B

    .line 148
    .line 149
    fill-array-data v0, :array_4

    .line 150
    .line 151
    .line 152
    new-array v2, v8, [B

    .line 153
    .line 154
    fill-array-data v2, :array_5

    .line 155
    .line 156
    .line 157
    invoke-static {v0, v2}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    iget-object p1, p1, Li7/s;->b:Landroidx/lifecycle/MutableLiveData;

    .line 162
    .line 163
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    :cond_0
    return-object v1

    .line 167
    :pswitch_0
    check-cast p1, [Ljava/lang/String;

    .line 168
    .line 169
    const/4 v0, 0x0

    .line 170
    aget-object p1, p1, v0

    .line 171
    .line 172
    :try_start_0
    new-instance v0, Ljava/net/URL;

    .line 173
    .line 174
    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 182
    .line 183
    .line 184
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 185
    :catch_0
    return-object v1

    .line 186
    nop

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    :array_0
    .array-data 1
        0x1dt
        0x7ct
        -0xdt
        -0x38t
        -0x69t
        0x5et
        -0x57t
        0x5t
        0x42t
    .end array-data

    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    nop

    .line 203
    :array_1
    .array-data 1
        0x32t
        0x18t
        -0x6et
        -0x44t
        -0xat
        0x70t
        -0x2dt
        0x6ct
    .end array-data

    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    :array_2
    .array-data 1
        0x54t
        0x63t
        0x6at
        0x1t
        -0x59t
        -0x3bt
        0x1dt
        -0x7ct
        0xft
    .end array-data

    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    nop

    .line 221
    :array_3
    .array-data 1
        0x7bt
        0x7t
        0xbt
        0x75t
        -0x3at
        -0x15t
        0x69t
        -0x4t
    .end array-data

    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    :array_4
    .array-data 1
        -0x64t
        0xat
        -0x6dt
        0x4bt
        -0x26t
        0x76t
        0x75t
        -0x8t
        0x6ct
        0x42t
        -0x3t
        0x2ft
        -0x45t
        0x13t
        0x19t
        -0x56t
        -0xet
        0x42t
        -0xft
        0x2ft
        -0x4ft
        0x13t
        0x11t
        -0x56t
        -0xft
        0x42t
        -0x5t
        0x2ft
        -0x41t
        -0x1dt
        0x74t
        -0x35t
        -0x64t
        0x22t
        -0x6dt
        0x48t
        -0x25t
        0x48t
        -0x76t
        0x54t
        0x62t
    .end array-data

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
    nop

    .line 255
    :array_5
    .array-data 1
        0x4ct
        -0x6et
        0x43t
        -0x1t
        0xat
        -0x3dt
        -0x5ct
        0x7at
    .end array-data
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

.method public onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Le0/h1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    check-cast p1, Landroid/graphics/Bitmap;

    .line 11
    .line 12
    iget-object v0, p0, Le0/h1;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Landroid/widget/ImageView;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 22
    .line 23
.end method
