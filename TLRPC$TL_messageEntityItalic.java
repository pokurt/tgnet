package org.telegram.tgnet;

public class TLRPC$TL_messageEntityItalic extends TLRPC$MessageEntity {
    public static int constructor = -2106619040;

    @Override // org.telegram.tgnet.TLObject
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.offset = abstractSerializedData.readInt32(z);
        this.length = abstractSerializedData.readInt32(z);
    }

    @Override // org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.offset);
        abstractSerializedData.writeInt32(this.length);
    }
}
