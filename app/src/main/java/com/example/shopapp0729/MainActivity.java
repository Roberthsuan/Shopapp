package com.example.shopapp0729;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

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


    public void GoToStore(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:24.25953528808525, 120.64478512930843?q=Sunrise Xinyi Branch")); // geo是用於地理資訊的字詞
        startActivity(i);
    }

    public void clickDIAL(View view){
        Intent i = new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:+123456"));
        startActivity(i);
    }
}