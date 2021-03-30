import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiteAutomation {
	
public static void main(String[] args){

// provide path on your computer where chromeDriver lives
System.setProperty("webdriver.chrome.driver", "/Users/vitko/Applications/chromedriver");
WebDriver driver = new ChromeDriver();

// Load Linkedin in chrome - feel free to change URL.
driver.get("http://www.linkedin.com");

try {
	// Enters your Email or phone number into userName field.
	WebElement login = driver.findElement(By.xpath("//*[@id=\"session_key\"]"));
	login.sendKeys("Replace this text with your Email or phone number");
	// Enters your password into password field
	WebElement Password = driver.findElement(By.xpath("//*[@id=\"session_password\"]"));
	Password.sendKeys("Enter your password here");
	// Show password, disable or erase feature is optional.
	WebElement showPassword = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div[2]/form/div[2]/div[2]/button"));
	showPassword.click();
	
	// Selenium clicks "Sign in" moving you forward to your Linkedin account.
	WebElement proceed = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div[2]/form/button"));
	proceed.click();
}

catch (Exception e) {
	System.out.println(driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div[2]/form/div[1]/div/p")));
    }
  }
}