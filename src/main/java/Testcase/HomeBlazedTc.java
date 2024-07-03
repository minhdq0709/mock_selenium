/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testcase;

import Base.BaseTestcase;
import DataTest.HomeBlazedDataTest;
import Pages.HomeBlazedPage;
import org.testng.annotations.Test;

/**
 *
 * @author ADMIN
 */
public class HomeBlazedTc extends BaseTestcase {

    private final String urlPageLogin = "https://www.demoblaze.com/";

    @Test
    public void Testcase1() throws Exception {
        HomeBlazedPage homeBlazedPage = new HomeBlazedPage(super.getDriver());
        super.gotoPage(this.urlPageLogin);

        homeBlazedPage.ClickButtonHome();
        super.waitPageSuccses();

        String currentUrl = super.getDriver().getCurrentUrl();
        try {
            System.out.println("urlPageLogin: " + urlPageLogin);
            System.out.println("currentUrl: " + currentUrl);

            if (currentUrl.equals(HomeBlazedDataTest.lstDataModel[0])) {
                System.out.println("Test passed: Search results are displayed.");
            }
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }
}
