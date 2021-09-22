package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/");
	
	driver.findElement(By.id("email")).sendKeys("fghfffgfgh");
	driver.findElement(By.name("pass")).sendKeys("jjgfgfhg");
	Thread.sleep(3000);
	driver.findElement(By.name("login")).click();

	}

}
