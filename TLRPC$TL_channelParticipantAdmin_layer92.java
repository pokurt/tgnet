package org.telegram.tgnet;

public class TLRPC$TL_channelParticipantAdmin_layer92 extends TLRPC$TL_channelParticipantAdmin {
    public static int constructor = -1473271656;

    @Override // org.telegram.tgnet.TLRPC$TL_channelParticipantAdmin, org.telegram.tgnet.TLObject
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        boolean z2 = true;
        if ((readInt32 & 1) == 0) {
            z2 = false;
        }
        this.can_edit = z2;
        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
        this.peer = tLRPC$TL_peerUser;
        tLRPC$TL_peerUser.user_id = (long) abstractSerializedData.readInt32(z);
        this.inviter_id = (long) abstractSerializedData.readInt32(z);
        this.promoted_by = (long) abstractSerializedData.readInt32(z);
        this.date = abstractSerializedData.readInt32(z);
        TLRPC$TL_channelAdminRights_layer92 TLdeserialize = TLRPC$TL_channelAdminRights_layer92.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.admin_rights_layer92 = TLdeserialize;
        this.admin_rights = TLRPC$Chat.mergeAdminRights(TLdeserialize);
    }

    @Override // org.telegram.tgnet.TLRPC$TL_channelParticipantAdmin, org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.can_edit ? this.flags | 1 : this.flags & -2;
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt32((int) this.peer.user_id);
        abstractSerializedData.writeInt32((int) this.inviter_id);
        abstractSerializedData.writeInt32((int) this.promoted_by);
        abstractSerializedData.writeInt32(this.date);
        this.admin_rights_layer92.serializeToStream(abstractSerializedData);
    }
}
