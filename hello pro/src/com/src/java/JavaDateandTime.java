package com.src.java;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class JavaDateandTime {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, 11-1);
        cal.set(Calendar.DAY_OF_MONTH, 8);
        cal.set(Calendar.YEAR, 2021);
System.out.println(cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase()
); 
    } 

	}


