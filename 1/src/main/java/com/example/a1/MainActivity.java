package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView myTextVar;
    private CheckBox chkBox;
    private Button B1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextVar = findViewById(R.id.myText);
        chkBox = findViewById(R.id.checkBox);
        B1 = findViewById(R.id.button);

        myTextVar.setText("New text in TextView");

        chkBox.setChecked(true);

        B1.setEnabled(false);

    }
}