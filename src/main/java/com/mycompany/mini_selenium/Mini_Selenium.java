/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini_selenium;

import Testcase.HomeBlazedTc;
import Testcase.LoginTc;

/**
 *
 * @author ADMIN
 */
public class Mini_Selenium {

    public static void main(String[] args) throws Exception {
        LoginTc loginTc = new LoginTc();
        loginTc.setup();
        loginTc.Testcase1();

//        HomeBlazedTc home = new HomeBlazedTc();
//        home.setup();
//        home.Testcase1();
    }
}
