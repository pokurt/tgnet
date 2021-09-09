package org.telegram.tgnet;

public class TLRPC$TL_account_saveTheme extends TLObject {
    public static int constructor = -229175188;
    public TLRPC$InputTheme theme;
    public boolean unsave;

    @Override // org.telegram.tgnet.TLObject
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override // org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.theme.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeBool(this.unsave);
    }
}
