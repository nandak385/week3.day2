package week3.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("searchVal")).sendKeys("bags");
		
		driver.findElement(By.className("ic-search")).click();
		
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		
		Thread.sleep(1500);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		
		
		String total = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of bags: " + total);

		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println("No of Bags Brand is :" + bagBrandList.size());
		
		for (WebElement webElement : bagBrandList) {
			String text = webElement.getText();
			System.out.println(text);
		}
		
		List<WebElement> nameOfBags = driver.findElements(By.className("name"));
		System.out.println("Total number of Bags are "  + nameOfBags.size());
		System.out.println(" Names of the Bags");
		for (WebElement webElement : nameOfBags) {
			String text = webElement.getText();
			System.out.println(text);
		}

	}

}
