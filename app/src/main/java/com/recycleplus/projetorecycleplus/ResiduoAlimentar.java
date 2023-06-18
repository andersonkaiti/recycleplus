package com.recycleplus.projetorecycleplus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class ResiduoAlimentar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_residuo_alimentar);

        Toolbar toolbar = findViewById(R.id.toolbarResiduoAlimentar);
        ToolbarUtil.setupToolbar(this, toolbar);
    }
}