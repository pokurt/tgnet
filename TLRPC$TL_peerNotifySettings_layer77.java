package org.telegram.tgnet;

public class TLRPC$TL_peerNotifySettings_layer77 extends TLRPC$TL_peerNotifySettings {
    public static int constructor = -1697798976;

    @Override // org.telegram.tgnet.TLRPC$TL_peerNotifySettings, org.telegram.tgnet.TLObject
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        boolean z2 = false;
        this.show_previews = (readInt32 & 1) != 0;
        if ((readInt32 & 2) != 0) {
            z2 = true;
        }
        this.silent = z2;
        this.mute_until = abstractSerializedData.readInt32(z);
        this.sound = abstractSerializedData.readString(z);
    }

    @Override // org.telegram.tgnet.TLRPC$TL_peerNotifySettings, org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.show_previews ? this.flags | 1 : this.flags & -2;
        this.flags = i;
        int i2 = this.silent ? i | 2 : i & -3;
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeInt32(this.mute_until);
        abstractSerializedData.writeString(this.sound);
    }
}
