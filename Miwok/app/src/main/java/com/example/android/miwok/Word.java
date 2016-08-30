package com.example.android.miwok;

/**
 * Created by im.harinder.sing on 2016-08-30.
 */
public class Word {
    private String mDefaultTranslation, mMiwokTranslation;

    public Word(String DefaultTranslation, String MiwokTranslation){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
