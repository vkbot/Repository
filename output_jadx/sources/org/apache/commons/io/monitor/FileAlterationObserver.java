package org.apache.commons.io.monitor;

import java.io.File;
import java.io.FileFilter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.build.AbstractOriginSupplier;
import org.apache.commons.io.comparator.NameFileComparator;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.commons.io.k;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class FileAlterationObserver implements Serializable {
    private static final long serialVersionUID = 1185122225658782848L;
    private final Comparator<File> comparator;
    private final transient FileFilter fileFilter;
    private final transient List<FileAlterationListener> listeners;
    private final FileEntry rootEntry;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* renamed from: org.apache.commons.io.monitor.FileAlterationObserver$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$commons$io$IOCase;

        static {
            int[] iArr = new int[IOCase.values().length];
            $SwitchMap$org$apache$commons$io$IOCase = iArr;
            try {
                iArr[IOCase.SYSTEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$commons$io$IOCase[IOCase.INSENSITIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private FileAlterationObserver(FileEntry fileEntry, FileFilter fileFilter, Comparator<File> comparator) {
        this.listeners = new CopyOnWriteArrayList();
        Objects.requireNonNull(fileEntry, "rootEntry");
        Objects.requireNonNull(fileEntry.getFile(), "rootEntry.getFile()");
        this.rootEntry = fileEntry;
        this.fileFilter = fileFilter == null ? TrueFileFilter.INSTANCE : fileFilter;
        Objects.requireNonNull(comparator, "comparator");
        this.comparator = comparator;
    }

    public static Builder builder() {
        return new Builder(null);
    }

    private void checkAndFire(FileEntry fileEntry, FileEntry[] fileEntryArr, File[] fileArr) {
        FileEntry[] fileEntryArr2;
        if (fileArr.length > 0) {
            fileEntryArr2 = new FileEntry[fileArr.length];
        } else {
            fileEntryArr2 = FileEntry.EMPTY_FILE_ENTRY_ARRAY;
        }
        int i10 = 0;
        for (FileEntry fileEntry2 : fileEntryArr) {
            while (i10 < fileArr.length && this.comparator.compare(fileEntry2.getFile(), fileArr[i10]) > 0) {
                FileEntry lambda$listFileEntries$5 = lambda$listFileEntries$5(fileEntry, fileArr[i10]);
                fileEntryArr2[i10] = lambda$listFileEntries$5;
                fireOnCreate(lambda$listFileEntries$5);
                i10++;
            }
            if (i10 < fileArr.length && this.comparator.compare(fileEntry2.getFile(), fileArr[i10]) == 0) {
                fireOnChange(fileEntry2, fileArr[i10]);
                checkAndFire(fileEntry2, fileEntry2.getChildren(), listFiles(fileArr[i10]));
                fileEntryArr2[i10] = fileEntry2;
                i10++;
            } else {
                checkAndFire(fileEntry2, fileEntry2.getChildren(), FileUtils.EMPTY_FILE_ARRAY);
                fireOnDelete(fileEntry2);
            }
        }
        while (i10 < fileArr.length) {
            FileEntry lambda$listFileEntries$52 = lambda$listFileEntries$5(fileEntry, fileArr[i10]);
            fileEntryArr2[i10] = lambda$listFileEntries$52;
            fireOnCreate(lambda$listFileEntries$52);
            i10++;
        }
        fileEntry.setChildren(fileEntryArr2);
    }

    /* renamed from: createFileEntry */
    public FileEntry lambda$listFileEntries$5(FileEntry fileEntry, File file) {
        FileEntry newChildInstance = fileEntry.newChildInstance(file);
        newChildInstance.refresh(file);
        newChildInstance.setChildren(listFileEntries(file, newChildInstance));
        return newChildInstance;
    }

    private void fireOnChange(FileEntry fileEntry, File file) {
        if (fileEntry.refresh(file)) {
            this.listeners.forEach(new k(1, fileEntry, file));
        }
    }

    public void fireOnCreate(FileEntry fileEntry) {
        this.listeners.forEach(new b(fileEntry, 0));
        Stream.of((Object[]) fileEntry.getChildren()).forEach(new c(this, 0));
    }

    private void fireOnDelete(FileEntry fileEntry) {
        this.listeners.forEach(new b(fileEntry, 1));
    }

    public /* synthetic */ void lambda$checkAndNotify$0(FileAlterationListener fileAlterationListener) {
        fileAlterationListener.onStart(this);
    }

    public /* synthetic */ void lambda$checkAndNotify$1(FileAlterationListener fileAlterationListener) {
        fileAlterationListener.onStop(this);
    }

    public static /* synthetic */ void lambda$fireOnChange$2(FileEntry fileEntry, File file, FileAlterationListener fileAlterationListener) {
        if (fileEntry.isDirectory()) {
            fileAlterationListener.onDirectoryChange(file);
        } else {
            fileAlterationListener.onFileChange(file);
        }
    }

    public static /* synthetic */ void lambda$fireOnCreate$3(FileEntry fileEntry, FileAlterationListener fileAlterationListener) {
        if (fileEntry.isDirectory()) {
            fileAlterationListener.onDirectoryCreate(fileEntry.getFile());
        } else {
            fileAlterationListener.onFileCreate(fileEntry.getFile());
        }
    }

    public static /* synthetic */ void lambda$fireOnDelete$4(FileEntry fileEntry, FileAlterationListener fileAlterationListener) {
        if (fileEntry.isDirectory()) {
            fileAlterationListener.onDirectoryDelete(fileEntry.getFile());
        } else {
            fileAlterationListener.onFileDelete(fileEntry.getFile());
        }
    }

    public static /* synthetic */ FileEntry[] lambda$listFileEntries$6(int i10) {
        return new FileEntry[i10];
    }

    private FileEntry[] listFileEntries(File file, FileEntry fileEntry) {
        return (FileEntry[]) Stream.of((Object[]) listFiles(file)).map(new org.apache.commons.io.comparator.a(this, fileEntry, 1)).toArray(new j0.a(2));
    }

    private File[] listFiles(File file) {
        if (file.isDirectory()) {
            return sort(file.listFiles(this.fileFilter));
        }
        return FileUtils.EMPTY_FILE_ARRAY;
    }

    private File[] sort(File[] fileArr) {
        if (fileArr == null) {
            return FileUtils.EMPTY_FILE_ARRAY;
        }
        if (fileArr.length > 1) {
            Arrays.sort(fileArr, this.comparator);
        }
        return fileArr;
    }

    private static Comparator<File> toComparator(IOCase iOCase) {
        int i10 = AnonymousClass1.$SwitchMap$org$apache$commons$io$IOCase[IOCase.value(iOCase, IOCase.SYSTEM).ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return NameFileComparator.NAME_COMPARATOR;
            }
            return NameFileComparator.NAME_INSENSITIVE_COMPARATOR;
        }
        return NameFileComparator.NAME_SYSTEM_COMPARATOR;
    }

    public void addListener(FileAlterationListener fileAlterationListener) {
        if (fileAlterationListener != null) {
            this.listeners.add(fileAlterationListener);
        }
    }

    public void checkAndNotify() {
        this.listeners.forEach(new c(this, 1));
        File file = this.rootEntry.getFile();
        boolean exists = file.exists();
        FileEntry fileEntry = this.rootEntry;
        if (exists) {
            checkAndFire(fileEntry, fileEntry.getChildren(), listFiles(file));
        } else if (fileEntry.isExists()) {
            FileEntry fileEntry2 = this.rootEntry;
            checkAndFire(fileEntry2, fileEntry2.getChildren(), FileUtils.EMPTY_FILE_ARRAY);
        }
        this.listeners.forEach(new c(this, 2));
    }

    public Comparator<File> getComparator() {
        return this.comparator;
    }

    public File getDirectory() {
        return this.rootEntry.getFile();
    }

    public FileFilter getFileFilter() {
        return this.fileFilter;
    }

    public Iterable<FileAlterationListener> getListeners() {
        return new ArrayList(this.listeners);
    }

    public void initialize() {
        FileEntry fileEntry = this.rootEntry;
        fileEntry.refresh(fileEntry.getFile());
        FileEntry fileEntry2 = this.rootEntry;
        fileEntry2.setChildren(listFileEntries(fileEntry2.getFile(), this.rootEntry));
    }

    public void removeListener(FileAlterationListener fileAlterationListener) {
        if (fileAlterationListener != null) {
            this.listeners.removeIf(new i7.c(7, fileAlterationListener));
        }
    }

    public String toString() {
        return getClass().getSimpleName() + "[file='" + getDirectory().getPath() + "', " + this.fileFilter.toString() + ", listeners=" + this.listeners.size() + "]";
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static final class Builder extends AbstractOriginSupplier<FileAlterationObserver, Builder> {
        private FileFilter fileFilter;
        private IOCase ioCase;
        private FileEntry rootEntry;

        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public File checkOriginFile() {
            return checkOrigin().getFile();
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public FileAlterationObserver get() {
            return new FileAlterationObserver(this, (AnonymousClass1) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setFileFilter(FileFilter fileFilter) {
            this.fileFilter = fileFilter;
            return (Builder) asThis();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setIOCase(IOCase iOCase) {
            this.ioCase = iOCase;
            return (Builder) asThis();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setRootEntry(FileEntry fileEntry) {
            this.rootEntry = fileEntry;
            return (Builder) asThis();
        }

        private Builder() {
        }
    }

    private FileAlterationObserver(Builder builder) {
        this(builder.rootEntry != null ? builder.rootEntry : new FileEntry(builder.checkOriginFile()), builder.fileFilter, toComparator(builder.ioCase));
    }

    @Deprecated
    public FileAlterationObserver(File file) {
        this(file, (FileFilter) null);
    }

    @Deprecated
    public FileAlterationObserver(File file, FileFilter fileFilter) {
        this(file, fileFilter, (IOCase) null);
    }

    @Deprecated
    public FileAlterationObserver(File file, FileFilter fileFilter, IOCase iOCase) {
        this(new FileEntry(file), fileFilter, iOCase);
    }

    public /* synthetic */ FileAlterationObserver(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }

    public FileAlterationObserver(FileEntry fileEntry, FileFilter fileFilter, IOCase iOCase) {
        this(fileEntry, fileFilter, toComparator(iOCase));
    }

    @Deprecated
    public FileAlterationObserver(String str) {
        this(new File(str));
    }

    @Deprecated
    public FileAlterationObserver(String str, FileFilter fileFilter) {
        this(new File(str), fileFilter);
    }

    @Deprecated
    public FileAlterationObserver(String str, FileFilter fileFilter, IOCase iOCase) {
        this(new File(str), fileFilter, iOCase);
    }

    public void destroy() {
    }
}
