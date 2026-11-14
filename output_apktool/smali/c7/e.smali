.class public final synthetic Lc7/e;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    .line 12
    iput p3, p0, Lc7/e;->b:I

    iput-object p1, p0, Lc7/e;->d:Ljava/lang/Object;

    iput-boolean p2, p0, Lc7/e;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/util/concurrent/CountDownLatch;)V
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    iput v0, p0, Lc7/e;->b:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-boolean p1, p0, Lc7/e;->c:Z

    .line 8
    .line 9
    iput-object p2, p0, Lc7/e;->d:Ljava/lang/Object;

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
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Lc7/e;->b:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/high16 v2, 0x3f800000    # 1.0f

    .line 5
    .line 6
    const/16 v3, 0x8

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lc7/e;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lt1/a;

    .line 15
    .line 16
    iget-boolean v1, p0, Lc7/e;->c:Z

    .line 17
    .line 18
    iget-object v3, v0, Lt1/a;->c:Landroid/widget/LinearLayout;

    .line 19
    .line 20
    const/16 v5, 0x258

    .line 21
    .line 22
    const/high16 v6, 0x42480000    # 50.0f

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v3, v7}, Landroid/view/View;->setAlpha(F)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v6}, Landroid/view/View;->setTranslationY(F)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0, v7}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    int-to-long v1, v5

    .line 49
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1, v7}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1, v6}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    int-to-long v2, v5

    .line 70
    invoke-virtual {v1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    new-instance v2, Lf5/j;

    .line 75
    .line 76
    const/16 v3, 0x12

    .line 77
    .line 78
    invoke-direct {v2, v3, v0}, Lf5/j;-><init>(ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 86
    .line 87
    .line 88
    :goto_0
    return-void

    .line 89
    :pswitch_0
    iget-object v0, p0, Lc7/e;->d:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, Lcom/example/navistart/home/WebLauncherActivity;

    .line 92
    .line 93
    iget-boolean v2, p0, Lc7/e;->c:Z

    .line 94
    .line 95
    if-eqz v2, :cond_2

    .line 96
    .line 97
    iget-object v2, v0, Lcom/example/navistart/home/WebLauncherActivity;->i:Ls1/q0;

    .line 98
    .line 99
    if-eqz v2, :cond_1

    .line 100
    .line 101
    iget-object v4, v2, Ls1/q0;->l:Ljava/util/concurrent/ExecutorService;

    .line 102
    .line 103
    new-instance v5, Ls1/c0;

    .line 104
    .line 105
    invoke-direct {v5, v2, v1}, Ls1/c0;-><init>(Ls1/q0;I)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v4, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 109
    .line 110
    .line 111
    :cond_1
    const/16 v1, 0x24

    .line 112
    .line 113
    new-array v1, v1, [B

    .line 114
    .line 115
    fill-array-data v1, :array_0

    .line 116
    .line 117
    .line 118
    new-array v2, v3, [B

    .line 119
    .line 120
    fill-array-data v2, :array_1

    .line 121
    .line 122
    .line 123
    invoke-static {v1, v2}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-static {v0, v1}, Ly5/k;->x(Landroid/content/Context;Ljava/lang/CharSequence;)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_2
    sget-object v1, Lcom/example/navistart/home/WebLauncherActivity;->l:Ljava/lang/String;

    .line 132
    .line 133
    const/16 v1, 0x46

    .line 134
    .line 135
    new-array v1, v1, [B

    .line 136
    .line 137
    fill-array-data v1, :array_2

    .line 138
    .line 139
    .line 140
    new-array v2, v3, [B

    .line 141
    .line 142
    fill-array-data v2, :array_3

    .line 143
    .line 144
    .line 145
    invoke-static {v1, v2}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-static {v0, v1}, Ly5/k;->x(Landroid/content/Context;Ljava/lang/CharSequence;)V

    .line 150
    .line 151
    .line 152
    :goto_1
    return-void

    .line 153
    :pswitch_1
    iget-object v0, p0, Lc7/e;->d:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, Ls1/q0;

    .line 156
    .line 157
    iget-boolean v1, p0, Lc7/e;->c:Z

    .line 158
    .line 159
    :try_start_0
    new-instance v2, Lj0/c;

    .line 160
    .line 161
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-direct {v2, v3}, Lj0/c;-><init>(Landroid/content/Context;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2}, Lj0/c;->e()Ljava/util/ArrayList;

    .line 173
    .line 174
    .line 175
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 176
    goto :goto_2

    .line 177
    :catch_0
    new-instance v2, Ljava/util/ArrayList;

    .line 178
    .line 179
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 180
    .line 181
    .line 182
    :goto_2
    iget-object v3, v0, Ls1/q0;->r:Landroid/os/Handler;

    .line 183
    .line 184
    new-instance v4, Le0/e2;

    .line 185
    .line 186
    const/4 v5, 0x6

    .line 187
    invoke-direct {v4, v0, v2, v1, v5}, Le0/e2;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :pswitch_2
    iget-object v0, p0, Lc7/e;->d:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v0, Lm0/e0;

    .line 197
    .line 198
    iget-boolean v2, p0, Lc7/e;->c:Z

    .line 199
    .line 200
    iget-object v3, v0, Lm0/e0;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 201
    .line 202
    if-nez v3, :cond_3

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_3
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 206
    .line 207
    .line 208
    iget-object v3, v0, Lm0/e0;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 209
    .line 210
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    instance-of v3, v3, Landroid/view/View;

    .line 215
    .line 216
    if-eqz v3, :cond_4

    .line 217
    .line 218
    iget-object v3, v0, Lm0/e0;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 219
    .line 220
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    check-cast v3, Landroid/view/View;

    .line 225
    .line 226
    invoke-virtual {v3}, Landroid/view/View;->requestLayout()V

    .line 227
    .line 228
    .line 229
    :cond_4
    if-eqz v2, :cond_5

    .line 230
    .line 231
    iget-object v2, v0, Lm0/e0;->n:Ljava/util/ArrayList;

    .line 232
    .line 233
    if-eqz v2, :cond_5

    .line 234
    .line 235
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    if-lez v2, :cond_5

    .line 240
    .line 241
    iget-object v2, v0, Lm0/e0;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 242
    .line 243
    iget-object v0, v0, Lm0/e0;->n:Ljava/util/ArrayList;

    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    sub-int/2addr v0, v1

    .line 250
    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    .line 251
    .line 252
    .line 253
    :cond_5
    :goto_3
    return-void

    .line 254
    :pswitch_3
    iget-boolean v0, p0, Lc7/e;->c:Z

    .line 255
    .line 256
    iget-object v1, p0, Lc7/e;->d:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v1, Ljava/util/concurrent/CountDownLatch;

    .line 259
    .line 260
    :try_start_1
    sget-object v2, Lh0/b;->s:Ljava/lang/Object;

    .line 261
    .line 262
    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 263
    :try_start_2
    sget-object v3, Lh0/b;->f:Lh0/b;

    .line 264
    .line 265
    if-nez v3, :cond_6

    .line 266
    .line 267
    new-instance v3, Lh0/b;

    .line 268
    .line 269
    invoke-static {}, Lh0/b;->h()Landroid/content/Context;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    invoke-direct {v3, v5, v0}, Lh0/b;-><init>(Landroid/content/Context;Z)V

    .line 274
    .line 275
    .line 276
    sput-object v3, Lh0/b;->f:Lh0/b;

    .line 277
    .line 278
    goto :goto_4

    .line 279
    :catchall_0
    move-exception v0

    .line 280
    goto :goto_5

    .line 281
    :cond_6
    :goto_4
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 282
    sput-boolean v4, Lh0/b;->u:Z

    .line 283
    .line 284
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 285
    .line 286
    .line 287
    return-void

    .line 288
    :goto_5
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 289
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 290
    :catchall_1
    move-exception v0

    .line 291
    sput-boolean v4, Lh0/b;->u:Z

    .line 292
    .line 293
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 294
    .line 295
    .line 296
    throw v0

    .line 297
    :pswitch_4
    iget-object v0, p0, Lc7/e;->d:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v0, Lcom/example/navistart/punto;

    .line 300
    .line 301
    iget-boolean v1, p0, Lc7/e;->c:Z

    .line 302
    .line 303
    iget-object v5, v0, Lcom/example/navistart/punto;->o:Landroid/widget/ImageView;

    .line 304
    .line 305
    if-eqz v1, :cond_7

    .line 306
    .line 307
    const v1, 0x7f0700c9

    .line 308
    .line 309
    .line 310
    invoke-virtual {v5, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 311
    .line 312
    .line 313
    iget-object v1, v0, Lcom/example/navistart/punto;->o:Landroid/widget/ImageView;

    .line 314
    .line 315
    invoke-virtual {v1}, Landroid/view/View;->clearAnimation()V

    .line 316
    .line 317
    .line 318
    iget-object v0, v0, Lcom/example/navistart/punto;->i:Landroid/widget/TextView;

    .line 319
    .line 320
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 321
    .line 322
    .line 323
    goto :goto_6

    .line 324
    :cond_7
    const v1, 0x7f0700e8

    .line 325
    .line 326
    .line 327
    invoke-virtual {v5, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 328
    .line 329
    .line 330
    iget-object v1, v0, Lcom/example/navistart/punto;->i:Landroid/widget/TextView;

    .line 331
    .line 332
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 333
    .line 334
    .line 335
    new-instance v1, Landroid/view/animation/AlphaAnimation;

    .line 336
    .line 337
    const v3, 0x3e4ccccd    # 0.2f

    .line 338
    .line 339
    .line 340
    invoke-direct {v1, v3, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 341
    .line 342
    .line 343
    const-wide/16 v2, 0x1f4

    .line 344
    .line 345
    invoke-virtual {v1, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 346
    .line 347
    .line 348
    const/4 v2, 0x2

    .line 349
    invoke-virtual {v1, v2}, Landroid/view/animation/Animation;->setRepeatMode(I)V

    .line 350
    .line 351
    .line 352
    const/4 v2, -0x1

    .line 353
    invoke-virtual {v1, v2}, Landroid/view/animation/Animation;->setRepeatCount(I)V

    .line 354
    .line 355
    .line 356
    iget-object v0, v0, Lcom/example/navistart/punto;->o:Landroid/widget/ImageView;

    .line 357
    .line 358
    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 359
    .line 360
    .line 361
    :goto_6
    return-void

    .line 362
    :pswitch_5
    iget-object v0, p0, Lc7/e;->d:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v0, Lcom/example/navistart/ModernMainActivity;

    .line 365
    .line 366
    iget-boolean v1, p0, Lc7/e;->c:Z

    .line 367
    .line 368
    sget-object v2, Lcom/example/navistart/ModernMainActivity;->B1:Ljava/lang/String;

    .line 369
    .line 370
    const v2, 0x7f090318

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0, v2}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    check-cast v2, Landroid/widget/TextView;

    .line 378
    .line 379
    const v3, 0x7f090317

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0, v3}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    if-eqz v2, :cond_b

    .line 387
    .line 388
    if-nez v3, :cond_8

    .line 389
    .line 390
    goto :goto_9

    .line 391
    :cond_8
    if-eqz v1, :cond_9

    .line 392
    .line 393
    const v4, 0x7f1302cd

    .line 394
    .line 395
    .line 396
    goto :goto_7

    .line 397
    :cond_9
    const v4, 0x7f1302ce

    .line 398
    .line 399
    .line 400
    :goto_7
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(I)V

    .line 401
    .line 402
    .line 403
    if-eqz v1, :cond_a

    .line 404
    .line 405
    const v1, 0x7f05037e

    .line 406
    .line 407
    .line 408
    goto :goto_8

    .line 409
    :cond_a
    const v1, 0x7f050382

    .line 410
    .line 411
    .line 412
    :goto_8
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 413
    .line 414
    .line 415
    move-result v0

    .line 416
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 417
    .line 418
    .line 419
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    invoke-virtual {v3, v0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 424
    .line 425
    .line 426
    :cond_b
    :goto_9
    return-void

    .line 427
    :pswitch_6
    iget-object v0, p0, Lc7/e;->d:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v0, Lcom/example/navistart/AllWidgetServices;

    .line 430
    .line 431
    iget-boolean v1, p0, Lc7/e;->c:Z

    .line 432
    .line 433
    sget-object v2, Lcom/example/navistart/AllWidgetServices;->g:Lcom/example/navistart/AllWidgetServices;

    .line 434
    .line 435
    sget-object v2, Le0/h;->h:Le0/h;

    .line 436
    .line 437
    invoke-virtual {v0, v2, v1}, Lcom/example/navistart/AllWidgetServices;->e(Le0/h;Z)V

    .line 438
    .line 439
    .line 440
    return-void

    .line 441
    :pswitch_7
    iget-object v0, p0, Lc7/e;->d:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v0, Lb1/c;

    .line 444
    .line 445
    iget-boolean v1, p0, Lc7/e;->c:Z

    .line 446
    .line 447
    iget-object v0, v0, Lb1/c;->b:Ljava/lang/Object;

    .line 448
    .line 449
    check-cast v0, Ld6/g;

    .line 450
    .line 451
    iput-boolean v1, v0, Ld6/g;->f:Z

    .line 452
    .line 453
    iget-boolean v1, v0, Ld6/g;->c:Z

    .line 454
    .line 455
    if-eqz v1, :cond_c

    .line 456
    .line 457
    iget-object v1, v0, Ld6/g;->d:Landroid/os/Handler;

    .line 458
    .line 459
    const/4 v2, 0x0

    .line 460
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    iget-boolean v2, v0, Ld6/g;->f:Z

    .line 464
    .line 465
    if-eqz v2, :cond_c

    .line 466
    .line 467
    iget-object v0, v0, Ld6/g;->e:Lb7/g;

    .line 468
    .line 469
    const-wide/32 v2, 0x493e0

    .line 470
    .line 471
    .line 472
    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 473
    .line 474
    .line 475
    :cond_c
    return-void

    .line 476
    :pswitch_8
    iget-object v0, p0, Lc7/e;->d:Ljava/lang/Object;

    .line 477
    .line 478
    check-cast v0, Ld6/a;

    .line 479
    .line 480
    iget-boolean v1, p0, Lc7/e;->c:Z

    .line 481
    .line 482
    iget-object v0, v0, Ld6/a;->a:Lc7/i;

    .line 483
    .line 484
    invoke-virtual {v0, v1}, Lc7/i;->d(Z)V

    .line 485
    .line 486
    .line 487
    return-void

    .line 488
    :pswitch_9
    iget-object v0, p0, Lc7/e;->d:Ljava/lang/Object;

    .line 489
    .line 490
    check-cast v0, Lc7/g;

    .line 491
    .line 492
    iget-boolean v1, p0, Lc7/e;->c:Z

    .line 493
    .line 494
    iget-object v0, v0, Lc7/g;->c:Lc7/i;

    .line 495
    .line 496
    invoke-virtual {v0, v1}, Lc7/i;->d(Z)V

    .line 497
    .line 498
    .line 499
    return-void

    .line 500
    nop

    .line 501
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

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
    :array_0
    .array-data 1
        -0x22t
        -0x3ft
        -0x74t
        0x4bt
        0x18t
        0x4dt
        0x49t
        -0x52t
        0x2et
        -0x4ft
        -0x28t
        0x29t
        0x76t
        0x23t
        0x24t
        0x37t
        -0x21t
        -0x1dt
        -0x73t
        0x78t
        0x19t
        0x71t
        0x49t
        -0x59t
        -0x22t
        -0x23t
        -0x74t
        0x47t
        0x18t
        0x41t
        0x49t
        -0x54t
        -0x22t
        -0x2bt
        -0x74t
        0x44t
    .end array-data

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
    :array_1
    .array-data 1
        0xet
        0x60t
        0x5ct
        -0x7t
        -0x38t
        -0xdt
        -0x67t
        0x17t
    .end array-data

    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    :array_2
    .array-data 1
        0x2ft
        0x6dt
        0x40t
        -0x37t
        -0x9t
        -0x46t
        0x27t
        -0x26t
        0x4bt
        0x20t
        0x20t
        -0x54t
        0x6ct
        -0x45t
        0x1at
        -0x25t
        0x7et
        0x21t
        0x1ct
        0x5ct
        0x7t
        -0x2bt
        0x75t
        -0x78t
        0x2ft
        0x4at
        0x41t
        -0x4t
        0x6t
        -0x20t
        0x75t
        -0x78t
        0x2et
        0x7ct
        -0x50t
        -0x54t
        0x65t
        -0x46t
        0x2ft
        -0x26t
        0x4et
        0x21t
        0x10t
        -0x54t
        0x67t
        -0x45t
        0x19t
        -0x26t
        0x42t
        0x21t
        0x13t
        -0x53t
        0x59t
        0x4bt
        0x74t
        -0x50t
        0x2ft
        0x40t
        0x41t
        -0x4t
        0x6t
        -0x17t
        0x74t
        -0x4et
        0x2ft
        0x4dt
        0x40t
        -0x3at
        0x6t
        -0x18t
    .end array-data

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
    nop

    .line 595
    :array_3
    .array-data 1
        -0x1t
        -0x10t
        -0x70t
        0x7ct
        -0x29t
        0x6bt
        -0x5ct
        0xat
    .end array-data
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
