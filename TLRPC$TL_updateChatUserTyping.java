package org.telegram.tgnet;

public class TLRPC$TL_updateChatUserTyping extends TLRPC$Update {
    public static int constructor = -2033525908;
    public TLRPC$SendMessageAction action;
    public int chat_id;
    public TLRPC$Peer from_id;

    @Override // org.telegram.tgnet.TLObject
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.chat_id = abstractSerializedData.readInt32(z);
        this.from_id = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.action = TLRPC$SendMessageAction.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override // org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.chat_id);
        this.from_id.serializeToStream(abstractSerializedData);
        this.action.serializeToStream(abstractSerializedData);
    }
}
