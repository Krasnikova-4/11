package com.example.a11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void omsk(View view) {
        Intent intent = new Intent(MainActivity.this, OmskActivity.class);
        startActivity(intent);
    }
    public void moskva(View view) {
        Intent intent = new Intent(MainActivity.this, MoskwaActivity.class);
        startActivity(intent);
    }
    public void kasp(View view) {
        Intent intent = new Intent(MainActivity.this, KaspActivity.class);
        startActivity(intent);
    }
    public void novosib(View view) {
        Intent intent = new Intent(MainActivity.this, NovosibActivity.class);
        startActivity(intent);
    }
    public void tum(View view) {
        Intent intent = new Intent(MainActivity.this, TumActivity.class);
        startActivity(intent);
    }
}