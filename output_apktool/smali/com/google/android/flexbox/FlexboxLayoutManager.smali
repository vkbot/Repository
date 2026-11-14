.class public Lcom/google/android/flexbox/FlexboxLayoutManager;
.super Landroidx/recyclerview/widget/RecyclerView$LayoutManager;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"

# interfaces
.implements Lo2/a;
.implements Landroidx/recyclerview/widget/RecyclerView$SmoothScroller$ScrollVectorProvider;


# static fields
.field public static final z:Landroid/graphics/Rect;


# instance fields
.field public b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public f:Z

.field public g:Z

.field public h:Ljava/util/List;

.field public final i:Le0/s3;

.field public j:Landroidx/recyclerview/widget/RecyclerView$Recycler;

.field public k:Landroidx/recyclerview/widget/RecyclerView$State;

.field public l:Lo2/h;

.field public final m:Lo2/f;

.field public n:Landroidx/recyclerview/widget/OrientationHelper;

.field public o:Landroidx/recyclerview/widget/OrientationHelper;

.field public p:Lo2/i;

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public final u:Landroid/util/SparseArray;

.field public final v:Landroid/content/Context;

.field public w:Landroid/view/View;

.field public x:I

.field public final y:Lj/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:Landroid/graphics/Rect;

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
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->e:I

    .line 6
    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 13
    .line 14
    new-instance v1, Le0/s3;

    .line 15
    .line 16
    invoke-direct {v1, p0}, Le0/s3;-><init>(Lo2/a;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->i:Le0/s3;

    .line 20
    .line 21
    new-instance v1, Lo2/f;

    .line 22
    .line 23
    invoke-direct {v1, p0}, Lo2/f;-><init>(Lcom/google/android/flexbox/FlexboxLayoutManager;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m:Lo2/f;

    .line 27
    .line 28
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:I

    .line 29
    .line 30
    const/high16 v2, -0x80000000

    .line 31
    .line 32
    iput v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r:I

    .line 33
    .line 34
    iput v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->s:I

    .line 35
    .line 36
    iput v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:I

    .line 37
    .line 38
    new-instance v2, Landroid/util/SparseArray;

    .line 39
    .line 40
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Landroid/util/SparseArray;

    .line 44
    .line 45
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:I

    .line 46
    .line 47
    new-instance v0, Lj/i;

    .line 48
    .line 49
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->y:Lj/i;

    .line 53
    .line 54
    invoke-static {p1, p2, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getProperties(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroidx/recyclerview/widget/RecyclerView$LayoutManager$Properties;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    iget p3, p2, Landroidx/recyclerview/widget/RecyclerView$LayoutManager$Properties;->orientation:I

    .line 59
    .line 60
    const/4 p4, 0x0

    .line 61
    const/4 v0, 0x1

    .line 62
    if-eqz p3, :cond_2

    .line 63
    .line 64
    if-eq p3, v0, :cond_0

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    iget-boolean p2, p2, Landroidx/recyclerview/widget/RecyclerView$LayoutManager$Properties;->reverseLayout:Z

    .line 68
    .line 69
    if-eqz p2, :cond_1

    .line 70
    .line 71
    const/4 p2, 0x3

    .line 72
    invoke-virtual {p0, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->w(I)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    const/4 p2, 0x2

    .line 77
    invoke-virtual {p0, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->w(I)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    iget-boolean p2, p2, Landroidx/recyclerview/widget/RecyclerView$LayoutManager$Properties;->reverseLayout:Z

    .line 82
    .line 83
    if-eqz p2, :cond_3

    .line 84
    .line 85
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->w(I)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    invoke-virtual {p0, p4}, Lcom/google/android/flexbox/FlexboxLayoutManager;->w(I)V

    .line 90
    .line 91
    .line 92
    :goto_0
    iget p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->c:I

    .line 93
    .line 94
    if-eq p2, v0, :cond_5

    .line 95
    .line 96
    if-eqz p2, :cond_4

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->removeAllViews()V

    .line 100
    .line 101
    .line 102
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 103
    .line 104
    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 105
    .line 106
    .line 107
    invoke-static {v1}, Lo2/f;->b(Lo2/f;)V

    .line 108
    .line 109
    .line 110
    iput p4, v1, Lo2/f;->d:I

    .line 111
    .line 112
    :goto_1
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->c:I

    .line 113
    .line 114
    const/4 p2, 0x0

    .line 115
    iput-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 116
    .line 117
    iput-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->o:Landroidx/recyclerview/widget/OrientationHelper;

    .line 118
    .line 119
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->requestLayout()V

    .line 120
    .line 121
    .line 122
    :cond_5
    iget p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->d:I

    .line 123
    .line 124
    const/4 p3, 0x4

    .line 125
    if-eq p2, p3, :cond_6

    .line 126
    .line 127
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->removeAllViews()V

    .line 128
    .line 129
    .line 130
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 131
    .line 132
    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 133
    .line 134
    .line 135
    invoke-static {v1}, Lo2/f;->b(Lo2/f;)V

    .line 136
    .line 137
    .line 138
    iput p4, v1, Lo2/f;->d:I

    .line 139
    .line 140
    iput p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->d:I

    .line 141
    .line 142
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->requestLayout()V

    .line 143
    .line 144
    .line 145
    :cond_6
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Landroid/content/Context;

    .line 146
    .line 147
    return-void
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

.method public static isMeasurementUpToDate(III)Z
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v1, 0x0

    .line 10
    if-lez p2, :cond_0

    .line 11
    .line 12
    if-eq p0, p2, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    const/high16 p2, -0x80000000

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    if-eq v0, p2, :cond_4

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    const/high16 p2, 0x40000000    # 2.0f

    .line 23
    .line 24
    if-eq v0, p2, :cond_1

    .line 25
    .line 26
    return v1

    .line 27
    :cond_1
    if-ne p1, p0, :cond_2

    .line 28
    .line 29
    return v2

    .line 30
    :cond_2
    return v1

    .line 31
    :cond_3
    return v2

    .line 32
    :cond_4
    if-lt p1, p0, :cond_5

    .line 33
    .line 34
    return v2

    .line 35
    :cond_5
    return v1
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
.method public final A(Lo2/f;ZZ)V
    .locals 2

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->v()V

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p3, Lo2/h;->b:Z

    .line 11
    .line 12
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    if-nez p3, :cond_1

    .line 17
    .line 18
    iget-boolean p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f:Z

    .line 19
    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 23
    .line 24
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Landroid/view/View;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget v1, p1, Lo2/f;->c:I

    .line 31
    .line 32
    sub-int/2addr v0, v1

    .line 33
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 34
    .line 35
    invoke-virtual {v1}, Landroidx/recyclerview/widget/OrientationHelper;->getStartAfterPadding()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    sub-int/2addr v0, v1

    .line 40
    iput v0, p3, Lo2/h;->a:I

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 44
    .line 45
    iget v0, p1, Lo2/f;->c:I

    .line 46
    .line 47
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 48
    .line 49
    invoke-virtual {v1}, Landroidx/recyclerview/widget/OrientationHelper;->getStartAfterPadding()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    sub-int/2addr v0, v1

    .line 54
    iput v0, p3, Lo2/h;->a:I

    .line 55
    .line 56
    :goto_1
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 57
    .line 58
    iget v0, p1, Lo2/f;->a:I

    .line 59
    .line 60
    iput v0, p3, Lo2/h;->d:I

    .line 61
    .line 62
    const/4 v0, -0x1

    .line 63
    iput v0, p3, Lo2/h;->h:I

    .line 64
    .line 65
    iget v0, p1, Lo2/f;->c:I

    .line 66
    .line 67
    iput v0, p3, Lo2/h;->e:I

    .line 68
    .line 69
    const/high16 v0, -0x80000000

    .line 70
    .line 71
    iput v0, p3, Lo2/h;->f:I

    .line 72
    .line 73
    iget v0, p1, Lo2/f;->b:I

    .line 74
    .line 75
    iput v0, p3, Lo2/h;->c:I

    .line 76
    .line 77
    if-eqz p2, :cond_2

    .line 78
    .line 79
    if-lez v0, :cond_2

    .line 80
    .line 81
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 82
    .line 83
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    iget p1, p1, Lo2/f;->b:I

    .line 88
    .line 89
    if-le p2, p1, :cond_2

    .line 90
    .line 91
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 92
    .line 93
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    check-cast p1, Lo2/c;

    .line 98
    .line 99
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 100
    .line 101
    iget p3, p2, Lo2/h;->c:I

    .line 102
    .line 103
    add-int/lit8 p3, p3, -0x1

    .line 104
    .line 105
    iput p3, p2, Lo2/h;->c:I

    .line 106
    .line 107
    iget p1, p1, Lo2/c;->h:I

    .line 108
    .line 109
    iget p3, p2, Lo2/h;->d:I

    .line 110
    .line 111
    sub-int/2addr p3, p1

    .line 112
    iput p3, p2, Lo2/h;->d:I

    .line 113
    .line 114
    :cond_2
    return-void
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
.end method

.method public final a(Landroid/view/View;IILo2/c;)V
    .locals 0

    .line 1
    sget-object p2, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->calculateItemDecorationsForChild(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getLeftDecorationWidth(Landroid/view/View;)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getRightDecorationWidth(Landroid/view/View;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    add-int/2addr p1, p2

    .line 21
    iget p2, p4, Lo2/c;->e:I

    .line 22
    .line 23
    add-int/2addr p2, p1

    .line 24
    iput p2, p4, Lo2/c;->e:I

    .line 25
    .line 26
    iget p2, p4, Lo2/c;->f:I

    .line 27
    .line 28
    add-int/2addr p2, p1

    .line 29
    iput p2, p4, Lo2/c;->f:I

    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getTopDecorationHeight(Landroid/view/View;)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getBottomDecorationHeight(Landroid/view/View;)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    add-int/2addr p1, p2

    .line 41
    iget p2, p4, Lo2/c;->e:I

    .line 42
    .line 43
    add-int/2addr p2, p1

    .line 44
    iput p2, p4, Lo2/c;->e:I

    .line 45
    .line 46
    iget p2, p4, Lo2/c;->f:I

    .line 47
    .line 48
    add-int/2addr p2, p1

    .line 49
    iput p2, p4, Lo2/c;->f:I

    .line 50
    .line 51
    return-void
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

.method public final b(Lo2/c;)V
    .locals 0

    .line 1
    return-void
    .line 2
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

.method public final c(I)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->f(I)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public final canScrollHorizontally()Z
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->c:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidth()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Landroid/view/View;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v1, v2

    .line 31
    :goto_0
    if-le v0, v1, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    return v2

    .line 35
    :cond_3
    :goto_1
    const/4 v0, 0x1

    .line 36
    return v0
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

.method public final canScrollVertically()Z
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->c:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    xor-int/2addr v0, v1

    .line 11
    return v0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getHeight()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Landroid/view/View;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move v2, v3

    .line 33
    :goto_0
    if-le v0, v2, :cond_2

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    return v3

    .line 37
    :cond_3
    :goto_1
    return v1
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

.method public final checkLayoutParams(Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Lo2/g;

    .line 2
    .line 3
    return p1
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

.method public final computeHorizontalScrollExtent(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->computeScrollExtent(Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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

.method public final computeHorizontalScrollOffset(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->computeScrollOffset(Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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

.method public final computeHorizontalScrollRange(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->computeScrollRange(Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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

.method public final computeScrollExtent(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$State;->getItemCount()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->m(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->o(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$State;->getItemCount()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedEnd(Landroid/view/View;)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    sub-int/2addr p1, v0

    .line 48
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroidx/recyclerview/widget/OrientationHelper;->getTotalSpace()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    return p1

    .line 59
    :cond_2
    :goto_0
    return v1
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

.method public final computeScrollOffset(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$State;->getItemCount()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->m(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->o(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$State;->getItemCount()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_3

    .line 26
    .line 27
    if-eqz v2, :cond_3

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 41
    .line 42
    invoke-virtual {v4, v0}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedEnd(Landroid/view/View;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 47
    .line 48
    invoke-virtual {v4, v2}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    sub-int/2addr v0, v4

    .line 53
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->i:Le0/s3;

    .line 58
    .line 59
    iget-object v4, v4, Le0/s3;->e:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v4, [I

    .line 62
    .line 63
    aget p1, v4, p1

    .line 64
    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    const/4 v5, -0x1

    .line 68
    if-ne p1, v5, :cond_2

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    aget v1, v4, v3

    .line 72
    .line 73
    sub-int/2addr v1, p1

    .line 74
    add-int/lit8 v1, v1, 0x1

    .line 75
    .line 76
    int-to-float v0, v0

    .line 77
    int-to-float v1, v1

    .line 78
    div-float/2addr v0, v1

    .line 79
    int-to-float p1, p1

    .line 80
    mul-float/2addr p1, v0

    .line 81
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 82
    .line 83
    invoke-virtual {v0}, Landroidx/recyclerview/widget/OrientationHelper;->getStartAfterPadding()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 88
    .line 89
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    sub-int/2addr v0, v1

    .line 94
    int-to-float v0, v0

    .line 95
    add-float/2addr p1, v0

    .line 96
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    return p1

    .line 101
    :cond_3
    :goto_0
    return v1
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

.method public final computeScrollRange(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_2

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$State;->getItemCount()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->m(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->o(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$State;->getItemCount()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_4

    .line 26
    .line 27
    if-eqz v2, :cond_4

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-virtual {p0, v1, v3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->q(II)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const/4 v3, -0x1

    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    move v1, v3

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    add-int/lit8 v4, v4, -0x1

    .line 54
    .line 55
    invoke-virtual {p0, v4, v3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->q(II)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    if-nez v4, :cond_3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    :goto_1
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 67
    .line 68
    invoke-virtual {v4, v0}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedEnd(Landroid/view/View;)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 73
    .line 74
    invoke-virtual {v4, v2}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    sub-int/2addr v0, v2

    .line 79
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    sub-int/2addr v3, v1

    .line 84
    add-int/lit8 v3, v3, 0x1

    .line 85
    .line 86
    int-to-float v0, v0

    .line 87
    int-to-float v1, v3

    .line 88
    div-float/2addr v0, v1

    .line 89
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$State;->getItemCount()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    int-to-float p1, p1

    .line 94
    mul-float/2addr v0, p1

    .line 95
    float-to-int p1, v0

    .line 96
    return p1

    .line 97
    :cond_4
    :goto_2
    return v1
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

.method public final computeScrollVectorForPosition(I)Landroid/graphics/PointF;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_1
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-ge p1, v0, :cond_2

    .line 22
    .line 23
    const/4 p1, -0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_2
    const/4 p1, 0x1

    .line 26
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v1, 0x0

    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    new-instance v0, Landroid/graphics/PointF;

    .line 34
    .line 35
    int-to-float p1, p1

    .line 36
    invoke-direct {v0, v1, p1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_3
    new-instance v0, Landroid/graphics/PointF;

    .line 41
    .line 42
    int-to-float p1, p1

    .line 43
    invoke-direct {v0, p1, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 44
    .line 45
    .line 46
    return-object v0
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

.method public final computeVerticalScrollExtent(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->computeScrollExtent(Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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

.method public final computeVerticalScrollOffset(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->computeScrollOffset(Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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

.method public final computeVerticalScrollRange(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->computeScrollRange(Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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

.method public final d(III)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidthMode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->canScrollHorizontally()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {p1, v0, p2, p3, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildMeasureSpec(IIIIZ)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
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

.method public final e(ILandroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

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

.method public final f(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/View;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->j:Landroidx/recyclerview/widget/RecyclerView$Recycler;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$Recycler;->getViewForPosition(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final fixLayoutEndGap(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;Z)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/recyclerview/widget/OrientationHelper;->getStartAfterPadding()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sub-int v0, p1, v0

    .line 18
    .line 19
    if-lez v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v0, p2, p3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->s(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroidx/recyclerview/widget/OrientationHelper;->getEndAfterPadding()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    sub-int/2addr v0, p1

    .line 33
    if-lez v0, :cond_2

    .line 34
    .line 35
    neg-int v0, v0

    .line 36
    invoke-virtual {p0, v0, p2, p3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->s(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    neg-int p2, p2

    .line 41
    :goto_0
    add-int/2addr p1, p2

    .line 42
    if-eqz p4, :cond_1

    .line 43
    .line 44
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 45
    .line 46
    invoke-virtual {p3}, Landroidx/recyclerview/widget/OrientationHelper;->getEndAfterPadding()I

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    sub-int/2addr p3, p1

    .line 51
    if-lez p3, :cond_1

    .line 52
    .line 53
    iget-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 54
    .line 55
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/OrientationHelper;->offsetChildren(I)V

    .line 56
    .line 57
    .line 58
    add-int/2addr p3, p2

    .line 59
    return p3

    .line 60
    :cond_1
    return p2

    .line 61
    :cond_2
    const/4 p1, 0x0

    .line 62
    return p1
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

.method public final fixLayoutStartGap(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;Z)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/recyclerview/widget/OrientationHelper;->getEndAfterPadding()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sub-int/2addr v0, p1

    .line 18
    if-lez v0, :cond_2

    .line 19
    .line 20
    neg-int v0, v0

    .line 21
    invoke-virtual {p0, v0, p2, p3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->s(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroidx/recyclerview/widget/OrientationHelper;->getStartAfterPadding()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    sub-int v0, p1, v0

    .line 33
    .line 34
    if-lez v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0, v0, p2, p3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->s(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    neg-int p2, p2

    .line 41
    :goto_0
    add-int/2addr p1, p2

    .line 42
    if-eqz p4, :cond_1

    .line 43
    .line 44
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 45
    .line 46
    invoke-virtual {p3}, Landroidx/recyclerview/widget/OrientationHelper;->getStartAfterPadding()I

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    sub-int/2addr p1, p3

    .line 51
    if-lez p1, :cond_1

    .line 52
    .line 53
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 54
    .line 55
    neg-int p4, p1

    .line 56
    invoke-virtual {p3, p4}, Landroidx/recyclerview/widget/OrientationHelper;->offsetChildren(I)V

    .line 57
    .line 58
    .line 59
    sub-int/2addr p2, p1

    .line 60
    :cond_1
    return p2

    .line 61
    :cond_2
    const/4 p1, 0x0

    .line 62
    return p1
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

.method public final g(Landroid/view/View;II)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getLeftDecorationWidth(Landroid/view/View;)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getRightDecorationWidth(Landroid/view/View;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    :goto_0
    add-int/2addr p1, p2

    .line 16
    return p1

    .line 17
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getTopDecorationHeight(Landroid/view/View;)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getBottomDecorationHeight(Landroid/view/View;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    goto :goto_0
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

.method public final generateDefaultLayoutParams()Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .locals 2

    .line 1
    new-instance v0, Lo2/g;

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    invoke-direct {v0, v1, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(II)V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput v1, v0, Lo2/g;->b:F

    .line 9
    .line 10
    const/high16 v1, 0x3f800000    # 1.0f

    .line 11
    .line 12
    iput v1, v0, Lo2/g;->c:F

    .line 13
    .line 14
    const/4 v1, -0x1

    .line 15
    iput v1, v0, Lo2/g;->d:I

    .line 16
    .line 17
    const/high16 v1, -0x40800000    # -1.0f

    .line 18
    .line 19
    iput v1, v0, Lo2/g;->e:F

    .line 20
    .line 21
    const v1, 0xffffff

    .line 22
    .line 23
    .line 24
    iput v1, v0, Lo2/g;->h:I

    .line 25
    .line 26
    iput v1, v0, Lo2/g;->i:I

    .line 27
    .line 28
    return-object v0
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

.method public final generateLayoutParams(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .locals 1

    .line 1
    new-instance v0, Lo2/g;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput p1, v0, Lo2/g;->b:F

    .line 8
    .line 9
    const/high16 p1, 0x3f800000    # 1.0f

    .line 10
    .line 11
    iput p1, v0, Lo2/g;->c:F

    .line 12
    .line 13
    const/4 p1, -0x1

    .line 14
    iput p1, v0, Lo2/g;->d:I

    .line 15
    .line 16
    const/high16 p1, -0x40800000    # -1.0f

    .line 17
    .line 18
    iput p1, v0, Lo2/g;->e:F

    .line 19
    .line 20
    const p1, 0xffffff

    .line 21
    .line 22
    .line 23
    iput p1, v0, Lo2/g;->h:I

    .line 24
    .line 25
    iput p1, v0, Lo2/g;->i:I

    .line 26
    .line 27
    return-object v0
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

.method public final getAlignContent()I
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    return v0
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
.end method

.method public final getAlignItems()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->d:I

    .line 2
    .line 3
    return v0
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

.method public final getFlexDirection()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->b:I

    .line 2
    .line 3
    return v0
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

.method public final getFlexItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k:Landroidx/recyclerview/widget/RecyclerView$State;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$State;->getItemCount()I

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

.method public final getFlexLinesInternal()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

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

.method public final getFlexWrap()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->c:I

    .line 2
    .line 3
    return v0
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

.method public final getLargestMainSize()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/high16 v2, -0x80000000

    .line 18
    .line 19
    :goto_0
    if-ge v1, v0, :cond_1

    .line 20
    .line 21
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Lo2/c;

    .line 28
    .line 29
    iget v3, v3, Lo2/c;->e:I

    .line 30
    .line 31
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return v2
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

.method public final getMaxLine()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->e:I

    .line 2
    .line 3
    return v0
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

.method public final getSumOfCrossSize()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Lo2/c;

    .line 18
    .line 19
    iget v3, v3, Lo2/c;->g:I

    .line 20
    .line 21
    add-int/2addr v2, v3

    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return v2
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

.method public final h(III)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getHeight()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getHeightMode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->canScrollVertically()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {p1, v0, p2, p3, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildMeasureSpec(IIIIZ)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
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

.method public final i()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->b:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_1
    :goto_0
    return v1
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

.method public final isAutoMeasureEnabled()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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
.end method

.method public final j(Landroid/view/View;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getTopDecorationHeight(Landroid/view/View;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getBottomDecorationHeight(Landroid/view/View;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    :goto_0
    add-int/2addr p1, v0

    .line 16
    return p1

    .line 17
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getLeftDecorationWidth(Landroid/view/View;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getRightDecorationWidth(Landroid/view/View;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    goto :goto_0
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

.method public final k()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->c:I

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    invoke-static {p0}, Landroidx/recyclerview/widget/OrientationHelper;->createHorizontalHelper(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)Landroidx/recyclerview/widget/OrientationHelper;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 21
    .line 22
    invoke-static {p0}, Landroidx/recyclerview/widget/OrientationHelper;->createVerticalHelper(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)Landroidx/recyclerview/widget/OrientationHelper;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->o:Landroidx/recyclerview/widget/OrientationHelper;

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    invoke-static {p0}, Landroidx/recyclerview/widget/OrientationHelper;->createVerticalHelper(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)Landroidx/recyclerview/widget/OrientationHelper;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 34
    .line 35
    invoke-static {p0}, Landroidx/recyclerview/widget/OrientationHelper;->createHorizontalHelper(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)Landroidx/recyclerview/widget/OrientationHelper;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->o:Landroidx/recyclerview/widget/OrientationHelper;

    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    if-nez v1, :cond_3

    .line 43
    .line 44
    invoke-static {p0}, Landroidx/recyclerview/widget/OrientationHelper;->createVerticalHelper(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)Landroidx/recyclerview/widget/OrientationHelper;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 49
    .line 50
    invoke-static {p0}, Landroidx/recyclerview/widget/OrientationHelper;->createHorizontalHelper(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)Landroidx/recyclerview/widget/OrientationHelper;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->o:Landroidx/recyclerview/widget/OrientationHelper;

    .line 55
    .line 56
    return-void

    .line 57
    :cond_3
    invoke-static {p0}, Landroidx/recyclerview/widget/OrientationHelper;->createHorizontalHelper(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)Landroidx/recyclerview/widget/OrientationHelper;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 62
    .line 63
    invoke-static {p0}, Landroidx/recyclerview/widget/OrientationHelper;->createVerticalHelper(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)Landroidx/recyclerview/widget/OrientationHelper;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->o:Landroidx/recyclerview/widget/OrientationHelper;

    .line 68
    .line 69
    return-void
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final l(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;Lo2/h;)I
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    iget v3, v2, Lo2/h;->f:I

    .line 8
    .line 9
    const/high16 v4, -0x80000000

    .line 10
    .line 11
    if-eq v3, v4, :cond_1

    .line 12
    .line 13
    iget v5, v2, Lo2/h;->a:I

    .line 14
    .line 15
    if-gez v5, :cond_0

    .line 16
    .line 17
    add-int/2addr v3, v5

    .line 18
    iput v3, v2, Lo2/h;->f:I

    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0, v1, v2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->u(Landroidx/recyclerview/widget/RecyclerView$Recycler;Lo2/h;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget v3, v2, Lo2/h;->a:I

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    move v7, v3

    .line 30
    const/4 v8, 0x0

    .line 31
    :goto_0
    if-gtz v7, :cond_3

    .line 32
    .line 33
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 34
    .line 35
    iget-boolean v9, v9, Lo2/h;->b:Z

    .line 36
    .line 37
    if-eqz v9, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move/from16 v20, v3

    .line 41
    .line 42
    goto/16 :goto_e

    .line 43
    .line 44
    :cond_3
    :goto_1
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 45
    .line 46
    iget v10, v2, Lo2/h;->d:I

    .line 47
    .line 48
    if-ltz v10, :cond_2

    .line 49
    .line 50
    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/RecyclerView$State;->getItemCount()I

    .line 51
    .line 52
    .line 53
    move-result v11

    .line 54
    if-ge v10, v11, :cond_2

    .line 55
    .line 56
    iget v10, v2, Lo2/h;->c:I

    .line 57
    .line 58
    if-ltz v10, :cond_2

    .line 59
    .line 60
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    if-ge v10, v9, :cond_2

    .line 65
    .line 66
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 67
    .line 68
    iget v10, v2, Lo2/h;->c:I

    .line 69
    .line 70
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    move-object v12, v9

    .line 75
    check-cast v12, Lo2/c;

    .line 76
    .line 77
    iget v9, v12, Lo2/c;->o:I

    .line 78
    .line 79
    iput v9, v2, Lo2/h;->d:I

    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    const/16 v18, 0x20

    .line 86
    .line 87
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m:Lo2/f;

    .line 88
    .line 89
    const/4 v11, -0x1

    .line 90
    const/4 v14, 0x0

    .line 91
    sget-object v15, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:Landroid/graphics/Rect;

    .line 92
    .line 93
    iget-object v6, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->i:Le0/s3;

    .line 94
    .line 95
    if-eqz v9, :cond_a

    .line 96
    .line 97
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingLeft()I

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingRight()I

    .line 102
    .line 103
    .line 104
    move-result v16

    .line 105
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidth()I

    .line 106
    .line 107
    .line 108
    move-result v17

    .line 109
    iget v4, v2, Lo2/h;->e:I

    .line 110
    .line 111
    iget v13, v2, Lo2/h;->h:I

    .line 112
    .line 113
    if-ne v13, v11, :cond_4

    .line 114
    .line 115
    iget v11, v12, Lo2/c;->g:I

    .line 116
    .line 117
    sub-int/2addr v4, v11

    .line 118
    :cond_4
    iget v11, v2, Lo2/h;->d:I

    .line 119
    .line 120
    int-to-float v9, v9

    .line 121
    sub-int v13, v17, v16

    .line 122
    .line 123
    int-to-float v13, v13

    .line 124
    iget v10, v10, Lo2/f;->d:I

    .line 125
    .line 126
    int-to-float v10, v10

    .line 127
    sub-float/2addr v9, v10

    .line 128
    sub-float/2addr v13, v10

    .line 129
    invoke-static {v14, v14}, Ljava/lang/Math;->max(FF)F

    .line 130
    .line 131
    .line 132
    move-result v17

    .line 133
    iget v10, v12, Lo2/c;->h:I

    .line 134
    .line 135
    move/from16 v20, v3

    .line 136
    .line 137
    move/from16 v21, v4

    .line 138
    .line 139
    move v14, v11

    .line 140
    const/4 v3, 0x0

    .line 141
    :goto_2
    add-int v4, v11, v10

    .line 142
    .line 143
    if-ge v14, v4, :cond_9

    .line 144
    .line 145
    move v4, v11

    .line 146
    invoke-virtual {v0, v14}, Lcom/google/android/flexbox/FlexboxLayoutManager;->f(I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v11

    .line 150
    if-nez v11, :cond_5

    .line 151
    .line 152
    move/from16 v25, v3

    .line 153
    .line 154
    move/from16 v22, v5

    .line 155
    .line 156
    move-object/from16 v19, v6

    .line 157
    .line 158
    move/from16 v24, v10

    .line 159
    .line 160
    move/from16 v23, v14

    .line 161
    .line 162
    move-object/from16 v27, v15

    .line 163
    .line 164
    const/4 v3, 0x1

    .line 165
    move v5, v4

    .line 166
    goto/16 :goto_5

    .line 167
    .line 168
    :cond_5
    move/from16 v16, v4

    .line 169
    .line 170
    iget v4, v2, Lo2/h;->h:I

    .line 171
    .line 172
    move/from16 v22, v5

    .line 173
    .line 174
    const/4 v5, 0x1

    .line 175
    if-ne v4, v5, :cond_6

    .line 176
    .line 177
    invoke-virtual {v0, v11, v15}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->calculateItemDecorationsForChild(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, v11}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->addView(Landroid/view/View;)V

    .line 181
    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_6
    invoke-virtual {v0, v11, v15}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->calculateItemDecorationsForChild(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v11, v3}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->addView(Landroid/view/View;I)V

    .line 188
    .line 189
    .line 190
    add-int/lit8 v3, v3, 0x1

    .line 191
    .line 192
    :goto_3
    iget-object v4, v6, Le0/s3;->f:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v4, [J

    .line 195
    .line 196
    move-object/from16 v19, v6

    .line 197
    .line 198
    aget-wide v5, v4, v14

    .line 199
    .line 200
    long-to-int v4, v5

    .line 201
    shr-long v5, v5, v18

    .line 202
    .line 203
    long-to-int v5, v5

    .line 204
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    check-cast v6, Lo2/g;

    .line 209
    .line 210
    invoke-virtual {v0, v11, v4, v5, v6}, Lcom/google/android/flexbox/FlexboxLayoutManager;->x(Landroid/view/View;IILo2/g;)Z

    .line 211
    .line 212
    .line 213
    move-result v24

    .line 214
    if-eqz v24, :cond_7

    .line 215
    .line 216
    invoke-virtual {v11, v4, v5}, Landroid/view/View;->measure(II)V

    .line 217
    .line 218
    .line 219
    :cond_7
    iget v4, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 220
    .line 221
    invoke-virtual {v0, v11}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getLeftDecorationWidth(Landroid/view/View;)I

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    add-int/2addr v5, v4

    .line 226
    int-to-float v4, v5

    .line 227
    add-float/2addr v9, v4

    .line 228
    iget v4, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 229
    .line 230
    invoke-virtual {v0, v11}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getRightDecorationWidth(Landroid/view/View;)I

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    add-int/2addr v5, v4

    .line 235
    int-to-float v4, v5

    .line 236
    sub-float v4, v13, v4

    .line 237
    .line 238
    invoke-virtual {v0, v11}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getTopDecorationHeight(Landroid/view/View;)I

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    add-int v5, v5, v21

    .line 243
    .line 244
    iget-boolean v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f:Z

    .line 245
    .line 246
    move/from16 v24, v10

    .line 247
    .line 248
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->i:Le0/s3;

    .line 249
    .line 250
    if-eqz v13, :cond_8

    .line 251
    .line 252
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 253
    .line 254
    .line 255
    move-result v13

    .line 256
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 257
    .line 258
    .line 259
    move-result v25

    .line 260
    sub-int v13, v13, v25

    .line 261
    .line 262
    move-object/from16 v25, v15

    .line 263
    .line 264
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 265
    .line 266
    .line 267
    move-result v15

    .line 268
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 269
    .line 270
    .line 271
    move-result v26

    .line 272
    add-int v26, v26, v5

    .line 273
    .line 274
    move/from16 v23, v14

    .line 275
    .line 276
    move-object/from16 v27, v25

    .line 277
    .line 278
    move/from16 v25, v3

    .line 279
    .line 280
    move v14, v5

    .line 281
    move/from16 v5, v16

    .line 282
    .line 283
    move/from16 v16, v26

    .line 284
    .line 285
    const/4 v3, 0x1

    .line 286
    invoke-virtual/range {v10 .. v16}, Le0/s3;->p(Landroid/view/View;Lo2/c;IIII)V

    .line 287
    .line 288
    .line 289
    goto :goto_4

    .line 290
    :cond_8
    move/from16 v25, v3

    .line 291
    .line 292
    move/from16 v23, v14

    .line 293
    .line 294
    move-object/from16 v27, v15

    .line 295
    .line 296
    const/4 v3, 0x1

    .line 297
    move v14, v5

    .line 298
    move/from16 v5, v16

    .line 299
    .line 300
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 301
    .line 302
    .line 303
    move-result v13

    .line 304
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 305
    .line 306
    .line 307
    move-result v15

    .line 308
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 309
    .line 310
    .line 311
    move-result v16

    .line 312
    add-int v15, v16, v15

    .line 313
    .line 314
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 315
    .line 316
    .line 317
    move-result v16

    .line 318
    add-int v16, v16, v14

    .line 319
    .line 320
    invoke-virtual/range {v10 .. v16}, Le0/s3;->p(Landroid/view/View;Lo2/c;IIII)V

    .line 321
    .line 322
    .line 323
    :goto_4
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 324
    .line 325
    .line 326
    move-result v10

    .line 327
    iget v13, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 328
    .line 329
    add-int/2addr v10, v13

    .line 330
    invoke-virtual {v0, v11}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getRightDecorationWidth(Landroid/view/View;)I

    .line 331
    .line 332
    .line 333
    move-result v13

    .line 334
    add-int/2addr v13, v10

    .line 335
    int-to-float v10, v13

    .line 336
    add-float v10, v10, v17

    .line 337
    .line 338
    add-float/2addr v10, v9

    .line 339
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 340
    .line 341
    .line 342
    move-result v9

    .line 343
    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 344
    .line 345
    add-int/2addr v9, v6

    .line 346
    invoke-virtual {v0, v11}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getLeftDecorationWidth(Landroid/view/View;)I

    .line 347
    .line 348
    .line 349
    move-result v6

    .line 350
    add-int/2addr v6, v9

    .line 351
    int-to-float v6, v6

    .line 352
    add-float v6, v6, v17

    .line 353
    .line 354
    sub-float/2addr v4, v6

    .line 355
    move v13, v4

    .line 356
    move v9, v10

    .line 357
    :goto_5
    add-int/lit8 v14, v23, 0x1

    .line 358
    .line 359
    move v11, v5

    .line 360
    move-object/from16 v6, v19

    .line 361
    .line 362
    move/from16 v5, v22

    .line 363
    .line 364
    move/from16 v10, v24

    .line 365
    .line 366
    move/from16 v3, v25

    .line 367
    .line 368
    move-object/from16 v15, v27

    .line 369
    .line 370
    goto/16 :goto_2

    .line 371
    .line 372
    :cond_9
    move/from16 v22, v5

    .line 373
    .line 374
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 375
    .line 376
    iget v3, v3, Lo2/h;->h:I

    .line 377
    .line 378
    iget v4, v2, Lo2/h;->c:I

    .line 379
    .line 380
    add-int/2addr v4, v3

    .line 381
    iput v4, v2, Lo2/h;->c:I

    .line 382
    .line 383
    iget v3, v12, Lo2/c;->g:I

    .line 384
    .line 385
    goto/16 :goto_c

    .line 386
    .line 387
    :cond_a
    move/from16 v20, v3

    .line 388
    .line 389
    move/from16 v22, v5

    .line 390
    .line 391
    move-object/from16 v19, v6

    .line 392
    .line 393
    move-object/from16 v27, v15

    .line 394
    .line 395
    const/4 v3, 0x1

    .line 396
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingTop()I

    .line 397
    .line 398
    .line 399
    move-result v4

    .line 400
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingBottom()I

    .line 401
    .line 402
    .line 403
    move-result v5

    .line 404
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getHeight()I

    .line 405
    .line 406
    .line 407
    move-result v6

    .line 408
    iget v9, v2, Lo2/h;->e:I

    .line 409
    .line 410
    iget v13, v2, Lo2/h;->h:I

    .line 411
    .line 412
    if-ne v13, v11, :cond_b

    .line 413
    .line 414
    iget v11, v12, Lo2/c;->g:I

    .line 415
    .line 416
    sub-int v13, v9, v11

    .line 417
    .line 418
    add-int/2addr v9, v11

    .line 419
    move/from16 v21, v9

    .line 420
    .line 421
    move v9, v13

    .line 422
    goto :goto_6

    .line 423
    :cond_b
    move/from16 v21, v9

    .line 424
    .line 425
    :goto_6
    iget v11, v2, Lo2/h;->d:I

    .line 426
    .line 427
    int-to-float v4, v4

    .line 428
    sub-int/2addr v6, v5

    .line 429
    int-to-float v5, v6

    .line 430
    iget v6, v10, Lo2/f;->d:I

    .line 431
    .line 432
    int-to-float v6, v6

    .line 433
    sub-float/2addr v4, v6

    .line 434
    sub-float/2addr v5, v6

    .line 435
    invoke-static {v14, v14}, Ljava/lang/Math;->max(FF)F

    .line 436
    .line 437
    .line 438
    move-result v6

    .line 439
    iget v10, v12, Lo2/c;->h:I

    .line 440
    .line 441
    move v13, v11

    .line 442
    const/4 v14, 0x0

    .line 443
    :goto_7
    add-int v15, v11, v10

    .line 444
    .line 445
    if-ge v13, v15, :cond_12

    .line 446
    .line 447
    move v15, v11

    .line 448
    invoke-virtual {v0, v13}, Lcom/google/android/flexbox/FlexboxLayoutManager;->f(I)Landroid/view/View;

    .line 449
    .line 450
    .line 451
    move-result-object v11

    .line 452
    if-nez v11, :cond_c

    .line 453
    .line 454
    move/from16 v28, v10

    .line 455
    .line 456
    move/from16 v29, v13

    .line 457
    .line 458
    move-object/from16 v3, v27

    .line 459
    .line 460
    move/from16 v27, v15

    .line 461
    .line 462
    goto/16 :goto_b

    .line 463
    .line 464
    :cond_c
    move/from16 v16, v4

    .line 465
    .line 466
    move-object/from16 v3, v19

    .line 467
    .line 468
    iget-object v4, v3, Le0/s3;->f:Ljava/lang/Object;

    .line 469
    .line 470
    check-cast v4, [J

    .line 471
    .line 472
    aget-wide v3, v4, v13

    .line 473
    .line 474
    move/from16 v17, v5

    .line 475
    .line 476
    long-to-int v5, v3

    .line 477
    shr-long v3, v3, v18

    .line 478
    .line 479
    long-to-int v3, v3

    .line 480
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 481
    .line 482
    .line 483
    move-result-object v4

    .line 484
    check-cast v4, Lo2/g;

    .line 485
    .line 486
    invoke-virtual {v0, v11, v5, v3, v4}, Lcom/google/android/flexbox/FlexboxLayoutManager;->x(Landroid/view/View;IILo2/g;)Z

    .line 487
    .line 488
    .line 489
    move-result v24

    .line 490
    if-eqz v24, :cond_d

    .line 491
    .line 492
    invoke-virtual {v11, v5, v3}, Landroid/view/View;->measure(II)V

    .line 493
    .line 494
    .line 495
    :cond_d
    iget v3, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 496
    .line 497
    invoke-virtual {v0, v11}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getTopDecorationHeight(Landroid/view/View;)I

    .line 498
    .line 499
    .line 500
    move-result v5

    .line 501
    add-int/2addr v5, v3

    .line 502
    int-to-float v3, v5

    .line 503
    add-float v3, v16, v3

    .line 504
    .line 505
    iget v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 506
    .line 507
    invoke-virtual {v0, v11}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getBottomDecorationHeight(Landroid/view/View;)I

    .line 508
    .line 509
    .line 510
    move-result v16

    .line 511
    add-int v5, v16, v5

    .line 512
    .line 513
    int-to-float v5, v5

    .line 514
    sub-float v5, v17, v5

    .line 515
    .line 516
    move/from16 v24, v3

    .line 517
    .line 518
    iget v3, v2, Lo2/h;->h:I

    .line 519
    .line 520
    move/from16 v25, v5

    .line 521
    .line 522
    const/4 v5, 0x1

    .line 523
    if-ne v3, v5, :cond_e

    .line 524
    .line 525
    move-object/from16 v3, v27

    .line 526
    .line 527
    invoke-virtual {v0, v11, v3}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->calculateItemDecorationsForChild(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v0, v11}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->addView(Landroid/view/View;)V

    .line 531
    .line 532
    .line 533
    :goto_8
    move/from16 v23, v14

    .line 534
    .line 535
    goto :goto_9

    .line 536
    :cond_e
    move-object/from16 v3, v27

    .line 537
    .line 538
    invoke-virtual {v0, v11, v3}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->calculateItemDecorationsForChild(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v0, v11, v14}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->addView(Landroid/view/View;I)V

    .line 542
    .line 543
    .line 544
    add-int/lit8 v14, v14, 0x1

    .line 545
    .line 546
    goto :goto_8

    .line 547
    :goto_9
    invoke-virtual {v0, v11}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getLeftDecorationWidth(Landroid/view/View;)I

    .line 548
    .line 549
    .line 550
    move-result v14

    .line 551
    add-int/2addr v14, v9

    .line 552
    invoke-virtual {v0, v11}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getRightDecorationWidth(Landroid/view/View;)I

    .line 553
    .line 554
    .line 555
    move-result v16

    .line 556
    sub-int v16, v21, v16

    .line 557
    .line 558
    move/from16 v17, v13

    .line 559
    .line 560
    iget-boolean v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f:Z

    .line 561
    .line 562
    iget-boolean v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g:Z

    .line 563
    .line 564
    move/from16 v27, v10

    .line 565
    .line 566
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->i:Le0/s3;

    .line 567
    .line 568
    if-eqz v13, :cond_10

    .line 569
    .line 570
    if-eqz v5, :cond_f

    .line 571
    .line 572
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 573
    .line 574
    .line 575
    move-result v5

    .line 576
    sub-int v14, v16, v5

    .line 577
    .line 578
    invoke-static/range {v25 .. v25}, Ljava/lang/Math;->round(F)I

    .line 579
    .line 580
    .line 581
    move-result v5

    .line 582
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 583
    .line 584
    .line 585
    move-result v28

    .line 586
    sub-int v5, v5, v28

    .line 587
    .line 588
    move/from16 v28, v17

    .line 589
    .line 590
    invoke-static/range {v25 .. v25}, Ljava/lang/Math;->round(F)I

    .line 591
    .line 592
    .line 593
    move-result v17

    .line 594
    move/from16 v29, v28

    .line 595
    .line 596
    move/from16 v28, v27

    .line 597
    .line 598
    move/from16 v27, v15

    .line 599
    .line 600
    move v15, v5

    .line 601
    invoke-virtual/range {v10 .. v17}, Le0/s3;->q(Landroid/view/View;Lo2/c;ZIIII)V

    .line 602
    .line 603
    .line 604
    goto :goto_a

    .line 605
    :cond_f
    move/from16 v29, v17

    .line 606
    .line 607
    move/from16 v28, v27

    .line 608
    .line 609
    move/from16 v27, v15

    .line 610
    .line 611
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 612
    .line 613
    .line 614
    move-result v5

    .line 615
    sub-int v14, v16, v5

    .line 616
    .line 617
    invoke-static/range {v24 .. v24}, Ljava/lang/Math;->round(F)I

    .line 618
    .line 619
    .line 620
    move-result v15

    .line 621
    invoke-static/range {v24 .. v24}, Ljava/lang/Math;->round(F)I

    .line 622
    .line 623
    .line 624
    move-result v5

    .line 625
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 626
    .line 627
    .line 628
    move-result v17

    .line 629
    add-int v17, v17, v5

    .line 630
    .line 631
    invoke-virtual/range {v10 .. v17}, Le0/s3;->q(Landroid/view/View;Lo2/c;ZIIII)V

    .line 632
    .line 633
    .line 634
    goto :goto_a

    .line 635
    :cond_10
    move/from16 v29, v17

    .line 636
    .line 637
    move/from16 v28, v27

    .line 638
    .line 639
    move/from16 v27, v15

    .line 640
    .line 641
    if-eqz v5, :cond_11

    .line 642
    .line 643
    invoke-static/range {v25 .. v25}, Ljava/lang/Math;->round(F)I

    .line 644
    .line 645
    .line 646
    move-result v5

    .line 647
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 648
    .line 649
    .line 650
    move-result v15

    .line 651
    sub-int v15, v5, v15

    .line 652
    .line 653
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 654
    .line 655
    .line 656
    move-result v5

    .line 657
    add-int v16, v5, v14

    .line 658
    .line 659
    invoke-static/range {v25 .. v25}, Ljava/lang/Math;->round(F)I

    .line 660
    .line 661
    .line 662
    move-result v17

    .line 663
    invoke-virtual/range {v10 .. v17}, Le0/s3;->q(Landroid/view/View;Lo2/c;ZIIII)V

    .line 664
    .line 665
    .line 666
    goto :goto_a

    .line 667
    :cond_11
    invoke-static/range {v24 .. v24}, Ljava/lang/Math;->round(F)I

    .line 668
    .line 669
    .line 670
    move-result v15

    .line 671
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 672
    .line 673
    .line 674
    move-result v5

    .line 675
    add-int v16, v5, v14

    .line 676
    .line 677
    invoke-static/range {v24 .. v24}, Ljava/lang/Math;->round(F)I

    .line 678
    .line 679
    .line 680
    move-result v5

    .line 681
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 682
    .line 683
    .line 684
    move-result v17

    .line 685
    add-int v17, v17, v5

    .line 686
    .line 687
    invoke-virtual/range {v10 .. v17}, Le0/s3;->q(Landroid/view/View;Lo2/c;ZIIII)V

    .line 688
    .line 689
    .line 690
    :goto_a
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 691
    .line 692
    .line 693
    move-result v5

    .line 694
    iget v10, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 695
    .line 696
    add-int/2addr v5, v10

    .line 697
    invoke-virtual {v0, v11}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getBottomDecorationHeight(Landroid/view/View;)I

    .line 698
    .line 699
    .line 700
    move-result v10

    .line 701
    add-int/2addr v10, v5

    .line 702
    int-to-float v5, v10

    .line 703
    add-float/2addr v5, v6

    .line 704
    add-float v5, v5, v24

    .line 705
    .line 706
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 707
    .line 708
    .line 709
    move-result v10

    .line 710
    iget v4, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 711
    .line 712
    add-int/2addr v10, v4

    .line 713
    invoke-virtual {v0, v11}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getTopDecorationHeight(Landroid/view/View;)I

    .line 714
    .line 715
    .line 716
    move-result v4

    .line 717
    add-int/2addr v4, v10

    .line 718
    int-to-float v4, v4

    .line 719
    add-float/2addr v4, v6

    .line 720
    sub-float v4, v25, v4

    .line 721
    .line 722
    move v14, v5

    .line 723
    move v5, v4

    .line 724
    move v4, v14

    .line 725
    move/from16 v14, v23

    .line 726
    .line 727
    :goto_b
    add-int/lit8 v13, v29, 0x1

    .line 728
    .line 729
    move/from16 v11, v27

    .line 730
    .line 731
    move/from16 v10, v28

    .line 732
    .line 733
    move-object/from16 v27, v3

    .line 734
    .line 735
    const/4 v3, 0x1

    .line 736
    goto/16 :goto_7

    .line 737
    .line 738
    :cond_12
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 739
    .line 740
    iget v3, v3, Lo2/h;->h:I

    .line 741
    .line 742
    iget v4, v2, Lo2/h;->c:I

    .line 743
    .line 744
    add-int/2addr v4, v3

    .line 745
    iput v4, v2, Lo2/h;->c:I

    .line 746
    .line 747
    iget v3, v12, Lo2/c;->g:I

    .line 748
    .line 749
    :goto_c
    add-int/2addr v8, v3

    .line 750
    if-nez v22, :cond_13

    .line 751
    .line 752
    iget-boolean v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f:Z

    .line 753
    .line 754
    if-eqz v3, :cond_13

    .line 755
    .line 756
    iget v3, v12, Lo2/c;->g:I

    .line 757
    .line 758
    iget v4, v2, Lo2/h;->h:I

    .line 759
    .line 760
    mul-int/2addr v3, v4

    .line 761
    iget v4, v2, Lo2/h;->e:I

    .line 762
    .line 763
    sub-int/2addr v4, v3

    .line 764
    iput v4, v2, Lo2/h;->e:I

    .line 765
    .line 766
    goto :goto_d

    .line 767
    :cond_13
    iget v3, v12, Lo2/c;->g:I

    .line 768
    .line 769
    iget v4, v2, Lo2/h;->h:I

    .line 770
    .line 771
    mul-int/2addr v3, v4

    .line 772
    iget v4, v2, Lo2/h;->e:I

    .line 773
    .line 774
    add-int/2addr v4, v3

    .line 775
    iput v4, v2, Lo2/h;->e:I

    .line 776
    .line 777
    :goto_d
    iget v3, v12, Lo2/c;->g:I

    .line 778
    .line 779
    sub-int/2addr v7, v3

    .line 780
    move/from16 v3, v20

    .line 781
    .line 782
    move/from16 v5, v22

    .line 783
    .line 784
    const/high16 v4, -0x80000000

    .line 785
    .line 786
    goto/16 :goto_0

    .line 787
    .line 788
    :goto_e
    iget v3, v2, Lo2/h;->a:I

    .line 789
    .line 790
    sub-int/2addr v3, v8

    .line 791
    iput v3, v2, Lo2/h;->a:I

    .line 792
    .line 793
    iget v4, v2, Lo2/h;->f:I

    .line 794
    .line 795
    const/high16 v5, -0x80000000

    .line 796
    .line 797
    if-eq v4, v5, :cond_15

    .line 798
    .line 799
    add-int/2addr v4, v8

    .line 800
    iput v4, v2, Lo2/h;->f:I

    .line 801
    .line 802
    if-gez v3, :cond_14

    .line 803
    .line 804
    add-int/2addr v4, v3

    .line 805
    iput v4, v2, Lo2/h;->f:I

    .line 806
    .line 807
    :cond_14
    invoke-virtual {v0, v1, v2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->u(Landroidx/recyclerview/widget/RecyclerView$Recycler;Lo2/h;)V

    .line 808
    .line 809
    .line 810
    :cond_15
    iget v1, v2, Lo2/h;->a:I

    .line 811
    .line 812
    sub-int v3, v20, v1

    .line 813
    .line 814
    return v3
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
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
.end method

.method public final m(I)Landroid/view/View;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-virtual {p0, v0, v1, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->r(III)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->i:Le0/s3;

    .line 18
    .line 19
    iget-object v1, v1, Le0/s3;->e:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, [I

    .line 22
    .line 23
    aget v0, v1, v0

    .line 24
    .line 25
    const/4 v1, -0x1

    .line 26
    if-ne v0, v1, :cond_1

    .line 27
    .line 28
    :goto_0
    const/4 p1, 0x0

    .line 29
    return-object p1

    .line 30
    :cond_1
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lo2/c;

    .line 37
    .line 38
    invoke-virtual {p0, p1, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->n(Landroid/view/View;Lo2/c;)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1
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

.method public final n(Landroid/view/View;Lo2/c;)Landroid/view/View;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget p2, p2, Lo2/c;->h:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    :goto_0
    if-ge v1, p2, :cond_3

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/16 v4, 0x8

    .line 21
    .line 22
    if-ne v3, v4, :cond_0

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_0
    iget-boolean v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f:Z

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 32
    .line 33
    invoke-virtual {v3, p1}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedEnd(Landroid/view/View;)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 38
    .line 39
    invoke-virtual {v4, v2}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedEnd(Landroid/view/View;)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-ge v3, v4, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 47
    .line 48
    invoke-virtual {v3, p1}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 53
    .line 54
    invoke-virtual {v4, v2}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-le v3, v4, :cond_2

    .line 59
    .line 60
    :goto_1
    move-object p1, v2

    .line 61
    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    return-object p1
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

.method public final o(I)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    invoke-virtual {p0, v0, v1, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->r(III)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    return-object p1

    .line 16
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->i:Le0/s3;

    .line 21
    .line 22
    iget-object v1, v1, Le0/s3;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, [I

    .line 25
    .line 26
    aget v0, v1, v0

    .line 27
    .line 28
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lo2/c;

    .line 35
    .line 36
    invoke-virtual {p0, p1, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->p(Landroid/view/View;Lo2/c;)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1
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

.method public final onAdapterChanged(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroidx/recyclerview/widget/RecyclerView$Adapter;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->removeAllViews()V

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

.method public final onAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->onAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroid/view/View;

    .line 9
    .line 10
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Landroid/view/View;

    .line 11
    .line 12
    return-void
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

.method public final onItemsAdded(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->onItemsAdded(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->y(I)V

    .line 5
    .line 6
    .line 7
    return-void
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

.method public final onItemsMoved(Landroidx/recyclerview/widget/RecyclerView;III)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->onItemsMoved(Landroidx/recyclerview/widget/RecyclerView;III)V

    .line 2
    .line 3
    .line 4
    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->y(I)V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public final onItemsRemoved(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->onItemsRemoved(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->y(I)V

    .line 5
    .line 6
    .line 7
    return-void
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

.method public final onItemsUpdated(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    .line 8
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->onItemsUpdated(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 9
    invoke-virtual {p0, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->y(I)V

    return-void
.end method

.method public final onItemsUpdated(Landroidx/recyclerview/widget/RecyclerView;IILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->onItemsUpdated(Landroidx/recyclerview/widget/RecyclerView;IILjava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->y(I)V

    .line 5
    .line 6
    .line 7
    return-void
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

.method public final onLayoutChildren(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iput-object v1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->j:Landroidx/recyclerview/widget/RecyclerView$Recycler;

    .line 8
    .line 9
    iput-object v2, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k:Landroidx/recyclerview/widget/RecyclerView$State;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$State;->getItemCount()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$State;->isPreLayout()Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    goto/16 :goto_1c

    .line 24
    .line 25
    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getLayoutDirection()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    iget v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->b:I

    .line 30
    .line 31
    const/4 v6, 0x1

    .line 32
    const/4 v7, 0x0

    .line 33
    const/4 v8, 0x2

    .line 34
    if-eqz v5, :cond_a

    .line 35
    .line 36
    if-eq v5, v6, :cond_7

    .line 37
    .line 38
    if-eq v5, v8, :cond_4

    .line 39
    .line 40
    const/4 v9, 0x3

    .line 41
    if-eq v5, v9, :cond_1

    .line 42
    .line 43
    iput-boolean v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f:Z

    .line 44
    .line 45
    iput-boolean v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g:Z

    .line 46
    .line 47
    goto :goto_6

    .line 48
    :cond_1
    if-ne v4, v6, :cond_2

    .line 49
    .line 50
    move v4, v6

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    move v4, v7

    .line 53
    :goto_0
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f:Z

    .line 54
    .line 55
    iget v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->c:I

    .line 56
    .line 57
    if-ne v5, v8, :cond_3

    .line 58
    .line 59
    xor-int/2addr v4, v6

    .line 60
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f:Z

    .line 61
    .line 62
    :cond_3
    iput-boolean v6, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g:Z

    .line 63
    .line 64
    goto :goto_6

    .line 65
    :cond_4
    if-ne v4, v6, :cond_5

    .line 66
    .line 67
    move v4, v6

    .line 68
    goto :goto_1

    .line 69
    :cond_5
    move v4, v7

    .line 70
    :goto_1
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f:Z

    .line 71
    .line 72
    iget v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->c:I

    .line 73
    .line 74
    if-ne v5, v8, :cond_6

    .line 75
    .line 76
    xor-int/2addr v4, v6

    .line 77
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f:Z

    .line 78
    .line 79
    :cond_6
    iput-boolean v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g:Z

    .line 80
    .line 81
    goto :goto_6

    .line 82
    :cond_7
    if-eq v4, v6, :cond_8

    .line 83
    .line 84
    move v4, v6

    .line 85
    goto :goto_2

    .line 86
    :cond_8
    move v4, v7

    .line 87
    :goto_2
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f:Z

    .line 88
    .line 89
    iget v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->c:I

    .line 90
    .line 91
    if-ne v4, v8, :cond_9

    .line 92
    .line 93
    move v4, v6

    .line 94
    goto :goto_3

    .line 95
    :cond_9
    move v4, v7

    .line 96
    :goto_3
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g:Z

    .line 97
    .line 98
    goto :goto_6

    .line 99
    :cond_a
    if-ne v4, v6, :cond_b

    .line 100
    .line 101
    move v4, v6

    .line 102
    goto :goto_4

    .line 103
    :cond_b
    move v4, v7

    .line 104
    :goto_4
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f:Z

    .line 105
    .line 106
    iget v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->c:I

    .line 107
    .line 108
    if-ne v4, v8, :cond_c

    .line 109
    .line 110
    move v4, v6

    .line 111
    goto :goto_5

    .line 112
    :cond_c
    move v4, v7

    .line 113
    :goto_5
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g:Z

    .line 114
    .line 115
    :goto_6
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()V

    .line 116
    .line 117
    .line 118
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 119
    .line 120
    if-nez v4, :cond_d

    .line 121
    .line 122
    new-instance v4, Lo2/h;

    .line 123
    .line 124
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 125
    .line 126
    .line 127
    iput v6, v4, Lo2/h;->h:I

    .line 128
    .line 129
    iput-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 130
    .line 131
    :cond_d
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->i:Le0/s3;

    .line 132
    .line 133
    invoke-virtual {v4, v3}, Le0/s3;->k(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4, v3}, Le0/s3;->l(I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4, v3}, Le0/s3;->j(I)V

    .line 140
    .line 141
    .line 142
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 143
    .line 144
    iput-boolean v7, v5, Lo2/h;->i:Z

    .line 145
    .line 146
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->p:Lo2/i;

    .line 147
    .line 148
    if-eqz v5, :cond_e

    .line 149
    .line 150
    iget v8, v5, Lo2/i;->b:I

    .line 151
    .line 152
    if-ltz v8, :cond_e

    .line 153
    .line 154
    if-ge v8, v3, :cond_e

    .line 155
    .line 156
    iput v8, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:I

    .line 157
    .line 158
    :cond_e
    iget-object v8, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m:Lo2/f;

    .line 159
    .line 160
    iget-boolean v9, v8, Lo2/f;->f:Z

    .line 161
    .line 162
    const/high16 v10, -0x80000000

    .line 163
    .line 164
    const/4 v11, -0x1

    .line 165
    if-eqz v9, :cond_f

    .line 166
    .line 167
    iget v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:I

    .line 168
    .line 169
    if-ne v9, v11, :cond_f

    .line 170
    .line 171
    if-eqz v5, :cond_2b

    .line 172
    .line 173
    :cond_f
    invoke-static {v8}, Lo2/f;->b(Lo2/f;)V

    .line 174
    .line 175
    .line 176
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->p:Lo2/i;

    .line 177
    .line 178
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$State;->isPreLayout()Z

    .line 179
    .line 180
    .line 181
    move-result v9

    .line 182
    if-nez v9, :cond_1d

    .line 183
    .line 184
    iget v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:I

    .line 185
    .line 186
    if-ne v9, v11, :cond_10

    .line 187
    .line 188
    goto/16 :goto_a

    .line 189
    .line 190
    :cond_10
    if-ltz v9, :cond_1c

    .line 191
    .line 192
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$State;->getItemCount()I

    .line 193
    .line 194
    .line 195
    move-result v12

    .line 196
    if-lt v9, v12, :cond_11

    .line 197
    .line 198
    goto/16 :goto_9

    .line 199
    .line 200
    :cond_11
    iget v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:I

    .line 201
    .line 202
    iput v9, v8, Lo2/f;->a:I

    .line 203
    .line 204
    iget-object v12, v4, Le0/s3;->e:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v12, [I

    .line 207
    .line 208
    aget v9, v12, v9

    .line 209
    .line 210
    iput v9, v8, Lo2/f;->b:I

    .line 211
    .line 212
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->p:Lo2/i;

    .line 213
    .line 214
    if-eqz v9, :cond_12

    .line 215
    .line 216
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$State;->getItemCount()I

    .line 217
    .line 218
    .line 219
    move-result v12

    .line 220
    iget v9, v9, Lo2/i;->b:I

    .line 221
    .line 222
    if-ltz v9, :cond_12

    .line 223
    .line 224
    if-ge v9, v12, :cond_12

    .line 225
    .line 226
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 227
    .line 228
    invoke-virtual {v9}, Landroidx/recyclerview/widget/OrientationHelper;->getStartAfterPadding()I

    .line 229
    .line 230
    .line 231
    move-result v9

    .line 232
    iget v5, v5, Lo2/i;->c:I

    .line 233
    .line 234
    add-int/2addr v9, v5

    .line 235
    iput v9, v8, Lo2/f;->c:I

    .line 236
    .line 237
    iput-boolean v6, v8, Lo2/f;->g:Z

    .line 238
    .line 239
    iput v11, v8, Lo2/f;->b:I

    .line 240
    .line 241
    goto/16 :goto_12

    .line 242
    .line 243
    :cond_12
    iget v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r:I

    .line 244
    .line 245
    if-ne v5, v10, :cond_1a

    .line 246
    .line 247
    iget v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:I

    .line 248
    .line 249
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->findViewByPosition(I)Landroid/view/View;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    if-eqz v5, :cond_17

    .line 254
    .line 255
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 256
    .line 257
    invoke-virtual {v9, v5}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedMeasurement(Landroid/view/View;)I

    .line 258
    .line 259
    .line 260
    move-result v9

    .line 261
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 262
    .line 263
    invoke-virtual {v12}, Landroidx/recyclerview/widget/OrientationHelper;->getTotalSpace()I

    .line 264
    .line 265
    .line 266
    move-result v12

    .line 267
    if-le v9, v12, :cond_13

    .line 268
    .line 269
    invoke-static {v8}, Lo2/f;->a(Lo2/f;)V

    .line 270
    .line 271
    .line 272
    goto/16 :goto_12

    .line 273
    .line 274
    :cond_13
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 275
    .line 276
    invoke-virtual {v9, v5}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    .line 277
    .line 278
    .line 279
    move-result v9

    .line 280
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 281
    .line 282
    invoke-virtual {v12}, Landroidx/recyclerview/widget/OrientationHelper;->getStartAfterPadding()I

    .line 283
    .line 284
    .line 285
    move-result v12

    .line 286
    sub-int/2addr v9, v12

    .line 287
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 288
    .line 289
    if-gez v9, :cond_14

    .line 290
    .line 291
    invoke-virtual {v12}, Landroidx/recyclerview/widget/OrientationHelper;->getStartAfterPadding()I

    .line 292
    .line 293
    .line 294
    move-result v5

    .line 295
    iput v5, v8, Lo2/f;->c:I

    .line 296
    .line 297
    iput-boolean v7, v8, Lo2/f;->e:Z

    .line 298
    .line 299
    goto/16 :goto_12

    .line 300
    .line 301
    :cond_14
    invoke-virtual {v12}, Landroidx/recyclerview/widget/OrientationHelper;->getEndAfterPadding()I

    .line 302
    .line 303
    .line 304
    move-result v9

    .line 305
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 306
    .line 307
    invoke-virtual {v12, v5}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedEnd(Landroid/view/View;)I

    .line 308
    .line 309
    .line 310
    move-result v12

    .line 311
    sub-int/2addr v9, v12

    .line 312
    if-gez v9, :cond_15

    .line 313
    .line 314
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 315
    .line 316
    invoke-virtual {v5}, Landroidx/recyclerview/widget/OrientationHelper;->getEndAfterPadding()I

    .line 317
    .line 318
    .line 319
    move-result v5

    .line 320
    iput v5, v8, Lo2/f;->c:I

    .line 321
    .line 322
    iput-boolean v6, v8, Lo2/f;->e:Z

    .line 323
    .line 324
    goto/16 :goto_12

    .line 325
    .line 326
    :cond_15
    iget-boolean v9, v8, Lo2/f;->e:Z

    .line 327
    .line 328
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 329
    .line 330
    if-eqz v9, :cond_16

    .line 331
    .line 332
    invoke-virtual {v12, v5}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedEnd(Landroid/view/View;)I

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 337
    .line 338
    invoke-virtual {v9}, Landroidx/recyclerview/widget/OrientationHelper;->getTotalSpaceChange()I

    .line 339
    .line 340
    .line 341
    move-result v9

    .line 342
    add-int/2addr v9, v5

    .line 343
    goto :goto_7

    .line 344
    :cond_16
    invoke-virtual {v12, v5}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    .line 345
    .line 346
    .line 347
    move-result v9

    .line 348
    :goto_7
    iput v9, v8, Lo2/f;->c:I

    .line 349
    .line 350
    goto/16 :goto_12

    .line 351
    .line 352
    :cond_17
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 353
    .line 354
    .line 355
    move-result v5

    .line 356
    if-lez v5, :cond_19

    .line 357
    .line 358
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 359
    .line 360
    .line 361
    move-result-object v5

    .line 362
    if-eqz v5, :cond_19

    .line 363
    .line 364
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 365
    .line 366
    .line 367
    move-result v5

    .line 368
    iget v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:I

    .line 369
    .line 370
    if-ge v9, v5, :cond_18

    .line 371
    .line 372
    move v5, v6

    .line 373
    goto :goto_8

    .line 374
    :cond_18
    move v5, v7

    .line 375
    :goto_8
    iput-boolean v5, v8, Lo2/f;->e:Z

    .line 376
    .line 377
    :cond_19
    invoke-static {v8}, Lo2/f;->a(Lo2/f;)V

    .line 378
    .line 379
    .line 380
    goto/16 :goto_12

    .line 381
    .line 382
    :cond_1a
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 383
    .line 384
    .line 385
    move-result v5

    .line 386
    if-nez v5, :cond_1b

    .line 387
    .line 388
    iget-boolean v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f:Z

    .line 389
    .line 390
    if-eqz v5, :cond_1b

    .line 391
    .line 392
    iget v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r:I

    .line 393
    .line 394
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 395
    .line 396
    invoke-virtual {v9}, Landroidx/recyclerview/widget/OrientationHelper;->getEndPadding()I

    .line 397
    .line 398
    .line 399
    move-result v9

    .line 400
    sub-int/2addr v5, v9

    .line 401
    iput v5, v8, Lo2/f;->c:I

    .line 402
    .line 403
    goto/16 :goto_12

    .line 404
    .line 405
    :cond_1b
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 406
    .line 407
    invoke-virtual {v5}, Landroidx/recyclerview/widget/OrientationHelper;->getStartAfterPadding()I

    .line 408
    .line 409
    .line 410
    move-result v5

    .line 411
    iget v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r:I

    .line 412
    .line 413
    add-int/2addr v5, v9

    .line 414
    iput v5, v8, Lo2/f;->c:I

    .line 415
    .line 416
    goto/16 :goto_12

    .line 417
    .line 418
    :cond_1c
    :goto_9
    iput v11, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:I

    .line 419
    .line 420
    iput v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r:I

    .line 421
    .line 422
    :cond_1d
    :goto_a
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 423
    .line 424
    .line 425
    move-result v5

    .line 426
    if-nez v5, :cond_1e

    .line 427
    .line 428
    goto/16 :goto_11

    .line 429
    .line 430
    :cond_1e
    iget-boolean v5, v8, Lo2/f;->e:Z

    .line 431
    .line 432
    if-eqz v5, :cond_1f

    .line 433
    .line 434
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$State;->getItemCount()I

    .line 435
    .line 436
    .line 437
    move-result v5

    .line 438
    invoke-virtual {v0, v5}, Lcom/google/android/flexbox/FlexboxLayoutManager;->o(I)Landroid/view/View;

    .line 439
    .line 440
    .line 441
    move-result-object v5

    .line 442
    goto :goto_b

    .line 443
    :cond_1f
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$State;->getItemCount()I

    .line 444
    .line 445
    .line 446
    move-result v5

    .line 447
    invoke-virtual {v0, v5}, Lcom/google/android/flexbox/FlexboxLayoutManager;->m(I)Landroid/view/View;

    .line 448
    .line 449
    .line 450
    move-result-object v5

    .line 451
    :goto_b
    if-eqz v5, :cond_29

    .line 452
    .line 453
    iget-object v9, v8, Lo2/f;->h:Lcom/google/android/flexbox/FlexboxLayoutManager;

    .line 454
    .line 455
    iget v12, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->c:I

    .line 456
    .line 457
    if-nez v12, :cond_20

    .line 458
    .line 459
    iget-object v12, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->o:Landroidx/recyclerview/widget/OrientationHelper;

    .line 460
    .line 461
    goto :goto_c

    .line 462
    :cond_20
    iget-object v12, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 463
    .line 464
    :goto_c
    invoke-virtual {v9}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 465
    .line 466
    .line 467
    move-result v13

    .line 468
    if-nez v13, :cond_22

    .line 469
    .line 470
    iget-boolean v13, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->f:Z

    .line 471
    .line 472
    if-eqz v13, :cond_22

    .line 473
    .line 474
    iget-boolean v13, v8, Lo2/f;->e:Z

    .line 475
    .line 476
    if-eqz v13, :cond_21

    .line 477
    .line 478
    invoke-virtual {v12, v5}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    .line 479
    .line 480
    .line 481
    move-result v13

    .line 482
    invoke-virtual {v12}, Landroidx/recyclerview/widget/OrientationHelper;->getTotalSpaceChange()I

    .line 483
    .line 484
    .line 485
    move-result v12

    .line 486
    add-int/2addr v12, v13

    .line 487
    iput v12, v8, Lo2/f;->c:I

    .line 488
    .line 489
    goto :goto_d

    .line 490
    :cond_21
    invoke-virtual {v12, v5}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedEnd(Landroid/view/View;)I

    .line 491
    .line 492
    .line 493
    move-result v12

    .line 494
    iput v12, v8, Lo2/f;->c:I

    .line 495
    .line 496
    goto :goto_d

    .line 497
    :cond_22
    iget-boolean v13, v8, Lo2/f;->e:Z

    .line 498
    .line 499
    if-eqz v13, :cond_23

    .line 500
    .line 501
    invoke-virtual {v12, v5}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedEnd(Landroid/view/View;)I

    .line 502
    .line 503
    .line 504
    move-result v13

    .line 505
    invoke-virtual {v12}, Landroidx/recyclerview/widget/OrientationHelper;->getTotalSpaceChange()I

    .line 506
    .line 507
    .line 508
    move-result v12

    .line 509
    add-int/2addr v12, v13

    .line 510
    iput v12, v8, Lo2/f;->c:I

    .line 511
    .line 512
    goto :goto_d

    .line 513
    :cond_23
    invoke-virtual {v12, v5}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    .line 514
    .line 515
    .line 516
    move-result v12

    .line 517
    iput v12, v8, Lo2/f;->c:I

    .line 518
    .line 519
    :goto_d
    invoke-virtual {v9, v5}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 520
    .line 521
    .line 522
    move-result v12

    .line 523
    iput v12, v8, Lo2/f;->a:I

    .line 524
    .line 525
    iput-boolean v7, v8, Lo2/f;->g:Z

    .line 526
    .line 527
    iget-object v13, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->i:Le0/s3;

    .line 528
    .line 529
    iget-object v13, v13, Le0/s3;->e:Ljava/lang/Object;

    .line 530
    .line 531
    check-cast v13, [I

    .line 532
    .line 533
    if-eq v12, v11, :cond_24

    .line 534
    .line 535
    goto :goto_e

    .line 536
    :cond_24
    move v12, v7

    .line 537
    :goto_e
    aget v12, v13, v12

    .line 538
    .line 539
    if-eq v12, v11, :cond_25

    .line 540
    .line 541
    goto :goto_f

    .line 542
    :cond_25
    move v12, v7

    .line 543
    :goto_f
    iput v12, v8, Lo2/f;->b:I

    .line 544
    .line 545
    iget-object v12, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 546
    .line 547
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 548
    .line 549
    .line 550
    move-result v12

    .line 551
    iget v13, v8, Lo2/f;->b:I

    .line 552
    .line 553
    if-le v12, v13, :cond_26

    .line 554
    .line 555
    iget-object v9, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 556
    .line 557
    invoke-interface {v9, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v9

    .line 561
    check-cast v9, Lo2/c;

    .line 562
    .line 563
    iget v9, v9, Lo2/c;->o:I

    .line 564
    .line 565
    iput v9, v8, Lo2/f;->a:I

    .line 566
    .line 567
    :cond_26
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$State;->isPreLayout()Z

    .line 568
    .line 569
    .line 570
    move-result v9

    .line 571
    if-nez v9, :cond_2a

    .line 572
    .line 573
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->supportsPredictiveItemAnimations()Z

    .line 574
    .line 575
    .line 576
    move-result v9

    .line 577
    if-eqz v9, :cond_2a

    .line 578
    .line 579
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 580
    .line 581
    invoke-virtual {v9, v5}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    .line 582
    .line 583
    .line 584
    move-result v9

    .line 585
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 586
    .line 587
    invoke-virtual {v12}, Landroidx/recyclerview/widget/OrientationHelper;->getEndAfterPadding()I

    .line 588
    .line 589
    .line 590
    move-result v12

    .line 591
    if-ge v9, v12, :cond_27

    .line 592
    .line 593
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 594
    .line 595
    invoke-virtual {v9, v5}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedEnd(Landroid/view/View;)I

    .line 596
    .line 597
    .line 598
    move-result v5

    .line 599
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 600
    .line 601
    invoke-virtual {v9}, Landroidx/recyclerview/widget/OrientationHelper;->getStartAfterPadding()I

    .line 602
    .line 603
    .line 604
    move-result v9

    .line 605
    if-ge v5, v9, :cond_2a

    .line 606
    .line 607
    :cond_27
    iget-boolean v5, v8, Lo2/f;->e:Z

    .line 608
    .line 609
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 610
    .line 611
    if-eqz v5, :cond_28

    .line 612
    .line 613
    invoke-virtual {v9}, Landroidx/recyclerview/widget/OrientationHelper;->getEndAfterPadding()I

    .line 614
    .line 615
    .line 616
    move-result v5

    .line 617
    goto :goto_10

    .line 618
    :cond_28
    invoke-virtual {v9}, Landroidx/recyclerview/widget/OrientationHelper;->getStartAfterPadding()I

    .line 619
    .line 620
    .line 621
    move-result v5

    .line 622
    :goto_10
    iput v5, v8, Lo2/f;->c:I

    .line 623
    .line 624
    goto :goto_12

    .line 625
    :cond_29
    :goto_11
    invoke-static {v8}, Lo2/f;->a(Lo2/f;)V

    .line 626
    .line 627
    .line 628
    iput v7, v8, Lo2/f;->a:I

    .line 629
    .line 630
    iput v7, v8, Lo2/f;->b:I

    .line 631
    .line 632
    :cond_2a
    :goto_12
    iput-boolean v6, v8, Lo2/f;->f:Z

    .line 633
    .line 634
    :cond_2b
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->detachAndScrapAttachedViews(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 635
    .line 636
    .line 637
    iget-boolean v5, v8, Lo2/f;->e:Z

    .line 638
    .line 639
    if-eqz v5, :cond_2c

    .line 640
    .line 641
    invoke-virtual {v0, v8, v7, v6}, Lcom/google/android/flexbox/FlexboxLayoutManager;->A(Lo2/f;ZZ)V

    .line 642
    .line 643
    .line 644
    goto :goto_13

    .line 645
    :cond_2c
    invoke-virtual {v0, v8, v7, v6}, Lcom/google/android/flexbox/FlexboxLayoutManager;->z(Lo2/f;ZZ)V

    .line 646
    .line 647
    .line 648
    :goto_13
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidth()I

    .line 649
    .line 650
    .line 651
    move-result v5

    .line 652
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidthMode()I

    .line 653
    .line 654
    .line 655
    move-result v9

    .line 656
    invoke-static {v5, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 657
    .line 658
    .line 659
    move-result v14

    .line 660
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getHeight()I

    .line 661
    .line 662
    .line 663
    move-result v5

    .line 664
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getHeightMode()I

    .line 665
    .line 666
    .line 667
    move-result v9

    .line 668
    invoke-static {v5, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 669
    .line 670
    .line 671
    move-result v15

    .line 672
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidth()I

    .line 673
    .line 674
    .line 675
    move-result v5

    .line 676
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getHeight()I

    .line 677
    .line 678
    .line 679
    move-result v9

    .line 680
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 681
    .line 682
    .line 683
    move-result v12

    .line 684
    iget-object v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Landroid/content/Context;

    .line 685
    .line 686
    if-eqz v12, :cond_2f

    .line 687
    .line 688
    iget v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->s:I

    .line 689
    .line 690
    if-eq v12, v10, :cond_2d

    .line 691
    .line 692
    if-eq v12, v5, :cond_2d

    .line 693
    .line 694
    move v10, v6

    .line 695
    goto :goto_14

    .line 696
    :cond_2d
    move v10, v7

    .line 697
    :goto_14
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 698
    .line 699
    iget-boolean v6, v12, Lo2/h;->b:Z

    .line 700
    .line 701
    if-eqz v6, :cond_2e

    .line 702
    .line 703
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 704
    .line 705
    .line 706
    move-result-object v6

    .line 707
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 708
    .line 709
    .line 710
    move-result-object v6

    .line 711
    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 712
    .line 713
    goto :goto_15

    .line 714
    :cond_2e
    iget v6, v12, Lo2/h;->a:I

    .line 715
    .line 716
    :goto_15
    move/from16 v16, v6

    .line 717
    .line 718
    goto :goto_17

    .line 719
    :cond_2f
    iget v6, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:I

    .line 720
    .line 721
    if-eq v6, v10, :cond_30

    .line 722
    .line 723
    if-eq v6, v9, :cond_30

    .line 724
    .line 725
    const/4 v10, 0x1

    .line 726
    goto :goto_16

    .line 727
    :cond_30
    move v10, v7

    .line 728
    :goto_16
    iget-object v6, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 729
    .line 730
    iget-boolean v12, v6, Lo2/h;->b:Z

    .line 731
    .line 732
    if-eqz v12, :cond_31

    .line 733
    .line 734
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 735
    .line 736
    .line 737
    move-result-object v6

    .line 738
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 739
    .line 740
    .line 741
    move-result-object v6

    .line 742
    iget v6, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 743
    .line 744
    goto :goto_15

    .line 745
    :cond_31
    iget v6, v6, Lo2/h;->a:I

    .line 746
    .line 747
    goto :goto_15

    .line 748
    :goto_17
    iput v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->s:I

    .line 749
    .line 750
    iput v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:I

    .line 751
    .line 752
    iget v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:I

    .line 753
    .line 754
    const/4 v6, 0x0

    .line 755
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->y:Lj/i;

    .line 756
    .line 757
    if-ne v5, v11, :cond_35

    .line 758
    .line 759
    iget v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:I

    .line 760
    .line 761
    if-ne v12, v11, :cond_32

    .line 762
    .line 763
    if-eqz v10, :cond_35

    .line 764
    .line 765
    :cond_32
    iget-boolean v3, v8, Lo2/f;->e:Z

    .line 766
    .line 767
    if-eqz v3, :cond_33

    .line 768
    .line 769
    goto/16 :goto_1a

    .line 770
    .line 771
    :cond_33
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 772
    .line 773
    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 774
    .line 775
    .line 776
    iput-object v6, v9, Lj/i;->c:Ljava/lang/Object;

    .line 777
    .line 778
    iput v7, v9, Lj/i;->b:I

    .line 779
    .line 780
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 781
    .line 782
    .line 783
    move-result v3

    .line 784
    iget v5, v8, Lo2/f;->a:I

    .line 785
    .line 786
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->i:Le0/s3;

    .line 787
    .line 788
    iget-object v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->y:Lj/i;

    .line 789
    .line 790
    if-eqz v3, :cond_34

    .line 791
    .line 792
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 793
    .line 794
    const/16 v17, 0x0

    .line 795
    .line 796
    move-object/from16 v19, v3

    .line 797
    .line 798
    move/from16 v18, v5

    .line 799
    .line 800
    invoke-virtual/range {v12 .. v19}, Le0/s3;->b(Lj/i;IIIIILjava/util/List;)V

    .line 801
    .line 802
    .line 803
    goto :goto_18

    .line 804
    :cond_34
    move/from16 v18, v5

    .line 805
    .line 806
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 807
    .line 808
    const/16 v17, 0x0

    .line 809
    .line 810
    move/from16 v19, v15

    .line 811
    .line 812
    move v15, v14

    .line 813
    move/from16 v14, v19

    .line 814
    .line 815
    move-object/from16 v19, v3

    .line 816
    .line 817
    invoke-virtual/range {v12 .. v19}, Le0/s3;->b(Lj/i;IIIIILjava/util/List;)V

    .line 818
    .line 819
    .line 820
    move/from16 v20, v15

    .line 821
    .line 822
    move v15, v14

    .line 823
    move/from16 v14, v20

    .line 824
    .line 825
    :goto_18
    iget-object v3, v9, Lj/i;->c:Ljava/lang/Object;

    .line 826
    .line 827
    check-cast v3, Ljava/util/List;

    .line 828
    .line 829
    iput-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 830
    .line 831
    invoke-virtual {v4, v14, v15, v7}, Le0/s3;->i(III)V

    .line 832
    .line 833
    .line 834
    invoke-virtual {v4, v7}, Le0/s3;->w(I)V

    .line 835
    .line 836
    .line 837
    iget-object v3, v4, Le0/s3;->e:Ljava/lang/Object;

    .line 838
    .line 839
    check-cast v3, [I

    .line 840
    .line 841
    iget v4, v8, Lo2/f;->a:I

    .line 842
    .line 843
    aget v3, v3, v4

    .line 844
    .line 845
    iput v3, v8, Lo2/f;->b:I

    .line 846
    .line 847
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 848
    .line 849
    iput v3, v4, Lo2/h;->c:I

    .line 850
    .line 851
    goto/16 :goto_1a

    .line 852
    .line 853
    :cond_35
    iget v10, v8, Lo2/f;->a:I

    .line 854
    .line 855
    if-eq v5, v11, :cond_36

    .line 856
    .line 857
    invoke-static {v5, v10}, Ljava/lang/Math;->min(II)I

    .line 858
    .line 859
    .line 860
    move-result v10

    .line 861
    :cond_36
    iput-object v6, v9, Lj/i;->c:Ljava/lang/Object;

    .line 862
    .line 863
    iput v7, v9, Lj/i;->b:I

    .line 864
    .line 865
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 866
    .line 867
    .line 868
    move-result v5

    .line 869
    iget-object v6, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 870
    .line 871
    if-eqz v5, :cond_38

    .line 872
    .line 873
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 874
    .line 875
    .line 876
    move-result v5

    .line 877
    if-lez v5, :cond_37

    .line 878
    .line 879
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 880
    .line 881
    invoke-virtual {v4, v10, v3}, Le0/s3;->d(ILjava/util/List;)V

    .line 882
    .line 883
    .line 884
    iget v3, v8, Lo2/f;->a:I

    .line 885
    .line 886
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 887
    .line 888
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->i:Le0/s3;

    .line 889
    .line 890
    iget-object v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->y:Lj/i;

    .line 891
    .line 892
    move/from16 v18, v3

    .line 893
    .line 894
    move-object/from16 v19, v5

    .line 895
    .line 896
    move/from16 v17, v10

    .line 897
    .line 898
    invoke-virtual/range {v12 .. v19}, Le0/s3;->b(Lj/i;IIIIILjava/util/List;)V

    .line 899
    .line 900
    .line 901
    goto :goto_19

    .line 902
    :cond_37
    invoke-virtual {v4, v3}, Le0/s3;->j(I)V

    .line 903
    .line 904
    .line 905
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 906
    .line 907
    const/16 v18, -0x1

    .line 908
    .line 909
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->i:Le0/s3;

    .line 910
    .line 911
    iget-object v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->y:Lj/i;

    .line 912
    .line 913
    const/16 v17, 0x0

    .line 914
    .line 915
    move-object/from16 v19, v3

    .line 916
    .line 917
    invoke-virtual/range {v12 .. v19}, Le0/s3;->b(Lj/i;IIIIILjava/util/List;)V

    .line 918
    .line 919
    .line 920
    goto :goto_19

    .line 921
    :cond_38
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 922
    .line 923
    .line 924
    move-result v5

    .line 925
    if-lez v5, :cond_39

    .line 926
    .line 927
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 928
    .line 929
    invoke-virtual {v4, v10, v3}, Le0/s3;->d(ILjava/util/List;)V

    .line 930
    .line 931
    .line 932
    iget v3, v8, Lo2/f;->a:I

    .line 933
    .line 934
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 935
    .line 936
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->i:Le0/s3;

    .line 937
    .line 938
    iget-object v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->y:Lj/i;

    .line 939
    .line 940
    move/from16 v17, v15

    .line 941
    .line 942
    move v15, v14

    .line 943
    move/from16 v14, v17

    .line 944
    .line 945
    move/from16 v18, v3

    .line 946
    .line 947
    move-object/from16 v19, v5

    .line 948
    .line 949
    move/from16 v17, v10

    .line 950
    .line 951
    invoke-virtual/range {v12 .. v19}, Le0/s3;->b(Lj/i;IIIIILjava/util/List;)V

    .line 952
    .line 953
    .line 954
    move v10, v15

    .line 955
    move v15, v14

    .line 956
    move v14, v10

    .line 957
    move/from16 v10, v17

    .line 958
    .line 959
    goto :goto_19

    .line 960
    :cond_39
    invoke-virtual {v4, v3}, Le0/s3;->j(I)V

    .line 961
    .line 962
    .line 963
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 964
    .line 965
    const/16 v18, -0x1

    .line 966
    .line 967
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->i:Le0/s3;

    .line 968
    .line 969
    iget-object v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->y:Lj/i;

    .line 970
    .line 971
    const/16 v17, 0x0

    .line 972
    .line 973
    move/from16 v19, v15

    .line 974
    .line 975
    move v15, v14

    .line 976
    move/from16 v14, v19

    .line 977
    .line 978
    move-object/from16 v19, v3

    .line 979
    .line 980
    invoke-virtual/range {v12 .. v19}, Le0/s3;->b(Lj/i;IIIIILjava/util/List;)V

    .line 981
    .line 982
    .line 983
    move/from16 v20, v15

    .line 984
    .line 985
    move v15, v14

    .line 986
    move/from16 v14, v20

    .line 987
    .line 988
    :goto_19
    iget-object v3, v9, Lj/i;->c:Ljava/lang/Object;

    .line 989
    .line 990
    check-cast v3, Ljava/util/List;

    .line 991
    .line 992
    iput-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 993
    .line 994
    invoke-virtual {v4, v14, v15, v10}, Le0/s3;->i(III)V

    .line 995
    .line 996
    .line 997
    invoke-virtual {v4, v10}, Le0/s3;->w(I)V

    .line 998
    .line 999
    .line 1000
    :goto_1a
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 1001
    .line 1002
    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->l(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;Lo2/h;)I

    .line 1003
    .line 1004
    .line 1005
    iget-boolean v3, v8, Lo2/f;->e:Z

    .line 1006
    .line 1007
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 1008
    .line 1009
    if-eqz v3, :cond_3a

    .line 1010
    .line 1011
    iget v3, v4, Lo2/h;->e:I

    .line 1012
    .line 1013
    const/4 v5, 0x1

    .line 1014
    invoke-virtual {v0, v8, v5, v7}, Lcom/google/android/flexbox/FlexboxLayoutManager;->z(Lo2/f;ZZ)V

    .line 1015
    .line 1016
    .line 1017
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 1018
    .line 1019
    invoke-virtual {v0, v1, v2, v4}, Lcom/google/android/flexbox/FlexboxLayoutManager;->l(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;Lo2/h;)I

    .line 1020
    .line 1021
    .line 1022
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 1023
    .line 1024
    iget v4, v4, Lo2/h;->e:I

    .line 1025
    .line 1026
    goto :goto_1b

    .line 1027
    :cond_3a
    const/4 v5, 0x1

    .line 1028
    iget v4, v4, Lo2/h;->e:I

    .line 1029
    .line 1030
    invoke-virtual {v0, v8, v5, v7}, Lcom/google/android/flexbox/FlexboxLayoutManager;->A(Lo2/f;ZZ)V

    .line 1031
    .line 1032
    .line 1033
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 1034
    .line 1035
    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->l(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;Lo2/h;)I

    .line 1036
    .line 1037
    .line 1038
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 1039
    .line 1040
    iget v3, v3, Lo2/h;->e:I

    .line 1041
    .line 1042
    :goto_1b
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 1043
    .line 1044
    .line 1045
    move-result v6

    .line 1046
    if-lez v6, :cond_3c

    .line 1047
    .line 1048
    iget-boolean v6, v8, Lo2/f;->e:Z

    .line 1049
    .line 1050
    if-eqz v6, :cond_3b

    .line 1051
    .line 1052
    invoke-virtual {v0, v4, v1, v2, v5}, Lcom/google/android/flexbox/FlexboxLayoutManager;->fixLayoutEndGap(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;Z)I

    .line 1053
    .line 1054
    .line 1055
    move-result v4

    .line 1056
    add-int/2addr v4, v3

    .line 1057
    invoke-virtual {v0, v4, v1, v2, v7}, Lcom/google/android/flexbox/FlexboxLayoutManager;->fixLayoutStartGap(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;Z)I

    .line 1058
    .line 1059
    .line 1060
    return-void

    .line 1061
    :cond_3b
    invoke-virtual {v0, v3, v1, v2, v5}, Lcom/google/android/flexbox/FlexboxLayoutManager;->fixLayoutStartGap(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;Z)I

    .line 1062
    .line 1063
    .line 1064
    move-result v3

    .line 1065
    add-int/2addr v3, v4

    .line 1066
    invoke-virtual {v0, v3, v1, v2, v7}, Lcom/google/android/flexbox/FlexboxLayoutManager;->fixLayoutEndGap(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;Z)I

    .line 1067
    .line 1068
    .line 1069
    :cond_3c
    :goto_1c
    return-void
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
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
.end method

.method public final onLayoutCompleted(Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->onLayoutCompleted(Landroidx/recyclerview/widget/RecyclerView$State;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->p:Lo2/i;

    .line 6
    .line 7
    const/4 p1, -0x1

    .line 8
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:I

    .line 9
    .line 10
    const/high16 v0, -0x80000000

    .line 11
    .line 12
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r:I

    .line 13
    .line 14
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:I

    .line 15
    .line 16
    iget-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m:Lo2/f;

    .line 17
    .line 18
    invoke-static {p1}, Lo2/f;->b(Lo2/f;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Landroid/util/SparseArray;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    .line 24
    .line 25
    .line 26
    return-void
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

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lo2/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lo2/i;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->p:Lo2/i;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->requestLayout()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->p:Lo2/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lo2/i;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iget v2, v0, Lo2/i;->b:I

    .line 11
    .line 12
    iput v2, v1, Lo2/i;->b:I

    .line 13
    .line 14
    iget v0, v0, Lo2/i;->c:I

    .line 15
    .line 16
    iput v0, v1, Lo2/i;->c:I

    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_0
    new-instance v0, Lo2/i;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-lez v1, :cond_1

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    iput v2, v0, Lo2/i;->b:I

    .line 40
    .line 41
    iget-object v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 42
    .line 43
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iget-object v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 48
    .line 49
    invoke-virtual {v2}, Landroidx/recyclerview/widget/OrientationHelper;->getStartAfterPadding()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    sub-int/2addr v1, v2

    .line 54
    iput v1, v0, Lo2/i;->c:I

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_1
    const/4 v1, -0x1

    .line 58
    iput v1, v0, Lo2/i;->b:I

    .line 59
    .line 60
    return-object v0
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

.method public final p(Landroid/view/View;Lo2/c;)Landroid/view/View;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, -0x2

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget p2, p2, Lo2/c;->h:I

    .line 16
    .line 17
    sub-int/2addr v2, p2

    .line 18
    add-int/lit8 v2, v2, -0x1

    .line 19
    .line 20
    :goto_0
    if-le v1, v2, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    if-eqz p2, :cond_2

    .line 27
    .line 28
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const/16 v4, 0x8

    .line 33
    .line 34
    if-ne v3, v4, :cond_0

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_0
    iget-boolean v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f:Z

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 44
    .line 45
    invoke-virtual {v3, p1}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 50
    .line 51
    invoke-virtual {v4, p2}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-le v3, v4, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 59
    .line 60
    invoke-virtual {v3, p1}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedEnd(Landroid/view/View;)I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 65
    .line 66
    invoke-virtual {v4, p2}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedEnd(Landroid/view/View;)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-ge v3, v4, :cond_2

    .line 71
    .line 72
    :goto_1
    move-object p1, p2

    .line 73
    :cond_2
    :goto_2
    add-int/lit8 v1, v1, -0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    return-object p1
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

.method public final q(II)Landroid/view/View;
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    if-le p2, p1, :cond_0

    .line 3
    .line 4
    move v1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, -0x1

    .line 7
    :goto_0
    if-eq p1, p2, :cond_6

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingLeft()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingTop()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidth()I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingRight()I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    sub-int/2addr v5, v6

    .line 30
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getHeight()I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingBottom()I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    sub-int/2addr v6, v7

    .line 39
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    check-cast v7, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 44
    .line 45
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getDecoratedLeft(Landroid/view/View;)I

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 50
    .line 51
    sub-int/2addr v8, v7

    .line 52
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    check-cast v7, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 57
    .line 58
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getDecoratedTop(Landroid/view/View;)I

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 63
    .line 64
    sub-int/2addr v9, v7

    .line 65
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    check-cast v7, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 70
    .line 71
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getDecoratedRight(Landroid/view/View;)I

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 76
    .line 77
    add-int/2addr v10, v7

    .line 78
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    check-cast v7, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 83
    .line 84
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getDecoratedBottom(Landroid/view/View;)I

    .line 85
    .line 86
    .line 87
    move-result v11

    .line 88
    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 89
    .line 90
    add-int/2addr v11, v7

    .line 91
    const/4 v7, 0x0

    .line 92
    if-ge v8, v5, :cond_2

    .line 93
    .line 94
    if-lt v10, v3, :cond_1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    move v3, v7

    .line 98
    goto :goto_2

    .line 99
    :cond_2
    :goto_1
    move v3, v0

    .line 100
    :goto_2
    if-ge v9, v6, :cond_3

    .line 101
    .line 102
    if-lt v11, v4, :cond_4

    .line 103
    .line 104
    :cond_3
    move v7, v0

    .line 105
    :cond_4
    if-eqz v3, :cond_5

    .line 106
    .line 107
    if-eqz v7, :cond_5

    .line 108
    .line 109
    return-object v2

    .line 110
    :cond_5
    add-int/2addr p1, v1

    .line 111
    goto :goto_0

    .line 112
    :cond_6
    const/4 p1, 0x0

    .line 113
    return-object p1
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

.method public final r(III)Landroid/view/View;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lo2/h;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput v1, v0, Lo2/h;->h:I

    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/recyclerview/widget/OrientationHelper;->getStartAfterPadding()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 25
    .line 26
    invoke-virtual {v2}, Landroidx/recyclerview/widget/OrientationHelper;->getEndAfterPadding()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-le p2, p1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v1, -0x1

    .line 34
    :goto_0
    const/4 v3, 0x0

    .line 35
    move-object v4, v3

    .line 36
    :goto_1
    if-eq p1, p2, :cond_7

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    if-nez v5, :cond_2

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_2
    invoke-virtual {p0, v5}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-ltz v6, :cond_6

    .line 50
    .line 51
    if-ge v6, p3, :cond_6

    .line 52
    .line 53
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    check-cast v6, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 58
    .line 59
    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->isItemRemoved()Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-eqz v6, :cond_3

    .line 64
    .line 65
    if-nez v4, :cond_6

    .line 66
    .line 67
    move-object v4, v5

    .line 68
    goto :goto_3

    .line 69
    :cond_3
    iget-object v6, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 70
    .line 71
    invoke-virtual {v6, v5}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-lt v6, v0, :cond_5

    .line 76
    .line 77
    iget-object v6, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 78
    .line 79
    invoke-virtual {v6, v5}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedEnd(Landroid/view/View;)I

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-le v6, v2, :cond_4

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    return-object v5

    .line 87
    :cond_5
    :goto_2
    if-nez v3, :cond_6

    .line 88
    .line 89
    move-object v3, v5

    .line 90
    :cond_6
    :goto_3
    add-int/2addr p1, v1

    .line 91
    goto :goto_1

    .line 92
    :cond_7
    if-eqz v3, :cond_8

    .line 93
    .line 94
    return-object v3

    .line 95
    :cond_8
    return-object v4
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
.end method

.method public final s(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_14

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_c

    .line 13
    .line 14
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    iput-boolean v3, v1, Lo2/h;->i:Z

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    iget-boolean v1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f:Z

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    move v1, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move v1, v2

    .line 35
    :goto_0
    const/4 v4, -0x1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-gez p1, :cond_2

    .line 39
    .line 40
    :goto_1
    move v5, v3

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move v5, v4

    .line 43
    goto :goto_2

    .line 44
    :cond_3
    if-lez p1, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :goto_2
    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->abs(I)I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 52
    .line 53
    iput v5, v7, Lo2/h;->h:I

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidth()I

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidthMode()I

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    invoke-static {v8, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 68
    .line 69
    .line 70
    move-result v12

    .line 71
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getHeight()I

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getHeightMode()I

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    invoke-static {v8, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 80
    .line 81
    .line 82
    move-result v13

    .line 83
    if-nez v7, :cond_4

    .line 84
    .line 85
    iget-boolean v8, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f:Z

    .line 86
    .line 87
    if-eqz v8, :cond_4

    .line 88
    .line 89
    move v8, v3

    .line 90
    goto :goto_3

    .line 91
    :cond_4
    move v8, v2

    .line 92
    :goto_3
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->i:Le0/s3;

    .line 93
    .line 94
    if-ne v5, v3, :cond_a

    .line 95
    .line 96
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 97
    .line 98
    .line 99
    move-result v10

    .line 100
    sub-int/2addr v10, v3

    .line 101
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    if-nez v10, :cond_5

    .line 106
    .line 107
    goto/16 :goto_a

    .line 108
    .line 109
    :cond_5
    iget-object v11, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 110
    .line 111
    iget-object v14, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 112
    .line 113
    invoke-virtual {v14, v10}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedEnd(Landroid/view/View;)I

    .line 114
    .line 115
    .line 116
    move-result v14

    .line 117
    iput v14, v11, Lo2/h;->e:I

    .line 118
    .line 119
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 120
    .line 121
    .line 122
    move-result v11

    .line 123
    iget-object v14, v9, Le0/s3;->e:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v14, [I

    .line 126
    .line 127
    aget v14, v14, v11

    .line 128
    .line 129
    iget-object v15, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 130
    .line 131
    invoke-interface {v15, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v14

    .line 135
    check-cast v14, Lo2/c;

    .line 136
    .line 137
    invoke-virtual {v0, v10, v14}, Lcom/google/android/flexbox/FlexboxLayoutManager;->p(Landroid/view/View;Lo2/c;)Landroid/view/View;

    .line 138
    .line 139
    .line 140
    move-result-object v10

    .line 141
    iget-object v14, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 142
    .line 143
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    add-int/2addr v11, v3

    .line 147
    iput v11, v14, Lo2/h;->d:I

    .line 148
    .line 149
    iget-object v15, v9, Le0/s3;->e:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v15, [I

    .line 152
    .line 153
    move/from16 v16, v3

    .line 154
    .line 155
    array-length v3, v15

    .line 156
    if-gt v3, v11, :cond_6

    .line 157
    .line 158
    iput v4, v14, Lo2/h;->c:I

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_6
    aget v3, v15, v11

    .line 162
    .line 163
    iput v3, v14, Lo2/h;->c:I

    .line 164
    .line 165
    :goto_4
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 166
    .line 167
    if-eqz v8, :cond_7

    .line 168
    .line 169
    invoke-virtual {v3, v10}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    iput v3, v14, Lo2/h;->e:I

    .line 174
    .line 175
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 176
    .line 177
    iget-object v8, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 178
    .line 179
    invoke-virtual {v8, v10}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    .line 180
    .line 181
    .line 182
    move-result v8

    .line 183
    neg-int v8, v8

    .line 184
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 185
    .line 186
    invoke-virtual {v10}, Landroidx/recyclerview/widget/OrientationHelper;->getStartAfterPadding()I

    .line 187
    .line 188
    .line 189
    move-result v10

    .line 190
    add-int/2addr v10, v8

    .line 191
    iput v10, v3, Lo2/h;->f:I

    .line 192
    .line 193
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 194
    .line 195
    iget v8, v3, Lo2/h;->f:I

    .line 196
    .line 197
    invoke-static {v8, v2}, Ljava/lang/Math;->max(II)I

    .line 198
    .line 199
    .line 200
    move-result v8

    .line 201
    iput v8, v3, Lo2/h;->f:I

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_7
    invoke-virtual {v3, v10}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedEnd(Landroid/view/View;)I

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    iput v3, v14, Lo2/h;->e:I

    .line 209
    .line 210
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 211
    .line 212
    iget-object v8, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 213
    .line 214
    invoke-virtual {v8, v10}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedEnd(Landroid/view/View;)I

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 219
    .line 220
    invoke-virtual {v10}, Landroidx/recyclerview/widget/OrientationHelper;->getEndAfterPadding()I

    .line 221
    .line 222
    .line 223
    move-result v10

    .line 224
    sub-int/2addr v8, v10

    .line 225
    iput v8, v3, Lo2/h;->f:I

    .line 226
    .line 227
    :goto_5
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 228
    .line 229
    iget v3, v3, Lo2/h;->c:I

    .line 230
    .line 231
    if-eq v3, v4, :cond_8

    .line 232
    .line 233
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 234
    .line 235
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    add-int/lit8 v4, v4, -0x1

    .line 240
    .line 241
    if-le v3, v4, :cond_10

    .line 242
    .line 243
    :cond_8
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 244
    .line 245
    iget v3, v3, Lo2/h;->d:I

    .line 246
    .line 247
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k:Landroidx/recyclerview/widget/RecyclerView$State;

    .line 248
    .line 249
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$State;->getItemCount()I

    .line 250
    .line 251
    .line 252
    move-result v4

    .line 253
    if-gt v3, v4, :cond_10

    .line 254
    .line 255
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 256
    .line 257
    iget v4, v3, Lo2/h;->f:I

    .line 258
    .line 259
    sub-int v14, v6, v4

    .line 260
    .line 261
    const/4 v4, 0x0

    .line 262
    iget-object v11, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->y:Lj/i;

    .line 263
    .line 264
    iput-object v4, v11, Lj/i;->c:Ljava/lang/Object;

    .line 265
    .line 266
    iput v2, v11, Lj/i;->b:I

    .line 267
    .line 268
    if-lez v14, :cond_10

    .line 269
    .line 270
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->i:Le0/s3;

    .line 271
    .line 272
    if-eqz v7, :cond_9

    .line 273
    .line 274
    iget v15, v3, Lo2/h;->d:I

    .line 275
    .line 276
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 277
    .line 278
    const/16 v16, -0x1

    .line 279
    .line 280
    move-object/from16 v17, v3

    .line 281
    .line 282
    invoke-virtual/range {v10 .. v17}, Le0/s3;->b(Lj/i;IIIIILjava/util/List;)V

    .line 283
    .line 284
    .line 285
    goto :goto_6

    .line 286
    :cond_9
    iget v15, v3, Lo2/h;->d:I

    .line 287
    .line 288
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 289
    .line 290
    const/16 v16, -0x1

    .line 291
    .line 292
    move/from16 v17, v13

    .line 293
    .line 294
    move v13, v12

    .line 295
    move/from16 v12, v17

    .line 296
    .line 297
    move-object/from16 v17, v3

    .line 298
    .line 299
    invoke-virtual/range {v10 .. v17}, Le0/s3;->b(Lj/i;IIIIILjava/util/List;)V

    .line 300
    .line 301
    .line 302
    move/from16 v18, v13

    .line 303
    .line 304
    move v13, v12

    .line 305
    move/from16 v12, v18

    .line 306
    .line 307
    :goto_6
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 308
    .line 309
    iget v3, v3, Lo2/h;->d:I

    .line 310
    .line 311
    invoke-virtual {v9, v12, v13, v3}, Le0/s3;->i(III)V

    .line 312
    .line 313
    .line 314
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 315
    .line 316
    iget v3, v3, Lo2/h;->d:I

    .line 317
    .line 318
    invoke-virtual {v9, v3}, Le0/s3;->w(I)V

    .line 319
    .line 320
    .line 321
    goto/16 :goto_9

    .line 322
    .line 323
    :cond_a
    move/from16 v16, v3

    .line 324
    .line 325
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    if-nez v3, :cond_b

    .line 330
    .line 331
    goto/16 :goto_a

    .line 332
    .line 333
    :cond_b
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 334
    .line 335
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 336
    .line 337
    invoke-virtual {v10, v3}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    .line 338
    .line 339
    .line 340
    move-result v10

    .line 341
    iput v10, v7, Lo2/h;->e:I

    .line 342
    .line 343
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 344
    .line 345
    .line 346
    move-result v7

    .line 347
    iget-object v10, v9, Le0/s3;->e:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast v10, [I

    .line 350
    .line 351
    aget v10, v10, v7

    .line 352
    .line 353
    iget-object v11, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 354
    .line 355
    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v10

    .line 359
    check-cast v10, Lo2/c;

    .line 360
    .line 361
    invoke-virtual {v0, v3, v10}, Lcom/google/android/flexbox/FlexboxLayoutManager;->n(Landroid/view/View;Lo2/c;)Landroid/view/View;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 366
    .line 367
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    iget-object v9, v9, Le0/s3;->e:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast v9, [I

    .line 373
    .line 374
    aget v9, v9, v7

    .line 375
    .line 376
    if-ne v9, v4, :cond_c

    .line 377
    .line 378
    move v9, v2

    .line 379
    :cond_c
    if-lez v9, :cond_d

    .line 380
    .line 381
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 382
    .line 383
    add-int/lit8 v10, v9, -0x1

    .line 384
    .line 385
    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v4

    .line 389
    check-cast v4, Lo2/c;

    .line 390
    .line 391
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 392
    .line 393
    iget v4, v4, Lo2/c;->h:I

    .line 394
    .line 395
    sub-int/2addr v7, v4

    .line 396
    iput v7, v10, Lo2/h;->d:I

    .line 397
    .line 398
    goto :goto_7

    .line 399
    :cond_d
    iput v4, v10, Lo2/h;->d:I

    .line 400
    .line 401
    :goto_7
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 402
    .line 403
    if-lez v9, :cond_e

    .line 404
    .line 405
    add-int/lit8 v9, v9, -0x1

    .line 406
    .line 407
    goto :goto_8

    .line 408
    :cond_e
    move v9, v2

    .line 409
    :goto_8
    iput v9, v4, Lo2/h;->c:I

    .line 410
    .line 411
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 412
    .line 413
    if-eqz v8, :cond_f

    .line 414
    .line 415
    invoke-virtual {v7, v3}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedEnd(Landroid/view/View;)I

    .line 416
    .line 417
    .line 418
    move-result v7

    .line 419
    iput v7, v4, Lo2/h;->e:I

    .line 420
    .line 421
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 422
    .line 423
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 424
    .line 425
    invoke-virtual {v7, v3}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedEnd(Landroid/view/View;)I

    .line 426
    .line 427
    .line 428
    move-result v3

    .line 429
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 430
    .line 431
    invoke-virtual {v7}, Landroidx/recyclerview/widget/OrientationHelper;->getEndAfterPadding()I

    .line 432
    .line 433
    .line 434
    move-result v7

    .line 435
    sub-int/2addr v3, v7

    .line 436
    iput v3, v4, Lo2/h;->f:I

    .line 437
    .line 438
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 439
    .line 440
    iget v4, v3, Lo2/h;->f:I

    .line 441
    .line 442
    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    .line 443
    .line 444
    .line 445
    move-result v4

    .line 446
    iput v4, v3, Lo2/h;->f:I

    .line 447
    .line 448
    goto :goto_9

    .line 449
    :cond_f
    invoke-virtual {v7, v3}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    .line 450
    .line 451
    .line 452
    move-result v7

    .line 453
    iput v7, v4, Lo2/h;->e:I

    .line 454
    .line 455
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 456
    .line 457
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 458
    .line 459
    invoke-virtual {v7, v3}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    .line 460
    .line 461
    .line 462
    move-result v3

    .line 463
    neg-int v3, v3

    .line 464
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 465
    .line 466
    invoke-virtual {v7}, Landroidx/recyclerview/widget/OrientationHelper;->getStartAfterPadding()I

    .line 467
    .line 468
    .line 469
    move-result v7

    .line 470
    add-int/2addr v7, v3

    .line 471
    iput v7, v4, Lo2/h;->f:I

    .line 472
    .line 473
    :cond_10
    :goto_9
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 474
    .line 475
    iget v4, v3, Lo2/h;->f:I

    .line 476
    .line 477
    sub-int v4, v6, v4

    .line 478
    .line 479
    iput v4, v3, Lo2/h;->a:I

    .line 480
    .line 481
    :goto_a
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 482
    .line 483
    iget v4, v3, Lo2/h;->f:I

    .line 484
    .line 485
    move-object/from16 v7, p2

    .line 486
    .line 487
    move-object/from16 v8, p3

    .line 488
    .line 489
    invoke-virtual {v0, v7, v8, v3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->l(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;Lo2/h;)I

    .line 490
    .line 491
    .line 492
    move-result v3

    .line 493
    add-int/2addr v3, v4

    .line 494
    if-gez v3, :cond_11

    .line 495
    .line 496
    goto :goto_c

    .line 497
    :cond_11
    if-eqz v1, :cond_13

    .line 498
    .line 499
    if-le v6, v3, :cond_12

    .line 500
    .line 501
    neg-int v1, v5

    .line 502
    mul-int/2addr v1, v3

    .line 503
    goto :goto_b

    .line 504
    :cond_12
    move/from16 v1, p1

    .line 505
    .line 506
    goto :goto_b

    .line 507
    :cond_13
    if-le v6, v3, :cond_12

    .line 508
    .line 509
    mul-int v1, v5, v3

    .line 510
    .line 511
    :goto_b
    iget-object v2, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 512
    .line 513
    neg-int v3, v1

    .line 514
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/OrientationHelper;->offsetChildren(I)V

    .line 515
    .line 516
    .line 517
    iget-object v2, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 518
    .line 519
    iput v1, v2, Lo2/h;->g:I

    .line 520
    .line 521
    return v1

    .line 522
    :cond_14
    :goto_c
    return v2
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
.end method

.method public final scrollHorizontallyBy(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->c:I

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->t(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m:Lo2/f;

    .line 17
    .line 18
    iget p3, p2, Lo2/f;->d:I

    .line 19
    .line 20
    add-int/2addr p3, p1

    .line 21
    iput p3, p2, Lo2/f;->d:I

    .line 22
    .line 23
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->o:Landroidx/recyclerview/widget/OrientationHelper;

    .line 24
    .line 25
    neg-int p3, p1

    .line 26
    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/OrientationHelper;->offsetChildren(I)V

    .line 27
    .line 28
    .line 29
    return p1

    .line 30
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->s(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Landroid/util/SparseArray;

    .line 35
    .line 36
    invoke-virtual {p2}, Landroid/util/SparseArray;->clear()V

    .line 37
    .line 38
    .line 39
    return p1
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

.method public final scrollToPosition(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:I

    .line 2
    .line 3
    const/high16 p1, -0x80000000

    .line 4
    .line 5
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r:I

    .line 6
    .line 7
    iget-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->p:Lo2/i;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    iput v0, p1, Lo2/i;->b:I

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->requestLayout()V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final scrollVerticallyBy(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->c:I

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->t(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m:Lo2/f;

    .line 23
    .line 24
    iget p3, p2, Lo2/f;->d:I

    .line 25
    .line 26
    add-int/2addr p3, p1

    .line 27
    iput p3, p2, Lo2/f;->d:I

    .line 28
    .line 29
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->o:Landroidx/recyclerview/widget/OrientationHelper;

    .line 30
    .line 31
    neg-int p3, p1

    .line 32
    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/OrientationHelper;->offsetChildren(I)V

    .line 33
    .line 34
    .line 35
    return p1

    .line 36
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->s(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Landroid/util/SparseArray;

    .line 41
    .line 42
    invoke-virtual {p2}, Landroid/util/SparseArray;->clear()V

    .line 43
    .line 44
    .line 45
    return p1
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

.method public final setFlexLines(Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

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

.method public final smoothScrollToPosition(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;I)V
    .locals 0

    .line 1
    new-instance p2, Landroidx/recyclerview/widget/LinearSmoothScroller;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {p2, p1}, Landroidx/recyclerview/widget/LinearSmoothScroller;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;->setTargetPosition(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->startSmoothScroll(Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;)V

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

.method public final t(I)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_8

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Landroid/view/View;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    :goto_0
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidth()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getHeight()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    :goto_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getLayoutDirection()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    const/4 v3, 0x1

    .line 46
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m:Lo2/f;

    .line 47
    .line 48
    if-ne v2, v3, :cond_4

    .line 49
    .line 50
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-gez p1, :cond_3

    .line 55
    .line 56
    iget p1, v4, Lo2/f;->d:I

    .line 57
    .line 58
    add-int/2addr v0, p1

    .line 59
    sub-int/2addr v0, v1

    .line 60
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    neg-int p1, p1

    .line 65
    return p1

    .line 66
    :cond_3
    iget v0, v4, Lo2/f;->d:I

    .line 67
    .line 68
    add-int v1, v0, p1

    .line 69
    .line 70
    if-lez v1, :cond_6

    .line 71
    .line 72
    neg-int p1, v0

    .line 73
    return p1

    .line 74
    :cond_4
    if-lez p1, :cond_5

    .line 75
    .line 76
    iget v2, v4, Lo2/f;->d:I

    .line 77
    .line 78
    sub-int/2addr v0, v2

    .line 79
    sub-int/2addr v0, v1

    .line 80
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    return p1

    .line 85
    :cond_5
    iget v0, v4, Lo2/f;->d:I

    .line 86
    .line 87
    add-int v1, v0, p1

    .line 88
    .line 89
    if-ltz v1, :cond_7

    .line 90
    .line 91
    :cond_6
    return p1

    .line 92
    :cond_7
    neg-int p1, v0

    .line 93
    return p1

    .line 94
    :cond_8
    :goto_2
    const/4 p1, 0x0

    .line 95
    return p1
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

.method public final u(Landroidx/recyclerview/widget/RecyclerView$Recycler;Lo2/h;)V
    .locals 9

    .line 1
    iget-boolean v0, p2, Lo2/h;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_8

    .line 6
    .line 7
    :cond_0
    iget v0, p2, Lo2/h;->h:I

    .line 8
    .line 9
    iget v1, p2, Lo2/h;->f:I

    .line 10
    .line 11
    iget-object v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->i:Le0/s3;

    .line 12
    .line 13
    const/4 v3, -0x1

    .line 14
    if-ne v0, v3, :cond_a

    .line 15
    .line 16
    if-gez v1, :cond_1

    .line 17
    .line 18
    goto/16 :goto_8

    .line 19
    .line 20
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    goto/16 :goto_8

    .line 27
    .line 28
    :cond_2
    add-int/lit8 v1, v0, -0x1

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    if-nez v4, :cond_3

    .line 35
    .line 36
    goto/16 :goto_8

    .line 37
    .line 38
    :cond_3
    iget-object v2, v2, Le0/s3;->e:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, [I

    .line 41
    .line 42
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    aget v2, v2, v4

    .line 47
    .line 48
    if-ne v2, v3, :cond_4

    .line 49
    .line 50
    goto/16 :goto_8

    .line 51
    .line 52
    :cond_4
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    check-cast v3, Lo2/c;

    .line 59
    .line 60
    move v4, v1

    .line 61
    :goto_0
    if-ltz v4, :cond_9

    .line 62
    .line 63
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    if-nez v5, :cond_5

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_5
    iget v6, p2, Lo2/h;->f:I

    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-nez v7, :cond_6

    .line 77
    .line 78
    iget-boolean v7, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f:Z

    .line 79
    .line 80
    if-eqz v7, :cond_6

    .line 81
    .line 82
    iget-object v7, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 83
    .line 84
    invoke-virtual {v7, v5}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedEnd(Landroid/view/View;)I

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-gt v7, v6, :cond_9

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_6
    iget-object v7, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 92
    .line 93
    invoke-virtual {v7, v5}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    iget-object v8, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 98
    .line 99
    invoke-virtual {v8}, Landroidx/recyclerview/widget/OrientationHelper;->getEnd()I

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    sub-int/2addr v8, v6

    .line 104
    if-lt v7, v8, :cond_9

    .line 105
    .line 106
    :goto_1
    iget v6, v3, Lo2/c;->o:I

    .line 107
    .line 108
    invoke-virtual {p0, v5}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-ne v6, v5, :cond_8

    .line 113
    .line 114
    if-gtz v2, :cond_7

    .line 115
    .line 116
    move v0, v4

    .line 117
    goto :goto_3

    .line 118
    :cond_7
    iget v0, p2, Lo2/h;->h:I

    .line 119
    .line 120
    add-int/2addr v2, v0

    .line 121
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 122
    .line 123
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, Lo2/c;

    .line 128
    .line 129
    move-object v3, v0

    .line 130
    move v0, v4

    .line 131
    :cond_8
    :goto_2
    add-int/lit8 v4, v4, -0x1

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_9
    :goto_3
    if-lt v1, v0, :cond_14

    .line 135
    .line 136
    invoke-virtual {p0, v1, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->removeAndRecycleViewAt(ILandroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 137
    .line 138
    .line 139
    add-int/lit8 v1, v1, -0x1

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_a
    if-gez v1, :cond_b

    .line 143
    .line 144
    goto/16 :goto_8

    .line 145
    .line 146
    :cond_b
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-nez v0, :cond_c

    .line 151
    .line 152
    goto/16 :goto_8

    .line 153
    .line 154
    :cond_c
    const/4 v1, 0x0

    .line 155
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    if-nez v4, :cond_d

    .line 160
    .line 161
    goto/16 :goto_8

    .line 162
    .line 163
    :cond_d
    iget-object v2, v2, Le0/s3;->e:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v2, [I

    .line 166
    .line 167
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    aget v2, v2, v4

    .line 172
    .line 173
    if-ne v2, v3, :cond_e

    .line 174
    .line 175
    goto :goto_8

    .line 176
    :cond_e
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 177
    .line 178
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    check-cast v4, Lo2/c;

    .line 183
    .line 184
    :goto_4
    if-ge v1, v0, :cond_13

    .line 185
    .line 186
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    if-nez v5, :cond_f

    .line 191
    .line 192
    goto :goto_6

    .line 193
    :cond_f
    iget v6, p2, Lo2/h;->f:I

    .line 194
    .line 195
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 196
    .line 197
    .line 198
    move-result v7

    .line 199
    if-nez v7, :cond_10

    .line 200
    .line 201
    iget-boolean v7, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f:Z

    .line 202
    .line 203
    if-eqz v7, :cond_10

    .line 204
    .line 205
    iget-object v7, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 206
    .line 207
    invoke-virtual {v7}, Landroidx/recyclerview/widget/OrientationHelper;->getEnd()I

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    iget-object v8, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 212
    .line 213
    invoke-virtual {v8, v5}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    .line 214
    .line 215
    .line 216
    move-result v8

    .line 217
    sub-int/2addr v7, v8

    .line 218
    if-gt v7, v6, :cond_13

    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_10
    iget-object v7, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 222
    .line 223
    invoke-virtual {v7, v5}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedEnd(Landroid/view/View;)I

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    if-gt v7, v6, :cond_13

    .line 228
    .line 229
    :goto_5
    iget v6, v4, Lo2/c;->p:I

    .line 230
    .line 231
    invoke-virtual {p0, v5}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 232
    .line 233
    .line 234
    move-result v5

    .line 235
    if-ne v6, v5, :cond_12

    .line 236
    .line 237
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 238
    .line 239
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    add-int/lit8 v3, v3, -0x1

    .line 244
    .line 245
    if-lt v2, v3, :cond_11

    .line 246
    .line 247
    goto :goto_7

    .line 248
    :cond_11
    iget v3, p2, Lo2/h;->h:I

    .line 249
    .line 250
    add-int/2addr v2, v3

    .line 251
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 252
    .line 253
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    check-cast v3, Lo2/c;

    .line 258
    .line 259
    move-object v4, v3

    .line 260
    move v3, v1

    .line 261
    :cond_12
    :goto_6
    add-int/lit8 v1, v1, 0x1

    .line 262
    .line 263
    goto :goto_4

    .line 264
    :cond_13
    move v1, v3

    .line 265
    :goto_7
    if-ltz v1, :cond_14

    .line 266
    .line 267
    invoke-virtual {p0, v1, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->removeAndRecycleViewAt(ILandroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 268
    .line 269
    .line 270
    add-int/lit8 v1, v1, -0x1

    .line 271
    .line 272
    goto :goto_7

    .line 273
    :cond_14
    :goto_8
    return-void
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

.method public final v()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getHeightMode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidthMode()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    :goto_0
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    const/high16 v2, -0x80000000

    .line 21
    .line 22
    if-ne v0, v2, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    :goto_1
    const/4 v0, 0x1

    .line 28
    :goto_2
    iput-boolean v0, v1, Lo2/h;->b:Z

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

.method public final w(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->b:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->removeAllViews()V

    .line 6
    .line 7
    .line 8
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->b:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->o:Landroidx/recyclerview/widget/OrientationHelper;

    .line 14
    .line 15
    iget-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m:Lo2/f;

    .line 21
    .line 22
    invoke-static {p1}, Lo2/f;->b(Lo2/f;)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput v0, p1, Lo2/f;->d:I

    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->requestLayout()V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
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

.method public final x(Landroid/view/View;IILo2/g;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->isMeasurementCacheEnabled()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget v1, p4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 18
    .line 19
    invoke-static {v0, p2, v1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->isMeasurementUpToDate(III)Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iget p2, p4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 30
    .line 31
    invoke-static {p1, p3, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->isMeasurementUpToDate(III)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 p1, 0x0

    .line 39
    return p1

    .line 40
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 41
    return p1
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

.method public final y(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    invoke-virtual {p0, v0, v1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->q(II)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    :goto_0
    if-lt p1, v1, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->i:Le0/s3;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Le0/s3;->k(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Le0/s3;->l(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v0}, Le0/s3;->j(I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, v1, Le0/s3;->e:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, [I

    .line 40
    .line 41
    array-length v0, v0

    .line 42
    if-lt p1, v0, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:I

    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-nez p1, :cond_3

    .line 53
    .line 54
    :goto_1
    return-void

    .line 55
    :cond_3
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:I

    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    iget-boolean v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f:Z

    .line 68
    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 72
    .line 73
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedEnd(Landroid/view/View;)I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroidx/recyclerview/widget/OrientationHelper;->getEndPadding()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    add-int/2addr v0, p1

    .line 84
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r:I

    .line 85
    .line 86
    return-void

    .line 87
    :cond_4
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 88
    .line 89
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedStart(Landroid/view/View;)I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 94
    .line 95
    invoke-virtual {v0}, Landroidx/recyclerview/widget/OrientationHelper;->getStartAfterPadding()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    sub-int/2addr p1, v0

    .line 100
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r:I

    .line 101
    .line 102
    return-void
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

.method public final z(Lo2/f;ZZ)V
    .locals 2

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->v()V

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p3, Lo2/h;->b:Z

    .line 11
    .line 12
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i()Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    if-nez p3, :cond_1

    .line 17
    .line 18
    iget-boolean p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f:Z

    .line 19
    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 23
    .line 24
    iget v0, p1, Lo2/f;->c:I

    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingRight()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    sub-int/2addr v0, v1

    .line 31
    iput v0, p3, Lo2/h;->a:I

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 35
    .line 36
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n:Landroidx/recyclerview/widget/OrientationHelper;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroidx/recyclerview/widget/OrientationHelper;->getEndAfterPadding()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget v1, p1, Lo2/f;->c:I

    .line 43
    .line 44
    sub-int/2addr v0, v1

    .line 45
    iput v0, p3, Lo2/h;->a:I

    .line 46
    .line 47
    :goto_1
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 48
    .line 49
    iget v0, p1, Lo2/f;->a:I

    .line 50
    .line 51
    iput v0, p3, Lo2/h;->d:I

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    iput v0, p3, Lo2/h;->h:I

    .line 55
    .line 56
    iget v1, p1, Lo2/f;->c:I

    .line 57
    .line 58
    iput v1, p3, Lo2/h;->e:I

    .line 59
    .line 60
    const/high16 v1, -0x80000000

    .line 61
    .line 62
    iput v1, p3, Lo2/h;->f:I

    .line 63
    .line 64
    iget v1, p1, Lo2/f;->b:I

    .line 65
    .line 66
    iput v1, p3, Lo2/h;->c:I

    .line 67
    .line 68
    if-eqz p2, :cond_2

    .line 69
    .line 70
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    if-le p2, v0, :cond_2

    .line 77
    .line 78
    iget p2, p1, Lo2/f;->b:I

    .line 79
    .line 80
    if-ltz p2, :cond_2

    .line 81
    .line 82
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result p3

    .line 88
    sub-int/2addr p3, v0

    .line 89
    if-ge p2, p3, :cond_2

    .line 90
    .line 91
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h:Ljava/util/List;

    .line 92
    .line 93
    iget p1, p1, Lo2/f;->b:I

    .line 94
    .line 95
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, Lo2/c;

    .line 100
    .line 101
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l:Lo2/h;

    .line 102
    .line 103
    iget p3, p2, Lo2/h;->c:I

    .line 104
    .line 105
    add-int/2addr p3, v0

    .line 106
    iput p3, p2, Lo2/h;->c:I

    .line 107
    .line 108
    iget p1, p1, Lo2/c;->h:I

    .line 109
    .line 110
    iget p3, p2, Lo2/h;->d:I

    .line 111
    .line 112
    add-int/2addr p3, p1

    .line 113
    iput p3, p2, Lo2/h;->d:I

    .line 114
    .line 115
    :cond_2
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
.end method
