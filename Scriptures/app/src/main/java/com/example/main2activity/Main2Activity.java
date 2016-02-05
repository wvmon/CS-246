package com.example.main2activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.hunter.scriptures.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView nameView = (TextView) findViewById(R.id.results);
        nameView.setText(getIntent().getExtras().getString("bookName") + " "
                        + getIntent().getExtras().getString("chapName") + ":"
                        + getIntent().getExtras().getString("verseName"));
    }
}
