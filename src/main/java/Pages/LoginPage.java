/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pages;

import Model.LoginModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author ADMIN
 */
public class LoginPage {

    private final WebDriver driver;
    
    @FindBy(id = "exampleInputEmail")
    private WebElement usernameInput;
    
    @FindBy(id = "exampleInputPassword")
    private WebElement passwordInput;
    
    @FindBy(xpath="/html/body/div/div/div/div/div/div/div[2]/div/div[2]")
    private WebElement notify;
    
     @FindBy(xpath="/html/body/div/div/div/div/div/div/div[2]/div/form/input")
    private WebElement buttonlogin;
     
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void EnterVal(LoginModel dataInput) {
        usernameInput.sendKeys(dataInput.getUsername());
        passwordInput.sendKeys(dataInput.getPassword());
    }

    public void ClickButtonLogin() {
       buttonlogin.click();
    }
    public String Notification(){
        return notify.getText();
    }
}
