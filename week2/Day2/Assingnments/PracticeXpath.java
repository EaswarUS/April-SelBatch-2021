package assesment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeXpath {

	public static void main(String[] args) {
		
		// Open Browser
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		

				// Launch the URL
				driver.get("http://leaftaps.com/opentaps/");

				// Enter the username based on its label
				driver.findElementByXPath("//label[@for='username']/following-sibling::input");

				// Enter the password based on its label
				driver.findElementByXPath("//label[@for='password']/following-sibling::input");

				// Click Login
				driver.findElementByXPath("//input[@value='Login']");

				// Click on CRMSFA link
				driver.findElementByXPath("//div[@id='label']/a");

				// Click on Leads link
				driver.findElementByXPath("//a[text()='Leads']");

				// Click on Merge Leads link
				driver.findElementByXPath("//a[text()='Merge Leads']");

				// Click the first img icon
				driver.findElementByXPath("(//img[@alt='Lookup'])[1]");

				// Select the first resulting lead
				Set<String> allWindows = driver.getWindowHandles();
				List<String> allhandles = new ArrayList<String>(allWindows);
				driver.switchTo().window(allhandles.get(1));

				driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[3]").click();
				driver.switchTo().window(allhandles.get(0));
				
				// Click the second img icon
				driver.findElementByXPath("(//img[@alt='Lookup'])[2]");

				// Select the second resulting lead
				Set<String> allWindows1 = driver.getWindowHandles();
				List<String> allhandles1 = new ArrayList<String>(allWindows1);
				driver.switchTo().window(allhandles1.get(1));
				
				driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[5]").click();
				driver.switchTo().window(allhandles1.get(0));
				
				//Click on Merge Lead (submit) button
				driver.findElementByXPath("//a[text()='Merge']").click();
				
				driver.switchTo().alert().accept();
				
				//Get the company name text based on its label
				String cName = driver.findElementById("viewLead_companyName_sp").getText();
				System.out.println(cName);

			}

		}
