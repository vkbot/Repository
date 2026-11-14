package org.apache.commons.io.file.spi;

import java.net.URI;
import java.net.URL;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.internal.jdk8.a;
import org.apache.commons.io.file.f;
import org.apache.commons.io.file.k;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class FileSystemProviders {
    private static final FileSystemProviders INSTALLED;
    private static final String SCHEME_FILE = "file";
    private final List<FileSystemProvider> providers;

    static {
        List installedProviders;
        installedProviders = FileSystemProvider.installedProviders();
        INSTALLED = new FileSystemProviders(installedProviders);
    }

    private FileSystemProviders(List<FileSystemProvider> list) {
        this.providers = list == null ? Collections.EMPTY_LIST : list;
    }

    public static FileSystemProviders installed() {
        return INSTALLED;
    }

    public static /* synthetic */ boolean lambda$getFileSystemProvider$0(String str, FileSystemProvider fileSystemProvider) {
        String scheme;
        scheme = fileSystemProvider.getScheme();
        return scheme.equalsIgnoreCase(str);
    }

    public FileSystemProvider getFileSystemProvider(String str) {
        FileSystem fileSystem;
        FileSystemProvider provider;
        Objects.requireNonNull(str, "scheme");
        if (str.equalsIgnoreCase(SCHEME_FILE)) {
            fileSystem = FileSystems.getDefault();
            provider = fileSystem.provider();
            return provider;
        }
        return f.n(this.providers.stream().filter(new k(1, str)).findFirst().orElse(null));
    }

    public static FileSystemProvider getFileSystemProvider(Path path) {
        FileSystem fileSystem;
        FileSystemProvider provider;
        Objects.requireNonNull(path, "path");
        fileSystem = a.m(path).getFileSystem();
        provider = fileSystem.provider();
        return provider;
    }

    public FileSystemProvider getFileSystemProvider(URI uri) {
        Objects.requireNonNull(uri, "uri");
        return getFileSystemProvider(uri.getScheme());
    }

    public FileSystemProvider getFileSystemProvider(URL url) {
        Objects.requireNonNull(url, "url");
        return getFileSystemProvider(url.getProtocol());
    }
}
