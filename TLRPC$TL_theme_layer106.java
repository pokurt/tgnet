package org.telegram.tgnet;

public class TLRPC$TL_theme_layer106 extends TLRPC$TL_theme {
    public static int constructor = -136770336;

    @Override // org.telegram.tgnet.TLRPC$TL_theme, org.telegram.tgnet.TLObject
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        boolean z2 = false;
        this.creator = (readInt32 & 1) != 0;
        if ((readInt32 & 2) != 0) {
            z2 = true;
        }
        this.isDefault = z2;
        this.id = abstractSerializedData.readInt64(z);
        this.access_hash = abstractSerializedData.readInt64(z);
        this.slug = abstractSerializedData.readString(z);
        this.title = abstractSerializedData.readString(z);
        if ((this.flags & 4) != 0) {
            this.document = TLRPC$Document.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        this.installs_count = abstractSerializedData.readInt32(z);
    }

    @Override // org.telegram.tgnet.TLRPC$TL_theme, org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.creator ? this.flags | 1 : this.flags & -2;
        this.flags = i;
        int i2 = this.isDefault ? i | 2 : i & -3;
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeInt64(this.id);
        abstractSerializedData.writeInt64(this.access_hash);
        abstractSerializedData.writeString(this.slug);
        abstractSerializedData.writeString(this.title);
        if ((this.flags & 4) != 0) {
            this.document.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.installs_count);
    }
}
