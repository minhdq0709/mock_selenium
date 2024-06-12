/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author ADMIN
 */
public class DriverFactory {
    private WebDriver driver = null;
    
    public WebDriver getDriver(int type) {
        switch(type) {
            case 1 -> {
                System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver-win64\\chromedriver.exe");
                this.driver = new ChromeDriver();
                return driver;
            }
            default -> {
                return driver;
            }
        }
    }
}
