/*
 *Author: Siphahle
 *Department: QA
 *Email: siphahle.nomnganga@gmail.com
 */
package pages;

import base.Driver;
import base.SeleniumUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static junit.framework.Assert.assertEquals;

public class Home {

    /*
     ***************************************************************************
     *                                OBJECTS
     ***************************************************************************
     */
   
    /*
     ***************************************************************************
     *                                METHODS
     ***************************************************************************
     */
    // Verify being on Home Page
    public static void verifyHomePageWithText() {
        WebElement element = Driver.getInstance().findElement(By.xpath("/html/body/h1"));
        String elementText = element.getText();
        assertEquals("QE todolist", elementText);
    }

    public static void goToWebsite() {
        Driver.getWebInstance().manage().window().maximize();
        Driver.getInstance().get(SeleniumUtil.BASE_URL_STRING);
        verifyHomePageWithText();

        //Driver.getInstance().implicitlyWait(10);
    }


}
