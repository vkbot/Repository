.class public final synthetic Le0/v0;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Le0/v0;->b:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
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
    .line 22
    .line 23
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 7
    iput p1, p0, Le0/v0;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Le0/v0;->b:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/16 v2, 0x8

    .line 5
    .line 6
    const-string v3, " "

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, -0x1

    .line 10
    const/4 v6, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, Lp0/j;->m:Lp0/j;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lp0/j;->a()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    :pswitch_0
    sget-object v0, Lm0/e2;->j:Ljava/lang/String;

    .line 23
    .line 24
    new-instance v0, Lcom/example/navistart/cores/HUDMassageObj;

    .line 25
    .line 26
    invoke-direct {v0}, Lcom/example/navistart/cores/HUDMassageObj;-><init>()V

    .line 27
    .line 28
    .line 29
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 30
    .line 31
    iput-object v1, v0, Lcom/example/navistart/cores/HUDMassageObj;->NaviOn:Ljava/lang/Boolean;

    .line 32
    .line 33
    sget-object v1, Lcom/example/navistart/cores/HUDMassageObj$HudSenderType;->NAVI:Lcom/example/navistart/cores/HUDMassageObj$HudSenderType;

    .line 34
    .line 35
    iput-object v1, v0, Lcom/example/navistart/cores/HUDMassageObj;->hudSenderType:Lcom/example/navistart/cores/HUDMassageObj$HudSenderType;

    .line 36
    .line 37
    sget-object v1, Lcom/example/navistart/cores/HUDMassageObj$AradarSenderType;->GENARADAR:Lcom/example/navistart/cores/HUDMassageObj$AradarSenderType;

    .line 38
    .line 39
    iput-object v1, v0, Lcom/example/navistart/cores/HUDMassageObj;->aradarSenderType:Lcom/example/navistart/cores/HUDMassageObj$AradarSenderType;

    .line 40
    .line 41
    iput v5, v0, Lcom/example/navistart/cores/HUDMassageObj;->v_mTurnType:I

    .line 42
    .line 43
    iput v4, v0, Lcom/example/navistart/cores/HUDMassageObj;->v_mTurnDis:I

    .line 44
    .line 45
    iput-object v3, v0, Lcom/example/navistart/cores/HUDMassageObj;->v_mNextRoad:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 48
    .line 49
    .line 50
    invoke-static {}, Lh0/b;->i()Le0/a0;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1, v0}, Le0/a0;->e(Lcom/example/navistart/cores/HUDMassageObj;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_1
    sget-object v0, Lm0/e2;->j:Ljava/lang/String;

    .line 59
    .line 60
    new-instance v0, Lcom/example/navistart/cores/HUDMassageObj;

    .line 61
    .line 62
    invoke-direct {v0}, Lcom/example/navistart/cores/HUDMassageObj;-><init>()V

    .line 63
    .line 64
    .line 65
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 66
    .line 67
    iput-object v1, v0, Lcom/example/navistart/cores/HUDMassageObj;->NaviOn:Ljava/lang/Boolean;

    .line 68
    .line 69
    sget-object v1, Lcom/example/navistart/cores/HUDMassageObj$HudSenderType;->NAVI:Lcom/example/navistart/cores/HUDMassageObj$HudSenderType;

    .line 70
    .line 71
    iput-object v1, v0, Lcom/example/navistart/cores/HUDMassageObj;->hudSenderType:Lcom/example/navistart/cores/HUDMassageObj$HudSenderType;

    .line 72
    .line 73
    const/4 v1, 0x3

    .line 74
    iput v1, v0, Lcom/example/navistart/cores/HUDMassageObj;->v_mTurnType:I

    .line 75
    .line 76
    const v1, 0xea60

    .line 77
    .line 78
    .line 79
    iput v1, v0, Lcom/example/navistart/cores/HUDMassageObj;->v_mTurnDis:I

    .line 80
    .line 81
    const/16 v1, 0x320

    .line 82
    .line 83
    iput v1, v0, Lcom/example/navistart/cores/HUDMassageObj;->v_mRemainDis:I

    .line 84
    .line 85
    const/4 v1, 0x4

    .line 86
    new-array v1, v1, [B

    .line 87
    .line 88
    fill-array-data v1, :array_0

    .line 89
    .line 90
    .line 91
    new-array v2, v2, [B

    .line 92
    .line 93
    fill-array-data v2, :array_1

    .line 94
    .line 95
    .line 96
    invoke-static {v1, v2}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    iput-object v1, v0, Lcom/example/navistart/cores/HUDMassageObj;->v_mNextRoad:Ljava/lang/String;

    .line 101
    .line 102
    const/16 v1, 0x3c

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Lcom/example/navistart/cores/HUDMassageObj;->setspeedlimit(I)V

    .line 105
    .line 106
    .line 107
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 108
    .line 109
    .line 110
    invoke-static {}, Lh0/b;->i()Le0/a0;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v1, v0}, Le0/a0;->e(Lcom/example/navistart/cores/HUDMassageObj;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :pswitch_2
    sget-object v0, Lm0/e2;->j:Ljava/lang/String;

    .line 119
    .line 120
    new-instance v0, Lcom/example/navistart/cores/HUDMassageObj;

    .line 121
    .line 122
    invoke-direct {v0}, Lcom/example/navistart/cores/HUDMassageObj;-><init>()V

    .line 123
    .line 124
    .line 125
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 126
    .line 127
    iput-object v1, v0, Lcom/example/navistart/cores/HUDMassageObj;->AradarOn:Ljava/lang/Boolean;

    .line 128
    .line 129
    sget-object v1, Lcom/example/navistart/cores/HUDMassageObj$HudSenderType;->ARAD:Lcom/example/navistart/cores/HUDMassageObj$HudSenderType;

    .line 130
    .line 131
    iput-object v1, v0, Lcom/example/navistart/cores/HUDMassageObj;->hudSenderType:Lcom/example/navistart/cores/HUDMassageObj$HudSenderType;

    .line 132
    .line 133
    sget-object v1, Lcom/example/navistart/cores/HUDMassageObj$AradarSenderType;->GENARADAR:Lcom/example/navistart/cores/HUDMassageObj$AradarSenderType;

    .line 134
    .line 135
    iput-object v1, v0, Lcom/example/navistart/cores/HUDMassageObj;->aradarSenderType:Lcom/example/navistart/cores/HUDMassageObj$AradarSenderType;

    .line 136
    .line 137
    iput v5, v0, Lcom/example/navistart/cores/HUDMassageObj;->v_mTurnType:I

    .line 138
    .line 139
    iput v4, v0, Lcom/example/navistart/cores/HUDMassageObj;->v_mTurnDis:I

    .line 140
    .line 141
    iput-object v3, v0, Lcom/example/navistart/cores/HUDMassageObj;->v_mNextRoad:Ljava/lang/String;

    .line 142
    .line 143
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 144
    .line 145
    .line 146
    invoke-static {}, Lh0/b;->i()Le0/a0;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v1, v0}, Le0/a0;->e(Lcom/example/navistart/cores/HUDMassageObj;)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :pswitch_3
    sget-object v0, Lm0/e2;->j:Ljava/lang/String;

    .line 155
    .line 156
    new-instance v0, Lcom/example/navistart/cores/HUDMassageObj;

    .line 157
    .line 158
    invoke-direct {v0}, Lcom/example/navistart/cores/HUDMassageObj;-><init>()V

    .line 159
    .line 160
    .line 161
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 162
    .line 163
    iput-object v1, v0, Lcom/example/navistart/cores/HUDMassageObj;->AradarOn:Ljava/lang/Boolean;

    .line 164
    .line 165
    sget-object v1, Lcom/example/navistart/cores/HUDMassageObj$HudSenderType;->ARAD:Lcom/example/navistart/cores/HUDMassageObj$HudSenderType;

    .line 166
    .line 167
    iput-object v1, v0, Lcom/example/navistart/cores/HUDMassageObj;->hudSenderType:Lcom/example/navistart/cores/HUDMassageObj$HudSenderType;

    .line 168
    .line 169
    sget-object v1, Lcom/example/navistart/cores/HUDMassageObj$AradarSenderType;->GENARADAR:Lcom/example/navistart/cores/HUDMassageObj$AradarSenderType;

    .line 170
    .line 171
    iput-object v1, v0, Lcom/example/navistart/cores/HUDMassageObj;->aradarSenderType:Lcom/example/navistart/cores/HUDMassageObj$AradarSenderType;

    .line 172
    .line 173
    const/16 v1, 0xe

    .line 174
    .line 175
    iput v1, v0, Lcom/example/navistart/cores/HUDMassageObj;->v_mTurnType:I

    .line 176
    .line 177
    const v1, 0x186a0

    .line 178
    .line 179
    .line 180
    iput v1, v0, Lcom/example/navistart/cores/HUDMassageObj;->v_mTurnDis:I

    .line 181
    .line 182
    const/16 v1, 0x15e

    .line 183
    .line 184
    iput v1, v0, Lcom/example/navistart/cores/HUDMassageObj;->v_mRemainDis:I

    .line 185
    .line 186
    const/4 v1, 0x7

    .line 187
    new-array v1, v1, [B

    .line 188
    .line 189
    fill-array-data v1, :array_2

    .line 190
    .line 191
    .line 192
    new-array v2, v2, [B

    .line 193
    .line 194
    fill-array-data v2, :array_3

    .line 195
    .line 196
    .line 197
    invoke-static {v1, v2}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    const-string v2, "100"

    .line 202
    .line 203
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    iput-object v1, v0, Lcom/example/navistart/cores/HUDMassageObj;->v_mNextRoad:Ljava/lang/String;

    .line 208
    .line 209
    const/16 v1, 0x64

    .line 210
    .line 211
    invoke-virtual {v0, v1}, Lcom/example/navistart/cores/HUDMassageObj;->setspeedlimit(I)V

    .line 212
    .line 213
    .line 214
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 215
    .line 216
    .line 217
    invoke-static {}, Lh0/b;->i()Le0/a0;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-virtual {v1, v0}, Le0/a0;->e(Lcom/example/navistart/cores/HUDMassageObj;)V

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :pswitch_4
    :try_start_0
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 226
    .line 227
    .line 228
    invoke-static {}, Lh0/b;->c()Lcom/example/navistart/cores/AreaDisplayProxy;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    if-nez v0, :cond_1

    .line 233
    .line 234
    goto :goto_0

    .line 235
    :cond_1
    invoke-static {}, Lh0/b;->c()Lcom/example/navistart/cores/AreaDisplayProxy;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-interface {v0}, Lcom/example/navistart/cores/AreaDisplayProxy;->OpenProPri()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 240
    .line 241
    .line 242
    :catch_0
    :goto_0
    return-void

    .line 243
    :pswitch_5
    :try_start_1
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 244
    .line 245
    .line 246
    invoke-static {}, Lh0/b;->c()Lcom/example/navistart/cores/AreaDisplayProxy;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    if-nez v0, :cond_2

    .line 251
    .line 252
    goto :goto_1

    .line 253
    :cond_2
    invoke-static {}, Lh0/b;->c()Lcom/example/navistart/cores/AreaDisplayProxy;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-interface {v0}, Lcom/example/navistart/cores/AreaDisplayProxy;->OpenCustomPPPri()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 258
    .line 259
    .line 260
    :catch_1
    :goto_1
    return-void

    .line 261
    :pswitch_6
    :try_start_2
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 262
    .line 263
    .line 264
    invoke-static {}, Lh0/b;->c()Lcom/example/navistart/cores/AreaDisplayProxy;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    if-nez v0, :cond_3

    .line 269
    .line 270
    goto :goto_2

    .line 271
    :cond_3
    invoke-static {}, Lh0/b;->c()Lcom/example/navistart/cores/AreaDisplayProxy;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-interface {v0}, Lcom/example/navistart/cores/AreaDisplayProxy;->OpenProPri()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 276
    .line 277
    .line 278
    :catch_2
    :goto_2
    return-void

    .line 279
    :pswitch_7
    :try_start_3
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 280
    .line 281
    .line 282
    invoke-static {}, Lh0/b;->c()Lcom/example/navistart/cores/AreaDisplayProxy;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    if-nez v0, :cond_4

    .line 287
    .line 288
    goto :goto_3

    .line 289
    :cond_4
    invoke-static {}, Lh0/b;->c()Lcom/example/navistart/cores/AreaDisplayProxy;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    invoke-interface {v0}, Lcom/example/navistart/cores/AreaDisplayProxy;->OpenCustomPPPri()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 294
    .line 295
    .line 296
    :catch_3
    :goto_3
    return-void

    .line 297
    :pswitch_8
    sget v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AlarmManagerSchedulerBroadcastReceiver;->a:I

    .line 298
    .line 299
    return-void

    .line 300
    :pswitch_9
    sget-object v0, Lcom/example/navistart/TService;->c:Ld2/h;

    .line 301
    .line 302
    iget-object v1, v0, Ld2/h;->a:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 305
    .line 306
    new-instance v2, Ll7/a;

    .line 307
    .line 308
    invoke-direct {v2, v0, v6}, Ll7/a;-><init>(Ld2/h;I)V

    .line 309
    .line 310
    .line 311
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 312
    .line 313
    .line 314
    return-void

    .line 315
    :pswitch_a
    sget-object v0, Lcom/example/navistart/SpeedBoardService;->i:Lv0/h;

    .line 316
    .line 317
    if-eqz v0, :cond_5

    .line 318
    .line 319
    invoke-interface {v0}, Lv0/h;->c()V

    .line 320
    .line 321
    .line 322
    :cond_5
    sget-object v0, Lcom/example/navistart/SpeedBoardService;->j:Lv0/h;

    .line 323
    .line 324
    if-eqz v0, :cond_6

    .line 325
    .line 326
    invoke-interface {v0}, Lv0/h;->c()V

    .line 327
    .line 328
    .line 329
    :cond_6
    return-void

    .line 330
    :pswitch_b
    sget v0, Le0/o2;->b:I

    .line 331
    .line 332
    return-void

    .line 333
    :pswitch_c
    sget-object v0, Lcom/example/navistart/MyCarReceiver;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 334
    .line 335
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 336
    .line 337
    .line 338
    invoke-static {}, Lh0/b;->d()Lcom/example/navistart/cores/CarCmdProxy;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-interface {v0, v6, v1}, Lcom/example/navistart/cores/CarCmdProxy;->carsetvent(II)V

    .line 343
    .line 344
    .line 345
    return-void

    .line 346
    :pswitch_d
    sget-object v0, Lcom/example/navistart/MyCarReceiver;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 347
    .line 348
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 349
    .line 350
    .line 351
    invoke-static {}, Lh0/b;->d()Lcom/example/navistart/cores/CarCmdProxy;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-interface {v0, v6, v6}, Lcom/example/navistart/cores/CarCmdProxy;->carsetvent(II)V

    .line 356
    .line 357
    .line 358
    return-void

    .line 359
    :pswitch_e
    sget-object v0, Lcom/example/navistart/MyCarReceiver;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 360
    .line 361
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 362
    .line 363
    .line 364
    invoke-static {}, Lh0/b;->d()Lcom/example/navistart/cores/CarCmdProxy;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 369
    .line 370
    invoke-interface {v0, v1}, Lcom/example/navistart/cores/CarCmdProxy;->lobheatonoff(Ljava/lang/Boolean;)V

    .line 371
    .line 372
    .line 373
    return-void

    .line 374
    :pswitch_f
    sget-object v0, Lcom/example/navistart/MyCarReceiver;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 375
    .line 376
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 377
    .line 378
    .line 379
    invoke-static {}, Lh0/b;->d()Lcom/example/navistart/cores/CarCmdProxy;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 384
    .line 385
    invoke-interface {v0, v1}, Lcom/example/navistart/cores/CarCmdProxy;->lobheatonoff(Ljava/lang/Boolean;)V

    .line 386
    .line 387
    .line 388
    return-void

    .line 389
    :pswitch_10
    sget-object v0, Lcom/example/navistart/MyCarReceiver;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 390
    .line 391
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 392
    .line 393
    .line 394
    invoke-static {}, Lh0/b;->d()Lcom/example/navistart/cores/CarCmdProxy;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 399
    .line 400
    invoke-interface {v0, v1}, Lcom/example/navistart/cores/CarCmdProxy;->zadheatonoff(Ljava/lang/Boolean;)V

    .line 401
    .line 402
    .line 403
    return-void

    .line 404
    :pswitch_11
    sget-object v0, Lcom/example/navistart/MyCarReceiver;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 405
    .line 406
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 407
    .line 408
    .line 409
    invoke-static {}, Lh0/b;->d()Lcom/example/navistart/cores/CarCmdProxy;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 414
    .line 415
    invoke-interface {v0, v1}, Lcom/example/navistart/cores/CarCmdProxy;->zadheatonoff(Ljava/lang/Boolean;)V

    .line 416
    .line 417
    .line 418
    return-void

    .line 419
    :pswitch_12
    sget-object v0, Lcom/example/navistart/MyCarReceiver;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 420
    .line 421
    :try_start_4
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 422
    .line 423
    .line 424
    invoke-static {}, Lh0/b;->c()Lcom/example/navistart/cores/AreaDisplayProxy;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    if-nez v0, :cond_7

    .line 429
    .line 430
    goto :goto_4

    .line 431
    :cond_7
    invoke-static {}, Lh0/b;->c()Lcom/example/navistart/cores/AreaDisplayProxy;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-interface {v0}, Lcom/example/navistart/cores/AreaDisplayProxy;->OpenCustomPPPri()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 436
    .line 437
    .line 438
    :catch_4
    :goto_4
    return-void

    .line 439
    :pswitch_13
    sget-object v0, Lcom/example/navistart/MyCarReceiver;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 440
    .line 441
    :try_start_5
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 442
    .line 443
    .line 444
    invoke-static {}, Lh0/b;->c()Lcom/example/navistart/cores/AreaDisplayProxy;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    if-nez v0, :cond_8

    .line 449
    .line 450
    goto :goto_5

    .line 451
    :cond_8
    invoke-static {}, Lh0/b;->c()Lcom/example/navistart/cores/AreaDisplayProxy;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    invoke-interface {v0}, Lcom/example/navistart/cores/AreaDisplayProxy;->OpenProPri()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    .line 456
    .line 457
    .line 458
    :catch_5
    :goto_5
    return-void

    .line 459
    :pswitch_14
    sget-object v0, Lcom/example/navistart/MyCarReceiver;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 460
    .line 461
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 462
    .line 463
    .line 464
    invoke-static {}, Lh0/b;->d()Lcom/example/navistart/cores/CarCmdProxy;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 469
    .line 470
    invoke-interface {v0, v1}, Lcom/example/navistart/cores/CarCmdProxy;->rulheatonoff(Ljava/lang/Boolean;)V

    .line 471
    .line 472
    .line 473
    return-void

    .line 474
    :pswitch_15
    sget-object v0, Lcom/example/navistart/MyCarReceiver;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 475
    .line 476
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 477
    .line 478
    .line 479
    invoke-static {}, Lh0/b;->d()Lcom/example/navistart/cores/CarCmdProxy;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 484
    .line 485
    invoke-interface {v0, v1}, Lcom/example/navistart/cores/CarCmdProxy;->rulheatonoff(Ljava/lang/Boolean;)V

    .line 486
    .line 487
    .line 488
    return-void

    .line 489
    :pswitch_16
    sget-object v0, Lcom/example/navistart/MyCarReceiver;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 490
    .line 491
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 492
    .line 493
    .line 494
    invoke-static {}, Lh0/b;->d()Lcom/example/navistart/cores/CarCmdProxy;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-interface {v0, v6, v1}, Lcom/example/navistart/cores/CarCmdProxy;->carsetheat(II)V

    .line 499
    .line 500
    .line 501
    return-void

    .line 502
    :pswitch_17
    sget-object v0, Lcom/example/navistart/MyCarReceiver;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 503
    .line 504
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 505
    .line 506
    .line 507
    invoke-static {}, Lh0/b;->d()Lcom/example/navistart/cores/CarCmdProxy;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    invoke-interface {v0, v6, v6}, Lcom/example/navistart/cores/CarCmdProxy;->carsetheat(II)V

    .line 512
    .line 513
    .line 514
    return-void

    .line 515
    :pswitch_18
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 516
    .line 517
    .line 518
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 519
    .line 520
    .line 521
    invoke-static {}, Lh0/b;->n()Lcom/example/navistart/cores/ProLanProxy;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-interface {v0, v6}, Lcom/example/navistart/cores/ProLanProxy;->setMusicStatus(Z)V

    .line 526
    .line 527
    .line 528
    return-void

    .line 529
    :pswitch_19
    sget-object v0, Lcom/example/navistart/MainActivity;->e1:Ljava/lang/String;

    .line 530
    .line 531
    invoke-static {}, Lh0/b;->a()Lh0/b;

    .line 532
    .line 533
    .line 534
    invoke-static {}, Lh0/b;->i()Le0/a0;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    invoke-virtual {v0}, Le0/a0;->d()V

    .line 539
    .line 540
    .line 541
    return-void

    .line 542
    nop

    .line 543
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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
    :array_0
    .array-data 1
        -0x74t
        -0x68t
        0x64t
        -0x59t
    .end array-data

    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    :array_1
    .array-data 1
        -0x28t
        -0x23t
        0x37t
        -0xdt
        -0x2ct
        -0x35t
        0x46t
        0x74t
    .end array-data

    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    :array_2
    .array-data 1
        0x7bt
        -0x75t
        0x26t
        0x1t
        0x40t
        -0x53t
        -0x24t
    .end array-data

    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    :array_3
    .array-data 1
        -0x55t
        0x31t
        -0xat
        -0x43t
        0x6ft
        0x7ct
        0x5bt
        -0x26t
    .end array-data
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
