package com.trasty.itprogercourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultTextView;
    private EditText number_field_1, number_field_2;
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.res_text);
        number_field_1 = findViewById(R.id.number_field_1);
        number_field_2 = findViewById(R.id.number_field_2);
        addButton = findViewById(R.id.add_button);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(number_field_1.getText().toString());
                float num2 = Float.parseFloat(number_field_2.getText().toString());
                float res = num1 + num2;
                resultTextView.setText(String.valueOf(res));
            }
        });
    }
}