.class public final Le0/f3;
.super Landroid/os/AsyncTask;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/StringBuilder;

.field public c:I

.field public d:Lcom/example/navistart/VJCT;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Le0/f3;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

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


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Le0/f3;->d:Lcom/example/navistart/VJCT;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/16 v2, 0xb

    .line 10
    .line 11
    new-array v2, v2, [B

    .line 12
    .line 13
    fill-array-data v2, :array_0

    .line 14
    .line 15
    .line 16
    const/16 v3, 0x8

    .line 17
    .line 18
    new-array v3, v3, [B

    .line 19
    .line 20
    fill-array-data v3, :array_1

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catch_0
    move-exception p1

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    :goto_0
    new-instance v1, Ljava/io/FileWriter;

    .line 43
    .line 44
    invoke-direct {v1, v0}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/io/Writer;->flush()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/io/Writer;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :array_0
    .array-data 1
        -0x5t
        -0x48t
        -0x39t
        0x8t
        0x1dt
        0x2dt
        -0x8t
        -0x62t
        -0x3dt
        -0x6ft
        -0x2t
    .end array-data

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    :array_1
    .array-data 1
        -0x54t
        -0x1t
        -0x68t
        0x5et
        0x4dt
        0x63t
        -0x2at
        -0x3t
    .end array-data
.end method

.method public final doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Le0/f3;->a:I

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x2

    .line 7
    const/16 v4, 0x8

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, [Ljava/lang/String;

    .line 13
    .line 14
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 15
    .line 16
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    :try_start_1
    new-array v6, v3, [B

    .line 21
    .line 22
    fill-array-data v6, :array_0

    .line 23
    .line 24
    .line 25
    new-array v7, v4, [B

    .line 26
    .line 27
    fill-array-data v7, :array_1

    .line 28
    .line 29
    .line 30
    invoke-static {v6, v7}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    const/4 v7, 0x0

    .line 35
    aget-object v7, p1, v7

    .line 36
    .line 37
    invoke-virtual {v0, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 38
    .line 39
    .line 40
    new-array v6, v3, [B

    .line 41
    .line 42
    fill-array-data v6, :array_2

    .line 43
    .line 44
    .line 45
    new-array v7, v4, [B

    .line 46
    .line 47
    fill-array-data v7, :array_3

    .line 48
    .line 49
    .line 50
    invoke-static {v6, v7}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    aget-object v7, p1, v5

    .line 55
    .line 56
    invoke-virtual {v0, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 57
    .line 58
    .line 59
    new-array v6, v3, [B

    .line 60
    .line 61
    fill-array-data v6, :array_4

    .line 62
    .line 63
    .line 64
    new-array v7, v4, [B

    .line 65
    .line 66
    fill-array-data v7, :array_5

    .line 67
    .line 68
    .line 69
    invoke-static {v6, v7}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    aget-object v7, p1, v3

    .line 74
    .line 75
    invoke-virtual {v0, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 76
    .line 77
    .line 78
    new-array v3, v3, [B

    .line 79
    .line 80
    fill-array-data v3, :array_6

    .line 81
    .line 82
    .line 83
    new-array v6, v4, [B

    .line 84
    .line 85
    fill-array-data v6, :array_7

    .line 86
    .line 87
    .line 88
    invoke-static {v3, v6}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    aget-object p1, p1, v2

    .line 93
    .line 94
    invoke-virtual {v0, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 95
    .line 96
    .line 97
    new-array p1, v2, [B

    .line 98
    .line 99
    fill-array-data p1, :array_8

    .line 100
    .line 101
    .line 102
    new-array v2, v4, [B

    .line 103
    .line 104
    fill-array-data v2, :array_9

    .line 105
    .line 106
    .line 107
    invoke-static {p1, v2}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    const-string v2, ""

    .line 112
    .line 113
    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :catch_0
    move-exception p1

    .line 118
    goto/16 :goto_2

    .line 119
    .line 120
    :catch_1
    move-exception p1

    .line 121
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 122
    .line 123
    .line 124
    :goto_0
    new-instance p1, Ljava/net/URL;

    .line 125
    .line 126
    const/16 v2, 0x25

    .line 127
    .line 128
    new-array v2, v2, [B

    .line 129
    .line 130
    fill-array-data v2, :array_a

    .line 131
    .line 132
    .line 133
    new-array v3, v4, [B

    .line 134
    .line 135
    fill-array-data v3, :array_b

    .line 136
    .line 137
    .line 138
    invoke-static {v2, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-direct {p1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    check-cast p1, Ljava/net/HttpURLConnection;

    .line 150
    .line 151
    const/4 v2, 0x4

    .line 152
    new-array v2, v2, [B

    .line 153
    .line 154
    fill-array-data v2, :array_c

    .line 155
    .line 156
    .line 157
    new-array v3, v4, [B

    .line 158
    .line 159
    fill-array-data v3, :array_d

    .line 160
    .line 161
    .line 162
    invoke-static {v2, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-virtual {p1, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    new-array v1, v1, [B

    .line 170
    .line 171
    fill-array-data v1, :array_e

    .line 172
    .line 173
    .line 174
    new-array v2, v4, [B

    .line 175
    .line 176
    fill-array-data v2, :array_f

    .line 177
    .line 178
    .line 179
    invoke-static {v1, v2}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    const/16 v2, 0x1e

    .line 184
    .line 185
    new-array v2, v2, [B

    .line 186
    .line 187
    fill-array-data v2, :array_10

    .line 188
    .line 189
    .line 190
    new-array v3, v4, [B

    .line 191
    .line 192
    fill-array-data v3, :array_11

    .line 193
    .line 194
    .line 195
    invoke-static {v2, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-virtual {p1, v1, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    const/4 v1, 0x6

    .line 203
    new-array v1, v1, [B

    .line 204
    .line 205
    fill-array-data v1, :array_12

    .line 206
    .line 207
    .line 208
    new-array v2, v4, [B

    .line 209
    .line 210
    fill-array-data v2, :array_13

    .line 211
    .line 212
    .line 213
    invoke-static {v1, v2}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    const/16 v2, 0x10

    .line 218
    .line 219
    new-array v2, v2, [B

    .line 220
    .line 221
    fill-array-data v2, :array_14

    .line 222
    .line 223
    .line 224
    new-array v3, v4, [B

    .line 225
    .line 226
    fill-array-data v3, :array_15

    .line 227
    .line 228
    .line 229
    invoke-static {v2, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    invoke-virtual {p1, v1, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1, v5}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1, v5}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 240
    .line 241
    .line 242
    new-instance v1, Ljava/io/DataOutputStream;

    .line 243
    .line 244
    invoke-virtual {p1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    invoke-direct {v1, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1}, Ljava/io/DataOutputStream;->flush()V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    iput v0, p0, Le0/f3;->c:I

    .line 269
    .line 270
    new-instance v0, Ljava/io/BufferedReader;

    .line 271
    .line 272
    new-instance v1, Ljava/io/InputStreamReader;

    .line 273
    .line 274
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 279
    .line 280
    invoke-direct {v1, v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 281
    .line 282
    .line 283
    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 284
    .line 285
    .line 286
    :goto_1
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    if-eqz v1, :cond_0

    .line 291
    .line 292
    iget-object v2, p0, Le0/f3;->b:Ljava/lang/StringBuilder;

    .line 293
    .line 294
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    goto :goto_1

    .line 298
    :cond_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V

    .line 299
    .line 300
    .line 301
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 302
    .line 303
    .line 304
    goto :goto_3

    .line 305
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 306
    .line 307
    .line 308
    :goto_3
    iget p1, p0, Le0/f3;->c:I

    .line 309
    .line 310
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    return-object p1

    .line 315
    :pswitch_0
    check-cast p1, [Ljava/lang/String;

    .line 316
    .line 317
    iget-object v0, p0, Le0/f3;->d:Lcom/example/navistart/VJCT;

    .line 318
    .line 319
    :try_start_3
    iget-object v5, v0, Lcom/example/navistart/VJCT;->c:Landroid/widget/ProgressBar;

    .line 320
    .line 321
    const/16 v6, 0xa

    .line 322
    .line 323
    invoke-virtual {v5, v6}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 324
    .line 325
    .line 326
    new-instance v5, Lorg/json/JSONObject;

    .line 327
    .line 328
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 329
    .line 330
    .line 331
    const/4 v6, 0x1

    .line 332
    :try_start_4
    new-array v7, v3, [B

    .line 333
    .line 334
    fill-array-data v7, :array_16

    .line 335
    .line 336
    .line 337
    new-array v8, v4, [B

    .line 338
    .line 339
    fill-array-data v8, :array_17

    .line 340
    .line 341
    .line 342
    invoke-static {v7, v8}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v7

    .line 346
    const/4 v8, 0x0

    .line 347
    aget-object v8, p1, v8

    .line 348
    .line 349
    invoke-virtual {v5, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 350
    .line 351
    .line 352
    new-array v7, v3, [B

    .line 353
    .line 354
    fill-array-data v7, :array_18

    .line 355
    .line 356
    .line 357
    new-array v8, v4, [B

    .line 358
    .line 359
    fill-array-data v8, :array_19

    .line 360
    .line 361
    .line 362
    invoke-static {v7, v8}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v7

    .line 366
    aget-object v8, p1, v6

    .line 367
    .line 368
    invoke-virtual {v5, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 369
    .line 370
    .line 371
    new-array v7, v3, [B

    .line 372
    .line 373
    fill-array-data v7, :array_1a

    .line 374
    .line 375
    .line 376
    new-array v8, v4, [B

    .line 377
    .line 378
    fill-array-data v8, :array_1b

    .line 379
    .line 380
    .line 381
    invoke-static {v7, v8}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v7

    .line 385
    aget-object v8, p1, v3

    .line 386
    .line 387
    invoke-virtual {v5, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 388
    .line 389
    .line 390
    new-array v3, v3, [B

    .line 391
    .line 392
    fill-array-data v3, :array_1c

    .line 393
    .line 394
    .line 395
    new-array v7, v4, [B

    .line 396
    .line 397
    fill-array-data v7, :array_1d

    .line 398
    .line 399
    .line 400
    invoke-static {v3, v7}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    aget-object p1, p1, v2

    .line 405
    .line 406
    invoke-virtual {v5, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 407
    .line 408
    .line 409
    new-array p1, v2, [B

    .line 410
    .line 411
    fill-array-data p1, :array_1e

    .line 412
    .line 413
    .line 414
    new-array v2, v4, [B

    .line 415
    .line 416
    fill-array-data v2, :array_1f

    .line 417
    .line 418
    .line 419
    invoke-static {p1, v2}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object p1

    .line 423
    const-string v2, ""

    .line 424
    .line 425
    invoke-virtual {v5, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 426
    .line 427
    .line 428
    goto :goto_4

    .line 429
    :catch_2
    move-exception p1

    .line 430
    goto/16 :goto_6

    .line 431
    .line 432
    :catch_3
    move-exception p1

    .line 433
    :try_start_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 434
    .line 435
    .line 436
    :goto_4
    iget-object p1, v0, Lcom/example/navistart/VJCT;->c:Landroid/widget/ProgressBar;

    .line 437
    .line 438
    const/16 v2, 0x14

    .line 439
    .line 440
    invoke-virtual {p1, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 441
    .line 442
    .line 443
    new-instance p1, Ljava/net/URL;

    .line 444
    .line 445
    const/16 v2, 0x20

    .line 446
    .line 447
    new-array v2, v2, [B

    .line 448
    .line 449
    fill-array-data v2, :array_20

    .line 450
    .line 451
    .line 452
    new-array v3, v4, [B

    .line 453
    .line 454
    fill-array-data v3, :array_21

    .line 455
    .line 456
    .line 457
    invoke-static {v2, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    invoke-direct {p1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 465
    .line 466
    .line 467
    move-result-object p1

    .line 468
    check-cast p1, Ljava/net/HttpURLConnection;

    .line 469
    .line 470
    const/4 v2, 0x4

    .line 471
    new-array v2, v2, [B

    .line 472
    .line 473
    fill-array-data v2, :array_22

    .line 474
    .line 475
    .line 476
    new-array v3, v4, [B

    .line 477
    .line 478
    fill-array-data v3, :array_23

    .line 479
    .line 480
    .line 481
    invoke-static {v2, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    invoke-virtual {p1, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    new-array v1, v1, [B

    .line 489
    .line 490
    fill-array-data v1, :array_24

    .line 491
    .line 492
    .line 493
    new-array v2, v4, [B

    .line 494
    .line 495
    fill-array-data v2, :array_25

    .line 496
    .line 497
    .line 498
    invoke-static {v1, v2}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    const/16 v2, 0x1e

    .line 503
    .line 504
    new-array v2, v2, [B

    .line 505
    .line 506
    fill-array-data v2, :array_26

    .line 507
    .line 508
    .line 509
    new-array v3, v4, [B

    .line 510
    .line 511
    fill-array-data v3, :array_27

    .line 512
    .line 513
    .line 514
    invoke-static {v2, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    invoke-virtual {p1, v1, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    const/4 v1, 0x6

    .line 522
    new-array v1, v1, [B

    .line 523
    .line 524
    fill-array-data v1, :array_28

    .line 525
    .line 526
    .line 527
    new-array v2, v4, [B

    .line 528
    .line 529
    fill-array-data v2, :array_29

    .line 530
    .line 531
    .line 532
    invoke-static {v1, v2}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    const/16 v2, 0x10

    .line 537
    .line 538
    new-array v2, v2, [B

    .line 539
    .line 540
    fill-array-data v2, :array_2a

    .line 541
    .line 542
    .line 543
    new-array v3, v4, [B

    .line 544
    .line 545
    fill-array-data v3, :array_2b

    .line 546
    .line 547
    .line 548
    invoke-static {v2, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v2

    .line 552
    invoke-virtual {p1, v1, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {p1, v6}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {p1, v6}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 559
    .line 560
    .line 561
    new-instance v1, Ljava/io/DataOutputStream;

    .line 562
    .line 563
    invoke-virtual {p1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 564
    .line 565
    .line 566
    move-result-object v2

    .line 567
    invoke-direct {v1, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v2

    .line 574
    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    .line 575
    .line 576
    .line 577
    invoke-virtual {v1}, Ljava/io/DataOutputStream;->flush()V

    .line 578
    .line 579
    .line 580
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 581
    .line 582
    .line 583
    iget-object v1, v0, Lcom/example/navistart/VJCT;->c:Landroid/widget/ProgressBar;

    .line 584
    .line 585
    const/16 v2, 0x28

    .line 586
    .line 587
    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 591
    .line 592
    .line 593
    move-result v1

    .line 594
    iput v1, p0, Le0/f3;->c:I

    .line 595
    .line 596
    new-instance v1, Ljava/io/BufferedReader;

    .line 597
    .line 598
    new-instance v2, Ljava/io/InputStreamReader;

    .line 599
    .line 600
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 601
    .line 602
    .line 603
    move-result-object v3

    .line 604
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 605
    .line 606
    invoke-direct {v2, v3, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 607
    .line 608
    .line 609
    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 610
    .line 611
    .line 612
    :goto_5
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    if-eqz v2, :cond_1

    .line 617
    .line 618
    iget-object v3, p0, Le0/f3;->b:Ljava/lang/StringBuilder;

    .line 619
    .line 620
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    const-string v2, "\n"

    .line 624
    .line 625
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 626
    .line 627
    .line 628
    goto :goto_5

    .line 629
    :cond_1
    iget-object v0, v0, Lcom/example/navistart/VJCT;->c:Landroid/widget/ProgressBar;

    .line 630
    .line 631
    const/16 v2, 0x3c

    .line 632
    .line 633
    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    .line 637
    .line 638
    .line 639
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 640
    .line 641
    .line 642
    goto :goto_7

    .line 643
    :goto_6
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 644
    .line 645
    .line 646
    :goto_7
    iget p1, p0, Le0/f3;->c:I

    .line 647
    .line 648
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 649
    .line 650
    .line 651
    move-result-object p1

    .line 652
    return-object p1

    .line 653
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    :array_0
    .array-data 1
        0x65t
        -0x79t
    .end array-data

    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    nop

    .line 665
    :array_1
    .array-data 1
        0xct
        -0x1dt
        -0x53t
        0x5dt
        -0x27t
        0x20t
        -0x10t
        -0x4dt
    .end array-data

    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    :array_2
    .array-data 1
        -0x2et
        0x14t
    .end array-data

    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    nop

    .line 679
    :array_3
    .array-data 1
        -0x5ft
        0x7ct
        0x1dt
        -0x55t
        -0xbt
        -0x5bt
        -0x42t
        0x43t
    .end array-data

    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    :array_4
    .array-data 1
        -0x2dt
        0x5ct
    .end array-data

    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    nop

    .line 693
    :array_5
    .array-data 1
        -0x5dt
        0x35t
        0x16t
        0x7t
        0x70t
        -0x11t
        -0x1dt
        -0x41t
    .end array-data

    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    :array_6
    .array-data 1
        0x2ct
        0x2ft
    .end array-data

    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    nop

    .line 707
    :array_7
    .array-data 1
        0x49t
        0x42t
        -0x24t
        0x4t
        -0x30t
        -0x6t
        -0x6ct
        0x4ft
    .end array-data

    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    :array_8
    .array-data 1
        -0x72t
        0x51t
        0x7t
    .end array-data

    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    :array_9
    .array-data 1
        -0x1et
        0x3et
        0x60t
        0x67t
        0x62t
        0x7at
        0x45t
        0x5dt
    .end array-data

    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    :array_a
    .array-data 1
        -0x55t
        -0x80t
        -0x2ct
        0x5et
        -0x7bt
        -0x4bt
        -0x7dt
        0x6et
        -0x57t
        -0x69t
        -0x3ft
        0x5ct
        -0x7et
        -0x20t
        -0x3dt
        0x2dt
        -0x50t
        -0x26t
        -0x2et
        0x5bt
        -0x27t
        -0x20t
        -0x28t
        0x31t
        -0x14t
        -0x7et
        -0x30t
        0x40t
        -0x57t
        -0x5t
        -0x3bt
        0x2ct
        -0x5at
        -0x26t
        -0x30t
        0x46t
        -0x7at
    .end array-data

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
    nop

    .line 753
    :array_b
    .array-data 1
        -0x3dt
        -0xct
        -0x60t
        0x2et
        -0xat
        -0x71t
        -0x54t
        0x41t
    .end array-data

    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    :array_c
    .array-data 1
        0x70t
        -0x2et
        0x26t
        -0x36t
    .end array-data

    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    :array_d
    .array-data 1
        0x20t
        -0x63t
        0x75t
        -0x62t
        0x67t
        0x28t
        0x3bt
        -0x5ct
    .end array-data

    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    :array_e
    .array-data 1
        0x57t
        0x17t
        0x3t
        0x9t
        0x2t
        -0x69t
        -0x32t
        0x73t
        0x40t
        0x1t
        0x1dt
        0x18t
    .end array-data

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
    :array_f
    .array-data 1
        0x14t
        0x78t
        0x6dt
        0x7dt
        0x67t
        -0x7t
        -0x46t
        0x5et
    .end array-data

    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    :array_10
    .array-data 1
        0x71t
        0x6dt
        0x36t
        0x7t
        0x5ft
        -0x36t
        0x59t
        -0x7ct
        0x79t
        0x72t
        0x28t
        0x44t
        0x5ct
        -0x26t
        0x57t
        -0x62t
        0x2bt
        0x7et
        0x2et
        0xat
        0x44t
        -0x26t
        0x5dt
        -0x7ct
        0x2dt
        0x48t
        0x12t
        0x2dt
        0x1bt
        -0x6ft
    .end array-data

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
    nop

    .line 813
    :array_11
    .array-data 1
        0x10t
        0x1dt
        0x46t
        0x6bt
        0x36t
        -0x57t
        0x38t
        -0x10t
    .end array-data

    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    :array_12
    .array-data 1
        -0x22t
        -0x7ft
        -0x3ft
        0x56t
        -0x49t
        0x56t
    .end array-data

    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    nop

    .line 829
    :array_13
    .array-data 1
        -0x61t
        -0x1et
        -0x5et
        0x33t
        -0x39t
        0x22t
        0x4at
        -0x77t
    .end array-data

    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    :array_14
    .array-data 1
        -0x10t
        0x7et
        -0x37t
        -0x3ct
        0x57t
        0x78t
        0x63t
        -0x29t
        -0x8t
        0x61t
        -0x29t
        -0x79t
        0x54t
        0x68t
        0x6dt
        -0x33t
    .end array-data

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
    :array_15
    .array-data 1
        -0x6ft
        0xet
        -0x47t
        -0x58t
        0x3et
        0x1bt
        0x2t
        -0x5dt
    .end array-data

    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    :array_16
    .array-data 1
        -0x30t
        -0x5et
    .end array-data

    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    nop

    .line 863
    :array_17
    .array-data 1
        -0x47t
        -0x3at
        0x28t
        0x3t
        0x35t
        0x26t
        -0x2ft
        -0xat
    .end array-data

    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    :array_18
    .array-data 1
        -0x5et
        0x24t
    .end array-data

    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    nop

    .line 877
    :array_19
    .array-data 1
        -0x2ft
        0x4ct
        0x19t
        0xct
        -0x74t
        -0x25t
        -0xft
        0x32t
    .end array-data

    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    :array_1a
    .array-data 1
        -0x58t
        0x7ft
    .end array-data

    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    nop

    .line 891
    :array_1b
    .array-data 1
        -0x28t
        0x16t
        -0x39t
        -0x80t
        -0x38t
        0x16t
        0x74t
        0x5dt
    .end array-data

    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    :array_1c
    .array-data 1
        0x3at
        -0x67t
    .end array-data

    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    nop

    .line 905
    :array_1d
    .array-data 1
        0x5ft
        -0xct
        0x33t
        0x44t
        -0x1bt
        -0x16t
        -0x31t
        -0x7bt
    .end array-data

    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    :array_1e
    .array-data 1
        0x7et
        -0x3dt
        -0x2ct
    .end array-data

    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    :array_1f
    .array-data 1
        0x12t
        -0x54t
        -0x4dt
        -0x70t
        -0x60t
        0x5ft
        0x55t
        0x2at
    .end array-data

    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    :array_20
    .array-data 1
        0x1dt
        -0x4ct
        -0x3ft
        -0x65t
        -0x29t
        -0x4et
        -0x62t
        -0x11t
        0x1ft
        -0x5dt
        -0x2ct
        -0x67t
        -0x30t
        -0x19t
        -0x22t
        -0x54t
        0x6t
        -0x12t
        -0x39t
        -0x62t
        -0x75t
        -0x19t
        -0x3bt
        -0x50t
        0x5at
        -0x4at
        -0x3bt
        -0x7bt
        -0x76t
        -0x8t
        -0x27t
        -0x50t
    .end array-data

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
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    :array_21
    .array-data 1
        0x75t
        -0x40t
        -0x4bt
        -0x15t
        -0x5ct
        -0x78t
        -0x4ft
        -0x40t
    .end array-data

    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    :array_22
    .array-data 1
        0x44t
        -0xet
        0x18t
        -0xct
    .end array-data

    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    :array_23
    .array-data 1
        0x14t
        -0x43t
        0x4bt
        -0x60t
        0xdt
        -0x2t
        -0x47t
        -0x6bt
    .end array-data

    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    :array_24
    .array-data 1
        -0xet
        -0x1ft
        0x58t
        0x6ft
        0x3at
        0x7dt
        -0x67t
        -0x4bt
        -0x1bt
        -0x9t
        0x46t
        0x7et
    .end array-data

    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    :array_25
    .array-data 1
        -0x4ft
        -0x72t
        0x36t
        0x1bt
        0x5ft
        0x13t
        -0x13t
        -0x68t
    .end array-data

    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    :array_26
    .array-data 1
        -0x62t
        0x1ft
        0x3bt
        -0x27t
        -0x45t
        0x34t
        0x2ct
        -0x34t
        -0x6at
        0x0t
        0x25t
        -0x66t
        -0x48t
        0x24t
        0x22t
        -0x2at
        -0x3ct
        0xct
        0x23t
        -0x2ct
        -0x60t
        0x24t
        0x28t
        -0x34t
        -0x3et
        0x3at
        0x1ft
        -0xdt
        -0x1t
        0x6ft
    .end array-data

    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    nop

    .line 1007
    :array_27
    .array-data 1
        -0x1t
        0x6ft
        0x4bt
        -0x4bt
        -0x2et
        0x57t
        0x4dt
        -0x48t
    .end array-data

    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    :array_28
    .array-data 1
        -0x62t
        -0x76t
        0x79t
        -0x3ft
        0x69t
        0xet
    .end array-data

    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    nop

    .line 1023
    :array_29
    .array-data 1
        -0x21t
        -0x17t
        0x1at
        -0x5ct
        0x19t
        0x7at
        0x51t
        0x20t
    .end array-data

    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    :array_2a
    .array-data 1
        0x3at
        -0x2ct
        -0x4ct
        0x5ft
        -0x7dt
        -0x7ft
        0x2bt
        0x31t
        0x32t
        -0x35t
        -0x56t
        0x1ct
        -0x80t
        -0x6ft
        0x25t
        0x2bt
    .end array-data

    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    :array_2b
    .array-data 1
        0x5bt
        -0x5ct
        -0x3ct
        0x33t
        -0x16t
        -0x1et
        0x4at
        0x45t
    .end array-data
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
.end method

.method public final onPostExecute(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, Le0/f3;->a:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Integer;

    .line 9
    .line 10
    iget-object v0, p0, Le0/f3;->d:Lcom/example/navistart/VJCT;

    .line 11
    .line 12
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    .line 16
    .line 17
    iget-object v2, p0, Le0/f3;->b:Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-direct {p1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/16 v2, 0xb

    .line 27
    .line 28
    new-array v3, v2, [B

    .line 29
    .line 30
    fill-array-data v3, :array_0

    .line 31
    .line 32
    .line 33
    new-array v4, v1, [B

    .line 34
    .line 35
    fill-array-data v4, :array_1

    .line 36
    .line 37
    .line 38
    invoke-static {v3, v4}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_0

    .line 47
    .line 48
    new-array v2, v2, [B

    .line 49
    .line 50
    fill-array-data v2, :array_2

    .line 51
    .line 52
    .line 53
    new-array v3, v1, [B

    .line 54
    .line 55
    fill-array-data v3, :array_3

    .line 56
    .line 57
    .line 58
    invoke-static {v2, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    new-instance v2, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    const v4, 0x7f1304db

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const/4 v3, 0x2

    .line 86
    new-array v3, v3, [B

    .line 87
    .line 88
    fill-array-data v3, :array_4

    .line 89
    .line 90
    .line 91
    new-array v1, v1, [B

    .line 92
    .line 93
    fill-array-data v1, :array_5

    .line 94
    .line 95
    .line 96
    invoke-static {v3, v1}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    const v1, 0x7f1304dd

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    sget-object v0, Lcom/example/navistart/VJCT;->j:Landroid/widget/TextView;

    .line 125
    .line 126
    if-eqz v0, :cond_0

    .line 127
    .line 128
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :catch_0
    move-exception p1

    .line 133
    goto :goto_0

    .line 134
    :catch_1
    move-exception p1

    .line 135
    goto :goto_1

    .line 136
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    :cond_0
    :goto_2
    return-void

    .line 144
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 145
    .line 146
    iget-object v0, p0, Le0/f3;->d:Lcom/example/navistart/VJCT;

    .line 147
    .line 148
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    :try_start_1
    iget-object v2, v0, Lcom/example/navistart/VJCT;->c:Landroid/widget/ProgressBar;

    .line 152
    .line 153
    const/16 v3, 0x50

    .line 154
    .line 155
    invoke-virtual {v2, v3}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    const/16 v3, 0xc8

    .line 163
    .line 164
    if-ne v2, v3, :cond_1

    .line 165
    .line 166
    iget-object p1, p0, Le0/f3;->b:Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-virtual {p0, p1}, Le0/f3;->a(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    sget-object p1, Lcom/example/navistart/VJCT;->g:Landroid/widget/TextView;

    .line 176
    .line 177
    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    const v2, 0x7f1304d8

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    .line 190
    .line 191
    goto :goto_3

    .line 192
    :catch_2
    move-exception p1

    .line 193
    goto :goto_4

    .line 194
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    const/16 v2, 0x191

    .line 199
    .line 200
    if-ne p1, v2, :cond_2

    .line 201
    .line 202
    sget-object p1, Lcom/example/navistart/VJCT;->g:Landroid/widget/TextView;

    .line 203
    .line 204
    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    const v2, 0x7f130353

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 216
    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_2
    sget-object p1, Lcom/example/navistart/VJCT;->g:Landroid/widget/TextView;

    .line 220
    .line 221
    const/4 v2, 0x6

    .line 222
    new-array v2, v2, [B

    .line 223
    .line 224
    fill-array-data v2, :array_6

    .line 225
    .line 226
    .line 227
    new-array v1, v1, [B

    .line 228
    .line 229
    fill-array-data v1, :array_7

    .line 230
    .line 231
    .line 232
    invoke-static {v2, v1}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 237
    .line 238
    .line 239
    :goto_3
    iget-object p1, v0, Lcom/example/navistart/VJCT;->c:Landroid/widget/ProgressBar;

    .line 240
    .line 241
    const/16 v0, 0x64

    .line 242
    .line 243
    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 244
    .line 245
    .line 246
    goto :goto_5

    .line 247
    :goto_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 248
    .line 249
    .line 250
    :goto_5
    return-void

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    :array_0
    .array-data 1
        0x74t
        0x63t
        -0xat
        0x33t
        -0xdt
        0x4at
        -0x9t
        -0x32t
        0x70t
        0x6ft
        -0x1dt
    .end array-data

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
    :array_1
    .array-data 1
        0x11t
        0x1bt
        -0x7at
        0x5at
        -0x7ft
        0x2ft
        -0x58t
        -0x56t
    .end array-data

    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    :array_2
    .array-data 1
        -0x62t
        0x44t
        0x32t
        0x7ft
        0x1dt
        -0x30t
        0x17t
        0x60t
        -0x66t
        0x48t
        0x27t
    .end array-data

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
    :array_3
    .array-data 1
        -0x5t
        0x3ct
        0x42t
        0x16t
        0x6ft
        -0x4bt
        0x48t
        0x4t
    .end array-data

    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    :array_4
    .array-data 1
        0x67t
        -0x70t
    .end array-data

    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    nop

    .line 299
    :array_5
    .array-data 1
        0x49t
        -0x50t
        -0x5dt
        -0x32t
        -0x21t
        -0x65t
        -0x5dt
        0x1ft
    .end array-data

    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    :array_6
    .array-data 1
        -0x60t
        0x59t
        0x4at
        0x5ft
        -0xet
        0x8t
    .end array-data

    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    nop

    .line 315
    :array_7
    .array-data 1
        -0x1bt
        0x2bt
        0x38t
        0x30t
        -0x80t
        0x29t
        0x6at
        0x3t
    .end array-data
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
