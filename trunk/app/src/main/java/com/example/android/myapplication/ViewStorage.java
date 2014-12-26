package com.example.android.myapplication;

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
    ImageButton btnName1;ImageButton btnName2;ImageButton btnName3;ImageButton btnName4;ImageButton btnName5;
    ImageButton btnName6;ImageButton btnName7;ImageButton btnName8;ImageButton btnName9;ImageButton btnName10;
    ImageButton btnName11;ImageButton btnName12;ImageButton btnName13;ImageButton btnName14;ImageButton btnName15;

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
            btnName2.setBackgroundResource(R.drawable.pink_floyd);
            btnName2.setLayoutParams(rw);

            btnName3 = (ImageButton) activity.findViewById(R.id.imageButton13);
            btnName3.setBackgroundResource(R.drawable.abbey_road);
            btnName3.setLayoutParams(rw);

            btnName4 =(ImageButton) activity.findViewById(R.id.imageButton21);
            btnName4.setBackgroundResource(R.drawable.war);
            btnName4.setLayoutParams(rw);

            btnName5 =(ImageButton) activity.findViewById(R.id.imageButton22);
            btnName5.setBackgroundResource(R.drawable.velvet_underground);
            btnName5.setLayoutParams(rw);

            btnName6 =(ImageButton) activity.findViewById(R.id.imageButton23);
            btnName6.setBackgroundResource(R.drawable.unknown_pleasures);
            btnName6.setLayoutParams(rw);

            btnName7 =(ImageButton) activity.findViewById(R.id.imageButton31);
            btnName7.setBackgroundResource(R.drawable.sgt_peppers_lonely_hearts_club);
            btnName7.setLayoutParams(rw);

            btnName8 =(ImageButton) activity.findViewById(R.id.imageButton32);
            btnName8.setBackgroundResource(R.drawable.rage_against_the_machine);
            btnName8.setLayoutParams(rw);

            btnName9 =(ImageButton) activity.findViewById(R.id.imageButton33);
            btnName9.setBackgroundResource(R.drawable.radioactivity);
            btnName9.setLayoutParams(rw);

            btnName10 =(ImageButton) activity.findViewById(R.id.imageButton41);
            btnName10.setBackgroundResource(R.drawable.mothership);
            btnName10.setLayoutParams(rw);

            btnName11 =(ImageButton) activity.findViewById(R.id.imageButton42);
            btnName11.setBackgroundResource(R.drawable.kid_a);
            btnName11.setLayoutParams(rw);

            btnName12 =(ImageButton) activity.findViewById(R.id.imageButton43);
            btnName12.setBackgroundResource(R.drawable.back_in_black);
            btnName12.setLayoutParams(rw);

            btnName13 =(ImageButton) activity.findViewById(R.id.imageButton51);
            btnName13.setBackgroundResource(R.drawable.animals);
            btnName13.setLayoutParams(rw);

            btnName14 =(ImageButton) activity.findViewById(R.id.imageButton52);
            btnName14.setBackgroundResource(R.drawable.american_idiot);
            btnName14.setLayoutParams(rw);

            btnName15 =(ImageButton) activity.findViewById(R.id.imageButton53);
            btnName15.setBackgroundResource(R.drawable.pink_floyd);
            btnName15.setLayoutParams(rw);

            listViews.add(btnName1);
            listViews.add(btnName2);
            listViews.add(btnName3);
            listViews.add(btnName4);
            listViews.add(btnName5);
            listViews.add(btnName6);
            listViews.add(btnName7);
            listViews.add(btnName8);
            listViews.add(btnName9);
            listViews.add(btnName10);
            listViews.add(btnName11);
            listViews.add(btnName12);
            listViews.add(btnName13);
            listViews.add(btnName14);
            listViews.add(btnName15);

    }

    public ArrayList<?super View> setViews(){
        addViews();
        return listViews;
    }
}
