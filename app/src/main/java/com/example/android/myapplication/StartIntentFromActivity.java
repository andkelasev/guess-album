package com.example.android.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

/**
 * Created by admin-pc on 22.10.2014.
 */
public class StartIntentFromActivity extends Activity{
    Intent intent;
    public Intent startIntent(View v){
        switch (v.getId()){
            case R.id.imageButton11:
                intent = new Intent("com.example.android.testview.nevermind");
                break;
            case R.id.imageButton21:
                intent = new Intent("com.example.android.testview.pinkfl");
                break;
        }
        return intent;
    }
}
