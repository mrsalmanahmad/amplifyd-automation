import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Amplifydtest {
    static AppiumDriver driver;
    public static void main(String[] args){
        try{
            openAmplifyd();
        }catch (Exception exp){
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.getStackTrace();
        }
    }
    public static void openAmplifyd() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","emulator-5554");
        cap.setCapability("platformName","Android");
        cap.setCapability("appPackage","com.logicon.amplifyd.debug");
        cap.setCapability("appActivity","com.logicon.amplifyd.activities.prelogin.SplashActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url,cap);
        System.out.println("Application Started ....");

        Thread.sleep(9000);

        MobileElement getstarted = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/bt_start"));
//        MobileElement selectinfluencer = (MobileElement) driver.findElements(By.id("com.logicon.amplifyd.debug:id/influencer_btn"));
//        MobileElement closewindow = (MobileElement) driver.findElements(By.id("com.logicon.amplifyd.debug:id/ibLeft"));

        Thread.sleep(5000);
        getstarted.click();

//        selectinfluencer.click();
//        closewindow.click();
        Thread.sleep(2000);
        MobileElement brand = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/brand_btn"));
        MobileElement influencer = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/influencer_btn"));

        brand.click();
        Thread.sleep(2000);

        MobileElement signin = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/link_to_login"));

        signin.click();
        Thread.sleep(2000);

        MobileElement email = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/login_email_edittext"));
        MobileElement password = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/login_password_edittext"));
        MobileElement loginbtn = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/login_btn"));


        email.sendKeys("g@gmail.com");
        password.sendKeys("Abcde@123");

        Thread.sleep(5000);
        loginbtn.click();

        Thread.sleep(9000);
        MobileElement ok = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/btn_close_prompt_dialog"));
        ok.click();
        Thread.sleep(9000);
        MobileElement createcamapignbtn = (MobileElement) driver.findElementsByXPath("//android.widget.FrameLayout[@content-desc=\"Add Campaign\"]/android.widget.ImageView");
        createcamapignbtn.click();
    }
}
 //My comment to test