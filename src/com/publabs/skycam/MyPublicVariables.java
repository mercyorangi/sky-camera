package com.publabs.skycam;

public class MyPublicVariables {
	
//<<<<<<< HEAD
//	//pushed... new workspace plus outer folder removed..
//	
//=======
//>>>>>>> 055abaaa8e8e00e795e852a2352646f67df9b86c
	public static String header_photo_acquisition_mission = "Starting and Ending a Photo Acqusition Mission";
	public static String photo_acquisition_mission = "1. Buy a kite or a balloon or a drone - provides low cost, easy to use and safe methods for capturing aerial images \n\n" +
													 "2. Attach an Android phone, having the SkyCam Application, to the kite/balloon/drone as opposed to needing airplanes and/or satellites.\n\n" +
													 "3. Build a simple ‘housing’ for your phone using a plastic bottle or an equivalent; to prevent against large dust pebbles or direct sunlight or rain drizzles (ensure the camera’s view is not obstructed by the housing) \n\n" + 
													 "4. Find an area to map; should meet regulations defined at balloon mapping regulations (See link in tab 2 of this page) \n\n" + 
													 "5. Now, launch the Sky Cam application on the phone, lift your balloon, kite or drone and fly! \n\n" + 
													 "6. Sort your images stored in the phone’s SD card under “Sky Cam” folder or as sent to the email ID provided in settings.\n";
	
//	public static String header_processing_aerial_photos = "Links for acquiring and processing aerial photos";
//	public static String processing_aerial_photos = "1. Link 1 \n " +
//													 "2. Link 2 \n " +
//													 "3. Link 3 \n ";
	
	public static String header_processing_aerial_photos = "";
	public static String processing_aerial_photos = "";
	
	public static String header_app_settings_detailed = "Sky Cam Application Settings in Detail";
	public static String app_settings_detailed = "1. Time period - this is the time interval the camera will take to capture successive photographs \n\n " +
											 "2. Email ID - the email address where the photos taken (and metadata i.e. latitude and longitude) will be emailed to \n\n " +
											 "3. Exposure Value - ensures that the subject of the photo is at the center of the light scale (optional) \n\n " +
											 "4. Threshold Value - this makes it possible to highlight objects in an image through the separation of light and dark regions \n";
	
	
	public static String [] headers_guide_page_data = new String[]{header_photo_acquisition_mission,header_processing_aerial_photos,header_app_settings_detailed};
	public static String [] details_guide_page_data = new String[]{photo_acquisition_mission,processing_aerial_photos,app_settings_detailed};

}
