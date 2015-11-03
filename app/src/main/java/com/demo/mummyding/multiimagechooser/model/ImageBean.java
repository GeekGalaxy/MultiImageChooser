package com.demo.mummyding.multiimagechooser.model;

import android.net.Uri;

import java.io.Serializable;

/**
 * Created by mummyding on 15-11-3.
 */
public class ImageBean implements Serializable{
    private Uri imageUri;
    private boolean isChecked;
    private int ID;

    public int getID() {
        return ID;
    }

    public ImageBean setID(int ID) {
        this.ID = ID;
        return this;
    }

    public Uri getImageUri() {
        return imageUri;
    }

    public ImageBean setImageUri(Uri imageUri) {
        this.imageUri = imageUri;
        return this;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setIsChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }
}
