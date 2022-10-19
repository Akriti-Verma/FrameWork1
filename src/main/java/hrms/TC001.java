package hrms;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC001 {

 public static void main(String[] args) throws Exception {
	 System.setProperty("webdriver.gecko.driver","C:\\Testing Data\\geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	 driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(3000);
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	driver.close();
	}

}
