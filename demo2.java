package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	boolean result = driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
		if (result==true)
			System.out.println("amazon website is opened");
		else 
			System.out.println("amazon website is not opened");
		
		driver.close();	
	}
}

