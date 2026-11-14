package org.apache.commons.io.input;

import java.io.Reader;
import java.util.function.IntPredicate;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class CharacterFilterReader extends AbstractCharacterFilterReader {
    public CharacterFilterReader(Reader reader, final int i10) {
        super(reader, new IntPredicate() { // from class: org.apache.commons.io.input.e
            @Override // java.util.function.IntPredicate
            public final boolean test(int i11) {
                boolean lambda$new$0;
                lambda$new$0 = CharacterFilterReader.lambda$new$0(i10, i11);
                return lambda$new$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$0(int i10, int i11) {
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    public CharacterFilterReader(Reader reader, IntPredicate intPredicate) {
        super(reader, intPredicate);
    }
}
