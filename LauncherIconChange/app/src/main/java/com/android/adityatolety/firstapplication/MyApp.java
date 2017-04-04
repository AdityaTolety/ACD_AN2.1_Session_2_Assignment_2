package com.android.adityatolety.firstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MyApp extends AppCompatActivity implements View.OnClickListener{

    String text;
    EditText editText;
    Button eButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app);

        editText  = (EditText) findViewById(R.id.editText);
        eButton = (Button) findViewById(R.id.button);
        eButton.setOnClickListener(this) ;

    }

    public void onClick(View v){
        int viewId = v.getId();
        switch(viewId) {
            case R.id.button:
                text = editText.getText().toString();
                Intent eIntent = new Intent(this, display.class);
                eIntent.putExtra("INFO",text);
                startActivity(eIntent);

        }


    }
}
