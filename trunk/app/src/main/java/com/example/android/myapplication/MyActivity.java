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
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.HashMap;

public class MyActivity extends Activity implements OnClickListener {

    TextView tvName;
    ImageButton btnName1;
    ImageButton btnName2;
    ImageButton btnName3;
    ImageButton btnName4;
    int leftMargin = 10;
    HashMap<String,String> imageNamesMap = new ResourceStorage().createResourcesMap();

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(200, 200);
        TableRow.LayoutParams rw = new TableRow.LayoutParams(225,225);

        tvName = (TextView) findViewById(R.id.tvName);
        btnName1 = (ImageButton) findViewById(R.id.imageButton11);
        btnName1.setBackgroundResource(R.drawable.nevermind);
        btnName1.setLayoutParams(rw);

        btnName2 = (ImageButton) findViewById(R.id.imageButton12);
        btnName2.setBackgroundResource(R.drawable.nevermind);
        btnName2.setLayoutParams(rw);

        btnName3 = (ImageButton) findViewById(R.id.imageButton13);
        btnName3.setBackgroundResource(R.drawable.nevermind);
        btnName3.setLayoutParams(rw);

        ((ViewGroup.MarginLayoutParams) btnName3.getLayoutParams()).leftMargin = leftMargin;
        ((ViewGroup.MarginLayoutParams) btnName3.getLayoutParams()).topMargin = leftMargin;
        //TableLayout tl = (TableLayout) findViewById(R.id.parentTableLayout);
     //   TableRow tr=new TableRow(this);


        //btnName4 = (ImageButton) findViewById(R.id.imageButton21);
        btnName4=(ImageButton) findViewById(R.id.imageButton21);

        btnName4.setBackgroundResource(R.drawable.pink_floyd);
        btnName4.setLayoutParams(rw);
       // tr.addView(btnName4);
       // tl.addView(tr);


        btnName1.setOnClickListener(this);
        btnName4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.imageButton11:
                intent = new Intent("com.example.android.testview.nevermind");
                startActivityForResult(intent,1);
                break;
           case R.id.imageButton21:
                intent = new Intent("com.example.android.testview.pinkfl");
                startActivityForResult(intent,1);
                break;
        }

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (data == null) {return;}
        String context = this.getResources().getResourceEntryName(R.drawable.nevermind);
        String name = data.getStringExtra("name");
        String id = data.getStringExtra("id");
        if(imageNamesMap.get(id).equals(name.toLowerCase())){
            tvName.setText("name is " + imageNamesMap.get(id));
        } else {
            tvName.setText("NO");
        }

    }
}
