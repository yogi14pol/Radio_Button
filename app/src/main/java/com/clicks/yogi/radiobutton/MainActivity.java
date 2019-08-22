package com.clicks.yogi.radiobutton;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup MyGroup;
    RadioButton radio1,radio2,radio3,radio4;
    LinearLayout MyRelativeId;
    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radio1 = (RadioButton) findViewById(R.id.radio1);
        radio2 = (RadioButton) findViewById(R.id.radio2);
        radio3 = (RadioButton) findViewById(R.id.radio3);
        radio4 = (RadioButton) findViewById(R.id.radio4);

        click = (Button)findViewById(R.id.btn1);
        MyGroup = (RadioGroup)findViewById(R.id.MyGroupId);
        MyRelativeId = (LinearLayout)findViewById(R.id.MyRelativeId);

// onClick method for Button...
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (radio1.isChecked()) {
                    Toast.makeText(MainActivity.this, "Game of thrones",
                            Toast.LENGTH_SHORT).show();
                    MyRelativeId.setBackgroundColor(Color.MAGENTA);

                } else if (radio2.isChecked()) {
                    Toast.makeText(MainActivity.this, "Sherlock holmes",
                            Toast.LENGTH_SHORT).show();
                    MyRelativeId.setBackgroundColor(Color.TRANSPARENT);

                } else if (radio3.isChecked()) {
                    Toast.makeText(MainActivity.this, "Young Sheldon",
                            Toast.LENGTH_SHORT).show();
                    MyRelativeId.setBackgroundColor(Color.YELLOW);

                } else if (radio4.isChecked()) {
                    Toast.makeText(MainActivity.this, "Supernaturals",
                            Toast.LENGTH_SHORT).show();
                    MyRelativeId.setBackgroundColor(Color.WHITE);

                }
            }
        });


// RadioGroup onChecked...
        MyGroup.setOnCheckedChangeListener(new
                                                   RadioGroup.OnCheckedChangeListener() {

                                                       @Override
                                                       public void onCheckedChanged(RadioGroup group,int checkedId){

                                                           if (radio1.isChecked()) {

                                                               Toast.makeText(MainActivity.this, "Game of thrones",
                                                                       Toast.LENGTH_SHORT).show();

                                                               MyRelativeId.setBackgroundColor(Color.BLUE);

                                                           } else if (radio2.isChecked()) {

                                                               Toast.makeText(MainActivity.this, "Sherlock holmes",
                                                                       Toast.LENGTH_SHORT).show();
                                                               MyRelativeId.setBackgroundColor(Color.GRAY);

                                                           } else if (radio3.isChecked()) {

                                                               Toast.makeText(MainActivity.this, "Young Sheldon",
                                                                       Toast.LENGTH_SHORT).show();
                                                               MyRelativeId.setBackgroundColor(Color.CYAN);

                                                           } else if (radio4.isChecked()) {

                                                               Toast.makeText(MainActivity.this, "Supernaturals",
                                                                       Toast.LENGTH_SHORT).show();
                                                               MyRelativeId.setBackgroundColor(Color.RED);

                                                           }
                                                       }
                                                   });

    }
}