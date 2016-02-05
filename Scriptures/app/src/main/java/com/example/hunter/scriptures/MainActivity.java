package com.example.hunter.scriptures;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static Button button_sbm;
    private static EditText et;
    private static EditText et2;
    private static EditText et3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.book1);
        et2 = (EditText) findViewById(R.id.chap);
        et3 = (EditText) findViewById(R.id.verse1);

        onClickButtonListener();
    }

    public void onClickButtonListener() {
        button_sbm = (Button) findViewById(R.id.button);
        button_sbm.setOnClickListener(
            new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent intent  = new Intent("com.example.main2activity.Main2Activity");
                    intent.putExtra("bookName", et.getText().toString());
                    intent.putExtra("chapName", et2.getText().toString());
                    intent.putExtra("verseName", et3.getText().toString());
                    startActivity(intent);
                }

            }
        );
    }
}
