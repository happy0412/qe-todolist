/*
 *Author: Siphahle
 *Department: QA
 *Email: siphahle.nomnganga@gmail.com
 */
package entersekt.nodejsapp.qetodolist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import base.Framework;
import pages.QeTodolist;
import pages.Home;
import static org.junit.Assert.fail;

public class QeTodolist_tests {

    @Before
    public void setUp() {
        Framework.resetDriver();
      
        Home.goToWebsite();
    }

    @Test
    public void executeOnFireFox() {
        try {
            
            QeTodolist.EnterToDoItems("Siphahle");
            QeTodolist.ClickOnSubmitbtn();
            QeTodolist.UpdateToDoItemsList("Ginger");
            QeTodolist.ClickOnUpdatebtn();
            //QeTodolist.ClickDeletebtn();
           

        } catch (Exception | Error e) {
          
           Framework.takeScreenshot(this);
            System.out.println(e.getMessage());
            fail(e.getMessage());

        }
    }

    @After
    public void cleanUp() {
       // Framework.closeBrowser();
    }

}
