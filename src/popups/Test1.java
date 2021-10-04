package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		
		Alert al = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(al.getText());
		al.accept();
		al.dismiss();
		
		Thread.sleep(5000);
		driver.close();

	}

}
