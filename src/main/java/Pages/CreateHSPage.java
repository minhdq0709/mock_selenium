/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pages;

import Model.HocSinhModel;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    @FindBy(id="CMTND")
    private WebElement cccd;
    
    @FindBy(name ="address")
    private WebElement diachi;
    
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[5]/form/div[3]/button")
    private WebElement buttonXacNhan;
    
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[1]")
    private WebElement notify;
    
    @FindBy(id="z1")
    private WebElement cbNgoaiKhoaKhong;
    
    @FindBy(id="y1")
    private WebElement cbNgoaiKhoaCo;
    
    @FindBy(id="y")
    private WebElement rdDanTocKinh;
    
    @FindBy(id="z")
    private WebElement rdDanTocOther;
    
    @FindBy(id="btnCreatedSv")
    private WebElement btnModal;
    
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
        if(dataInput.isDanToc()== true){
            rdDanTocKinh.click();
        }else
        {
            rdDanTocOther.click();
        }
        if(dataInput.isNgoaiKhoa()== true)
        {
            cbNgoaiKhoaCo.click();
        }else 
        {
            cbNgoaiKhoaKhong.click();
        }
        
    }

    public void ClickButtonXacnhan() {
         buttonXacNhan.click();
    }
    
    public String getNotify() {
        return notify.getText();
    }
    
    public void FillDataModal(){
        this.btnModal.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newStudent1")));

        // Tìm và điền dữ liệu vào trường họ tên trong modal
        WebElement nameField = modal.findElement(By.id("defaultForm-teacherID2"));
        nameField.sendKeys("Nguyễn Văn A");
    }
}
