package ca.mcgill.ecse211.finalproject;

import java.util.Map;

import ca.mcgill.ecse211.WiFiClient.WifiConnection;

public class WifiController {
	
	// ** Set these as appropriate for your team and current situation **
	  private static final String SERVER_IP = "192.168.2.3";
	  private static final int TEAM_NUMBER = 13;

	  // Enable/disable printing of debug info from the WiFi class
	  private static final boolean ENABLE_DEBUG_WIFI_PRINT = true;

	  @SuppressWarnings("rawtypes")
	  public static Map readData() {

	    System.out.println("Running..");

	    // Initialize WifiConnection class
	    WifiConnection conn = new WifiConnection(SERVER_IP, TEAM_NUMBER, ENABLE_DEBUG_WIFI_PRINT);

	    // Connect to server and get the data, catching any errors that might occur
	    Map data = null;
	    try {
	      data = conn.getData();
	      } catch (Exception e) {
	      System.err.println("Error: " + e.getMessage());
	    }
	    
	    return data;	//Return the data map
	  }
}
