package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    TextView resultTextView;
    Button add_button;
    Button sub_button;
    Button mul_button;
    Button div_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTextView = findViewById(R.id.textView);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        add_button = findViewById(R.id.button1);
        sub_button = findViewById(R.id.button2);
        mul_button = findViewById(R.id.button3);
        div_button = findViewById(R.id.button4);
    }
    public void clicButt1(View view){
        float num1 = Float.parseFloat(editText1.getText().toString());
        float num2 = Float.parseFloat(editText2.getText().toString());
        float res = num1 + num2;
        resultTextView.setText(String.valueOf(res));
    }
    public void clicButt2(View view){
        float num1 = Float.parseFloat(editText1.getText().toString());
        float num2 = Float.parseFloat(editText2.getText().toString());
        float res = num1 - num2;
        resultTextView.setText(String.valueOf(res));
    }
    public void clicButt3(View view){
        float num1 = Float.parseFloat(editText1.getText().toString());
        float num2 = Float.parseFloat(editText2.getText().toString());
        float res = num1 * num2;
        resultTextView.setText(String.valueOf(res));
    }
    public void clicButt4(View view){
        float num1 = Float.parseFloat(editText1.getText().toString());
        float num2 = Float.parseFloat(editText2.getText().toString());
        float res = num1 / num2;
        resultTextView.setText(String.valueOf(res));
    }
}