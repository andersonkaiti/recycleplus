package com.recycleplus.projetorecycleplus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class ResiduoJardinagem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_residuo_jardinagem);

        Toolbar toolbar = findViewById(R.id.toolbarResiduoJardinagem);
        ToolbarUtil.setupToolbar(this, toolbar);
    }
}