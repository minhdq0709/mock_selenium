/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testcase;

import Base.BaseTestcase;
import DataTest.SearchData;
import Pages.SearchPage;
import org.testng.annotations.Test;

/**
 *
 * @author ADMIN
 */
public class SearchTc extends BaseTestcase{
    private final String urlPage = "http://localhost:3000/staff/student/LH201901";
    
    // @Test để khai báo là tescase (ko chạy nếu ko có @test)
    @Test
    // Exception: bỏ qua tc khi ctrinh crash
    public void Testcase1() throws Exception {
        // get Driver: để tất cả các tab mở trên 1 trình duyệt
        SearchPage searchPage = new SearchPage(super.getDriver()); // khởi tạo 1 cái tab
        // mở link trang test 
        super.gotoPage(this.urlPage);
        // fill dữ liệu vào các ô input
        searchPage.EnterVal(SearchData.lstDataModel[0]);
        // Thời gian chờ
        Thread.sleep(5000);
        searchPage.ClickBtnSearch();
        // chờ page load xong
        super.waitPageSuccses();
        
        
    }
    
}
