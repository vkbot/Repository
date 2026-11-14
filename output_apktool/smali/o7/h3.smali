.class public final Lo7/h3;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# static fields
.field public static final d:Ljava/util/logging/Logger;

.field public static final e:Lo7/u2;

.field public static final f:Lo7/u2;


# instance fields
.field public final a:Lo7/u2;

.field public final b:Lo7/u2;

.field public final c:Ljava/net/InetSocketAddress;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lo7/h3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lo7/h3;->d:Ljava/util/logging/Logger;

    .line 12
    .line 13
    new-instance v0, Lo7/u2;

    .line 14
    .line 15
    const/16 v1, 0x11

    .line 16
    .line 17
    invoke-direct {v0, v1}, Lo7/u2;-><init>(I)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lo7/h3;->e:Lo7/u2;

    .line 21
    .line 22
    new-instance v0, Lo7/u2;

    .line 23
    .line 24
    const/16 v1, 0x12

    .line 25
    .line 26
    invoke-direct {v0, v1}, Lo7/u2;-><init>(I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lo7/h3;->f:Lo7/u2;

    .line 30
    .line 31
    return-void
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

.method public constructor <init>()V
    .locals 4

    .line 1
    const-string v0, "GRPC_PROXY_EXP"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v1, Lo7/h3;->f:Lo7/u2;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lo7/h3;->a:Lo7/u2;

    .line 16
    .line 17
    sget-object v1, Lo7/h3;->e:Lo7/u2;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lo7/h3;->b:Lo7/u2;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    const-string v1, ":"

    .line 27
    .line 28
    const/4 v2, 0x2

    .line 29
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    array-length v1, v0

    .line 34
    const/4 v2, 0x1

    .line 35
    if-le v1, v2, :cond_0

    .line 36
    .line 37
    aget-object v1, v0, v2

    .line 38
    .line 39
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/16 v1, 0x50

    .line 45
    .line 46
    :goto_0
    sget-object v2, Lo7/h3;->d:Ljava/util/logging/Logger;

    .line 47
    .line 48
    const-string v3, "Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM."

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    new-instance v2, Ljava/net/InetSocketAddress;

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    aget-object v0, v0, v3

    .line 57
    .line 58
    invoke-direct {v2, v0, v1}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    .line 59
    .line 60
    .line 61
    iput-object v2, p0, Lo7/h3;->c:Ljava/net/InetSocketAddress;

    .line 62
    .line 63
    return-void

    .line 64
    :cond_1
    const/4 v0, 0x0

    .line 65
    iput-object v0, p0, Lo7/h3;->c:Ljava/net/InetSocketAddress;

    .line 66
    .line 67
    return-void
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


# virtual methods
.method public final a(Ljava/net/InetSocketAddress;)Ln7/u;
    .locals 11

    .line 1
    const/4 v1, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lo7/h3;->c:Ljava/net/InetSocketAddress;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    new-instance v2, Ln7/u;

    .line 10
    .line 11
    invoke-direct {v2, v0, p1, v1, v1}, Ln7/u;-><init>(Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v2

    .line 15
    :cond_1
    sget-object v2, Lo7/h3;->d:Ljava/util/logging/Logger;

    .line 16
    .line 17
    :try_start_0
    invoke-static {p1}, Lo7/y0;->d(Ljava/net/InetSocketAddress;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    :try_start_1
    new-instance v3, Ljava/net/URI;

    .line 22
    .line 23
    const-string v4, "https"

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/net/InetSocketAddress;->getPort()I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    const/4 v9, 0x0

    .line 30
    const/4 v10, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v8, 0x0

    .line 33
    invoke-direct/range {v3 .. v10}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_1

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lo7/h3;->a:Lo7/u2;

    .line 37
    .line 38
    invoke-virtual {v0}, Lo7/u2;->r()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Ljava/net/ProxySelector;

    .line 43
    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    sget-object p1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 47
    .line 48
    const-string v0, "proxy selector is null, so continuing without proxy lookup"

    .line 49
    .line 50
    invoke-virtual {v2, p1, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    :cond_2
    invoke-virtual {v0, v3}, Ljava/net/ProxySelector;->select(Ljava/net/URI;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    const/4 v4, 0x1

    .line 63
    if-le v3, v4, :cond_3

    .line 64
    .line 65
    const-string v3, "More than 1 proxy detected, gRPC will select the first one"

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_3
    const/4 v3, 0x0

    .line 71
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Ljava/net/Proxy;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    sget-object v4, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 82
    .line 83
    if-ne v3, v4, :cond_4

    .line 84
    .line 85
    :goto_0
    return-object v1

    .line 86
    :cond_4
    invoke-virtual {v0}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Ljava/net/InetSocketAddress;

    .line 91
    .line 92
    invoke-static {v0}, Lo7/y0;->d(Ljava/net/InetSocketAddress;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getPort()I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    const-string v6, "https"

    .line 105
    .line 106
    iget-object v7, p0, Lo7/h3;->b:Lo7/u2;

    .line 107
    .line 108
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    :try_start_2
    new-instance v7, Ljava/net/URL;

    .line 112
    .line 113
    const-string v8, ""

    .line 114
    .line 115
    invoke-direct {v7, v6, v3, v5, v8}, Ljava/net/URL;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    :try_end_2
    .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_0

    .line 116
    .line 117
    .line 118
    move-object v9, v7

    .line 119
    goto :goto_1

    .line 120
    :catch_0
    sget-object v7, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 121
    .line 122
    const-string v8, "failed to create URL for Authenticator: {0} {1}"

    .line 123
    .line 124
    filled-new-array {v6, v3}, [Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    invoke-virtual {v2, v7, v8, v9}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    move-object v9, v1

    .line 132
    :goto_1
    sget-object v10, Ljava/net/Authenticator$RequestorType;->PROXY:Ljava/net/Authenticator$RequestorType;

    .line 133
    .line 134
    const-string v7, ""

    .line 135
    .line 136
    const/4 v8, 0x0

    .line 137
    invoke-static/range {v3 .. v10}, Ljava/net/Authenticator;->requestPasswordAuthentication(Ljava/lang/String;Ljava/net/InetAddress;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Ljava/net/Authenticator$RequestorType;)Ljava/net/PasswordAuthentication;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->isUnresolved()Z

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    if-eqz v3, :cond_5

    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-static {v3}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    new-instance v4, Ljava/net/InetSocketAddress;

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getPort()I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    invoke-direct {v4, v3, v0}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 162
    .line 163
    .line 164
    move-object v0, v4

    .line 165
    :cond_5
    sget v3, Ln7/u;->f:I

    .line 166
    .line 167
    if-nez v2, :cond_6

    .line 168
    .line 169
    new-instance v2, Ln7/u;

    .line 170
    .line 171
    invoke-direct {v2, v0, p1, v1, v1}, Ln7/u;-><init>(Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    :goto_2
    move-object v1, v2

    .line 175
    goto :goto_4

    .line 176
    :cond_6
    invoke-virtual {v2}, Ljava/net/PasswordAuthentication;->getUserName()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-virtual {v2}, Ljava/net/PasswordAuthentication;->getPassword()[C

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    if-nez v4, :cond_7

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_7
    new-instance v1, Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {v2}, Ljava/net/PasswordAuthentication;->getPassword()[C

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([C)V

    .line 194
    .line 195
    .line 196
    :goto_3
    new-instance v2, Ln7/u;

    .line 197
    .line 198
    invoke-direct {v2, v0, p1, v3, v1}, Ln7/u;-><init>(Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    goto :goto_2

    .line 202
    :catch_1
    move-exception v0

    .line 203
    move-object p1, v0

    .line 204
    sget-object v0, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 205
    .line 206
    const-string v3, "Failed to construct URI for proxy lookup, proceeding without proxy"

    .line 207
    .line 208
    invoke-virtual {v2, v0, v3, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 209
    .line 210
    .line 211
    goto :goto_4

    .line 212
    :catchall_0
    move-exception v0

    .line 213
    move-object p1, v0

    .line 214
    sget-object v0, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 215
    .line 216
    const-string v3, "Failed to get host for proxy lookup, proceeding without proxy"

    .line 217
    .line 218
    invoke-virtual {v2, v0, v3, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 219
    .line 220
    .line 221
    :goto_4
    return-object v1
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
