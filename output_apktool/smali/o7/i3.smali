.class public final Lo7/i3;
.super Ljava/io/InputStream;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"

# interfaces
.implements Ln7/d0;


# instance fields
.field public b:Lo7/c;


# virtual methods
.method public final available()I
    .locals 1

    .line 1
    iget-object v0, p0, Lo7/i3;->b:Lo7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo7/c;->f0()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lo7/i3;->b:Lo7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

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

.method public final mark(I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lo7/i3;->b:Lo7/c;

    .line 2
    .line 3
    invoke-virtual {p1}, Lo7/c;->c()V

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

.method public final markSupported()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lo7/i3;->b:Lo7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo7/c;->y()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public final read()I
    .locals 2

    .line 23
    iget-object v0, p0, Lo7/i3;->b:Lo7/c;

    invoke-virtual {v0}, Lo7/c;->f0()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, -0x1

    return v0

    .line 24
    :cond_0
    invoke-virtual {v0}, Lo7/c;->e0()I

    move-result v0

    return v0
.end method

.method public final read([BII)I
    .locals 2

    .line 1
    iget-object v0, p0, Lo7/i3;->b:Lo7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo7/c;->f0()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const/4 p1, -0x1

    .line 10
    return p1

    .line 11
    :cond_0
    invoke-virtual {v0}, Lo7/c;->f0()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v1, p3}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    invoke-virtual {v0, p1, p2, p3}, Lo7/c;->d0([BII)V

    .line 20
    .line 21
    .line 22
    return p3
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

.method public final reset()V
    .locals 1

    .line 1
    iget-object v0, p0, Lo7/i3;->b:Lo7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo7/c;->g0()V

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

.method public final skip(J)J
    .locals 3

    .line 1
    iget-object v0, p0, Lo7/i3;->b:Lo7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo7/c;->f0()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    int-to-long v1, v1

    .line 8
    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->min(JJ)J

    .line 9
    .line 10
    .line 11
    move-result-wide p1

    .line 12
    long-to-int p1, p1

    .line 13
    invoke-virtual {v0, p1}, Lo7/c;->h0(I)V

    .line 14
    .line 15
    .line 16
    int-to-long p1, p1

    .line 17
    return-wide p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
