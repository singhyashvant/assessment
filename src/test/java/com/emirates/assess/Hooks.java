package com.emirates.assess;

import java.net.MalformedURLException;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	DriverProvider dp = new DriverProvider();

    /**
     * Initiates android driver
     * @throws MalformedURLException
     * @throws InterruptedException
     */
    @Before
    public void beforeHookfunction() throws MalformedURLException, InterruptedException{
    	dp.androidDriver();
    }

    /**
     * Tears down the appium/mobile driver
     */
    @After
    public void afterHookfunction() {
        dp.mobileTearDown();
    }

}
