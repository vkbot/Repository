package com.sun.jna;

import ai.onnxruntime.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.ByteCompanionObject;
import n0.b;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
class ELFAnalyser {
    private static final int EF_ARM_ABI_FLOAT_HARD = 1024;
    private static final int EF_ARM_ABI_FLOAT_SOFT = 512;
    private static final int EI_CLASS_64BIT = 2;
    private static final int EI_DATA_BIG_ENDIAN = 2;
    private static final byte[] ELF_MAGIC = {ByteCompanionObject.MAX_VALUE, 69, 76, 70};
    private static final int E_MACHINE_ARM = 40;
    private final String filename;
    private boolean ELF = false;
    private boolean _64Bit = false;
    private boolean bigEndian = false;
    private boolean armHardFloatFlag = false;
    private boolean armSoftFloatFlag = false;
    private boolean armEabiAapcsVfp = false;
    private boolean arm = false;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* renamed from: com.sun.jna.ELFAnalyser$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$sun$jna$ELFAnalyser$ArmAeabiAttributesTag$ParameterType;

        static {
            int[] iArr = new int[ArmAeabiAttributesTag.ParameterType.values().length];
            $SwitchMap$com$sun$jna$ELFAnalyser$ArmAeabiAttributesTag$ParameterType = iArr;
            try {
                iArr[ArmAeabiAttributesTag.ParameterType.UINT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$sun$jna$ELFAnalyser$ArmAeabiAttributesTag$ParameterType[ArmAeabiAttributesTag.ParameterType.NTBS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$sun$jna$ELFAnalyser$ArmAeabiAttributesTag$ParameterType[ArmAeabiAttributesTag.ParameterType.ULEB128.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class ELFSectionHeaderEntry {
        private final int flags;
        private String name;
        private final int nameOffset;
        private final int offset;
        private final int size;
        private final int type;

        public ELFSectionHeaderEntry(boolean z9, ByteBuffer byteBuffer) {
            long j10;
            long j11;
            long j12;
            this.nameOffset = byteBuffer.getInt(0);
            this.type = byteBuffer.getInt(4);
            if (z9) {
                j10 = byteBuffer.getLong(8);
            } else {
                j10 = byteBuffer.getInt(8);
            }
            this.flags = (int) j10;
            if (z9) {
                j11 = byteBuffer.getLong(24);
            } else {
                j11 = byteBuffer.getInt(16);
            }
            this.offset = (int) j11;
            if (z9) {
                j12 = byteBuffer.getLong(32);
            } else {
                j12 = byteBuffer.getInt(20);
            }
            this.size = (int) j12;
        }

        public int getFlags() {
            return this.flags;
        }

        public String getName() {
            return this.name;
        }

        public int getNameOffset() {
            return this.nameOffset;
        }

        public int getOffset() {
            return this.offset;
        }

        public int getSize() {
            return this.size;
        }

        public int getType() {
            return this.type;
        }

        public void setName(String str) {
            this.name = str;
        }

        public String toString() {
            return "ELFSectionHeaderEntry{nameIdx=" + this.nameOffset + ", name=" + this.name + ", type=" + this.type + ", flags=" + this.flags + ", offset=" + this.offset + ", size=" + this.size + '}';
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class ELFSectionHeaders {
        private final List<ELFSectionHeaderEntry> entries = new ArrayList();

        public ELFSectionHeaders(boolean z9, boolean z10, ByteBuffer byteBuffer, RandomAccessFile randomAccessFile) {
            long j10;
            short s5;
            short s9;
            short s10;
            ByteOrder byteOrder;
            ByteOrder byteOrder2;
            byte b10;
            if (z9) {
                j10 = byteBuffer.getLong(40);
                s5 = byteBuffer.getShort(58);
                s9 = byteBuffer.getShort(60);
                s10 = byteBuffer.getShort(62);
            } else {
                j10 = byteBuffer.getInt(32);
                s5 = byteBuffer.getShort(46);
                s9 = byteBuffer.getShort(48);
                s10 = byteBuffer.getShort(50);
            }
            ByteBuffer allocate = ByteBuffer.allocate(s9 * s5);
            if (z10) {
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            allocate.order(byteOrder);
            randomAccessFile.getChannel().read(allocate, j10);
            for (int i10 = 0; i10 < s9; i10++) {
                allocate.position(i10 * s5);
                ByteBuffer slice = allocate.slice();
                slice.order(allocate.order());
                slice.limit(s5);
                this.entries.add(new ELFSectionHeaderEntry(z9, slice));
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(this.entries.get(s10).getSize());
            if (z10) {
                byteOrder2 = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            }
            allocate2.order(byteOrder2);
            randomAccessFile.getChannel().read(allocate2, r8.getOffset());
            allocate2.rewind();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(20);
            for (ELFSectionHeaderEntry eLFSectionHeaderEntry : this.entries) {
                byteArrayOutputStream.reset();
                allocate2.position(eLFSectionHeaderEntry.getNameOffset());
                while (allocate2.position() < allocate2.limit() && (b10 = allocate2.get()) != 0) {
                    byteArrayOutputStream.write(b10);
                }
                eLFSectionHeaderEntry.setName(byteArrayOutputStream.toString("ASCII"));
            }
        }

        public List<ELFSectionHeaderEntry> getEntries() {
            return this.entries;
        }
    }

    private ELFAnalyser(String str) {
        this.filename = str;
    }

    public static ELFAnalyser analyse(String str) {
        ELFAnalyser eLFAnalyser = new ELFAnalyser(str);
        eLFAnalyser.runDetection();
        return eLFAnalyser;
    }

    private static Map<Integer, Map<ArmAeabiAttributesTag, Object>> parseAEABI(ByteBuffer byteBuffer) {
        HashMap hashMap = new HashMap();
        while (byteBuffer.position() < byteBuffer.limit()) {
            int position = byteBuffer.position();
            int intValue = readULEB128(byteBuffer).intValue();
            int i10 = byteBuffer.getInt();
            if (intValue == 1) {
                hashMap.put(Integer.valueOf(intValue), parseFileAttribute(byteBuffer));
            }
            byteBuffer.position(position + i10);
        }
        return hashMap;
    }

    private static Map<Integer, Map<ArmAeabiAttributesTag, Object>> parseArmAttributes(ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 65) {
            return Collections.EMPTY_MAP;
        }
        while (byteBuffer.position() < byteBuffer.limit()) {
            int position = byteBuffer.position();
            int i10 = byteBuffer.getInt();
            if (i10 <= 0) {
                break;
            }
            if ("aeabi".equals(readNTBS(byteBuffer, null))) {
                return parseAEABI(byteBuffer);
            }
            byteBuffer.position(position + i10);
        }
        return Collections.EMPTY_MAP;
    }

    private void parseEabiAapcsVfp(ByteBuffer byteBuffer, RandomAccessFile randomAccessFile) {
        ByteOrder byteOrder;
        for (ELFSectionHeaderEntry eLFSectionHeaderEntry : new ELFSectionHeaders(this._64Bit, this.bigEndian, byteBuffer, randomAccessFile).getEntries()) {
            if (".ARM.attributes".equals(eLFSectionHeaderEntry.getName())) {
                ByteBuffer allocate = ByteBuffer.allocate(eLFSectionHeaderEntry.getSize());
                if (this.bigEndian) {
                    byteOrder = ByteOrder.BIG_ENDIAN;
                } else {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                }
                allocate.order(byteOrder);
                randomAccessFile.getChannel().read(allocate, eLFSectionHeaderEntry.getOffset());
                allocate.rewind();
                Map<ArmAeabiAttributesTag, Object> map = parseArmAttributes(allocate).get(1);
                if (map != null) {
                    Object obj = map.get(ArmAeabiAttributesTag.ABI_VFP_args);
                    if ((obj instanceof Integer) && ((Integer) obj).equals(1)) {
                        this.armEabiAapcsVfp = true;
                    } else if ((obj instanceof BigInteger) && ((BigInteger) obj).intValue() == 1) {
                        this.armEabiAapcsVfp = true;
                    }
                }
            }
        }
    }

    private static Map<ArmAeabiAttributesTag, Object> parseFileAttribute(ByteBuffer byteBuffer) {
        HashMap hashMap = new HashMap();
        while (byteBuffer.position() < byteBuffer.limit()) {
            ArmAeabiAttributesTag byValue = ArmAeabiAttributesTag.getByValue(readULEB128(byteBuffer).intValue());
            int i10 = AnonymousClass1.$SwitchMap$com$sun$jna$ELFAnalyser$ArmAeabiAttributesTag$ParameterType[byValue.getParameterType().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        hashMap.put(byValue, readULEB128(byteBuffer));
                    }
                } else {
                    hashMap.put(byValue, readNTBS(byteBuffer, null));
                }
            } else {
                hashMap.put(byValue, Integer.valueOf(byteBuffer.getInt()));
            }
        }
        return hashMap;
    }

    private static String readNTBS(ByteBuffer byteBuffer, Integer num) {
        if (num != null) {
            byteBuffer.position(num.intValue());
        }
        int position = byteBuffer.position();
        while (byteBuffer.get() != 0 && byteBuffer.position() <= byteBuffer.limit()) {
        }
        byte[] bArr = new byte[(byteBuffer.position() - position) - 1];
        byteBuffer.position(position);
        byteBuffer.get(bArr);
        byteBuffer.position(byteBuffer.position() + 1);
        try {
            return new String(bArr, "ASCII");
        } catch (UnsupportedEncodingException e) {
            b.w(e);
            return null;
        }
    }

    private static BigInteger readULEB128(ByteBuffer byteBuffer) {
        BigInteger bigInteger = BigInteger.ZERO;
        int i10 = 0;
        while (true) {
            byte b10 = byteBuffer.get();
            bigInteger = bigInteger.or(BigInteger.valueOf(b10 & ByteCompanionObject.MAX_VALUE).shiftLeft(i10));
            if ((b10 & ByteCompanionObject.MIN_VALUE) == 0) {
                return bigInteger;
            }
            i10 += 7;
        }
    }

    private void runDetection() {
        boolean z9;
        boolean z10;
        int i10;
        ByteOrder byteOrder;
        boolean z11;
        int i11;
        boolean z12;
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.filename, "r");
        try {
            boolean z13 = true;
            if (randomAccessFile.length() > 4) {
                byte[] bArr = new byte[4];
                randomAccessFile.seek(0L);
                randomAccessFile.read(bArr);
                if (Arrays.equals(bArr, ELF_MAGIC)) {
                    this.ELF = true;
                }
            }
            if (!this.ELF) {
                try {
                    randomAccessFile.close();
                    return;
                } catch (IOException unused) {
                    return;
                }
            }
            randomAccessFile.seek(4L);
            byte readByte = randomAccessFile.readByte();
            byte readByte2 = randomAccessFile.readByte();
            if (readByte == 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            this._64Bit = z9;
            if (readByte2 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.bigEndian = z10;
            randomAccessFile.seek(0L);
            if (this._64Bit) {
                i10 = 64;
            } else {
                i10 = 52;
            }
            ByteBuffer allocate = ByteBuffer.allocate(i10);
            randomAccessFile.getChannel().read(allocate, 0L);
            if (this.bigEndian) {
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            allocate.order(byteOrder);
            if (allocate.get(18) == 40) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.arm = z11;
            if (z11) {
                if (this._64Bit) {
                    i11 = 48;
                } else {
                    i11 = 36;
                }
                int i12 = allocate.getInt(i11);
                if ((i12 & 1024) == 1024) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.armHardFloatFlag = z12;
                if ((i12 & 512) != 512) {
                    z13 = false;
                }
                this.armSoftFloatFlag = z13;
                parseEabiAapcsVfp(allocate, randomAccessFile);
            }
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }

    public String getFilename() {
        return this.filename;
    }

    public boolean is64Bit() {
        return this._64Bit;
    }

    public boolean isArm() {
        return this.arm;
    }

    public boolean isArmEabiAapcsVfp() {
        return this.armEabiAapcsVfp;
    }

    public boolean isArmHardFloat() {
        if (!isArmEabiAapcsVfp() && !isArmHardFloatFlag()) {
            return false;
        }
        return true;
    }

    public boolean isArmHardFloatFlag() {
        return this.armHardFloatFlag;
    }

    public boolean isArmSoftFloatFlag() {
        return this.armSoftFloatFlag;
    }

    public boolean isBigEndian() {
        return this.bigEndian;
    }

    public boolean isELF() {
        return this.ELF;
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class ArmAeabiAttributesTag {
        public static final ArmAeabiAttributesTag ABI_FP_16bit_format;
        public static final ArmAeabiAttributesTag ABI_FP_denormal;
        public static final ArmAeabiAttributesTag ABI_FP_exceptions;
        public static final ArmAeabiAttributesTag ABI_FP_number_model;
        public static final ArmAeabiAttributesTag ABI_FP_optimization_goals;
        public static final ArmAeabiAttributesTag ABI_FP_rounding;
        public static final ArmAeabiAttributesTag ABI_FP_user_exceptions;
        public static final ArmAeabiAttributesTag ABI_HardFP_use;
        public static final ArmAeabiAttributesTag ABI_PCS_GOT_use;
        public static final ArmAeabiAttributesTag ABI_PCS_R9_use;
        public static final ArmAeabiAttributesTag ABI_PCS_RO_data;
        public static final ArmAeabiAttributesTag ABI_PCS_RW_data;
        public static final ArmAeabiAttributesTag ABI_PCS_wchar_t;
        public static final ArmAeabiAttributesTag ABI_VFP_args;
        public static final ArmAeabiAttributesTag ABI_WMMX_args;
        public static final ArmAeabiAttributesTag ABI_align8_preserved;
        public static final ArmAeabiAttributesTag ABI_align_needed;
        public static final ArmAeabiAttributesTag ABI_enum_size;
        public static final ArmAeabiAttributesTag ABI_optimization_goals;
        public static final ArmAeabiAttributesTag ARM_ISA_use;
        public static final ArmAeabiAttributesTag Advanced_SIMD_arch;
        public static final ArmAeabiAttributesTag CPU_arch;
        public static final ArmAeabiAttributesTag CPU_arch_profile;
        public static final ArmAeabiAttributesTag CPU_name;
        public static final ArmAeabiAttributesTag CPU_raw_name;
        public static final ArmAeabiAttributesTag CPU_unaligned_access;
        public static final ArmAeabiAttributesTag DIV_use;
        public static final ArmAeabiAttributesTag FP_HP_extension;
        public static final ArmAeabiAttributesTag FP_arch;
        public static final ArmAeabiAttributesTag File;
        public static final ArmAeabiAttributesTag MPextension_use;
        public static final ArmAeabiAttributesTag MPextension_use2;
        public static final ArmAeabiAttributesTag PCS_config;
        public static final ArmAeabiAttributesTag Section;
        public static final ArmAeabiAttributesTag Symbol;
        public static final ArmAeabiAttributesTag T2EE_use;
        public static final ArmAeabiAttributesTag THUMB_ISA_use;
        public static final ArmAeabiAttributesTag Virtualization_use;
        public static final ArmAeabiAttributesTag WMMX_arch;
        public static final ArmAeabiAttributesTag also_compatible_with;
        public static final ArmAeabiAttributesTag compatibility;
        public static final ArmAeabiAttributesTag conformance;
        public static final ArmAeabiAttributesTag nodefaults;
        private final String name;
        private final ParameterType parameterType;
        private final int value;
        private static final List<ArmAeabiAttributesTag> tags = new LinkedList();
        private static final Map<Integer, ArmAeabiAttributesTag> valueMap = new HashMap();
        private static final Map<String, ArmAeabiAttributesTag> nameMap = new HashMap();

        /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
        /* loaded from: classes.dex */
        public enum ParameterType {
            UINT32,
            NTBS,
            ULEB128
        }

        static {
            ParameterType parameterType = ParameterType.UINT32;
            File = addTag(1, "File", parameterType);
            Section = addTag(2, "Section", parameterType);
            Symbol = addTag(3, "Symbol", parameterType);
            ParameterType parameterType2 = ParameterType.NTBS;
            CPU_raw_name = addTag(4, "CPU_raw_name", parameterType2);
            CPU_name = addTag(5, "CPU_name", parameterType2);
            ParameterType parameterType3 = ParameterType.ULEB128;
            CPU_arch = addTag(6, "CPU_arch", parameterType3);
            CPU_arch_profile = addTag(7, "CPU_arch_profile", parameterType3);
            ARM_ISA_use = addTag(8, "ARM_ISA_use", parameterType3);
            THUMB_ISA_use = addTag(9, "THUMB_ISA_use", parameterType3);
            FP_arch = addTag(10, "FP_arch", parameterType3);
            WMMX_arch = addTag(11, "WMMX_arch", parameterType3);
            Advanced_SIMD_arch = addTag(12, "Advanced_SIMD_arch", parameterType3);
            PCS_config = addTag(13, "PCS_config", parameterType3);
            ABI_PCS_R9_use = addTag(14, "ABI_PCS_R9_use", parameterType3);
            ABI_PCS_RW_data = addTag(15, "ABI_PCS_RW_data", parameterType3);
            ABI_PCS_RO_data = addTag(16, "ABI_PCS_RO_data", parameterType3);
            ABI_PCS_GOT_use = addTag(17, "ABI_PCS_GOT_use", parameterType3);
            ABI_PCS_wchar_t = addTag(18, "ABI_PCS_wchar_t", parameterType3);
            ABI_FP_rounding = addTag(19, "ABI_FP_rounding", parameterType3);
            ABI_FP_denormal = addTag(20, "ABI_FP_denormal", parameterType3);
            ABI_FP_exceptions = addTag(21, "ABI_FP_exceptions", parameterType3);
            ABI_FP_user_exceptions = addTag(22, "ABI_FP_user_exceptions", parameterType3);
            ABI_FP_number_model = addTag(23, "ABI_FP_number_model", parameterType3);
            ABI_align_needed = addTag(24, "ABI_align_needed", parameterType3);
            ABI_align8_preserved = addTag(25, "ABI_align8_preserved", parameterType3);
            ABI_enum_size = addTag(26, "ABI_enum_size", parameterType3);
            ABI_HardFP_use = addTag(27, "ABI_HardFP_use", parameterType3);
            ABI_VFP_args = addTag(28, "ABI_VFP_args", parameterType3);
            ABI_WMMX_args = addTag(29, "ABI_WMMX_args", parameterType3);
            ABI_optimization_goals = addTag(30, "ABI_optimization_goals", parameterType3);
            ABI_FP_optimization_goals = addTag(31, "ABI_FP_optimization_goals", parameterType3);
            compatibility = addTag(32, "compatibility", parameterType2);
            CPU_unaligned_access = addTag(34, "CPU_unaligned_access", parameterType3);
            FP_HP_extension = addTag(36, "FP_HP_extension", parameterType3);
            ABI_FP_16bit_format = addTag(38, "ABI_FP_16bit_format", parameterType3);
            MPextension_use = addTag(42, "MPextension_use", parameterType3);
            DIV_use = addTag(44, "DIV_use", parameterType3);
            nodefaults = addTag(64, "nodefaults", parameterType3);
            also_compatible_with = addTag(65, "also_compatible_with", parameterType2);
            conformance = addTag(67, "conformance", parameterType2);
            T2EE_use = addTag(66, "T2EE_use", parameterType3);
            Virtualization_use = addTag(68, "Virtualization_use", parameterType3);
            MPextension_use2 = addTag(70, "MPextension_use", parameterType3);
        }

        public ArmAeabiAttributesTag(int i10, String str, ParameterType parameterType) {
            this.value = i10;
            this.name = str;
            this.parameterType = parameterType;
        }

        private static ArmAeabiAttributesTag addTag(int i10, String str, ParameterType parameterType) {
            ArmAeabiAttributesTag armAeabiAttributesTag = new ArmAeabiAttributesTag(i10, str, parameterType);
            Map<Integer, ArmAeabiAttributesTag> map = valueMap;
            if (!map.containsKey(Integer.valueOf(armAeabiAttributesTag.getValue()))) {
                map.put(Integer.valueOf(armAeabiAttributesTag.getValue()), armAeabiAttributesTag);
            }
            Map<String, ArmAeabiAttributesTag> map2 = nameMap;
            if (!map2.containsKey(armAeabiAttributesTag.getName())) {
                map2.put(armAeabiAttributesTag.getName(), armAeabiAttributesTag);
            }
            tags.add(armAeabiAttributesTag);
            return armAeabiAttributesTag;
        }

        public static ArmAeabiAttributesTag getByName(String str) {
            return nameMap.get(str);
        }

        public static ArmAeabiAttributesTag getByValue(int i10) {
            Map<Integer, ArmAeabiAttributesTag> map = valueMap;
            if (map.containsKey(Integer.valueOf(i10))) {
                return map.get(Integer.valueOf(i10));
            }
            return new ArmAeabiAttributesTag(i10, a.e(i10, "Unknown "), getParameterType(i10));
        }

        private static ParameterType getParameterType(int i10) {
            ArmAeabiAttributesTag byValue = getByValue(i10);
            if (byValue == null) {
                if (i10 % 2 == 0) {
                    return ParameterType.ULEB128;
                }
                return ParameterType.NTBS;
            }
            return byValue.getParameterType();
        }

        public static List<ArmAeabiAttributesTag> getTags() {
            return Collections.unmodifiableList(tags);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass() && this.value == ((ArmAeabiAttributesTag) obj).value) {
                return true;
            }
            return false;
        }

        public String getName() {
            return this.name;
        }

        public int getValue() {
            return this.value;
        }

        public int hashCode() {
            return 469 + this.value;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.name);
            sb.append(" (");
            return a.o(sb, ")", this.value);
        }

        public ParameterType getParameterType() {
            return this.parameterType;
        }
    }
}
