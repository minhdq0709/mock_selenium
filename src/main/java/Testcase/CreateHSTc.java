/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testcase;

import Base.BaseTestcase;
import DataTest.HocSinhData;
import Pages.CreateHSPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Minh.dq
 */
public class CreateHSTc extends BaseTestcase{
    private final String urlPageLogin = "http://localhost:3000/staff/student/LH201901";
    
    @BeforeMethod
    public void CallLogin() throws Exception {
        LoginTc loginTc = new LoginTc();
        loginTc.setup();
        loginTc.Testcase2();
    }
    
    // @Test để khai báo là tescase (ko chạy nếu ko có @test)
    // Exception: bỏ qua tc khi ctrinh crash
    @Test
    public void Testcase1() throws Exception {
        // get Driver: để tất cả các tab mở trên 1 trình duyệt
        CreateHSPage createHSPage = new CreateHSPage(super.getDriver()); // khởi tạo 1 cái tab
        // mở link trang test 
        super.gotoPage(this.urlPageLogin);
        createHSPage.setupElementSpecial();
        
        // fill dữ liệu vào các ô input
        createHSPage.EnterVal(HocSinhData.lstDataModel[0]);
        // Thời gian chờ
        Thread.sleep(5000);
        createHSPage.ClickButtonXacnhan();
        // chờ page load xong
        super.waitPageSuccses();

        Thread.sleep(5000);
        
        // Lay noi dung notify
        System.out.println("***********************:" + createHSPage.getNotify());
    }
}
