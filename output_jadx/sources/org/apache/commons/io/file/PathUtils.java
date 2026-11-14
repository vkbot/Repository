package org.apache.commons.io.file;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.AccessDeniedException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.time.Duration;
import java.time.Instant;
import java.time.chrono.ChronoZonedDateTime;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.RandomAccessFileMode;
import org.apache.commons.io.RandomAccessFiles;
import org.apache.commons.io.ThreadUtils;
import org.apache.commons.io.file.AccumulatorPathVisitor;
import org.apache.commons.io.file.Counters;
import org.apache.commons.io.file.attribute.FileTimes;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.function.IOSupplier;
import org.apache.commons.io.r;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class PathUtils {
    public static final CopyOption[] EMPTY_COPY_OPTIONS;
    public static final DeleteOption[] EMPTY_DELETE_OPTION_ARRAY;
    public static final FileAttribute<?>[] EMPTY_FILE_ATTRIBUTE_ARRAY;
    public static final FileVisitOption[] EMPTY_FILE_VISIT_OPTION_ARRAY;
    public static final LinkOption[] EMPTY_LINK_OPTION_ARRAY;
    public static final OpenOption[] EMPTY_OPEN_OPTION_ARRAY;
    public static final Path[] EMPTY_PATH_ARRAY;

    @Deprecated
    public static final LinkOption[] NOFOLLOW_LINK_OPTION_ARRAY;
    static final LinkOption NULL_LINK_OPTION;
    private static final OpenOption[] OPEN_OPTIONS_APPEND;
    private static final OpenOption[] OPEN_OPTIONS_TRUNCATE = {e.i(), e.A()};

    static {
        StandardOpenOption standardOpenOption;
        StandardOpenOption standardOpenOption2;
        StandardOpenOption standardOpenOption3;
        StandardOpenOption standardOpenOption4;
        LinkOption linkOption;
        standardOpenOption = StandardOpenOption.CREATE;
        standardOpenOption2 = StandardOpenOption.TRUNCATE_EXISTING;
        OPEN_OPTIONS_TRUNCATE = new OpenOption[]{standardOpenOption, standardOpenOption2};
        standardOpenOption3 = StandardOpenOption.CREATE;
        standardOpenOption4 = StandardOpenOption.APPEND;
        OPEN_OPTIONS_APPEND = new OpenOption[]{standardOpenOption3, standardOpenOption4};
        EMPTY_COPY_OPTIONS = new CopyOption[0];
        EMPTY_DELETE_OPTION_ARRAY = new DeleteOption[0];
        EMPTY_FILE_ATTRIBUTE_ARRAY = new FileAttribute[0];
        EMPTY_FILE_VISIT_OPTION_ARRAY = new FileVisitOption[0];
        EMPTY_LINK_OPTION_ARRAY = new LinkOption[0];
        linkOption = LinkOption.NOFOLLOW_LINKS;
        NOFOLLOW_LINK_OPTION_ARRAY = new LinkOption[]{linkOption};
        NULL_LINK_OPTION = null;
        EMPTY_OPEN_OPTION_ARRAY = new OpenOption[0];
        EMPTY_PATH_ARRAY = new Path[0];
    }

    private PathUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.function.UnaryOperator] */
    public static AccumulatorPathVisitor accumulate(Path path, int i10, FileVisitOption[] fileVisitOptionArr) {
        return (AccumulatorPathVisitor) visitFileTree(((AccumulatorPathVisitor.Builder) AccumulatorPathVisitor.builder().setDirectoryPostTransformer(new Object())).get(), path, toFileVisitOptionSet(fileVisitOptionArr), i10);
    }

    public static Counters.PathCounters cleanDirectory(Path path, DeleteOption... deleteOptionArr) {
        return ((CleaningPathVisitor) visitFileTree(new CleaningPathVisitor(Counters.longPathCounters(), deleteOptionArr, new String[0]), path)).getPathCounters();
    }

    private static int compareLastModifiedTimeTo(Path path, FileTime fileTime, LinkOption... linkOptionArr) {
        int compareTo;
        compareTo = getLastModifiedTime(path, linkOptionArr).compareTo(fileTime);
        return compareTo;
    }

    public static boolean contentEquals(FileSystem fileSystem, FileSystem fileSystem2) {
        Iterable rootDirectories;
        Iterable rootDirectories2;
        if (!Objects.equals(fileSystem, fileSystem2)) {
            rootDirectories = fileSystem.getRootDirectories();
            List<Path> sortedList = toSortedList(rootDirectories);
            rootDirectories2 = fileSystem2.getRootDirectories();
            List<Path> sortedList2 = toSortedList(rootDirectories2);
            if (sortedList.size() == sortedList2.size()) {
                for (int i10 = 0; i10 < sortedList.size(); i10++) {
                    if (directoryAndFileContentEquals(kotlin.internal.jdk8.a.m(sortedList.get(i10)), kotlin.internal.jdk8.a.m(sortedList2.get(i10)))) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static long copy(IOSupplier<InputStream> iOSupplier, Path path, CopyOption... copyOptionArr) {
        long copy;
        InputStream inputStream = iOSupplier.get();
        try {
            copy = Files.copy(inputStream, path, copyOptionArr);
            if (inputStream != null) {
                inputStream.close();
            }
            return copy;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static Counters.PathCounters copyDirectory(Path path, Path path2, CopyOption... copyOptionArr) {
        Path absolutePath;
        absolutePath = path.toAbsolutePath();
        return ((CopyDirectoryVisitor) visitFileTree(new CopyDirectoryVisitor(Counters.longPathCounters(), absolutePath, path2, copyOptionArr), absolutePath)).getPathCounters();
    }

    public static Path copyFile(URL url, Path path, CopyOption... copyOptionArr) {
        Objects.requireNonNull(url);
        copy(new r(0, url), path, copyOptionArr);
        return path;
    }

    public static Path copyFileToDirectory(Path path, Path path2, CopyOption... copyOptionArr) {
        Path fileName;
        Path copy;
        fileName = path.getFileName();
        Objects.requireNonNull(fileName, "source file name");
        copy = Files.copy(path, resolve(path2, kotlin.internal.jdk8.a.m(fileName)), copyOptionArr);
        return copy;
    }

    public static Counters.PathCounters countDirectory(Path path) {
        return ((CountingPathVisitor) visitFileTree(CountingPathVisitor.withLongCounters(), path)).getPathCounters();
    }

    public static Counters.PathCounters countDirectoryAsBigInteger(Path path) {
        return ((CountingPathVisitor) visitFileTree(CountingPathVisitor.withBigIntegerCounters(), path)).getPathCounters();
    }

    public static Path createParentDirectories(Path path, LinkOption linkOption, FileAttribute<?>... fileAttributeArr) {
        LinkOption linkOption2;
        Path createDirectories;
        Path parent = getParent(path);
        linkOption2 = LinkOption.NOFOLLOW_LINKS;
        if (linkOption != linkOption2) {
            parent = readIfSymbolicLink(parent);
        }
        if (parent == null) {
            return null;
        }
        if (!(linkOption == null ? Files.exists(parent, new LinkOption[0]) : Files.exists(parent, linkOption))) {
            createDirectories = Files.createDirectories(parent, fileAttributeArr);
            return createDirectories;
        }
        return parent;
    }

    public static Path current() {
        Path path;
        path = Paths.get(".", new String[0]);
        return path;
    }

    public static Counters.PathCounters delete(Path path, DeleteOption... deleteOptionArr) {
        LinkOption linkOption;
        boolean isDirectory;
        linkOption = LinkOption.NOFOLLOW_LINKS;
        isDirectory = Files.isDirectory(path, linkOption);
        if (isDirectory) {
            return deleteDirectory(path, deleteOptionArr);
        }
        return deleteFile(path, deleteOptionArr);
    }

    public static Counters.PathCounters deleteDirectory(final Path path, final DeleteOption... deleteOptionArr) {
        final LinkOption[] noFollowLinkOptionArray = noFollowLinkOptionArray();
        return (Counters.PathCounters) withPosixFileAttributes(getParent(path), noFollowLinkOptionArray, overrideReadOnly(deleteOptionArr), new IOFunction() { // from class: org.apache.commons.io.file.l
            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                Counters.PathCounters lambda$deleteDirectory$0;
                lambda$deleteDirectory$0 = PathUtils.lambda$deleteDirectory$0(noFollowLinkOptionArray, deleteOptionArr, path, (PosixFileAttributes) obj);
                return lambda$deleteDirectory$0;
            }
        });
    }

    public static Counters.PathCounters deleteFile(Path path, LinkOption[] linkOptionArr, DeleteOption... deleteOptionArr) {
        long j10;
        if (!Files.isDirectory(path, linkOptionArr)) {
            Counters.PathCounters longPathCounters = Counters.longPathCounters();
            long j11 = 0;
            if (exists(path, linkOptionArr) && !Files.isSymbolicLink(path)) {
                j10 = Files.size(path);
            } else {
                j10 = 0;
            }
            try {
                if (Files.deleteIfExists(path)) {
                    longPathCounters.getFileCounter().increment();
                    longPathCounters.getByteCounter().add(j10);
                    return longPathCounters;
                }
            } catch (AccessDeniedException unused) {
            }
            Path parent = getParent(path);
            PosixFileAttributes posixFileAttributes = null;
            try {
                if (overrideReadOnly(deleteOptionArr)) {
                    posixFileAttributes = readPosixFileAttributes(parent, linkOptionArr);
                    setReadOnly(path, false, linkOptionArr);
                }
                if (exists(path, linkOptionArr) && !Files.isSymbolicLink(path)) {
                    j11 = Files.size(path);
                }
                if (Files.deleteIfExists(path)) {
                    longPathCounters.getFileCounter().increment();
                    longPathCounters.getByteCounter().add(j11);
                }
                if (posixFileAttributes != null) {
                    Files.setPosixFilePermissions(parent, posixFileAttributes.permissions());
                }
                return longPathCounters;
            } catch (Throwable th) {
                if (posixFileAttributes != null) {
                    Files.setPosixFilePermissions(parent, posixFileAttributes.permissions());
                }
                throw th;
            }
        }
        throw new NoSuchFileException(path.toString());
    }

    public static void deleteOnExit(Path path) {
        File file;
        Objects.requireNonNull(path);
        file = kotlin.internal.jdk8.a.m(path).toFile();
        file.deleteOnExit();
    }

    public static boolean directoryAndFileContentEquals(Path path, Path path2, LinkOption[] linkOptionArr, OpenOption[] openOptionArr, FileVisitOption[] fileVisitOptionArr) {
        int binarySearch;
        String path3;
        Path resolve;
        String path4;
        Path resolve2;
        Path resolve3;
        Path resolve4;
        if (path != null || path2 != null) {
            if (path != null && path2 != null) {
                if (!notExists(path, new LinkOption[0]) || !notExists(path2, new LinkOption[0])) {
                    RelativeSortedPaths relativeSortedPaths = new RelativeSortedPaths(path, path2, Integer.MAX_VALUE, linkOptionArr, fileVisitOptionArr);
                    if (relativeSortedPaths.equals) {
                        List<Path> list = relativeSortedPaths.relativeFileList1;
                        List<Path> list2 = relativeSortedPaths.relativeFileList2;
                        boolean isSameFileSystem = isSameFileSystem(path, path2);
                        Iterator<Path> it = list.iterator();
                        while (it.hasNext()) {
                            Path m10 = kotlin.internal.jdk8.a.m(it.next());
                            if (isSameFileSystem) {
                                binarySearch = Collections.binarySearch(list2, m10);
                            } else {
                                binarySearch = Collections.binarySearch(list2, m10, Comparator.comparing(new h(1)));
                            }
                            if (binarySearch >= 0) {
                                if (isSameFileSystem) {
                                    resolve3 = path.resolve(m10);
                                    resolve4 = path2.resolve(m10);
                                    if (!fileContentEquals(resolve3, resolve4, linkOptionArr, openOptionArr)) {
                                    }
                                }
                                path3 = m10.toString();
                                resolve = path.resolve(path3);
                                path4 = m10.toString();
                                resolve2 = path2.resolve(path4);
                                if (!fileContentEquals(resolve, resolve2, linkOptionArr, openOptionArr)) {
                                }
                            } else {
                                j1.i.l("Unexpected mismatch.");
                                return false;
                            }
                        }
                        return true;
                    }
                } else {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean directoryContentEquals(Path path, Path path2, int i10, LinkOption[] linkOptionArr, FileVisitOption[] fileVisitOptionArr) {
        return new RelativeSortedPaths(path, path2, i10, linkOptionArr, fileVisitOptionArr).equals;
    }

    private static boolean exists(Path path, LinkOption... linkOptionArr) {
        boolean exists;
        boolean exists2;
        if (path != null) {
            if (linkOptionArr != null) {
                exists2 = Files.exists(path, linkOptionArr);
                if (exists2) {
                    return true;
                }
            } else {
                exists = Files.exists(path, new LinkOption[0]);
                if (exists) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean fileContentEquals(Path path, Path path2, LinkOption[] linkOptionArr, OpenOption[] openOptionArr) {
        Path normalize;
        Path normalize2;
        boolean isDirectory;
        boolean isDirectory2;
        long size;
        long size2;
        InputStream newInputStream;
        InputStream newInputStream2;
        Path realPath;
        Path realPath2;
        boolean equals;
        if (path != null || path2 != null) {
            if (path != null && path2 != null) {
                normalize = path.normalize();
                normalize2 = path2.normalize();
                boolean exists = exists(normalize, linkOptionArr);
                if (exists == exists(normalize2, linkOptionArr)) {
                    if (exists) {
                        isDirectory = Files.isDirectory(normalize, linkOptionArr);
                        if (!isDirectory) {
                            isDirectory2 = Files.isDirectory(normalize2, linkOptionArr);
                            if (!isDirectory2) {
                                size = Files.size(normalize);
                                size2 = Files.size(normalize2);
                                if (size == size2) {
                                    if (isSameFileSystem(path, path2)) {
                                        equals = path.equals(path2);
                                        if (equals) {
                                            return true;
                                        }
                                    }
                                    try {
                                        RandomAccessFileMode randomAccessFileMode = RandomAccessFileMode.READ_ONLY;
                                        realPath = path.toRealPath(linkOptionArr);
                                        RandomAccessFile create = randomAccessFileMode.create(realPath);
                                        try {
                                            realPath2 = path2.toRealPath(linkOptionArr);
                                            RandomAccessFile create2 = randomAccessFileMode.create(realPath2);
                                            try {
                                                boolean contentEquals = RandomAccessFiles.contentEquals(create, create2);
                                                if (create2 != null) {
                                                    create2.close();
                                                }
                                                if (create != null) {
                                                    create.close();
                                                }
                                                return contentEquals;
                                            } finally {
                                            }
                                        } finally {
                                        }
                                    } catch (UnsupportedOperationException unused) {
                                        newInputStream = Files.newInputStream(normalize, openOptionArr);
                                        try {
                                            newInputStream2 = Files.newInputStream(normalize2, openOptionArr);
                                            try {
                                                boolean contentEquals2 = IOUtils.contentEquals(newInputStream, newInputStream2);
                                                if (newInputStream2 != null) {
                                                    newInputStream2.close();
                                                }
                                                if (newInputStream != null) {
                                                    newInputStream.close();
                                                }
                                                return contentEquals2;
                                            } finally {
                                            }
                                        } catch (Throwable th) {
                                            if (newInputStream != null) {
                                                try {
                                                    newInputStream.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                }
                                return false;
                            }
                            org.apache.commons.io.e.f(normalize2, "Can't compare directories, only files: ");
                            return false;
                        }
                        org.apache.commons.io.e.f(normalize, "Can't compare directories, only files: ");
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static Path[] filter(PathFilter pathFilter, Path... pathArr) {
        Objects.requireNonNull(pathFilter, "filter");
        if (pathArr == null) {
            return EMPTY_PATH_ARRAY;
        }
        return (Path[]) ((List) filterPaths(pathFilter, Stream.of((Object[]) pathArr), Collectors.toList())).toArray(EMPTY_PATH_ARRAY);
    }

    private static <R, A> R filterPaths(PathFilter pathFilter, Stream<Path> stream, Collector<? super Path, A, R> collector) {
        Objects.requireNonNull(pathFilter, "filter");
        Objects.requireNonNull(collector, "collector");
        if (stream == null) {
            return (R) Stream.empty().collect(collector);
        }
        return (R) stream.filter(new k(0, pathFilter)).collect(collector);
    }

    public static List<AclEntry> getAclEntryList(Path path) {
        List<AclEntry> acl;
        AclFileAttributeView aclFileAttributeView = getAclFileAttributeView(path, new LinkOption[0]);
        if (aclFileAttributeView != null) {
            acl = aclFileAttributeView.getAcl();
            return acl;
        }
        return null;
    }

    public static AclFileAttributeView getAclFileAttributeView(Path path, LinkOption... linkOptionArr) {
        FileAttributeView fileAttributeView;
        fileAttributeView = Files.getFileAttributeView(path, f.b(), linkOptionArr);
        return f.i(fileAttributeView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0003, code lost:
    
        r0 = r0.getFileName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getBaseName(java.nio.file.Path r0) {
        /*
            if (r0 != 0) goto L3
            goto L12
        L3:
            java.nio.file.Path r0 = kotlin.internal.jdk8.a.o(r0)
            if (r0 == 0) goto L12
            java.lang.String r0 = ai.onnxruntime.c.s(r0)
            java.lang.String r0 = org.apache.commons.io.FilenameUtils.removeExtension(r0)
            return r0
        L12:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.file.PathUtils.getBaseName(java.nio.file.Path):java.lang.String");
    }

    public static DosFileAttributeView getDosFileAttributeView(Path path, LinkOption... linkOptionArr) {
        FileAttributeView fileAttributeView;
        fileAttributeView = Files.getFileAttributeView(path, e.z(), linkOptionArr);
        return e.j(fileAttributeView);
    }

    public static String getExtension(Path path) {
        String fileNameString = getFileNameString(path);
        if (fileNameString != null) {
            return FilenameUtils.getExtension(fileNameString);
        }
        return null;
    }

    public static <R> R getFileName(Path path, Function<Path, R> function) {
        Path path2;
        if (path != null) {
            path2 = path.getFileName();
        } else {
            path2 = null;
        }
        if (path2 == null) {
            return null;
        }
        return function.apply(path2);
    }

    public static String getFileNameString(Path path) {
        return (String) getFileName(path, new h(0));
    }

    public static FileTime getLastModifiedFileTime(Path path, FileTime fileTime, LinkOption... linkOptionArr) {
        boolean exists;
        exists = Files.exists(path, new LinkOption[0]);
        if (exists) {
            return getLastModifiedTime(path, linkOptionArr);
        }
        return fileTime;
    }

    private static FileTime getLastModifiedTime(Path path, LinkOption... linkOptionArr) {
        FileTime lastModifiedTime;
        Objects.requireNonNull(path, "path");
        lastModifiedTime = Files.getLastModifiedTime(kotlin.internal.jdk8.a.m(path), linkOptionArr);
        return lastModifiedTime;
    }

    private static Path getParent(Path path) {
        Path parent;
        if (path != null) {
            parent = path.getParent();
            return parent;
        }
        return null;
    }

    public static Path getPath(String str, String str2) {
        Path path;
        if (str != null && !str.isEmpty()) {
            str2 = System.getProperty(str, str2);
        }
        if (str2 != null) {
            path = Paths.get(str2, new String[0]);
            return path;
        }
        return null;
    }

    public static PosixFileAttributeView getPosixFileAttributeView(Path path, LinkOption... linkOptionArr) {
        FileAttributeView fileAttributeView;
        fileAttributeView = Files.getFileAttributeView(path, e.c(), linkOptionArr);
        return e.m(fileAttributeView);
    }

    public static Path getTempDirectory() {
        Path path;
        path = Paths.get(FileUtils.getTempDirectoryPath(), new String[0]);
        return path;
    }

    public static boolean isDirectory(Path path, LinkOption... linkOptionArr) {
        boolean isDirectory;
        if (path != null) {
            isDirectory = Files.isDirectory(path, linkOptionArr);
            if (isDirectory) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isEmpty(Path path) {
        boolean isDirectory;
        isDirectory = Files.isDirectory(path, new LinkOption[0]);
        if (isDirectory) {
            return isEmptyDirectory(path);
        }
        return isEmptyFile(path);
    }

    public static boolean isEmptyDirectory(Path path) {
        DirectoryStream newDirectoryStream;
        Iterator it;
        newDirectoryStream = Files.newDirectoryStream(path);
        try {
            it = newDirectoryStream.iterator();
            boolean z9 = !it.hasNext();
            newDirectoryStream.close();
            return z9;
        } catch (Throwable th) {
            if (newDirectoryStream != null) {
                try {
                    newDirectoryStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static boolean isEmptyFile(Path path) {
        long size;
        size = Files.size(path);
        if (size <= 0) {
            return true;
        }
        return false;
    }

    public static boolean isNewer(Path path, FileTime fileTime, LinkOption... linkOptionArr) {
        if (notExists(path, new LinkOption[0]) || compareLastModifiedTimeTo(path, fileTime, linkOptionArr) <= 0) {
            return false;
        }
        return true;
    }

    public static boolean isOlder(Path path, FileTime fileTime, LinkOption... linkOptionArr) {
        if (notExists(path, new LinkOption[0]) || compareLastModifiedTimeTo(path, fileTime, linkOptionArr) >= 0) {
            return false;
        }
        return true;
    }

    public static boolean isPosix(Path path, LinkOption... linkOptionArr) {
        if (exists(path, linkOptionArr) && readPosixFileAttributes(path, linkOptionArr) != null) {
            return true;
        }
        return false;
    }

    public static boolean isRegularFile(Path path, LinkOption... linkOptionArr) {
        boolean isRegularFile;
        if (path != null) {
            isRegularFile = Files.isRegularFile(path, linkOptionArr);
            if (isRegularFile) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isSameFileSystem(Path path, Path path2) {
        FileSystem fileSystem;
        FileSystem fileSystem2;
        fileSystem = path.getFileSystem();
        fileSystem2 = path2.getFileSystem();
        if (fileSystem == fileSystem2) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Counters.PathCounters lambda$deleteDirectory$0(LinkOption[] linkOptionArr, DeleteOption[] deleteOptionArr, Path path, PosixFileAttributes posixFileAttributes) {
        return ((DeletingPathVisitor) visitFileTree(new DeletingPathVisitor(Counters.longPathCounters(), linkOptionArr, deleteOptionArr, new String[0]), path)).getPathCounters();
    }

    public static /* synthetic */ String lambda$directoryAndFileContentEquals$1(Path path) {
        FileSystem fileSystem;
        String separator;
        String path2;
        fileSystem = path.getFileSystem();
        separator = fileSystem.getSeparator();
        path2 = path.toString();
        return RelativeSortedPaths.extractKey(separator, path2);
    }

    public static /* synthetic */ boolean lambda$filterPaths$2(PathFilter pathFilter, Path path) {
        FileVisitResult fileVisitResult;
        if (path != null) {
            try {
                FileVisitResult accept = pathFilter.accept(path, readBasicFileAttributes(path));
                fileVisitResult = FileVisitResult.CONTINUE;
                if (accept == fileVisitResult) {
                    return true;
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean lambda$overrideReadOnly$3(DeleteOption deleteOption) {
        if (deleteOption == StandardDeleteOption.OVERRIDE_READ_ONLY) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean lambda$walk$4(PathFilter pathFilter, boolean z9, Path path) {
        BasicFileAttributes basicFileAttributes;
        FileVisitResult fileVisitResult;
        if (z9) {
            basicFileAttributes = readBasicFileAttributes(path, EMPTY_LINK_OPTION_ARRAY);
        } else {
            basicFileAttributes = null;
        }
        FileVisitResult accept = pathFilter.accept(path, basicFileAttributes);
        fileVisitResult = FileVisitResult.CONTINUE;
        if (accept == fileVisitResult) {
            return true;
        }
        return false;
    }

    public static DirectoryStream<Path> newDirectoryStream(Path path, PathFilter pathFilter) {
        DirectoryStream<Path> newDirectoryStream;
        newDirectoryStream = Files.newDirectoryStream(path, new DirectoryStreamFilter(pathFilter));
        return newDirectoryStream;
    }

    public static OutputStream newOutputStream(Path path, LinkOption[] linkOptionArr, OpenOption... openOptionArr) {
        LinkOption linkOption;
        if (!exists(path, linkOptionArr)) {
            if (linkOptionArr != null && linkOptionArr.length > 0) {
                linkOption = linkOptionArr[0];
            } else {
                linkOption = NULL_LINK_OPTION;
            }
            createParentDirectories(path, linkOption, new FileAttribute[0]);
        }
        if (openOptionArr == null) {
            openOptionArr = EMPTY_OPEN_OPTION_ARRAY;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(openOptionArr));
        if (linkOptionArr == null) {
            linkOptionArr = EMPTY_LINK_OPTION_ARRAY;
        }
        arrayList.addAll(Arrays.asList(linkOptionArr));
        return Files.newOutputStream(path, (OpenOption[]) arrayList.toArray(EMPTY_OPEN_OPTION_ARRAY));
    }

    public static LinkOption[] noFollowLinkOptionArray() {
        return (LinkOption[]) NOFOLLOW_LINK_OPTION_ARRAY.clone();
    }

    private static boolean notExists(Path path, LinkOption... linkOptionArr) {
        boolean notExists;
        Objects.requireNonNull(path, "path");
        notExists = Files.notExists(kotlin.internal.jdk8.a.m(path), linkOptionArr);
        return notExists;
    }

    private static boolean overrideReadOnly(DeleteOption... deleteOptionArr) {
        if (deleteOptionArr == null) {
            return false;
        }
        return Stream.of((Object[]) deleteOptionArr).anyMatch(new i7.k(3));
    }

    public static <A extends BasicFileAttributes> A readAttributes(Path path, Class<A> cls, LinkOption... linkOptionArr) {
        BasicFileAttributes readAttributes;
        if (path != null) {
            try {
                readAttributes = Files.readAttributes(path, cls, linkOptionArr);
                return (A) readAttributes;
            } catch (IOException | UnsupportedOperationException unused) {
                return null;
            }
        }
        return null;
    }

    public static BasicFileAttributes readBasicFileAttributes(Path path) {
        BasicFileAttributes readAttributes;
        readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) kotlin.io.path.f.f(), new LinkOption[0]);
        return readAttributes;
    }

    @Deprecated
    public static BasicFileAttributes readBasicFileAttributesUnchecked(Path path) {
        return readBasicFileAttributes(path, EMPTY_LINK_OPTION_ARRAY);
    }

    public static DosFileAttributes readDosFileAttributes(Path path, LinkOption... linkOptionArr) {
        return e.k(readAttributes(path, e.C(), linkOptionArr));
    }

    private static Path readIfSymbolicLink(Path path) {
        boolean isSymbolicLink;
        Path readSymbolicLink;
        if (path != null) {
            isSymbolicLink = Files.isSymbolicLink(path);
            if (isSymbolicLink) {
                readSymbolicLink = Files.readSymbolicLink(path);
                return readSymbolicLink;
            }
            return path;
        }
        return null;
    }

    public static BasicFileAttributes readOsFileAttributes(Path path, LinkOption... linkOptionArr) {
        PosixFileAttributes readPosixFileAttributes = readPosixFileAttributes(path, linkOptionArr);
        if (readPosixFileAttributes != null) {
            return readPosixFileAttributes;
        }
        return readDosFileAttributes(path, linkOptionArr);
    }

    public static PosixFileAttributes readPosixFileAttributes(Path path, LinkOption... linkOptionArr) {
        return f.m(readAttributes(path, f.y(), linkOptionArr));
    }

    public static String readString(Path path, Charset charset) {
        byte[] readAllBytes;
        readAllBytes = Files.readAllBytes(path);
        return new String(readAllBytes, Charsets.toCharset(charset));
    }

    public static List<Path> relativize(Collection<Path> collection, final Path path, boolean z9, Comparator<? super Path> comparator) {
        Stream<Path> stream = collection.stream();
        Objects.requireNonNull(path);
        Stream map = stream.map(new Function() { // from class: org.apache.commons.io.file.i
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return path.relativize((Path) obj);
            }
        });
        if (z9) {
            if (comparator == null) {
                map = map.sorted();
            } else {
                map = map.sorted(comparator);
            }
        }
        return (List) map.collect(Collectors.toList());
    }

    private static Path requireExists(Path path, String str, LinkOption... linkOptionArr) {
        Objects.requireNonNull(path, str);
        if (exists(path, linkOptionArr)) {
            return path;
        }
        androidx.navigation.b.r("File system element for parameter '", str, "' does not exist: '", path, "'");
        return null;
    }

    public static Path resolve(Path path, Path path2) {
        FileSystem fileSystem;
        FileSystem fileSystem2;
        String separator;
        String separator2;
        String path3;
        Path resolve;
        Path resolve2;
        fileSystem = path.getFileSystem();
        fileSystem2 = path2.getFileSystem();
        if (fileSystem == fileSystem2) {
            resolve2 = path.resolve(path2);
            return resolve2;
        }
        separator = fileSystem2.getSeparator();
        separator2 = fileSystem.getSeparator();
        path3 = path2.toString();
        if (!Objects.equals(separator, separator2)) {
            path3 = path3.replace(separator, separator2);
        }
        resolve = path.resolve(path3);
        return resolve;
    }

    private static boolean setDosReadOnly(Path path, boolean z9, LinkOption... linkOptionArr) {
        DosFileAttributeView dosFileAttributeView = getDosFileAttributeView(path, linkOptionArr);
        if (dosFileAttributeView != null) {
            dosFileAttributeView.setReadOnly(z9);
            return true;
        }
        return false;
    }

    public static void setLastModifiedTime(Path path, Path path2) {
        Objects.requireNonNull(path, "sourceFile");
        Files.setLastModifiedTime(path2, getLastModifiedTime(path, new LinkOption[0]));
    }

    private static boolean setPosixDeletePermissions(Path path, boolean z9, LinkOption... linkOptionArr) {
        PosixFilePermission posixFilePermission;
        PosixFilePermission posixFilePermission2;
        posixFilePermission = PosixFilePermission.OWNER_WRITE;
        posixFilePermission2 = PosixFilePermission.OWNER_EXECUTE;
        return setPosixPermissions(path, z9, Arrays.asList(posixFilePermission, posixFilePermission2), linkOptionArr);
    }

    private static boolean setPosixPermissions(Path path, boolean z9, List<PosixFilePermission> list, LinkOption... linkOptionArr) {
        Set posixFilePermissions;
        if (path != null) {
            posixFilePermissions = Files.getPosixFilePermissions(path, linkOptionArr);
            HashSet hashSet = new HashSet(posixFilePermissions);
            if (z9) {
                hashSet.addAll(list);
            } else {
                hashSet.removeAll(list);
            }
            if (!hashSet.equals(posixFilePermissions)) {
                Files.setPosixFilePermissions(path, hashSet);
                return true;
            }
            return true;
        }
        return false;
    }

    private static void setPosixReadOnlyFile(Path path, boolean z9, LinkOption... linkOptionArr) {
        Set posixFilePermissions;
        PosixFilePermission posixFilePermission;
        PosixFilePermission posixFilePermission2;
        posixFilePermissions = Files.getPosixFilePermissions(path, linkOptionArr);
        posixFilePermission = PosixFilePermission.OWNER_READ;
        List asList = Arrays.asList(posixFilePermission);
        posixFilePermission2 = PosixFilePermission.OWNER_WRITE;
        List asList2 = Arrays.asList(posixFilePermission2);
        if (z9) {
            posixFilePermissions.addAll(asList);
            posixFilePermissions.removeAll(asList2);
        } else {
            posixFilePermissions.addAll(asList);
            posixFilePermissions.addAll(asList2);
        }
        Files.setPosixFilePermissions(path, posixFilePermissions);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0004, code lost:
    
        if (setDosReadOnly(r2, r3, r4) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.nio.file.Path setReadOnly(java.nio.file.Path r2, boolean r3, java.nio.file.LinkOption... r4) {
        /*
            boolean r0 = setDosReadOnly(r2, r3, r4)     // Catch: java.io.IOException -> L7
            if (r0 == 0) goto L7
            goto L1f
        L7:
            java.nio.file.Path r0 = getParent(r2)
            boolean r1 = isPosix(r0, r4)
            if (r1 == 0) goto L20
            if (r3 == 0) goto L1b
            setPosixReadOnlyFile(r2, r3, r4)
            r3 = 0
            setPosixDeletePermissions(r0, r3, r4)
            goto L1f
        L1b:
            r3 = 1
            setPosixDeletePermissions(r0, r3, r4)
        L1f:
            return r2
        L20:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = java.util.Arrays.toString(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r4}
            java.lang.String r4 = "DOS or POSIX file operations not available for '%s', linkOptions %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            r3.<init>(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.file.PathUtils.setReadOnly(java.nio.file.Path, boolean, java.nio.file.LinkOption[]):java.nio.file.Path");
    }

    public static long sizeOf(Path path) {
        boolean isDirectory;
        long size;
        requireExists(path, "path", new LinkOption[0]);
        isDirectory = Files.isDirectory(path, new LinkOption[0]);
        if (!isDirectory) {
            size = Files.size(path);
            return size;
        }
        return sizeOfDirectory(path);
    }

    public static BigInteger sizeOfAsBigInteger(Path path) {
        boolean isDirectory;
        long size;
        requireExists(path, "path", new LinkOption[0]);
        isDirectory = Files.isDirectory(path, new LinkOption[0]);
        if (!isDirectory) {
            size = Files.size(path);
            return BigInteger.valueOf(size);
        }
        return sizeOfDirectoryAsBigInteger(path);
    }

    public static long sizeOfDirectory(Path path) {
        return countDirectory(path).getByteCounter().getLong().longValue();
    }

    public static BigInteger sizeOfDirectoryAsBigInteger(Path path) {
        return countDirectoryAsBigInteger(path).getByteCounter().getBigInteger();
    }

    public static Path stripTrailingSeparator(Path path) {
        FileSystem fileSystem;
        String separator;
        Path resolveSibling;
        fileSystem = path.getFileSystem();
        separator = fileSystem.getSeparator();
        String fileNameString = getFileNameString(path);
        if (fileNameString != null && fileNameString.endsWith(separator)) {
            resolveSibling = path.resolveSibling(fileNameString.substring(0, fileNameString.length() - 1));
            return resolveSibling;
        }
        return path;
    }

    public static Set<FileVisitOption> toFileVisitOptionSet(FileVisitOption... fileVisitOptionArr) {
        if (fileVisitOptionArr == null) {
            return EnumSet.noneOf(f.A());
        }
        return (Set) Stream.of((Object[]) fileVisitOptionArr).collect(Collectors.toSet());
    }

    private static <T> List<T> toList(Iterable<T> iterable) {
        return (List) StreamSupport.stream(iterable.spliterator(), false).collect(Collectors.toList());
    }

    private static List<Path> toSortedList(Iterable<Path> iterable) {
        List<Path> list = toList(iterable);
        Collections.sort(list);
        return list;
    }

    public static Path touch(Path path) {
        boolean exists;
        Objects.requireNonNull(path, "file");
        exists = Files.exists(path, new LinkOption[0]);
        if (!exists) {
            createParentDirectories(path, new FileAttribute[0]);
            Files.createFile(path, new FileAttribute[0]);
            return path;
        }
        FileTimes.setLastModifiedTime(path);
        return path;
    }

    public static <T extends FileVisitor<? super Path>> T visitFileTree(T t, String str, String... strArr) {
        Path path;
        path = Paths.get(str, strArr);
        return (T) visitFileTree(t, path);
    }

    public static boolean waitFor(Path path, Duration duration, LinkOption... linkOptionArr) {
        Instant now;
        Instant plus;
        Instant now2;
        boolean isAfter;
        long epochMilli;
        Instant minusMillis;
        long epochMilli2;
        Duration ofMillis;
        Objects.requireNonNull(path, "file");
        now = Instant.now();
        plus = now.plus((TemporalAmount) duration);
        boolean z9 = false;
        while (!exists(path, linkOptionArr)) {
            try {
                now2 = Instant.now();
                isAfter = now2.isAfter(plus);
                if (!isAfter) {
                    try {
                        epochMilli = now2.toEpochMilli();
                        minusMillis = plus.minusMillis(epochMilli);
                        epochMilli2 = minusMillis.toEpochMilli();
                        ofMillis = Duration.ofMillis(Math.min(100L, epochMilli2));
                        ThreadUtils.sleep(ofMillis);
                    } catch (InterruptedException unused) {
                        z9 = true;
                    } catch (Exception unused2) {
                    }
                } else {
                    return false;
                }
            } finally {
                if (z9) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        return exists(path, linkOptionArr);
    }

    public static Stream<Path> walk(Path path, final PathFilter pathFilter, int i10, final boolean z9, FileVisitOption... fileVisitOptionArr) {
        Stream walk;
        walk = Files.walk(path, i10, fileVisitOptionArr);
        return walk.filter(new Predicate() { // from class: org.apache.commons.io.file.g
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$walk$4;
                lambda$walk$4 = PathUtils.lambda$walk$4(PathFilter.this, z9, (Path) obj);
                return lambda$walk$4;
            }
        });
    }

    private static <R> R withPosixFileAttributes(Path path, LinkOption[] linkOptionArr, boolean z9, IOFunction<PosixFileAttributes, R> iOFunction) {
        PosixFileAttributes posixFileAttributes;
        boolean exists;
        Set permissions;
        if (z9) {
            posixFileAttributes = readPosixFileAttributes(path, linkOptionArr);
        } else {
            posixFileAttributes = null;
        }
        try {
            return iOFunction.apply(posixFileAttributes);
        } finally {
            if (posixFileAttributes != null && path != null) {
                exists = Files.exists(path, linkOptionArr);
                if (exists) {
                    permissions = posixFileAttributes.permissions();
                    Files.setPosixFilePermissions(path, permissions);
                }
            }
        }
    }

    public static Path writeString(Path path, CharSequence charSequence, Charset charset, OpenOption... openOptionArr) {
        Objects.requireNonNull(path, "path");
        Objects.requireNonNull(charSequence, "charSequence");
        Files.write(path, String.valueOf(charSequence).getBytes(Charsets.toCharset(charset)), openOptionArr);
        return path;
    }

    public static <T extends FileVisitor<? super Path>> T visitFileTree(T t, Path path, Set<FileVisitOption> set, int i10) {
        Files.walkFileTree(path, set, i10, t);
        return t;
    }

    public static <T extends FileVisitor<? super Path>> T visitFileTree(T t, Path path) {
        Files.walkFileTree(path, t);
        return t;
    }

    public static <T extends FileVisitor<? super Path>> T visitFileTree(T t, URI uri) {
        Path path;
        path = Paths.get(uri);
        return (T) visitFileTree(t, path);
    }

    public static BasicFileAttributes readBasicFileAttributes(Path path, LinkOption... linkOptionArr) {
        return readAttributes(path, kotlin.io.path.f.f(), linkOptionArr);
    }

    public static boolean directoryContentEquals(Path path, Path path2) {
        return directoryContentEquals(path, path2, Integer.MAX_VALUE, EMPTY_LINK_OPTION_ARRAY, EMPTY_FILE_VISIT_OPTION_ARRAY);
    }

    public static FileTime getLastModifiedFileTime(File file) {
        Path path;
        path = file.toPath();
        return getLastModifiedFileTime(path, null, EMPTY_LINK_OPTION_ARRAY);
    }

    public static FileTime getLastModifiedFileTime(Path path, LinkOption... linkOptionArr) {
        return getLastModifiedFileTime(path, null, linkOptionArr);
    }

    public static FileTime getLastModifiedFileTime(URI uri) {
        Path path;
        path = Paths.get(uri);
        return getLastModifiedFileTime(path, null, EMPTY_LINK_OPTION_ARRAY);
    }

    public static FileTime getLastModifiedFileTime(URL url) {
        return getLastModifiedFileTime(url.toURI());
    }

    public static boolean isNewer(Path path, ChronoZonedDateTime<?> chronoZonedDateTime, LinkOption... linkOptionArr) {
        Instant instant;
        Objects.requireNonNull(chronoZonedDateTime, "czdt");
        instant = chronoZonedDateTime.toInstant();
        return isNewer(path, instant, linkOptionArr);
    }

    public static boolean isOlder(Path path, Instant instant, LinkOption... linkOptionArr) {
        FileTime from;
        from = FileTime.from(instant);
        return isOlder(path, from, linkOptionArr);
    }

    public static boolean isOlder(Path path, long j10, LinkOption... linkOptionArr) {
        FileTime fromMillis;
        fromMillis = FileTime.fromMillis(j10);
        return isOlder(path, fromMillis, linkOptionArr);
    }

    public static boolean isNewer(Path path, Instant instant, LinkOption... linkOptionArr) {
        FileTime from;
        from = FileTime.from(instant);
        return isNewer(path, from, linkOptionArr);
    }

    public static boolean isOlder(Path path, Path path2) {
        return isOlder(path, getLastModifiedTime(path2, new LinkOption[0]), new LinkOption[0]);
    }

    public static Path copyFileToDirectory(URL url, Path path, CopyOption... copyOptionArr) {
        Path resolve;
        resolve = path.resolve(FilenameUtils.getName(url.getFile()));
        copy(new r(0, url), resolve, copyOptionArr);
        return resolve;
    }

    public static boolean isNewer(Path path, long j10, LinkOption... linkOptionArr) {
        FileTime fromMillis;
        fromMillis = FileTime.fromMillis(j10);
        return isNewer(path, fromMillis, linkOptionArr);
    }

    public static Counters.PathCounters cleanDirectory(Path path) {
        return cleanDirectory(path, EMPTY_DELETE_OPTION_ARRAY);
    }

    public static boolean isNewer(Path path, Path path2) {
        return isNewer(path, getLastModifiedTime(path2, new LinkOption[0]), new LinkOption[0]);
    }

    public static Counters.PathCounters deleteDirectory(Path path) {
        return deleteDirectory(path, EMPTY_DELETE_OPTION_ARRAY);
    }

    public static Counters.PathCounters deleteDirectory(Path path, LinkOption[] linkOptionArr, DeleteOption... deleteOptionArr) {
        return ((DeletingPathVisitor) visitFileTree(new DeletingPathVisitor(Counters.longPathCounters(), linkOptionArr, deleteOptionArr, new String[0]), path)).getPathCounters();
    }

    public static Counters.PathCounters delete(Path path) {
        return delete(path, EMPTY_DELETE_OPTION_ARRAY);
    }

    public static Counters.PathCounters delete(Path path, LinkOption[] linkOptionArr, DeleteOption... deleteOptionArr) {
        boolean isDirectory;
        isDirectory = Files.isDirectory(path, linkOptionArr);
        return isDirectory ? deleteDirectory(path, linkOptionArr, deleteOptionArr) : deleteFile(path, linkOptionArr, deleteOptionArr);
    }

    public static Path createParentDirectories(Path path, FileAttribute<?>... fileAttributeArr) {
        LinkOption linkOption;
        linkOption = LinkOption.NOFOLLOW_LINKS;
        return createParentDirectories(path, linkOption, fileAttributeArr);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static final class RelativeSortedPaths {
        final boolean equals;
        final List<Path> relativeFileList1;
        final List<Path> relativeFileList2;

        private RelativeSortedPaths(Path path, Path path2, int i10, LinkOption[] linkOptionArr, FileVisitOption[] fileVisitOptionArr) {
            boolean z9;
            boolean z10;
            boolean notExists;
            boolean notExists2;
            List<Path> list;
            List<Path> list2 = null;
            if (path == null && path2 == null) {
                this.equals = true;
            } else {
                if (path == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (path2 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!(z9 ^ z10)) {
                    notExists = Files.notExists(path, linkOptionArr);
                    notExists2 = Files.notExists(path2, linkOptionArr);
                    if (!notExists && !notExists2) {
                        AccumulatorPathVisitor accumulate = PathUtils.accumulate(path, i10, fileVisitOptionArr);
                        AccumulatorPathVisitor accumulate2 = PathUtils.accumulate(path2, i10, fileVisitOptionArr);
                        if (accumulate.getDirList().size() == accumulate2.getDirList().size() && accumulate.getFileList().size() == accumulate2.getFileList().size()) {
                            if (!equalsIgnoreFileSystem(accumulate.relativizeDirectories(path, true, null), accumulate2.relativizeDirectories(path2, true, null))) {
                                this.equals = false;
                            } else {
                                List<Path> relativizeFiles = accumulate.relativizeFiles(path, true, null);
                                List<Path> relativizeFiles2 = accumulate2.relativizeFiles(path2, true, null);
                                this.equals = equalsIgnoreFileSystem(relativizeFiles, relativizeFiles2);
                                list2 = relativizeFiles;
                                list = relativizeFiles2;
                                this.relativeFileList1 = list2;
                                this.relativeFileList2 = list;
                            }
                        } else {
                            this.equals = false;
                        }
                    } else {
                        this.equals = notExists && notExists2;
                    }
                } else {
                    this.equals = false;
                }
            }
            list = null;
            this.relativeFileList1 = list2;
            this.relativeFileList2 = list;
        }

        private static boolean equalsIgnoreFileSystem(List<Path> list, List<Path> list2) {
            if (list.size() == list2.size()) {
                Iterator<Path> it = list.iterator();
                Iterator<Path> it2 = list2.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    if (!equalsIgnoreFileSystem(kotlin.internal.jdk8.a.m(it.next()), kotlin.internal.jdk8.a.m(it2.next()))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }

        public static String extractKey(String str, String str2) {
            return str2.replaceAll("\\" + str, ">");
        }

        private static boolean equalsIgnoreFileSystem(Path path, Path path2) {
            FileSystem fileSystem;
            FileSystem fileSystem2;
            String separator;
            String separator2;
            String path3;
            String path4;
            boolean equals;
            fileSystem = path.getFileSystem();
            fileSystem2 = path2.getFileSystem();
            if (fileSystem == fileSystem2) {
                equals = path.equals(path2);
                return equals;
            }
            separator = fileSystem.getSeparator();
            separator2 = fileSystem2.getSeparator();
            path3 = path.toString();
            path4 = path2.toString();
            if (Objects.equals(separator, separator2)) {
                return Objects.equals(path3, path4);
            }
            return extractKey(separator, path3).equals(extractKey(separator2, path4));
        }

        public /* synthetic */ RelativeSortedPaths(Path path, Path path2, int i10, LinkOption[] linkOptionArr, FileVisitOption[] fileVisitOptionArr, AnonymousClass1 anonymousClass1) {
            this(path, path2, i10, linkOptionArr, fileVisitOptionArr);
        }
    }

    public static OutputStream newOutputStream(Path path, boolean z9) {
        return newOutputStream(path, EMPTY_LINK_OPTION_ARRAY, z9 ? OPEN_OPTIONS_APPEND : OPEN_OPTIONS_TRUNCATE);
    }

    public static Counters.PathCounters deleteFile(Path path, DeleteOption... deleteOptionArr) {
        return deleteFile(path, noFollowLinkOptionArray(), deleteOptionArr);
    }

    public static Counters.PathCounters deleteFile(Path path) {
        return deleteFile(path, EMPTY_DELETE_OPTION_ARRAY);
    }

    public static boolean directoryAndFileContentEquals(Path path, Path path2) {
        return directoryAndFileContentEquals(path, path2, EMPTY_LINK_OPTION_ARRAY, EMPTY_OPEN_OPTION_ARRAY, EMPTY_FILE_VISIT_OPTION_ARRAY);
    }

    public static boolean fileContentEquals(Path path, Path path2) {
        return fileContentEquals(path, path2, EMPTY_LINK_OPTION_ARRAY, EMPTY_OPEN_OPTION_ARRAY);
    }
}
