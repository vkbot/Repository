.class public final Lo7/h4;
.super Ln7/e;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# static fields
.field public static final e:Ln7/a;


# instance fields
.field public final b:Ln7/e;

.field public final c:Lo7/j;

.field public final d:Ln7/k1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ln7/a;

    .line 2
    .line 3
    const-string v1, "io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ln7/a;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lo7/h4;->e:Ln7/a;

    .line 9
    .line 10
    return-void
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

.method public constructor <init>(Lo7/p0;Lo7/j;Ln7/k1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo7/h4;->b:Ln7/e;

    .line 5
    .line 6
    iput-object p2, p0, Lo7/h4;->c:Lo7/j;

    .line 7
    .line 8
    iput-object p3, p0, Lo7/h4;->d:Ln7/k1;

    .line 9
    .line 10
    return-void
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


# virtual methods
.method public final A(Ln7/t;)V
    .locals 1

    .line 1
    new-instance v0, Lo7/g4;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lo7/g4;-><init>(Lo7/h4;Ln7/t;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lo7/h4;->b:Ln7/e;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ln7/e;->A(Ln7/t;)V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lo7/h4;->b:Ln7/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln7/e;->e()Ljava/lang/String;

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
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/bumptech/glide/c;->t(Ljava/lang/Object;)Lcom/bumptech/glide/manager/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "delegate"

    .line 6
    .line 7
    iget-object v2, p0, Lo7/h4;->b:Ln7/e;

    .line 8
    .line 9
    invoke-virtual {v0, v2, v1}, Lcom/bumptech/glide/manager/s;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/bumptech/glide/manager/s;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final x()V
    .locals 1

    .line 1
    iget-object v0, p0, Lo7/h4;->b:Ln7/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln7/e;->x()V

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
.end method

.method public final z()V
    .locals 4

    .line 1
    iget-object v0, p0, Lo7/h4;->b:Ln7/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln7/e;->z()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo7/h4;->c:Lo7/j;

    .line 7
    .line 8
    iget-object v1, v0, Lo7/j;->b:Ln7/k1;

    .line 9
    .line 10
    invoke-virtual {v1}, Ln7/k1;->d()V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lf5/j;

    .line 14
    .line 15
    const/16 v3, 0x9

    .line 16
    .line 17
    invoke-direct {v2, v3, v0}, Lf5/j;-><init>(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ln7/k1;->execute(Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    return-void
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
.end method
