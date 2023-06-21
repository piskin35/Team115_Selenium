package Day02_driversMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C12_FindElementByClassName {

    public static void main(String[] args) throws InterruptedException {
        // Go to the amazon.com
        // search for nutella
        // print the highest price in the first page

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();

        // 1) go to the https://www.amazon.com
        driver.get("https://www.amazon.com");

        // search for nutella
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("nutella");
        Thread.sleep(1000);
        searchBox.submit();

        // print the highest price in the first page
        //this list has web elements
        List<WebElement> priceList = driver.findElements(By.className("a-price-whole"));

        //getText(): we cannot driectly print web element so wee need to reach each element text contents
        //System.out.println(priceList);

        for (int i = 0; i < priceList.size(); i++) {
            System.out.println(priceList.get(i).getText());
        }

        //to print the highest value

        String strNumber = "";
        int highestNumber = 0;
        int num = 0;

        for (int i = 0; i < priceList.size(); i++) {
            strNumber = priceList.get(i).getText(); //"14"
            num = Integer.parseInt(strNumber);//14

            if(num>highestNumber){
                highestNumber = num;
            }
        }

        System.out.println("The highest price: " + highestNumber);

        driver.close();
    }
}
