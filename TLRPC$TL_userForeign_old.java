package org.telegram.tgnet;

public class TLRPC$TL_userForeign_old extends TLRPC$TL_userForeign_old2 {
    public static int constructor = 1377093789;

    @Override // org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_userForeign_old2
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = (long) abstractSerializedData.readInt32(z);
        this.first_name = abstractSerializedData.readString(z);
        this.last_name = abstractSerializedData.readString(z);
        this.access_hash = abstractSerializedData.readInt64(z);
        this.photo = TLRPC$UserProfilePhoto.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.status = TLRPC$UserStatus.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override // org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_userForeign_old2
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32((int) this.id);
        abstractSerializedData.writeString(this.first_name);
        abstractSerializedData.writeString(this.last_name);
        abstractSerializedData.writeInt64(this.access_hash);
        this.photo.serializeToStream(abstractSerializedData);
        this.status.serializeToStream(abstractSerializedData);
    }
}
