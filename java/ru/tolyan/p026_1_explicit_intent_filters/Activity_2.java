package ru.tolyan.p026_1_explicit_intent_filters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Activity_2 extends AppCompatActivity {

    TextView txtCurrentTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        txtCurrentTime = (TextView) findViewById(R.id.txtCurrentTime);
        SimpleDateFormat dfCurrentTime = new SimpleDateFormat("kk:mm:ss");
        dfCurrentTime.setTimeZone(TimeZone.getTimeZone("UTC"));
        String strCurrentTime = dfCurrentTime.format(new Date(System.currentTimeMillis()));
        txtCurrentTime.setText(strCurrentTime);
    }
}
