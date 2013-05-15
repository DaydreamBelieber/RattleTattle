package com.daydreambelieber.rattletattle;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.widget.Toast;

@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
public class ListenForRattle extends Service {
	
    private static final int NOTIFICATION_EX = 1;
    private NotificationManager notificationManager;
	
	public ListenForRattle() {
	}
	
	@Override
	public IBinder onBind(Intent intent) {
		// TODO: Return the communication channel to the service.
		throw new UnsupportedOperationException("Not yet implemented");
	}
	
	@Override
	public void onCreate(){

	}
	
    @Override
    public void onDestroy() {
  
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startid) {
    	Toast.makeText(this, "Started!", Toast.LENGTH_LONG).show();
    	
        return START_STICKY;
    }
}
