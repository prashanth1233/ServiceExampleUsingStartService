package com.example.prasanth.serviceexample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class ActivityService extends Service {

    int value;

    @Override
    public void onCreate() {
        Toast.makeText(this,"oncrate() called",Toast.LENGTH_LONG).show();
    }

    public int onStartCommand(Intent intent,int flags,int startId)
    {
        super.onStartCommand(intent,flags,startId);
        Toast.makeText(this,"onStartCommand called",Toast.LENGTH_LONG).show();
        return value;
    }

    public void onStart(Intent intent,int startId)
    {
        super.onStart(intent,startId);
        Toast.makeText(this,"onStart called",Toast.LENGTH_LONG).show();
    }

    public void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this,"onDestroy called",Toast.LENGTH_LONG).show();
    }

    public IBinder onBind(Intent intent)
    {
        Toast.makeText(this,"onBind called",Toast.LENGTH_LONG).show();
        return null;
    }

    public boolean onUnbind(Intent intent)
    {
        Toast.makeText(this,"onUnbindCalled",Toast.LENGTH_LONG).show();
        return false;
    }

    public void onRebind(Intent intent)
    {
        Toast.makeText(this,"onrebind called",Toast.LENGTH_LONG).show();

    }

}
