package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static Driver.Driver.*;


public class CalcTest {

    @Test(priority = 1)
    public void addingTest() {
        try {
            startDriver();
            elements.num1().click();
            elements.plus().click();
            elements.num2().click();
            elements.plus().click();
            elements.num3().click();
            elements.plus().click();
            elements.num4().click();
            elements.plus().click();
            elements.num5().click();
            elements.plus().click();
            elements.num6().click();
            elements.plus().click();
            elements.num7().click();
            elements.plus().click();
            elements.num8().click();
            elements.plus().click();
            elements.num9().click();
            elements.equal().click();

            String actual = elements.result().getText();
            String expected = "45";

            Assert.assertEquals(actual, expected);


        } catch (MalformedURLException exception) {
            exception.getCause();
            exception.printStackTrace();
        } finally {
            killDriver();
        }
    }


    @Test(priority = 2)
    public void subtractingTest() {
        try {
            startDriver();
            elements.num1().click();
            elements.minus().click();
            elements.num2().click();
            elements.minus().click();
            elements.num3().click();
            elements.minus().click();
            elements.num4().click();
            elements.minus().click();
            elements.num5().click();
            elements.minus().click();
            elements.num6().click();
            elements.minus().click();
            elements.num7().click();
            elements.minus().click();
            elements.num8().click();
            elements.minus().click();
            elements.num9().click();
            elements.equal().click();

            String actual = elements.result().getText();
            String expected = "−43";

            Assert.assertEquals(actual, expected);

        } catch (MalformedURLException exception) {
            exception.getCause();
            exception.printStackTrace();
        } finally {
            killDriver();
        }
    }

    @Test(priority = 3)
    public void multiplyingTest() {
        try {
            startDriver();
            elements.num1().click();
            elements.times().click();
            elements.num2().click();
            elements.times().click();
            elements.num3().click();
            elements.times().click();
            elements.num4().click();
            elements.times().click();
            elements.num5().click();
            elements.times().click();
            elements.num6().click();
            elements.times().click();
            elements.num7().click();
            elements.times().click();
            elements.num8().click();
            elements.times().click();
            elements.num9().click();
            elements.equal().click();

            String actual = elements.result().getText();
            String expected = "362,880";

            Assert.assertEquals(actual, expected);

        } catch (MalformedURLException exception) {
            exception.getCause();
            exception.printStackTrace();
        } finally {
            killDriver();
        }
    }

    @Test(priority = 4)
    public void dividingTest() {
        try {
            startDriver();
            elements.num1().click();
            elements.by().click();
            elements.num2().click();
            elements.by().click();
            elements.num3().click();
            elements.by().click();
            elements.num4().click();
            elements.by().click();
            elements.num5().click();
            elements.by().click();
            elements.num6().click();
            elements.by().click();
            elements.num7().click();
            elements.by().click();
            elements.num8().click();
            elements.by().click();
            elements.num9().click();
            elements.equal().click();

            String actual = elements.result().getText();
            String expected = "0.0000027557";

            Assert.assertEquals(actual, expected);

        } catch (MalformedURLException exception) {
            exception.getCause();
            exception.printStackTrace();
        } finally {
            killDriver();
        }
    }

}
