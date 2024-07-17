/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini_selenium;

import Testcase.HomeTc;

/**
 *
 * @author ADMIN
 */
public class Mini_Selenium {

    public static void main(String[] args) throws Exception {
        HomeTc homeTc = new HomeTc();
        homeTc.setup();
        homeTc.CallLogin();
        homeTc.Testcase2();
    }
}
