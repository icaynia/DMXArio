package com.icaynia.dmxario;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by icaynia on 2016. 11. 1..
 */
public class ControllerActivity extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout backbutton;
    private LinearLayout bluetoothButton;
    private customActionBar actionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controller);
        viewInitialize();
    }

    private void viewInitialize() {
        backbutton = (LinearLayout) findViewById(R.id.backbutton);
        backbutton.setOnClickListener(this);

        bluetoothButton = (LinearLayout) findViewById(R.id.bluetoothButton);
        bluetoothButton.setOnClickListener(this);

        actionBar = (customActionBar) findViewById(R.id.actionbar);
        actionBar.setTitle("컨트롤러");
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.backbutton:
                this.finish();
                break;
            case R.id.bluetoothButton:
                Intent intent = new Intent(ControllerActivity.this, SettingActivity.class);
                startActivity(intent);
                break;
        }
    }


}
