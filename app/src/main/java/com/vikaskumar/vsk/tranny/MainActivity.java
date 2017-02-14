package com.vikaskumar.vsk.tranny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    ViewGroup buckysLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buckysLayout = (ViewGroup) findViewById(R.id.buckysLayout);

        buckysLayout.setOnTouchListener(
            new RelativeLayout.OnTouchListener(){
                @Override
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    moveButton();
                    return true;
                }
            }
        );
    }

    public void moveButton(){
        View buckysButton = findViewById(R.id.buckysButton);

        //change the postition of the button
        RelativeLayout.LayoutParams postionRules = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        postionRules.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        postionRules.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
        buckysButton.setLayoutParams(postionRules);

        //change the postition of the button
        ViewGroup.LayoutParams sizeRules = buckysButton.getLayoutParams();
        sizeRules.width = 450;
        sizeRules.height = 300;
        buckysButton.setLayoutParams(sizeRules );

    }
}
