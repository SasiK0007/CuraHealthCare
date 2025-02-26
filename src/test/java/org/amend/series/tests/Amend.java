package org.amend.series.tests;

import org.testng.annotations.Test;

public class Amend extends BaseClass {

	@Test
	public void testOne() throws Exception {
		homePage.clickSeries();
	}
	@Test
	public void testTwo() throws Exception {
		create.createSeriesName("222");
	}
}
