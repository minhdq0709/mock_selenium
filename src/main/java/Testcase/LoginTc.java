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

    private final String urlPageLogin = "http://localhost:3000/login";

    @Test
    public void Testcase1() throws Exception {
        LoginPage loginPage = new LoginPage(super.getDriver());
        super.gotoPage(this.urlPageLogin);
        
        loginPage.EnterVal(LoginData.lstDataModel[0]);
        Thread.sleep(5000);
        loginPage.ClickButtonLogin();
        super.waitPageSuccses();
        
        String notify = loginPage.Notification().replaceAll("[^a-zA-Z0-9]", "");
        String notifySource = "Tài kho?n không t?n t?i".replaceAll("[^a-zA-Z0-9]", "");
        
        try {
            System.out.println("notify: " + notify);
            System.out.println("notifySource: " + notifySource);
            
            if (notify.equals(notifySource)) {
                System.out.println("Test passed: Search results are displayed.");
            }
            else{
                System.out.println("Fail");
            }
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
        
        Thread.sleep(5000);
    }
}
