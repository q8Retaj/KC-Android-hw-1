package com.example.firsthw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView = findViewById(R.id.textView2);
        TextView textView1 = findViewById(R.id.textView4);
        EditText editText = findViewById(R.id.editTextTextPersonName5);
        EditText editText1 = findViewById(R.id.editTextTextPersonName);
        EditText editText2 = findViewById(R.id.editTextTextPersonName3);
        EditText editText3 = findViewById(R.id.editTextTextPersonName4);
        Button button = findViewById(R.id.button);
        Button button1 = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(editText.getText().toString());
                int num2 = Integer.parseInt(editText1.getText().toString());
                int num3 = Integer.parseInt(editText2.getText().toString());
                int num4 = Integer.parseInt(editText3.getText().toString());
                int result = num1 + num2 + num3 + num4;

                textView1.setText(String.valueOf(result));
            }


        });
       Button.
    }

}

