package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    /** Resource ID for the background color for this list of words */
//    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);

//        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        // Get the {@link Word} object located at this position in the list
        Word currentWord = (Word) getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView miwokWord = (TextView) listView.findViewById(R.id.miwok_text_view);

        // Get the Miwok translation from the currentWord object and set this text on
        miwokWord.setText(currentWord.getMiwokWord());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView defaultWord = (TextView) listView.findViewById(R.id.default_text_view);

        // Get the default translation from the currentWord object and set this text on
        defaultWord.setText(currentWord.getDefaultWord());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listView.findViewById(R.id.image);

//        // Check if an image is provided for this word or not
////        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentWord.getImageResourceId());
//              // Make sure the view is visible
//            imageView.setVisibility(View.VISIBLE);
//        } else {
//            // Otherwise hide the ImageView (set visibility to GONE)
//            imageView.setVisibility(View.GONE);
//        }


//        // Set the theme color for the list item
//        View textContainer = listView.findViewById(R.id.text_container);
//        // Find the color that the resource ID maps to
//        int color = ContextCompat.getColor(getContext(), mColorResourceId);
//        // Set the background color of the text container View
//        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listView;
    }
}