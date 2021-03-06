package org.telegram.tgnet;

public abstract class TLRPC$PeerNotifySettings extends TLObject {
    public int events_mask;
    public int flags;
    public int mute_until;
    public boolean show_previews;
    public boolean silent;
    public String sound;

    public static TLRPC$PeerNotifySettings TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$PeerNotifySettings tLRPC$PeerNotifySettings;
        switch (i) {
            case -1923214866:
                tLRPC$PeerNotifySettings = new TLRPC$TL_peerNotifySettings_layer47();
                break;
            case -1697798976:
                tLRPC$PeerNotifySettings = new TLRPC$TL_peerNotifySettings_layer77();
                break;
            case -1353671392:
                tLRPC$PeerNotifySettings = new TLRPC$TL_peerNotifySettings();
                break;
            case 1889961234:
                tLRPC$PeerNotifySettings = new TLRPC$TL_peerNotifySettingsEmpty_layer77();
                break;
            default:
                tLRPC$PeerNotifySettings = null;
                break;
        }
        if (tLRPC$PeerNotifySettings != null || !z) {
            if (tLRPC$PeerNotifySettings != null) {
                tLRPC$PeerNotifySettings.readParams(abstractSerializedData, z);
            }
            return tLRPC$PeerNotifySettings;
        }
        throw new RuntimeException(String.format("can't parse magic %x in PeerNotifySettings", Integer.valueOf(i)));
    }
}
