package org.apache.commons.net.util;

import j1.i;
import java.math.BigInteger;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class SubnetUtils6 {
    private static final BigInteger MAX_VALUE;
    private static final int NBITS = 128;
    private static final String PARSE_FAIL = "Could not parse [%s]";
    private static final BigInteger TWO;
    private final BigInteger address;
    private final BigInteger high;
    private final BigInteger network;
    private final int prefixLength;

    static {
        BigInteger valueOf = BigInteger.valueOf(2L);
        TWO = valueOf;
        MAX_VALUE = valueOf.pow(128).subtract(BigInteger.ONE);
    }

    public SubnetUtils6(String str) {
        BigInteger and;
        if (str != null) {
            int indexOf = str.indexOf(47);
            if (indexOf >= 0) {
                String substring = str.substring(0, indexOf);
                try {
                    int parseInt = Integer.parseInt(str.substring(indexOf + 1));
                    this.prefixLength = parseInt;
                    if (parseInt >= 0 && parseInt <= 128) {
                        BigInteger bigInteger = new BigInteger(1, toBytes(substring));
                        this.address = bigInteger;
                        if (parseInt == 0) {
                            and = BigInteger.ZERO;
                        } else {
                            BigInteger bigInteger2 = MAX_VALUE;
                            and = bigInteger2.shiftLeft(128 - parseInt).and(bigInteger2);
                        }
                        BigInteger and2 = bigInteger.and(and);
                        this.network = and2;
                        this.high = and2.or(MAX_VALUE.xor(and));
                        return;
                    }
                    i.k(("Could not parse [" + str + "]").concat(" - prefix length must be between 0 and 128"));
                    throw null;
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException(("Could not parse [" + str + "]").concat(" - invalid prefix length"), e);
                }
            }
            i.k(("Could not parse [" + str + "]").concat(" - missing prefix length"));
            throw null;
        }
        i.k("Could not parse [null] - null input");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String format(BigInteger bigInteger) {
        try {
            return InetAddress.getByAddress(toByteArray16(bigInteger)).getHostAddress();
        } catch (UnknownHostException e) {
            throw new IllegalStateException("Unexpected error formatting IPv6 address", e);
        }
    }

    private static byte[] toByteArray16(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == 16) {
            return byteArray;
        }
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            System.arraycopy(byteArray, byteArray.length - 16, bArr, 0, 16);
            return bArr;
        }
        System.arraycopy(byteArray, 0, bArr, 16 - byteArray.length, byteArray.length);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] toBytes(String str) {
        try {
            InetAddress byName = InetAddress.getByName(str);
            if (byName instanceof Inet6Address) {
                return byName.getAddress();
            }
            throw new IllegalArgumentException(("Could not parse [" + str + "]").concat(" - not an IPv6 address"));
        } catch (UnknownHostException e) {
            throw new IllegalArgumentException(ai.onnxruntime.a.m("Could not parse [", str, "]"), e);
        }
    }

    public SubnetInfo getInfo() {
        return new SubnetInfo();
    }

    public String toString() {
        return getInfo().toString();
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public final class SubnetInfo {
        private SubnetInfo() {
        }

        public String getAddress() {
            return SubnetUtils6.format(SubnetUtils6.this.address);
        }

        public BigInteger getAddressCount() {
            return SubnetUtils6.TWO.pow(128 - SubnetUtils6.this.prefixLength);
        }

        public String getCidrSignature() {
            return SubnetUtils6.format(SubnetUtils6.this.address) + "/" + SubnetUtils6.this.prefixLength;
        }

        public String getHighAddress() {
            return SubnetUtils6.format(SubnetUtils6.this.high);
        }

        public String getLowAddress() {
            return SubnetUtils6.format(SubnetUtils6.this.network);
        }

        public String getNetworkAddress() {
            return SubnetUtils6.format(SubnetUtils6.this.network);
        }

        public int getPrefixLength() {
            return SubnetUtils6.this.prefixLength;
        }

        public boolean isInRange(BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.compareTo(SubnetUtils6.this.network) < 0 || bigInteger.compareTo(SubnetUtils6.this.high) > 0) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "CIDR Signature:\t[" + getCidrSignature() + "]\n  Network: [" + getNetworkAddress() + "]\n  First address: [" + getLowAddress() + "]\n  Last address: [" + getHighAddress() + "]\n  Address Count: [" + getAddressCount() + "]\n";
        }

        public boolean isInRange(byte[] bArr) {
            if (bArr == null || bArr.length != 16) {
                return false;
            }
            return isInRange(new BigInteger(1, bArr));
        }

        public boolean isInRange(Inet6Address inet6Address) {
            if (inet6Address == null) {
                return false;
            }
            return isInRange(inet6Address.getAddress());
        }

        public boolean isInRange(String str) {
            return isInRange(SubnetUtils6.toBytes(str));
        }
    }

    public SubnetUtils6(String str, int i10) {
        this(str + "/" + i10);
    }
}
