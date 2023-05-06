package com.example.recycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class EspelhoAmpolas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espelho_ampolas);

        Toolbar toolbar = findViewById(R.id.toolbarEspelho);
        ToolbarUtil.setupToolbar(this, toolbar);
    }
}