package com.recycleplus.projetorecycleplus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class SaquinhoCha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saquinho_cha);

        Toolbar toolbar = findViewById(R.id.toolbarSaquinhoCha);
        ToolbarUtil.setupToolbar(this, toolbar);
    }
}