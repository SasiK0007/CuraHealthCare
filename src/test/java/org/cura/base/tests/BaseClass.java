package org.cura.base.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.cura.health.tests.pages.CuraHomePage;
import org.cura.health.tests.pages.CuraLoginPage;
import org.cura.health.tests.pages.CuraMakeAppointment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public CuraHomePage curaHomePage;
	public CuraLoginPage curaLoginPage;
	public CuraMakeAppointment makeAppointment;
	public WebDriver getDetailsFromPropertiesFile(WebDriver driver) throws IOException {
		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\kakar\\eclipse-workspace\\New folder\\CuraHealthCare\\Resources\\config.properties");
		properties.load(fis);
		System.out.println(properties.getProperty("url"));
		if (properties.getProperty("browser").toLowerCase().equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(properties.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			driver.manage().window().maximize();
		}
		else if(properties.getProperty("browser").toLowerCase().equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(properties.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			driver.manage().window().maximize();
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(properties.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			driver.manage().window().maximize();
		}
		curaHomePage = new CuraHomePage(driver);
		curaLoginPage = new CuraLoginPage(driver);
		makeAppointment = new CuraMakeAppointment(driver);
		return driver;
	}
	
}
