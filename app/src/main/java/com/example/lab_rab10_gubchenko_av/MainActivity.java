package com.example.lab_rab10_gubchenko_av;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.DOMException;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button button;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        context = getApplicationContext();
        EditText editText = findViewById(R.id.editText);

        editText.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                TextView textView = findViewById(R.id.textView);
                textView.setText(s);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity2.class);
                startActivity(intent);
//                EditText editText = findViewById(R.id.editText);
//
//                editText.addTextChangedListener(new Text(){
//                    @Override
//                    public void setTextContent(String textContent) throws DOMException {
//
//                    }
//                });
            }


        });
    }
}