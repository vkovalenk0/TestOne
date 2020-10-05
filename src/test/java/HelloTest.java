import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloTest {

    private static final Logger LOG = LoggerFactory.getLogger(HelloTest.class);

    @Test
    public void dummyTest() {
        LOG.info("Hello world!!");
        Assert.assertTrue("Fail", true);
    }
}
