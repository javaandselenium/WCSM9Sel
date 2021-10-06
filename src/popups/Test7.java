package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test7 {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		

	}

}
