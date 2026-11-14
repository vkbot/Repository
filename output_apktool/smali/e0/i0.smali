.class public final Le0/i0;
.super Landroid/location/GnssStatus$Callback;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/location/LocationListener;


# direct methods
.method public synthetic constructor <init>(Landroid/location/LocationListener;I)V
    .locals 0

    .line 1
    iput p2, p0, Le0/i0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Le0/i0;->b:Landroid/location/LocationListener;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/location/GnssStatus$Callback;-><init>()V

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
.method public final onSatelliteStatusChanged(Landroid/location/GnssStatus;)V
    .locals 4

    .line 1
    iget v0, p0, Le0/i0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    move v1, v0

    .line 8
    :goto_0
    invoke-virtual {p1}, Landroid/location/GnssStatus;->getSatelliteCount()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-ge v0, v2, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/location/GnssStatus;->usedInFix(I)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    sput v1, Lq0/s;->l:I

    .line 26
    .line 27
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    sput-wide v2, Lq0/s;->m:J

    .line 32
    .line 33
    iget-object p1, p0, Le0/i0;->b:Landroid/location/LocationListener;

    .line 34
    .line 35
    check-cast p1, Lq0/s;

    .line 36
    .line 37
    iget-boolean v0, p1, Lq0/s;->f:Z

    .line 38
    .line 39
    const-wide/16 v2, 0x0

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    const/4 v0, 0x4

    .line 44
    if-lt v1, v0, :cond_2

    .line 45
    .line 46
    iget-wide v0, p1, Lq0/s;->i:J

    .line 47
    .line 48
    cmp-long v0, v0, v2

    .line 49
    .line 50
    if-nez v0, :cond_3

    .line 51
    .line 52
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    iput-wide v0, p1, Lq0/s;->i:J

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    iput-wide v2, p1, Lq0/s;->i:J

    .line 60
    .line 61
    :cond_3
    :goto_1
    return-void

    .line 62
    :pswitch_0
    invoke-virtual {p1}, Landroid/location/GnssStatus;->getSatelliteCount()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    const/4 v1, 0x0

    .line 67
    move v2, v1

    .line 68
    :goto_2
    if-ge v1, v0, :cond_5

    .line 69
    .line 70
    invoke-virtual {p1, v1}, Landroid/location/GnssStatus;->usedInFix(I)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_4

    .line 75
    .line 76
    add-int/lit8 v2, v2, 0x1

    .line 77
    .line 78
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_5
    iget-object p1, p0, Le0/i0;->b:Landroid/location/LocationListener;

    .line 82
    .line 83
    check-cast p1, Lcom/example/navistart/LocServ;

    .line 84
    .line 85
    int-to-float v1, v2

    .line 86
    int-to-float v0, v0

    .line 87
    div-float/2addr v1, v0

    .line 88
    const/high16 v0, 0x42c80000    # 100.0f

    .line 89
    .line 90
    mul-float/2addr v1, v0

    .line 91
    iput v1, p1, Lcom/example/navistart/LocServ;->e:F

    .line 92
    .line 93
    return-void

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public onStopped()V
    .locals 3

    .line 1
    iget v0, p0, Le0/i0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/location/GnssStatus$Callback;->onStopped()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    const/4 v0, 0x0

    .line 11
    sput v0, Lq0/s;->l:I

    .line 12
    .line 13
    iget-object v0, p0, Le0/i0;->b:Landroid/location/LocationListener;

    .line 14
    .line 15
    check-cast v0, Lq0/s;

    .line 16
    .line 17
    const-wide/16 v1, 0x0

    .line 18
    .line 19
    iput-wide v1, v0, Lq0/s;->i:J

    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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
