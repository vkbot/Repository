.class public final Lf5/m0;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# instance fields
.field public final a:Lf5/l0;

.field public b:Z

.field public c:Z

.field public d:I


# direct methods
.method public constructor <init>(Lf5/l0;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lf5/m0;->d:I

    .line 6
    .line 7
    iput-object p1, p0, Lf5/m0;->a:Lf5/l0;

    .line 8
    .line 9
    iget-object v1, p1, Lf5/l0;->a:Lo4/f;

    .line 10
    .line 11
    invoke-virtual {v1}, Lo4/f;->a()V

    .line 12
    .line 13
    .line 14
    iget-object v1, v1, Lo4/f;->a:Landroid/content/Context;

    .line 15
    .line 16
    check-cast v1, Landroid/app/Application;

    .line 17
    .line 18
    const-string v2, "com.google.firebase.inappmessaging"

    .line 19
    .line 20
    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v3, "fresh_install"

    .line 25
    .line 26
    invoke-interface {v1, v3}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    const/4 v5, 0x1

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-interface {v1, v3, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {p1, v3, v5}, Lf5/l0;->a(Ljava/lang/String;Z)V

    .line 39
    .line 40
    .line 41
    :goto_0
    iput-boolean v5, p0, Lf5/m0;->c:Z

    .line 42
    .line 43
    iget-object v1, p1, Lf5/l0;->a:Lo4/f;

    .line 44
    .line 45
    invoke-virtual {v1}, Lo4/f;->a()V

    .line 46
    .line 47
    .line 48
    iget-object v1, v1, Lo4/f;->a:Landroid/content/Context;

    .line 49
    .line 50
    check-cast v1, Landroid/app/Application;

    .line 51
    .line 52
    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const-string v2, "test_device"

    .line 57
    .line 58
    invoke-interface {v1, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_1

    .line 63
    .line 64
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-virtual {p1, v2, v0}, Lf5/l0;->a(Ljava/lang/String;Z)V

    .line 70
    .line 71
    .line 72
    :goto_1
    iput-boolean v0, p0, Lf5/m0;->b:Z

    .line 73
    .line 74
    return-void
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
