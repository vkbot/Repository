package org.apache.commons.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.math.BigInteger;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;
import org.apache.commons.io.file.AccumulatorPathVisitor;
import org.apache.commons.io.file.Counters;
import org.apache.commons.io.file.PathUtils;
import org.apache.commons.io.file.StandardDeleteOption;
import org.apache.commons.io.filefilter.FileEqualsFileFilter;
import org.apache.commons.io.filefilter.FileFileFilter;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.function.Uncheck;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class FileUtils {
    public static final File[] EMPTY_FILE_ARRAY;
    public static final long ONE_EB = 1152921504606846976L;
    public static final BigInteger ONE_EB_BI;
    public static final long ONE_GB = 1073741824;
    public static final BigInteger ONE_GB_BI;
    public static final long ONE_KB = 1024;
    public static final BigInteger ONE_KB_BI;
    public static final long ONE_MB = 1048576;
    public static final BigInteger ONE_MB_BI;
    public static final long ONE_PB = 1125899906842624L;
    public static final BigInteger ONE_PB_BI;
    public static final BigInteger ONE_QB;
    public static final BigInteger ONE_RB;
    public static final long ONE_TB = 1099511627776L;
    public static final BigInteger ONE_TB_BI;
    public static final BigInteger ONE_YB;
    public static final BigInteger ONE_ZB;
    private static final String PROTOCOL_FILE = "file";

    static {
        BigInteger valueOf = BigInteger.valueOf(1024L);
        ONE_KB_BI = valueOf;
        BigInteger multiply = valueOf.multiply(valueOf);
        ONE_MB_BI = multiply;
        BigInteger multiply2 = valueOf.multiply(multiply);
        ONE_GB_BI = multiply2;
        BigInteger multiply3 = valueOf.multiply(multiply2);
        ONE_TB_BI = multiply3;
        BigInteger multiply4 = valueOf.multiply(multiply3);
        ONE_PB_BI = multiply4;
        BigInteger multiply5 = valueOf.multiply(multiply4);
        ONE_EB_BI = multiply5;
        BigInteger multiply6 = valueOf.multiply(multiply5);
        ONE_ZB = multiply6;
        BigInteger multiply7 = valueOf.multiply(multiply6);
        ONE_YB = multiply7;
        BigInteger multiply8 = valueOf.multiply(multiply7);
        ONE_RB = multiply8;
        ONE_QB = valueOf.multiply(multiply8);
        EMPTY_FILE_ARRAY = new File[0];
    }

    @Deprecated
    public FileUtils() {
    }

    public static String byteCountToDisplaySize(BigInteger bigInteger) {
        Objects.requireNonNull(bigInteger, "size");
        BigInteger bigInteger2 = ONE_QB;
        BigInteger divide = bigInteger.divide(bigInteger2);
        BigInteger bigInteger3 = BigInteger.ZERO;
        if (divide.compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger2) + " QB";
        }
        BigInteger bigInteger4 = ONE_RB;
        if (bigInteger.divide(bigInteger4).compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger4) + " RB";
        }
        BigInteger bigInteger5 = ONE_YB;
        if (bigInteger.divide(bigInteger5).compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger5) + " YB";
        }
        BigInteger bigInteger6 = ONE_ZB;
        if (bigInteger.divide(bigInteger6).compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger6) + " ZB";
        }
        BigInteger bigInteger7 = ONE_EB_BI;
        if (bigInteger.divide(bigInteger7).compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger7) + " EB";
        }
        BigInteger bigInteger8 = ONE_PB_BI;
        if (bigInteger.divide(bigInteger8).compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger8) + " PB";
        }
        BigInteger bigInteger9 = ONE_TB_BI;
        if (bigInteger.divide(bigInteger9).compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger9) + " TB";
        }
        BigInteger bigInteger10 = ONE_GB_BI;
        if (bigInteger.divide(bigInteger10).compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger10) + " GB";
        }
        BigInteger bigInteger11 = ONE_MB_BI;
        if (bigInteger.divide(bigInteger11).compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger11) + " MB";
        }
        BigInteger bigInteger12 = ONE_KB_BI;
        if (bigInteger.divide(bigInteger12).compareTo(bigInteger3) > 0) {
            return bigInteger.divide(bigInteger12) + " KB";
        }
        return bigInteger + " bytes";
    }

    public static /* synthetic */ FileVisitResult c(Path path, IOException iOException) {
        return lambda$listAccumulate$9(path, iOException);
    }

    private static void checkExists(File file, boolean z9) {
        Objects.requireNonNull(file, PROTOCOL_FILE);
        if (z9 && !file.exists() && !isSymlink(file)) {
            throw new FileNotFoundException(file.toString());
        }
    }

    private static void checkFileExists(File file, String str) {
        Path path;
        boolean isSymbolicLink;
        Objects.requireNonNull(file, str);
        if (!file.isFile()) {
            if (!file.exists()) {
                path = file.toPath();
                isSymbolicLink = Files.isSymbolicLink(path);
                if (!isSymbolicLink) {
                    e.b(file, "Source '", "' does not exist");
                    return;
                }
                return;
            }
            androidx.navigation.b.v("Parameter '", str, "' is not a file: ", file);
        }
    }

    private static File checkIsFile(File file, String str) {
        if (file.isFile()) {
            return file;
        }
        n0.b.v("Parameter '%s' is not a file: %s", new Object[]{str, file});
        return null;
    }

    public static Checksum checksum(File file, Checksum checksum) {
        Path path;
        InputStream newInputStream;
        checkFileExists(file, PROTOCOL_FILE);
        Objects.requireNonNull(checksum, "checksum");
        path = file.toPath();
        newInputStream = Files.newInputStream(path, new OpenOption[0]);
        CheckedInputStream checkedInputStream = new CheckedInputStream(newInputStream, checksum);
        try {
            IOUtils.consume(checkedInputStream);
            checkedInputStream.close();
            return checksum;
        } catch (Throwable th) {
            try {
                checkedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long checksumCRC32(File file) {
        return checksum(file, new CRC32()).getValue();
    }

    public static void cleanDirectory(File file) {
        IOConsumer.forAll(new s(1), listFiles(file, null));
    }

    private static void cleanDirectoryOnExit(File file) {
        IOConsumer.forAll(new s(0), listFiles(file, null));
    }

    public static boolean contentEquals(File file, File file2) {
        boolean exists;
        Path path;
        Path path2;
        if (file != null || file2 != null) {
            if (file != null && file2 != null && (exists = file.exists()) == file2.exists()) {
                if (exists) {
                    checkIsFile(file, "file1");
                    checkIsFile(file2, "file2");
                    if (file.length() == file2.length()) {
                        if (!file.getCanonicalFile().equals(file2.getCanonicalFile())) {
                            path = file.toPath();
                            path2 = file2.toPath();
                            return PathUtils.fileContentEquals(path, path2);
                        }
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean contentEqualsIgnoreEOL(File file, File file2, String str) {
        boolean exists;
        Path path;
        InputStream newInputStream;
        Path path2;
        InputStream newInputStream2;
        if (file != null || file2 != null) {
            if (file == null || file2 == null || (exists = file.exists()) != file2.exists()) {
                return false;
            }
            if (exists) {
                checkFileExists(file, "file1");
                checkFileExists(file2, "file2");
                if (file.getCanonicalFile().equals(file2.getCanonicalFile())) {
                    return true;
                }
                Charset charset = Charsets.toCharset(str);
                path = file.toPath();
                newInputStream = Files.newInputStream(path, new OpenOption[0]);
                InputStreamReader inputStreamReader = new InputStreamReader(newInputStream, charset);
                try {
                    path2 = file2.toPath();
                    newInputStream2 = Files.newInputStream(path2, new OpenOption[0]);
                    InputStreamReader inputStreamReader2 = new InputStreamReader(newInputStream2, charset);
                    try {
                        boolean contentEqualsIgnoreEOL = IOUtils.contentEqualsIgnoreEOL(inputStreamReader, inputStreamReader2);
                        inputStreamReader2.close();
                        inputStreamReader.close();
                        return contentEqualsIgnoreEOL;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            return true;
        }
        return true;
    }

    public static File[] convertFileCollectionToFileArray(Collection<File> collection) {
        return (File[]) collection.toArray(EMPTY_FILE_ARRAY);
    }

    public static void copyDirectory(File file, File file2, FileFilter fileFilter, boolean z9, CopyOption... copyOptionArr) {
        ArrayList arrayList;
        Objects.requireNonNull(file2, "destination");
        requireDirectoryExists(file, "srcDir");
        requireCanonicalPathsNotEquals(file, file2);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            File[] listFiles = listFiles(file, fileFilter);
            if (listFiles.length > 0) {
                arrayList = new ArrayList(listFiles.length);
                for (File file3 : listFiles) {
                    arrayList.add(new File(file2, file3.getName()).getCanonicalPath());
                }
                doCopyDirectory(file, file2, fileFilter, arrayList, z9, copyOptionArr);
            }
        }
        arrayList = null;
        doCopyDirectory(file, file2, fileFilter, arrayList, z9, copyOptionArr);
    }

    public static void copyDirectoryToDirectory(File file, File file2) {
        Objects.requireNonNull(file, "sourceDir");
        requireDirectoryIfExists(file2, "destinationDir");
        copyDirectory(file, new File(file2, file.getName()), true);
    }

    public static void copyFile(File file, File file2, boolean z9, CopyOption... copyOptionArr) {
        Path path;
        Path path2;
        boolean isSymbolicLink;
        Objects.requireNonNull(file2, "destination");
        checkFileExists(file, "srcFile");
        requireCanonicalPathsNotEquals(file, file2);
        createParentDirectories(file2);
        if (file2.exists()) {
            checkFileExists(file2, "destFile");
        }
        path = file.toPath();
        path2 = file2.toPath();
        Files.copy(path, path2, copyOptionArr);
        if (z9) {
            isSymbolicLink = Files.isSymbolicLink(path);
            if (!isSymbolicLink && !setTimes(file, file2)) {
                n0.b.A("Cannot set the file time.");
            }
        }
    }

    public static void copyFileToDirectory(File file, File file2, boolean z9) {
        Objects.requireNonNull(file, "sourceFile");
        requireDirectoryIfExists(file2, "destinationDir");
        copyFile(file, new File(file2, file.getName()), z9);
    }

    public static void copyInputStreamToFile(InputStream inputStream, File file) {
        try {
            copyToFile(inputStream, file);
            if (inputStream != null) {
                inputStream.close();
            }
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

    public static void copyToDirectory(File file, File file2) {
        Objects.requireNonNull(file, "sourceFile");
        if (file.isFile()) {
            copyFileToDirectory(file, file2);
        } else if (file.isDirectory()) {
            copyDirectoryToDirectory(file, file2);
        } else {
            e.b(file, "The source ", " does not exist");
        }
    }

    public static void copyToFile(InputStream inputStream, File file) {
        OutputStream newOutputStream = newOutputStream(file, false);
        try {
            IOUtils.copy(inputStream, newOutputStream);
            if (newOutputStream != null) {
                newOutputStream.close();
            }
        } catch (Throwable th) {
            if (newOutputStream != null) {
                try {
                    newOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void copyURLToFile(URL url, File file, int i10, int i11) {
        CloseableURLConnection open = CloseableURLConnection.open(url);
        try {
            open.setConnectTimeout(i10);
            open.setReadTimeout(i11);
            InputStream inputStream = open.getInputStream();
            try {
                copyInputStreamToFile(inputStream, file);
                if (inputStream != null) {
                    inputStream.close();
                }
                open.close();
            } finally {
            }
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static File createParentDirectories(File file) {
        return mkdirs(getParentFile(file));
    }

    public static File current() {
        File file;
        file = PathUtils.current().toFile();
        return file;
    }

    public static String decodeUrl(String str) {
        int i10;
        if (str != null && str.indexOf(37) >= 0) {
            int length = str.length();
            StringBuilder sb = new StringBuilder();
            ByteBuffer allocate = ByteBuffer.allocate(length);
            int i11 = 0;
            while (i11 < length) {
                if (str.charAt(i11) == '%') {
                    while (true) {
                        i10 = i11 + 3;
                        try {
                            try {
                                allocate.put((byte) Integer.parseInt(str.substring(i11 + 1, i10), 16));
                                if (i10 >= length) {
                                    break;
                                }
                                try {
                                    if (str.charAt(i10) != '%') {
                                        break;
                                    }
                                    i11 = i10;
                                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                    i11 = i10;
                                    if (allocate.position() > 0) {
                                        allocate.flip();
                                        sb.append(StandardCharsets.UTF_8.decode(allocate).toString());
                                        allocate.clear();
                                    }
                                    sb.append(str.charAt(i11));
                                    i11++;
                                }
                            } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                            }
                        } finally {
                            if (allocate.position() > 0) {
                                allocate.flip();
                                sb.append(StandardCharsets.UTF_8.decode(allocate).toString());
                                allocate.clear();
                            }
                        }
                    }
                    i11 = i10;
                }
                sb.append(str.charAt(i11));
                i11++;
            }
            return sb.toString();
        }
        return str;
    }

    public static File delete(File file) {
        Path path;
        Objects.requireNonNull(file, PROTOCOL_FILE);
        path = file.toPath();
        Files.delete(path);
        return file;
    }

    public static void deleteDirectory(File file) {
        Objects.requireNonNull(file, "directory");
        if (!file.exists()) {
            return;
        }
        if (!isSymlink(file)) {
            cleanDirectory(file);
        }
        delete(file);
    }

    private static void deleteDirectoryOnExit(File file) {
        if (file.exists()) {
            file.deleteOnExit();
            if (!isSymlink(file)) {
                cleanDirectoryOnExit(file);
            }
        }
    }

    public static boolean deleteQuietly(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.isDirectory()) {
                cleanDirectory(file);
            }
        } catch (Exception unused) {
        }
        try {
            return file.delete();
        } catch (Exception unused2) {
            return false;
        }
    }

    public static boolean directoryContains(File file, File file2) {
        requireDirectoryExists(file, "directory");
        if (file2 != null && file2.exists()) {
            return FilenameUtils.directoryContains(file.getCanonicalPath(), file2.getCanonicalPath());
        }
        return false;
    }

    private static void doCopyDirectory(File file, File file2, FileFilter fileFilter, List<String> list, boolean z9, CopyOption... copyOptionArr) {
        FileFilter fileFilter2;
        List<String> list2;
        boolean z10;
        CopyOption[] copyOptionArr2;
        File[] listFiles = listFiles(file, fileFilter);
        requireDirectoryIfExists(file2, "destDir");
        mkdirs(file2);
        int length = listFiles.length;
        int i10 = 0;
        while (i10 < length) {
            File file3 = listFiles[i10];
            File file4 = new File(file2, file3.getName());
            if (list != null && list.contains(file3.getCanonicalPath())) {
                fileFilter2 = fileFilter;
                list2 = list;
                z10 = z9;
                copyOptionArr2 = copyOptionArr;
            } else if (file3.isDirectory()) {
                fileFilter2 = fileFilter;
                list2 = list;
                z10 = z9;
                copyOptionArr2 = copyOptionArr;
                doCopyDirectory(file3, file4, fileFilter2, list2, z10, copyOptionArr2);
            } else {
                fileFilter2 = fileFilter;
                list2 = list;
                z10 = z9;
                copyOptionArr2 = copyOptionArr;
                copyFile(file3, file4, z10, copyOptionArr2);
            }
            i10++;
            fileFilter = fileFilter2;
            list = list2;
            z9 = z10;
            copyOptionArr = copyOptionArr2;
        }
        if (z9) {
            setTimes(file, file2);
        }
    }

    public static void forceDelete(File file, boolean z9) {
        checkExists(file, z9);
        try {
            Counters.PathCounters delete = PathUtils.delete(file.toPath(), PathUtils.EMPTY_LINK_OPTION_ARRAY, StandardDeleteOption.OVERRIDE_READ_ONLY);
            if (delete.getFileCounter().get() < 1 && delete.getDirectoryCounter().get() < 1) {
                e.a(file, "File does not exist: ");
            }
        } catch (NoSuchFileException e) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Cannot delete file: " + file);
            fileNotFoundException.initCause(e);
            throw fileNotFoundException;
        } catch (IOException e6) {
            throw new IOException("Cannot delete file: " + file, e6);
        }
    }

    public static void forceDeleteOnExit(File file) {
        Objects.requireNonNull(file, PROTOCOL_FILE);
        if (file.isDirectory()) {
            deleteDirectoryOnExit(file);
        } else {
            file.deleteOnExit();
        }
    }

    public static void forceMkdir(File file) {
        mkdirs(file);
    }

    public static void forceMkdirParent(File file) {
        Objects.requireNonNull(file, PROTOCOL_FILE);
        forceMkdir(getParentFile(file));
    }

    public static File getFile(String... strArr) {
        Objects.requireNonNull(strArr, "names");
        File file = null;
        for (String str : strArr) {
            if (file == null) {
                file = new File(str);
            } else {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static File getParentFile(File file) {
        if (file == null) {
            return null;
        }
        return file.getParentFile();
    }

    public static File getTempDirectory() {
        return new File(getTempDirectoryPath());
    }

    public static String getTempDirectoryPath() {
        return System.getProperty("java.io.tmpdir");
    }

    public static File getUserDirectory() {
        return new File(getUserDirectoryPath());
    }

    public static String getUserDirectoryPath() {
        return System.getProperty("user.home");
    }

    public static boolean isDirectory(File file, LinkOption... linkOptionArr) {
        Path path;
        boolean isDirectory;
        if (file != null) {
            path = file.toPath();
            isDirectory = Files.isDirectory(path, linkOptionArr);
            if (isDirectory) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isEmptyDirectory(File file) {
        Path path;
        path = file.toPath();
        return PathUtils.isEmptyDirectory(path);
    }

    public static boolean isFileNewer(File file, ChronoLocalDate chronoLocalDate, OffsetTime offsetTime) {
        LocalTime localTime;
        ChronoLocalDateTime atTime;
        Objects.requireNonNull(chronoLocalDate, "chronoLocalDate");
        Objects.requireNonNull(offsetTime, "offsetTime");
        localTime = offsetTime.toLocalTime();
        atTime = chronoLocalDate.atTime(localTime);
        return isFileNewer(file, (ChronoLocalDateTime<?>) atTime);
    }

    public static boolean isFileOlder(File file, ChronoLocalDate chronoLocalDate, OffsetTime offsetTime) {
        LocalTime localTime;
        ChronoLocalDateTime atTime;
        Objects.requireNonNull(chronoLocalDate, "chronoLocalDate");
        Objects.requireNonNull(offsetTime, "offsetTime");
        localTime = offsetTime.toLocalTime();
        atTime = chronoLocalDate.atTime(localTime);
        return isFileOlder(file, (ChronoLocalDateTime<?>) atTime);
    }

    private static boolean isFileProtocol(URL url) {
        return PROTOCOL_FILE.equalsIgnoreCase(url.getProtocol());
    }

    public static boolean isRegularFile(File file, LinkOption... linkOptionArr) {
        Path path;
        boolean isRegularFile;
        if (file != null) {
            path = file.toPath();
            isRegularFile = Files.isRegularFile(path, linkOptionArr);
            if (isRegularFile) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isSymlink(File file) {
        Path path;
        boolean isSymbolicLink;
        if (file != null) {
            path = file.toPath();
            isSymbolicLink = Files.isSymbolicLink(path);
            if (isSymbolicLink) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Iterator<File> iterateFiles(File file, String[] strArr, boolean z9) {
        return StreamIterator.iterator((Stream) Uncheck.get(new i(file, z9, strArr, 0)));
    }

    public static Iterator<File> iterateFilesAndDirs(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return listFilesAndDirs(file, iOFileFilter, iOFileFilter2).iterator();
    }

    public static /* synthetic */ boolean lambda$isFileNewer$1(File file, ChronoZonedDateTime chronoZonedDateTime) {
        Path path;
        path = file.toPath();
        return PathUtils.isNewer(path, (ChronoZonedDateTime<?>) chronoZonedDateTime, new LinkOption[0]);
    }

    public static /* synthetic */ boolean lambda$isFileNewer$2(File file, File file2) {
        Path path;
        Path path2;
        path = file.toPath();
        path2 = file2.toPath();
        return PathUtils.isNewer(path, path2);
    }

    public static /* synthetic */ boolean lambda$isFileNewer$3(File file, Instant instant) {
        Path path;
        path = file.toPath();
        return PathUtils.isNewer(path, instant, new LinkOption[0]);
    }

    public static /* synthetic */ boolean lambda$isFileNewer$4(File file, long j10) {
        Path path;
        path = file.toPath();
        return PathUtils.isNewer(path, j10, new LinkOption[0]);
    }

    public static /* synthetic */ boolean lambda$isFileOlder$5(File file, File file2) {
        Path path;
        Path path2;
        path = file.toPath();
        path2 = file2.toPath();
        return PathUtils.isOlder(path, path2);
    }

    public static /* synthetic */ boolean lambda$isFileOlder$6(File file, Instant instant) {
        Path path;
        path = file.toPath();
        return PathUtils.isOlder(path, instant, new LinkOption[0]);
    }

    public static /* synthetic */ boolean lambda$isFileOlder$7(File file, long j10) {
        Path path;
        path = file.toPath();
        return PathUtils.isOlder(path, j10, new LinkOption[0]);
    }

    private static /* synthetic */ FileVisitResult lambda$listAccumulate$9(Path path, IOException iOException) {
        FileVisitResult fileVisitResult;
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    public static /* synthetic */ AccumulatorPathVisitor lambda$listFiles$10(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2, File file) {
        FileVisitOption fileVisitOption;
        IOFileFilter and = FileFileFilter.INSTANCE.and(iOFileFilter);
        fileVisitOption = FileVisitOption.FOLLOW_LINKS;
        return listAccumulate(file, and, iOFileFilter2, fileVisitOption);
    }

    public static /* synthetic */ void lambda$listFiles$11(boolean z9, List list, FilenameFilter filenameFilter, File file, List list2, File file2) {
        if (z9 && file2.isDirectory()) {
            list.add(file2);
        } else if (file2.isFile() && filenameFilter.accept(file, file2.getName())) {
            list2.add(file2);
        }
    }

    public static /* synthetic */ AccumulatorPathVisitor lambda$listFilesAndDirs$13(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2, File file) {
        FileVisitOption fileVisitOption;
        fileVisitOption = FileVisitOption.FOLLOW_LINKS;
        return listAccumulate(file, iOFileFilter, iOFileFilter2, fileVisitOption);
    }

    public static /* synthetic */ InputStream lambda$readFileToString$14(File file) {
        Path path;
        InputStream newInputStream;
        path = file.toPath();
        newInputStream = Files.newInputStream(path, new OpenOption[0]);
        return newInputStream;
    }

    public static /* synthetic */ long lambda$sizeOf$15(File file) {
        Path path;
        path = file.toPath();
        return PathUtils.sizeOf(path);
    }

    public static /* synthetic */ BigInteger lambda$sizeOfAsBigInteger$16(File file) {
        Path path;
        path = file.toPath();
        return PathUtils.sizeOfAsBigInteger(path);
    }

    public static /* synthetic */ long lambda$sizeOfDirectory$17(File file) {
        Path path;
        path = file.toPath();
        return PathUtils.sizeOfDirectory(path);
    }

    public static /* synthetic */ BigInteger lambda$sizeOfDirectoryAsBigInteger$18(File file) {
        Path path;
        path = file.toPath();
        return PathUtils.sizeOfDirectoryAsBigInteger(path);
    }

    public static /* synthetic */ String lambda$toSuffixes$19(String str) {
        if (str.charAt(0) == '.') {
            return str;
        }
        return ".".concat(str);
    }

    public static /* synthetic */ String[] lambda$toSuffixes$20(int i10) {
        return new String[i10];
    }

    public static long lastModified(File file) {
        long millis;
        millis = lastModifiedFileTime(file).toMillis();
        return millis;
    }

    public static FileTime lastModifiedFileTime(File file) {
        Path path;
        FileTime lastModifiedTime;
        Objects.requireNonNull(file, PROTOCOL_FILE);
        path = file.toPath();
        lastModifiedTime = Files.getLastModifiedTime(path, new LinkOption[0]);
        return lastModifiedTime;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, org.apache.commons.io.function.IOFunction] */
    public static long lastModifiedUnchecked(File file) {
        return ((Long) Uncheck.apply(new Object(), file)).longValue();
    }

    public static LineIterator lineIterator(File file, String str) {
        Path path;
        InputStream inputStream = null;
        try {
            path = file.toPath();
            inputStream = Files.newInputStream(path, new OpenOption[0]);
            return IOUtils.lineIterator(inputStream, str);
        } catch (IOException | RuntimeException e) {
            IOUtils.closeQuietly(inputStream, new t(e, 0));
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, org.apache.commons.io.function.IOBiFunction] */
    private static AccumulatorPathVisitor listAccumulate(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2, FileVisitOption... fileVisitOptionArr) {
        boolean z9;
        Path path;
        if (iOFileFilter2 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        IOFileFilter fileEqualsFileFilter = new FileEqualsFileFilter(file);
        if (z9) {
            fileEqualsFileFilter = fileEqualsFileFilter.or(iOFileFilter2);
        }
        AccumulatorPathVisitor accumulatorPathVisitor = ((AccumulatorPathVisitor.Builder) ((AccumulatorPathVisitor.Builder) AccumulatorPathVisitor.builder().setPathCounters(Counters.noopPathCounters()).setFileFilter(iOFileFilter).setDirectoryFilter(fileEqualsFileFilter)).setVisitFileFailedFunction(new Object())).get();
        HashSet hashSet = new HashSet();
        if (fileVisitOptionArr != null) {
            Collections.addAll(hashSet, fileVisitOptionArr);
        }
        path = file.toPath();
        Files.walkFileTree(path, hashSet, toMaxDepth(z9), accumulatorPathVisitor);
        return accumulatorPathVisitor;
    }

    public static List<File> listFiles(final File file, final List<File> list, final boolean z9, final FilenameFilter filenameFilter) {
        ArrayList arrayList;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            if (z9) {
                arrayList = new ArrayList();
            } else {
                arrayList = null;
            }
            final ArrayList arrayList2 = arrayList;
            Arrays.stream(listFiles).forEach(new Consumer() { // from class: org.apache.commons.io.j
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    FileUtils.lambda$listFiles$11(z9, arrayList2, filenameFilter, file, list, (File) obj);
                }
            });
            if (!z9) {
                return list;
            }
            arrayList2.forEach(new k(0, list, filenameFilter));
            return list;
        }
        return list;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.function.Function] */
    public static Collection<File> listFilesAndDirs(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        AccumulatorPathVisitor accumulatorPathVisitor = (AccumulatorPathVisitor) Uncheck.apply(new g(iOFileFilter, iOFileFilter2, 1), file);
        List<Path> fileList = accumulatorPathVisitor.getFileList();
        fileList.addAll(accumulatorPathVisitor.getDirList());
        return toList(fileList.stream().map(new Object()));
    }

    private static File mkdirs(File file) {
        if (file != null && !file.mkdirs() && !file.isDirectory()) {
            androidx.navigation.b.u(file, "Cannot create directory '", "'.");
            return null;
        }
        return file;
    }

    public static void moveDirectory(File file, File file2) {
        Objects.requireNonNull(file2, "destination");
        requireDirectoryExists(file, "srcDir");
        requireAbsent(file2, "destDir");
        if (!file.renameTo(file2)) {
            if (!file2.getCanonicalPath().startsWith(file.getCanonicalPath() + File.separator)) {
                copyDirectory(file, file2);
                deleteDirectory(file);
                if (file.exists()) {
                    androidx.navigation.b.i("Failed to delete original directory '", file, "' after copy to '", file2, "'");
                    return;
                }
                return;
            }
            ai.onnxruntime.b.m("Cannot move directory: ", file, " to a subdirectory of itself: ", file2);
        }
    }

    public static void moveDirectoryToDirectory(File file, File file2, boolean z9) {
        validateMoveParameters(file, file2);
        if (!file2.isDirectory()) {
            if (!file2.exists()) {
                if (z9) {
                    mkdirs(file2);
                } else {
                    e.b(file2, "Destination directory '", "' does not exist [createDestDir=false]");
                    return;
                }
            } else {
                androidx.navigation.b.u(file2, "Destination '", "' is not a directory");
                return;
            }
        }
        moveDirectory(file, new File(file2, file.getName()));
    }

    public static void moveFile(File file, File file2, CopyOption... copyOptionArr) {
        Objects.requireNonNull(file2, "destFile");
        checkFileExists(file, "srcFile");
        requireAbsent(file2, "destFile");
        if (!file.renameTo(file2)) {
            copyFile(file, file2, false, copyOptionArr);
            if (!file.delete()) {
                deleteQuietly(file2);
                androidx.navigation.b.i("Failed to delete original file '", file, "' after copy to '", file2, "'");
            }
        }
    }

    public static void moveFileToDirectory(File file, File file2, boolean z9) {
        validateMoveParameters(file, file2);
        if (!file2.exists() && z9) {
            mkdirs(file2);
        }
        requireDirectoryExists(file2, "destDir");
        moveFile(file, new File(file2, file.getName()));
    }

    public static void moveToDirectory(File file, File file2, boolean z9) {
        validateMoveParameters(file, file2);
        if (file.isDirectory()) {
            moveDirectoryToDirectory(file, file2, z9);
        } else {
            moveFileToDirectory(file, file2, z9);
        }
    }

    public static OutputStream newOutputStream(File file, boolean z9) {
        Path path;
        Objects.requireNonNull(file, PROTOCOL_FILE);
        path = file.toPath();
        return PathUtils.newOutputStream(path, z9);
    }

    public static FileInputStream openInputStream(File file) {
        Objects.requireNonNull(file, PROTOCOL_FILE);
        return new FileInputStream(file);
    }

    public static FileOutputStream openOutputStream(File file, boolean z9) {
        Objects.requireNonNull(file, PROTOCOL_FILE);
        if (file.exists()) {
            checkIsFile(file, PROTOCOL_FILE);
        } else {
            createParentDirectories(file);
        }
        return new FileOutputStream(file, z9);
    }

    public static byte[] readFileToByteArray(File file) {
        Path path;
        byte[] readAllBytes;
        Objects.requireNonNull(file, PROTOCOL_FILE);
        path = file.toPath();
        readAllBytes = Files.readAllBytes(path);
        return readAllBytes;
    }

    public static String readFileToString(File file, Charset charset) {
        return IOUtils.toString(new f(file, 0), Charsets.toCharset(charset));
    }

    public static List<String> readLines(File file, Charset charset) {
        Path path;
        List<String> readAllLines;
        path = file.toPath();
        readAllLines = Files.readAllLines(path, Charsets.toCharset(charset));
        return readAllLines;
    }

    private static void requireAbsent(File file, String str) {
        if (!file.exists()) {
        } else {
            throw new FileExistsException(String.format("File element in parameter '%s' already exists: '%s'", str, file));
        }
    }

    private static void requireCanonicalPathsNotEquals(File file, File file2) {
        String canonicalPath = file.getCanonicalPath();
        if (!canonicalPath.equals(file2.getCanonicalPath())) {
            return;
        }
        n0.b.v("File canonical paths are equal: '%s' (file1='%s', file2='%s')", new Object[]{canonicalPath, file, file2});
    }

    private static void requireDirectoryExists(File file, String str) {
        Objects.requireNonNull(file, str);
        if (!file.isDirectory()) {
            if (file.exists()) {
                androidx.navigation.b.r("Parameter '", str, "' is not a directory: '", file, "'");
            } else {
                e.b(file, "Directory '", "' does not exist.");
            }
        }
    }

    private static void requireDirectoryIfExists(File file, String str) {
        Objects.requireNonNull(file, str);
        if (file.exists() && !file.isDirectory()) {
            androidx.navigation.b.r("Parameter '", str, "' is not a directory: '", file, "'");
        }
    }

    private static boolean setTimes(File file, File file2) {
        Path path;
        BasicFileAttributes readAttributes;
        Path path2;
        FileAttributeView fileAttributeView;
        FileTime lastModifiedTime;
        FileTime lastAccessTime;
        FileTime creationTime;
        Objects.requireNonNull(file, "sourceFile");
        Objects.requireNonNull(file2, "targetFile");
        try {
            path = file.toPath();
            readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) kotlin.io.path.f.f(), new LinkOption[0]);
            path2 = file2.toPath();
            fileAttributeView = Files.getFileAttributeView(path2, kotlin.io.path.f.y(), new LinkOption[0]);
            BasicFileAttributeView i10 = kotlin.io.path.f.i(fileAttributeView);
            lastModifiedTime = readAttributes.lastModifiedTime();
            lastAccessTime = readAttributes.lastAccessTime();
            creationTime = readAttributes.creationTime();
            i10.setTimes(lastModifiedTime, lastAccessTime, creationTime);
            return true;
        } catch (IOException unused) {
            return file2.setLastModified(file.lastModified());
        }
    }

    public static long sizeOf(File file) {
        return Uncheck.getAsLong(new f(file, 1));
    }

    public static BigInteger sizeOfAsBigInteger(File file) {
        return (BigInteger) Uncheck.get(new f(file, 4));
    }

    public static long sizeOfDirectory(File file) {
        try {
            requireDirectoryExists(file, "directory");
            return Uncheck.getAsLong(new f(file, 3));
        } catch (FileNotFoundException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static BigInteger sizeOfDirectoryAsBigInteger(File file) {
        try {
            requireDirectoryExists(file, "directory");
            return (BigInteger) Uncheck.get(new f(file, 2));
        } catch (FileNotFoundException e) {
            throw new UncheckedIOException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.function.Function] */
    public static Stream<File> streamFiles(File file, boolean z9, String... strArr) {
        IOFileFilter and;
        Path path;
        FileVisitOption fileVisitOption;
        if (strArr == null) {
            and = FileFileFilter.INSTANCE;
        } else {
            and = FileFileFilter.INSTANCE.and(toSuffixFileFilter(strArr));
        }
        path = file.toPath();
        int maxDepth = toMaxDepth(z9);
        fileVisitOption = FileVisitOption.FOLLOW_LINKS;
        return PathUtils.walk(path, and, maxDepth, false, fileVisitOption).map(new Object());
    }

    public static File toFile(URL url) {
        if (url != null && isFileProtocol(url)) {
            return new File(decodeUrl(url.getFile().replace(IOUtils.DIR_SEPARATOR_UNIX, File.separatorChar)));
        }
        return null;
    }

    public static File[] toFiles(URL... urlArr) {
        if (IOUtils.length(urlArr) == 0) {
            return EMPTY_FILE_ARRAY;
        }
        File[] fileArr = new File[urlArr.length];
        for (int i10 = 0; i10 < urlArr.length; i10++) {
            URL url = urlArr[i10];
            if (url != null) {
                if (isFileProtocol(url)) {
                    fileArr[i10] = toFile(url);
                } else {
                    androidx.navigation.b.t(url, "Can only convert file URL to a File: ");
                    return null;
                }
            }
        }
        return fileArr;
    }

    private static List<File> toList(Stream<File> stream) {
        return (List) stream.collect(Collectors.toList());
    }

    private static int toMaxDepth(boolean z9) {
        if (z9) {
            return Integer.MAX_VALUE;
        }
        return 1;
    }

    private static SuffixFileFilter toSuffixFileFilter(String... strArr) {
        return new SuffixFileFilter(toSuffixes(strArr));
    }

    private static String[] toSuffixes(String... strArr) {
        Objects.requireNonNull(strArr, "extensions");
        return (String[]) Stream.of((Object[]) strArr).map(new Object()).toArray(new Object());
    }

    public static URL[] toURLs(File... fileArr) {
        Objects.requireNonNull(fileArr, "files");
        int length = fileArr.length;
        URL[] urlArr = new URL[length];
        for (int i10 = 0; i10 < length; i10++) {
            urlArr[i10] = fileArr[i10].toURI().toURL();
        }
        return urlArr;
    }

    public static void touch(File file) {
        Path path;
        Objects.requireNonNull(file, PROTOCOL_FILE);
        path = file.toPath();
        PathUtils.touch(path);
    }

    private static void validateMoveParameters(File file, File file2) {
        Objects.requireNonNull(file, "source");
        Objects.requireNonNull(file2, "destination");
        if (file.exists()) {
            return;
        }
        e.b(file, "Source '", "' does not exist");
    }

    public static boolean waitFor(File file, int i10) {
        Path path;
        Duration ofSeconds;
        Objects.requireNonNull(file, PROTOCOL_FILE);
        path = file.toPath();
        ofSeconds = Duration.ofSeconds(i10);
        return PathUtils.waitFor(path, ofSeconds, PathUtils.EMPTY_LINK_OPTION_ARRAY);
    }

    @Deprecated
    public static void write(File file, CharSequence charSequence) {
        write(file, charSequence, Charset.defaultCharset(), false);
    }

    public static void writeByteArrayToFile(File file, byte[] bArr, int i10, int i11, boolean z9) {
        OutputStream newOutputStream = newOutputStream(file, z9);
        try {
            newOutputStream.write(bArr, i10, i11);
            newOutputStream.close();
        } catch (Throwable th) {
            if (newOutputStream != null) {
                try {
                    newOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void writeLines(File file, String str, Collection<?> collection, String str2, boolean z9) {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(newOutputStream(file, z9));
        try {
            IOUtils.writeLines(collection, str2, bufferedOutputStream, str);
            bufferedOutputStream.close();
        } catch (Throwable th) {
            try {
                bufferedOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void writeStringToFile(File file, String str, Charset charset, boolean z9) {
        OutputStream newOutputStream = newOutputStream(file, z9);
        try {
            IOUtils.write(str, newOutputStream, charset);
            if (newOutputStream != null) {
                newOutputStream.close();
            }
        } catch (Throwable th) {
            if (newOutputStream != null) {
                try {
                    newOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Deprecated
    public static void write(File file, CharSequence charSequence, boolean z9) {
        write(file, charSequence, Charset.defaultCharset(), z9);
    }

    public static void write(File file, CharSequence charSequence, Charset charset) {
        write(file, charSequence, charset, false);
    }

    public static void write(File file, CharSequence charSequence, Charset charset, boolean z9) {
        writeStringToFile(file, Objects.toString(charSequence, null), charset, z9);
    }

    public static void write(File file, CharSequence charSequence, String str) {
        write(file, charSequence, str, false);
    }

    @Deprecated
    public static List<String> readLines(File file) {
        return readLines(file, Charset.defaultCharset());
    }

    public static void write(File file, CharSequence charSequence, String str, boolean z9) {
        write(file, charSequence, Charsets.toCharset(str), z9);
    }

    public static List<String> readLines(File file, String str) {
        return readLines(file, Charsets.toCharset(str));
    }

    @Deprecated
    public static String readFileToString(File file) {
        return readFileToString(file, Charset.defaultCharset());
    }

    public static String readFileToString(File file, String str) {
        return readFileToString(file, Charsets.toCharset(str));
    }

    public static Iterator<File> iterateFiles(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return listFiles(file, iOFileFilter, iOFileFilter2).iterator();
    }

    public static void copyFileToDirectory(File file, File file2) {
        copyFileToDirectory(file, file2, true);
    }

    public static boolean isFileNewer(File file, ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        ChronoLocalDateTime atTime;
        Objects.requireNonNull(chronoLocalDate, "chronoLocalDate");
        Objects.requireNonNull(localTime, "localTime");
        atTime = chronoLocalDate.atTime(localTime);
        return isFileNewer(file, (ChronoLocalDateTime<?>) atTime);
    }

    public static boolean isFileOlder(File file, ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        ChronoLocalDateTime atTime;
        Objects.requireNonNull(chronoLocalDate, "chronoLocalDate");
        Objects.requireNonNull(localTime, "localTime");
        atTime = chronoLocalDate.atTime(localTime);
        return isFileOlder(file, (ChronoLocalDateTime<?>) atTime);
    }

    public static void writeByteArrayToFile(File file, byte[] bArr, boolean z9) {
        writeByteArrayToFile(file, bArr, 0, bArr.length, z9);
    }

    public static FileOutputStream openOutputStream(File file) {
        return openOutputStream(file, false);
    }

    public static void writeByteArrayToFile(File file, byte[] bArr, int i10, int i11) {
        writeByteArrayToFile(file, bArr, i10, i11, false);
    }

    public static void writeByteArrayToFile(File file, byte[] bArr) {
        writeByteArrayToFile(file, bArr, false);
    }

    @Deprecated
    public static void writeStringToFile(File file, String str, boolean z9) {
        writeStringToFile(file, str, Charset.defaultCharset(), z9);
    }

    public static boolean isFileNewer(File file, ChronoLocalDate chronoLocalDate) {
        LocalTime localTime;
        localTime = LocalTime.MAX;
        return isFileNewer(file, chronoLocalDate, localTime);
    }

    public static boolean isFileOlder(File file, ChronoLocalDate chronoLocalDate) {
        LocalTime localTime;
        localTime = LocalTime.MAX;
        return isFileOlder(file, chronoLocalDate, localTime);
    }

    public static void writeLines(File file, Collection<?> collection, boolean z9) {
        writeLines(file, null, collection, null, z9);
    }

    public static void writeStringToFile(File file, String str, Charset charset) {
        writeStringToFile(file, str, charset, false);
    }

    public static boolean isFileNewer(File file, ChronoLocalDateTime<?> chronoLocalDateTime) {
        ZoneId systemDefault;
        systemDefault = ZoneId.systemDefault();
        return isFileNewer(file, chronoLocalDateTime, systemDefault);
    }

    public static boolean isFileOlder(File file, ChronoLocalDateTime<?> chronoLocalDateTime) {
        ZoneId systemDefault;
        systemDefault = ZoneId.systemDefault();
        return isFileOlder(file, chronoLocalDateTime, systemDefault);
    }

    public static void writeLines(File file, Collection<?> collection, String str) {
        writeLines(file, null, collection, str, false);
    }

    @Deprecated
    public static void writeStringToFile(File file, String str) {
        writeStringToFile(file, str, Charset.defaultCharset(), false);
    }

    public static boolean isFileNewer(File file, ChronoLocalDateTime<?> chronoLocalDateTime, ZoneId zoneId) {
        ChronoZonedDateTime atZone;
        Objects.requireNonNull(chronoLocalDateTime, "chronoLocalDateTime");
        Objects.requireNonNull(zoneId, "zoneId");
        atZone = chronoLocalDateTime.atZone(zoneId);
        return isFileNewer(file, (ChronoZonedDateTime<?>) atZone);
    }

    public static boolean isFileOlder(File file, ChronoLocalDateTime<?> chronoLocalDateTime, ZoneId zoneId) {
        ChronoZonedDateTime atZone;
        Objects.requireNonNull(chronoLocalDateTime, "chronoLocalDateTime");
        Objects.requireNonNull(zoneId, "zoneId");
        atZone = chronoLocalDateTime.atZone(zoneId);
        return isFileOlder(file, (ChronoZonedDateTime<?>) atZone);
    }

    public static void writeLines(File file, Collection<?> collection, String str, boolean z9) {
        writeLines(file, null, collection, str, z9);
    }

    public static void writeStringToFile(File file, String str, String str2) {
        writeStringToFile(file, str, str2, false);
    }

    public static void writeLines(File file, String str, Collection<?> collection) {
        writeLines(file, str, collection, null, false);
    }

    public static void writeStringToFile(File file, String str, String str2, boolean z9) {
        writeStringToFile(file, str, Charsets.toCharset(str2), z9);
    }

    public static File getFile(File file, String... strArr) {
        Objects.requireNonNull(file, "directory");
        Objects.requireNonNull(strArr, "names");
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            File file2 = new File(file, strArr[i10]);
            i10++;
            file = file2;
        }
        return file;
    }

    public static LineIterator lineIterator(File file) {
        return lineIterator(file, null);
    }

    public static void writeLines(File file, String str, Collection<?> collection, boolean z9) {
        writeLines(file, str, collection, null, z9);
    }

    public static boolean isFileNewer(File file, ChronoZonedDateTime<?> chronoZonedDateTime) {
        Objects.requireNonNull(file, PROTOCOL_FILE);
        Objects.requireNonNull(chronoZonedDateTime, "chronoZonedDateTime");
        return Uncheck.getAsBoolean(new f5.f(13, file, chronoZonedDateTime));
    }

    public static boolean isFileOlder(File file, ChronoZonedDateTime<?> chronoZonedDateTime) {
        Instant instant;
        Objects.requireNonNull(chronoZonedDateTime, "chronoZonedDateTime");
        instant = chronoZonedDateTime.toInstant();
        return isFileOlder(file, instant);
    }

    public static void writeLines(File file, String str, Collection<?> collection, String str2) {
        writeLines(file, str, collection, str2, false);
    }

    public static void writeLines(File file, Collection<?> collection) {
        writeLines(file, null, collection, null, false);
    }

    public static void copyToDirectory(Iterable<File> iterable, File file) {
        Objects.requireNonNull(iterable, "sourceIterable");
        Iterator<File> it = iterable.iterator();
        while (it.hasNext()) {
            copyFileToDirectory(it.next(), file);
        }
    }

    public static boolean isFileOlder(File file, Date date) {
        Objects.requireNonNull(date, "date");
        return isFileOlder(file, date.getTime());
    }

    public static boolean isFileNewer(File file, Date date) {
        Objects.requireNonNull(date, "date");
        return isFileNewer(file, date.getTime());
    }

    public static boolean isFileOlder(File file, File file2) {
        return Uncheck.getAsBoolean(new m(file, file2, 1));
    }

    public static boolean isFileNewer(File file, File file2) {
        return Uncheck.getAsBoolean(new m(file, file2, 0));
    }

    public static boolean isFileOlder(File file, FileTime fileTime) {
        Path path;
        Objects.requireNonNull(file, PROTOCOL_FILE);
        path = file.toPath();
        return PathUtils.isOlder(path, fileTime, new LinkOption[0]);
    }

    public static boolean isFileNewer(File file, FileTime fileTime) {
        Path path;
        Objects.requireNonNull(file, PROTOCOL_FILE);
        path = file.toPath();
        return PathUtils.isNewer(path, fileTime, new LinkOption[0]);
    }

    public static boolean isFileOlder(File file, Instant instant) {
        Objects.requireNonNull(instant, "instant");
        return Uncheck.getAsBoolean(new q(file, instant, 0));
    }

    public static boolean isFileNewer(File file, Instant instant) {
        Objects.requireNonNull(instant, "instant");
        return Uncheck.getAsBoolean(new q(file, instant, 1));
    }

    public static boolean isFileOlder(File file, long j10) {
        Objects.requireNonNull(file, PROTOCOL_FILE);
        return Uncheck.getAsBoolean(new l(file, j10, 1));
    }

    public static boolean isFileNewer(File file, long j10) {
        Objects.requireNonNull(file, PROTOCOL_FILE);
        return Uncheck.getAsBoolean(new l(file, j10, 0));
    }

    public static boolean isFileOlder(File file, OffsetDateTime offsetDateTime) {
        Instant instant;
        Objects.requireNonNull(offsetDateTime, "offsetDateTime");
        instant = offsetDateTime.toInstant();
        return isFileOlder(file, instant);
    }

    public static boolean isFileNewer(File file, OffsetDateTime offsetDateTime) {
        Instant instant;
        Objects.requireNonNull(offsetDateTime, "offsetDateTime");
        instant = offsetDateTime.toInstant();
        return isFileNewer(file, instant);
    }

    public static void moveFile(File file, File file2) {
        StandardCopyOption standardCopyOption;
        standardCopyOption = StandardCopyOption.COPY_ATTRIBUTES;
        moveFile(file, file2, standardCopyOption);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.function.Function] */
    public static Collection<File> listFiles(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return toList(((AccumulatorPathVisitor) Uncheck.apply(new g(iOFileFilter, iOFileFilter2, 0), file)).getFileList().stream().map(new Object()));
    }

    private static File[] listFiles(File file, FileFilter fileFilter) {
        requireDirectoryExists(file, "directory");
        File[] listFiles = file.listFiles(fileFilter);
        if (listFiles != null) {
            return listFiles;
        }
        e.f(file, "Unknown I/O error listing contents of directory: ");
        return null;
    }

    public static void copyURLToFile(URL url, File file) {
        Path path;
        StandardCopyOption standardCopyOption;
        path = file.toPath();
        PathUtils.createParentDirectories(path, new FileAttribute[0]);
        Objects.requireNonNull(url);
        r rVar = new r(0, url);
        standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
        PathUtils.copy(rVar, path, standardCopyOption);
    }

    public static Collection<File> listFiles(File file, String[] strArr, boolean z9) {
        return listFiles(file, new ArrayList(), z9, strArr != null ? toSuffixFileFilter(strArr) : TrueFileFilter.INSTANCE);
    }

    public static void copyFile(File file, File file2, boolean z9) {
        StandardCopyOption standardCopyOption;
        standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
        copyFile(file, file2, z9, standardCopyOption);
    }

    public static void copyFile(File file, File file2) {
        StandardCopyOption standardCopyOption;
        standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
        copyFile(file, file2, standardCopyOption);
    }

    public static void copyFile(File file, File file2, CopyOption... copyOptionArr) {
        copyFile(file, file2, true, copyOptionArr);
    }

    public static long copyFile(File file, OutputStream outputStream) {
        Path path;
        InputStream newInputStream;
        path = file.toPath();
        newInputStream = Files.newInputStream(path, new OpenOption[0]);
        try {
            long copyLarge = IOUtils.copyLarge(newInputStream, outputStream);
            if (newInputStream != null) {
                newInputStream.close();
            }
            return copyLarge;
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

    public static void copyDirectory(File file, File file2, boolean z9) {
        copyDirectory(file, file2, null, z9);
    }

    public static void copyDirectory(File file, File file2, FileFilter fileFilter) {
        copyDirectory(file, file2, fileFilter, true);
    }

    public static void copyDirectory(File file, File file2, FileFilter fileFilter, boolean z9) {
        StandardCopyOption standardCopyOption;
        LinkOption linkOption;
        standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
        linkOption = LinkOption.NOFOLLOW_LINKS;
        copyDirectory(file, file2, fileFilter, z9, standardCopyOption, linkOption);
    }

    public static void copyDirectory(File file, File file2) {
        copyDirectory(file, file2, true);
    }

    public static void forceDelete(File file) {
        forceDelete(file, true);
    }

    public static String byteCountToDisplaySize(long j10) {
        return byteCountToDisplaySize(BigInteger.valueOf(j10));
    }

    public static String byteCountToDisplaySize(Number number) {
        return byteCountToDisplaySize(number.longValue());
    }
}
