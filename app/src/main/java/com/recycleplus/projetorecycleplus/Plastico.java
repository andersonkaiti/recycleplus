package com.recycleplus.projetorecycleplus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;

public class Plastico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plastico);

        Toolbar toolbar = findViewById(R.id.toolbarPlastico);
        ToolbarUtil.setupToolbar(this, toolbar);
    }
}