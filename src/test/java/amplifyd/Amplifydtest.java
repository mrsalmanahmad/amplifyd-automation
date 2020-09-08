package amplifyd;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import static amplifyd.LoginAsBrand.loginasbrand;
import static amplifyd.CreateGiveawayCampaign.creategivewaycampaign;
import static amplifyd.CreatePaidCampaign.createpaidcampaign;
import static amplifyd.CreatePaidandGiveawayCampaign.createpaidandgiveawaycampagin;


public class Amplifydtest {
    static AppiumDriver driver;
    public static void main(String[] args){
        try{
            openAmplifyd();
            loginasbrand();
            creategivewaycampaign();
            createpaidcampaign();
            createpaidandgiveawaycampagin();
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
    }
}
 