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
            case R.id.imageButton12:
                intent = new Intent("com.example.android.testview.pinkfl");
                break;
            case R.id.imageButton13:
                intent = new Intent("com.example.android.testview.abbey");
                break;
            case R.id.imageButton21:
                intent = new Intent("com.example.android.testview.war");
                break;
            case R.id.imageButton22:
                intent = new Intent("com.example.android.testview.velvet");
                break;
            case R.id.imageButton23:
                intent = new Intent("com.example.android.testview.unknown");
                break;
            case R.id.imageButton31:
                intent = new Intent("com.example.android.testview.peppers");
                break;
            case R.id.imageButton32:
                intent = new Intent("com.example.android.testview.rage");
                break;
            case R.id.imageButton33:
                intent = new Intent("com.example.android.testview.radioactivity");
                break;
            case R.id.imageButton41:
                intent = new Intent("com.example.android.testview.mothership");
                break;
            case R.id.imageButton42:
                intent = new Intent("com.example.android.testview.kid");
                break;
            case R.id.imageButton43:
                intent = new Intent("com.example.android.testview.backinblack");
                break;
            case R.id.imageButton51:
                intent = new Intent("com.example.android.testview.animals");
                break;
            case R.id.imageButton52:
                intent = new Intent("com.example.android.testview.amidiot");
                break;
            case R.id.imageButton53:
                intent = new Intent("com.example.android.testview.pinkfl");
                break;
        }
        return intent;
    }
}
