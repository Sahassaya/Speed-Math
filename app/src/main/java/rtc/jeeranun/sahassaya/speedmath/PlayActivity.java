package rtc.jeeranun.sahassaya.speedmath;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class PlayActivity extends AppCompatActivity implements View.OnClickListener {

    //Explicit  master
    //sahassaya
    private TextView questionTextView, ch1TextView, ch2TextView,
            ch3TextView, ch4TextView, scoreTextView;
    private Random random;
    private int firstAnInt, secondAnInt, answerAnInt,
            trueChoiceAnInt, scoreAnInt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);


        //Setup
        random = new Random();

        // Bind Widger
        questionTextView = (TextView) findViewById(R.id.textView7);
        ch1TextView = (TextView) findViewById(R.id.textView3);
        ch2TextView = (TextView) findViewById(R.id.textView4);
        ch3TextView = (TextView) findViewById(R.id.textView5);
        ch4TextView = (TextView) findViewById(R.id.textView6);
        scoreTextView = (TextView) findViewById(R.id.textView8);

        //Click Controller
        ch1TextView.setOnClickListener(this);
        ch2TextView.setOnClickListener(this);
        ch3TextView.setOnClickListener(this);
        ch4TextView.setOnClickListener(this);

        //Play Controller
        playController();

    }   // Main Method

    private void playController() {

        firstAnInt = random.nextInt(100);
        secondAnInt = random.nextInt(100);
        answerAnInt = firstAnInt + secondAnInt;
        trueChoiceAnInt = random.nextInt(4) + 1;
        Log.d("3decV1", "trueChoose ==> " + trueChoiceAnInt);

        //Change Question
        questionTextView.setText(Integer.toString(firstAnInt) + " + " +
                Integer.toString(secondAnInt) + " = ?");

        //Change Choice
        TextView[] textViews = new TextView[]{ch1TextView, ch2TextView, ch3TextView, ch4TextView};
        for (int i = 0; i < textViews.length; i++) {
            textViews[i].setText(Integer.toString(random.nextInt(100)));
        }

        switch (trueChoiceAnInt) {
            case 1:
                ch1TextView.setText(Integer.toString(answerAnInt));
                break;
            case 2:
                ch2TextView.setText(Integer.toString(answerAnInt));
                break;
            case 3:
                ch3TextView.setText(Integer.toString(answerAnInt));
                break;
            case 4:
                ch4TextView.setText(Integer.toString(answerAnInt));
                break;
            default:
                ch1TextView.setText(Integer.toString(answerAnInt));
                break;
        }   // switch




    }// playController

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

        playController();

    }   // onClick



    private void checkAnswer(int intChoice) {
        Log.d("3decV1", "You Choose Answer ==> " + intChoice);
        Log.d("3decV1", "Answer ==> " + answerAnInt);

        if (intChoice == answerAnInt) {
            scoreAnInt += 1;
        }

        //Change Score
        Log.d("3decV1", "Score ==> " + scoreTextView);
        scoreTextView.setText("Score = " + Integer.toString(scoreAnInt));


    }

}   // Main Class
