package org.telegram.tgnet;

public class TLRPC$TL_messages_deleteChatUser extends TLObject {
    public static int constructor = -986430054;
    public int chat_id;
    public int flags;
    public boolean revoke_history;
    public TLRPC$InputUser user_id;

    @Override // org.telegram.tgnet.TLObject
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override // org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.revoke_history ? this.flags | 1 : this.flags & -2;
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt32(this.chat_id);
        this.user_id.serializeToStream(abstractSerializedData);
    }
}
