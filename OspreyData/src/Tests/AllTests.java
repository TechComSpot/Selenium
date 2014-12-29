package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.junit.*;

public class AllTests {
	public WebDriver driver;
	@Before public void PossitiveCase ()	
	{
		driver = new FirefoxDriver();
	}
	
	
	@Test public void SomeTests ()
	{
		//Dashboard
		driver.get("http://192.168.21.128/gateway/vision/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//input[@name='username']")).sendKeys("admin");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("pass");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.getTitle();
		System.out.println("Page title: " + driver.getTitle());
		//Operational
		driver.findElement(By.xpath(".//a[@href='#dashboard_2']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Financial
		driver.findElement(By.xpath(".//a[@href='#dashboard_3']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
			//Model criteria
			driver.findElement(By.xpath(".//a[@href='#filter_models_criteria']")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Organization
			driver.findElement(By.xpath(".//a[@href='#filter_organization_criteria']")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//Assert Criteria 
			driver.findElement(By.xpath(".//a[@href='#filter_assets_criteria']")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//Event Criteria
			driver.findElement(By.xpath(".//a[@href='#filter_events_criteria']")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		//Models
		driver.findElement(By.xpath(".//a[@href='/gateway/vision/models/']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//Model criteria
			//driver.findElement(By.xpath("//*[@id='filter_model']/div[2]/div[1]/h4/a")).click();
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//Organization
			driver.findElement(By.xpath("//*[@id='filter_model']/div[3]/div[1]/h4/a")).click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			//Assert Criteria 
			driver.findElement(By.xpath(".//a[@href='#filter_assets_criteria']")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//Event Criteria
			driver.findElement(By.xpath(".//a[@href='#filter_events_criteria']")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		//Asserts
		driver.findElement(By.xpath(".//*[@href='/gateway/vision/assets/']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Events
		driver.findElement(By.xpath("//*[@id='hornav_events']/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Playbook
		driver.findElement(By.xpath("//*[@id='hornav_playbook']/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//Organization
			driver.findElement(By.xpath("//*[@id='filter_playbook']/div[2]/div[1]/h4/a")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//Gassy
			driver.findElement(By.xpath("//*[@id='2']/td[1]/a")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Admin
		driver.findElement(By.xpath("//*[@id='hornav_admin']/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//*[@id='filter_dashboard']/div[2]/div[1]/h4/a")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
		
	@After public void Quit (){
		driver.quit();

}
}
