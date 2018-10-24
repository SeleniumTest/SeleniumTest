package selenium_practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login_page_ID_Name_linktext_ClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rokommi\\Documents\\T Mobile\\selenium jar files\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver(); 
		//driver.get("https://www.salesforce.com");
		//driver.get("https://www.salesforce.com/in/form/trial/freetrial.jsp?d=70130000000Enyk");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Login")).click();
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hello");
		//driver.findElement(By.cssSelector("#password")).sendKeys("password");
		//driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("am password");
		//driver.findElement(By.xpath("//input[@id='Login']")).click();
		//System.out.println(driver.findElement(By.cssSelector("div[id='error']")).getText());
		//driver.navigate().to("https://www.rediff.com");
		//driver.navigate().to("https://www.salesforce.com/in/form/trial/freetrial.jsp?d=70130000000Enyk");
		
		 //driver.findElement(By.cssSelector(".selectBox-arrow")).click(); 
		 //driver.findElement(By.xpath("//a[@rel='CxO_General_Manager_AP']")).click();
		/*driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		Select sc= new Select(driver.findElement(By.xpath("//select[@id='country']")));
		sc.selectByValue("26");
		sc.selectByIndex(2);
		
		sc.selectByVisibleText("India");
		
		//driver.close();*/
		driver.get("https://www.spicejet.com/?gclid=CjwKCAjw3qDeBRBkEiwAsqeO7qI-j6UtgVc3AxubDcfU81GMSClwJXaF3MkbKfcvVTD7q20CU7fQiRoCan0QAvD_BwE");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	  //  driver.findElement(By.cssSelector("a[value='HBX']")).click();
	    //driver.findElement(By.cssSelector("(a[value='GOI'])[2]")).click();
	   // driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
	   // driver.findElement(By.xpath("(//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='GOI'][contains(text(),'Goa (GOI)')])[2]")).click();
        //driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
	  System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
	
	}

	

}
