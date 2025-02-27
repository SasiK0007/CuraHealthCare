package org.amend.series.tests.pages;

import java.util.List;

import org.amend.series.tests.pages.interfaces.SeriesInterface;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Series implements SeriesInterface {
	public WebDriver driver;
	public Actions actions;
	public Series(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/apps/pulp/gui/menu/series']")
	private WebElement seriesBtn;
	@FindBy(css = "a[href='/apps/pulp/gui/reports/series/list/navigation']")
	private WebElement seriesNavBtn;
	@FindBy(xpath = "//*[starts-with(@value,'Update')]")
	private WebElement updateBtn;
	@FindBy(xpath = "//*[starts-with(@value,'Delete')]")
	private WebElement deleteBtn;
	
	@Override
	public void performSeries() {
		hoverSeries();
		seriesNavBtn.click();
	}

	@Override
	public void hoverSeries() {
		actions = new Actions(driver);
		actions.moveToElement(seriesBtn).build().perform();
	}

	@Override
	public void listOfServices() {
		// TODO Auto-generated method stub
		List<WebElement>x = driver.findElements(By.xpath("//*[starts-with(@class,'Series-list-item')]"));
		for (WebElement webElement : x) {
			System.out.println(webElement.getText());
		}
	}

	@Override
	public void viewListSeries(String text) {
		// TODO Auto-generated method stub
		List<WebElement>x = driver.findElements(By.xpath("//*[starts-with(@class,'Series-list-item')]"));
		x.stream().filter(a->a.getText().equalsIgnoreCase(text)).findFirst().orElseThrow(null).click();
	}

	@Override
	public void performUpdate() {
		// TODO Auto-generated method stub
		updateBtn.click();
	}

	@Override
	public void performDelete() {
		// TODO Auto-generated method stub
		deleteBtn.click();
		driver.switchTo().alert().accept();
	}

}
