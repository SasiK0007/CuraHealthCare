package org.amend.series.tests.pages;

import org.amend.series.tests.pages.interfaces.HomePageInterface;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;

public class HomePage implements HomePageInterface {

	public WebDriver driver;
	public Actions actions;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Home']")
	private WebElement homeNav;
	@FindBy(css = "a[href='/apps/pulp/gui/menu/create']")
	private WebElement createNav;
	@FindBy(xpath = "(//a[@href='/apps/pulp/gui/create/author'])[1]")
	private WebElement authorTab;

	@Override
	public void clickHome() {
		// TODO Auto-generated method stub
		actions = new Actions(driver);
		actions.click(homeNav).build().perform();
	}

	@Override
	public void clickCreate() {
		// TODO Auto-generated method stub
		createNav.click();
	}

	@Override
	public void hoverCreate() {
		// TODO Auto-generated method stub
		actions = new Actions(driver);
		actions.moveToElement(createNav).build().perform();
	}

	@Override
	public void clickAuthor() {
		// TODO Auto-generated method stub
		hoverCreate();
		driver.findElement(RelativeLocator.with(By.xpath("(//a[@href='/apps/pulp/gui/create/author'])[1]"))
				.below(By.cssSelector("a[href='/apps/pulp/gui/menu/create']"))).click();
	}

	@Override
	public void clickSeries() {
		// TODO Auto-generated method stub
		hoverCreate();
		driver.findElement(RelativeLocator.with(By.xpath("(//a[@href='/apps/pulp/gui/create/series'])[1]"))
				.below(By.cssSelector("a[href='/apps/pulp/gui/menu/create']"))).click();
	}

}
