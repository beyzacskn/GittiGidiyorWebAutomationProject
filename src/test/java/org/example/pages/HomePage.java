package org.example.pages;

import org.example.logger.Log;
import org.example.methods.Methods;
import org.openqa.selenium.By;

import java.util.Random;

import static org.example.elements.HomePageElements.*;


public class HomePage {

    Methods methods;
    Log logger = new Log();

    public HomePage(){

        methods = new Methods();
    }

    public void navigateHomePage(){
        methods.navigate(baseURL);
        //Check URL
        methods.isEqualUrl(baseURL);
    }

    public void clickLoginButton(){

        methods.hoverElement(loginHover);
        methods.clickElement(loginButton);
    }

    public void searchProduct(String productName){

        methods.checkElementVisible(txtHesabim);
        methods.sendKeys(inputSearch,productName);
        methods.clickElement(findButton);

    }

    public void clickSecondProductPageAndControl(){

        methods.clickElementJs(secondPage);
        methods.checkElementVisible(checkSecondPage);

    }

    public void clickRandomProduct(){

        Random rn = new Random();
        int productnum = rn.nextInt(31)+1;
        methods.clickElement(By.xpath("(//ul//article[@data-cy=\"product-card-item\"]/parent::li)["+ productnum+"]"));
        logger.info("İkinci sayfadaki " + productnum + ". ürüne tıklandı");
    }

}
