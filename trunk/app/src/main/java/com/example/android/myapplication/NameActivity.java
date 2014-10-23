package com.example.android.myapplication;

/**
 * Created by admin-pc on 19.10.2014.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class NameActivity extends Activity implements OnClickListener {

    EditText etName;
    Button btnOK;
    ImageView imageView;
    int backgroundImageId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
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
        } else if(action.equals("com.example.android.testview.pinkfl")){
            imageView.setBackgroundResource(R.drawable.pink_floyd);
            backgroundImageId=R.drawable.pink_floyd;
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