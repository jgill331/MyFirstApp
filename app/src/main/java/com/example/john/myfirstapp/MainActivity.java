package com.example.john.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.john.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        EditText editText = (EditText)findViewById(R.id.editText);
        String msg = editText.getText().toString();
        //Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        //toast.show();
        Intent intent = new Intent(this, DisplayTextActivity.class);
        intent.putExtra(EXTRA_MESSAGE, msg);
        startActivity(intent);

    }
}
