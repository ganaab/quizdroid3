package edu.washington.ganaab.quizd2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class TopicsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);
        Button math = (Button) findViewById(R.id.button);
        Button physics = (Button) findViewById(R.id.button2);
        Button marvel = (Button) findViewById(R.id.button3);

        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextActivity = new Intent(TopicsActivity.this, OverviewActivity.class);
                QuizApp.getInstance().setCurrentTopic(0);
                if(nextActivity.resolveActivity(getPackageManager()) != null) {
                    startActivity(nextActivity);
                }
                finish();
            }
        });
        physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextActivity = new Intent(TopicsActivity.this, OverviewActivity.class);
                QuizApp.getInstance().setCurrentTopic(1);
                if(nextActivity.resolveActivity(getPackageManager()) != null) {
                    startActivity(nextActivity);
                }
                finish();
            }
        });
        marvel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextActivity = new Intent(TopicsActivity.this, OverviewActivity.class);
                QuizApp.getInstance().setCurrentTopic(2);
                if(nextActivity.resolveActivity(getPackageManager()) != null) {
                    startActivity(nextActivity);
                }
                finish();
            }
        });


    }
}
