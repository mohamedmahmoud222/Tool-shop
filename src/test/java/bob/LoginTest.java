package bob;

import base.BaseTest;
import base.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class LoginTest  {

WebDriver CH;

LoginPage loginPage;

LoginTest loginTest;

@BeforeMethod

    public void Beforee(){

    CH = new ChromeDriver();
    CH.manage().window().maximize();
    CH.get("https://www.saucedemo.com/");
    CH.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}



    @Test
    public void validlogin(){
      //  Login.performValidLogin(CH);
         loginPage=new LoginPage(CH);
        loginPage.enterusername("standard_user");
        loginPage.enterpassword("secret_sauce");
        loginPage.clicklogin();


    }
    @Test
    public void invalidUser(){
        loginPage=new LoginPage(CH);
        loginPage.enterusername("Mohammed");
        loginPage.enterpassword("secret_sauce");
        loginPage.clicklogin();


    }

   @Test
    public void invalidPW(){
        loginPage=new LoginPage(CH);
        loginPage.enterusername("standard_user");
        loginPage.enterpassword("mohamed");
        loginPage.clicklogin();


    }
    @Test
    public void invaliduser_and_PW(){
        loginPage=new LoginPage(CH);
        loginPage.enterusername("mohamed");
        loginPage.enterpassword("elkhateb");
        loginPage.clicklogin();


    }











}
