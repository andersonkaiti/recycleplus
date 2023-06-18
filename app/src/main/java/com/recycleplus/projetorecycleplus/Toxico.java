package com.recycleplus.projetorecycleplus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ScrollView;

public class Toxico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toxico);

        Toolbar toolbar = findViewById(R.id.toolbarToxico);
        ToolbarUtil.setupToolbar(this, toolbar);

        ScrollView scrollView = findViewById(R.id.scrollViewToxico);
        scrollView.setScrollBarSize(25);
    }
}