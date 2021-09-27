package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.linkedin.com/login");
     driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
     
     driver.findElement(By.id("username")).sendKeys("jufgjhfgfj");
     driver.findElement(By.id("password")).sendKeys("hghhfghfgh");
     driver.findElement(By.xpath("//button[text()='Sign in']")).click();
     System.out.println(driver.getTitle());

	}

}
