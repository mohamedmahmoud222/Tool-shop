package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

    WebDriver CH ;


    public ProductPage(WebDriver CH) {
        this.CH = CH;
    }

    //locators

    By BackBag = By.id("add-to-cart-sauce-labs-backpack");
    By BikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    By T_shirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By Jacket = By.id("add-to-cart-sauce-labs-fleece-jacket");



    public void AddBack(){

        CH.findElement(BackBag).click();

    }
    public void AddBike(){

        CH.findElement(BikeLight).click();

    }
    public void AddT_shirt(){

        CH.findElement(T_shirt).click();

    }
    public void AddJacket(){

        CH.findElement(Jacket).click();

    }

    



}
