package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_privacyValueAllowChatParticipants extends TLRPC$PrivacyRule {
    public static int constructor = 1796427406;
    public ArrayList<Long> chats = new ArrayList<>();

    @Override // org.telegram.tgnet.TLObject
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 == 481674261) {
            int readInt322 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt322; i++) {
                this.chats.add(Long.valueOf(abstractSerializedData.readInt64(z)));
            }
        } else if (z) {
            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(481674261);
        int size = this.chats.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeInt64(this.chats.get(i).longValue());
        }
    }
}
