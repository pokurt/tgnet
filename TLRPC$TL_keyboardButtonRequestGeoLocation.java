package org.telegram.tgnet;

public class TLRPC$TL_keyboardButtonRequestGeoLocation extends TLRPC$KeyboardButton {
    public static int constructor = -59151553;

    @Override // org.telegram.tgnet.TLObject
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.text = abstractSerializedData.readString(z);
    }

    @Override // org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.text);
    }
}
