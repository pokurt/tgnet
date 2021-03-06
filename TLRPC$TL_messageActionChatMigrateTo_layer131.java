package org.telegram.tgnet;

public class TLRPC$TL_messageActionChatMigrateTo_layer131 extends TLRPC$TL_messageActionChatMigrateTo {
    public static int constructor = 1371385889;

    @Override // org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_messageActionChatMigrateTo
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.channel_id = (long) abstractSerializedData.readInt32(z);
    }

    @Override // org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_messageActionChatMigrateTo
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32((int) this.channel_id);
    }
}
