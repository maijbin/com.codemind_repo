/**
 * 
 */
package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */
public class Selenium_first {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
			//Launching Browser
				//Webdriver driver=new ChromeDriver();
				ChromeDriver driver= new ChromeDriver();
				
				//open url
				driver.get("https://demo.opencart.com/");
				
				//Validate Title
				
				String title=driver.getTitle();
				if(title.equals("Your Store"))
				{
					System.out.println("Test Pass");
				}
				else
				{
					System.out.println("Test fail");
				}
				//close browser
				driver.close();
				driver.quit();
				System.out.println("Browser closed");
					}

	}


