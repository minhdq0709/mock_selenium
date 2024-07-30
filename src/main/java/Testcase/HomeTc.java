/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testcase;

import Base.BaseTestcase;
import Model.GVQLModel;
import Pages.HomePage;
import java.util.List;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ADMIN
 */
public class HomeTc extends BaseTestcase {

    // Link trang muốn test 
    private final String urlPage = "http://localhost:3000/staff/class";
    
    @BeforeMethod
    public void CallLogin() throws Exception {
        LoginTc loginTc = new LoginTc();
        loginTc.setup();
        loginTc.Testcase2();
    }
    
    // @Test để khai báo là tescase (ko chạy nếu ko có @test)
    @Test
    // Exception: bỏ qua tc khi ctrinh crash
    public void Testcase1() throws Exception {
        HomePage homePage = new HomePage(super.getDriver());
        super.gotoPage(this.urlPage);
        homePage.ClickButtonDetailClass("//*[@id=\"content\"]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[8]/a");

        String url1 = "http://localhost:3000/staff/student/LH201901";
        String url2 = super.getDriver().getCurrentUrl();

        try {
            // In ra dữ liệu cần so sánh ( dữ liệu chuẩn)
            System.out.println("url1: " + url1);
            System.out.println("url2: " + url2);

            if (url1.equals(url2)) {
                System.out.println("Test passed: Search results are displayed.");
            } else {
                System.out.println("Fail");
            }
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }

        Thread.sleep(5000);
    }
    @Test
    public void Testcase2() throws Exception {
        HomePage homePage = new HomePage(super.getDriver());
        super.gotoPage(this.urlPage);
        try {
            // In ra dữ liệu cần so sánh ( dữ liệu chuẩn)
            List<GVQLModel> lstData = homePage.GetDataTable();
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }

        Thread.sleep(5000);
    }
}
