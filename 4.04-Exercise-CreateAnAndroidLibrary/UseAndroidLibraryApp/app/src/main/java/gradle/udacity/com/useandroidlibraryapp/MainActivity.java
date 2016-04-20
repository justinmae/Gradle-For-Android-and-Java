package gradle.udacity.com.useandroidlibraryapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.udacity.gradle.jokes.JokeSmith;

import gradle.udacity.com.wizardjokes.WizardActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jokeButtonIntent(View view) {
        JokeSmith jokeSmith = new JokeSmith();
        String joke = jokeSmith.getJoke();

        Intent intent = new Intent(this, WizardActivity.class);
        intent.putExtra(WizardActivity.JOKE_KEY, joke);
        startActivity(intent);
    }
}
