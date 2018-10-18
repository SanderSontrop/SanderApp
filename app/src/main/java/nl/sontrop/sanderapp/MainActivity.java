package nl.sontrop.sanderapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;    // Sander: logfile trick


public class MainActivity extends AppCompatActivity {

    // Sander: different stages  of activity
    // some variable to track it:
    private static final String TAG = "SanderMsg";

    // log for evey time the app changes state
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Resumé");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Destroyed by user");

    }



    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "okPauze");

    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // the onCreate stage:
        Log.i(TAG, "onCreate we're here");



        Button addBtn = (Button) findViewById(R.id.telopBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = (EditText) findViewById(R.id.eersteNummerEditTekst);
                EditText secondNumEditText = (EditText) findViewById(R.id.tweedeNummeredittekst);
                TextView resultTextView = (TextView) findViewById(R.id.resultText);

                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());

                int resultaat  = num1 + num2;
                resultTextView.setText(resultaat + "");

            }
        });
    }
}
