package gradle.udacity.com.practice_androidunittesting;

import android.test.AndroidTestCase;

/**
 * Created by justinmae on 4/21/16.
 */
public class EchoAndroidTest extends AndroidTestCase {

    public void testVerifyEchoResponse() {
        assertEquals("hello", Echo.echo("hello"));
    }

    public void testVerifyLoggingEchoResponse() {
        assertEquals("hello", Echo.echo("hello", true));
    }
}
