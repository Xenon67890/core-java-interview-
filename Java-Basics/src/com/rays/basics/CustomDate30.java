package com.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CustomDate30 {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Calendar c = Calendar.getInstance();
		
		Date d = sdf.parse("07-08-2026");
		
		c.setTime(d);
		
		for(int i = 1; i <= 12; i++) {
			
			c.add(Calendar.DATE, 30);
			
			System.out.println(sdf.format(c.getTime()));
		}
	}

}
