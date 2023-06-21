package Day02_driversMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_WindowHandleValue {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String windowsHandleValue = driver.getWindowHandle();
        System.out.println(windowsHandleValue); //BFAFC79F5F61C9E9D10B7BB199C271DD
                                                //B03433EBB9E38379E639747B658E15A2
                                                //BB9E8D55FC8AE692CF79AD8A97A63D6C
        Thread.sleep(3000);
        driver.close();
    }
}
