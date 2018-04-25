package com.sleptwolf.learning5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);


        button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView textView = (TextView)findViewById(R.id.textView);
                        textView.setText("WOAH!!");
                    }
                }
        );

        button.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView textView = (TextView)findViewById(R.id.textView);
                        textView.setText("TOO MUCH CLICK!!");
                        return false;
                        // if return is true then the change from this action is permanent otherwise
                        //the change is only temporary for the amount of time the action occurs
                        //after the action stops or ceases the previous form is retained.
                    }
                }
        );
    }
}
