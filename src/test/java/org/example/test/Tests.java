package org.example.test;

import org.example.driver.BaseTest;
import org.example.logger.Log;
import org.example.pages.BasketPage;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.example.pages.ProductPage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    ProductPage productPage;
    BasketPage basketPage;
    Log logger;

    @Test
    public void shoppingTest() throws InterruptedException {

        initPageClass();
        homePage.navigateHomePage();
        homePage.clickLoginButton();
        loginPage.LoginPageControl();
        loginPage.validLogin("testd7258@gmail.com","deneme1");
        Thread.sleep(10000);
        homePage.searchProduct("bilgisayar");
        homePage.clickSecondProductPageAndControl();
        homePage.clickRandomProduct();
        String productPrice = productPage.productPrice();
        logger.info("Ürünün fiyatı: " + productPrice);
        productPage.addToBasket();
        productPage.clickBasketButton();
        basketPage.checkBasketURL();
        String basketPrice = basketPage.priceInTheBasket();
        logger.info("Ürünün fiyatı: " + productPrice);
        logger.info("Ürünün sepetteki fiyatı: " + basketPrice);
        assertEquals(productPrice, basketPrice);
        basketPage.selectProduct();
        basketPage.removeProduct();
    }

    public void initPageClass(){

        homePage = new HomePage();
        loginPage = new LoginPage();
        productPage = new ProductPage();
        basketPage = new BasketPage();
        logger = new Log();

    }

}
