package Day01_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_driversMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String amazonURL = "https://www.amazon.com/";

        driver.get(amazonURL);

        //lets test url  = "https://www.amazon.com/"

        String expectedURL = "https://www.amazon.com/";

        String actualURL = driver.getCurrentUrl();

        if (actualURL.equals(expectedURL)){
            System.out.println("URL test is passed");
        }else {
            System.out.println("URL test is failed");
        }

        driver.close();





    }
}
