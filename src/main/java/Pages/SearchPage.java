/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pages;

import Model.LoginModel;
import Model.SearchModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author ADMIN
 */
public class SearchPage {
     private final WebDriver driver;
    // FindBy: Lấy phàn tử tho id (tạo cho tất cả đối tượng)
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/form/input")
    private WebElement searchInput;
    
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/form/button")
    private WebElement buttonSearch;
   
     //mặc định có WebDriver
    public SearchPage(WebDriver driver) {
        // Khởi tạo để quản lý input
        this.driver = driver;
        // Khởi tạo các input (usernameInput,passwordInput)
        PageFactory.initElements(driver, this);
    }

    public void EnterVal(SearchModel dataInput) {
        searchInput.sendKeys(dataInput.getMaSv());
    }

    public void ClickBtnSearch() {
       buttonSearch.click();
    }
}
