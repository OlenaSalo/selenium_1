package epam;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainTest {

    @Test
    public  void chromeTest()
    {
      System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(" https://www.google.com");
        WebElement element=driver.findElement(By.name("q"));
        element.sendKeys("Apple");
        element.submit();
        System.out.println("Page title is:" + driver.getTitle());
        (new WebDriverWait(driver,10)).until((dr)-> dr.getTitle().toLowerCase().startsWith("apple"));
        System.out.println("Page title is:" + driver.getTitle());
//        driver.quit();


    }
}
