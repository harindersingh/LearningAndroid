package com.example.android.miwok;

/**
 * Created by im.harinder.sing on 2016-08-30.
 */
public class Word {
    private int mDefaultTranslation, mMiwokTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;

    public Word(int DefaultTranslation, int MiwokTranslation, int AudioResourceId){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mAudioResourceId = AudioResourceId;
    }


    public Word(int DefaultTranslation, int MiwokTranslation, int ImageResourceId,
                int AudioResourceId){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = AudioResourceId;
    }

    public int getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public int getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId() { return mImageResourceId; }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId(){
        return mAudioResourceId;
    }
}
