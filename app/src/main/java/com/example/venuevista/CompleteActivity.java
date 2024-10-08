package com.example.venuevista;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CompleteActivity extends AppCompatActivity {

    private TextView backHome;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete);

        backHome = findViewById(R.id.back_home);

        backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CompleteActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
