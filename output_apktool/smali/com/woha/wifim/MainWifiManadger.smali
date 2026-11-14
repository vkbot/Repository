.class public Lcom/woha/wifim/MainWifiManadger;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# static fields
.field public static v:Ljava/lang/String;


# instance fields
.field public b:Landroid/net/wifi/WifiManager;

.field public c:Ljava/util/ArrayList;

.field public d:Lm7/f;

.field public e:Lm7/g;

.field public f:Landroid/widget/TextView;

.field public g:Landroid/widget/TextView;

.field public h:Landroid/net/ConnectivityManager;

.field public i:Z

.field public j:Landroid/widget/Button;

.field public k:Lcom/example/navistart/mainview/OnOffButton;

.field public l:Landroid/widget/Button;

.field public m:Landroid/widget/Button;

.field public n:Landroidx/recyclerview/widget/RecyclerView;

.field public o:Ljava/lang/String;

.field public p:Landroidx/appcompat/app/AlertDialog;

.field public q:Lokhttp3/Call;

.field public final r:Landroid/os/Handler;

.field public final s:Lm7/a;

.field public final t:Lm7/a;

.field public final u:Lcom/bumptech/glide/manager/r;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/woha/wifim/MainWifiManadger;->o:Ljava/lang/String;

    .line 7
    .line 8
    new-instance v0, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/woha/wifim/MainWifiManadger;->r:Landroid/os/Handler;

    .line 18
    .line 19
    new-instance v0, Lm7/a;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, p0, v1}, Lm7/a;-><init>(Lcom/woha/wifim/MainWifiManadger;I)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/woha/wifim/MainWifiManadger;->s:Lm7/a;

    .line 26
    .line 27
    new-instance v0, Lm7/a;

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    invoke-direct {v0, p0, v1}, Lm7/a;-><init>(Lcom/woha/wifim/MainWifiManadger;I)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lcom/woha/wifim/MainWifiManadger;->t:Lm7/a;

    .line 34
    .line 35
    new-instance v0, Lcom/bumptech/glide/manager/r;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {v0, v1, p0}, Lcom/bumptech/glide/manager/r;-><init>(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lcom/woha/wifim/MainWifiManadger;->u:Lcom/bumptech/glide/manager/r;

    .line 42
    .line 43
    return-void
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

.method public static u(Ljava/lang/String;)Z
    .locals 4

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string p0, ""

    .line 9
    .line 10
    :goto_0
    const/4 v0, 0x3

    .line 11
    new-array v1, v0, [B

    .line 12
    .line 13
    fill-array-data v1, :array_0

    .line 14
    .line 15
    .line 16
    const/16 v2, 0x8

    .line 17
    .line 18
    new-array v3, v2, [B

    .line 19
    .line 20
    fill-array-data v3, :array_1

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    new-array v1, v0, [B

    .line 34
    .line 35
    fill-array-data v1, :array_2

    .line 36
    .line 37
    .line 38
    new-array v3, v2, [B

    .line 39
    .line 40
    fill-array-data v3, :array_3

    .line 41
    .line 42
    .line 43
    invoke-static {v1, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_1

    .line 52
    .line 53
    new-array v1, v0, [B

    .line 54
    .line 55
    fill-array-data v1, :array_4

    .line 56
    .line 57
    .line 58
    new-array v3, v2, [B

    .line 59
    .line 60
    fill-array-data v3, :array_5

    .line 61
    .line 62
    .line 63
    invoke-static {v1, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-nez v1, :cond_1

    .line 72
    .line 73
    new-array v1, v0, [B

    .line 74
    .line 75
    fill-array-data v1, :array_6

    .line 76
    .line 77
    .line 78
    new-array v3, v2, [B

    .line 79
    .line 80
    fill-array-data v3, :array_7

    .line 81
    .line 82
    .line 83
    invoke-static {v1, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_2

    .line 92
    .line 93
    :cond_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 94
    .line 95
    const/16 v3, 0x1d

    .line 96
    .line 97
    if-lt v1, v3, :cond_3

    .line 98
    .line 99
    new-array v0, v0, [B

    .line 100
    .line 101
    fill-array-data v0, :array_8

    .line 102
    .line 103
    .line 104
    new-array v1, v2, [B

    .line 105
    .line 106
    fill-array-data v1, :array_9

    .line 107
    .line 108
    .line 109
    invoke-static {v0, v1}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    if-eqz p0, :cond_3

    .line 118
    .line 119
    :cond_2
    const/4 p0, 0x1

    .line 120
    return p0

    .line 121
    :cond_3
    const/4 p0, 0x0

    .line 122
    return p0

    .line 123
    :array_0
    .array-data 1
        -0x53t
        -0x6et
        0x42t
    .end array-data

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    :array_1
    .array-data 1
        -0x6t
        -0x29t
        0x12t
        0x13t
        0x39t
        0x77t
        -0x65t
        0x54t
    .end array-data

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    :array_2
    .array-data 1
        -0x19t
        0x4et
        -0x47t
    .end array-data

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    :array_3
    .array-data 1
        -0x49t
        0x1dt
        -0xet
        0x55t
        0x2ct
        0x26t
        0x35t
        -0x34t
    .end array-data

    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    :array_4
    .array-data 1
        -0xat
        -0x64t
        0x16t
    .end array-data

    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    :array_5
    .array-data 1
        -0x5bt
        -0x23t
        0x53t
        -0x54t
        0x2t
        0x5ct
        0x41t
        0xdt
    .end array-data

    .line 158
    .line 159
    .line 160
    :array_6
    .array-data 1
        -0x7at
        -0x11t
        0x22t
    .end array-data

    :array_7
    .array-data 1
        -0x3dt
        -0x52t
        0x72t
        0x21t
        -0x3ct
        -0x2ct
        -0x4ft
        0x19t
    .end array-data

    :array_8
    .array-data 1
        -0x61t
        -0x30t
        0x31t
    .end array-data

    :array_9
    .array-data 1
        -0x30t
        -0x79t
        0x74t
        0xdt
        -0xbt
        -0x38t
        0x65t
        0x30t
    .end array-data
.end method


# virtual methods
.method public final A(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/woha/wifim/MainWifiManadger;->j:Landroid/widget/Button;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->l:Landroid/widget/Button;

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->j:Landroid/widget/Button;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const v1, 0x7f1304f9

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->j:Landroid/widget/Button;

    .line 31
    .line 32
    const v0, -0xff0100

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->k:Lcom/example/navistart/mainview/OnOffButton;

    .line 39
    .line 40
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Lcom/example/navistart/mainview/OnOffButton;->setEnable(Ljava/lang/Boolean;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->k:Lcom/example/navistart/mainview/OnOffButton;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Lcom/example/navistart/mainview/OnOffButton;->setOnOff(Ljava/lang/Boolean;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->k:Lcom/example/navistart/mainview/OnOffButton;

    .line 51
    .line 52
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {p1, v0}, Lcom/example/navistart/mainview/OnOffButton;->setTextButton(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->l:Landroid/widget/Button;

    .line 68
    .line 69
    invoke-virtual {p1, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->j:Landroid/widget/Button;

    .line 73
    .line 74
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const v1, 0x7f1304fa

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->j:Landroid/widget/Button;

    .line 89
    .line 90
    const/high16 v0, -0x10000

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->k:Lcom/example/navistart/mainview/OnOffButton;

    .line 96
    .line 97
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-virtual {p1, v0}, Lcom/example/navistart/mainview/OnOffButton;->setEnable(Ljava/lang/Boolean;)V

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->k:Lcom/example/navistart/mainview/OnOffButton;

    .line 103
    .line 104
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-virtual {p1, v0}, Lcom/example/navistart/mainview/OnOffButton;->setOnOff(Ljava/lang/Boolean;)V

    .line 107
    .line 108
    .line 109
    iget-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->k:Lcom/example/navistart/mainview/OnOffButton;

    .line 110
    .line 111
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {p1, v0}, Lcom/example/navistart/mainview/OnOffButton;->setTextButton(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    return-void
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

.method public final B()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/woha/wifim/MainWifiManadger;->b:Landroid/net/wifi/WifiManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {p0, v0}, Lm7/k;->c(Landroid/content/Context;Z)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/woha/wifim/MainWifiManadger;->d:Lm7/f;

    .line 14
    .line 15
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 16
    .line 17
    const-string v2, ""

    .line 18
    .line 19
    invoke-virtual {v0, v1, v1, v2}, Lm7/f;->a(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x1

    .line 24
    invoke-static {p0, v0}, Lm7/k;->c(Landroid/content/Context;Z)V

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-virtual {p0}, Lcom/woha/wifim/MainWifiManadger;->y()V

    .line 28
    .line 29
    .line 30
    return-void
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

.method public final attachBaseContext(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p1}, Le0/m;->x(Landroid/content/Context;)Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->attachBaseContext(Landroid/content/Context;)V

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
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 9

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const v0, 0x7f050377

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p1, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-virtual {p1, v0}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 39
    .line 40
    .line 41
    const p1, 0x7f0c002c

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const/4 v1, 0x4

    .line 52
    new-array v2, v1, [B

    .line 53
    .line 54
    fill-array-data v2, :array_0

    .line 55
    .line 56
    .line 57
    const/16 v3, 0x8

    .line 58
    .line 59
    new-array v4, v3, [B

    .line 60
    .line 61
    fill-array-data v4, :array_1

    .line 62
    .line 63
    .line 64
    invoke-static {v2, v4}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Landroid/net/wifi/WifiManager;

    .line 73
    .line 74
    iput-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->b:Landroid/net/wifi/WifiManager;

    .line 75
    .line 76
    const/16 p1, 0xc

    .line 77
    .line 78
    new-array p1, p1, [B

    .line 79
    .line 80
    fill-array-data p1, :array_2

    .line 81
    .line 82
    .line 83
    new-array v2, v3, [B

    .line 84
    .line 85
    fill-array-data v2, :array_3

    .line 86
    .line 87
    .line 88
    invoke-static {p1, v2}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast p1, Landroid/net/ConnectivityManager;

    .line 97
    .line 98
    iput-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->h:Landroid/net/ConnectivityManager;

    .line 99
    .line 100
    const p1, 0x7f09019c

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    check-cast p1, Landroid/widget/TextView;

    .line 108
    .line 109
    iput-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->f:Landroid/widget/TextView;

    .line 110
    .line 111
    const p1, 0x7f090198

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    check-cast p1, Landroid/widget/TextView;

    .line 119
    .line 120
    iput-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->g:Landroid/widget/TextView;

    .line 121
    .line 122
    const p1, 0x7f0905eb

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    check-cast p1, Landroid/widget/Button;

    .line 130
    .line 131
    iput-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->j:Landroid/widget/Button;

    .line 132
    .line 133
    const p1, 0x7f0905ec

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    check-cast p1, Lcom/example/navistart/mainview/OnOffButton;

    .line 141
    .line 142
    iput-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->k:Lcom/example/navistart/mainview/OnOffButton;

    .line 143
    .line 144
    const v2, 0x7f090384

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    check-cast p1, Landroid/widget/Button;

    .line 152
    .line 153
    const v2, 0x7f070186

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 157
    .line 158
    .line 159
    const/4 v2, 0x0

    .line 160
    invoke-virtual {p1, v2}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 161
    .line 162
    .line 163
    iget-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->k:Lcom/example/navistart/mainview/OnOffButton;

    .line 164
    .line 165
    const v2, 0x7f090511

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    check-cast p1, Landroid/widget/TextView;

    .line 173
    .line 174
    const v2, 0x7f050381

    .line 175
    .line 176
    .line 177
    invoke-static {p0, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 182
    .line 183
    .line 184
    const/high16 v2, 0x41880000    # 17.0f

    .line 185
    .line 186
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 187
    .line 188
    .line 189
    const p1, 0x7f0904a8

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    check-cast p1, Landroid/widget/Button;

    .line 197
    .line 198
    new-instance v2, Lm7/d;

    .line 199
    .line 200
    invoke-direct {v2, p0, v0}, Lm7/d;-><init>(Lcom/woha/wifim/MainWifiManadger;I)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 204
    .line 205
    .line 206
    const p1, 0x7f0903ee

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    check-cast p1, Landroid/widget/Button;

    .line 214
    .line 215
    iput-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->l:Landroid/widget/Button;

    .line 216
    .line 217
    const p1, 0x7f0903eb

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 225
    .line 226
    iput-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 227
    .line 228
    const p1, 0x7f0905ed

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    check-cast p1, Landroid/widget/Button;

    .line 236
    .line 237
    iput-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->m:Landroid/widget/Button;

    .line 238
    .line 239
    const v2, 0x7f1300cd

    .line 240
    .line 241
    .line 242
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 243
    .line 244
    .line 245
    iget-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->m:Landroid/widget/Button;

    .line 246
    .line 247
    new-instance v2, Lm7/d;

    .line 248
    .line 249
    const/4 v4, 0x1

    .line 250
    invoke-direct {v2, p0, v4}, Lm7/d;-><init>(Lcom/woha/wifim/MainWifiManadger;I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 254
    .line 255
    .line 256
    iget-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->k:Lcom/example/navistart/mainview/OnOffButton;

    .line 257
    .line 258
    new-instance v2, Lm7/a;

    .line 259
    .line 260
    const/4 v4, 0x3

    .line 261
    invoke-direct {v2, p0, v4}, Lm7/a;-><init>(Lcom/woha/wifim/MainWifiManadger;I)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p1, v2}, Lcom/example/navistart/mainview/OnOffButton;->setRunnableOn(Ljava/lang/Runnable;)V

    .line 265
    .line 266
    .line 267
    iget-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->k:Lcom/example/navistart/mainview/OnOffButton;

    .line 268
    .line 269
    new-instance v2, Lm7/a;

    .line 270
    .line 271
    invoke-direct {v2, p0, v1}, Lm7/a;-><init>(Lcom/woha/wifim/MainWifiManadger;I)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p1, v2}, Lcom/example/navistart/mainview/OnOffButton;->setRunnableOff(Ljava/lang/Runnable;)V

    .line 275
    .line 276
    .line 277
    iget-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->j:Landroid/widget/Button;

    .line 278
    .line 279
    new-instance v1, Lm7/d;

    .line 280
    .line 281
    const/4 v2, 0x2

    .line 282
    invoke-direct {v1, p0, v2}, Lm7/d;-><init>(Lcom/woha/wifim/MainWifiManadger;I)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 286
    .line 287
    .line 288
    iget-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->l:Landroid/widget/Button;

    .line 289
    .line 290
    new-instance v1, Lm7/d;

    .line 291
    .line 292
    const/4 v2, 0x3

    .line 293
    invoke-direct {v1, p0, v2}, Lm7/d;-><init>(Lcom/woha/wifim/MainWifiManadger;I)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 297
    .line 298
    .line 299
    const/16 p1, 0x27

    .line 300
    .line 301
    new-array p1, p1, [B

    .line 302
    .line 303
    fill-array-data p1, :array_4

    .line 304
    .line 305
    .line 306
    new-array v1, v3, [B

    .line 307
    .line 308
    fill-array-data v1, :array_5

    .line 309
    .line 310
    .line 311
    invoke-static {p1, v1}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    invoke-static {p0, p1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 316
    .line 317
    .line 318
    move-result p1

    .line 319
    const/4 v1, 0x1

    .line 320
    if-nez p1, :cond_0

    .line 321
    .line 322
    move v0, v1

    .line 323
    :cond_0
    if-nez v0, :cond_1

    .line 324
    .line 325
    const/16 p1, 0x27

    .line 326
    .line 327
    new-array p1, p1, [B

    .line 328
    .line 329
    fill-array-data p1, :array_6

    .line 330
    .line 331
    .line 332
    new-array v2, v3, [B

    .line 333
    .line 334
    fill-array-data v2, :array_7

    .line 335
    .line 336
    .line 337
    invoke-static {p1, v2}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    filled-new-array {p1}, [Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    invoke-virtual {p0, p1, v1}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    .line 346
    .line 347
    .line 348
    :cond_1
    iget-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 349
    .line 350
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 351
    .line 352
    invoke-direct {v2, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 356
    .line 357
    .line 358
    new-instance p1, Lm7/g;

    .line 359
    .line 360
    iget-object v2, p0, Lcom/woha/wifim/MainWifiManadger;->b:Landroid/net/wifi/WifiManager;

    .line 361
    .line 362
    new-instance v4, Lm7/b;

    .line 363
    .line 364
    invoke-direct {v4, p0}, Lm7/b;-><init>(Lcom/woha/wifim/MainWifiManadger;)V

    .line 365
    .line 366
    .line 367
    invoke-direct {p1, v2, v4}, Lm7/g;-><init>(Landroid/net/wifi/WifiManager;Lm7/b;)V

    .line 368
    .line 369
    .line 370
    iput-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->e:Lm7/g;

    .line 371
    .line 372
    new-instance p1, Landroid/content/IntentFilter;

    .line 373
    .line 374
    invoke-direct {p1}, Landroid/content/IntentFilter;-><init>()V

    .line 375
    .line 376
    .line 377
    const/16 v2, 0x1d

    .line 378
    .line 379
    new-array v4, v2, [B

    .line 380
    .line 381
    fill-array-data v4, :array_8

    .line 382
    .line 383
    .line 384
    new-array v5, v3, [B

    .line 385
    .line 386
    fill-array-data v5, :array_9

    .line 387
    .line 388
    .line 389
    invoke-static {v4, v5}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v4

    .line 393
    invoke-virtual {p1, v4}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    new-array v2, v2, [B

    .line 397
    .line 398
    fill-array-data v2, :array_a

    .line 399
    .line 400
    .line 401
    new-array v4, v3, [B

    .line 402
    .line 403
    fill-array-data v4, :array_b

    .line 404
    .line 405
    .line 406
    invoke-static {v2, v4}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    invoke-virtual {p1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    const/16 v2, 0x23

    .line 414
    .line 415
    new-array v2, v2, [B

    .line 416
    .line 417
    fill-array-data v2, :array_c

    .line 418
    .line 419
    .line 420
    new-array v4, v3, [B

    .line 421
    .line 422
    fill-array-data v4, :array_d

    .line 423
    .line 424
    .line 425
    invoke-static {v2, v4}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    invoke-virtual {p1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    const/16 v2, 0x28

    .line 433
    .line 434
    new-array v2, v2, [B

    .line 435
    .line 436
    fill-array-data v2, :array_e

    .line 437
    .line 438
    .line 439
    new-array v3, v3, [B

    .line 440
    .line 441
    fill-array-data v3, :array_f

    .line 442
    .line 443
    .line 444
    invoke-static {v2, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    invoke-virtual {p1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    iget-object v2, p0, Lcom/woha/wifim/MainWifiManadger;->e:Lm7/g;

    .line 452
    .line 453
    invoke-virtual {p0, v2, p1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 454
    .line 455
    .line 456
    new-instance v3, Lm7/f;

    .line 457
    .line 458
    iget-object v4, p0, Lcom/woha/wifim/MainWifiManadger;->c:Ljava/util/ArrayList;

    .line 459
    .line 460
    if-eqz v0, :cond_3

    .line 461
    .line 462
    :try_start_0
    iget-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->b:Landroid/net/wifi/WifiManager;

    .line 463
    .line 464
    invoke-virtual {p1}, Landroid/net/wifi/WifiManager;->getConfiguredNetworks()Ljava/util/List;

    .line 465
    .line 466
    .line 467
    move-result-object p1

    .line 468
    if-eqz p1, :cond_2

    .line 469
    .line 470
    goto :goto_0

    .line 471
    :cond_2
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 472
    .line 473
    goto :goto_0

    .line 474
    :catch_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 475
    .line 476
    :goto_0
    move-object v5, p1

    .line 477
    goto :goto_1

    .line 478
    :cond_3
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 479
    .line 480
    goto :goto_0

    .line 481
    :goto_1
    const-string p1, ""

    .line 482
    .line 483
    if-eqz v0, :cond_4

    .line 484
    .line 485
    :try_start_1
    iget-object v0, p0, Lcom/woha/wifim/MainWifiManadger;->b:Landroid/net/wifi/WifiManager;

    .line 486
    .line 487
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    if-eqz v0, :cond_4

    .line 492
    .line 493
    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    if-eqz v2, :cond_4

    .line 498
    .line 499
    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    .line 503
    :catch_1
    :cond_4
    move-object v6, p1

    .line 504
    new-instance v7, Lm7/b;

    .line 505
    .line 506
    invoke-direct {v7, p0}, Lm7/b;-><init>(Lcom/woha/wifim/MainWifiManadger;)V

    .line 507
    .line 508
    .line 509
    new-instance v8, Lm7/b;

    .line 510
    .line 511
    invoke-direct {v8, p0}, Lm7/b;-><init>(Lcom/woha/wifim/MainWifiManadger;)V

    .line 512
    .line 513
    .line 514
    invoke-direct/range {v3 .. v8}, Lm7/f;-><init>(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;Lm7/b;Lm7/b;)V

    .line 515
    .line 516
    .line 517
    iput-object v3, p0, Lcom/woha/wifim/MainWifiManadger;->d:Lm7/f;

    .line 518
    .line 519
    iget-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 520
    .line 521
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {p0}, Lcom/woha/wifim/MainWifiManadger;->v()V

    .line 525
    .line 526
    .line 527
    invoke-virtual {p0}, Lcom/woha/wifim/MainWifiManadger;->s()V

    .line 528
    .line 529
    .line 530
    iget-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->b:Landroid/net/wifi/WifiManager;

    .line 531
    .line 532
    invoke-virtual {p1}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    .line 533
    .line 534
    .line 535
    move-result p1

    .line 536
    invoke-virtual {p0, p1}, Lcom/woha/wifim/MainWifiManadger;->A(Z)V

    .line 537
    .line 538
    .line 539
    sput-object p0, Lm7/g;->c:Lcom/woha/wifim/MainWifiManadger;

    .line 540
    .line 541
    iget-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->h:Landroid/net/ConnectivityManager;

    .line 542
    .line 543
    if-eqz p1, :cond_6

    .line 544
    .line 545
    iget-boolean v0, p0, Lcom/woha/wifim/MainWifiManadger;->i:Z

    .line 546
    .line 547
    if-eqz v0, :cond_5

    .line 548
    .line 549
    goto :goto_2

    .line 550
    :cond_5
    :try_start_2
    iget-object v0, p0, Lcom/woha/wifim/MainWifiManadger;->u:Lcom/bumptech/glide/manager/r;

    .line 551
    .line 552
    invoke-virtual {p1, v0}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 553
    .line 554
    .line 555
    iput-boolean v1, p0, Lcom/woha/wifim/MainWifiManadger;->i:Z
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2

    .line 556
    .line 557
    :catch_2
    :cond_6
    :goto_2
    invoke-virtual {p0}, Lcom/woha/wifim/MainWifiManadger;->z()V

    .line 558
    .line 559
    .line 560
    return-void

    .line 561
    :array_0
    .array-data 1
        -0x71t
        0x1dt
        -0x6ft
        0x33t
    .end array-data

    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    :array_1
    .array-data 1
        -0x8t
        0x74t
        -0x9t
        0x5at
        0x17t
        0x4bt
        0x14t
        0x4dt
    .end array-data

    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    :array_2
    .array-data 1
        0x2ft
        -0x39t
        -0x18t
        0x9t
        0x45t
        0x43t
        0x41t
        -0x45t
        0x3at
        -0x3ft
        -0xet
        0x1et
    .end array-data

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
    :array_3
    .array-data 1
        0x4ct
        -0x58t
        -0x7at
        0x67t
        0x20t
        0x20t
        0x35t
        -0x2et
    .end array-data

    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    :array_4
    .array-data 1
        0x4t
        -0x30t
        -0x7at
        -0xct
        0x13t
        -0x7at
        0x6at
        0x74t
        0x15t
        -0x25t
        -0x70t
        -0x15t
        0x15t
        -0x64t
        0x7dt
        0x33t
        0xat
        -0x30t
        -0x34t
        -0x39t
        0x3ft
        -0x54t
        0x4bt
        0x9t
        0x36t
        -0x1ft
        -0x5ct
        -0x31t
        0x32t
        -0x56t
        0x51t
        0x16t
        0x2at
        -0x3t
        -0x5dt
        -0x2et
        0x35t
        -0x60t
        0x40t
    .end array-data

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
    :array_5
    .array-data 1
        0x65t
        -0x42t
        -0x1et
        -0x7at
        0x7ct
        -0x11t
        0xet
        0x5at
    .end array-data

    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    :array_6
    .array-data 1
        0x79t
        -0x10t
        -0x6at
        -0x79t
        -0x4bt
        0x6t
        -0x42t
        0x71t
        0x68t
        -0x5t
        -0x80t
        -0x68t
        -0x4dt
        0x1ct
        -0x57t
        0x36t
        0x77t
        -0x10t
        -0x24t
        -0x4ct
        -0x67t
        0x2ct
        -0x61t
        0xct
        0x4bt
        -0x3ft
        -0x4ct
        -0x44t
        -0x6ct
        0x2at
        -0x7bt
        0x13t
        0x57t
        -0x23t
        -0x4dt
        -0x5ft
        -0x6dt
        0x20t
        -0x6ct
    .end array-data

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
    :array_7
    .array-data 1
        0x18t
        -0x62t
        -0xet
        -0xbt
        -0x26t
        0x6ft
        -0x26t
        0x5ft
    .end array-data

    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    :array_8
    .array-data 1
        0x74t
        0x45t
        -0x7bt
        -0x30t
        0x48t
        0x6et
        0x52t
        -0x52t
        0x7bt
        0x4et
        -0x6bt
        -0x74t
        0x50t
        0x6et
        0x50t
        -0x17t
        0x3bt
        0x78t
        -0x5et
        -0x1dt
        0x69t
        0x58t
        0x64t
        -0x3bt
        0x46t
        0x7et
        -0x53t
        -0xat
        0x74t
    .end array-data

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
    nop

    .line 677
    :array_9
    .array-data 1
        0x15t
        0x2bt
        -0x1ft
        -0x5et
        0x27t
        0x7t
        0x36t
        -0x80t
    .end array-data

    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    :array_a
    .array-data 1
        0x3ft
        -0x51t
        0x75t
        0x58t
        -0x49t
        -0x4ft
        0x4dt
        -0x58t
        0x30t
        -0x5ct
        0x65t
        0x4t
        -0x51t
        -0x4ft
        0x4ft
        -0x11t
        0x70t
        -0x6et
        0x45t
        0x6bt
        -0x74t
        -0x63t
        0x76t
        -0x3bt
        0x16t
        -0x80t
        0x5ft
        0x6dt
        -0x63t
    .end array-data

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
    nop

    .line 705
    :array_b
    .array-data 1
        0x5et
        -0x3ft
        0x11t
        0x2at
        -0x28t
        -0x28t
        0x29t
        -0x7at
    .end array-data

    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    :array_c
    .array-data 1
        0x5et
        0x48t
        -0x29t
        0x4ct
        -0x2t
        0x4at
        -0x9t
        -0x63t
        0x51t
        0x43t
        -0x39t
        0x10t
        -0x1at
        0x4at
        -0xbt
        -0x26t
        0x11t
        0x71t
        -0x6t
        0x78t
        -0x28t
        0x7ct
        -0x40t
        -0x19t
        0x7et
        0x72t
        -0xat
        0x61t
        -0x2et
        0x6bt
        -0x2et
        -0x3t
        0x78t
        0x63t
        -0x9t
    .end array-data

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
    :array_d
    .array-data 1
        0x3ft
        0x26t
        -0x4dt
        0x3et
        -0x6ft
        0x23t
        -0x6dt
        -0x4dt
    .end array-data

    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    :array_e
    .array-data 1
        -0x43t
        0x1dt
        0x49t
        -0x3bt
        0x10t
        0x6bt
        -0x12t
        -0x46t
        -0x4et
        0x16t
        0x59t
        -0x67t
        0x8t
        0x6bt
        -0x14t
        -0x3t
        -0xet
        0x0t
        0x58t
        -0x39t
        0xft
        0x6et
        -0x1dt
        -0x9t
        -0x43t
        0x1dt
        0x59t
        -0x67t
        0x2ct
        0x56t
        -0x35t
        -0x40t
        -0x67t
        0x2ct
        0x6et
        -0x1t
        0x3et
        0x4ct
        -0x33t
        -0x2ft
    .end array-data

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
    :array_f
    .array-data 1
        -0x24t
        0x73t
        0x2dt
        -0x49t
        0x7ft
        0x2t
        -0x76t
        -0x6ct
    .end array-data
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
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
.end method

.method public final onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/woha/wifim/MainWifiManadger;->r:Landroid/os/Handler;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/woha/wifim/MainWifiManadger;->s:Lm7/a;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lm7/k;->a:Ljava/lang/String;

    .line 12
    .line 13
    const-class v0, Lm7/k;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    invoke-static {}, Lm7/k;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    monitor-exit v0

    .line 20
    iget-object v0, p0, Lcom/woha/wifim/MainWifiManadger;->e:Lm7/g;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    sput-object v0, Lm7/g;->c:Lcom/woha/wifim/MainWifiManadger;

    .line 27
    .line 28
    iget-object v0, p0, Lcom/woha/wifim/MainWifiManadger;->p:Landroidx/appcompat/app/AlertDialog;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatDialog;->dismiss()V

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-boolean v0, p0, Lcom/woha/wifim/MainWifiManadger;->i:Z

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-object v0, p0, Lcom/woha/wifim/MainWifiManadger;->h:Landroid/net/ConnectivityManager;

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    :try_start_1
    iget-object v1, p0, Lcom/woha/wifim/MainWifiManadger;->u:Lcom/bumptech/glide/manager/r;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 46
    .line 47
    .line 48
    :catch_0
    const/4 v0, 0x0

    .line 49
    iput-boolean v0, p0, Lcom/woha/wifim/MainWifiManadger;->i:Z

    .line 50
    .line 51
    :cond_1
    return-void

    .line 52
    :catchall_0
    move-exception v1

    .line 53
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 54
    throw v1
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

.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 2
    .line 3
    .line 4
    const/4 p2, 0x1

    .line 5
    if-ne p1, p2, :cond_0

    .line 6
    .line 7
    array-length p1, p3

    .line 8
    if-lez p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    aget p1, p3, p1

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/woha/wifim/MainWifiManadger;->v()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
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

.method public final onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/woha/wifim/MainWifiManadger;->s()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/woha/wifim/MainWifiManadger;->b:Landroid/net/wifi/WifiManager;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0, v0}, Lcom/woha/wifim/MainWifiManadger;->A(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/woha/wifim/MainWifiManadger;->v()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/woha/wifim/MainWifiManadger;->z()V

    .line 20
    .line 21
    .line 22
    return-void
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
.end method

.method public final s()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/woha/wifim/MainWifiManadger;->b:Landroid/net/wifi/WifiManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const v1, 0x7f1304ef

    .line 8
    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getNetworkId()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, -0x1

    .line 17
    if-eq v2, v3, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    const/16 v3, 0x10

    .line 26
    .line 27
    new-array v3, v3, [B

    .line 28
    .line 29
    fill-array-data v3, :array_0

    .line 30
    .line 31
    .line 32
    const/16 v4, 0x8

    .line 33
    .line 34
    new-array v5, v4, [B

    .line 35
    .line 36
    fill-array-data v5, :array_1

    .line 37
    .line 38
    .line 39
    invoke-static {v3, v5}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-nez v3, :cond_0

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getRssi()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/16 v1, 0x65

    .line 54
    .line 55
    invoke-static {v0, v1}, Landroid/net/wifi/WifiManager;->calculateSignalLevel(II)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-object v1, p0, Lcom/woha/wifim/MainWifiManadger;->f:Landroid/widget/TextView;

    .line 60
    .line 61
    const/4 v3, 0x1

    .line 62
    new-array v3, v3, [B

    .line 63
    .line 64
    const/16 v5, 0x32

    .line 65
    .line 66
    const/4 v6, 0x0

    .line 67
    aput-byte v5, v3, v6

    .line 68
    .line 69
    new-array v4, v4, [B

    .line 70
    .line 71
    fill-array-data v4, :array_2

    .line 72
    .line 73
    .line 74
    invoke-static {v3, v4}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    const-string v4, ""

    .line 79
    .line 80
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    const v2, 0x7f1304e6

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_0
    iget-object v0, p0, Lcom/woha/wifim/MainWifiManadger;->f:Landroid/widget/TextView;

    .line 104
    .line 105
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_1
    iget-object v0, p0, Lcom/woha/wifim/MainWifiManadger;->f:Landroid/widget/TextView;

    .line 118
    .line 119
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :array_0
    .array-data 1
        -0x1at
        0x2dt
        -0x64t
        -0x31t
        -0x6et
        0x27t
        -0x3ct
        -0x3et
        -0x56t
        0x31t
        -0x66t
        -0x2et
        -0x70t
        0x2dt
        -0x6bt
        -0x69t
    .end array-data

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
    :array_1
    .array-data 1
        -0x3ct
        0x11t
        -0x17t
        -0x5ft
        -0x7t
        0x49t
        -0x55t
        -0x4bt
    .end array-data

    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    :array_2
    .array-data 1
        0x10t
        -0x15t
        -0x72t
        0x40t
        0x68t
        -0x2ft
        0x21t
        -0x6et
    .end array-data
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

.method public final t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 1
    new-instance v0, Landroid/net/wifi/WifiConfiguration;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/net/wifi/WifiConfiguration;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    new-array v3, v2, [B

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    const/16 v5, -0x6e

    .line 16
    .line 17
    aput-byte v5, v3, v4

    .line 18
    .line 19
    const/16 v5, 0x8

    .line 20
    .line 21
    new-array v6, v5, [B

    .line 22
    .line 23
    fill-array-data v6, :array_0

    .line 24
    .line 25
    .line 26
    invoke-static {v3, v6, v1, p1}, Lcom/google/protobuf/q;->u([B[BLjava/lang/StringBuilder;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    new-array v3, v2, [B

    .line 30
    .line 31
    const/16 v6, 0xe

    .line 32
    .line 33
    aput-byte v6, v3, v4

    .line 34
    .line 35
    new-array v6, v5, [B

    .line 36
    .line 37
    fill-array-data v6, :array_1

    .line 38
    .line 39
    .line 40
    invoke-static {v3, v6, v1}, Lcom/google/protobuf/q;->i([B[BLjava/lang/StringBuilder;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iput-object v1, v0, Landroid/net/wifi/WifiConfiguration;->SSID:Ljava/lang/String;

    .line 45
    .line 46
    if-eqz p3, :cond_0

    .line 47
    .line 48
    invoke-virtual {p3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const-string p3, ""

    .line 54
    .line 55
    :goto_0
    const/4 v1, 0x3

    .line 56
    new-array v3, v1, [B

    .line 57
    .line 58
    fill-array-data v3, :array_2

    .line 59
    .line 60
    .line 61
    new-array v6, v5, [B

    .line 62
    .line 63
    fill-array-data v6, :array_3

    .line 64
    .line 65
    .line 66
    invoke-static {v3, v6}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {p3, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_1

    .line 75
    .line 76
    iget-object p3, v0, Landroid/net/wifi/WifiConfiguration;->wepKeys:[Ljava/lang/String;

    .line 77
    .line 78
    new-instance v1, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    new-array v3, v2, [B

    .line 84
    .line 85
    const/16 v6, -0x72

    .line 86
    .line 87
    aput-byte v6, v3, v4

    .line 88
    .line 89
    new-array v6, v5, [B

    .line 90
    .line 91
    fill-array-data v6, :array_4

    .line 92
    .line 93
    .line 94
    invoke-static {v3, v6, v1, p2}, Lcom/google/protobuf/q;->u([B[BLjava/lang/StringBuilder;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    new-array p2, v2, [B

    .line 98
    .line 99
    const/16 v3, 0x33

    .line 100
    .line 101
    aput-byte v3, p2, v4

    .line 102
    .line 103
    new-array v3, v5, [B

    .line 104
    .line 105
    fill-array-data v3, :array_5

    .line 106
    .line 107
    .line 108
    invoke-static {p2, v3, v1}, Lcom/google/protobuf/q;->i([B[BLjava/lang/StringBuilder;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    aput-object p2, p3, v4

    .line 113
    .line 114
    iput v4, v0, Landroid/net/wifi/WifiConfiguration;->wepTxKeyIndex:I

    .line 115
    .line 116
    iget-object p2, v0, Landroid/net/wifi/WifiConfiguration;->allowedKeyManagement:Ljava/util/BitSet;

    .line 117
    .line 118
    invoke-virtual {p2, v4}, Ljava/util/BitSet;->set(I)V

    .line 119
    .line 120
    .line 121
    goto/16 :goto_1

    .line 122
    .line 123
    :cond_1
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 124
    .line 125
    const/16 v6, 0x1d

    .line 126
    .line 127
    if-lt v3, v6, :cond_2

    .line 128
    .line 129
    new-array v7, v1, [B

    .line 130
    .line 131
    fill-array-data v7, :array_6

    .line 132
    .line 133
    .line 134
    new-array v8, v5, [B

    .line 135
    .line 136
    fill-array-data v8, :array_7

    .line 137
    .line 138
    .line 139
    invoke-static {v7, v8}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    invoke-virtual {p3, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    if-eqz v7, :cond_2

    .line 148
    .line 149
    new-array v7, v1, [B

    .line 150
    .line 151
    fill-array-data v7, :array_8

    .line 152
    .line 153
    .line 154
    new-array v8, v5, [B

    .line 155
    .line 156
    fill-array-data v8, :array_9

    .line 157
    .line 158
    .line 159
    invoke-static {v7, v8}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    invoke-virtual {p3, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    if-nez v7, :cond_2

    .line 168
    .line 169
    new-instance p3, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 172
    .line 173
    .line 174
    new-array v1, v2, [B

    .line 175
    .line 176
    const/16 v3, -0x11

    .line 177
    .line 178
    aput-byte v3, v1, v4

    .line 179
    .line 180
    new-array v3, v5, [B

    .line 181
    .line 182
    fill-array-data v3, :array_a

    .line 183
    .line 184
    .line 185
    invoke-static {v1, v3, p3, p2}, Lcom/google/protobuf/q;->u([B[BLjava/lang/StringBuilder;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    new-array p2, v2, [B

    .line 189
    .line 190
    const/16 v1, 0x57

    .line 191
    .line 192
    aput-byte v1, p2, v4

    .line 193
    .line 194
    new-array v1, v5, [B

    .line 195
    .line 196
    fill-array-data v1, :array_b

    .line 197
    .line 198
    .line 199
    invoke-static {p2, v1, p3}, Lcom/google/protobuf/q;->i([B[BLjava/lang/StringBuilder;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    iput-object p2, v0, Landroid/net/wifi/WifiConfiguration;->preSharedKey:Ljava/lang/String;

    .line 204
    .line 205
    iget-object p2, v0, Landroid/net/wifi/WifiConfiguration;->allowedKeyManagement:Ljava/util/BitSet;

    .line 206
    .line 207
    invoke-virtual {p2, v5}, Ljava/util/BitSet;->set(I)V

    .line 208
    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_2
    if-lt v3, v6, :cond_3

    .line 212
    .line 213
    new-array v1, v1, [B

    .line 214
    .line 215
    fill-array-data v1, :array_c

    .line 216
    .line 217
    .line 218
    new-array v3, v5, [B

    .line 219
    .line 220
    fill-array-data v3, :array_d

    .line 221
    .line 222
    .line 223
    invoke-static {v1, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    invoke-virtual {p3, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    if-eqz v1, :cond_3

    .line 232
    .line 233
    iget-object p2, v0, Landroid/net/wifi/WifiConfiguration;->allowedKeyManagement:Ljava/util/BitSet;

    .line 234
    .line 235
    const/16 p3, 0x9

    .line 236
    .line 237
    invoke-virtual {p2, p3}, Ljava/util/BitSet;->set(I)V

    .line 238
    .line 239
    .line 240
    goto :goto_1

    .line 241
    :cond_3
    invoke-static {p3}, Lcom/woha/wifim/MainWifiManadger;->u(Ljava/lang/String;)Z

    .line 242
    .line 243
    .line 244
    move-result p3

    .line 245
    if-eqz p3, :cond_4

    .line 246
    .line 247
    iget-object p2, v0, Landroid/net/wifi/WifiConfiguration;->allowedKeyManagement:Ljava/util/BitSet;

    .line 248
    .line 249
    invoke-virtual {p2, v4}, Ljava/util/BitSet;->set(I)V

    .line 250
    .line 251
    .line 252
    goto :goto_1

    .line 253
    :cond_4
    new-instance p3, Ljava/lang/StringBuilder;

    .line 254
    .line 255
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 256
    .line 257
    .line 258
    new-array v1, v2, [B

    .line 259
    .line 260
    const/16 v3, 0x56

    .line 261
    .line 262
    aput-byte v3, v1, v4

    .line 263
    .line 264
    new-array v3, v5, [B

    .line 265
    .line 266
    fill-array-data v3, :array_e

    .line 267
    .line 268
    .line 269
    invoke-static {v1, v3, p3, p2}, Lcom/google/protobuf/q;->u([B[BLjava/lang/StringBuilder;Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    new-array p2, v2, [B

    .line 273
    .line 274
    const/16 v1, 0x6d

    .line 275
    .line 276
    aput-byte v1, p2, v4

    .line 277
    .line 278
    new-array v1, v5, [B

    .line 279
    .line 280
    fill-array-data v1, :array_f

    .line 281
    .line 282
    .line 283
    invoke-static {p2, v1, p3}, Lcom/google/protobuf/q;->i([B[BLjava/lang/StringBuilder;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object p2

    .line 287
    iput-object p2, v0, Landroid/net/wifi/WifiConfiguration;->preSharedKey:Ljava/lang/String;

    .line 288
    .line 289
    iget-object p2, v0, Landroid/net/wifi/WifiConfiguration;->allowedKeyManagement:Ljava/util/BitSet;

    .line 290
    .line 291
    invoke-virtual {p2, v2}, Ljava/util/BitSet;->set(I)V

    .line 292
    .line 293
    .line 294
    :goto_1
    iget-object p2, p0, Lcom/woha/wifim/MainWifiManadger;->b:Landroid/net/wifi/WifiManager;

    .line 295
    .line 296
    invoke-virtual {p2}, Landroid/net/wifi/WifiManager;->getConfiguredNetworks()Ljava/util/List;

    .line 297
    .line 298
    .line 299
    move-result-object p2

    .line 300
    const/4 p3, -0x1

    .line 301
    if-eqz p2, :cond_6

    .line 302
    .line 303
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 304
    .line 305
    .line 306
    move-result-object p2

    .line 307
    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    if-eqz v1, :cond_6

    .line 312
    .line 313
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    check-cast v1, Landroid/net/wifi/WifiConfiguration;

    .line 318
    .line 319
    iget-object v3, v1, Landroid/net/wifi/WifiConfiguration;->SSID:Ljava/lang/String;

    .line 320
    .line 321
    if-eqz v3, :cond_5

    .line 322
    .line 323
    new-instance v6, Ljava/lang/StringBuilder;

    .line 324
    .line 325
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 326
    .line 327
    .line 328
    new-array v7, v2, [B

    .line 329
    .line 330
    const/16 v8, -0x71

    .line 331
    .line 332
    aput-byte v8, v7, v4

    .line 333
    .line 334
    new-array v8, v5, [B

    .line 335
    .line 336
    fill-array-data v8, :array_10

    .line 337
    .line 338
    .line 339
    invoke-static {v7, v8, v6, p1}, Lcom/google/protobuf/q;->u([B[BLjava/lang/StringBuilder;Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    new-array v7, v2, [B

    .line 343
    .line 344
    const/16 v8, -0x10

    .line 345
    .line 346
    aput-byte v8, v7, v4

    .line 347
    .line 348
    new-array v8, v5, [B

    .line 349
    .line 350
    fill-array-data v8, :array_11

    .line 351
    .line 352
    .line 353
    invoke-static {v7, v8}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v7

    .line 357
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v6

    .line 364
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v3

    .line 368
    if-eqz v3, :cond_5

    .line 369
    .line 370
    iget p2, v1, Landroid/net/wifi/WifiConfiguration;->networkId:I

    .line 371
    .line 372
    goto :goto_2

    .line 373
    :cond_6
    move p2, p3

    .line 374
    :goto_2
    if-eq p2, p3, :cond_7

    .line 375
    .line 376
    iput p2, v0, Landroid/net/wifi/WifiConfiguration;->networkId:I

    .line 377
    .line 378
    iget-object p2, p0, Lcom/woha/wifim/MainWifiManadger;->b:Landroid/net/wifi/WifiManager;

    .line 379
    .line 380
    invoke-virtual {p2, v0}, Landroid/net/wifi/WifiManager;->updateNetwork(Landroid/net/wifi/WifiConfiguration;)I

    .line 381
    .line 382
    .line 383
    move-result p2

    .line 384
    goto :goto_3

    .line 385
    :cond_7
    iget-object p2, p0, Lcom/woha/wifim/MainWifiManadger;->b:Landroid/net/wifi/WifiManager;

    .line 386
    .line 387
    invoke-virtual {p2, v0}, Landroid/net/wifi/WifiManager;->addNetwork(Landroid/net/wifi/WifiConfiguration;)I

    .line 388
    .line 389
    .line 390
    move-result p2

    .line 391
    :goto_3
    if-eq p2, p3, :cond_8

    .line 392
    .line 393
    iget-object p3, p0, Lcom/woha/wifim/MainWifiManadger;->b:Landroid/net/wifi/WifiManager;

    .line 394
    .line 395
    invoke-virtual {p3}, Landroid/net/wifi/WifiManager;->saveConfiguration()Z

    .line 396
    .line 397
    .line 398
    iget-object p3, p0, Lcom/woha/wifim/MainWifiManadger;->b:Landroid/net/wifi/WifiManager;

    .line 399
    .line 400
    invoke-virtual {p3}, Landroid/net/wifi/WifiManager;->disconnect()Z

    .line 401
    .line 402
    .line 403
    iget-object p3, p0, Lcom/woha/wifim/MainWifiManadger;->b:Landroid/net/wifi/WifiManager;

    .line 404
    .line 405
    invoke-virtual {p3, p2, v2}, Landroid/net/wifi/WifiManager;->enableNetwork(IZ)Z

    .line 406
    .line 407
    .line 408
    iget-object p2, p0, Lcom/woha/wifim/MainWifiManadger;->b:Landroid/net/wifi/WifiManager;

    .line 409
    .line 410
    invoke-virtual {p2}, Landroid/net/wifi/WifiManager;->reconnect()Z

    .line 411
    .line 412
    .line 413
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 414
    .line 415
    .line 416
    move-result-object p2

    .line 417
    new-instance p3, Ljava/lang/StringBuilder;

    .line 418
    .line 419
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 420
    .line 421
    .line 422
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    const v1, 0x7f1304e4

    .line 427
    .line 428
    .line 429
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object p1

    .line 443
    invoke-static {p2, p1}, Ly5/k;->x(Landroid/content/Context;Ljava/lang/CharSequence;)V

    .line 444
    .line 445
    .line 446
    return-void

    .line 447
    :cond_8
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 448
    .line 449
    .line 450
    move-result-object p2

    .line 451
    new-instance p3, Ljava/lang/StringBuilder;

    .line 452
    .line 453
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 454
    .line 455
    .line 456
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    const v1, 0x7f1304e9

    .line 461
    .line 462
    .line 463
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object p1

    .line 477
    invoke-static {p2, p1}, Ly5/k;->x(Landroid/content/Context;Ljava/lang/CharSequence;)V

    .line 478
    .line 479
    .line 480
    return-void

    .line 481
    :array_0
    .array-data 1
        -0x50t
        0x16t
        0x27t
        -0x4ft
        0x3at
        0x1bt
        -0x66t
        0x1t
    .end array-data

    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    :array_1
    .array-data 1
        0x2ct
        0x6ft
        0x70t
        0x66t
        0x78t
        0x7ct
        0x49t
        0x2t
    .end array-data

    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    :array_2
    .array-data 1
        -0x35t
        -0x73t
        0x5t
    .end array-data

    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    :array_3
    .array-data 1
        -0x64t
        -0x38t
        0x55t
        -0x53t
        0x44t
        0x67t
        -0x19t
        -0xat
    .end array-data

    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    :array_4
    .array-data 1
        -0x54t
        -0x1t
        0x2dt
        0x75t
        0x46t
        -0x3at
        0xdt
        0x60t
    .end array-data

    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    :array_5
    .array-data 1
        0x11t
        0x75t
        -0x1ct
        -0x70t
        -0x1dt
        0x2dt
        0x5ft
        0x33t
    .end array-data

    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    :array_6
    .array-data 1
        -0x15t
        -0x17t
        0x19t
    .end array-data

    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    :array_7
    .array-data 1
        -0x48t
        -0x58t
        0x5ct
        0x40t
        0x56t
        -0x30t
        0x12t
        0x14t
    .end array-data

    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    :array_8
    .array-data 1
        -0x4ft
        0x2ft
        0x31t
    .end array-data

    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    :array_9
    .array-data 1
        -0x1ft
        0x7ct
        0x7at
        -0x48t
        0x1t
        -0x1at
        -0x42t
        0x3bt
    .end array-data

    :array_a
    .array-data 1
        -0x33t
        -0x4t
        0x15t
        -0x27t
        -0x12t
        -0x6ct
        0x41t
        0x23t
    .end array-data

    :array_b
    .array-data 1
        0x75t
        0x22t
        0x7bt
        -0x4dt
        0x77t
        -0x26t
        -0x8t
        -0x7ct
    .end array-data

    :array_c
    .array-data 1
        0x39t
        -0x45t
        -0x5t
    .end array-data

    :array_d
    .array-data 1
        0x76t
        -0x14t
        -0x42t
        -0x24t
        -0x42t
        0x26t
        0x60t
        -0x51t
    .end array-data

    :array_e
    .array-data 1
        0x74t
        0x6et
        -0x18t
        -0x4t
        0x5t
        -0x3t
        0x5at
        0x65t
    .end array-data

    :array_f
    .array-data 1
        0x4ft
        -0x5bt
        0x8t
        -0x2et
        0x67t
        -0x27t
        -0x9t
        -0x57t
    .end array-data

    :array_10
    .array-data 1
        -0x53t
        0x48t
        0x7et
        0x20t
        0x4t
        0x26t
        -0x7ft
        -0xat
    .end array-data

    :array_11
    .array-data 1
        -0x2et
        0x78t
        0x24t
        -0x7t
        0x6ft
        -0x5dt
        0x15t
        -0x44t
    .end array-data
.end method

.method public final v()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/woha/wifim/MainWifiManadger;->b:Landroid/net/wifi/WifiManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const/16 v0, 0x27

    .line 10
    .line 11
    new-array v1, v0, [B

    .line 12
    .line 13
    fill-array-data v1, :array_0

    .line 14
    .line 15
    .line 16
    const/16 v2, 0x8

    .line 17
    .line 18
    new-array v3, v2, [B

    .line 19
    .line 20
    fill-array-data v3, :array_1

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v3}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {p0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    new-array v0, v0, [B

    .line 34
    .line 35
    fill-array-data v0, :array_2

    .line 36
    .line 37
    .line 38
    new-array v1, v2, [B

    .line 39
    .line 40
    fill-array-data v1, :array_3

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v1}, Le0/m;->h([B[B)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    filled-new-array {v0}, [Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const/4 v1, 0x1

    .line 52
    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/woha/wifim/MainWifiManadger;->b:Landroid/net/wifi/WifiManager;

    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->startScan()Z
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    const v2, 0x7f1304f7

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-static {v0, v1}, Ly5/k;->x(Landroid/content/Context;Ljava/lang/CharSequence;)V

    .line 77
    .line 78
    .line 79
    :catch_0
    return-void

    .line 80
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    const v2, 0x7f1304f3

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-static {v0, v1}, Ly5/k;->x(Landroid/content/Context;Ljava/lang/CharSequence;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :array_0
    .array-data 1
        -0x4t
        -0x6dt
        -0x3dt
        0x3at
        0x60t
        0x38t
        0x7dt
        0x5bt
        -0x13t
        -0x68t
        -0x2bt
        0x25t
        0x66t
        0x22t
        0x6at
        0x1ct
        -0xet
        -0x6dt
        -0x77t
        0x9t
        0x4ct
        0x12t
        0x5ct
        0x26t
        -0x32t
        -0x5et
        -0x1ft
        0x1t
        0x41t
        0x14t
        0x46t
        0x39t
        -0x2et
        -0x42t
        -0x1at
        0x1ct
        0x46t
        0x1et
        0x57t
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
    :array_1
    .array-data 1
        -0x63t
        -0x3t
        -0x59t
        0x48t
        0xft
        0x51t
        0x19t
        0x75t
    .end array-data

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    :array_2
    .array-data 1
        0x5et
        -0x2ft
        -0x66t
        0x79t
        0x54t
        0x34t
        0x38t
        -0x2ct
        0x4ft
        -0x26t
        -0x74t
        0x66t
        0x52t
        0x2et
        0x2ft
        -0x6dt
        0x50t
        -0x2ft
        -0x30t
        0x4at
        0x78t
        0x1et
        0x19t
        -0x57t
        0x6ct
        -0x20t
        -0x48t
        0x42t
        0x75t
        0x18t
        0x3t
        -0x4at
        0x70t
        -0x4t
        -0x41t
        0x5ft
        0x72t
        0x12t
        0x12t
    .end array-data

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
    :array_3
    .array-data 1
        0x3ft
        -0x41t
        -0x2t
        0xbt
        0x3bt
        0x5dt
        0x5ct
        -0x6t
    .end array-data
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

.method public final w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/woha/wifim/MainWifiManadger;->p:Landroidx/appcompat/app/AlertDialog;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    goto/16 :goto_1

    .line 22
    .line 23
    :cond_1
    sput-object p1, Lcom/woha/wifim/MainWifiManadger;->v:Ljava/lang/String;

    .line 24
    .line 25
    if-eqz p2, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const-string p2, ""

    .line 29
    .line 30
    :goto_0
    iput-object p2, p0, Lcom/woha/wifim/MainWifiManadger;->o:Ljava/lang/String;

    .line 31
    .line 32
    new-instance p2, Landroidx/appcompat/app/AlertDialog$Builder;

    .line 33
    .line 34
    invoke-direct {p2, p0}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const v1, 0x7f1304e8

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {p2, v0}, Landroidx/appcompat/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 49
    .line 50
    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const v2, 0x7f1304fb

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {p2, v0}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 78
    .line 79
    .line 80
    new-instance v0, Landroid/widget/EditText;

    .line 81
    .line 82
    invoke-direct {v0, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 83
    .line 84
    .line 85
    const/16 v1, 0x81

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setInputType(I)V

    .line 88
    .line 89
    .line 90
    new-instance v1, Landroid/widget/CheckBox;

    .line 91
    .line 92
    invoke-direct {v1, p0}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    const v3, 0x7f1304f5

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 107
    .line 108
    .line 109
    new-instance v2, Le0/s0;

    .line 110
    .line 111
    const/4 v3, 0x7

    .line 112
    invoke-direct {v2, v3, v0}, Le0/s0;-><init>(ILjava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 116
    .line 117
    .line 118
    new-instance v2, Landroid/widget/LinearLayout;

    .line 119
    .line 120
    invoke-direct {v2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 121
    .line 122
    .line 123
    const/4 v3, 0x1

    .line 124
    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 125
    .line 126
    .line 127
    const/16 v3, 0x28

    .line 128
    .line 129
    const/16 v4, 0xa

    .line 130
    .line 131
    const/16 v5, 0x32

    .line 132
    .line 133
    invoke-virtual {v2, v5, v3, v5, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p2, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    const v2, 0x7f1304f8

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    new-instance v2, Lm0/y0;

    .line 157
    .line 158
    const/4 v3, 0x3

    .line 159
    invoke-direct {v2, p0, v0, p1, v3}, Lm0/y0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p2, v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    const v0, 0x7f13010a

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    new-instance v0, Le0/d3;

    .line 177
    .line 178
    const/4 v1, 0x1

    .line 179
    invoke-direct {v0, v1}, Le0/d3;-><init>(I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p2, p1, v0}, Landroidx/appcompat/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p2}, Landroidx/appcompat/app/AlertDialog$Builder;->create()Landroidx/appcompat/app/AlertDialog;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    iput-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->p:Landroidx/appcompat/app/AlertDialog;

    .line 190
    .line 191
    new-instance p2, Lm7/c;

    .line 192
    .line 193
    const/4 v0, 0x0

    .line 194
    invoke-direct {p2, p0, v0}, Lm7/c;-><init>(Landroid/view/KeyEvent$Callback;I)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1, p2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 198
    .line 199
    .line 200
    iget-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->p:Landroidx/appcompat/app/AlertDialog;

    .line 201
    .line 202
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 203
    .line 204
    .line 205
    :cond_3
    :goto_1
    return-void
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
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
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
.end method

.method public final x(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/woha/wifim/MainWifiManadger;->g:Landroid/widget/TextView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/woha/wifim/MainWifiManadger;->g:Landroid/widget/TextView;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 12
    .line 13
    .line 14
    return-void
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

.method public final y()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/woha/wifim/MainWifiManadger;->r:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/woha/wifim/MainWifiManadger;->s:Lm7/a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lcom/woha/wifim/MainWifiManadger;->t:Lm7/a;

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcom/woha/wifim/MainWifiManadger;->q:Lokhttp3/Call;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-interface {v2}, Lokhttp3/Call;->cancel()V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    iput-object v2, p0, Lcom/woha/wifim/MainWifiManadger;->q:Lokhttp3/Call;

    .line 22
    .line 23
    :cond_0
    iget-object v2, p0, Lcom/woha/wifim/MainWifiManadger;->j:Landroid/widget/Button;

    .line 24
    .line 25
    const v3, -0x777778

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Lcom/woha/wifim/MainWifiManadger;->j:Landroid/widget/Button;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-virtual {v2, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Lcom/woha/wifim/MainWifiManadger;->l:Landroid/widget/Button;

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 40
    .line 41
    .line 42
    iget-object v2, p0, Lcom/woha/wifim/MainWifiManadger;->j:Landroid/widget/Button;

    .line 43
    .line 44
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    const v4, 0x7f1304f1

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    iget-object v2, p0, Lcom/woha/wifim/MainWifiManadger;->k:Lcom/example/navistart/mainview/OnOffButton;

    .line 59
    .line 60
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {v2, v3}, Lcom/example/navistart/mainview/OnOffButton;->setEnable(Ljava/lang/Boolean;)V

    .line 63
    .line 64
    .line 65
    iget-object v2, p0, Lcom/woha/wifim/MainWifiManadger;->k:Lcom/example/navistart/mainview/OnOffButton;

    .line 66
    .line 67
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v2, v3}, Lcom/example/navistart/mainview/OnOffButton;->setTextButton(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const-wide/16 v2, 0x2ee0

    .line 79
    .line 80
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 81
    .line 82
    .line 83
    return-void
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

.method public final z()V
    .locals 2

    .line 1
    new-instance v0, Lm7/a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lm7/a;-><init>(Lcom/woha/wifim/MainWifiManadger;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 8
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
