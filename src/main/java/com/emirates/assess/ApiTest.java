package com.emirates.assess;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;

public class ApiTest

{
	static Properties prop = null;

	/**
	 * This will read the config.properties file from the project root and loads all the variables declare in the file.
	 */
	@BeforeClass
	public static void start() {
		FileReader reader;
		try {
			reader = new FileReader("./config.properties");
			prop = new Properties();
			prop.load(reader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		

	}

	/**
	 * This is the test to validate the schema of the URL1 present in the config.properties file.
	 * Also this test will check some key,value present in the json response
	 * @throws Exception
	 */
	@Test
	public void apiTesting1() throws Exception {
		String url = prop.getProperty("URL1");
		JSONObject obj = new JSONObject(getJsonResponse(url));
		String resultCount = obj.get("resultCount").toString();
		System.out.println("resultCount : " + resultCount);
		JSONArray arr = obj.getJSONArray("results");
		for (int i = 0; i < arr.length(); i++) {
			String artistName = arr.getJSONObject(i).getString("artistName");
			System.out.println("artistName : " + artistName);
			String trackName = arr.getJSONObject(i).getString("trackName");
			System.out.println("Address : " + trackName);
			if (trackName.equalsIgnoreCase("Little Bit of Love")) {
				System.out.println("trackName is as Expected");
			} else {
				System.out.println("trackName is not as Expected");
			}
			if(Integer.parseInt(resultCount)==(arr.length()))
			{
				System.out.println("It has all the results mentioned");
			} else {
				System.out.println("It hasn't all the results mentioned");
				
			}
		}
	}
	
	/**
	 * This is the test to validate the schema of the URL1 present in the config.properties file.
	 * Also this test will check some key,value present in the json response
	 * @throws Exception
	 */
	@Test
	public void apiTesting2() throws Exception {
		String url = prop.getProperty("URL2");
		JSONObject obj = new JSONObject(getJsonResponse(url));
		String resultCount = obj.get("resultCount").toString();
		System.out.println("resultCount : " + resultCount);
		JSONArray arr = obj.getJSONArray("results");
		for (int i = 0; i < arr.length(); i++) {
			String country = arr.getJSONObject(i).getString("country");
			System.out.println("country : " + country);
			String currency = arr.getJSONObject(i).getString("currency");
			System.out.println("currency : " + currency);
			if (currency.equalsIgnoreCase("USD")) {
				System.out.println("currency found");
			} else {
				System.out.println("currency not found");
			}
			if(Integer.parseInt(resultCount)==(arr.length()))
			{
				System.out.println("It has all the results mentioned");
			} else {
				System.out.println("It hasn't all the results mentioned");
				
			}
		}
	}
	/**
	 * This method always returns the json response in the string format.The url argument must specify an absolute {@link URL}.
	 * @param URL an absolute URL giving the base location
	 * @return The entire json response in the String format
	 */
	public String getJsonResponse(String URL)
	{
		String entireResponse = null;
		try {
			URL url = new URL(URL);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException(" HTTP error code : " + conn.getResponseCode());
			}
			Scanner scan = new Scanner(url.openStream());
			entireResponse = new String();
			while (scan.hasNext())
				entireResponse += scan.nextLine();
			System.out.println("Response : " + entireResponse);
			scan.close();
			conn.disconnect();
		}catch(MalformedURLException e)
		{
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return entireResponse;
		
	}

}
