package com.example.srirama.widgets;

import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
     ToggleButton tb1;
    SwitchCompat swit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    tb1=(ToggleButton)findViewById(R.id.tbon);
     swit=(SwitchCompat)findViewById(R.id.s1);
        FloatingActionButton fab=(FloatingActionButton)findViewById(R.id.fab1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result=new StringBuilder();
                result.append("Toggle button:").append(tb1.getText());
                Snackbar snackbar =Snackbar.make(v,result.toString(),Snackbar.LENGTH_LONG).setAction("SWITCH ENABLE", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       swit.setChecked(false);
                    }
                });
          snackbar.setActionTextColor(Color.BLUE);
                snackbar.show();
            }
        });
       swit.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               Snackbar.make(buttonView,"switch state checked"+isChecked,Snackbar.LENGTH_LONG).setAction("set action",null).show();
           }
       });

    }

}
