package testng;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3 {
	public WebDriver driver;

	@BeforeMethod
	public void openApp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test
	public void upload() throws IOException {
		driver.findElement(By.xpath("//label[contains(text(),'Upload CV')]")).click();
		Runtime.getRuntime().exec("C:\\Users\\QSP\\Desktop\\Autoit\\SRupload233445.exe");
}
}