package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;

public class TLRPC$TL_messages_sendInlineBotResult extends TLObject {
    public static int constructor = 570955184;
    public boolean background;
    public boolean clear_draft;
    public int flags;
    public boolean hide_via;
    public String id;
    public TLRPC$InputPeer peer;
    public long query_id;
    public long random_id;
    public int reply_to_msg_id;
    public int schedule_date;
    public boolean silent;

    @Override // org.telegram.tgnet.TLObject
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override // org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.silent ? this.flags | 32 : this.flags & -33;
        this.flags = i;
        int i2 = this.background ? i | 64 : i & -65;
        this.flags = i2;
        int i3 = this.clear_draft ? i2 | 128 : i2 & -129;
        this.flags = i3;
        int i4 = this.hide_via ? i3 | MessagesController.UPDATE_MASK_NEW_MESSAGE : i3 & -2049;
        this.flags = i4;
        abstractSerializedData.writeInt32(i4);
        this.peer.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.reply_to_msg_id);
        }
        abstractSerializedData.writeInt64(this.random_id);
        abstractSerializedData.writeInt64(this.query_id);
        abstractSerializedData.writeString(this.id);
        if ((this.flags & MessagesController.UPDATE_MASK_PHONE) != 0) {
            abstractSerializedData.writeInt32(this.schedule_date);
        }
    }
}
