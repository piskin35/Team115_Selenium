package Day05_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Question1 {
    public static void main(String[] args) throws InterruptedException {

        //1. Go to http://zero.webappsecurity.com
        //2. Click the Signin button
        //3. Write “ username ” in the Login field
        //4. Write “ password ” in the password field
        //5. Click the Sign in button
        //6. Go to the Pay Bills page
        //7. Type any amount you want to deposit in the amount
        //8. Write “2020-0 9 - 10 ” on the 8th date part
        //9. Click on the Pay button
        //10. “The payment was successfully submitted.” test that the it appears

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. Go to http://zero.webappsecurity.com
        driver.get("http://zero.webappsecurity.com");
        //2. Click the Signin button
        WebElement signInButton = driver.findElement(By.id("signin_button"));
        signInButton.click();

        //3. Write “ username ” in the Login field
        WebElement loginField = driver.findElement(By.name("user_login"));
        loginField.sendKeys("username");

        //4. Write “ password ” in the password field
        WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));
        passwordField.sendKeys("password");
        //5. Click the Sign in button
        WebElement submitButton  = driver.findElement(By.xpath("//*[@*='submit']"));
        submitButton.click();
        //****You may need to navigate back
        //***You may need to click ONLINE BANKING
        //6. Go to the Pay Bills page
        //7. Type any amount you want to deposit in the amount
        //8. Write “2020-0 9 - 10 ” on the 8th date part
        //9. Click on the Pay button
        //10. “The payment was successfully submitted.” test that the it appears


        Thread.sleep(3000);
        driver.close();

    }
}
