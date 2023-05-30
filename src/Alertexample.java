import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
		         "D:\\TharaTechnologies\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 
	driver.manage().window().maximize();
	//driver=new InternetExplorerDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");			
	
   	
    driver.findElement(By.name("cusid")).sendKeys("53920");					
    driver.findElement(By.name("submit")).submit();			
    		
    // Switching to Alert        
   
    // Capturing alert message.    
    String alertMessage= driver.switchTo().alert().getText();		
    		
    // Displaying alert message		
    System.out.println("alert is "+alertMessage);	
    
    Alert alert = driver.switchTo().alert();		
			
    // Accepting alert		
    alert.accept();		
	
	}

}
