package org.amend.series.tests;

import java.time.Duration;

import org.amend.series.tests.pages.Create;
import org.amend.series.tests.pages.HomePage;
import org.amend.series.tests.pages.Series;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public Create create;
	public HomePage homePage;
	public Series series;
	@BeforeTest
	public void launch() {
		driver = new ChromeDriver();
		driver.get("https://thepulper.herokuapp.com/apps/pulp/gui/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50000));
		driver.manage().window().maximize();
		create = new Create(driver);
		homePage = new HomePage(driver);
		series = new Series(driver);
		
	}
}
