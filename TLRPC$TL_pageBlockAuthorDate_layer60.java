package org.telegram.tgnet;

public class TLRPC$TL_pageBlockAuthorDate_layer60 extends TLRPC$TL_pageBlockAuthorDate {
    public static int constructor = 1029399794;

    @Override // org.telegram.tgnet.TLRPC$TL_pageBlockAuthorDate, org.telegram.tgnet.TLObject
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        String readString = abstractSerializedData.readString(z);
        TLRPC$TL_textPlain tLRPC$TL_textPlain = new TLRPC$TL_textPlain();
        this.author = tLRPC$TL_textPlain;
        tLRPC$TL_textPlain.text = readString;
        this.published_date = abstractSerializedData.readInt32(z);
    }

    @Override // org.telegram.tgnet.TLRPC$TL_pageBlockAuthorDate, org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(((TLRPC$TL_textPlain) this.author).text);
        abstractSerializedData.writeInt32(this.published_date);
    }
}
