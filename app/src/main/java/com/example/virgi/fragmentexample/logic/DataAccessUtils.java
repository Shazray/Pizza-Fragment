package com.example.virgi.fragmentexample.logic;

import android.content.Context;

import com.example.virgi.fragmentexample.R;
import com.example.virgi.fragmentexample.data.MainSingleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by virgi on 22/02/2018.
 */

public class DataAccessUtils {



    public static List<String> getDataSourceItemList(Context context){
        return MainSingleton.getInstance().getItemList();
    }

    public static String getItemAtIndex(Context context, int index)
    {
        List<String> datasource = DataAccessUtils.getDataSourceItemList(context);
        return datasource.get(index);
    }


    public static void initDataSource(Context context) {
        String[] list = context.getResources().getStringArray(R.array.base_list_array);
        List <String> pizzaList = new ArrayList<String>(Arrays.asList(list));

        MainSingleton.getInstance().setItemList(pizzaList);


    }
}
