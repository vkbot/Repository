.class public final enum Ln0/a;
.super Ljava/lang/Enum;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"

# interfaces
.implements Ln0/e;


# static fields
.field public static final enum d:Ln0/a;

.field public static final enum e:Ln0/a;

.field public static final enum f:Ln0/a;

.field public static final synthetic g:[Ln0/a;


# instance fields
.field public final b:I

.field public final c:Lcom/example/navistart/cores/HUDMassageObj$AradarSenderType;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Ln0/a;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    new-array v1, v1, [B

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    const/16 v2, 0x8

    .line 11
    .line 12
    new-array v3, v2, [B

    .line 13
    .line 14
    fill-array-data v3, :array_1

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const v3, 0x7f130004

    .line 22
    .line 23
    .line 24
    sget-object v4, Lcom/example/navistart/cores/HUDMassageObj$AradarSenderType;->Not:Lcom/example/navistart/cores/HUDMassageObj$AradarSenderType;

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    invoke-direct {v0, v1, v5, v3, v4}, Ln0/a;-><init>(Ljava/lang/String;IILcom/example/navistart/cores/HUDMassageObj$AradarSenderType;)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Ln0/a;->d:Ln0/a;

    .line 31
    .line 32
    new-instance v1, Ln0/a;

    .line 33
    .line 34
    const/16 v3, 0xc

    .line 35
    .line 36
    new-array v3, v3, [B

    .line 37
    .line 38
    fill-array-data v3, :array_2

    .line 39
    .line 40
    .line 41
    new-array v4, v2, [B

    .line 42
    .line 43
    fill-array-data v4, :array_3

    .line 44
    .line 45
    .line 46
    invoke-static {v3, v4}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const v4, 0x7f130001

    .line 51
    .line 52
    .line 53
    sget-object v5, Lcom/example/navistart/cores/HUDMassageObj$AradarSenderType;->GENARADAR:Lcom/example/navistart/cores/HUDMassageObj$AradarSenderType;

    .line 54
    .line 55
    const/4 v6, 0x1

    .line 56
    invoke-direct {v1, v3, v6, v4, v5}, Ln0/a;-><init>(Ljava/lang/String;IILcom/example/navistart/cores/HUDMassageObj$AradarSenderType;)V

    .line 57
    .line 58
    .line 59
    sput-object v1, Ln0/a;->e:Ln0/a;

    .line 60
    .line 61
    new-instance v3, Ln0/a;

    .line 62
    .line 63
    const/16 v4, 0x10

    .line 64
    .line 65
    new-array v4, v4, [B

    .line 66
    .line 67
    fill-array-data v4, :array_4

    .line 68
    .line 69
    .line 70
    new-array v5, v2, [B

    .line 71
    .line 72
    fill-array-data v5, :array_5

    .line 73
    .line 74
    .line 75
    invoke-static {v4, v5}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    const v5, 0x7f130003

    .line 80
    .line 81
    .line 82
    sget-object v6, Lcom/example/navistart/cores/HUDMassageObj$AradarSenderType;->STRELKA:Lcom/example/navistart/cores/HUDMassageObj$AradarSenderType;

    .line 83
    .line 84
    const/4 v7, 0x2

    .line 85
    invoke-direct {v3, v4, v7, v5, v6}, Ln0/a;-><init>(Ljava/lang/String;IILcom/example/navistart/cores/HUDMassageObj$AradarSenderType;)V

    .line 86
    .line 87
    .line 88
    new-instance v4, Ln0/a;

    .line 89
    .line 90
    const/16 v5, 0x15

    .line 91
    .line 92
    new-array v5, v5, [B

    .line 93
    .line 94
    fill-array-data v5, :array_6

    .line 95
    .line 96
    .line 97
    new-array v2, v2, [B

    .line 98
    .line 99
    fill-array-data v2, :array_7

    .line 100
    .line 101
    .line 102
    invoke-static {v5, v2}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    const v5, 0x7f130002

    .line 107
    .line 108
    .line 109
    sget-object v6, Lcom/example/navistart/cores/HUDMassageObj$AradarSenderType;->HUDSPEED:Lcom/example/navistart/cores/HUDMassageObj$AradarSenderType;

    .line 110
    .line 111
    const/4 v7, 0x3

    .line 112
    invoke-direct {v4, v2, v7, v5, v6}, Ln0/a;-><init>(Ljava/lang/String;IILcom/example/navistart/cores/HUDMassageObj$AradarSenderType;)V

    .line 113
    .line 114
    .line 115
    sput-object v4, Ln0/a;->f:Ln0/a;

    .line 116
    .line 117
    filled-new-array {v0, v1, v3, v4}, [Ln0/a;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    sput-object v0, Ln0/a;->g:[Ln0/a;

    .line 122
    .line 123
    return-void

    .line 124
    nop

    .line 125
    :array_0
    .array-data 1
        0x36t
        0x3at
        0x33t
        -0x68t
        0x60t
        0x3ct
        0x5et
        0x2ft
        0x39t
        0x5t
        0x17t
    .end array-data

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
    :array_1
    .array-data 1
        0x78t
        0x55t
        0x47t
        -0x39t
        0x32t
        0x49t
        0x30t
        0x70t
    .end array-data

    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    :array_2
    .array-data 1
        -0x67t
        -0x4et
        0x35t
        -0x6t
        0x70t
        0x6et
        -0x4ft
        -0x51t
        -0x7ct
        -0x5at
        0x2ct
        -0x1at
    .end array-data

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
    :array_3
    .array-data 1
        -0x25t
        -0x19t
        0x7ct
        -0x4at
        0x24t
        0x31t
        -0x8t
        -0x1ft
    .end array-data

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    :array_4
    .array-data 1
        0x6et
        0x33t
        -0x13t
        -0x68t
        0x15t
        0x3t
        -0x4ft
        0x7dt
        0x74t
        0x2at
        -0x17t
        -0x73t
        0x18t
        0x1et
        -0x5ct
        0x63t
    .end array-data

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
    :array_5
    .array-data 1
        0x2bt
        0x6bt
        -0x47t
        -0x23t
        0x47t
        0x4dt
        -0x10t
        0x31t
    .end array-data

    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    :array_6
    .array-data 1
        0x18t
        0x52t
        0x48t
        -0x7et
        0x3t
        0x5bt
        -0x65t
        0xft
        0x2t
        0x4bt
        0x4ct
        -0x69t
        0xet
        0x5dt
        -0x71t
        0x7t
        0xet
        0x5at
        0x59t
        -0x7et
        0x15t
    .end array-data

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
    nop

    .line 197
    :array_7
    .array-data 1
        0x5dt
        0xat
        0x1ct
        -0x39t
        0x51t
        0x15t
        -0x26t
        0x43t
    .end array-data
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

.method public constructor <init>(Ljava/lang/String;IILcom/example/navistart/cores/HUDMassageObj$AradarSenderType;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Ln0/a;->b:I

    .line 5
    .line 6
    iput-object p4, p0, Ln0/a;->c:Lcom/example/navistart/cores/HUDMassageObj$AradarSenderType;

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
.end method

.method public static valueOf(Ljava/lang/String;)Ln0/a;
    .locals 1

    .line 1
    const-class v0, Ln0/a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ln0/a;

    .line 8
    .line 9
    return-object p0
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

.method public static values()[Ln0/a;
    .locals 1

    .line 1
    sget-object v0, Ln0/a;->g:[Ln0/a;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ln0/a;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ln0/a;

    .line 8
    .line 9
    return-object v0
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


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

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
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Ln0/a;->b:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bumptech/glide/d;->b(I)Ljava/lang/String;

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
