package gradle.udacity.com.practice_androidunittesting;

import org.junit.Test;

/**
 * Created by justinmae on 4/21/16.
 */
public class EchoTest {

    @Test
    public void verifyEchoResponse() {
        assert Echo.echo("hello").equals("hello");
    }

    // Uses android.util.Log
//    @Test
//    public void verifyLoggingEchoResponse() {
//        assert Echo.echo("hello", true).equals("hello");
//    }
}
