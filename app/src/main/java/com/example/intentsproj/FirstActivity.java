package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        final EditText txt1 = (EditText) findViewById(R.id.etxt1);
        final EditText txt2 = (EditText) findViewById(R.id.etxt2);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View view) {

               Context context = getApplicationContext(); //The context to use. Usually your Application or Activity object
               CharSequence message = "You just clicked the OK button";
               //Display string
               int duration = Toast.LENGTH_SHORT; //How long the toast message will lasts
               Toast toast = Toast.makeText(context, message, duration);
               toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 0);

               toast.show();

               String n1 = txt1.getText().toString();
               String n2 = txt2.getText().toString();

               Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
               intent.putExtra("value1", n1);
               intent.putExtra("value2", n2);
               startActivity(intent);
           }
       });
    }
}