package week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assg1day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		System.out.println(driver);	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Saabera");
		driver.findElement(By.name("lastname")).sendKeys("F");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9344953690");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("saab699");
		
		WebElement dob = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select date = new Select (dob);
		date.selectByIndex(9);
		
		WebElement mob = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month = new Select (mob);
		month.selectByIndex(5);
		
		WebElement yob = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select year = new Select (yob);
		year.selectByVisibleText("1999");
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		
	
		
	}
}
