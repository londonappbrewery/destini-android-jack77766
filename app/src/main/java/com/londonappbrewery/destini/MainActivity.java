package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declare member variables here:
    TextView storyTextView;
    Button topButton;
    Button botButton;
    Page currentPage;
    Page page1;
    Page page2;
    Page page3;
    Page page4;
    Page page5;
    Page page6;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize the pages and store them in a structure?
        page6 = new Page(R.string.T6_End, true);
        page5 = new Page(R.string.T5_End, true);
        page4 = new Page(R.string.T4_End, true);

        page3 = new Page(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2, page6, page5, false);
        page2 = new Page(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2, page5, page4, false);
        page1 = new Page(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2, page3, page2, false);

        currentPage = page1;

        // Wire up the 3 views from the layout to the member variables:
        storyTextView = (TextView) findViewById(R.id.storyTextView);
        topButton = (Button) findViewById(R.id.buttonTop);
        botButton = (Button) findViewById(R.id.buttonBottom);

        displayPage(currentPage);

        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPage = currentPage.getTopPage();
                Log.d("Crap", "page is: " + currentPage);
                displayPage(currentPage);
            }
        });

        botButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPage = currentPage.getBotPage();
                displayPage(currentPage);
            }
        });

    }
    public void displayPage(Page p){
        storyTextView.setText(p.getMainText());
        if(!p.isEnd) {
            topButton.setText(p.getTopButtonText());
            botButton.setText(p.getBotButtonText());
        }
        else {
            topButton.setVisibility(View.GONE);
            botButton.setVisibility(View.GONE);
        }
    }
}
