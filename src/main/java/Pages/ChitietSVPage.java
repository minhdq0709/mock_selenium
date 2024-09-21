/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pages;

import Model.HocSinhModel;
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
public class ChitietSVPage {
     private final WebDriver driver;
    // FindBy: Lấy phàn tử tho id (tạo cho tất cả đối tượng)
    @FindBy(id = "nameDt")
    private WebElement hoten;

    @FindBy(id = "dobDt")
    private WebElement ngaysinh;

    @FindBy(id="CMTNDDt")
    private WebElement cccd;
    
    @FindBy(name ="AddressDt")
    private WebElement diachi;
    
    @FindBy(id="z1Dt")
    private WebElement cbNgoaiKhoaKhong;
    
    @FindBy(id="y1Dt")
    private WebElement cbNgoaiKhoaCo;
    
    @FindBy(id="yDt")
    private WebElement rdDanTocKinh;
    
    @FindBy(id="zDt")
    private WebElement rdDanTocOther;
    
    Select dropdown = null;
    
    public ChitietSVPage(WebDriver driver) {
        // Khởi tạo để quản lý input
        this.driver = driver;
        // Khởi tạo các input (usernameInput,passwordInput)
        PageFactory.initElements(driver, this);
    }
    
    public void setupElementSpecial() {
        dropdown = new Select(driver.findElement(By.id("GioiTinh")));
    }
    public HocSinhModel GetVal(){
        
        HocSinhModel hs1 = new HocSinhModel();
        
        hs1.setHoten(hoten.getText());
        hs1.setNgaysinh(ngaysinh.getText());
        hs1.setCCCD(cccd.getText());
        hs1.setDiachi(diachi.getText());
        hs1.setGioitinh(dropdown.getFirstSelectedOption().getText());
        if(cbNgoaiKhoaCo.isSelected()== true){
            hs1.setNgoaiKhoa(true);
        }else
        {
            hs1.setNgoaiKhoa(false);
        }
        if(rdDanTocKinh.isSelected() == true){
            hs1.setDanToc(true);
        }else{
            hs1.setDanToc(false);
        }
        return hs1;
    }
    public String sosanh(HocSinhModel hs1, HocSinhModel hs2){
        String valErr = "";
        
        if(!hs1.getHoten().equals(hs2.getHoten())){
           valErr = "Sai ho ten";
           return valErr;
        }
        if(!hs1.getNgaysinh().equals(hs2.getNgaysinh())){
           valErr = "Sai ngay sinh";
           return valErr;
        }
        if(!hs1.getCCCD().equals(hs2.getCCCD())){
           valErr = "Sai cccd";
           return valErr;
        }
        if(!hs1.getDiachi().equals(hs2.getDiachi())){
           valErr = "Sai dia chi";
           return valErr;
        }
        if(!hs1.getGioitinh().equals(hs2.getGioitinh())){
           valErr = "Sai gioi tinh";
           return valErr;
        }
        if(!hs1.isNgoaiKhoa() == hs2.isNgoaiKhoa()){
           valErr = "Sai ngoai khoa";
           return valErr;
        }
        if(!hs1.isDanToc() == hs2.isDanToc()){
           valErr = "Sai dan toc";
           return valErr;
        }
        return valErr;
    }
}
