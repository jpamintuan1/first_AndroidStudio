package com.example.josep.mylogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){

        Toast.makeText(MainActivity.this,"Login Successful!", Toast.LENGTH_LONG).show();




        EditText myTextField = (EditText) findViewById(R.id.myTextField);

        EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);

        Log.i("Info", myTextField.getText().toString());

        Log.i("Info", passwordEditText.getText().toString());
    }

    Button buttonSignupid = (Button) findViewById(R.id.buttonSignupid);

    buttonSignupid.setOnClickListener(new View.OnClickListener() {

    public void onClickListener(View view) {
            Toast.makeText(getBaseContext(),"Thank you for Signing up!", Toast.LENGTH_LONG).show();


       }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
