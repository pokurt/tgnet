package org.telegram.tgnet;

public class TLRPC$TL_messages_sentEncryptedFile extends TLRPC$messages_SentEncryptedMessage {
    public static int constructor = -1802240206;

    @Override // org.telegram.tgnet.TLObject
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.date = abstractSerializedData.readInt32(z);
        this.file = TLRPC$EncryptedFile.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override // org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.date);
        this.file.serializeToStream(abstractSerializedData);
    }
}
