package org.telegram.tgnet;

import android.graphics.drawable.BitmapDrawable;

public abstract class TLRPC$UserProfilePhoto extends TLObject {
    public int dc_id;
    public int flags;
    public boolean has_video;
    public TLRPC$FileLocation photo_big;
    public long photo_id;
    public TLRPC$FileLocation photo_small;
    public BitmapDrawable strippedBitmap;
    public byte[] stripped_thumb;

    public static TLRPC$UserProfilePhoto TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto;
        switch (i) {
            case -2100168954:
                tLRPC$UserProfilePhoto = new TLRPC$TL_userProfilePhoto();
                break;
            case -1727196013:
                tLRPC$UserProfilePhoto = new TLRPC$TL_userProfilePhoto_old();
                break;
            case -865771401:
                tLRPC$UserProfilePhoto = new TLRPC$TL_userProfilePhoto_layer127();
                break;
            case -715532088:
                tLRPC$UserProfilePhoto = new TLRPC$TL_userProfilePhoto_layer97();
                break;
            case -321430132:
                tLRPC$UserProfilePhoto = new TLRPC$TL_userProfilePhoto_layer115();
                break;
            case 1326562017:
                tLRPC$UserProfilePhoto = new TLRPC$TL_userProfilePhotoEmpty();
                break;
            case 1775479590:
                tLRPC$UserProfilePhoto = new TLRPC$TL_userProfilePhoto_layer126();
                break;
            default:
                tLRPC$UserProfilePhoto = null;
                break;
        }
        if (tLRPC$UserProfilePhoto != null || !z) {
            if (tLRPC$UserProfilePhoto != null) {
                tLRPC$UserProfilePhoto.readParams(abstractSerializedData, z);
            }
            return tLRPC$UserProfilePhoto;
        }
        throw new RuntimeException(String.format("can't parse magic %x in UserProfilePhoto", Integer.valueOf(i)));
    }
}
