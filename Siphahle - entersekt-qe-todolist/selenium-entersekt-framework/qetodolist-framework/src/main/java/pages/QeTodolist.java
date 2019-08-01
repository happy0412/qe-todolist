/*
 *Author: Siphahle
 *Department: QA
 *Email: siphahle.nomnganga@gmail.com
 */
package pages;

import base.Driver;
import base.Framework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static junit.framework.Assert.assertEquals;

public class QeTodolist {

    /*
     ***************************************************************************
     *                                OBJECTS
     ***************************************************************************
     */
    private static WebElement CreateToDoItems() {
        return Driver.getInstance().wait(5, ExpectedConditions.
                presenceOfElementLocated(By.id("newtodo")));
    }
    
    private static WebElement SubmitBtn() {
        return Driver.getInstance().wait(5, ExpectedConditions.
                presenceOfElementLocated(By.xpath("//*[@id=\"new-submit\"]")));
    }
    private static WebElement UpdateToDoItems() {
        return Driver.getInstance().wait(5, ExpectedConditions.
                presenceOfElementLocated(By.id("edittodo-1")));
    }
     private static WebElement UpdateBtn() {
        return Driver.getInstance().wait(5, ExpectedConditions.
                presenceOfElementLocated(By.xpath("//*[@id=\"edit-submit-1\"]")));
    }
      private static WebElement DeleteBtn() {
        return Driver.getInstance().wait(5, ExpectedConditions.
                  presenceOfElementLocated(By.xpath("/html/body/ul/li[1]/form")));
    }

    /*
     ***************************************************************************
     *                                METHODS
     ***************************************************************************
     */

    public static void EnterToDoItems(String name) {

        CreateToDoItems().sendKeys(name);
    }
     public static void UpdateToDoItemsList(String name) {

       UpdateToDoItems().sendKeys(name);
    }
    public static void ClickOnSubmitbtn() {
       SubmitBtn().click();

    }
     public static void ClickOnUpdatebtn() {
       UpdateBtn().click();

    }
       public static void ClickDeletebtn() {
       DeleteBtn().click();

    }
}
