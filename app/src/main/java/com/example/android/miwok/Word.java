package com.example.android.miwok;


/** represent vocabulary word that the user want to learn
 * contains a default translation and a miwok translation of the words
 */
public class Word {


    /** the miwok translation */
      private String miwokWord;
    /** the default translation */
      private String defaultWord;
    /** Image resource ID for the word */
      private int mImageResourceId;

//      private int mImageResourceId = NO_IMAGE_PROVIDED;
//
//    /** Constant value that represents no image was provided for this word */
//    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String miwokTranslation, String defaultTranslation){
        defaultWord = defaultTranslation;
        miwokWord = miwokTranslation;
    }
    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     *
     */
    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId){
        defaultWord = defaultTranslation;
        miwokWord = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    /** get the miwok translation */

    public String getMiwokWord() {
        return miwokWord;
    }

    /** get the default translation */

    public String getDefaultWord() {
        return defaultWord;
    }

    /** get the image */

    public int getImageResourceId() {
        return mImageResourceId;
    }

//    /**
//     * Returns whether or not there is an image for this word.
//     */
//    public boolean hasImage() {
//        return mImageResourceId != NO_IMAGE_PROVIDED;
//    }
}
