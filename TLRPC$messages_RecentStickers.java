package org.telegram.tgnet;

public abstract class TLRPC$messages_RecentStickers extends TLObject {
    public static TLRPC$messages_RecentStickers TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$messages_RecentStickers tLRPC$messages_RecentStickers;
        if (i != -1999405994) {
            tLRPC$messages_RecentStickers = i != 186120336 ? null : new TLRPC$TL_messages_recentStickersNotModified();
        } else {
            tLRPC$messages_RecentStickers = new TLRPC$TL_messages_recentStickers();
        }
        if (tLRPC$messages_RecentStickers != null || !z) {
            if (tLRPC$messages_RecentStickers != null) {
                tLRPC$messages_RecentStickers.readParams(abstractSerializedData, z);
            }
            return tLRPC$messages_RecentStickers;
        }
        throw new RuntimeException(String.format("can't parse magic %x in messages_RecentStickers", Integer.valueOf(i)));
    }
}
