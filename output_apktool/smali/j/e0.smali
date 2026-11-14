.class public final Lj/e0;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"

# interfaces
.implements Lj/g;
.implements Lcom/bumptech/glide/load/data/d;


# instance fields
.field public final b:Lj/k;

.field public final c:Lj/h;

.field public d:I

.field public e:I

.field public f:Lh/e;

.field public g:Ljava/util/List;

.field public h:I

.field public volatile i:Ln/q;

.field public j:Ljava/io/File;

.field public k:Lj/f0;


# direct methods
.method public constructor <init>(Lj/h;Lj/k;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lj/e0;->e:I

    .line 6
    .line 7
    iput-object p1, p0, Lj/e0;->c:Lj/h;

    .line 8
    .line 9
    iput-object p2, p0, Lj/e0;->b:Lj/k;

    .line 10
    .line 11
    return-void
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
.method public final c()Z
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "Failed to find any load path from "

    .line 4
    .line 5
    iget-object v2, v1, Lj/e0;->c:Lj/h;

    .line 6
    .line 7
    invoke-virtual {v2}, Lj/h;->a()Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    const/16 v17, 0x0

    .line 18
    .line 19
    goto/16 :goto_5

    .line 20
    .line 21
    :cond_0
    iget-object v3, v1, Lj/e0;->c:Lj/h;

    .line 22
    .line 23
    iget-object v5, v3, Lj/h;->c:Lcom/bumptech/glide/e;

    .line 24
    .line 25
    invoke-virtual {v5}, Lcom/bumptech/glide/e;->a()Lcom/bumptech/glide/j;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    iget-object v6, v3, Lj/h;->d:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    iget-object v7, v3, Lj/h;->g:Ljava/lang/Class;

    .line 36
    .line 37
    iget-object v3, v3, Lj/h;->k:Ljava/lang/Class;

    .line 38
    .line 39
    iget-object v8, v5, Lcom/bumptech/glide/j;->h:Ll/d;

    .line 40
    .line 41
    iget-object v9, v8, Ll/d;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v9, Ljava/util/concurrent/atomic/AtomicReference;

    .line 44
    .line 45
    const/4 v10, 0x0

    .line 46
    invoke-virtual {v9, v10}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    check-cast v9, Lc0/n;

    .line 51
    .line 52
    if-nez v9, :cond_1

    .line 53
    .line 54
    new-instance v9, Lc0/n;

    .line 55
    .line 56
    invoke-direct {v9, v6, v7, v3}, Lc0/n;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    iput-object v6, v9, Lc0/n;->a:Ljava/lang/Class;

    .line 61
    .line 62
    iput-object v7, v9, Lc0/n;->b:Ljava/lang/Class;

    .line 63
    .line 64
    iput-object v3, v9, Lc0/n;->c:Ljava/lang/Class;

    .line 65
    .line 66
    :goto_0
    iget-object v11, v8, Ll/d;->d:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v11, Landroidx/collection/ArrayMap;

    .line 69
    .line 70
    monitor-enter v11

    .line 71
    :try_start_0
    iget-object v12, v8, Ll/d;->d:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v12, Landroidx/collection/ArrayMap;

    .line 74
    .line 75
    invoke-virtual {v12, v9}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v12

    .line 79
    check-cast v12, Ljava/util/List;

    .line 80
    .line 81
    monitor-exit v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 82
    iget-object v8, v8, Ll/d;->c:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v8, Ljava/util/concurrent/atomic/AtomicReference;

    .line 85
    .line 86
    invoke-virtual {v8, v9}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    if-nez v12, :cond_5

    .line 90
    .line 91
    new-instance v12, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    iget-object v8, v5, Lcom/bumptech/glide/j;->a:Ln/u;

    .line 97
    .line 98
    monitor-enter v8

    .line 99
    :try_start_1
    iget-object v9, v8, Ln/u;->a:Ln/z;

    .line 100
    .line 101
    invoke-virtual {v9, v6}, Ln/z;->c(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 102
    .line 103
    .line 104
    move-result-object v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 105
    monitor-exit v8

    .line 106
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    const/4 v11, 0x0

    .line 111
    :cond_2
    if-ge v11, v8, :cond_4

    .line 112
    .line 113
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v13

    .line 117
    add-int/lit8 v11, v11, 0x1

    .line 118
    .line 119
    check-cast v13, Ljava/lang/Class;

    .line 120
    .line 121
    iget-object v14, v5, Lcom/bumptech/glide/j;->c:Ll/d;

    .line 122
    .line 123
    invoke-virtual {v14, v13, v7}, Ll/d;->u(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 124
    .line 125
    .line 126
    move-result-object v13

    .line 127
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 128
    .line 129
    .line 130
    move-result v14

    .line 131
    const/4 v15, 0x0

    .line 132
    :goto_1
    if-ge v15, v14, :cond_2

    .line 133
    .line 134
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v16

    .line 138
    add-int/lit8 v15, v15, 0x1

    .line 139
    .line 140
    const/16 v17, 0x0

    .line 141
    .line 142
    move-object/from16 v4, v16

    .line 143
    .line 144
    check-cast v4, Ljava/lang/Class;

    .line 145
    .line 146
    iget-object v10, v5, Lcom/bumptech/glide/j;->f:Li7/i;

    .line 147
    .line 148
    invoke-virtual {v10, v4, v3}, Li7/i;->e(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 153
    .line 154
    .line 155
    move-result v10

    .line 156
    if-nez v10, :cond_3

    .line 157
    .line 158
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    if-nez v10, :cond_3

    .line 163
    .line 164
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    :cond_3
    const/4 v10, 0x0

    .line 168
    goto :goto_1

    .line 169
    :cond_4
    const/16 v17, 0x0

    .line 170
    .line 171
    iget-object v4, v5, Lcom/bumptech/glide/j;->h:Ll/d;

    .line 172
    .line 173
    invoke-static {v12}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    iget-object v8, v4, Ll/d;->d:Ljava/lang/Object;

    .line 178
    .line 179
    move-object v9, v8

    .line 180
    check-cast v9, Landroidx/collection/ArrayMap;

    .line 181
    .line 182
    monitor-enter v9

    .line 183
    :try_start_2
    iget-object v4, v4, Ll/d;->d:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v4, Landroidx/collection/ArrayMap;

    .line 186
    .line 187
    new-instance v8, Lc0/n;

    .line 188
    .line 189
    invoke-direct {v8, v6, v7, v3}, Lc0/n;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v4, v8, v5}, Landroidx/collection/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    monitor-exit v9

    .line 196
    goto :goto_2

    .line 197
    :catchall_0
    move-exception v0

    .line 198
    monitor-exit v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 199
    throw v0

    .line 200
    :catchall_1
    move-exception v0

    .line 201
    :try_start_3
    monitor-exit v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 202
    throw v0

    .line 203
    :cond_5
    const/16 v17, 0x0

    .line 204
    .line 205
    :goto_2
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    if-eqz v3, :cond_7

    .line 210
    .line 211
    const-class v2, Ljava/io/File;

    .line 212
    .line 213
    iget-object v3, v1, Lj/e0;->c:Lj/h;

    .line 214
    .line 215
    iget-object v3, v3, Lj/h;->k:Ljava/lang/Class;

    .line 216
    .line 217
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    if-eqz v2, :cond_6

    .line 222
    .line 223
    goto/16 :goto_5

    .line 224
    .line 225
    :cond_6
    new-instance v2, Ljava/lang/StringBuilder;

    .line 226
    .line 227
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    iget-object v0, v1, Lj/e0;->c:Lj/h;

    .line 231
    .line 232
    iget-object v0, v0, Lj/h;->d:Ljava/lang/Object;

    .line 233
    .line 234
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    const-string v0, " to "

    .line 242
    .line 243
    iget-object v3, v1, Lj/e0;->c:Lj/h;

    .line 244
    .line 245
    iget-object v3, v3, Lj/h;->k:Ljava/lang/Class;

    .line 246
    .line 247
    invoke-static {v2, v0, v3}, Lai/onnxruntime/b;->p(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    const/4 v0, 0x0

    .line 251
    return v0

    .line 252
    :cond_7
    :goto_3
    iget-object v0, v1, Lj/e0;->g:Ljava/util/List;

    .line 253
    .line 254
    const/4 v3, 0x1

    .line 255
    if-eqz v0, :cond_a

    .line 256
    .line 257
    iget v4, v1, Lj/e0;->h:I

    .line 258
    .line 259
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-ge v4, v0, :cond_a

    .line 264
    .line 265
    const/4 v0, 0x0

    .line 266
    iput-object v0, v1, Lj/e0;->i:Ln/q;

    .line 267
    .line 268
    move/from16 v4, v17

    .line 269
    .line 270
    :cond_8
    :goto_4
    if-nez v4, :cond_9

    .line 271
    .line 272
    iget v0, v1, Lj/e0;->h:I

    .line 273
    .line 274
    iget-object v2, v1, Lj/e0;->g:Ljava/util/List;

    .line 275
    .line 276
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 277
    .line 278
    .line 279
    move-result v2

    .line 280
    if-ge v0, v2, :cond_9

    .line 281
    .line 282
    iget-object v0, v1, Lj/e0;->g:Ljava/util/List;

    .line 283
    .line 284
    iget v2, v1, Lj/e0;->h:I

    .line 285
    .line 286
    add-int/lit8 v5, v2, 0x1

    .line 287
    .line 288
    iput v5, v1, Lj/e0;->h:I

    .line 289
    .line 290
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    check-cast v0, Ln/r;

    .line 295
    .line 296
    iget-object v2, v1, Lj/e0;->j:Ljava/io/File;

    .line 297
    .line 298
    iget-object v5, v1, Lj/e0;->c:Lj/h;

    .line 299
    .line 300
    iget v6, v5, Lj/h;->e:I

    .line 301
    .line 302
    iget v7, v5, Lj/h;->f:I

    .line 303
    .line 304
    iget-object v5, v5, Lj/h;->i:Lh/h;

    .line 305
    .line 306
    invoke-interface {v0, v2, v6, v7, v5}, Ln/r;->b(Ljava/lang/Object;IILh/h;)Ln/q;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    iput-object v0, v1, Lj/e0;->i:Ln/q;

    .line 311
    .line 312
    iget-object v0, v1, Lj/e0;->i:Ln/q;

    .line 313
    .line 314
    if-eqz v0, :cond_8

    .line 315
    .line 316
    iget-object v0, v1, Lj/e0;->c:Lj/h;

    .line 317
    .line 318
    iget-object v2, v1, Lj/e0;->i:Ln/q;

    .line 319
    .line 320
    iget-object v2, v2, Ln/q;->c:Lcom/bumptech/glide/load/data/e;

    .line 321
    .line 322
    invoke-interface {v2}, Lcom/bumptech/glide/load/data/e;->a()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-virtual {v0, v2}, Lj/h;->c(Ljava/lang/Class;)Lj/b0;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    if-eqz v0, :cond_8

    .line 331
    .line 332
    iget-object v0, v1, Lj/e0;->i:Ln/q;

    .line 333
    .line 334
    iget-object v0, v0, Ln/q;->c:Lcom/bumptech/glide/load/data/e;

    .line 335
    .line 336
    iget-object v2, v1, Lj/e0;->c:Lj/h;

    .line 337
    .line 338
    iget-object v2, v2, Lj/h;->o:Lcom/bumptech/glide/h;

    .line 339
    .line 340
    invoke-interface {v0, v2, v1}, Lcom/bumptech/glide/load/data/e;->e(Lcom/bumptech/glide/h;Lcom/bumptech/glide/load/data/d;)V

    .line 341
    .line 342
    .line 343
    move v4, v3

    .line 344
    goto :goto_4

    .line 345
    :cond_9
    return v4

    .line 346
    :cond_a
    const/4 v0, 0x0

    .line 347
    iget v4, v1, Lj/e0;->e:I

    .line 348
    .line 349
    add-int/2addr v4, v3

    .line 350
    iput v4, v1, Lj/e0;->e:I

    .line 351
    .line 352
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 353
    .line 354
    .line 355
    move-result v5

    .line 356
    if-lt v4, v5, :cond_c

    .line 357
    .line 358
    iget v4, v1, Lj/e0;->d:I

    .line 359
    .line 360
    add-int/2addr v4, v3

    .line 361
    iput v4, v1, Lj/e0;->d:I

    .line 362
    .line 363
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 364
    .line 365
    .line 366
    move-result v3

    .line 367
    if-lt v4, v3, :cond_b

    .line 368
    .line 369
    :goto_5
    return v17

    .line 370
    :cond_b
    move/from16 v3, v17

    .line 371
    .line 372
    iput v3, v1, Lj/e0;->e:I

    .line 373
    .line 374
    :cond_c
    iget v3, v1, Lj/e0;->d:I

    .line 375
    .line 376
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    move-object/from16 v20, v3

    .line 381
    .line 382
    check-cast v20, Lh/e;

    .line 383
    .line 384
    iget v3, v1, Lj/e0;->e:I

    .line 385
    .line 386
    invoke-interface {v12, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    check-cast v3, Ljava/lang/Class;

    .line 391
    .line 392
    iget-object v4, v1, Lj/e0;->c:Lj/h;

    .line 393
    .line 394
    invoke-virtual {v4, v3}, Lj/h;->e(Ljava/lang/Class;)Lh/l;

    .line 395
    .line 396
    .line 397
    move-result-object v24

    .line 398
    new-instance v18, Lj/f0;

    .line 399
    .line 400
    iget-object v4, v1, Lj/e0;->c:Lj/h;

    .line 401
    .line 402
    iget-object v5, v4, Lj/h;->c:Lcom/bumptech/glide/e;

    .line 403
    .line 404
    iget-object v5, v5, Lcom/bumptech/glide/e;->a:Lk/g;

    .line 405
    .line 406
    iget-object v6, v4, Lj/h;->n:Lh/e;

    .line 407
    .line 408
    iget v7, v4, Lj/h;->e:I

    .line 409
    .line 410
    iget v8, v4, Lj/h;->f:I

    .line 411
    .line 412
    iget-object v9, v4, Lj/h;->i:Lh/h;

    .line 413
    .line 414
    move-object/from16 v25, v3

    .line 415
    .line 416
    move-object/from16 v19, v5

    .line 417
    .line 418
    move-object/from16 v21, v6

    .line 419
    .line 420
    move/from16 v22, v7

    .line 421
    .line 422
    move/from16 v23, v8

    .line 423
    .line 424
    move-object/from16 v26, v9

    .line 425
    .line 426
    invoke-direct/range {v18 .. v26}, Lj/f0;-><init>(Lk/g;Lh/e;Lh/e;IILh/l;Ljava/lang/Class;Lh/h;)V

    .line 427
    .line 428
    .line 429
    move-object/from16 v5, v18

    .line 430
    .line 431
    move-object/from16 v3, v20

    .line 432
    .line 433
    iput-object v5, v1, Lj/e0;->k:Lj/f0;

    .line 434
    .line 435
    iget-object v4, v4, Lj/h;->h:Lc0/h;

    .line 436
    .line 437
    invoke-virtual {v4}, Lc0/h;->a()Ll/a;

    .line 438
    .line 439
    .line 440
    move-result-object v4

    .line 441
    iget-object v5, v1, Lj/e0;->k:Lj/f0;

    .line 442
    .line 443
    invoke-interface {v4, v5}, Ll/a;->c(Lh/e;)Ljava/io/File;

    .line 444
    .line 445
    .line 446
    move-result-object v4

    .line 447
    iput-object v4, v1, Lj/e0;->j:Ljava/io/File;

    .line 448
    .line 449
    if-eqz v4, :cond_d

    .line 450
    .line 451
    iput-object v3, v1, Lj/e0;->f:Lh/e;

    .line 452
    .line 453
    iget-object v3, v1, Lj/e0;->c:Lj/h;

    .line 454
    .line 455
    iget-object v3, v3, Lj/h;->c:Lcom/bumptech/glide/e;

    .line 456
    .line 457
    invoke-virtual {v3}, Lcom/bumptech/glide/e;->a()Lcom/bumptech/glide/j;

    .line 458
    .line 459
    .line 460
    move-result-object v3

    .line 461
    invoke-virtual {v3, v4}, Lcom/bumptech/glide/j;->f(Ljava/lang/Object;)Ljava/util/List;

    .line 462
    .line 463
    .line 464
    move-result-object v3

    .line 465
    iput-object v3, v1, Lj/e0;->g:Ljava/util/List;

    .line 466
    .line 467
    const/4 v3, 0x0

    .line 468
    iput v3, v1, Lj/e0;->h:I

    .line 469
    .line 470
    goto :goto_6

    .line 471
    :cond_d
    const/4 v3, 0x0

    .line 472
    :goto_6
    move/from16 v17, v3

    .line 473
    .line 474
    goto/16 :goto_3

    .line 475
    .line 476
    :catchall_2
    move-exception v0

    .line 477
    :try_start_4
    monitor-exit v11
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 478
    throw v0
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
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
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
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
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
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
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
.end method

.method public final cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lj/e0;->i:Ln/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Ln/q;->c:Lcom/bumptech/glide/load/data/e;

    .line 6
    .line 7
    invoke-interface {v0}, Lcom/bumptech/glide/load/data/e;->cancel()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
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

.method public final d(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lj/e0;->b:Lj/k;

    .line 2
    .line 3
    iget-object v1, p0, Lj/e0;->k:Lj/f0;

    .line 4
    .line 5
    iget-object v2, p0, Lj/e0;->i:Ln/q;

    .line 6
    .line 7
    iget-object v2, v2, Ln/q;->c:Lcom/bumptech/glide/load/data/e;

    .line 8
    .line 9
    const/4 v3, 0x4

    .line 10
    invoke-virtual {v0, v1, p1, v2, v3}, Lj/k;->b(Lh/e;Ljava/lang/Exception;Lcom/bumptech/glide/load/data/e;I)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public final f(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lj/e0;->b:Lj/k;

    .line 2
    .line 3
    iget-object v1, p0, Lj/e0;->f:Lh/e;

    .line 4
    .line 5
    iget-object v2, p0, Lj/e0;->i:Ln/q;

    .line 6
    .line 7
    iget-object v3, v2, Ln/q;->c:Lcom/bumptech/glide/load/data/e;

    .line 8
    .line 9
    const/4 v4, 0x4

    .line 10
    iget-object v5, p0, Lj/e0;->k:Lj/f0;

    .line 11
    .line 12
    move-object v2, p1

    .line 13
    invoke-virtual/range {v0 .. v5}, Lj/k;->a(Lh/e;Ljava/lang/Object;Lcom/bumptech/glide/load/data/e;ILh/e;)V

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
