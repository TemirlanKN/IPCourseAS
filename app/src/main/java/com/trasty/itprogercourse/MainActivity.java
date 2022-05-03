package com.trasty.itprogercourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private FirstFragment firstFragment = new FirstFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_fragment1 = findViewById(R.id.btn_fragment1);
        Button btn_fragment2 = findViewById(R.id.btn_fragment2);

        setNewFragment(firstFragment);

        btn_fragment1.setOnClickListener(view -> setNewFragment(firstFragment));

        btn_fragment2.setOnClickListener(view -> {
                SecondFragment secondFragment = new SecondFragment();
                setNewFragment(secondFragment);
        });
    }

    private void setNewFragment(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame_layout, fragment);
        ft.addToBackStack(null);
        ft.commit();
    }
}