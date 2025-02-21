package org.cura.health.tests.pages;

import org.cura.health.tests.pages.common.methods.CuraLoginPageInterface;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CuraLoginPage implements CuraLoginPageInterface{

	public WebDriver driver;
	public CuraLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//*[starts-with(@class,'form-control')])[3]")
	private WebElement demoAccount;
	@FindBy(xpath = "(//*[starts-with(@class,'form-control')])[4]")
	private WebElement demoAccountPassword;
	@FindBy(id = "btn-login")
	private WebElement loginBtn;
	@Override
	public void Login_UserName(String name) {
		demoAccount.sendKeys(name);
	}
	@Override
	public void Login_Password(String password) {

		demoAccountPassword.sendKeys(password);
	}
	@Override
	public void performSubmit() {
		loginBtn.click();
	}
	
}
