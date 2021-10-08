package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.cssSelector(".textField")).sendKeys("admin");
		//driver.findElement(By.cssSelector(".textField pwdfield")).sendKeys("gfghfghfg");

		
		//driver.close();
	}

}
