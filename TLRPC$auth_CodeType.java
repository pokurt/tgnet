package org.telegram.tgnet;

public abstract class TLRPC$auth_CodeType extends TLObject {
    public static TLRPC$auth_CodeType TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$auth_CodeType tLRPC$auth_CodeType;
        if (i == 577556219) {
            tLRPC$auth_CodeType = new TLRPC$TL_auth_codeTypeFlashCall();
        } else if (i != 1923290508) {
            tLRPC$auth_CodeType = i != 1948046307 ? null : new TLRPC$TL_auth_codeTypeCall();
        } else {
            tLRPC$auth_CodeType = new TLRPC$TL_auth_codeTypeSms();
        }
        if (tLRPC$auth_CodeType != null || !z) {
            if (tLRPC$auth_CodeType != null) {
                tLRPC$auth_CodeType.readParams(abstractSerializedData, z);
            }
            return tLRPC$auth_CodeType;
        }
        throw new RuntimeException(String.format("can't parse magic %x in auth_CodeType", Integer.valueOf(i)));
    }
}
