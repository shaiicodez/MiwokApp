package com.example.android.miwok.model;

public class Word {

    // Default translation for the word
    private String mDefaultTranslation;

    // Miwok translation for the word
    private String mMiwokTranslation;


    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get the default translation of the word.
     * **/
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Set the default translation of the word.
     * **/
    public void setDefaultTranslation(String defaultTranslation) {
        mDefaultTranslation = defaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     * **/
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Set the Miwok translation of the word.
     * **/
    public void setMiwokTranslation(String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
    }
}
