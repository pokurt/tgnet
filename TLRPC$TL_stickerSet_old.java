package org.telegram.tgnet;

public class TLRPC$TL_stickerSet_old extends TLRPC$TL_stickerSet {
    public static int constructor = -1482409193;

    @Override // org.telegram.tgnet.TLRPC$TL_stickerSet, org.telegram.tgnet.TLObject
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = abstractSerializedData.readInt64(z);
        this.access_hash = abstractSerializedData.readInt64(z);
        this.title = abstractSerializedData.readString(z);
        this.short_name = abstractSerializedData.readString(z);
    }

    @Override // org.telegram.tgnet.TLRPC$TL_stickerSet, org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.id);
        abstractSerializedData.writeInt64(this.access_hash);
        abstractSerializedData.writeString(this.title);
        abstractSerializedData.writeString(this.short_name);
    }
}
