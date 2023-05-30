import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver",
	         "D:\\TharaTechnologies\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
 
driver.manage().window().maximize();
//driver=new InternetExplorerDriver();
driver.get("https://www.amazon.in/");

JavascriptExecutor js = (JavascriptExecutor)driver;	
		
			
        //Fetching the Domain Name of the site. Tostring() change object to name.		
        String DomainName = js.executeScript("return document.domain;").toString();			
        System.out.println("Domain name of the site = "+DomainName);					
          		
        //Fetching the URL of the site. Tostring() change object to name		
        String url = js.executeScript("return document.URL;").toString();			
        System.out.println("URL of the site = "+url);					
          		
       //Method document.title fetch the Title name of the site. Tostring() change object to name		
       String TitleName = js.executeScript("return document.title;").toString();			
       System.out.println("Title of the page = "+TitleName);					

        		
      //Navigate to new Page i.e to generate access page. (launch new url)		
      js.executeScript("window.location = 'http://demo.guru99.com/'");
      //Clicking element
//      JavascriptExecutor executor = (JavascriptExecutor) driver;
//      executor.executeScript("arguments[0].click();", element);
//      
//      //Scroll down
//    //to perform Scroll on application using Selenium
//                  JavascriptExecutor js = (JavascriptExecutor) driver;
//                  js.executeScript("window.scrollBy(0,350)", "");
//      
//      //scroll up
//      
//    //to perform Scroll on application using Selenium
//                  JavascriptExecutor js = (JavascriptExecutor) driver;
//                  js.executeScript("window.scrollBy(0,-350)", "");
//      
//   // Scrolling down the page till the element is found		
//      js.executeScript("arguments[0].scrollIntoView();", Element);
	}

}
