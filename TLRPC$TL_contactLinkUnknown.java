package org.telegram.tgnet;

public class TLRPC$TL_contactLinkUnknown extends TLRPC$ContactLink_layer101 {
    public static int constructor = 1599050311;

    @Override // org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
