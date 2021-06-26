import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.muvi.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("load_login")).click();
		driver.findElement(By.id("LoginForm_email")).sendKeys("womiyd23@pigicorn.com");
		driver.findElement(By.id("LoginForm_password")).sendKeys("test1234");
		driver.findElement(By.xpath("//input[@id='btn-login']")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Manage Content")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Content Library")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Add Content")).click();
		

		driver.findElement(By.id("mname")).sendKeys("Testing");
		Thread.sleep(2000);
		Select s = new Select(driver.findElement(By.id("content_category_value")));
		s.selectByVisibleText("Movie");
		driver.findElement(By.id("save-btn")).click();
		driver.findElement(By.linkText("Manage Content")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Content Library")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Testing")).click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		if (driver.getPageSource().contains("Testing")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}


	}

