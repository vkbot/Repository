.class public final Lorg/apache/commons/io/input/MessageDigestInputStream;
.super Lorg/apache/commons/io/input/ObservableInputStream;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/commons/io/input/MessageDigestInputStream$Builder;,
        Lorg/apache/commons/io/input/MessageDigestInputStream$MessageDigestMaintainingObserver;
    }
.end annotation


# instance fields
.field private final messageDigest:Ljava/security/MessageDigest;


# direct methods
.method private constructor <init>(Lorg/apache/commons/io/input/MessageDigestInputStream$Builder;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/commons/io/input/ObservableInputStream;-><init>(Lorg/apache/commons/io/input/ObservableInputStream$AbstractBuilder;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lorg/apache/commons/io/input/MessageDigestInputStream$Builder;->access$100(Lorg/apache/commons/io/input/MessageDigestInputStream$Builder;)Ljava/security/MessageDigest;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const-string v0, "builder.messageDigest"

    .line 9
    .line 10
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lorg/apache/commons/io/input/MessageDigestInputStream;->messageDigest:Ljava/security/MessageDigest;

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

.method public synthetic constructor <init>(Lorg/apache/commons/io/input/MessageDigestInputStream$Builder;Lorg/apache/commons/io/input/MessageDigestInputStream$1;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lorg/apache/commons/io/input/MessageDigestInputStream;-><init>(Lorg/apache/commons/io/input/MessageDigestInputStream$Builder;)V

    return-void
.end method

.method public static builder()Lorg/apache/commons/io/input/MessageDigestInputStream$Builder;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/io/input/MessageDigestInputStream$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/apache/commons/io/input/MessageDigestInputStream$Builder;-><init>()V

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


# virtual methods
.method public getMessageDigest()Ljava/security/MessageDigest;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/io/input/MessageDigestInputStream;->messageDigest:Ljava/security/MessageDigest;

    .line 2
    .line 3
    return-object v0
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
