package org.example.elements;

import org.openqa.selenium.By;

public class ProductPageElements {
    public static final By productPagePrice = By.id("sp-price-lowPrice");
    public static final By basketButton =By.cssSelector("button#add-to-basket");
    public static final By goToBasket = By.xpath("//a[@href=\"https://www.gittigidiyor.com/sepetim\"][@class=\"dIB\"]");
}
