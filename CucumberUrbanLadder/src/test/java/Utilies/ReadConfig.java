package Utilies;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig() 
	{
		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch(Exception e) {
			System.out.println("Exception is"+e.getMessage());
		}
	}
	public String getApplicationURL() {
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String getUsername() {
		String username=pro.getProperty("username");
		return username;
	}
	public String getExcelPath() {
		String Path=pro.getProperty("Path");
		return Path;
	}
	public String getSheetName() {
		String SheetName=pro.getProperty("SheetName");
		return SheetName;
	}
	public String getrName() {
		String rName=pro.getProperty("recipientName");
		return rName;
		}
	public String getrEmail() {
		String rEmail=pro.getProperty("recipientEmail");
		return rEmail;
		}
	public String getuserN() {
		String uName=pro.getProperty("userNm");
		return uName;
		}
	
	public String getuseremail() {
		String upwsd=pro.getProperty("userEm");
		return upwsd;
		}
	
	public String getPassword() {
		String password=pro.getProperty("password");
		return password;
	}
	public String getChromePath() {
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public String getFireFox() {
		String firefox=pro.getProperty("firefox");
		return firefox;
	}
}

