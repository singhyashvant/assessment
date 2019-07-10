package com.emirates.assess;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

public class ApiTest 
{
	@Test
	public void aptTesting() throws Exception {
	try {
	URL url = new URL("https://itunes.apple.com/search?term=jack+johnson&entity=musicVideo");
	HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	conn.setRequestMethod("GET");
	conn.setRequestProperty("Accept", "application/json");

	if (conn.getResponseCode() != 200) {
	throw new RuntimeException(" HTTP error code : "
	+ conn.getResponseCode());
	}

	Scanner scan = new Scanner(url.openStream());
	String entireResponse = new String();
	while (scan.hasNext())
	entireResponse += scan.nextLine();

	System.out.println("Response : "+entireResponse);

	scan.close();

	JSONObject obj = new JSONObject(entireResponse );
	String responseCode = obj.get("resultCount").toString();
	System.out.println("resultCount : " + responseCode);

	JSONArray arr = obj.getJSONArray("results");
	for (int i = 0; i < arr.length(); i++) {
	String artistName = arr.getJSONObject(i).getString("artistName");
	System.out.println("artistName : " + artistName);
	String trackName = arr.getJSONObject(i).getString(
	"trackName");
	System.out.println("Address : " + trackName);

	//validating Address as per the requirement
	if(trackName.equalsIgnoreCase("Little Bit of Love"))
	{
	System.out.println("trackName is as Expected");
	}
	else
	{
	System.out.println("trackName is not as Expected");
	}
	}

	conn.disconnect();
	} catch (MalformedURLException e) {
	e.printStackTrace();

	} catch (IOException e) {

	e.printStackTrace();

	}

	}
}


