package org.telegram.tgnet;

public class TLRPC$TL_storage_fileGif extends TLRPC$storage_FileType {
    public static int constructor = -891180321;

    @Override // org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
