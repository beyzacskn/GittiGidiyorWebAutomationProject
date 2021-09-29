package org.example.pages;

import org.example.logger.Log;
import org.example.methods.Methods;

import static org.example.elements.LoginPageElements.*;


public class LoginPage {

    Methods methods;
    Log logger = new Log();

    public LoginPage(){
        
        methods = new Methods();
    }

    public void LoginPageControl(){

        methods.isEqualUrl(checkURL);
        methods.checkElementVisible(userNameField);
        methods.checkElementVisible(passwordField);
        methods.checkElementVisible(loginInTheloginPage);
    }

    public void validLogin(String username, String password){
        methods.sendKeys(userNameField, username);
        methods.sendKeys(passwordField, password);
        methods.clickElement(loginInTheloginPage);
        logger.info("Kullanıcı ve sifre yazıldı");

    }

}
