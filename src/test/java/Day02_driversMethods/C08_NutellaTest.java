package Day02_driversMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_NutellaTest {

    public static void main(String[] args) throws InterruptedException {

        // 1) go to the https://www.amazon.com
        // 2) search for nutella
        // 3) test that you have searched for nutella

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();

        // 1) go to the https://www.amazon.com
        driver.get("https://www.amazon.com");

        // 2) search for nutella
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        searchBox.sendKeys("java");
        Thread.sleep(1000);
        searchBox.clear();
        Thread.sleep(1000);
        searchBox.sendKeys("nutella");
        Thread.sleep(1000);
        searchBox.submit();

        // 3) test that you have searched for nutella
        String pageSource = driver.getPageSource();

        String expectedWord = "1-48 of 159 results for";

        if(pageSource.contains(expectedWord)){
            System.out.println("Test is passed");
        }else{
            System.out.println("Test is failed");
        }

        driver.close();
    }
}
