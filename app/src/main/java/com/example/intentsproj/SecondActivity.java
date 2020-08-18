package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

        EditText editText1, editText2;
        Button b;
        TextView Ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String etxt1 = intent.getStringExtra("value1");
        String etxt2 = intent.getStringExtra("value2");

        //Addiiton
        editText1 = (EditText)findViewById(R.id.etxt1);
        editText2 = (EditText)findViewById(R.id.etxt2);

        editText1.setText(etxt1);
        editText2.setText(etxt2);

        b = (Button) findViewById(R.id.add);
        Ans = (TextView) findViewById(R.id.Ans);

        b.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                int nu1 = Integer.parseInt(editText1.getText().toString());
                int nu2 = Integer.parseInt(editText2.getText().toString());

                int tot = nu1 + nu2;
                Ans.setText(nu1 +" + " + nu2 + " = "+tot);
            }
        });

        //Substraction
        editText1 = (EditText)findViewById(R.id.etxt1);
        editText2 = (EditText)findViewById(R.id.etxt2);
        b = (Button) findViewById(R.id.minize);
        Ans = (TextView) findViewById(R.id.Ans);

        b.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                int nu1 = Integer.parseInt(editText1.getText().toString());
                int nu2 = Integer.parseInt(editText2.getText().toString());

                int tot = nu1 - nu2;
                Ans.setText(nu1 +" - " + nu2 + " =  "+tot);
            }
        });

        //Multiple
        editText1 = (EditText)findViewById(R.id.etxt1);
        editText2 = (EditText)findViewById(R.id.etxt2);
        b = (Button) findViewById(R.id.multiple);
        Ans = (TextView) findViewById(R.id.Ans);

        b.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                int nu1 = Integer.parseInt(editText1.getText().toString());
                int nu2 = Integer.parseInt(editText2.getText().toString());

                int tot = nu1 * nu2;
                Ans.setText(nu1 +" x " + nu2 + " = "+tot);
            }
        });

        //Divide
        editText1 = (EditText)findViewById(R.id.etxt1);
        editText2 = (EditText)findViewById(R.id.etxt2);
        b = (Button) findViewById(R.id.divide);
        Ans = (TextView) findViewById(R.id.Ans);

        b.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                int nu1 = Integer.parseInt(editText1.getText().toString());
                int nu2 = Integer.parseInt(editText2.getText().toString());

                int tot = nu1 / nu2;
                Ans.setText(nu1 +" / " + nu2 + " = "+tot);
            }
        });
    }

}