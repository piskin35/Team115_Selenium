package Day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_Question2_TagName {
    public static void main(String[] args) throws InterruptedException {

        //Automation Exercise Link Test
        //1- Create a test class and set the relevant settings
        //2- Go to https://www.automationexercise.com/
        //3- Test that there are 147 links on the page.
        //4- Click on Products link
        //5- Test that the special offer text appears
        //6- Close the page


        //1- Create a test class and set the relevant settings
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- Go to https://www.automationexercise.com/
        driver.get("https://www.automationexercise.com/");

        //3- Test that there are 147 links on the page.
        List<WebElement> links= driver.findElements(By.tagName("a"));
        if(links.size()==147){
            System.out.println("Test is PASSED.");
        }else{
            System.out.println("Test is FAILED.");
        }


        //4- Click on Products link
//        WebElement productLink = driver.findElement(By.partialLinkText("Produc"));
//        productLink.click();
        driver.findElement(By.partialLinkText("Produ")).click(); //Intentionally we put partial link


        //5- Test that the special offer text appears

        WebElement imageLocator = driver.findElement(By.id("sale_image"));

        if(imageLocator.isDisplayed()){
            System.out.println("Test is PASSED");
        }else{
            System.out.println("Test is FAILED");
        }

        //6- Close the page
        Thread.sleep(3000);
        driver.close();


    }
}
