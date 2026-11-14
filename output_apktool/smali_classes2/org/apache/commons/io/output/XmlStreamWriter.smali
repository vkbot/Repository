.class public Lorg/apache/commons/io/output/XmlStreamWriter;
.super Ljava/io/Writer;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/commons/io/output/XmlStreamWriter$Builder;
    }
.end annotation


# static fields
.field private static final BUFFER_SIZE:I = 0x2000


# instance fields
.field private charset:Ljava/nio/charset/Charset;

.field private final defaultCharset:Ljava/nio/charset/Charset;

.field private final out:Ljava/io/OutputStream;

.field private prologWriter:Ljava/io/StringWriter;

.field private writer:Ljava/io/Writer;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 22
    invoke-direct {p0, p1, v0}, Lorg/apache/commons/io/output/XmlStreamWriter;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 23
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {p0, v0, p2}, Lorg/apache/commons/io/output/XmlStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 24
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {p0, p1, v0}, Lorg/apache/commons/io/output/XmlStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 26
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {p2, v0}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lorg/apache/commons/io/output/XmlStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    return-void
.end method

.method private constructor <init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/io/StringWriter;

    .line 5
    .line 6
    const/16 v1, 0x2000

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/io/StringWriter;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->prologWriter:Ljava/io/StringWriter;

    .line 12
    .line 13
    iput-object p1, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->out:Ljava/io/OutputStream;

    .line 14
    .line 15
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    iput-object p2, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->defaultCharset:Ljava/nio/charset/Charset;

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
    .line 70
    .line 71
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
.end method

.method private constructor <init>(Lorg/apache/commons/io/output/XmlStreamWriter$Builder;)V
    .locals 1

    .line 21
    invoke-virtual {p1}, Lorg/apache/commons/io/build/AbstractStreamBuilder;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    invoke-virtual {p1}, Lorg/apache/commons/io/build/AbstractStreamBuilder;->getCharset()Ljava/nio/charset/Charset;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lorg/apache/commons/io/output/XmlStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/apache/commons/io/output/XmlStreamWriter$Builder;Lorg/apache/commons/io/output/XmlStreamWriter$1;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lorg/apache/commons/io/output/XmlStreamWriter;-><init>(Lorg/apache/commons/io/output/XmlStreamWriter$Builder;)V

    return-void
.end method

.method public static builder()Lorg/apache/commons/io/output/XmlStreamWriter$Builder;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/io/output/XmlStreamWriter$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/apache/commons/io/output/XmlStreamWriter$Builder;-><init>()V

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

.method private detectEncoding([CII)V
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->prologWriter:Ljava/io/StringWriter;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/StringWriter;->getBuffer()Ljava/lang/StringBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/2addr v1, p3

    .line 12
    const/16 v2, 0x2000

    .line 13
    .line 14
    if-le v1, v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    rsub-int v1, v1, 0x2000

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v1, p3

    .line 24
    :goto_0
    iget-object v3, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->prologWriter:Ljava/io/StringWriter;

    .line 25
    .line 26
    invoke-virtual {v3, p1, p2, v1}, Ljava/io/StringWriter;->write([CII)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v4, 0x5

    .line 34
    if-lt v3, v4, :cond_5

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuffer;->substring(II)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    const-string v5, "<?xml"

    .line 42
    .line 43
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_3

    .line 48
    .line 49
    const-string v4, "?>"

    .line 50
    .line 51
    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->indexOf(Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-lez v4, :cond_2

    .line 56
    .line 57
    sget-object v2, Lorg/apache/commons/io/input/XmlStreamReader;->ENCODING_PATTERN:Ljava/util/regex/Pattern;

    .line 58
    .line 59
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuffer;->substring(II)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v2, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_1

    .line 72
    .line 73
    const/4 v3, 0x1

    .line 74
    invoke-virtual {v2, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    sub-int/2addr v4, v3

    .line 89
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    iput-object v2, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->charset:Ljava/nio/charset/Charset;

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    iget-object v2, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->defaultCharset:Ljava/nio/charset/Charset;

    .line 101
    .line 102
    iput-object v2, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->charset:Ljava/nio/charset/Charset;

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-lt v3, v2, :cond_4

    .line 110
    .line 111
    iget-object v2, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->defaultCharset:Ljava/nio/charset/Charset;

    .line 112
    .line 113
    iput-object v2, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->charset:Ljava/nio/charset/Charset;

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_3
    iget-object v2, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->defaultCharset:Ljava/nio/charset/Charset;

    .line 117
    .line 118
    iput-object v2, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->charset:Ljava/nio/charset/Charset;

    .line 119
    .line 120
    :cond_4
    :goto_1
    iget-object v2, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->charset:Ljava/nio/charset/Charset;

    .line 121
    .line 122
    if-eqz v2, :cond_5

    .line 123
    .line 124
    const/4 v2, 0x0

    .line 125
    iput-object v2, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->prologWriter:Ljava/io/StringWriter;

    .line 126
    .line 127
    new-instance v2, Ljava/io/OutputStreamWriter;

    .line 128
    .line 129
    iget-object v3, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->out:Ljava/io/OutputStream;

    .line 130
    .line 131
    iget-object v4, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->charset:Ljava/nio/charset/Charset;

    .line 132
    .line 133
    invoke-direct {v2, v3, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 134
    .line 135
    .line 136
    iput-object v2, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->writer:Ljava/io/Writer;

    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v2, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    if-le p3, v1, :cond_5

    .line 146
    .line 147
    iget-object v0, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->writer:Ljava/io/Writer;

    .line 148
    .line 149
    add-int/2addr p2, v1

    .line 150
    sub-int/2addr p3, v1

    .line 151
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/Writer;->write([CII)V

    .line 152
    .line 153
    .line 154
    :cond_5
    return-void
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


# virtual methods
.method public close()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->writer:Ljava/io/Writer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->defaultCharset:Ljava/nio/charset/Charset;

    .line 6
    .line 7
    iput-object v0, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->charset:Ljava/nio/charset/Charset;

    .line 8
    .line 9
    new-instance v0, Ljava/io/OutputStreamWriter;

    .line 10
    .line 11
    iget-object v1, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->out:Ljava/io/OutputStream;

    .line 12
    .line 13
    iget-object v2, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->charset:Ljava/nio/charset/Charset;

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->writer:Ljava/io/Writer;

    .line 19
    .line 20
    iget-object v1, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->prologWriter:Ljava/io/StringWriter;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->writer:Ljava/io/Writer;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    .line 32
    .line 33
    .line 34
    return-void
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

.method public flush()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->writer:Ljava/io/Writer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/Writer;->flush()V

    .line 6
    .line 7
    .line 8
    :cond_0
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

.method public getDefaultEncoding()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->defaultCharset:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public getEncoding()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->charset:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public write([CII)V
    .locals 1

    .line 1
    invoke-static {p1, p2, p3}, Lorg/apache/commons/io/IOUtils;->checkFromIndexSize([CII)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->prologWriter:Ljava/io/StringWriter;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/commons/io/output/XmlStreamWriter;->detectEncoding([CII)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Lorg/apache/commons/io/output/XmlStreamWriter;->writer:Ljava/io/Writer;

    .line 13
    .line 14
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/Writer;->write([CII)V

    .line 15
    .line 16
    .line 17
    return-void
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
