package org.telegram.tgnet;

public class TLRPC$TL_chatParticipant_layer131 extends TLRPC$TL_chatParticipant {
    public static int constructor = -925415106;

    @Override // org.telegram.tgnet.TLRPC$TL_chatParticipant, org.telegram.tgnet.TLObject
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.user_id = (long) abstractSerializedData.readInt32(z);
        this.inviter_id = (long) abstractSerializedData.readInt32(z);
        this.date = abstractSerializedData.readInt32(z);
    }

    @Override // org.telegram.tgnet.TLRPC$TL_chatParticipant, org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32((int) this.user_id);
        abstractSerializedData.writeInt32((int) this.inviter_id);
        abstractSerializedData.writeInt32(this.date);
    }
}
