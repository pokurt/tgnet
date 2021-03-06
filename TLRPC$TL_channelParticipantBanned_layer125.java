package org.telegram.tgnet;

public class TLRPC$TL_channelParticipantBanned_layer125 extends TLRPC$TL_channelParticipantBanned {
    public static int constructor = 470789295;

    @Override // org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_channelParticipantBanned
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        boolean z2 = true;
        if ((readInt32 & 1) == 0) {
            z2 = false;
        }
        this.left = z2;
        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
        this.peer = tLRPC$TL_peerUser;
        tLRPC$TL_peerUser.user_id = (long) abstractSerializedData.readInt32(z);
        this.kicked_by = (long) abstractSerializedData.readInt32(z);
        this.date = abstractSerializedData.readInt32(z);
        this.banned_rights = TLRPC$TL_chatBannedRights.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override // org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_channelParticipantBanned
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.left ? this.flags | 1 : this.flags & -2;
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt32((int) this.peer.user_id);
        abstractSerializedData.writeInt32((int) this.kicked_by);
        abstractSerializedData.writeInt32(this.date);
        this.banned_rights.serializeToStream(abstractSerializedData);
    }
}
