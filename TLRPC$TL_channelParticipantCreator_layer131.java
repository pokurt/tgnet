package org.telegram.tgnet;

public class TLRPC$TL_channelParticipantCreator_layer131 extends TLRPC$TL_channelParticipantCreator {
    public static int constructor = 1149094475;

    @Override // org.telegram.tgnet.TLRPC$TL_channelParticipantCreator, org.telegram.tgnet.TLObject
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
        this.peer = tLRPC$TL_peerUser;
        tLRPC$TL_peerUser.user_id = (long) abstractSerializedData.readInt32(z);
        this.admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 1) != 0) {
            this.rank = abstractSerializedData.readString(z);
        }
    }

    @Override // org.telegram.tgnet.TLRPC$TL_channelParticipantCreator, org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt32((int) this.peer.user_id);
        this.admin_rights.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.rank);
        }
    }
}
