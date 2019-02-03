package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mButtonTop;
    private Button mButtonBottom;
    private int mStoryindex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView)findViewById(R.id.storyTextView);
        mButtonTop = (Button)findViewById(R.id.buttonTop);
        mButtonBottom = (Button)findViewById(R.id.buttonBottom);

        //updateStory(true);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("DebugInfo","Top button clicked");
                updateStory(true);
                Log.d("DebugInfo","index=" + mStoryindex);
//                mStoryTextView.setText(R.string.T3_Story);
//                mButtonTop.setText(R.string.T3_Ans1);
//                mButtonBottom.setText(R.string.T3_Ans2);
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("DebugInfo","Bottom button clicked");
                updateStory(false);
                Log.d("DebugInfo","index=" + mStoryindex);
//                String bText = (String) mButtonBottom.getText();
//                Log.d("DebugInfo", "Button str: " + bText);
//
//                String s;
//                s=getResources().getString(R.string.T1_Ans2);
//                if(bText==s){
//                    Log.d("DebugInfo", "Button str == T1_Ans2");
//                }
            }
        });
    }

    private void updateStory(boolean answer){
        // if answer=True (Top button)
        if(mStoryindex==0)
        {
            mStoryindex=1;
            mStoryTextView.setText(R.string.T1_Story);
            mButtonTop.setText(R.string.T1_Ans1);
            mButtonBottom.setText(R.string.T1_Ans2);
//            return;
        } else if(mStoryindex==1)
        {
            if(answer){
                mStoryindex=3;
                mStoryTextView.setText(R.string.T3_Story);
                mButtonTop.setText(R.string.T3_Ans1);
                mButtonBottom.setText(R.string.T3_Ans2);
            }
            else
            {
                mStoryindex=2;
                mStoryTextView.setText(R.string.T2_Story);
                mButtonTop.setText(R.string.T2_Ans1);
                mButtonBottom.setText(R.string.T2_Ans2);
            }
//            return;
        } else if(mStoryindex==2)
        {
            if(answer){
                mStoryindex=3;
                mStoryTextView.setText(R.string.T3_Story);
                mButtonTop.setText(R.string.T3_Ans1);
                mButtonBottom.setText(R.string.T3_Ans2);
            }
            else
            {
                mStoryindex=4;
                mStoryTextView.setText(R.string.T4_End);
                mButtonTop.setVisibility(View.GONE);
                mButtonBottom.setVisibility(View.GONE);
            }
//            return;
        } else if(mStoryindex==3)
        {
            if(answer){
                mStoryindex=6;
                mStoryTextView.setText(R.string.T6_End);
                mButtonTop.setVisibility(View.GONE);
                mButtonBottom.setVisibility(View.GONE);
            }
            else
            {
                mStoryindex=5;
                mStoryTextView.setText(R.string.T5_End);
                mButtonTop.setVisibility(View.GONE);
                mButtonBottom.setVisibility(View.GONE);
            }
//            return;
        }
    }
}
