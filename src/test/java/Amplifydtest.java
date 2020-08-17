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
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Application Started ....");
        System.out.println("Splash Screen");
        System.out.println("Wait for Getting Started");

        MobileElement getstarted = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/bt_start"));
//        MobileElement selectinfluencer = (MobileElement) driver.findElements(By.id("com.logicon.amplifyd.debug:id/influencer_btn"));
//        MobileElement closewindow = (MobileElement) driver.findElements(By.id("com.logicon.amplifyd.debug:id/ibLeft"));

        getstarted.click();
        System.out.println("Getting Started Sucessful");

//        selectinfluencer.click();
//        closewindow.click();
        System.out.println("Wait for User Role (Brand or Influencer)");
        MobileElement brand = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/brand_btn"));
        MobileElement influencer = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/influencer_btn"));

        brand.click();
        System.out.println("Brand Selected");


        MobileElement signin = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/link_to_login"));

        signin.click();
        System.out.println("Wait for Login");

        MobileElement email = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/login_email_edittext"));
        MobileElement password = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/login_password_edittext"));
        MobileElement loginbtn = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/login_btn"));


        email.sendKeys("g@gmail.com");
        password.sendKeys("Abcde@123");
        loginbtn.click();
        System.out.println("Login Sucessful");
        MobileElement ok = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/btn_close_prompt_dialog"));
        ok.click();
        MobileElement createcamapignbtn = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/navigation_add_campaign"));
        createcamapignbtn.click();
        MobileElement paidcampaignbox = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/paid_campaign_chk_box"));
        paidcampaignbox.click();
        MobileElement proceedbtn = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/proceed_action"));
        proceedbtn.click();
        MobileElement camptitle = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/campaign_creation_title"));
        MobileElement camppurpose = (MobileElement) driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView");


        camptitle.sendKeys("Auto Campaign");
        camppurpose.click();

    }
}
 