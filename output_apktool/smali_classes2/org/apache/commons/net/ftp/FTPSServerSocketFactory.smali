.class public Lorg/apache/commons/net/ftp/FTPSServerSocketFactory;
.super Ljavax/net/ServerSocketFactory;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# instance fields
.field private final sslContext:Ljavax/net/ssl/SSLContext;


# direct methods
.method public constructor <init>(Ljavax/net/ssl/SSLContext;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljavax/net/ServerSocketFactory;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/apache/commons/net/ftp/FTPSServerSocketFactory;->sslContext:Ljavax/net/ssl/SSLContext;

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

.method private getServerSocketFactory()Ljavax/net/ssl/SSLServerSocketFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/net/ftp/FTPSServerSocketFactory;->sslContext:Ljavax/net/ssl/SSLContext;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getServerSocketFactory()Ljavax/net/ssl/SSLServerSocketFactory;

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


# virtual methods
.method public createServerSocket()Ljava/net/ServerSocket;
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/apache/commons/net/ftp/FTPSServerSocketFactory;->getServerSocketFactory()Ljavax/net/ssl/SSLServerSocketFactory;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljavax/net/ServerSocketFactory;->createServerSocket()Ljava/net/ServerSocket;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, Lorg/apache/commons/net/ftp/FTPSServerSocketFactory;->init(Ljava/net/ServerSocket;)Ljava/net/ServerSocket;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
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

.method public createServerSocket(I)Ljava/net/ServerSocket;
    .locals 1

    .line 14
    invoke-direct {p0}, Lorg/apache/commons/net/ftp/FTPSServerSocketFactory;->getServerSocketFactory()Ljavax/net/ssl/SSLServerSocketFactory;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljavax/net/ServerSocketFactory;->createServerSocket(I)Ljava/net/ServerSocket;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/apache/commons/net/ftp/FTPSServerSocketFactory;->init(Ljava/net/ServerSocket;)Ljava/net/ServerSocket;

    move-result-object p1

    return-object p1
.end method

.method public createServerSocket(II)Ljava/net/ServerSocket;
    .locals 1

    .line 15
    invoke-direct {p0}, Lorg/apache/commons/net/ftp/FTPSServerSocketFactory;->getServerSocketFactory()Ljavax/net/ssl/SSLServerSocketFactory;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljavax/net/ServerSocketFactory;->createServerSocket(II)Ljava/net/ServerSocket;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/apache/commons/net/ftp/FTPSServerSocketFactory;->init(Ljava/net/ServerSocket;)Ljava/net/ServerSocket;

    move-result-object p1

    return-object p1
.end method

.method public createServerSocket(IILjava/net/InetAddress;)Ljava/net/ServerSocket;
    .locals 1

    .line 16
    invoke-direct {p0}, Lorg/apache/commons/net/ftp/FTPSServerSocketFactory;->getServerSocketFactory()Ljavax/net/ssl/SSLServerSocketFactory;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Ljavax/net/ServerSocketFactory;->createServerSocket(IILjava/net/InetAddress;)Ljava/net/ServerSocket;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/apache/commons/net/ftp/FTPSServerSocketFactory;->init(Ljava/net/ServerSocket;)Ljava/net/ServerSocket;

    move-result-object p1

    return-object p1
.end method

.method public init(Ljava/net/ServerSocket;)Ljava/net/ServerSocket;
    .locals 2

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Ljavax/net/ssl/SSLServerSocket;

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-virtual {v0, v1}, Ljavax/net/ssl/SSLServerSocket;->setUseClientMode(Z)V

    .line 6
    .line 7
    .line 8
    return-object p1
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
