/**
 * Created by ansk0413 on 05.10.15.
 */

 package AppTests;


    import org.junit.Assert;
    import org.junit.Test;
    import source.Calculator;

    public class AddingNumbersTests {

        private Calculator myCalculator = new Calculator();

        @Test
        public void addTwoPositiveNumbers()
        {
            int expectedResult = 30;
            int ActuaResult = myCalculator.Add(10, 20);
            Assert.assertEquals("The the sum of two positive numbers is correct" , expectedResult, ActuaResult);
        }

        @Test
        public void addTwoNegativeNumbers()
        {
            int expectedResult = -30;
            int ActuaResult = myCalculator.Add(-10, -20);
            Assert.assertEquals("The the sum of two negative numbers is correct" , expectedResult, ActuaResult);
        }
    }

