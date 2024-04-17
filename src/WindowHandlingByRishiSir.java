import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingByRishiSir {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium_Rakesh_sir_new_eclipse\\Rishi Sir Selenium Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		String parentWinID = driver.getWindowHandle();
		System.out.println("Parent Window ID is = " + parentWinID);

		

		WebElement insta = driver.findElement(By.xpath("//a[text()='Instagram']"));
		insta.click();
		WebElement metaPay = driver.findElement(By.xpath("//a[@title='Learn more about Meta Pay']"));
		metaPay.click();

		Set<String> allWindoID = driver.getWindowHandles();
		System.out.println("All Window ID is = " + allWindoID);
//
//		String metaWinID = driver.getWindowHandle();
//		System.out.println("Meta Window ID is = " + metaWinID);
		
		String windowID_1 =  (String) allWindoID.toArray()[0];
		System.out.println("Window id 1 = "+windowID_1);
		
		String windowID_2 = (String) allWindoID.toArray()[1];
		System.out.println("Window id 2 = "+windowID_2);
		
		String window_ID_3 = (String) allWindoID.toArray()[2];
		System.out.println("Window id 3 = "+window_ID_3);
		
		
		for(String all : allWindoID) {
			if(!windowID_1.equals(all)) {
				driver.switchTo().window(windowID_2);
			}
			else {
				driver.switchTo().window(window_ID_3);
				
				System.out.println();
			}
		}
		
		driver.findElement(By.xpath("//a[normalize-space()='Shop Meta']")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().window(windowID_2);
		

//		for (String wn : allWindoID) {
//			if (!parentWinID.equals(wn)) {
//				driver.switchTo().window(wn);
//				
//			}
//			if (!metaWinID.equals(wn)) {
//				driver.switchTo().window(wn);
//			}
//
//		}

//		for( String wn: allWindoID) {
//			if(!parentWinID.equals(wn)) {
//				driver.switchTo().window(wn);
//			}
//			
//		}

		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='username']"));
		firstname.sendKeys("Mukesh");
//
//		Thread.sleep(5000);
//		driver.quit();

	}
}
