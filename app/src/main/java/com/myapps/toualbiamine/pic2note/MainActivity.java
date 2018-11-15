package com.myapps.toualbiamine.pic2note;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //another test comment
        setContentView(R.layout.activity_main);

        title = (TextView)findViewById(R.id.txtTitle);
    }
}
