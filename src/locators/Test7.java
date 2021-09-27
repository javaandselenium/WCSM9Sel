package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.instagram.com/");
     driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
     
     
     driver.findElement(By.name("username")).sendKeys("fgghfghsg");
     driver.findElement(By.name("password")).sendKeys("fjhsgffgsgh");
     driver.findElement(By.xpath("//div[text()='Log In']")).click();
     
    String title = driver.getTitle();
    System.out.println(title);
    
    String url = driver.getCurrentUrl();
     System.out.println(url);
     
     if(title.equals("Instagram")) {
    	 System.out.println("Pass");
     }
     else
     {
    	 System.out.println("fail");
     }

driver.close();
	}

}
