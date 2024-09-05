package week3.homeassignments1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://www.ajio.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//div/label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//div/label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		Thread.sleep(3000);
		
		WebElement itemsFound = driver.findElement(By.xpath("//div[@class='length']"));
		String text = itemsFound.getText();
		System.out.println("Totally  "+text);
		
				List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']"));
				System.out.println("Brand Names are,");
				for (WebElement webElement : brand) {
					
					System.out.println(webElement.getText());
				}
				
System.out.println("********************************************************************");
				
				
				List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
				System.out.println("Bag Names are,");	
				for (WebElement webElement : bagNames) {
							
						System.out.println(webElement.getText());
						}
						
				
				
				
	
	}
	
	
}
