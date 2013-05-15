package com.daydreambelieber.rattletattle;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class DisplayToggleResponseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_toggle_response);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_toggle_response, menu);
		return true;
	}

}
