/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author ADMIN
 */
public class HomeBlazedPage {
    private final WebDriver driver;
    
    @FindBy(xpath="//div[@id='navbarExample']//a[1]")
    private WebElement homeButton ;
  
    public HomeBlazedPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ClickButtonHome() {
       this.homeButton.click();
    }
}
