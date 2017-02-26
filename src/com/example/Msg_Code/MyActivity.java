package com.example.Msg_Code;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Toolbar;


public class MyActivity extends Activity {

    private Toolbar toolbar;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.main);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setActionBar(toolbar);
    }
}