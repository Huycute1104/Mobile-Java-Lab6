package com.example.popup_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity {

    Button btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMenu = (Button) findViewById(R.id.btnMenu);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowMenu();
            }
        });
    }
//tạo riêng function
    private void ShowMenu() {
        PopupMenu popupMenu = new PopupMenu(this, btnMenu);
        popupMenu.getMenuInflater().inflate(R.menu.menu_popup, popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.menuThem: btnMenu.setText("Menu Them");
                    break;
                    case R.id.menuSua: btnMenu.setText("Menu Sua");
                        break;
                    case R.id.menuXoa: btnMenu.setText("Menu Xoa");
                        break;
                }
                return false;
            }
        });
        popupMenu.show();
    }
}