.class public final Lv7/p;
.super Ln7/e;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# instance fields
.field public final synthetic b:Ln7/e;

.field public final synthetic c:Lv7/r;


# direct methods
.method public constructor <init>(Lv7/r;Ln7/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv7/p;->c:Lv7/r;

    .line 5
    .line 6
    iput-object p2, p0, Lv7/p;->b:Ln7/e;

    .line 7
    .line 8
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
.end method


# virtual methods
.method public final B(Ln7/f1;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lv7/p;->c:Lv7/r;

    .line 2
    .line 3
    iget-object v0, v0, Lv7/r;->a:Lv7/k;

    .line 4
    .line 5
    invoke-virtual {p1}, Ln7/f1;->f()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, v0, Lv7/k;->a:Lv7/o;

    .line 10
    .line 11
    iget-object v3, v2, Lv7/o;->e:Lv7/n;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    iget-object v2, v2, Lv7/o;->f:Lv7/n;

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v0, v0, Lv7/k;->b:Ll/d;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget-object v0, v0, Ll/d;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object v0, v0, Ll/d;->d:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object v0, p0, Lv7/p;->b:Ln7/e;

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ln7/e;->B(Ln7/f1;)V

    .line 42
    .line 43
    .line 44
    return-void
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

.method public final C(Ln7/b;Ln7/v0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/p;->b:Ln7/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ln7/e;->C(Ln7/b;Ln7/v0;)V

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
.end method

.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/p;->b:Ln7/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln7/e;->a()V

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

.method public final g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/p;->b:Ln7/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln7/e;->g()V

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

.method public final h(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/p;->b:Ln7/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln7/e;->h(I)V

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

.method public final i(IJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/p;->b:Ln7/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Ln7/e;->i(IJ)V

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
.end method

.method public final j(Ln7/v0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/p;->b:Ln7/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln7/e;->j(Ln7/v0;)V

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

.method public final k(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/p;->b:Ln7/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ln7/e;->k(J)V

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

.method public final l(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/p;->b:Ln7/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ln7/e;->l(J)V

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

.method public final s()V
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/p;->b:Ln7/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln7/e;->s()V

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

.method public final t(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/p;->b:Ln7/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln7/e;->t(I)V

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
    iget-object v2, p0, Lv7/p;->b:Ln7/e;

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

.method public final u(IJJ)V
    .locals 6

    .line 1
    iget-object v0, p0, Lv7/p;->b:Ln7/e;

    .line 2
    .line 3
    move v1, p1

    .line 4
    move-wide v2, p2

    .line 5
    move-wide v4, p4

    .line 6
    invoke-virtual/range {v0 .. v5}, Ln7/e;->u(IJJ)V

    .line 7
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

.method public final v(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/p;->b:Ln7/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ln7/e;->v(J)V

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

.method public final w(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/p;->b:Ln7/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ln7/e;->w(J)V

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
