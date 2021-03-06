package org.telegram.tgnet;

public class TLRPC$TL_chatForbidden_layer131 extends TLRPC$TL_chatForbidden {
    public static int constructor = 120753115;

    @Override // org.telegram.tgnet.TLRPC$TL_chatForbidden, org.telegram.tgnet.TLObject
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = (long) abstractSerializedData.readInt32(z);
        this.title = abstractSerializedData.readString(z);
    }

    @Override // org.telegram.tgnet.TLRPC$TL_chatForbidden, org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32((int) this.id);
        abstractSerializedData.writeString(this.title);
    }
}
