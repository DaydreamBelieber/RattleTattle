package com.daydreambelieber.rattletattle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class StartListener extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_listener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.start_listener, menu);
        return true;
    }
    
    /** Called when the user clicks the ToggleListenButton */
    public void toggleListen(View view) {
    	startService(new Intent(this, ListenForRattle.class));
    }
    
}
