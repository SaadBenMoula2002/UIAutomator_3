package com.example.uiautomator_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1EditText, num2EditText;
    private TextView resultTextView;
    private Button sumButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1EditText = findViewById(R.id.number1);
        num2EditText = findViewById(R.id.number2);
        resultTextView = findViewById(R.id.result);
        sumButton = findViewById(R.id.calculate);

        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(num1EditText.getText().toString());
                int num2 = Integer.parseInt(num2EditText.getText().toString());
                int result = num1 + num2;
                resultTextView.setText(String.valueOf(result));
            }
        });
    }
}
