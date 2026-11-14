.class public Lorg/apache/commons/io/output/FileWriterWithEncoding;
.super Lorg/apache/commons/io/output/ProxyWriter;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/commons/io/output/FileWriterWithEncoding$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/io/File;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 26
    invoke-direct {p0, p1, p2, v0}, Lorg/apache/commons/io/output/FileWriterWithEncoding;-><init>(Ljava/io/File;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Ljava/lang/String;Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 27
    invoke-static {p1, p2, p3}, Lorg/apache/commons/io/output/FileWriterWithEncoding;->initWriter(Ljava/io/File;Ljava/lang/Object;Z)Ljava/io/OutputStreamWriter;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/apache/commons/io/output/FileWriterWithEncoding;-><init>(Ljava/io/OutputStreamWriter;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Ljava/nio/charset/Charset;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 22
    invoke-direct {p0, p1, p2, v0}, Lorg/apache/commons/io/output/FileWriterWithEncoding;-><init>(Ljava/io/File;Ljava/nio/charset/Charset;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Ljava/nio/charset/Charset;Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 23
    invoke-static {p1, p2, p3}, Lorg/apache/commons/io/output/FileWriterWithEncoding;->initWriter(Ljava/io/File;Ljava/lang/Object;Z)Ljava/io/OutputStreamWriter;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/apache/commons/io/output/FileWriterWithEncoding;-><init>(Ljava/io/OutputStreamWriter;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Ljava/nio/charset/CharsetEncoder;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 24
    invoke-direct {p0, p1, p2, v0}, Lorg/apache/commons/io/output/FileWriterWithEncoding;-><init>(Ljava/io/File;Ljava/nio/charset/CharsetEncoder;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Ljava/nio/charset/CharsetEncoder;Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 25
    invoke-static {p1, p2, p3}, Lorg/apache/commons/io/output/FileWriterWithEncoding;->initWriter(Ljava/io/File;Ljava/lang/Object;Z)Ljava/io/OutputStreamWriter;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/apache/commons/io/output/FileWriterWithEncoding;-><init>(Ljava/io/OutputStreamWriter;)V

    return-void
.end method

.method private constructor <init>(Ljava/io/OutputStreamWriter;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lorg/apache/commons/io/output/ProxyWriter;-><init>(Ljava/io/Writer;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 33
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-direct {p0, v0, p2, p1}, Lorg/apache/commons/io/output/FileWriterWithEncoding;-><init>(Ljava/io/File;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 34
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, p2, p3}, Lorg/apache/commons/io/output/FileWriterWithEncoding;-><init>(Ljava/io/File;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/nio/charset/Charset;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 29
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-direct {p0, v0, p2, p1}, Lorg/apache/commons/io/output/FileWriterWithEncoding;-><init>(Ljava/io/File;Ljava/nio/charset/Charset;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/nio/charset/Charset;Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 30
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, p2, p3}, Lorg/apache/commons/io/output/FileWriterWithEncoding;-><init>(Ljava/io/File;Ljava/nio/charset/Charset;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/nio/charset/CharsetEncoder;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 31
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-direct {p0, v0, p2, p1}, Lorg/apache/commons/io/output/FileWriterWithEncoding;-><init>(Ljava/io/File;Ljava/nio/charset/CharsetEncoder;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/nio/charset/CharsetEncoder;Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 32
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, p2, p3}, Lorg/apache/commons/io/output/FileWriterWithEncoding;-><init>(Ljava/io/File;Ljava/nio/charset/CharsetEncoder;Z)V

    return-void
.end method

.method private constructor <init>(Lorg/apache/commons/io/output/FileWriterWithEncoding$Builder;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lorg/apache/commons/io/output/FileWriterWithEncoding$Builder;->access$100(Lorg/apache/commons/io/output/FileWriterWithEncoding$Builder;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Lorg/apache/commons/io/output/FileWriterWithEncoding$Builder;->access$200(Lorg/apache/commons/io/output/FileWriterWithEncoding$Builder;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {p1}, Lorg/apache/commons/io/output/FileWriterWithEncoding$Builder;->access$300(Lorg/apache/commons/io/output/FileWriterWithEncoding$Builder;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {v0, v1, p1}, Lorg/apache/commons/io/output/FileWriterWithEncoding;->initWriter(Ljava/io/File;Ljava/lang/Object;Z)Ljava/io/OutputStreamWriter;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {p0, p1}, Lorg/apache/commons/io/output/ProxyWriter;-><init>(Ljava/io/Writer;)V

    .line 18
    .line 19
    .line 20
    return-void
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
.end method

.method public synthetic constructor <init>(Lorg/apache/commons/io/output/FileWriterWithEncoding$Builder;Lorg/apache/commons/io/output/FileWriterWithEncoding$1;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lorg/apache/commons/io/output/FileWriterWithEncoding;-><init>(Lorg/apache/commons/io/output/FileWriterWithEncoding$Builder;)V

    return-void
.end method

.method public static builder()Lorg/apache/commons/io/output/FileWriterWithEncoding$Builder;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/io/output/FileWriterWithEncoding$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/apache/commons/io/output/FileWriterWithEncoding$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
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
.end method

.method private static initWriter(Ljava/io/File;Ljava/lang/Object;Z)Ljava/io/OutputStreamWriter;
    .locals 2

    .line 1
    const-string v0, "file"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    :try_start_0
    invoke-static {p0, p2}, Lorg/apache/commons/io/FileUtils;->newOutputStream(Ljava/io/File;Z)Ljava/io/OutputStream;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz p1, :cond_2

    .line 16
    .line 17
    instance-of p2, p1, Ljava/nio/charset/Charset;

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    instance-of p2, p1, Ljava/nio/charset/CharsetEncoder;

    .line 23
    .line 24
    if-eqz p2, :cond_1

    .line 25
    .line 26
    new-instance p2, Ljava/io/OutputStreamWriter;

    .line 27
    .line 28
    check-cast p1, Ljava/nio/charset/CharsetEncoder;

    .line 29
    .line 30
    invoke-direct {p2, v1, p1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/CharsetEncoder;)V

    .line 31
    .line 32
    .line 33
    return-object p2

    .line 34
    :catch_0
    move-exception p1

    .line 35
    goto :goto_1

    .line 36
    :catch_1
    move-exception p1

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    new-instance p2, Ljava/io/OutputStreamWriter;

    .line 39
    .line 40
    check-cast p1, Ljava/lang/String;

    .line 41
    .line 42
    invoke-direct {p2, v1, p1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object p2

    .line 46
    :cond_2
    :goto_0
    new-instance p2, Ljava/io/OutputStreamWriter;

    .line 47
    .line 48
    check-cast p1, Ljava/nio/charset/Charset;

    .line 49
    .line 50
    invoke-static {p1}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-direct {p2, v1, p1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    .line 57
    return-object p2

    .line 58
    :goto_1
    :try_start_1
    invoke-static {v1}, Lorg/apache/commons/io/IOUtils;->close(Ljava/io/Closeable;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :catch_2
    move-exception p2

    .line 63
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    :goto_2
    if-nez v0, :cond_3

    .line 67
    .line 68
    invoke-static {p0}, Lorg/apache/commons/io/FileUtils;->deleteQuietly(Ljava/io/File;)Z

    .line 69
    .line 70
    .line 71
    :cond_3
    throw p1
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
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
.end method
