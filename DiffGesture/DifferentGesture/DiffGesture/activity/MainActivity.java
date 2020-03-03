package com.example.myapplication;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;


public class MainActivity extends AppCompatActivity implements
        GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener
{

    TextView txtView;
    GestureDetectorCompat detector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtView = findViewById(R.id.text_id);
        detector = new GestureDetectorCompat(this,this);
        detector.setOnDoubleTapListener(this);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        detector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        txtView.setText("onSingleTapConfirmed");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        txtView.setText("onDoubleTap");
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        txtView.setText("onDoubleTapEvent");
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        txtView.setText("onDown");
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        txtView.setText("onShowPress");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        txtView.setText("onSingleTap Up");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        txtView.setText("onScroll");
        return false;
    }



    @Override
    public void onLongPress(MotionEvent e) {
        txtView.setText("on long press");

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        txtView.setText("on fling");
        return false;
    }
}
