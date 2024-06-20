package com.example.lab6_popupmenu;

import android.os.Bundle;
import android.widget.Button;
import android.widget.PopupMenu;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnPopupMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPopupMenu = findViewById(R.id.btnPopupMenu);
        btnPopupMenu.setOnClickListener(v -> showPopupMenu());
    }

    private void showPopupMenu() {
        PopupMenu popupMenu = new PopupMenu(this, btnPopupMenu);
        popupMenu.getMenuInflater().inflate(R.menu.menu_popup, popupMenu.getMenu());
        popupMenu.show();
    }
}