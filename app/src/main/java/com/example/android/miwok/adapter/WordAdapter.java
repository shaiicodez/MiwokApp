package com.example.android.miwok.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.miwok.R;
import com.example.android.miwok.model.Word;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class WordAdapter extends ArrayAdapter<Word>{

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param wordArrayList A List of Words objects to display in a list
     */
    public WordAdapter(@NonNull Context context, ArrayList<Word> wordArrayList) {

        super(context, 0, wordArrayList);
    }


    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // [1] Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }// end if

        //[2] Get the {@link Word} object located at thi position in the list
        Word currentWord = getItem(position);

        //[3] find the TextView in the list_item.xml with id
        TextView miwokTextView = listItemView.findViewById(R.id.txt_miwok);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = listItemView.findViewById(R.id.txt_default);
        defaultTextView.setText(currentWord.getDefaultTranslation());


        return listItemView;
    }
}
