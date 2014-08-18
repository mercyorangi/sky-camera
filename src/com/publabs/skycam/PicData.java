package com.publabs.skycam;

public class PicData
<<<<<<< HEAD
//<<<<<<< HEAD
////pushed... new workspace plus outer folder removed..
//=======
//>>>>>>> 055abaaa8e8e00e795e852a2352646f67df9b86c
=======
>>>>>>> b6938a79a632e370ebfe64c9484f88882a2c5b56
{
	private byte[] data;
	private String name;
	private double lat;
	private double lon;
	private String emailid;
		
	public PicData(byte[] data, String name, double lat, double lon, String emailid)
	{
		this.data = data;
		this.name = name;
		this.lat  = lat;
		this.lon  = lon;
	    this.emailid = emailid;
	}
	
	public byte[] getData()
	{
		return data;
	}
	
	public String getemail()
	{
		return emailid;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getlat()
	{
		return lat;
	}
	
	public double getlon()
	{
		return lon;
	}
	
	public String getlats()
	{   
	    StringBuilder b = new StringBuilder();
<<<<<<< HEAD
	    b.append((double) lat);
//	    b.append("/1,");
//	    lat = (lat - (int) lat) * 60;
//	    b.append((int) lat);
//	    b.append("/1,");
//	    lat = (lat - (int) lat) * 60000;
//	    b.append((int) lat);
//	    b.append("/1000");
=======
	    b.append((int) lat);
	    b.append("/1,");
	    lat = (lat - (int) lat) * 60;
	    b.append((int) lat);
	    b.append("/1,");
	    lat = (lat - (int) lat) * 60000;
	    b.append((int) lat);
	    b.append("/1000");
>>>>>>> b6938a79a632e370ebfe64c9484f88882a2c5b56
	    return b.toString();
	}
	
	public String getlons()
	{
		StringBuilder b = new StringBuilder();
<<<<<<< HEAD
	    b.append((double) lon);
//	    b.append("/1,");
//	    lon = (lon - (int) lon) * 60;
//	    b.append((int) lon);
//	    b.append("/1,");
//	    lon = (lon - (int) lon) * 60000;
//	    b.append((int) lon);
//	    b.append("/1000");
=======
	    b.append((int) lon);
	    b.append("/1,");
	    lon = (lon - (int) lon) * 60;
	    b.append((int) lon);
	    b.append("/1,");
	    lon = (lon - (int) lon) * 60000;
	    b.append((int) lon);
	    b.append("/1000");
>>>>>>> b6938a79a632e370ebfe64c9484f88882a2c5b56
	    return b.toString();
	}
	
}