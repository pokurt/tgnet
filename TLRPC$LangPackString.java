package org.telegram.tgnet;

public abstract class TLRPC$LangPackString extends TLObject {
    public String few_value;
    public int flags;
    public String key;
    public String many_value;
    public String one_value;
    public String other_value;
    public String two_value;
    public String value;
    public String zero_value;

    public static TLRPC$LangPackString TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$LangPackString tLRPC$LangPackString;
        if (i == -892239370) {
            tLRPC$LangPackString = new TLRPC$TL_langPackString();
        } else if (i != 695856818) {
            tLRPC$LangPackString = i != 1816636575 ? null : new TLRPC$TL_langPackStringPluralized();
        } else {
            tLRPC$LangPackString = new TLRPC$TL_langPackStringDeleted();
        }
        if (tLRPC$LangPackString != null || !z) {
            if (tLRPC$LangPackString != null) {
                tLRPC$LangPackString.readParams(abstractSerializedData, z);
            }
            return tLRPC$LangPackString;
        }
        throw new RuntimeException(String.format("can't parse magic %x in LangPackString", Integer.valueOf(i)));
    }
}
