package org.telegram.tgnet;

public class TLRPC$TL_encryptedFile extends TLRPC$EncryptedFile {
    public static int constructor = 1248893260;

    @Override // org.telegram.tgnet.TLObject
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = abstractSerializedData.readInt64(z);
        this.access_hash = abstractSerializedData.readInt64(z);
        this.size = abstractSerializedData.readInt32(z);
        this.dc_id = abstractSerializedData.readInt32(z);
        this.key_fingerprint = abstractSerializedData.readInt32(z);
    }

    @Override // org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.id);
        abstractSerializedData.writeInt64(this.access_hash);
        abstractSerializedData.writeInt32(this.size);
        abstractSerializedData.writeInt32(this.dc_id);
        abstractSerializedData.writeInt32(this.key_fingerprint);
    }
}
