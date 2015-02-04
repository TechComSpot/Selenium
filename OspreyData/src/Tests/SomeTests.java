package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.Dimension;
import org.junit.*;

public class SomeTests {
	public WebDriver driver;
	@Before public void firefoxSetup ()	
	{
		driver = new FirefoxDriver();
	}
	
	
	@Test public void dashboardPageClicksFine ()
	{
		loginSuccess();
		//Operational
		driver.findElement(By.xpath(".//a[@href='#dashboard_2']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Dashboard Operational Tab Works Fine");
		//Financial
		driver.findElement(By.xpath(".//a[@href='#dashboard_3']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Dashboard Financial Tab Works Fine");
		driver.findElement(By.id(".//*[@id='6']")).click();
		
		
		
			/*//Model criteria
			driver.findElement(By.xpath(".//a[@href='#filter_models_criteria']")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);*/
			//Organization
			driver.findElement(By.xpath(".//a[@href='#filter_organization_criteria']")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("Dashboard Organization Filter Works Fine");
			//Assert Criteria 
			driver.findElement(By.xpath(".//a[@href='#filter_assets_criteria']")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("Dashboard Assert Criteria Filter Works Fine");
			/*//Event Criteria
			driver.findElement(By.xpath(".//a[@href='#filter_events_criteria']")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
			logout();
	}
		@Test public void modelsWizardStep4 ()
		{
		loginSuccess();	
		//Models
		driver.findElement(By.xpath(".//a[@href='/gateway/vision/models/']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Models Page Clicks Fine");
		//Click first model from list
		driver.findElement(By.xpath(".//a[@href='/gateway/vision/models/3/wizard']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Choosing Model Type*
		driver.findElement(By.xpath(".//button[@data-id='model-type']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Choose Machine Learning
		driver.findElement(By.xpath(".//li[@rel='2']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Choosing Playbook*
		driver.findElement(By.xpath(".//button[@data-id='playbook']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Choose Maintenance
		driver.findElement(By.xpath(".//li[@rel='3']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Click Save and Next button step 1
		driver.findElement(By.xpath(".//a[@class='btn button-next']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Click Save and Next button step 2
		driver.findElement(By.xpath(".//a[@class='btn button-next']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Click Save and Next button step 3
		driver.findElement(By.xpath(".//a[@class='btn button-next']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Click Run Model 
		driver.findElement(By.xpath(".//a[@class='btn button-run']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("Run Models Clicks Fine");
		
			/*//Model criteria
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
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
			logout();
		}
		
		@Test public void modelsPageClicksFine ()
		{
		loginSuccess();	
		//Models
		driver.findElement(By.xpath(".//a[@href='/gateway/vision/models/']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Models Page Clicks Fine");
		
			//Export Button
			driver.findElement(By.xpath(".//a[@id='export_btn']")).click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			System.out.println("Models Export List Button Works Fine");
		
			/*//Model criteria
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
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
			logout();
		}
		
		@Test public void modelsPageWizardStep4DeletingAddedSensorFromSelectedSensorDefinitionsTable ()
		{
		loginSuccess();	
		//Models
		driver.findElement(By.xpath(".//a[@href='/gateway/vision/models/']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//a[@href='/gateway/vision/models/4/wizard']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//a[@href='#tab 4']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().setSize(null);
		driver.findElement(By.xpath(".//a[@class='btn-add-field btn-add']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Shape Pill button click
		driver.findElement(By.xpath(".//button[@name='shape']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Delete sensor
		driver.findElement(By.xpath(".//a[@class='object-delete sensor-delete fa fa-times']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Sensor Deleted");
		logout();
		}

		@Test public void assetsPageClicksFine ()
		{
		loginSuccess();	
		//Asserts
		driver.findElement(By.xpath(".//*[@href='/gateway/vision/assets/']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Assets Page Clicks Fine");
		logout();
		}
		
		@Test public void eventsPageClicksFine ()
		{
		loginSuccess();	
		//Events
		driver.findElement(By.xpath("//*[@id='hornav_events']/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Events Page Clicks Fine");
		logout();
		}
		
		@Test public void playbookPageClicksFine ()
		{
			
			loginSuccess();
			//Playbook
					driver.findElement(By.xpath("//*[@id='hornav_playbook']/a")).click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						//Organization
						driver.findElement(By.xpath("//*[@id='filter_playbook']/div[2]/div[1]/h4/a")).click();
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						logout();
		}
		
		@Test public void playbookPageDeletePlaybookIsFine ()
		{
			
			loginSuccess();
			//Playbook
					driver.findElement(By.xpath("//*[@id='hornav_playbook']/a")).click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					//Create New Playbook
					driver.findElement(By.xpath(".//a[@href='/gateway/vision/playbook/create']")).click();
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					//Enter Basic Info
					driver.findElement(By.xpath(".//input[@id='playbook-name']")).sendKeys("#1TestPlaybook");
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					driver.findElement(By.xpath(".//textarea[@id='playbook-description']")).sendKeys("Some description for #1TestPlaybook");
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					driver.findElement(By.xpath(".//button[@name='save']")).click();
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					logout();
		}

		
		@Test public void adminPageClicksFine ()
		{
		loginSuccess();
		//Admin
		driver.findElement(By.xpath("//*[@id='hornav_admin']/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Admin Page Clicks Fine");
		
		//driver.findElement(By.xpath("//*[@id='filter_dashboard']/div[2]/div[1]/h4/a")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logout();
		
	}
	

	@ Test public void loginSuccess() {
		driver.get("http://192.168.21.128/gateway/vision/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Login possitive
		driver.findElement(By.xpath(".//input[@name='username']")).sendKeys("admin");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("pass");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.getTitle();
		/*System.out.println("Login success");*/
	}
	public void logout() {
		//Logout
		driver.findElement(By.xpath(".//a[@href='/gateway/vision/logout']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Models Page Clicks Fine");
	}
		
	@After public void Quit (){
		driver.quit();

}
}
