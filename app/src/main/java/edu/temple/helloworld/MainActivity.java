package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button;

        button = (Button) findViewById(R.id.firstButton);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView view = (TextView) findViewById(R.id.textView);
                view.setText("You have clicked the button");
            }
        });
    }
}
