package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$BotInfo extends TLObject {
    public ArrayList<TLRPC$TL_botCommand> commands = new ArrayList<>();
    public String description;
    public long user_id;
    public int version;

    public static TLRPC$BotInfo TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$BotInfo tLRPC$BotInfo;
        switch (i) {
            case -1729618630:
                tLRPC$BotInfo = new TLRPC$TL_botInfo_layer131();
                break;
            case -1154598962:
                tLRPC$BotInfo = new TLRPC$TL_botInfoEmpty_layer48();
                break;
            case 164583517:
                tLRPC$BotInfo = new TLRPC$TL_botInfo_layer48();
                break;
            case 460632885:
                tLRPC$BotInfo = new TLRPC$TL_botInfo();
                break;
            default:
                tLRPC$BotInfo = null;
                break;
        }
        if (tLRPC$BotInfo != null || !z) {
            if (tLRPC$BotInfo != null) {
                tLRPC$BotInfo.readParams(abstractSerializedData, z);
            }
            return tLRPC$BotInfo;
        }
        throw new RuntimeException(String.format("can't parse magic %x in BotInfo", Integer.valueOf(i)));
    }
}
