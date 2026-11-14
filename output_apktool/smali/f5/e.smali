.class public final synthetic Lf5/e;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"

# interfaces
.implements Lb8/b;
.implements Lb8/d;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lf5/g;


# direct methods
.method public synthetic constructor <init>(Lf5/g;I)V
    .locals 0

    .line 1
    iput p2, p0, Lf5/e;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Lf5/e;->c:Lf5/g;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
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
.method public accept(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lf5/e;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iget-object v0, p0, Lf5/e;->c:Lf5/g;

    .line 10
    .line 11
    iput-object p1, v0, Lf5/g;->d:Ly5/i;

    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Lf5/e;->c:Lf5/g;

    .line 15
    .line 16
    check-cast p1, Ly5/i;

    .line 17
    .line 18
    iput-object p1, v0, Lf5/g;->d:Ly5/i;

    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 22
    .line 23
.end method

.method public test(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    check-cast p1, Ly5/i;

    .line 2
    .line 3
    iget-object v0, p0, Lf5/e;->c:Lf5/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ly5/i;->p()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    iget-object p1, v0, Lf5/g;->c:Li5/a;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    new-instance p1, Ljava/io/File;

    .line 22
    .line 23
    iget-object v0, v0, Lf5/g;->b:Landroid/app/Application;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v5, "fiam_eligible_campaigns_cache_file"

    .line 34
    .line 35
    invoke-direct {p1, v0, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-wide/16 v5, 0x0

    .line 39
    .line 40
    cmp-long v0, v1, v5

    .line 41
    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    cmp-long p1, v3, v1

    .line 45
    .line 46
    if-gez p1, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    const-wide/32 v5, 0x5265c00

    .line 60
    .line 61
    .line 62
    add-long/2addr v0, v5

    .line 63
    cmp-long p1, v3, v0

    .line 64
    .line 65
    if-gez p1, :cond_1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    const/4 p1, 0x0

    .line 69
    return p1

    .line 70
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 71
    return p1
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
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
.end method
