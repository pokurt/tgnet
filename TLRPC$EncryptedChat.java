package org.telegram.tgnet;

public abstract class TLRPC$EncryptedChat extends TLObject {
    public byte[] a_or_b;
    public long access_hash;
    public long admin_id;
    public byte[] auth_key;
    public int date;
    public long exchange_id;
    public int flags;
    public int folder_id;
    public byte[] future_auth_key;
    public long future_key_fingerprint;
    public byte[] g_a;
    public byte[] g_a_or_b;
    public boolean history_deleted;
    public int id;
    public int in_seq_no;
    public int key_create_date;
    public long key_fingerprint;
    public byte[] key_hash;
    public short key_use_count_in;
    public short key_use_count_out;
    public int layer;
    public int mtproto_seq;
    public byte[] nonce;
    public long participant_id;
    public int seq_in;
    public int seq_out;
    public int ttl;
    public long user_id;

    public static TLRPC$EncryptedChat TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$EncryptedChat tLRPC$EncryptedChat;
        switch (i) {
            case -1417756512:
                tLRPC$EncryptedChat = new TLRPC$TL_encryptedChatEmpty();
                break;
            case -931638658:
                tLRPC$EncryptedChat = new TLRPC$TL_encryptedChatRequested_layer115();
                break;
            case -94974410:
                tLRPC$EncryptedChat = new TLRPC$TL_encryptedChat_layer131();
                break;
            case -39213129:
                tLRPC$EncryptedChat = new TLRPC$TL_encryptedChatRequested_old();
                break;
            case 332848423:
                tLRPC$EncryptedChat = new TLRPC$TL_encryptedChatDiscarded_layer122();
                break;
            case 505183301:
                tLRPC$EncryptedChat = new TLRPC$TL_encryptedChatDiscarded();
                break;
            case 1006044124:
                tLRPC$EncryptedChat = new TLRPC$TL_encryptedChatWaiting_layer131();
                break;
            case 1223809356:
                tLRPC$EncryptedChat = new TLRPC$TL_encryptedChatRequested();
                break;
            case 1643173063:
                tLRPC$EncryptedChat = new TLRPC$TL_encryptedChat();
                break;
            case 1651608194:
                tLRPC$EncryptedChat = new TLRPC$TL_encryptedChatRequested_layer131();
                break;
            case 1711395151:
                tLRPC$EncryptedChat = new TLRPC$TL_encryptedChat_old();
                break;
            case 1722964307:
                tLRPC$EncryptedChat = new TLRPC$TL_encryptedChatWaiting();
                break;
            default:
                tLRPC$EncryptedChat = null;
                break;
        }
        if (tLRPC$EncryptedChat != null || !z) {
            if (tLRPC$EncryptedChat != null) {
                tLRPC$EncryptedChat.readParams(abstractSerializedData, z);
            }
            return tLRPC$EncryptedChat;
        }
        throw new RuntimeException(String.format("can't parse magic %x in EncryptedChat", Integer.valueOf(i)));
    }
}
