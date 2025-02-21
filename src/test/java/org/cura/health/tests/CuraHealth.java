package org.cura.health.tests;
import org.cura.base.tests.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CuraHealth extends BaseClass {

	public WebDriver driver;
	@Test
	public void curaOne() throws Exception {
		getDetailsFromPropertiesFile(driver);
		curaHomePage.clickThreeDots();
//		curaHomePage.clickHome();
//		curaHomePage.clickLogin();
	}
	@Test
	public void curaTwo() throws Exception {
		getDetailsFromPropertiesFile(driver);
		curaHomePage.makeAppointment();
		curaLoginPage.Login_UserName("John Doe");
		curaLoginPage.Login_Password("ThisIsNotAPassword");
		curaLoginPage.performSubmit();
	}
}
