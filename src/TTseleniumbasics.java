import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TTseleniumbasics {
	public static void main(String args[])
	{
		TTseleniumbasics tt=new TTseleniumbasics();
		System.setProperty("webdriver.chrome.driver",
	         "D:\\TharaTechnologies\\Driver\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 
driver.manage().window().maximize();
//driver=new InternetExplorerDriver();
driver.get("https://www.amazon.in/");
driver.navigate().to("https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics");
//driver.navigate().back();
//driver.navigate().forward();

//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
WebElement testDropDown = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));  
Select dropdown = new Select(testDropDown);  
dropdown.selectByIndex(5);
//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
WebElement ele1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
JavascriptExecutor executor = (JavascriptExecutor) driver;
executor.executeScript("arguments[0].click();", ele1);

driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 13");
driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();	
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//WebElement ele=driver.findElement(By.xpath("//a[contains(@id,'nav-logo-sprites')]"));
//	WebDriverWait wait = new WebDriverWait(driver, 100);
//	wait.until(ExpectedConditions.visibilityOfElementLocated((By) ele)); 


//Thread.sleep(5000);
//driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
System.out.println(driver.findElement(By.xpath("//a[contains(@id,'nav-logo-sprites')]")).getText());
String s=driver.findElement(By.xpath("//a[contains(@id,'nav-logo-sprites')]")).getText();

System.out.println("tharani"+s);  //.in
if(s.contains("i"))
System.out.println("pass");
else
System.out.println("fail");
String Title = driver.getTitle();  
System.out.println("Title is"+Title);

String CurrentUrl = driver.getCurrentUrl();  

System.out.println("Title is"+CurrentUrl);

String PageSource = driver.getPageSource();  
System.out.println("Title is"+CurrentUrl);

driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).submit();
System.out.println("Pencil selected");

Date d = new Date();

String FileName = "Tharani_"+d.toString().replace(":", "_").replace(" ", "_") + ".png";

tt.screenshot(driver);
driver.close();
}
	public void screenshot(WebDriver driver)
	{
		Date d = new Date();
		
		String FileName = "Tharani_"+d.toString().replace(":", "_").replace(" ", "_") + ".png";
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        File DestFile=new File("C:\\Users\\admin\\eclipse-workspace\\TT_seleniumPrjct\\Screenshots\\"+FileName);
        try {
			FileHandler.copy(SrcFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

