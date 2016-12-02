package rtc.jeeranun.sahassaya.speedmath;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity implements View.OnClickListener {

    //Explicit
    private TextView questionTextView, ch1TextView, ch2TextView,
            ch3TextView, ch4TextView;
    private int chooseAnswerAnInt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        // Bind Widger
        questionTextView = (TextView) findViewById(R.id.textView7);
        ch1TextView = (TextView) findViewById(R.id.textView3);
        ch2TextView = (TextView) findViewById(R.id.textView4);
        ch3TextView = (TextView) findViewById(R.id.textView5);
        ch4TextView = (TextView) findViewById(R.id.textView6);

        //Click Controller
        ch1TextView.setOnClickListener(this);
        ch2TextView.setOnClickListener(this);
        ch3TextView.setOnClickListener(this);
        ch4TextView.setOnClickListener(this);

    }   // Main Method

    @Override
    public void onClick(View view) {


        switch (view.getId()) {
            case R.id.textView3:
                checkAnswer(Integer.parseInt(ch1TextView.getText().toString()));
                break;
            case R.id.textView4:
                checkAnswer(Integer.parseInt(ch2TextView.getText().toString()));
                break;
            case R.id.textView5:
                checkAnswer(Integer.parseInt(ch3TextView.getText().toString()));
                break;
            case R.id.textView6:
                checkAnswer(Integer.parseInt(ch4TextView.getText().toString()));
                break;
        }   // switch

    }   // onClick

    private void checkAnswer(int intChoice) {
        Log.d("3decV1", "You Choose Answer ==> " + intChoice);
    }

}   // Main Class
