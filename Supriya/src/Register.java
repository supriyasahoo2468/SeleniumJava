import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		{
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://www.muvi.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
				
			driver.findElement(By.linkText("FREE TRIAL")).click();
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Test");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("womiyd25@pigicorn.com");
			driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("test1234");
			Thread.sleep(3000);		
			driver.findElement(By.xpath("//span[contains(text(),\"I agree to Muvi's\")]")).click();
			
			driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//button[text()='NEXT']")).click();
					
		
					

		}

	
	}

}
