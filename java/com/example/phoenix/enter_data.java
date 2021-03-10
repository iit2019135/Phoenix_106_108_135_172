package com.example.phoenix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class enter_data extends AppCompatActivity {
    int room_no = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_data);
        Intent intent = getIntent();
        room_no=intent.getIntExtra(room.MESSAGE_TEXT_INT,0);
        TextView t1 = (TextView)findViewById(R.id.textview_2);
        t1.setText("Room "+room_no);
    }
}
