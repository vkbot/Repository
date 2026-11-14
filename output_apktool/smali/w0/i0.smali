.class public final Lw0/i0;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"

# interfaces
.implements Lcom/example/navistart/cores/BTProxy$Listener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Lw0/l0;


# direct methods
.method public constructor <init>(Lw0/l0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw0/i0;->c:Lw0/l0;

    .line 5
    .line 6
    iput p2, p0, Lw0/i0;->a:I

    .line 7
    .line 8
    iput p3, p0, Lw0/i0;->b:I

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
.method public final onContactsChanged(Ljava/util/List;II)V
    .locals 1

    .line 1
    if-ltz p3, :cond_2

    .line 2
    .line 3
    if-lez p3, :cond_0

    .line 4
    .line 5
    add-int/lit8 p3, p3, -0x1

    .line 6
    .line 7
    if-ge p2, p3, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    if-nez p1, :cond_1

    .line 11
    .line 12
    new-instance p1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    new-instance p2, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 21
    .line 22
    .line 23
    move-object p1, p2

    .line 24
    :goto_0
    new-instance p2, Lm0/d1;

    .line 25
    .line 26
    iget p3, p0, Lw0/i0;->a:I

    .line 27
    .line 28
    iget v0, p0, Lw0/i0;->b:I

    .line 29
    .line 30
    invoke-direct {p2, p0, p3, v0, p1}, Lm0/d1;-><init>(Lw0/i0;IILjava/util/ArrayList;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lw0/i0;->c:Lw0/l0;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lw0/l0;->g0(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    :goto_1
    return-void
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

.method public final onError(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    new-instance p1, Lp0/f;

    .line 2
    .line 3
    const/4 p2, 0x2

    .line 4
    iget v0, p0, Lw0/i0;->a:I

    .line 5
    .line 6
    iget v1, p0, Lw0/i0;->b:I

    .line 7
    .line 8
    invoke-direct {p1, p0, v0, v1, p2}, Lp0/f;-><init>(Ljava/lang/Object;III)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lw0/i0;->c:Lw0/l0;

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Lw0/l0;->g0(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
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
