.class public Lcom/sun/jna/Function;
.super Lcom/sun/jna/Pointer;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sun/jna/Function$PointerArray;,
        Lcom/sun/jna/Function$NativeMappedArray;,
        Lcom/sun/jna/Function$PostCallRead;
    }
.end annotation


# static fields
.field public static final ALT_CONVENTION:I = 0x3f

.field public static final C_CONVENTION:I = 0x0

.field static final INTEGER_FALSE:Ljava/lang/Integer;

.field static final INTEGER_TRUE:Ljava/lang/Integer;

.field private static final IS_VARARGS:Lcom/sun/jna/VarArgsChecker;

.field private static final MASK_CC:I = 0x3f

.field public static final MAX_NARGS:I = 0x100

.field static final OPTION_INVOKING_METHOD:Ljava/lang/String; = "invoking-method"

.field public static final THROW_LAST_ERROR:I = 0x40

.field public static final USE_VARARGS:I = 0x180


# instance fields
.field final callFlags:I

.field final encoding:Ljava/lang/String;

.field private final functionName:Ljava/lang/String;

.field private library:Lcom/sun/jna/NativeLibrary;

.field final options:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, Lcom/sun/jna/Function;->INTEGER_TRUE:Ljava/lang/Integer;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lcom/sun/jna/Function;->INTEGER_FALSE:Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-static {}, Lcom/sun/jna/VarArgsChecker;->create()Lcom/sun/jna/VarArgsChecker;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lcom/sun/jna/Function;->IS_VARARGS:Lcom/sun/jna/VarArgsChecker;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(Lcom/sun/jna/NativeLibrary;Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/sun/jna/Pointer;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 v0, p3, 0x3f

    .line 5
    .line 6
    invoke-direct {p0, v0}, Lcom/sun/jna/Function;->checkCallingConvention(I)V

    .line 7
    .line 8
    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    iput-object p1, p0, Lcom/sun/jna/Function;->library:Lcom/sun/jna/NativeLibrary;

    .line 12
    .line 13
    iput-object p2, p0, Lcom/sun/jna/Function;->functionName:Ljava/lang/String;

    .line 14
    .line 15
    iput p3, p0, Lcom/sun/jna/Function;->callFlags:I

    .line 16
    .line 17
    iget-object p3, p1, Lcom/sun/jna/NativeLibrary;->options:Ljava/util/Map;

    .line 18
    .line 19
    iput-object p3, p0, Lcom/sun/jna/Function;->options:Ljava/util/Map;

    .line 20
    .line 21
    if-eqz p4, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {}, Lcom/sun/jna/Native;->getDefaultStringEncoding()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p4

    .line 28
    :goto_0
    iput-object p4, p0, Lcom/sun/jna/Function;->encoding:Ljava/lang/String;

    .line 29
    .line 30
    :try_start_0
    invoke-virtual {p1, p2}, Lcom/sun/jna/NativeLibrary;->getSymbolAddress(Ljava/lang/String;)J

    .line 31
    .line 32
    .line 33
    move-result-wide p3

    .line 34
    iput-wide p3, p0, Lcom/sun/jna/Pointer;->peer:J
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    return-void

    .line 37
    :catch_0
    move-exception p1

    .line 38
    new-instance p3, Ljava/lang/UnsatisfiedLinkError;

    .line 39
    .line 40
    const-string p4, "Error looking up function \'"

    .line 41
    .line 42
    const-string v0, "\': "

    .line 43
    .line 44
    invoke-static {p4, p2, v0}, Lai/onnxruntime/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-direct {p3, p1}, Ljava/lang/UnsatisfiedLinkError;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p3

    .line 63
    :cond_1
    const-string p1, "Function name must not be null"

    .line 64
    .line 65
    invoke-static {p1}, Ln0/b;->n(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const/4 p1, 0x0

    .line 69
    throw p1
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

.method public constructor <init>(Lcom/sun/jna/Pointer;ILjava/lang/String;)V
    .locals 4

    .line 70
    invoke-direct {p0}, Lcom/sun/jna/Pointer;-><init>()V

    and-int/lit8 v0, p2, 0x3f

    .line 71
    invoke-direct {p0, v0}, Lcom/sun/jna/Function;->checkCallingConvention(I)V

    if-eqz p1, :cond_1

    .line 72
    iget-wide v0, p1, Lcom/sun/jna/Pointer;->peer:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 73
    invoke-virtual {p1}, Lcom/sun/jna/Pointer;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sun/jna/Function;->functionName:Ljava/lang/String;

    .line 74
    iput p2, p0, Lcom/sun/jna/Function;->callFlags:I

    .line 75
    iget-wide p1, p1, Lcom/sun/jna/Pointer;->peer:J

    iput-wide p1, p0, Lcom/sun/jna/Pointer;->peer:J

    .line 76
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object p1, p0, Lcom/sun/jna/Function;->options:Ljava/util/Map;

    if-eqz p3, :cond_0

    goto :goto_0

    .line 77
    :cond_0
    invoke-static {}, Lcom/sun/jna/Native;->getDefaultStringEncoding()Ljava/lang/String;

    move-result-object p3

    :goto_0
    iput-object p3, p0, Lcom/sun/jna/Function;->encoding:Ljava/lang/String;

    return-void

    .line 78
    :cond_1
    const-string p1, "Function address may not be null"

    invoke-static {p1}, Ln0/b;->n(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private checkCallingConvention(I)V
    .locals 1

    .line 1
    and-int/lit8 v0, p1, 0x3f

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v0, "Unrecognized calling convention: "

    .line 7
    .line 8
    invoke-static {p1, v0}, Lai/onnxruntime/a;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

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

.method public static concatenateVarArgs([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 6

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    if-lez v0, :cond_3

    .line 5
    .line 6
    array-length v0, p0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    aget-object v0, p0, v0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v2, v1

    .line 20
    :goto_0
    if-eqz v2, :cond_3

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_3

    .line 27
    .line 28
    check-cast v0, [Ljava/lang/Object;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    move v3, v2

    .line 32
    :goto_1
    array-length v4, v0

    .line 33
    if-ge v3, v4, :cond_2

    .line 34
    .line 35
    aget-object v4, v0, v3

    .line 36
    .line 37
    instance-of v5, v4, Ljava/lang/Float;

    .line 38
    .line 39
    if-eqz v5, :cond_1

    .line 40
    .line 41
    check-cast v4, Ljava/lang/Float;

    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    float-to-double v4, v4

    .line 48
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    aput-object v4, v0, v3

    .line 53
    .line 54
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    array-length v3, p0

    .line 58
    array-length v4, v0

    .line 59
    add-int/2addr v3, v4

    .line 60
    new-array v4, v3, [Ljava/lang/Object;

    .line 61
    .line 62
    array-length v5, p0

    .line 63
    add-int/lit8 v5, v5, -0x1

    .line 64
    .line 65
    invoke-static {p0, v2, v4, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 66
    .line 67
    .line 68
    array-length p0, p0

    .line 69
    add-int/lit8 p0, p0, -0x1

    .line 70
    .line 71
    array-length v5, v0

    .line 72
    invoke-static {v0, v2, v4, p0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 73
    .line 74
    .line 75
    add-int/lit8 v3, v3, -0x1

    .line 76
    .line 77
    aput-object v1, v4, v3

    .line 78
    .line 79
    return-object v4

    .line 80
    :cond_3
    return-object p0
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

.method private convertArgument([Ljava/lang/Object;ILjava/lang/reflect/Method;Lcom/sun/jna/TypeMapper;ZLjava/lang/Class;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            "I",
            "Ljava/lang/reflect/Method;",
            "Lcom/sun/jna/TypeMapper;",
            "Z",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    aget-object v0, p1, p2

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const-class v3, Lcom/sun/jna/NativeMapped;

    .line 11
    .line 12
    invoke-virtual {v3, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    invoke-static {v2}, Lcom/sun/jna/NativeMappedConverter;->getInstance(Ljava/lang/Class;)Lcom/sun/jna/NativeMappedConverter;

    .line 19
    .line 20
    .line 21
    move-result-object p4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    if-eqz p4, :cond_1

    .line 24
    .line 25
    invoke-interface {p4, v2}, Lcom/sun/jna/TypeMapper;->getToNativeConverter(Ljava/lang/Class;)Lcom/sun/jna/ToNativeConverter;

    .line 26
    .line 27
    .line 28
    move-result-object p4

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object p4, v1

    .line 31
    :goto_0
    if-eqz p4, :cond_3

    .line 32
    .line 33
    if-eqz p3, :cond_2

    .line 34
    .line 35
    new-instance v2, Lcom/sun/jna/MethodParameterContext;

    .line 36
    .line 37
    invoke-direct {v2, p0, p1, p2, p3}, Lcom/sun/jna/MethodParameterContext;-><init>(Lcom/sun/jna/Function;[Ljava/lang/Object;ILjava/lang/reflect/Method;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    new-instance v2, Lcom/sun/jna/FunctionParameterContext;

    .line 42
    .line 43
    invoke-direct {v2, p0, p1, p2}, Lcom/sun/jna/FunctionParameterContext;-><init>(Lcom/sun/jna/Function;[Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    :goto_1
    invoke-interface {p4, v0, v2}, Lcom/sun/jna/ToNativeConverter;->toNative(Ljava/lang/Object;Lcom/sun/jna/ToNativeContext;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :cond_3
    if-eqz v0, :cond_1f

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-direct {p0, p1}, Lcom/sun/jna/Function;->isPrimitiveArray(Ljava/lang/Class;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_4

    .line 61
    .line 62
    goto/16 :goto_7

    .line 63
    .line 64
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    instance-of p4, v0, Lcom/sun/jna/Structure;

    .line 69
    .line 70
    const/4 v2, 0x1

    .line 71
    if-eqz p4, :cond_9

    .line 72
    .line 73
    check-cast v0, Lcom/sun/jna/Structure;

    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/sun/jna/Structure;->autoWrite()V

    .line 76
    .line 77
    .line 78
    instance-of p1, v0, Lcom/sun/jna/Structure$ByValue;

    .line 79
    .line 80
    if-eqz p1, :cond_8

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-eqz p3, :cond_7

    .line 87
    .line 88
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object p4

    .line 92
    sget-object p5, Lcom/sun/jna/Function;->IS_VARARGS:Lcom/sun/jna/VarArgsChecker;

    .line 93
    .line 94
    invoke-virtual {p5, p3}, Lcom/sun/jna/VarArgsChecker;->isVarArgs(Ljava/lang/reflect/Method;)Z

    .line 95
    .line 96
    .line 97
    move-result p3

    .line 98
    if-eqz p3, :cond_6

    .line 99
    .line 100
    array-length p3, p4

    .line 101
    sub-int/2addr p3, v2

    .line 102
    if-ge p2, p3, :cond_5

    .line 103
    .line 104
    aget-object p1, p4, p2

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_5
    array-length p2, p4

    .line 108
    sub-int/2addr p2, v2

    .line 109
    aget-object p2, p4, p2

    .line 110
    .line 111
    invoke-virtual {p2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    const-class p3, Ljava/lang/Object;

    .line 116
    .line 117
    if-eq p2, p3, :cond_7

    .line 118
    .line 119
    move-object p1, p2

    .line 120
    goto :goto_2

    .line 121
    :cond_6
    aget-object p1, p4, p2

    .line 122
    .line 123
    :cond_7
    :goto_2
    const-class p2, Lcom/sun/jna/Structure$ByValue;

    .line 124
    .line 125
    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-eqz p1, :cond_8

    .line 130
    .line 131
    return-object v0

    .line 132
    :cond_8
    invoke-virtual {v0}, Lcom/sun/jna/Structure;->getPointer()Lcom/sun/jna/Pointer;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    return-object p1

    .line 137
    :cond_9
    instance-of p3, v0, Lcom/sun/jna/Callback;

    .line 138
    .line 139
    if-eqz p3, :cond_a

    .line 140
    .line 141
    check-cast v0, Lcom/sun/jna/Callback;

    .line 142
    .line 143
    invoke-static {v0}, Lcom/sun/jna/CallbackReference;->getFunctionPointer(Lcom/sun/jna/Callback;)Lcom/sun/jna/Pointer;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    return-object p1

    .line 148
    :cond_a
    instance-of p3, v0, Ljava/lang/String;

    .line 149
    .line 150
    const/4 p4, 0x0

    .line 151
    if-eqz p3, :cond_b

    .line 152
    .line 153
    new-instance p1, Lcom/sun/jna/NativeString;

    .line 154
    .line 155
    check-cast v0, Ljava/lang/String;

    .line 156
    .line 157
    invoke-direct {p1, v0, p4}, Lcom/sun/jna/NativeString;-><init>(Ljava/lang/String;Z)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1}, Lcom/sun/jna/NativeString;->getPointer()Lcom/sun/jna/Pointer;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    return-object p1

    .line 165
    :cond_b
    instance-of p3, v0, Lcom/sun/jna/WString;

    .line 166
    .line 167
    if-eqz p3, :cond_c

    .line 168
    .line 169
    new-instance p1, Lcom/sun/jna/NativeString;

    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    invoke-direct {p1, p2, v2}, Lcom/sun/jna/NativeString;-><init>(Ljava/lang/String;Z)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1}, Lcom/sun/jna/NativeString;->getPointer()Lcom/sun/jna/Pointer;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    return-object p1

    .line 183
    :cond_c
    instance-of p3, v0, Ljava/lang/Boolean;

    .line 184
    .line 185
    if-eqz p3, :cond_e

    .line 186
    .line 187
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 188
    .line 189
    invoke-virtual {p1, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    if-eqz p1, :cond_d

    .line 194
    .line 195
    sget-object p1, Lcom/sun/jna/Function;->INTEGER_TRUE:Ljava/lang/Integer;

    .line 196
    .line 197
    return-object p1

    .line 198
    :cond_d
    sget-object p1, Lcom/sun/jna/Function;->INTEGER_FALSE:Ljava/lang/Integer;

    .line 199
    .line 200
    return-object p1

    .line 201
    :cond_e
    const-class p3, [Ljava/lang/String;

    .line 202
    .line 203
    if-ne p3, p1, :cond_f

    .line 204
    .line 205
    new-instance p1, Lcom/sun/jna/StringArray;

    .line 206
    .line 207
    check-cast v0, [Ljava/lang/String;

    .line 208
    .line 209
    iget-object p2, p0, Lcom/sun/jna/Function;->encoding:Ljava/lang/String;

    .line 210
    .line 211
    invoke-direct {p1, v0, p2}, Lcom/sun/jna/StringArray;-><init>([Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    return-object p1

    .line 215
    :cond_f
    const-class p3, [Lcom/sun/jna/WString;

    .line 216
    .line 217
    if-ne p3, p1, :cond_10

    .line 218
    .line 219
    new-instance p1, Lcom/sun/jna/StringArray;

    .line 220
    .line 221
    check-cast v0, [Lcom/sun/jna/WString;

    .line 222
    .line 223
    invoke-direct {p1, v0}, Lcom/sun/jna/StringArray;-><init>([Lcom/sun/jna/WString;)V

    .line 224
    .line 225
    .line 226
    return-object p1

    .line 227
    :cond_10
    const-class p3, [Lcom/sun/jna/Pointer;

    .line 228
    .line 229
    if-ne p3, p1, :cond_11

    .line 230
    .line 231
    new-instance p1, Lcom/sun/jna/Function$PointerArray;

    .line 232
    .line 233
    check-cast v0, [Lcom/sun/jna/Pointer;

    .line 234
    .line 235
    invoke-direct {p1, v0}, Lcom/sun/jna/Function$PointerArray;-><init>([Lcom/sun/jna/Pointer;)V

    .line 236
    .line 237
    .line 238
    return-object p1

    .line 239
    :cond_11
    const-class p3, [Lcom/sun/jna/NativeMapped;

    .line 240
    .line 241
    invoke-virtual {p3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 242
    .line 243
    .line 244
    move-result p3

    .line 245
    if-eqz p3, :cond_12

    .line 246
    .line 247
    new-instance p1, Lcom/sun/jna/Function$NativeMappedArray;

    .line 248
    .line 249
    check-cast v0, [Lcom/sun/jna/NativeMapped;

    .line 250
    .line 251
    check-cast v0, [Lcom/sun/jna/NativeMapped;

    .line 252
    .line 253
    invoke-direct {p1, v0}, Lcom/sun/jna/Function$NativeMappedArray;-><init>([Lcom/sun/jna/NativeMapped;)V

    .line 254
    .line 255
    .line 256
    return-object p1

    .line 257
    :cond_12
    const-class p3, [Lcom/sun/jna/Structure;

    .line 258
    .line 259
    invoke-virtual {p3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 260
    .line 261
    .line 262
    move-result p3

    .line 263
    if-eqz p3, :cond_1b

    .line 264
    .line 265
    check-cast v0, [Lcom/sun/jna/Structure;

    .line 266
    .line 267
    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    const-class p3, Lcom/sun/jna/Structure$ByReference;

    .line 272
    .line 273
    invoke-virtual {p3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 274
    .line 275
    .line 276
    move-result p3

    .line 277
    if-eqz p6, :cond_15

    .line 278
    .line 279
    const-class p5, [Lcom/sun/jna/Structure$ByReference;

    .line 280
    .line 281
    invoke-virtual {p5, p6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 282
    .line 283
    .line 284
    move-result p5

    .line 285
    if-nez p5, :cond_15

    .line 286
    .line 287
    const-string p5, " declared Structure[] at parameter "

    .line 288
    .line 289
    const-string p6, "Function "

    .line 290
    .line 291
    if-nez p3, :cond_14

    .line 292
    .line 293
    move v3, p4

    .line 294
    :goto_3
    array-length v4, v0

    .line 295
    if-ge v3, v4, :cond_15

    .line 296
    .line 297
    aget-object v4, v0, v3

    .line 298
    .line 299
    instance-of v4, v4, Lcom/sun/jna/Structure$ByReference;

    .line 300
    .line 301
    if-nez v4, :cond_13

    .line 302
    .line 303
    add-int/lit8 v3, v3, 0x1

    .line 304
    .line 305
    goto :goto_3

    .line 306
    :cond_13
    new-instance p1, Ljava/lang/StringBuilder;

    .line 307
    .line 308
    invoke-direct {p1, p6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {p0}, Lcom/sun/jna/Function;->getName()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object p3

    .line 315
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    const-string p2, " but element "

    .line 325
    .line 326
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    const-string p2, " is of Structure.ByReference type"

    .line 330
    .line 331
    invoke-static {p1, p2, v3}, Lai/onnxruntime/a;->o(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    invoke-static {p1}, Lj1/i;->k(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    const/4 p1, 0x0

    .line 339
    return-object p1

    .line 340
    :cond_14
    new-instance p3, Ljava/lang/IllegalArgumentException;

    .line 341
    .line 342
    invoke-virtual {p0}, Lcom/sun/jna/Function;->getName()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object p4

    .line 346
    new-instance v0, Ljava/lang/StringBuilder;

    .line 347
    .line 348
    invoke-direct {v0, p6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    const-string p2, " but array of "

    .line 361
    .line 362
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    const-string p1, " was passed"

    .line 369
    .line 370
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object p1

    .line 377
    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    throw p3

    .line 381
    :cond_15
    if-eqz p3, :cond_18

    .line 382
    .line 383
    invoke-static {v0}, Lcom/sun/jna/Structure;->autoWrite([Lcom/sun/jna/Structure;)V

    .line 384
    .line 385
    .line 386
    array-length p1, v0

    .line 387
    add-int/2addr p1, v2

    .line 388
    new-array p1, p1, [Lcom/sun/jna/Pointer;

    .line 389
    .line 390
    :goto_4
    array-length p2, v0

    .line 391
    if-ge p4, p2, :cond_17

    .line 392
    .line 393
    aget-object p2, v0, p4

    .line 394
    .line 395
    if-eqz p2, :cond_16

    .line 396
    .line 397
    invoke-virtual {p2}, Lcom/sun/jna/Structure;->getPointer()Lcom/sun/jna/Pointer;

    .line 398
    .line 399
    .line 400
    move-result-object p2

    .line 401
    goto :goto_5

    .line 402
    :cond_16
    move-object p2, v1

    .line 403
    :goto_5
    aput-object p2, p1, p4

    .line 404
    .line 405
    add-int/lit8 p4, p4, 0x1

    .line 406
    .line 407
    goto :goto_4

    .line 408
    :cond_17
    new-instance p2, Lcom/sun/jna/Function$PointerArray;

    .line 409
    .line 410
    invoke-direct {p2, p1}, Lcom/sun/jna/Function$PointerArray;-><init>([Lcom/sun/jna/Pointer;)V

    .line 411
    .line 412
    .line 413
    return-object p2

    .line 414
    :cond_18
    array-length p2, v0

    .line 415
    if-eqz p2, :cond_1a

    .line 416
    .line 417
    aget-object p2, v0, p4

    .line 418
    .line 419
    if-nez p2, :cond_19

    .line 420
    .line 421
    invoke-static {p1}, Lcom/sun/jna/Structure;->newInstance(Ljava/lang/Class;)Lcom/sun/jna/Structure;

    .line 422
    .line 423
    .line 424
    move-result-object p1

    .line 425
    invoke-virtual {p1, v0}, Lcom/sun/jna/Structure;->toArray([Lcom/sun/jna/Structure;)[Lcom/sun/jna/Structure;

    .line 426
    .line 427
    .line 428
    aget-object p1, v0, p4

    .line 429
    .line 430
    invoke-virtual {p1}, Lcom/sun/jna/Structure;->getPointer()Lcom/sun/jna/Pointer;

    .line 431
    .line 432
    .line 433
    move-result-object p1

    .line 434
    return-object p1

    .line 435
    :cond_19
    invoke-static {v0}, Lcom/sun/jna/Structure;->autoWrite([Lcom/sun/jna/Structure;)V

    .line 436
    .line 437
    .line 438
    aget-object p1, v0, p4

    .line 439
    .line 440
    invoke-virtual {p1}, Lcom/sun/jna/Structure;->getPointer()Lcom/sun/jna/Pointer;

    .line 441
    .line 442
    .line 443
    move-result-object p1

    .line 444
    return-object p1

    .line 445
    :cond_1a
    const-string p1, "Structure array must have non-zero length"

    .line 446
    .line 447
    invoke-static {p1}, Lj1/i;->k(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    const/4 p1, 0x0

    .line 451
    return-object p1

    .line 452
    :cond_1b
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    .line 453
    .line 454
    .line 455
    move-result p3

    .line 456
    if-nez p3, :cond_1e

    .line 457
    .line 458
    if-eqz p5, :cond_1c

    .line 459
    .line 460
    goto :goto_6

    .line 461
    :cond_1c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    move-result-object p1

    .line 465
    invoke-static {p1}, Lcom/sun/jna/Native;->isSupportedNativeType(Ljava/lang/Class;)Z

    .line 466
    .line 467
    .line 468
    move-result p1

    .line 469
    if-eqz p1, :cond_1d

    .line 470
    .line 471
    :goto_6
    return-object v0

    .line 472
    :cond_1d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 473
    .line 474
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    move-result-object p3

    .line 478
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object p3

    .line 482
    invoke-virtual {p0}, Lcom/sun/jna/Function;->getName()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object p4

    .line 486
    new-instance p5, Ljava/lang/StringBuilder;

    .line 487
    .line 488
    const-string p6, "Unsupported argument type "

    .line 489
    .line 490
    invoke-direct {p5, p6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 494
    .line 495
    .line 496
    const-string p3, " at parameter "

    .line 497
    .line 498
    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    const-string p2, " of function "

    .line 505
    .line 506
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {p5, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object p2

    .line 516
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 517
    .line 518
    .line 519
    throw p1

    .line 520
    :cond_1e
    const-string p2, "Unsupported array argument type: "

    .line 521
    .line 522
    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    move-result-object p1

    .line 526
    invoke-static {p1, p2}, Landroidx/navigation/b;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    const/4 p1, 0x0

    .line 530
    return-object p1

    .line 531
    :cond_1f
    :goto_7
    return-object v0
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
.end method

.method public static fixedArgs(Ljava/lang/reflect/Method;)I
    .locals 1

    .line 1
    sget-object v0, Lcom/sun/jna/Function;->IS_VARARGS:Lcom/sun/jna/VarArgsChecker;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/sun/jna/VarArgsChecker;->fixedArgs(Ljava/lang/reflect/Method;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
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

.method public static getFunction(Lcom/sun/jna/Pointer;)Lcom/sun/jna/Function;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 13
    invoke-static {p0, v0, v1}, Lcom/sun/jna/Function;->getFunction(Lcom/sun/jna/Pointer;ILjava/lang/String;)Lcom/sun/jna/Function;

    move-result-object p0

    return-object p0
.end method

.method public static getFunction(Lcom/sun/jna/Pointer;I)Lcom/sun/jna/Function;
    .locals 1

    const/4 v0, 0x0

    .line 14
    invoke-static {p0, p1, v0}, Lcom/sun/jna/Function;->getFunction(Lcom/sun/jna/Pointer;ILjava/lang/String;)Lcom/sun/jna/Function;

    move-result-object p0

    return-object p0
.end method

.method public static getFunction(Lcom/sun/jna/Pointer;ILjava/lang/String;)Lcom/sun/jna/Function;
    .locals 1

    .line 15
    new-instance v0, Lcom/sun/jna/Function;

    invoke-direct {v0, p0, p1, p2}, Lcom/sun/jna/Function;-><init>(Lcom/sun/jna/Pointer;ILjava/lang/String;)V

    return-object v0
.end method

.method public static getFunction(Ljava/lang/String;Ljava/lang/String;)Lcom/sun/jna/Function;
    .locals 0

    .line 11
    invoke-static {p0}, Lcom/sun/jna/NativeLibrary;->getInstance(Ljava/lang/String;)Lcom/sun/jna/NativeLibrary;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/sun/jna/NativeLibrary;->getFunction(Ljava/lang/String;)Lcom/sun/jna/Function;

    move-result-object p0

    return-object p0
.end method

.method public static getFunction(Ljava/lang/String;Ljava/lang/String;I)Lcom/sun/jna/Function;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/sun/jna/NativeLibrary;->getInstance(Ljava/lang/String;)Lcom/sun/jna/NativeLibrary;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, p1, p2, v0}, Lcom/sun/jna/NativeLibrary;->getFunction(Ljava/lang/String;ILjava/lang/String;)Lcom/sun/jna/Function;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
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

.method public static getFunction(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/sun/jna/Function;
    .locals 0

    .line 12
    invoke-static {p0}, Lcom/sun/jna/NativeLibrary;->getInstance(Ljava/lang/String;)Lcom/sun/jna/NativeLibrary;

    move-result-object p0

    invoke-virtual {p0, p1, p2, p3}, Lcom/sun/jna/NativeLibrary;->getFunction(Ljava/lang/String;ILjava/lang/String;)Lcom/sun/jna/Function;

    move-result-object p0

    return-object p0
.end method

.method private invokePointer(I[Ljava/lang/Object;)Lcom/sun/jna/Pointer;
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/sun/jna/Pointer;->peer:J

    .line 2
    .line 3
    invoke-static {p0, v0, v1, p1, p2}, Lcom/sun/jna/Native;->invokePointer(Lcom/sun/jna/Function;JI[Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    cmp-long v0, p1, v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    return-object p1

    .line 15
    :cond_0
    new-instance v0, Lcom/sun/jna/Pointer;

    .line 16
    .line 17
    invoke-direct {v0, p1, p2}, Lcom/sun/jna/Pointer;-><init>(J)V

    .line 18
    .line 19
    .line 20
    return-object v0
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

.method private invokeString(I[Ljava/lang/Object;Z)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/sun/jna/Function;->invokePointer(I[Ljava/lang/Object;)Lcom/sun/jna/Pointer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, v0, v1}, Lcom/sun/jna/Pointer;->getWideString(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    iget-object p2, p0, Lcom/sun/jna/Function;->encoding:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p1, v0, v1, p2}, Lcom/sun/jna/Pointer;->getString(JLjava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_1
    const/4 p1, 0x0

    .line 24
    return-object p1
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

.method private isPrimitiveArray(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
    .line 21
    .line 22
    .line 23
.end method

.method public static isVarArgs(Ljava/lang/reflect/Method;)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/sun/jna/Function;->IS_VARARGS:Lcom/sun/jna/VarArgsChecker;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/sun/jna/VarArgsChecker;->isVarArgs(Ljava/lang/reflect/Method;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
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

.method public static valueOf(Z)Ljava/lang/Boolean;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 7
    .line 8
    return-object p0
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
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-ne v2, v3, :cond_2

    .line 18
    .line 19
    check-cast p1, Lcom/sun/jna/Function;

    .line 20
    .line 21
    iget v2, p1, Lcom/sun/jna/Function;->callFlags:I

    .line 22
    .line 23
    iget v3, p0, Lcom/sun/jna/Function;->callFlags:I

    .line 24
    .line 25
    if-ne v2, v3, :cond_2

    .line 26
    .line 27
    iget-object v2, p1, Lcom/sun/jna/Function;->options:Ljava/util/Map;

    .line 28
    .line 29
    iget-object v3, p0, Lcom/sun/jna/Function;->options:Ljava/util/Map;

    .line 30
    .line 31
    invoke-interface {v2, v3}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    iget-wide v2, p1, Lcom/sun/jna/Pointer;->peer:J

    .line 38
    .line 39
    iget-wide v4, p0, Lcom/sun/jna/Pointer;->peer:J

    .line 40
    .line 41
    cmp-long p1, v2, v4

    .line 42
    .line 43
    if-nez p1, :cond_2

    .line 44
    .line 45
    return v0

    .line 46
    :cond_2
    return v1
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

.method public getCallingConvention()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/sun/jna/Function;->callFlags:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x3f

    .line 4
    .line 5
    return v0
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

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/sun/jna/Function;->functionName:Ljava/lang/String;

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

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/sun/jna/Function;->callFlags:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/sun/jna/Function;->options:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/Map;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v1, v0

    .line 10
    invoke-super {p0}, Lcom/sun/jna/Pointer;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    add-int/2addr v1, v0

    .line 15
    return v1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public invoke(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 520
    iget-object v0, p0, Lcom/sun/jna/Function;->options:Ljava/util/Map;

    invoke-virtual {p0, p1, p2, v0}, Lcom/sun/jna/Function;->invoke(Ljava/lang/Class;[Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public invoke(Ljava/lang/Class;[Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 477
    const-string v0, "invoking-method"

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/reflect/Method;

    if-eqz v2, :cond_0

    .line 478
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    :goto_0
    move-object v1, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v3, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 479
    :goto_1
    invoke-virtual/range {v1 .. v6}, Lcom/sun/jna/Function;->invoke(Ljava/lang/reflect/Method;[Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public invoke(Ljava/lang/reflect/Method;[Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "[",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 480
    new-array v1, v0, [Ljava/lang/Object;

    if-eqz p4, :cond_1

    .line 481
    array-length v1, p4

    const/16 v2, 0x100

    if-gt v1, v2, :cond_0

    .line 482
    array-length v1, p4

    new-array v2, v1, [Ljava/lang/Object;

    .line 483
    invoke-static {p4, v0, v2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 484
    :cond_0
    const-string p1, "Maximum argument count is 256"

    invoke-static {p1}, Landroidx/navigation/b;->g(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1

    :cond_1
    move-object v2, v1

    .line 485
    :goto_0
    const-string v1, "type-mapper"

    invoke-interface {p5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/sun/jna/TypeMapper;

    .line 486
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v3, "allow-objects"

    invoke-interface {p5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    invoke-virtual {v1, p5}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v6

    .line 487
    array-length p5, v2

    if-lez p5, :cond_2

    if-eqz p1, :cond_2

    invoke-static {p1}, Lcom/sun/jna/Function;->isVarArgs(Ljava/lang/reflect/Method;)Z

    move-result p5

    goto :goto_1

    :cond_2
    move p5, v0

    .line 488
    :goto_1
    array-length v1, v2

    if-lez v1, :cond_3

    if-eqz p1, :cond_3

    invoke-static {p1}, Lcom/sun/jna/Function;->fixedArgs(Ljava/lang/reflect/Method;)I

    move-result v1

    move v8, v1

    goto :goto_2

    :cond_3
    move v8, v0

    :goto_2
    move v3, v0

    .line 489
    :goto_3
    array-length v1, v2

    const/4 v4, 0x0

    if-ge v3, v1, :cond_6

    if-eqz p1, :cond_4

    if-eqz p5, :cond_5

    .line 490
    array-length v1, p2

    add-int/lit8 v1, v1, -0x1

    if-lt v3, v1, :cond_5

    array-length v1, p2

    add-int/lit8 v1, v1, -0x1

    aget-object v1, p2, v1

    .line 491
    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v4

    :cond_4
    :goto_4
    move-object v1, p0

    move-object v7, v4

    move-object v4, p1

    goto :goto_5

    :cond_5
    aget-object v4, p2, v3

    goto :goto_4

    .line 492
    :goto_5
    invoke-direct/range {v1 .. v7}, Lcom/sun/jna/Function;->convertArgument([Ljava/lang/Object;ILjava/lang/reflect/Method;Lcom/sun/jna/TypeMapper;ZLjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    move v9, v3

    move-object v3, v2

    move-object v2, v4

    move v4, v9

    aput-object p1, v3, v4

    add-int/lit8 p1, v4, 0x1

    move-object v9, v3

    move v3, p1

    move-object p1, v2

    move-object v2, v9

    goto :goto_3

    :cond_6
    move-object v1, p0

    move-object v3, v2

    move-object v2, p1

    .line 493
    const-class p1, Lcom/sun/jna/NativeMapped;

    invoke-virtual {p1, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 494
    invoke-static {p3}, Lcom/sun/jna/NativeMappedConverter;->getInstance(Ljava/lang/Class;)Lcom/sun/jna/NativeMappedConverter;

    move-result-object v4

    .line 495
    invoke-virtual {v4}, Lcom/sun/jna/NativeMappedConverter;->nativeType()Ljava/lang/Class;

    move-result-object p1

    goto :goto_6

    :cond_7
    if-eqz v5, :cond_8

    .line 496
    invoke-interface {v5, p3}, Lcom/sun/jna/TypeMapper;->getFromNativeConverter(Ljava/lang/Class;)Lcom/sun/jna/FromNativeConverter;

    move-result-object v4

    if-eqz v4, :cond_8

    .line 497
    invoke-interface {v4}, Lcom/sun/jna/FromNativeConverter;->nativeType()Ljava/lang/Class;

    move-result-object p1

    goto :goto_6

    :cond_8
    move-object p1, p3

    .line 498
    :goto_6
    invoke-virtual {p0, v3, p1, v6, v8}, Lcom/sun/jna/Function;->invoke([Ljava/lang/Object;Ljava/lang/Class;ZI)Ljava/lang/Object;

    move-result-object p1

    if-eqz v4, :cond_a

    if-eqz v2, :cond_9

    .line 499
    new-instance p2, Lcom/sun/jna/MethodResultContext;

    invoke-direct {p2, p3, p0, p4, v2}, Lcom/sun/jna/MethodResultContext;-><init>(Ljava/lang/Class;Lcom/sun/jna/Function;[Ljava/lang/Object;Ljava/lang/reflect/Method;)V

    goto :goto_7

    .line 500
    :cond_9
    new-instance p2, Lcom/sun/jna/FunctionResultContext;

    invoke-direct {p2, p3, p0, p4}, Lcom/sun/jna/FunctionResultContext;-><init>(Ljava/lang/Class;Lcom/sun/jna/Function;[Ljava/lang/Object;)V

    .line 501
    :goto_7
    invoke-interface {v4, p1, p2}, Lcom/sun/jna/FromNativeConverter;->fromNative(Ljava/lang/Object;Lcom/sun/jna/FromNativeContext;)Ljava/lang/Object;

    move-result-object p1

    :cond_a
    if-eqz p4, :cond_f

    move p2, v0

    .line 502
    :goto_8
    array-length p3, p4

    if-ge p2, p3, :cond_f

    .line 503
    aget-object p3, p4, p2

    if-nez p3, :cond_b

    goto :goto_a

    .line 504
    :cond_b
    instance-of p5, p3, Lcom/sun/jna/Structure;

    if-eqz p5, :cond_c

    .line 505
    instance-of p5, p3, Lcom/sun/jna/Structure$ByValue;

    if-nez p5, :cond_e

    .line 506
    check-cast p3, Lcom/sun/jna/Structure;

    invoke-virtual {p3}, Lcom/sun/jna/Structure;->autoRead()V

    goto :goto_a

    .line 507
    :cond_c
    aget-object p5, v3, p2

    instance-of v2, p5, Lcom/sun/jna/Function$PostCallRead;

    if-eqz v2, :cond_d

    .line 508
    check-cast p5, Lcom/sun/jna/Function$PostCallRead;

    invoke-interface {p5}, Lcom/sun/jna/Function$PostCallRead;->read()V

    .line 509
    aget-object p5, v3, p2

    instance-of v2, p5, Lcom/sun/jna/Function$PointerArray;

    if-eqz v2, :cond_e

    .line 510
    check-cast p5, Lcom/sun/jna/Function$PointerArray;

    .line 511
    const-class v2, [Lcom/sun/jna/Structure$ByReference;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_e

    .line 512
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v2

    .line 513
    check-cast p3, [Lcom/sun/jna/Structure;

    move v4, v0

    .line 514
    :goto_9
    array-length v5, p3

    if-ge v4, v5, :cond_e

    .line 515
    sget v5, Lcom/sun/jna/Native;->POINTER_SIZE:I

    mul-int/2addr v5, v4

    int-to-long v5, v5

    invoke-virtual {p5, v5, v6}, Lcom/sun/jna/Memory;->getPointer(J)Lcom/sun/jna/Pointer;

    move-result-object v5

    .line 516
    aget-object v6, p3, v4

    invoke-static {v2, v6, v5}, Lcom/sun/jna/Structure;->updateStructureByReference(Ljava/lang/Class;Lcom/sun/jna/Structure;Lcom/sun/jna/Pointer;)Lcom/sun/jna/Structure;

    move-result-object v5

    aput-object v5, p3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    .line 517
    :cond_d
    const-class p5, [Lcom/sun/jna/Structure;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p5, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p5

    if-eqz p5, :cond_e

    .line 518
    check-cast p3, [Lcom/sun/jna/Structure;

    invoke-static {p3}, Lcom/sun/jna/Structure;->autoRead([Lcom/sun/jna/Structure;)V

    :cond_e
    :goto_a
    add-int/lit8 p2, p2, 0x1

    goto :goto_8

    :cond_f
    return-object p1
.end method

.method public invoke([Ljava/lang/Object;Ljava/lang/Class;Z)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;Z)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 519
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/sun/jna/Function;->invoke([Ljava/lang/Object;Ljava/lang/Class;ZI)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public invoke([Ljava/lang/Object;Ljava/lang/Class;ZI)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;ZI)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/sun/jna/Function;->callFlags:I

    .line 2
    .line 3
    and-int/lit8 p4, p4, 0x3

    .line 4
    .line 5
    shl-int/lit8 p4, p4, 0x7

    .line 6
    .line 7
    or-int v4, v0, p4

    .line 8
    .line 9
    const/4 p4, 0x0

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    if-eq p2, v0, :cond_0

    .line 15
    .line 16
    const-class v0, Ljava/lang/Void;

    .line 17
    .line 18
    if-ne p2, v0, :cond_1

    .line 19
    .line 20
    :cond_0
    move-object v0, p0

    .line 21
    move-object v5, p1

    .line 22
    goto/16 :goto_c

    .line 23
    .line 24
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    const/4 v2, 0x0

    .line 28
    if-eq p2, v0, :cond_2

    .line 29
    .line 30
    const-class v0, Ljava/lang/Boolean;

    .line 31
    .line 32
    if-ne p2, v0, :cond_3

    .line 33
    .line 34
    :cond_2
    move-object v0, p0

    .line 35
    move-object v5, p1

    .line 36
    goto/16 :goto_a

    .line 37
    .line 38
    :cond_3
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 39
    .line 40
    if-eq p2, v0, :cond_4

    .line 41
    .line 42
    const-class v0, Ljava/lang/Byte;

    .line 43
    .line 44
    if-ne p2, v0, :cond_5

    .line 45
    .line 46
    :cond_4
    move-object v0, p0

    .line 47
    move-object v5, p1

    .line 48
    goto/16 :goto_9

    .line 49
    .line 50
    :cond_5
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 51
    .line 52
    if-eq p2, v0, :cond_6

    .line 53
    .line 54
    const-class v0, Ljava/lang/Short;

    .line 55
    .line 56
    if-ne p2, v0, :cond_7

    .line 57
    .line 58
    :cond_6
    move-object v0, p0

    .line 59
    move-object v5, p1

    .line 60
    goto/16 :goto_8

    .line 61
    .line 62
    :cond_7
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 63
    .line 64
    if-eq p2, v0, :cond_8

    .line 65
    .line 66
    const-class v0, Ljava/lang/Character;

    .line 67
    .line 68
    if-ne p2, v0, :cond_9

    .line 69
    .line 70
    :cond_8
    move-object v0, p0

    .line 71
    move-object v5, p1

    .line 72
    goto/16 :goto_7

    .line 73
    .line 74
    :cond_9
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 75
    .line 76
    if-eq p2, v0, :cond_a

    .line 77
    .line 78
    const-class v0, Ljava/lang/Integer;

    .line 79
    .line 80
    if-ne p2, v0, :cond_b

    .line 81
    .line 82
    :cond_a
    move-object v0, p0

    .line 83
    move-object v5, p1

    .line 84
    goto/16 :goto_6

    .line 85
    .line 86
    :cond_b
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 87
    .line 88
    if-eq p2, v0, :cond_c

    .line 89
    .line 90
    const-class v0, Ljava/lang/Long;

    .line 91
    .line 92
    if-ne p2, v0, :cond_d

    .line 93
    .line 94
    :cond_c
    move-object v0, p0

    .line 95
    move-object v5, p1

    .line 96
    goto/16 :goto_5

    .line 97
    .line 98
    :cond_d
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 99
    .line 100
    if-eq p2, v0, :cond_e

    .line 101
    .line 102
    const-class v0, Ljava/lang/Float;

    .line 103
    .line 104
    if-ne p2, v0, :cond_f

    .line 105
    .line 106
    :cond_e
    move-object v0, p0

    .line 107
    move-object v5, p1

    .line 108
    goto/16 :goto_4

    .line 109
    .line 110
    :cond_f
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 111
    .line 112
    if-eq p2, v0, :cond_10

    .line 113
    .line 114
    const-class v0, Ljava/lang/Double;

    .line 115
    .line 116
    if-ne p2, v0, :cond_11

    .line 117
    .line 118
    :cond_10
    move-object v0, p0

    .line 119
    move-object v5, p1

    .line 120
    goto/16 :goto_3

    .line 121
    .line 122
    :cond_11
    const-class v0, Ljava/lang/String;

    .line 123
    .line 124
    if-ne p2, v0, :cond_12

    .line 125
    .line 126
    invoke-direct {p0, v4, p1, v2}, Lcom/sun/jna/Function;->invokeString(I[Ljava/lang/Object;Z)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    return-object p1

    .line 131
    :cond_12
    const-class v0, Lcom/sun/jna/WString;

    .line 132
    .line 133
    if-ne p2, v0, :cond_14

    .line 134
    .line 135
    invoke-direct {p0, v4, p1, v1}, Lcom/sun/jna/Function;->invokeString(I[Ljava/lang/Object;Z)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    if-eqz p1, :cond_13

    .line 140
    .line 141
    new-instance p2, Lcom/sun/jna/WString;

    .line 142
    .line 143
    invoke-direct {p2, p1}, Lcom/sun/jna/WString;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    return-object p2

    .line 147
    :cond_13
    move-object v0, p0

    .line 148
    goto/16 :goto_1

    .line 149
    .line 150
    :cond_14
    const-class v0, Lcom/sun/jna/Pointer;

    .line 151
    .line 152
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_15

    .line 157
    .line 158
    invoke-direct {p0, v4, p1}, Lcom/sun/jna/Function;->invokePointer(I[Ljava/lang/Object;)Lcom/sun/jna/Pointer;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    return-object p1

    .line 163
    :cond_15
    const-class v0, Lcom/sun/jna/Structure;

    .line 164
    .line 165
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_18

    .line 170
    .line 171
    const-class p3, Lcom/sun/jna/Structure$ByValue;

    .line 172
    .line 173
    invoke-virtual {p3, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 174
    .line 175
    .line 176
    move-result p3

    .line 177
    if-eqz p3, :cond_16

    .line 178
    .line 179
    iget-wide v2, p0, Lcom/sun/jna/Pointer;->peer:J

    .line 180
    .line 181
    invoke-static {p2}, Lcom/sun/jna/Structure;->newInstance(Ljava/lang/Class;)Lcom/sun/jna/Structure;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    move-object v1, p0

    .line 186
    move-object v5, p1

    .line 187
    invoke-static/range {v1 .. v6}, Lcom/sun/jna/Native;->invokeStructure(Lcom/sun/jna/Function;JI[Ljava/lang/Object;Lcom/sun/jna/Structure;)Lcom/sun/jna/Structure;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    move-object v0, v1

    .line 192
    invoke-virtual {p1}, Lcom/sun/jna/Structure;->autoRead()V

    .line 193
    .line 194
    .line 195
    return-object p1

    .line 196
    :cond_16
    move-object v0, p0

    .line 197
    move-object v5, p1

    .line 198
    invoke-direct {p0, v4, v5}, Lcom/sun/jna/Function;->invokePointer(I[Ljava/lang/Object;)Lcom/sun/jna/Pointer;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    if-eqz p1, :cond_17

    .line 203
    .line 204
    invoke-static {p2, p1}, Lcom/sun/jna/Structure;->newInstance(Ljava/lang/Class;Lcom/sun/jna/Pointer;)Lcom/sun/jna/Structure;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-virtual {p1}, Lcom/sun/jna/Structure;->conditionalAutoRead()V

    .line 209
    .line 210
    .line 211
    :cond_17
    return-object p1

    .line 212
    :cond_18
    move-object v0, p0

    .line 213
    move-object v5, p1

    .line 214
    const-class p1, Lcom/sun/jna/Callback;

    .line 215
    .line 216
    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    if-eqz p1, :cond_1a

    .line 221
    .line 222
    invoke-direct {p0, v4, v5}, Lcom/sun/jna/Function;->invokePointer(I[Ljava/lang/Object;)Lcom/sun/jna/Pointer;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    if-eqz p1, :cond_19

    .line 227
    .line 228
    invoke-static {p2, p1}, Lcom/sun/jna/CallbackReference;->getCallback(Ljava/lang/Class;Lcom/sun/jna/Pointer;)Lcom/sun/jna/Callback;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    :cond_19
    return-object p1

    .line 233
    :cond_1a
    const-class p1, [Ljava/lang/String;

    .line 234
    .line 235
    const-wide/16 v6, 0x0

    .line 236
    .line 237
    if-ne p2, p1, :cond_1b

    .line 238
    .line 239
    invoke-direct {p0, v4, v5}, Lcom/sun/jna/Function;->invokePointer(I[Ljava/lang/Object;)Lcom/sun/jna/Pointer;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    if-eqz p1, :cond_1e

    .line 244
    .line 245
    iget-object p2, v0, Lcom/sun/jna/Function;->encoding:Ljava/lang/String;

    .line 246
    .line 247
    invoke-virtual {p1, v6, v7, p2}, Lcom/sun/jna/Pointer;->getStringArray(JLjava/lang/String;)[Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    return-object p1

    .line 252
    :cond_1b
    const-class p1, [Lcom/sun/jna/WString;

    .line 253
    .line 254
    if-ne p2, p1, :cond_1d

    .line 255
    .line 256
    invoke-direct {p0, v4, v5}, Lcom/sun/jna/Function;->invokePointer(I[Ljava/lang/Object;)Lcom/sun/jna/Pointer;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    if-eqz p1, :cond_1e

    .line 261
    .line 262
    invoke-virtual {p1, v6, v7}, Lcom/sun/jna/Pointer;->getWideStringArray(J)[Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    array-length p2, p1

    .line 267
    new-array p2, p2, [Lcom/sun/jna/WString;

    .line 268
    .line 269
    :goto_0
    array-length p3, p1

    .line 270
    if-ge v2, p3, :cond_1c

    .line 271
    .line 272
    new-instance p3, Lcom/sun/jna/WString;

    .line 273
    .line 274
    aget-object p4, p1, v2

    .line 275
    .line 276
    invoke-direct {p3, p4}, Lcom/sun/jna/WString;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    aput-object p3, p2, v2

    .line 280
    .line 281
    add-int/lit8 v2, v2, 0x1

    .line 282
    .line 283
    goto :goto_0

    .line 284
    :cond_1c
    return-object p2

    .line 285
    :cond_1d
    const-class p1, [Lcom/sun/jna/Pointer;

    .line 286
    .line 287
    if-ne p2, p1, :cond_1f

    .line 288
    .line 289
    invoke-direct {p0, v4, v5}, Lcom/sun/jna/Function;->invokePointer(I[Ljava/lang/Object;)Lcom/sun/jna/Pointer;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    if-eqz p1, :cond_1e

    .line 294
    .line 295
    invoke-virtual {p1, v6, v7}, Lcom/sun/jna/Pointer;->getPointerArray(J)[Lcom/sun/jna/Pointer;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    return-object p1

    .line 300
    :cond_1e
    :goto_1
    return-object p4

    .line 301
    :cond_1f
    if-eqz p3, :cond_22

    .line 302
    .line 303
    iget-wide p3, v0, Lcom/sun/jna/Pointer;->peer:J

    .line 304
    .line 305
    invoke-static {p0, p3, p4, v4, v5}, Lcom/sun/jna/Native;->invokeObject(Lcom/sun/jna/Function;JI[Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    if-eqz p1, :cond_21

    .line 310
    .line 311
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    move-result-object p3

    .line 315
    invoke-virtual {p2, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 316
    .line 317
    .line 318
    move-result p3

    .line 319
    if-eqz p3, :cond_20

    .line 320
    .line 321
    goto :goto_2

    .line 322
    :cond_20
    new-instance p3, Ljava/lang/ClassCastException;

    .line 323
    .line 324
    new-instance p4, Ljava/lang/StringBuilder;

    .line 325
    .line 326
    const-string v1, "Return type "

    .line 327
    .line 328
    invoke-direct {p4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    const-string p2, " does not match result "

    .line 339
    .line 340
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object p1

    .line 350
    invoke-direct {p3, p1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    throw p3

    .line 354
    :cond_21
    :goto_2
    return-object p1

    .line 355
    :cond_22
    new-instance p1, Ljava/lang/StringBuilder;

    .line 356
    .line 357
    const-string p3, "Unsupported return type "

    .line 358
    .line 359
    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    const-string p2, " in function "

    .line 366
    .line 367
    invoke-virtual {p0}, Lcom/sun/jna/Function;->getName()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object p3

    .line 371
    invoke-static {p1, p2, p3}, Landroidx/navigation/b;->s(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    const/4 p1, 0x0

    .line 375
    return-object p1

    .line 376
    :goto_3
    iget-wide p1, v0, Lcom/sun/jna/Pointer;->peer:J

    .line 377
    .line 378
    invoke-static {p0, p1, p2, v4, v5}, Lcom/sun/jna/Native;->invokeDouble(Lcom/sun/jna/Function;JI[Ljava/lang/Object;)D

    .line 379
    .line 380
    .line 381
    move-result-wide p1

    .line 382
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 383
    .line 384
    .line 385
    move-result-object p1

    .line 386
    return-object p1

    .line 387
    :goto_4
    iget-wide p1, v0, Lcom/sun/jna/Pointer;->peer:J

    .line 388
    .line 389
    invoke-static {p0, p1, p2, v4, v5}, Lcom/sun/jna/Native;->invokeFloat(Lcom/sun/jna/Function;JI[Ljava/lang/Object;)F

    .line 390
    .line 391
    .line 392
    move-result p1

    .line 393
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 394
    .line 395
    .line 396
    move-result-object p1

    .line 397
    return-object p1

    .line 398
    :goto_5
    iget-wide p1, v0, Lcom/sun/jna/Pointer;->peer:J

    .line 399
    .line 400
    invoke-static {p0, p1, p2, v4, v5}, Lcom/sun/jna/Native;->invokeLong(Lcom/sun/jna/Function;JI[Ljava/lang/Object;)J

    .line 401
    .line 402
    .line 403
    move-result-wide p1

    .line 404
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 405
    .line 406
    .line 407
    move-result-object p1

    .line 408
    return-object p1

    .line 409
    :goto_6
    iget-wide p1, v0, Lcom/sun/jna/Pointer;->peer:J

    .line 410
    .line 411
    invoke-static {p0, p1, p2, v4, v5}, Lcom/sun/jna/Native;->invokeInt(Lcom/sun/jna/Function;JI[Ljava/lang/Object;)I

    .line 412
    .line 413
    .line 414
    move-result p1

    .line 415
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 416
    .line 417
    .line 418
    move-result-object p1

    .line 419
    return-object p1

    .line 420
    :goto_7
    iget-wide p1, v0, Lcom/sun/jna/Pointer;->peer:J

    .line 421
    .line 422
    invoke-static {p0, p1, p2, v4, v5}, Lcom/sun/jna/Native;->invokeInt(Lcom/sun/jna/Function;JI[Ljava/lang/Object;)I

    .line 423
    .line 424
    .line 425
    move-result p1

    .line 426
    int-to-char p1, p1

    .line 427
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 428
    .line 429
    .line 430
    move-result-object p1

    .line 431
    return-object p1

    .line 432
    :goto_8
    iget-wide p1, v0, Lcom/sun/jna/Pointer;->peer:J

    .line 433
    .line 434
    invoke-static {p0, p1, p2, v4, v5}, Lcom/sun/jna/Native;->invokeInt(Lcom/sun/jna/Function;JI[Ljava/lang/Object;)I

    .line 435
    .line 436
    .line 437
    move-result p1

    .line 438
    int-to-short p1, p1

    .line 439
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 440
    .line 441
    .line 442
    move-result-object p1

    .line 443
    return-object p1

    .line 444
    :goto_9
    iget-wide p1, v0, Lcom/sun/jna/Pointer;->peer:J

    .line 445
    .line 446
    invoke-static {p0, p1, p2, v4, v5}, Lcom/sun/jna/Native;->invokeInt(Lcom/sun/jna/Function;JI[Ljava/lang/Object;)I

    .line 447
    .line 448
    .line 449
    move-result p1

    .line 450
    int-to-byte p1, p1

    .line 451
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 452
    .line 453
    .line 454
    move-result-object p1

    .line 455
    return-object p1

    .line 456
    :goto_a
    iget-wide p1, v0, Lcom/sun/jna/Pointer;->peer:J

    .line 457
    .line 458
    invoke-static {p0, p1, p2, v4, v5}, Lcom/sun/jna/Native;->invokeInt(Lcom/sun/jna/Function;JI[Ljava/lang/Object;)I

    .line 459
    .line 460
    .line 461
    move-result p1

    .line 462
    if-eqz p1, :cond_23

    .line 463
    .line 464
    goto :goto_b

    .line 465
    :cond_23
    move v1, v2

    .line 466
    :goto_b
    invoke-static {v1}, Lcom/sun/jna/Function;->valueOf(Z)Ljava/lang/Boolean;

    .line 467
    .line 468
    .line 469
    move-result-object p1

    .line 470
    return-object p1

    .line 471
    :goto_c
    iget-wide p1, v0, Lcom/sun/jna/Pointer;->peer:J

    .line 472
    .line 473
    invoke-static {p0, p1, p2, v4, v5}, Lcom/sun/jna/Native;->invokeVoid(Lcom/sun/jna/Function;JI[Ljava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    return-object p4
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
.end method

.method public invoke([Ljava/lang/Object;)V
    .locals 1

    .line 521
    const-class v0, Ljava/lang/Void;

    invoke-virtual {p0, v0, p1}, Lcom/sun/jna/Function;->invoke(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public invokeDouble([Ljava/lang/Object;)D
    .locals 2

    .line 1
    const-class v0, Ljava/lang/Double;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lcom/sun/jna/Function;->invoke(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Double;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
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

.method public invokeFloat([Ljava/lang/Object;)F
    .locals 1

    .line 1
    const-class v0, Ljava/lang/Float;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lcom/sun/jna/Function;->invoke(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Float;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
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

.method public invokeInt([Ljava/lang/Object;)I
    .locals 1

    .line 1
    const-class v0, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lcom/sun/jna/Function;->invoke(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
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

.method public invokeLong([Ljava/lang/Object;)J
    .locals 2

    .line 1
    const-class v0, Ljava/lang/Long;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lcom/sun/jna/Function;->invoke(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Long;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
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

.method public invokeObject([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lcom/sun/jna/Function;->invoke(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method public invokePointer([Ljava/lang/Object;)Lcom/sun/jna/Pointer;
    .locals 1

    .line 21
    const-class v0, Lcom/sun/jna/Pointer;

    invoke-virtual {p0, v0, p1}, Lcom/sun/jna/Function;->invoke(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sun/jna/Pointer;

    return-object p1
.end method

.method public invokeString([Ljava/lang/Object;Z)Ljava/lang/String;
    .locals 0

    if-eqz p2, :cond_0

    .line 25
    const-class p2, Lcom/sun/jna/WString;

    goto :goto_0

    :cond_0
    const-class p2, Ljava/lang/String;

    :goto_0
    invoke-virtual {p0, p2, p1}, Lcom/sun/jna/Function;->invoke(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public invokeVoid([Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-class v0, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lcom/sun/jna/Function;->invoke(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

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
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/sun/jna/Function;->library:Lcom/sun/jna/NativeLibrary;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "native function "

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lcom/sun/jna/Function;->functionName:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "("

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/sun/jna/Function;->library:Lcom/sun/jna/NativeLibrary;

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/sun/jna/NativeLibrary;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ")@0x"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-wide v1, p0, Lcom/sun/jna/Pointer;->peer:J

    .line 37
    .line 38
    invoke-static {v1, v2}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0

    .line 50
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v1, "native function@0x"

    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-wide v1, p0, Lcom/sun/jna/Pointer;->peer:J

    .line 58
    .line 59
    invoke-static {v1, v2}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method
