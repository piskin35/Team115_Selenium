package Day04_Xpath_CSS_RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Question1 {

    public static void main(String[] args) throws InterruptedException {

        //1- Go to https://the-internet.herokuapp.com/add_remove_elements/
        //2- Press the Add Element button
        //3- Test that the Delete button is visible
        //4- Press the delete key
        //5- Test that the text “Add/Remove Elements“ is visible

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- Go to https://the-internet.herokuapp.com/add_remove_elements/
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        Thread.sleep(2000);
        //2- Press the Add Element button
        WebElement addButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addButton.click();


        //3- Test that the Delete button is visible
        WebElement deleteButton = driver.findElement(By.xpath("//button[text()='Delete']"));

        if(deleteButton.isDisplayed()){
            System.out.println("Test is PASSED");
        }else{
            System.out.println("Test is FAILED");
        }

        //4- Press the delete key
        Thread.sleep(2000);
        deleteButton.click();

        //5- Test that the text “Add/Remove Elements“ is visible
        WebElement addRemoveText = driver.findElement(By.xpath("//h3[text()='Add/Remove Elements']"));

        if(addRemoveText.isDisplayed()){
            System.out.println("Test is PASSED");
        }else{
            System.out.println("Test is FAILED");
        }



        Thread.sleep(3000);
        driver.close();

    }

}
