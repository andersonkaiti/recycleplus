package com.recycleplus.projetorecycleplus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.recycleplus.projetorecycleplus.databinding.ActivityTiposDeLixosBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class TiposLixos extends AppCompatActivity {
    ActivityTiposDeLixosBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTiposDeLixosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        ColorStateList colorStateList = ColorStateList.valueOf(ContextCompat.getColor(this, R.color.white));
        bottomNavigationView.setItemIconTintList(colorStateList);
        bottomNavigationView.setItemTextColor(colorStateList);

        replaceFragment(new lixosFragment());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.reger:
                    replaceFragment(new REGERFragment());
                    break;
                case R.id.lixos:
                    replaceFragment(new lixosFragment());
                    break;
                case R.id.creditos:
                    replaceFragment(new creditosFragment());
                    break;
            }
            return true;
        });
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home) {
            finish();
        }
        return super.onContextItemSelected(item);
    }

    private void replaceFragment (Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
}