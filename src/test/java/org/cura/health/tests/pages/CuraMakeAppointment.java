package org.cura.health.tests.pages;

import java.util.List;

import org.cura.health.tests.pages.common.methods.CuraMakeAppointmentInterface;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CuraMakeAppointment implements CuraMakeAppointmentInterface{

	public WebDriver driver;
	public CuraMakeAppointment(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[starts-with(@id,'combo_facility')]")
	private WebElement facilitySelect;
	@FindBy(xpath = "//*[starts-with(@class,'checkbox-inline')]")
	private WebElement checkBox;
	@FindBy(xpath = "//*[starts-with(@type,'radio')]")
	private WebElement radios;
	@FindBy(xpath = "//*[starts-with(@class,'input-group-addon')]")
	private WebElement calendar;
	@FindBy(xpath = "(//*[starts-with(@class,'datepicker-switch')])[1]")
	private WebElement monthAndYear;
	
	
	@Override
	public void selectFacility(String facilityName) {
		Select select = new Select(facilitySelect);
		select.selectByVisibleText(facilityName);
	}

	public void tests() {
		List<WebElement>x = driver.findElements(By.xpath("//*[starts-with(@type,'radio')]"));
		for (WebElement webElement : x) {
			System.out.println(webElement.getAttribute("value"));
		}
	}

	@Override
	public void enableCheckbox() {
		// TODO Auto-generated method stub
		checkBox.click();
	}

	@Override
	public void selectHealthCareProgram(String text) {
		// TODO Auto-generated method stub
		List<WebElement>x = driver.findElements(By.xpath("//*[starts-with(@type,'radio')]"));
		WebElement ax = x.stream().filter(ele->ele.getAttribute("value").equalsIgnoreCase(text)).findFirst().orElse(null);
		ax.click();
	}

	@Override
	public void selectCalendar() {
		calendar.click();
	}

	@Override
	public void selectMonthYear() {
		monthAndYear.click();
	}

	public void testings() {
		List<WebElement>x = driver.findElements(By.xpath("(//*[starts-with(@class,'month')])"));
		for (WebElement webElement : x) {
			System.out.println(webElement.getText());
		}
	}

	@Override
	public void selectMonth() {
		// TODO Auto-generated method stub
		List<WebElement>x = driver.findElements(By.xpath("(//*[starts-with(@class,'month')])"));
		WebElement str = x.stream().filter(ele->ele.getText().equalsIgnoreCase("Dec")).findFirst().orElse(null);
		str.click();
	}
	public void testings1() {
		List<WebElement>ax = driver.findElements(By.xpath("(//*[starts-with(@class,'day')])"));
		for (WebElement webElement : ax) {
			System.out.println(webElement.getText());
		}
	}

	@Override
	public void selectDate(String num) {
		// TODO Auto-generated method stub
		List<WebElement>ax = driver.findElements(By.xpath("(//*[starts-with(@class,'day')])"));
		WebElement aq = ax.stream().filter(ele->ele.getText().equalsIgnoreCase(num)).findFirst().orElse(null);
		aq.click();
	}
	
	
	
	
}
