import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling_1 {

	public static void main(String[] args) throws InterruptedException {
		// Open browser
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium_Rakesh_sir_new_eclipse\\Rishi Sir Selenium Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2019/04/new-window.html");

		// Part 1
		// To Capture the main window name and print the same

		String mw = driver.getWindowHandle();

		System.out.println("Main window name is : " + mw);
		System.out.println("===================================");

		// Part 2
		// Generate a new window
		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();

		// Collect all the list of window handle in one container

		Set<String> awn = driver.getWindowHandles();
		System.out.println("All window name is : " + awn);
		System.out.println("====================================");

		// Part3
		/*
		 * Using the array concept the two window names will get the identity as window
		 * 1 and 2 respectively
		 */

		String window1 = (String) awn.toArray()[0];
		System.out.println("Window 1 name is : " + window1);
		System.out.println("===================================");

		String window2 = (String) awn.toArray()[1];
		System.out.println("Window 2 name is : " + window2);
		System.out.println("===================================");

		// Part4
		// Switch between the windows using the defined user window names

		driver.switchTo().window(window2);

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mukesh Jhorar");
		driver.findElement(By.xpath("//input[@name='q']")).submit();

		Thread.sleep(3000);
		driver.switchTo().window(window1);
		Thread.sleep(3000);
		driver.switchTo().window(window2);
		Thread.sleep(3000);
		driver.switchTo().window(window1);
		Thread.sleep(3000);
		driver.switchTo().window(window2);

		driver.quit();

	}
}
