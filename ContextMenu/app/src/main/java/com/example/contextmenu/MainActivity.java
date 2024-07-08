package com.example.contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnChonMau;
    ConstraintLayout manHinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnChonMau = findViewById(R.id.button_Chonmau);
        manHinh = findViewById(R.id.manHinh);

        // Đăng ký view cho context menu
        registerForContextMenu(btnChonMau);

        // Đặt sự kiện click vào nút để mở context menu
        btnChonMau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openContextMenu(v);
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_context, menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuDo:
                manHinh.setBackgroundColor(Color.RED);
                return true;
            case R.id.menuVang:
                manHinh.setBackgroundColor(Color.YELLOW);
                return true;
            case R.id.menuXanh:
                manHinh.setBackgroundColor(Color.BLUE);
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}
