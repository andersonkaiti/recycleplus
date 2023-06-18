package com.recycleplus.projetorecycleplus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class Jornal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jornal);

        Toolbar toolbar = findViewById(R.id.toolbarJornal);
        ToolbarUtil.setupToolbar(this, toolbar);
    }
}