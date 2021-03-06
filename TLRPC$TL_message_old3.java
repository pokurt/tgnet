package org.telegram.tgnet;

import android.text.TextUtils;

public class TLRPC$TL_message_old3 extends TLRPC$TL_message {
    public static int constructor = -1481959023;

    @Override // org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_message
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z) | 256 | 512;
        this.flags = readInt32;
        boolean z2 = false;
        this.unread = (readInt32 & 1) != 0;
        this.out = (readInt32 & 2) != 0;
        this.mentioned = (readInt32 & 16) != 0;
        if ((readInt32 & 32) != 0) {
            z2 = true;
        }
        this.media_unread = z2;
        this.id = abstractSerializedData.readInt32(z);
        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
        this.from_id = tLRPC$TL_peerUser;
        tLRPC$TL_peerUser.user_id = (long) abstractSerializedData.readInt32(z);
        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 4) != 0) {
            TLRPC$TL_messageFwdHeader tLRPC$TL_messageFwdHeader = new TLRPC$TL_messageFwdHeader();
            this.fwd_from = tLRPC$TL_messageFwdHeader;
            tLRPC$TL_messageFwdHeader.from_id = new TLRPC$TL_peerUser();
            this.fwd_from.from_id.user_id = (long) abstractSerializedData.readInt32(z);
            TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = this.fwd_from;
            tLRPC$MessageFwdHeader.flags |= 1;
            tLRPC$MessageFwdHeader.date = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 8) != 0) {
            TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader = new TLRPC$TL_messageReplyHeader();
            this.reply_to = tLRPC$TL_messageReplyHeader;
            tLRPC$TL_messageReplyHeader.reply_to_msg_id = abstractSerializedData.readInt32(z);
        }
        this.date = abstractSerializedData.readInt32(z);
        this.message = abstractSerializedData.readString(z);
        TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.media = TLdeserialize;
        if (TLdeserialize != null && !TextUtils.isEmpty(TLdeserialize.captionLegacy)) {
            this.message = this.media.captionLegacy;
        }
    }

    @Override // org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_message
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.unread ? this.flags | 1 : this.flags & -2;
        this.flags = i;
        int i2 = this.out ? i | 2 : i & -3;
        this.flags = i2;
        int i3 = this.mentioned ? i2 | 16 : i2 & -17;
        this.flags = i3;
        int i4 = this.media_unread ? i3 | 32 : i3 & -33;
        this.flags = i4;
        abstractSerializedData.writeInt32(i4);
        abstractSerializedData.writeInt32(this.id);
        abstractSerializedData.writeInt32((int) this.from_id.user_id);
        this.peer_id.serializeToStream(abstractSerializedData);
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32((int) this.fwd_from.from_id.user_id);
            abstractSerializedData.writeInt32(this.fwd_from.date);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeInt32(this.reply_to.reply_to_msg_id);
        }
        abstractSerializedData.writeInt32(this.date);
        abstractSerializedData.writeString(this.message);
        this.media.serializeToStream(abstractSerializedData);
        writeAttachPath(abstractSerializedData);
    }
}
