package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition 
{
	WebDriver driver;
	@Given("^user is on Login page$")
	public void user_is_on_Login_page() 
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@When("^title of the login page is Orange HRM$")
	public void title_of_the_login_page_is_Orange_HRM() 
	{
		String Etitle="OrangeHRM";
		String Atitle=driver.getTitle();
		Assert.assertEquals(Atitle, Etitle); 
	}
	
	@Then("^user will enter username and Password$")
	public void user_will_enter_username_and_Password() 
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");   
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable
	 {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Then("^user is on Home page$")
	public void user_is_on_Home_page()
	 {
		String Etitle="OrangeHRM";
		String Atitle=driver.getTitle();
		Assert.assertEquals(Atitle, Etitle);
		driver.quit();
	 }
}
