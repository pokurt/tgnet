package org.telegram.tgnet;

public class TLRPC$TL_messageFwdHeader_layer72 extends TLRPC$TL_messageFwdHeader {
    public static int constructor = -85986132;

    @Override // org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_messageFwdHeader
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        if ((readInt32 & 1) != 0) {
            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
            this.from_id = tLRPC$TL_peerUser;
            tLRPC$TL_peerUser.user_id = (long) abstractSerializedData.readInt32(z);
        }
        this.date = abstractSerializedData.readInt32(z);
        if ((this.flags & 2) != 0) {
            TLRPC$TL_peerChannel tLRPC$TL_peerChannel = new TLRPC$TL_peerChannel();
            this.from_id = tLRPC$TL_peerChannel;
            tLRPC$TL_peerChannel.channel_id = (long) abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 4) != 0) {
            this.channel_post = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 8) != 0) {
            this.post_author = abstractSerializedData.readString(z);
        }
    }

    @Override // org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_messageFwdHeader
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32((int) this.from_id.user_id);
        }
        abstractSerializedData.writeInt32(this.date);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32((int) this.from_id.channel_id);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(this.channel_post);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeString(this.post_author);
        }
    }
}
