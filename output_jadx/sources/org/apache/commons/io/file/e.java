package org.apache.commons.io.file;

import java.io.InputStream;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.time.Duration;
import java.time.Instant;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class e {
    public static /* bridge */ /* synthetic */ StandardOpenOption A() {
        return StandardOpenOption.TRUNCATE_EXISTING;
    }

    public static /* bridge */ /* synthetic */ PosixFilePermission B() {
        return PosixFilePermission.OWNER_WRITE;
    }

    public static /* bridge */ /* synthetic */ Class C() {
        return DosFileAttributes.class;
    }

    public static /* bridge */ /* synthetic */ PosixFilePermission D() {
        return PosixFilePermission.OWNER_EXECUTE;
    }

    public static /* bridge */ /* synthetic */ int a(FileTime fileTime, FileTime fileTime2) {
        return fileTime.compareTo(fileTime2);
    }

    public static /* bridge */ /* synthetic */ long b(InputStream inputStream, Path path, CopyOption[] copyOptionArr) {
        return Files.copy(inputStream, path, copyOptionArr);
    }

    public static /* bridge */ /* synthetic */ Class c() {
        return PosixFileAttributeView.class;
    }

    public static /* bridge */ /* synthetic */ Iterable d(FileSystem fileSystem) {
        return fileSystem.getRootDirectories();
    }

    public static /* bridge */ /* synthetic */ DirectoryStream e(Path path, DirectoryStreamFilter directoryStreamFilter) {
        return Files.newDirectoryStream(path, directoryStreamFilter);
    }

    public static /* bridge */ /* synthetic */ Path f(Path path, Path path2, CopyOption[] copyOptionArr) {
        return Files.copy(path, path2, copyOptionArr);
    }

    public static /* bridge */ /* synthetic */ Path g(Path path, LinkOption[] linkOptionArr) {
        return path.toRealPath(linkOptionArr);
    }

    public static /* bridge */ /* synthetic */ Path h(String[] strArr) {
        return Paths.get(".", strArr);
    }

    public static /* bridge */ /* synthetic */ StandardOpenOption i() {
        return StandardOpenOption.CREATE;
    }

    public static /* bridge */ /* synthetic */ DosFileAttributeView j(Object obj) {
        return (DosFileAttributeView) obj;
    }

    public static /* bridge */ /* synthetic */ DosFileAttributes k(Object obj) {
        return (DosFileAttributes) obj;
    }

    public static /* bridge */ /* synthetic */ FileTime l(long j10) {
        return FileTime.fromMillis(j10);
    }

    public static /* bridge */ /* synthetic */ PosixFileAttributeView m(Object obj) {
        return (PosixFileAttributeView) obj;
    }

    public static /* bridge */ /* synthetic */ PosixFilePermission n() {
        return PosixFilePermission.OWNER_READ;
    }

    public static /* bridge */ /* synthetic */ Duration o(long j10) {
        return Duration.ofMillis(j10);
    }

    public static /* bridge */ /* synthetic */ Instant p(Instant instant, long j10) {
        return instant.minusMillis(j10);
    }

    public static /* bridge */ /* synthetic */ Iterator q(DirectoryStream directoryStream) {
        return directoryStream.iterator();
    }

    public static /* bridge */ /* synthetic */ Set r(PosixFileAttributes posixFileAttributes) {
        return posixFileAttributes.permissions();
    }

    public static /* bridge */ /* synthetic */ void s(DirectoryStream directoryStream) {
        directoryStream.close();
    }

    public static /* bridge */ /* synthetic */ void t(Path path, FileTime fileTime) {
        Files.setLastModifiedTime(path, fileTime);
    }

    public static /* bridge */ /* synthetic */ void u(Path path, HashSet hashSet) {
        Files.setPosixFilePermissions(path, hashSet);
    }

    public static /* bridge */ /* synthetic */ void v(Path path, FileAttribute[] fileAttributeArr) {
        Files.createFile(path, fileAttributeArr);
    }

    public static /* bridge */ /* synthetic */ void w(DosFileAttributeView dosFileAttributeView, boolean z9) {
        dosFileAttributeView.setReadOnly(z9);
    }

    public static /* bridge */ /* synthetic */ boolean x(Path path, Object obj) {
        return path.equals(obj);
    }

    public static /* bridge */ /* synthetic */ boolean y(Instant instant, Instant instant2) {
        return instant.isAfter(instant2);
    }

    public static /* bridge */ /* synthetic */ Class z() {
        return DosFileAttributeView.class;
    }
}
