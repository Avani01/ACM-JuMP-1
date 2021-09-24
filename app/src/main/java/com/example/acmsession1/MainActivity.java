package com.example.acmsession1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // declaring variables
    private TextView name_tv;
    private EditText name_text;
    private Button button;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find view by id for all elements
        name_tv = findViewById(R.id.name_tv);
        name_text = findViewById(R.id.name_text);
        button = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);

        // for performing action of the button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello ACM Members!", Toast.LENGTH_LONG).show();
            }
        });
    }

}