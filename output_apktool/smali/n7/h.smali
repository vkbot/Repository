.class public final Ln7/h;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"

# interfaces
.implements Ln7/u0;
.implements Ln7/r0;


# static fields
.field public static final c:Ln7/h;

.field public static final d:[B


# instance fields
.field public final synthetic b:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ln7/h;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ln7/h;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ln7/h;->c:Ln7/h;

    .line 8
    .line 9
    const/16 v0, 0x10

    .line 10
    .line 11
    new-array v0, v0, [B

    .line 12
    .line 13
    fill-array-data v0, :array_0

    .line 14
    .line 15
    .line 16
    sput-object v0, Ln7/h;->d:[B

    .line 17
    .line 18
    return-void

    .line 19
    :array_0
    .array-data 1
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x41t
        0x42t
        0x43t
        0x44t
        0x45t
        0x46t
    .end array-data
    .line 20
    .line 21
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 55
    iput p1, p0, Ln7/h;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljavax/net/ssl/SSLSession;)V
    .locals 5

    .line 1
    const/4 v0, 0x4

    .line 2
    iput v0, p0, Ln7/h;->b:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, Ljavax/net/ssl/SSLSession;->getCipherSuite()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljavax/net/ssl/SSLSession;->getLocalCertificates()[Ljava/security/cert/Certificate;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    aget-object v0, v0, v1

    .line 18
    .line 19
    :cond_0
    :try_start_0
    invoke-interface {p1}, Ljavax/net/ssl/SSLSession;->getPeerCertificates()[Ljava/security/cert/Certificate;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    aget-object p1, v0, v1
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception v0

    .line 29
    sget-object v1, Ln7/x;->d:Ljava/util/logging/Logger;

    .line 30
    .line 31
    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 32
    .line 33
    invoke-interface {p1}, Ljavax/net/ssl/SSLSession;->getPeerHost()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v3, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v4, "Peer cert not available for peerHost="

    .line 40
    .line 41
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v1, v2, p1, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_0
    return-void
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
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Ln7/h;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "gzip"

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    const-string v0, "identity"

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 107
    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public b(Ljava/lang/Object;)[B
    .locals 10

    .line 1
    iget v0, p0, Ln7/h;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ln7/f1;

    .line 7
    .line 8
    iget-object p1, p1, Ln7/f1;->a:Ln7/e1;

    .line 9
    .line 10
    iget-object p1, p1, Ln7/e1;->c:[B

    .line 11
    .line 12
    return-object p1

    .line 13
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 14
    .line 15
    sget-object v0, Li4/b;->b:Ljava/nio/charset/Charset;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v0, 0x0

    .line 22
    move v1, v0

    .line 23
    :goto_0
    array-length v2, p1

    .line 24
    if-ge v1, v2, :cond_6

    .line 25
    .line 26
    aget-byte v2, p1, v1

    .line 27
    .line 28
    const/16 v3, 0x7e

    .line 29
    .line 30
    const/16 v4, 0x20

    .line 31
    .line 32
    const/16 v5, 0x25

    .line 33
    .line 34
    if-lt v2, v4, :cond_1

    .line 35
    .line 36
    if-ge v2, v3, :cond_1

    .line 37
    .line 38
    if-ne v2, v5, :cond_0

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    :goto_1
    array-length v2, p1

    .line 45
    sub-int/2addr v2, v1

    .line 46
    mul-int/lit8 v2, v2, 0x3

    .line 47
    .line 48
    add-int/2addr v2, v1

    .line 49
    new-array v2, v2, [B

    .line 50
    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    invoke-static {p1, v0, v2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 54
    .line 55
    .line 56
    :cond_2
    move v0, v1

    .line 57
    :goto_2
    array-length v6, p1

    .line 58
    if-ge v1, v6, :cond_5

    .line 59
    .line 60
    aget-byte v6, p1, v1

    .line 61
    .line 62
    if-lt v6, v4, :cond_4

    .line 63
    .line 64
    if-ge v6, v3, :cond_4

    .line 65
    .line 66
    if-ne v6, v5, :cond_3

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_3
    add-int/lit8 v7, v0, 0x1

    .line 70
    .line 71
    aput-byte v6, v2, v0

    .line 72
    .line 73
    move v0, v7

    .line 74
    goto :goto_4

    .line 75
    :cond_4
    :goto_3
    aput-byte v5, v2, v0

    .line 76
    .line 77
    add-int/lit8 v7, v0, 0x1

    .line 78
    .line 79
    shr-int/lit8 v8, v6, 0x4

    .line 80
    .line 81
    and-int/lit8 v8, v8, 0xf

    .line 82
    .line 83
    sget-object v9, Ln7/h;->d:[B

    .line 84
    .line 85
    aget-byte v8, v9, v8

    .line 86
    .line 87
    aput-byte v8, v2, v7

    .line 88
    .line 89
    add-int/lit8 v7, v0, 0x2

    .line 90
    .line 91
    and-int/lit8 v6, v6, 0xf

    .line 92
    .line 93
    aget-byte v6, v9, v6

    .line 94
    .line 95
    aput-byte v6, v2, v7

    .line 96
    .line 97
    add-int/lit8 v0, v0, 0x3

    .line 98
    .line 99
    :goto_4
    add-int/lit8 v1, v1, 0x1

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_5
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    :cond_6
    return-object p1

    .line 107
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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
.end method

.method public c(Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget v0, p0, Ln7/h;->b:I

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Ln7/a1;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    return v1

    .line 13
    :pswitch_0
    check-cast p1, Ln7/n0;

    .line 14
    .line 15
    check-cast p1, Lp7/i;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const-class p1, Lp7/i;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :try_start_0
    const-string v0, "android.app.Application"

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-static {v0, v1, p1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    const/16 p1, 0x8

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catch_0
    const/4 p1, 0x3

    .line 36
    :goto_0
    return p1

    .line 37
    :pswitch_1
    check-cast p1, Ln7/k0;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    return v1

    .line 43
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public j(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p1
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
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

.method public k([B)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Ln7/h;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    array-length v0, p1

    .line 7
    const/16 v1, 0x30

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-ne v0, v3, :cond_0

    .line 12
    .line 13
    aget-byte v0, p1, v2

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    sget-object p1, Ln7/f1;->e:Ln7/f1;

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    array-length v0, p1

    .line 21
    const/16 v4, 0x39

    .line 22
    .line 23
    if-eq v0, v3, :cond_3

    .line 24
    .line 25
    const/4 v5, 0x2

    .line 26
    if-eq v0, v5, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    aget-byte v0, p1, v2

    .line 30
    .line 31
    if-lt v0, v1, :cond_5

    .line 32
    .line 33
    if-le v0, v4, :cond_2

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    sub-int/2addr v0, v1

    .line 37
    mul-int/lit8 v2, v0, 0xa

    .line 38
    .line 39
    move v0, v2

    .line 40
    move v2, v3

    .line 41
    goto :goto_0

    .line 42
    :cond_3
    move v0, v2

    .line 43
    :goto_0
    aget-byte v2, p1, v2

    .line 44
    .line 45
    if-lt v2, v1, :cond_5

    .line 46
    .line 47
    if-le v2, v4, :cond_4

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    sub-int/2addr v2, v1

    .line 51
    add-int/2addr v2, v0

    .line 52
    sget-object v0, Ln7/f1;->d:Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-ge v2, v1, :cond_5

    .line 59
    .line 60
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Ln7/f1;

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_5
    :goto_1
    sget-object v0, Ln7/f1;->g:Ln7/f1;

    .line 68
    .line 69
    new-instance v1, Ljava/lang/String;

    .line 70
    .line 71
    sget-object v2, Li4/b;->a:Ljava/nio/charset/Charset;

    .line 72
    .line 73
    invoke-direct {v1, p1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 74
    .line 75
    .line 76
    const-string p1, "Unknown code "

    .line 77
    .line 78
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {v0, p1}, Ln7/f1;->h(Ljava/lang/String;)Ln7/f1;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    :goto_2
    return-object p1

    .line 87
    :pswitch_0
    const/4 v0, 0x0

    .line 88
    move v1, v0

    .line 89
    :goto_3
    array-length v2, p1

    .line 90
    if-ge v1, v2, :cond_a

    .line 91
    .line 92
    aget-byte v2, p1, v1

    .line 93
    .line 94
    const/16 v3, 0x20

    .line 95
    .line 96
    const/16 v4, 0x25

    .line 97
    .line 98
    if-lt v2, v3, :cond_7

    .line 99
    .line 100
    const/16 v3, 0x7e

    .line 101
    .line 102
    if-ge v2, v3, :cond_7

    .line 103
    .line 104
    if-ne v2, v4, :cond_6

    .line 105
    .line 106
    add-int/lit8 v2, v1, 0x2

    .line 107
    .line 108
    array-length v3, p1

    .line 109
    if-ge v2, v3, :cond_6

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_7
    :goto_4
    array-length v1, p1

    .line 116
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    move v2, v0

    .line 121
    :goto_5
    array-length v3, p1

    .line 122
    if-ge v2, v3, :cond_9

    .line 123
    .line 124
    aget-byte v3, p1, v2

    .line 125
    .line 126
    if-ne v3, v4, :cond_8

    .line 127
    .line 128
    add-int/lit8 v3, v2, 0x2

    .line 129
    .line 130
    array-length v5, p1

    .line 131
    if-ge v3, v5, :cond_8

    .line 132
    .line 133
    :try_start_0
    new-instance v3, Ljava/lang/String;

    .line 134
    .line 135
    add-int/lit8 v5, v2, 0x1

    .line 136
    .line 137
    sget-object v6, Li4/b;->a:Ljava/nio/charset/Charset;

    .line 138
    .line 139
    const/4 v7, 0x2

    .line 140
    invoke-direct {v3, p1, v5, v7, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 141
    .line 142
    .line 143
    const/16 v5, 0x10

    .line 144
    .line 145
    invoke-static {v3, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    int-to-byte v3, v3

    .line 150
    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 151
    .line 152
    .line 153
    add-int/lit8 v2, v2, 0x3

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :catch_0
    :cond_8
    aget-byte v3, p1, v2

    .line 157
    .line 158
    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 159
    .line 160
    .line 161
    add-int/lit8 v2, v2, 0x1

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_9
    new-instance p1, Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    sget-object v3, Li4/b;->b:Ljava/nio/charset/Charset;

    .line 175
    .line 176
    invoke-direct {p1, v2, v0, v1, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 177
    .line 178
    .line 179
    goto :goto_6

    .line 180
    :cond_a
    new-instance v1, Ljava/lang/String;

    .line 181
    .line 182
    invoke-direct {v1, p1, v0}, Ljava/lang/String;-><init>([BI)V

    .line 183
    .line 184
    .line 185
    move-object p1, v1

    .line 186
    :goto_6
    return-object p1

    .line 187
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Ln7/h;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    const-string v0, "internal:health-check-consumer-listener"

    .line 12
    .line 13
    return-object v0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
