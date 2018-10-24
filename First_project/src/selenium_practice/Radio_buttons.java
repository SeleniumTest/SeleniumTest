package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rokommi\\Documents\\T Mobile\\selenium jar files\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		

		//driver.findElement(By.xpath("//input[@value='Milk']")).click();

		int count =driver.findElements(By.xpath("//input[@name='group1']")).size();

		for(int i=0;i<count;i++)

		{

		//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

		String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
        System.out.println(text);
		if(text.equals("Milk"))

		{

		 driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

		}

		}
	}

}
