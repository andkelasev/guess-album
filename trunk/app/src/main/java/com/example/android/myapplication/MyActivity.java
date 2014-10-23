package com.example.android.myapplication;

import android.app.Activity;
import android.content.Intent;
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

public class MyActivity extends Activity implements OnClickListener {

    TextView tvName;
    StartIntentFromActivity intentFromActivity = new StartIntentFromActivity();
    int leftMargin = 10;
    HashMap<String,String> imageNamesMap = new ResourceStorage().createResourcesMap();
    ArrayList<?super View> listViews;
    ViewStorage viewStorage;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        viewStorage = new ViewStorage(this);

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
        //todo Fix all actions button
        if(imageNamesMap.get(id).equals(name.toLowerCase())){
            tvName.setText("name is " + imageNamesMap.get(id));
        } else {
            tvName.setText("NO");
        }

    }
}
