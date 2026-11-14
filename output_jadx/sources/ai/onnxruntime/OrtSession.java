package ai.onnxruntime;

import ai.onnxruntime.OrtException;
import ai.onnxruntime.providers.CoreMLFlags;
import ai.onnxruntime.providers.NNAPIFlags;
import ai.onnxruntime.providers.OrtCUDAProviderOptions;
import ai.onnxruntime.providers.OrtTensorRTProviderOptions;
import j1.i;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class OrtSession implements AutoCloseable {
    private final OrtAllocator allocator;
    private boolean closed;
    private final Set<String> inputNames;
    private OnnxModelMetadata metadata;
    private final long nativeHandle;
    private final long numInputs;
    private final long numOutputs;
    private final Set<String> outputNames;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class RunOptions implements AutoCloseable {
        private boolean closed = false;
        private final long nativeHandle = createRunOptions(OnnxRuntime.ortApiHandle);

        static {
            try {
                OnnxRuntime.init();
            } catch (IOException e) {
                b.o("Failed to load onnx-runtime library", e);
            }
        }

        private native void addActiveLoraAdapter(long j10, long j11, long j12);

        private native void addRunConfigEntry(long j10, long j11, String str, String str2);

        private void checkClosed() {
            if (!this.closed) {
                return;
            }
            i.l("Trying to use a closed RunOptions");
        }

        private static native void close(long j10, long j11);

        private static native long createRunOptions(long j10);

        private native int getLogLevel(long j10, long j11);

        private native int getLogVerbosityLevel(long j10, long j11);

        private native String getRunTag(long j10, long j11);

        private native void setLogLevel(long j10, long j11, int i10);

        private native void setLogVerbosityLevel(long j10, long j11, int i10);

        private native void setRunTag(long j10, long j11, String str);

        private native void setTerminate(long j10, long j11, boolean z9);

        public void addActiveLoraAdapter(OrtLoraAdapter ortLoraAdapter) {
            checkClosed();
            ortLoraAdapter.checkClosed();
            addActiveLoraAdapter(OnnxRuntime.ortApiHandle, this.nativeHandle, ortLoraAdapter.getNativeHandle());
        }

        public void addRunConfigEntry(String str, String str2) {
            checkClosed();
            addRunConfigEntry(OnnxRuntime.ortApiHandle, this.nativeHandle, str, str2);
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            if (!this.closed) {
                close(OnnxRuntime.ortApiHandle, this.nativeHandle);
                this.closed = true;
            } else {
                i.l("Trying to close an already closed RunOptions");
            }
        }

        public OrtLoggingLevel getLogLevel() {
            checkClosed();
            return OrtLoggingLevel.mapFromInt(getLogLevel(OnnxRuntime.ortApiHandle, this.nativeHandle));
        }

        public int getLogVerbosityLevel() {
            checkClosed();
            return getLogVerbosityLevel(OnnxRuntime.ortApiHandle, this.nativeHandle);
        }

        public long getNativeHandle() {
            return this.nativeHandle;
        }

        public String getRunTag() {
            checkClosed();
            return getRunTag(OnnxRuntime.ortApiHandle, this.nativeHandle);
        }

        public void setLogLevel(OrtLoggingLevel ortLoggingLevel) {
            checkClosed();
            setLogLevel(OnnxRuntime.ortApiHandle, this.nativeHandle, ortLoggingLevel.getValue());
        }

        public void setLogVerbosityLevel(int i10) {
            checkClosed();
            setLogVerbosityLevel(OnnxRuntime.ortApiHandle, this.nativeHandle, i10);
        }

        public void setRunTag(String str) {
            checkClosed();
            setRunTag(OnnxRuntime.ortApiHandle, this.nativeHandle, str);
        }

        public void setTerminate(boolean z9) {
            checkClosed();
            setTerminate(OnnxRuntime.ortApiHandle, this.nativeHandle, z9);
        }
    }

    static {
        try {
            OnnxRuntime.init();
        } catch (IOException e) {
            b.o("Failed to load onnx-runtime library", e);
        }
    }

    private OrtSession(long j10, OrtAllocator ortAllocator) {
        this.closed = false;
        this.nativeHandle = j10;
        this.allocator = ortAllocator;
        this.numInputs = getNumInputs(OnnxRuntime.ortApiHandle, j10);
        this.inputNames = new LinkedHashSet(Arrays.asList(getInputNames(OnnxRuntime.ortApiHandle, j10, ortAllocator.handle)));
        this.numOutputs = getNumOutputs(OnnxRuntime.ortApiHandle, j10);
        this.outputNames = new LinkedHashSet(Arrays.asList(getOutputNames(OnnxRuntime.ortApiHandle, j10, ortAllocator.handle)));
    }

    private native void closeSession(long j10, long j11);

    private native OnnxModelMetadata constructMetadata(long j10, long j11, long j12);

    private static native long createSession(long j10, long j11, String str, long j12);

    private static native long createSession(long j10, long j11, ByteBuffer byteBuffer, int i10, int i11, long j12);

    private static native long createSession(long j10, long j11, byte[] bArr, long j12);

    private native String endProfiling(long j10, long j11, long j12);

    public static long getHandle(OnnxValue onnxValue) {
        if (onnxValue instanceof OnnxTensorLike) {
            return ((OnnxTensorLike) onnxValue).nativeHandle;
        }
        if (onnxValue instanceof OnnxSequence) {
            return ((OnnxSequence) onnxValue).nativeHandle;
        }
        if (onnxValue instanceof OnnxMap) {
            return ((OnnxMap) onnxValue).nativeHandle;
        }
        androidx.navigation.b.o(onnxValue.getClass(), "Unexpected OnnxValue subclass, should be {OnnxTensorLike, OnnxSequence, OnnxMap}, found ");
        return 0L;
    }

    private native NodeInfo[] getInputInfo(long j10, long j11, long j12);

    private native String[] getInputNames(long j10, long j11, long j12);

    private native long getNumInputs(long j10, long j11);

    private native long getNumOutputs(long j10, long j11);

    private native NodeInfo[] getOutputInfo(long j10, long j11, long j12);

    private native String[] getOutputNames(long j10, long j11, long j12);

    private native long getProfilingStartTimeInNs(long j10, long j11);

    private native boolean[] run(long j10, long j11, long j12, String[] strArr, long[] jArr, long j13, String[] strArr2, long j14, OnnxValue[] onnxValueArr, long[] jArr2, long j15);

    private static Map<String, NodeInfo> wrapInMap(NodeInfo[] nodeInfoArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(OrtUtil.capacityFromSize(nodeInfoArr.length));
        for (NodeInfo nodeInfo : nodeInfoArr) {
            linkedHashMap.put(nodeInfo.getName(), nodeInfo);
        }
        return linkedHashMap;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (!this.closed) {
            closeSession(OnnxRuntime.ortApiHandle, this.nativeHandle);
            this.closed = true;
        } else {
            i.l("Trying to close an already closed OrtSession.");
        }
    }

    public String endProfiling() {
        return endProfiling(OnnxRuntime.ortApiHandle, this.nativeHandle, this.allocator.handle);
    }

    public Map<String, NodeInfo> getInputInfo() {
        if (!this.closed) {
            return wrapInMap(getInputInfo(OnnxRuntime.ortApiHandle, this.nativeHandle, this.allocator.handle));
        }
        i.l("Asking for inputs from a closed OrtSession.");
        return null;
    }

    public Set<String> getInputNames() {
        if (!this.closed) {
            return this.inputNames;
        }
        i.l("Asking for inputs from a closed OrtSession.");
        return null;
    }

    public OnnxModelMetadata getMetadata() {
        OrtSession ortSession;
        if (this.metadata == null) {
            ortSession = this;
            ortSession.metadata = ortSession.constructMetadata(OnnxRuntime.ortApiHandle, this.nativeHandle, this.allocator.handle);
        } else {
            ortSession = this;
        }
        return ortSession.metadata;
    }

    public long getNumInputs() {
        if (!this.closed) {
            return this.numInputs;
        }
        i.l("Asking for inputs from a closed OrtSession.");
        return 0L;
    }

    public long getNumOutputs() {
        if (!this.closed) {
            return this.numOutputs;
        }
        i.l("Asking for outputs from a closed OrtSession.");
        return 0L;
    }

    public Map<String, NodeInfo> getOutputInfo() {
        if (!this.closed) {
            return wrapInMap(getOutputInfo(OnnxRuntime.ortApiHandle, this.nativeHandle, this.allocator.handle));
        }
        i.l("Asking for outputs from a closed OrtSession.");
        return null;
    }

    public Set<String> getOutputNames() {
        if (!this.closed) {
            return this.outputNames;
        }
        i.l("Asking for outputs from a closed OrtSession.");
        return null;
    }

    public long getProfilingStartTimeInNs() {
        return getProfilingStartTimeInNs(OnnxRuntime.ortApiHandle, this.nativeHandle);
    }

    public Result run(Map<String, ? extends OnnxTensorLike> map, Set<String> set, Map<String, ? extends OnnxValue> map2, RunOptions runOptions) {
        long nativeHandle;
        if (!this.closed) {
            if ((!map.isEmpty() || this.numInputs == 0) && map.size() <= this.numInputs) {
                int size = map2.size() + set.size();
                if (size != 0 && size <= this.numOutputs) {
                    int size2 = map.size();
                    String[] strArr = new String[size2];
                    long[] jArr = new long[map.size()];
                    int i10 = 0;
                    int i11 = 0;
                    for (Map.Entry<String, ? extends OnnxTensorLike> entry : map.entrySet()) {
                        if (this.inputNames.contains(entry.getKey())) {
                            strArr[i11] = entry.getKey();
                            jArr[i11] = entry.getValue().getNativeHandle();
                            i11++;
                        } else {
                            throw new OrtException("Unknown input name " + entry.getKey() + ", expected one of " + this.inputNames.toString());
                        }
                    }
                    int size3 = map2.size() + set.size();
                    String[] strArr2 = new String[size3];
                    OnnxValue[] onnxValueArr = new OnnxValue[size3];
                    long[] jArr2 = new long[size3];
                    for (Map.Entry<String, ? extends OnnxValue> entry2 : map2.entrySet()) {
                        if (this.outputNames.contains(entry2.getKey())) {
                            strArr2[i10] = entry2.getKey();
                            onnxValueArr[i10] = entry2.getValue();
                            jArr2[i10] = getHandle(entry2.getValue());
                            i10++;
                        } else {
                            throw new OrtException("Unknown output name " + entry2.getKey() + ", expected one of " + this.outputNames.toString());
                        }
                    }
                    for (String str : set) {
                        if (this.outputNames.contains(str)) {
                            if (!map2.containsKey(str)) {
                                strArr2[i10] = str;
                                i10++;
                            } else {
                                throw new OrtException(a.m("Output '", str, "' was found in both the requested outputs and the pinned outputs"));
                            }
                        } else {
                            StringBuilder x9 = a.x("Unknown output name ", str, ", expected one of ");
                            x9.append(this.outputNames.toString());
                            throw new OrtException(x9.toString());
                        }
                    }
                    if (runOptions == null) {
                        nativeHandle = 0;
                    } else {
                        nativeHandle = runOptions.getNativeHandle();
                    }
                    return new Result(strArr2, onnxValueArr, run(OnnxRuntime.ortApiHandle, this.nativeHandle, this.allocator.handle, strArr, jArr, size2, strArr2, size3, onnxValueArr, jArr2, nativeHandle));
                }
                throw new OrtException("Unexpected number of requestedOutputs & pinnedOutputs, expected [1," + this.numOutputs + ") found " + size);
            }
            throw new OrtException("Unexpected number of inputs, expected [1," + this.numInputs + ") found " + map.size());
        }
        i.l("Trying to score a closed OrtSession.");
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OrtSession(numInputs=");
        sb.append(this.numInputs);
        sb.append(",numOutputs=");
        return a.n(sb, this.numOutputs, ")");
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class SessionOptions implements AutoCloseable {
        private boolean closed = false;
        private final long nativeHandle = createOptions(OnnxRuntime.ortApiHandle);
        private final List<Long> customLibraryHandles = new ArrayList();
        private final Map<String, String> configEntries = new LinkedHashMap();

        /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
        /* loaded from: classes.dex */
        public enum ExecutionMode {
            SEQUENTIAL(0),
            PARALLEL(1);

            private final int id;

            ExecutionMode(int i10) {
                this.id = i10;
            }

            public int getID() {
                return this.id;
            }
        }

        /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
        /* loaded from: classes.dex */
        public enum OptLevel {
            NO_OPT(0),
            BASIC_OPT(1),
            EXTENDED_OPT(2),
            LAYOUT_OPT(3),
            ALL_OPT(99);

            private final int id;

            OptLevel(int i10) {
                this.id = i10;
            }

            public int getID() {
                return this.id;
            }
        }

        static {
            try {
                OnnxRuntime.init();
            } catch (IOException e) {
                b.o("Failed to load onnx-runtime library", e);
            }
        }

        private native void addACL(long j10, long j11, boolean z9);

        private native void addCPU(long j10, long j11, int i10);

        private native void addCUDA(long j10, long j11, int i10);

        private native void addCUDAV2(long j10, long j11, long j12);

        private native void addConfigEntry(long j10, long j11, String str, String str2);

        private native void addCoreML(long j10, long j11, int i10);

        private native void addDirectML(long j10, long j11, int i10);

        private native void addDnnl(long j10, long j11, int i10);

        private native void addExecutionProvider(long j10, long j11, long j12, long[] jArr, String[] strArr, String[] strArr2);

        private native void addExecutionProvider(long j10, long j11, String str, String[] strArr, String[] strArr2);

        private native void addExternalInitializers(long j10, long j11, String[] strArr, long[] jArr);

        private native void addFreeDimensionOverrideByName(long j10, long j11, String str, long j12);

        private native void addInitializer(long j10, long j11, String str, long j12);

        private native void addNnapi(long j10, long j11, int i10);

        private native void addOpenVINO(long j10, long j11, String str);

        private native void addROCM(long j10, long j11, int i10);

        private native void addTensorrt(long j10, long j11, int i10);

        private native void addTensorrtV2(long j10, long j11, long j12);

        private native void addTvm(long j10, long j11, String str);

        private void checkClosed() {
            if (!this.closed) {
                return;
            }
            i.l("Trying to use a closed SessionOptions");
        }

        private native void closeCustomLibraries(long[] jArr);

        private native void closeOptions(long j10, long j11);

        private native long createOptions(long j10);

        private native void disablePerSessionThreads(long j10, long j11);

        private native void disableProfiling(long j10, long j11);

        private native void enableProfiling(long j10, long j11, String str);

        private native long registerCustomOpLibrary(long j10, long j11, String str);

        private native void registerCustomOpsUsingFunction(long j10, long j11, String str);

        private native void setCPUArenaAllocator(long j10, long j11, boolean z9);

        private native void setDeterministicCompute(long j10, long j11, boolean z9);

        private native void setExecutionMode(long j10, long j11, int i10);

        private native void setInterOpNumThreads(long j10, long j11, int i10);

        private native void setIntraOpNumThreads(long j10, long j11, int i10);

        private native void setLoggerId(long j10, long j11, String str);

        private native void setMemoryPatternOptimization(long j10, long j11, boolean z9);

        private native void setOptimizationLevel(long j10, long j11, int i10);

        private native void setOptimizationModelFilePath(long j10, long j11, String str);

        private native void setSessionLogLevel(long j10, long j11, int i10);

        private native void setSessionLogVerbosityLevel(long j10, long j11, int i10);

        public void addACL(boolean z9) {
            checkClosed();
            addACL(OnnxRuntime.ortApiHandle, this.nativeHandle, z9);
        }

        public void addCPU(boolean z9) {
            checkClosed();
            addCPU(OnnxRuntime.ortApiHandle, this.nativeHandle, z9 ? 1 : 0);
        }

        public void addCUDA(OrtCUDAProviderOptions ortCUDAProviderOptions) {
            checkClosed();
            if (OnnxRuntime.extractCUDA()) {
                ortCUDAProviderOptions.applyToNative();
                addCUDAV2(OnnxRuntime.ortApiHandle, this.nativeHandle, ortCUDAProviderOptions.nativeHandle);
                return;
            }
            throw new OrtException(OrtException.OrtErrorCode.ORT_EP_FAIL, "Failed to find CUDA shared provider");
        }

        public void addConfigEntry(String str, String str2) {
            checkClosed();
            addConfigEntry(OnnxRuntime.ortApiHandle, this.nativeHandle, str, str2);
            this.configEntries.put(str, str2);
        }

        public void addCoreML(EnumSet<CoreMLFlags> enumSet) {
            checkClosed();
            addCoreML(OnnxRuntime.ortApiHandle, this.nativeHandle, OrtFlags.aggregateToInt(enumSet));
        }

        public void addDirectML(int i10) {
            checkClosed();
            addDirectML(OnnxRuntime.ortApiHandle, this.nativeHandle, i10);
        }

        public void addDnnl(boolean z9) {
            checkClosed();
            if (OnnxRuntime.extractDNNL()) {
                addDnnl(OnnxRuntime.ortApiHandle, this.nativeHandle, z9 ? 1 : 0);
                return;
            }
            throw new OrtException(OrtException.OrtErrorCode.ORT_EP_FAIL, "Failed to find DNNL shared provider");
        }

        public void addExecutionProvider(List<OrtEpDevice> list, Map<String, String> map) {
            checkClosed();
            if (!list.isEmpty()) {
                long[] jArr = new long[list.size()];
                for (int i10 = 0; i10 < list.size(); i10++) {
                    jArr[i10] = list.get(i10).getNativeHandle();
                }
                String[][] unpackMap = OrtUtil.unpackMap(map);
                addExecutionProvider(OnnxRuntime.ortApiHandle, OrtEnvironment.getEnvironment().getNativeHandle(), this.nativeHandle, jArr, unpackMap[0], unpackMap[1]);
                return;
            }
            i.k("Must supply at least one OrtEpDevice");
        }

        public void addExternalInitializers(Map<String, OnnxTensorLike> map) {
            checkClosed();
            if (map.isEmpty()) {
                return;
            }
            String[] strArr = new String[map.size()];
            long[] jArr = new long[map.size()];
            int i10 = 0;
            for (Map.Entry<String, OnnxTensorLike> entry : map.entrySet()) {
                strArr[i10] = entry.getKey();
                jArr[i10] = entry.getValue().nativeHandle;
                i10++;
            }
            addExternalInitializers(OnnxRuntime.ortApiHandle, this.nativeHandle, strArr, jArr);
        }

        public void addInitializer(String str, OnnxTensorLike onnxTensorLike) {
            checkClosed();
            if (!str.trim().isEmpty()) {
                addInitializer(OnnxRuntime.ortApiHandle, this.nativeHandle, str, onnxTensorLike.getNativeHandle());
            } else {
                i.k("Initializer name was blank");
            }
        }

        public void addNnapi(EnumSet<NNAPIFlags> enumSet) {
            checkClosed();
            addNnapi(OnnxRuntime.ortApiHandle, this.nativeHandle, OrtFlags.aggregateToInt(enumSet));
        }

        public void addOpenVINO(String str) {
            checkClosed();
            if (OnnxRuntime.extractOpenVINO()) {
                addOpenVINO(OnnxRuntime.ortApiHandle, this.nativeHandle, str);
                return;
            }
            throw new OrtException(OrtException.OrtErrorCode.ORT_EP_FAIL, "Failed to find OpenVINO shared provider");
        }

        public void addQnn(Map<String, String> map) {
            OnnxRuntime.extractQNN();
            addExecutionProvider("QNN", map);
        }

        public void addROCM(int i10) {
            checkClosed();
            if (OnnxRuntime.extractROCM()) {
                addROCM(OnnxRuntime.ortApiHandle, this.nativeHandle, i10);
                return;
            }
            throw new OrtException(OrtException.OrtErrorCode.ORT_EP_FAIL, "Failed to find ROCM shared provider");
        }

        public void addTensorrt(OrtTensorRTProviderOptions ortTensorRTProviderOptions) {
            checkClosed();
            if (OnnxRuntime.extractTensorRT()) {
                ortTensorRTProviderOptions.applyToNative();
                addTensorrtV2(OnnxRuntime.ortApiHandle, this.nativeHandle, ortTensorRTProviderOptions.nativeHandle);
                return;
            }
            throw new OrtException(OrtException.OrtErrorCode.ORT_EP_FAIL, "Failed to find TensorRT shared provider");
        }

        public void addTvm(String str) {
            checkClosed();
            addTvm(OnnxRuntime.ortApiHandle, this.nativeHandle, str);
        }

        public void addWebGPU(Map<String, String> map) {
            addExecutionProvider("WebGPU", map);
        }

        public void addXnnpack(Map<String, String> map) {
            addExecutionProvider("XNNPACK", map);
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            if (!this.closed) {
                if (!this.customLibraryHandles.isEmpty()) {
                    long[] jArr = new long[this.customLibraryHandles.size()];
                    for (int i10 = 0; i10 < this.customLibraryHandles.size(); i10++) {
                        jArr[i10] = this.customLibraryHandles.get(i10).longValue();
                    }
                    closeCustomLibraries(jArr);
                }
                closeOptions(OnnxRuntime.ortApiHandle, this.nativeHandle);
                this.closed = true;
                return;
            }
            i.l("Trying to close a closed SessionOptions.");
        }

        public void disablePerSessionThreads() {
            checkClosed();
            disablePerSessionThreads(OnnxRuntime.ortApiHandle, this.nativeHandle);
        }

        public void disableProfiling() {
            checkClosed();
            disableProfiling(OnnxRuntime.ortApiHandle, this.nativeHandle);
        }

        public void enableProfiling(String str) {
            checkClosed();
            enableProfiling(OnnxRuntime.ortApiHandle, this.nativeHandle, str);
        }

        public Map<String, String> getConfigEntries() {
            checkClosed();
            return Collections.unmodifiableMap(this.configEntries);
        }

        public long getNativeHandle() {
            return this.nativeHandle;
        }

        public void registerCustomOpLibrary(String str) {
            checkClosed();
            Objects.requireNonNull(str, "path must not be null");
            this.customLibraryHandles.add(Long.valueOf(registerCustomOpLibrary(OnnxRuntime.ortApiHandle, this.nativeHandle, str)));
        }

        public void registerCustomOpsUsingFunction(String str) {
            checkClosed();
            registerCustomOpsUsingFunction(OnnxRuntime.ortApiHandle, this.nativeHandle, str);
        }

        public void setCPUArenaAllocator(boolean z9) {
            checkClosed();
            setCPUArenaAllocator(OnnxRuntime.ortApiHandle, this.nativeHandle, z9);
        }

        public void setDeterministicCompute(boolean z9) {
            checkClosed();
            setDeterministicCompute(OnnxRuntime.ortApiHandle, this.nativeHandle, z9);
        }

        public void setExecutionMode(ExecutionMode executionMode) {
            checkClosed();
            setExecutionMode(OnnxRuntime.ortApiHandle, this.nativeHandle, executionMode.getID());
        }

        public void setInterOpNumThreads(int i10) {
            checkClosed();
            setInterOpNumThreads(OnnxRuntime.ortApiHandle, this.nativeHandle, i10);
        }

        public void setIntraOpNumThreads(int i10) {
            checkClosed();
            setIntraOpNumThreads(OnnxRuntime.ortApiHandle, this.nativeHandle, i10);
        }

        public void setLoggerId(String str) {
            checkClosed();
            setLoggerId(OnnxRuntime.ortApiHandle, this.nativeHandle, str);
        }

        public void setMemoryPatternOptimization(boolean z9) {
            checkClosed();
            setMemoryPatternOptimization(OnnxRuntime.ortApiHandle, this.nativeHandle, z9);
        }

        public void setOptimizationLevel(OptLevel optLevel) {
            checkClosed();
            setOptimizationLevel(OnnxRuntime.ortApiHandle, this.nativeHandle, optLevel.getID());
        }

        public void setOptimizedModelFilePath(String str) {
            checkClosed();
            setOptimizationModelFilePath(OnnxRuntime.ortApiHandle, this.nativeHandle, str);
        }

        public void setSessionLogLevel(OrtLoggingLevel ortLoggingLevel) {
            checkClosed();
            setSessionLogLevel(OnnxRuntime.ortApiHandle, this.nativeHandle, ortLoggingLevel.getValue());
        }

        public void setSessionLogVerbosityLevel(int i10) {
            checkClosed();
            setSessionLogVerbosityLevel(OnnxRuntime.ortApiHandle, this.nativeHandle, i10);
        }

        public void setSymbolicDimensionValue(String str, long j10) {
            checkClosed();
            addFreeDimensionOverrideByName(OnnxRuntime.ortApiHandle, this.nativeHandle, str, j10);
        }

        public void addCoreML() {
            addCoreML(EnumSet.noneOf(CoreMLFlags.class));
        }

        public void addNnapi() {
            addNnapi(EnumSet.noneOf(NNAPIFlags.class));
        }

        public void addCoreML(Map<String, String> map) {
            addExecutionProvider("CoreML", map);
        }

        public void addROCM() {
            addROCM(0);
        }

        public void addCUDA() {
            addCUDA(0);
        }

        public void addTensorrt(int i10) {
            checkClosed();
            if (OnnxRuntime.extractTensorRT()) {
                addTensorrt(OnnxRuntime.ortApiHandle, this.nativeHandle, i10);
                return;
            }
            throw new OrtException(OrtException.OrtErrorCode.ORT_EP_FAIL, "Failed to find TensorRT shared provider");
        }

        public void addCUDA(int i10) {
            checkClosed();
            if (OnnxRuntime.extractCUDA()) {
                addCUDA(OnnxRuntime.ortApiHandle, this.nativeHandle, i10);
                return;
            }
            throw new OrtException(OrtException.OrtErrorCode.ORT_EP_FAIL, "Failed to find CUDA shared provider");
        }

        private void addExecutionProvider(String str, Map<String, String> map) {
            checkClosed();
            String[][] unpackMap = OrtUtil.unpackMap(map);
            addExecutionProvider(OnnxRuntime.ortApiHandle, this.nativeHandle, str, unpackMap[0], unpackMap[1]);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class Result implements AutoCloseable, Iterable<Map.Entry<String, OnnxValue>> {
        private static final Logger logger = Logger.getLogger(Result.class.getName());
        private boolean closed;
        private final List<OnnxValue> list;
        private final Map<String, OnnxValue> map;
        private final boolean[] ownedByResult;

        public Result(String[] strArr, OnnxValue[] onnxValueArr, boolean[] zArr) {
            if (strArr.length == onnxValueArr.length && strArr.length == zArr.length) {
                this.map = new LinkedHashMap(OrtUtil.capacityFromSize(strArr.length));
                this.list = new ArrayList(Arrays.asList(onnxValueArr));
                this.ownedByResult = zArr;
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    this.map.put(strArr[i10], onnxValueArr[i10]);
                }
                this.closed = false;
                return;
            }
            throw new IllegalArgumentException("Expected same number of names, values and ownedByResult, found names.length = " + strArr.length + ", values.length = " + onnxValueArr.length + ", ownedByResult.length = " + zArr.length);
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            if (!this.closed) {
                this.closed = true;
                for (int i10 = 0; i10 < this.list.size(); i10++) {
                    if (this.ownedByResult[i10]) {
                        this.list.get(i10).close();
                    }
                }
                return;
            }
            logger.warning("Closing an already closed Result");
        }

        public Optional<OnnxValue> get(String str) {
            if (!this.closed) {
                OnnxValue onnxValue = this.map.get(str);
                if (onnxValue != null) {
                    return Optional.of(onnxValue);
                }
                return Optional.empty();
            }
            i.l("Result is closed");
            return null;
        }

        public boolean isResultOwner(int i10) {
            if (!this.closed) {
                return this.ownedByResult[i10];
            }
            i.l("Result is closed");
            return false;
        }

        @Override // java.lang.Iterable
        public Iterator<Map.Entry<String, OnnxValue>> iterator() {
            if (!this.closed) {
                return this.map.entrySet().iterator();
            }
            i.l("Result is closed");
            return null;
        }

        public int size() {
            return this.map.size();
        }

        public OnnxValue get(int i10) {
            if (!this.closed) {
                return this.list.get(i10);
            }
            i.l("Result is closed");
            return null;
        }
    }

    public OrtSession(OrtEnvironment ortEnvironment, byte[] bArr, OrtAllocator ortAllocator, SessionOptions sessionOptions) {
        this(createSession(OnnxRuntime.ortApiHandle, ortEnvironment.getNativeHandle(), bArr, sessionOptions.getNativeHandle()), ortAllocator);
    }

    public OrtSession(OrtEnvironment ortEnvironment, ByteBuffer byteBuffer, OrtAllocator ortAllocator, SessionOptions sessionOptions) {
        this(createSession(OnnxRuntime.ortApiHandle, ortEnvironment.getNativeHandle(), byteBuffer, byteBuffer.position(), byteBuffer.remaining(), sessionOptions.getNativeHandle()), ortAllocator);
    }

    public OrtSession(OrtEnvironment ortEnvironment, String str, OrtAllocator ortAllocator, SessionOptions sessionOptions) {
        this(createSession(OnnxRuntime.ortApiHandle, ortEnvironment.getNativeHandle(), str, sessionOptions.getNativeHandle()), ortAllocator);
    }

    public Result run(Map<String, ? extends OnnxTensorLike> map) {
        return run(map, this.outputNames);
    }

    public Result run(Map<String, ? extends OnnxTensorLike> map, RunOptions runOptions) {
        return run(map, this.outputNames, runOptions);
    }

    public Result run(Map<String, ? extends OnnxTensorLike> map, Set<String> set) {
        return run(map, set, Collections.EMPTY_MAP, null);
    }

    public Result run(Map<String, ? extends OnnxTensorLike> map, Set<String> set, RunOptions runOptions) {
        return run(map, set, Collections.EMPTY_MAP, runOptions);
    }

    public Result run(Map<String, ? extends OnnxTensorLike> map, Map<String, ? extends OnnxValue> map2) {
        return run(map, Collections.EMPTY_SET, map2, null);
    }

    public Result run(Map<String, ? extends OnnxTensorLike> map, Set<String> set, Map<String, ? extends OnnxValue> map2) {
        return run(map, set, map2, null);
    }
}
