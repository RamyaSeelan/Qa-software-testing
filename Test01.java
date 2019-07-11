import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Test01 {

@Test(priority = 1)
    public static void main(String args[]) throws MalformedURLException {


        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "8a3fcefc");
        dc.setCapability("platformName", "Android");
        dc.setCapability("appWaitActivity", "com.muvee.v4.screen.shiok.HomeActivity");
        dc.setCapability("app", "C:\\Users\\muvee\\Downloads\\aiBooks 0.00.10(Staging).apk");
        dc.setCapability("noReset", "true");
        dc.setCapability("setWebContentsDebuggingEnabled","true");



        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);



        TouchAction action = new TouchAction(driver);


        MobileElement el1 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/img_menu");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/txt_sign_in");
        el2.click();
        MobileElement e13 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/edit_email");
        e13.sendKeys("my_address@gmail.com");
        MobileElement e14 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/edit_password");
        e14.sendKeys("text123");
        MobileElement e15 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/button_login");
        e15.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.HorizontalScrollView[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ImageView[1]");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/btnPrintLive");
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/frm_basic");
        el8.click();
        MobileElement el9 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/btnNext");
        el9.click();
        MobileElement e20 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.TextView[2]");
        e20.click();


        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);



        driver.quit();












    }
}
