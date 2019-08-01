package base;

import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Driver {

    private static final Logger logger = LoggerFactory.getLogger(Driver.class);

    private FirefoxDriver getNewFirefoxDriverInstance() {

        //Please copy the *resources* folder that I have included to the project 
        //to your C driver so that you can execute this line successfully.  
        //System.setProperty("webdriver.gecko.driver", "/resources/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", "/resources/geckodriver.exe");
        return new FirefoxDriver();

    }
    
//    private ChromeDriver getNewChromeDriverInstance() {
//
//        //Please copy the *resources* folder that I have included to the project 
//        //to your C driver so that you can execute this line successfully.  
//        //System.setProperty("webdriver.gecko.driver", "/resources/geckodriver.exe");
//        DesiredCapabilities.chrome();  
//        System.setProperty("webdriver.chrome.driver", "/resources/chromedriver.exe");
//        return new ChromeDriver();
//
//    }
    
   
//    String browser = "geckodriver";
//    
//     private WebDriver getLaunchBrowserDriverInstance() {
//      
//      if(browser.equalsIgnoreCase("geckodriver")){
//          System.setProperty("webdriver.gecko.driver", "/resources/geckodriver.exe");
//          
//         return new FirefoxDriver();
//     }
//      else if(!browser.equalsIgnoreCase("chromedriver")) {
//      } else {
//          System.setProperty("webdriver.chrome.driver", "/resources/chromedriver.exe");
//      }
//          return new ChromeDriver();  
//      
//     
//  }
    
    
 //System.setProperty("webdriver.chrome.driver", "C:\\pathto\\my\\chromedriver.exe");
//WebDriver driver = new ChromeDriver();
//driver.get("http://www.google.com");
    
     public WebElement findElement(By arg0) {
        return this.webDriver.findElement(arg0);
    }

    public void get(String arg0) {
        this.webDriver.get(arg0);
    }

    private static Driver instance;
    WebDriver webDriver;

    public static Driver getInstance() {
        if (instance == null) {
            instance = new Driver();
        }
        return instance;
    }

    public static WebDriver getWebInstance() {
        if (instance == null) {
            instance = new Driver();
        }

        return instance.webDriver;
    }

    public <V> V wait(int timeOutInSeconds, Function<? super WebDriver, V> isTrue) {
        WebDriverWait wait = new WebDriverWait(this.webDriver, timeOutInSeconds);

        return wait.until(isTrue);
    }

    public <V> V wait(int timeOutInSeconds, Function<? super WebDriver, V> isTrue,
            Class<? extends Throwable> ignoreException) {
        WebDriverWait wait = new WebDriverWait(this.webDriver, timeOutInSeconds);

        return wait.ignoring(ignoreException).until(isTrue);
    }

    public WebDriver.Options manage() {
        return this.webDriver.manage();
    }

    public static void implicitlyWait(long seconds) {
        instance.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public void quit() {
        this.webDriver.quit();
    }

    public void reset() {
        this.webDriver = getNewFirefoxDriverInstance();
        //this.webDriver = getNewChromeDriverInstance();
      // this.webDriver = getLaunchBrowserDriverInstance();
    }

    public static Optional<JavascriptExecutor> getExecutor() {
        WebDriver checkdriver = Driver.getWebInstance();

        final JavascriptExecutor executor;

        if (checkdriver instanceof JavascriptExecutor) {

            executor = (JavascriptExecutor) checkdriver;

        } else {
            executor = null;
        }
        return Optional.ofNullable(executor);
    }
}
