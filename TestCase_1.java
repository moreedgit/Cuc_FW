package registerUserPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equalsIgnoreCase("Automation Exercise")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Incorrect title");
		}
		//click on login button
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
		//verify new user sign up is disabled
		boolean signUpText = driver.findElement(By.xpath("//h2[text()='New User Signup!']")).isDisplayed();
		if (signUpText) {
			System.out.println("'New User Signup!' is displayed");
		} else {
			System.out.println("'New User Signup!' is not displayed ");
		}
		driver.quit();
	}

}
