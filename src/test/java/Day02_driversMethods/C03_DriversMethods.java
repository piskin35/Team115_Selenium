package Day02_driversMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriversMethods {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        //to get all htm codes from the page
        String pageSource = driver.getPageSource();
        String expectedWord = "Hello";

        if(pageSource.contains(expectedWord)){
            System.out.println("test is passed");
        }else{
            System.out.println("test is failed");
        }

        driver.close();

    }
}
