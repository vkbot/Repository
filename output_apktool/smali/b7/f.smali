.class public abstract Lb7/f;
.super Landroid/view/ViewGroup;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# static fields
.field public static final synthetic A:I


# instance fields
.field public b:Lc7/g;

.field public final c:Landroid/view/WindowManager;

.field public final d:Landroid/os/Handler;

.field public e:Z

.field public f:Landroid/view/SurfaceView;

.field public g:Landroid/view/TextureView;

.field public h:Z

.field public final i:Lb7/p;

.field public j:I

.field public final k:Ljava/util/ArrayList;

.field public l:Lc7/l;

.field public m:Lc7/j;

.field public n:Lb7/u;

.field public o:Lb7/u;

.field public p:Landroid/graphics/Rect;

.field public q:Lb7/u;

.field public r:Landroid/graphics/Rect;

.field public s:Landroid/graphics/Rect;

.field public t:Lb7/u;

.field public u:D

.field public v:Lc7/n;

.field public w:Z

.field public final x:Lb7/d;

.field public final y:Lr5/c;

.field public final z:Lb7/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lb7/f;->e:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lb7/f;->h:Z

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    iput v1, p0, Lb7/f;->j:I

    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lb7/f;->k:Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance v1, Lc7/j;

    .line 20
    .line 21
    invoke-direct {v1}, Lc7/j;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lb7/f;->m:Lc7/j;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    iput-object v1, p0, Lb7/f;->r:Landroid/graphics/Rect;

    .line 28
    .line 29
    iput-object v1, p0, Lb7/f;->s:Landroid/graphics/Rect;

    .line 30
    .line 31
    iput-object v1, p0, Lb7/f;->t:Lb7/u;

    .line 32
    .line 33
    const-wide v2, 0x3fb999999999999aL    # 0.1

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    iput-wide v2, p0, Lb7/f;->u:D

    .line 39
    .line 40
    iput-object v1, p0, Lb7/f;->v:Lc7/n;

    .line 41
    .line 42
    iput-boolean v0, p0, Lb7/f;->w:Z

    .line 43
    .line 44
    new-instance v0, Lb7/d;

    .line 45
    .line 46
    move-object v1, p0

    .line 47
    check-cast v1, Lcom/journeyapps/barcodescanner/BarcodeView;

    .line 48
    .line 49
    invoke-direct {v0, v1}, Lb7/d;-><init>(Lcom/journeyapps/barcodescanner/BarcodeView;)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Lb7/f;->x:Lb7/d;

    .line 53
    .line 54
    new-instance v0, Lb7/b;

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    invoke-direct {v0, v1, v2}, Lb7/b;-><init>(Lcom/journeyapps/barcodescanner/BarcodeView;I)V

    .line 58
    .line 59
    .line 60
    new-instance v2, Lr5/c;

    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    invoke-direct {v2, v3, v1}, Lr5/c;-><init>(ILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iput-object v2, p0, Lb7/f;->y:Lr5/c;

    .line 67
    .line 68
    new-instance v2, Lb7/e;

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    invoke-direct {v2, v3, v1}, Lb7/e;-><init>(ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iput-object v2, p0, Lb7/f;->z:Lb7/e;

    .line 75
    .line 76
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    if-nez v1, :cond_0

    .line 81
    .line 82
    const/high16 v1, -0x1000000

    .line 83
    .line 84
    invoke-virtual {p0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 85
    .line 86
    .line 87
    :cond_0
    invoke-virtual {p0, p2}, Lb7/f;->b(Landroid/util/AttributeSet;)V

    .line 88
    .line 89
    .line 90
    const-string p2, "window"

    .line 91
    .line 92
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast p1, Landroid/view/WindowManager;

    .line 97
    .line 98
    iput-object p1, p0, Lb7/f;->c:Landroid/view/WindowManager;

    .line 99
    .line 100
    new-instance p1, Landroid/os/Handler;

    .line 101
    .line 102
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    .line 103
    .line 104
    .line 105
    iput-object p1, p0, Lb7/f;->d:Landroid/os/Handler;

    .line 106
    .line 107
    new-instance p1, Lb7/p;

    .line 108
    .line 109
    const/4 p2, 0x1

    .line 110
    invoke-direct {p1, p2}, Lb7/p;-><init>(I)V

    .line 111
    .line 112
    .line 113
    iput-object p1, p0, Lb7/f;->i:Lb7/p;

    .line 114
    .line 115
    return-void
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

.method public static a(Lcom/journeyapps/barcodescanner/BarcodeView;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lb7/f;->b:Lc7/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lb7/f;->getDisplayRotation()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, Lb7/f;->j:I

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/journeyapps/barcodescanner/BarcodeView;->g()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lb7/f;->c()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private getDisplayRotation()I
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/f;->c:Landroid/view/WindowManager;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
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
.method public final b(Landroid/util/AttributeSet;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ld6/h;->a:[I

    .line 6
    .line 7
    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x1

    .line 12
    const/high16 v1, -0x40800000    # -1.0f

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    float-to-int v2, v2

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    float-to-int v1, v1

    .line 25
    if-lez v2, :cond_0

    .line 26
    .line 27
    if-lez v1, :cond_0

    .line 28
    .line 29
    new-instance v3, Lb7/u;

    .line 30
    .line 31
    invoke-direct {v3, v2, v1}, Lb7/u;-><init>(II)V

    .line 32
    .line 33
    .line 34
    iput-object v3, p0, Lb7/f;->t:Lb7/u;

    .line 35
    .line 36
    :cond_0
    const/4 v1, 0x3

    .line 37
    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    iput-boolean v2, p0, Lb7/f;->e:Z

    .line 42
    .line 43
    const/4 v2, -0x1

    .line 44
    const/4 v3, 0x2

    .line 45
    invoke-virtual {p1, v3, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-ne v2, v0, :cond_1

    .line 50
    .line 51
    new-instance v0, Lc7/k;

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    invoke-direct {v0, v1}, Lc7/k;-><init>(I)V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, Lb7/f;->v:Lc7/n;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    if-ne v2, v3, :cond_2

    .line 61
    .line 62
    new-instance v0, Lc7/k;

    .line 63
    .line 64
    const/4 v1, 0x1

    .line 65
    invoke-direct {v0, v1}, Lc7/k;-><init>(I)V

    .line 66
    .line 67
    .line 68
    iput-object v0, p0, Lb7/f;->v:Lc7/n;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    if-ne v2, v1, :cond_3

    .line 72
    .line 73
    new-instance v0, Lc7/k;

    .line 74
    .line 75
    const/4 v1, 0x2

    .line 76
    invoke-direct {v0, v1}, Lc7/k;-><init>(I)V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, Lb7/f;->v:Lc7/n;

    .line 80
    .line 81
    :cond_3
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 82
    .line 83
    .line 84
    return-void
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

.method public final c()V
    .locals 8

    .line 1
    invoke-static {}, La/a;->y()V

    .line 2
    .line 3
    .line 4
    const-string v0, "f"

    .line 5
    .line 6
    const-string v1, "resume()"

    .line 7
    .line 8
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lb7/f;->b:Lc7/g;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const-string v0, "f"

    .line 16
    .line 17
    const-string v1, "initCamera called twice"

    .line 18
    .line 19
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    goto/16 :goto_0

    .line 23
    .line 24
    :cond_0
    new-instance v0, Lc7/g;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    iput-boolean v2, v0, Lc7/g;->f:Z

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    iput-boolean v3, v0, Lc7/g;->g:Z

    .line 38
    .line 39
    new-instance v4, Lc7/j;

    .line 40
    .line 41
    invoke-direct {v4}, Lc7/j;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v4, v0, Lc7/g;->i:Lc7/j;

    .line 45
    .line 46
    new-instance v4, Lc7/f;

    .line 47
    .line 48
    invoke-direct {v4, v0, v2}, Lc7/f;-><init>(Lc7/g;I)V

    .line 49
    .line 50
    .line 51
    new-instance v5, Lc7/f;

    .line 52
    .line 53
    invoke-direct {v5, v0, v3}, Lc7/f;-><init>(Lc7/g;I)V

    .line 54
    .line 55
    .line 56
    iput-object v5, v0, Lc7/g;->j:Lc7/f;

    .line 57
    .line 58
    new-instance v5, Lc7/f;

    .line 59
    .line 60
    const/4 v6, 0x2

    .line 61
    invoke-direct {v5, v0, v6}, Lc7/f;-><init>(Lc7/g;I)V

    .line 62
    .line 63
    .line 64
    iput-object v5, v0, Lc7/g;->k:Lc7/f;

    .line 65
    .line 66
    new-instance v5, Lc7/f;

    .line 67
    .line 68
    const/4 v6, 0x3

    .line 69
    invoke-direct {v5, v0, v6}, Lc7/f;-><init>(Lc7/g;I)V

    .line 70
    .line 71
    .line 72
    iput-object v5, v0, Lc7/g;->l:Lc7/f;

    .line 73
    .line 74
    invoke-static {}, La/a;->y()V

    .line 75
    .line 76
    .line 77
    sget-object v5, Lb7/p;->f:Lb7/p;

    .line 78
    .line 79
    if-nez v5, :cond_1

    .line 80
    .line 81
    new-instance v5, Lb7/p;

    .line 82
    .line 83
    invoke-direct {v5}, Lb7/p;-><init>()V

    .line 84
    .line 85
    .line 86
    sput-object v5, Lb7/p;->f:Lb7/p;

    .line 87
    .line 88
    :cond_1
    sget-object v5, Lb7/p;->f:Lb7/p;

    .line 89
    .line 90
    iput-object v5, v0, Lc7/g;->a:Lb7/p;

    .line 91
    .line 92
    new-instance v6, Lc7/i;

    .line 93
    .line 94
    invoke-direct {v6, v1}, Lc7/i;-><init>(Landroid/content/Context;)V

    .line 95
    .line 96
    .line 97
    iput-object v6, v0, Lc7/g;->c:Lc7/i;

    .line 98
    .line 99
    iget-object v1, v0, Lc7/g;->i:Lc7/j;

    .line 100
    .line 101
    iput-object v1, v6, Lc7/i;->g:Lc7/j;

    .line 102
    .line 103
    new-instance v1, Landroid/os/Handler;

    .line 104
    .line 105
    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 106
    .line 107
    .line 108
    iput-object v1, v0, Lc7/g;->h:Landroid/os/Handler;

    .line 109
    .line 110
    iget-object v1, p0, Lb7/f;->m:Lc7/j;

    .line 111
    .line 112
    iget-boolean v7, v0, Lc7/g;->f:Z

    .line 113
    .line 114
    if-nez v7, :cond_2

    .line 115
    .line 116
    iput-object v1, v0, Lc7/g;->i:Lc7/j;

    .line 117
    .line 118
    iput-object v1, v6, Lc7/i;->g:Lc7/j;

    .line 119
    .line 120
    :cond_2
    iput-object v0, p0, Lb7/f;->b:Lc7/g;

    .line 121
    .line 122
    iget-object v1, p0, Lb7/f;->d:Landroid/os/Handler;

    .line 123
    .line 124
    iput-object v1, v0, Lc7/g;->d:Landroid/os/Handler;

    .line 125
    .line 126
    invoke-static {}, La/a;->y()V

    .line 127
    .line 128
    .line 129
    iput-boolean v3, v0, Lc7/g;->f:Z

    .line 130
    .line 131
    iput-boolean v2, v0, Lc7/g;->g:Z

    .line 132
    .line 133
    iget-object v0, v5, Lb7/p;->e:Ljava/lang/Object;

    .line 134
    .line 135
    monitor-enter v0

    .line 136
    :try_start_0
    iget v1, v5, Lb7/p;->b:I

    .line 137
    .line 138
    add-int/2addr v1, v3

    .line 139
    iput v1, v5, Lb7/p;->b:I

    .line 140
    .line 141
    invoke-virtual {v5, v4}, Lb7/p;->d(Ljava/lang/Runnable;)V

    .line 142
    .line 143
    .line 144
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    invoke-direct {p0}, Lb7/f;->getDisplayRotation()I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    iput v0, p0, Lb7/f;->j:I

    .line 150
    .line 151
    :goto_0
    iget-object v0, p0, Lb7/f;->q:Lb7/u;

    .line 152
    .line 153
    if-eqz v0, :cond_3

    .line 154
    .line 155
    invoke-virtual {p0}, Lb7/f;->e()V

    .line 156
    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_3
    iget-object v0, p0, Lb7/f;->f:Landroid/view/SurfaceView;

    .line 160
    .line 161
    if-eqz v0, :cond_4

    .line 162
    .line 163
    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    iget-object v1, p0, Lb7/f;->x:Lb7/d;

    .line 168
    .line 169
    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_4
    iget-object v0, p0, Lb7/f;->g:Landroid/view/TextureView;

    .line 174
    .line 175
    if-eqz v0, :cond_6

    .line 176
    .line 177
    invoke-virtual {v0}, Landroid/view/TextureView;->isAvailable()Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-eqz v0, :cond_5

    .line 182
    .line 183
    iget-object v0, p0, Lb7/f;->g:Landroid/view/TextureView;

    .line 184
    .line 185
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 186
    .line 187
    .line 188
    iget-object v0, p0, Lb7/f;->g:Landroid/view/TextureView;

    .line 189
    .line 190
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    iget-object v1, p0, Lb7/f;->g:Landroid/view/TextureView;

    .line 195
    .line 196
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    new-instance v2, Lb7/u;

    .line 201
    .line 202
    invoke-direct {v2, v0, v1}, Lb7/u;-><init>(II)V

    .line 203
    .line 204
    .line 205
    iput-object v2, p0, Lb7/f;->q:Lb7/u;

    .line 206
    .line 207
    invoke-virtual {p0}, Lb7/f;->e()V

    .line 208
    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_5
    iget-object v0, p0, Lb7/f;->g:Landroid/view/TextureView;

    .line 212
    .line 213
    new-instance v1, Lb7/c;

    .line 214
    .line 215
    invoke-direct {v1, p0}, Lb7/c;-><init>(Lb7/f;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 219
    .line 220
    .line 221
    :cond_6
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 222
    .line 223
    .line 224
    iget-object v0, p0, Lb7/f;->i:Lb7/p;

    .line 225
    .line 226
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    iget-object v2, p0, Lb7/f;->y:Lr5/c;

    .line 231
    .line 232
    iget-object v3, v0, Lb7/p;->d:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v3, Lb7/t;

    .line 235
    .line 236
    if-eqz v3, :cond_7

    .line 237
    .line 238
    invoke-virtual {v3}, Landroid/view/OrientationEventListener;->disable()V

    .line 239
    .line 240
    .line 241
    :cond_7
    const/4 v3, 0x0

    .line 242
    iput-object v3, v0, Lb7/p;->d:Ljava/lang/Object;

    .line 243
    .line 244
    iput-object v3, v0, Lb7/p;->c:Ljava/lang/Object;

    .line 245
    .line 246
    iput-object v3, v0, Lb7/p;->e:Ljava/lang/Object;

    .line 247
    .line 248
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    iput-object v2, v0, Lb7/p;->e:Ljava/lang/Object;

    .line 253
    .line 254
    const-string v2, "window"

    .line 255
    .line 256
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    check-cast v2, Landroid/view/WindowManager;

    .line 261
    .line 262
    iput-object v2, v0, Lb7/p;->c:Ljava/lang/Object;

    .line 263
    .line 264
    new-instance v2, Lb7/t;

    .line 265
    .line 266
    invoke-direct {v2, v0, v1}, Lb7/t;-><init>(Lb7/p;Landroid/content/Context;)V

    .line 267
    .line 268
    .line 269
    iput-object v2, v0, Lb7/p;->d:Ljava/lang/Object;

    .line 270
    .line 271
    invoke-virtual {v2}, Landroid/view/OrientationEventListener;->enable()V

    .line 272
    .line 273
    .line 274
    iget-object v1, v0, Lb7/p;->c:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v1, Landroid/view/WindowManager;

    .line 277
    .line 278
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    invoke-virtual {v1}, Landroid/view/Display;->getRotation()I

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    iput v1, v0, Lb7/p;->b:I

    .line 287
    .line 288
    return-void

    .line 289
    :catchall_0
    move-exception v1

    .line 290
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 291
    throw v1
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

.method public final d(Landroid/support/v4/media/h;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lb7/f;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lb7/f;->b:Lc7/g;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const-string v0, "f"

    .line 10
    .line 11
    const-string v1, "Starting preview"

    .line 12
    .line 13
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lb7/f;->b:Lc7/g;

    .line 17
    .line 18
    iput-object p1, v0, Lc7/g;->b:Landroid/support/v4/media/h;

    .line 19
    .line 20
    invoke-static {}, La/a;->y()V

    .line 21
    .line 22
    .line 23
    iget-boolean p1, v0, Lc7/g;->f:Z

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    iget-object p1, v0, Lc7/g;->a:Lb7/p;

    .line 28
    .line 29
    iget-object v0, v0, Lc7/g;->k:Lc7/f;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lb7/p;->d(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x1

    .line 35
    iput-boolean p1, p0, Lb7/f;->h:Z

    .line 36
    .line 37
    move-object p1, p0

    .line 38
    check-cast p1, Lcom/journeyapps/barcodescanner/BarcodeView;

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/journeyapps/barcodescanner/BarcodeView;->h()V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lb7/f;->z:Lb7/e;

    .line 44
    .line 45
    invoke-virtual {p1}, Lb7/e;->g()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    const-string p1, "CameraInstance is not open"

    .line 50
    .line 51
    invoke-static {p1}, Lj1/i;->l(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void
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

.method public final e()V
    .locals 6

    .line 1
    iget-object v0, p0, Lb7/f;->q:Lb7/u;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    iget-object v1, p0, Lb7/f;->o:Lb7/u;

    .line 6
    .line 7
    if-eqz v1, :cond_5

    .line 8
    .line 9
    iget-object v1, p0, Lb7/f;->p:Landroid/graphics/Rect;

    .line 10
    .line 11
    if-eqz v1, :cond_5

    .line 12
    .line 13
    iget-object v2, p0, Lb7/f;->f:Landroid/view/SurfaceView;

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    new-instance v2, Lb7/u;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget-object v3, p0, Lb7/f;->p:Landroid/graphics/Rect;

    .line 24
    .line 25
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-direct {v2, v1, v3}, Lb7/u;-><init>(II)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v2}, Lb7/u;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    new-instance v0, Landroid/support/v4/media/h;

    .line 39
    .line 40
    iget-object v1, p0, Lb7/f;->f:Landroid/view/SurfaceView;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const/4 v2, 0x4

    .line 47
    const/4 v3, 0x0

    .line 48
    invoke-direct {v0, v2, v3}, Landroid/support/v4/media/h;-><init>(IZ)V

    .line 49
    .line 50
    .line 51
    if-eqz v1, :cond_0

    .line 52
    .line 53
    iput-object v1, v0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Lb7/f;->d(Landroid/support/v4/media/h;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_0
    const-string v0, "surfaceHolder may not be null"

    .line 60
    .line 61
    invoke-static {v0}, Lj1/i;->k(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_1
    iget-object v0, p0, Lb7/f;->g:Landroid/view/TextureView;

    .line 66
    .line 67
    if-eqz v0, :cond_5

    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    iget-object v0, p0, Lb7/f;->o:Lb7/u;

    .line 76
    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    iget-object v0, p0, Lb7/f;->g:Landroid/view/TextureView;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    iget-object v1, p0, Lb7/f;->g:Landroid/view/TextureView;

    .line 86
    .line 87
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    iget-object v2, p0, Lb7/f;->o:Lb7/u;

    .line 92
    .line 93
    int-to-float v3, v0

    .line 94
    int-to-float v1, v1

    .line 95
    div-float/2addr v3, v1

    .line 96
    iget v4, v2, Lb7/u;->b:I

    .line 97
    .line 98
    int-to-float v4, v4

    .line 99
    iget v2, v2, Lb7/u;->c:I

    .line 100
    .line 101
    int-to-float v2, v2

    .line 102
    div-float/2addr v4, v2

    .line 103
    cmpg-float v2, v3, v4

    .line 104
    .line 105
    const/high16 v5, 0x3f800000    # 1.0f

    .line 106
    .line 107
    if-gez v2, :cond_2

    .line 108
    .line 109
    div-float/2addr v4, v3

    .line 110
    move v3, v5

    .line 111
    move v5, v4

    .line 112
    goto :goto_0

    .line 113
    :cond_2
    div-float/2addr v3, v4

    .line 114
    :goto_0
    new-instance v2, Landroid/graphics/Matrix;

    .line 115
    .line 116
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v5, v3}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 120
    .line 121
    .line 122
    int-to-float v0, v0

    .line 123
    mul-float/2addr v5, v0

    .line 124
    mul-float/2addr v3, v1

    .line 125
    sub-float/2addr v0, v5

    .line 126
    const/high16 v4, 0x40000000    # 2.0f

    .line 127
    .line 128
    div-float/2addr v0, v4

    .line 129
    sub-float/2addr v1, v3

    .line 130
    div-float/2addr v1, v4

    .line 131
    invoke-virtual {v2, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 132
    .line 133
    .line 134
    iget-object v0, p0, Lb7/f;->g:Landroid/view/TextureView;

    .line 135
    .line 136
    invoke-virtual {v0, v2}, Landroid/view/TextureView;->setTransform(Landroid/graphics/Matrix;)V

    .line 137
    .line 138
    .line 139
    :cond_3
    new-instance v0, Landroid/support/v4/media/h;

    .line 140
    .line 141
    iget-object v1, p0, Lb7/f;->g:Landroid/view/TextureView;

    .line 142
    .line 143
    invoke-virtual {v1}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    const/4 v2, 0x4

    .line 148
    const/4 v3, 0x0

    .line 149
    invoke-direct {v0, v2, v3}, Landroid/support/v4/media/h;-><init>(IZ)V

    .line 150
    .line 151
    .line 152
    if-eqz v1, :cond_4

    .line 153
    .line 154
    iput-object v1, v0, Landroid/support/v4/media/h;->d:Ljava/lang/Object;

    .line 155
    .line 156
    invoke-virtual {p0, v0}, Lb7/f;->d(Landroid/support/v4/media/h;)V

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :cond_4
    const-string v0, "surfaceTexture may not be null"

    .line 161
    .line 162
    invoke-static {v0}, Lj1/i;->k(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    :cond_5
    return-void
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

.method public getCameraInstance()Lc7/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/f;->b:Lc7/g;

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

.method public getCameraSettings()Lc7/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/f;->m:Lc7/j;

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

.method public getFramingRect()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/f;->r:Landroid/graphics/Rect;

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

.method public getFramingRectSize()Lb7/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/f;->t:Lb7/u;

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

.method public getMarginFraction()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lb7/f;->u:D

    .line 2
    .line 3
    return-wide v0
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

.method public getPreviewFramingRect()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/f;->s:Landroid/graphics/Rect;

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

.method public getPreviewScalingStrategy()Lc7/n;
    .locals 2

    .line 1
    iget-object v0, p0, Lb7/f;->v:Lc7/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lb7/f;->g:Landroid/view/TextureView;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    new-instance v0, Lc7/k;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {v0, v1}, Lc7/k;-><init>(I)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_1
    new-instance v0, Lc7/k;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, v1}, Lc7/k;-><init>(I)V

    .line 21
    .line 22
    .line 23
    return-object v0
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

.method public getPreviewSize()Lb7/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/f;->o:Lb7/u;

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

.method public final onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lb7/f;->e:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Landroid/view/TextureView;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lb7/f;->g:Landroid/view/TextureView;

    .line 18
    .line 19
    new-instance v1, Lb7/c;

    .line 20
    .line 21
    invoke-direct {v1, p0}, Lb7/c;-><init>(Lb7/f;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lb7/f;->g:Landroid/view/TextureView;

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    new-instance v0, Landroid/view/SurfaceView;

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-direct {v0, v1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lb7/f;->f:Landroid/view/SurfaceView;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, p0, Lb7/f;->x:Lb7/d;

    .line 49
    .line 50
    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lb7/f;->f:Landroid/view/SurfaceView;

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    return-void
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

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    new-instance p1, Lb7/u;

    .line 2
    .line 3
    sub-int/2addr p4, p2

    .line 4
    sub-int/2addr p5, p3

    .line 5
    invoke-direct {p1, p4, p5}, Lb7/u;-><init>(II)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lb7/f;->n:Lb7/u;

    .line 9
    .line 10
    iget-object p2, p0, Lb7/f;->b:Lc7/g;

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    iget-object p2, p2, Lc7/g;->e:Lc7/l;

    .line 15
    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    new-instance p2, Lc7/l;

    .line 19
    .line 20
    invoke-direct {p0}, Lb7/f;->getDisplayRotation()I

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    const/4 p4, 0x0

    .line 25
    invoke-direct {p2, p4}, Lc7/l;-><init>(I)V

    .line 26
    .line 27
    .line 28
    new-instance p4, Lc7/k;

    .line 29
    .line 30
    const/4 p5, 0x1

    .line 31
    invoke-direct {p4, p5}, Lc7/k;-><init>(I)V

    .line 32
    .line 33
    .line 34
    iput-object p4, p2, Lc7/l;->d:Ljava/lang/Object;

    .line 35
    .line 36
    iput p3, p2, Lc7/l;->b:I

    .line 37
    .line 38
    iput-object p1, p2, Lc7/l;->c:Ljava/lang/Object;

    .line 39
    .line 40
    iput-object p2, p0, Lb7/f;->l:Lc7/l;

    .line 41
    .line 42
    invoke-virtual {p0}, Lb7/f;->getPreviewScalingStrategy()Lc7/n;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p2, Lc7/l;->d:Ljava/lang/Object;

    .line 47
    .line 48
    iget-object p1, p0, Lb7/f;->b:Lc7/g;

    .line 49
    .line 50
    iget-object p2, p0, Lb7/f;->l:Lc7/l;

    .line 51
    .line 52
    iput-object p2, p1, Lc7/g;->e:Lc7/l;

    .line 53
    .line 54
    iget-object p3, p1, Lc7/g;->c:Lc7/i;

    .line 55
    .line 56
    iput-object p2, p3, Lc7/i;->h:Lc7/l;

    .line 57
    .line 58
    invoke-static {}, La/a;->y()V

    .line 59
    .line 60
    .line 61
    iget-boolean p2, p1, Lc7/g;->f:Z

    .line 62
    .line 63
    if-eqz p2, :cond_0

    .line 64
    .line 65
    iget-object p2, p1, Lc7/g;->a:Lb7/p;

    .line 66
    .line 67
    iget-object p1, p1, Lc7/g;->j:Lc7/f;

    .line 68
    .line 69
    invoke-virtual {p2, p1}, Lb7/p;->d(Ljava/lang/Runnable;)V

    .line 70
    .line 71
    .line 72
    iget-boolean p1, p0, Lb7/f;->w:Z

    .line 73
    .line 74
    if-eqz p1, :cond_1

    .line 75
    .line 76
    iget-object p2, p0, Lb7/f;->b:Lc7/g;

    .line 77
    .line 78
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-static {}, La/a;->y()V

    .line 82
    .line 83
    .line 84
    iget-boolean p3, p2, Lc7/g;->f:Z

    .line 85
    .line 86
    if-eqz p3, :cond_1

    .line 87
    .line 88
    iget-object p3, p2, Lc7/g;->a:Lb7/p;

    .line 89
    .line 90
    new-instance p4, Lc7/e;

    .line 91
    .line 92
    const/4 p5, 0x0

    .line 93
    invoke-direct {p4, p2, p1, p5}, Lc7/e;-><init>(Ljava/lang/Object;ZI)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p3, p4}, Lb7/p;->d(Ljava/lang/Runnable;)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    const-string p1, "CameraInstance is not open"

    .line 101
    .line 102
    invoke-static {p1}, Lj1/i;->l(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_1
    :goto_0
    iget-object p1, p0, Lb7/f;->f:Landroid/view/SurfaceView;

    .line 107
    .line 108
    const/4 p2, 0x0

    .line 109
    if-eqz p1, :cond_3

    .line 110
    .line 111
    iget-object p3, p0, Lb7/f;->p:Landroid/graphics/Rect;

    .line 112
    .line 113
    if-nez p3, :cond_2

    .line 114
    .line 115
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 116
    .line 117
    .line 118
    move-result p3

    .line 119
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 120
    .line 121
    .line 122
    move-result p4

    .line 123
    invoke-virtual {p1, p2, p2, p3, p4}, Landroid/view/View;->layout(IIII)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_2
    iget p2, p3, Landroid/graphics/Rect;->left:I

    .line 128
    .line 129
    iget p4, p3, Landroid/graphics/Rect;->top:I

    .line 130
    .line 131
    iget p5, p3, Landroid/graphics/Rect;->right:I

    .line 132
    .line 133
    iget p3, p3, Landroid/graphics/Rect;->bottom:I

    .line 134
    .line 135
    invoke-virtual {p1, p2, p4, p5, p3}, Landroid/view/View;->layout(IIII)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_3
    iget-object p1, p0, Lb7/f;->g:Landroid/view/TextureView;

    .line 140
    .line 141
    if-eqz p1, :cond_4

    .line 142
    .line 143
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 144
    .line 145
    .line 146
    move-result p3

    .line 147
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 148
    .line 149
    .line 150
    move-result p4

    .line 151
    invoke-virtual {p1, p2, p2, p3, p4}, Landroid/view/View;->layout(IIII)V

    .line 152
    .line 153
    .line 154
    :cond_4
    return-void
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
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/os/Bundle;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, Landroid/os/Bundle;

    .line 10
    .line 11
    const-string v0, "super"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 18
    .line 19
    .line 20
    const-string v0, "torch"

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {p0, p1}, Lb7/f;->setTorch(Z)V

    .line 27
    .line 28
    .line 29
    return-void
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

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "super"

    .line 11
    .line 12
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "torch"

    .line 16
    .line 17
    iget-boolean v2, p0, Lb7/f;->w:Z

    .line 18
    .line 19
    invoke-virtual {v1, v0, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    return-object v1
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

.method public setCameraSettings(Lc7/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb7/f;->m:Lc7/j;

    .line 2
    .line 3
    return-void
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

.method public setFramingRectSize(Lb7/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb7/f;->t:Lb7/u;

    .line 2
    .line 3
    return-void
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

.method public setMarginFraction(D)V
    .locals 2

    .line 1
    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    .line 2
    .line 3
    cmpl-double v0, p1, v0

    .line 4
    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    iput-wide p1, p0, Lb7/f;->u:D

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p1, "The margin fraction must be less than 0.5"

    .line 11
    .line 12
    invoke-static {p1}, Lj1/i;->k(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setPreviewScalingStrategy(Lc7/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb7/f;->v:Lc7/n;

    .line 2
    .line 3
    return-void
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

.method public setTorch(Z)V
    .locals 4

    .line 1
    iput-boolean p1, p0, Lb7/f;->w:Z

    .line 2
    .line 3
    iget-object v0, p0, Lb7/f;->b:Lc7/g;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, La/a;->y()V

    .line 8
    .line 9
    .line 10
    iget-boolean v1, v0, Lc7/g;->f:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v1, v0, Lc7/g;->a:Lb7/p;

    .line 15
    .line 16
    new-instance v2, Lc7/e;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {v2, v0, p1, v3}, Lc7/e;-><init>(Ljava/lang/Object;ZI)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Lb7/p;->d(Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    :cond_0
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

.method public setUseTextureView(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lb7/f;->e:Z

    .line 2
    .line 3
    return-void
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
