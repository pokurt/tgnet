package org.telegram.tgnet;

public class TLRPC$TL_channels_togglePreHistoryHidden extends TLObject {
    public static int constructor = -356796084;
    public TLRPC$InputChannel channel;
    public boolean enabled;

    @Override // org.telegram.tgnet.TLObject
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override // org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.channel.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeBool(this.enabled);
    }
}
