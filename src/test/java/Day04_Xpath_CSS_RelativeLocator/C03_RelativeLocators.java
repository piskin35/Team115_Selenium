package Day04_Xpath_CSS_RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C03_RelativeLocators {
    public static void main(String[] args) throws InterruptedException {
        //1) Go to https://www.diemol.com/selenium-4-demo/relative-locators-demo.html
        //2 ) Locate Berlin with 3 different relative locators
        //3 ) Test that the Relative locators are working correctly


        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1) Go to https://www.diemol.com/selenium-4-demo/relative-locators-demo.html
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        WebElement boston = driver.findElement(By.cssSelector("#pid6_thumb"));
        WebElement berlin1 = driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(boston));

        WebElement sailor = driver.findElement(By.cssSelector("#pid11_thumb"));
        WebElement berlin2 = driver.findElement(RelativeLocator.with(By.tagName("img")).above(sailor));

        WebElement bayArea = driver.findElement(By.cssSelector("#pid8_thumb"));
        WebElement berlin3 = driver.findElement(RelativeLocator.with(By.tagName("img")).toLeftOf(bayArea));

        String expectedValue = "pid7_thumb";
        String actualIDofBerlin = berlin3.getAttribute("Id");

        if(expectedValue.equals(actualIDofBerlin)){
            System.out.println("test is passed");
        }else{
            System.out.println("test is failed");
        }

        Thread.sleep(3000);
        driver.close();

    }
}
