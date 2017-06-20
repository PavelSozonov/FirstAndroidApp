package com.example.pavel.firstandroidapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText editText;
    private Button button;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.gotoButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, SecondActivity.class));
            }
        });
    }

    public void clicked(View v) {
        Toast.makeText(this, editText.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
