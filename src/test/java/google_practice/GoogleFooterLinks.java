package google_practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GoogleFooterLinks {
	

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver GoogleLinks =new ChromeDriver();

		GoogleLinks.manage().window().maximize();

		GoogleLinks.manage().deleteAllCookies();

		GoogleLinks.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		GoogleLinks.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);    

		GoogleLinks.get("https://www.google.com/");
		
		
		
		// Test-1 Privacy link starts here
		
		GoogleLinks.get("https://www.google.com");

		GoogleLinks.findElement(By.linkText("Privacy")).click();
		System.out.println("I clicked on the Privacy link.");
		Thread.sleep(2000);

		if(GoogleLinks.getPageSource().contains("When you use Google services, you trust us with your information."))
			System.out.println("The Privacy test is passed");
		else
			System.out.println("The Privacy test is failed");

		Assert.assertEquals(true, GoogleLinks.getPageSource().contains("When you use Google services, you trust us with your information"));

		Thread.sleep(2000);
		
		// Test-1 Privacy link ends here

	
		
		
		// Test-2 Terms link starts here
		
		GoogleLinks.get("https://www.google.com");

		GoogleLinks.findElement(By.linkText("Terms")).click();
		System.out.println("I clicked on the Terms link.");
		Thread.sleep(2000);

		if(GoogleLinks.getPageSource().contains("Thanks for using our products and services (“Services”)."))
			System.out.println("The Terms test is passed");
		else
			System.out.println("The Terms test is failed");

		Assert.assertEquals(true, GoogleLinks.getPageSource().contains("Thanks for using our products and services (“Services”)."));

		Thread.sleep(2000);

		
		// Test-2 Terms link ends here

		

		
		
		// Test-3 Settings link starts here
		
		GoogleLinks.get("https://www.google.com");

		GoogleLinks.findElement(By.linkText("Settings")).click();
		System.out.println("I clicked on the Settings link.");
		GoogleLinks.findElement(By.linkText("Search settings")).click();
		System.out.println("I clicked on the Search settings link.");
		

		
		Thread.sleep(2000);

		if(GoogleLinks.getPageSource().contains("The SafeSearch filter isn’t 100% accurate, but it helps you avoid most violent and adult content."))
			System.out.println("The Settings test is passed");
		else
			System.out.println("The Settings test is failed");

		Assert.assertEquals(true, GoogleLinks.getPageSource().contains("The SafeSearch filter isn’t 100% accurate, but it helps you avoid most violent and adult content."));


		// Test-3 Settings link ends here

		Thread.sleep(2000);
		GoogleLinks.close();
	}

}
