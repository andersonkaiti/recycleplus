package com.recycleplus.projetorecycleplus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;

public class Aluminio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluminio);

        Toolbar toolbar = findViewById(R.id.toolbarAluminio);
        ToolbarUtil.setupToolbar(this, toolbar);
    }
}