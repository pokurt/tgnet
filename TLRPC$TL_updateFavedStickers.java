package org.telegram.tgnet;

public class TLRPC$TL_updateFavedStickers extends TLRPC$Update {
    public static int constructor = -451831443;

    @Override // org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
