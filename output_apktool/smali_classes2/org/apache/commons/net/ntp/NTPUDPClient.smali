.class public final Lorg/apache/commons/net/ntp/NTPUDPClient;
.super Lorg/apache/commons/net/DatagramSocketClient;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# static fields
.field public static final DEFAULT_PORT:I = 0x7b


# instance fields
.field private version:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/apache/commons/net/DatagramSocketClient;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    iput v0, p0, Lorg/apache/commons/net/ntp/NTPUDPClient;->version:I

    .line 6
    .line 7
    return-void
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


# virtual methods
.method public getTime(Ljava/net/InetAddress;)Lorg/apache/commons/net/ntp/TimeInfo;
    .locals 1

    const/16 v0, 0x7b

    .line 92
    invoke-virtual {p0, p1, v0}, Lorg/apache/commons/net/ntp/NTPUDPClient;->getTime(Ljava/net/InetAddress;I)Lorg/apache/commons/net/ntp/TimeInfo;

    move-result-object p1

    return-object p1
.end method

.method public getTime(Ljava/net/InetAddress;I)Lorg/apache/commons/net/ntp/TimeInfo;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lorg/apache/commons/net/DatagramSocketClient;->isOpen()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lorg/apache/commons/net/DatagramSocketClient;->open()V

    .line 8
    .line 9
    .line 10
    :cond_0
    new-instance v0, Lorg/apache/commons/net/ntp/NtpV3Impl;

    .line 11
    .line 12
    invoke-direct {v0}, Lorg/apache/commons/net/ntp/NtpV3Impl;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    invoke-interface {v0, v1}, Lorg/apache/commons/net/ntp/NtpV3Packet;->setMode(I)V

    .line 17
    .line 18
    .line 19
    iget v1, p0, Lorg/apache/commons/net/ntp/NTPUDPClient;->version:I

    .line 20
    .line 21
    invoke-interface {v0, v1}, Lorg/apache/commons/net/ntp/NtpV3Packet;->setVersion(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Lorg/apache/commons/net/ntp/NtpV3Packet;->getDatagramPacket()Ljava/net/DatagramPacket;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1, p1}, Ljava/net/DatagramPacket;->setAddress(Ljava/net/InetAddress;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p2}, Ljava/net/DatagramPacket;->setPort(I)V

    .line 32
    .line 33
    .line 34
    new-instance p1, Lorg/apache/commons/net/ntp/NtpV3Impl;

    .line 35
    .line 36
    invoke-direct {p1}, Lorg/apache/commons/net/ntp/NtpV3Impl;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-interface {p1}, Lorg/apache/commons/net/ntp/NtpV3Packet;->getDatagramPacket()Ljava/net/DatagramPacket;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-static {}, Lorg/apache/commons/net/ntp/TimeStamp;->getCurrentTime()Lorg/apache/commons/net/ntp/TimeStamp;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-interface {v0, v2}, Lorg/apache/commons/net/ntp/NtpV3Packet;->setTransmitTime(Lorg/apache/commons/net/ntp/TimeStamp;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lorg/apache/commons/net/DatagramSocketClient;->checkOpen()Ljava/net/DatagramSocket;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0, v1}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lorg/apache/commons/net/DatagramSocketClient;->checkOpen()Ljava/net/DatagramSocket;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0, p2}, Ljava/net/DatagramSocket;->receive(Ljava/net/DatagramPacket;)V

    .line 62
    .line 63
    .line 64
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 65
    .line 66
    .line 67
    move-result-wide v0

    .line 68
    invoke-interface {p1}, Lorg/apache/commons/net/ntp/NtpV3Packet;->getOriginateTimeStamp()Lorg/apache/commons/net/ntp/TimeStamp;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-virtual {v2, p2}, Lorg/apache/commons/net/ntp/TimeStamp;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    if-eqz p2, :cond_1

    .line 77
    .line 78
    new-instance p2, Lorg/apache/commons/net/ntp/TimeInfo;

    .line 79
    .line 80
    const/4 v2, 0x0

    .line 81
    invoke-direct {p2, p1, v0, v1, v2}, Lorg/apache/commons/net/ntp/TimeInfo;-><init>(Lorg/apache/commons/net/ntp/NtpV3Packet;JZ)V

    .line 82
    .line 83
    .line 84
    return-object p2

    .line 85
    :cond_1
    const-string p1, "Originate time does not match the request"

    .line 86
    .line 87
    invoke-static {p1}, Ln0/b;->A(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const/4 p1, 0x0

    .line 91
    return-object p1
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

.method public getVersion()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/commons/net/ntp/NTPUDPClient;->version:I

    .line 2
    .line 3
    return v0
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

.method public setVersion(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/commons/net/ntp/NTPUDPClient;->version:I

    .line 2
    .line 3
    return-void
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
