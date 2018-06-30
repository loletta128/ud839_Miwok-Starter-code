package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        // TODO... Add array of numbers

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("әpә", "father", R.drawable.family_father));
        words.add(new Word("әṭa", "mother", R.drawable.family_mother));
        words.add(new Word("angsi", "son", R.drawable.family_son));
        words.add(new Word("tune", "daughter", R.drawable.family_daughter));
        words.add(new Word("taachi", "older brother", R.drawable.family_older_brother));
        words.add(new Word("chalitti", "younger brother", R.drawable.family_younger_brother));
        words.add(new Word("teṭe", "older sister", R.drawable.family_older_sister));
        words.add(new Word("kolliti", "younger sister", R.drawable.family_younger_sister));
        words.add(new Word("ama", "grandmother", R.drawable.family_grandmother));
        words.add(new Word("paapa", "grandfather", R.drawable.family_grandfather));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
    }
}