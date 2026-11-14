package android.support.v4.app;

import android.app.Notification;
import android.os.IInterface;
import kotlin.text.Typography;
import org.apache.commons.io.FilenameUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public interface c extends IInterface {

    /* renamed from: a, reason: collision with root package name */
    public static final String f95a = "android$support$v4$app$INotificationSideChannel".replace(Typography.dollar, FilenameUtils.EXTENSION_SEPARATOR);

    void cancel(String str, int i10, String str2);

    void cancelAll(String str);

    void notify(String str, int i10, String str2, Notification notification);
}
