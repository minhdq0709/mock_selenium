/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pages;

import Model.HocSinhModel;
import Model.LoginModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Minh.dq
 */
public class CreateHSPage {

    private final WebDriver driver;
    // FindBy: Lấy phàn tử tho id (tạo cho tất cả đối tượng)
    @FindBy(id = "defaultForm-teacherID")
    private WebElement hoten;

    @FindBy(id = "defaultForm-roomID")
    private WebElement ngaysinh;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[5]/form/div[2]/div[4]/input")
    private WebElement cccd;
    
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[5]/form/div[2]/div[5]/input")
    private WebElement diachi;
    
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[5]/form/div[3]/button")
    private WebElement buttonXacNhan;
    
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[1]")
    private WebElement notify;
    
    Select dropdown = null;
    
    //mặc định có WebDriver
    public CreateHSPage(WebDriver driver) {
        // Khởi tạo để quản lý input
        this.driver = driver;
        // Khởi tạo các input (usernameInput,passwordInput)
        PageFactory.initElements(driver, this);
    }
    
    public void setupElementSpecial() {
        dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[5]/form/div[2]/div[3]/select")));
    }

    public void EnterVal(HocSinhModel dataInput) {
        hoten.sendKeys(dataInput.getHoten());
        ngaysinh.sendKeys(dataInput.getNgaysinh());
        cccd.sendKeys(dataInput.getCCCD());
        diachi.sendKeys(dataInput.getDiachi());
        dropdown.selectByValue(dataInput.getGioitinh());
    }

    public void ClickButtonXacnhan() {
        buttonXacNhan.click();
    }
    
    public String getNotify() {
        return notify.getText();
    }
}
