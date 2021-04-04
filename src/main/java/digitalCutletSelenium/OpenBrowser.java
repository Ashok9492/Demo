package digitalCutletSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.MINUTES);
		driver.get("http://automationpractice.com");
		String title =driver.getTitle();
		System.out.println("Title is: "+title);
		if(title.equals("My Store")){
			System.out.println("Correct title");
			
		}else {
			System.out.println("In Correct title");
		}
		/*driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text' and @name='search_query']")).sendKeys("Tshirts");
		driver.findElement(By.xpath("//button[@type='submit' and @name='submit_search']")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Contact us']")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Contact us")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign in")).click();*/
		driver.findElement(By.linkText("WOMEN")).click();
		
		
	}

}
