package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class defination {
	WebDriver driver;
	@Given("Should be in login page")
	// Login
	public void should_be_in_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JawaharMurali\\Desktop\\NJ\\LPB23\\Selenium Jar files\\Chrome webDriver\\chromedriver_win32 (2)\\chromedriver90.exe");
		//System.setProperty("webdriver.driver.chrome","C:\\Users\\JawaharMurali\\Desktop\\NJ\\LPB23\\Selenium Jar files\\Chrome webDriver\\chromedriver_win32 (2)\\chromedriver90.exe");
	// Creating instance of chrome driver
		driver= new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
	}



	@When("Enter valid user name {string}")
	public void enter_valid_user_name(String name) {
		  driver.findElement(By.id("txtUsername")).sendKeys(name);
	}
	@When("Enter valid password {string}")
	public void enter_valid_password(String pwd) {
		   driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	}
	@When("click submit")
	public void click_submit() {
		   driver.findElement(By.id("btnLogin")).click();
	}
	@Then("Login should be {string}")
	public void login_should_be(String Loginname) {
		 String actual =driver.findElement(By.id("welcome")).getText();
		   String expected = Loginname;
		   Assert.assertEquals(expected, actual);
		  // driver.findElement(By.id("welcome")).click();
		   //driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]")).click();
		   System.out.println("I am logged out of user");
	}
	@When("Enter invalid user name {string}")
	public void enter_invalid_user_name(String name) {
		  driver.findElement(By.id("txtUsername")).sendKeys(name);
	}




	@When("Enter invalid password {string}")
	public void enter_invalid_password(String pwd) {
		 driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	}
	@Then("Login should see the invalid credentials {string}")
	public void login_should_see_the_invalid_credentials(String Loginname) {
		 String actual =driver.findElement(By.id("spanMessage")).getText();
		   String expected = Loginname;
		   Assert.assertEquals(expected, actual);
		  // driver.findElement(By.id("welcome")).click();
		   //driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]")).click();
		   System.out.println("I am logged out");
		   driver.quit();
	}

}
