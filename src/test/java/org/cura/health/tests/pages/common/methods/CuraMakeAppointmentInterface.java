package org.cura.health.tests.pages.common.methods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public interface CuraMakeAppointmentInterface {
	public void selectFacility(String facilityName);
	public void enableCheckbox();
	public void selectHealthCareProgram(String text);
	public void selectCalendar();
	public void selectMonthYear();
	public void selectMonth();
	public void selectDate(String num);

}
