package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_chatInviteExported extends TLRPC$ExportedChatInvite {
    public static int constructor = -1316944408;
    public long admin_id;
    public int date;
    public int expire_date;
    public boolean expired;
    public int flags;
    public ArrayList<TLRPC$User> importers;
    public String link;
    public boolean permanent;
    public boolean revoked;
    public int start_date;
    public int usage;
    public int usage_limit;

    @Override // org.telegram.tgnet.TLObject
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        boolean z2 = false;
        this.revoked = (readInt32 & 1) != 0;
        if ((readInt32 & 32) != 0) {
            z2 = true;
        }
        this.permanent = z2;
        this.link = abstractSerializedData.readString(z);
        this.admin_id = abstractSerializedData.readInt64(z);
        this.date = abstractSerializedData.readInt32(z);
        if ((this.flags & 16) != 0) {
            this.start_date = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 2) != 0) {
            this.expire_date = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 4) != 0) {
            this.usage_limit = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 8) != 0) {
            this.usage = abstractSerializedData.readInt32(z);
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.revoked ? this.flags | 1 : this.flags & -2;
        this.flags = i;
        int i2 = this.permanent ? i | 32 : i & -33;
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeString(this.link);
        abstractSerializedData.writeInt64(this.admin_id);
        abstractSerializedData.writeInt32(this.date);
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeInt32(this.start_date);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.expire_date);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(this.usage_limit);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeInt32(this.usage);
        }
    }
}
