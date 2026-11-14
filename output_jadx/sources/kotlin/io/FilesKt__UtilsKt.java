package kotlin.io;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u001a*\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0007\u001a*\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0007\u001a\u0012\u0010\u000e\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001\u001a\u0012\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001\u001a\u0012\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001\u001a\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001\u001a\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u0003*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u0014\u001a&\u0010\u0015\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u001a8\u0010\u001b\u001a\u00020\u0018*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u001a\b\u0002\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d\u001a\n\u0010 \u001a\u00020\u0018*\u00020\u0001\u001a\u0012\u0010!\u001a\u00020\u0018*\u00020\u00012\u0006\u0010\"\u001a\u00020\u0001\u001a\u0012\u0010!\u001a\u00020\u0018*\u00020\u00012\u0006\u0010\"\u001a\u00020\u0003\u001a\u0012\u0010#\u001a\u00020\u0018*\u00020\u00012\u0006\u0010\"\u001a\u00020\u0001\u001a\u0012\u0010#\u001a\u00020\u0018*\u00020\u00012\u0006\u0010\"\u001a\u00020\u0003\u001a\n\u0010$\u001a\u00020\u0001*\u00020\u0001\u001a\u0011\u0010$\u001a\u00020%*\u00020%H\u0002¢\u0006\u0002\b&\u001a\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010'*\b\u0012\u0004\u0012\u00020\u00010'H\u0002¢\u0006\u0002\b&\u001a\u0012\u0010(\u001a\u00020\u0001*\u00020\u00012\u0006\u0010)\u001a\u00020\u0001\u001a\u0012\u0010(\u001a\u00020\u0001*\u00020\u00012\u0006\u0010)\u001a\u00020\u0003\u001a\u0012\u0010*\u001a\u00020\u0001*\u00020\u00012\u0006\u0010)\u001a\u00020\u0001\u001a\u0012\u0010*\u001a\u00020\u0001*\u00020\u00012\u0006\u0010)\u001a\u00020\u0003\"\u0015\u0010\u0007\u001a\u00020\u0003*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0015\u0010\n\u001a\u00020\u0003*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\"\u0015\u0010\f\u001a\u00020\u0003*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006+"}, d2 = {"createTempDir", "Ljava/io/File;", "prefix", "", "suffix", "directory", "createTempFile", "extension", "getExtension", "(Ljava/io/File;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath", "nameWithoutExtension", "getNameWithoutExtension", "toRelativeString", "base", "relativeTo", "relativeToOrSelf", "relativeToOrNull", "toRelativeStringOrNull", "toRelativeStringOrNull$FilesKt__UtilsKt", "copyTo", TypedValues.AttributesType.S_TARGET, "overwrite", "", "bufferSize", "", "copyRecursively", "onError", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lkotlin/io/OnErrorAction;", "deleteRecursively", "startsWith", "other", "endsWith", "normalize", "Lkotlin/io/FilePathComponents;", "normalize$FilesKt__UtilsKt", "", "resolve", "relative", "resolveSibling", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, xs = "kotlin/io/FilesKt")
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,473:1\n1#2:474\n1292#3,3:475\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n*L\n347#1:475,3\n*E\n"})
/* loaded from: classes.dex */
class FilesKt__UtilsKt extends FilesKt__FileTreeWalkKt {
    public static final boolean copyRecursively(File file, File file2, boolean z9, final Function2<? super File, ? super IOException, ? extends OnErrorAction> function2) {
        file.getClass();
        file2.getClass();
        function2.getClass();
        if (!file.exists()) {
            if (function2.invoke(file, new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null)) != OnErrorAction.TERMINATE) {
                return true;
            }
            return false;
        }
        try {
            Iterator<File> it = FilesKt__FileTreeWalkKt.walkTopDown(file).onFail(new Function2() { // from class: kotlin.io.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit copyRecursively$lambda$4$FilesKt__UtilsKt;
                    copyRecursively$lambda$4$FilesKt__UtilsKt = FilesKt__UtilsKt.copyRecursively$lambda$4$FilesKt__UtilsKt(Function2.this, (File) obj, (IOException) obj2);
                    return copyRecursively$lambda$4$FilesKt__UtilsKt;
                }
            }).iterator();
            while (it.hasNext()) {
                File next = it.next();
                if (!next.exists()) {
                    if (function2.invoke(next, new NoSuchFileException(next, null, "The source file doesn't exist.", 2, null)) == OnErrorAction.TERMINATE) {
                        return false;
                    }
                } else {
                    File file3 = new File(file2, toRelativeString(next, file));
                    if (file3.exists() && (!next.isDirectory() || !file3.isDirectory())) {
                        if (z9) {
                            if (file3.isDirectory()) {
                                if (!deleteRecursively(file3)) {
                                }
                            } else if (!file3.delete()) {
                            }
                        }
                        if (function2.invoke(file3, new FileAlreadyExistsException(next, file3, "The destination file already exists.")) == OnErrorAction.TERMINATE) {
                            return false;
                        }
                    }
                    if (next.isDirectory()) {
                        file3.mkdirs();
                    } else {
                        boolean z10 = z9;
                        if (copyTo$default(next, file3, z10, 0, 4, null).length() == next.length() || function2.invoke(next, new IOException("Source file wasn't copied completely, length of destination file differs.")) != OnErrorAction.TERMINATE) {
                            z9 = z10;
                        } else {
                            return false;
                        }
                    }
                }
            }
            return true;
        } catch (TerminateException unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean copyRecursively$default(File file, File file2, boolean z9, Function2 function2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        if ((i10 & 4) != 0) {
            function2 = new Function2() { // from class: kotlin.io.FilesKt__UtilsKt$copyRecursively$1
                @Override // kotlin.jvm.functions.Function2
                public final Void invoke(File file3, IOException iOException) {
                    file3.getClass();
                    iOException.getClass();
                    throw iOException;
                }
            };
        }
        return copyRecursively(file, file2, z9, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copyRecursively$lambda$4$FilesKt__UtilsKt(Function2 function2, File file, IOException iOException) {
        file.getClass();
        iOException.getClass();
        if (function2.invoke(file, iOException) != OnErrorAction.TERMINATE) {
            return Unit.INSTANCE;
        }
        throw new TerminateException(file);
    }

    public static final File copyTo(File file, File file2, boolean z9, int i10) {
        file.getClass();
        file2.getClass();
        if (file.exists()) {
            if (file2.exists()) {
                if (z9) {
                    if (!file2.delete()) {
                        throw new FileAlreadyExistsException(file, file2, "Tried to overwrite the destination, but failed to delete it.");
                    }
                } else {
                    throw new FileAlreadyExistsException(file, file2, "The destination file already exists.");
                }
            }
            if (file.isDirectory()) {
                if (file2.mkdirs()) {
                    return file2;
                }
                throw new FileSystemException(file, file2, "Failed to create target directory.");
            }
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    ByteStreamsKt.copyTo(fileInputStream, fileOutputStream, i10);
                    CloseableKt.closeFinally(fileOutputStream, null);
                    CloseableKt.closeFinally(fileInputStream, null);
                    return file2;
                } finally {
                }
            } finally {
            }
        } else {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
    }

    public static /* synthetic */ File copyTo$default(File file, File file2, boolean z9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z9 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 8192;
        }
        return copyTo(file, file2, z9, i10);
    }

    @Deprecated(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    public static final File createTempDir(String str, String str2, File file) {
        str.getClass();
        File createTempFile = File.createTempFile(str, str2, file);
        createTempFile.delete();
        if (createTempFile.mkdir()) {
            return createTempFile;
        }
        throw new IOException("Unable to create temporary directory " + createTempFile + FilenameUtils.EXTENSION_SEPARATOR);
    }

    public static /* synthetic */ File createTempDir$default(String str, String str2, File file, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "tmp";
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            file = null;
        }
        return createTempDir(str, str2, file);
    }

    @Deprecated(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    public static final File createTempFile(String str, String str2, File file) {
        str.getClass();
        File createTempFile = File.createTempFile(str, str2, file);
        createTempFile.getClass();
        return createTempFile;
    }

    public static /* synthetic */ File createTempFile$default(String str, String str2, File file, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "tmp";
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            file = null;
        }
        return createTempFile(str, str2, file);
    }

    public static final boolean deleteRecursively(File file) {
        file.getClass();
        while (true) {
            boolean z9 = true;
            for (File file2 : FilesKt__FileTreeWalkKt.walkBottomUp(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z9) {
                        break;
                    }
                }
                z9 = false;
            }
            return z9;
        }
    }

    public static final boolean endsWith(File file, File file2) {
        file.getClass();
        file2.getClass();
        FilePathComponents components = FilesKt__FilePathComponentsKt.toComponents(file);
        FilePathComponents components2 = FilesKt__FilePathComponentsKt.toComponents(file2);
        if (components2.isRooted()) {
            return Intrinsics.areEqual(file, file2);
        }
        int size = components.getSize() - components2.getSize();
        if (size < 0) {
            return false;
        }
        return components.getSegments().subList(size, components.getSize()).equals(components2.getSegments());
    }

    public static final String getExtension(File file) {
        String substringAfterLast;
        file.getClass();
        String name = file.getName();
        name.getClass();
        substringAfterLast = StringsKt__StringsKt.substringAfterLast(name, FilenameUtils.EXTENSION_SEPARATOR, "");
        return substringAfterLast;
    }

    public static final String getInvariantSeparatorsPath(File file) {
        String replace$default;
        file.getClass();
        char c = File.separatorChar;
        String path = file.getPath();
        path.getClass();
        if (c != '/') {
            replace$default = StringsKt__StringsJVMKt.replace$default(path, c, IOUtils.DIR_SEPARATOR_UNIX, false, 4, (Object) null);
            return replace$default;
        }
        return path;
    }

    public static final String getNameWithoutExtension(File file) {
        String substringBeforeLast$default;
        file.getClass();
        String name = file.getName();
        name.getClass();
        substringBeforeLast$default = StringsKt__StringsKt.substringBeforeLast$default(name, ".", (String) null, 2, (Object) null);
        return substringBeforeLast$default;
    }

    public static final File normalize(File file) {
        String joinToString$default;
        file.getClass();
        FilePathComponents components = FilesKt__FilePathComponentsKt.toComponents(file);
        File root = components.getRoot();
        List<File> normalize$FilesKt__UtilsKt = normalize$FilesKt__UtilsKt(components.getSegments());
        String str = File.separator;
        str.getClass();
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(normalize$FilesKt__UtilsKt, str, null, null, 0, null, null, 62, null);
        return resolve(root, joinToString$default);
    }

    private static final List<File> normalize$FilesKt__UtilsKt(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (Intrinsics.areEqual(name, ".")) {
                Unit unit = Unit.INSTANCE;
            } else if (Intrinsics.areEqual(name, "..")) {
                if (!arrayList.isEmpty() && !Intrinsics.areEqual(((File) CollectionsKt.last((List) arrayList)).getName(), "..")) {
                } else {
                    arrayList.add(file);
                }
            } else {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    public static final File relativeTo(File file, File file2) {
        file.getClass();
        file2.getClass();
        return new File(toRelativeString(file, file2));
    }

    public static final File relativeToOrNull(File file, File file2) {
        file.getClass();
        file2.getClass();
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, file2);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return new File(relativeStringOrNull$FilesKt__UtilsKt);
        }
        return null;
    }

    public static final File relativeToOrSelf(File file, File file2) {
        file.getClass();
        file2.getClass();
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, file2);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return new File(relativeStringOrNull$FilesKt__UtilsKt);
        }
        return file;
    }

    public static final File resolve(File file, File file2) {
        boolean endsWith$default;
        file.getClass();
        file2.getClass();
        if (FilesKt__FilePathComponentsKt.isRooted(file2)) {
            return file2;
        }
        String file3 = file.toString();
        file3.getClass();
        if (file3.length() != 0) {
            char c = File.separatorChar;
            endsWith$default = StringsKt__StringsKt.endsWith$default((CharSequence) file3, c, false, 2, (Object) null);
            if (!endsWith$default) {
                return new File(file3 + c + file2);
            }
        }
        return new File(file3 + file2);
    }

    public static final File resolveSibling(File file, File file2) {
        File subPath;
        file.getClass();
        file2.getClass();
        FilePathComponents components = FilesKt__FilePathComponentsKt.toComponents(file);
        if (components.getSize() == 0) {
            subPath = new File("..");
        } else {
            subPath = components.subPath(0, components.getSize() - 1);
        }
        return resolve(resolve(components.getRoot(), subPath), file2);
    }

    public static final boolean startsWith(File file, File file2) {
        file.getClass();
        file2.getClass();
        FilePathComponents components = FilesKt__FilePathComponentsKt.toComponents(file);
        FilePathComponents components2 = FilesKt__FilePathComponentsKt.toComponents(file2);
        if (!Intrinsics.areEqual(components.getRoot(), components2.getRoot()) || components.getSize() < components2.getSize()) {
            return false;
        }
        return components.getSegments().subList(0, components2.getSize()).equals(components2.getSegments());
    }

    public static final String toRelativeString(File file, File file2) {
        file.getClass();
        file2.getClass();
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, file2);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return relativeStringOrNull$FilesKt__UtilsKt;
        }
        ai.onnxruntime.b.n("this and base files have different roots: ", file, " and ", file2, 46);
        return null;
    }

    private static final String toRelativeStringOrNull$FilesKt__UtilsKt(File file, File file2) {
        List drop;
        FilePathComponents normalize$FilesKt__UtilsKt = normalize$FilesKt__UtilsKt(FilesKt__FilePathComponentsKt.toComponents(file));
        FilePathComponents normalize$FilesKt__UtilsKt2 = normalize$FilesKt__UtilsKt(FilesKt__FilePathComponentsKt.toComponents(file2));
        if (Intrinsics.areEqual(normalize$FilesKt__UtilsKt.getRoot(), normalize$FilesKt__UtilsKt2.getRoot())) {
            int size = normalize$FilesKt__UtilsKt2.getSize();
            int size2 = normalize$FilesKt__UtilsKt.getSize();
            int min = Math.min(size2, size);
            int i10 = 0;
            while (i10 < min && Intrinsics.areEqual(normalize$FilesKt__UtilsKt.getSegments().get(i10), normalize$FilesKt__UtilsKt2.getSegments().get(i10))) {
                i10++;
            }
            StringBuilder sb = new StringBuilder();
            int i11 = size - 1;
            if (i10 <= i11) {
                while (!Intrinsics.areEqual(normalize$FilesKt__UtilsKt2.getSegments().get(i11).getName(), "..")) {
                    sb.append("..");
                    if (i11 != i10) {
                        sb.append(File.separatorChar);
                    }
                    if (i11 != i10) {
                        i11--;
                    }
                }
                return null;
            }
            if (i10 < size2) {
                if (i10 < size) {
                    sb.append(File.separatorChar);
                }
                drop = CollectionsKt___CollectionsKt.drop(normalize$FilesKt__UtilsKt.getSegments(), i10);
                String str = File.separator;
                str.getClass();
                CollectionsKt___CollectionsKt.joinTo$default(drop, sb, str, null, null, 0, null, null, 124, null);
            }
            return sb.toString();
        }
        return null;
    }

    public static final File resolveSibling(File file, String str) {
        file.getClass();
        str.getClass();
        return resolveSibling(file, new File(str));
    }

    public static final boolean endsWith(File file, String str) {
        file.getClass();
        str.getClass();
        return endsWith(file, new File(str));
    }

    public static final boolean startsWith(File file, String str) {
        file.getClass();
        str.getClass();
        return startsWith(file, new File(str));
    }

    public static final File resolve(File file, String str) {
        file.getClass();
        str.getClass();
        return resolve(file, new File(str));
    }

    private static final FilePathComponents normalize$FilesKt__UtilsKt(FilePathComponents filePathComponents) {
        return new FilePathComponents(filePathComponents.getRoot(), normalize$FilesKt__UtilsKt(filePathComponents.getSegments()));
    }
}
