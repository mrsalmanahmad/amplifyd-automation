package amplifyd;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import java.net.MalformedURLException;

public class LoginAsBrand {
    public static void main(String[] args) {

    }

    public static void loginasbrand() throws MalformedURLException, InterruptedException {
        MobileElement getstarted = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/bt_start"));
//        MobileElement selectinfluencer = (MobileElement) driver.findElements(By.id("com.logicon.amplifyd.debug:id/influencer_btn"));
//        MobileElement closewindow = (MobileElement) driver.findElements(By.id("com.logicon.amplifyd.debug:id/ibLeft"));

        getstarted.click();
        System.out.println("Getting Started Sucessful");

//        selectinfluencer.click();
//        closewindow.click();
        System.out.println("Wait for User Role (Brand or Influencer)");
        MobileElement brand = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/brand_btn"));
        MobileElement influencer = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/influencer_btn"));

        brand.click();
        System.out.println("Brand Selected");


        MobileElement signin = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/link_to_login"));

        signin.click();
        System.out.println("Wait for Login");

        MobileElement email = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/login_email_edittext"));
        MobileElement password = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/login_password_edittext"));
        MobileElement loginbtn = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/login_btn"));


        email.sendKeys("g@gmail.com");
        password.sendKeys("Abcde@123");
        loginbtn.click();
        System.out.println("Login Sucessful");
        MobileElement ok = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/btn_close_prompt_dialog"));
        ok.click();
    }
}