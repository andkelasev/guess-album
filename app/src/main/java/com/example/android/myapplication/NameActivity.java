package com.example.android.myapplication;

/**
 * Created by admin-pc on 19.10.2014.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class NameActivity extends Activity implements OnClickListener {

    EditText etName;
    Button btnOK;
    ImageView imageView;
    int backgroundImageId;
    String textnotify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.name);
        imageView = (ImageView) findViewById(R.id.icon);
        //imageView.setBackgroundResource(R.drawable.nevermind);

        etName = (EditText) findViewById(R.id.etName);
        btnOK = (Button) findViewById(R.id.btnOK);
        btnOK.setOnClickListener(this);
        btnOK.setOnClickListener(this);

        Intent intent = getIntent();
        String action = intent.getAction();
        if(action.equals("com.example.android.testview.nevermind")){
            backgroundImageId=R.drawable.nevermind;
            imageView.setBackgroundResource(R.drawable.nevermind);
            textnotify="LALALALLA";
        } else if(action.equals("com.example.android.testview.pinkfl")){
            imageView.setBackgroundResource(R.drawable.pink_floyd);
            backgroundImageId=R.drawable.pink_floyd;
        } else if(action.equals("com.example.android.testview.abbey")){
            imageView.setBackgroundResource(R.drawable.abbey_road);
            backgroundImageId=R.drawable.abbey_road;
        }
        else if(action.equals("com.example.android.testview.amidiot")){
            imageView.setBackgroundResource(R.drawable.american_idiot);
            backgroundImageId=R.drawable.american_idiot;
        }
        else if(action.equals("com.example.android.testview.animals")){
            imageView.setBackgroundResource(R.drawable.animals);
            backgroundImageId=R.drawable.animals;
        }
        else if(action.equals("com.example.android.testview.backinblack")){
            imageView.setBackgroundResource(R.drawable.back_in_black);
            backgroundImageId=R.drawable.back_in_black;
        }
        else if(action.equals("com.example.android.testview.kid")){
            imageView.setBackgroundResource(R.drawable.kid_a);
            backgroundImageId=R.drawable.kid_a;
        }
        else if(action.equals("com.example.android.testview.mothership")){
            imageView.setBackgroundResource(R.drawable.mothership);
            backgroundImageId=R.drawable.mothership;
        }
        else if(action.equals("com.example.android.testview.radioactivity")){
            imageView.setBackgroundResource(R.drawable.radioactivity);
            backgroundImageId=R.drawable.radioactivity;
        }
        else if(action.equals("com.example.android.testview.rage")){
            imageView.setBackgroundResource(R.drawable.rage_against_the_machine);
            backgroundImageId=R.drawable.rage_against_the_machine;
        }
        else if(action.equals("com.example.android.testview.peppers")){
            imageView.setBackgroundResource(R.drawable.sgt_peppers_lonely_hearts_club);
            backgroundImageId=R.drawable.sgt_peppers_lonely_hearts_club;
        }
        else if(action.equals("com.example.android.testview.unknown")){
            imageView.setBackgroundResource(R.drawable.unknown_pleasures);
            backgroundImageId=R.drawable.unknown_pleasures;
        }
        else if(action.equals("com.example.android.testview.velvet")){
            imageView.setBackgroundResource(R.drawable.velvet_underground);
            backgroundImageId=R.drawable.velvet_underground;
        }
        else if(action.equals("com.example.android.testview.war")){
            imageView.setBackgroundResource(R.drawable.war);
            backgroundImageId=R.drawable.war;
        }
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        intent.putExtra("id",String.valueOf(backgroundImageId));
        intent.putExtra("name", etName.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}