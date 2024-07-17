/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pages;

import Model.GVQLModel;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author ADMIN
 */
public class HomePage {

    // khai báo để quản lý các đối tượng trên form (bắt buộc)
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        // Khởi tạo để quản lý input
        this.driver = driver;
    }

    public void ClickButtonDetailClass(String xpathButton) {
        this.driver.findElement(By.xpath(xpathButton)).click();
    }

    public List<GVQLModel> GetDataTable() {
        List<GVQLModel> GVQL = new ArrayList<GVQLModel>();
        List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"content\"]/div/div[2]/div[2]/div/table/tbody/tr"));
        int rowTotal = row.size();
        
        for (int i = 1; i <= rowTotal; i++) {
            GVQLModel gv1 = new GVQLModel();
            List<WebElement> colSize = driver.findElements(By.xpath("//*[@id=\"content\"]/div/div[2]/div[2]/div/table/tbody/tr[" + i + "]/td"));
            for (int j = 1; j <= colSize.size(); j++) {
                WebElement colCheck = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[2]/div/table/tbody/tr[" + i + "]/td[" + j + "]"));
                if(j==1){
                     gv1.setMaLop(colCheck.getText());
                }
                if(j==2){
                    gv1.setLop(colCheck.getText());
                }
                if(j==3){
                    gv1.setMagvcn(colCheck.getText());
                }
                if(j==4){
                    gv1.setTegvcn(colCheck.getText());
                }
                if(j==5){
                    gv1.setPhong(colCheck.getText());
                }
                if(j==6){
                    gv1.setKhoa(colCheck.getText());
                }
               
            }
            GVQL.add(gv1);

        }
        return GVQL;
    }
}
