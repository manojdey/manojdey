package testing;



import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void firsttest() throws Exception{
		
		assert(true);
		System.setProperty("webdriver.chrome.driver", "C:\\ManojDeyWorkspace\\PracticeWP\\testone\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
        //Launch the Online Store Website
		driver.get("http://www.store.demoqa.com");
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");
 
		//Wait for 5 Sec
		Thread.sleep(5);
		
        // Close the driver
        driver.quit();
	}
}
