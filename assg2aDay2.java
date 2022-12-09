package week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class assg2aDay2 {

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
	    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Farihah");
	    driver.findElement(By.xpath("(//button[@class='x-btn-text'])[6]")).click();
	    driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
	    String title = driver.getTitle();
		  System.out.println(title);
	    driver.findElement(By.linkText("Edit")).click();
	    driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("EY");
	    driver.findElement(By.xpath("//input[@value='Update']")).click();
	    String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
		driver.close();
		
	    
	}

}
