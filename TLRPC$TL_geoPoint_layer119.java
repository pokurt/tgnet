package org.telegram.tgnet;

public class TLRPC$TL_geoPoint_layer119 extends TLRPC$TL_geoPoint {
    public static int constructor = 43446532;

    @Override // org.telegram.tgnet.TLRPC$TL_geoPoint, org.telegram.tgnet.TLObject
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this._long = abstractSerializedData.readDouble(z);
        this.lat = abstractSerializedData.readDouble(z);
        this.access_hash = abstractSerializedData.readInt64(z);
    }

    @Override // org.telegram.tgnet.TLRPC$TL_geoPoint, org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeDouble(this._long);
        abstractSerializedData.writeDouble(this.lat);
        abstractSerializedData.writeInt64(this.access_hash);
    }
}
