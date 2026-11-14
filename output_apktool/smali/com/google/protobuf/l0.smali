.class public final Lcom/google/protobuf/l0;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# static fields
.field public static final b:Lcom/google/protobuf/v;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/protobuf/v;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lcom/google/protobuf/v;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/google/protobuf/l0;->b:Lcom/google/protobuf/v;

    .line 8
    .line 9
    return-void
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
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/google/protobuf/k0;

    .line 2
    .line 3
    :try_start_0
    const-string v1, "com.google.protobuf.DescriptorMessageInfoFactory"

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "getInstance"

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lcom/google/protobuf/r0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    sget-object v1, Lcom/google/protobuf/l0;->b:Lcom/google/protobuf/v;

    .line 24
    .line 25
    :goto_0
    const/4 v2, 0x2

    .line 26
    new-array v2, v2, [Lcom/google/protobuf/r0;

    .line 27
    .line 28
    sget-object v3, Lcom/google/protobuf/v;->b:Lcom/google/protobuf/v;

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    aput-object v3, v2, v4

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    aput-object v1, v2, v3

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v2, v0, Lcom/google/protobuf/k0;->a:[Lcom/google/protobuf/r0;

    .line 40
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    sget-object v1, Lcom/google/protobuf/b0;->a:Ljava/nio/charset/Charset;

    .line 45
    .line 46
    iput-object v0, p0, Lcom/google/protobuf/l0;->a:Ljava/lang/Object;

    .line 47
    .line 48
    return-void
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
.end method

.method public constructor <init>(Lcom/google/protobuf/n;)V
    .locals 1

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    const-string v0, "output"

    invoke-static {p1, v0}, Lcom/google/protobuf/b0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/protobuf/l0;->a:Ljava/lang/Object;

    .line 51
    iput-object p0, p1, Lcom/google/protobuf/n;->a:Lcom/google/protobuf/l0;

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/Object;Lcom/google/protobuf/b1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/l0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/protobuf/n;

    .line 4
    .line 5
    check-cast p2, Lcom/google/protobuf/a;

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/n;->w(II)V

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Lcom/google/protobuf/n;->a:Lcom/google/protobuf/l0;

    .line 12
    .line 13
    invoke-interface {p3, p2, v1}, Lcom/google/protobuf/b1;->a(Ljava/lang/Object;Lcom/google/protobuf/l0;)V

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x4

    .line 17
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/n;->w(II)V

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
.end method
