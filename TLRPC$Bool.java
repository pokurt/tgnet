package org.telegram.tgnet;

public abstract class TLRPC$Bool extends TLObject {
    public static TLRPC$Bool TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$Bool tLRPC$Bool;
        if (i != -1720552011) {
            tLRPC$Bool = i != -1132882121 ? null : new TLRPC$TL_boolFalse();
        } else {
            tLRPC$Bool = new TLRPC$TL_boolTrue();
        }
        if (tLRPC$Bool != null || !z) {
            if (tLRPC$Bool != null) {
                tLRPC$Bool.readParams(abstractSerializedData, z);
            }
            return tLRPC$Bool;
        }
        throw new RuntimeException(String.format("can't parse magic %x in Bool", Integer.valueOf(i)));
    }
}
