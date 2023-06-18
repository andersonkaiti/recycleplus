package com.recycleplus.projetorecycleplus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;

public class PapelHigienico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_papel_higienico);

        Toolbar toolbar = findViewById(R.id.toolbarPapelHigienico);
        ToolbarUtil.setupToolbar(this, toolbar);
    }
}