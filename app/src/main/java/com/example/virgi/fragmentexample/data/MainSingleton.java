package com.example.virgi.fragmentexample.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by virgi on 22/02/2018.
 */

public class MainSingleton {
    private static MainSingleton ourInstance = new MainSingleton();

    public static MainSingleton getInstance()
    {
        return ourInstance;
    }

    private List<String> itemList;

    private MainSingleton(){

        this.itemList = new ArrayList<String>();
    }

    public List<String> getItemList(){
        return itemList;
    }

    public void setItemList(List<String> itemList){
        this.itemList = itemList;
    }
}
