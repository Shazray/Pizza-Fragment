package com.example.virgi.fragmentexample.logic;

import android.app.AlertDialog;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.virgi.fragmentexample.R;
import com.example.virgi.fragmentexample.data.MainSingleton;
import com.example.virgi.fragmentexample.ui.activity.MainActivity;

/**
 * Created by virgi on 22/02/2018.
 */

public class ArticleFragment extends android.support.v4.app.Fragment {

    ArrayAdapter<String> itemsAdapter;

    @Override
    public void onCreate(Bundle savedInstaceState) {

        super.onCreate(savedInstaceState);

        itemsAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, Pizza.pizzaMenu);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.article_view, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ListView lvItems = (ListView) getView().findViewById(R.id.lvItems);
        lvItems.setAdapter(itemsAdapter);
        lvItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                           @Override
                                           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             Toast.makeText(getActivity(),itemsAdapter.getItem(position), Toast.LENGTH_LONG).show();
                                           }
                                       }
        );
    }




}
