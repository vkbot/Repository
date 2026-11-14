package org.apache.commons.io.file;

import java.util.stream.Stream;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public enum StandardDeleteOption implements DeleteOption {
    OVERRIDE_READ_ONLY;

    public static /* synthetic */ boolean lambda$overrideReadOnly$0(DeleteOption deleteOption) {
        if (OVERRIDE_READ_ONLY == deleteOption) {
            return true;
        }
        return false;
    }

    public static boolean overrideReadOnly(DeleteOption[] deleteOptionArr) {
        if (IOUtils.length(deleteOptionArr) == 0) {
            return false;
        }
        return Stream.of((Object[]) deleteOptionArr).anyMatch(new i7.k(4));
    }
}
