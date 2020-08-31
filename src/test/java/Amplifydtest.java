import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.interactions.HasTouchScreen;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

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
//        cap.setCapability("deviceName","9885f35044584b3941");
        cap.setCapability("platformName","Android");
        cap.setCapability("appPackage","com.logicon.amplifyd.debug");
        cap.setCapability("appActivity","com.logicon.amplifyd.activities.prelogin.SplashActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url,cap);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
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
        MobileElement paidcampaignbox = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/give_way_chk_box"));
        paidcampaignbox.click();
        System.out.println("Giveaway campaign selected");
        MobileElement proceedbtn = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/proceed_action"));
        proceedbtn.click();
        System.out.println("On step 1");
        // Date to add in campaign name
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
        System.out.println(df.format(dateobj));

        MobileElement camptitle = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/campaign_creation_title"));
        camptitle.sendKeys("Auto Campaign "+ dateobj);
        System.out.println("Campaign title added");
        MobileElement camppurpose = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/selected_purpose_checkbox"));
        camppurpose.click();
        System.out.println("Campaign propose selected");

        //The viewing size of the device
        Dimension size = driver.manage().window().getSize();
        //x position set to mid-screen horizontally
        int width = size.width / 2;
        //Starting y location set to 80% of the height (near bottom)
        int startPoint = (int) (size.getHeight() * 0.80);
        //Ending y location set to 20% of the height (near top)
        int endPoint = (int) (size.getHeight() * 0.20);
        new TouchAction(driver).press(PointOption.point(width, startPoint)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(width, endPoint)).release().perform();


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

        MobileElement location = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/add_location_Iv"));
        location.click();
        MobileElement addlocation = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/cat_selected_checkbox"));
        addlocation.click();
        MobileElement tick2 = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/ibRight"));
        tick2.click();
        MobileElement Next2 = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/btn_next"));
        Next2.click();
        System.out.println("Selecting Budget");

        MobileElement click_budget2 = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/select_category_layout"));
        click_budget2.click();

//        MobileElement budget = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/sedittext_budget"));
//        MobileElement budget = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/campaign_creation_title"));
//        int price = 12000;
//        budget.sendKeys("5000");
//        budget.sendKeys(String.valueOf(price));

        MobileElement final_s = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/btn_next"));
        final_s.click();
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"+".scrollToEnd(55);"));
        MobileElement start_c = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/btn_start_campaign"));
        start_c.click();
        System.out.println("Campaign Created Sucessfully");
//      open new proposal
    }
}
 