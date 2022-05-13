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

    public Button forward;
    public EditText name;
    public EditText lastName;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        forward = (Button) findViewById(R.id.btnActTwo);
        name = (EditText) findViewById(R.id.name);
        lastName = (EditText) findViewById(R.id.lastname);
    }


    public void goNewView(View v) {
        switch (v.getId()) {
            case R.id.btnActTwo:
                // Говорим между какими Activity будет происходить связь
                Intent intent = new Intent(this, MainActivity2.class);

                // указываем первым параметром ключ, а второе значение
                // по ключу мы будем получать значение с Intent
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("lastname", lastName.getText().toString());

                // показываем новое Activity
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}