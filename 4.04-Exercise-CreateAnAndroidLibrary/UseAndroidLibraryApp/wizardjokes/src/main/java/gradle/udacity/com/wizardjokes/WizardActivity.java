package gradle.udacity.com.wizardjokes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class WizardActivity extends AppCompatActivity {

    public static final String JOKE_KEY = "joke key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wizard);

        Intent intent = getIntent();
        String joke = intent.getStringExtra(JOKE_KEY);

        TextView textView = (TextView) findViewById(R.id.text);
        if (joke != null && joke.length() != 0) {
            textView.setText(joke);
        }
    }
}
