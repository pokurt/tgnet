package org.telegram.tgnet;

import android.text.TextUtils;
import org.telegram.messenger.MessagesController;

public class TLRPC$TL_message_layer104 extends TLRPC$TL_message {
    public static int constructor = 1157215293;

    @Override // org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_message
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.out = (readInt32 & 2) != 0;
        this.mentioned = (readInt32 & 16) != 0;
        this.media_unread = (readInt32 & 32) != 0;
        this.silent = (readInt32 & MessagesController.UPDATE_MASK_CHAT) != 0;
        this.post = (readInt32 & 16384) != 0;
        this.from_scheduled = (262144 & readInt32) != 0;
        this.legacy = (readInt32 & 524288) != 0;
        this.id = abstractSerializedData.readInt32(z);
        if ((this.flags & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) != 0) {
            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
            this.from_id = tLRPC$TL_peerUser;
            tLRPC$TL_peerUser.user_id = abstractSerializedData.readInt32(z);
        }
        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 4) != 0) {
            this.fwd_from = TLRPC$MessageFwdHeader.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & MessagesController.UPDATE_MASK_NEW_MESSAGE) != 0) {
            this.via_bot_id = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 8) != 0) {
            TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader = new TLRPC$TL_messageReplyHeader();
            this.reply_to = tLRPC$TL_messageReplyHeader;
            tLRPC$TL_messageReplyHeader.reply_to_msg_id = abstractSerializedData.readInt32(z);
        }
        this.date = abstractSerializedData.readInt32(z);
        this.message = abstractSerializedData.readString(z);
        if ((this.flags & MessagesController.UPDATE_MASK_SELECT_DIALOG) != 0) {
            TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            this.media = TLdeserialize;
            if (TLdeserialize != null) {
                this.ttl = TLdeserialize.ttl_seconds;
            }
            if (TLdeserialize != null && !TextUtils.isEmpty(TLdeserialize.captionLegacy)) {
                this.message = this.media.captionLegacy;
            }
        }
        if ((this.flags & 64) != 0) {
            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 128) != 0) {
            int readInt322 = abstractSerializedData.readInt32(z);
            if (readInt322 == 481674261) {
                int readInt323 = abstractSerializedData.readInt32(z);
                for (int i = 0; i < readInt323; i++) {
                    TLRPC$MessageEntity TLdeserialize2 = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                    if (TLdeserialize2 != null) {
                        this.entities.add(TLdeserialize2);
                    } else {
                        return;
                    }
                }
            } else if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
            } else {
                return;
            }
        }
        if ((this.flags & MessagesController.UPDATE_MASK_PHONE) != 0) {
            this.views = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & MessagesController.UPDATE_MASK_MESSAGE_TEXT) != 0) {
            this.edit_date = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & MessagesController.UPDATE_MASK_CHECK) != 0) {
            this.post_author = abstractSerializedData.readString(z);
        }
        if ((this.flags & MessagesController.UPDATE_MASK_REORDER) != 0) {
            this.grouped_id = abstractSerializedData.readInt64(z);
        }
    }

    @Override // org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_message
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.out ? this.flags | 2 : this.flags & -3;
        this.flags = i;
        int i2 = this.mentioned ? i | 16 : i & -17;
        this.flags = i2;
        int i3 = this.media_unread ? i2 | 32 : i2 & -33;
        this.flags = i3;
        int i4 = this.silent ? i3 | MessagesController.UPDATE_MASK_CHAT : i3 & -8193;
        this.flags = i4;
        int i5 = this.post ? i4 | 16384 : i4 & -16385;
        this.flags = i5;
        int i6 = this.from_scheduled ? i5 | 262144 : i5 & -262145;
        this.flags = i6;
        int i7 = this.legacy ? i6 | 524288 : i6 & -524289;
        this.flags = i7;
        abstractSerializedData.writeInt32(i7);
        abstractSerializedData.writeInt32(this.id);
        if ((this.flags & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) != 0) {
            abstractSerializedData.writeInt32(this.from_id.user_id);
        }
        this.peer_id.serializeToStream(abstractSerializedData);
        if ((this.flags & 4) != 0) {
            this.fwd_from.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & MessagesController.UPDATE_MASK_NEW_MESSAGE) != 0) {
            abstractSerializedData.writeInt32(this.via_bot_id);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeInt32(this.reply_to.reply_to_msg_id);
        }
        abstractSerializedData.writeInt32(this.date);
        abstractSerializedData.writeString(this.message);
        if ((this.flags & MessagesController.UPDATE_MASK_SELECT_DIALOG) != 0) {
            this.media.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 64) != 0) {
            this.reply_markup.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 128) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.entities.size();
            abstractSerializedData.writeInt32(size);
            for (int i8 = 0; i8 < size; i8++) {
                this.entities.get(i8).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & MessagesController.UPDATE_MASK_PHONE) != 0) {
            abstractSerializedData.writeInt32(this.views);
        }
        if ((this.flags & MessagesController.UPDATE_MASK_MESSAGE_TEXT) != 0) {
            abstractSerializedData.writeInt32(this.edit_date);
        }
        if ((this.flags & MessagesController.UPDATE_MASK_CHECK) != 0) {
            abstractSerializedData.writeString(this.post_author);
        }
        if ((this.flags & MessagesController.UPDATE_MASK_REORDER) != 0) {
            abstractSerializedData.writeInt64(this.grouped_id);
        }
        writeAttachPath(abstractSerializedData);
    }
}
