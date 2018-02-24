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
		Thread.sleep(6000);

		if(GoogleLinks.getPageSource().contains("Privacy"))
			System.out.println("The test is passed");
		else
			System.out.println("The test is failed");

		Assert.assertEquals(true, GoogleLinks.getPageSource().contains("Privacy"));

		Thread.sleep(6000);
		
		// Test-1 Privacy link ends here

	
		
		
		// Test-2 Terms link starts here
		
		GoogleLinks.get("https://www.google.com");

		GoogleLinks.findElement(By.linkText("Terms")).click();
		System.out.println("I clicked on the Terms link.");
		Thread.sleep(6000);

		if(GoogleLinks.getPageSource().contains("Terms"))
			System.out.println("The test is passed");
		else
			System.out.println("The test is failed");

		Assert.assertEquals(true, GoogleLinks.getPageSource().contains("Terms"));

		Thread.sleep(6000);

		
		// Test-2 Terms link ends here

		

		
		
		// Test-3 Settings link starts here
		
		GoogleLinks.get("https://www.google.com");

		GoogleLinks.findElement(By.linkText("Settings")).click();
		System.out.println("I clicked on the Settings link.");
		Thread.sleep(6000);

		if(GoogleLinks.getPageSource().contains("Settings"))
			System.out.println("The test is passed");
		else
			System.out.println("The test is failed");

		Assert.assertEquals(true, GoogleLinks.getPageSource().contains("Settings"));


		// Test-3 Settings link ends here

		Thread.sleep(6000);
		GoogleLinks.close();
	}

}
