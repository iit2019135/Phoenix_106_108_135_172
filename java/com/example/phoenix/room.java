package com.example.phoenix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class room extends AppCompatActivity {
    int room_no = 0;
    public static final String MESSAGE_TEXT_INT = "com.example.phoenix.example.message_num";
    private Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
        Intent intent = getIntent();

        String text = intent.getStringExtra(MainActivity.MESSAGE_TEXT);
        room_no=Integer.parseInt(text) ;
        text = "Room "+ text ;

        TextView textview1 = (TextView) findViewById(R.id.room_no_info);
        textview1.setText(text);

        Button b1 = (Button)findViewById(R.id.edit_devices_button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_edit_devices_activity(room_no);
            }
        });

        Button b2 = (Button)findViewById(R.id.enter_data_button);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_enter_data_activity(room_no);
            }
        });

        add_ac( "AC_1",27,"ON","ON");
        add_fan("fan_1","ON",3);
        add_heater( "HEATER_1",27,"ON","ON");
        add_ventilator("vent_1","ON");

    }

    public void add_ac (String name,int temperature, String on_off , String swing){
        LinearLayout parent = (LinearLayout) findViewById(R.id.linear_layout_of_room);
        parent.setOrientation(LinearLayout.VERTICAL);

        int paddingDp = 10;
        float density = getResources().getDisplayMetrics().density;
        int paddingPixel = (int)(paddingDp * density);

        LinearLayout ac_layout = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams wrapcontentparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        ac_layout.setPadding(paddingPixel,paddingPixel,paddingPixel,paddingPixel);
        ac_layout.setLayoutParams(params);
        ac_layout.setOrientation(LinearLayout.HORIZONTAL);

        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.ac_icon);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(12*paddingPixel, 12*paddingPixel);
        image.setLayoutParams(layoutParams);
        image.setPadding(paddingPixel,paddingPixel,paddingPixel,paddingPixel);
        ac_layout.addView(image);

        LinearLayout texts = new LinearLayout(this);
        texts.setPadding(3*paddingPixel,0,0,0);
        texts.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,12*paddingPixel));
        texts.setOrientation(LinearLayout.VERTICAL);

        TextView ac_name = new TextView(this);
        ac_name.setLayoutParams(wrapcontentparams);
        ac_name.setText("AC_NAME");
        ac_name.setTextSize(25);
        ac_name.setTextColor(getResources().getColor(android.R.color.black));
        texts.addView(ac_name);

        TextView ac_on_off = new TextView(this);
        ac_on_off.setText(on_off);
        ac_on_off.setLayoutParams(wrapcontentparams);
        ac_on_off.setTextColor(getResources().getColor(android.R.color.black));
        ac_on_off.setTextSize(15);
        texts.addView(ac_on_off);

        TextView ac_temperature = new TextView(this);
        ac_temperature.setText("Temperature : "+temperature);
        ac_temperature.setLayoutParams(wrapcontentparams);
        ac_temperature.setTextSize(15);
        ac_temperature.setTextColor(getResources().getColor(android.R.color.black));
        texts.addView(ac_temperature);

        TextView ac_swing = new TextView(this);
        ac_swing.setLayoutParams(wrapcontentparams);
        ac_swing.setText("Swing : "+swing);
        ac_swing.setTextColor(getResources().getColor(android.R.color.black));
        ac_swing.setTextSize(15);
        texts.addView(ac_swing);

        ac_layout.addView(texts);

        parent.addView(ac_layout);
    }

    public void add_heater (String name,int temperature, String on_off , String swing){
        LinearLayout parent = (LinearLayout) findViewById(R.id.linear_layout_of_room);
        parent.setOrientation(LinearLayout.VERTICAL);

        int paddingDp = 10;
        float density = getResources().getDisplayMetrics().density;
        int paddingPixel = (int)(paddingDp * density);

        LinearLayout heater_layout = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams wrapcontentparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        heater_layout.setPadding(paddingPixel,paddingPixel,paddingPixel,paddingPixel);
        heater_layout.setLayoutParams(params);
        heater_layout.setOrientation(LinearLayout.HORIZONTAL);

        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.heater_icon);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(12*paddingPixel, 12*paddingPixel);
        image.setLayoutParams(layoutParams);
        image.setPadding(paddingPixel,paddingPixel,paddingPixel,paddingPixel);
        heater_layout.addView(image);

        LinearLayout texts = new LinearLayout(this);
        texts.setPadding(3*paddingPixel,0,0,0);
        texts.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,12*paddingPixel));
        texts.setOrientation(LinearLayout.VERTICAL);

        TextView heater_name = new TextView(this);
        heater_name.setLayoutParams(wrapcontentparams);
        heater_name.setText(name);
        heater_name.setTextSize(25);
        heater_name.setTextColor(getResources().getColor(android.R.color.black));
        texts.addView(heater_name);

        TextView heater_on_off = new TextView(this);
        heater_on_off.setText(on_off);
        heater_on_off.setLayoutParams(wrapcontentparams);
        heater_on_off.setTextColor(getResources().getColor(android.R.color.black));
        heater_on_off.setTextSize(15);
        texts.addView(heater_on_off);

        TextView heater_temperature = new TextView(this);
        heater_temperature.setText("Temperature : "+temperature);
        heater_temperature.setLayoutParams(wrapcontentparams);
        heater_temperature.setTextSize(15);
        heater_temperature.setTextColor(getResources().getColor(android.R.color.black));
        texts.addView(heater_temperature);

        TextView heater_swing = new TextView(this);
        heater_swing.setLayoutParams(wrapcontentparams);
        heater_swing.setText("Swing : "+swing);
        heater_swing.setTextColor(getResources().getColor(android.R.color.black));
        heater_swing.setTextSize(15);
        texts.addView(heater_swing);

        heater_layout.addView(texts);

        parent.addView(heater_layout);
    }

    public void add_ventilator (String name,String on_off ){
        LinearLayout parent = (LinearLayout) findViewById(R.id.linear_layout_of_room);
        parent.setOrientation(LinearLayout.VERTICAL);

        int paddingDp = 10;
        float density = getResources().getDisplayMetrics().density;
        int paddingPixel = (int)(paddingDp * density);

        LinearLayout ventilator_layout = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams wrapcontentparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        ventilator_layout.setPadding(paddingPixel,paddingPixel,paddingPixel,paddingPixel);
        ventilator_layout.setLayoutParams(params);
        ventilator_layout.setOrientation(LinearLayout.HORIZONTAL);

        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.ventilator_icon);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(12*paddingPixel, 12*paddingPixel);
        image.setLayoutParams(layoutParams);
        image.setPadding(paddingPixel,paddingPixel,paddingPixel,paddingPixel);
        ventilator_layout.addView(image);

        LinearLayout texts = new LinearLayout(this);
        texts.setPadding(3*paddingPixel,0,0,0);
        texts.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,12*paddingPixel));
        texts.setOrientation(LinearLayout.VERTICAL);

        TextView ventilator_name = new TextView(this);
        ventilator_name.setLayoutParams(wrapcontentparams);
        ventilator_name.setText(name);
        ventilator_name.setTextSize(25);
        ventilator_name.setTextColor(getResources().getColor(android.R.color.black));
        texts.addView(ventilator_name);

        TextView ventilator_on_off = new TextView(this);
        ventilator_on_off.setText(on_off);
        ventilator_on_off.setLayoutParams(wrapcontentparams);
        ventilator_on_off.setTextColor(getResources().getColor(android.R.color.black));
        ventilator_on_off.setTextSize(15);
        texts.addView(ventilator_on_off);

        ventilator_layout.addView(texts);

        parent.addView(ventilator_layout);
    }

    public void add_fan (String name,String on_off ,int speed){
        LinearLayout parent = (LinearLayout) findViewById(R.id.linear_layout_of_room);
        parent.setOrientation(LinearLayout.VERTICAL);

        int paddingDp = 10;
        float density = getResources().getDisplayMetrics().density;
        int paddingPixel = (int)(paddingDp * density);

        LinearLayout fan_layout = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams wrapcontentparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        fan_layout.setPadding(paddingPixel,paddingPixel,paddingPixel,paddingPixel);
        fan_layout.setLayoutParams(params);
        fan_layout.setOrientation(LinearLayout.HORIZONTAL);

        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.fan_icon);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(12*paddingPixel, 12*paddingPixel);
        image.setLayoutParams(layoutParams);
        image.setPadding(paddingPixel,paddingPixel,paddingPixel,paddingPixel);
        fan_layout.addView(image);

        LinearLayout texts = new LinearLayout(this);
        texts.setPadding(3*paddingPixel,0,0,0);
        texts.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,12*paddingPixel));
        texts.setOrientation(LinearLayout.VERTICAL);

        TextView fan_name = new TextView(this);
        fan_name.setLayoutParams(wrapcontentparams);
        fan_name.setText(name);
        fan_name.setTextSize(25);
        fan_name.setTextColor(getResources().getColor(android.R.color.black));
        texts.addView(fan_name);

        TextView fan_on_off = new TextView(this);
        fan_on_off.setText(on_off);
        fan_on_off.setLayoutParams(wrapcontentparams);
        fan_on_off.setTextColor(getResources().getColor(android.R.color.black));
        fan_on_off.setTextSize(15);
        texts.addView(fan_on_off);

        TextView fan_speed = new TextView(this);
        fan_speed.setText("speed : "+speed);
        fan_speed.setLayoutParams(wrapcontentparams);
        fan_speed.setTextColor(getResources().getColor(android.R.color.black));
        fan_speed.setTextSize(15);
        texts.addView(fan_speed);

        fan_layout.addView(texts);

        parent.addView(fan_layout);
    }

    public void open_edit_devices_activity(int x){
        Intent intent = new Intent(this, edit_devices.class);
        intent.putExtra(MESSAGE_TEXT_INT,x);
        startActivity(intent);
    }
    public void open_enter_data_activity(int x){
        Intent intent = new Intent(this, enter_data.class);
        intent.putExtra(MESSAGE_TEXT_INT,x);
        startActivity(intent);
    }
}
