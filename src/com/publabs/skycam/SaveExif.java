package com.publabs.skycam;

import java.io.FileNotFoundException;
import java.io.IOException;
import android.os.AsyncTask;
import android.os.Environment;
import android.media.ExifInterface;
import java.util.Date;

<<<<<<< HEAD
//<<<<<<< HEAD
//public class SaveExif extends AsyncTask<PicData, Void, String> {  
//	//pushed... new workspace plus outer folder removed..
//=======
public class SaveExif extends AsyncTask<PicData, Void, String> {    
//>>>>>>> 055abaaa8e8e00e795e852a2352646f67df9b86c
=======



public class SaveExif extends AsyncTask<PicData, Void, String> {
    
>>>>>>> b6938a79a632e370ebfe64c9484f88882a2c5b56
    	
	protected String doInBackground(PicData... params)
	{
		if(params != null && params.length > 0)
		{
			PicData picData = params[0];
			String sdPath = Environment.getExternalStorageDirectory().getPath() + "/SkyCamFolder/";
			String fileName = picData.getName();
			String savefile = sdPath + fileName;
			
			try
			{
			    ExifInterface exif = new ExifInterface(savefile);
		    	double lat = picData.getlat()/1000000.0;
		    	
		    	if (lat < 0) {
		            exif.setAttribute(ExifInterface.TAG_GPS_LATITUDE_REF, "S");
		            lat = -lat;
		        } else {
		            exif.setAttribute(ExifInterface.TAG_GPS_LATITUDE_REF, "N");
		        }
<<<<<<< HEAD
		    	
		    	exif.setAttribute(ExifInterface.TAG_GPS_LATITUDE, picData.getlats());
=======
		    	exif.setAttribute(ExifInterface.TAG_GPS_LATITUDE,
		        		picData.getlats());
>>>>>>> b6938a79a632e370ebfe64c9484f88882a2c5b56

		        double lon = picData.getlon()/1000000.0;
		        if (lon < 0) {
		            exif.setAttribute(ExifInterface.TAG_GPS_LONGITUDE_REF, "W");
		            lon = -lon;
		        } else {
		            exif.setAttribute(ExifInterface.TAG_GPS_LONGITUDE_REF, "E");
		        }
<<<<<<< HEAD
		        
		        exif.setAttribute(ExifInterface.TAG_GPS_LONGITUDE, picData.getlons());
=======
		        exif.setAttribute(ExifInterface.TAG_GPS_LONGITUDE,
		        		picData.getlons());
>>>>>>> b6938a79a632e370ebfe64c9484f88882a2c5b56
			    
		        exif.saveAttributes();
		        exif.setAttribute(ExifInterface.TAG_DATETIME, (new Date(System.currentTimeMillis())).toString());    
			
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
					
		}
		return null;
	}
	
	
}
