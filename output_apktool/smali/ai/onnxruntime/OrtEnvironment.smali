.class public final Lai/onnxruntime/OrtEnvironment;
.super Ljava/lang/Object;
.source "r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lai/onnxruntime/OrtEnvironment$ThreadingOptions;,
        Lai/onnxruntime/OrtEnvironment$OrtEnvCloser;,
        Lai/onnxruntime/OrtEnvironment$OrtCompiledModelCompatibility;
    }
.end annotation


# static fields
.field public static final DEFAULT_NAME:Ljava/lang/String; = "ort-java"

.field private static volatile INSTANCE:Lai/onnxruntime/OrtEnvironment;

.field private static volatile curLogLevel:Lai/onnxruntime/OrtLoggingLevel;

.field private static volatile curLoggingName:Ljava/lang/String;

.field private static final logger:Ljava/util/logging/Logger;


# instance fields
.field final defaultAllocator:Lai/onnxruntime/OrtAllocator;

.field final nativeHandle:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lai/onnxruntime/OrtEnvironment;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lai/onnxruntime/OrtEnvironment;->logger:Ljava/util/logging/Logger;

    .line 12
    .line 13
    :try_start_0
    invoke-static {}, Lai/onnxruntime/OnnxRuntime;->init()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception v0

    .line 18
    const-string v1, "Failed to load onnx-runtime library"

    .line 19
    .line 20
    invoke-static {v1, v0}, Lai/onnxruntime/b;->o(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    return-void
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

.method private constructor <init>()V
    .locals 2

    .line 60
    sget-object v0, Lai/onnxruntime/OrtLoggingLevel;->ORT_LOGGING_LEVEL_WARNING:Lai/onnxruntime/OrtLoggingLevel;

    const-string v1, "java-default"

    invoke-direct {p0, v0, v1}, Lai/onnxruntime/OrtEnvironment;-><init>(Lai/onnxruntime/OrtLoggingLevel;Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Lai/onnxruntime/OrtLoggingLevel;Ljava/lang/String;)V
    .locals 5

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    sget-wide v0, Lai/onnxruntime/OnnxRuntime;->ortApiHandle:J

    invoke-virtual {p1}, Lai/onnxruntime/OrtLoggingLevel;->getValue()I

    move-result p1

    invoke-static {v0, v1, p1, p2}, Lai/onnxruntime/OrtEnvironment;->createHandle(JILjava/lang/String;)J

    move-result-wide p1

    iput-wide p1, p0, Lai/onnxruntime/OrtEnvironment;->nativeHandle:J

    .line 57
    new-instance v0, Lai/onnxruntime/OrtAllocator;

    sget-wide v1, Lai/onnxruntime/OnnxRuntime;->ortApiHandle:J

    invoke-static {v1, v2}, Lai/onnxruntime/OrtEnvironment;->getDefaultAllocator(J)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lai/onnxruntime/OrtAllocator;-><init>(JZ)V

    iput-object v0, p0, Lai/onnxruntime/OrtEnvironment;->defaultAllocator:Lai/onnxruntime/OrtAllocator;

    .line 58
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lai/onnxruntime/OrtEnvironment$OrtEnvCloser;

    sget-wide v3, Lai/onnxruntime/OnnxRuntime;->ortApiHandle:J

    invoke-direct {v2, v3, v4, p1, p2}, Lai/onnxruntime/OrtEnvironment$OrtEnvCloser;-><init>(JJ)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/Runtime;->addShutdownHook(Ljava/lang/Thread;)V

    return-void
.end method

.method private constructor <init>(Lai/onnxruntime/OrtLoggingLevel;Ljava/lang/String;Lai/onnxruntime/OrtEnvironment$ThreadingOptions;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-wide v0, Lai/onnxruntime/OnnxRuntime;->ortApiHandle:J

    .line 5
    .line 6
    invoke-virtual {p1}, Lai/onnxruntime/OrtLoggingLevel;->getValue()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    invoke-static {p3}, Lai/onnxruntime/OrtEnvironment$ThreadingOptions;->b(Lai/onnxruntime/OrtEnvironment$ThreadingOptions;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v4

    .line 14
    move-object v3, p2

    .line 15
    invoke-static/range {v0 .. v5}, Lai/onnxruntime/OrtEnvironment;->createHandle(JILjava/lang/String;J)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    iput-wide p1, p0, Lai/onnxruntime/OrtEnvironment;->nativeHandle:J

    .line 20
    .line 21
    new-instance p3, Lai/onnxruntime/OrtAllocator;

    .line 22
    .line 23
    sget-wide v0, Lai/onnxruntime/OnnxRuntime;->ortApiHandle:J

    .line 24
    .line 25
    invoke-static {v0, v1}, Lai/onnxruntime/OrtEnvironment;->getDefaultAllocator(J)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-direct {p3, v0, v1, v2}, Lai/onnxruntime/OrtAllocator;-><init>(JZ)V

    .line 31
    .line 32
    .line 33
    iput-object p3, p0, Lai/onnxruntime/OrtEnvironment;->defaultAllocator:Lai/onnxruntime/OrtAllocator;

    .line 34
    .line 35
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    new-instance v0, Ljava/lang/Thread;

    .line 40
    .line 41
    new-instance v1, Lai/onnxruntime/OrtEnvironment$OrtEnvCloser;

    .line 42
    .line 43
    sget-wide v2, Lai/onnxruntime/OnnxRuntime;->ortApiHandle:J

    .line 44
    .line 45
    invoke-direct {v1, v2, v3, p1, p2}, Lai/onnxruntime/OrtEnvironment$OrtEnvCloser;-><init>(JJ)V

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p3, v0}, Ljava/lang/Runtime;->addShutdownHook(Ljava/lang/Thread;)V

    .line 52
    .line 53
    .line 54
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

.method public static bridge synthetic b(JJ)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lai/onnxruntime/OrtEnvironment;->close(JJ)V

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

.method private static native close(JJ)V
.end method

.method private static native createHandle(JILjava/lang/String;)J
.end method

.method private static native createHandle(JILjava/lang/String;J)J
.end method

.method public static getAvailableProviders()Ljava/util/EnumSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/EnumSet<",
            "Lai/onnxruntime/OrtProvider;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lai/onnxruntime/OnnxRuntime;->providers:Ljava/util/EnumSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/EnumSet;->clone()Ljava/util/EnumSet;

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

.method private static native getDefaultAllocator(J)J
.end method

.method public static declared-synchronized getEnvironment()Lai/onnxruntime/OrtEnvironment;
    .locals 3

    const-class v0, Lai/onnxruntime/OrtEnvironment;

    monitor-enter v0

    .line 66
    :try_start_0
    sget-object v1, Lai/onnxruntime/OrtEnvironment;->INSTANCE:Lai/onnxruntime/OrtEnvironment;

    if-nez v1, :cond_0

    .line 67
    sget-object v1, Lai/onnxruntime/OrtLoggingLevel;->ORT_LOGGING_LEVEL_WARNING:Lai/onnxruntime/OrtLoggingLevel;

    const-string v2, "ort-java"

    invoke-static {v1, v2}, Lai/onnxruntime/OrtEnvironment;->getEnvironment(Lai/onnxruntime/OrtLoggingLevel;Ljava/lang/String;)Lai/onnxruntime/OrtEnvironment;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    .line 68
    :cond_0
    :try_start_1
    sget-object v1, Lai/onnxruntime/OrtEnvironment;->INSTANCE:Lai/onnxruntime/OrtEnvironment;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v1

    :goto_0
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public static getEnvironment(Lai/onnxruntime/OrtLoggingLevel;)Lai/onnxruntime/OrtEnvironment;
    .locals 1

    .line 65
    const-string v0, "ort-java"

    invoke-static {p0, v0}, Lai/onnxruntime/OrtEnvironment;->getEnvironment(Lai/onnxruntime/OrtLoggingLevel;Ljava/lang/String;)Lai/onnxruntime/OrtEnvironment;

    move-result-object p0

    return-object p0
.end method

.method public static declared-synchronized getEnvironment(Lai/onnxruntime/OrtLoggingLevel;Ljava/lang/String;)Lai/onnxruntime/OrtEnvironment;
    .locals 2

    .line 1
    const-class v0, Lai/onnxruntime/OrtEnvironment;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lai/onnxruntime/OrtEnvironment;->INSTANCE:Lai/onnxruntime/OrtEnvironment;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    :try_start_1
    new-instance v1, Lai/onnxruntime/OrtEnvironment;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Lai/onnxruntime/OrtEnvironment;-><init>(Lai/onnxruntime/OrtLoggingLevel;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lai/onnxruntime/OrtEnvironment;->INSTANCE:Lai/onnxruntime/OrtEnvironment;

    .line 14
    .line 15
    sput-object p0, Lai/onnxruntime/OrtEnvironment;->curLogLevel:Lai/onnxruntime/OrtLoggingLevel;

    .line 16
    .line 17
    sput-object p1, Lai/onnxruntime/OrtEnvironment;->curLoggingName:Ljava/lang/String;
    :try_end_1
    .catch Lai/onnxruntime/OrtException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_1

    .line 22
    :catch_0
    move-exception p0

    .line 23
    :try_start_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v1, "Failed to create OrtEnvironment"

    .line 26
    .line 27
    invoke-direct {p1, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_0
    invoke-virtual {p0}, Lai/onnxruntime/OrtLoggingLevel;->getValue()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    sget-object v1, Lai/onnxruntime/OrtEnvironment;->curLogLevel:Lai/onnxruntime/OrtLoggingLevel;

    .line 36
    .line 37
    invoke-virtual {v1}, Lai/onnxruntime/OrtLoggingLevel;->getValue()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-ne p0, v1, :cond_1

    .line 42
    .line 43
    sget-object p0, Lai/onnxruntime/OrtEnvironment;->curLoggingName:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-nez p0, :cond_2

    .line 50
    .line 51
    :cond_1
    sget-object p0, Lai/onnxruntime/OrtEnvironment;->logger:Ljava/util/logging/Logger;

    .line 52
    .line 53
    const-string p1, "Tried to change OrtEnvironment\'s logging level or name while a reference exists."

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    :goto_0
    sget-object p0, Lai/onnxruntime/OrtEnvironment;->INSTANCE:Lai/onnxruntime/OrtEnvironment;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return-object p0

    .line 62
    :goto_1
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 63
    throw p0
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

.method public static declared-synchronized getEnvironment(Lai/onnxruntime/OrtLoggingLevel;Ljava/lang/String;Lai/onnxruntime/OrtEnvironment$ThreadingOptions;)Lai/onnxruntime/OrtEnvironment;
    .locals 2

    const-class v0, Lai/onnxruntime/OrtEnvironment;

    monitor-enter v0

    .line 69
    :try_start_0
    sget-object v1, Lai/onnxruntime/OrtEnvironment;->INSTANCE:Lai/onnxruntime/OrtEnvironment;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 70
    :try_start_1
    new-instance v1, Lai/onnxruntime/OrtEnvironment;

    invoke-direct {v1, p0, p1, p2}, Lai/onnxruntime/OrtEnvironment;-><init>(Lai/onnxruntime/OrtLoggingLevel;Ljava/lang/String;Lai/onnxruntime/OrtEnvironment$ThreadingOptions;)V

    sput-object v1, Lai/onnxruntime/OrtEnvironment;->INSTANCE:Lai/onnxruntime/OrtEnvironment;

    .line 71
    sput-object p0, Lai/onnxruntime/OrtEnvironment;->curLogLevel:Lai/onnxruntime/OrtLoggingLevel;

    .line 72
    sput-object p1, Lai/onnxruntime/OrtEnvironment;->curLoggingName:Ljava/lang/String;
    :try_end_1
    .catch Lai/onnxruntime/OrtException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    :try_start_2
    sget-object p0, Lai/onnxruntime/OrtEnvironment;->INSTANCE:Lai/onnxruntime/OrtEnvironment;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 74
    :try_start_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Failed to create OrtEnvironment"

    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    .line 75
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Tried to specify the thread pool when creating an OrtEnvironment, but one already exists."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :goto_0
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0
.end method

.method public static getEnvironment(Ljava/lang/String;)Lai/onnxruntime/OrtEnvironment;
    .locals 1

    .line 64
    sget-object v0, Lai/onnxruntime/OrtLoggingLevel;->ORT_LOGGING_LEVEL_WARNING:Lai/onnxruntime/OrtLoggingLevel;

    invoke-static {v0, p0}, Lai/onnxruntime/OrtEnvironment;->getEnvironment(Lai/onnxruntime/OrtLoggingLevel;Ljava/lang/String;)Lai/onnxruntime/OrtEnvironment;

    move-result-object p0

    return-object p0
.end method

.method private static native getEpDevices(JJ)[J
.end method

.method private static native getModelCompatibilityForEpDevices(J[JLjava/lang/String;)I
.end method

.method private static native registerExecutionProviderLibrary(JJLjava/lang/String;Ljava/lang/String;)V
.end method

.method private static native setTelemetry(JJZ)V
.end method

.method private static native unregisterExecutionProviderLibrary(JJLjava/lang/String;)V
.end method


# virtual methods
.method public close()V
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
.end method

.method public createSession(Ljava/lang/String;)Lai/onnxruntime/OrtSession;
    .locals 1

    .line 45
    new-instance v0, Lai/onnxruntime/OrtSession$SessionOptions;

    invoke-direct {v0}, Lai/onnxruntime/OrtSession$SessionOptions;-><init>()V

    invoke-virtual {p0, p1, v0}, Lai/onnxruntime/OrtEnvironment;->createSession(Ljava/lang/String;Lai/onnxruntime/OrtSession$SessionOptions;)Lai/onnxruntime/OrtSession;

    move-result-object p1

    return-object p1
.end method

.method public createSession(Ljava/lang/String;Lai/onnxruntime/OrtAllocator;Lai/onnxruntime/OrtSession$SessionOptions;)Lai/onnxruntime/OrtSession;
    .locals 1

    .line 41
    const-string v0, "model path must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 42
    new-instance v0, Lai/onnxruntime/OrtSession;

    invoke-direct {v0, p0, p1, p2, p3}, Lai/onnxruntime/OrtSession;-><init>(Lai/onnxruntime/OrtEnvironment;Ljava/lang/String;Lai/onnxruntime/OrtAllocator;Lai/onnxruntime/OrtSession$SessionOptions;)V

    return-object v0
.end method

.method public createSession(Ljava/lang/String;Lai/onnxruntime/OrtSession$SessionOptions;)Lai/onnxruntime/OrtSession;
    .locals 1

    .line 40
    iget-object v0, p0, Lai/onnxruntime/OrtEnvironment;->defaultAllocator:Lai/onnxruntime/OrtAllocator;

    invoke-virtual {p0, p1, v0, p2}, Lai/onnxruntime/OrtEnvironment;->createSession(Ljava/lang/String;Lai/onnxruntime/OrtAllocator;Lai/onnxruntime/OrtSession$SessionOptions;)Lai/onnxruntime/OrtSession;

    move-result-object p1

    return-object p1
.end method

.method public createSession(Ljava/nio/ByteBuffer;)Lai/onnxruntime/OrtSession;
    .locals 1

    .line 44
    new-instance v0, Lai/onnxruntime/OrtSession$SessionOptions;

    invoke-direct {v0}, Lai/onnxruntime/OrtSession$SessionOptions;-><init>()V

    invoke-virtual {p0, p1, v0}, Lai/onnxruntime/OrtEnvironment;->createSession(Ljava/nio/ByteBuffer;Lai/onnxruntime/OrtSession$SessionOptions;)Lai/onnxruntime/OrtSession;

    move-result-object p1

    return-object p1
.end method

.method public createSession(Ljava/nio/ByteBuffer;Lai/onnxruntime/OrtAllocator;Lai/onnxruntime/OrtSession$SessionOptions;)Lai/onnxruntime/OrtSession;
    .locals 1

    .line 1
    const-string v0, "model array must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->isDirect()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Lai/onnxruntime/OrtSession;

    .line 19
    .line 20
    invoke-direct {v0, p0, p1, p2, p3}, Lai/onnxruntime/OrtSession;-><init>(Lai/onnxruntime/OrtEnvironment;Ljava/nio/ByteBuffer;Lai/onnxruntime/OrtAllocator;Lai/onnxruntime/OrtSession$SessionOptions;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    new-instance p1, Lai/onnxruntime/OrtException;

    .line 25
    .line 26
    const-string p2, "ByteBuffer is not direct."

    .line 27
    .line 28
    invoke-direct {p1, p2}, Lai/onnxruntime/OrtException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    new-instance p1, Lai/onnxruntime/OrtException;

    .line 33
    .line 34
    const-string p2, "Invalid model buffer, no elements remaining."

    .line 35
    .line 36
    invoke-direct {p1, p2}, Lai/onnxruntime/OrtException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1
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

.method public createSession(Ljava/nio/ByteBuffer;Lai/onnxruntime/OrtSession$SessionOptions;)Lai/onnxruntime/OrtSession;
    .locals 1

    .line 43
    iget-object v0, p0, Lai/onnxruntime/OrtEnvironment;->defaultAllocator:Lai/onnxruntime/OrtAllocator;

    invoke-virtual {p0, p1, v0, p2}, Lai/onnxruntime/OrtEnvironment;->createSession(Ljava/nio/ByteBuffer;Lai/onnxruntime/OrtAllocator;Lai/onnxruntime/OrtSession$SessionOptions;)Lai/onnxruntime/OrtSession;

    move-result-object p1

    return-object p1
.end method

.method public createSession([B)Lai/onnxruntime/OrtSession;
    .locals 1

    .line 47
    new-instance v0, Lai/onnxruntime/OrtSession$SessionOptions;

    invoke-direct {v0}, Lai/onnxruntime/OrtSession$SessionOptions;-><init>()V

    invoke-virtual {p0, p1, v0}, Lai/onnxruntime/OrtEnvironment;->createSession([BLai/onnxruntime/OrtSession$SessionOptions;)Lai/onnxruntime/OrtSession;

    move-result-object p1

    return-object p1
.end method

.method public createSession([BLai/onnxruntime/OrtAllocator;Lai/onnxruntime/OrtSession$SessionOptions;)Lai/onnxruntime/OrtSession;
    .locals 1

    .line 48
    const-string v0, "model array must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 49
    new-instance v0, Lai/onnxruntime/OrtSession;

    invoke-direct {v0, p0, p1, p2, p3}, Lai/onnxruntime/OrtSession;-><init>(Lai/onnxruntime/OrtEnvironment;[BLai/onnxruntime/OrtAllocator;Lai/onnxruntime/OrtSession$SessionOptions;)V

    return-object v0
.end method

.method public createSession([BLai/onnxruntime/OrtSession$SessionOptions;)Lai/onnxruntime/OrtSession;
    .locals 1

    .line 46
    iget-object v0, p0, Lai/onnxruntime/OrtEnvironment;->defaultAllocator:Lai/onnxruntime/OrtAllocator;

    invoke-virtual {p0, p1, v0, p2}, Lai/onnxruntime/OrtEnvironment;->createSession([BLai/onnxruntime/OrtAllocator;Lai/onnxruntime/OrtSession$SessionOptions;)Lai/onnxruntime/OrtSession;

    move-result-object p1

    return-object p1
.end method

.method public createTrainingSession(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lai/onnxruntime/OrtTrainingSession;
    .locals 6

    .line 34
    new-instance v5, Lai/onnxruntime/OrtSession$SessionOptions;

    invoke-direct {v5}, Lai/onnxruntime/OrtSession$SessionOptions;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lai/onnxruntime/OrtEnvironment;->createTrainingSession(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/onnxruntime/OrtSession$SessionOptions;)Lai/onnxruntime/OrtTrainingSession;

    move-result-object p1

    return-object p1
.end method

.method public createTrainingSession(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/onnxruntime/OrtAllocator;Lai/onnxruntime/OrtSession$SessionOptions;)Lai/onnxruntime/OrtTrainingSession;
    .locals 9

    .line 1
    sget-boolean v0, Lai/onnxruntime/OnnxRuntime;->trainingEnabled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "train path must not be null"

    .line 6
    .line 7
    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lai/onnxruntime/OrtTrainingSession$OrtCheckpointState;->loadCheckpoint(Ljava/lang/String;)Lai/onnxruntime/OrtTrainingSession$OrtCheckpointState;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    new-instance v1, Lai/onnxruntime/OrtTrainingSession;

    .line 15
    .line 16
    move-object v2, p0

    .line 17
    move-object v6, p2

    .line 18
    move-object v7, p3

    .line 19
    move-object v8, p4

    .line 20
    move-object v3, p5

    .line 21
    move-object v4, p6

    .line 22
    invoke-direct/range {v1 .. v8}, Lai/onnxruntime/OrtTrainingSession;-><init>(Lai/onnxruntime/OrtEnvironment;Lai/onnxruntime/OrtAllocator;Lai/onnxruntime/OrtSession$SessionOptions;Lai/onnxruntime/OrtTrainingSession$OrtCheckpointState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_0
    const-string p1, "Training is not enabled in this build of ONNX Runtime."

    .line 27
    .line 28
    invoke-static {p1}, Lj1/i;->l(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    return-object p1
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

.method public createTrainingSession(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/onnxruntime/OrtSession$SessionOptions;)Lai/onnxruntime/OrtTrainingSession;
    .locals 7

    .line 33
    iget-object v5, p0, Lai/onnxruntime/OrtEnvironment;->defaultAllocator:Lai/onnxruntime/OrtAllocator;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lai/onnxruntime/OrtEnvironment;->createTrainingSession(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/onnxruntime/OrtAllocator;Lai/onnxruntime/OrtSession$SessionOptions;)Lai/onnxruntime/OrtTrainingSession;

    move-result-object p1

    return-object p1
.end method

.method public getEpDevices()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lai/onnxruntime/OrtEpDevice;",
            ">;"
        }
    .end annotation

    .line 1
    sget-wide v0, Lai/onnxruntime/OnnxRuntime;->ortApiHandle:J

    .line 2
    .line 3
    iget-wide v2, p0, Lai/onnxruntime/OrtEnvironment;->nativeHandle:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2, v3}, Lai/onnxruntime/OrtEnvironment;->getEpDevices(JJ)[J

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    array-length v2, v0

    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    if-ge v3, v2, :cond_0

    .line 17
    .line 18
    aget-wide v4, v0, v3

    .line 19
    .line 20
    new-instance v6, Lai/onnxruntime/OrtEpDevice;

    .line 21
    .line 22
    invoke-direct {v6, v4, v5}, Lai/onnxruntime/OrtEpDevice;-><init>(J)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
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

.method public getModelCompatibilityForEpDevices(Ljava/util/List;Ljava/lang/String;)Lai/onnxruntime/OrtEnvironment$OrtCompiledModelCompatibility;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lai/onnxruntime/OrtEpDevice;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lai/onnxruntime/OrtEnvironment$OrtCompiledModelCompatibility;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    new-array v0, v0, [J

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-ge v1, v2, :cond_0

    .line 21
    .line 22
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lai/onnxruntime/OrtEpDevice;

    .line 27
    .line 28
    invoke-virtual {v2}, Lai/onnxruntime/OrtEpDevice;->getNativeHandle()J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    aput-wide v2, v0, v1

    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    sget-wide v1, Lai/onnxruntime/OnnxRuntime;->ortApiHandle:J

    .line 38
    .line 39
    invoke-static {v1, v2, v0, p2}, Lai/onnxruntime/OrtEnvironment;->getModelCompatibilityForEpDevices(J[JLjava/lang/String;)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-static {p1}, Lai/onnxruntime/OrtEnvironment$OrtCompiledModelCompatibility;->mapFromInt(I)Lai/onnxruntime/OrtEnvironment$OrtCompiledModelCompatibility;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :cond_1
    const-string p1, "Must supply at least one OrtEpDevice"

    .line 49
    .line 50
    invoke-static {p1}, Lj1/i;->k(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    return-object p1
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

.method public getNativeHandle()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lai/onnxruntime/OrtEnvironment;->nativeHandle:J

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

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lai/onnxruntime/OnnxRuntime;->version()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public isTrainingEnabled()Z
    .locals 1

    .line 1
    sget-boolean v0, Lai/onnxruntime/OnnxRuntime;->trainingEnabled:Z

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

.method public registerExecutionProviderLibrary(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1
    sget-wide v0, Lai/onnxruntime/OnnxRuntime;->ortApiHandle:J

    .line 2
    .line 3
    iget-wide v2, p0, Lai/onnxruntime/OrtEnvironment;->nativeHandle:J

    .line 4
    .line 5
    move-object v4, p1

    .line 6
    move-object v5, p2

    .line 7
    invoke-static/range {v0 .. v5}, Lai/onnxruntime/OrtEnvironment;->registerExecutionProviderLibrary(JJLjava/lang/String;Ljava/lang/String;)V

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

.method public setTelemetry(Z)V
    .locals 4

    .line 1
    sget-wide v0, Lai/onnxruntime/OnnxRuntime;->ortApiHandle:J

    .line 2
    .line 3
    iget-wide v2, p0, Lai/onnxruntime/OrtEnvironment;->nativeHandle:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2, v3, p1}, Lai/onnxruntime/OrtEnvironment;->setTelemetry(JJZ)V

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

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "OrtEnvironment(name="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lai/onnxruntime/OrtEnvironment;->curLoggingName:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ",logLevel="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    sget-object v1, Lai/onnxruntime/OrtEnvironment;->curLogLevel:Lai/onnxruntime/OrtLoggingLevel;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ",version="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lai/onnxruntime/OrtEnvironment;->getVersion()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, ")"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0
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

.method public unregisterExecutionProviderLibrary(Ljava/lang/String;)V
    .locals 4

    .line 1
    sget-wide v0, Lai/onnxruntime/OnnxRuntime;->ortApiHandle:J

    .line 2
    .line 3
    iget-wide v2, p0, Lai/onnxruntime/OrtEnvironment;->nativeHandle:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2, v3, p1}, Lai/onnxruntime/OrtEnvironment;->unregisterExecutionProviderLibrary(JJLjava/lang/String;)V

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
