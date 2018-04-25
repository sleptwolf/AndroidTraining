package com.sleptwolf.learning6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener{


    private TextView txtView1;
    private GestureDetectorCompat gestureDetector;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView1 = (TextView)findViewById(R.id.textView);

        this.gestureDetector = new GestureDetectorCompat(this,this);

        gestureDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        txtView1.setText("single tap");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        txtView1.setText("double tap");
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        txtView1.setText("double tap event");
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        txtView1.setText("on Down");
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        txtView1.setText("on show press");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        txtView1.setText("single tap up");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        txtView1.setText("single scroll");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        txtView1.setText("long press");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        txtView1.setText("on fling");
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
