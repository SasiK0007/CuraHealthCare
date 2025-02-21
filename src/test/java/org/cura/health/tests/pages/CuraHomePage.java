package org.cura.health.tests.pages;

import org.cura.health.tests.pages.common.methods.CuraHomePageInterface;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CuraHomePage implements CuraHomePageInterface {

	public WebDriver driver;
	public CuraHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[starts-with(@id,'menu-toggle')]")
	private WebElement threeDotstab;
	@FindBy(xpath = "//a[text()='Home']")
	private WebElement homeTab;
	@FindBy(css = "a[href='profile.php#login']")
	private WebElement login;
	@FindBy(id = "btn-make-appointment")
	private WebElement makeAppointment;

	@Override
	public void clickThreeDots() {
		threeDotstab.click();
	}

	@Override
	public void clickHome() {
		homeTab.click();
	}

	@Override
	public void clickLogin() {
		login.click();
	}

	@Override
	public void makeAppointment() {
		// TODO Auto-generated method stub
		makeAppointment.click();
	}
}
