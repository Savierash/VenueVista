package com.example.venuevista;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
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

        Button buttonButton = findViewById(R.id.home_button);
        TextView chooseTextView = findViewById(R.id.choose);
        TextView choose1TextView = findViewById(R.id.choose1);
        TextView choose2TextView = findViewById(R.id.choose2);
        TextView choose3TextView = findViewById(R.id.choose3);

        Button Main2button = findViewById(R.id.main2_button);
        Main2button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //navigate to Main2Activity
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });


    }
}