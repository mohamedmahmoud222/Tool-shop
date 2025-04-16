package bob;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ProductPage;

import java.time.Duration;


public class CartTest extends BaseTest {

    CartPage cartpage;
    //cartpage=new void CartPage(CH);



    ProductPage productpage;



    @BeforeMethod

    public void ADDAll(){

        cartpage= new CartPage(CH);
        productpage =new ProductPage(CH);

    }

   @Test ()

           public void CheckOut(){



        //cartpage= new CartPage(CH);
        //productpage =new ProductPage(CH);
        cartpage.cart();
        cartpage.COut();
    }


    @Test()

        public void remove_back() throws InterruptedException {

        cartpage= new CartPage(CH);
        //productpage =new ProductPage(CH);
        productpage.AddBack();
        productpage.AddJacket();
        productpage.AddBike();
        Thread.sleep(4000);
        cartpage.Rback();

    }

    @Test

       public void Add_Remove_Checkout (){
        productpage.AddBike();
        productpage.AddJacket();
        cartpage.cart();
        cartpage.Rjacket();

        cartpage.COut();



    }







}
