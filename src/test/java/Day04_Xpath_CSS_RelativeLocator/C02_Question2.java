package Day04_Xpath_CSS_RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Question2 {

    public static void main(String[] args) throws InterruptedException {
        //1- create a class
        //2- Go to https://www.amazon.com/
        //3- Make the browser full page
        //4- Refresh the page
        //5- Test if the page title contains the phrase “Spend less”
        //6- Press the Gift Cards tab
        //7- Press the Birthday button
        //8- Click the first product from the Best Seller section
        //9- Select $25 from Gift card details
        //10-Test the product price is $25.00
        //11-Close the page

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- Go to https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //4- Refresh the page
        driver.navigate().refresh();

        //5- Test if the page title contains the phrase “Spend less”
        String expectedResult = "Spend less";
        String actualResult = driver.getTitle();
        System.out.println(actualResult);

        if(actualResult.contains(expectedResult)){
            System.out.println("Test is PASSED");
        }else{
            System.out.println("Test is FAILED");
        }

        //6- Press the Gift Cards tab

        WebElement giftCard = driver.findElement(By.linkText("Gift Cards"));
        WebElement giftCard2 = driver.findElement(By.xpath("(//a[@data-csa-c-type = 'link'])[16]"));
        // *****this is when you want to use one of multiple webeElement from same xpath
        giftCard.click();

        //7- Press the Birthday button
        WebElement birthdayButton = driver.findElement(By.xpath("//img[@alt='Birthday']"));
        birthdayButton.click();

        //8- Click the first product from the Best Seller section
        WebElement firstProduct = driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[1]"));
        firstProduct.click();

        //9- Select $25 from Gift card details
        WebElement price25 = driver.findElement(By.xpath("//button[@value='25']"));
        price25.click();


        //10-Test the product price is $25.00
        WebElement selectPrice = driver.findElement(By.xpath("//span[@class=\"a-color-price a-text-bold\"]"));
        System.out.println(selectPrice.getText());
        String expectedPrice = "$25.00";
        String actualPrice = selectPrice.getText();

        if(expectedPrice.equals(actualPrice)){
            System.out.println("Price test is PASSED");
        }else{
            System.out.println("Price test is FAILED");
        }




        //11-Close the page
        Thread.sleep(3000);
        driver.close();


    }
}
