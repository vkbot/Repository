.class public final Lb1/d;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic a:Lb1/f;


# direct methods
.method public constructor <init>(Lb1/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb1/d;->a:Lb1/f;

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


# virtual methods
.method public final onBindingDied(Landroid/content/ComponentName;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lb1/d;->onServiceDisconnected(Landroid/content/ComponentName;)V

    .line 2
    .line 3
    .line 4
    return-void
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

.method public final onNullBinding(Landroid/content/ComponentName;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lb1/d;->onServiceDisconnected(Landroid/content/ComponentName;)V

    .line 2
    .line 3
    .line 4
    return-void
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

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lb1/d;->a:Lb1/f;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p1, Lb1/f;->m:Z

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p1, Lb1/f;->l:Z

    .line 8
    .line 9
    iput-object p2, p1, Lb1/f;->g:Landroid/os/IBinder;

    .line 10
    .line 11
    iget-object p1, p0, Lb1/d;->a:Lb1/f;

    .line 12
    .line 13
    iget-object p2, p1, Lb1/f;->b:Landroid/os/Handler;

    .line 14
    .line 15
    iget-object p1, p1, Lb1/f;->o:Lb1/b;

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lb1/d;->a:Lb1/f;

    .line 21
    .line 22
    invoke-virtual {p1}, Lb1/f;->a()V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lb1/d;->a:Lb1/f;

    .line 26
    .line 27
    iget-object p2, p1, Lb1/f;->b:Landroid/os/Handler;

    .line 28
    .line 29
    iget-object v0, p1, Lb1/f;->p:Lb1/b;

    .line 30
    .line 31
    invoke-virtual {p2, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    iget-object p2, p1, Lb1/f;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-nez p2, :cond_0

    .line 41
    .line 42
    iget-object p2, p1, Lb1/f;->g:Landroid/os/IBinder;

    .line 43
    .line 44
    if-eqz p2, :cond_0

    .line 45
    .line 46
    iget-object p2, p1, Lb1/f;->b:Landroid/os/Handler;

    .line 47
    .line 48
    iget-object p1, p1, Lb1/f;->p:Lb1/b;

    .line 49
    .line 50
    invoke-virtual {p2, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void
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
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lb1/d;->a:Lb1/f;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput-object v0, p1, Lb1/f;->g:Landroid/os/IBinder;

    .line 5
    .line 6
    iget-object p1, p0, Lb1/d;->a:Lb1/f;

    .line 7
    .line 8
    iget-object v0, p1, Lb1/f;->b:Landroid/os/Handler;

    .line 9
    .line 10
    iget-object p1, p1, Lb1/f;->p:Lb1/b;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lb1/d;->a:Lb1/f;

    .line 16
    .line 17
    invoke-virtual {p1}, Lb1/f;->c()V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lb1/d;->a:Lb1/f;

    .line 21
    .line 22
    invoke-virtual {p1}, Lb1/f;->d()V

    .line 23
    .line 24
    .line 25
    return-void
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
.end method
