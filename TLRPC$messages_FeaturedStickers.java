package org.telegram.tgnet;

public abstract class TLRPC$messages_FeaturedStickers extends TLObject {
    public static TLRPC$messages_FeaturedStickers TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$messages_FeaturedStickers tLRPC$messages_FeaturedStickers;
        if (i != -2067782896) {
            tLRPC$messages_FeaturedStickers = i != -958657434 ? null : new TLRPC$TL_messages_featuredStickersNotModified();
        } else {
            tLRPC$messages_FeaturedStickers = new TLRPC$TL_messages_featuredStickers();
        }
        if (tLRPC$messages_FeaturedStickers != null || !z) {
            if (tLRPC$messages_FeaturedStickers != null) {
                tLRPC$messages_FeaturedStickers.readParams(abstractSerializedData, z);
            }
            return tLRPC$messages_FeaturedStickers;
        }
        throw new RuntimeException(String.format("can't parse magic %x in messages_FeaturedStickers", Integer.valueOf(i)));
    }
}
