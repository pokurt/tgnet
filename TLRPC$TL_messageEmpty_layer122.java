package org.telegram.tgnet;

public class TLRPC$TL_messageEmpty_layer122 extends TLRPC$TL_messageEmpty {
    public static int constructor = -2082087340;

    @Override // org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_messageEmpty
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = abstractSerializedData.readInt32(z);
        this.peer_id = new TLRPC$TL_peerUser();
    }

    @Override // org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_messageEmpty
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.id);
    }
}
