package Day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_Question1 {

    public static void main(String[] args) throws InterruptedException {

        //1- Create a test class and set the relevant settings
        //2- Go to https://www.automationexercise.com/
        //3- Locate the elements in the category section
        //4- Test that there are 3 elements in the Category section
        //5- Print the category names
        //6- Close the page

        //1- Create a test class and set the relevant settings
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- Go to https://www.automationexercise.com/
        driver.get("https://www.automationexercise.com/");

        //3- Locate the elements in the category section
        List<WebElement> categoryElements  = driver.findElements(By.className("panel-heading"));

        //4- Test that there are 3 elements in the Category section
        if(categoryElements.size()==3){
            System.out.println("Test is PASSED for amount of elements");
        }else {
            System.out.println("Test is FAILED for amount of elements");
        }

        //5- Print the category names

        for (int i = 0; i < categoryElements.size(); i++) {
            System.out.print(categoryElements.get(i).getText() + "  ");
        }

        //6- Close the page
        driver.close();

    }
}
