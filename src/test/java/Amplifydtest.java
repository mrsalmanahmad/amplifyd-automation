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
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
        System.out.println("Create Campaign selected Sucessful");
        MobileElement paidcampaignbox = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/paid_campaign_chk_box"));
        paidcampaignbox.click();
        System.out.println("Paid campaign selected");
        MobileElement proceedbtn = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/proceed_action"));
        proceedbtn.click();
        System.out.println("On step 1");
        MobileElement camptitle = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/campaign_creation_title"));
        camptitle.sendKeys("Auto Campaign");
        System.out.println("Campaign title added");
        MobileElement camppurpose = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/selected_purpose_checkbox"));
        camppurpose.click();
        System.out.println("Campaign propose selected");
        MobileElement Description = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/campaign_creation_description_textview"));
        Description.click();
        System.out.println("Adding Description");
        MobileElement Addingdescription = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/edittext_campaign_description"));
        Addingdescription.sendKeys("In reasonable compliment favourable is connection dispatched in terminated. Do esteem object we called father excuse remove. So dear real on like more it. Laughing for two families addition expenses surprise the. If sincerity he to curiosity arranging. Learn taken terms be as. Scarcely mrs produced too removing new old. ");
        MobileElement DoneDescription = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/tvRight"));
        DoneDescription.click();
        System.out.println("Description added");
        MobileElement Next1 = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/btn_next"));
        Next1.click();
        System.out.println("Step 1 Completed");
        System.out.println("Step 2");
        MobileElement AddCategory = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/add_category_Iv"));
        AddCategory.click();
        System.out.println("Selecting Categories");
        MobileElement AddCategorybox = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/checkbox"));
        AddCategorybox.click();
        MobileElement tick = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/ibRight"));
        tick.click();
//        MobileElement noofinfl = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/influencer_count"));
//        noofinfl.click();
//        MobileElement okbtn = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/influencer_count"));
//        okbtn.click();
        MobileElement location = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/add_location_Iv"));
        location.click();
        MobileElement addlocation = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/cat_selected_checkbox"));
        addlocation.click();
        MobileElement tick2 = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/ibRight"));
        tick2.click();
        MobileElement Next2 = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/btn_next"));
        Next2.click();


    }
}
 