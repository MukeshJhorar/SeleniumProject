import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium_Rakesh_sir_new_eclipse\\Rishi Sir Selenium Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		String mainWinID = driver.getWindowHandle();
		System.out.println("Main Window ID is = "+mainWinID);
		
		Set<String> allWinID =  driver.getWindowHandles();
		String windowID_1 = (String) allWinID.toArray()[0];
		String windowID_2 = (String) allWinID.toArray()[1];
		System.out.println("All Window ID is = "+allWinID);
		
		driver.findElement(By.xpath("//a[text()='Instagram']")).click();
		
		driver.switchTo().window(windowID_2);
		String title = driver.getTitle();
		System.out.println("Title = "+title);
		
		
		
		
		
		
		
		
		
		
	}
}
