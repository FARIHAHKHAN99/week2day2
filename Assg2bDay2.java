package week2day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assg2bDay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		System.out.println(driver);	
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");	
		driver.findElement(By.id("password")).sendKeys("crmsfa");	 
		driver.findElement(By.className("decorativeSubmit")).click();	
		driver.findElement(By.linkText("CRM/SFA")).click();		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9344953690");
	    driver.findElement(By.xpath("(//button[@class='x-btn-text'])[6]")).click();
		    String id = driver.findElement(By.linkText("16996")).getText();
			System.out.println(id);
	    driver.findElement(By.linkText("Deactivate Contact")).click();
	    driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@class=' x-form-text x-form-field ']")).sendKeys("16996");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[6]")).click();
		 String text = driver.findElement(By.linkText("No records to display")).getText();
			System.out.println(text);
		driver.close();
		
		
						}	
	}


