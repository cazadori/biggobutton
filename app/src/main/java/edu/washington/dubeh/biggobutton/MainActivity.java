package edu.washington.dubeh.biggobutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final Button pushMe = (Button) findViewById(R.id.btnPushMe);
        pushMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                pushMe.setText("You have pushed me " + counter + " times!");
            }
        });
    }
}
