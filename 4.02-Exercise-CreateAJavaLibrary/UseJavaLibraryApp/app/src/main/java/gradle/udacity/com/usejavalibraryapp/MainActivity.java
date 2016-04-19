package gradle.udacity.com.usejavalibraryapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.JokeWizard;
import com.udacity.gradle.jokes.JokeSmith;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JokeSmith jokeSmith = new JokeSmith();
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText("jokeSmith: " + jokeSmith.getJoke());

        JokeWizard jokeWizard = new JokeWizard();
        TextView textView1 = (TextView) findViewById(R.id.text2);
        textView1.setText("jokeWizard: " + jokeWizard.getJoke());

    }
}
