package alert.mukesh.and.sagar;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Tab_Handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium_Rakesh_sir_new_eclipse\\Rishi Sir Selenium Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		/*
		 * String mainWindowID = driver.getWindowHandle();
		System.out.println("Main Window ID is = "+mainWindowID);
		Set<String> allWinID = driver.getWindowHandles();
		System.out.println("All Window ID is = "+allWinID);
		String windowID_1 = (String) allWinID.toArray()[0];
		System.out.println("First Window ID is = "+windowID_1);
		String windowID_2 = (String) allWinID.toArray()[1];
		System.out.println("Second Window ID is = "+windowID_2);
		driver.switchTo().window(windowID_2);
		 */
		
		
		
		String mainTab = driver.getWindowHandle();
		System.out.println("Main Tab"+ "  = "+mainTab);
		
		driver.findElement(By.xpath("//a[text()='Instagram']")).click();
		Thread.sleep(2000);
		
		Set<String> allTab = driver.getWindowHandles();
		System.out.println("All Tab = "+allTab);
		
//		for(String all : allTab) {
//			if(!mainTab.equals(all)) {
//				driver.switchTo().window(all);
//			}
//		}
	
		
		
		//each-for loop OR enhance -for loop
		for(String all : allTab) {
			if(!mainTab.equals(all))
			driver.switchTo().window(all);
		}
		
				
				
				
		
		
		
		
		
//		driver.switchTo().window(mainTab);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Mukesh");
	}
}
