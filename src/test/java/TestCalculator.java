import org.testng.Assert;
import org.testng.annotations.*;

@Test()
public class TestCalculator extends TestBase {

    @DataProvider()
    public int testGroupAdding () {

        return new Object[0];
    }

    @BeforeSuite
    public void beforeTest () {

    }

    @Test (invocationCount = 10, invocationTimeOut = 2)
    public void testAdding1 () {
        Assert.assertEquals(calculator.adding(3,2), 5.0);
    }

    @Test(timeOut =  2)
    public void testAdding () {
        Assert.assertNotEquals(calculator.adding(0,0), false);
    }

    @Test(testName = "Description", priority = 1)

    @AfterSuite
    public void tearDown () {
        calculator = null;
    }

}
