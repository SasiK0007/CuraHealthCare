package org.amend.series.tests.pages;
import org.amend.series.tests.pages.interfaces.CreateInterface;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create implements CreateInterface {

	public WebDriver driver;
	public Actions actions;
	public HomePage homePage;
	public Create(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "seriesname")
	private WebElement seriesName;
	@Override
	public void createSeriesName(String text) {
		// TODO Auto-generated method stub
		homePage = new HomePage(driver);
		homePage.hoverCreate();
		homePage.clickSeries();
		seriesName.sendKeys(text,Keys.ENTER);
	}
	
	


}
