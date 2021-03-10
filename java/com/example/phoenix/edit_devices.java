package com.example.phoenix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class edit_devices extends AppCompatActivity {
    private Button button;
    private TextView textView,textView2,textView3;
    private EditText editText;
    RadioGroup radioGroup;
    RadioButton radioButton;
    public String device_name,s;
    int room_no = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_devices);

        Intent intent = getIntent();
        room_no=intent.getIntExtra(room.MESSAGE_TEXT_INT,0);

        TextView textView = (TextView)findViewById(R.id.textview_1);
        textView.setText("Room "+room_no);

        TextView textView2 = (TextView) findViewById(R.id.remove_device_textview);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_remove_a_device_activity();
            }
        });

        Button button = (Button)findViewById(R.id.add_device_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.device_name_edit_text);
                device_name = editText.getText().toString();
                RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_button_group);
                int selectedID = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(selectedID);
                s = radioButton.getText().toString();
                add_a_device(s, device_name);
            }
        });
    }
    void add_a_device(String s, String device_name)
    {
        TextView textView3 = (TextView)findViewById(R.id.test);
        textView3.setText( "A " + s + " with name "+device_name+" is added");
    }
    void open_remove_a_device_activity()
    {
        Intent intent = new Intent(this,remove_device.class);
        startActivity(intent);
    }
}
