package com.example.pankaj.appnumber2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txt1 = findViewById(R.id.txt1);
        TextView txt2 = findViewById(R.id.txt2);
        TextView txt3 = findViewById(R.id.txt3);

      /*  txt1.setText("My Own Text");

        String str1 = "some value";

        StringTokenizer strObject1 = new StringTokenizer(str1);

        txt2.setText(strObject1.nextToken());
        txt1.setText(strObject1.nextToken());
        */

      String str2 = "This is another text@this is your text@this is my text";

      StringTokenizer strObject2 = new StringTokenizer(str2,"@");

      txt1.setText(strObject2.nextToken());

      txt2.setText(strObject2.nextToken());

      txt3.setText(strObject2.nextToken() + " fine");

    }


}
