package first_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
///comment
public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rokommi\\Documents\\T Mobile\\selenium jar files\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver(); 
		driver.get("http://www.google.com");
		driver.get("https://www.spicejet.com/");
		//System.out.println("hello world");

		//driver.navigate().forward();
		//driver.navigate().refresh();
		//driver.findElement(By.id("lst-ib")).sendKeys("www.facebook.com");
		//driver.close();
		//driver.quit();
		Select oSelect= new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		oSelect.selectByValue("USD");
		oSelect.selectByValue("AED");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='GAU']")).click();
		driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
	}

}
