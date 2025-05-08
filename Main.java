
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class PracticeCpatureLinks {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://Meesho.Com");
		Thread.sleep(4000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(" Total Available website links:"+ links.size());
		
		for(WebElement link: links) {
		System.out.println(link.getText());	
		}
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
