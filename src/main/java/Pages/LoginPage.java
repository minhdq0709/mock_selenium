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
// Khai báo các đối tượng có trong form và các hàm xử lý cơ bản
public class LoginPage {
// khai báo để quản lý các đối tượng trên form (bắt buộc)
    private final WebDriver driver;
    // FindBy: Lấy phàn tử tho id (tạo cho tất cả đối tượng)
    @FindBy(id = "exampleInputEmail")
    private WebElement usernameInput;
    
    @FindBy(id = "exampleInputPassword")
    private WebElement passwordInput;
    
    @FindBy(xpath="/html/body/div/div/div/div/div/div/div[2]/div/div[2]")
    private WebElement notify;
    
     @FindBy(xpath="/html/body/div/div/div/div/div/div/div[2]/div/form/input")
    private WebElement buttonlogin;
     //mặc định có WebDriver
    public LoginPage(WebDriver driver) {
        // Khởi tạo để quản lý input
        this.driver = driver;
        // Khởi tạo các input (usernameInput,passwordInput)
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
        // Lấy ra text thông báo
        return notify.getText();
    }
}
