package com.example.srirama.widgets;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class BasicWidget extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    TextView basicname;
    EditText username,basicmail,basicnumber;
    RadioGroup basicrg;
    RadioButton basicrb;
    Spinner basicdegree;
    CheckBox basicece,basiccse,basicit,basicmech;
    ListView basiccourse;
    ToggleButton basicnotification;
    Switch basicswitch;
    Button nextpage;
    String course []={"java","android","c#","html","sql"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_widget);
    basicname=(TextView)findViewById(R.id.tvbasicname);
        username=(EditText)findViewById(R.id.etusername);
        basicmail=(EditText)findViewById(R.id.etbasicemail);
        basicnumber=(EditText)findViewById(R.id.etbasicphno);
    basicrg=(RadioGroup)findViewById(R.id.rgbasic);
        basicdegree=(Spinner)findViewById(R.id.spindegree);
        basicece=(CheckBox)findViewById(R.id.cbbasicece);
        basiccse=(CheckBox)findViewById(R.id.cb_basic_cse);
        basicit=(CheckBox)findViewById(R.id.cb_basic_it);
        basicmech=(CheckBox)findViewById(R.id.cb_basic_mech);
       basiccourse=(ListView)findViewById(R.id.lvbasiccourse);
        basicnotification=(ToggleButton)findViewById(R.id.tb_notification);
        basicswitch=(Switch)findViewById(R.id.switch_basic);
        nextpage=(Button)findViewById(R.id.btn_basic_nextpage);

        ArrayAdapter list=new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,course){
                @Override
                public View getView(int position, View convertView, ViewGroup parent) {
                    TextView textView = (TextView) super.getView(position, convertView, parent);
                    textView.setTextColor(Color.GREEN);

                    return textView;
                }
            };
       basiccourse.setAdapter(list);
    }
    public void basicgender(View v){
        int geder= basicrg.getCheckedRadioButtonId();
        basicrb=(RadioButton)findViewById(geder);
    }
    public void addlistenerondegreeitemseleced(){
        basicdegree.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
