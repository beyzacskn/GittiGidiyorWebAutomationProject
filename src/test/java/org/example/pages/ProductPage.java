package org.example.pages;

import org.example.methods.Methods;

import static org.example.elements.ProductPageElements.*;


public class ProductPage {

    Methods methods;

    public ProductPage(){

        methods = new Methods();
    }

    public String productPrice (){
        String firstPrice= methods.getText(productPagePrice);
        return firstPrice;
    }

    public void addToBasket (){

        methods.jsExecuteScript("window.scrollBy(0,500)"); //Scroll
        methods.clickElement(basketButton);
    }

    public void clickBasketButton() {

        methods.clickElement(goToBasket);
    }

}
