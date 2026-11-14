package org.apache.commons.io.file;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.util.Objects;
import org.apache.commons.io.build.AbstractSupplier;
import org.apache.commons.io.function.IOBiFunction;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class SimplePathVisitor extends SimpleFileVisitor<Path> implements PathVisitor {
    private final IOBiFunction<Path, IOException, FileVisitResult> visitFileFailedFunction;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBuilder<T, B extends AbstractSupplier<T, B>> extends AbstractSupplier<T, B> {
        private IOBiFunction<Path, IOException, FileVisitResult> visitFileFailedFunction;

        public IOBiFunction<Path, IOException, FileVisitResult> getVisitFileFailedFunction() {
            return this.visitFileFailedFunction;
        }

        public B setVisitFileFailedFunction(IOBiFunction<Path, IOException, FileVisitResult> iOBiFunction) {
            this.visitFileFailedFunction = iOBiFunction;
            return asThis();
        }
    }

    public SimplePathVisitor(AbstractBuilder<?, ?> abstractBuilder) {
        IOBiFunction<Path, IOException, FileVisitResult> iOBiFunction;
        if (((AbstractBuilder) abstractBuilder).visitFileFailedFunction != null) {
            iOBiFunction = ((AbstractBuilder) abstractBuilder).visitFileFailedFunction;
        } else {
            final int i10 = 1;
            iOBiFunction = new IOBiFunction(this) { // from class: org.apache.commons.io.file.m

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SimplePathVisitor f4828b;

                {
                    this.f4828b = this;
                }

                @Override // org.apache.commons.io.function.IOBiFunction
                public final Object apply(Object obj, Object obj2) {
                    FileVisitResult lambda$new$0;
                    FileVisitResult lambda$new$1;
                    Path path = (Path) obj;
                    IOException iOException = (IOException) obj2;
                    switch (i10) {
                        case 0:
                            lambda$new$0 = this.f4828b.lambda$new$0(path, iOException);
                            return lambda$new$0;
                        default:
                            lambda$new$1 = this.f4828b.lambda$new$1(path, iOException);
                            return lambda$new$1;
                    }
                }
            };
        }
        this.visitFileFailedFunction = iOBiFunction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ FileVisitResult lambda$new$0(Object obj, IOException iOException) {
        return super.visitFileFailed((SimplePathVisitor) obj, iOException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ FileVisitResult lambda$new$1(Object obj, IOException iOException) {
        return super.visitFileFailed((SimplePathVisitor) obj, iOException);
    }

    /* renamed from: visitFileFailed, reason: avoid collision after fix types in other method */
    public FileVisitResult visitFileFailed2(Path path, IOException iOException) {
        return f.f(this.visitFileFailedFunction.apply(path, iOException));
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFileFailed(Path path, IOException iOException) {
        return visitFileFailed2(kotlin.internal.jdk8.a.m(path), iOException);
    }

    public SimplePathVisitor() {
        final int i10 = 0;
        this.visitFileFailedFunction = new IOBiFunction(this) { // from class: org.apache.commons.io.file.m

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SimplePathVisitor f4828b;

            {
                this.f4828b = this;
            }

            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                FileVisitResult lambda$new$0;
                FileVisitResult lambda$new$1;
                Path path = (Path) obj;
                IOException iOException = (IOException) obj2;
                switch (i10) {
                    case 0:
                        lambda$new$0 = this.f4828b.lambda$new$0(path, iOException);
                        return lambda$new$0;
                    default:
                        lambda$new$1 = this.f4828b.lambda$new$1(path, iOException);
                        return lambda$new$1;
                }
            }
        };
    }

    public SimplePathVisitor(IOBiFunction<Path, IOException, FileVisitResult> iOBiFunction) {
        Objects.requireNonNull(iOBiFunction, "visitFileFailedFunction");
        this.visitFileFailedFunction = iOBiFunction;
    }
}
