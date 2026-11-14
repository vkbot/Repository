package ai.onnxruntime.providers;

import ai.onnxruntime.OrtProviderOptions;
import j1.i;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class StringConfigProviderOptions extends OrtProviderOptions {
    protected final Map<String, String> options;

    public StringConfigProviderOptions(long j10) {
        super(j10);
        this.options = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getOptionsString$0(Map.Entry entry) {
        return ((String) entry.getKey()) + "=" + ((String) entry.getValue());
    }

    public void add(String str, String str2) {
        checkClosed();
        Objects.requireNonNull(str, "Key must not be null");
        Objects.requireNonNull(str2, "Value must not be null");
        this.options.put(str, str2);
    }

    @Override // ai.onnxruntime.OrtProviderOptions
    public void applyToNative() {
        if (!this.options.isEmpty()) {
            String[] strArr = new String[this.options.size()];
            String[] strArr2 = new String[this.options.size()];
            int i10 = 0;
            for (Map.Entry<String, String> entry : this.options.entrySet()) {
                strArr[i10] = entry.getKey();
                strArr2[i10] = entry.getValue();
                i10++;
            }
            applyToNative(OrtProviderOptions.getApiHandle(), this.nativeHandle, strArr, strArr2);
        }
    }

    public abstract void applyToNative(long j10, long j11, String[] strArr, String[] strArr2);

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.function.Function] */
    public String getOptionsString() {
        return (String) this.options.entrySet().stream().map(new Object()).collect(Collectors.joining(";", "", ";"));
    }

    public void parseOptionsString(String str) {
        for (String str2 : str.split(";")) {
            if (str2.contains("=")) {
                String[] split = str2.split("=");
                if (split.length == 2 && !split[0].isEmpty() && !split[1].isEmpty()) {
                    add(split[0], split[1]);
                } else {
                    i.k(ai.onnxruntime.a.m("Failed to parse option from string '", str2, "'"));
                    return;
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        return ai.onnxruntime.a.p(sb, getOptionsString(), ")");
    }
}
