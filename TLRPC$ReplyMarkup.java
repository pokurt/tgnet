package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$ReplyMarkup extends TLObject {
    public int flags;
    public String placeholder;
    public boolean resize;
    public ArrayList<TLRPC$TL_keyboardButtonRow> rows = new ArrayList<>();
    public boolean selective;
    public boolean single_use;

    public static TLRPC$ReplyMarkup TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$ReplyMarkup tLRPC$ReplyMarkup;
        switch (i) {
            case -2049074735:
                tLRPC$ReplyMarkup = new TLRPC$TL_replyKeyboardMarkup();
                break;
            case -2035021048:
                tLRPC$ReplyMarkup = new TLRPC$TL_replyKeyboardForceReply();
                break;
            case -1606526075:
                tLRPC$ReplyMarkup = new TLRPC$TL_replyKeyboardHide();
                break;
            case -200242528:
                tLRPC$ReplyMarkup = new TLRPC$TL_replyKeyboardForceReply_layer129();
                break;
            case 889353612:
                tLRPC$ReplyMarkup = new TLRPC$TL_replyKeyboardMarkup_layer129();
                break;
            case 1218642516:
                tLRPC$ReplyMarkup = new TLRPC$TL_replyInlineMarkup();
                break;
            default:
                tLRPC$ReplyMarkup = null;
                break;
        }
        if (tLRPC$ReplyMarkup != null || !z) {
            if (tLRPC$ReplyMarkup != null) {
                tLRPC$ReplyMarkup.readParams(abstractSerializedData, z);
            }
            return tLRPC$ReplyMarkup;
        }
        throw new RuntimeException(String.format("can't parse magic %x in ReplyMarkup", Integer.valueOf(i)));
    }
}
