package org.example.elements;

import org.openqa.selenium.By;

public class BasketPageElements {
    public static final By basketPagePrice = By.xpath("//div[@class=\"total-price\"]//strong");
    public static final By productAmount = By.cssSelector("select.amount");
    public static final By selectedProductAmount = By.xpath("//select[@class=\"amount\"] [@value=\"2\"]");
    public static final By containerButtons = By.cssSelector("div.update-buttons-container i.gg-icon-bin-medium");
    public static final By emptyBasketPage = By.xpath("//h2[text()=\"Sepetinizde ürün bulunmamaktadır.\"]");
}
