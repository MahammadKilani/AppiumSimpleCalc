package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Driver.Driver.appiumDriver;


public class Elements {

    public WebElement result() {
        return appiumDriver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula"));
    }

    public WebElement num1() {
        return appiumDriver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_01"));
    }

    public WebElement num2() {
        return appiumDriver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02"));
    }

    public WebElement num3() {
        return appiumDriver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_03"));
    }

    public WebElement num4() {
        return appiumDriver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_04"));
    }

    public WebElement num5() {
        return appiumDriver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_05"));
    }

    public WebElement num6() {
        return appiumDriver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_06"));
    }

    public WebElement num7() {
        return appiumDriver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_07"));
    }

    public WebElement num8() {
        return appiumDriver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_08"));
    }

    public WebElement num9() {
        return appiumDriver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_09"));
    }

    public WebElement num0() {
        return appiumDriver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_00"));
    }

    public WebElement plus() {
        return appiumDriver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add"));
    }

    public WebElement minus() {
        return appiumDriver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_sub"));
    }

    public WebElement times() {
        return appiumDriver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_mul"));
    }

    public WebElement by() {
        return appiumDriver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_div"));
    }

    public WebElement equal() {
        return appiumDriver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
    }
}

