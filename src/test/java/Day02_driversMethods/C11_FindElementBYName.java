package Day02_driversMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C11_FindElementBYName {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();

        // 1) go to the https://www.amazon.com
        driver.get("https://www.amazon.com");

        // 2) found the element using name (By.name)

        WebElement searchBox = driver.findElement(By.name("field-keywords"));
        searchBox.sendKeys("nutella");
        Thread.sleep(1000);
        searchBox.submit();

        Thread.sleep(3000);
        driver.close();

    }
}
