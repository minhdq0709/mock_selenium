/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini_selenium;

import Testcase.CreateHSTc;

/**
 *
 * @author ADMIN
 */
public class Mini_Selenium {

    public static void main(String[] args) throws Exception {
        CreateHSTc createHStc = new CreateHSTc();
        createHStc.setup();
        createHStc.CallLogin();
        createHStc.Testcase1();
    }
}
