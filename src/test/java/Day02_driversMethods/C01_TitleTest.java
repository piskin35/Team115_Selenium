package Day02_driversMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_TitleTest {
    public static void main(String[] args) {

        //1. Set the property
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");

        //2. Create driver object
        WebDriver driver = new ChromeDriver();

        //3. use driver object for your tests or work on browser

        //let's go to amazon.com
        driver.get("https://www.amazon.com/");

        //let's get the title using driver
//        System.out.println(driver.getTitle());

        String expectedTitle = "Amazon";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Test is passed");
        }else{
            System.out.println("Test is failed");
            System.out.println("Actual title: " + actualTitle);
            System.out.println("Expected title: " + expectedTitle);
        }

        driver.close();

    }
}
