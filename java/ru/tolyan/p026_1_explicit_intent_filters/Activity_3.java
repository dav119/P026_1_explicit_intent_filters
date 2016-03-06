package ru.tolyan.p026_1_explicit_intent_filters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Activity_3 extends AppCompatActivity {

    TextView txtCurrentDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        txtCurrentDate = (TextView) findViewById(R.id.txtCurrentDate);
        SimpleDateFormat sdfCurrentDate = new SimpleDateFormat("dd LLLL yyyy");
        String strCurrentDate = sdfCurrentDate.format(new Date(System.currentTimeMillis()));
        txtCurrentDate.setText(strCurrentDate);
    }
}
