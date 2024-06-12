/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base;

import java.util.function.Function;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 *
 * @author ADMIN
 */

/* 
    Run testcase: at path folder include testng.xml
    run cmd: mvn test -DsuiteXmlFile=testng.xml
*/

public class BaseTestcase {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }
    
    @BeforeClass
    public void setup() {
        this.driver = new DriverFactory().getDriver(1);
        this.driver.manage().window().maximize();
    }
    
    @AfterClass
    public void tearDown() {
        this.driver.close();
        this.driver.quit();
    }
    
    public void gotoPage(String url) {
        if(this.driver != null) {
            this.driver.get(url);
        }
    }
    
    public void waitPageSuccses() {
        Wait<WebDriver> wait = new WebDriverWait(this.driver, 30);
        wait.until(new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver driver) {
                return String
                    .valueOf(((JavascriptExecutor) driver)
                    .executeScript("return document.readyState"))
                    .equals("complete");
            }
        });
    }
}
