package Day02_driversMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriversMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        Thread.sleep(1000); //hard-wait

        driver.get("https://www.amazon.com/");

        //to maximize the chrome page and see the size
        driver.manage().window().maximize();
        System.out.println("maximized window size: " + driver.manage().window().getSize());

        Thread.sleep(1000);

        driver.manage().window().fullscreen();
        System.out.println("full screen size: " + driver.manage().window().getSize());


        Thread.sleep(3000);
        //To change size and position
        driver.manage().window().setPosition(new Point(100, 100));
        driver.manage().window().setSize(new Dimension(300, 300));


        Thread.sleep(3000);
        driver.close();

    }
}
