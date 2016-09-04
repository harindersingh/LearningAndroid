package com.example.android.miwok;

/**
 * Created by im.harinder.sing on 2016-08-30.
 */
public class Word {
    private String mDefaultTranslation, mMiwokTranslation;

    private int mImageResourceId;

    public Word(String DefaultTranslation, String MiwokTranslation){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
    }


    public Word(String DefaultTranslation, String MiwokTranslation, int ImageResourceId){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId = ImageResourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId() { return mImageResourceId; }
}
