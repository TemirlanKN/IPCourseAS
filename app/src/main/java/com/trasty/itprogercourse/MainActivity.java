package com.trasty.itprogercourse;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = findViewById(R.id.button2);
        TextView mainText = findViewById(R.id.mainText);
        button2.setOnClickListener(view -> {
//                showInfo(mainText.getText().toString(), button2);
            showInfoAlert("Do you want to exit?");
        });

    }

    public void buttonClick(View v){
        showInfo(((Button) v).getText().toString(), ((Button) v));
    }

    private void showInfo(String text, Button button){
        button.setText(R.string.ClickedText);
        button.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    private void showInfoAlert(String text){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Big hint")
                .setMessage(text)
                .setCancelable(false)
                .setPositiveButton("Yes", (dialogInterface, i) -> finish())
                .setNegativeButton("No", (dialogInterface, i) -> dialogInterface.cancel());
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}





