package com.recycleplus.projetorecycleplus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class PoCafeCoador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_po_cafe_coador);

        Toolbar toolbar = findViewById(R.id.toolbarPoCafeCoador);
        ToolbarUtil.setupToolbar(this, toolbar);
    }
}