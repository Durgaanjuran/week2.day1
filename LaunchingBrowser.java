package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingBrowser {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Durga");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
		
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Dur");
        
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium");
        
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating the lead");
        
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("durgadenita07@gmail.com");
        
       WebElement statedropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
       
       Select state = new Select(statedropdown);
       
       state.selectByVisibleText("New York");
      
       driver.findElement(By.className("smallSubmit")).click();
       
       String title = driver.getTitle();
       
       System.out.println(title);
       
       driver.close();
           
        	}

}
