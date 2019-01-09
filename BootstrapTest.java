import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/mohsharm4/Downloads/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_1");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
	   List<WebElement> list= driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//li//a//label"));
	    System.out.println(list.size());
	    for (int i=0;i<list.size();i++)
	    {
	    	System.out.println(list.get(i).getText());
	    	list.get(i).click();
	    }

	}

}
