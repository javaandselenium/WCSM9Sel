package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.linkedin.com/login");
	     
	     driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	     
	    WebDriverWait w=new WebDriverWait(driver,5);
	    
	    
	  //  WebElement ele = driver.findElement(By.id("username"));
	 //   w.until(ExpectedConditions.visibilityOf(element));
//	    w.until(ExpectedConditions.visibilityOfElementLocated(locator));
//	    w.until(ExpectedConditions.elementToBeClickable(locator));
//	    w.until(ExpectedConditions.elementToBeClickable(element));
//	    w.until(ExpectedConditions.titleContains(title));
//	     
	     
	    driver.findElement(By.id("password")).sendKeys("hghhfghfgh");
	    
	    w.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("hello");
	     
	    WebElement button = driver.findElement(By.xpath("//button[text()='Sign in']"));
	    w.until(ExpectedConditions.elementToBeClickable(button)).click();
	    
	    w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Sign in']"))).click();
	     
	    String title = driver.getTitle();
	    w.until(ExpectedConditions.titleContains(title));
	}

}
