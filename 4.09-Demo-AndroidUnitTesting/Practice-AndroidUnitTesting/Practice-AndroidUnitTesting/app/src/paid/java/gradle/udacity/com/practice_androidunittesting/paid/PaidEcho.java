package gradle.udacity.com.practice_androidunittesting.paid;

import android.util.Log;
import gradle.udacity.com.practice_androidunittesting.Echo;

public class PaidEcho extends Echo {


    public static <T> T echo(T o, boolean log) {
        if (log) {
            Log.i(Echo.class.getName(), o.toString());
        }
        return o;
    }

    public static <T> T echo(T o) {
        return echo(o, false);
    }
}
