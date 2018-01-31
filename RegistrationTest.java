package testing;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;
//manoj add  comment
//import org.testng.annotations.Test;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationTest

{

@Test //This is TestNG annotation

public void testRegister()

{

//WebDriver driver = new FirefoxDriver();

//driver.get(“http://newtours.demoaut.com/”);
	System.setProperty("webdriver.chrome.driver", "C:\\ManojDeyWorkspace\\PracticeWP\\testone\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();


	//	driver.get("http://groupbookingstg.emirates.com/login/login.jsp");
		driver.get("http://dolnxprodvm345:8080/login/login.jsp");


//driver.findElement(By.linkText(“REGISTER”)).click();

driver.findElement(By.name("j_username")).sendKeys("s403370");

driver.findElement(By.name("j_password")).sendKeys("google");

/*driver.findElement(By.name(“phone”)).sendKeys(“123456789”);

driver.findElement(By.name(“userName”)).sendKeys(“user1@test.com”);

driver.findElement(By.name(“address1”)).sendKeys(“Test Address”);

driver.findElement(By.name(“city”)).sendKeys(“Test City”);

Select select = new Select(driver.findElement(By.name(“country”)));

       select.selectByVisibleText(“ANGOLA”);

driver.findElement(By.name(“email”)).sendKeys(“user1@test.com”);

driver.findElement(By.name(“password”)).sendKeys(“user1”);

driver.findElement(By.name(“confirmPassword”)).sendKeys(“user1”);*/

driver.findElement(By.name("submit")).click();
//driver.findElement(By.linkText("toBlockSeatsAvailability")).click();




/*//locate the menu to hover over using its xpath
	WebElement menu = driver.findElement(By.xpath("//*[@id='music']"));

	//Initiate mouse action using Actions class
	Actions builder = new Actions(driver);

	// move the mouse to the earlier identified menu option
	builder.moveToElement(menu).build().perform();

	// wait for max of 5 seconds before proceeding. This allows sub menu appears properly before trying to click on it
	WebDriverWait wait = new WebDriverWait(driver, 5);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='subNav_music_menu']/tbody/tr[2]/td[1]/a[1]")));  // until this submenu is found

	//identify menu option from the resulting menu display and click
	WebElement menuOption = driver.findElement(By.xpath("//*[@id='subNav_music_menu']/tbody/tr[2]/td[1]/a[1]"));
	menuOption.click();
*/

//driver.close();

//driver.quit();

}

}
