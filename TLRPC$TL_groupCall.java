package org.telegram.tgnet;

public class TLRPC$TL_groupCall extends TLRPC$GroupCall {
    public static int constructor = -711498484;

    @Override // org.telegram.tgnet.TLObject
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        boolean z2 = true;
        this.join_muted = (readInt32 & 2) != 0;
        this.can_change_join_muted = (readInt32 & 4) != 0;
        this.join_date_asc = (readInt32 & 64) != 0;
        this.schedule_start_subscribed = (readInt32 & 256) != 0;
        this.can_start_video = (readInt32 & 512) != 0;
        if ((readInt32 & 2048) == 0) {
            z2 = false;
        }
        this.record_video_active = z2;
        this.id = abstractSerializedData.readInt64(z);
        this.access_hash = abstractSerializedData.readInt64(z);
        this.participants_count = abstractSerializedData.readInt32(z);
        if ((this.flags & 8) != 0) {
            this.title = abstractSerializedData.readString(z);
        }
        if ((this.flags & 16) != 0) {
            this.stream_dc_id = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 32) != 0) {
            this.record_start_date = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
            this.schedule_date = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 1024) != 0) {
            this.unmuted_video_count = abstractSerializedData.readInt32(z);
        }
        this.unmuted_video_limit = abstractSerializedData.readInt32(z);
        this.version = abstractSerializedData.readInt32(z);
    }

    @Override // org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.join_muted ? this.flags | 2 : this.flags & -3;
        this.flags = i;
        int i2 = this.can_change_join_muted ? i | 4 : i & -5;
        this.flags = i2;
        int i3 = this.join_date_asc ? i2 | 64 : i2 & -65;
        this.flags = i3;
        int i4 = this.schedule_start_subscribed ? i3 | 256 : i3 & -257;
        this.flags = i4;
        int i5 = this.can_start_video ? i4 | 512 : i4 & -513;
        this.flags = i5;
        int i6 = this.record_video_active ? i5 | 2048 : i5 & -2049;
        this.flags = i6;
        abstractSerializedData.writeInt32(i6);
        abstractSerializedData.writeInt64(this.id);
        abstractSerializedData.writeInt64(this.access_hash);
        abstractSerializedData.writeInt32(this.participants_count);
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeString(this.title);
        }
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeInt32(this.stream_dc_id);
        }
        if ((this.flags & 32) != 0) {
            abstractSerializedData.writeInt32(this.record_start_date);
        }
        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
            abstractSerializedData.writeInt32(this.schedule_date);
        }
        if ((this.flags & 1024) != 0) {
            abstractSerializedData.writeInt32(this.unmuted_video_count);
        }
        abstractSerializedData.writeInt32(this.unmuted_video_limit);
        abstractSerializedData.writeInt32(this.version);
    }
}
