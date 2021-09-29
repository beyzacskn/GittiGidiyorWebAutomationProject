package org.example.pages;

import org.example.logger.Log;
import org.example.methods.Methods;

import static org.example.elements.BasketPageElements.*;


public class BasketPage {
    Methods methods;
    Log logger = new Log();

    public BasketPage(){

        methods = new Methods();
    }
    public void checkBasketURL(){
        methods.isEqualUrl("https://www.gittigidiyor.com/sepetim");
        logger.info("Sepetim sayfasına gidildi.");
    }

    public String priceInTheBasket(){
        String lastPrice = methods.getText(basketPagePrice);
        return lastPrice;
    }

    public void selectProduct(){
        methods.selectByValue(productAmount,"2");
        methods.checkElementVisible(selectedProductAmount);
        logger.info("Ürün adedi 2 olarak seçildi");


    }

    public void removeProduct(){
        methods.clickElement(containerButtons);
        methods.checkElementVisible(emptyBasketPage);
        logger.info("Ürün sepetten silindi");
    }

}
