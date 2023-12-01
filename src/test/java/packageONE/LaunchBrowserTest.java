package packageONE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowserTest {
    @Test
	public void launch() {
		WebDriver driver=new ChromeDriver();
		
		
		
		
		
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
}
