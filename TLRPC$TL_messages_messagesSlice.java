package org.telegram.tgnet;

public class TLRPC$TL_messages_messagesSlice extends TLRPC$messages_Messages {
    public static int constructor = 978610270;

    @Override // org.telegram.tgnet.TLObject
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.inexact = (readInt32 & 2) != 0;
        this.count = abstractSerializedData.readInt32(z);
        if ((this.flags & 1) != 0) {
            this.next_rate = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 4) != 0) {
            this.offset_id_offset = abstractSerializedData.readInt32(z);
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 == 481674261) {
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize != null) {
                    this.messages.add(TLdeserialize);
                } else {
                    return;
                }
            }
            int readInt324 = abstractSerializedData.readInt32(z);
            if (readInt324 == 481674261) {
                int readInt325 = abstractSerializedData.readInt32(z);
                for (int i2 = 0; i2 < readInt325; i2++) {
                    TLRPC$Chat TLdeserialize2 = TLRPC$Chat.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                    if (TLdeserialize2 != null) {
                        this.chats.add(TLdeserialize2);
                    } else {
                        return;
                    }
                }
                int readInt326 = abstractSerializedData.readInt32(z);
                if (readInt326 == 481674261) {
                    int readInt327 = abstractSerializedData.readInt32(z);
                    for (int i3 = 0; i3 < readInt327; i3++) {
                        TLRPC$User TLdeserialize3 = TLRPC$User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                        if (TLdeserialize3 != null) {
                            this.users.add(TLdeserialize3);
                        } else {
                            return;
                        }
                    }
                } else if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt326)));
                }
            } else if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
            }
        } else if (z) {
            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.inexact ? this.flags | 2 : this.flags & -3;
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt32(this.count);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.next_rate);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(this.offset_id_offset);
        }
        abstractSerializedData.writeInt32(481674261);
        int size = this.messages.size();
        abstractSerializedData.writeInt32(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.messages.get(i2).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size2 = this.chats.size();
        abstractSerializedData.writeInt32(size2);
        for (int i3 = 0; i3 < size2; i3++) {
            this.chats.get(i3).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size3 = this.users.size();
        abstractSerializedData.writeInt32(size3);
        for (int i4 = 0; i4 < size3; i4++) {
            this.users.get(i4).serializeToStream(abstractSerializedData);
        }
    }
}
