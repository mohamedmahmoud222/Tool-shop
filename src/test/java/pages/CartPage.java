package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver CH;

    public CartPage(WebDriver CH) {
        this.CH = CH;
    }


     // locators
    By CheckOut = By.id("checkout");
    By ContinueShopping = By.id("continue-shopping");
    By RemoveBackpack    = By.id("remove-sauce-labs-backpack");
    By RemoveBike         = By.id("remove-sauce-labs-bike-light");
    By RemoveTshirt      = By.id("remove-sauce-labs-bolt-t-shirt");
    By RemoveJacket       = By.id("remove-sauce-labs-fleece-jacket");
    By RemoveOnesie       = By.id("remove-sauce-labs-onesie");
    By RemoveRed           = By.id("remove-test.allthethings()-t-shirt-(red)");

      // methods

    public void COut(){

        CH.findElement(CheckOut).click();
    }

    public void Rback (){
        CH.findElement(RemoveBackpack).click();
    }

    public void Rbike (){
        CH.findElement(RemoveBike).click();
    }
    public void Rshirt(){
        CH.findElement(RemoveTshirt).click();
    }
    public void Rjacket(){

        CH.findElement(RemoveJacket).click();
    }
    public void Ronesie(){

        CH.findElement(RemoveOnesie).click();
    }
    public void Rred (){

        CH.findElement(RemoveRed).click();
    }

    public void cart(){
        CH.findElement(By.className("shopping_cart_link")).click();

    }








}
