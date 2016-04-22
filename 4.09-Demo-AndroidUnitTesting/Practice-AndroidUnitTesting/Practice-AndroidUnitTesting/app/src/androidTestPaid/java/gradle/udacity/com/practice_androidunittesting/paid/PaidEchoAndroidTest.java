package gradle.udacity.com.practice_androidunittesting.paid;

import android.test.AndroidTestCase;

/**
 * Created by justinmae on 4/21/16.
 */
public class PaidEchoAndroidTest extends AndroidTestCase {

    public void testVerifyEchoResponse() {
        assertEquals("hello", PaidEcho.echo("hello"));
    }

    public void testVerifyLoggingEchoResponse() {
        assertEquals("hello", PaidEcho.echo("hello", true));
    }
}
