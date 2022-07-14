package com.example.simplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick (View view) {

        TextView show_first_name = findViewById(R.id.show_fname);
        TextView show_last_name = findViewById(R.id.show_lname);
        TextView show_e_mail = findViewById(R.id.show_email);

        EditText first_name = findViewById(R.id.fname);
        String f = first_name.getText().toString();
        EditText last_name = findViewById(R.id.lname);
        String l = last_name.getText().toString();
        EditText e_mail = findViewById(R.id.email);
        String email = e_mail.getText().toString();

        show_first_name.setText(String.format("First Name: %s", f));
        show_last_name.setText(String.format("Last Name: %s", l));
        show_e_mail.setText(String.format("Email: %s", email));


    }
}