package kotlin.io.path;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.internal.InlineOnly;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt__StringsJVMKt;
import org.apache.commons.io.FilenameUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0016\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\u0014\u0010\u0018\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0007\u001a\u0014\u0010\u001a\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0007\u001a\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0007\u001a\u001f\u0010\u001c\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0087\b\u001a.\u0010\u001c\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\"0!\"\u00020\"H\u0087\b¢\u0006\u0002\u0010#\u001a&\u0010$\u001a\u00020\u001f*\u00020\u00022\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020%0!\"\u00020%H\u0087\b¢\u0006\u0002\u0010&\u001a&\u0010'\u001a\u00020\u001f*\u00020\u00022\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020%0!\"\u00020%H\u0087\b¢\u0006\u0002\u0010&\u001a&\u0010(\u001a\u00020\u001f*\u00020\u00022\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020%0!\"\u00020%H\u0087\b¢\u0006\u0002\u0010&\u001a&\u0010)\u001a\u00020\u001f*\u00020\u00022\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020%0!\"\u00020%H\u0087\b¢\u0006\u0002\u0010&\u001a\r\u0010*\u001a\u00020\u001f*\u00020\u0002H\u0087\b\u001a\r\u0010+\u001a\u00020\u001f*\u00020\u0002H\u0087\b\u001a\r\u0010,\u001a\u00020\u001f*\u00020\u0002H\u0087\b\u001a\r\u0010-\u001a\u00020\u001f*\u00020\u0002H\u0087\b\u001a\r\u0010.\u001a\u00020\u001f*\u00020\u0002H\u0087\b\u001a\u0015\u0010/\u001a\u00020\u001f*\u00020\u00022\u0006\u00100\u001a\u00020\u0002H\u0087\b\u001a\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u000202*\u00020\u00022\b\b\u0002\u00103\u001a\u00020\u0001H\u0007\u001a?\u00104\u001a\u0002H5\"\u0004\b\u0000\u00105*\u00020\u00022\b\b\u0002\u00103\u001a\u00020\u00012\u0018\u00106\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000208\u0012\u0004\u0012\u0002H507H\u0087\bø\u0001\u0000¢\u0006\u0002\u00109\u001a.\u0010:\u001a\u00020;*\u00020\u00022\b\b\u0002\u00103\u001a\u00020\u00012\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020;07H\u0087\bø\u0001\u0000\u001a\r\u0010=\u001a\u00020>*\u00020\u0002H\u0087\b\u001a\r\u0010?\u001a\u00020;*\u00020\u0002H\u0087\b\u001a\r\u0010@\u001a\u00020\u001f*\u00020\u0002H\u0087\b\u001a.\u0010A\u001a\u00020\u0002*\u00020\u00022\u001a\u0010B\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030C0!\"\u0006\u0012\u0002\b\u00030CH\u0087\b¢\u0006\u0002\u0010D\u001a.\u0010E\u001a\u00020\u0002*\u00020\u00022\u001a\u0010B\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030C0!\"\u0006\u0012\u0002\b\u00030CH\u0087\b¢\u0006\u0002\u0010D\u001a-\u0010F\u001a\u00020\u0002*\u00020\u00022\u001a\u0010B\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030C0!\"\u0006\u0012\u0002\b\u00030CH\u0007¢\u0006\u0002\u0010D\u001a.\u0010G\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\"0!\"\u00020\"H\u0087\b¢\u0006\u0002\u0010#\u001a\u001f\u0010G\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0087\b\u001a\r\u0010H\u001a\u00020I*\u00020\u0002H\u0087\b\u001a0\u0010J\u001a\u0004\u0018\u00010K*\u00020\u00022\u0006\u0010L\u001a\u00020\u00012\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020%0!\"\u00020%H\u0087\b¢\u0006\u0002\u0010M\u001a8\u0010N\u001a\u00020\u0002*\u00020\u00022\u0006\u0010L\u001a\u00020\u00012\b\u0010O\u001a\u0004\u0018\u00010K2\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020%0!\"\u00020%H\u0087\b¢\u0006\u0002\u0010P\u001a4\u0010Q\u001a\u0004\u0018\u0001HR\"\n\b\u0000\u0010R\u0018\u0001*\u00020S*\u00020\u00022\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020%0!\"\u00020%H\u0087\b¢\u0006\u0002\u0010T\u001a2\u0010U\u001a\u0002HR\"\n\b\u0000\u0010R\u0018\u0001*\u00020S*\u00020\u00022\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020%0!\"\u00020%H\u0087\b¢\u0006\u0002\u0010T\u001a\u001c\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u00022\n\u0010Y\u001a\u0006\u0012\u0002\b\u00030ZH\u0001\u001a2\u0010[\u001a\u0002H\\\"\n\b\u0000\u0010\\\u0018\u0001*\u00020]*\u00020\u00022\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020%0!\"\u00020%H\u0087\b¢\u0006\u0002\u0010^\u001a<\u0010[\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010K0_*\u00020\u00022\u0006\u0010B\u001a\u00020\u00012\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020%0!\"\u00020%H\u0087\b¢\u0006\u0002\u0010`\u001a&\u0010a\u001a\u00020b*\u00020\u00022\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020%0!\"\u00020%H\u0087\b¢\u0006\u0002\u0010c\u001a\u0015\u0010d\u001a\u00020\u0002*\u00020\u00022\u0006\u0010O\u001a\u00020bH\u0087\b\u001a(\u0010e\u001a\u0004\u0018\u00010f*\u00020\u00022\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020%0!\"\u00020%H\u0087\b¢\u0006\u0002\u0010g\u001a\u0015\u0010h\u001a\u00020\u0002*\u00020\u00022\u0006\u0010O\u001a\u00020fH\u0087\b\u001a,\u0010i\u001a\b\u0012\u0004\u0012\u00020k0j*\u00020\u00022\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020%0!\"\u00020%H\u0087\b¢\u0006\u0002\u0010l\u001a\u001b\u0010m\u001a\u00020\u0002*\u00020\u00022\f\u0010O\u001a\b\u0012\u0004\u0012\u00020k0jH\u0087\b\u001a\u0015\u0010n\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0087\b\u001a6\u0010o\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u001a\u0010B\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030C0!\"\u0006\u0012\u0002\b\u00030CH\u0087\b¢\u0006\u0002\u0010p\u001a\r\u0010q\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a.\u0010r\u001a\u00020\u0002*\u00020\u00022\u001a\u0010B\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030C0!\"\u0006\u0012\u0002\b\u00030CH\u0087\b¢\u0006\u0002\u0010D\u001aB\u0010s\u001a\u00020\u00022\n\b\u0002\u0010t\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010u\u001a\u0004\u0018\u00010\u00012\u001a\u0010B\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030C0!\"\u0006\u0012\u0002\b\u00030CH\u0087\b¢\u0006\u0002\u0010v\u001aK\u0010s\u001a\u00020\u00022\b\u0010w\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010t\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010u\u001a\u0004\u0018\u00010\u00012\u001a\u0010B\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030C0!\"\u0006\u0012\u0002\b\u00030CH\u0007¢\u0006\u0002\u0010x\u001a6\u0010y\u001a\u00020\u00022\n\b\u0002\u0010t\u001a\u0004\u0018\u00010\u00012\u001a\u0010B\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030C0!\"\u0006\u0012\u0002\b\u00030CH\u0087\b¢\u0006\u0002\u0010z\u001a?\u0010y\u001a\u00020\u00022\b\u0010w\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010t\u001a\u0004\u0018\u00010\u00012\u001a\u0010B\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030C0!\"\u0006\u0012\u0002\b\u00030CH\u0007¢\u0006\u0002\u0010{\u001a\u0015\u0010|\u001a\u00020\u0002*\u00020\u00022\u0006\u00100\u001a\u00020\u0002H\u0087\n\u001a\u0015\u0010|\u001a\u00020\u0002*\u00020\u00022\u0006\u00100\u001a\u00020\u0001H\u0087\n\u001a\u0011\u0010}\u001a\u00020\u00022\u0006\u0010X\u001a\u00020\u0001H\u0087\b\u001a*\u0010}\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00012\u0012\u0010~\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010!\"\u00020\u0001H\u0087\b¢\u0006\u0002\u0010\u007f\u001a\u000f\u0010\u0080\u0001\u001a\u00020\u0002*\u00030\u0081\u0001H\u0087\b\u001a/\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u000208*\u00020\u00022\u0014\u0010 \u001a\u000b\u0012\u0007\b\u0001\u0012\u00030\u0083\u00010!\"\u00030\u0083\u0001H\u0007¢\u0006\u0003\u0010\u0084\u0001\u001a4\u0010\u0085\u0001\u001a\u00020;*\u00020\u00022\u000e\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u0087\u00012\n\b\u0002\u0010\u0088\u0001\u001a\u00030\u0089\u00012\t\b\u0002\u0010\u008a\u0001\u001a\u00020\u001fH\u0007\u001aM\u0010\u0085\u0001\u001a\u00020;*\u00020\u00022\n\b\u0002\u0010\u0088\u0001\u001a\u00030\u0089\u00012\t\b\u0002\u0010\u008a\u0001\u001a\u00020\u001f2\u001a\u0010\u008b\u0001\u001a\u0015\u0012\u0005\u0012\u00030\u008c\u0001\u0012\u0004\u0012\u00020;07¢\u0006\u0003\b\u008d\u0001H\u0007\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001\u001a9\u0010\u008e\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u0087\u00012\u001a\u0010\u008b\u0001\u001a\u0015\u0012\u0005\u0012\u00030\u008c\u0001\u0012\u0004\u0012\u00020;07¢\u0006\u0003\b\u008d\u0001H\u0007\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0007\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"\u001e\u0010\n\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\"\u001f\u0010\r\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u001e\u0010\u0010\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006\"\u001f\u0010\u0013\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u008f\u0001"}, d2 = {"name", "", "Ljava/nio/file/Path;", "getName$annotations", "(Ljava/nio/file/Path;)V", "getName", "(Ljava/nio/file/Path;)Ljava/lang/String;", "nameWithoutExtension", "getNameWithoutExtension$annotations", "getNameWithoutExtension", "extension", "getExtension$annotations", "getExtension", "pathString", "getPathString$annotations", "getPathString", "invariantSeparatorsPathString", "getInvariantSeparatorsPathString$annotations", "getInvariantSeparatorsPathString", "invariantSeparatorsPath", "getInvariantSeparatorsPath$annotations", "getInvariantSeparatorsPath", "absolute", "absolutePathString", "relativeTo", "base", "relativeToOrSelf", "relativeToOrNull", "copyTo", TypedValues.AttributesType.S_TARGET, "overwrite", "", "options", "", "Ljava/nio/file/CopyOption;", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;", "exists", "Ljava/nio/file/LinkOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z", "notExists", "isRegularFile", "isDirectory", "isSymbolicLink", "isExecutable", "isHidden", "isReadable", "isWritable", "isSameFileAs", "other", "listDirectoryEntries", "", "glob", "useDirectoryEntries", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function1;", "Lkotlin/sequences/Sequence;", "(Ljava/nio/file/Path;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "forEachDirectoryEntry", "", "action", "fileSize", "", "deleteExisting", "deleteIfExists", "createDirectory", "attributes", "Ljava/nio/file/attribute/FileAttribute;", "(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "createDirectories", "createParentDirectories", "moveTo", "fileStore", "Ljava/nio/file/FileStore;", "getAttribute", "", "attribute", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;", "setAttribute", "value", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/Object;[Ljava/nio/file/LinkOption;)Ljava/nio/file/Path;", "fileAttributesViewOrNull", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ljava/nio/file/attribute/FileAttributeView;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileAttributeView;", "fileAttributesView", "fileAttributeViewNotAvailable", "", "path", "attributeViewClass", "Ljava/lang/Class;", "readAttributes", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Ljava/nio/file/attribute/BasicFileAttributes;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/BasicFileAttributes;", "", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/util/Map;", "getLastModifiedTime", "Ljava/nio/file/attribute/FileTime;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileTime;", "setLastModifiedTime", "getOwner", "Ljava/nio/file/attribute/UserPrincipal;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/UserPrincipal;", "setOwner", "getPosixFilePermissions", "", "Ljava/nio/file/attribute/PosixFilePermission;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/util/Set;", "setPosixFilePermissions", "createLinkPointingTo", "createSymbolicLinkPointingTo", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "readSymbolicLink", "createFile", "createTempFile", "prefix", "suffix", "(Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "directory", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "createTempDirectory", "(Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "div", "Path", "subpaths", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;", "toPath", "Ljava/net/URI;", "walk", "Lkotlin/io/path/PathWalkOption;", "(Ljava/nio/file/Path;[Lkotlin/io/path/PathWalkOption;)Lkotlin/sequences/Sequence;", "visitFileTree", "visitor", "Ljava/nio/file/FileVisitor;", "maxDepth", "", "followLinks", "builderAction", "Lkotlin/io/path/FileVisitorBuilder;", "Lkotlin/ExtensionFunctionType;", "fileVisitor", "kotlin-stdlib-jdk7"}, k = 5, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, xs = "kotlin/io/path/PathsKt")
@SourceDebugExtension({"SMAP\nPathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1195:1\n1#2:1196\n1869#3,2:1197\n*S KotlinDebug\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n*L\n415#1:1197,2\n*E\n"})
/* loaded from: classes.dex */
public class PathsKt__PathUtilsKt extends PathsKt__PathRecursiveFunctionsKt {
    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path Path(String str, String... strArr) {
        Path path;
        str.getClass();
        strArr.getClass();
        path = Paths.get(str, (String[]) Arrays.copyOf(strArr, strArr.length));
        path.getClass();
        return path;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path absolute(Path path) {
        Path absolutePath;
        path.getClass();
        absolutePath = path.toAbsolutePath();
        absolutePath.getClass();
        return absolutePath;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final String absolutePathString(Path path) {
        Path absolutePath;
        path.getClass();
        absolutePath = path.toAbsolutePath();
        return absolutePath.toString();
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path copyTo(Path path, Path path2, boolean z9) {
        CopyOption[] copyOptionArr;
        path.getClass();
        path2.getClass();
        if (z9) {
            copyOptionArr = new CopyOption[]{StandardCopyOption.REPLACE_EXISTING};
        } else {
            copyOptionArr = new CopyOption[0];
        }
        Path copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        copy.getClass();
        return copy;
    }

    public static /* synthetic */ Path copyTo$default(Path path, Path path2, boolean z9, int i10, Object obj) {
        CopyOption[] copyOptionArr;
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        path.getClass();
        path2.getClass();
        if (z9) {
            copyOptionArr = new CopyOption[]{StandardCopyOption.REPLACE_EXISTING};
        } else {
            copyOptionArr = new CopyOption[0];
        }
        Path copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        copy.getClass();
        return copy;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path createDirectories(Path path, FileAttribute<?>... fileAttributeArr) {
        path.getClass();
        fileAttributeArr.getClass();
        Path createDirectories = Files.createDirectories(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        createDirectories.getClass();
        return createDirectories;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path createDirectory(Path path, FileAttribute<?>... fileAttributeArr) {
        path.getClass();
        fileAttributeArr.getClass();
        Path createDirectory = Files.createDirectory(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        createDirectory.getClass();
        return createDirectory;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path createFile(Path path, FileAttribute<?>... fileAttributeArr) {
        path.getClass();
        fileAttributeArr.getClass();
        Path createFile = Files.createFile(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        createFile.getClass();
        return createFile;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path createLinkPointingTo(Path path, Path path2) {
        Path createLink;
        path.getClass();
        path2.getClass();
        createLink = Files.createLink(path, path2);
        createLink.getClass();
        return createLink;
    }

    @SinceKotlin(version = "1.9")
    public static final Path createParentDirectories(Path path, FileAttribute<?>... fileAttributeArr) {
        path.getClass();
        fileAttributeArr.getClass();
        Path parent = path.getParent();
        if (parent != null && !Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
            try {
                FileAttribute[] fileAttributeArr2 = (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length);
                Files.createDirectories(parent, (FileAttribute[]) Arrays.copyOf(fileAttributeArr2, fileAttributeArr2.length)).getClass();
                return path;
            } catch (FileAlreadyExistsException e) {
                if (!Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                    throw e;
                }
            }
        }
        return path;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path createSymbolicLinkPointingTo(Path path, Path path2, FileAttribute<?>... fileAttributeArr) {
        path.getClass();
        path2.getClass();
        fileAttributeArr.getClass();
        Path createSymbolicLink = Files.createSymbolicLink(path, path2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        createSymbolicLink.getClass();
        return createSymbolicLink;
    }

    @SinceKotlin(version = "1.5")
    public static final Path createTempDirectory(Path path, String str, FileAttribute<?>... fileAttributeArr) {
        fileAttributeArr.getClass();
        if (path != null) {
            Path createTempDirectory = Files.createTempDirectory(path, str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            createTempDirectory.getClass();
            return createTempDirectory;
        }
        Path createTempDirectory2 = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        createTempDirectory2.getClass();
        return createTempDirectory2;
    }

    public static /* synthetic */ Path createTempDirectory$default(String str, FileAttribute[] fileAttributeArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        fileAttributeArr.getClass();
        Path createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        createTempDirectory.getClass();
        return createTempDirectory;
    }

    @SinceKotlin(version = "1.5")
    public static final Path createTempFile(Path path, String str, String str2, FileAttribute<?>... fileAttributeArr) {
        fileAttributeArr.getClass();
        if (path != null) {
            Path createTempFile = Files.createTempFile(path, str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            createTempFile.getClass();
            return createTempFile;
        }
        Path createTempFile2 = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        createTempFile2.getClass();
        return createTempFile2;
    }

    public static /* synthetic */ Path createTempFile$default(String str, String str2, FileAttribute[] fileAttributeArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        fileAttributeArr.getClass();
        Path createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        createTempFile.getClass();
        return createTempFile;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final void deleteExisting(Path path) {
        path.getClass();
        Files.delete(path);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final boolean deleteIfExists(Path path) {
        boolean deleteIfExists;
        path.getClass();
        deleteIfExists = Files.deleteIfExists(path);
        return deleteIfExists;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path div(Path path, Path path2) {
        Path resolve;
        path.getClass();
        path2.getClass();
        resolve = path.resolve(path2);
        resolve.getClass();
        return resolve;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final boolean exists(Path path, LinkOption... linkOptionArr) {
        path.getClass();
        linkOptionArr.getClass();
        return Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @PublishedApi
    public static final Void fileAttributeViewNotAvailable(Path path, Class<?> cls) {
        path.getClass();
        cls.getClass();
        throw new UnsupportedOperationException("The desired attribute view type " + cls + " is not available for the file " + path + FilenameUtils.EXTENSION_SEPARATOR);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final /* synthetic */ <V extends FileAttributeView> V fileAttributesView(Path path, LinkOption... linkOptionArr) {
        path.getClass();
        linkOptionArr.getClass();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        V v9 = (V) Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        if (v9 != null) {
            return v9;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        fileAttributeViewNotAvailable(path, FileAttributeView.class);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final /* synthetic */ <V extends FileAttributeView> V fileAttributesViewOrNull(Path path, LinkOption... linkOptionArr) {
        path.getClass();
        linkOptionArr.getClass();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        return (V) Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long fileSize(Path path) {
        long size;
        path.getClass();
        size = Files.size(path);
        return size;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final FileStore fileStore(Path path) {
        FileStore fileStore;
        path.getClass();
        fileStore = Files.getFileStore(path);
        fileStore.getClass();
        return fileStore;
    }

    @SinceKotlin(version = "2.1")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static final FileVisitor<Path> fileVisitor(Function1<? super FileVisitorBuilder, Unit> function1) {
        function1.getClass();
        FileVisitorBuilderImpl fileVisitorBuilderImpl = new FileVisitorBuilderImpl();
        function1.invoke(fileVisitorBuilderImpl);
        return fileVisitorBuilderImpl.build();
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final void forEachDirectoryEntry(Path path, String str, Function1<? super Path, Unit> function1) {
        DirectoryStream newDirectoryStream;
        path.getClass();
        str.getClass();
        function1.getClass();
        newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            DirectoryStream b10 = a.b(newDirectoryStream);
            b10.getClass();
            Iterator it = b10.iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            Unit unit = Unit.INSTANCE;
            InlineMarker.finallyStart(1);
            CloseableKt.closeFinally(newDirectoryStream, null);
            InlineMarker.finallyEnd(1);
        } finally {
        }
    }

    public static /* synthetic */ void forEachDirectoryEntry$default(Path path, String str, Function1 function1, int i10, Object obj) {
        DirectoryStream newDirectoryStream;
        if ((i10 & 1) != 0) {
            str = "*";
        }
        path.getClass();
        str.getClass();
        function1.getClass();
        newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            DirectoryStream b10 = a.b(newDirectoryStream);
            b10.getClass();
            Iterator it = b10.iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            Unit unit = Unit.INSTANCE;
            InlineMarker.finallyStart(1);
            CloseableKt.closeFinally(newDirectoryStream, null);
            InlineMarker.finallyEnd(1);
        } finally {
        }
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Object getAttribute(Path path, String str, LinkOption... linkOptionArr) {
        path.getClass();
        str.getClass();
        linkOptionArr.getClass();
        return Files.getAttribute(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
    
        r0 = kotlin.text.StringsKt__StringsKt.substringAfterLast(r0, org.apache.commons.io.FilenameUtils.EXTENSION_SEPARATOR, "");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String getExtension(java.nio.file.Path r0) {
        /*
            r0.getClass()
            java.nio.file.Path r0 = kotlin.internal.jdk8.a.o(r0)
            if (r0 == 0) goto L17
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L17
            java.lang.String r0 = kotlin.text.StringsKt.P(r0)
            if (r0 != 0) goto L16
            goto L17
        L16:
            return r0
        L17:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathsKt__PathUtilsKt.getExtension(java.nio.file.Path):java.lang.String");
    }

    private static final String getInvariantSeparatorsPath(Path path) {
        path.getClass();
        return getInvariantSeparatorsPathString(path);
    }

    public static final String getInvariantSeparatorsPathString(Path path) {
        FileSystem fileSystem;
        String separator;
        String replace$default;
        path.getClass();
        fileSystem = path.getFileSystem();
        separator = fileSystem.getSeparator();
        boolean areEqual = Intrinsics.areEqual(separator, "/");
        String obj = path.toString();
        if (!areEqual) {
            separator.getClass();
            replace$default = StringsKt__StringsJVMKt.replace$default(obj, separator, "/", false, 4, (Object) null);
            return replace$default;
        }
        return obj;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final FileTime getLastModifiedTime(Path path, LinkOption... linkOptionArr) {
        path.getClass();
        linkOptionArr.getClass();
        FileTime lastModifiedTime = Files.getLastModifiedTime(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        lastModifiedTime.getClass();
        return lastModifiedTime;
    }

    public static final String getName(Path path) {
        Path fileName;
        String str;
        path.getClass();
        fileName = path.getFileName();
        if (fileName != null) {
            str = fileName.toString();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
    
        r0 = kotlin.text.StringsKt__StringsKt.substringBeforeLast$default(r0, ".", (java.lang.String) null, 2, (java.lang.Object) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String getNameWithoutExtension(java.nio.file.Path r0) {
        /*
            r0.getClass()
            java.nio.file.Path r0 = kotlin.internal.jdk8.a.o(r0)
            if (r0 == 0) goto L17
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L17
            java.lang.String r0 = kotlin.text.StringsKt.Q(r0)
            if (r0 != 0) goto L16
            goto L17
        L16:
            return r0
        L17:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathsKt__PathUtilsKt.getNameWithoutExtension(java.nio.file.Path):java.lang.String");
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final UserPrincipal getOwner(Path path, LinkOption... linkOptionArr) {
        path.getClass();
        linkOptionArr.getClass();
        return Files.getOwner(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    private static final String getPathString(Path path) {
        path.getClass();
        return path.toString();
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Set<PosixFilePermission> getPosixFilePermissions(Path path, LinkOption... linkOptionArr) {
        path.getClass();
        linkOptionArr.getClass();
        Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        posixFilePermissions.getClass();
        return posixFilePermissions;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final boolean isDirectory(Path path, LinkOption... linkOptionArr) {
        path.getClass();
        linkOptionArr.getClass();
        return Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final boolean isExecutable(Path path) {
        boolean isExecutable;
        path.getClass();
        isExecutable = Files.isExecutable(path);
        return isExecutable;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final boolean isHidden(Path path) {
        boolean isHidden;
        path.getClass();
        isHidden = Files.isHidden(path);
        return isHidden;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final boolean isReadable(Path path) {
        boolean isReadable;
        path.getClass();
        isReadable = Files.isReadable(path);
        return isReadable;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final boolean isRegularFile(Path path, LinkOption... linkOptionArr) {
        path.getClass();
        linkOptionArr.getClass();
        return Files.isRegularFile(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final boolean isSameFileAs(Path path, Path path2) {
        boolean isSameFile;
        path.getClass();
        path2.getClass();
        isSameFile = Files.isSameFile(path, path2);
        return isSameFile;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final boolean isSymbolicLink(Path path) {
        boolean isSymbolicLink;
        path.getClass();
        isSymbolicLink = Files.isSymbolicLink(path);
        return isSymbolicLink;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final boolean isWritable(Path path) {
        boolean isWritable;
        path.getClass();
        isWritable = Files.isWritable(path);
        return isWritable;
    }

    @SinceKotlin(version = "1.5")
    public static final List<Path> listDirectoryEntries(Path path, String str) {
        DirectoryStream newDirectoryStream;
        path.getClass();
        str.getClass();
        newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            DirectoryStream b10 = a.b(newDirectoryStream);
            b10.getClass();
            List<Path> list = CollectionsKt.toList(b10);
            CloseableKt.closeFinally(newDirectoryStream, null);
            return list;
        } finally {
        }
    }

    public static /* synthetic */ List listDirectoryEntries$default(Path path, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "*";
        }
        return listDirectoryEntries(path, str);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path moveTo(Path path, Path path2, boolean z9) {
        CopyOption[] copyOptionArr;
        path.getClass();
        path2.getClass();
        if (z9) {
            copyOptionArr = new CopyOption[]{StandardCopyOption.REPLACE_EXISTING};
        } else {
            copyOptionArr = new CopyOption[0];
        }
        Path move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        move.getClass();
        return move;
    }

    public static /* synthetic */ Path moveTo$default(Path path, Path path2, boolean z9, int i10, Object obj) {
        CopyOption[] copyOptionArr;
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        path.getClass();
        path2.getClass();
        if (z9) {
            copyOptionArr = new CopyOption[]{StandardCopyOption.REPLACE_EXISTING};
        } else {
            copyOptionArr = new CopyOption[0];
        }
        Path move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        move.getClass();
        return move;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final boolean notExists(Path path, LinkOption... linkOptionArr) {
        path.getClass();
        linkOptionArr.getClass();
        return Files.notExists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final /* synthetic */ <A extends BasicFileAttributes> A readAttributes(Path path, LinkOption... linkOptionArr) {
        path.getClass();
        linkOptionArr.getClass();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
        A a10 = (A) Files.readAttributes(path, BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        a10.getClass();
        return a10;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path readSymbolicLink(Path path) {
        Path readSymbolicLink;
        path.getClass();
        readSymbolicLink = Files.readSymbolicLink(path);
        readSymbolicLink.getClass();
        return readSymbolicLink;
    }

    @SinceKotlin(version = "1.5")
    public static final Path relativeTo(Path path, Path path2) {
        path.getClass();
        path2.getClass();
        try {
            return PathRelativizer.INSTANCE.tryRelativeTo(path, path2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "\nthis path: " + path + "\nbase path: " + path2, e);
        }
    }

    @SinceKotlin(version = "1.5")
    public static final Path relativeToOrNull(Path path, Path path2) {
        path.getClass();
        path2.getClass();
        try {
            return PathRelativizer.INSTANCE.tryRelativeTo(path, path2);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @SinceKotlin(version = "1.5")
    public static final Path relativeToOrSelf(Path path, Path path2) {
        path.getClass();
        path2.getClass();
        Path relativeToOrNull = relativeToOrNull(path, path2);
        if (relativeToOrNull == null) {
            return path;
        }
        return relativeToOrNull;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path setAttribute(Path path, String str, Object obj, LinkOption... linkOptionArr) {
        path.getClass();
        str.getClass();
        linkOptionArr.getClass();
        Path attribute = Files.setAttribute(path, str, obj, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        attribute.getClass();
        return attribute;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path setLastModifiedTime(Path path, FileTime fileTime) {
        Path lastModifiedTime;
        path.getClass();
        fileTime.getClass();
        lastModifiedTime = Files.setLastModifiedTime(path, fileTime);
        lastModifiedTime.getClass();
        return lastModifiedTime;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path setOwner(Path path, UserPrincipal userPrincipal) {
        Path owner;
        path.getClass();
        userPrincipal.getClass();
        owner = Files.setOwner(path, userPrincipal);
        owner.getClass();
        return owner;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path setPosixFilePermissions(Path path, Set<? extends PosixFilePermission> set) {
        Path posixFilePermissions;
        path.getClass();
        set.getClass();
        posixFilePermissions = Files.setPosixFilePermissions(path, set);
        posixFilePermissions.getClass();
        return posixFilePermissions;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path toPath(URI uri) {
        Path path;
        uri.getClass();
        path = Paths.get(uri);
        path.getClass();
        return path;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <T> T useDirectoryEntries(Path path, String str, Function1<? super Sequence<? extends Path>, ? extends T> function1) {
        DirectoryStream newDirectoryStream;
        path.getClass();
        str.getClass();
        function1.getClass();
        newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            DirectoryStream b10 = a.b(newDirectoryStream);
            b10.getClass();
            T invoke = function1.invoke(CollectionsKt.asSequence(b10));
            InlineMarker.finallyStart(1);
            CloseableKt.closeFinally(newDirectoryStream, null);
            InlineMarker.finallyEnd(1);
            return invoke;
        } finally {
        }
    }

    public static /* synthetic */ Object useDirectoryEntries$default(Path path, String str, Function1 function1, int i10, Object obj) {
        DirectoryStream newDirectoryStream;
        if ((i10 & 1) != 0) {
            str = "*";
        }
        path.getClass();
        str.getClass();
        function1.getClass();
        newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            DirectoryStream b10 = a.b(newDirectoryStream);
            b10.getClass();
            Object invoke = function1.invoke(CollectionsKt.asSequence(b10));
            InlineMarker.finallyStart(1);
            CloseableKt.closeFinally(newDirectoryStream, null);
            InlineMarker.finallyEnd(1);
            return invoke;
        } finally {
        }
    }

    @SinceKotlin(version = "2.1")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static final void visitFileTree(Path path, FileVisitor<Path> fileVisitor, int i10, boolean z9) {
        Set emptySet;
        FileVisitOption fileVisitOption;
        path.getClass();
        fileVisitor.getClass();
        if (z9) {
            fileVisitOption = FileVisitOption.FOLLOW_LINKS;
            emptySet = SetsKt.setOf(fileVisitOption);
        } else {
            emptySet = SetsKt.emptySet();
        }
        Files.walkFileTree(path, emptySet, i10, fileVisitor);
    }

    public static /* synthetic */ void visitFileTree$default(Path path, FileVisitor fileVisitor, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        visitFileTree(path, (FileVisitor<Path>) fileVisitor, i10, z9);
    }

    @SinceKotlin(version = "2.1")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static final Sequence<Path> walk(Path path, PathWalkOption... pathWalkOptionArr) {
        path.getClass();
        pathWalkOptionArr.getClass();
        return new PathTreeWalk(path, pathWalkOptionArr);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path div(Path path, String str) {
        Path resolve;
        path.getClass();
        str.getClass();
        resolve = path.resolve(str);
        resolve.getClass();
        return resolve;
    }

    public static /* synthetic */ void visitFileTree$default(Path path, int i10, boolean z9, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i11 & 2) != 0) {
            z9 = false;
        }
        visitFileTree(path, i10, z9, (Function1<? super FileVisitorBuilder, Unit>) function1);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path Path(String str) {
        Path path;
        str.getClass();
        path = Paths.get(str, new String[0]);
        path.getClass();
        return path;
    }

    @SinceKotlin(version = "1.5")
    public static /* synthetic */ void getExtension$annotations(Path path) {
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @Deprecated(level = DeprecationLevel.ERROR, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @ReplaceWith(expression = "invariantSeparatorsPathString", imports = {}))
    @ExperimentalPathApi
    public static /* synthetic */ void getInvariantSeparatorsPath$annotations(Path path) {
    }

    @SinceKotlin(version = "1.5")
    public static /* synthetic */ void getInvariantSeparatorsPathString$annotations(Path path) {
    }

    @SinceKotlin(version = "1.5")
    public static /* synthetic */ void getName$annotations(Path path) {
    }

    @SinceKotlin(version = "1.5")
    public static /* synthetic */ void getNameWithoutExtension$annotations(Path path) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    public static /* synthetic */ void getPathString$annotations(Path path) {
    }

    public static /* synthetic */ Path createTempDirectory$default(Path path, String str, FileAttribute[] fileAttributeArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return createTempDirectory(path, str, fileAttributeArr);
    }

    @SinceKotlin(version = "2.1")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static final void visitFileTree(Path path, int i10, boolean z9, Function1<? super FileVisitorBuilder, Unit> function1) {
        path.getClass();
        function1.getClass();
        visitFileTree(path, fileVisitor(function1), i10, z9);
    }

    public static /* synthetic */ Path createTempFile$default(Path path, String str, String str2, FileAttribute[] fileAttributeArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        return createTempFile(path, str, str2, fileAttributeArr);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Map<String, Object> readAttributes(Path path, String str, LinkOption... linkOptionArr) {
        path.getClass();
        str.getClass();
        linkOptionArr.getClass();
        Map<String, Object> readAttributes = Files.readAttributes(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        readAttributes.getClass();
        return readAttributes;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path copyTo(Path path, Path path2, CopyOption... copyOptionArr) {
        path.getClass();
        path2.getClass();
        copyOptionArr.getClass();
        Path copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        copy.getClass();
        return copy;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path moveTo(Path path, Path path2, CopyOption... copyOptionArr) {
        path.getClass();
        path2.getClass();
        copyOptionArr.getClass();
        Path move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        move.getClass();
        return move;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path createTempDirectory(String str, FileAttribute<?>... fileAttributeArr) {
        fileAttributeArr.getClass();
        Path createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        createTempDirectory.getClass();
        return createTempDirectory;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final Path createTempFile(String str, String str2, FileAttribute<?>... fileAttributeArr) {
        fileAttributeArr.getClass();
        Path createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        createTempFile.getClass();
        return createTempFile;
    }
}
