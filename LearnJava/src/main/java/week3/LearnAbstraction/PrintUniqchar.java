package week3.LearnAbstraction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintUniqchar {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
				ChromeDriver driver = new ChromeDriver();
				
				// load the URL
				driver.get("https://finance.yahoo.com/");
				// Maxi the Browser
				driver.manage().window().maximize();
				// Click on the "Crypto" link
				driver.findElement(By.xpath("//a[text()='Crypto']")).click();
				Thread.sleep(200);
				List<WebElement> findElements = driver.findElements(By.xpath("//table//tr/td[1]"));
				// Extract and print the cryptocurrency names from the table

				for (int i = 0; i < findElements.size(); i++) {
					System.out.println(findElements.get(i).getText());
				}

			}




				}
			


