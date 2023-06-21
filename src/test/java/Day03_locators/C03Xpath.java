package Day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

//        1) Xpath way
//        WebElement amazonSearchBox = driver.findElement(By.xpath("//input[@type='text']"));
//        amazonSearchBox.sendKeys("Nutella");

//        2) using id
//        WebElement amazonSearchBox = driver.findElement(By.id("twotabsearchtextbox"));
//        amazonSearchBox.sendKeys("Nutella");

//        3) Xpath way
//        WebElement amazonSearchBox = driver.findElement(By.xpath("//*[@*='text']"));
//        amazonSearchBox.sendKeys("Nutella");

        //HW: Use all amazon saech box attributes for xpath


        Thread.sleep(3000);
        driver.close();
    }
}
