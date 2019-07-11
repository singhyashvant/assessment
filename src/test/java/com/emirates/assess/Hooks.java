package com.emirates.assess;

import java.net.MalformedURLException;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	DriverProvider dp = new DriverProvider();

    @Before
    public void beforeHookfunction() throws MalformedURLException, InterruptedException{
    	dp.androidDriver();
    }

    @After
    public void afterHookfunction() {
        dp.mobileTearDown();
    }

}
