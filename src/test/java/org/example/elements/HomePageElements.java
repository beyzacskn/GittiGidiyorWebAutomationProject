package org.example.elements;

import org.openqa.selenium.By;

public class HomePageElements {
    public static final String baseURL = "https://www.gittigidiyor.com/";
    public static final By loginHover = By.xpath("//div[@class=\"gekhq4-4 egoSnI\" and text()=\"Giriş Yap\"]");
    public static final By loginButton =By.xpath("//a[@data-cy=\"header-login-button\"]");
    public static final By txtHesabim = By.xpath("//div[@title=\"Hesabım\"]//div[text()=\"Hesabım\"]");
    public static final By inputSearch = By.xpath("//input[@data-cy=\"header-search-input\"]");
    public static final By findButton = By.cssSelector("button[data-cy=\"search-find-button\"]");
    public static final By secondPage = By.xpath("//a[@title=\"2. sayfa\"]");
    public static final By checkSecondPage = By.xpath("//a[@title=\"2. sayfa\" and @aria-current=\"true\"]");
}
