package gradle.udacity.com.practice_androidunittesting;

import android.util.Log;

public class Echo {
    public static <T> T echo(T o) {
        return echo(o, false);
    }

    public static <T> T echo(T o, boolean log) {
        if (log) Log.i(Echo.class.getName(), o.toString());

        return o;
    }
}
