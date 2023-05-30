import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
		         "D:\\TharaTechnologies\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		// Load the website
		
		driver.get("https://www.amazon.in/");
		Actions actions = new Actions(driver);
		WebElement sample=driver.findElement(By.xpath("//span[text()='All']"));
		String name="Best Sellers";
		System.out.println("thara"+name+"k");
		WebElement sample2=driver.findElement(By.xpath("(//a[text()='"+name+"'])[1]"));
		//  (//a[text()='Mobiles'])[1]
//		WebElement sample2=driver.findElement(By.xpath("(//a[text()='name'])[1]"));
		//here move to ele is seperate
		actions.moveToElement(sample);
		//click ctrl with out relaese
		actions.keyDown(Keys.CONTROL) 
		.click(sample2) 
		.keyUp(Keys.CONTROL) //release the ctrl
		.build() 
		.perform();
		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getTitle());

	driver.close();
		}

		}
		//switch to the parent window
		driver.switchTo().window(parent);

		}
	}


