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
public class LoginTc extends BaseTestcase {

    private final String urlPageLogin = "https://www.facebook.com/?locale=vi_VN";

    @Test
    public void Testcase1() throws Exception {
        LoginPage loginPage = new LoginPage(super.getDriver());
        super.gotoPage(this.urlPageLogin);
        
        loginPage.EnterVal(LoginData.lstDataModel[0]);
        loginPage.ClickButtonLogin();
        super.waitPageSuccses();
        
        String currentUrl = super.getDriver().getCurrentUrl();
        try {
            System.out.println("urlPageLogin: " + urlPageLogin);
            System.out.println("currentUrl: " + currentUrl);
            
            if (urlPageLogin.equals(currentUrl)) {
                System.out.println("Test passed: Search results are displayed.");
            }
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }
}
