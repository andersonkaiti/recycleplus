package com.recycleplus.projetorecycleplus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class Louca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_louca);

        Toolbar toolbar = findViewById(R.id.toolbarLouca);
        ToolbarUtil.setupToolbar(this, toolbar);
    }
}