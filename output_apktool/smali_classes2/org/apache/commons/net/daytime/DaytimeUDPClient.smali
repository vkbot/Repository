.class public final Lorg/apache/commons/net/daytime/DaytimeUDPClient;
.super Lorg/apache/commons/net/DatagramSocketClient;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# static fields
.field public static final DEFAULT_PORT:I = 0xd


# instance fields
.field private final dummyData:[B

.field private final timeData:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/apache/commons/net/DatagramSocketClient;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    new-array v0, v0, [B

    .line 6
    .line 7
    iput-object v0, p0, Lorg/apache/commons/net/daytime/DaytimeUDPClient;->dummyData:[B

    .line 8
    .line 9
    const/16 v0, 0x100

    .line 10
    .line 11
    new-array v0, v0, [B

    .line 12
    .line 13
    iput-object v0, p0, Lorg/apache/commons/net/daytime/DaytimeUDPClient;->timeData:[B

    .line 14
    .line 15
    return-void
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


# virtual methods
.method public getTime(Ljava/net/InetAddress;)Ljava/lang/String;
    .locals 1

    const/16 v0, 0xd

    .line 50
    invoke-virtual {p0, p1, v0}, Lorg/apache/commons/net/daytime/DaytimeUDPClient;->getTime(Ljava/net/InetAddress;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getTime(Ljava/net/InetAddress;I)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/net/DatagramPacket;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/commons/net/daytime/DaytimeUDPClient;->dummyData:[B

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    invoke-direct {v0, v1, v2, p1, p2}, Ljava/net/DatagramPacket;-><init>([BILjava/net/InetAddress;I)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Ljava/net/DatagramPacket;

    .line 10
    .line 11
    iget-object p2, p0, Lorg/apache/commons/net/daytime/DaytimeUDPClient;->timeData:[B

    .line 12
    .line 13
    array-length v1, p2

    .line 14
    invoke-direct {p1, p2, v1}, Ljava/net/DatagramPacket;-><init>([BI)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lorg/apache/commons/net/DatagramSocketClient;->checkOpen()Ljava/net/DatagramSocket;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p2, v0}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lorg/apache/commons/net/DatagramSocketClient;->checkOpen()Ljava/net/DatagramSocket;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p2, p1}, Ljava/net/DatagramSocket;->receive(Ljava/net/DatagramPacket;)V

    .line 29
    .line 30
    .line 31
    new-instance p2, Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/net/DatagramPacket;->getData()[B

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p1}, Ljava/net/DatagramPacket;->getLength()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-virtual {p0}, Lorg/apache/commons/net/DatagramSocketClient;->getCharset()Ljava/nio/charset/Charset;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-direct {p2, v0, v2, p1, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 47
    .line 48
    .line 49
    return-object p2
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
