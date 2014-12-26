package com.example.android.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MyActivity extends Activity implements OnClickListener {

    TextView tvName;
    StartIntentFromActivity intentFromActivity = new StartIntentFromActivity();
    int leftMargin = 10;
    HashMap<String,String> imageNamesMap = new ResourceStorage().createResourcesMap();
    ArrayList<?super View> listViews;
    ViewStorage viewStorage;
    public static final String APP_PREFERENCES = "mysettings";
    public static final String APP_PREFERENCES_COUNTER = "counter";
    SharedPreferences mSettings;
    Set<String> counter = new HashSet<String>();

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        viewStorage = new ViewStorage(this);
        mSettings = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
        loadResults();

        TableRow.LayoutParams rw = new TableRow.LayoutParams(225,225);

        listViews=viewStorage.setViews();

        for(Object view : listViews ){
            if(view instanceof ImageButton){

                ((ViewGroup.MarginLayoutParams) ((ImageButton)view).getLayoutParams()).leftMargin = leftMargin;
                ((ViewGroup.MarginLayoutParams)((ImageButton)view).getLayoutParams()).topMargin = leftMargin;
                ((ImageButton)view).setOnClickListener(this);
            }
        }
        tvName = (TextView) findViewById(R.id.tvName);
    }

    @Override
    public void onClick(View v) {
        Intent intent = intentFromActivity.startIntent(v);
        startActivityForResult(intent,1);

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (data == null) {return;}
        String context = this.getResources().getResourceEntryName(R.drawable.nevermind);
        String name = data.getStringExtra("name");
        String id = data.getStringExtra("id");
        loadResults();
        //todo Fix all actions button
        if(imageNamesMap.get(id).equals(name.toLowerCase())){
            tvName.setText("name is " + imageNamesMap.get(id) + counter);
            counter.add(imageNamesMap.get(id));
        } else {
            tvName.setText("NO");
        }

    }

    public void saveResults(){
        SharedPreferences.Editor editor = mSettings.edit();
        Set<String> s = new HashSet<String>(mSettings.getStringSet(APP_PREFERENCES_COUNTER, new HashSet<String>()));
        editor.putStringSet(APP_PREFERENCES_COUNTER, s);
        editor.apply();
        editor.commit();
    }

    public void loadResults(){
        if (mSettings.contains(APP_PREFERENCES_COUNTER)) {
            // Получаем число из настроек
            counter = mSettings.getStringSet(APP_PREFERENCES_COUNTER, null);
        }
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();

        /*if (mSettings.contains(APP_PREFERENCES_COUNTER)) {
            // Получаем число из настроек
            counter = mSettings.getStringSet(APP_PREFERENCES_COUNTER, null);
        }*/
        loadResults();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        saveResults();
        super.onPause();

    }
    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        saveResults();
        super.onDestroy();
    }
}
