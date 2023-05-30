import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
		         "D:\\TharaTechnologies\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 
	driver.manage().window().maximize();
	//driver=new InternetExplorerDriver();
	driver.get("https://www.amazon.in/");
	//*[@id="twotabsearchtextbox"]
driver.findElement(By.cssSelector("input#twotabsearchtextbox")).click();
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 13");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	}

}
