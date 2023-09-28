package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash Gowda\\Desktop\\CGI-Automation Testing Core training\\SeleniumWorkspace\\src\\main\\resources\\chromedriver.exe");
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("disable-notifications");
	        driver = new ChromeDriver(options);
		driver.get("https://en-gb.facebook.com/");
	}
	@When("the user enters valid username and password")
	public void the_user_enters_valid_username_and_password() {
		  driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("akash.br.1223@gmail.com");
		  driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("Akash@55555");
		
	}
	@When("clicks the login button")
	public void clicks_the_login_button() {
		 driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	@Then("the user should be logged in successfully")
	public void the_user_should_be_logged_in_successfully() {
		WebElement msg =driver.findElement(By.xpath("//span[@class='x193iq5w xeuugli x13faqbe x1vvkbs x1xmvt09 x1lliihq x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x x14z4hjw x3x7a5m xngnso2 x1qb5hxa x1xlr1w8 xzsf02u']"));
		 String s =msg.getText();
		Assert.assertEquals(s,"Welcome to Facebook, Lizzy");
		
	}


}
