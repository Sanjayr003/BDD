package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefinition {
	WebDriver driver;
	@Given("^User on Login Page$")
	public void user_login(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pradeepcheringal\\Desktop\\Selinium Jars\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in");
		driver.manage().window().maximize();
		
		
	}
	@Then("^I click on SkipSignIn button$")
	public void Click_SkipSignIn(){
		driver.findElement(By.xpath("//button [text()='Skip Sign In']")).click();
	}
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_firstname_and_lastname(String FirstName, String LastName, String Address, String Email){
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("FirstName");
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(LastName);
	}

}
