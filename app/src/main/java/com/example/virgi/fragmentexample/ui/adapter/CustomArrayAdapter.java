package com.example.virgi.fragmentexample.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.virgi.fragmentexample.R;
import com.example.virgi.fragmentexample.data.MainSingleton;

import java.util.List;

/**
 * Created by virgi on 22/02/2018.
 */

public class CustomArrayAdapter extends ArrayAdapter<String> {

    private final Context context;
    private List<String> fragmentList;

    public CustomArrayAdapter(Context context) {
        super(context, R.layout.item_layout, MainSingleton.getInstance().getItemList());

        fragmentList = MainSingleton.getInstance().getItemList();
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.item_layout, parent, false);

        TextView textView = (TextView) rowView.findViewById(R.id.label);
        String itemName = this.fragmentList.get(position);
        textView.setText(itemName);

        return rowView;


    }

}
