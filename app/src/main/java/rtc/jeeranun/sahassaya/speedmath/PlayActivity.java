package rtc.jeeranun.sahassaya.speedmath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity {

    //Explicit
    private TextView questionTextView, ch1TextView,ch2TextView,ch3TextView, ch4TextView;

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
    }
}
