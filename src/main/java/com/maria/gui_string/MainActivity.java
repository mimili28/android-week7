package com.maria.gui_string;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String messageKey = "MESSAGE_KEY";
    private String message="";
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
    }

    public void savePressed(View view){
        message=editText.getText().toString();
        Log.i("all","saved: " + message);
        Toast.makeText(this,"Saved successfully!",Toast.LENGTH_SHORT).show();
    }

    public void viewPressed(View view){
        Intent i = new Intent(MainActivity.this,Main2Activity.class);
        i.putExtra(messageKey,message);
        startActivity(i);
    }


}
