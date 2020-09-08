package amplifyd;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.touch.WaitOptions;

public class CreateGiveawayCampaign{
    public static void main(String[] args) {

    }
    public static void creategivewaycampaign() throws MalformedURLException, InterruptedException {
        MobileElement createcamapignbtn = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/navigation_add_campaign"));
        createcamapignbtn.click();
        System.out.println("Create Campaign selected Sucessful");
        MobileElement campaignbox = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/give_way_chk_box"));
        campaignbox.click();
        System.out.println("Giveaway campaign selected");
        MobileElement proceedbtn = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/proceed_action"));
        proceedbtn.click();
        System.out.println("On step 1");
        // Date to add in campaign name
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
        System.out.println(df.format(dateobj));

        MobileElement camptitle = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/campaign_creation_title"));
        camptitle.sendKeys("Auto Giveaway Campaign "+ dateobj);
        System.out.println("Campaign title added");
        MobileElement camppurpose = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/selected_purpose_checkbox"));
        camppurpose.click();
        System.out.println("Campaign propose selected");

        //The viewing size of the device
        Dimension size = Amplifydtest.driver.manage().window().getSize();
        //x position set to mid-screen horizontally
        int width = size.width / 2;
        //Starting y location set to 80% of the height (near bottom)
        int startPoint = (int) (size.getHeight() * 0.80);
        //Ending y location set to 20% of the height (near top)
        int endPoint = (int) (size.getHeight() * 0.20);
        new TouchAction(Amplifydtest.driver).press(PointOption.point(width, startPoint)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(width, endPoint)).release().perform();


        MobileElement Description = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/campaign_creation_description_textview"));
        Description.click();
        System.out.println("Adding Description");
        MobileElement Addingdescription = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/edittext_campaign_description"));
        Addingdescription.sendKeys("In reasonable compliment favourable is connection dispatched in terminated. Do esteem object we called father excuse remove. So dear real on like more it. Laughing for two families addition expenses surprise the. If sincerity he to curiosity arranging. Learn taken terms be as. Scarcely mrs produced too removing new old. ");
        MobileElement DoneDescription = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/tvRight"));
        DoneDescription.click();
        System.out.println("Description added");
        MobileElement Next1 = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/btn_next"));
        Next1.click();
        System.out.println("Step 1 Completed");
        System.out.println("Step 2");
        MobileElement AddCategory = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/add_category_Iv"));
        AddCategory.click();
        System.out.println("Selecting Categories");
        MobileElement AddCategorybox = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/checkbox"));
        AddCategorybox.click();
        MobileElement tick = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/ibRight"));
        tick.click();

        MobileElement location = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/add_location_Iv"));
        location.click();
        MobileElement addlocation = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/cat_selected_checkbox"));
        addlocation.click();
        MobileElement tick2 = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/ibRight"));
        tick2.click();
        MobileElement Next2 = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/btn_next"));
        Next2.click();

//        System.out.println("Selecting Budget");
//        MobileElement Budget = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/edittext_budget"));
//        Budget.sendKeys("500");
//        System.out.println("Budget added");
//        MobileElement click_budget2 = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/select_category_layout"));
//        click_budget2.click();

//        MobileElement budget = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/sedittext_budget"));
//        MobileElement budget = (MobileElement) driver.findElement(By.id("com.logicon.amplifyd.debug:id/campaign_creation_title"));
//        int price = 12000;
//        budget.sendKeys("5000");
//        budget.sendKeys(String.valueOf(price));

        MobileElement final_s = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/btn_next"));
        final_s.click();
        Amplifydtest.driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"+".scrollToEnd(55);"));
        MobileElement start_c = (MobileElement) Amplifydtest.driver.findElement(By.id("com.logicon.amplifyd.debug:id/btn_start_campaign"));
        start_c.click();
        System.out.println("Campaign Created Sucessfully");

    }
}