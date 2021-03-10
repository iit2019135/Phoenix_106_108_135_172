package com.example.phoenix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        LinearLayout parent = (LinearLayout)findViewById(R.id.linear_layout_of_test);

        RelativeLayout relativeLayout = new RelativeLayout(this);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(parent.getWidth(), 120);

        TextView t1 = new TextView(this);
        t1.setText("AC");
        relativeLayout.addView(t1);

        TextView t2 = new TextView(this);
        t2.setText("swing : on");
        relativeLayout.addView(t2);

        TextView t3 = new TextView(this);
        t3.setText("temperature : 24");
        relativeLayout.addView(t3);

        TextView t4 = new TextView(this);
        t4.setText("ON");
        relativeLayout.addView(t4);

        TextView t5 = new TextView(this);
        t5.setText("Room : ");
        relativeLayout.addView(t5);

        ImageView i1 = new ImageView(this);
        i1.setImageResource(R.drawable.ac_icon);
        relativeLayout.addView(i1);

        relativeLayout.setBackgroundColor(0x0000FF00);
        relativeLayout.setLayoutParams(params);
        parent.addView(relativeLayout);
    }
}
