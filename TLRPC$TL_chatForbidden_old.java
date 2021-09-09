package org.telegram.tgnet;

public class TLRPC$TL_chatForbidden_old extends TLRPC$TL_chatForbidden {
    public static int constructor = -83047359;

    @Override // org.telegram.tgnet.TLRPC$TL_chatForbidden, org.telegram.tgnet.TLObject
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = abstractSerializedData.readInt32(z);
        this.title = abstractSerializedData.readString(z);
        this.date = abstractSerializedData.readInt32(z);
    }

    @Override // org.telegram.tgnet.TLRPC$TL_chatForbidden, org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.id);
        abstractSerializedData.writeString(this.title);
        abstractSerializedData.writeInt32(this.date);
    }
}