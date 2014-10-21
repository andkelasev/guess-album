package com.example.android.myapplication;

import android.app.Activity;


import java.util.HashMap;

/**
 * Created by admin-pc on 21.10.2014.
 */
public class ResourceStorage extends Activity {

    public HashMap<String,String> createResourcesMap(){
        HashMap<String,String> imageNamesMap = new HashMap<String, String>();
        imageNamesMap.put(String.valueOf(R.drawable.nevermind),"nevermind");
        imageNamesMap.put(String.valueOf(R.drawable.pink_floyd),"pink floyd");
        return imageNamesMap;
    }


}
