package com.example.android.myapplication;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by admin-pc on 22.10.2014.
 */
public class ViewStorage /*extends Activity*/{
    MyActivity activity;
    TextView tvName;
    ImageButton btnName1;
    ImageButton btnName2;
    ImageButton btnName3;
    ImageButton btnName4;
    ImageButton btnName5;
    TableRow.LayoutParams rw = new TableRow.LayoutParams(225,225);

    ArrayList<?super View> listViews = new ArrayList<View>();

    public ViewStorage(MyActivity context) {
        activity = context;
    }

        public void  addViews(){
        btnName1 = (ImageButton) activity.findViewById(R.id.imageButton11);
        btnName1.setBackgroundResource(R.drawable.nevermind);
        btnName1.setLayoutParams(rw);

        btnName2 = (ImageButton) activity.findViewById(R.id.imageButton12);
        btnName2.setBackgroundResource(R.drawable.nevermind);
        btnName2.setLayoutParams(rw);

        btnName3 = (ImageButton) activity.findViewById(R.id.imageButton13);
        btnName3.setBackgroundResource(R.drawable.nevermind);
        btnName3.setLayoutParams(rw);

        btnName4=(ImageButton) activity.findViewById(R.id.imageButton21);
        btnName4.setBackgroundResource(R.drawable.pink_floyd);
        btnName4.setLayoutParams(rw);

        listViews.add(btnName1);
        listViews.add(btnName2);
        listViews.add(btnName3);
        listViews.add(btnName4);
    }

    public ArrayList<?super View> setViews(){
        addViews();
        return listViews;
    }
}
