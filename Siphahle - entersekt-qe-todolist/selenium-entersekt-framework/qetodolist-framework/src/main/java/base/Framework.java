/*
 *Author: Siphahle
 *Department: Quality Assurance
 *Email: jdkhauoe@gmail.com
 */
package base;

// Functionalities not depended on a project
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Framework {

    /*
     ***************************************************************************
     *                                METHODS
     ***************************************************************************
     */

    public static void elementIsDisplayed(WebElement element) {
        assertTrue("Element '" + element.getTagName() + "' is not displayed", element.isDisplayed());
    }

    //Element is hidden (but present in the DOM)
    public static void elementIsHidden(WebElement element) {
        assertTrue("Element '" + element.getTagName() + "' is displayed", !element.isDisplayed());
    }

    public static void verifyElementByText(WebElement element, String text) {
        String elementText = element.getText();
        assertEquals("Element text is not '" + text + "'", text, elementText);
    }

    public static void closeBrowser() {
        Driver.getInstance().quit();
    }

    public static void resetDriver() {
        Driver.getInstance().reset();
    }

    public static String generateRandomNumber(int length) {
        return RandomStringUtils.randomNumeric(length);

    }

    //Take a screenshot 
    public static File takeScreenshot(Object testFail) {
        try {
            Class<?> testCase = testFail.getClass();
            File screenshot = ((TakesScreenshot) Driver.getWebInstance()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("C:\\Selenium\\Screenshots\\" + testCase.getSimpleName() + ".png"));
            return screenshot;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
