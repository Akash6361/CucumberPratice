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

public class Logout {
	WebDriver driver;
	
	@Given("the user is logged in")
	public void the_user_is_logged_in() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash Gowda\\Desktop\\CGI-Automation Testing Core training\\SeleniumWorkspace\\src\\main\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        driver = new ChromeDriver(options);
	    driver.get("https://en-gb.facebook.com/");
	    driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("akash.br.1223@gmail.com");
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("Akash@55555");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	   
	}
	@When("the user clicks on the My Account button")
	public void the_user_clicks_on_the_my_account_button() {
		
		WebDriverWait wait = new WebDriverWait(driver, 1000); 
	    WebElement  accbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z'][1]")));
		accbutton.click();  
	}
	@When("clicks on the Logout button")
	public void clicks_on_the_logout_button() {
		WebDriverWait wait = new WebDriverWait(driver, 1000); 
        WebElement  logout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Log out']")));
		logout.click();

	
	}
	@Then("the user should be logged out successfully")
	public void the_user_should_be_logged_out_successfully() {
		
		WebDriverWait wait = new WebDriverWait(driver, 1000); 
        WebElement   msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='__xn']")));
		String s=msg.getText();
		System.out.println(s);
	    Assert.assertEquals(s,"Next time you log in, click your picture. To remove an account from this page, click here.");
		

	   
	}
	

}
