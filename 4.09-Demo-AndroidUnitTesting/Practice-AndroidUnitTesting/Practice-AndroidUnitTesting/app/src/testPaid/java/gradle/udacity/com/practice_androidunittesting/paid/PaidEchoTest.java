package gradle.udacity.com.practice_androidunittesting.paid;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by justinmae on 4/21/16.
 */
public class PaidEchoTest {

    @Test
    public void verifyEchoResponse() {
        assert PaidEcho.echo("hello").equals("hello");
    }

//    @Test
//    public void verifyLoggingEchoResponse() {
//        assert PaidEcho.echo("hello", true).equals("hello");
//    }
}
