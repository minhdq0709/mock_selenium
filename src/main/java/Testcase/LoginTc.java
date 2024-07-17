/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testcase;

import Base.BaseTestcase;
import DataTest.LoginData;
import Pages.LoginPage;
import org.testng.annotations.Test;

/**
 *
 * @author ADMIN
 */
// Hàm xử lý tất cả các testcase(main)
public class LoginTc extends BaseTestcase {
    
    // Link trang muốn test 
    private final String urlPageLogin = "http://localhost:3000/login";
    
    // @Test để khai báo là tescase (ko chạy nếu ko có @test)
    // Exception: bỏ qua tc khi ctrinh crash
    @Test
    public void Testcase1() throws Exception {
        // get Driver: để tất cả các tab mở trên 1 trình duyệt
        LoginPage loginPage = new LoginPage(super.getDriver()); // khởi tạo 1 cái tab
        // mở link trang test 
        super.gotoPage(this.urlPageLogin);
        // fill dữ liệu vào các ô input
        loginPage.EnterVal(LoginData.lstDataModel[0]);
        // Thời gian chờ
        Thread.sleep(5000);
        loginPage.ClickButtonLogin();
        // chờ page load xong
        super.waitPageSuccses();

        String notify = loginPage.Notification().replaceAll("[^a-zA-Z0-9]", "");
        String notifySource = "Tài kho?n không t?n t?i".replaceAll("[^a-zA-Z0-9]", "");

        try {
            // In ra dữ liệu cần so sánh ( dữ liệu chuẩn)
            System.out.println("notify: " + notify);
            System.out.println("notifySource: " + notifySource);

            if (notify.equals(notifySource)) {
                System.out.println("Test passed: Search results are displayed.");
            } else {
                System.out.println("Fail");
            }
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }

        Thread.sleep(5000);
    }
    
    // Exception: bỏ qua tc khi ctrinh crash
    @Test
    public void Testcase2() throws Exception {
        // get Driver: để tất cả các tab mở trên 1 trình duyệt
        LoginPage loginPage = new LoginPage(super.getDriver()); // khởi tạo 1 cái tab
        // mở link trang test 
        super.gotoPage(this.urlPageLogin);
        // fill dữ liệu vào các ô input
        loginPage.EnterVal(LoginData.lstDataModel[1]);
        // Thời gian chờ
        Thread.sleep(5000);
        loginPage.ClickButtonLogin();
        // chờ page load xong
        super.waitPageSuccses();

        String urlLogin = "http://localhost:3000/staff/class";
        String loginPass = super.getDriver().getCurrentUrl();

        try {
            // In ra dữ liệu cần so sánh ( dữ liệu chuẩn)
            System.out.println("urlLogin: " + urlLogin);
            System.out.println("loginPass: " + loginPass);

            if (loginPass.equals(urlLogin)) {
                System.out.println("Test passed: Search results are displayed.");
            } else {
                System.out.println("Fail");
            }
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }

        Thread.sleep(5000);
    }
}
