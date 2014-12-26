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
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MyActivity extends Activity implements OnClickListener {

    TextView tvName;
    StartIntentFromActivity intentFromActivity = new StartIntentFromActivity();
    int leftMargin = 10;
    HashMap<String,String> imageNamesMap = new ResourceStorage().createResourcesMap();
    HashMap<String,String> imageNotificationMap = new ResourceStorage().createNotificationMap();
    ArrayList<?super View> listViews;
    ViewStorage viewStorage;
    public static final String APP_PREFERENCES = "mysettings";
    public static final String APP_PREFERENCES_COUNTER = "counter";
    SharedPreferences mSettings;
    Set<String> counter = new HashSet<String>();

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
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
        Toast toast;
        //todo Fix all actions button
        if(imageNamesMap.get(id).equals(name.toLowerCase())){
            tvName.setText("You're right! The title is " + imageNamesMap.get(id)+" \nInteresting fact: "+imageNotificationMap.get(id));
            toast=Toast.makeText(getApplicationContext(),imageNotificationMap.get(id),Toast.LENGTH_LONG);
            counter.add(imageNamesMap.get(id));

        } else {
            tvName.setText("NO! Try again!");
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
            counter = mSettings.getStringSet(APP_PREFERENCES_COUNTER, null);
        }
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        loadResults();
        super.onResume();

        /*if (mSettings.contains(APP_PREFERENCES_COUNTER)) {
            // Получаем число из настроек
            counter = mSettings.getStringSet(APP_PREFERENCES_COUNTER, null);
        }*/

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
