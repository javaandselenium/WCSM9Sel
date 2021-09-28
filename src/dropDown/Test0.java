package dropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 WebElement dropDown = driver.findElement(By.id("gh-cat"));
		
		 Select s=new Select(dropDown);
		 s.selectByIndex(16);
		 s.selectByValue("2984");
		 s.selectByVisibleText("Cars");
		 
		
		 driver.close();


	}

}
