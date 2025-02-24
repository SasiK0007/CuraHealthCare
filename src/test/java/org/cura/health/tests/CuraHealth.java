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
		makeAppointment.selectFacility("Hongkong CURA Healthcare Center");
		makeAppointment.enableCheckbox();
		makeAppointment.tests();
		makeAppointment.selectHealthCareProgram("Medicaid");
		makeAppointment.selectCalendar();
		makeAppointment.selectMonthYear();
		makeAppointment.testings();
		makeAppointment.selectMonth();
		makeAppointment.testings1();
		makeAppointment.selectDate("3");
		curaHomePage.clickThreeDots();
		
		
	}
}
