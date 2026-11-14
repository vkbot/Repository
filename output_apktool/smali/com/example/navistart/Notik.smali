.class public Lcom/example/navistart/Notik;
.super Landroid/app/Service;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# static fields
.field public static final l:Ljava/util/ArrayList;

.field public static final m:Ljava/lang/String;

.field public static n:Z


# instance fields
.field public b:Lg0/a;

.field public c:Lb1/m;

.field public final d:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public final e:Ljava/util/concurrent/ConcurrentHashMap;

.field public f:Ly0/h;

.field public g:Ly0/d;

.field public h:Ly0/d;

.field public i:Ly0/d;

.field public j:Ly0/d;

.field public k:Ly0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/example/navistart/Notik;->l:Ljava/util/ArrayList;

    .line 7
    .line 8
    const/16 v0, 0x1e

    .line 9
    .line 10
    new-array v0, v0, [B

    .line 11
    .line 12
    fill-array-data v0, :array_0

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x8

    .line 16
    .line 17
    new-array v2, v1, [B

    .line 18
    .line 19
    fill-array-data v2, :array_1

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v2}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Lcom/example/navistart/Notik;->m:Ljava/lang/String;

    .line 27
    .line 28
    const/16 v0, 0x26

    .line 29
    .line 30
    new-array v0, v0, [B

    .line 31
    .line 32
    fill-array-data v0, :array_2

    .line 33
    .line 34
    .line 35
    new-array v1, v1, [B

    .line 36
    .line 37
    fill-array-data v1, :array_3

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    sput-boolean v0, Lcom/example/navistart/Notik;->n:Z

    .line 45
    .line 46
    return-void

    .line 47
    :array_0
    .array-data 1
        -0x2bt
        0x4dt
        -0x63t
        -0x13t
        -0x7ft
        0x4bt
        -0x12t
        0x18t
        -0x1t
        0x62t
        -0x79t
        -0x1bt
        -0x68t
        0x45t
        -0x11t
        0x8t
        -0x2ct
        0x4dt
        -0x7ft
        -0x13t
        -0x65t
        0x50t
        -0x22t
        0x3t
        -0x7t
        0x72t
        -0x64t
        -0x17t
        -0x79t
        0x50t
    .end array-data

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
    nop

    .line 67
    :array_1
    .array-data 1
        -0x69t
        0x21t
        -0x18t
        -0x78t
        -0xbt
        0x24t
        -0x7ft
        0x6ct
    .end array-data

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    :array_2
    .array-data 1
        0x22t
        0x65t
        -0x6dt
        -0xft
        -0x7t
        -0x54t
        -0x78t
        0x2ft
        0x8t
        0x4at
        -0x77t
        -0x7t
        -0x20t
        -0x5et
        -0x77t
        0x3ft
        0x23t
        0x65t
        -0x71t
        -0xft
        -0x1dt
        -0x49t
        -0x48t
        0x19t
        0xct
        0x7ct
        -0x7dt
        -0x20t
        -0x1et
        -0x54t
        -0x6dt
        0x33t
        0x24t
        0x6ct
        -0x70t
        -0x3t
        -0x12t
        -0x5at
    .end array-data

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
    nop

    .line 99
    :array_3
    .array-data 1
        0x60t
        0x9t
        -0x1at
        -0x6ct
        -0x73t
        -0x3dt
        -0x19t
        0x5bt
    .end array-data
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
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x5

    .line 5
    new-array v0, v0, [B

    .line 6
    .line 7
    fill-array-data v0, :array_0

    .line 8
    .line 9
    .line 10
    const/16 v1, 0x8

    .line 11
    .line 12
    new-array v2, v1, [B

    .line 13
    .line 14
    fill-array-data v2, :array_1

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v2}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v2, -0x1

    .line 22
    invoke-static {v2, v0}, Le0/w;->c(ILjava/lang/String;)Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lcom/example/navistart/Notik;->d:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 27
    .line 28
    const/16 v0, 0xa

    .line 29
    .line 30
    new-array v0, v0, [B

    .line 31
    .line 32
    fill-array-data v0, :array_2

    .line 33
    .line 34
    .line 35
    new-array v1, v1, [B

    .line 36
    .line 37
    fill-array-data v1, :array_3

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-wide/16 v1, 0x64

    .line 45
    .line 46
    invoke-static {v1, v2, v0}, Le0/w;->b(JLjava/lang/String;)Le0/v;

    .line 47
    .line 48
    .line 49
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 53
    .line 54
    .line 55
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Lcom/example/navistart/Notik;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 61
    .line 62
    return-void

    .line 63
    :array_0
    .array-data 1
        0x19t
        0x7dt
        -0x16t
        -0x2ft
        -0x6at
    .end array-data

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    nop

    .line 71
    :array_1
    .array-data 1
        0x57t
        0x12t
        -0x62t
        -0x48t
        -0x3t
        0x43t
        -0x6t
        0x2ft
    .end array-data

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    :array_2
    .array-data 1
        0x71t
        0x6ft
        -0x6bt
        0xet
        -0x77t
        -0x7t
        -0x44t
        -0x1ct
        0x7ct
        0x4bt
    .end array-data

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    nop

    .line 89
    :array_3
    .array-data 1
        0x3ft
        0x0t
        -0x1ft
        0x67t
        -0x1et
        -0x5at
        -0x10t
        -0x55t
    .end array-data
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
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method

.method public static f(Landroid/content/Context;Ljava/util/List;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 9
    .line 10
    .line 11
    const/16 p1, 0xb

    .line 12
    .line 13
    new-array p1, p1, [B

    .line 14
    .line 15
    fill-array-data p1, :array_0

    .line 16
    .line 17
    .line 18
    const/16 v2, 0x8

    .line 19
    .line 20
    new-array v3, v2, [B

    .line 21
    .line 22
    fill-array-data v3, :array_1

    .line 23
    .line 24
    .line 25
    invoke-static {p1, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 30
    .line 31
    .line 32
    const/16 p1, 0x14

    .line 33
    .line 34
    new-array p1, p1, [B

    .line 35
    .line 36
    fill-array-data p1, :array_2

    .line 37
    .line 38
    .line 39
    new-array v1, v2, [B

    .line 40
    .line 41
    fill-array-data v1, :array_3

    .line 42
    .line 43
    .line 44
    invoke-static {p1, v1}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const/4 v1, 0x1

    .line 49
    invoke-virtual {v0, p1, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 50
    .line 51
    .line 52
    const-class p1, Lm0/n1;

    .line 53
    .line 54
    invoke-static {p0, p1, v0}, Lcom/example/navistart/W;->u(Landroid/content/Context;Ljava/lang/Class;Landroid/os/Bundle;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    nop

    .line 59
    :array_0
    .array-data 1
        -0x38t
        -0x5et
        0x16t
        -0x37t
        0x24t
        0x5et
        0x9t
        -0x2dt
        -0x3ct
        -0x4dt
        0x4t
    .end array-data

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
    :array_1
    .array-data 1
        -0x5bt
        -0x39t
        0x65t
        -0x46t
        0x45t
        0x39t
        0x6ct
        -0x69t
    .end array-data

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    :array_2
    .array-data 1
        0x4at
        0x3at
        -0xft
        0x55t
        0x3bt
        -0x4bt
        -0x7at
        -0x12t
        0x77t
        0x38t
        -0x7t
        0x4bt
        0x35t
        -0x4et
        -0x49t
        -0x1et
        0x41t
        0x3ft
        -0xdt
        0x49t
    .end array-data

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
    :array_3
    .array-data 1
        0x28t
        0x5bt
        -0x6at
        0x27t
        0x5at
        -0x40t
        -0x18t
        -0x76t
    .end array-data
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

.method public static g(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-static {}, Lh0/b;->o()Lu0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/example/navistart/Notik;->m:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Lu0/a;->loadBoolean(Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sget-boolean v0, Lcom/example/navistart/Notik;->n:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Landroid/content/Intent;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-class v2, Lcom/example/navistart/Notik;

    .line 25
    .line 26
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
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


# virtual methods
.method public final declared-synchronized a(Lru/transfer/MessageData;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/example/navistart/Notik;->e(Lru/transfer/MessageData;)V

    .line 3
    .line 4
    .line 5
    sget-object v0, Lcom/example/navistart/Notik;->l:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/16 v2, 0x14

    .line 12
    .line 13
    if-lt v1, v2, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    monitor-exit p0

    .line 26
    return-void

    .line 27
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw p1
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

.method public final b(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/example/navistart/Notik;->f:Ly0/h;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-object v1, Ly0/g;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    sget-object v1, Lcom/example/navistart/Transport/TransportService;->x:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    const/16 v1, 0x1b

    .line 17
    .line 18
    const/16 v2, 0x8

    .line 19
    .line 20
    :try_start_0
    new-array v1, v1, [B

    .line 21
    .line 22
    fill-array-data v1, :array_0

    .line 23
    .line 24
    .line 25
    new-array v3, v2, [B

    .line 26
    .line 27
    fill-array-data v3, :array_1

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    new-array v3, v2, [B

    .line 35
    .line 36
    fill-array-data v3, :array_2

    .line 37
    .line 38
    .line 39
    new-array v4, v2, [B

    .line 40
    .line 41
    fill-array-data v4, :array_3

    .line 42
    .line 43
    .line 44
    invoke-static {v3, v4}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-static {v3, p1}, Lcom/bumptech/glide/d;->e(Ljava/lang/String;Z)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v0, v1, p1}, Ly0/h;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catch_0
    move-exception p1

    .line 57
    goto :goto_0

    .line 58
    :catch_1
    move-exception p1

    .line 59
    :goto_0
    const/4 v0, 0x5

    .line 60
    new-array v0, v0, [B

    .line 61
    .line 62
    fill-array-data v0, :array_4

    .line 63
    .line 64
    .line 65
    new-array v1, v2, [B

    .line 66
    .line 67
    fill-array-data v1, :array_5

    .line 68
    .line 69
    .line 70
    invoke-static {v0, v1}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const/16 v1, 0x23

    .line 75
    .line 76
    new-array v1, v1, [B

    .line 77
    .line 78
    fill-array-data v1, :array_6

    .line 79
    .line 80
    .line 81
    new-array v2, v2, [B

    .line 82
    .line 83
    fill-array-data v2, :array_7

    .line 84
    .line 85
    .line 86
    invoke-static {v1, v2}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 91
    .line 92
    .line 93
    :cond_1
    :goto_1
    return-void

    .line 94
    nop

    .line 95
    :array_0
    .array-data 1
        -0x51t
        -0x22t
        0x2bt
        -0x38t
        0x33t
        0x7t
        0x5at
        -0x10t
        -0x51t
        -0x7et
        0x3at
        -0x2ct
        0x25t
        0x4t
        0x50t
        -0x14t
        -0x48t
        -0x37t
        0x64t
        -0x35t
        0x25t
        0x4t
        0x46t
        -0x1dt
        -0x44t
        -0x37t
        0x39t
    .end array-data

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
    :array_1
    .array-data 1
        -0x25t
        -0x54t
        0x4at
        -0x5at
        0x40t
        0x77t
        0x35t
        -0x7et
    .end array-data

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    :array_2
    .array-data 1
        -0x79t
        -0x63t
        -0x51t
        0x13t
        0x10t
        0x10t
        0x4ct
        0x36t
    .end array-data

    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    :array_3
    .array-data 1
        -0x16t
        -0x8t
        -0x24t
        0x60t
        0x71t
        0x77t
        0x29t
        0x45t
    .end array-data

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    :array_4
    .array-data 1
        -0x4at
        0x56t
        0xat
        -0x1at
        0x8t
    .end array-data

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    nop

    .line 145
    :array_5
    .array-data 1
        -0x8t
        0x39t
        0x7et
        -0x71t
        0x63t
        -0x72t
        -0x8t
        0x7t
    .end array-data

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    :array_6
    .array-data 1
        0x29t
        -0x7at
        0x11t
        -0x42t
        -0x38t
        -0x18t
        -0x3bt
        0x75t
        0x13t
        -0x38t
        0x0t
        -0x57t
        -0x3at
        -0x1ft
        -0x74t
        0x72t
        0x14t
        -0x38t
        0x1dt
        -0x47t
        -0x29t
        -0x2t
        -0x7ct
        0x66t
        0x19t
        -0x65t
        0x50t
        -0x54t
        -0x2at
        -0x18t
        -0x6at
        0x64t
        0x12t
        -0x75t
        0x15t
    .end array-data

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    :array_7
    .array-data 1
        0x7ct
        -0x18t
        0x70t
        -0x24t
        -0x5ct
        -0x73t
        -0x1bt
        0x1t
    .end array-data
.end method

.method public final declared-synchronized c(Ljava/lang/String;)Lru/transfer/MessageData;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lcom/example/navistart/Notik;->l:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x0

    .line 9
    :cond_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    check-cast v3, Lru/transfer/MessageData;

    .line 18
    .line 19
    invoke-virtual {v3}, Lru/transfer/MessageData;->getKey()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    monitor-exit p0

    .line 30
    return-object v3

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    monitor-exit p0

    .line 34
    const/4 p1, 0x0

    .line 35
    return-object p1

    .line 36
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    throw p1
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

.method public final d(Lru/transfer/MessageData;)V
    .locals 5

    .line 1
    const/4 v0, 0x5

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    new-array v2, v1, [B

    .line 10
    .line 11
    fill-array-data v2, :array_1

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v2}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const/16 v3, 0xd

    .line 24
    .line 25
    new-array v3, v3, [B

    .line 26
    .line 27
    fill-array-data v3, :array_2

    .line 28
    .line 29
    .line 30
    new-array v4, v1, [B

    .line 31
    .line 32
    fill-array-data v4, :array_3

    .line 33
    .line 34
    .line 35
    invoke-static {v3, v4}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lru/transfer/MessageData;->getKey()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const/4 v3, 0x3

    .line 50
    new-array v3, v3, [B

    .line 51
    .line 52
    fill-array-data v3, :array_4

    .line 53
    .line 54
    .line 55
    new-array v1, v1, [B

    .line 56
    .line 57
    fill-array-data v1, :array_5

    .line 58
    .line 59
    .line 60
    invoke-static {v3, v1}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lru/transfer/MessageData;->gethasReply()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, p1}, Lcom/example/navistart/Notik;->a(Lru/transfer/MessageData;)V

    .line 82
    .line 83
    .line 84
    new-instance v0, Landroid/os/Handler;

    .line 85
    .line 86
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 91
    .line 92
    .line 93
    new-instance v1, La1/a;

    .line 94
    .line 95
    const/16 v2, 0x1c

    .line 96
    .line 97
    invoke-direct {v1, v2, p0, p1}, La1/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    nop

    .line 105
    :array_0
    .array-data 1
        -0x65t
        -0x2dt
        -0x79t
        -0x28t
        0x5t
    .end array-data

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    nop

    .line 113
    :array_1
    .array-data 1
        -0x2bt
        -0x44t
        -0xdt
        -0x4ft
        0x6et
        -0xbt
        -0x2et
        -0x3ft
    .end array-data

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    :array_2
    .array-data 1
        0x77t
        -0x1t
        -0x5ft
        0x7at
        0x61t
        0x6ct
        0x50t
        0x38t
        0x5bt
        -0x12t
        -0x4dt
        0x33t
        0x20t
    .end array-data

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
    nop

    .line 133
    :array_3
    .array-data 1
        0x3at
        -0x66t
        -0x2et
        0x9t
        0x0t
        0xbt
        0x35t
        0x7ct
    .end array-data

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    :array_4
    .array-data 1
        0x57t
        0x74t
        -0x66t
    .end array-data

    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    :array_5
    .array-data 1
        0x77t
        0x59t
        -0x46t
        0x44t
        -0x79t
        0x6bt
        0x76t
        0x2ct
    .end array-data
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

.method public final declared-synchronized e(Lru/transfer/MessageData;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lcom/example/navistart/Notik;->l:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lru/transfer/MessageData;

    .line 19
    .line 20
    invoke-virtual {v1}, Lru/transfer/MessageData;->getKey()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p1}, Lru/transfer/MessageData;->getKey()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    :goto_0
    monitor-exit p0

    .line 41
    return-void

    .line 42
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    throw p1
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

.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
    .line 3
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
.end method

.method public final onCreate()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lb1/m;

    .line 5
    .line 6
    invoke-direct {v0, p0, p0}, Lb1/m;-><init>(Lcom/example/navistart/Notik;Lcom/example/navistart/Notik;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/example/navistart/Notik;->c:Lb1/m;

    .line 10
    .line 11
    new-instance v0, Lg0/a;

    .line 12
    .line 13
    invoke-direct {v0}, Lg0/a;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/example/navistart/Notik;->b:Lg0/a;

    .line 17
    .line 18
    const/16 v0, 0x8

    .line 19
    .line 20
    new-array v1, v0, [B

    .line 21
    .line 22
    fill-array-data v1, :array_0

    .line 23
    .line 24
    .line 25
    new-array v2, v0, [B

    .line 26
    .line 27
    fill-array-data v2, :array_1

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v2}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {p0, v1}, Ly0/g;->a(Landroid/content/Context;Ljava/lang/String;)Ly0/h;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iput-object v1, p0, Lcom/example/navistart/Notik;->f:Ly0/h;

    .line 39
    .line 40
    const/16 v1, 0xf

    .line 41
    .line 42
    new-array v2, v1, [B

    .line 43
    .line 44
    fill-array-data v2, :array_2

    .line 45
    .line 46
    .line 47
    new-array v3, v0, [B

    .line 48
    .line 49
    fill-array-data v3, :array_3

    .line 50
    .line 51
    .line 52
    invoke-static {v2, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    new-instance v3, Le0/c2;

    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    invoke-direct {v3, p0, v4}, Le0/c2;-><init>(Lcom/example/navistart/Notik;I)V

    .line 60
    .line 61
    .line 62
    invoke-static {v2, v3}, Ly0/g;->e(Ljava/lang/String;Ly0/e;)Ly0/d;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iput-object v2, p0, Lcom/example/navistart/Notik;->g:Ly0/d;

    .line 67
    .line 68
    new-array v1, v1, [B

    .line 69
    .line 70
    fill-array-data v1, :array_4

    .line 71
    .line 72
    .line 73
    new-array v2, v0, [B

    .line 74
    .line 75
    fill-array-data v2, :array_5

    .line 76
    .line 77
    .line 78
    invoke-static {v1, v2}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    new-instance v2, Le0/c2;

    .line 83
    .line 84
    const/4 v3, 0x1

    .line 85
    invoke-direct {v2, p0, v3}, Le0/c2;-><init>(Lcom/example/navistart/Notik;I)V

    .line 86
    .line 87
    .line 88
    invoke-static {v1, v2}, Ly0/g;->e(Ljava/lang/String;Ly0/e;)Ly0/d;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iput-object v1, p0, Lcom/example/navistart/Notik;->h:Ly0/d;

    .line 93
    .line 94
    const/16 v1, 0x15

    .line 95
    .line 96
    new-array v1, v1, [B

    .line 97
    .line 98
    fill-array-data v1, :array_6

    .line 99
    .line 100
    .line 101
    new-array v2, v0, [B

    .line 102
    .line 103
    fill-array-data v2, :array_7

    .line 104
    .line 105
    .line 106
    invoke-static {v1, v2}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    new-instance v2, Le0/c2;

    .line 111
    .line 112
    const/4 v3, 0x2

    .line 113
    invoke-direct {v2, p0, v3}, Le0/c2;-><init>(Lcom/example/navistart/Notik;I)V

    .line 114
    .line 115
    .line 116
    invoke-static {v1, v2}, Ly0/g;->e(Ljava/lang/String;Ly0/e;)Ly0/d;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    iput-object v1, p0, Lcom/example/navistart/Notik;->i:Ly0/d;

    .line 121
    .line 122
    const/16 v1, 0x1b

    .line 123
    .line 124
    new-array v1, v1, [B

    .line 125
    .line 126
    fill-array-data v1, :array_8

    .line 127
    .line 128
    .line 129
    new-array v0, v0, [B

    .line 130
    .line 131
    fill-array-data v0, :array_9

    .line 132
    .line 133
    .line 134
    invoke-static {v1, v0}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    new-instance v1, Le0/c2;

    .line 139
    .line 140
    const/4 v2, 0x3

    .line 141
    invoke-direct {v1, p0, v2}, Le0/c2;-><init>(Lcom/example/navistart/Notik;I)V

    .line 142
    .line 143
    .line 144
    invoke-static {v0, v1}, Ly0/g;->e(Ljava/lang/String;Ly0/e;)Ly0/d;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iput-object v0, p0, Lcom/example/navistart/Notik;->k:Ly0/d;

    .line 149
    .line 150
    new-instance v0, Le0/d2;

    .line 151
    .line 152
    invoke-direct {v0, v4, p0}, Le0/d2;-><init>(ILjava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    sget-object v1, Ly0/g;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 156
    .line 157
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    sget-object v1, Lcom/example/navistart/Transport/TransportService;->x:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 161
    .line 162
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    invoke-virtual {v0, v1}, Le0/d2;->a(Z)V

    .line 167
    .line 168
    .line 169
    new-instance v1, Ly0/d;

    .line 170
    .line 171
    const/4 v2, 0x1

    .line 172
    invoke-direct {v1, v2, v0}, Ly0/d;-><init>(ILjava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    iput-object v1, p0, Lcom/example/navistart/Notik;->j:Ly0/d;

    .line 176
    .line 177
    return-void

    .line 178
    nop

    .line 179
    :array_0
    .array-data 1
        -0x3t
        0x60t
        0x0t
        -0x5t
        0x65t
        0x7ft
        0x3dt
        -0x4et
    .end array-data

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    :array_1
    .array-data 1
        -0x70t
        0x5t
        0x73t
        -0x78t
        0x4t
        0x18t
        0x58t
        -0x3ft
    .end array-data

    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    :array_2
    .array-data 1
        0x48t
        -0xbt
        -0x3dt
        0x6at
        -0x8t
        0x7t
        -0x5ct
        0x6at
        0xbt
        -0x1bt
        -0x40t
        0x6at
        -0x4t
        0x12t
        -0x4bt
    .end array-data

    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    :array_3
    .array-data 1
        0x25t
        -0x70t
        -0x50t
        0x19t
        -0x67t
        0x60t
        -0x3ft
        0x19t
    .end array-data

    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    :array_4
    .array-data 1
        -0x5et
        0x5t
        0x57t
        0x15t
        -0x80t
        -0x7t
        -0xft
        -0x7t
        -0x1ft
        0x12t
        0x41t
        0xbt
        -0x72t
        -0x18t
        -0xft
    .end array-data

    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    :array_5
    .array-data 1
        -0x31t
        0x60t
        0x24t
        0x66t
        -0x1ft
        -0x62t
        -0x6ct
        -0x76t
    .end array-data

    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    :array_6
    .array-data 1
        -0x22t
        0x22t
        -0x56t
        0x2bt
        -0x47t
        0x28t
        -0x7dt
        0x79t
        -0x63t
        0x35t
        -0x44t
        0x28t
        -0x4ct
        0x36t
        -0x38t
        0x78t
        -0x2at
        0x34t
        -0x54t
        0x34t
        -0x54t
    .end array-data

    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    nop

    .line 251
    :array_7
    .array-data 1
        -0x4dt
        0x47t
        -0x27t
        0x58t
        -0x28t
        0x4ft
        -0x1at
        0xat
    .end array-data

    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    :array_8
    .array-data 1
        0x23t
        -0x4et
        0x7et
        -0x75t
        0x44t
        0x53t
        0x6t
        0x1at
        0x23t
        -0x12t
        0x6ft
        -0x69t
        0x52t
        0x50t
        0xct
        0x6t
        0x34t
        -0x5bt
        0x31t
        -0x78t
        0x52t
        0x50t
        0x1at
        0x9t
        0x30t
        -0x5bt
        0x6ct
    .end array-data

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    :array_9
    .array-data 1
        0x57t
        -0x40t
        0x1ft
        -0x1bt
        0x37t
        0x23t
        0x69t
        0x68t
    .end array-data
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
.end method

.method public final onDestroy()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/example/navistart/Notik;->b(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lcom/example/navistart/Notik;->g:Ly0/d;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    :try_start_0
    invoke-static {v0}, Lai/onnxruntime/a;->A(Ljava/lang/AutoCloseable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    :catch_0
    :goto_0
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lcom/example/navistart/Notik;->g:Ly0/d;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/example/navistart/Notik;->h:Ly0/d;

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :try_start_1
    invoke-static {v1}, Lai/onnxruntime/a;->A(Ljava/lang/AutoCloseable;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 22
    .line 23
    .line 24
    :catch_1
    :goto_1
    iput-object v0, p0, Lcom/example/navistart/Notik;->h:Ly0/d;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/example/navistart/Notik;->i:Ly0/d;

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_2
    :try_start_2
    invoke-static {v1}, Lai/onnxruntime/a;->A(Ljava/lang/AutoCloseable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 32
    .line 33
    .line 34
    :catch_2
    :goto_2
    iput-object v0, p0, Lcom/example/navistart/Notik;->i:Ly0/d;

    .line 35
    .line 36
    iget-object v1, p0, Lcom/example/navistart/Notik;->j:Ly0/d;

    .line 37
    .line 38
    if-nez v1, :cond_3

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_3
    :try_start_3
    invoke-static {v1}, Lai/onnxruntime/a;->A(Ljava/lang/AutoCloseable;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 42
    .line 43
    .line 44
    :catch_3
    :goto_3
    iput-object v0, p0, Lcom/example/navistart/Notik;->j:Ly0/d;

    .line 45
    .line 46
    iget-object v1, p0, Lcom/example/navistart/Notik;->k:Ly0/d;

    .line 47
    .line 48
    if-nez v1, :cond_4

    .line 49
    .line 50
    goto :goto_4

    .line 51
    :cond_4
    :try_start_4
    invoke-static {v1}, Lai/onnxruntime/a;->A(Ljava/lang/AutoCloseable;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 52
    .line 53
    .line 54
    :catch_4
    :goto_4
    iput-object v0, p0, Lcom/example/navistart/Notik;->k:Ly0/d;

    .line 55
    .line 56
    iget-object v1, p0, Lcom/example/navistart/Notik;->f:Ly0/h;

    .line 57
    .line 58
    if-eqz v1, :cond_5

    .line 59
    .line 60
    invoke-virtual {v1}, Ly0/h;->close()V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, Lcom/example/navistart/Notik;->f:Ly0/h;

    .line 64
    .line 65
    :cond_5
    iget-object v1, p0, Lcom/example/navistart/Notik;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, Lcom/example/navistart/Notik;->b:Lg0/a;

    .line 71
    .line 72
    if-eqz v1, :cond_6

    .line 73
    .line 74
    invoke-virtual {v1}, Lg0/a;->a()V

    .line 75
    .line 76
    .line 77
    :cond_6
    iget-object v1, p0, Lcom/example/navistart/Notik;->c:Lb1/m;

    .line 78
    .line 79
    if-eqz v1, :cond_7

    .line 80
    .line 81
    iget-object v2, v1, Lb1/m;->d:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, Landroid/widget/LinearLayout;

    .line 84
    .line 85
    iput-object v0, v1, Lb1/m;->e:Ljava/lang/Object;

    .line 86
    .line 87
    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 88
    .line 89
    .line 90
    :cond_7
    invoke-static {p0}, Lcom/example/navistart/Notik;->g(Landroid/content/Context;)V

    .line 91
    .line 92
    .line 93
    sput-object v0, Lm0/n1;->e:Lcom/example/navistart/Notik;

    .line 94
    .line 95
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 96
    .line 97
    .line 98
    return-void
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
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    .line 1
    invoke-static {p0}, Ly0/g;->d(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/example/navistart/Notik;->b:Lg0/a;

    .line 5
    .line 6
    invoke-virtual {p1}, Lg0/a;->a()V

    .line 7
    .line 8
    .line 9
    sput-object p0, Lm0/n1;->e:Lcom/example/navistart/Notik;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1
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
