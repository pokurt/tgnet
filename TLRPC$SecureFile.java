package org.telegram.tgnet;

public abstract class TLRPC$SecureFile extends TLObject {
    public static TLRPC$SecureFile TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$SecureFile tLRPC$SecureFile;
        if (i != -534283678) {
            tLRPC$SecureFile = i != 1679398724 ? null : new TLRPC$TL_secureFileEmpty();
        } else {
            tLRPC$SecureFile = new TLRPC$TL_secureFile();
        }
        if (tLRPC$SecureFile != null || !z) {
            if (tLRPC$SecureFile != null) {
                tLRPC$SecureFile.readParams(abstractSerializedData, z);
            }
            return tLRPC$SecureFile;
        }
        throw new RuntimeException(String.format("can't parse magic %x in SecureFile", Integer.valueOf(i)));
    }
}
