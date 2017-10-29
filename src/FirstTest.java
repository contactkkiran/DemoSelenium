import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();

        driver.get("http://www.google.com");
        
        WebElement textBox = driver.findElement(By.id("lst-ib"));
        textBox.sendKeys("Hello Guys");
        Thread.sleep(3000);
        textBox.clear();

        textBox.sendKeys("Hello");
        textBox.clear();
        textBox.sendKeys(" ");

        
//        List<WebElement> elements=driver.findElements(By.id("lst-ib')"));
//        Thread.sleep(3000);
//
//        for (WebElement webElement : elements) {"
//			System.out.println(elements);
//		}
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(3000);
        driver.close();
        driver.quit();


	}

}
