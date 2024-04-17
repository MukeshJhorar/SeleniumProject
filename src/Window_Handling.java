import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\\\Selenium_Rakesh_sir_new_eclipse\\\\Rishi Sir Selenium Project\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2019/04/new-window.html");
		driver.manage().window().maximize();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text() = 'Try it']")).click();

		String mainWindowID = driver.getWindowHandle();
		System.out.println("Main Window ID is = "+mainWindowID);
		
		
		
		
		Set<String> allWinID = driver.getWindowHandles();
		System.out.println("All Window ID is = "+allWinID);
		

		
		String windowID_1 = (String) allWinID.toArray()[0];
		System.out.println("First Window ID is = "+windowID_1);

		String windowID_2 = (String) allWinID.toArray()[1];
		System.out.println("Second Window ID is = "+windowID_2);

		driver.switchTo().window(windowID_2);
		
		driver.manage().window().maximize();
		

		Thread.sleep(5000);
		driver.findElement(By.id("APjFqb")).sendKeys("hello");// APjFqb
		Thread.sleep(5000);
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);

		Thread.sleep(5000);
		driver.switchTo().window(windowID_1);
		Thread.sleep(5000);
		driver.switchTo().window(windowID_2);
		Thread.sleep(5000);
		driver.close();
//		driver.quit();

	}
}
