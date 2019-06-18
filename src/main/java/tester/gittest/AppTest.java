package tester.gittest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
	protected WebDriver driver;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "/Volumes/Ubuntu/Projects/CourseQA/chromedriver");
		WebDriver driver = new ChromeDriver();
		String eTitle = "The world’s leading software development platform · GitHub";
		String aTitle = "";
		driver.get("https://github.com");
		
		aTitle = driver.getTitle();
		if(aTitle.contentEquals(eTitle)) 
			System.out.println("Test Passed!");
		else
			System.out.println("Test Failed!");
		
		driver.close();
		
	}

}
