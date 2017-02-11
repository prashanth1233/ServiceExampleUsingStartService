package com.example.prasanth.serviceexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ServiceStartingActivity extends Activity implements View.OnClickListener{

    private Button strtBttn,endBttn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_starting);
        strtBttn=(Button)findViewById(R.id.startService);
        endBttn=(Button)findViewById(R.id.stpService);
        strtBttn.setOnClickListener(this);
        endBttn.setOnClickListener(this);

    }

    public void onClick(View view)
    {
        switch (view.getId()) {

            case R.id.startService:
                startService(new Intent(ServiceStartingActivity.this,ActivityService.class));
                break;
            case R.id.stpService:
                stopService(new Intent(ServiceStartingActivity.this,ActivityService.class));
                break;
                default:
                    Toast.makeText(this,"No Ids found",Toast.LENGTH_LONG).show();
        }

    }
}
