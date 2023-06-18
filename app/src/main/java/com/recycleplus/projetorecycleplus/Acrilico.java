package com.recycleplus.projetorecycleplus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class Acrilico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acrilico);

        Toolbar toolbar = findViewById(R.id.toolbarAcrilico);
        ToolbarUtil.setupToolbar(this, toolbar);
    }
}