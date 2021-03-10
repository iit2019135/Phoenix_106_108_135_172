package com.example.phoenix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
